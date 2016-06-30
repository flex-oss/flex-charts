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
import org.cdlflex.charts.wrapper.highcharts.options.theme.Theme;

/**
 * Defined options for the buttons of a chart.
 * 
 * @see <a href="http://api.highcharts.com/highcharts#navigation.buttonOptions">http://api.highcharts.com/highcharts#
 *      navigation.buttonOptions</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class ButtonOptions implements Serializable {

    private static final long serialVersionUID = 1L;

    private HorizontalAlignment align;

    private ColorReference backgroundColor;

    private ColorReference borderColor;

    private Integer borderRadius;

    private Integer borderWidth;

    private Boolean enabled;

    private Integer height;

    private ColorReference hoverBorderColor;

    private ColorReference hoverSymbolFill;

    private ColorReference hoverSymbolStroke;

    private ColorReference symbolFill;

    private Integer symbolSize;

    private ColorReference symbolStroke;

    private Integer symbolStrokeWidth;

    private Float symbolX;

    private Float symbolY;

    private VerticalAlignment verticalAlign;

    private Integer width;

    private Integer y;

    private Integer x;

    private DummyOption onclick;

    private Symbol symbol;

    private Theme theme;

    public HorizontalAlignment getAlign() {
        return this.align;
    }

    public ButtonOptions setAlign(final HorizontalAlignment align) {
        this.align = align;
        return this;
    }

    public ColorReference getBackgroundColor() {
        return this.backgroundColor;
    }

    public ButtonOptions setBackgroundColor(final Color color) {
        this.backgroundColor = new SimpleColor(color);
        return this;
    }

    public ButtonOptions setBackgroundColor(final ColorReference backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public ColorReference getBorderColor() {
        return this.borderColor;
    }

    public ButtonOptions setBorderColor(final Color color) {
        this.borderColor = new SimpleColor(color);
        return this;
    }

    public ButtonOptions setBorderColor(final ColorReference borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer getBorderRadius() {
        return this.borderRadius;
    }

    public ButtonOptions setBorderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Integer getBorderWidth() {
        return this.borderWidth;
    }

    public ButtonOptions setBorderWidth(final Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ButtonOptions setEnabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getHeight() {
        return this.height;
    }

    public ButtonOptions setHeight(final Integer height) {
        this.height = height;
        return this;
    }

    public ColorReference getHoverBorderColor() {
        return this.hoverBorderColor;
    }

    public ButtonOptions setHoverBorderColor(final Color color) {
        this.hoverBorderColor = new SimpleColor(color);
        return this;
    }

    public ButtonOptions setHoverBorderColor(final ColorReference hoverBorderColor) {
        this.hoverBorderColor = hoverBorderColor;
        return this;
    }

    public ColorReference getHoverSymbolFill() {
        return this.hoverSymbolFill;
    }

    public ButtonOptions setHoverSymbolFill(final Color color) {
        this.hoverSymbolFill = new SimpleColor(color);
        return this;
    }

    public ButtonOptions setHoverSymbolFill(final ColorReference hoverSymbolFill) {
        this.hoverSymbolFill = hoverSymbolFill;
        return this;
    }

    public ColorReference getHoverSymbolStroke() {
        return this.hoverSymbolStroke;
    }

    public ButtonOptions setHoverSymbolStroke(final Color color) {
        this.hoverSymbolStroke = new SimpleColor(color);
        return this;
    }

    public ButtonOptions setHoverSymbolStroke(final ColorReference hoverSymbolStroke) {
        this.hoverSymbolStroke = hoverSymbolStroke;
        return this;
    }

    public DummyOption getOnclick() {
        return this.onclick;
    }

    public ButtonOptions setOnclick(final DummyOption onclick) {
        this.onclick = onclick;
        return this;
    }

    public Symbol getSymbol() {
        return this.symbol;
    }

    public ButtonOptions setSymbol(final Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public ColorReference getSymbolFill() {
        return this.symbolFill;
    }

    public ButtonOptions setSymbolFill(final Color color) {
        this.symbolFill = new SimpleColor(color);
        return this;
    }

    public ButtonOptions setSymbolFill(final ColorReference symbolFill) {
        this.symbolFill = symbolFill;
        return this;
    }

    public Integer getSymbolSize() {
        return this.symbolSize;
    }

    public ButtonOptions setSymbolSize(final Integer symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public ColorReference getSymbolStroke() {
        return this.symbolStroke;
    }

    public ButtonOptions setSymbolStroke(final Color color) {
        this.symbolStroke = new SimpleColor(color);
        return this;
    }

    public ButtonOptions setSymbolStroke(final ColorReference symbolStroke) {
        this.symbolStroke = symbolStroke;
        return this;
    }

    public Integer getSymbolStrokeWidth() {
        return this.symbolStrokeWidth;
    }

    public ButtonOptions setSymbolStrokeWidth(final Integer symbolStrokeWidth) {
        this.symbolStrokeWidth = symbolStrokeWidth;
        return this;
    }

    public Float getSymbolX() {
        return this.symbolX;
    }

    public ButtonOptions setSymbolX(final Float symbolX) {
        this.symbolX = symbolX;
        return this;
    }

    public Float getSymbolY() {
        return this.symbolY;
    }

    public ButtonOptions setSymbolY(final Float symbolY) {
        this.symbolY = symbolY;
        return this;
    }

    public VerticalAlignment getVerticalAlign() {
        return this.verticalAlign;
    }

    public ButtonOptions setVerticalAlign(final VerticalAlignment verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public ButtonOptions setWidth(final Integer width) {
        this.width = width;
        return this;
    }

    public Integer getX() {
        return this.x;
    }

    public ButtonOptions setX(final Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return this.y;
    }

    public ButtonOptions setY(final Integer y) {
        this.y = y;
        return this;
    }

    public Theme getTheme() {
        return this.theme;
    }

    public ButtonOptions setTheme(final Theme theme) {
        this.theme = theme;
        return this;
    }

}
