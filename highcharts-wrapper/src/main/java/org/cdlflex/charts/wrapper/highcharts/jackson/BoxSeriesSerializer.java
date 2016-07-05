/**
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.cdlflex.charts.wrapper.highcharts.jackson;

import java.io.IOException;

import org.cdlflex.charts.wrapper.highcharts.options.series.Box;
import org.cdlflex.charts.wrapper.highcharts.options.series.BoxSeries;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class BoxSeriesSerializer extends JsonSerializer<BoxSeries> {

    @Override
    public void serialize(final BoxSeries value, final JsonGenerator jgen, final SerializerProvider provider)
        throws IOException, JsonProcessingException {

        StringBuffer result = new StringBuffer();
        result.append("{");
        if (value.getData() != null) {
            result.append("data: [");
            for (Box point : value.getData()) {
                final Number timestamp = point.getTimestamp();
                result.append("[" + (timestamp != null ? timestamp + ", " : "") +
                    point.getLow() + ", " +
                    point.getOpen() + ", " +
                    point.getMedian() + ", " +
                    point.getClose() + ", " +
                    point.getHigh() +
                    "],");
            }
            result = new StringBuffer(result.substring(0, result.length() - 1));
            result.append("]");
        }
        result.append("}");
        jgen.writeRawValue(result.toString());
    }

}
