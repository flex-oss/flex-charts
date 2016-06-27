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
package org.cdlflex.charts.options;

import java.util.Arrays;

import org.cdlflex.charts.wrapper.highcharts.options.*;
import org.cdlflex.charts.options.base.ShowcaseOptions;
import org.cdlflex.charts.wrapper.highcharts.options.color.HexColor;
import org.cdlflex.charts.wrapper.highcharts.options.series.SimpleSeries;

public class AreaInvertedAxisOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public AreaInvertedAxisOptions() {

        setChartOptions(new ChartOptions()
            .setType(SeriesType.AREA)
            .setInverted(Boolean.TRUE));

        setTitle(new Title("Average fruit consumption during one week"));

        setSubtitle(new Title()
            .setStyle(new CssStyle()
                .setProperty("position", "absolute")
                .setProperty("right", "0px")
                .setProperty("bottom", "10px")));

        setLegend(new Legend()
            .setLayout(LegendLayout.VERTICAL)
            .setAlign(HorizontalAlignment.RIGHT)
            .setX(-50)
            .setY(100)
            .setFloating(Boolean.TRUE)
            .setBorderWidth(1)
            .setBackgroundColor(new HexColor("#ffffff")));

        setxAxis(new Axis()
            .setCategories(Arrays
                .asList(new String[] { "Monday", "Tuesday", "Wednesday",
                    "Thursday", "Friday", "Saturday", "Sunday" })));

        setyAxis(new Axis()
            .setTitle(new Title("Number of units"))
            .setLabels(new Labels().setFormatter(new Function()
                .setFunction("return this.value")))
            .setMin(0));

        setTooltip(new Tooltip()
            .setFormatter(new Function()
                .setFunction("return ''+this.x +': '+ this.y;")));

        setPlotOptions(new PlotOptionsChoice()
            .setArea(new PlotOptions()
                .setFillOpacity(0.5f)));

        addSeries(new SimpleSeries()
            .setName("John")
            .setData(Arrays.asList(new Number[] { 3, 4, 3, 5, 4, 10, 12 })));

        addSeries(new SimpleSeries()
            .setName("Jane")
            .setData(Arrays.asList(new Number[] { 1, 3, 4, 3, 3, 5, 4 })));

    }

    @Override
    public String getLabel() {
        return "Area with inverted axis";
    }

}
