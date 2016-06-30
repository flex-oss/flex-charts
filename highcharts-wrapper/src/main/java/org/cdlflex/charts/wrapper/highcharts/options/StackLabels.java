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
 * Configuration for the stackLabels option.
 * 
 * @see <a href="http://api.highcharts.com/highcharts#yAxis.stackLabels">http://api.highcharts.com/highcharts#yAxis.
 *      stackLabels</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class StackLabels implements Serializable {

    private static final long serialVersionUID = 1L;

    private HorizontalAlignment align;

    private Boolean enabled;

    private Function formatter;

    private Number rotation;

    private CssStyle style;

    private HorizontalAlignment textAlign;

    private VerticalAlignment verticalAlign;

    private Number x;

    private Number y;

    public HorizontalAlignment getAlign() {
        return this.align;
    }

    public StackLabels setAlign(final HorizontalAlignment align) {
        this.align = align;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public StackLabels setEnabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Function getFormatter() {
        return this.formatter;
    }

    public StackLabels setFormatter(final Function formatter) {
        this.formatter = formatter;
        return this;
    }

    public Number getRotation() {
        return this.rotation;
    }

    public StackLabels setRotation(final Number rotation) {
        this.rotation = rotation;
        return this;
    }

    public CssStyle getStyle() {
        return this.style;
    }

    public StackLabels setStyle(final CssStyle style) {
        this.style = style;
        return this;
    }

    public HorizontalAlignment getTextAlign() {
        return this.textAlign;
    }

    public StackLabels setTextAlign(final HorizontalAlignment textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public VerticalAlignment getVerticalAlign() {
        return this.verticalAlign;
    }

    public StackLabels setVerticalAlign(final VerticalAlignment verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public Number getX() {
        return this.x;
    }

    public StackLabels setX(final Number x) {
        this.x = x;
        return this;
    }

    public Number getY() {
        return this.y;
    }

    public StackLabels setY(final Number y) {
        this.y = y;
        return this;
    }

}
