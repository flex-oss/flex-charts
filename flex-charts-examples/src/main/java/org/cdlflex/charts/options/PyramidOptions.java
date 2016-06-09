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
