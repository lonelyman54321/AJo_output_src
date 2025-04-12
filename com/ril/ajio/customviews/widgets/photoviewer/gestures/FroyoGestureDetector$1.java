/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ScaleGestureDetector
 *  android.view.ScaleGestureDetector$OnScaleGestureListener
 */
package com.ril.ajio.customviews.widgets.photoviewer.gestures;

import android.view.ScaleGestureDetector;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.FroyoGestureDetector;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.OnGestureListener;

class FroyoGestureDetector$1
implements ScaleGestureDetector.OnScaleGestureListener {
    final /* synthetic */ FroyoGestureDetector this$0;

    public FroyoGestureDetector$1(FroyoGestureDetector froyoGestureDetector) {
        this.this$0 = froyoGestureDetector;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float f5 = scaleGestureDetector.getScaleFactor();
        boolean bl2 = Float.isNaN(f5);
        if (!bl2 && !(bl2 = Float.isInfinite(f5))) {
            OnGestureListener onGestureListener = this.this$0.mListener;
            float f6 = scaleGestureDetector.getFocusX();
            float f7 = scaleGestureDetector.getFocusY();
            onGestureListener.onScale(f5, f6, f7);
            return true;
        }
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}

