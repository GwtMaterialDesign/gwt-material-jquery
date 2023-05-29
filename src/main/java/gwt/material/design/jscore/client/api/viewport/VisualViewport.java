package gwt.material.design.jscore.client.api.viewport;

import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.jscore.client.api.core.EventTarget;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "visualViewport")
public class VisualViewport extends EventTarget {

    @JsProperty
    public int offsetLeft;

    @JsProperty
    public int offsetTop;

    @JsProperty
    public int pageLeft;

    @JsProperty
    public int pageTop;

    @JsProperty
    public int width;

    @JsProperty
    public int height;

    @JsProperty
    public int scale;

    @JsMethod
    public native void addEventListener(String event, Functions.EventFunc func);

}