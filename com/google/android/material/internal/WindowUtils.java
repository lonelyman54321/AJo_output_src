/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.WindowManager
 */
package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import com.google.android.material.internal.WindowUtils$Api17Impl;
import com.google.android.material.internal.WindowUtils$Api30Impl;

public class WindowUtils {
    private static final String TAG = "WindowUtils";

    private WindowUtils() {
    }

    public static /* synthetic */ String access$000() {
        return TAG;
    }

    public static Rect getCurrentWindowBounds(Context context) {
        String string2 = "window";
        context = (WindowManager)context.getSystemService(string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            return WindowUtils$Api30Impl.getCurrentWindowBounds((WindowManager)context);
        }
        return WindowUtils$Api17Impl.getCurrentWindowBounds((WindowManager)context);
    }
}

