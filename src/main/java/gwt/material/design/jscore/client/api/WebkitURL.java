package gwt.material.design.jscore.client.api;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class WebkitURL {

    public static native String createObjectURL(MediaStream var0);

    public static native Object revokeObjectURL(String var0);

    public WebkitURL(String urlString, String base) {
    }

    public WebkitURL(String urlString) {
    }
}
