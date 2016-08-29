package gwt.material.design.jscore.client.api;

import elemental2.Blob;
import elemental2.MediaSource;
import elemental2.URLSearchParams;
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
    public URLSearchParams searchParams;
    public String username;

    public static native String createObjectURL(MediaStream var0);

    public static native String createObjectURL(Blob var0);

    public static native String createObjectURL(MediaSource var0);

    public static native String domainToASCII(String var0);

    public static native String domainToUnicode(String var0);

    public static native Object revokeObjectURL(String var0);

    public URL(String url, String base) {
    }

    public URL(String url) {
    }
}
