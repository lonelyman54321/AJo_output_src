/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 */
package com.ril.ajio.customviews.widgets.photoviewer.gestures;

import android.view.MotionEvent;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.OnGestureListener;

public interface GestureDetector {
    public boolean isDragging();

    public boolean isScaling();

    public boolean onTouchEvent(MotionEvent var1);

    public void setOnGestureListener(OnGestureListener var1);
}

