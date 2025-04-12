/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.view.WindowManager
 */
package com.google.android.material.internal;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowManager;

class WindowUtils$Api17Impl {
    private WindowUtils$Api17Impl() {
    }

    public static Rect getCurrentWindowBounds(WindowManager windowManager) {
        int n3;
        int n4;
        windowManager = windowManager.getDefaultDisplay();
        Point point = new Point();
        windowManager.getRealSize(point);
        windowManager = new Rect();
        windowManager.right = n4 = point.x;
        windowManager.bottom = n3 = point.y;
        return windowManager;
    }
}

