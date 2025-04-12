/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.DashPathEffect
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PathEffect
 *  android.graphics.Rect
 */
package androidx.constraintlayout.motion.widget;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import androidx.constraintlayout.motion.widget.MotionLayout;

public final class MotionLayout$b {
    public float[] a;
    public final int[] b;
    public final float[] c;
    public Path d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final float[] j;
    public int k;
    public final Rect l;
    public final int m;
    public final /* synthetic */ MotionLayout n;

    public MotionLayout$b(MotionLayout object) {
        Paint paint;
        Paint paint2;
        Object object2;
        this.n = object;
        this.l = object2 = new Rect();
        boolean bl2 = true;
        this.m = bl2;
        this.e = paint2 = new Paint();
        paint2.setAntiAlias(bl2);
        paint2.setColor(-21965);
        float f5 = 2.0f;
        paint2.setStrokeWidth(f5);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.f = paint2 = new Paint();
        paint2.setAntiAlias(bl2);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(f5);
        paint2.setStyle(style2);
        this.g = paint2 = new Paint();
        paint2.setAntiAlias(bl2);
        int n3 = -13391360;
        paint2.setColor(n3);
        paint2.setStrokeWidth(f5);
        paint2.setStyle(style2);
        this.h = paint = new Paint();
        paint.setAntiAlias(bl2);
        paint.setColor(n3);
        float f6 = object.getContext().getResources().getDisplayMetrics().density * 12.0f;
        paint.setTextSize(f6);
        object = new float[8];
        this.j = (float[])object;
        object = new Paint();
        this.i = object;
        object.setAntiAlias(bl2);
        Object object3 = object2 = (Object)new float[2];
        object3[0] = (Rect)4.0f;
        object3[1] = (Rect)8.0f;
        object = new DashPathEffect((float[])object2, 0.0f);
        paint2.setPathEffect((PathEffect)object);
        object = new float[100];
        this.c = (float[])object;
        object = new int[50];
        this.b = (int[])object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Canvas var1_1, int var2_2, int var3_3, fQ1 var4_4) {
        var5_5 = this;
        var6_6 = var1_1;
        var7_7 = var2_2;
        var8_8 = var4_4;
        var9_9 = this.b;
        var10_10 = 2;
        var11_11 = 1;
        var12_12 = 4;
        if (var2_2 == var12_12) {
            var14_14 = 0.0f;
            var15_15 /* !! */  = null;
            var16_16 = 0;
            var17_17 = 0.0f;
            var18_18 /* !! */  = null;
            var19_19 = 0;
            for (var13_13 = 0; var13_13 < (var20_20 = var5_5.k); ++var13_13) {
                var20_20 = var9_9[var13_13];
                if (var20_20 == var11_11) {
                    var16_16 = 1;
                    var17_17 = 1.4E-45f;
                }
                if (var20_20 != 0) continue;
                var19_19 = 1;
            }
            if (var16_16 != 0) {
                var15_15 /* !! */  = var5_5.a;
                var17_17 = var15_15 /* !! */ [0];
                var21_21 = var15_15 /* !! */ [var11_11];
                var22_22 = var15_15 /* !! */ .length - var10_10;
                var23_23 = var15_15 /* !! */ [var22_22];
                var24_24 = var15_15 /* !! */ .length - var11_11;
                var25_25 = var15_15 /* !! */ [var24_24];
                var26_26 = var5_5.g;
                var15_15 /* !! */  = (float[])var1_1;
                var1_1.drawLine(var17_17, var21_21, var23_23, var25_25, var26_26);
            }
            if (var19_19 != 0) {
                this.b(var1_1);
            }
        }
        if (var7_7 == var10_10) {
            var15_15 /* !! */  = var5_5.a;
            var17_17 = var15_15 /* !! */ [0];
            var21_21 = var15_15 /* !! */ [var11_11];
            var22_22 = var15_15 /* !! */ .length - var10_10;
            var23_23 = var15_15 /* !! */ [var22_22];
            var24_24 = var15_15 /* !! */ .length - var11_11;
            var25_25 = var15_15 /* !! */ [var24_24];
            var26_26 = var5_5.g;
            var15_15 /* !! */  = (float[])var1_1;
            var1_1.drawLine(var17_17, var21_21, var23_23, var25_25, var26_26);
        }
        if (var7_7 == (var19_19 = 3)) {
            this.b(var1_1);
        }
        var15_15 /* !! */  = var5_5.a;
        var18_18 /* !! */  = var5_5.e;
        var6_6.drawLines(var15_15 /* !! */ , var18_18 /* !! */ );
        var15_15 /* !! */  = (float[])var8_8.b;
        if (var15_15 /* !! */  != null) {
            var13_13 = var15_15 /* !! */ .getWidth();
            var18_18 /* !! */  = var8_8.b;
            var16_16 = var18_18 /* !! */ .getHeight();
            var27_27 = var13_13;
            var28_28 = var16_16;
        } else {
            var27_27 = 0;
            var28_28 = 0;
        }
        var29_29 = 1;
        while (var29_29 < (var13_13 = var3_3 + -1)) {
            block18: {
                block21: {
                    block19: {
                        block16: {
                            block20: {
                                block17: {
                                    if (var7_7 != var12_12) break block17;
                                    var13_13 = var29_29 + -1;
                                    if ((var13_13 = var9_9[var13_13]) != 0) break block17;
                                    var30_30 = var29_29;
                                    break block18;
                                }
                                var13_13 = var29_29 * 2;
                                var18_18 /* !! */  = (Paint)var5_5.c;
                                var25_25 = (float)var18_18 /* !! */ [var13_13];
                                var23_23 = (float)var18_18 /* !! */ [var13_13 += var11_11];
                                var5_5.d.reset();
                                var15_15 /* !! */  = (float[])var5_5.d;
                                var16_16 = 1092616192;
                                var17_17 = 10.0f;
                                var21_21 = var23_23 + var17_17;
                                var15_15 /* !! */ .moveTo(var25_25, var21_21);
                                var15_15 /* !! */  = (float[])var5_5.d;
                                var21_21 = var25_25 + var17_17;
                                var15_15 /* !! */ .lineTo(var21_21, var23_23);
                                var15_15 /* !! */  = (float[])var5_5.d;
                                var21_21 = var23_23 - var17_17;
                                var15_15 /* !! */ .lineTo(var25_25, var21_21);
                                var15_15 /* !! */  = (float[])var5_5.d;
                                var17_17 = var25_25 - var17_17;
                                var15_15 /* !! */ .lineTo(var17_17, var23_23);
                                var15_15 /* !! */  = (float[])var5_5.d;
                                var15_15 /* !! */ .close();
                                var13_13 = var29_29 + -1;
                                var18_18 /* !! */  = (pq1_0)var8_8.u.get(var13_13);
                                var31_31 = var5_5.i;
                                if (var7_7 != var12_12) break block19;
                                if ((var13_13 = var9_9[var13_13]) == var11_11) {
                                    var14_14 = var25_25 - 0.0f;
                                    var17_17 = var23_23 - 0.0f;
                                    var5_5.d(var6_6, var14_14, var17_17);
lbl100:
                                    // 3 sources

                                    while (true) {
                                        var32_32 = var31_31;
                                        var33_33 = var23_23;
                                        var34_34 = var25_25;
                                        var30_30 = var29_29;
                                        break block16;
                                        break;
                                    }
                                }
                                if (var13_13 != 0) break block20;
                                var14_14 = var25_25 - 0.0f;
                                var17_17 = var23_23 - 0.0f;
                                var5_5.c(var6_6, var14_14, var17_17);
                                ** GOTO lbl100
                            }
                            if (var13_13 == var10_10) ** break;
                            ** continue;
                            var33_33 = var25_25 - 0.0f;
                            var34_34 = var23_23 - 0.0f;
                            var15_15 /* !! */  = (float[])this;
                            var18_18 /* !! */  = var1_1;
                            var32_32 = var31_31;
                            var21_21 = var33_33;
                            var33_33 = var23_23;
                            var23_23 = var34_34;
                            var34_34 = var25_25;
                            var24_24 = var27_27;
                            var30_30 = var29_29;
                            var29_29 = var28_28;
                            this.e(var1_1, var21_21, var23_23, var27_27, var28_28);
                        }
                        var15_15 /* !! */  = (float[])var5_5.d;
                        var6_6.drawPath((Path)var15_15 /* !! */ , var32_32);
                        break block21;
                    }
                    var32_32 = var31_31;
                    var33_33 = var23_23;
                    var34_34 = var25_25;
                    var30_30 = var29_29;
                }
                if (var7_7 == var10_10) {
                    var25_25 = var34_34 - 0.0f;
                    var23_23 = var33_33 - 0.0f;
                    var5_5.d(var6_6, var25_25, var23_23);
                }
                if (var7_7 == var19_19) {
                    var25_25 = var34_34 - 0.0f;
                    var23_23 = var33_33 - 0.0f;
                    var5_5.c(var6_6, var25_25, var23_23);
                }
                var13_13 = 6;
                var14_14 = 8.4E-45f;
                if (var7_7 == var13_13) {
                    var21_21 = var34_34 - 0.0f;
                    var23_23 = var33_33 - 0.0f;
                    var15_15 /* !! */  = (float[])this;
                    var18_18 /* !! */  = var1_1;
                    var24_24 = var27_27;
                    var29_29 = var28_28;
                    this.e(var1_1, var21_21, var23_23, var27_27, var28_28);
                }
                var15_15 /* !! */  = (float[])var5_5.d;
                var6_6.drawPath((Path)var15_15 /* !! */ , var32_32);
            }
            var29_29 = var30_30 + 1;
            var12_12 = 4;
        }
        var15_15 /* !! */  = var5_5.a;
        var16_16 = var15_15 /* !! */ .length;
        if (var16_16 > var11_11) {
            var17_17 = var15_15 /* !! */ [0];
            var14_14 = var15_15 /* !! */ [var11_11];
            var31_31 = var5_5.f;
            var22_22 = 0x41000000;
            var23_23 = 8.0f;
            var6_6.drawCircle(var17_17, var14_14, var23_23, var31_31);
            var15_15 /* !! */  = var5_5.a;
            var16_16 = var15_15 /* !! */ .length - var10_10;
            var17_17 = var15_15 /* !! */ [var16_16];
            var24_24 = var15_15 /* !! */ .length - var11_11;
            var14_14 = var15_15 /* !! */ [var24_24];
            var6_6.drawCircle(var17_17, var14_14, var23_23, var31_31);
        }
    }

