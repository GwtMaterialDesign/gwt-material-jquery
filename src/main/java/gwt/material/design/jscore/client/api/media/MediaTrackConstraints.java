package gwt.material.design.jscore.client.api.media;

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
    public String facingMode;

    @JsProperty
    public FrameRate frameRate;

    @JsProperty
    public double aspectRatio;
}
