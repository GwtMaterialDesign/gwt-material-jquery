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

import elemental2.promise.Promise;
import gwt.material.design.jquery.Functions.Func;
import gwt.material.design.jquery.Functions.Func1;
import gwt.material.design.jquery.Functions.Func2;
import gwt.material.design.jquery.Functions.Func3;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Ben Dol
 */
@JsType(isNative = true)
public class AnimateOptions {

    @JsProperty public native double getDuration();
    @JsProperty public native void setDuration(double duration);

    @JsProperty public native String getEasing();
    @JsProperty public native void setEasing(String easing);

    @JsProperty public native boolean isQueue();
    @JsProperty public native void setQueue(boolean queue);

    @JsProperty public native Object getSpecialEasing();
    @JsProperty public native void setSpecialEasing(Object specialEasing);

    @JsProperty public native Func3<Promise, Double, Double> getProgress();
    @JsProperty public native void setProgress(Func3<Promise, Double, Double> progress);

    @JsProperty public native Func getComplete();
    @JsProperty public native void setComplete(Func complete);

    @JsProperty public native Func1<Promise> getStart();
    @JsProperty public native void setStart(Func1<Promise> start);

    @JsProperty public native Func2<Promise, Boolean> getDone();
    @JsProperty public native void setDone(Func2<Promise, Boolean> done);

    @JsProperty public native Func2<Promise, Boolean> getFail();
    @JsProperty public native void setFail(Func2<Promise, Boolean> fail);

    @JsProperty public native Func2<Promise, Boolean> getAlways();
    @JsProperty public native void setAlways(Func2<Promise, Boolean> always);
}
