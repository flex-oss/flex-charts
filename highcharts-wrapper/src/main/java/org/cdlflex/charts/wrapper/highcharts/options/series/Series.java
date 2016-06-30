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
package org.cdlflex.charts.wrapper.highcharts.options.series;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.cdlflex.charts.wrapper.highcharts.options.Center;
import org.cdlflex.charts.wrapper.highcharts.options.DataLabels;
import org.cdlflex.charts.wrapper.highcharts.options.GridLineDashStyle;
import org.cdlflex.charts.wrapper.highcharts.options.Marker;
import org.cdlflex.charts.wrapper.highcharts.options.PixelOrPercent;
import org.cdlflex.charts.wrapper.highcharts.options.PlotOptionsStateChoice;
import org.cdlflex.charts.wrapper.highcharts.options.PointPlacement;
import org.cdlflex.charts.wrapper.highcharts.options.SeriesType;
import org.cdlflex.charts.wrapper.highcharts.options.Tooltip;
import org.cdlflex.charts.wrapper.highcharts.options.color.ColorReference;
import org.cdlflex.charts.wrapper.highcharts.options.color.SimpleColor;

/**
 * Defines the configuration of the "series" option.
 * 
 * @see <a href="http://api.highcharts.com/highcharts#series">http://api.highcharts.com/highcharts#series</a>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class Series<D> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Float pointPadding;

    private String name;

    private SeriesType type;

    private List<D> data;

    private Integer legendIndex;

    private String stack;

    private Integer xAxis;

    private Integer yAxis;

    private Marker marker;

    private PixelOrPercent size;

    private Boolean showInLegend;

    private DataLabels dataLabels;

    private ColorReference color;

    private Center center;

    private PixelOrPercent innerSize;

    private Number pointInterval;

    private Number pointStart;

    private PointPlacement pointPlacement;

    private Tooltip tooltip;

    private GridLineDashStyle dashStyle;

    private PlotOptionsStateChoice states;

    private Boolean enableMouseTracking;

    private Integer wickedChartsId;

    /**
     * Retrieves the Wicked Charts specific ID for this Point.
     * 
     * @return returns the id
     */
    public Integer getWickedChartsId() {
        return wickedChartsId;
    }

    /**
     * Sets the Wicked Charts specific ID for this Point.
     * 
     * @param wickedChartsId the id
     */
    public void setWickedChartsId(Integer wickedChartsId) {
        this.wickedChartsId = wickedChartsId;
    }

    /**
     * Adds a point to this series.
     * 
     * @param point the point to add.
     * @return the {@link Series} for chaining
     */
    public Series<D> addPoint(final D point) {
        if (this.data == null) {
            this.data = new ArrayList<D>();
        }
        this.data.add(point);
        return this;
    }

    public Float getPointPadding() {
        return pointPadding;
    }

    public Series<D> setPointPadding(final Float pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public Center getCenter() {
        return this.center;
    }

    public Series<D> setCenter(final Center center) {
        this.center = center;
        return this;
    }

    public ColorReference getColor() {
        return this.color;
    }

    public Series<D> setColor(final Color color) {
        this.color = new SimpleColor(color);
        return this;
    }

    public Series<D> setColor(final ColorReference color) {
        this.color = color;
        return this;
    }

    public List<D> getData() {
        return this.data;
    }

    public Series<D> setData(final D... data) {
        this.data = Arrays.asList(data);
        return this;
    }

    public Series<D> setData(final List<D> data) {
        this.data = data;
        return this;
    }

    public DataLabels getDataLabels() {
        return this.dataLabels;
    }

    public Series<D> setDataLabels(final DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public PixelOrPercent getInnerSize() {
        return this.innerSize;
    }

    public Series<D> setInnerSize(final PixelOrPercent innerSize) {
        this.innerSize = innerSize;
        return this;
    }

    public Integer getLegendIndex() {
        return this.legendIndex;
    }

    public Series<D> setLegendIndex(final Integer legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public Marker getMarker() {
        return this.marker;
    }

    public Series<D> setMarker(final Marker marker) {
        this.marker = marker;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Series<D> setName(final String name) {
        this.name = name;
        return this;
    }

    public Number getPointInterval() {
        return this.pointInterval;
    }

    public Series<D> setPointInterval(final Number pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public PointPlacement getPointPlacement() {
        return this.pointPlacement;
    }

    public Series<D> setPointPlacement(final PointPlacement pointPlacement) {
        this.pointPlacement = pointPlacement;
        return this;
    }

    public Number getPointStart() {
        return this.pointStart;
    }

    public Series<D> setPointStart(final Number pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public Boolean getShowInLegend() {
        return this.showInLegend;
    }

    public Series<D> setShowInLegend(final Boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public PixelOrPercent getSize() {
        return this.size;
    }

    public Series<D> setSize(final PixelOrPercent size) {
        this.size = size;
        return this;
    }

    public String getStack() {
        return this.stack;
    }

    public Series<D> setStack(final String stack) {
        this.stack = stack;
        return this;
    }

    public SeriesType getType() {
        return this.type;
    }

    public Series<D> setType(final SeriesType type) {
        this.type = type;
        return this;
    }

    public Integer getxAxis() {
        return this.xAxis;
    }

    /**
     * Zero-based index of the X-Axis this series should be connected to.
     *
     * @param xAxis the x axis
     *
     * @return the {@link Series} for chaining
     */
    public Series<D> setxAxis(final Integer xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public Integer getyAxis() {
        return this.yAxis;
    }

    /**
     * Zero-based index of the Y-Axis this series should be connected to.
     *
     * @param yAxis the y axis
     *
     * @return the {@link Series} for chaining
     */
    public Series<D> setyAxis(final Integer yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public Series<D> setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public GridLineDashStyle getDashStyle() {
        return dashStyle;
    }

    public Series<D> setDashStyle(GridLineDashStyle dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public PlotOptionsStateChoice getStates() {
        return states;
    }

    public Series<D> setStates(PlotOptionsStateChoice states) {
        this.states = states;
        return this;
    }

    public Boolean getEnableMouseTracking() {
        return enableMouseTracking;
    }

    public Series<D> setEnableMouseTracking(Boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

}
