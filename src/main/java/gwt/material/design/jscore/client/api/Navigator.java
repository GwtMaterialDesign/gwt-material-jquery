package gwt.material.design.jscore.client.api;

import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Native Navigator for Camera accessibility
 * @author kevzlou7979
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "navigator")
public class Navigator {

    public static String appCodeName;
    public static String appName;
    public static String appVersion;
    public static boolean cookieEnabled;
    public static String language;
    public static MediaDevices mediaDevices;
    public static boolean onLine;
    public static String platform;
    public static String product;
    public static String userAgent;

    public static MediaStream getMedia;
    public static MediaStream getUserMedia;
    public static MediaStream webkitGetUserMedia;
    public static MediaStream mozGetUserMedia;
    public static MediaStream msGetUserMedia;

    @JsMethod
    public static native void getMedia(Constraints constraints, Functions.Func1<MediaStream> successCallback, Functions.Func1<String> failureCallback);

}
