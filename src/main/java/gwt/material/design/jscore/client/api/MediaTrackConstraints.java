package gwt.material.design.jscore.client.api;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class MediaTrackConstraints {

    @JsProperty
    public long width;

    @JsProperty
    public long height;

    @JsProperty
    public double aspectRatio;

    @JsProperty
    public double frameRate;
}
