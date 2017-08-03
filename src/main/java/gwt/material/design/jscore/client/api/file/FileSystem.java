package gwt.material.design.jscore.client.api.file;

import gwt.material.design.jscore.client.api.JsObject;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class FileSystem extends JsObject {

    @JsProperty(name = "root")
    public native DirectoryEntry getRoot();

    @JsProperty(name = "name")
    public native String getName();

    public native String toJSON();

    public native String encodeURIPath();

}
