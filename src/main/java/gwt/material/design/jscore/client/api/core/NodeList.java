/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwt.material.design.jscore.client.api.core;

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


import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author iron
 */
@JsType(isNative = true)
public class NodeList {

    /**
     * This attribute specifies the length or size of the list.
     */
    @JsProperty
    public native int getLength();

    /**
     * This method retrieves a node specified by ordinal index. Nodes are
     * numbered in tree order (depth-first traversal order).
     *
     * @param index The index of the node to be fetched. The index origin is 0.
     * @return The <code>Node</code> at the corresponding position upon success.
     * A value of <code>null</code> is returned if the index is out of range.
     */
    public native Node item(int index);

}
