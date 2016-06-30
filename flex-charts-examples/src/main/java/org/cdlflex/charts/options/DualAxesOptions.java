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
import org.cdlflex.charts.wrapper.highcharts.options.color.HexColor;
import org.cdlflex.charts.wrapper.highcharts.options.series.SimpleSeries;

public class DualAxesOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public DualAxesOptions() {

        this.setChartOptions(new ChartOptions()
            .setZoomType(ZoomType.XY));

        this.setTitle(new Title("Average Monthly Temperature and Rainfall in Tokyo"));

        this.setSubtitle(new Title("Source: WorldClimate.com"));

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

        this.addyAxis(new Axis()
            .setLabels(new Labels()
                .setFormatter(new Function("return this.value + '°C';"))
                .setStyle(new CssStyle().setProperty("color", "#89A54E")))
            .setTitle(new Title("Temperature").setStyle(new CssStyle()
                .setProperty("color", "#89A54E"))));

        this.addyAxis(new Axis()
            .setLabels(new Labels()
                .setFormatter(new Function("return this.value + ' mm';"))
                .setStyle(new CssStyle().setProperty("color", "#4572A7")))
            .setTitle(new Title("Rainfall").setStyle(new CssStyle()
                .setProperty("color", "#4572A7")))
            .setOpposite(Boolean.TRUE));

        this.setTooltip(new Tooltip()
            .setFormatter(new Function(
                    "return ''+ this.x +': '+ this.y + (this.series.name == 'Rainfall' ? ' mm' : '°C');")));

        this.setLegend(new Legend()
            .setLayout(LegendLayout.VERTICAL)
            .setAlign(HorizontalAlignment.LEFT)
            .setX(120)
            .setVerticalAlign(VerticalAlignment.TOP)
            .setY(100)
            .setFloating(Boolean.TRUE)
            .setBackgroundColor(HexColor.fromString("#FFFFFF")));

        this.addSeries(new SimpleSeries()
            .setName("Rainfall")
            .setColor(HexColor.fromString("#4572A7"))
            .setType(SeriesType.COLUMN)
            .setyAxis(1)
            .setData(
                     49.9,
                     71.5,
                     106.4,
                     129.2,
                     144.0,
                     176.0,
                     135.6,
                     148.5,
                     216.4,
                     194.1,
                     95.6,
                     54.4));

        this.addSeries(new SimpleSeries()
            .setName("Temperature")
            .setColor(HexColor.fromString("#89A54E"))
            .setType(SeriesType.SPLINE)
            .setData(
                     7.0,
                     6.9,
                     9.5,
                     14.5,
                     18.2,
                     21.5,
                     25.2,
                     26.5,
                     23.3,
                     18.3,
                     13.9,
                     9.6));

    }

    @Override
    public String getLabel() {
        return "Dual axes, line and column";
    }

}
