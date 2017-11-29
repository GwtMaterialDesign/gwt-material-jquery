package gwt.material.design.jscore.client.api.push;

import gwt.material.design.jquery.client.api.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

//@formatter:off

/**
 * The PushSubscription interface of the Push API provides a subcription's URL
 * endpoint and allows unsubscription from a push service.
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
@JsType(isNative = true)
public class PushSubscription {

    @JsProperty
    public String endpoint;

    @JsProperty
    public Date expirationTime;

    @JsProperty
    public Object options;


    @JsProperty
    public String subscriptionId;

    @JsMethod
    public native String getKey();

    @JsMethod
    public native String toJSON();

    @JsMethod
    public native Promise unsubscribe();
}
