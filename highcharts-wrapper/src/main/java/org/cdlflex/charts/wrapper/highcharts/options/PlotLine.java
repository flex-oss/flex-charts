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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Defines a plot line in a chart.
 * 
 * @see <a href="http://api.highcharts.com/highcharts#Axis.plotLines">http://api.highcharts.com/highcharts#Axis.
 *      plotLines</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class PlotLine implements Serializable {

    private static final long serialVersionUID = 1L;

    private ColorReference color;

    private GridLineDashStyle dashStyle;

    @JsonIgnore
    private DummyOption events;

    private String id;

    private Labels label;

    private Float value;

    private Integer width;

    private Integer zIndex;

    public ColorReference getColor() {
        return this.color;
    }

    public PlotLine setColor(final Color color) {
        this.color = new SimpleColor(color);
        return this;
    }

    public PlotLine setColor(final ColorReference color) {
        this.color = color;
        return this;
    }

    public GridLineDashStyle getDashStyle() {
        return this.dashStyle;
    }

    public PlotLine setDashStyle(final GridLineDashStyle dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public DummyOption getEvents() {
        return this.events;
    }

    public PlotLine setEvents(final DummyOption events) {
        this.events = events;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public PlotLine setId(final String id) {
        this.id = id;
        return this;
    }

    public Labels getLabel() {
        return this.label;
    }

    public PlotLine setLabel(final Labels label) {
        this.label = label;
        return this;
    }

    public Float getValue() {
        return this.value;
    }

    public PlotLine setValue(final Float value) {
        this.value = value;
        return this;
    }

    public Integer getWidth() {
        return this.width;
    }

    public PlotLine setWidth(final Integer width) {
        this.width = width;
        return this;
    }

    public Integer getzIndex() {
        return this.zIndex;
    }

    public PlotLine setzIndex(final Integer zIndex) {
        this.zIndex = zIndex;
        return this;
    }

}
