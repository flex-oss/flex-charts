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
package org.cdlflex.charts.modalwindow;

import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;

/**
 * Tests if charts work within {@link ModalWindow}s.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class ModalWindowPage extends WebPage {

    private static final long serialVersionUID = 1L;

    public ModalWindowPage() {

        final ModalWindow window = new ModalWindow("modalWindow");
        window.setContent(new ChartPanel("content"));
        this.add(window);

        Button button = new Button("button");
        button.add(new AjaxEventBehavior("onclick") {
            private static final long serialVersionUID = 1L;

            @Override
            protected void onEvent(AjaxRequestTarget target) {
                window.show(target);
            }
        });
        this.add(button);

    }

}
