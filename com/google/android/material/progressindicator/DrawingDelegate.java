/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Rect
 */
package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;

abstract class DrawingDelegate {
    BaseProgressIndicatorSpec spec;

    public DrawingDelegate(BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.spec = baseProgressIndicatorSpec;
    }

    public abstract void adjustCanvas(Canvas var1, Rect var2, float var3, boolean var4, boolean var5);

    public abstract void drawStopIndicator(Canvas var1, Paint var2, int var3, int var4);

    public abstract void fillIndicator(Canvas var1, Paint var2, DrawingDelegate$ActiveIndicator var3, int var4);

    public abstract void fillTrack(Canvas var1, Paint var2, float var3, float var4, int var5, int var6, int var7);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void validateSpecAndAdjustCanvas(Canvas canvas, Rect rect, float f5, boolean bl2, boolean bl3) {
        this.spec.validateSpec();
        this.adjustCanvas(canvas, rect, f5, bl2, bl3);
    }
}

