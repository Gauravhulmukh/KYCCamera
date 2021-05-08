## KYCCamera
[![jitpack](https://jitpack.io/v/Gauravhulmukh/KYCCamera.svg)](https://jitpack.io/#Gauravhulmukh/KYCCamera)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
[![](https://img.shields.io/badge/License-Apache--2.0-brightgreen.svg)](https://github.com/Gauravhulmukh/KYCCamera/blob/master/LICENSE)
[![](https://img.shields.io/badge/Author-GauravHulmukh-7AD6FD.svg)](https://github.com/Gauravhulmukh)

## 1 Introduction
Some time ago, a custom camera was implemented at the request of the company, which required autofocus and irregular image cropping functions. In fact, these two functions are the main difficulty. After searching on Google, it was found that there were no ready-made wheels. Finally, through various search materials, I encapsulated one by myself, and the renderings are as follows:

## Design sketch
![](https://github.com/Gauravhulmukh/KYCCamera/blob/master/screenshots/screenshot.jpg)
![](https://github.com/Gauravhulmukh/KYCCamera/blob/master/screenshots/screenshot2.jpg)

<div class="image-package">
<div class="image-container" style="max-width: 700px; max-height: 604px;">
<div class="image-container-fill" style="padding-bottom: 86.38%;"></div>
<div class="image-view" data-width="1880" data-height="1624"><img data-original-src="https://github.com/Gauravhulmukh/KYCCamera/blob/master/screenshots/screenshot.jpg" data-original-width="1880" data-original-height="1624" data-original-format="image/jpeg" data-original-filesize="822481"></div>
</div>

# To Use

Step 1. Add JitPack repository
Add the JitPack repository to the project's build.gradle
<pre><code>allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
</code></pre>

Step 2. Add dependencies
Add dependencies to the modules that need to be used (see KYCCamera for the latest version )
<pre><code>
dependencies {
	        implementation 'com.github.Gauravhulmukh:KYCCamera:v1.1'
	}
</code></pre>
Or refer to the local lib
<pre><code>
compile project(':KYCCamera')
</code></pre>
