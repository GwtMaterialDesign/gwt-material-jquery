package gwt.material.design.jscore.client.api;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Constraints {

    @JsProperty
    public boolean video;

    @JsProperty
    public boolean audio;
}
