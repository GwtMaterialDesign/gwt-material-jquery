package gwt.material.design.jquery;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
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

import elemental2.dom.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * MouseEvent for JQuery.
 * 
 * @author Ben Dol
 */
@JsType(namespace = "jQuery", name = "Event", isNative=true)
public class MouseEvent extends KeyEvent {

    public MouseEvent(String type) {
        super(type);
    }

    @JsProperty
    public int pageX;

    @JsOverlay
    public final int getPageX() {
        return pageX;
    }

    @JsProperty
    public int pageY;

    @JsOverlay
    public final int getPageY() {
        return pageY;
    }

    @JsProperty
    public int clientX;

    @JsOverlay
    public final int getClientX() {
        return clientX;
    }

    @JsProperty
    public int clientY;

    @JsOverlay
    public final int getClientY() {
        return clientY;
    }

    @JsProperty
    public int offsetX;

    @JsOverlay
    public final int getOffsetX() {
        return offsetX;
    }

    @JsProperty
    public int offsetY;

    @JsOverlay
    public final int getOffsetY() {
        return offsetY;
    }

    @JsProperty
    public int screenX;

    @JsOverlay
    public final int getScreenX() {
        return screenX;
    }

    @JsProperty
    public int screenY;

    @JsOverlay
    public final int getScreenY() {
        return screenY;
    }

    @JsProperty
    public Element target;

    @JsOverlay
    public final Element getTarget() {
        return target;
    }

    @JsProperty
    public Element toElement;

    @JsOverlay
    public final Element getToElement() {
        return toElement;
    }

    @JsProperty
    public int button;

    @JsOverlay
    public final int getButton() {
        return button;
    }

    @JsProperty
    public int buttons;

    @JsOverlay
    public final int getButtons() {
        return buttons;
    }
}
