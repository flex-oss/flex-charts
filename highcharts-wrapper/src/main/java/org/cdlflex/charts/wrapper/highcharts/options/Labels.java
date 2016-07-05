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

import java.io.Serializable;

/**
 * Defines some label in a chart.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @see <a href="http://api.highcharts.com/highcharts#Axis.plotLines.label">Axis.plotLines.label</a>
 *
 */
public class Labels implements Serializable {

    private static final long serialVersionUID = 1L;

    private HorizontalAlignment align;

    private Integer rotation;

    private CssStyle style;

    private Function formatter;

    private HorizontalAlignment textAlign;

    private VerticalAlignment verticalAlign;

    private Integer x;

    private Integer y;

    private String text;

    private Overflow overflow;

    private Integer step;

    private Boolean enabled;

    private String format;

    private Integer staggerLines;

    private Integer maxStaggerLines;

    public Labels() {

    }

    public Labels(final String text) {
        this.text = text;
    }

    public HorizontalAlignment getAlign() {
        return this.align;
    }

    public Labels setAlign(final HorizontalAlignment align) {
        this.align = align;
        return this;
    }

    public Function getFormatter() {
        return this.formatter;
    }

    public Labels setFormatter(final Function formatter) {
        this.formatter = formatter;
        return this;
    }

    public Overflow getOverflow() {
        return this.overflow;
    }

    public Labels setOverflow(final Overflow overflow) {
        this.overflow = overflow;
        return this;
    }

    public Integer getRotation() {
        return this.rotation;
    }

    public Labels setRotation(final Integer rotation) {
        this.rotation = rotation;
        return this;
    }

    public CssStyle getStyle() {
        return this.style;
    }

    public Labels setStyle(final CssStyle style) {
        this.style = style;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Labels setText(final String text) {
        this.text = text;
        return this;
    }

    public HorizontalAlignment getTextAlign() {
        return this.textAlign;
    }

    public Labels setTextAlign(final HorizontalAlignment textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public VerticalAlignment getVerticalAlign() {
        return this.verticalAlign;
    }

    public Labels setVerticalAlign(final VerticalAlignment verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public Integer getX() {
        return this.x;
    }

    public Labels setX(final Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return this.y;
    }

    public Labels setY(final Integer y) {
        this.y = y;
        return this;
    }

    public Integer getStep() {
        return step;
    }

    public Labels setStep(Integer step) {
        this.step = step;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Labels setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getStaggerLines() {
        return staggerLines;
    }

    public Labels setStaggerLines(Integer staggerLines) {
        this.staggerLines = staggerLines;
        return this;
    }

    public String getFormat() {
        return format;
    }

    /**
     * Sets the format string for an axis label. Defaults to "{value}".
     *
     * @param format the new format string. Use "{value}" as a placeholder for the axis value.
     * @see <a href="http://api.highcharts.com/highstock#xAxis.labels.format">http://api.highcharts.com/highstock#xAxis.
     *      labels.format</a>
     * @return returns the label for chaining
     */
    public Labels setFormat(String format) {
        this.format = format;
        return this;
    }

    public Integer getMaxStaggerLines() {
        return maxStaggerLines;
    }

    public Labels setMaxStaggerLines(Integer maxStaggerLines) {
        this.maxStaggerLines = maxStaggerLines;
        return this;
    }

}
