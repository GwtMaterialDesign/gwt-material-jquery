package gwt.material.design.jscore.client.api;

/*
 * Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import gwt.material.design.jscore.client.api.media.Constraints;
import gwt.material.design.jscore.client.api.media.MediaDevices;
import gwt.material.design.jscore.client.api.media.MediaStream;
import gwt.material.design.jscore.client.api.serviceworker.ServiceWorkerContainer;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "navigator")
public class Navigator {

    public static String appCodeName;
    public static String appName;
    public static String appVersion;
    public static boolean cookieEnabled;
    public static String language;
    public static MediaDevices mediaDevices;
    public static boolean onLine;
    public static String platform;
    public static String product;
    public static String userAgent;

    public static MediaStream getMedia;
    public static MediaStream getUserMedia;
    public static MediaStream webkitGetUserMedia;
    public static MediaStream mozGetUserMedia;
    public static MediaStream msGetUserMedia;
    public static ServiceWorkerContainer serviceWorker;

    @JsMethod
    public static native void getMedia(Constraints constraints, Functions.Func1<MediaStream> successCallback, Functions.Func1<String> failureCallback);
}
