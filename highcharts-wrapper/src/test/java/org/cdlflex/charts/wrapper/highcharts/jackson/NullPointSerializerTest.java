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
package org.cdlflex.charts.wrapper.highcharts.jackson;

import org.cdlflex.charts.wrapper.highcharts.options.series.Point;
import org.junit.Test;

public class NullPointSerializerTest extends AbstractSerializerTest {

    /**
     * Tests that the y-value of a point is serialized even when it is null.
     *
     * @see <a href="https://github.com/thombergs/wicked-charts/issues/31">https://github.com/thombergs/wicked-charts/
     *      issues/31</a>
     */
    @Test
    public void test() {

        // given
        Point point = new Point(null);
        JsonRenderer renderer = new JsonRenderer();

        // when
        String json = renderer.toJson(point);

        // then
        assertIgnoreWhitespaces("{\"y\":null}", json);
    }
}
