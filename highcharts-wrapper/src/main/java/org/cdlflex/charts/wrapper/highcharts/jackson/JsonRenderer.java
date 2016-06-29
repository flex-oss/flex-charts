/**
 *   Copyright 2012-2013 Wicked Charts (http://wicked-charts.googlecode.com)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.cdlflex.charts.wrapper.highcharts.jackson;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.cdlflex.charts.wrapper.highcharts.options.Center;
import org.cdlflex.charts.wrapper.highcharts.options.DateTimeLabelFormat;
import org.cdlflex.charts.wrapper.highcharts.options.Function;
import org.cdlflex.charts.wrapper.highcharts.options.MinorTickInterval;
import org.cdlflex.charts.wrapper.highcharts.options.PixelOrPercent;
import org.cdlflex.charts.wrapper.highcharts.options.Symbol;
import org.cdlflex.charts.wrapper.highcharts.options.color.HexColor;
import org.cdlflex.charts.wrapper.highcharts.options.color.HighchartsColor;
import org.cdlflex.charts.wrapper.highcharts.options.color.NullColor;
import org.cdlflex.charts.wrapper.highcharts.options.color.RgbaColor;
import org.cdlflex.charts.wrapper.highcharts.options.color.SimpleColor;
import org.cdlflex.charts.wrapper.highcharts.options.series.Bubble;
import org.cdlflex.charts.wrapper.highcharts.options.series.Coordinate;
import org.cdlflex.charts.wrapper.highcharts.json.LowercaseEnum;
import org.cdlflex.charts.wrapper.highcharts.options.Crosshair;
import org.cdlflex.charts.wrapper.highcharts.options.CssStyle;
import org.cdlflex.charts.wrapper.highcharts.options.series.RangeCoordinate;
import org.cdlflex.charts.wrapper.highcharts.options.series.ThreeDCoordinate;

/**
 * A renderer for rendering Highcharts options into JSON objects based on the
 * Jackson Mapping library.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class JsonRenderer {

    private final ObjectMapper jacksonMapper;

    private final WickedChartsJacksonModule jacksonModule;

    /**
     * The default mapper can be used to bypass the serializers registered in the
     * {@link WickedChartsJacksonModule}.
     */
    public final static ObjectMapper DEFAULT_MAPPER = createDefaultObjectMapper();

    public JsonRenderer() {
        this.jacksonModule = new WickedChartsJacksonModule();
        this.jacksonMapper = createJacksonMapper();
    }

    /**
     * This method gives the opportunity to add a custom serializer to serializer
     * one of the highchart option classes. It may be neccessary to serialize
     * certain option classes differently for different web frameworks.
     *
     * @param clazz      the option class
     * @param serializer the serializer responsible for serializing objects of the option
     *                   class.
     */
    public <T> void addSerializer(final Class<T> clazz, final JsonSerializer<T> serializer) {
        this.jacksonModule.addSerializer(clazz, serializer);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private ObjectMapper createJacksonMapper() {

        this.jacksonModule.addSerializer(Center.class, new CenterSerializer());
        this.jacksonModule.addSerializer(SimpleColor.class, new SimpleColorReferenceSerializer());
        this.jacksonModule.addSerializer(HighchartsColor.class, new HighchartsColorReferenceSerializer());
        this.jacksonModule.addSerializer(HexColor.class, new HexColorReferenceSerializer());
        this.jacksonModule.addSerializer(LowercaseEnum.class, new LowercaseEnumSerializer());
        this.jacksonModule.addSerializer(PixelOrPercent.class, new PixelOrPercentSerializer());
        this.jacksonModule.addSerializer(Symbol.class, new SymbolSerializer());
        this.jacksonModule.addSerializer(RgbaColor.class, new RgbaColorReferenceSerializer());
        this.jacksonModule.addSerializer(NullColor.class, new NullColorReferenceSerializer());
        this.jacksonModule.addSerializer(MinorTickInterval.class, new MinorTickIntervalSerializer());
        this.jacksonModule.addSerializer(Function.class, new FunctionSerializer());
        this.jacksonModule.addSerializer(CssStyle.class, new CssStyleSerializer());
        this.jacksonModule.addSerializer(DateTimeLabelFormat.class, new DateTimeLabelFormatSerializer());
        this.jacksonModule.addSerializer(Coordinate.class, new CoordinateSerializer());
        this.jacksonModule.addSerializer(Crosshair.class, new CrosshairSerializer());
        this.jacksonModule.addSerializer(RangeCoordinate.class, new RangeCoordinateSerializer());
        this.jacksonModule.addSerializer(Bubble.class, new BubbleSerializer());
        this.jacksonModule.addSerializer(ThreeDCoordinate.class, new ThreeDimensionalCoordinateSerializer());

        ObjectMapper mapper = createDefaultObjectMapper();
        mapper.setLocale(Locale.ENGLISH);
        mapper.registerModule(this.jacksonModule);
        return mapper;
    }

    private static ObjectMapper createDefaultObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.disable(SerializationFeature.WRITE_NULL_MAP_VALUES);
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        mapper.setSerializationInclusion(Include.NON_NULL);
        return mapper;
    }

    public String toJson(final Object object) {
        try {
            String result = this.jacksonMapper.writeValueAsString(object);
            return convertTurkishChars(result);
        } catch (Exception e) {
            throw new RuntimeException("Error trying to serialize object of type " + object.getClass().getName()
                    + " into JSON!", e);
        }
    }

    public <T> T fromJson(final String json, final Class<T> targetClazz) {
        try {
            return this.jacksonMapper.readValue(json, targetClazz);
        } catch (Exception e) {
            throw new RuntimeException("Error trying to deserialize object of type " + targetClazz.getName() + " into JSON!",
                    e);
        }
    }

    /**
     * Converts special turkish characters to their latin-1 counterpart so that the JSON output will still be valid.
     */
    public String convertTurkishChars(String text) {
        String[] olds = {"Ğ", "ğ", "Ü", "ü", "Ş", "ş", "İ", "ı", "Ö", "ö", "Ç", "ç"};
        String[] news = {"G", "g", "U", "u", "S", "s", "I", "i", "O", "o", "C", "c"};

        for (int i = 0; i < olds.length; i++) {
            text = text.replace(olds[i], news[i]);
        }

        return text;
    }
}
