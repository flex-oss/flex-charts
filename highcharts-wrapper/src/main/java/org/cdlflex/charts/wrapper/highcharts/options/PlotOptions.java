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

import org.cdlflex.charts.wrapper.highcharts.options.color.ColorReference;
import org.cdlflex.charts.wrapper.highcharts.options.color.SimpleColor;

/**
 * Defines the configuration of the "plotOptions" option.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @see <a href="http://api.highcharts.com/highcharts#plotOptions">http://api.highcharts.com/highcharts#plotOptions</a>
 */
public class PlotOptions implements Serializable {

    private static final long serialVersionUID = 1L;

    private PixelOrPercent neckWidth;

    private PixelOrPercent neckHeight;

    private Boolean allowPointSelect;

    private Boolean animation;

    private ColorReference borderColor;

    private Integer borderRadius;

    private Integer borderWidth;

    private ColorReference color;

    private List<ColorReference> colors;

    private Boolean colorByPoint;

    private Integer cropThreshold;

    private Cursor cursor;

    private DataLabels dataLabels;

    private Boolean enableMouseTracking;

    private Events events;

    private Float groupPadding;

    private String id;

    private Integer minPointLength;

    private PointOptions point;

    private Integer pointInterval;

    private Float pointPadding;

    private Long pointStart;

    private Integer pointWidth;

    private Boolean selected;

    private Boolean shadow;

    private Boolean showCheckbox;

    private Boolean showInLegend;

    private Stacking stacking;

    private PlotOptionsStateChoice states;

    private Boolean stickyTracking;

    private Tooltip tooltip;

    private Integer turboThreshold;

    private Boolean visible;

    private Integer zIndex;

    private Boolean connectNulls;

    private GridLineDashStyle dashStyle;

    private ColorReference fillColor;

    private Float fillOpacity;

    private ColorReference lineColor;

    private Integer lineWidth;

    private Marker marker;

    private Integer threshold;

    private Boolean trackByArea;

    private Boolean step;

    private Center center;

    private PixelOrPercent innerSize;

    private PixelOrPercent size;

    private Integer slicedOffset;

    private PointPlacement pointPlacement;

    private Integer medianWidth;

    private Integer whiskerWidth;

    private Integer whiskerLength;

    private Integer stemWidth;

    public PixelOrPercent getNeckWidth() {
        return neckWidth;
    }

    public PlotOptions setNeckWidth(PixelOrPercent neckWidth) {
        this.neckWidth = neckWidth;
        return this;
    }

    public PixelOrPercent getNeckHeight() {
        return neckHeight;
    }

    public PlotOptions setNeckHeight(PixelOrPercent neckHeight) {
        this.neckHeight = neckHeight;
        return this;
    }

    public Boolean getAllowPointSelect() {
        return this.allowPointSelect;
    }

    public PlotOptions setAllowPointSelect(final Boolean allowPointSelect) {
        this.allowPointSelect = allowPointSelect;
        return this;
    }

    public Boolean getAnimation() {
        return this.animation;
    }

    public PlotOptions setAnimation(final Boolean animation) {
        this.animation = animation;
        return this;
    }

    public ColorReference getBorderColor() {
        return this.borderColor;
    }

    public PlotOptions setBorderColor(final Color color) {
        this.borderColor = new SimpleColor(color);
        return this;
    }

    public PlotOptions setBorderColor(final ColorReference borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return this.borderRadius;
    }

    public PlotOptions setBorderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Integer getBorderWidth() {
        return this.borderWidth;
    }

    public PlotOptions setBorderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Center getCenter() {
        return this.center;
    }

    public PlotOptions setCenter(final Center center) {
        this.center = center;
        return this;
    }

    public ColorReference getColor() {
        return this.color;
    }

    public PlotOptions setColor(final Color color) {
        this.color = new SimpleColor(color);
        return this;
    }

    public PlotOptions setColor(final ColorReference color) {
        this.color = color;
        return this;
    }

    public Boolean getColorByPoint() {
        return this.colorByPoint;
    }

