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

import org.cdlflex.charts.wrapper.highcharts.options.DataLabels;
import org.cdlflex.charts.wrapper.highcharts.options.Events;
import org.cdlflex.charts.wrapper.highcharts.options.Marker;
import org.cdlflex.charts.wrapper.highcharts.options.color.ColorReference;
import org.cdlflex.charts.wrapper.highcharts.options.color.SimpleColor;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * A point in a chart that has a label (or a name) and a color.
 * 
 * @see <a href="http://api.highcharts.com/highcharts#series.data">http://api.highcharts.com/highcharts#series.data</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class Point implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private ColorReference color;

    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    private Number y;

    private Events events;

    private String id;

    private DataLabels dataLabels;

    private Integer legendIndex;

    private Marker marker;

    private Boolean sliced;

    private Boolean selected;

    private Number x;

    private Integer wickedChartsId;

    public Point() {

    }

    /**
     * Simple Constructor if a NamedPoint only has a value and nothing else.
     * 
     * @param y the y value of this point.
     */
    public Point(final Number y) {
        this.y = y;
    }

    public Point(final String name, final Number y) {
        this.name = name;
        this.y = y;
    }

    public Point(final Number x, final Number y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Convencience constructor.
     * 
     * @param name the name
     * @param y the y value
     * @param color the color
     */
    public Point(final String name, final Number y, final Color color) {
        this.name = name;
        this.y = y;
        this.color = new SimpleColor(color);
    }

    public Point(final String name, final Number y, final ColorReference color) {
        this.name = name;
        this.y = y;
        this.color = color;
    }

    public ColorReference getColor() {
        return this.color;
    }

    public Point setColor(final Color color) {
        this.color = new SimpleColor(color);
        return this;
    }

    public Point setColor(final ColorReference color) {
        this.color = color;
        return this;
    }

    public DataLabels getDataLabels() {
        return this.dataLabels;
    }

    public Point setDataLabels(final DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public Events getEvents() {
        return this.events;
    }

    public Point setEvents(final Events events) {
        this.events = events;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Point setId(final String id) {
        this.id = id;
        return this;
    }

    public Integer getLegendIndex() {
        return this.legendIndex;
    }

    public Point setLegendIndex(final Integer legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public Marker getMarker() {
        return this.marker;
    }

    public Point setMarker(final Marker marker) {
        this.marker = marker;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Point setName(final String name) {
        this.name = name;
        return this;
    }

    public Boolean getSliced() {
        return this.sliced;
    }

    public Point setSliced(final Boolean sliced) {
        this.sliced = sliced;
        return this;
    }

    public Number getX() {
        return this.x;
    }

    public Point setX(final Number x) {
        this.x = x;
        return this;
    }

    public Number getY() {
        return this.y;
    }

    public Point setY(final Number y) {
        this.y = y;
        return this;
    }

    public Boolean getSelected() {
        return selected;
    }

    public Point setSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    /**
     * Retrieves the Wicked Charts specific ID for this Point.
     * 
     * @return returns the wicked charts id
     */
    public Integer getWickedChartsId() {
        return wickedChartsId;
    }

    /**
     * Sets the Wicked Charts specific ID for this Point.
     *
     * @param wickedChartsId the id to set
     * @return the point for chaining
     */
    public Point setWickedChartsId(Integer wickedChartsId) {
        this.wickedChartsId = wickedChartsId;
        return this;
    }

}
