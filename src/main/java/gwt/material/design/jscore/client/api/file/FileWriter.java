package gwt.material.design.jscore.client.api.file;

import gwt.material.design.jscore.client.api.JsObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = JsPackage.GLOBAL)
public class FileWriter extends JsObject {

    @JsMethod
    public native void write(String data);

}
