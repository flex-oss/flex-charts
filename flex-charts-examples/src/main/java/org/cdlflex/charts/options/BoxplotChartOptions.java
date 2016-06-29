package org.cdlflex.charts.options;

import java.util.ArrayList;
import java.util.List;

import org.cdlflex.charts.wrapper.highcharts.options.*;
import org.cdlflex.charts.options.base.ShowcaseOptions;
import org.cdlflex.charts.wrapper.highcharts.options.color.ColorReference;
import org.cdlflex.charts.wrapper.highcharts.options.color.HexColor;
import org.cdlflex.charts.wrapper.highcharts.options.series.Box;
import org.cdlflex.charts.wrapper.highcharts.options.series.BoxSeries;

public class BoxplotChartOptions extends ShowcaseOptions {

    private static final long serialVersionUID = 1L;

    public BoxplotChartOptions() {

        setCredits(new CreditOptions().setEnabled(false))
            .setNavigation(new Navigation().setButtonOptions(new ButtonOptions().setEnabled(false)))
            .setChartOptions(new ChartOptions(SeriesType.BOXPLOT))
            .setTitle(new Title("Highcharts Boxplot"))
            .setTooltip(new Tooltip()
                .setShared(false)
                .setUseHTML(true)
                .setHeaderFormat("<em>Experiment No {point.key}</em><br/>")
            )
            .setLegend(new Legend().setEnabled(false));

        BoxSeries boxplotSeries = new BoxSeries();
        List<ColorReference> colors = new ArrayList<ColorReference>();
        double open = 1;
        for (int i = 0; i < 10; i++) {
            double random = (Math.random() * 10 - 5) * 100;
            random = Math.round(random) / 100.0;
            double low = open - 1;
            double close = open + random;
            double high = close + 1;
            double median = (open + close) / 2;
            Box bar = new Box(low, open, median, close, high);
            boxplotSeries.addPoint(bar);
            open = close;
            colors.add(new HexColor(bar.isIncrease() ? "#00FF00" : "#FF0000"));
        }
        addSeries(boxplotSeries);

        PlotOptions plotOptions = new PlotOptions();
        plotOptions.setColorByPoint(true)
            .setLineWidth(1)
            .setMedianWidth(1)
            .setWhiskerWidth(2)
            .setWhiskerLength(20)
            .setStemWidth(2)
            .setColors(colors);
        setPlotOptions(new PlotOptionsChoice().setBoxplot(plotOptions));

    }

    @Override
    public String getLabel() {
        return "Boxplot chart";
    }

}
