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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.cdlflex.charts.wrapper.highcharts.options.color.ColorReference;
import org.cdlflex.charts.wrapper.highcharts.options.color.SimpleColor;

/**
 * Defines an Axis for a Highcharts chart.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @see <a href="http://api.highcharts.com/highcharts#Axis">http://api.highcharts.com/highcharts#Axis</a>
 */
public class Axis implements Serializable {

    private static final long serialVersionUID = 1L;

    private AxisType type;

    private Title title;

    private List<String> categories;

    private Boolean allowDecimals;

    private ColorReference alternateGridColor;

    private DateTimeLabelFormat dateTimeLabelFormats;

    private Boolean endOnTick;

    private Events events;

    private ColorReference gridLineColor;

    private GridLineDashStyle gridLineDashStyle;

    private Integer gridLineWidth;

    private String id;

    private Labels labels;

    private ColorReference lineColor;

    private Integer lineWidth;

    private Integer linkedTo;

    private Number max;

    private Float maxPadding;

    private Number min;

    private Float minPadding;

    private Integer minRange;

    private ColorReference minorGridLineColor;

    private GridLineDashStyle minorGridLineDashStyle;

    private Integer minorGridLineWidth;

    private ColorReference minorTickColor;

    private MinorTickInterval minorTickInterval;

    private Integer minorTickLength;

    private Integer minorTickWidth;

    private Integer offset;

    private Boolean opposite;

    private List<PlotBand> plotBands;

    private List<PlotLine> plotLines;

    private Boolean reversed;

    private Boolean showEmpty;

    private Boolean showFirstLabel;

    private Boolean showLastLabel;

    private Integer startOfWeek;

    private Boolean startOnTick;

    private ColorReference tickColor;

    private Float tickInterval;

    private Integer tickLength;

    private Integer tickPixelInterval;

    private TickPosition tickPosition;

    private Integer tickWidth;

    private TickmarkPlacement tickmarkPlacement;

    private Integer maxZoom;

    private StackLabels stackLabels;

    private TickPosition minorTickPosition;

    private List<Integer> tickPositions;

    private GridlineInterpolation gridLineInterpolation;

    private Integer wickedChartsId;

    public Axis() {

    }

    public Axis(final AxisType type) {
        this.type = type;
    }

    public Boolean getAllowDecimals() {
        return this.allowDecimals;
    }

    public Axis setAllowDecimals(final Boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
        return this;
    }

    public ColorReference getAlternateGridColor() {
        return this.alternateGridColor;
    }

    public Axis setAlternateGridColor(final Color color) {
        this.alternateGridColor = new SimpleColor(color);
        return this;
    }

    public Axis setAlternateGridColor(final ColorReference alternateGridColor) {
        this.alternateGridColor = alternateGridColor;
        return this;
    }

    public List<String> getCategories() {
        return this.categories;
    }

    public Axis setCategories(final List<String> categories) {
        this.categories = categories;
        return this;
    }

    public Axis setCategories(final String... categories) {
        this.categories = Arrays.asList(categories);
        return this;
    }

    public DateTimeLabelFormat getDateTimeLabelFormats() {
        return this.dateTimeLabelFormats;
    }

    public Axis setDateTimeLabelFormats(final DateTimeLabelFormat dateTimeLabelFormats) {
        this.dateTimeLabelFormats = dateTimeLabelFormats;
        return this;
    }

    public Boolean getEndOnTick() {
        return this.endOnTick;
    }

    public Axis setEndOnTick(final Boolean endOnTick) {
        this.endOnTick = endOnTick;
        return this;
    }

    public Events getEvents() {
        return this.events;
    }

    public Axis setEvents(final Events events) {
        this.events = events;
        return this;
    }

    public ColorReference getGridLineColor() {
        return this.gridLineColor;
    }

    public Axis setGridLineColor(final Color color) {
        this.gridLineColor = new SimpleColor(color);
        return this;
    }

    public Axis setGridLineColor(final ColorReference gridLineColor) {
        this.gridLineColor = gridLineColor;
        return this;
    }

    public GridLineDashStyle getGridLineDashStyle() {
        return this.gridLineDashStyle;
    }

    public Axis setGridLineDashStyle(final GridLineDashStyle gridLineDashStyle) {
        this.gridLineDashStyle = gridLineDashStyle;
        return this;
    }

