package gwt.material.design.jscore.client.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class MediaStreamTrack {

    @JsProperty
    public boolean enabled;

    @JsProperty
    public String id;

    @JsProperty
    public String kind;

    @JsProperty
    public String label;

    @JsProperty
    public boolean muted;

    @JsProperty
    public boolean readOnly;

    @JsProperty
    public boolean remote;
}
