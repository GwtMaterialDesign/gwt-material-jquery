package gwt.material.design.jscore.client.api.media;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class MediaDeviceInfo {

    @JsProperty
    public String deviceId;

    @JsProperty
    public String groupId;

    @JsProperty
    public String kind;

    @JsProperty
    public String label;
}
