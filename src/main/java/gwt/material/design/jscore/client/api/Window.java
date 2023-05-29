/*
 * Copyright 2014 Cristian Rinaldi & Andres Testi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gwt.material.design.jscore.client.api;

import gwt.material.design.jscore.client.api.db.IDBEnvironment;
import gwt.material.design.jscore.client.api.viewport.VisualViewport;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Native JS window
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 */
@JsType(isNative = true, name = "window")
public class Window extends IDBEnvironment {

    @JsProperty
    public native Console getConsole();
    
    @JsProperty
    public native Document getDocument();

    @JsProperty
    public static double outerWidth;

    @JsProperty
    public static double innerWidth;

    @JsProperty
    public static double outerHeight;

    @JsProperty
    public static double innerHeight;

    @JsProperty
    public static VisualViewport visualViewport;
}