    public Integer getGridLineWidth() {
        return this.gridLineWidth;
    }

    public Axis setGridLineWidth(final Integer gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Axis setId(final String id) {
        this.id = id;
        return this;
    }

    public Labels getLabels() {
        return this.labels;
    }

    public Axis setLabels(final Labels labels) {
        this.labels = labels;
        return this;
    }

    public ColorReference getLineColor() {
        return this.lineColor;
    }

    public Axis setLineColor(final Color color) {
        this.lineColor = new SimpleColor(color);
        return this;
    }

    public Axis setLineColor(final ColorReference lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Integer getLineWidth() {
        return this.lineWidth;
    }

    public Axis setLineWidth(final Integer lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public Integer getLinkedTo() {
        return this.linkedTo;
    }

    public Axis setLinkedTo(final Integer linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public Number getMax() {
        return this.max;
    }

    public Axis setMax(final Number max) {
        this.max = max;
        return this;
    }

    public Float getMaxPadding() {
        return this.maxPadding;
    }

    public Axis setMaxPadding(final Float maxPadding) {
        this.maxPadding = maxPadding;
        return this;
    }

    public Integer getMaxZoom() {
        return this.maxZoom;
    }

    public Axis setMaxZoom(final Integer maxZoom) {
        this.maxZoom = maxZoom;
        return this;
    }

    public Number getMin() {
        return this.min;
    }

    public Axis setMin(final Number min) {
        this.min = min;
        return this;
    }

    public ColorReference getMinorGridLineColor() {
        return this.minorGridLineColor;
    }

    public Axis setMinorGridLineColor(final Color color) {
        this.minorGridLineColor = new SimpleColor(color);
        return this;
    }

    public Axis setMinorGridLineColor(final ColorReference minorGridLineColor) {
        this.minorGridLineColor = minorGridLineColor;
        return this;
    }

    public GridLineDashStyle getMinorGridLineDashStyle() {
        return this.minorGridLineDashStyle;
    }

    public Axis setMinorGridLineDashStyle(final GridLineDashStyle minorGridLineDashStyle) {
        this.minorGridLineDashStyle = minorGridLineDashStyle;
        return this;
    }

    public Integer getMinorGridLineWidth() {
        return this.minorGridLineWidth;
    }

    public Axis setMinorGridLineWidth(final Integer minorGridLineWidth) {
        this.minorGridLineWidth = minorGridLineWidth;
        return this;
    }

    public ColorReference getMinorTickColor() {
        return this.minorTickColor;
    }

    public Axis setMinorTickColor(final Color color) {
        this.minorTickColor = new SimpleColor(color);
        return this;
    }

    public Axis setMinorTickColor(final ColorReference minorTickColor) {
        this.minorTickColor = minorTickColor;
        return this;
    }

    public MinorTickInterval getMinorTickInterval() {
        return this.minorTickInterval;
    }

    public Axis setMinorTickInterval(final MinorTickInterval minorTickInterval) {
        this.minorTickInterval = minorTickInterval;
        return this;
    }

    public Integer getMinorTickLength() {
        return this.minorTickLength;
    }

    public Axis setMinorTickLength(final Integer minorTickLength) {
        this.minorTickLength = minorTickLength;
        return this;
    }

    public Integer getMinorTickWidth() {
        return this.minorTickWidth;
    }

    public Axis setMinorTickWidth(final Integer minorTickWidth) {
        this.minorTickWidth = minorTickWidth;
        return this;
    }

    public Float getMinPadding() {
        return this.minPadding;
    }

    public Axis setMinPadding(final Float minPadding) {
        this.minPadding = minPadding;
        return this;
    }

    public Integer getMinRange() {
        return this.minRange;
    }

    public Axis setMinRange(final Integer minRange) {
        this.minRange = minRange;
        return this;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public Axis setOffset(final Integer offset) {
        this.offset = offset;
        return this;
    }

    public Boolean getOpposite() {
        return this.opposite;
    }

    public Axis setOpposite(final Boolean opposite) {
        this.opposite = opposite;
        return this;
    }

    public List<PlotBand> getPlotBands() {
        return this.plotBands;
    }

    public Axis setPlotBands(final List<PlotBand> plotBands) {
        this.plotBands = plotBands;
        return this;
    }

    public List<PlotLine> getPlotLines() {
        return this.plotLines;
    }

    public Axis setPlotLines(final List<PlotLine> plotLines) {
        this.plotLines = plotLines;
        return this;
    }

    public Boolean getReversed() {
        return this.reversed;
    }

    public Axis setReversed(final Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public Boolean getShowEmpty() {
        return this.showEmpty;
    }

    public Axis setShowEmpty(final Boolean showEmpty) {
        this.showEmpty = showEmpty;
        return this;
    }

    public Boolean getShowFirstLabel() {
        return this.showFirstLabel;
    }

    public Axis setShowFirstLabel(final Boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public Boolean getShowLastLabel() {
        return this.showLastLabel;
    }

    public Axis setShowLastLabel(final Boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    public StackLabels getStackLabels() {
        return this.stackLabels;
    }

    public Axis setStackLabels(final StackLabels stackLabels) {
        this.stackLabels = stackLabels;
        return this;
    }

    public Integer getStartOfWeek() {
        return this.startOfWeek;
    }

    public Axis setStartOfWeek(final Integer startOfWeek) {
        this.startOfWeek = startOfWeek;
        return this;
    }

    public Boolean getStartOnTick() {
        return this.startOnTick;
    }

    public Axis setStartOnTick(final Boolean startOnTick) {
        this.startOnTick = startOnTick;
        return this;
    }

    public ColorReference getTickColor() {
        return this.tickColor;
    }

    public Axis setTickColor(final Color color) {
        this.tickColor = new SimpleColor(color);
        return this;
    }

    public Axis setTickColor(final ColorReference tickColor) {
        this.tickColor = tickColor;
        return this;
    }

    public Float getTickInterval() {
        return this.tickInterval;
    }

    public Axis setTickInterval(final Float tickInterval) {
        this.tickInterval = tickInterval;
        return this;
    }

    public Integer getTickLength() {
        return this.tickLength;
    }

    public Axis setTickLength(final Integer tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public TickmarkPlacement getTickmarkPlacement() {
        return this.tickmarkPlacement;
    }

    public Axis setTickmarkPlacement(final TickmarkPlacement tickmarkPlacement) {
        this.tickmarkPlacement = tickmarkPlacement;
        return this;
    }

    public Integer getTickPixelInterval() {
        return this.tickPixelInterval;
    }

    public Axis setTickPixelInterval(final Integer tickPixelInterval) {
        this.tickPixelInterval = tickPixelInterval;
        return this;
    }

    public TickPosition getTickPosition() {
        return this.tickPosition;
    }

    public Axis setTickPosition(final TickPosition tickPosition) {
        this.tickPosition = tickPosition;
        return this;
    }

    public Integer getTickWidth() {
        return this.tickWidth;
    }

    public Axis setTickWidth(final Integer tickWidth) {
        this.tickWidth = tickWidth;
        return this;
    }

    public Title getTitle() {
        return this.title;
    }

    public Axis setTitle(final Title title) {
        this.title = title;
        return this;
    }

    public AxisType getType() {
        return this.type;
    }

    public Axis setType(final AxisType type) {
        this.type = type;
        return this;
    }

    public TickPosition getMinorTickPosition() {
        return this.minorTickPosition;
    }

    public Axis setMinorTickPosition(final TickPosition minorTickPosition) {
        this.minorTickPosition = minorTickPosition;
        return this;
    }

    public Axis addPlotBand(final PlotBand plotBand) {
        if (this.plotBands == null) {
            this.plotBands = new ArrayList<PlotBand>();
        }
        this.plotBands.add(plotBand);
        return this;
    }

    public Axis addPlotLine(final PlotLine plotLine) {
        if (this.plotLines == null) {
            this.plotLines = new ArrayList<PlotLine>();
        }
        this.plotLines.add(plotLine);
        return this;
    }

    public GridlineInterpolation getGridLineInterpolation() {
        return this.gridLineInterpolation;
    }

    public Axis setGridLineInterpolation(final GridlineInterpolation gridLineInterpolation) {
        this.gridLineInterpolation = gridLineInterpolation;
        return this;
    }

    public Integer getWickedChartsId() {
        return this.wickedChartsId;
    }

    public void setWickedChartsId(final Integer wickedChartsId) {
        this.wickedChartsId = wickedChartsId;
    }

    public List<Integer> getTickPositions() {
        return tickPositions;
    }

    public void setTickPositions(List<Integer> tickPositions) {
        this.tickPositions = tickPositions;
    }

}
