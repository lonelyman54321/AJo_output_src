/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewManager
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.getkeepsafe.taptargetview;

import android.view.View;
import android.view.ViewManager;
import android.view.ViewTreeObserver;
import com.getkeepsafe.taptargetview.ViewUtil$1;

class ViewUtil {
    private static boolean isLaidOut(View view) {
        int n3;
        int n4 = view.isLaidOut();
        if (n4 != 0 && (n4 = view.getWidth()) > 0 && (n3 = view.getHeight()) > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            view = null;
        }
        return n3 != 0;
    }

    public static void onLaidOut(View view, Runnable runnable2) {
        boolean bl2 = ViewUtil.isLaidOut(view);
        if (bl2) {
            runnable2.run();
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        ViewUtil$1 viewUtil$1 = new ViewUtil$1(viewTreeObserver, view, runnable2);
        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)viewUtil$1);
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void removeView(ViewManager viewManager, View view) {
        if (viewManager == null) return;
        if (view == null) {
            return;
        }
        try {
            viewManager.removeView(view);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

