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

class TapTargetView$8
implements FloatValueAnimatorBuilder$UpdateListener {
    final /* synthetic */ TapTargetView this$0;

    public TapTargetView$8(TapTargetView tapTargetView) {
        this.this$0 = tapTargetView;
    }

    public void onUpdate(float f5) {
        int n3;
        int n4;
        int n7;
        float f6;
        float f7 = 2.0f * f5;
        float f8 = 1.0f;
        f7 = Math.min(f8, f7);
        TapTargetView tapTargetView = this.this$0;
        float f11 = tapTargetView.calculatedOuterCircleRadius;
        tapTargetView.outerCircleRadius = f6 = (0.2f * f7 + f8) * f11;
        f7 = f8 - f7;
        f11 = tapTargetView.target.outerCircleAlpha * f7;
        f6 = 255.0f;
        tapTargetView.outerCircleAlpha = n7 = (int)(f11 * f6);
        tapTargetView.outerCirclePath.reset();
        tapTargetView = this.this$0;
        Path path = tapTargetView.outerCirclePath;
        int[] nArray = tapTargetView.outerCircleCenter;
        float f12 = nArray[0];
        float f14 = nArray[1];
        float f15 = tapTargetView.outerCircleRadius;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(f12, f14, f15, direction);
        tapTargetView = this.this$0;
        f11 = f8 - f5;
        int n8 = tapTargetView.TARGET_RADIUS;
        tapTargetView.targetCircleRadius = f12 = (float)n8 * f11;
        tapTargetView.targetCircleAlpha = n4 = (int)(f11 * f6);
        f5 += f8;
        f8 = n8;
        tapTargetView.targetCirclePulseRadius = f5 *= f8;
        f5 = tapTargetView.targetCirclePulseAlpha;
        tapTargetView.targetCirclePulseAlpha = n3 = (int)(f11 * f5);
        tapTargetView.textAlpha = n3 = (int)(f7 * f6);
        tapTargetView.calculateDrawingBounds();
        TapTargetView tapTargetView2 = this.this$0;
        Rect rect = tapTargetView2.drawingBounds;
        tapTargetView2.invalidateViewAndOutline(rect);
    }
}

