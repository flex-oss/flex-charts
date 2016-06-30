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
 * Defines the configuration of the "dataLabels" option.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * @see <a href="http://api.highcharts.com/highcharts#plotOptions.column.dataLabels">plotOptions.column.dataLabels</a>
 */
public class DataLabels implements Serializable {

    private static final long serialVersionUID = 1L;

    private HorizontalAlignment align;

    private ColorReference backgroundColor;

    private ColorReference borderColor;

    private Integer borderRadius;

    private Integer borderWidth;

    private ColorReference color;

    private Boolean enabled;

    private Function formatter;

    private String format;

    private Overflow overflow;

    private Integer padding;

    private Integer rotation;

    private Boolean shadow;

    private CssStyle style;

    private Integer x;

    private Integer y;

    private Integer distance;

    private ColorReference connectorColor;

    private Boolean softConnector;

    /**
     * Empty constructor.
     */
    public DataLabels() {

    }

    /**
     * Convenience constructor.
     * 
     * @param enabled the parameter if enabled
     */
    public DataLabels(final Boolean enabled) {
        this.enabled = enabled;
    }

    public HorizontalAlignment getAlign() {
        return this.align;
    }

    public DataLabels setAlign(final HorizontalAlignment align) {
        this.align = align;
        return this;
    }

    public ColorReference getBackgroundColor() {
        return this.backgroundColor;
    }

    public DataLabels setBackgroundColor(final Color color) {
        this.backgroundColor = new SimpleColor(color);
        return this;
    }

    public DataLabels setBackgroundColor(final ColorReference backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public ColorReference getBorderColor() {
        return this.borderColor;
    }

    public DataLabels setBorderColor(final Color color) {
        this.borderColor = new SimpleColor(color);
        return this;
    }

    public DataLabels setBorderColor(final ColorReference borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return this.borderRadius;
    }

    public DataLabels setBorderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public ColorReference getColor() {
        return this.color;
    }

    public DataLabels setColor(final Color color) {
        this.color = new SimpleColor(color);
        return this;
    }

    public DataLabels setColor(final ColorReference color) {
        this.color = color;
        return this;
    }

    public ColorReference getConnectorColor() {
        return this.connectorColor;
    }

    public DataLabels setConnectorColor(final ColorReference connectorColor) {
        this.connectorColor = connectorColor;
        return this;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public DataLabels setDistance(final Integer distance) {
        this.distance = distance;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public DataLabels setEnabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Function getFormatter() {
        return this.formatter;
    }

    public DataLabels setFormatter(final Function formatter) {
        this.formatter = formatter;
        return this;
    }

    public String getFormat() {
        return this.format;
    }

    public DataLabels setFormat(final String format) {
        this.format = format;
        return this;
    }

    public Overflow getOverflow() {
        return this.overflow;
    }

    public DataLabels setOverflow(final Overflow overflow) {
        this.overflow = overflow;
        return this;
    }

    public Integer getPadding() {
        return this.padding;
    }

    public DataLabels setPadding(final Integer padding) {
        this.padding = padding;
        return this;
    }

    public Integer getRotation() {
        return this.rotation;
    }

    public DataLabels setRotation(final Integer rotation) {
        this.rotation = rotation;
        return this;
    }

    public Boolean getShadow() {
        return this.shadow;
    }

    public DataLabels setShadow(final Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    public CssStyle getStyle() {
        return this.style;
    }

    public DataLabels setStyle(final CssStyle style) {
        this.style = style;
        return this;
    }

    public Integer getBorderWidth() {
        return this.borderWidth;
    }

    public DataLabels setBorderWidth(final Integer vorderWidth) {
        this.borderWidth = vorderWidth;
        return this;
    }

    public Integer getX() {
        return this.x;
    }

    public DataLabels setX(final Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return this.y;
    }

    public DataLabels setY(final Integer y) {
        this.y = y;
        return this;
    }

    public Boolean getSoftConnector() {
        return this.softConnector;
    }

    public DataLabels setSoftConnector(final Boolean value) {
        this.softConnector = value;
        return this;
    }

}
