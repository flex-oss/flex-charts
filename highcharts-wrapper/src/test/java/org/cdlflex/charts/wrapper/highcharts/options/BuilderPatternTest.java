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

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/**
 * This test ensures that all classes in the options package implement the builder pattern. For each class all setter
 * methods are checked. If a setter method returns void it does not implement the builder pattern.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class BuilderPatternTest {

    private final static String[] PACKAGES_TO_TEST = {

        "com.googlecode.wicketcharts.highcharts.options",

        "com.googlecode.wicketcharts.highcharts.options.color",

        "com.googlecode.wicketcharts.highcharts.options.series" };

    /**
     * A class is only tested if it is dubbed relevant by this method.
     */
    private boolean isClassRelevant(final Class<?> clazz) {
        if (clazz.isEnum()) {
            return false;
        }
        return true;
    }

    /**
     * A method is only tested if it is dubbed relevant by this method.
     */
    private boolean isMethodRelevant(final Method method) {
        return method.getName().startsWith("set");
    }

    @Test
    public void testBuilderPattern() throws ClassNotFoundException, IOException {
        Set<Class<? extends Object>> allClasses = ClassFinder
            .getClasses(this.getClass().getClassLoader(), PACKAGES_TO_TEST);

        for (Class<? extends Object> clazz : allClasses) {
            if (isClassRelevant(clazz)) {
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (isMethodRelevant(method)) {
                        testMethod(method);
                    }
                }
            }
        }
    }

    /**
     * Asserts that a method returns the type in which the method is declared.
     */
    private void testMethod(final Method method) {
        System.out.println("Testing method " + method + " for builder pattern...");
        Class<?> returnType = method.getReturnType();
        Class<?> declaringType = method.getDeclaringClass();
        Assert.assertTrue("The method " + method + " does not implement builder pattern! Expected return value: "
            + declaringType + " (or a descendant)!", returnType.isAssignableFrom(declaringType));
    }

}
