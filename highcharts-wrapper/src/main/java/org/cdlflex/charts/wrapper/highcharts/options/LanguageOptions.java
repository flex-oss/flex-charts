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

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Defines the configuration of the "lang" option. Use {@link #forLocale(Locale)} to create a preconfigured
 * {@link LanguageOptions} object for a specific locale.
 * 
 * @see <a href="http://api.highcharts.com/highcharts#lang">http://api.highcharts.com/highcharts#lang</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class LanguageOptions implements Serializable {

    private static final long serialVersionUID = 1L;
    private String decimalPoint;
    private String downloadPNG;
    private String downloadJPEG;
    private String downloadPDF;
    private String downloadSVG;
    private String loading;
    private List<String> months;
    private List<String> shortMonths;
    private String resetZoom;
    private String resetZoomTitle;
    private String thousandsSep;
    private List<String> weekdays;
    private String contextButtonTitle;
    private List<String> numericSymbols;
    private String printChart;
    private String rangeSelectorFrom;
    private String rangeSelectorTo;
    private String rangeSelectorZoom;

    /**
     * Returns the {@link LanguageOptions} for the specified locale. If the locale is not supported, an empty
     * {@link LanguageOptions} object is returned. Highcharts will then automatically fall back to english.
     *
     * To look up the locale-specific strings, the resource bundle
     * com/googlecode/wicketcharts/highcharts/options/LanguageOptions .properties is used. To add your own language,
     * simply copy one of the existing resource bundles, modify it and then add it in the classpath in the same package.
     *
     * @param locale the locale for which to create the Language options.
     * @return the language options in the specified locale.
     */
    public static LanguageOptions forLocale(final Locale locale) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle(LanguageOptions.class.getName(), locale);
            LanguageOptions options = new LanguageOptions();
            options.setDecimalPoint(bundle.getString("decimalPoint"));
            options.setDownloadPNG(bundle.getString("downloadPNG"));
            options.setDownloadJPEG(bundle.getString("downloadJPEG"));
            options.setDownloadPDF(bundle.getString("downloadPDF"));
            options.setDownloadSVG(bundle.getString("downloadSVG"));
            options.setLoading(bundle.getString("loading"));
            options.setMonths(Arrays.asList(bundle.getString("months").split(",")));
            options.setShortMonths(Arrays.asList(bundle.getString("shortMonths").split(",")));
            options.setResetZoom(bundle.getString("resetZoom"));
            options.setResetZoomTitle(bundle.getString("resetZoomTitle"));
            options.setThousandsSep(bundle.getString("thousandsSep"));
            options.setWeekdays(Arrays.asList(bundle.getString("weekdays").split(",")));
            options.setContextButtonTitle(bundle.getString("contextButtonTitle"));
            options.setNumericSymbols(Arrays.asList(bundle.getString("numericSymbols").split(",")));
            options.setPrintChart(bundle.getString("printChart"));
            options.setRangeSelectorFrom(bundle.getString("rangeSelectorFrom"));
            options.setRangeSelectorTo(bundle.getString("rangeSelectorTo"));
            options.setRangeSelectorZoom(bundle.getString("rangeSelectorZoom"));
            return options;
        } catch (MissingResourceException e) {
            // empty LanguageOptions = english, since this is the default of
            // highcharts
            return new LanguageOptions();
        }
    }

    public String getDecimalPoint() {
        return this.decimalPoint;
    }

    public LanguageOptions setDecimalPoint(final String decimalPoint) {
        this.decimalPoint = decimalPoint;
        return this;
    }

    public String getDownloadJPEG() {
        return this.downloadJPEG;
    }

    public LanguageOptions setDownloadJPEG(final String downloadJPEG) {
        this.downloadJPEG = downloadJPEG;
        return this;
    }

    public String getDownloadPDF() {
        return this.downloadPDF;
    }

    public LanguageOptions setDownloadPDF(final String downloadPDF) {
        this.downloadPDF = downloadPDF;
        return this;
    }

    public String getDownloadPNG() {
        return this.downloadPNG;
    }

    public LanguageOptions setDownloadPNG(final String downloadPNG) {
        this.downloadPNG = downloadPNG;
        return this;
    }

    public String getDownloadSVG() {
        return this.downloadSVG;
    }

    public LanguageOptions setDownloadSVG(final String downloadSVG) {
        this.downloadSVG = downloadSVG;
        return this;
    }

    public String getLoading() {
        return this.loading;
    }

    public LanguageOptions setLoading(final String loading) {
        this.loading = loading;
        return this;
    }

    public List<String> getMonths() {
        return this.months;
    }

    public LanguageOptions setMonths(final List<String> months) {
        this.months = months;
        return this;
    }

    public String getResetZoom() {
        return this.resetZoom;
    }

    public LanguageOptions setResetZoom(final String resetZoom) {
        this.resetZoom = resetZoom;
        return this;
    }

    public String getResetZoomTitle() {
        return this.resetZoomTitle;
    }

    public LanguageOptions setResetZoomTitle(final String resetZoomTitle) {
        this.resetZoomTitle = resetZoomTitle;
        return this;
    }

    public List<String> getShortMonths() {
        return this.shortMonths;
    }

    public LanguageOptions setShortMonths(final List<String> shortMonths) {
        this.shortMonths = shortMonths;
        return this;
    }

    public String getThousandsSep() {
        return this.thousandsSep;
    }

    public LanguageOptions setThousandsSep(final String thousandsSep) {
        this.thousandsSep = thousandsSep;
        return this;
    }

    public List<String> getWeekdays() {
        return this.weekdays;
    }

    public LanguageOptions setWeekdays(final List<String> weekdays) {
        this.weekdays = weekdays;
        return this;
    }

    public String getContextButtonTitle() {
        return contextButtonTitle;
    }

    public LanguageOptions setContextButtonTitle(String contextButtonTitle) {
        this.contextButtonTitle = contextButtonTitle;
        return this;
    }

    public List<String> getNumericSymbols() {
        return numericSymbols;
    }

    public LanguageOptions setNumericSymbols(List<String> numericSymbols) {
        this.numericSymbols = numericSymbols;
        return this;
    }

    public String getPrintChart() {
        return printChart;
    }

    public LanguageOptions setPrintChart(String printChart) {
        this.printChart = printChart;
        return this;
    }

    public String getRangeSelectorFrom() {
        return rangeSelectorFrom;
    }

    public LanguageOptions setRangeSelectorFrom(String rangeSelectorFrom) {
        this.rangeSelectorFrom = rangeSelectorFrom;
        return this;
    }

    public String getRangeSelectorTo() {
        return rangeSelectorTo;
    }

    public LanguageOptions setRangeSelectorTo(String rangeSelectorTo) {
        this.rangeSelectorTo = rangeSelectorTo;
        return this;
    }

    public String getRangeSelectorZoom() {
        return rangeSelectorZoom;
    }

    public LanguageOptions setRangeSelectorZoom(String rangeSelectorZoom) {
        this.rangeSelectorZoom = rangeSelectorZoom;
        return this;
    }

}
