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
package org.cdlflex.charts.options;

import org.cdlflex.charts.options.base.ShowcaseOptions;
import org.cdlflex.charts.wrapper.highcharts.options.ChartOptions;
import org.cdlflex.charts.wrapper.highcharts.options.Cursor;
import org.cdlflex.charts.wrapper.highcharts.options.DataLabels;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptions;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptionsChoice;
import org.cdlflex.charts.wrapper.highcharts.options.SeriesType;
import org.cdlflex.charts.wrapper.highcharts.options.Title;
import org.cdlflex.charts.wrapper.highcharts.options.Tooltip;
import org.cdlflex.charts.wrapper.highcharts.options.color.HexColor;
import org.cdlflex.charts.wrapper.highcharts.options.color.HighchartsColor;
import org.cdlflex.charts.wrapper.highcharts.options.color.NullColor;
import org.cdlflex.charts.wrapper.highcharts.options.color.RadialGradient;
import org.cdlflex.charts.wrapper.highcharts.options.functions.PercentageFormatter;
import org.cdlflex.charts.wrapper.highcharts.options.series.Point;
import org.cdlflex.charts.wrapper.highcharts.options.series.PointSeries;

public class PieWithGradientOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public PieWithGradientOptions() {

        setChartOptions(new ChartOptions()
            .setPlotBackgroundColor(new NullColor())
            .setPlotBorderWidth(null)
            .setPlotShadow(Boolean.FALSE));

        setTitle(new Title("Browser market shares at a specific website, 2010"));

        setTooltip(new Tooltip()
            .setFormatter(new PercentageFormatter())
            .setPercentageDecimals(1));

        setPlotOptions(new PlotOptionsChoice()
            .setPie(new PlotOptions()
                .setAllowPointSelect(Boolean.TRUE)
                .setCursor(Cursor.POINTER)
                .setDataLabels(new DataLabels()
                    .setEnabled(Boolean.TRUE)
                    .setColor(new HexColor("#000000"))
                    .setConnectorColor(new HexColor("#000000"))
                    .setFormatter(new PercentageFormatter()))));

        addSeries(new PointSeries()
            .setType(SeriesType.PIE)
            .setName("Browser share")
            .addPoint(new Point("Firefox", 45.0).setColor(new RadialGradient()
                .setCx(0.5)
                .setCy(0.3)
                .setR(0.7)
                .addStop(0, new HighchartsColor(0))
                .addStop(1, new HighchartsColor(0)
                    .brighten(-0.3f))))
            .addPoint(new Point("IE", 26.8).setColor(new RadialGradient()
                .setCx(0.5)
                .setCy(0.3)
                .setR(0.7)
                .addStop(0, new HighchartsColor(1))
                .addStop(1, new HighchartsColor(1)
                    .brighten(-0.3f))))
            .addPoint(new Point("Chrome", 12.8)
                .setSliced(Boolean.TRUE)
                .setSelected(Boolean.TRUE)
                .setColor(new RadialGradient()
                    .setCx(0.5)
                    .setCy(0.3)
                    .setR(0.7)
                    .addStop(0, new HighchartsColor(2))
                    .addStop(1, new HighchartsColor(2).brighten(-0.3f))))
            .addPoint(new Point("Safari", 8.5).setColor(new RadialGradient()
                .setCx(0.5)
                .setCy(0.3)
                .setR(0.7)
                .addStop(0, new HighchartsColor(3))
                .addStop(1, new HighchartsColor(3)
                    .brighten(-0.3f))))
            .addPoint(new Point("Opera", 6.2).setColor(new RadialGradient()
                .setCx(0.5)
                .setCy(0.3)
                .setR(0.7)
                .addStop(0, new HighchartsColor(4))
                .addStop(1, new HighchartsColor(4)
                    .brighten(-0.3f))))
            .addPoint(new Point("Others", 0.7).setColor(new RadialGradient()
                .setCx(0.5)
                .setCy(0.3)
                .setR(0.7)
                .addStop(0, new HighchartsColor(5))
                .addStop(1, new HighchartsColor(5)
                    .brighten(-0.3f)))));

    }

    @Override
    public String getLabel() {
        return "Pie with gradient";
    }

}
