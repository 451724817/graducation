package com.app.abby.iweather.util;

import android.content.res.Resources;
import android.support.annotation.DimenRes;

import com.app.abby.iweather.base.WeatherApplication;


/**
 * Created by tianhao on 2/4/2018.
 */

public class DensityUtil {

    private static Resources sRes = Resources.getSystem();
    private static int sDensityDpi = sRes.getDisplayMetrics().densityDpi;
    private static float sScaledDensity = sRes.getDisplayMetrics().scaledDensity;

    public static int dp2px(float value) {
        final float scale = sDensityDpi;
        return (int) (value * (scale / 160) + 0.5f);
    }

    public static int px2dp(float value) {
        final float scale = sDensityDpi;
        return (int) ((value * 160) / scale + 0.5f);
    }

    public static int sp2px(float value) {
        float spValue = value * sScaledDensity;
        return (int) (spValue + 0.5f);
    }

    public static int px2sp(float value) {
        final float scale = sScaledDensity;
        return (int) (value / scale + 0.5f);
    }

    public static int dimenPixelSize(@DimenRes int id) {
        return WeatherApplication.getAppContext().getResources().getDimensionPixelSize(id);
    }
}