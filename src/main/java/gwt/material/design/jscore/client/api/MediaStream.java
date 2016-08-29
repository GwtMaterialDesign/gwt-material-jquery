package gwt.material.design.jscore.client.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class MediaStream {

    @JsProperty
    public boolean active;

    @JsProperty
    public boolean ended;

    @JsProperty
    public String id;

    @JsMethod
    public native void addTrack(MediaStreamTrack track);

    @JsMethod
    public native MediaStream clone();

    @JsMethod
    public native MediaStreamTrack getAudioTracks();

    @JsMethod
    public native MediaStreamTrack[] getTracks();

    @JsMethod
    public native MediaStreamTrack getVideoTracks();

    @JsMethod
    public native void removeTrack(MediaStreamTrack track);


}
