/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwt.material.design.jscore.client.api.db;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import gwt.material.design.jscore.client.api.Function;
import gwt.material.design.jscore.client.api.core.DOMError;
import gwt.material.design.jscore.client.api.core.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 */
@JsType(isNative = true)
public class IDBTransaction extends EventTarget{

    @JsProperty
    public native IDBDatabase getBb();

    @JsProperty
    public native DOMError getError();

    @JsProperty
    public native IDBTransactionMode getMode();
    
    @JsProperty
    public native void setMode(IDBTransactionMode mode);

    @JsProperty
    public native void setOnabort(Function fn);

    @JsProperty
    public native void setOncomplete(Function fn);
    
    @JsProperty
    public native String[] getObjectStoreNames();

    @JsProperty
    public native void setOnerror(Function fn);

    public native void abort();

    public native IDBObjectStore objectStore(String name);
}
