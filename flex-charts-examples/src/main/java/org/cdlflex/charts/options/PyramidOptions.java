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
import org.cdlflex.charts.wrapper.highcharts.options.DataLabels;
import org.cdlflex.charts.wrapper.highcharts.options.Legend;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptions;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptionsChoice;
import org.cdlflex.charts.wrapper.highcharts.options.SeriesType;
import org.cdlflex.charts.wrapper.highcharts.options.Title;
import org.cdlflex.charts.wrapper.highcharts.options.series.Coordinate;
import org.cdlflex.charts.wrapper.highcharts.options.series.CustomCoordinatesSeries;

public class PyramidOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public PyramidOptions() {
        setChartOptions(new ChartOptions()
            .setType(SeriesType.PYRAMID)
            .setMarginRight(100));

        setTitle(new Title("Sales Pyramid")
            .setX(-50));

        setPlotOptions(new PlotOptionsChoice()
            .setSeries(new PlotOptions()
                .setDataLabels(new DataLabels()
                    .setEnabled(Boolean.TRUE)
                    .setFormat("<b>{point.name}</b> ({point.y:,.0f})")
                    .setSoftConnector(Boolean.TRUE))));

        setLegend(new Legend(Boolean.FALSE));

        addSeries(new CustomCoordinatesSeries<String, Integer>()
            .setName("Unique users")
            .setData(
                     new Coordinate<String, Integer>("Website visits", 15654).setXQuoted(Boolean.TRUE),
                     new Coordinate<String, Integer>("Downloads", 4064).setXQuoted(Boolean.TRUE),
                     new Coordinate<String, Integer>("Requested price list", 1987).setXQuoted(Boolean.TRUE),
                     new Coordinate<String, Integer>("Invoice sent", 976).setXQuoted(Boolean.TRUE),
                     new Coordinate<String, Integer>("Finalized", 846).setXQuoted(Boolean.TRUE)));
    }

    @Override
    public String getLabel() {
        return "Angular Gauge";
    }
}
