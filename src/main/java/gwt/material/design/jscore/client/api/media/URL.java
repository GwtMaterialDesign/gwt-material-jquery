package gwt.material.design.jscore.client.api.media;

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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class URL {

    public String hash;
    public String host;
    public String hostname;
    public String href;
    public String origin;
    public String password;
    public String pathname;
    public String port;
    public String protocol;
    public String search;
    public String username;

    public static native String createObjectURL(MediaStream var0);

    public static native String domainToASCII(String var0);

    public static native String domainToUnicode(String var0);

    public static native Object revokeObjectURL(String var0);

    public URL(String url, String base) {
    }

    public URL(String url) {
    }
}
