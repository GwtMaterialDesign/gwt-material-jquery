package gwt.material.design.jscore.client.api.file;

import gwt.material.design.jscore.client.api.Function;
import gwt.material.design.jscore.client.api.JsObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class FileEntry extends JsObject {

    @JsProperty
    boolean isFile;

    @JsProperty
    boolean isDirectory;

    @JsProperty
    String name;

    @JsProperty
    String fullPath;

    @JsProperty
    FileSystem filesystem;

    @JsMethod
    public native String toURL();

    @JsMethod
    public native void createWriter(Function<Void, FileWriter> success, Function<Void, FileError> error);

    @JsMethod
    public native void file(Function<Void, File> success, Function<Void, FileError> error);
}
