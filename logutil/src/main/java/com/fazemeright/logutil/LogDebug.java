package com.fazemeright.logutil;

import android.util.Log;

public class LogDebug {

    public static String TAG = "##DebugInfo-->";

    public static void d(String msg){
        Log.d(TAG, msg);
    }

    public static void e(String msg){
        Log.e(TAG, msg);
    }

    public static void i(String msg){
        Log.i(TAG, msg);
    }
}
