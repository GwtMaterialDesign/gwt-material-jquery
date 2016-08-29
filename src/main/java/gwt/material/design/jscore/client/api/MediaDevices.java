package gwt.material.design.jscore.client.api;

import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class MediaDevices {

    @JsMethod
    public native MediaStream getUserMedia();

    @JsMethod
    public native MediaStream getUserMedia(JavaScriptObject constraints);
}
