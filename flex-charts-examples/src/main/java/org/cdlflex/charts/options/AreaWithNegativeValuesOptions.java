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

import org.cdlflex.charts.options.base.ShowcaseOptions;
import org.cdlflex.charts.wrapper.highcharts.options.Axis;
import org.cdlflex.charts.wrapper.highcharts.options.ChartOptions;
import org.cdlflex.charts.wrapper.highcharts.options.CreditOptions;
import org.cdlflex.charts.wrapper.highcharts.options.Function;
import org.cdlflex.charts.wrapper.highcharts.options.SeriesType;
import org.cdlflex.charts.wrapper.highcharts.options.Title;
import org.cdlflex.charts.wrapper.highcharts.options.Tooltip;
import org.cdlflex.charts.wrapper.highcharts.options.series.Series;
import org.cdlflex.charts.wrapper.highcharts.options.series.SimpleSeries;

/**
 * Demo of the same area chart with negative values displayed in the Highcharts Demo at <a href=
 * "http://highcharts.com/demo/area-negative">http://highcharts. com/demo/area-negative</a>.
 * 
 * @author Matthias Balke (matthias.balke@gmail.com)
 * 
 */
public class AreaWithNegativeValuesOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public AreaWithNegativeValuesOptions() {

        ChartOptions chartOptions = new ChartOptions();
        chartOptions.setType(SeriesType.AREA);
        this.setChartOptions(chartOptions);

        this.setTitle(new Title("Area chart with negative values"));

        Axis xAxis = new Axis();
        xAxis.setCategories(Arrays.asList(new String[] { "Apples", "Oranges", "Pears", "Grapes", "Bananas" }));
        this.setxAxis(xAxis);

        Tooltip tooltip = new Tooltip();
        tooltip.setFormatter(new Function("return ''+this.series.name +': '+ this.y +'';"));
        this.setTooltip(tooltip);

        CreditOptions credits = new CreditOptions();
        credits.setEnabled(true);
        this.setCredits(credits);

        Series<Number> series1 = new SimpleSeries();
        series1.setName("John");
        series1.setData(Arrays.asList(new Number[] { 5, 3, 4, 7, 2 }));
        addSeries(series1);

        Series<Number> series2 = new SimpleSeries();
        series2.setName("Jane");
        series2.setData(Arrays.asList(new Number[] { 2, -2, -3, 2, 1 }));
        addSeries(series2);

        Series<Number> series3 = new SimpleSeries();
        series3.setName("Joe");
        series3.setData(Arrays.asList(new Number[] { 3, 4, 4, -2, 5 }));
        addSeries(series3);

    }

    @Override
    public String getLabel() {
        return "Area with negative values";
    }

}
