package gwt.material.design.jscore.client.api.file;

import gwt.material.design.jscore.client.api.JsObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class File extends JsObject {

    @JsProperty
    public String name;

    @JsProperty
    public String fullpath;

    @JsProperty
    public String type;

    @JsProperty
    public String lastmodifieddate;

    @JsProperty
    public String size;

    @JsMethod
    public native File slice(int start, int end);
}
