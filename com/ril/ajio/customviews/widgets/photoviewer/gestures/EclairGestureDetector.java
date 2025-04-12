/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 */
package com.ril.ajio.customviews.widgets.photoviewer.gestures;

import android.content.Context;
import android.view.MotionEvent;
import com.ril.ajio.customviews.widgets.photoviewer.Compat;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.CupcakeGestureDetector;

public class EclairGestureDetector
extends CupcakeGestureDetector {
    private static final int INVALID_POINTER_ID = 255;
    private int mActivePointerId = -1;
    private int mActivePointerIndex = 0;

    public EclairGestureDetector(Context context) {
        super(context);
    }

    public float getActiveX(MotionEvent motionEvent) {
        int n3;
        try {
            n3 = this.mActivePointerIndex;
        }
        catch (Exception exception) {
            yn3_0.a(exception);
            return motionEvent.getX();
        }
        return motionEvent.getX(n3);
    }

    public float getActiveY(MotionEvent motionEvent) {
        int n3;
        try {
            n3 = this.mActivePointerIndex;
        }
        catch (Exception exception) {
            yn3_0.a(exception);
            return motionEvent.getY();
        }
        return motionEvent.getY(n3);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n3 = motionEvent.getAction() & 0xFF;
        int n4 = -1;
        int n7 = 0;
        if (n3 != 0) {
            int n8;
            int n10 = 1;
            if (n3 != n10 && n3 != (n8 = 3)) {
                int n14;
                n8 = 6;
                if (n3 == n8 && (n8 = motionEvent.getPointerId(n3 = Compat.getPointerIndex(motionEvent.getAction()))) == (n14 = this.mActivePointerId)) {
                    float f5;
                    if (n3 != 0) {
                        n10 = 0;
                    }
                    this.mActivePointerId = n3 = motionEvent.getPointerId(n10);
                    this.mLastTouchX = f5 = motionEvent.getX(n10);
                    this.mLastTouchY = f5 = motionEvent.getY(n10);
                }
            } else {
                this.mActivePointerId = n4;
            }
        } else {
            this.mActivePointerId = n3 = motionEvent.getPointerId(0);
        }
        if ((n3 = this.mActivePointerId) != n4) {
            n7 = n3;
        }
        this.mActivePointerIndex = n3 = motionEvent.findPointerIndex(n7);
        return super.onTouchEvent(motionEvent);
    }
}

