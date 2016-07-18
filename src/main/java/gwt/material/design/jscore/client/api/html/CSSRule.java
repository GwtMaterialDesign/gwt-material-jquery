/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwt.material.design.jscore.client.api.html;

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

/** 
 * Native CSSRule 
 * https://developer.mozilla.org/en-US/docs/Web/API/CSSRule
 * 
 * @author Cristian Rinaldi
 */
public class CSSRule {
    
    final short STYLE_RULE = 1;
    final short CHARSET_RULE = 2; // Obsolete
    final short IMPORT_RULE = 3;
    final short MEDIA_RULE = 4;
    final short FONT_FACE_RULE = 5;
    final short PAGE_RULE = 6;
    final short KEYFRAMES_RULE = 7;
    final short KEYFRAME_RULE = 8;
    final short NAMESPACE_RULE = 10;
    final short COUNTER_STYLE_RULE = 11;
    final short SUPPORTS_RULE = 12;
    final short DOCUMENT_RULE = 13;
    final short FONT_FEATURE_VALUES_RULE = 14;
    final short VIEWPORT_RULE = 15;
    final short REGION_STYLE_RULE = 16;
    
    @JsProperty
    public native short getType();
    
    
}
