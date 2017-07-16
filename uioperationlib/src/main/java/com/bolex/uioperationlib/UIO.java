package com.bolex.uioperationlib;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by Bolex on 2017/7/16.
 */

public class UIO {

    private static Handler mMainHandler;



    public static void ToUIThread(Runnable UIRunnable) {
        mainHandlerInit();
        mMainHandler.post(UIRunnable);
    }

    private static void mainHandlerInit() {
        if (mMainHandler == null) {
            synchronized (UIO.class) {
                if (mMainHandler == null) {
                    mMainHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
    }

}
