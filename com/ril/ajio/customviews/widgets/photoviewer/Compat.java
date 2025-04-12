/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.ril.ajio.customviews.widgets.photoviewer;

import android.view.View;

public class Compat {
    public static int getPointerIndex(int n3) {
        return Compat.getPointerIndexHoneyComb(n3);
    }

    private static int getPointerIndexEclair(int n3) {
        return (n3 & 0xFF00) >> 8;
    }

    private static int getPointerIndexHoneyComb(int n3) {
        return (n3 & 0xFF00) >> 8;
    }

    public static void postOnAnimation(View view, Runnable runnable2) {
        Compat.postOnAnimationJellyBean(view, runnable2);
    }

    private static void postOnAnimationJellyBean(View view, Runnable runnable2) {
        view.postOnAnimation(runnable2);
    }
}

