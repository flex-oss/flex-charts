/*
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
/**
 * @namespace Root namespace of Wicked Charts.
 */
var WickedCharts = WickedCharts || {};

/**
 * @namespace Namespace of the Selection module of Wicked Charts.
 */
WickedCharts.Selection = {};

WickedCharts.Selection.selectionEventToJson = function (selectionEvent) {
    var wickedChartsEvent = {};
    wickedChartsEvent.xAxes = [];
    wickedChartsEvent.yAxes = [];

    // convert all xAxes from highcharts event to WickedCharts event
    if (!(selectionEvent.xAxis === undefined)) {
        selectionEvent.xAxis.map(function (xAxis) {
            console.log(xAxis);
            wickedChartsEvent.xAxes.push({
                wickedChartsId: xAxis.axis.options.wickedChartsId,
                min: xAxis.min,
                max: xAxis.max
            });
        });
    }

    // convert all yAxes from highcharts event to WickedCharts event
    if (!(selectionEvent.yAxis === undefined)) {
        selectionEvent.yAxis.map(function (yAxis) {
            wickedChartsEvent.yAxes.push({
                wickedChartsId: yAxis.axis.options.wickedChartsId,
                min: yAxis.min,
                max: yAxis.max
            });
        });
    }

    return JSON.stringify(wickedChartsEvent);
}
