package gwt.material.design.jscore.client.api.file;

import gwt.material.design.jscore.client.api.JsObject;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class FileError extends JsObject {

    @JsProperty
    public String code;
}
