/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwt.material.design.jscore.client;

import gwt.material.design.jscore.client.api.Console;
import gwt.material.design.jscore.client.api.JSON;
import gwt.material.design.jscore.client.api.Window;

/**
 *
 * @author Cristian Rinaldi
 */
public class JSNI {
    
    public static native Console createConsole() /*-{
        return $wnd.console;
    }-*/;
    
    public static native Window createWindow() /*-{
        return $wnd;
    }-*/;
    
    public static native JSON createJSON() /*-{
        return $wnd.JSON;
    }-*/;
}
