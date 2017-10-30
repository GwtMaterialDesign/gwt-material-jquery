package gwt.material.design.jscore.client.api.serviceworker;

import gwt.material.design.jquery.client.api.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * The SyncManager interface of the the {@link ServiceWorker} API provides an interface for registering and listing sync registrations.
 */
@JsType(isNative = true)
public class SyncManager {

    /**
     * Create a new sync registration and return a Promise.
     */
    @JsMethod
    public native Promise register(String id);

    /**
     * Return a list of developer-defined identifiers for SyncManager registration.
     */
    @JsMethod
    public native Promise getTags();
}
