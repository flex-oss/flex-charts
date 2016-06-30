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
package org.cdlflex.charts.wrapper.highcharts.options.heatmap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.cdlflex.charts.wrapper.highcharts.options.Labels;
import org.cdlflex.charts.wrapper.highcharts.options.color.ColorReference;

public class ColorAxis implements Serializable {

    private Integer min;

    private Integer max;

    private ColorReference minColor;

    private ColorReference maxColor;

    private Boolean startOnTick;

    private Boolean endOnTick;

    private Labels labels;

    private List<List<Object>> stops;

    public Integer getMin() {
        return min;
    }

    public ColorAxis setMin(Integer min) {
        this.min = min;
        return this;
    }

    public Integer getMax() {
        return max;
    }

    public ColorAxis setMax(Integer max) {
        this.max = max;
        return this;
    }

    public ColorReference getMinColor() {
        return minColor;
    }

    public ColorAxis setMinColor(ColorReference minColor) {
        this.minColor = minColor;
        return this;
    }

    public ColorReference getMaxColor() {
        return maxColor;
    }

    public ColorAxis setMaxColor(ColorReference maxColor) {
        this.maxColor = maxColor;
        return this;
    }

    public Boolean getStartOnTick() {
        return startOnTick;
    }

    public ColorAxis setStartOnTick(Boolean startOnTick) {
        this.startOnTick = startOnTick;
        return this;
    }

    public Boolean getEndOnTick() {
        return endOnTick;
    }

    public ColorAxis setEndOnTick(Boolean endOnTick) {
        this.endOnTick = endOnTick;
        return this;
    }

    public Labels getLabels() {
        return labels;
    }

    public ColorAxis setLabels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public List<List<Object>> getStops() {
        return stops;
    }

    public ColorAxis addStop(final Number percentage, final ColorReference color) {
        List<Object> stopList = new ArrayList<Object>();
        stopList.add(percentage);
        stopList.add(color);
        if (this.stops == null) {
            this.stops = new ArrayList<List<Object>>();
        }
        this.stops.add(stopList);
        return this;
    }

}
