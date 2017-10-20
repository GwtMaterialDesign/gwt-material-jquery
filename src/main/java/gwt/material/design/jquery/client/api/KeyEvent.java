package gwt.material.design.jquery.client.api;

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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * KeyEvent for JQuery.
 * 
 * @author Ben Dol
 */
@JsType(namespace = "jQuery", name = "Event", isNative=true)
public class KeyEvent extends Event {

    public KeyEvent(String type) {
        super(type);
    }

    @JsProperty
    public int which;

    @JsOverlay
    public final int getWhich() {
        return which;
    }

    @JsProperty
    public int keyCode;

    @JsOverlay
    public final int getKeyCode() {
        return keyCode;
    }

    @JsProperty
    public String charCode;

    @JsOverlay
    public final String getCharCode() {
        return charCode;
    }

    @JsProperty
    public boolean shiftKey;

    @JsOverlay
    public final boolean isShiftKey() {
        return shiftKey;
    }

    @JsProperty
    public boolean ctrlKey;

    @JsOverlay
    public final boolean isCtrlKey() {
        return ctrlKey;
    }

    @JsProperty
    public boolean altKey;

    @JsOverlay
    public final boolean isAltKey() {
        return altKey;
    }

    @JsProperty
    public boolean cancelable;

    @JsOverlay
    public final boolean isCancelable() {
        return cancelable;
    }

    @JsProperty
    public boolean bubbles;

    @JsOverlay
    public final boolean isBubbles() {
        return bubbles;
    }
}
