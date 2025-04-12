/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.graphics.RectF
 */
package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

final class LinearDrawingDelegate
extends DrawingDelegate {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private float trackLength = 300.0f;
    private boolean useStrokeCap;

    public LinearDrawingDelegate(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
    }

    private void drawLine(Canvas canvas, Paint paint, float f5, float f6, int n3, int n4, int n7) {
        LinearDrawingDelegate linearDrawingDelegate = this;
        Paint paint2 = paint;
        float f7 = 0.0f;
        float f8 = 1.0f;
        float f11 = f5;
        f11 = PK1.a(f5, 0.0f, f8);
        float f12 = f6;
        f12 = PK1.a(f6, 0.0f, f8);
        float f14 = this.totalTrackLengthFraction;
        f11 = MathUtils.lerp(f8 - f14, f8, f11);
        f14 = this.totalTrackLengthFraction;
        f12 = MathUtils.lerp(f8 - f14, f8, f12);
        int n8 = n4;
        f14 = n4;
        float f15 = 0.01f;
        n8 = (int)(PK1.a(f11, 0.0f, f15) * f14 / f15);
        float f16 = n7;
        float f17 = PK1.a(f12, 0.99f, f8);
        int n10 = (int)((f8 - f17) * f16 / f15);
        f15 = this.trackLength;
        f11 *= f15;
        f14 = n8;
        int n14 = (int)(f11 += f14);
        f8 = n10;
        n10 = (int)((f12 *= f15) - f8);
        f12 = -f15;
        n8 = 0x40000000;
        f14 = 2.0f;
        f12 /= f14;
        if (n14 <= n10) {
            f11 = n14;
            f15 = this.displayedCornerRadius;
            f17 = f11 + f15;
            float f18 = (float)n10 - f15;
            float f19 = f15 * f14;
            n10 = n3;
            paint.setColor(n3);
            paint.setAntiAlias(true);
            f8 = this.displayedTrackThickness;
            paint.setStrokeWidth(f8);
            n10 = (int)(f17 == f18 ? 0 : (f17 > f18 ? 1 : -1));
            if (n10 >= 0) {
                PointF pointF = new PointF(f17 += f12, 0.0f);
                PointF pointF2 = new PointF(f18 += f12, 0.0f);
                f7 = this.displayedTrackThickness;
                LinearDrawingDelegate linearDrawingDelegate2 = this;
                f16 = f19;
                this.drawRoundedBlock(canvas, paint, pointF, pointF2, f19, f7);
            } else {
                float f20;
                Object object = Paint.Style.STROKE;
                paint.setStyle(object);
                n10 = (int)(this.useStrokeCap ? 1 : 0);
                object = n10 != 0 ? Paint.Cap.ROUND : Paint.Cap.BUTT;
                paint2.setStrokeCap((Paint.Cap)object);
                float f22 = f17 + f12;
                float f23 = f18 + f12;
                f15 = 0.0f;
                Object var24_26 = null;
                f12 = 0.0f;
                object = canvas;
                f11 = f22;
                f14 = f23;
                canvas.drawLine(f22, 0.0f, f23, 0.0f, paint);
                n10 = (int)(linearDrawingDelegate.useStrokeCap ? 1 : 0);
                if (n10 == 0 && (n10 = (int)((f20 = (f8 = linearDrawingDelegate.displayedCornerRadius) - 0.0f) == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1))) > 0) {
                    float f24;
                    PointF pointF;
                    object = Paint.Style.FILL;
                    paint2.setStyle(object);
                    float f25 = f17 - 0.0f;
                    n10 = (int)(f25 == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1));
                    if (n10 > 0) {
                        pointF = new PointF(f22, 0.0f);
                        f16 = linearDrawingDelegate.displayedTrackThickness;
                        object = this;
                        f15 = f19;
                        this.drawRoundedBlock(canvas, paint, pointF, f19, f16);
                    }
                    if ((n10 = (int)((f24 = f18 - (f8 = linearDrawingDelegate.trackLength)) == 0.0f ? 0 : (f24 < 0.0f ? -1 : 1))) < 0) {
                        pointF = new PointF(f23, 0.0f);
                        f16 = linearDrawingDelegate.displayedTrackThickness;
                        object = this;
                        f15 = f19;
                        this.drawRoundedBlock(canvas, paint, pointF, f19, f16);
                    }
                }
            }
        }
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, PointF pointF, float f5, float f6) {
        this.drawRoundedBlock(canvas, paint, pointF, null, f5, f6);
    }

    private void drawRoundedBlock(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f5, float f6) {
        float f7;
        float f8 = this.displayedTrackThickness;
        f6 = Math.min(f6, f8);
        f8 = this.displayedCornerRadius * f6;
        float f11 = this.displayedTrackThickness;
        f8 /= f11;
        f11 = 2.0f;
        float f12 = f5 / f11;
        f8 = Math.min(f12, f8);
        f5 = -f5 / f11;
        float f14 = -f6 / f11;
        RectF rectF = new RectF(f5, f14, f12, f6 /= f11);
        Paint.Style style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        canvas.save();
        if (pointF2 != null) {
            f5 = pointF2.x;
            f6 = pointF2.y;
            canvas.translate(f5, f6);
            style2 = new Path();
            Path.Direction direction = Path.Direction.CCW;
            style2.addRoundRect(rectF, f8, f8, direction);
            canvas.clipPath((Path)style2);
            f5 = -pointF2.x;
            f7 = -pointF2.y;
            canvas.translate(f5, f7);
        }
        f7 = pointF.x;
        float f15 = pointF.y;
        canvas.translate(f7, f15);
        canvas.drawRoundRect(rectF, f8, f8, paint);
        canvas.restore();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void adjustCanvas(Canvas object, Rect object2, float f5, boolean n3, boolean bl2) {
        void var5_9;
        void var3_7;
        int n4;
        float f6;
        block11: {
            LinearProgressIndicatorSpec linearProgressIndicatorSpec;
            int n7;
            float f7;
            float f8;
            block15: {
                block14: {
                    float f11;
                    block13: {
                        int n8;
                        int n10;
                        BaseProgressIndicatorSpec baseProgressIndicatorSpec;
                        block12: {
                            void var2_3;
                            this.trackLength = f8 = (float)var2_3.width();
                            baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
                            n10 = baseProgressIndicatorSpec.trackThickness;
                            f8 = n10;
                            float f12 = var2_3.left;
                            f11 = var2_3.width();
                            f7 = 2.0f;
                            f11 = f11 / f7 + f12;
                            f12 = var2_3.top;
                            f6 = (float)var2_3.height() / f7 + f12;
                            float f14 = ((float)var2_3.height() - f8) / f7;
                            f12 = 0.0f;
                            f14 = Math.max(0.0f, f14) + f6;
                            object.translate(f11, f14);
                            LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec)this.spec;
                            n4 = linearProgressIndicatorSpec2.drawHorizontallyInverse;
                            f11 = -1.0f;
                            f6 = 1.0f;
                            if (n4 != 0) {
                                object.scale(f11, f6);
                            }
                            f14 = this.trackLength / f7;
                            float f15 = -f14;
                            float f16 = -(f8 /= f7);
                            object.clipRect(f15, f16, f14, f8);
                            BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = this.spec;
                            baseProgressIndicatorSpec = baseProgressIndicatorSpec2;
                            baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec2;
                            n10 = baseProgressIndicatorSpec.trackThickness;
                            int n14 = 2;
                            f15 = 2.8E-45f;
                            BaseProgressIndicatorSpec baseProgressIndicatorSpec3 = baseProgressIndicatorSpec2;
                            LinearProgressIndicatorSpec linearProgressIndicatorSpec3 = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec2;
                            int n15 = linearProgressIndicatorSpec3.trackCornerRadius;
                            n8 = 1;
                            if ((n10 /= n14) == n15) {
                                n10 = 1;
                                f8 = Float.MIN_VALUE;
                            } else {
                                n10 = 0;
                                f8 = 0.0f;
                                baseProgressIndicatorSpec = null;
                            }
                            this.useStrokeCap = n10;
                            baseProgressIndicatorSpec = baseProgressIndicatorSpec2;
                            this.displayedTrackThickness = f8 = (float)((LinearProgressIndicatorSpec)baseProgressIndicatorSpec2).trackThickness * var3_7;
                            baseProgressIndicatorSpec = baseProgressIndicatorSpec2;
                            baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec2;
                            n10 = baseProgressIndicatorSpec.trackThickness / n14;
                            LinearProgressIndicatorSpec linearProgressIndicatorSpec4 = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec2;
                            n4 = linearProgressIndicatorSpec4.trackCornerRadius;
                            this.displayedCornerRadius = f14 = (float)Math.min(n10, n4) * var3_7;
                            n4 = 3;
                            f14 = 4.2E-45f;
                            if (n7 == 0 && var5_9 == false) break block11;
                            if (n7 == false) break block12;
                            baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
                            n10 = baseProgressIndicatorSpec.showAnimationBehavior;
                            if (n10 == n14) break block13;
                        }
                        if (var5_9 == false) break block14;
                        baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
                        n10 = baseProgressIndicatorSpec.hideAnimationBehavior;
                        if (n10 != n8) break block14;
                    }
                    object.scale(f6, f11);
                }
                if (n7 != false) break block15;
                if (var5_9 == false) break block11;
                linearProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
                n7 = linearProgressIndicatorSpec.hideAnimationBehavior;
                if (n7 == n4) break block11;
            }
            linearProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
            n7 = linearProgressIndicatorSpec.trackThickness;
            float f17 = n7;
            f8 = (f6 - var3_7) * f17 / f7;
            object.translate(0.0f, f8);
        }
        if (var5_9 != false) {
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
            int n16 = linearProgressIndicatorSpec.hideAnimationBehavior;
            if (n16 == n4) {
                this.totalTrackLengthFraction = var3_7;
                return;
            }
        }
        this.totalTrackLengthFraction = f6;
    }

    public void drawStopIndicator(Canvas canvas, Paint paint, int n3, int n4) {
        n3 = MaterialColors.compositeARGBWithAlpha(n3, n4);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)this.spec;
        n4 = baseProgressIndicatorSpec.trackStopIndicatorSize;
        if (n4 > 0 && n3 != 0) {
            baseProgressIndicatorSpec = Paint.Style.FILL;
            paint.setStyle((Paint.Style)baseProgressIndicatorSpec);
            paint.setColor(n3);
            float f5 = this.trackLength;
            float f6 = 2.0f;
            f5 /= f6;
            float f7 = this.displayedTrackThickness / f6;
            f6 = 0.0f;
            PointF pointF = new PointF(f5 -= f7, 0.0f);
            BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = this.spec;
            baseProgressIndicatorSpec = baseProgressIndicatorSpec2;
            baseProgressIndicatorSpec = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec2;
            n4 = baseProgressIndicatorSpec.trackStopIndicatorSize;
            float f8 = n4;
            baseProgressIndicatorSpec2 = (LinearProgressIndicatorSpec)baseProgressIndicatorSpec2;
            n3 = ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec2).trackStopIndicatorSize;
            float f11 = n3;
            this.drawRoundedBlock(canvas, paint, pointF, f8, f11);
        }
    }

    public void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator, int n3) {
        int n4 = MaterialColors.compositeARGBWithAlpha(drawingDelegate$ActiveIndicator.color, n3);
        float f5 = drawingDelegate$ActiveIndicator.startFraction;
        float f6 = drawingDelegate$ActiveIndicator.endFraction;
        int n7 = drawingDelegate$ActiveIndicator.gapSize;
        this.drawLine(canvas, paint, f5, f6, n4, n7, n7);
    }

    public void fillTrack(Canvas canvas, Paint paint, float f5, float f6, int n3, int n4, int n7) {
        int n8 = MaterialColors.compositeARGBWithAlpha(n3, n4);
        this.drawLine(canvas, paint, f5, f6, n8, n7, n7);
    }

    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec)this.spec).trackThickness;
    }

    public int getPreferredWidth() {
        return -1;
    }
}