    public final void b(Canvas canvas) {
        float[] fArray = this.a;
        float f5 = fArray[0];
        int n3 = 1;
        float f6 = fArray[n3];
        int n4 = fArray.length + -2;
        float f7 = fArray[n4];
        int n7 = fArray.length - n3;
        float f8 = fArray[n7];
        float f11 = Math.min(f5, f7);
        float f12 = Math.max(f6, f8);
        float f14 = Math.max(f5, f7);
        float f15 = Math.max(f6, f8);
        Paint paint = this.g;
        canvas.drawLine(f11, f12, f14, f15, paint);
        float f16 = Math.min(f5, f7);
        float f17 = Math.min(f6, f8);
        float f18 = Math.min(f5, f7);
        float f19 = Math.max(f6, f8);
        canvas.drawLine(f16, f17, f18, f19, paint);
    }

    public final void c(Canvas canvas, float f5, float f6) {
        Object object = this.a;
        float f7 = object[0];
        int n3 = 1;
        float f8 = object[n3];
        int n4 = ((float[])object).length + -2;
        float f11 = object[n4];
        int n7 = ((float[])object).length - n3;
        float f12 = object[n7];
        float f14 = Math.min(f7, f11);
        float f15 = Math.max(f8, f12);
        float f16 = Math.min(f7, f11);
        f16 = f5 - f16;
        float f17 = Math.max(f8, f12) - f6;
        String string2 = "";
        CharSequence charSequence = new StringBuilder(string2);
        float f18 = 100.0f;
        float f19 = f16 * f18;
        float f20 = Math.abs(f11 - f7);
        float f22 = f8;
        double d2 = f19 /= f20;
        double d5 = 0.5;
        f19 = (float)((int)(d2 + d5)) / f18;
        ((StringBuilder)charSequence).append(f19);
        charSequence = ((StringBuilder)charSequence).toString();
        Paint paint = this.h;
        int n8 = ((String)charSequence).length();
        Rect rect = this.l;
        paint.getTextBounds((String)charSequence, 0, n8, rect);
        f8 = 2.0f;
        f16 /= f8;
        Rect rect2 = this.l;
        f20 = rect2.width() / 2;
        f16 = f16 - f20 + f14;
        f14 = f6 - 20.0f;
        canvas.drawText((String)charSequence, f16, f14, paint);
        f11 = Math.min(f7, f11);
        Paint paint2 = this.g;
        object = canvas;
        f7 = f5;
        f16 = f6;
        float f23 = f6;
        Rect rect3 = rect2;
        rect2 = paint2;
        canvas.drawLine(f5, f6, f11, f6, paint2);
        object = new StringBuilder;
        ((StringBuilder)object)(string2);
        f7 = f17 * f18;
        f16 = Math.abs(f12 - f22);
        f7 = (float)((int)((double)(f7 / f16) + d5)) / f18;
        ((StringBuilder)object).append(f7);
        object = ((StringBuilder)object).toString();
        int n10 = ((String)object).length();
        Rect rect4 = this.l;
        paint.getTextBounds((String)object, 0, n10, rect4);
        f17 /= f8;
        f7 = rect3.height() / 2;
        f17 -= f7;
        f7 = f5 + 5.0f;
        canvas.drawText((String)object, f7, f15 -= f17, paint);
        f14 = f22;
        f23 = Math.max(f22, f12);
        object = canvas;
        f7 = f5;
        f16 = f6;
        f11 = f5;
        canvas.drawLine(f5, f6, f5, f23, paint2);
    }

