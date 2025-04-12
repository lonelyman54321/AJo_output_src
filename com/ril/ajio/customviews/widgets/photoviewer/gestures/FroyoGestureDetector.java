/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 */
package com.ril.ajio.customviews.widgets.photoviewer.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.EclairGestureDetector;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.FroyoGestureDetector$1;

public class FroyoGestureDetector
extends EclairGestureDetector {
    private final ScaleGestureDetector mDetector;

    public FroyoGestureDetector(Context context) {
        super(context);
        ScaleGestureDetector scaleGestureDetector;
        FroyoGestureDetector$1 froyoGestureDetector$1 = new FroyoGestureDetector$1(this);
        this.mDetector = scaleGestureDetector = new ScaleGestureDetector(context, (ScaleGestureDetector.OnScaleGestureListener)froyoGestureDetector$1);
    }

    public boolean isScaling() {
        return this.mDetector.isInProgress();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mDetector.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}

