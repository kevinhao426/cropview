# cropview

## Usage

1. Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

2. Add the dependency
```gradle
dependencies {
	        implementation 'com.github.kevinhao426:cropview:1.0.3'
	}
```
3. Add this to your layout
```xml
<com.oginotihiro.cropview.CropView
     android:layout_width="match_parent"
     android:layout_height="match_parent"
     android:id="@+id/cropView" />
```

4.Initialize cropview
```java
CropView cropView = (CropView) findViewById(R.id.cropView);
cropView.of(srouceUri)
        .withAspect(r)
        .withOutputSize(widht, height)
        .initialize(context);
```
5. To get the Origin Uri
```java
cropView.getUri();
```

6.Get cropped bitmap
```java
Bitmap croppedBitmap = cropView.getOutput();
CropUtil.saveOutput(context, saveUri, croppedImage, quality);
```

## Compatibility
Supported on API level 10 and above (2.3+)

## License

    Copyright 2016 oginotihiro

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
