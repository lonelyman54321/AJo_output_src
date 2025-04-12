/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.graphics.RectF
 */
package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;

final class CircularDrawingDelegate
extends DrawingDelegate {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    public CircularDrawingDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    private void drawArc(Canvas canvas, Paint paint, float f5, float f6, int n3, int n4, int n7) {
        float f7;
        float f8;
        float f11;
        CircularDrawingDelegate circularDrawingDelegate = this;
        Paint paint2 = paint;
        int n8 = 1065353216;
        float f12 = 1.0f;
        Object object = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
        float f14 = object >= 0 ? f6 - f5 : f6 + f12 - f5;
        float f15 = f5 % f12;
        float f16 = circularDrawingDelegate.totalTrackLengthFraction;
        float f17 = f16 == f12 ? 0 : (f16 < f12 ? -1 : 1);
        if (f17 < 0 && (f17 = (f11 = (f8 = f15 + f14) - f12) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) > 0) {
            CircularDrawingDelegate circularDrawingDelegate2 = this;
            Canvas canvas2 = canvas;
            Paint paint3 = paint;
            int n10 = n3;
            this.drawArc(canvas, paint, f15, 1.0f, n3, n4, 0);
            float f18 = f8;
            this.drawArc(canvas, paint, 1.0f, f8, n3, 0, n7);
            return;
        }
        f16 = circularDrawingDelegate.displayedCornerRadius;
        float f19 = circularDrawingDelegate.adjustedRadius;
        double d2 = Math.toDegrees(f16 / f19);
        float f20 = (float)d2;
        f17 = 1135869952;
        f16 = 360.0f;
        float f22 = 0.0f;
        f8 = 2.0f;
        float f23 = f15 - 0.0f;
        Object object2 = f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
        if (object2 == false) {
            object2 = 1065185444;
            f19 = 0.99f;
            float f24 = f14 - f19;
            Object object3 = f24 == 0.0f ? 0 : (f24 > 0.0f ? 1 : -1);
            if (object3 >= 0) {
                f19 = f14 - f19;
                f7 = f20 * f8 / f16 * f19;
                object2 = 1008981770;
                f19 = 0.01f;
                f14 += (f7 /= f19);
            }
        }
        f19 = circularDrawingDelegate.totalTrackLengthFraction;
        f12 = MathUtils.lerp(f12 - f19, f12, f15);
        f15 = circularDrawingDelegate.totalTrackLengthFraction;
        f14 = MathUtils.lerp(0.0f, f15, f14);
        f15 = n4;
        f19 = circularDrawingDelegate.adjustedRadius;
        double d5 = Math.toDegrees(f15 / f19);
        f15 = (float)d5;
        object2 = n7;
        f19 = n7;
        f7 = circularDrawingDelegate.adjustedRadius;
        d2 = Math.toDegrees(f19 / f7);
        f19 = (float)d2;
        f14 = f14 * f16 - f15;
        float f25 = f14 - f19;
        float f26 = (f12 *= f16) + f15;
        float f27 = f25 - 0.0f;
        n8 = (int)(f27 == 0.0f ? 0 : (f27 < 0.0f ? -1 : 1));
        if (n8 <= 0) {
            return;
        }
        paint2.setAntiAlias(true);
        n8 = n3;
        paint2.setColor(n3);
        f12 = circularDrawingDelegate.displayedTrackThickness;
        paint2.setStrokeWidth(f12);
        f12 = f20 * f8;
        object = f25 == f12 ? 0 : (f25 < f12 ? -1 : 1);
        if (object < 0) {
            f22 = f25 / f12;
            Object object4 = Paint.Style.FILL;
            paint2.setStyle(object4);
            f15 = f20 * f22 + f26;
            f12 = circularDrawingDelegate.displayedCornerRadius;
            f19 = f12 * f8;
            f7 = circularDrawingDelegate.displayedTrackThickness;
            object4 = this;
            Canvas canvas3 = canvas;
            Paint paint4 = paint;
            f20 = f22;
            this.drawRoundedBlock(canvas, paint, f15, f19, f7, f22);
        } else {
            float f28;
            f16 = circularDrawingDelegate.adjustedRadius;
            f15 = -f16;
            f19 = -f16;
            RectF rectF = new RectF(f15, f19, f16, f16);
            Paint.Style style2 = Paint.Style.STROKE;
            paint2.setStyle(style2);
            f17 = (float)circularDrawingDelegate.useStrokeCap;
            style2 = f17 != false ? Paint.Cap.ROUND : Paint.Cap.BUTT;
            paint2.setStrokeCap((Paint.Cap)style2);
            float f29 = f26 + f20;
            f15 = f25 - f12;
            object2 = false;
            f19 = 0.0f;
            Object object5 = canvas;
            f16 = f29;
            canvas.drawArc(rectF, f29, f15, false, paint);
            n8 = (int)(circularDrawingDelegate.useStrokeCap ? 1 : 0);
            if (n8 == 0 && (n8 = (int)((f28 = (f12 = circularDrawingDelegate.displayedCornerRadius) - 0.0f) == 0.0f ? 0 : (f28 > 0.0f ? 1 : -1))) > 0) {
                object5 = Paint.Style.FILL;
                paint2.setStyle((Paint.Style)object5);
                f19 = circularDrawingDelegate.displayedCornerRadius * f8;
                f7 = circularDrawingDelegate.displayedTrackThickness;
                object5 = this;
                rectF = canvas;
                style2 = paint;
                f15 = f29;
                this.drawRoundedBlock(canvas, paint, f29, f19, f7);
                f15 = (f26 += f25) - f20;
                f12 = circularDrawingDelegate.displayedCornerRadius;
                f19 = f12 * f8;
                f7 = circularDrawingDelegate.displayedTrackThickness;
                this.drawRoundedBlock(canvas, paint, f15, f19, f7);
            }
        }
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, float f5, float f6, float f7) {
        this.drawRoundedBlock(canvas, paint, f5, f6, f7, 1.0f);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, float f5, float f6, float f7, float f8) {
        float f11 = this.displayedTrackThickness;
        f7 = (int)Math.min(f7, f11);
        f11 = this.displayedCornerRadius * f7;
        float f12 = this.displayedTrackThickness;
        f11 /= f12;
        f12 = 2.0f;
        float f14 = f6 / f12;
        f11 = Math.min(f14, f11);
        float f15 = -f7 / f12;
        f6 = -f6 / f12;
        RectF rectF = new RectF(f15, f6, f7 /= f12, f14);
        canvas.save();
        double d2 = this.adjustedRadius;
        double d5 = f5;
        f6 = (float)(Math.cos(Math.toRadians(d5)) * d2);
        double d7 = this.adjustedRadius;
        f7 = (float)(Math.sin(Math.toRadians(d5)) * d7);
        canvas.translate(f6, f7);
        canvas.rotate(f5);
        canvas.scale(f8, f8);
        canvas.drawRoundRect(rectF, f11, f11, paint);
        canvas.restore();
    }

    private int getSize() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        int n3 = ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec).indicatorSize;
        return ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec).indicatorInset * 2 + n3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void adjustCanvas(Canvas object, Rect object2, float f5, boolean n3, boolean bl2) {
        void var5_17;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec;
        int n4;
        void var3_15;
        int n7;
        float f6;
        float f7;
        block8: {
            float f8;
            int n8;
            float f11;
            block13: {
                int n10;
                block12: {
                    int n14;
                    block11: {
                        block10: {
                            int n15;
                            BaseProgressIndicatorSpec baseProgressIndicatorSpec2;
                            block9: {
                                float f12;
                                BaseProgressIndicatorSpec baseProgressIndicatorSpec3;
                                void var2_5;
                                f7 = var2_5.width();
                                f11 = this.getPreferredWidth();
                                f7 /= f11;
                                n8 = var2_5.height();
                                f11 = n8;
                                float f14 = this.getPreferredHeight();
                                f11 /= f14;
                                BaseProgressIndicatorSpec baseProgressIndicatorSpec4 = baseProgressIndicatorSpec2 = this.spec;
                                baseProgressIndicatorSpec4 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec2;
                                n14 = ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec4).indicatorSize;
                                float f15 = n14;
                                f8 = 2.0f;
                                f15 /= f8;
                                baseProgressIndicatorSpec2 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec2;
                                n15 = ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec2).indicatorInset;
                                f14 = n15;
                                f15 += f14;
                                f14 = f15 * f7;
                                float f16 = f15 * f11;
                                int n16 = var2_5.left;
                                float f17 = n16;
                                f6 = var2_5.top;
                                object.translate(f14 += f17, f16 += f6);
                                f6 = -90.0f;
                                object.rotate(f6);
                                object.scale(f7, f11);
                                CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec)this.spec;
                                n7 = circularProgressIndicatorSpec.indicatorDirection;
                                f7 = 1.0f;
                                if (n7 != 0) {
                                    n7 = -1082130432;
                                    f6 = -1.0f;
                                    object.scale(f7, f6);
                                }
                                f6 = -f15;
                                object.clipRect(f6, f6, f15, f15);
                                BaseProgressIndicatorSpec baseProgressIndicatorSpec5 = baseProgressIndicatorSpec3 = this.spec;
                                CircularProgressIndicatorSpec circularProgressIndicatorSpec2 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec3;
                                n7 = circularProgressIndicatorSpec2.trackThickness;
                                n8 = 2;
                                f11 = 2.8E-45f;
                                n7 /= n8;
                                baseProgressIndicatorSpec2 = baseProgressIndicatorSpec3;
                                baseProgressIndicatorSpec2 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec3;
                                n15 = baseProgressIndicatorSpec2.trackCornerRadius;
                                n14 = 1;
                                f15 = Float.MIN_VALUE;
                                if (n7 <= n15) {
                                    n7 = 1;
                                    f6 = Float.MIN_VALUE;
                                } else {
                                    n7 = 0;
                                    f6 = 0.0f;
                                    Object var2_9 = null;
                                }
                                this.useStrokeCap = n7;
                                BaseProgressIndicatorSpec baseProgressIndicatorSpec6 = baseProgressIndicatorSpec3;
                                this.displayedTrackThickness = f6 = (float)((CircularProgressIndicatorSpec)baseProgressIndicatorSpec3).trackThickness * var3_15;
                                BaseProgressIndicatorSpec baseProgressIndicatorSpec7 = baseProgressIndicatorSpec3;
                                n7 = ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec3).trackThickness / n8;
                                n4 = ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec3).trackCornerRadius;
                                n4 = Math.min(n7, n4);
                                this.displayedCornerRadius = f12 = (float)n4 * var3_15;
                                BaseProgressIndicatorSpec baseProgressIndicatorSpec8 = baseProgressIndicatorSpec = this.spec;
                                CircularProgressIndicatorSpec circularProgressIndicatorSpec3 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
                                n7 = circularProgressIndicatorSpec3.indicatorSize;
                                baseProgressIndicatorSpec2 = baseProgressIndicatorSpec;
                                baseProgressIndicatorSpec2 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
                                n15 = baseProgressIndicatorSpec2.trackThickness;
                                this.adjustedRadius = f6 = (float)(n7 -= n15) / f8;
                                if (n10 == 0 && var5_17 == false) break block8;
                                if (n10 == false) break block9;
                                baseProgressIndicatorSpec2 = baseProgressIndicatorSpec;
                                baseProgressIndicatorSpec2 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
                                n15 = baseProgressIndicatorSpec2.showAnimationBehavior;
                                if (n15 == n8) break block10;
                            }
                            if (var5_17 == false) break block11;
                            baseProgressIndicatorSpec2 = baseProgressIndicatorSpec;
                            baseProgressIndicatorSpec2 = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
                            n15 = baseProgressIndicatorSpec2.hideAnimationBehavior;
                            if (n15 != n14) break block11;
                        }
                        float f18 = f7 - var3_15;
                        BaseProgressIndicatorSpec baseProgressIndicatorSpec9 = baseProgressIndicatorSpec;
                        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
                        n8 = circularProgressIndicatorSpec.trackThickness;
                        f11 = n8;
                        this.adjustedRadius = f18 = f18 * f11 / f8 + f6;
                        break block8;
                    }
                    if (n10 == false) break block12;
                    BaseProgressIndicatorSpec baseProgressIndicatorSpec10 = baseProgressIndicatorSpec;
                    CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
                    n10 = circularProgressIndicatorSpec.showAnimationBehavior;
                    if (n10 == n14) break block13;
                }
                if (var5_17 == false) break block8;
                BaseProgressIndicatorSpec baseProgressIndicatorSpec11 = baseProgressIndicatorSpec;
                CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
                n10 = circularProgressIndicatorSpec.hideAnimationBehavior;
                if (n10 != n8) break block8;
            }
            float f19 = f7 - var3_15;
            BaseProgressIndicatorSpec baseProgressIndicatorSpec12 = baseProgressIndicatorSpec;
            CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
            n8 = circularProgressIndicatorSpec.trackThickness;
            f11 = n8;
            f19 = f19 * f11 / f8;
            this.adjustedRadius = f6 -= f19;
        }
        if (var5_17 != false) {
            CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec)baseProgressIndicatorSpec;
            n4 = circularProgressIndicatorSpec.hideAnimationBehavior;
            n7 = 3;
            f6 = 4.2E-45f;
            if (n4 == n7) {
                this.totalTrackLengthFraction = var3_15;
                return;
            }
        }
        this.totalTrackLengthFraction = f7;
    }

    public void drawStopIndicator(Canvas canvas, Paint paint, int n3, int n4) {
    }

    public void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator, int n3) {
        int n4 = MaterialColors.compositeARGBWithAlpha(drawingDelegate$ActiveIndicator.color, n3);
        float f5 = drawingDelegate$ActiveIndicator.startFraction;
        float f6 = drawingDelegate$ActiveIndicator.endFraction;
        int n7 = drawingDelegate$ActiveIndicator.gapSize;
        this.drawArc(canvas, paint, f5, f6, n4, n7, n7);
    }

    public void fillTrack(Canvas canvas, Paint paint, float f5, float f6, int n3, int n4, int n7) {
        int n8 = MaterialColors.compositeARGBWithAlpha(n3, n4);
        this.drawArc(canvas, paint, f5, f6, n8, n7, n7);
    }

    public int getPreferredHeight() {
        return this.getSize();
    }

    public int getPreferredWidth() {
        return this.getSize();
    }
}

