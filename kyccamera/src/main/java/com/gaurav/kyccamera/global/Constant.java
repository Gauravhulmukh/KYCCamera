package com.gaurav.kyccamera.global;

import com.gaurav.kyccamera.utils.FileUtils;

import java.io.File;


public class Constant {
    public static final String APP_NAME = "KYCCamera";//app
    public static final String BASE_DIR = APP_NAME + File.separator;
    public static final String DIR_ROOT = FileUtils.getRootPath() + File.separator + com.gaurav.kyccamera.global.Constant.BASE_DIR;
}