/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.util.AttributeSet
 */
package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.utils.widget.MockView;
import androidx.constraintlayout.widget.R$styleable;

public class MotionTelltales
extends MockView {
    public final Paint l;
    public MotionLayout m;
    public final float[] n;
    public final Matrix o;
    public int p;
    public int q;
    public float r;

    public MotionTelltales(Context context) {
        super(context);
        Object object;
        this.l = object = new Paint();
        object = new float[2];
        this.n = (float[])object;
        super();
        this.o = object;
        this.p = 0;
        this.q = -65281;
        this.r = 0.25f;
        this.b(context, null);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object object;
        this.l = object = new Paint();
        object = new float[2];
        this.n = (float[])object;
        super();
        this.o = object;
        this.p = 0;
        this.q = -65281;
        this.r = 0.25f;
        this.b(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        Object object;
        this.l = object = new Paint();
        object = new float[2];
        this.n = (float[])object;
        super();
        this.o = object;
        this.p = 0;
        this.q = -65281;
        this.r = 0.25f;
        this.b(context, attributeSet);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            int[] nArray = R$styleable.MotionTelltales;
            context = context.obtainStyledAttributes(attributeSet, nArray);
            int n3 = context.getIndexCount();
            nArray = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                float f5;
                int n4;
                int n7 = context.getIndex(i3);
                if (n7 == (n4 = R$styleable.MotionTelltales_telltales_tailColor)) {
                    n4 = this.q;
                    this.q = n7 = context.getColor(n7, n4);
                    continue;
                }
                n4 = R$styleable.MotionTelltales_telltales_velocityMode;
                if (n7 == n4) {
                    n4 = this.p;
                    this.p = n7 = context.getInt(n7, n4);
                    continue;
                }
                n4 = R$styleable.MotionTelltales_telltales_tailScale;
                if (n7 != n4) continue;
                float f6 = this.r;
                this.r = f5 = context.getFloat(n7, f6);
            }
            context.recycle();
        }
        int n8 = this.q;
        attributeSet = this.l;
        attributeSet.setColor(n8);
        attributeSet.setStrokeWidth(5.0f);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onDraw(Canvas var1_1) {
        var2_2 = this;
        var3_3 = 5;
        var4_4 = 7.0E-45f;
        var5_5 = 1;
        var6_6 = 1.4E-45f;
        super.onDraw(var1_1);
        var7_7 = this.getMatrix();
        var8_8 = this.o;
        var7_7.invert((Matrix)var8_8);
        var7_7 = this.m;
        if (var7_7 == null) {
            var9_9 /* !! */  = this.getParent();
            var5_5 = var9_9 /* !! */  instanceof MotionLayout;
            if (var5_5 != 0) {
                var9_9 /* !! */  = (MotionLayout)var9_9 /* !! */ ;
                this.m = var9_9 /* !! */ ;
            }
            return;
        }
        var10_11 = this.getWidth();
        var11_12 = this.getHeight();
        var12_13 = new float[var3_3];
        v0 = var12_13;
        v1 = var12_13;
        v0[0] = 0.1f;
        v1[1] = 0.25f;
        v0[2] = 0.5f;
        v1[3] = 0.75f;
        v1[4] = 0.9f;
        var13_14 = 0;
        var14_15 = 0.0f;
        var15_16 = null;
        while (var13_14 < var3_3) {
            var16_17 = var12_13[var13_14];
            var17_18 = 0;
            var18_19 /* !! */  = 0.0f;
            var19_20 /* !! */  = null;
            while (var17_18 < var3_3) {
                var20_21 = var12_13[var17_18];
                var21_22 = var2_2.m;
                var22_23 = var2_2.p;
                var23_24 = var21_22.d;
                var24_25 = var21_22.o;
                var9_10 /* !! */  = var21_22.b;
                if (var9_10 /* !! */  != null) {
                    var4_4 = Math.signum(var21_22.q - var24_25);
                    var25_26 = var21_22.b;
                    var24_25 = var21_22.o;
                    var26_27 = 925353388;
                    var27_28 = 1.0E-5f;
                    var23_24 = var25_26.getInterpolation(var24_25 += var27_28);
                    var28_29 = var21_22.b;
                    var29_30 = var21_22.o;
                    var24_25 = var28_29.getInterpolation(var29_30);
                    var23_24 = (var23_24 - var24_25) / var27_28 * var4_4;
                    var4_4 = var21_22.m;
                    var23_24 /= var4_4;
                }
                if (var30_31 = (var9_10 /* !! */  = var21_22.b) instanceof oq1_0) {
                    var23_24 = var9_10 /* !! */ .a();
                }
                var4_4 = var23_24;
                var31_32 = (fQ1)var21_22.k.get(var2_2);
                var32_33 = var22_23 & 1;
                var25_26 = var2_2.n;
                if (var32_33 == 0) {
                    var26_27 = this.getWidth();
                    var33_34 = this.getHeight();
                    var21_22 = (zf0_1[])var31_32.v;
                    var24_25 = var31_32.b(var24_25, (float[])var21_22);
                    var34_35 = var31_32.y;
                    var35_36 = var12_13;
                    var12_13 = "translationX";
                    var36_37 = null;
                    if (var34_35 == null) {
                        var37_38 = var25_26;
                        var5_5 = 0;
                        var34_35 = null;
                        var6_6 = 0.0f;
                    } else {
                        var34_35 = (Ua3)var34_35.get(var12_13);
                        var37_38 = var25_26;
                    }
                    var25_26 = var31_32.y;
                    var38_39 = var22_23;
                    var39_40 /* !! */  = "translationY";
                    if (var25_26 == null) {
                        var40_41 = var17_18;
                        var25_26 = null;
                        var23_24 = 0.0f;
                    } else {
                        var25_26 = (Ua3)var25_26.get(var39_40 /* !! */ );
                        var40_41 = var17_18;
                    }
                    var19_20 /* !! */  = var31_32.y;
                    var41_42 = var13_14;
                    var15_16 = "rotation";
                    if (var19_20 /* !! */  == null) {
                        var42_43 = var11_12;
                        var17_18 = 0;
                        var19_20 /* !! */  = null;
                        var18_19 /* !! */  = 0.0f;
                    } else {
                        var19_20 /* !! */  = (Ua3)var19_20 /* !! */ .get(var15_16);
                        var42_43 = var11_12;
                    }
                    var43_44 = var31_32.y;
                    var44_45 = var10_11;
                    var7_7 = "scaleX";
                    if (var43_44 == null) {
                        var45_46 = var8_8;
                        var11_12 = 0;
                        var43_44 = null;
                    } else {
                        var43_44 = (Ua3)var43_44.get(var7_7);
                        var45_46 = var8_8;
                    }
                    var8_8 = var31_32.y;
                    var2_2 = "scaleY";
                    if (var8_8 == null) {
                        var46_47 = var4_4;
                        var8_8 = null;
                    } else {
                        var8_8 = (Ua3)var8_8.get(var2_2);
                        var46_47 = var4_4;
                    }
                    var9_10 /* !! */  = var31_32.z;
                    if (var9_10 /* !! */  == null) {
                        var3_3 = 0;
                        var9_10 /* !! */  = null;
                        var4_4 = 0.0f;
                    } else {
                        var9_10 /* !! */  = (ud3_1)var9_10 /* !! */ .get(var12_13);
                    }
                    var12_13 = var31_32.z;
                    if (var12_13 == null) {
                        var47_48 = 0;
                        var12_13 = null;
                        var48_49 = (reference)0.0f;
                    } else {
                        var12_13 = (ud3_1)var12_13.get(var39_40 /* !! */ );
                    }
                    var39_40 /* !! */  = var31_32.z;
                    if (var39_40 /* !! */  == null) {
                        var13_14 = 0;
                        var15_16 = null;
                        var14_15 = 0.0f;
                    } else {
                        var15_16 = (ud3_1)var39_40 /* !! */ .get(var15_16);
                    }
                    var39_40 /* !! */  = var31_32.z;
                    if (var39_40 /* !! */  == null) {
                        var10_11 = 0;
                        var7_7 = null;
                        var49_50 = 0.0f;
                    } else {
                        var7_7 = (ud3_1)var39_40 /* !! */ .get(var7_7);
                    }
                    var39_40 /* !! */  = var31_32.z;
                    if (var39_40 /* !! */  == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var2_2 = var39_40 /* !! */ .get(var2_2);
                    var36_37 = var2_2;
                    var36_37 = (ud3_1)var2_2;
                    ** continue;
                    var2_2 = var36_37;
                    var39_40 /* !! */  = new Object();
                    var36_37 = var21_22;
                    var32_33 = 0;
                    var50_51 = 0.0f;
                    var21_22 = null;
                    var39_40 /* !! */ .e = 0.0f;
                    var39_40 /* !! */ .d = 0.0f;
                    var39_40 /* !! */ .c = 0.0f;
                    var39_40 /* !! */ .b = 0.0f;
                    var39_40 /* !! */ .a = 0.0f;
                    if (var19_20 /* !! */  != null) {
                        var21_22 = var19_20 /* !! */ .a;
                        var51_52 = var12_13;
                        var52_53 = var31_32;
                        var53_54 = var24_25;
                        var53_54 = var21_22.e(var53_54);
                        var48_49 = (reference)var53_54;
                        var39_40 /* !! */ .e = (float)var48_49;
                        var48_49 = (reference)var19_20 /* !! */ .a(var24_25);
                        var39_40 /* !! */ .f = (float)var48_49;
                    } else {
                        var51_52 = var12_13;
                        var52_53 = var31_32;
                    }
                    if (var34_35 != null) {
                        var12_13 = var34_35.a;
                        var21_22 = var19_20 /* !! */ ;
                        var29_30 = var16_17;
                        var55_55 = var24_25;
                        var55_55 = var12_13.e(var55_55);
                        var48_49 = (reference)var55_55;
                        var39_40 /* !! */ .c = (float)var48_49;
                    } else {
                        var21_22 = var19_20 /* !! */ ;
                        var29_30 = var16_17;
                    }
                    if (var25_26 != null) {
                        var12_13 = var25_26.a;
                        var55_55 = var24_25;
                        var55_55 = var12_13.e(var55_55);
                        var48_49 = (reference)var55_55;
                        var39_40 /* !! */ .d = (float)var48_49;
                    }
                    if (var43_44 != null) {
                        var12_13 = var43_44.a;
                        var55_55 = var24_25;
                        var55_55 = var12_13.e(var55_55);
                        var48_49 = (reference)var55_55;
                        var39_40 /* !! */ .a = (float)var48_49;
                    }
                    if (var8_8 != null) {
                        var12_13 = var8_8.a;
                        var55_55 = var24_25;
                        var55_55 = var12_13.e(var55_55);
                        var48_49 = (reference)var55_55;
                        var39_40 /* !! */ .b = (float)var48_49;
                    }
                    if (var15_16 != null) {
                        var48_49 = (reference)var15_16.b(var24_25);
                        var39_40 /* !! */ .e = (float)var48_49;
                    }
                    if (var9_10 /* !! */  != null) {
                        var48_49 = (reference)var9_10 /* !! */ .b(var24_25);
                        var39_40 /* !! */ .c = (float)var48_49;
                    }
                    var12_13 = var51_52;
                    if (var51_52 != null) {
                        var39_40 /* !! */ .d = var18_19 /* !! */  = var51_52.b(var24_25);
                    }
                    if (var7_7 != null) {
                        var39_40 /* !! */ .a = var18_19 /* !! */  = var7_7.b(var24_25);
                    }
                    if (var2_2 != null) {
                        var39_40 /* !! */ .b = var18_19 /* !! */  = var2_2.b(var24_25);
                    }
                    var19_20 /* !! */  = var52_53;
                    var57_56 = var52_53.k;
                    if (var57_56 != null) {
                        var2_2 = (zf0_1[])var52_53.p;
                        var3_3 = var2_2.length;
                        if (var3_3 > 0) {
                            var58_57 = var24_25;
                            var57_56.c(var58_57, (double[])var2_2);
                            var2_2 = var52_53.k;
                            var7_7 = var52_53.q;
                            var2_2.f(var58_57, (double[])var7_7);
                            var2_2 = (zf0_1[])var52_53.o;
                            var9_10 /* !! */  = (zf0_1[])var52_53.q;
                            var34_35 = var52_53.p;
                            var7_7 = var52_53.f;
                            var7_7.getClass();
                            var50_51 = var20_21;
                            var57_56 = var37_38;
                            var23_24 = var29_30;
                            var28_29 = var37_38;
                            var8_8 = var39_40 /* !! */ ;
                            var10_11 = var38_39;
                            var39_40 /* !! */  = var2_2;
                            var60_58 = var20_21;
                            var61_59 /* !! */  = var9_10 /* !! */ ;
                            var62_60 = var40_41;
                            var19_20 /* !! */  = var34_35;
                            pq1_0.h(var20_21, var29_30, (float[])var37_38, (int[])var2_2, (double[])var9_10 /* !! */ , (double[])var34_35);
                        } else {
                            var8_8 = var39_40 /* !! */ ;
                            var60_58 = var20_21;
                            var57_56 = var37_38;
                            var10_11 = var38_39;
                            var62_60 = var40_41;
                        }
                        var21_22 = var8_8;
                        var23_24 = var60_58;
                        var24_25 = var29_30;
                        var22_23 = var26_27;
                        var19_20 /* !! */  = var57_56;
                        var8_8.a(var60_58, var29_30, var26_27, var33_34, (float[])var57_56);
                        var4_4 = var60_58;
                        var63_61 = var10_11;
lbl264:
                        // 2 sources

                        while (true) {
                            var7_7 = var57_56;
                            break;
                        }
                    } else {
                        var57_56 = var37_38;
                        var62_60 = var40_41;
                        var40_41 = var38_39;
                        var64_62 = var39_40 /* !! */ ;
                        var39_40 /* !! */  = var52_53.j;
                        if (var39_40 /* !! */  != null) {
                            var39_40 /* !! */  = var36_37;
                            var60_58 = var52_53.b(var24_25, (float[])var36_37);
                            var9_10 /* !! */  = var52_53.j;
                            var5_5 = 0;
                            var6_6 = 0.0f;
                            var34_35 = null;
                            var9_10 /* !! */  = var9_10 /* !! */ [0];
                            var65_63 = var60_58;
                            var2_2 = (zf0_1[])var52_53.q;
                            var9_10 /* !! */ .f(var65_63, (double[])var2_2);
                            var2_2 = var52_53.j[0];
                            var9_10 /* !! */  = (zf0_1[])var52_53.p;
                            var2_2.c(var65_63, (double[])var9_10 /* !! */ );
                            var60_58 = (float)var36_37[0];
                            var4_4 = 0.0f;
                            var9_10 /* !! */  = null;
                            for (var3_3 = 0; var3_3 < (var10_11 = ((Object)(var34_35 = (Object)var19_20 /* !! */ .q)).length); var3_3 += var5_5) {
                                var65_63 = (double)var34_35[var3_3];
                                var67_64 = var60_58;
                                var34_35[var3_3] = var65_63 *= var67_64;
                                var5_5 = 1;
                                var6_6 = 1.4E-45f;
                            }
                            var39_40 /* !! */  = (zf0_1[])var19_20 /* !! */ .o;
                            var2_2 = (zf0_1[])var19_20 /* !! */ .p;
                            var9_10 /* !! */  = var19_20 /* !! */ .f;
                            var9_10 /* !! */ .getClass();
                            var50_51 = var20_21;
                            var23_24 = var29_30;
                            var28_29 = var57_56;
                            var3_3 = var40_41;
                            var49_50 = var20_21;
                            var61_59 /* !! */  = var34_35;
                            var19_20 /* !! */  = var2_2;
                            pq1_0.h(var20_21, var29_30, (float[])var57_56, (int[])var39_40 /* !! */ , (double[])var34_35, (double[])var2_2);
                            var21_22 = var64_62;
                            var23_24 = var20_21;
                            var24_25 = var29_30;
                            var22_23 = var26_27;
                            var19_20 /* !! */  = var57_56;
                            var64_62.a(var20_21, var29_30, var26_27, var33_34, (float[])var57_56);
                            var63_61 = var40_41;
                            var4_4 = var20_21;
                            ** continue;
                        }
                        var39_40 /* !! */  = var52_53.g;
                        var36_37 = var2_2;
                        var60_58 = var39_40 /* !! */ .e;
                        var19_20 /* !! */  = var52_53.f;
                        var52_53 = var7_7;
                        var49_50 = var19_20 /* !! */ .e;
                        var60_58 -= var49_50;
                        var49_50 = var39_40 /* !! */ .f;
                        var51_52 = var12_13;
                        var48_49 = (reference)var19_20 /* !! */ .f;
                        var49_50 -= var48_49;
                        var48_49 = (reference)var39_40 /* !! */ .g;
                        var69_65 = var9_10 /* !! */ ;
                        var4_4 = var19_20 /* !! */ .g;
                        var48_49 -= var4_4;
                        var4_4 = var39_40 /* !! */ .h;
                        var70_66 = (reference)var19_20 /* !! */ .h;
                        var4_4 -= var70_66;
                        var48_49 += var60_58;
                        var4_4 += var49_50;
                        var22_23 = 1065353216;
                        var70_66 = (reference)1.0f;
                        var18_19 /* !! */  = (float)((var70_66 - var20_21) * var60_58);
                        var37_38[0] = var48_49 = var48_49 * var20_21 + var18_19 /* !! */ ;
                        var70_66 = (var70_66 - var29_30) * var49_50;
                        var4_4 = var4_4 * var29_30 + var70_66;
                        var63_61 = 1;
                        var60_58 = 1.4E-45f;
                        var37_38[var63_61] = var4_4;
                        var2_2 = var64_62;
                        var3_3 = 0;
                        var4_4 = 0.0f;
                        var9_10 /* !! */  = null;
                        var64_62.e = 0.0f;
                        var64_62.d = 0.0f;
                        var64_62.c = 0.0f;
                        var64_62.b = 0.0f;
                        var64_62.a = 0.0f;
                        if (var21_22 != null) {
                            var9_10 /* !! */  = var21_22.a;
                            var7_7 = var37_38;
                            var55_55 = var24_25;
                            var55_55 = var9_10 /* !! */ .e(var55_55);
                            var64_62.e = var4_4 = (float)var55_55;
                            var64_62.f = var4_4 = var21_22.a(var24_25);
                        } else {
                            var7_7 = var37_38;
                        }
                        if (var34_35 != null) {
                            var9_10 /* !! */  = var34_35.a;
                            var55_55 = var24_25;
                            var58_57 = var9_10 /* !! */ .e(var55_55);
                            var2_2.c = var4_4 = (float)var58_57;
                        }
                        if (var25_26 != null) {
                            var9_10 /* !! */  = var25_26.a;
                            var71_67 = var24_25;
                            var58_57 = var9_10 /* !! */ .e(var71_67);
                            var2_2.d = var4_4 = (float)var58_57;
                        }
                        if (var43_44 != null) {
                            var9_10 /* !! */  = var43_44.a;
                            var67_64 = var24_25;
                            var58_57 = var9_10 /* !! */ .e(var67_64);
                            var2_2.a = var4_4 = (float)var58_57;
                        }
                        if (var8_8 != null) {
                            var9_10 /* !! */  = var8_8.a;
                            var73_68 = var24_25;
                            var58_57 = var9_10 /* !! */ .e(var73_68);
                            var2_2.b = var4_4 = (float)var58_57;
                        }
                        if (var15_16 != null) {
                            var2_2.e = var4_4 = var15_16.b(var24_25);
                        }
                        if (var69_65 != null) {
                            var9_10 /* !! */  = var69_65;
                            var2_2.c = var4_4 = var69_65.b(var24_25);
                        }
                        if (var51_52 != null) {
                            var12_13 = var51_52;
                            var2_2.d = var4_4 = var51_52.b(var24_25);
                        }
                        if (var52_53 != null) {
                            var9_10 /* !! */  = var52_53;
                            var2_2.a = var4_4 = var52_53.b(var24_25);
                        }
                        if (var36_37 != null) {
                            var9_10 /* !! */  = var36_37;
                            var2_2.b = var4_4 = var36_37.b(var24_25);
                        }
                        var21_22 = var2_2;
                        var23_24 = var20_21;
                        var24_25 = var29_30;
                        var63_61 = var40_41;
                        var22_23 = var26_27;
                        var4_4 = var20_21;
                        var19_20 /* !! */  = var7_7;
                        var2_2.a(var20_21, var29_30, var26_27, var33_34, (float[])var7_7);
                    }
                } else {
                    var46_47 = var23_24;
                    var44_45 = var10_11;
                    var45_46 = var8_8;
                    var42_43 = var11_12;
                    var35_36 = var12_13;
                    var41_42 = var13_14;
                    var7_7 = var25_26;
                    var63_61 = var22_23;
                    var4_4 = var20_21;
                    var62_60 = var17_18;
                    var19_20 /* !! */  = var31_32;
                    var29_30 = var16_17;
                    var31_32.d(var24_25, var20_21, var16_17, (float[])var25_26);
                }
                var5_5 = 2;
                var6_6 = 2.8E-45f;
                if (var63_61 < var5_5) {
                    var2_2 = null;
                    var6_6 = (float)(var7_7[0] * var46_47);
                    var7_7[0] = (Matrix)var6_6;
                    var63_61 = 1;
                    var60_58 = 1.4E-45f;
                    var6_6 = (float)(var7_7[var63_61] * var46_47);
                    var7_7[var63_61] = (Matrix)var6_6;
                }
                var2_2 = this;
                var34_35 = this.n;
                var7_7 = var45_46;
                var45_46.mapVectors((float[])var34_35);
                var50_51 = (float)var44_45 * var4_4;
                var3_3 = var42_43;
                var23_24 = (float)var42_43 * var29_30;
                var43_44 = null;
                var48_49 = var34_35[0];
                var14_15 = this.r;
                var24_25 = var50_51 - (var48_49 *= var14_15);
                var47_48 = 1;
                var48_49 = (reference)1.4E-45f;
                var70_66 = var34_35[var47_48] * var14_15;
                var70_66 = (reference)(var23_24 - var70_66);
                var45_46.mapVectors((float[])var34_35);
                var61_59 /* !! */  = this.l;
                var15_16 = var1_1;
                var1_1.drawLine(var50_51, var23_24, var24_25, (float)var70_66, (Paint)var61_59 /* !! */ );
                var5_5 = 1;
                var6_6 = 1.4E-45f;
                var17_18 = var62_60 + 1;
                var11_12 = var42_43;
                var16_17 = var29_30;
                var12_13 = var35_36;
                var13_14 = var41_42;
                var3_3 = 5;
                var4_4 = 7.0E-45f;
                var8_8 = var45_46;
                var10_11 = var44_45;
            }
            var3_3 = var11_12;
            var35_36 = var12_13;
            var41_42 = var13_14++;
            var43_44 = null;
            var7_7 = var8_8;
            var3_3 = 5;
            var4_4 = 7.0E-45f;
        }
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        this.postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        charSequence = charSequence.toString();
        this.f = charSequence;
        this.requestLayout();
    }
}