    public final void d(Canvas canvas, float f5, float f6) {
        Object object = this.a;
        float f7 = object[0];
        int n3 = 1;
        float f8 = object[n3];
        int n4 = ((float[])object).length + -2;
        float f11 = object[n4];
        int n7 = ((float[])object).length - n3;
        float f12 = object[n7];
        double d2 = f7 - f11;
        double d5 = f8 - f12;
        float f14 = (float)Math.hypot(d2, d5);
        float f15 = f5 - f7;
        float f16 = f6 - f8;
        f16 = f16 * (f12 -= f8) + (f15 *= (f11 -= f7));
        f15 = f14 * f14;
        Path path = new Path();
        path.moveTo(f5, f6);
        path.lineTo(f7 += (f11 *= (f16 /= f15)), f8 += (f16 *= f12));
        double d7 = f7 - f5;
        d5 = f8 - f6;
        f12 = (float)Math.hypot(d7, d5);
        StringBuilder stringBuilder = new StringBuilder("");
        f15 = 100.0f;
        f14 = (float)((int)(f12 * f15 / f14)) / f15;
        stringBuilder.append(f14);
        String string2 = stringBuilder.toString();
        Paint paint = this.h;
        n3 = string2.length();
        stringBuilder = this.l;
        paint.getTextBounds(string2, 0, n3, (Rect)stringBuilder);
        float f17 = this.l.width() / 2;
        float f18 = (f12 /= 2.0f) - f17;
        stringBuilder = canvas;
        canvas.drawTextOnPath(string2, path, f18, -20.0f, paint);
        Paint paint2 = this.g;
        object = canvas;
        f17 = f7;
        f7 = f8;
        canvas.drawLine(f5, f6, f17, f8, paint2);
    }

