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
 * Event for JQuery.
 * 
 * @author Cristian Rinaldi
 */
@JsType(name = "jQuery", isNative=true)
public class Event {

    @JsProperty
    public native Object getData();

    @JsProperty
    public native Element getCurrentTarget();

    @JsProperty
    public native Element getDelegateTarget();

    @JsProperty
    public native Object getResult();

    @JsProperty
    public native String getType();

    @JsProperty
    public native String getMetaKey();

    @JsProperty
    public native int getTimeStamp();

    @JsProperty
    public native JQueryElement getRelatedTarget();

    @JsProperty
    public native String getNamespace();

    public native void stopPropagation();

    public native void stopImmediatePropagation();

    public native void preventDefault();

    public native Boolean isPropagationStopped();

    public native Boolean isDefaultPrevented();

    public native Boolean isImmediatePropagationStopped();
}
