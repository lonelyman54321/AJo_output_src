/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Rect
 */
package com.getkeepsafe.taptargetview;

import android.graphics.Path;
import android.graphics.Rect;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$UpdateListener;
import com.getkeepsafe.taptargetview.TapTargetView;

class TapTargetView$1
implements FloatValueAnimatorBuilder$UpdateListener {
    final /* synthetic */ TapTargetView this$0;

    public TapTargetView$1(TapTargetView tapTargetView) {
        this.this$0 = tapTargetView;
    }

    public void onUpdate(float f5) {
        TapTargetView tapTargetView;
        int n3;
        int n4;
        TapTargetView tapTargetView2 = this.this$0;
        int n7 = tapTargetView2.calculatedOuterCircleRadius;
        float f6 = (float)n7 * f5;
        float f7 = tapTargetView2.outerCircleRadius;
        int n8 = 0;
        float f8 = 0.0f;
        int n10 = 1;
        float f11 = Float.MIN_VALUE;
        Object object = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
        if (object > 0) {
            object = true;
            f7 = Float.MIN_VALUE;
        } else {
            object = false;
            f7 = 0.0f;
        }
        if (object == false) {
            tapTargetView2.calculateDrawingBounds();
        }
        tapTargetView2 = this.this$0;
        float f12 = tapTargetView2.target.outerCircleAlpha;
        float f14 = 255.0f;
        tapTargetView2.outerCircleRadius = f6;
        n7 = 1069547520;
        f6 = 1.5f * f5;
        float f15 = f6 * (f12 *= f14);
        f12 = Math.min(f12, f15);
        tapTargetView2.outerCircleAlpha = n4 = (int)f12;
        this.this$0.outerCirclePath.reset();
        tapTargetView2 = this.this$0;
        Path path = tapTargetView2.outerCirclePath;
        Object object2 = tapTargetView2.outerCircleCenter;
        f8 = object2[0];
        n10 = object2[n10];
        f11 = n10;
        float f16 = tapTargetView2.outerCircleRadius;
        object2 = Path.Direction.CW;
        path.addCircle(f8, f11, f16, (Path.Direction)object2);
        tapTargetView2 = this.this$0;
        f8 = f6 * f14;
        f8 = Math.min(f14, f8);
        tapTargetView2.targetCircleAlpha = n8 = (int)f8;
        if (object != false) {
            tapTargetView2 = this.this$0;
            n8 = tapTargetView2.TARGET_RADIUS;
            f8 = n8;
            n10 = 1065353216;
            f11 = 1.0f;
            tapTargetView2.targetCircleRadius = f6 = Math.min(f11, f6) * f8;
        } else {
            tapTargetView2 = this.this$0;
            n7 = tapTargetView2.TARGET_RADIUS;
            tapTargetView2.targetCircleRadius = f6 = (float)n7 * f5;
            tapTargetView2.targetCirclePulseRadius = f6 = tapTargetView2.targetCirclePulseRadius * f5;
        }
        tapTargetView2 = this.this$0;
        n7 = 0x3F333333;
        f6 = 0.7f;
        f5 = tapTargetView2.delayedLerp(f5, f6) * f14;
        tapTargetView2.textAlpha = n3 = (int)f5;
        if (object != false) {
            tapTargetView = this.this$0;
            tapTargetView.calculateDrawingBounds();
        }
        tapTargetView = this.this$0;
        tapTargetView2 = tapTargetView.drawingBounds;
        tapTargetView.invalidateViewAndOutline((Rect)tapTargetView2);
    }
}

