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
import org.cdlflex.charts.wrapper.highcharts.options.*;
import org.cdlflex.charts.wrapper.highcharts.options.series.CoordinatesSeries;

public class AreaSplineRangeOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public AreaSplineRangeOptions() {

        this.setChartOptions(new ChartOptions()
            .setType(SeriesType.AREASPLINERANGE)
            .setInverted(Boolean.TRUE));

        this.setTitle(new Title("Temperature variation by month"));

        this.setSubtitle(new Title("Observed in Vik i Sogn, Norway, 2009"));

        this.setxAxis(new Axis()
            .setCategories(
                           "Jan",
                           "Feb",
                           "Mar",
                           "Apr",
                           "May",
                           "Jun",
                           "Jul",
                           "Aug",
                           "Sep",
                           "Oct",
                           "Nov",
                           "Dec"));

        this.setyAxis(new Axis()
            .setTitle(new Title("Temperature (°C)")));

        this.setTooltip(new Tooltip()
            .setValueSuffix("°C"));

        this.setPlotOptions(new PlotOptionsChoice()
            .setColumnrange(new PlotOptions()
                .setDataLabels(new DataLabels()
                    .setEnabled(Boolean.TRUE)
                    .setFormatter(new Function("return this.y + '°C';"))
                    .setY(0))));

        this.setLegend(new Legend(Boolean.FALSE));

        this.addSeries(new CoordinatesSeries()
            .addPoint(-9.7, 9.4)
            .addPoint(-8.7, 6.5)
            .addPoint(-3.5, 9.4)
            .addPoint(-1.4, 19.9)
            .addPoint(0.0, 22.6)
            .addPoint(2.9, 29.5)
            .addPoint(9.2, 30.7)
            .addPoint(7.3, 26.5)
            .addPoint(4.4, 18.0)
            .addPoint(-3.1, 11.4)
            .addPoint(-5.2, 10.4)
            .addPoint(-13.5, 9.8));

    }

    @Override
    public String getLabel() {
        return "Area Spline Range";
    }

}
