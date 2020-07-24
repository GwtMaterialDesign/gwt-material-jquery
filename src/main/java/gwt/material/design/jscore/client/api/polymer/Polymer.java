/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gwt.material.design.jscore.client.api.polymer;

import gwt.material.design.jscore.client.api.core.Element;
import jsinterop.annotations.JsType;

/**
 *
 * @author Cristian Rinaldi - csrinaldi@gmail.com
 */
@JsType(isNative = true)
public class Polymer {

    public native Element dom(Element e);

    //TODO: Convert to JSInterop
    public static class Static {
        public static native Polymer get() /*-{
            return $wnd.Polymer
        }-*/;
    }
}
