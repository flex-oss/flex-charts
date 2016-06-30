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
package org.cdlflex.charts.wrapper.highcharts.options;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

import org.cdlflex.charts.wrapper.highcharts.options.button.Button;
import org.cdlflex.charts.wrapper.highcharts.options.color.ColorReference;
import org.cdlflex.charts.wrapper.highcharts.options.color.SimpleColor;

/**
 * Defines the configuration of the "chart" option.
 * 
 * @see <a href="http://api.highcharts.com/highcharts#chart">http://api.highcharts.com/highcharts#chart</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class ChartOptions implements Serializable {

    private static final long serialVersionUID = 1L;

    private String renderTo;

    private Boolean animation;

    private ColorReference backgroundColor;

    private Integer height;

    private String className;

    private Boolean alignTicks;

    private ColorReference borderColor;

    private Integer borderRadius;

    private Integer borderWidth;

    private SeriesType type;

    private SeriesType defaultSeriesType;

    private Boolean ignoreHiddenSeries;

    private Boolean inverted;

    private List<Integer> margin;

    private Integer marginTop;

    private Integer marginRight;

    private Integer marginBottom;

    private Integer marginLeft;

    private ColorReference plotBackgroundColor;

    private String plotBackgroundImage;

    private ColorReference plotBorderColor;

    private Integer plotBorderWidth;

    private Boolean plotShadow;

    private Boolean reflow;

    // TODO: must be a shadow object instead of boolean. see
    // http://api.highcharts.com/highcharts#chart.shadow
    private Boolean shadow;

    private Boolean polar;

    private Boolean showAxes;

    private Integer spacingTop;

    private Integer spacingRight;

    private Integer spacingBottom;

    private Integer spacingLeft;

    private Integer width;

    private ZoomType zoomType;

    private CssStyle style;

    private Events events;

    private Button resetZoomButton;

    public ChartOptions() {

    }

    public ChartOptions(final SeriesType chartType) {
        this.type = chartType;
    }

    public Boolean getAlignTicks() {
        return this.alignTicks;
    }

    public ChartOptions setAlignTicks(final Boolean alignTicks) {
        this.alignTicks = alignTicks;
        return this;
    }

    public Boolean getAnimation() {
        return this.animation;
    }

    public ChartOptions setAnimation(final Boolean animation) {
        this.animation = animation;
        return this;
    }

    public ColorReference getBackgroundColor() {
        return this.backgroundColor;
    }

    public ChartOptions setBackgroundColor(final Color color) {
        this.backgroundColor = new SimpleColor(color);
        return this;
    }

    public ChartOptions setBackgroundColor(final ColorReference backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public ColorReference getBorderColor() {
        return this.borderColor;
    }

    public ChartOptions setBorderColor(final Color color) {
        this.borderColor = new SimpleColor(color);
        return this;
    }

    public ChartOptions setBorderColor(final ColorReference borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return this.borderRadius;
    }

    public ChartOptions setBorderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Integer getBorderWidth() {
        return this.borderWidth;
    }

    public ChartOptions setBorderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String getClassName() {
        return this.className;
    }

    public ChartOptions setClassName(final String className) {
        this.className = className;
        return this;
    }

    public SeriesType getDefaultSeriesType() {
        return this.defaultSeriesType;
    }

    public ChartOptions setDefaultSeriesType(final SeriesType defaultSeriesType) {
        this.defaultSeriesType = defaultSeriesType;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    public ChartOptions setHeight(final Integer height) {
        this.height = height;
        return this;
    }

    public Boolean getIgnoreHiddenSeries() {
        return this.ignoreHiddenSeries;
    }

    public ChartOptions setIgnoreHiddenSeries(final Boolean ignoreHiddenSeries) {
        this.ignoreHiddenSeries = ignoreHiddenSeries;
        return this;
    }

    public Boolean getInverted() {
        return this.inverted;
    }

    public ChartOptions setInverted(final Boolean inverted) {
        this.inverted = inverted;
        return this;
    }

    public Integer getMarginTop() {
        return this.marginTop;
    }

    public ChartOptions setMarginTop(final Integer marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public List<Integer> getMargin() {
        return this.margin;
    }

    public ChartOptions setMargin(final List<Integer> margin) {
        this.margin = margin;
        return this;
    }

    public Integer getMarginBottom() {
        return this.marginBottom;
    }

    public ChartOptions setMarginBottom(final Integer marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public Integer getMarginLeft() {
        return this.marginLeft;
    }

    public ChartOptions setMarginLeft(final Integer marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public Integer getMarginRight() {
        return this.marginRight;
    }

    public ChartOptions setMarginRight(final Integer marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public ColorReference getPlotBackgroundColor() {
        return this.plotBackgroundColor;
    }

    public ChartOptions setPlotBackgroundColor(final Color color) {
        this.plotBackgroundColor = new SimpleColor(color);
        return this;
    }

    public ChartOptions setPlotBackgroundColor(final ColorReference plotBackgroundColor) {
        this.plotBackgroundColor = plotBackgroundColor;
        return this;
    }

    public String getPlotBackgroundImage() {
        return this.plotBackgroundImage;
    }

    public ChartOptions setPlotBackgroundImage(final String plotBackgroundImage) {
        this.plotBackgroundImage = plotBackgroundImage;
        return this;
    }

    public ColorReference getPlotBorderColor() {
        return this.plotBorderColor;
    }

    public ChartOptions setPlotBorderColor(final Color color) {
        this.plotBorderColor = new SimpleColor(color);
        return this;
    }

    public ChartOptions setPlotBorderColor(final ColorReference plotBorderColor) {
        this.plotBorderColor = plotBorderColor;
        return this;
    }

    public Integer getPlotBorderWidth() {
        return this.plotBorderWidth;
    }

    public ChartOptions setPlotBorderWidth(final Integer plotBorderWidth) {
        this.plotBorderWidth = plotBorderWidth;
        return this;
    }

    public Boolean getPlotShadow() {
        return this.plotShadow;
    }

    public ChartOptions setPlotShadow(final Boolean plotShadow) {
        this.plotShadow = plotShadow;
        return this;
    }

    public Boolean getPolar() {
        return this.polar;
    }

    public ChartOptions setPolar(final Boolean polar) {
        this.polar = polar;
        return this;
    }

    public Boolean getReflow() {
        return this.reflow;
    }

    public ChartOptions setReflow(final Boolean reflow) {
        this.reflow = reflow;
        return this;
    }

    public String getRenderTo() {
        return this.renderTo;
    }

    public ChartOptions setRenderTo(final String renderTo) {
        this.renderTo = renderTo;
        return this;
    }

    public Boolean getShadow() {
        return this.shadow;
    }

    public ChartOptions setShadow(final Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    public Boolean getShowAxes() {
        return this.showAxes;
    }

    public ChartOptions setShowAxes(final Boolean showAxes) {
        this.showAxes = showAxes;
        return this;
    }

    public Integer getSpacingBottom() {
        return this.spacingBottom;
    }

    public ChartOptions setSpacingBottom(final Integer spacingBottom) {
        this.spacingBottom = spacingBottom;
        return this;
    }

    public Integer getSpacingLeft() {
        return this.spacingLeft;
    }

    public ChartOptions setSpacingLeft(final Integer spacingLeft) {
        this.spacingLeft = spacingLeft;
        return this;
    }

    public Integer getSpacingRight() {
        return this.spacingRight;
    }

    public ChartOptions setSpacingRight(final Integer spacingRight) {
        this.spacingRight = spacingRight;
        return this;
    }

    public Integer getSpacingTop() {
        return this.spacingTop;
    }

    public ChartOptions setSpacingTop(final Integer spacingTop) {
        this.spacingTop = spacingTop;
        return this;
    }

    public CssStyle getStyle() {
        return this.style;
    }

    public ChartOptions setStyle(final CssStyle style) {
        this.style = style;
        return this;
    }

    public SeriesType getType() {
        return this.type;
    }

    public ChartOptions setType(final SeriesType type) {
        this.type = type;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public ChartOptions setWidth(final Integer width) {
        this.width = width;
        return this;
    }

    public ZoomType getZoomType() {
        return this.zoomType;
    }

    public ChartOptions setZoomType(final ZoomType zoomType) {
        this.zoomType = zoomType;
        return this;
    }

    public Events getEvents() {
        return this.events;
    }

    public ChartOptions setEvents(final Events events) {
        this.events = events;
        return this;
    }

    public Button getResetZoomButton() {
        return this.resetZoomButton;
    }

    public ChartOptions setResetZoomButton(final Button resetZoomButton) {
        this.resetZoomButton = resetZoomButton;
        return this;
    }

}
