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

import org.cdlflex.charts.options.base.ShowcaseOptions;
import org.cdlflex.charts.wrapper.highcharts.options.Axis;
import org.cdlflex.charts.wrapper.highcharts.options.ChartOptions;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptions;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptionsChoice;
import org.cdlflex.charts.wrapper.highcharts.options.SeriesType;
import org.cdlflex.charts.wrapper.highcharts.options.Stacking;
import org.cdlflex.charts.wrapper.highcharts.options.Title;
import org.cdlflex.charts.wrapper.highcharts.options.Tooltip;
import org.cdlflex.charts.wrapper.highcharts.options.functions.PercentageAndValueFormatter;
import org.cdlflex.charts.wrapper.highcharts.options.series.SimpleSeries;

public class StackedPercentageOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public StackedPercentageOptions() {

        setChartOptions(new ChartOptions()
            .setType(SeriesType.COLUMN));

        setTitle(new Title("Stacked column chart"));

        setxAxis(new Axis()
            .setCategories("Apples", "Oranges", "Pears", "Grapes", "Bananas"));

        setyAxis(new Axis()
            .setMin(0)
            .setTitle(new Title("Total fruit consumption")));

        setTooltip(new Tooltip()
            .setFormatter(new PercentageAndValueFormatter()));

        setPlotOptions(new PlotOptionsChoice()
            .setColumn(new PlotOptions()
                .setStacking(Stacking.PERCENT)));

        addSeries(new SimpleSeries()
            .setName("John")
            .setData(5, 3, 4, 7, 2));

        addSeries(new SimpleSeries()
            .setName("Jane")
            .setData(2, 2, 3, 2, 1));

        addSeries(new SimpleSeries()
            .setName("Joe")
            .setData(3, 4, 4, 2, 5));

    }

    @Override
    public String getLabel() {
        return "Stacked percentage";
    }
}
