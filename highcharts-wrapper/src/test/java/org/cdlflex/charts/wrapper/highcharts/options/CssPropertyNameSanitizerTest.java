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

import org.junit.Test;

import junit.framework.Assert;

public class CssPropertyNameSanitizerTest {

    @Test
    public void testNoHyphen() {
        CssStyle style = new CssStyle();
        style.setProperty("font", "blubb");
        Assert.assertEquals("blubb", style.getProperty("font"));
    }

    @Test
    public void testOneHyphen() {
        CssStyle style = new CssStyle();
        style.setProperty("font-weight", "blubb");
        Assert.assertEquals("blubb", style.getProperty("fontWeight"));
    }

    @Test
    public void testTwoHyphens() {
        CssStyle style = new CssStyle();
        style.setProperty("border-top-width", "blubb");
        Assert.assertEquals("blubb", style.getProperty("borderTopWidth"));

    }

}
