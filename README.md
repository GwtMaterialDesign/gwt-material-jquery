<img src="http://i.imgur.com/5GxyXx6.png" />

## GWT Material JQuery

[![Build Status](https://travis-ci.org/GwtMaterialDesign/gwt-material-jquery.svg?branch=master)](https://travis-ci.org/GwtMaterialDesign/gwt-material-jquery) [![Join us](https://img.shields.io/badge/slack-channel-purple)](https://gmd-project.slack.com)

JQuery interface maintained by GWT Material Design.

## Documentation

Documentation on the JQuery can be found here: https://api.jquery.com/

## Maven
Current Version 2.6.1
```xml
<dependency>
    <groupId>com.github.gwtmaterialdesign</groupId>
    <artifactId>gwt-material-jquery</artifactId>
    <version>2.6.1</version>
</dependency>
```
Snapshot Version 2.7.0
```xml
<dependency>
    <groupId>com.github.gwtmaterialdesign</groupId>
    <artifactId>gwt-material-jquery</artifactId>
    <version>2.7.0-SNAPSHOT</version>
</dependency>
```

## Usage
Ensure you have JQuery loaded before this library is inherited.
This is handled by GMD if you yare using `GwtMaterialWithJQuery` GMD module.

```xml
<inherits name="gwt.material.design.jquery.JQuery" />
```

```java
import static gwt.material.design.jquery.client.api.JQuery.$;

public class MyEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
      $(".myclass").css("display", "block");
    }
}
```

See [JQueryElement](https://github.com/GwtMaterialDesign/gwt-material-jquery/blob/master/src/main/java/gwt/material/design/jquery/client/api/JQueryElement.java) for more details on the API interface.
