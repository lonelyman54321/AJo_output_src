/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.customviews.widgets.photoviewer.gestures;

import android.content.Context;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.FroyoGestureDetector;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.GestureDetector;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.OnGestureListener;

public final class VersionedGestureDetector {
    public static GestureDetector newInstance(Context context, OnGestureListener onGestureListener) {
        FroyoGestureDetector froyoGestureDetector = new FroyoGestureDetector(context);
        froyoGestureDetector.setOnGestureListener(onGestureListener);
        return froyoGestureDetector;
    }
}

