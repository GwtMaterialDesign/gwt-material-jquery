package gwt.material.design.jscore.client.api.file;

import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.jscore.client.api.JsObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class DirectoryEntry extends JsObject {

    @JsMethod
    public native boolean isFile();

    @JsMethod
    public native boolean isDirectory();

    @JsMethod
    public native String getName();

    @JsMethod
    public native String getFullPath();

    @JsMethod
    public native FileSystem getFileSystem();

    @JsMethod
    public native void getDirectory(String Path, FileOptions options, Functions.Func2<Void, DirectoryEntry> success, Functions.Func2<Void, FileError> error);

    @JsMethod
    public native void removeRecursively(Functions.Func2<Void, Void> success, Functions.Func2<Void, FileError> error);

    @JsMethod
    public native void getFile(String path, FileOptions options, Functions.Func2<Void, FileEntry> success, Functions.Func2<Void, FileError> error);

}