    public final void e(Canvas canvas, float f5, float f6, int n3, int n4) {
        String string2 = "";
        CharSequence charSequence = new StringBuilder(string2);
        float f7 = n3 / 2;
        f7 = f5 - f7;
        float f8 = 100.0f;
        MotionLayout motionLayout = this.n;
        float f11 = motionLayout.getWidth() - n3;
        double d2 = (f7 *= f8) / f11;
        double d5 = 0.5;
        f7 = (float)((int)(d2 + d5)) / f8;
        ((StringBuilder)charSequence).append(f7);
        charSequence = ((StringBuilder)charSequence).toString();
        Paint paint = this.h;
        int n7 = ((String)charSequence).length();
        Rect rect = this.l;
        paint.getTextBounds((String)charSequence, 0, n7, rect);
        float f12 = 2.0f;
        f7 = f5 / f12;
        Rect rect2 = this.l;
        f11 = rect2.width() / 2;
        f7 = f7 - f11 + 0.0f;
        f11 = f6 - 20.0f;
        canvas.drawText((String)charSequence, f7, f11, paint);
        float f14 = Math.min(0.0f, 1.0f);
        rect = this.g;
        charSequence = canvas;
        f7 = f5;
        Rect rect3 = rect;
        f11 = f6;
        float f15 = f6;
        Rect rect4 = rect2;
        rect2 = rect;
        canvas.drawLine(f5, f6, f14, f6, (Paint)rect);
        charSequence = new StringBuilder(string2);
        f7 = n4 / 2;
        f7 = (f6 - f7) * f8;
        f11 = motionLayout.getHeight() - n4;
        f7 = (float)((int)((double)(f7 / f11) + d5)) / f8;
        ((StringBuilder)charSequence).append(f7);
        charSequence = ((StringBuilder)charSequence).toString();
        n7 = ((String)charSequence).length();
        rect = this.l;
        paint.getTextBounds((String)charSequence, 0, n7, rect);
        f7 = f6 / f12;
        f11 = rect4.height() / 2;
        f7 -= f11;
        f11 = f5 + 5.0f;
        f15 = 0.0f - f7;
        canvas.drawText((String)charSequence, f11, f15, paint);
        f15 = Math.max(0.0f, 1.0f);
        charSequence = canvas;
        f7 = f5;
        f11 = f6;
        canvas.drawLine(f5, f6, f5, f15, (Paint)rect3);
    }
}

