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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Native JS Console
 *
 * @author Cristian Rinaldi
 * <a href="mailto:csrinaldi@gmail.com?Subject=JsCore">csrinaldi@gmail.com</a>
 */
@JsType(isNative = true, namespace = "console")
public class Console {

    @JsProperty
    public native MemoryInfo getMemory();

    @JsMethod
    public native void log(Object... obj);

    @JsMethod
    public native void table(Object obj);

    @JsMethod
    public native void clear();
}
