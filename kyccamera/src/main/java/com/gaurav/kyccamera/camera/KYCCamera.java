package com.gaurav.kyccamera.camera;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

public class KYCCamera {

    public final static int    TYPE_AADHAARCARD_FRONT     = 1;//Front of AADHAAR card
    public final static int    TYPE_AADHAARCARD_BACK      = 2;//Reverse side of AADHAAR card
    public final static int    TYPE_PANCARD_FRONT    = 3;//Front of PAN card
    public final static int    RESULT_CODE           = 0X11;//Result code
    public final static int    PERMISSION_CODE_FIRST = 0x12;//Permission request code
    public final static String TAKE_TYPE             = "take_type";//Shot type mark
    public final static String IMAGE_PATH            = "image_path";//Picture path mark

    private final WeakReference<Activity> mActivity;
    private final WeakReference<Fragment> mFragment;

    public static KYCCamera create(Activity activity) {
        return new KYCCamera(activity);
    }

    public static KYCCamera create(Fragment fragment) {
        return new KYCCamera(fragment);
    }

    private KYCCamera(Activity activity) {
        this(activity, (Fragment) null);
    }

    private KYCCamera(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    private KYCCamera(Activity activity, Fragment fragment) {
        this.mActivity = new WeakReference(activity);
        this.mFragment = new WeakReference(fragment);
    }

    public void openCamera(int IDCardDirection) {
        Activity activity = this.mActivity.get();
        Fragment fragment = this.mFragment.get();
        Intent intent = new Intent(activity, CameraActivity.class);
        intent.putExtra(TAKE_TYPE, IDCardDirection);
        if (fragment != null) {
            fragment.startActivityForResult(intent, IDCardDirection);
        } else {
            activity.startActivityForResult(intent, IDCardDirection);
        }
    }

    public static String getImagePath(Intent data) {
        if (data != null) {
            return data.getStringExtra(IMAGE_PATH);
        }
        return "";
    }
}
