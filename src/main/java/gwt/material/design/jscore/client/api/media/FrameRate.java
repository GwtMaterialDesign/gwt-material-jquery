package gwt.material.design.jscore.client.api.media;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class FrameRate {

    @JsProperty
    public double ideal;

    @JsProperty
    public double max;
}
