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
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Event for JQuery.
 * 
 * @author Cristian Rinaldi
 */
@JsType(namespace = "jQuery", name = "Event", isNative=true)
public class Event {

    @JsConstructor
    public Event(String type) {}

    @JsProperty
    public String type;

    @JsOverlay
    public final String getType() {
        return type;
    }

    @JsProperty
    public Object data;

    @JsOverlay
    public final Object getData() {
        return data;
    }

    @JsProperty
    public Element currentTarget;

    @JsOverlay
    public final Element getCurrentTarget() {
        return currentTarget;
    }

    @JsProperty
    public Element delegateTarget;

    @JsOverlay
    public final Element getDelegateTarget() {
        return delegateTarget;
    }

    @JsProperty
    public Object result;

    @JsOverlay
    public final Object getResult() {
        return result;
    }

    @JsProperty
    public String metaKey;

    @JsOverlay
    public final String getMetaKey() {
        return metaKey;
    }

    @JsProperty
    public int timeStamp;

    @JsOverlay
    public final int getTimeStamp() {
        return timeStamp;
    }

    @JsProperty
    public JQueryElement relatedTarget;

    @JsOverlay
    public final JQueryElement getRelatedTarget() {
        return relatedTarget;
    }

    @JsProperty
    public String namespace;

    @JsOverlay
    public final String getNamespace() {
        return namespace;
    }

    public native void stopPropagation();

    public native void stopImmediatePropagation();

    public native void preventDefault();

    public Boolean propagationStopped;

    public Boolean defaultPrevented;

    public Boolean immediatePropagationStopped;
}
