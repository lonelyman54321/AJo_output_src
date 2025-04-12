/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;
import com.google.android.material.timepicker.ClockFaceView;

class ClockFaceView$1
implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ClockFaceView this$0;

    public ClockFaceView$1(ClockFaceView clockFaceView) {
        this.this$0 = clockFaceView;
    }

    public boolean onPreDraw() {
        ClockFaceView clockFaceView = this.this$0;
        int n3 = clockFaceView.isShown();
        boolean bl2 = true;
        if (n3 == 0) {
            return bl2;
        }
        this.this$0.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        n3 = this.this$0.getHeight() / 2;
        int n4 = ClockFaceView.access$000(this.this$0).getSelectorRadius();
        n3 -= n4;
        n4 = ClockFaceView.access$100(this.this$0);
        this.this$0.setRadius(n3 -= n4);
        return bl2;
    }
}