    public PlotOptions setColorByPoint(final Boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public Boolean getConnectNulls() {
        return this.connectNulls;
    }

    public PlotOptions setConnectNulls(final Boolean connectNulls) {
        this.connectNulls = connectNulls;
        return this;
    }

    public Integer getCropThreshold() {
        return this.cropThreshold;
    }

    public PlotOptions setCropThreshold(final Integer cropThreshold) {
        this.cropThreshold = cropThreshold;
        return this;
    }

    public Cursor getCursor() {
        return this.cursor;
    }

    public PlotOptions setCursor(final Cursor cursor) {
        this.cursor = cursor;
        return this;
    }

    public GridLineDashStyle getDashStyle() {
        return this.dashStyle;
    }

    public PlotOptions setDashStyle(final GridLineDashStyle dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DataLabels getDataLabels() {
        return this.dataLabels;
    }

    public PlotOptions setDataLabels(final DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public Boolean getEnableMouseTracking() {
        return this.enableMouseTracking;
    }

    public PlotOptions setEnableMouseTracking(final Boolean enableMouseTracking) {
        this.enableMouseTracking = enableMouseTracking;
        return this;
    }

    public Events getEvents() {
        return this.events;
    }

    public PlotOptions setEvents(final Events events) {
        this.events = events;
        return this;
    }

    public ColorReference getFillColor() {
        return this.fillColor;
    }

    public PlotOptions setFillColor(final Color color) {
        this.fillColor = new SimpleColor(color);
        return this;
    }

    public PlotOptions setFillColor(final ColorReference fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public Float getFillOpacity() {
        return this.fillOpacity;
    }

    public PlotOptions setFillOpacity(final Float fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public Float getGroupPadding() {
        return this.groupPadding;
    }

    public PlotOptions setGroupPadding(final Float groupPadding) {
        this.groupPadding = groupPadding;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public PlotOptions setId(final String id) {
        this.id = id;
        return this;
    }

    public PixelOrPercent getInnerSize() {
        return this.innerSize;
    }

    public PlotOptions setInnerSize(final PixelOrPercent innerSize) {
        this.innerSize = innerSize;
        return this;
    }

    public ColorReference getLineColor() {
        return this.lineColor;
    }

    public PlotOptions setLineColor(final Color color) {
        this.lineColor = new SimpleColor(color);
        return this;
    }

    public PlotOptions setLineColor(final ColorReference lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Integer getLineWidth() {
        return this.lineWidth;
    }

    public PlotOptions setLineWidth(final Integer lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public Marker getMarker() {
        return this.marker;
    }

    public PlotOptions setMarker(final Marker marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMinPointLength() {
        return this.minPointLength;
    }

    public PlotOptions setMinPointLength(final Integer minPointLength) {
        this.minPointLength = minPointLength;
        return this;
    }

    public PointOptions getPoint() {
        return this.point;
    }

    public PlotOptions setPoint(final PointOptions point) {
        this.point = point;
        return this;
    }

    public Integer getPointInterval() {
        return this.pointInterval;
    }

    public PlotOptions setPointInterval(final Integer pointInterval) {
        this.pointInterval = pointInterval;
        return this;
    }

    public Float getPointPadding() {
        return this.pointPadding;
    }

    public PlotOptions setPointPadding(final Float pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

    public PointPlacement getPointPlacement() {
        return this.pointPlacement;
    }

    public PlotOptions setPointPlacement(final PointPlacement pointPlacement) {
        this.pointPlacement = pointPlacement;
        return this;
    }

    public Long getPointStart() {
        return this.pointStart;
    }

    public PlotOptions setPointStart(final Long pointStart) {
        this.pointStart = pointStart;
        return this;
    }

    public Integer getPointWidth() {
        return this.pointWidth;
    }

    public PlotOptions setPointWidth(final Integer pointWidth) {
        this.pointWidth = pointWidth;
        return this;
    }

    public Boolean getSelected() {
        return this.selected;
    }

    public PlotOptions setSelected(final Boolean selected) {
        this.selected = selected;
        return this;
    }

    public Boolean getShadow() {
        return this.shadow;
    }

    public PlotOptions setShadow(final Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    public Boolean getShowCheckbox() {
        return this.showCheckbox;
    }

    public PlotOptions setShowCheckbox(final Boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
        return this;
    }

    public Boolean getShowInLegend() {
        return this.showInLegend;
    }

    public PlotOptions setShowInLegend(final Boolean showInLegend) {
        this.showInLegend = showInLegend;
        return this;
    }

    public PixelOrPercent getSize() {
        return this.size;
    }

    public PlotOptions setSize(final PixelOrPercent size) {
        this.size = size;
        return this;
    }

    public Integer getSlicedOffset() {
        return this.slicedOffset;
    }

    public PlotOptions setSlicedOffset(final Integer slicedOffset) {
        this.slicedOffset = slicedOffset;
        return this;
    }

    public Stacking getStacking() {
        return this.stacking;
    }

    public PlotOptions setStacking(final Stacking stacking) {
        this.stacking = stacking;
        return this;
    }

    public PlotOptionsStateChoice getStates() {
        return this.states;
    }

    public PlotOptions setStates(final PlotOptionsStateChoice states) {
        this.states = states;
        return this;
    }

    public Boolean getStep() {
        return this.step;
    }

    public PlotOptions setStep(final Boolean step) {
        this.step = step;
        return this;
    }

    public Boolean getStickyTracking() {
        return this.stickyTracking;
    }

    public PlotOptions setStickyTracking(final Boolean stickyTracking) {
        this.stickyTracking = stickyTracking;
        return this;
    }

    public Integer getThreshold() {
        return this.threshold;
    }

    public PlotOptions setThreshold(final Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    public Tooltip getTooltip() {
        return this.tooltip;
    }

    public PlotOptions setTooltip(final Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Boolean getTrackByArea() {
        return this.trackByArea;
    }

    public PlotOptions setTrackByArea(final Boolean trackByArea) {
        this.trackByArea = trackByArea;
        return this;
    }

    public Integer getTurboThreshold() {
        return this.turboThreshold;
    }

    public PlotOptions setTurboThreshold(final Integer turboThreshold) {
        this.turboThreshold = turboThreshold;
        return this;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public PlotOptions setVisible(final Boolean visible) {
        this.visible = visible;
        return this;
    }

    public Integer getzIndex() {
        return this.zIndex;
    }

    public PlotOptions setzIndex(final Integer zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public Integer getMedianWidth() {
        return medianWidth;
    }

    public PlotOptions setMedianWidth(Integer medianWidth) {
        this.medianWidth = medianWidth;
        return this;
    }

    public Integer getWhiskerWidth() {
        return whiskerWidth;
    }

    public PlotOptions setWhiskerWidth(Integer whiskerWidth) {
        this.whiskerWidth = whiskerWidth;
        return this;
    }

    public Integer getStemWidth() {
        return stemWidth;
    }

    public PlotOptions setStemWidth(Integer stemWidth) {
        this.stemWidth = stemWidth;
        return this;
    }

    public List<ColorReference> getColors() {
        return colors;
    }

    public PlotOptions setColors(List<ColorReference> colors) {
        this.colors = colors;
        return this;
    }

    public Integer getWhiskerLength() {
        return whiskerLength;
    }

    public PlotOptions setWhiskerLength(Integer whiskerLength) {
        this.whiskerLength = whiskerLength;
        return this;
    }

}
