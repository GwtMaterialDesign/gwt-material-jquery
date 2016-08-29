package gwt.material.design.jscore.client.api;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class URL {

    public String hash;
    public String host;
    public String hostname;
    public String href;
    public String origin;
    public String password;
    public String pathname;
    public String port;
    public String protocol;
    public String search;
    public String username;

    public static native String createObjectURL(MediaStream var0);

    public static native String domainToASCII(String var0);

    public static native String domainToUnicode(String var0);

    public static native Object revokeObjectURL(String var0);

    public URL(String url, String base) {
    }

    public URL(String url) {
    }
}
