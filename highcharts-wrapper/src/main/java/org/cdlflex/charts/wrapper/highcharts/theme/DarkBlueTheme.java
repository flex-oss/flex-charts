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
package org.cdlflex.charts.wrapper.highcharts.theme;

import org.cdlflex.charts.wrapper.highcharts.options.color.HexColor;
import org.cdlflex.charts.wrapper.highcharts.options.color.RgbaColor;
import org.cdlflex.charts.wrapper.highcharts.options.Axis;
import org.cdlflex.charts.wrapper.highcharts.options.ButtonOptions;
import org.cdlflex.charts.wrapper.highcharts.options.ChartOptions;
import org.cdlflex.charts.wrapper.highcharts.options.CreditOptions;
import org.cdlflex.charts.wrapper.highcharts.options.CssStyle;
import org.cdlflex.charts.wrapper.highcharts.options.DataLabels;
import org.cdlflex.charts.wrapper.highcharts.options.DummyOption;
import org.cdlflex.charts.wrapper.highcharts.options.ExportingButtons;
import org.cdlflex.charts.wrapper.highcharts.options.ExportingOptions;
import org.cdlflex.charts.wrapper.highcharts.options.Labels;
import org.cdlflex.charts.wrapper.highcharts.options.Legend;
import org.cdlflex.charts.wrapper.highcharts.options.Marker;
import org.cdlflex.charts.wrapper.highcharts.options.Navigation;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptions;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptionsChoice;
import org.cdlflex.charts.wrapper.highcharts.options.Title;
import org.cdlflex.charts.wrapper.highcharts.options.Tooltip;
import org.cdlflex.charts.wrapper.highcharts.options.color.LinearGradient;

// CHECKSTYLE:OFF
public class DarkBlueTheme extends Theme {

  private static final long serialVersionUID = 1L;

  // @formatter:off
  public DarkBlueTheme() {

    this.setColors(HexColor.fromStrings("#DDDF0D", "#55BF3B", "#DF5353", "#7798BF", "#aaeeee", "#ff0066", "#eeaaee",
        "#55BF3B", "#DF5353", "#7798BF", "#aaeeee"));

    this.setChartOptions(new ChartOptions()
        .setBackgroundColor(
            new LinearGradient(0, 0, 250, 500).addStop(0, new RgbaColor(48, 48, 96)).addStop(1, new RgbaColor(0, 0, 0)))
        .setBorderColor(new HexColor("#000000")).setBorderWidth(2).setClassName("dark-container")
        .setPlotBackgroundColor(new RgbaColor(255, 255, 255, .1f)).setBorderColor(new HexColor("#CCCCCC"))
        .setPlotBorderWidth(1));

    this.setTitle(new Title().setStyle(new CssStyle().setProperty("color", "#C0C0C0").setProperty("font",
        "bold 16px 'Trebuchet MS', Verdana, sans-serif")));

    this.setSubtitle(new Title().setStyle(new CssStyle().setProperty("color", "#c0c0c0").setProperty("font",
        "bold 12px 'Trebuchet MS', Verdana, sans-serif")));

    this.setxAxis(new Axis()
        .setGridLineColor(new HexColor("#333333"))
        .setGridLineWidth(1)
        .setLabels(new Labels().setStyle(new CssStyle().setProperty("color", "#a0a0a0")))
        .setLineColor(new HexColor("#a0a0a0"))
        .setTickColor(new HexColor("#a0a0a0"))
        .setTitle(
            new Title().setStyle(new CssStyle().setProperty("color", "#cccccc").setProperty("fontWeight", "bold")
                .setProperty("fontSize", "12px").setProperty("fontFamily", "Trebuchet MS, Verdana, sans-serif"))));

    this.setyAxis(new Axis()
        .setGridLineColor(new HexColor("#333333"))
        .setLabels(new Labels().setStyle(new CssStyle().setProperty("color", "#a0a0a0")))
        .setLineColor(new HexColor("#a0a0a0"))
        .setMinorTickInterval(null)
        .setTickColor(new HexColor("#a0a0a0"))
        .setTickWidth(1)
        .setTitle(
            new Title().setStyle(new CssStyle().setProperty("color", "#cccccc").setProperty("fontWeight", "bold")
                .setProperty("fontSize", "12px").setProperty("fontFamily", "Trebuchet MS, Verdana, sans-serif"))));

    this.setTooltip(new Tooltip().setBackgroundColor(new RgbaColor(0, 0, 0, 0.75f)).setStyle(
        new CssStyle().setProperty("color", "#f0f0f0")));

    this.setToolbar(new DummyOption());

    this.setPlotOptions(new PlotOptionsChoice()
        .setLine(
            new PlotOptions().setDataLabels(new DataLabels().setColor(new HexColor("#cccccc"))).setMarker(
                new Marker().setLineColor(new HexColor("#333333"))))
        .setSpline(new PlotOptions().setMarker(new Marker().setLineColor(new HexColor("#333333"))))
        .setScatter(new PlotOptions().setMarker(new Marker().setLineColor(new HexColor("#333333"))))
        .setCandleStick(new PlotOptions().setLineColor(new HexColor("#ffffff"))));

    this.setLegend(new Legend()
        .setItemStyle(
            new CssStyle().setProperty("font", "9pt Trebuchet MS, Verdana, sans-serif").setProperty("color", "#a0a0a0"))
        .setItemHoverStyle(new CssStyle().setProperty("color", "#ffffff"))
        .setItemHiddenStyle(new CssStyle().setProperty("color", "#444444")));

    this.setCreditOptions(new CreditOptions().setStyle(new CssStyle().setProperty("color", "#666666")));

    this.setLabels(new Labels().setStyle(new CssStyle().setProperty("color", "#cccccc")));

    this.setNavigation(new Navigation().setButtonOptions(new ButtonOptions()
        .setBackgroundColor(
            new LinearGradient(0, 0, 0, 20).addStop(0.4f, new HexColor("#606060")).addStop(0.6f,
                new HexColor("#333333"))).setBorderColor(new HexColor("#000000"))
        .setSymbolStroke(new HexColor("#c0c0c0")).setHoverSymbolStroke(new HexColor("#ffffff"))));

    this.setExporting(new ExportingOptions().setButtons(new ExportingButtons().setExportButton(
        new ButtonOptions().setSymbolFill(new HexColor("#55be3b"))).setPrintButton(
        new ButtonOptions().setSymbolFill(new HexColor("#7797be")))));

    this.setRangeSelector(new DummyOption());

    this.setNavigator(new DummyOption());

    this.setScrollbar(new DummyOption());

    this.setLegendBackgroundColor(new RgbaColor(0, 0, 0, 0.5f));
    this.setLegendBackgroundColorSolid(new RgbaColor(35, 35, 70));
    this.setDataLabelsColor(new HexColor("#444444"));
    this.setTextColor(new HexColor("#c0c0c0"));
    this.setMaskColor(new RgbaColor(255, 255, 255, 0.3f));

  }
  // @formatter:on

}
