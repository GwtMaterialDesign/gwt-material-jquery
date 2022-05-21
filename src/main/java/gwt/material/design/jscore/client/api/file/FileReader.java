package gwt.material.design.jscore.client.api.file;

import gwt.material.design.jquery.client.api.Functions;
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

    @JsProperty
    public Functions.Func onabort;

    @JsProperty
    public Functions.Func onerror;

    @JsProperty
    public Functions.Func1<ProgressEvent> onload;

    @JsProperty
    public Functions.Func onloadstart;

    @JsProperty
    public Functions.Func onloadend;

    @JsProperty
    public Functions.Func onprogress;

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
