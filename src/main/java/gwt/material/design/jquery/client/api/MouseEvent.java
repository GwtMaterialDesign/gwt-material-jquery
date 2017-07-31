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


import gwt.material.design.jscore.client.api.core.Element;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * MouseEvent for JQuery.
 * 
 * @author Ben Dol
 */
@JsType(isNative=true)
public class MouseEvent extends KeyEvent {

    @JsProperty
    public native int getPageX();

    @JsProperty
    public native int getPageY();

    @JsProperty
    public native int getClientX();

    @JsProperty
    public native int getClientY();

    @JsProperty
    public native int getOffsetX();

    @JsProperty
    public native int getOffsetY();

    @JsProperty
    public native int getScreenX();

    @JsProperty
    public native int getScreenY();

    @JsProperty
    public native Element getTarget();

    @JsProperty
    public native Element getToElement();

    @JsProperty
    public native int getButton();

    @JsProperty
    public native int getButtons();
}
