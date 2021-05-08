# KYCCamera
Android Custom KYC Camera

[![jitpack](https://jitpack.io/v/Gauravhulmukh/KYCCamera.svg)](https://jitpack.io/#Gauravhulmukh/KYCCamera)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
[![](https://img.shields.io/badge/License-Apache--2.0-brightgreen.svg)](https://github.com/Gauravhulmukh/KYCCamera/blob/master/LICENSE)
[![](https://img.shields.io/badge/Author-GauravHulmukh-7AD6FD.svg)](https://github.com/Gauravhulmukh)


![](https://github.com/Gauravhulmukh/KYCCamera/blob/master/screenshots/screensho.jpg)
![](https://github.com/Gauravhulmukh/KYCCamera/blob/master/screenshots/screensho.jpg)

## Features
- Custom camera interface for Indian ID card (Aadhaar Card, Pan Card)
- Support to turn on/off flash
- Support touch screen for focusing
- Support automatic clipping of images
- Support manual irregular clipping of images

## How to Use:
### Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Step 2. Add a gradle dependency
```java
dependencies {
	        implementation 'com.github.Gauravhulmukh:KYCCamera:v1.1'
	}
```

### Step 3. Open photographic interface
- Front side of Aadhaar Card
```java
KYCCamera.create(this).openCamera(KYCCamera.TYPE_AADHAARCARD_FRONT);
```
- Back side of Aadhaar Card
```java
KYCCamera.create(this).openCamera(KYCCamera.TYPE_AADHAARCARD_BACK);
```
- Front side of Pan Card 
```java
KYCCamera.create(this).openCamera(KYCCamera.TYPE_PANCARD_FRONT);
```
**notice：** The parameters of the create() method are passed the context, activity.this is passed in Activity, and fragment.this is passed in Fragment.

### Step 4. Get a picture
```java
@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == KYCCamera.RESULT_CODE) {
            //Get image path，display image
            final String path = KYCCamera.getImagePath(data);
            if (!TextUtils.isEmpty(path)) {
                if (requestCode == KYCCamera.TYPE_AADHAARCARD_FRONT) { //Front of AADHAAR card
                    acf.setImageBitmap(BitmapFactory.decodeFile(path));
                } else if (requestCode == KYCCamera.TYPE_AADHAARCARD_BACK) {  //Reverse side of AADHAAR card
                    acb.setImageBitmap(BitmapFactory.decodeFile(path));
                } else if (requestCode == KYCCamera.TYPE_PANCARD_FRONT) {  //Front of PAN card
                    pcf.setImageBitmap(BitmapFactory.decodeFile(path));
                }

            }
        }
    }
```

### Clear Cache
```java
FileUtils.clearCache(this);
```

## License
```
   Copyright 2021 GauravHulmukh

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
