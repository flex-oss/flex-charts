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

import org.cdlflex.charts.wrapper.highcharts.options.color.ColorReference;
import org.cdlflex.charts.wrapper.highcharts.options.color.SimpleColor;

/**
 * Defines the configuration of the "marker" option.
 * 
 * @see <a href="http://api.highcharts.com/highcharts#plotOptions.area.marker">http://api.highcharts.com/highcharts#
 *      plotOptions.area.marker</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Marker implements Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean enabled;

    private ColorReference fillColor;

    private ColorReference lineColor;

    private Integer lineWidth;

    private Integer radius;

    private PlotOptionsStateChoice states;

    private Symbol symbol;

    private ColorReference color;

    public Marker() {

    }

    public Marker(final Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Marker setEnabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ColorReference getFillColor() {
        return this.fillColor;
    }

    public Marker setFillColor(final Color color) {
        this.fillColor = new SimpleColor(color);
        return this;
    }

    public Marker setFillColor(final ColorReference fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public ColorReference getLineColor() {
        return this.lineColor;
    }

    public Marker setLineColor(final Color color) {
        this.lineColor = new SimpleColor(color);
        return this;
    }

    public Marker setLineColor(final ColorReference lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public Integer getLineWidth() {
        return this.lineWidth;
    }

    public Marker setLineWidth(final Integer lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public Integer getRadius() {
        return this.radius;
    }

    public Marker setRadius(final Integer radius) {
        this.radius = radius;
        return this;
    }

    public PlotOptionsStateChoice getStates() {
        return this.states;
    }

    public Marker setStates(final PlotOptionsStateChoice states) {
        this.states = states;
        return this;
    }

    public Symbol getSymbol() {
        return this.symbol;
    }

    public Marker setSymbol(final Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public ColorReference getColor() {
        return color;
    }

    public Marker setColor(ColorReference color) {
        this.color = color;
        return this;
    }

}
