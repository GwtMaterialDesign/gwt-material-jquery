package gwt.material.design.jscore.client.api.file;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class FileReader {

    @JsProperty
    public Object error;

    @JsProperty
    public int readyState;

    @JsProperty
    public String result;

    @JsMethod
    public native void abort();

    @JsMethod
    public native void readAsArrayBuffer(File file);

    @JsMethod
    public native void readAsBinaryString(File file);

    @JsMethod
    public native void readAsDataURL(File file);

    @JsMethod
    public native void readAsText(File file);

}
