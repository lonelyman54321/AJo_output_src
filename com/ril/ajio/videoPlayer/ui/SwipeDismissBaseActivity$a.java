/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 */
package com.ril.ajio.videoPlayer.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.ril.ajio.videoPlayer.ui.SwipeDismissBaseActivity;

public final class SwipeDismissBaseActivity$a
extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ SwipeDismissBaseActivity a;

    public SwipeDismissBaseActivity$a(SwipeDismissBaseActivity swipeDismissBaseActivity) {
        this.a = swipeDismissBaseActivity;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        float f7;
        f6 = motionEvent.getX();
        float f8 = motionEvent2.getX();
        float f11 = (f6 = Math.abs(f6 - f8)) - (f8 = 250.0f);
        Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object > 0) {
            return false;
        }
        float f12 = motionEvent2.getY();
        float f14 = motionEvent.getY();
        float f15 = (f12 -= f14) - (f14 = 120.0f);
        Object object2 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (object2 > 0 && (object2 = (f7 = (f14 = Math.abs(f5)) - (f12 = 200.0f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0) {
            this.a.finish();
            return true;
        }
        return false;
    }
}

