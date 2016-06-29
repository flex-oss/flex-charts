package org.cdlflex.charts.modalwindow;

import org.apache.wicket.markup.html.panel.Panel;
import org.cdlflex.charts.highcharts.Chart;
import org.cdlflex.charts.options.BasicBarOptions;

/**
 * ChartPanel.
 */
public class ChartPanel extends Panel {

    private static final long serialVersionUID = 1L;

    public ChartPanel(String id) {
        super(id);
        this.add(new Chart("chart", new BasicBarOptions()));
    }
}
