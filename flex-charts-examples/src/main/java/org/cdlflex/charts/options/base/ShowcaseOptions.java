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
package org.cdlflex.charts.options.base;

import org.cdlflex.charts.wrapper.highcharts.options.Options;

/**
 * Abstract parent class for all Options in the showcase.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public abstract class ShowcaseOptions extends Options {

    private static final long serialVersionUID = 1L;

    /**
     * The label under which the Options class is shown in navigation.
     * 
     * @return returns the label
     */
    public abstract String getLabel();

}
