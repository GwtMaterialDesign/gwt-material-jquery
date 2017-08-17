package gwt.material.design.jscore.client.api;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
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
 * #L%
 */


import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * KeyEvent for JQuery.
 * 
 * @author Ben Dol
 */
@JsType(isNative=true)
public class KeyEvent extends Event {

    @JsProperty
    public native int getWhich();

    @JsProperty
    public native int getKeyCode();

    @JsProperty
    public native String getCharCode();

    @JsProperty
    public native boolean isShiftKey();

    @JsProperty
    public native boolean isCtrlKey();

    @JsProperty
    public native boolean isAltKey();

    @JsProperty
    public native boolean isCancelable();

    @JsProperty
    public native boolean isBubbles();
}
