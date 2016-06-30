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

import java.util.Locale;

import org.cdlflex.charts.wrapper.highcharts.options.SeriesType;
import org.junit.Test;

import junit.framework.Assert;

public class JsonRendererLocaleTest {

    /**
     * This test checks that the JsonRenderer can handle a turkish default Locale.
     */
    @Test
    public void testTurkishLocale() {
        Locale.setDefault(new Locale("tr"));

        SeriesType type = SeriesType.SPLINE;
        JsonRenderer renderer = new JsonRenderer();
        String json = renderer.toJson(type);

        // would be "splıne" if the turkish locale was not considered
        Assert.assertEquals("\"spline\"", json);
    }

}
