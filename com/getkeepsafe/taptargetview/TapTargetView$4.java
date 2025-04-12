/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 */
package com.getkeepsafe.taptargetview;

import android.graphics.Rect;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$UpdateListener;
import com.getkeepsafe.taptargetview.TapTargetView;

class TapTargetView$4
implements FloatValueAnimatorBuilder$UpdateListener {
    final /* synthetic */ TapTargetView this$0;

    public TapTargetView$4(TapTargetView tapTargetView) {
        this.this$0 = tapTargetView;
    }

    public void onUpdate(float f5) {
        int n3;
        TapTargetView tapTargetView = this.this$0;
        float f6 = tapTargetView.delayedLerp(f5, 0.5f);
        TapTargetView tapTargetView2 = this.this$0;
        float f7 = 1.0f;
        float f8 = f6 + f7;
        int n4 = tapTargetView2.TARGET_RADIUS;
        float f11 = n4;
        tapTargetView2.targetCirclePulseRadius = f8 *= f11;
        f7 = (f7 - f6) * 255.0f;
        tapTargetView2.targetCirclePulseAlpha = n3 = (int)f7;
        f6 = n4;
        f5 = tapTargetView2.halfwayLerp(f5);
        TapTargetView tapTargetView3 = this.this$0;
        int n7 = tapTargetView3.TARGET_PULSE_RADIUS;
        f8 = n7;
        tapTargetView2.targetCircleRadius = f5 = f5 * f8 + f6;
        f5 = tapTargetView3.outerCircleRadius;
        n3 = tapTargetView3.calculatedOuterCircleRadius;
        float f12 = n3;
        float f14 = f5 - f12;
        Object object = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (object != false) {
            tapTargetView3.outerCircleRadius = f5 = (float)n3;
        }
        tapTargetView3.calculateDrawingBounds();
        TapTargetView tapTargetView4 = this.this$0;
        tapTargetView = tapTargetView4.drawingBounds;
        tapTargetView4.invalidateViewAndOutline((Rect)tapTargetView);
    }
}

