package gwt.material.design.jscore.client.api.file;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class ProgressEvent {

    @JsProperty
    public FileReader target;
}
