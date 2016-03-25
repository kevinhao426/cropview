# cropview
<img src="https://raw.githubusercontent.com/oginotihiro/cropview/master/screenshots/sample1.png" width="260" />
<img src="https://raw.githubusercontent.com/oginotihiro/cropview/master/screenshots/sample2.png" width="260" />
<img src="https://raw.githubusercontent.com/oginotihiro/cropview/master/screenshots/sample3.png" width="260" />
<img src="https://raw.githubusercontent.com/oginotihiro/cropview/master/screenshots/sample4.png" width="260" />
<img src="https://raw.githubusercontent.com/oginotihiro/cropview/master/screenshots/sample5.png" width="260" />

## Usage

### 1.Add this in your build.gradle file

```gradle
compile 'com.oginotihiro:cropview:1.0.0'
```

### 2.Add it on your layout
```xml
<com.oginotihiro.cropview.CropView
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

### 3.start crop
```java
CropView cropView = (CropView) findViewById(R.id.cropView);
cropView.of(Uri srouceUri).withAspect(int x, int y).withOutputSize(int widht, int height).initialize(Context context);
```

### 4.get cropped bitmap
```java
Bitmap croppedBitmap = cropView.getOutput();
CropUtil.saveOutput(Context context, Uri saveUri, Bitmap croppedImage, int quality)
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
