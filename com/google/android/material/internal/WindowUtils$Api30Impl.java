/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.WindowManager
 */
package com.google.android.material.internal;

import android.graphics.Rect;
import android.view.WindowManager;

class WindowUtils$Api30Impl {
    private WindowUtils$Api30Impl() {
    }

    public static Rect getCurrentWindowBounds(WindowManager windowManager) {
        return f3.a(e3.a(windowManager));
    }
}

