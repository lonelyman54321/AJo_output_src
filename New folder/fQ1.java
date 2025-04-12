/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.animation.Interpolator
 */
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class fQ1 {
    public qo1_1[] A;
    public int B;
    public int C;
    public View D;
    public int E;
    public float F;
    public Interpolator G;
    public boolean H;
    public final Rect a;
    public final View b;
    public final int c;
    public boolean d;
    public int e;
    public final pq1_0 f;
    public final pq1_0 g;
    public final dQ1 h;
    public final dQ1 i;
    public zf0_1[] j;
    public up k;
    public float l;
    public float m;
    public float n;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public final float[] t;
    public final ArrayList u;
    public final float[] v;
    public final ArrayList w;
    public HashMap x;
    public HashMap y;
    public HashMap z;

    public fQ1(View object) {
        int n3;
        float f5;
        Comparable comparable;
        int n4;
        Rect rect;
        this.a = rect = new Rect();
        rect = null;
        this.d = false;
        this.e = n4 = -1;
        this.f = comparable = new pq1_0();
        this.g = comparable = new pq1_0();
        this.h = comparable;
        super();
        this.i = comparable;
        this.l = f5 = 0.0f / 0.0f;
        this.m = 0.0f;
        this.n = 1.0f;
        Object object2 = new float[4];
        this.t = object2;
        object2 = new ArrayList;
        super();
        this.u = object2;
        object2 = new float[1];
        this.v = object2;
        object2 = new ArrayList;
        super();
        this.w = object2;
        this.B = n4;
        this.C = n4;
        object2 = null;
        this.D = null;
        this.E = n4;
        this.F = f5;
        this.G = null;
        this.H = false;
        this.b = object;
        this.c = n3 = object.getId();
        object = object.getLayoutParams();
        n3 = object instanceof ConstraintLayout$LayoutParams;
        if (n3 != 0) {
            object = (ConstraintLayout$LayoutParams)((Object)object);
            object.getClass();
        }
    }

    public static void h(Rect rect, Rect rect2, int n3, int n4, int n7) {
        int n8 = 1;
        int n10 = 2;
        if (n3 != n8) {
            if (n3 != n10) {
                n8 = 3;
                if (n3 != n8) {
                    n7 = 4;
                    if (n3 == n7) {
                        int n14;
                        n3 = rect.left;
                        n7 = rect.right;
                        n3 += n7;
                        n7 = rect.bottom;
                        n8 = rect.top;
                        n7 += n8;
                        n8 = (rect.width() + n7) / n10;
                        rect2.left = n4 -= n8;
                        n4 = rect.height();
                        rect2.top = n3 = (n3 - n4) / n10;
                        n3 = rect2.left;
                        rect2.right = n4 = rect.width() + n3;
                        n3 = rect2.top;
                        rect2.bottom = n14 = rect.height() + n3;
                    }
                } else {
                    int n15;
                    n3 = rect.left;
                    n4 = rect.right;
                    n3 += n4;
                    n4 = rect.height() / n10;
                    n8 = rect.top;
                    n4 += n8;
                    n8 = n3 / 2;
                    rect2.left = n4 -= n8;
                    n4 = (rect.height() + n3) / n10;
                    rect2.top = n7 -= n4;
                    n3 = rect2.left;
                    rect2.right = n4 = rect.width() + n3;
                    n3 = rect2.top;
                    rect2.bottom = n15 = rect.height() + n3;
                }
            } else {
                int n16;
                n3 = rect.left;
                n7 = rect.right;
                n3 += n7;
                n7 = rect.top;
                n8 = rect.bottom;
                n7 += n8;
                n8 = (rect.width() + n7) / n10;
                rect2.left = n4 -= n8;
                n4 = rect.height();
                rect2.top = n3 = (n3 - n4) / n10;
                n3 = rect2.left;
                rect2.right = n4 = rect.width() + n3;
                n3 = rect2.top;
                rect2.bottom = n16 = rect.height() + n3;
            }
        } else {
            int n17;
            n3 = rect.left;
            n4 = rect.right;
            n3 += n4;
            n4 = rect.top;
            n8 = rect.bottom;
            n4 += n8;
            n8 = rect.width();
            rect2.left = n4 = (n4 - n8) / n10;
            n4 = (rect.height() + n3) / n10;
            rect2.top = n7 -= n4;
            n3 = rect2.left;
            rect2.right = n4 = rect.width() + n3;
            n3 = rect2.top;
            rect2.bottom = n17 = rect.height() + n3;
        }
    }

    public final void a(Pn1 pn1) {
        this.w.add(pn1);
    }

    public final float b(float f5, float[] fArray) {
        boolean bl2;
        int n3;
        double d2;
        double d5;
        float f6 = 0.0f;
        float f7 = 1.0f;
        if (fArray != null) {
            fArray[0] = f7;
        } else {
            float f8 = this.n;
            d5 = f8;
            d2 = 1.0;
            double d7 = d5 - d2;
            Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object != false) {
                double d9;
                double d12;
                float f11 = this.m;
                float f12 = f5 - f11;
                n3 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                if (n3 < 0) {
                    f5 = 0.0f;
                }
                if ((n3 = (int)(f5 == f11 ? 0 : (f5 > f11 ? 1 : -1))) > 0 && (n3 = (int)((d12 = (d9 = (double)f5) - d2) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1))) < 0) {
                    f5 = Math.min((f5 - f11) * f8, f7);
                }
            }
        }
        bx0_0 bx0_02 = this.f.a;
        Iterator iterator = this.u.iterator();
        n3 = 2143289344;
        float f14 = 0.0f / 0.0f;
        while (bl2 = iterator.hasNext()) {
            pq1_0 pq1_02 = (pq1_0)iterator.next();
            bx0_0 bx0_03 = pq1_02.a;
            if (bx0_03 == null) continue;
            float f15 = pq1_02.c;
            float f16 = f15 - f5;
            Object object = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
            if (object < 0) {
                bx0_02 = bx0_03;
                f6 = f15;
                continue;
            }
            boolean bl3 = Float.isNaN(f14);
            if (!bl3) continue;
            f14 = pq1_02.c;
        }
        if (bx0_02 != null) {
            boolean bl4 = Float.isNaN(f14);
            if (!bl4) {
                f7 = f14;
            }
            d5 = (f5 -= f6) / (f7 -= f6);
            d2 = bx0_02.a(d5);
            f5 = (float)d2 * f7 + f6;
            if (fArray != null) {
                double d13 = bx0_02.b(d5);
                fArray[0] = f6 = (float)d13;
            }
        }
        return f5;
    }

    public final void c(double d2, float[] fArray, float[] fArray2) {
        float f5;
        int n3;
        float f6;
        float f7;
        double d5;
        float[] fArray3 = fArray2;
        int n4 = 4;
        float f8 = 5.6E-45f;
        double[] dArray = new double[n4];
        double[] dArray2 = new double[n4];
        this.j[0].c(d2, dArray);
        this.j[0].f(d2, dArray2);
        float f11 = 0.0f;
        Arrays.fill(fArray2, 0.0f);
        int[] nArray = this.o;
        pq1_0 pq1_02 = this.f;
        float f12 = pq1_02.e;
        float f14 = pq1_02.f;
        float f15 = pq1_02.g;
        float f16 = pq1_02.h;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i3 = 0; i3 < (n4 = nArray.length); ++i3) {
            d5 = dArray[i3];
            f7 = (float)d5;
            double d7 = dArray2[i3];
            f6 = (float)d7;
            int n7 = nArray[i3];
            n4 = 1;
            f8 = Float.MIN_VALUE;
            if (n7 != n4) {
                n3 = 2;
                f5 = 2.8E-45f;
                if (n7 != n3) {
                    n3 = 3;
                    f5 = 4.2E-45f;
                    if (n7 != n3) {
                        n3 = 4;
                        f5 = 5.6E-45f;
                        if (n7 == n3) {
                            f16 = f7;
                            f19 = f6;
                        }
                    } else {
                        n3 = 4;
                        f5 = 5.6E-45f;
                        f15 = f7;
                        f18 = f6;
                    }
                } else {
                    n3 = 4;
                    f5 = 5.6E-45f;
                    f14 = f7;
                    f17 = f6;
                }
            } else {
                n3 = 4;
                f5 = 5.6E-45f;
                f12 = f7;
                f11 = f6;
            }
            fArray3 = fArray2;
        }
        int n8 = 0x40000000;
        f7 = 2.0f;
        f18 = f18 / f7 + f11;
        f19 = f19 / f7 + f17;
        fQ1 fQ12 = pq1_02.m;
        if (fQ12 != null) {
            int n10 = 2;
            fArray3 = new float[n10];
            float[] fArray4 = new float[n10];
            double d9 = d2;
            fQ12.c(d2, fArray3, fArray4);
            n3 = 0;
            fQ12 = null;
            f8 = fArray3[0];
            int n14 = 1;
            float f20 = fArray3[n14];
            float f22 = fArray4[0];
            f5 = fArray4[n14];
            d9 = f8;
            double d12 = f12;
            double d13 = f14;
            double d14 = Math.sin(d13) * d12 + d9;
            d9 = f15 / f7;
            f6 = (float)(d14 - d9);
            double d15 = f20;
            d14 = Math.cos(d13) * d12;
            d15 -= d14;
            d12 = f16 / f7;
            f20 = (float)(d15 -= d12);
            d9 = f22;
            double d16 = f11;
            d12 = Math.sin(d13) * d16 + d9;
            d9 = Math.cos(d13);
            d5 = f17;
            d9 = d9 * d5 + d12;
            f8 = (float)d9;
            double d17 = f5;
            d14 = Math.cos(d13) * d16;
            double d18 = Math.sin(d13) * d5 + (d17 -= d14);
            f19 = (float)d18;
            f12 = f6;
            f14 = f20;
            f18 = f8;
            n8 = 0x40000000;
            f7 = 2.0f;
        }
        fArray[0] = f15 = f15 / f7 + f12 + 0.0f;
        f16 = f16 / f7 + f14 + 0.0f;
        n8 = 1;
        fArray[n8] = f16;
        fArray2[0] = f18;
        fArray2[n8] = f19;
    }

    public final void d(float f5, float f6, float f7, float[] fArray) {
        Object[] objectArray = this.v;
        f5 = this.b(f5, (float[])objectArray);
        Object object = this.j;
        if (object != null) {
            double[] dArray;
            int n3;
            object = object[0];
            double d2 = f5;
            Object object2 = this.q;
            object.f(d2, (double[])object2);
            object2 = this.j[0];
            object = this.p;
            ((zf0_1)object2).c(d2, (double[])object);
            f5 = objectArray[0];
            for (int i3 = 0; i3 < (n3 = (dArray = this.q).length); ++i3) {
                double d5 = dArray[i3];
                double d7 = f5;
                dArray[i3] = d5 *= d7;
            }
            object2 = this.k;
            if (object2 != null) {
                objectArray = this.p;
                int n4 = objectArray.length;
                if (n4 > 0) {
                    ((up)object2).c(d2, (double[])objectArray);
                    object2 = this.k;
                    objectArray = this.q;
                    ((up)object2).f(d2, (double[])objectArray);
                    int[] nArray = this.o;
                    dArray = this.q;
                    double[] dArray2 = this.p;
                    object2 = this.f;
                    object2.getClass();
                    float f8 = f6;
                    pq1_0.h(f6, f7, fArray, nArray, dArray, dArray2);
                }
                return;
            }
            int[] nArray = this.o;
            double[] dArray3 = this.p;
            this.f.getClass();
            float f11 = f6;
            pq1_0.h(f6, f7, fArray, nArray, dArray, dArray3);
            return;
        }
        pq1_0 pq1_02 = this.g;
        float f12 = pq1_02.e;
        object = this.f;
        float f14 = object.e;
        f12 -= f14;
        f14 = pq1_02.f;
        float f15 = object.f;
        f14 -= f15;
        f15 = pq1_02.g;
        float f16 = object.g;
        f15 -= f16;
        f5 = pq1_02.h;
        float f17 = object.h;
        f5 -= f17;
        f15 += f12;
        f5 += f14;
        f17 = 1.0f;
        f16 = (f17 - f6) * f12;
        fArray[0] = f15 = f15 * f6 + f16;
        f17 = (f17 - f7) * f14;
        fArray[1] = f5 = f5 * f7 + f17;
    }

    public final float e() {
        double d2;
        fQ1 fQ12 = this;
        int n3 = 2;
        float[] fArray = new float[n3];
        int n4 = 99;
        float f5 = n4;
        float f6 = 1.0f;
        float f7 = f6 / f5;
        double d5 = d2 = 0.0;
        double d7 = d2;
        int n7 = 0;
        float f8 = 0.0f;
        while (true) {
            float f11;
            Object object;
            boolean bl2;
            n4 = 100;
            f5 = 1.4E-43f;
            if (n7 >= n4) break;
            f5 = (float)n7 * f7;
            double d9 = f5;
            Object object2 = fQ12.f.a;
            Object object3 = fQ12.u.iterator();
            float f12 = 0.0f / 0.0f;
            float f14 = 0.0f;
            while (bl2 = object3.hasNext()) {
                Object e2;
                object = e2 = object3.next();
                object = (pq1_0)e2;
                bx0_0 bx0_02 = ((pq1_0)object).a;
                if (bx0_02 != null) {
                    float f15 = ((pq1_0)object).c;
                    float f16 = f15 - f5;
                    Object object4 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                    if (object4 < 0) {
                        object2 = bx0_02;
                        f14 = f15;
                    } else {
                        boolean bl3 = Float.isNaN(f12);
                        if (bl3) {
                            f12 = ((pq1_0)object).c;
                        }
                    }
                }
                f6 = 1.0f;
            }
            if (object2 != null) {
                boolean bl4 = Float.isNaN(f12);
                if (bl4) {
                    f12 = 1.0f;
                }
                d2 = (f5 -= f14) / (f12 -= f14);
                f5 = (float)((bx0_0)object2).a(d2) * f12 + f14;
                d9 = d2 = (double)f5;
            }
            Object object5 = fQ12.j[0];
            object2 = fQ12.p;
            ((zf0_1)object5).c(d9, (double[])object2);
            object2 = fQ12.o;
            object3 = fQ12.p;
            f6 = 0.0f;
            object = null;
            object5 = fQ12.f;
            int n8 = n7;
            n7 = 0;
            ((pq1_0)object5).d(d9, (int[])object2, (double[])object3, fArray, 0);
            n4 = 1;
            f5 = Float.MIN_VALUE;
            if (n8 > 0) {
                d9 = fArray[n4];
                d9 = d7 - d9;
                object2 = null;
                float f17 = fArray[0];
                double d12 = f17;
                d9 = Math.hypot(d9, d5 -= d12);
                f11 = (float)d9;
                f8 += f11;
            } else {
                object2 = null;
            }
            f11 = fArray[0];
            d5 = f11;
            f5 = fArray[n4];
            d2 = f5;
            n7 = n8 + 1;
            d7 = d2;
            f6 = 1.0f;
        }
        return f8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean f(float var1_1, long var2_2, Tn1 var4_3, View var5_4) {
        block66: {
            block56: {
                block65: {
                    block64: {
                        block57: {
                            var6_5 = this;
                            var7_6 = var5_4;
                            var8_7 = 0;
                            var9_8 = 0.0f;
                            var10_9 = null;
                            var11_10 = var1_1;
                            var11_10 = this.b(var1_1, null);
                            var12_11 = this.E;
                            var13_12 /* !! */  = 1065353216;
                            var14_13 = 1.0f;
                            var15_14 = -1;
                            var16_15 = 0.0f / 0.0f;
                            if (var12_11 != var15_14) {
                                var17_16 = var12_11;
                                var17_16 = var14_13 / var17_16;
                                var18_17 = Math.floor(var11_10 / var17_16);
                                var20_18 = (float)var18_17 * var17_16;
                                var11_10 = var11_10 % var17_16 / var17_16;
                                var21_19 = this.F;
                                var22_20 = Float.isNaN(var21_19);
                                if (var22_20 == 0) {
                                    var21_19 = this.F;
                                    var11_10 = (var11_10 + var21_19) % var14_13;
                                }
                                if ((var23_21 /* !! */  = var6_5.G) != null) {
                                    var11_10 = var23_21 /* !! */ .getInterpolation(var11_10);
                                } else {
                                    var24_22 = var11_10;
                                    var26_23 = 0.5;
                                    cfr_temp_0 = var24_22 - var26_23;
                                    var28_24 /* !! */  = (int)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                                    if (var28_24 /* !! */  > 0) {
                                        var28_24 /* !! */  = 1065353216;
                                        var11_10 = 1.0f;
                                    } else {
                                        var28_24 /* !! */  = 0;
                                        var11_10 = 0.0f;
                                        var29_25 = null;
                                    }
                                }
                                var11_10 = var11_10 * var17_16 + var20_18;
                            }
                            var30_26 /* !! */  = var11_10;
                            var29_25 = var6_5.y;
                            if (var29_25 != null) {
                                var29_25 = var29_25.values().iterator();
                                while ((var12_11 = (int)var29_25.hasNext()) != 0) {
                                    var31_27 /* !! */  = (jd3_0)var29_25.next();
                                    var31_27 /* !! */ .d(var30_26 /* !! */ , var7_6);
                                }
                            }
                            var29_25 = var6_5.x;
                            var32_28 = 0.0f;
                            if (var29_25 != null) {
                                var29_25 = var29_25.values();
                                var33_29 = var29_25.iterator();
                                var34_30 = 0;
                                var35_31 = null;
                                var36_32 = 0;
                                var37_33 = 0.0f;
                                while ((var8_7 = var33_29.hasNext()) != 0) {
                                    var10_9 = (sd3_0)var33_29.next();
                                    var28_24 /* !! */  = var10_9 instanceof SD3$d;
                                    if (var28_24 /* !! */  != 0) {
                                        var35_31 = var10_9;
                                        var35_31 = (SD3$d)var10_9;
                                        continue;
                                    }
                                    var11_10 = var30_26 /* !! */ ;
                                    var23_21 /* !! */  = var4_3;
                                    var38_34 /* !! */  = var5_4;
                                    var8_7 = var10_9.e(var30_26 /* !! */ , var2_2, var4_3, var5_4);
                                    var36_32 |= var8_7;
                                }
                            } else {
                                var34_30 = 0;
                                var35_31 = null;
                                var36_32 = 0;
                                var37_33 = 0.0f;
                            }
                            var10_9 = var6_5.j;
                            var33_29 = var6_5.f;
                            if (var10_9 == null) break block56;
                            var10_9 = var10_9[0];
                            var18_17 = var30_26 /* !! */ ;
                            var39_35 = var6_5.p;
                            var10_9.c(var18_17, var39_35);
                            var10_9 = var6_5.j[0];
                            var39_35 = var6_5.q;
                            var10_9.f(var18_17, var39_35);
                            var10_9 = var6_5.k;
                            if (var10_9 != null && (var15_14 = (var39_35 = var6_5.p).length) > 0) {
                                var10_9.c(var18_17, var39_35);
                                var10_9 = var6_5.k;
                                var39_35 = var6_5.q;
                                var10_9.f(var18_17, var39_35);
                            }
                            if ((var8_7 = var6_5.H) != 0) break block57;
                            var10_9 = var6_5.o;
                            var40_36 = var6_5.p;
                            var29_25 = var6_5.q;
                            var12_11 = (int)var6_5.d;
                            var41_37 = var33_29.e;
                            var14_13 = var33_29.f;
                            var32_28 = var33_29.g;
                            var43_39 = var42_38 = var33_29.h;
                            var44_40 /* !! */  = ((Object)var10_9).length;
                            if (var44_40 /* !! */  != 0) {
                                var38_34 /* !! */  = (View)var33_29.p;
                                var44_40 /* !! */  = ((View)var38_34 /* !! */ ).length;
                                var45_41 = var41_37;
                                var46_42 /* !! */  = ((View)var10_9).length;
                                var47_43 = 1;
                                var46_42 /* !! */  += -1;
                                if (var44_40 /* !! */  <= (var46_42 /* !! */  = (int)var10_9[var46_42 /* !! */ ])) {
                                    var44_40 /* !! */  = ((View)var10_9).length + -1;
                                    var44_40 /* !! */  = (int)(var10_9[var44_40 /* !! */ ] + true);
                                    var33_29.p = var48_44 = new double[var44_40 /* !! */ ];
                                    var38_34 /* !! */  = (View)new double[var44_40 /* !! */ ];
                                    var33_29.q = (double[])var38_34 /* !! */ ;
                                }
                            } else {
                                var45_41 = var41_37;
                            }
                            var38_34 /* !! */  = (View)var33_29.p;
                            var49_45 = var14_13;
                            var50_46 = 0.0 / 0.0;
                            Arrays.fill((double[])var38_34 /* !! */ , var50_46);
                            var42_38 = 0.0f;
                            var38_34 /* !! */  = null;
                            for (var44_40 /* !! */  = 0; var44_40 /* !! */  < (var46_42 /* !! */  = ((View)var10_9).length); ++var44_40 /* !! */ ) {
                                var48_44 = var33_29.p;
                                var13_12 /* !! */  = (int)var10_9[var44_40 /* !! */ ];
                                var48_44[var13_12 /* !! */ ] = var52_47 /* !! */  = var40_36[var44_40 /* !! */ ];
                                var48_44 = var33_29.q;
                                var48_44[var13_12 /* !! */ ] = var52_47 /* !! */  = (double)var29_25[var44_40 /* !! */ ];
                            }
                            var8_7 = 2143289344;
                            var9_8 = 0.0f / 0.0f;
                            var54_48 = var30_26 /* !! */ ;
                            var55_49 = var35_31;
                            var42_38 = var43_39;
                            var41_37 = var45_41;
                            var14_13 = var49_45;
                            var15_14 = 0;
                            var16_15 = 0.0f;
                            var40_36 = null;
                            var34_30 = 0;
                            var35_31 = null;
                            var45_41 = 0.0f;
                            var49_45 = 0.0f;
                            var56_50 = var36_32;
                            var36_32 = 0;
                            var37_33 = 0.0f;
                            while (true) {
                                block63: {
                                    block59: {
                                        block60: {
                                            block61: {
                                                block62: {
                                                    block58: {
                                                        var57_51 /* !! */  = var33_29.p;
                                                        var58_52 = var57_51 /* !! */ .length;
                                                        var59_53 = var12_11;
                                                        if (var34_30 >= var58_52) break;
                                                        var60_54 = var57_51 /* !! */ [var34_30];
                                                        var58_52 = (int)Double.isNaN(var60_54);
                                                        if (var58_52 == 0) break block58;
                                                        var62_55 /* !! */  = var18_17;
                                                        var21_19 = var9_8;
                                                        ** GOTO lbl-1000
                                                    }
                                                    var6_5 = var33_29.p;
                                                    var58_52 = (int)Double.isNaN((double)var6_5[var34_30]);
                                                    var60_54 = 0.0;
                                                    if (var58_52 != 0) lbl-1000:
                                                    // 2 sources

                                                    {
                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var6_5 = var33_29.p;
                                                    var62_55 /* !! */  = (double)var6_5[var34_30];
                                                    var60_54 = var62_55 /* !! */  + var60_54;
                                                    ** continue;
                                                    var62_55 /* !! */  = var18_17;
                                                    var64_56 = var60_54;
                                                    var17_16 = (float)var60_54;
                                                    var66_57 /* !! */  = (View)var33_29.q;
                                                    var21_19 = var9_8;
                                                    var67_58 /* !! */  = var66_57 /* !! */ [var34_30];
                                                    var69_59 = (float)var67_58 /* !! */ ;
                                                    var8_7 = 1;
                                                    var9_8 = 1.4E-45f;
                                                    if (var34_30 == var8_7) break block59;
                                                    var8_7 = 2;
                                                    var9_8 = 2.8E-45f;
                                                    if (var34_30 == var8_7) break block60;
                                                    var8_7 = 3;
                                                    var9_8 = 4.2E-45f;
                                                    if (var34_30 == var8_7) break block61;
                                                    var8_7 = 4;
                                                    var9_8 = 5.6E-45f;
                                                    if (var34_30 != var8_7) {
                                                        var58_52 = 5;
                                                        var69_59 = 7.0E-45f;
                                                        ** if (var34_30 == var58_52) goto lbl-1000
                                                    }
                                                    break block62;
lbl-1000:
                                                    // 6 sources

                                                    {
                                                        while (true) {
                                                            var9_8 = var21_19;
                                                            ** GOTO lbl211
                                                            break;
                                                        }
                                                    }
lbl-1000:
                                                    // 1 sources

                                                    {
                                                        var9_8 = var17_16;
                                                    }
                                                    break block63;
                                                }
                                                var49_45 = var69_59;
                                                var42_38 = var17_16;
                                                ** GOTO lbl-1000
                                            }
                                            var45_41 = var69_59;
                                            var32_28 = var17_16;
                                            ** GOTO lbl-1000
                                        }
                                        var37_33 = var69_59;
                                        var14_13 = var17_16;
                                        ** GOTO lbl-1000
                                    }
                                    var16_15 = var69_59;
                                    var41_37 = var17_16;
                                    ** continue;
                                }
                                ++var34_30;
                                var6_5 = this;
                                var12_11 = var59_53;
                                var18_17 = var62_55 /* !! */ ;
                            }
                            var62_55 /* !! */  = var18_17;
                            var21_19 = var9_8;
                            var10_9 = var33_29.m;
                            if (var10_9 != null) {
                                var58_52 = 2;
                                var31_27 /* !! */  = (qo1_1[])new float[var58_52];
                                var66_57 /* !! */  = (View)new float[var58_52];
                                var57_51 /* !! */  = (double[])var33_29;
                                var70_60 = var18_17;
                                var10_9.c(var18_17, (float[])var31_27 /* !! */ , (float[])var66_57 /* !! */ );
                                var8_7 = 0;
                                var10_9 = null;
                                var69_59 = (float)var31_27 /* !! */ [0];
                                var47_43 = 1;
                                var17_16 = (float)var31_27 /* !! */ [var47_43];
                                var72_61 = var33_29;
                                var30_26 /* !! */  = (float)var66_57 /* !! */ [0];
                                var9_8 = (float)var66_57 /* !! */ [var47_43];
                                var70_60 = var69_59;
                                var73_62 = var41_37;
                                var69_59 = var21_19;
                                var18_17 = var14_13;
                                var75_63 = Math.sin(var18_17) * var73_62 + var70_60;
                                var13_12 /* !! */  = 0x40000000;
                                var70_60 = var32_28 / 2.0f;
                                var77_64 = (float)(var75_63 - var70_60);
                                var78_65 = var17_16;
                                var75_63 = Math.cos(var18_17) * var73_62;
                                var78_65 -= var75_63;
                                var49_45 = var77_64;
                                var77_64 = var42_38 / 2.0f;
                                var17_16 = var16_15;
                                var70_60 = var77_64;
                                var14_13 = (float)(var78_65 -= var70_60);
                                var80_66 = (reference)((double)var30_26 /* !! */ );
                                var70_60 = var16_15;
                                var75_63 = Math.sin(var18_17) * var70_60 + var80_66;
                                var80_66 = (reference)(Math.cos(var18_17) * var73_62);
                                var82_67 = var37_33;
                                var80_66 = var80_66 * var82_67 + var75_63;
                                var16_15 = (float)var80_66;
                                var84_68 /* !! */  = var32_28;
                                var26_23 = var9_8;
                                var85_69 = Math.cos(var18_17) * var70_60;
                                var18_17 = Math.sin(var18_17) * var73_62 * var82_67 + (var26_23 -= var85_69);
                                var9_8 = (float)var18_17;
                                var12_11 = ((Object)var29_25).length;
                                var87_70 = 2;
                                var20_18 = 2.8E-45f;
                                if (var12_11 >= var87_70) {
                                    var64_56 = var16_15;
                                    var23_21 /* !! */  = null;
                                    var29_25[0] = var64_56;
                                    var64_56 = var9_8;
                                    var22_20 = 1;
                                    var21_19 = 1.4E-45f;
                                    var29_25[var22_20] = var64_56;
                                }
                                if ((var28_24 /* !! */  = (int)Float.isNaN(var69_59)) == 0) {
                                    var82_67 = var69_59;
                                    var67_58 /* !! */  = (View)((double)var9_8);
                                    var18_17 = var16_15;
                                    var67_58 /* !! */  = (View)(Math.toDegrees(Math.atan2((double)var67_58 /* !! */ , var18_17)) + var82_67);
                                    var69_59 = (float)var67_58 /* !! */ ;
                                    var7_6 = var5_4;
                                    var5_4.setRotation(var69_59);
                                } else {
                                    var7_6 = var5_4;
                                }
                                var41_37 = var49_45;
                            } else {
                                var69_59 = var9_8;
                                var17_16 = var16_15;
                                var84_68 /* !! */  = var32_28;
                                var72_61 = var33_29;
                                var8_7 = (int)Float.isNaN(var9_8);
                                if (var8_7 == 0) {
                                    var8_7 = 0x40000000;
                                    var9_8 = 2.0f;
                                    var11_10 = (var45_41 /= var9_8) + var16_15;
                                    var64_56 = (var49_45 /= var9_8) + var37_33;
                                    var88_71 = var11_10;
                                    var88_71 = Math.toDegrees(Math.atan2(var64_56, var88_71));
                                    var9_8 = (float)var88_71 + var21_19;
                                    var58_52 = 0;
                                    var69_59 = 0.0f;
                                    var6_5 = null;
                                    var7_6.setRotation(var9_8 += 0.0f);
                                }
                            }
                            var58_52 = var7_6 instanceof fS0;
                            if (var58_52 != 0) {
                                var32_28 = var41_37 + var84_68 /* !! */ ;
                                var6_5 = var7_6;
                                var6_5 = (fS0)var7_6;
                                var6_5.a(var41_37, var14_13, var32_28, var42_38 += var14_13);
lbl309:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var69_59 = 0.5f;
                            var8_7 = (int)(var41_37 += var69_59);
                            var58_52 = (int)(var14_13 += var69_59);
                            var28_24 /* !! */  = (int)(var41_37 += var84_68 /* !! */ );
                            var12_11 = (int)(var14_13 += var42_38);
                            var87_70 = var28_24 /* !! */  - var8_7;
                            var22_20 = var12_11 - var58_52;
                            var44_40 /* !! */  = var5_4.getMeasuredWidth();
                            if (var87_70 != var44_40 /* !! */  || var22_20 != (var44_40 /* !! */  = var5_4.getMeasuredHeight()) || var59_53 != 0) {
                                var44_40 /* !! */  = 0x40000000;
                                var42_38 = 2.0f;
                                var87_70 = View.MeasureSpec.makeMeasureSpec((int)var87_70, (int)var44_40 /* !! */ );
                                var22_20 = View.MeasureSpec.makeMeasureSpec((int)var22_20, (int)var44_40 /* !! */ );
                                var7_6.measure(var87_70, var22_20);
                            }
                            var7_6.layout(var8_7, var58_52, var28_24 /* !! */ , var12_11);
                            ** while (true)
                            var6_5 = this;
                            var8_7 = 0;
                            var9_8 = 0.0f;
                            var10_9 = null;
                            this.d = false;
                            break block64;
                        }
                        var62_55 /* !! */  = var18_17;
                        var54_48 = var30_26 /* !! */ ;
                        var72_61 = var33_29;
                        var55_49 = var35_31;
                        var56_50 = var36_32;
                    }
                    var8_7 = var6_5.C;
                    var28_24 /* !! */  = -1;
                    var11_10 = 0.0f / 0.0f;
                    if (var8_7 != var28_24 /* !! */ ) {
                        var10_9 = var6_5.D;
                        if (var10_9 == null) {
                            var10_9 = (View)var5_4.getParent();
                            var28_24 /* !! */  = var6_5.C;
                            var10_9 = var10_9.findViewById(var28_24 /* !! */ );
                            var6_5.D = var10_9;
                        }
                        if ((var10_9 = var6_5.D) != null) {
                            var8_7 = var10_9.getTop();
                            var29_25 = var6_5.D;
                            var9_8 = var29_25.getBottom() + var8_7;
                            var11_10 = 2.0f;
                            var9_8 /= var11_10;
                            var31_27 /* !! */  = var6_5.D;
                            var12_11 = var31_27 /* !! */ .getLeft();
                            var66_57 /* !! */  = var6_5.D;
                            var17_16 = (float)(var66_57 /* !! */ .getRight() + var12_11) / var11_10;
                            var28_24 /* !! */  = var5_4.getRight();
                            var87_70 = var5_4.getLeft();
                            if ((var28_24 /* !! */  -= var87_70) > 0) {
                                var28_24 /* !! */  = var5_4.getBottom();
                                var87_70 = var5_4.getTop();
                                if ((var28_24 /* !! */  -= var87_70) > 0) {
                                    var11_10 = var5_4.getLeft();
                                    var17_16 -= var11_10;
                                    var28_24 /* !! */  = var5_4.getTop();
                                    var11_10 = var28_24 /* !! */ ;
                                    var7_6.setPivotX(var17_16);
                                    var7_6.setPivotY(var9_8 -= var11_10);
                                }
                            }
                        }
                    }
                    if ((var10_9 = var6_5.y) == null) break block65;
                    var10_9 = var10_9.values().iterator();
                    while ((var28_24 /* !! */  = (int)var10_9.hasNext()) != 0) {
                        var29_25 = (Ua3)var10_9.next();
                        var12_11 = var29_25 instanceof JD3$d;
                        if (var12_11 == 0) ** GOTO lbl-1000
                        var31_27 /* !! */  = (qo1_1[])var6_5.q;
                        var87_70 = var31_27 /* !! */ .length;
                        var22_20 = 1;
                        var21_19 = 1.4E-45f;
                        if (var87_70 > var22_20) {
                            var29_25 = (JD3$d)var29_25;
                            var87_70 = 0;
                            var20_18 = 0.0f;
                            var66_57 /* !! */  = null;
                            var50_46 = (double)var31_27 /* !! */ [0];
                            var80_66 = var31_27 /* !! */ [var22_20];
                            var32_28 = var54_48;
                            var11_10 = var29_25.a(var54_48);
                            var64_56 = Math.toDegrees(Math.atan2((double)var80_66, var50_46));
                            var17_16 = (float)var64_56;
                            var7_6.setRotation(var11_10 += var17_16);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var32_28 = var54_48;
                        }
                        var54_48 = var32_28;
                    }
                }
                var32_28 = var54_48;
                if (var55_49 != null) {
                    var10_9 = var6_5.q;
                    var28_24 /* !! */  = 0;
                    var29_25 = null;
                    var50_46 = (double)var10_9[0];
                    var44_40 /* !! */  = 1;
                    var42_38 = 1.4E-45f;
                    var80_66 = var10_9[var44_40 /* !! */ ];
                    var10_9 = var55_49;
                    var11_10 = var54_48;
                    var70_60 = var62_55 /* !! */ ;
                    var23_21 /* !! */  = var4_3;
                    var36_32 = 1;
                    var37_33 = 1.4E-45f;
                    var38_34 /* !! */  = var5_4;
                    var9_8 = var55_49.d(var54_48, var2_2, var4_3, var5_4);
                    var82_67 = Math.toDegrees(Math.atan2((double)var80_66, var50_46));
                    var11_10 = (float)var82_67;
                    var7_6.setRotation(var9_8 += var11_10);
                    var8_7 = (int)var55_49.h;
                    var8_7 = var56_50 | var8_7;
                } else {
                    var70_60 = var62_55 /* !! */ ;
                    var36_32 = 1;
                    var37_33 = 1.4E-45f;
                    var8_7 = var56_50;
                }
                var42_38 = 1.4E-45f;
                for (var44_40 /* !! */  = 1; var44_40 /* !! */  < (var12_11 = ((zf0_1[])(var29_25 = var6_5.j)).length); ++var44_40 /* !! */ ) {
                    var29_25 = var29_25[var44_40 /* !! */ ];
                    var31_27 /* !! */  = (qo1_1[])var6_5.t;
                    var29_25.d(var70_60, (float[])var31_27 /* !! */ );
                    var29_25 = var72_61;
                    var66_57 /* !! */  = var72_61.n;
                    var23_21 /* !! */  = var6_5.r;
                    var46_42 /* !! */  = var44_40 /* !! */  + -1;
                    var23_21 /* !! */  = var23_21 /* !! */ [var46_42 /* !! */ ];
                    var66_57 /* !! */  = (a)var66_57 /* !! */ .get(var23_21 /* !! */ );
                    Qf0.b((a)var66_57 /* !! */ , var7_6, (float[])var31_27 /* !! */ );
                }
                var29_25 = var6_5.h;
                var12_11 = var29_25.b;
                if (var12_11 == 0) {
                    var17_16 = 0.0f;
                    var31_27 /* !! */  = null;
                    cfr_temp_1 = var32_28 - 0.0f;
                    var12_11 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                    if (var12_11 <= 0) {
                        var28_24 /* !! */  = var29_25.c;
                        var7_6.setVisibility(var28_24 /* !! */ );
                    } else {
                        var31_27 /* !! */  = var6_5.i;
                        var20_18 = 1.0f;
                        cfr_temp_2 = var32_28 - var20_18;
                        var87_70 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                        if (var87_70 >= 0) {
                            var28_24 /* !! */  = var31_27 /* !! */ .c;
                            var7_6.setVisibility(var28_24 /* !! */ );
                        } else {
                            var12_11 = var31_27 /* !! */ .c;
                            var28_24 /* !! */  = var29_25.c;
                            if (var12_11 != var28_24 /* !! */ ) {
                                var28_24 /* !! */  = 0;
                                var11_10 = 0.0f;
                                var29_25 = null;
                                var7_6.setVisibility(0);
                            }
                        }
                    }
                }
                if ((var29_25 = var6_5.A) != null) {
                    var11_10 = 0.0f;
                    var29_25 = null;
                    for (var28_24 /* !! */  = 0; var28_24 /* !! */  < (var87_70 = (var31_27 /* !! */  = var6_5.A).length); ++var28_24 /* !! */ ) {
                        var31_27 /* !! */  = var31_27 /* !! */ [var28_24 /* !! */ ];
                        var31_27 /* !! */ .h(var32_28, var7_6);
                    }
                }
                break block66;
            }
            var32_28 = var30_26 /* !! */ ;
            var29_25 = var33_29;
            var56_50 = var36_32;
            var36_32 = 1;
            var37_33 = 1.4E-45f;
            var9_8 = var33_29.e;
            var31_27 /* !! */  = var6_5.g;
            var9_8 = xu0_1.a(var31_27 /* !! */ .e, var9_8, var30_26 /* !! */ , var9_8);
            var20_18 = var33_29.f;
            var20_18 = xu0_1.a(var31_27 /* !! */ .f, var20_18, var30_26 /* !! */ , var20_18);
            var21_19 = var33_29.g;
            var42_38 = var31_27 /* !! */ .g;
            var41_37 = xu0_1.a(var42_38, var21_19, var30_26 /* !! */ , var21_19);
            var11_10 = var33_29.h;
            var17_16 = var31_27 /* !! */ .h;
            var14_13 = xu0_1.a(var17_16, var11_10, var30_26 /* !! */ , var11_10);
            var16_15 = 0.5f;
            var90_72 = (int)(var9_8 += var16_15);
            var15_14 = (int)(var20_18 += var16_15);
            var8_7 = (int)(var9_8 += var41_37);
            var87_70 = (int)(var20_18 += var14_13);
            var46_42 /* !! */  = var8_7 - var90_72;
            var13_12 /* !! */  = var87_70 - var15_14;
            var22_20 = (int)(var42_38 == var21_19 ? 0 : (var42_38 > var21_19 ? 1 : -1));
            if (var22_20 != 0 || (var28_24 /* !! */  = (int)(var17_16 == var11_10 ? 0 : (var17_16 > var11_10 ? 1 : -1))) != 0 || (var28_24 /* !! */  = (int)var6_5.d) != 0) {
                var28_24 /* !! */  = 0x40000000;
                var12_11 = View.MeasureSpec.makeMeasureSpec((int)var46_42 /* !! */ , (int)var28_24 /* !! */ );
                var28_24 /* !! */  = View.MeasureSpec.makeMeasureSpec((int)var13_12 /* !! */ , (int)var28_24 /* !! */ );
                var7_6.measure(var12_11, var28_24 /* !! */ );
                var28_24 /* !! */  = 0;
                var11_10 = 0.0f;
                var29_25 = null;
                var6_5.d = false;
            }
            var7_6.layout(var90_72, var15_14, var8_7, var87_70);
            var8_7 = var56_50;
        }
        if ((var29_25 = var6_5.z) != null) {
            var29_25 = var29_25.values().iterator();
            while ((var12_11 = (int)var29_25.hasNext()) != 0) {
                var31_27 /* !! */  = (ud3_1)var29_25.next();
                var87_70 = var31_27 /* !! */  instanceof uD3$d;
                if (var87_70 != 0) {
                    var31_27 /* !! */  = (uD3$d)var31_27 /* !! */ ;
                    var66_57 /* !! */  = (View)var6_5.q;
                    var22_20 = 0;
                    var21_19 = 0.0f;
                    var23_21 /* !! */  = null;
                    var50_46 = (double)var66_57 /* !! */ [0];
                    var80_66 = var66_57 /* !! */ [var36_32];
                    var17_16 = var31_27 /* !! */ .a(var32_28);
                    var50_46 = Math.toDegrees(Math.atan2((double)var80_66, var50_46));
                    var20_18 = (float)var50_46;
                    var7_6.setRotation(var17_16 += var20_18);
                    continue;
                }
                var22_20 = 0;
                var21_19 = 0.0f;
                var23_21 /* !! */  = null;
                var31_27 /* !! */ .f(var32_28, var7_6);
            }
        }
        return (boolean)var8_7;
    }

    public final void g(pq1_0 pq1_02) {
        float f5 = (int)this.b.getX();
        float f6 = (int)this.b.getY();
        float f7 = this.b.getWidth();
        float f8 = this.b.getHeight();
        pq1_02.g(f5, f6, f7, f8);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void i(int var1_1, int var2_2, long var3_3) {
        block240: {
            block239: {
                block236: {
                    block235: {
                        block232: {
                            block231: {
                                block225: {
                                    var5_4 = this;
                                    var6_5 /* !! */  = "translationZ";
                                    var7_6 = "translationY";
                                    var8_7 /* !! */  = "translationX";
                                    var9_8 /* !! */  = "scaleY";
                                    var10_9 /* !! */  = "scaleX";
                                    var11_10 /* !! */  = "rotationY";
                                    var12_11 /* !! */  = "rotationX";
                                    var13_12 = "progress";
                                    var14_13 /* !! */  = "transitionPathRotate";
                                    var15_14 /* !! */  = "rotation";
                                    var16_15 = "elevation";
                                    var17_16 = "alpha";
                                    var18_17 = new HashSet<E>();
                                    var19_18 = new HashSet();
                                    var20_19 = new HashSet();
                                    var21_20 /* !! */  = new HashSet();
                                    var22_21 = var19_18;
                                    var23_22 = var19_18 = new HashMap();
                                    var24_23 = this.B;
                                    var25_24 = var21_20 /* !! */ ;
                                    var21_20 /* !! */  = this.f;
                                    var26_25 = var6_5 /* !! */ ;
                                    var27_26 = -1;
                                    var28_27 = 0.0f / 0.0f;
                                    if (var24_23 != var27_26) {
                                        var21_20 /* !! */ .j = var24_23;
                                    }
                                    var19_18 = var5_4.h;
                                    var28_27 = var19_18.e;
                                    var29_28 /* !! */  = var21_20 /* !! */ ;
                                    var21_20 /* !! */  = var5_4.i;
                                    var30_29 = var21_20 /* !! */ .e;
                                    var31_30 = dQ1.c(var28_27, var30_29);
                                    if (var31_30 != 0) {
                                        var20_19.add(var17_16);
                                    }
                                    if ((var31_30 = dQ1.c(var30_29 = var19_18.f, var28_27 = var21_20 /* !! */ .f)) != 0) {
                                        var20_19.add(var16_15);
                                    }
                                    var31_30 = var19_18.c;
                                    var27_26 = var21_20 /* !! */ .c;
                                    var32_31 /* !! */  = var16_15;
                                    if (var31_30 != var27_26 && (var33_32 = var19_18.b) == 0 && (var31_30 == 0 || var27_26 == 0)) {
                                        var20_19.add(var17_16);
                                    }
                                    if ((var31_30 = (int)dQ1.c(var30_29 = var19_18.g, var28_27 = var21_20 /* !! */ .g)) != 0) {
                                        var20_19.add(var15_14 /* !! */ );
                                    }
                                    if ((var31_30 = (int)Float.isNaN(var30_29 = var19_18.p)) == 0 || (var31_30 = (int)Float.isNaN(var30_29 = var21_20 /* !! */ .p)) == 0) {
                                        var20_19.add(var14_13 /* !! */ );
                                    }
                                    if ((var31_30 = (int)Float.isNaN(var30_29 = var19_18.q)) == 0 || (var31_30 = (int)Float.isNaN(var30_29 = var21_20 /* !! */ .q)) == 0) {
                                        var20_19.add(var13_12);
                                    }
                                    if ((var31_30 = (int)dQ1.c(var30_29 = var19_18.h, var28_27 = var21_20 /* !! */ .h)) != 0) {
                                        var20_19.add(var12_11 /* !! */ );
                                    }
                                    if ((var31_30 = (int)dQ1.c(var30_29 = var19_18.a, var28_27 = var21_20 /* !! */ .a)) != 0) {
                                        var20_19.add(var11_10 /* !! */ );
                                    }
                                    if ((var31_30 = (int)dQ1.c(var30_29 = var19_18.k, var28_27 = var21_20 /* !! */ .k)) != 0) {
                                        var5_4 = "transformPivotX";
                                        var20_19.add(var5_4);
                                    }
                                    if ((var31_30 = (int)dQ1.c(var30_29 = var19_18.l, var28_27 = var21_20 /* !! */ .l)) != 0) {
                                        var5_4 = "transformPivotY";
                                        var20_19.add(var5_4);
                                    }
                                    if ((var31_30 = (int)dQ1.c(var30_29 = var19_18.i, var28_27 = var21_20 /* !! */ .i)) != 0) {
                                        var20_19.add(var10_9 /* !! */ );
                                    }
                                    if ((var31_30 = (int)dQ1.c(var30_29 = var19_18.j, var28_27 = var21_20 /* !! */ .j)) != 0) {
                                        var20_19.add(var9_8 /* !! */ );
                                    }
                                    if ((var31_30 = (int)dQ1.c(var30_29 = var19_18.m, var28_27 = var21_20 /* !! */ .m)) != 0) {
                                        var20_19.add(var8_7 /* !! */ );
                                    }
                                    if ((var31_30 = (int)dQ1.c(var30_29 = var19_18.n, var28_27 = var21_20 /* !! */ .n)) != 0) {
                                        var20_19.add(var7_6);
                                    }
                                    if ((var31_30 = (int)dQ1.c(var30_29 = var19_18.o, var28_27 = var21_20 /* !! */ .o)) != 0) {
                                        var5_4 = var26_25;
                                        var20_19.add(var26_25);
lbl85:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var5_4 = var26_25;
                                    ** while (true)
                                    var6_5 /* !! */  = this;
                                    var16_15 = this.w;
                                    var26_25 = var21_20 /* !! */ ;
                                    var21_20 /* !! */  = this.g;
                                    var34_33 = var19_18;
                                    var19_18 = this.u;
                                    var35_34 /* !! */  = var12_11 /* !! */ ;
                                    if (var16_15 == null) break block225;
                                    var36_35 = var16_15.iterator();
                                    var37_36 = null;
                                    while (var38_37 = var36_35.hasNext()) {
                                        block230: {
                                            block229: {
                                                block226: {
                                                    block221: {
                                                        block228: {
                                                            block227: {
                                                                var39_38 /* !! */  = var36_35.next();
                                                                var12_11 /* !! */  = var39_38 /* !! */ ;
                                                                var12_11 /* !! */  = (Pn1)var39_38 /* !! */ ;
                                                                var39_38 /* !! */  = var11_10 /* !! */ ;
                                                                var40_39 /* !! */  = var12_11 /* !! */  instanceof no1_0;
                                                                if (var40_39 /* !! */  == 0) break block226;
                                                                var12_11 /* !! */  = (no1_0)var12_11 /* !! */ ;
                                                                var11_10 /* !! */  = new Object();
                                                                var41_40 /* !! */  = var8_7 /* !! */ ;
                                                                var11_10 /* !! */ .b = 0;
                                                                var11_10 /* !! */ .i = 0.0f / 0.0f;
                                                                var11_10 /* !! */ .j = var42_41 = -1;
                                                                var11_10 /* !! */ .k = var42_41;
                                                                var11_10 /* !! */ .l = 0.0f / 0.0f;
                                                                var11_10 /* !! */ .m = null;
                                                                var8_7 /* !! */  = new LinkedHashMap();
                                                                var11_10 /* !! */ .n = var8_7 /* !! */ ;
                                                                var8_7 /* !! */  = null;
                                                                var11_10 /* !! */ .o = 0;
                                                                var43_42 = var7_6;
                                                                var42_41 = 18;
                                                                var44_43 = 2.5E-44f;
                                                                var7_6 = new double[var42_41];
                                                                var11_10 /* !! */ .p = (double[])var7_6;
                                                                var7_6 = new double[var42_41];
                                                                var11_10 /* !! */ .q = (double[])var7_6;
                                                                var7_6 = var29_28 /* !! */ ;
                                                                var42_41 = var29_28 /* !! */ .k;
                                                                var45_44 = 100.0f;
                                                                var46_45 = var5_4;
                                                                var31_30 = -1;
                                                                var30_29 = 0.0f / 0.0f;
                                                                if (var42_41 == var31_30) break block227;
                                                                var31_30 = var12_11 /* !! */ .a;
                                                                var11_10 /* !! */ .c = var30_29 = (float)var31_30 / var45_44;
                                                                var11_10 /* !! */ .b = var42_41 = var12_11 /* !! */ .h;
                                                                var11_10 /* !! */ .o = var42_41 = var12_11 /* !! */ .o;
                                                                var44_43 = var12_11 /* !! */ .i;
                                                                var42_41 = (int)Float.isNaN(var44_43);
                                                                if (var42_41 != 0) {
                                                                    var44_43 = var30_29;
lbl141:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var44_43 = var12_11 /* !! */ .i;
                                                                ** continue;
                                                                var47_46 /* !! */  = var13_12;
                                                                var48_47 = var12_11 /* !! */ .j;
                                                                var49_48 = (int)Float.isNaN(var48_47);
                                                                if (var49_48 != 0) {
                                                                    var48_47 = var30_29;
lbl150:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var48_47 = var12_11 /* !! */ .j;
                                                                ** continue;
                                                                var50_49 /* !! */  = var10_9 /* !! */ ;
                                                                var51_50 = var21_20 /* !! */ .g;
                                                                var52_51 = var9_8 /* !! */ ;
                                                                var53_52 = var7_6.g;
                                                                var51_50 -= var53_52;
                                                                var54_53 /* !! */  = var15_14 /* !! */ ;
                                                                var55_54 = var21_20 /* !! */ .h;
                                                                var56_55 /* !! */  = var14_13 /* !! */ ;
                                                                var57_56 = var7_6.h;
                                                                var55_54 -= var57_56;
                                                                var58_57 /* !! */  = var17_16;
                                                                var11_10 /* !! */ .d = var59_58 = var11_10 /* !! */ .c;
                                                                var51_50 = var51_50 * var44_43 + var53_52;
                                                                var11_10 /* !! */ .g = var59_58 = (float)((int)var51_50);
                                                                var55_54 = var55_54 * var48_47 + var57_56;
                                                                var11_10 /* !! */ .h = var59_58 = (float)((int)var55_54);
                                                                var60_59 /* !! */  = var12_11 /* !! */ .o;
                                                                var61_60 = 2;
                                                                var53_52 = 2.8E-45f;
                                                                if (var60_59 /* !! */  != var61_60) {
                                                                    var59_58 = var12_11 /* !! */ .k;
                                                                    var60_59 /* !! */  = (int)Float.isNaN(var59_58);
                                                                    var59_58 = var60_59 /* !! */  != 0 ? var30_29 : var12_11 /* !! */ .k;
                                                                    var44_43 = var21_20 /* !! */ .e;
                                                                    var53_52 = var7_6.e;
                                                                    var11_10 /* !! */ .e = var59_58 = xu0_1.a(var44_43, var53_52, var59_58, var53_52);
                                                                    var59_58 = var12_11 /* !! */ .l;
                                                                    var60_59 /* !! */  = (int)Float.isNaN(var59_58);
                                                                    if (var60_59 /* !! */  == 0) {
                                                                        var30_29 = var12_11 /* !! */ .l;
                                                                    }
                                                                    var59_58 = var21_20 /* !! */ .f;
                                                                    var44_43 = var7_6.f;
                                                                    var11_10 /* !! */ .f = var30_29 = xu0_1.a(var59_58, var44_43, var30_29, var44_43);
                                                                } else {
                                                                    var59_58 = var12_11 /* !! */ .k;
                                                                    var60_59 /* !! */  = (int)Float.isNaN(var59_58);
                                                                    if (var60_59 /* !! */  != 0) {
                                                                        var59_58 = var21_20 /* !! */ .e;
                                                                        var44_43 = var7_6.e;
                                                                        var59_58 = xu0_1.a(var59_58, var44_43, var30_29, var44_43);
                                                                    } else {
                                                                        var59_58 = var12_11 /* !! */ .k;
                                                                        var44_43 = Math.min(var48_47, var44_43);
                                                                        var59_58 *= var44_43;
                                                                    }
                                                                    var11_10 /* !! */ .e = var59_58;
                                                                    var59_58 = var12_11 /* !! */ .l;
                                                                    var60_59 /* !! */  = (int)Float.isNaN(var59_58);
                                                                    if (var60_59 /* !! */  != 0) {
                                                                        var59_58 = var21_20 /* !! */ .f;
                                                                        var44_43 = var7_6.f;
                                                                        var30_29 = xu0_1.a(var59_58, var44_43, var30_29, var44_43);
                                                                    } else {
                                                                        var30_29 = var12_11 /* !! */ .l;
                                                                    }
                                                                    var11_10 /* !! */ .f = var30_29;
                                                                }
                                                                var11_10 /* !! */ .k = var31_30 = var7_6.k;
                                                                var11_10 /* !! */ .a = var5_4 = bx0_0.c(var12_11 /* !! */ .f);
                                                                var11_10 /* !! */ .j = var31_30 = var12_11 /* !! */ .g;
                                                                var62_61 = var20_19;
                                                                var5_4 = var19_18;
                                                                var8_7 /* !! */  = var7_6;
                                                                var19_18 = var12_11 /* !! */ ;
                                                                var63_62 = var16_15;
                                                                break block221;
                                                            }
                                                            var58_57 /* !! */  = var17_16;
                                                            var52_51 = var9_8 /* !! */ ;
                                                            var50_49 /* !! */  = var10_9 /* !! */ ;
                                                            var47_46 /* !! */  = var13_12;
                                                            var56_55 /* !! */  = var14_13 /* !! */ ;
                                                            var54_53 /* !! */  = var15_14 /* !! */ ;
                                                            var31_30 = var12_11 /* !! */ .o;
                                                            var61_60 = 1;
                                                            var53_52 = 1.4E-45f;
                                                            if (var31_30 == var61_60) break block228;
                                                            var61_60 = 2;
                                                            var53_52 = 2.8E-45f;
                                                            if (var31_30 == var61_60) ** GOTO lbl412
                                                            var61_60 = 3;
                                                            var53_52 = 4.2E-45f;
                                                            if (var31_30 != var61_60) {
                                                                var31_30 = var12_11 /* !! */ .a;
                                                                var11_10 /* !! */ .c = var30_29 = (float)var31_30 / var45_44;
                                                                var11_10 /* !! */ .b = var61_60 = var12_11 /* !! */ .h;
                                                                var53_52 = var12_11 /* !! */ .i;
                                                                var61_60 = (int)Float.isNaN(var53_52);
                                                                var53_52 = var61_60 != 0 ? var30_29 : var12_11 /* !! */ .i;
                                                                var51_50 = var12_11 /* !! */ .j;
                                                                var64_63 /* !! */  = Float.isNaN(var51_50);
                                                                var51_50 = var64_63 /* !! */  != 0 ? var30_29 : var12_11 /* !! */ .j;
                                                                var48_47 = var21_20 /* !! */ .g;
                                                                var57_56 = var7_6.g;
                                                                var55_54 = var48_47 - var57_56;
                                                                var59_58 = var21_20 /* !! */ .h;
                                                                var44_43 = var7_6.h;
                                                                var45_44 = var59_58 - var44_43;
                                                                var63_62 = var16_15;
                                                                var11_10 /* !! */ .d = var65_64 = var11_10 /* !! */ .c;
                                                                var65_64 = var7_6.e;
                                                                var66_65 = 2.0f;
                                                                var67_66 = var57_56 / var66_65 + var65_64;
                                                                var62_61 = var20_19;
                                                                var68_67 = var7_6.f;
                                                                var69_68 = var44_43 / var66_65 + var68_67;
                                                                var28_27 = var21_20 /* !! */ .e;
                                                                var48_47 = var48_47 / var66_65 + var28_27;
                                                                var28_27 = var21_20 /* !! */ .f;
                                                                var59_58 = var59_58 / var66_65 + var28_27;
                                                                var28_27 = (var48_47 -= var67_66) * var30_29 + var65_64;
                                                                var55_54 *= var53_52;
                                                                var53_52 = var55_54 / var66_65;
                                                                var11_10 /* !! */ .e = var28_27 = (float)((int)(var28_27 - var53_52));
                                                                var28_27 = (var59_58 -= var69_68) * var30_29 + var68_67;
                                                                var68_67 = (var45_44 *= var51_50) / var66_65;
                                                                var11_10 /* !! */ .f = var28_27 = (float)((int)(var28_27 - var68_67));
                                                                var11_10 /* !! */ .g = var28_27 = (float)((int)(var57_56 += var55_54));
                                                                var11_10 /* !! */ .h = var28_27 = (float)((int)(var44_43 += var45_44));
                                                                var28_27 = var12_11 /* !! */ .k;
                                                                var27_26 = (int)Float.isNaN(var28_27);
                                                                var28_27 = var27_26 != 0 ? var30_29 : var12_11 /* !! */ .k;
                                                                var44_43 = var12_11 /* !! */ .n;
                                                                var42_41 = (int)Float.isNaN(var44_43);
                                                                if (var42_41 != 0) {
                                                                    var42_41 = 0;
                                                                    var44_43 = 0.0f;
                                                                    var8_7 /* !! */  = null;
                                                                } else {
                                                                    var44_43 = var12_11 /* !! */ .n;
                                                                }
                                                                var51_50 = var12_11 /* !! */ .l;
                                                                var64_63 /* !! */  = (int)Float.isNaN(var51_50);
                                                                if (var64_63 /* !! */  == 0) {
                                                                    var30_29 = var12_11 /* !! */ .l;
                                                                }
                                                                var51_50 = var12_11 /* !! */ .m;
                                                                var64_63 /* !! */  = (int)Float.isNaN(var51_50);
                                                                if (var64_63 /* !! */  != 0) {
                                                                    var64_63 /* !! */  = 0;
                                                                    var51_50 = 0.0f;
                                                                    var10_9 /* !! */  = null;
                                                                    var70_69 = 0.0f;
                                                                } else {
                                                                    var70_69 = var12_11 /* !! */ .m;
                                                                    var64_63 /* !! */  = 0;
                                                                    var51_50 = 0.0f;
                                                                    var10_9 /* !! */  = null;
                                                                }
                                                                var11_10 /* !! */ .o = 0;
                                                                var51_50 = var7_6.e;
                                                                var28_27 = var28_27 * var48_47 + var51_50;
                                                                var70_69 = var70_69 * var59_58 + var28_27;
                                                                var27_26 = (int)(var70_69 - var53_52);
                                                                var11_10 /* !! */ .e = var28_27 = (float)var27_26;
                                                                var28_27 = var7_6.f;
                                                                var48_47 = var48_47 * var44_43 + var28_27;
                                                                var59_58 = var59_58 * var30_29 + var48_47 - var68_67;
                                                                var11_10 /* !! */ .f = var30_29 = (float)((int)var59_58);
                                                                var5_4 = bx0_0.c(var12_11 /* !! */ .f);
                                                                var11_10 /* !! */ .a = var5_4;
                                                                var11_10 /* !! */ .j = var31_30 = var12_11 /* !! */ .g;
                                                                var5_4 = var19_18;
                                                                var8_7 /* !! */  = var7_6;
                                                                var19_18 = var12_11 /* !! */ ;
                                                            } else {
                                                                var62_61 = var20_19;
                                                                var63_62 = var16_15;
                                                                var31_30 = var12_11 /* !! */ .a;
                                                                var11_10 /* !! */ .c = var30_29 = (float)var31_30 / var45_44;
                                                                var11_10 /* !! */ .b = var60_59 /* !! */  = var12_11 /* !! */ .h;
                                                                var59_58 = var12_11 /* !! */ .i;
                                                                var60_59 /* !! */  = (int)Float.isNaN(var59_58);
                                                                var59_58 = var60_59 /* !! */  != 0 ? var30_29 : var12_11 /* !! */ .i;
                                                                var68_67 = var12_11 /* !! */ .j;
                                                                var71_70 = Float.isNaN(var68_67);
                                                                var68_67 = var71_70 != 0 ? var30_29 : var12_11 /* !! */ .j;
                                                                var28_27 = var21_20 /* !! */ .g;
                                                                var44_43 = var7_6.g;
                                                                var53_52 = var28_27 - var44_43;
                                                                var51_50 = var21_20 /* !! */ .h;
                                                                var48_47 = var7_6.h;
                                                                var57_56 = var51_50 - var48_47;
                                                                var11_10 /* !! */ .d = var55_54 = var11_10 /* !! */ .c;
                                                                var55_54 = var7_6.e;
                                                                var33_32 = 0x40000000;
                                                                var65_64 = 2.0f;
                                                                var45_44 = var44_43 / var65_64 + var55_54;
                                                                var72_71 = var19_18;
                                                                var73_72 = var7_6.f;
                                                                var66_65 = var48_47 / var65_64;
                                                                var69_68 = var66_65 + var73_72;
                                                                var74_73 = var7_6;
                                                                var75_74 = var21_20 /* !! */ .e;
                                                                var28_27 = var28_27 / var65_64 + var75_74;
                                                                var75_74 = var21_20 /* !! */ .f;
                                                                var51_50 = var51_50 / var65_64 + var75_74;
                                                                var76_75 = (int)(var45_44 == var28_27 ? 0 : (var45_44 > var28_27 ? 1 : -1));
                                                                if (var76_75 > 0) {
                                                                    var77_76 = var45_44;
                                                                    var45_44 = var28_27;
                                                                    var28_27 = var77_76;
                                                                }
                                                                if ((var76_75 = (int)(var69_68 == var51_50 ? 0 : (var69_68 > var51_50 ? 1 : -1))) <= 0) {
                                                                    var77_76 = var69_68;
                                                                    var69_68 = var51_50;
                                                                    var51_50 = var77_76;
                                                                }
                                                                var69_68 -= var51_50;
                                                                var75_74 = (var28_27 -= var45_44) * var30_29 + var55_54;
                                                                var53_52 *= var59_58;
                                                                var60_59 /* !! */  = 0x40000000;
                                                                var59_58 = 2.0f;
                                                                var51_50 = var53_52 / var59_58;
                                                                var76_75 = (int)(var75_74 - var51_50);
                                                                var11_10 /* !! */ .e = var75_74 = (float)var76_75;
                                                                var75_74 = var69_68 * var30_29 + var73_72;
                                                                var59_58 = (var57_56 *= var68_67) / var59_58;
                                                                var11_10 /* !! */ .f = var68_67 = (float)((int)(var75_74 -= var59_58));
                                                                var11_10 /* !! */ .g = var68_67 = (float)((int)(var44_43 += var53_52));
                                                                var11_10 /* !! */ .h = var68_67 = (float)((int)(var48_47 += var57_56));
                                                                var68_67 = var12_11 /* !! */ .k;
                                                                var71_70 = (int)Float.isNaN(var68_67);
                                                                var68_67 = var71_70 != 0 ? var30_29 : var12_11 /* !! */ .k;
                                                                var73_72 = var12_11 /* !! */ .n;
                                                                var24_23 = (int)Float.isNaN(var73_72);
                                                                if (var24_23 != 0) {
                                                                    var24_23 = 0;
                                                                    var73_72 = 0.0f;
                                                                    var19_18 = null;
                                                                } else {
                                                                    var73_72 = var12_11 /* !! */ .n;
                                                                }
                                                                var75_74 = var12_11 /* !! */ .l;
                                                                var76_75 = (int)Float.isNaN(var75_74);
                                                                if (var76_75 == 0) {
                                                                    var30_29 = var12_11 /* !! */ .l;
                                                                }
                                                                var75_74 = var12_11 /* !! */ .m;
                                                                var76_75 = (int)Float.isNaN(var75_74);
                                                                if (var76_75 != 0) {
                                                                    var76_75 = 0;
                                                                    var75_74 = 0.0f;
                                                                    var7_6 = null;
                                                                    var70_69 = 0.0f;
                                                                } else {
                                                                    var70_69 = var12_11 /* !! */ .m;
                                                                    var76_75 = 0;
                                                                    var75_74 = 0.0f;
                                                                    var7_6 = null;
                                                                }
                                                                var11_10 /* !! */ .o = 0;
                                                                var7_6 = var74_73;
                                                                var44_43 = var74_73.e;
                                                                var68_67 = var68_67 * var28_27 + var44_43;
                                                                var70_69 = var70_69 * var69_68 + var68_67;
                                                                var71_70 = (int)(var70_69 - var51_50);
                                                                var11_10 /* !! */ .e = var68_67 = (float)var71_70;
                                                                var68_67 = var74_73.f;
                                                                var28_27 = var28_27 * var73_72 + var68_67;
                                                                var69_68 = var69_68 * var30_29 + var28_27;
                                                                var11_10 /* !! */ .f = var30_29 = (float)((int)(var69_68 - var59_58));
                                                                var11_10 /* !! */ .a = var5_4 = bx0_0.c(var12_11 /* !! */ .f);
                                                                var11_10 /* !! */ .j = var31_30 = var12_11 /* !! */ .g;
                                                                var8_7 /* !! */  = var74_73;
                                                                var19_18 = var12_11 /* !! */ ;
lbl409:
                                                                // 2 sources

                                                                while (true) {
                                                                    var5_4 = var72_71;
                                                                    break block221;
                                                                    break;
                                                                }
lbl412:
                                                                // 1 sources

                                                                var62_61 = var20_19;
                                                                var72_71 = var19_18;
                                                                var63_62 = var16_15;
                                                                var31_30 = var12_11 /* !! */ .a;
                                                                var11_10 /* !! */ .c = var30_29 = (float)var31_30 / var45_44;
                                                                var11_10 /* !! */ .b = var60_59 /* !! */  = var12_11 /* !! */ .h;
                                                                var59_58 = var12_11 /* !! */ .i;
                                                                var60_59 /* !! */  = (int)Float.isNaN(var59_58);
                                                                var59_58 = var60_59 /* !! */  != 0 ? var30_29 : var12_11 /* !! */ .i;
                                                                var68_67 = var12_11 /* !! */ .j;
                                                                var71_70 = Float.isNaN(var68_67);
                                                                var68_67 = var71_70 != 0 ? var30_29 : var12_11 /* !! */ .j;
                                                                var73_72 = var21_20 /* !! */ .g;
                                                                var28_27 = var7_6.g;
                                                                var44_43 = var73_72 - var28_27;
                                                                var53_52 = var21_20 /* !! */ .h;
                                                                var51_50 = var7_6.h;
                                                                var48_47 = var53_52 - var51_50;
                                                                var11_10 /* !! */ .d = var57_56 = var11_10 /* !! */ .c;
                                                                var57_56 = var7_6.e;
                                                                var78_77 = 0x40000000;
                                                                var55_54 = 2.0f;
                                                                var65_64 = var28_27 / var55_54 + var57_56;
                                                                var79_78 = var7_6.f;
                                                                var45_44 = var51_50 / var55_54 + var79_78;
                                                                var74_73 = var7_6;
                                                                var75_74 = var21_20 /* !! */ .e;
                                                                var73_72 = var73_72 / var55_54 + var75_74;
                                                                var75_74 = var21_20 /* !! */ .f;
                                                                var53_52 = var53_52 / var55_54 + var75_74;
                                                                var73_72 -= var65_64;
                                                                var53_52 -= var45_44;
                                                                var73_72 = var73_72 * var30_29 + var57_56;
                                                                var44_43 *= var59_58;
                                                                var59_58 = var44_43 / var55_54;
                                                                var60_59 /* !! */  = (int)(var73_72 -= var59_58);
                                                                var11_10 /* !! */ .e = var59_58 = (float)var60_59 /* !! */ ;
                                                                var53_52 = var53_52 * var30_29 + var79_78;
                                                                var30_29 = (var48_47 *= var68_67) / var55_54;
                                                                var53_52 -= var30_29;
                                                                var11_10 /* !! */ .f = var30_29 = (float)((int)var53_52);
                                                                var11_10 /* !! */ .g = var30_29 = (float)((int)(var28_27 += var44_43));
                                                                var11_10 /* !! */ .h = var30_29 = (float)((int)(var51_50 += var48_47));
                                                                var11_10 /* !! */ .o = 2;
                                                                var30_29 = var12_11 /* !! */ .k;
                                                                var31_30 = (int)Float.isNaN(var30_29);
                                                                if (var31_30 == 0) {
                                                                    var31_30 = (int)var11_10 /* !! */ .g;
                                                                    var31_30 = var1_1 - var31_30;
                                                                    var59_58 = var12_11 /* !! */ .k;
                                                                    var30_29 = var31_30;
                                                                    var31_30 = (int)(var59_58 *= var30_29);
                                                                    var11_10 /* !! */ .e = var30_29 = (float)var31_30;
                                                                }
                                                                if ((var31_30 = (int)Float.isNaN(var30_29 = var12_11 /* !! */ .l)) == 0) {
                                                                    var31_30 = (int)var11_10 /* !! */ .h;
                                                                    var31_30 = var2_2 - var31_30;
                                                                    var59_58 = var12_11 /* !! */ .l;
                                                                    var30_29 = var31_30;
                                                                    var31_30 = (int)(var59_58 *= var30_29);
                                                                    var11_10 /* !! */ .f = var30_29 = (float)var31_30;
                                                                }
                                                                var11_10 /* !! */ .k = var31_30 = var11_10 /* !! */ .k;
                                                                var5_4 = bx0_0.c(var12_11 /* !! */ .f);
                                                                var11_10 /* !! */ .a = var5_4;
                                                                var11_10 /* !! */ .j = var31_30 = var12_11 /* !! */ .g;
                                                                var19_18 = var12_11 /* !! */ ;
                                                                var5_4 = var72_71;
                                                                var8_7 /* !! */  = var74_73;
                                                            }
                                                            break block221;
                                                        }
                                                        var62_61 = var20_19;
                                                        var72_71 = var19_18;
                                                        var74_73 = var29_28 /* !! */ ;
                                                        var63_62 = var16_15;
                                                        var31_30 = var12_11 /* !! */ .a;
                                                        var11_10 /* !! */ .c = var30_29 = (float)var31_30 / var45_44;
                                                        var11_10 /* !! */ .b = var60_59 /* !! */  = var12_11 /* !! */ .h;
                                                        var59_58 = var12_11 /* !! */ .i;
                                                        var60_59 /* !! */  = (int)Float.isNaN(var59_58);
                                                        var59_58 = var60_59 /* !! */  != 0 ? var30_29 : var12_11 /* !! */ .i;
                                                        var68_67 = var12_11 /* !! */ .j;
                                                        var71_70 = Float.isNaN(var68_67);
                                                        var68_67 = var71_70 != 0 ? var30_29 : var12_11 /* !! */ .j;
                                                        var73_72 = var21_20 /* !! */ .g;
                                                        var6_5 /* !! */  = var74_73;
                                                        var75_74 = var74_73.g;
                                                        var73_72 -= var75_74;
                                                        var75_74 = var21_20 /* !! */ .h;
                                                        var44_43 = var74_73.h;
                                                        var75_74 -= var44_43;
                                                        var11_10 /* !! */ .d = var44_43 = var11_10 /* !! */ .c;
                                                        var44_43 = var12_11 /* !! */ .k;
                                                        var42_41 = (int)Float.isNaN(var44_43);
                                                        if (var42_41 == 0) {
                                                            var30_29 = var12_11 /* !! */ .k;
                                                        }
                                                        var44_43 = var6_5 /* !! */ .e;
                                                        var53_52 = var6_5 /* !! */ .g;
                                                        var64_63 /* !! */  = 0x40000000;
                                                        var51_50 = 2.0f;
                                                        var48_47 = var53_52 / var51_50 + var44_43;
                                                        var57_56 = var6_5 /* !! */ .f;
                                                        var55_54 = var6_5 /* !! */ .h;
                                                        var65_64 = var55_54 / var51_50 + var57_56;
                                                        var29_28 /* !! */  = var6_5 /* !! */ ;
                                                        var28_27 = var21_20 /* !! */ .e;
                                                        var79_78 = var21_20 /* !! */ .g / var51_50 + var28_27;
                                                        var28_27 = var21_20 /* !! */ .f;
                                                        var66_65 = var55_54;
                                                        var55_54 = var21_20 /* !! */ .h / var51_50 + var28_27;
                                                        var55_54 -= var65_64;
                                                        var28_27 = (var79_78 -= var48_47) * var30_29;
                                                        var44_43 += var28_27;
                                                        var73_72 *= var59_58;
                                                        var59_58 = var73_72 / var51_50;
                                                        var11_10 /* !! */ .e = var44_43 = (float)((int)(var44_43 - var59_58));
                                                        var57_56 += (var30_29 *= var55_54);
                                                        var75_74 *= var68_67;
                                                        var68_67 = var75_74 / var51_50;
                                                        var42_41 = (int)(var57_56 -= var68_67);
                                                        var11_10 /* !! */ .f = var44_43 = (float)var42_41;
                                                        var53_52 += var73_72;
                                                        var11_10 /* !! */ .g = var73_72 = (float)((int)var53_52);
                                                        var24_23 = (int)(var66_65 + var75_74);
                                                        var11_10 /* !! */ .h = var73_72 = (float)var24_23;
                                                        var19_18 = var12_11 /* !! */ ;
                                                        var75_74 = var12_11 /* !! */ .l;
                                                        var76_75 = (int)Float.isNaN(var75_74);
                                                        var70_69 = var76_75 != 0 ? 0.0f : (var75_74 = var12_11 /* !! */ .l);
                                                        var75_74 = -var55_54 * var70_69;
                                                        var79_78 *= var70_69;
                                                        var42_41 = 1;
                                                        var44_43 = 1.4E-45f;
                                                        var11_10 /* !! */ .o = var42_41;
                                                        var8_7 /* !! */  = var29_28 /* !! */ ;
                                                        var53_52 = var29_28 /* !! */ .e + var28_27 - var59_58;
                                                        var60_59 /* !! */  = (int)var53_52;
                                                        var59_58 = var60_59 /* !! */ ;
                                                        var28_27 = var29_28 /* !! */ .f + var30_29 - var68_67;
                                                        var30_29 = (int)var28_27;
                                                        var11_10 /* !! */ .e = var59_58 += var75_74;
                                                        var11_10 /* !! */ .f = var30_29 += var79_78;
                                                        var11_10 /* !! */ .k = var31_30 = var11_10 /* !! */ .k;
                                                        var5_4 = bx0_0.c(var19_18.f);
                                                        var11_10 /* !! */ .a = var5_4;
                                                        var11_10 /* !! */ .j = var31_30 = var19_18.g;
                                                        ** continue;
                                                    }
                                                    var60_59 /* !! */  = -Collections.binarySearch(var5_4, var11_10 /* !! */ ) - 1;
                                                    var5_4.add(var60_59 /* !! */ , var11_10 /* !! */ );
                                                    var60_59 /* !! */  = var19_18.e;
                                                    var71_70 = -1;
                                                    var68_67 = 0.0f / 0.0f;
                                                    if (var60_59 /* !! */  != var71_70) {
                                                        var20_19 = this;
                                                        this.e = var60_59 /* !! */ ;
                                                    } else {
                                                        var20_19 = this;
                                                    }
                                                    var19_18 = var22_21;
                                                    var6_5 /* !! */  = var23_22;
                                                    var17_16 = var25_24;
                                                    ** GOTO lbl611
                                                }
                                                var46_45 = var5_4;
                                                var58_57 /* !! */  = var17_16;
                                                var62_61 = var20_19;
                                                var5_4 = var19_18;
                                                var20_19 = var6_5 /* !! */ ;
                                                var43_42 = var7_6;
                                                var41_40 /* !! */  = var8_7 /* !! */ ;
                                                var52_51 = var9_8 /* !! */ ;
                                                var50_49 /* !! */  = var10_9 /* !! */ ;
                                                var47_46 /* !! */  = var13_12;
                                                var56_55 /* !! */  = var14_13 /* !! */ ;
                                                var54_53 /* !! */  = var15_14 /* !! */ ;
                                                var63_62 = var16_15;
                                                var8_7 /* !! */  = var29_28 /* !! */ ;
                                                var60_59 /* !! */  = var12_11 /* !! */  instanceof vn1_1;
                                                if (var60_59 /* !! */  == 0) break block229;
                                                var17_16 = var25_24;
                                                ((Pn1)var12_11 /* !! */ ).d((HashSet)var25_24);
                                                var19_18 = var22_21;
                                                ** GOTO lbl610
                                            }
                                            var17_16 = var25_24;
                                            var24_23 = var12_11 /* !! */  instanceof po1_0;
                                            if (var24_23 == 0) break block230;
                                            var19_18 = var22_21;
                                            ((Pn1)var12_11 /* !! */ ).d((HashSet)var22_21);
                                            ** GOTO lbl610
                                        }
                                        var19_18 = var22_21;
                                        var27_26 = var12_11 /* !! */  instanceof qo1_1;
                                        if (var27_26 != 0) {
                                            if (var37_36 == null) {
                                                var37_36 = new ArrayList<String[]>();
                                            }
                                            var6_5 /* !! */  = var37_36;
                                            var12_11 /* !! */  = (qo1_1)var12_11 /* !! */ ;
                                            var37_36.add(var12_11 /* !! */ );
lbl610:
                                            // 3 sources

                                            var6_5 /* !! */  = var23_22;
lbl611:
                                            // 2 sources

                                            var7_6 = var62_61;
                                        } else {
                                            var6_5 /* !! */  = var23_22;
                                            var12_11 /* !! */ .f((HashMap)var23_22);
                                            var7_6 = var62_61;
                                            var12_11 /* !! */ .d((HashSet)var62_61);
                                        }
                                        var25_24 = var17_16;
                                        var22_21 = var19_18;
                                        var23_22 = var6_5 /* !! */ ;
                                        var29_28 /* !! */  = var8_7 /* !! */ ;
                                        var11_10 /* !! */  = var39_38 /* !! */ ;
                                        var8_7 /* !! */  = var41_40 /* !! */ ;
                                        var13_12 = var47_46 /* !! */ ;
                                        var10_9 /* !! */  = var50_49 /* !! */ ;
                                        var9_8 /* !! */  = var52_51;
                                        var15_14 /* !! */  = var54_53 /* !! */ ;
                                        var14_13 /* !! */  = var56_55 /* !! */ ;
                                        var17_16 = var58_57 /* !! */ ;
                                        var16_15 = var63_62;
                                        var19_18 = var5_4;
                                        var6_5 /* !! */  = var20_19;
                                        var20_19 = var7_6;
                                        var7_6 = var43_42;
                                        var5_4 = var46_45;
                                    }
                                    var46_45 = var5_4;
                                    var58_57 /* !! */  = var17_16;
                                    var5_4 = var19_18;
                                    var43_42 = var7_6;
                                    var41_40 /* !! */  = var8_7 /* !! */ ;
                                    var52_51 = var9_8 /* !! */ ;
                                    var50_49 /* !! */  = var10_9 /* !! */ ;
                                    var39_38 /* !! */  = var11_10 /* !! */ ;
                                    var47_46 /* !! */  = var13_12;
                                    var56_55 /* !! */  = var14_13 /* !! */ ;
                                    var54_53 /* !! */  = var15_14 /* !! */ ;
                                    var63_62 = var16_15;
                                    var19_18 = var22_21;
                                    var17_16 = var25_24;
                                    var8_7 /* !! */  = var29_28 /* !! */ ;
                                    var7_6 = var20_19;
                                    var20_19 = var6_5 /* !! */ ;
                                    var6_5 /* !! */  = var23_22;
                                    var9_8 /* !! */  = var37_36;
                                    break block231;
                                }
                                var46_45 = var5_4;
                                var58_57 /* !! */  = var17_16;
                                var5_4 = var19_18;
                                var43_42 = var7_6;
                                var41_40 /* !! */  = var8_7 /* !! */ ;
                                var52_51 = var9_8 /* !! */ ;
                                var50_49 /* !! */  = var10_9 /* !! */ ;
                                var39_38 /* !! */  = var11_10 /* !! */ ;
                                var47_46 /* !! */  = var13_12;
                                var56_55 /* !! */  = var14_13 /* !! */ ;
                                var54_53 /* !! */  = var15_14 /* !! */ ;
                                var63_62 = var16_15;
                                var19_18 = var22_21;
                                var17_16 = var25_24;
                                var8_7 /* !! */  = var29_28 /* !! */ ;
                                var7_6 = var20_19;
                                var20_19 = this;
                                var6_5 /* !! */  = var23_22;
                                var61_60 = 0;
                                var53_52 = 0.0f;
                                var9_8 /* !! */  = null;
                            }
                            if (var9_8 /* !! */  != null) {
                                var64_63 /* !! */  = 0;
                                var51_50 = 0.0f;
                                var10_9 /* !! */  = null;
                                var11_10 /* !! */  = new qo1_1[]{};
                                var9_8 /* !! */  = var9_8 /* !! */ .toArray(var11_10 /* !! */ );
                                var20_19.A = var9_8 /* !! */ ;
                            }
                            var61_60 = var7_6.isEmpty();
                            var10_9 /* !! */  = "CUSTOM,";
                            var11_10 /* !! */  = ",";
                            if (var61_60 != 0) break block232;
                            var20_19.y = var9_8 /* !! */  = new HashMap();
                            var9_8 /* !! */  = var7_6.iterator();
                            block101: while ((var80_79 = var9_8 /* !! */ .hasNext()) != 0) {
                                block234: {
                                    block222: {
                                        block233: {
                                            var12_11 /* !! */  = (String)var9_8 /* !! */ .next();
                                            var49_48 = var12_11 /* !! */ .startsWith((String)var10_9 /* !! */ );
                                            if (var49_48 == 0) break block233;
                                            var13_12 = new SparseArray();
                                            var14_13 /* !! */  = var12_11 /* !! */ .split((String)var11_10 /* !! */ );
                                            var78_77 = 1;
                                            var55_54 = 1.4E-45f;
                                            var14_13 /* !! */  = var14_13 /* !! */ [var78_77];
                                            var15_14 /* !! */  = var63_62.iterator();
                                            block102: while ((var33_32 = (int)var15_14 /* !! */ .hasNext()) != 0) {
                                                var16_15 = (Pn1)var15_14 /* !! */ .next();
                                                var81_80 = var9_8 /* !! */ ;
                                                var9_8 /* !! */  = var16_15.d;
                                                if (var9_8 /* !! */  == null) lbl-1000:
                                                // 3 sources

                                                {
                                                    while (true) {
                                                        var9_8 /* !! */  = var81_80;
                                                        continue block102;
                                                        break;
                                                    }
                                                }
                                                if ((var9_8 /* !! */  = (a)var9_8 /* !! */ .get(var14_13 /* !! */ )) == null) ** GOTO lbl-1000
                                                var33_32 = var16_15.a;
                                                var13_12.append(var33_32, (Object)var9_8 /* !! */ );
                                                ** continue;
                                            }
                                            var81_80 = var9_8 /* !! */ ;
                                            var9_8 /* !! */  = new jd3_0();
                                            var14_13 /* !! */  = var12_11 /* !! */ .split((String)var11_10 /* !! */ );
                                            var78_77 = 1;
                                            var55_54 = 1.4E-45f;
                                            var14_13 /* !! */  = var14_13 /* !! */ [var78_77];
                                            var9_8 /* !! */ .f = var13_12;
                                            var72_71 = var5_4;
                                            var25_24 = var17_16;
                                            var22_21 = var21_20 /* !! */ ;
                                            var62_61 = var7_6;
                                            var29_28 /* !! */  = var8_7 /* !! */ ;
                                            var5_4 = var9_8 /* !! */ ;
                                            var14_13 /* !! */  = var32_31 /* !! */ ;
                                            var21_20 /* !! */  = var46_45;
                                            var7_6 = var47_46 /* !! */ ;
                                            var17_16 = var50_49 /* !! */ ;
                                            var16_15 = var52_51;
                                            var15_14 /* !! */  = var54_53 /* !! */ ;
                                            var13_12 = var56_55 /* !! */ ;
                                            var9_8 /* !! */  = var58_57 /* !! */ ;
                                            break block234;
                                        }
                                        var81_80 = var9_8 /* !! */ ;
                                        var61_60 = var12_11 /* !! */ .hashCode();
                                        switch (var61_60) lbl-1000:
                                        // 2 sources

                                        {
                                            default: {
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
lbl756:
                                                // 12 sources

                                                while (true) {
                                                    var82_81 = -1;
                                                    break block222;
                                                    break;
                                                }
                                            }
                                            case 156108012: {
                                                var9_8 /* !! */  = "waveOffset";
                                                var61_60 = (int)var12_11 /* !! */ .equals(var9_8 /* !! */ );
                                                if (var61_60 == 0) ** GOTO lbl-1000
                                                var61_60 = 15;
                                                var53_52 = 2.1E-44f;
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var82_81 = 15;
                                                break block222;
                                            }
                                            case 92909918: {
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var49_48 = var12_11 /* !! */ .equals(var58_57 /* !! */ );
                                                if (var49_48 != 0) ** GOTO lbl801
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                ** GOTO lbl756
lbl801:
                                                // 1 sources

                                                var49_48 = 14;
                                                var48_47 = 2.0E-44f;
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var82_81 = 14;
                                                break block222;
                                            }
                                            case 37232917: {
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var83_82 = var12_11 /* !! */ .equals(var56_55 /* !! */ );
                                                if (var83_82 != 0) ** GOTO lbl831
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                ** GOTO lbl859
lbl831:
                                                // 1 sources

                                                var83_82 = 13;
                                                var57_56 = 1.8E-44f;
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var82_81 = 13;
                                                break block222;
                                            }
                                            case -4379043: {
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var78_77 = (int)var12_11 /* !! */ .equals(var32_31 /* !! */ );
                                                if (var78_77 != 0) ** GOTO lbl867
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
lbl859:
                                                // 2 sources

                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                ** GOTO lbl756
lbl867:
                                                // 1 sources

                                                var78_77 = 12;
                                                var55_54 = 1.7E-44f;
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var82_81 = 12;
                                                break block222;
                                            }
                                            case -40300674: {
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var33_32 = (int)var12_11 /* !! */ .equals(var54_53 /* !! */ );
                                                if (var33_32 == 0) ** GOTO lbl959
                                                var33_32 = 11;
                                                var65_64 = 1.5E-44f;
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var82_81 = 11;
                                                break block222;
                                            }
                                            case -760884509: {
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var16_15 = "transformPivotY";
                                                var33_32 = (int)var12_11 /* !! */ .equals(var16_15);
                                                if (var33_32 == 0) ** GOTO lbl959
                                                var33_32 = 10;
                                                var65_64 = 1.4E-44f;
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var82_81 = 10;
                                                break block222;
                                            }
                                            case -760884510: {
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var16_15 = "transformPivotX";
                                                var33_32 = (int)var12_11 /* !! */ .equals(var16_15);
                                                if (var33_32 == 0) ** GOTO lbl959
                                                var33_32 = 9;
                                                var65_64 = 1.3E-44f;
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var82_81 = 9;
                                                break block222;
                                            }
                                            case -797520672: {
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var16_15 = "waveVariesBy";
                                                var33_32 = (int)var12_11 /* !! */ .equals(var16_15);
                                                if (var33_32 != 0) ** GOTO lbl971
lbl959:
                                                // 4 sources

                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                ** GOTO lbl756
lbl971:
                                                // 1 sources

                                                var33_32 = 8;
                                                var65_64 = 1.1E-44f;
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var82_81 = 8;
                                                break block222;
                                            }
                                            case -908189617: {
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var84_83 = var12_11 /* !! */ .equals(var52_51);
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                if (var84_83 != 0) ** GOTO lbl1005
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                ** GOTO lbl756
lbl1005:
                                                // 1 sources

                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var82_81 = 7;
                                                break block222;
                                            }
                                            case -908189618: {
                                                var25_24 = var17_16;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var84_83 = var12_11 /* !! */ .equals(var50_49 /* !! */ );
                                                var72_71 = var5_4;
                                                if (var84_83 != 0) ** GOTO lbl1034
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                ** GOTO lbl756
lbl1034:
                                                // 1 sources

                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var82_81 = 6;
                                                break block222;
                                            }
                                            case -1001078227: {
                                                var25_24 = var17_16;
                                                var62_61 = var7_6;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var84_83 = var12_11 /* !! */ .equals(var47_46 /* !! */ );
                                                var72_71 = var5_4;
                                                if (var84_83 != 0) ** GOTO lbl1062
                                                var22_21 = var21_20 /* !! */ ;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                ** GOTO lbl756
lbl1062:
                                                // 1 sources

                                                var22_21 = var21_20 /* !! */ ;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var82_81 = 5;
                                                break block222;
                                            }
                                            case -1225497655: {
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var82_81 = var12_11 /* !! */ .equals(var46_45);
                                                var72_71 = var5_4;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var5_4 = var35_34 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                if (var82_81 == 0) ** GOTO lbl756
                                                var82_81 = 4;
                                                break block222;
                                            }
                                            case -1225497656: {
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var82_81 = var12_11 /* !! */ .equals(var43_42);
                                                var72_71 = var5_4;
                                                var5_4 = var35_34 /* !! */ ;
                                                if (var82_81 == 0) ** GOTO lbl756
                                                var82_81 = 3;
                                                break block222;
                                            }
                                            case -1225497657: {
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var5_4 = var41_40 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var82_81 = (int)var12_11 /* !! */ .equals(var41_40 /* !! */ );
                                                var5_4 = var35_34 /* !! */ ;
                                                if (var82_81 == 0) ** GOTO lbl756
                                                var82_81 = 2;
                                                break block222;
                                            }
                                            case -1249320805: {
                                                var72_71 = var5_4;
                                                var25_24 = var17_16;
                                                var22_21 = var21_20 /* !! */ ;
                                                var62_61 = var7_6;
                                                var29_28 /* !! */  = var8_7 /* !! */ ;
                                                var14_13 /* !! */  = var32_31 /* !! */ ;
                                                var5_4 = var39_38 /* !! */ ;
                                                var8_7 /* !! */  = var43_42;
                                                var21_20 /* !! */  = var46_45;
                                                var7_6 = var47_46 /* !! */ ;
                                                var17_16 = var50_49 /* !! */ ;
                                                var16_15 = var52_51;
                                                var15_14 /* !! */  = var54_53 /* !! */ ;
                                                var13_12 = var56_55 /* !! */ ;
                                                var9_8 /* !! */  = var58_57 /* !! */ ;
                                                var82_81 = (int)var12_11 /* !! */ .equals(var39_38 /* !! */ );
                                                var5_4 = var35_34 /* !! */ ;
                                                if (var82_81 == 0) ** GOTO lbl756
                                                var82_81 = 1;
                                                break block222;
                                            }
                                            case -1249320806: 
                                        }
                                        var72_71 = var5_4;
                                        var25_24 = var17_16;
                                        var22_21 = var21_20 /* !! */ ;
                                        var62_61 = var7_6;
                                        var29_28 /* !! */  = var8_7 /* !! */ ;
                                        var14_13 /* !! */  = var32_31 /* !! */ ;
                                        var5_4 = var35_34 /* !! */ ;
                                        var8_7 /* !! */  = var43_42;
                                        var21_20 /* !! */  = var46_45;
                                        var7_6 = var47_46 /* !! */ ;
                                        var17_16 = var50_49 /* !! */ ;
                                        var16_15 = var52_51;
                                        var15_14 /* !! */  = var54_53 /* !! */ ;
                                        var13_12 = var56_55 /* !! */ ;
                                        var9_8 /* !! */  = var58_57 /* !! */ ;
                                        var82_81 = (int)var12_11 /* !! */ .equals(var35_34 /* !! */ );
                                        if (var82_81 != 0) ** break;
                                        ** continue;
                                        var82_81 = 0;
                                        var23_22 = null;
                                    }
                                    block18 : switch (var82_81) {
                                        default: {
                                            var35_34 /* !! */  = var5_4;
                                            var43_42 = var8_7 /* !! */ ;
                                            var82_81 = 0;
                                            var23_22 = null;
                                            break;
                                        }
                                        case 15: {
                                            var23_22 = new jd3_0();
lbl1182:
                                            // 10 sources

                                            while (true) {
                                                var35_34 /* !! */  = var5_4;
                                                var43_42 = var8_7 /* !! */ ;
                                                break block18;
                                                break;
                                            }
                                        }
                                        case 14: {
                                            var23_22 = new jd3_0();
                                            ** GOTO lbl1182
                                        }
                                        case 13: {
                                            var23_22 = new JD3$d();
                                            ** GOTO lbl1182
                                        }
                                        case 12: {
                                            var23_22 = new jd3_0();
                                            ** GOTO lbl1182
                                        }
                                        case 11: {
                                            var23_22 = new jd3_0();
                                            ** GOTO lbl1182
                                        }
                                        case 10: {
                                            var23_22 = new jd3_0();
                                            ** GOTO lbl1182
                                        }
                                        case 9: {
                                            var23_22 = new jd3_0();
                                            ** GOTO lbl1182
                                        }
                                        case 8: {
                                            var23_22 = new jd3_0();
                                            ** GOTO lbl1182
                                        }
                                        case 7: {
                                            var23_22 = new jd3_0();
                                            ** GOTO lbl1182
                                        }
                                        case 6: {
                                            var23_22 = new jd3_0();
                                            ** continue;
                                        }
                                        case 5: {
                                            var35_34 /* !! */  = var5_4;
                                            var5_4 = new jd3_0();
                                            var43_42 = var8_7 /* !! */ ;
                                            var42_41 = 0;
                                            var44_43 = 0.0f;
                                            var8_7 /* !! */  = null;
                                            var5_4.f = false;
lbl1221:
                                            // 6 sources

                                            while (true) {
                                                var23_22 = var5_4;
                                                break block18;
                                                break;
                                            }
                                        }
                                        case 4: {
                                            var35_34 /* !! */  = var5_4;
                                            var43_42 = var8_7 /* !! */ ;
                                            var5_4 = new jd3_0();
                                            ** GOTO lbl1221
                                        }
                                        case 3: {
                                            var35_34 /* !! */  = var5_4;
                                            var43_42 = var8_7 /* !! */ ;
                                            var5_4 = new jd3_0();
                                            ** GOTO lbl1221
                                        }
                                        case 2: {
                                            var35_34 /* !! */  = var5_4;
                                            var43_42 = var8_7 /* !! */ ;
                                            var5_4 = new jd3_0();
                                            ** GOTO lbl1221
                                        }
                                        case 1: {
                                            var35_34 /* !! */  = var5_4;
                                            var43_42 = var8_7 /* !! */ ;
                                            var5_4 = new jd3_0();
                                            ** GOTO lbl1221
                                        }
                                        case 0: {
                                            var35_34 /* !! */  = var5_4;
                                            var43_42 = var8_7 /* !! */ ;
                                            var5_4 = new jd3_0();
                                            ** continue;
                                        }
                                    }
                                    var5_4 = var23_22;
                                }
                                if (var5_4 == null) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var50_49 /* !! */  = var17_16;
                                        var46_45 = var21_20 /* !! */ ;
                                        var47_46 /* !! */  = var7_6;
                                        var58_57 /* !! */  = var9_8 /* !! */ ;
                                        var56_55 /* !! */  = var13_12;
                                        var32_31 /* !! */  = var14_13 /* !! */ ;
                                        var54_53 /* !! */  = var15_14 /* !! */ ;
                                        var52_51 = var16_15;
                                        var21_20 /* !! */  = var22_21;
                                        var17_16 = var25_24;
                                        var8_7 /* !! */  = var29_28 /* !! */ ;
                                        var5_4 = var72_71;
                                        var7_6 = var62_61;
                                        var9_8 /* !! */  = var81_80;
                                        continue block101;
                                        break;
                                    }
                                }
                                var5_4.e = var12_11 /* !! */ ;
                                var8_7 /* !! */  = var20_19.y;
                                var8_7 /* !! */ .put(var12_11 /* !! */ , var5_4);
                                ** continue;
                            }
                            var72_71 = var5_4;
                            var25_24 = var17_16;
                            var22_21 = var21_20 /* !! */ ;
                            var62_61 = var7_6;
                            var29_28 /* !! */  = var8_7 /* !! */ ;
                            var14_13 /* !! */  = var32_31 /* !! */ ;
                            var21_20 /* !! */  = var46_45;
                            var7_6 = var47_46 /* !! */ ;
                            var17_16 = var50_49 /* !! */ ;
                            var16_15 = var52_51;
                            var15_14 /* !! */  = var54_53 /* !! */ ;
                            var13_12 = var56_55 /* !! */ ;
                            var9_8 /* !! */  = var58_57 /* !! */ ;
                            if (var63_62 != null) {
                                var5_4 = var63_62.iterator();
                                while ((var42_41 = (int)var5_4.hasNext()) != 0) {
                                    var8_7 /* !! */  = (Pn1)var5_4.next();
                                    var80_79 = var8_7 /* !! */  instanceof sn1_0;
                                    if (var80_79 == 0) continue;
                                    var12_11 /* !! */  = var20_19.y;
                                    ((Pn1)var8_7 /* !! */ ).a((HashMap)var12_11 /* !! */ );
                                }
                            }
                            var5_4 = var20_19.y;
                            var8_7 /* !! */  = var34_33;
                            var80_79 = 0;
                            var79_78 = 0.0f;
                            var34_33.a((HashMap)var5_4, 0);
                            var5_4 = var20_19.y;
                            var42_41 = 100;
                            var44_43 = 1.4E-43f;
                            var12_11 /* !! */  = var26_25;
                            var26_25.a((HashMap)var5_4, var42_41);
                            var5_4 = var20_19.y.keySet().iterator();
                            while ((var42_41 = (int)var5_4.hasNext()) != 0) {
                                var8_7 /* !! */  = (String)var5_4.next();
                                var80_79 = var6_5 /* !! */ .containsKey(var8_7 /* !! */ );
                                if (var80_79 != 0 && (var12_11 /* !! */  = (Integer)var6_5 /* !! */ .get(var8_7 /* !! */ )) != null) {
                                    var80_79 = var12_11 /* !! */ .intValue();
                                    var81_80 = var5_4;
                                } else {
                                    var81_80 = var5_4;
                                    var80_79 = 0;
                                    var79_78 = 0.0f;
                                    var12_11 /* !! */  = null;
                                }
                                var5_4 = (Ua3)var20_19.y.get(var8_7 /* !! */ );
                                if (var5_4 != null) {
                                    var5_4.c(var80_79);
                                }
                                var5_4 = var81_80;
                            }
                            break block235;
                        }
                        var72_71 = var5_4;
                        var25_24 = var17_16;
                        var22_21 = var21_20 /* !! */ ;
                        var62_61 = var7_6;
                        var29_28 /* !! */  = var8_7 /* !! */ ;
                        var14_13 /* !! */  = var32_31 /* !! */ ;
                        var21_20 /* !! */  = var46_45;
                        var7_6 = var47_46 /* !! */ ;
                        var17_16 = var50_49 /* !! */ ;
                        var16_15 = var52_51;
                        var15_14 /* !! */  = var54_53 /* !! */ ;
                        var13_12 = var56_55 /* !! */ ;
                        var9_8 /* !! */  = var58_57 /* !! */ ;
                    }
                    if ((var31_30 = (int)var19_18.isEmpty()) != 0) break block236;
                    var5_4 = var20_19.x;
                    if (var5_4 == null) {
                        var20_19.x = var5_4 = new HashMap();
                    }
                    var5_4 = var19_18.iterator();
                    block111: while ((var24_23 = (int)var5_4.hasNext()) != 0) {
                        block238: {
                            block237: {
                                var8_7 /* !! */  = var20_19.x;
                                var19_18 = (String)var5_4.next();
                                var42_41 = (int)var8_7 /* !! */ .containsKey(var19_18);
                                if (var42_41 != 0) continue;
                                var42_41 = (int)var19_18.startsWith((String)var10_9 /* !! */ );
                                if (var42_41 == 0) break block237;
                                var8_7 /* !! */  = new SparseArray();
                                var12_11 /* !! */  = var19_18.split((String)var11_10 /* !! */ );
                                var85_84 = 1;
                                var12_11 /* !! */  = var12_11 /* !! */ [var85_84];
                                var23_22 = var63_62.iterator();
                                block112: while (var86_85 = var23_22.hasNext()) {
                                    var26_25 = var23_22.next();
                                    var81_80 = var5_4;
                                    var5_4 = var26_25;
                                    var5_4 = (Pn1)var26_25;
                                    var87_86 = var10_9 /* !! */ ;
                                    var10_9 /* !! */  = var5_4.d;
                                    if (var10_9 /* !! */  == null) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            var5_4 = var81_80;
                                            var10_9 /* !! */  = var87_86;
                                            continue block112;
                                            break;
                                        }
                                    }
                                    if ((var10_9 /* !! */  = (a)var10_9 /* !! */ .get(var12_11 /* !! */ )) == null) ** GOTO lbl-1000
                                    var31_30 = var5_4.a;
                                    var8_7 /* !! */ .append(var31_30, (Object)var10_9 /* !! */ );
                                    ** continue;
                                }
                                var81_80 = var5_4;
                                var87_86 = var10_9 /* !! */ ;
                                var5_4 = new sd3_0();
                                var10_9 /* !! */  = new SparseArray();
                                var5_4.m = var10_9 /* !! */ ;
                                var10_9 /* !! */  = var19_18.split((String)var11_10 /* !! */ );
                                var80_79 = 1;
                                var79_78 = 1.4E-45f;
                                var5_4.k = var10_9 /* !! */  = var10_9 /* !! */ [var80_79];
                                var5_4.l = var8_7 /* !! */ ;
                                var47_46 /* !! */  = var7_6;
                                var23_22 = var11_10 /* !! */ ;
                                var10_9 /* !! */  = var39_38 /* !! */ ;
                                var88_87 = var3_3;
                                var11_10 /* !! */  = var5_4;
                                var5_4 = var43_42;
                                break block238;
                            }
                            var81_80 = var5_4;
                            var87_86 = var10_9 /* !! */ ;
                            var31_30 = var19_18.hashCode();
                            block36 : switch (var31_30) lbl-1000:
                            // 9 sources

                            {
                                default: {
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
lbl1398:
                                    // 5 sources

                                    while (true) {
                                        var82_81 = -1;
                                        break block36;
                                        break;
                                    }
                                }
                                case 92909918: {
                                    var31_30 = (int)var19_18.equals(var9_8 /* !! */ );
                                    if (var31_30 == 0) ** GOTO lbl-1000
                                    var31_30 = 11;
                                    var30_29 = 1.5E-44f;
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var82_81 = 11;
                                    break;
                                }
                                case 37232917: {
                                    var31_30 = (int)var19_18.equals(var13_12);
                                    if (var31_30 == 0) ** GOTO lbl-1000
                                    var31_30 = 10;
                                    var30_29 = 1.4E-44f;
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var82_81 = 10;
                                    break;
                                }
                                case -4379043: {
                                    var31_30 = (int)var19_18.equals(var14_13 /* !! */ );
                                    if (var31_30 == 0) ** GOTO lbl-1000
                                    var31_30 = 9;
                                    var30_29 = 1.3E-44f;
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var82_81 = 9;
                                    break;
                                }
                                case -40300674: {
                                    var31_30 = (int)var19_18.equals(var15_14 /* !! */ );
                                    if (var31_30 == 0) ** GOTO lbl-1000
                                    var31_30 = 8;
                                    var30_29 = 1.1E-44f;
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var82_81 = 8;
                                    break;
                                }
                                case -908189617: {
                                    var31_30 = (int)var19_18.equals(var16_15);
                                    if (var31_30 == 0) ** GOTO lbl-1000
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var82_81 = 7;
                                    break;
                                }
                                case -908189618: {
                                    var31_30 = (int)var19_18.equals(var17_16);
                                    if (var31_30 == 0) ** GOTO lbl-1000
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var82_81 = 6;
                                    break;
                                }
                                case -1001078227: {
                                    var31_30 = (int)var19_18.equals(var7_6);
                                    if (var31_30 == 0) ** GOTO lbl-1000
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var82_81 = 5;
                                    break;
                                }
                                case -1225497655: {
                                    var31_30 = (int)var19_18.equals(var21_20 /* !! */ );
                                    if (var31_30 == 0) ** GOTO lbl-1000
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var82_81 = 4;
                                    break;
                                }
                                case -1225497656: {
                                    var5_4 = var43_42;
                                    var42_41 = (int)var19_18.equals(var43_42);
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    if (var42_41 != 0) ** GOTO lbl1489
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    ** GOTO lbl1398
lbl1489:
                                    // 1 sources

                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var82_81 = 3;
                                    break;
                                }
                                case -1225497657: {
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var64_63 /* !! */  = var19_18.equals(var41_40 /* !! */ );
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    if (var64_63 /* !! */  != 0) ** GOTO lbl1500
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    ** GOTO lbl1398
lbl1500:
                                    // 1 sources

                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var82_81 = 2;
                                    break;
                                }
                                case -1249320805: {
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var80_79 = var19_18.equals(var39_38 /* !! */ );
                                    if (var80_79 != 0) ** GOTO lbl1511
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    ** GOTO lbl1398
lbl1511:
                                    // 1 sources

                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var82_81 = 1;
                                    break;
                                }
                                case -1249320806: {
                                    var12_11 /* !! */  = var35_34 /* !! */ ;
                                    var10_9 /* !! */  = var39_38 /* !! */ ;
                                    var8_7 /* !! */  = var41_40 /* !! */ ;
                                    var5_4 = var43_42;
                                    var82_81 = (int)var19_18.equals(var35_34 /* !! */ );
                                    if (var82_81 != 0) ** break;
                                    ** continue;
                                    var82_81 = 0;
                                    var23_22 = null;
                                }
                            }
                            block50 : switch (var82_81) {
                                default: {
                                    var47_46 /* !! */  = var7_6;
                                    var41_40 /* !! */  = var8_7 /* !! */ ;
                                    var23_22 = var11_10 /* !! */ ;
                                    var35_34 /* !! */  = var12_11 /* !! */ ;
                                    var40_39 /* !! */  = 0;
                                    var11_10 /* !! */  = null;
                                    var88_87 = var3_3;
                                    break block238;
                                }
                                case 11: {
                                    var23_22 = new sd3_0();
lbl1536:
                                    // 6 sources

                                    while (true) {
                                        var47_46 /* !! */  = var7_6;
                                        var41_40 /* !! */  = var8_7 /* !! */ ;
                                        var35_34 /* !! */  = var12_11 /* !! */ ;
                                        var88_87 = var3_3;
                                        var90_88 = var23_22;
                                        var23_22 = var11_10 /* !! */ ;
                                        var11_10 /* !! */  = var90_88;
                                        break block50;
                                        break;
                                    }
                                }
                                case 10: {
                                    var23_22 = new SD3$d();
                                    ** GOTO lbl1536
                                }
                                case 9: {
                                    var23_22 = new sd3_0();
                                    ** GOTO lbl1536
                                }
                                case 8: {
                                    var23_22 = new sd3_0();
                                    ** GOTO lbl1536
                                }
                                case 7: {
                                    var23_22 = new sd3_0();
                                    ** GOTO lbl1536
                                }
                                case 6: {
                                    var23_22 = new sd3_0();
                                    ** continue;
                                }
                                case 5: {
                                    var23_22 = var11_10 /* !! */ ;
                                    var11_10 /* !! */  = new sd3_0();
                                    var35_34 /* !! */  = var12_11 /* !! */ ;
                                    var80_79 = 0;
                                    var79_78 = 0.0f;
                                    var12_11 /* !! */  = null;
                                    var11_10 /* !! */ .k = false;
lbl1568:
                                    // 6 sources

                                    while (true) {
                                        var47_46 /* !! */  = var7_6;
                                        var41_40 /* !! */  = var8_7 /* !! */ ;
                                        var88_87 = var3_3;
                                        break block50;
                                        break;
                                    }
                                }
                                case 4: {
                                    var23_22 = var11_10 /* !! */ ;
                                    var35_34 /* !! */  = var12_11 /* !! */ ;
                                    var11_10 /* !! */  = new sd3_0();
                                    ** GOTO lbl1568
                                }
                                case 3: {
                                    var23_22 = var11_10 /* !! */ ;
                                    var35_34 /* !! */  = var12_11 /* !! */ ;
                                    var11_10 /* !! */  = new sd3_0();
                                    ** GOTO lbl1568
                                }
                                case 2: {
                                    var23_22 = var11_10 /* !! */ ;
                                    var35_34 /* !! */  = var12_11 /* !! */ ;
                                    var11_10 /* !! */  = new sd3_0();
                                    ** GOTO lbl1568
                                }
                                case 1: {
                                    var23_22 = var11_10 /* !! */ ;
                                    var35_34 /* !! */  = var12_11 /* !! */ ;
                                    var11_10 /* !! */  = new sd3_0();
                                    ** GOTO lbl1568
                                }
                                case 0: {
                                    var23_22 = var11_10 /* !! */ ;
                                    var35_34 /* !! */  = var12_11 /* !! */ ;
                                    var11_10 /* !! */  = new sd3_0();
                                    ** continue;
                                }
                            }
                            var11_10 /* !! */ .i = var88_87;
                        }
                        if (var11_10 /* !! */  == null) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var43_42 = var5_4;
                                var39_38 /* !! */  = var10_9 /* !! */ ;
                                var11_10 /* !! */  = var23_22;
                                var7_6 = var47_46 /* !! */ ;
                                var5_4 = var81_80;
                                var10_9 /* !! */  = var87_86;
                                continue block111;
                                break;
                            }
                        }
                        var11_10 /* !! */ .f = var19_18;
                        var12_11 /* !! */  = var20_19.x;
                        var12_11 /* !! */ .put(var19_18, var11_10 /* !! */ );
                        ** continue;
                    }
                    var47_46 /* !! */  = var7_6;
                    var87_86 = var10_9 /* !! */ ;
                    var10_9 /* !! */  = var39_38 /* !! */ ;
                    var5_4 = var43_42;
                    if (var63_62 != null) {
                        var19_18 = var63_62.iterator();
                        while ((var76_75 = (int)var19_18.hasNext()) != 0) {
                            var7_6 = (Pn1)var19_18.next();
                            var42_41 = var7_6 instanceof po1_0;
                            if (var42_41 == 0) continue;
                            var7_6 = (po1_0)var7_6;
                            var8_7 /* !! */  = var20_19.x;
                            var7_6.h((HashMap)var8_7 /* !! */ );
                        }
                    }
                    var19_18 = var20_19.x.keySet().iterator();
                    while ((var76_75 = (int)var19_18.hasNext()) != 0) {
                        var7_6 = (String)var19_18.next();
                        var42_41 = (int)var6_5 /* !! */ .containsKey(var7_6);
                        if (var42_41 != 0) {
                            var8_7 /* !! */  = (Integer)var6_5 /* !! */ .get(var7_6);
                            var42_41 = var8_7 /* !! */ .intValue();
                        } else {
                            var42_41 = 0;
                            var44_43 = 0.0f;
                            var8_7 /* !! */  = null;
                        }
                        var11_10 /* !! */  = var20_19.x;
                        var7_6 = (sd3_0)var11_10 /* !! */ .get(var7_6);
                        var7_6.c(var42_41);
                    }
                    break block239;
                }
                var47_46 /* !! */  = var7_6;
                var87_86 = var10_9 /* !! */ ;
                var10_9 /* !! */  = var39_38 /* !! */ ;
                var5_4 = var43_42;
            }
            var24_23 = var72_71.size();
            var27_26 = 2;
            var28_27 = 2.8E-45f;
            var76_75 = var24_23 + 2;
            var6_5 /* !! */  = new pq1_0[var76_75];
            var42_41 = 0;
            var44_43 = 0.0f;
            var8_7 /* !! */  = null;
            var6_5 /* !! */ [0] = var29_28 /* !! */ ;
            var40_39 /* !! */  = 1;
            var6_5 /* !! */ [var24_23 += var40_39 /* !! */ ] = var22_21;
            var24_23 = var72_71.size();
            if (var24_23 > 0 && (var24_23 = var20_19.e) == (var40_39 /* !! */  = -1)) {
                var20_19.e = 0;
            }
            var19_18 = var72_71.iterator();
            var42_41 = 1;
            var44_43 = 1.4E-45f;
            while ((var40_39 /* !! */  = (int)var19_18.hasNext()) != 0) {
                var11_10 /* !! */  = (pq1_0)var19_18.next();
                var80_79 = 1;
                var79_78 = 1.4E-45f;
                var82_81 = var42_41 + 1;
                var6_5 /* !! */ [var42_41] = var11_10 /* !! */ ;
                var42_41 = var82_81;
            }
            var19_18 = new HashSet();
            var8_7 /* !! */  = var22_21;
            var8_7 /* !! */  = var22_21.n.keySet().iterator();
            while ((var40_39 /* !! */  = (int)var8_7 /* !! */ .hasNext()) != 0) {
                var11_10 /* !! */  = (String)var8_7 /* !! */ .next();
                var81_80 = var8_7 /* !! */ ;
                var12_11 /* !! */  = var29_28 /* !! */ ;
                var8_7 /* !! */  = var29_28 /* !! */ .n;
                var42_41 = (int)var8_7 /* !! */ .containsKey(var11_10 /* !! */ );
                if (var42_41 != 0) {
                    var12_11 /* !! */  = var87_86;
                    var8_7 /* !! */  = new StringBuilder(var87_86);
                    var8_7 /* !! */ .append((String)var11_10 /* !! */ );
                    var8_7 /* !! */  = var8_7 /* !! */ .toString();
                    var12_11 /* !! */  = var62_61;
                    var42_41 = (int)var62_61.contains(var8_7 /* !! */ );
                    if (var42_41 == 0) {
                        var19_18.add(var11_10 /* !! */ );
                    }
                } else {
                    var12_11 /* !! */  = var62_61;
                }
                var8_7 /* !! */  = var81_80;
                var62_61 = var12_11 /* !! */ ;
            }
            var42_41 = 0;
            var44_43 = 0.0f;
            var8_7 /* !! */  = null;
            var11_10 /* !! */  = new String[]{};
            var19_18 = (String[])var19_18.toArray(var11_10 /* !! */ );
            var20_19.r = var19_18;
            var19_18 = new int[((String[])var19_18).length];
            var20_19.s = (int[])var19_18;
            var73_72 = 0.0f;
            var19_18 = null;
            for (var24_23 = 0; var24_23 < (var40_39 /* !! */  = (var8_7 /* !! */  = var20_19.r).length); var24_23 += var80_79) {
                var8_7 /* !! */  = var8_7 /* !! */ [var24_23];
                var11_10 /* !! */  = (qo1_1[])var20_19.s;
                var80_79 = 0;
                var79_78 = 0.0f;
                var12_11 /* !! */  = null;
                var11_10 /* !! */ [var24_23] = (qo1_1)false;
                var40_39 /* !! */  = 0;
                var11_10 /* !! */  = null;
                while (true) {
                    if (var40_39 /* !! */  >= var76_75) break;
                    var12_11 /* !! */  = var6_5 /* !! */ [var40_39 /* !! */ ].n;
                    var80_79 = (int)var12_11 /* !! */ .containsKey(var8_7 /* !! */ );
                    if (var80_79 != 0 && (var12_11 /* !! */  = (a)var6_5 /* !! */ [var40_39 /* !! */ ].n.get(var8_7 /* !! */ )) != null) {
                        var8_7 /* !! */  = (String[])var20_19.s;
                        var40_39 /* !! */  = (int)var8_7 /* !! */ [var24_23];
                        var80_79 = var12_11 /* !! */ .c() + var40_39 /* !! */ ;
                        var8_7 /* !! */ [var24_23] = (String)var80_79;
                        break;
                    }
                    var80_79 = 1;
                    var79_78 = 1.4E-45f;
                    var40_39 /* !! */  += var80_79;
                }
                var80_79 = 1;
                var79_78 = 1.4E-45f;
            }
            var73_72 = 0.0f;
            var19_18 = null;
            var11_10 /* !! */  = var6_5 /* !! */ [0];
            var24_23 = var11_10 /* !! */ .j;
            var40_39 /* !! */  = -1;
            if (var24_23 != var40_39 /* !! */ ) {
                var24_23 = 1;
                var73_72 = 1.4E-45f;
            } else {
                var24_23 = 0;
                var73_72 = 0.0f;
                var19_18 = null;
            }
            var42_41 = var8_7 /* !! */ .length;
            var80_79 = 18 + var42_41;
            var8_7 /* !! */  = (String[])new boolean[var80_79];
            for (var40_39 /* !! */  = 1; var40_39 /* !! */  < var76_75; ++var40_39 /* !! */ ) {
                var39_38 /* !! */  = var10_9 /* !! */ ;
                var10_9 /* !! */  = var6_5 /* !! */ [var40_39 /* !! */ ];
                var85_84 = 1;
                var84_83 = var40_39 /* !! */  + -1;
                var43_42 = var5_4;
                var5_4 = var6_5 /* !! */ [var84_83];
                var10_9 /* !! */ .c((pq1_0)var5_4, (boolean[])var8_7 /* !! */ , (boolean)var24_23);
                var10_9 /* !! */  = var39_38 /* !! */ ;
                var5_4 = var43_42;
            }
            var43_42 = var5_4;
            var39_38 /* !! */  = var10_9 /* !! */ ;
            var85_84 = 1;
            var30_29 = 1.4E-45f;
            var24_23 = 0;
            var73_72 = 0.0f;
            var19_18 = null;
            for (var31_30 = 1; var31_30 < var80_79; ++var31_30) {
                var64_63 /* !! */  = (int)var8_7 /* !! */ [var31_30];
                if (var64_63 /* !! */  != 0) {
                    ++var24_23;
                }
                var85_84 = 1;
            }
            var5_4 = new int[var24_23];
            var20_19.o = (int[])var5_4;
            var24_23 = Math.max(2, var24_23);
            var5_4 = new double[var24_23];
            var20_19.p = (double[])var5_4;
            var5_4 = new double[var24_23];
            var20_19.q = (double[])var5_4;
            var30_29 = 1.4E-45f;
            var24_23 = 0;
            var73_72 = 0.0f;
            var19_18 = null;
            for (var31_30 = 1; var31_30 < var80_79; var31_30 += var40_39 /* !! */ ) {
                var64_63 /* !! */  = (int)var8_7 /* !! */ [var31_30];
                if (var64_63 /* !! */  != 0) {
                    var10_9 /* !! */  = (String[])var20_19.o;
                    var40_39 /* !! */  = 1;
                    var85_84 = var24_23 + 1;
                    var10_9 /* !! */ [var24_23] = (String)var31_30;
                    var24_23 = var85_84;
                    continue;
                }
                var40_39 /* !! */  = 1;
            }
            var40_39 /* !! */  = 1;
            var31_30 = var20_19.o.length;
            var24_23 = 2;
            var73_72 = 2.8E-45f;
            var8_7 /* !! */  = (String[])new int[var24_23];
            var8_7 /* !! */ [var40_39 /* !! */ ] = (String)var31_30;
            var31_30 = 0;
            var30_29 = 0.0f;
            var8_7 /* !! */ [0] = (String)var76_75;
            var5_4 = (double[][])Array.newInstance(Double.TYPE, (int[])var8_7 /* !! */ );
            var19_18 = new double[var76_75];
            var44_43 = 0.0f;
            var8_7 /* !! */  = null;
            for (var42_41 = 0; var42_41 < var76_75; var42_41 += var93_91 /* !! */ ) {
                var10_9 /* !! */  = var6_5 /* !! */ [var42_41];
                var11_10 /* !! */  = var5_4[var42_41];
                var12_11 /* !! */  = (String[])var20_19.o;
                var26_25 = var21_20 /* !! */ ;
                var91_89 = var10_9 /* !! */ .d;
                var50_49 /* !! */  = var17_16;
                var59_58 = var10_9 /* !! */ .e;
                var52_51 = var16_15;
                var65_64 = var10_9 /* !! */ .f;
                var54_53 /* !! */  = var15_14 /* !! */ ;
                var55_54 = var10_9 /* !! */ .g;
                var32_31 /* !! */  = var14_13 /* !! */ ;
                var57_56 = var10_9 /* !! */ .h;
                var51_50 = var10_9 /* !! */ .i;
                var58_57 /* !! */  = var9_8 /* !! */ ;
                var56_55 /* !! */  = var13_12;
                var49_48 = 6;
                var48_47 = 8.4E-45f;
                var9_8 /* !! */  = (qo1_1[])new float[var49_48];
                var92_90 = false;
                var9_8 /* !! */ [0] = (qo1_1)var91_89;
                var93_91 /* !! */  = true;
                var91_89 = 1.4E-45f;
                var9_8 /* !! */ [var93_91 /* !! */ ] = (qo1_1)var59_58;
                var9_8 /* !! */ [2] = (qo1_1)var65_64;
                var60_59 /* !! */  = 3;
                var59_58 = 4.2E-45f;
                var9_8 /* !! */ [var60_59 /* !! */ ] = (qo1_1)var55_54;
                var78_77 = 4;
                var55_54 = 5.6E-45f;
                var9_8 /* !! */ [var78_77] = (qo1_1)var57_56;
                var83_82 = 5;
                var57_56 = 7.0E-45f;
                var9_8 /* !! */ [var83_82] = (qo1_1)var51_50;
                var51_50 = 0.0f;
                var10_9 /* !! */  = null;
                var33_32 = 0;
                var65_64 = 0.0f;
                var16_15 = null;
                for (var64_63 /* !! */  = 0; var64_63 /* !! */  < (var60_59 /* !! */  = var12_11 /* !! */ .length); var64_63 /* !! */  += var93_91 /* !! */ ) {
                    var60_59 /* !! */  = (int)var12_11 /* !! */ [var64_63 /* !! */ ];
                    if (var60_59 /* !! */  < var49_48) {
                        var49_48 = var33_32 + 1;
                        var59_58 = (float)var9_8 /* !! */ [var60_59 /* !! */ ];
                        var94_92 = var59_58;
                        var11_10 /* !! */ [var33_32] = (qo1_1)var94_92;
                        var33_32 = var49_48;
                    }
                    var49_48 = 6;
                    var48_47 = 8.4E-45f;
                    var83_82 = 5;
                    var57_56 = 7.0E-45f;
                    var78_77 = 4;
                    var55_54 = 5.6E-45f;
                }
                var59_58 = var6_5 /* !! */ [var42_41].c;
                var96_93 = var59_58;
                var19_18[var42_41] = (String)var96_93;
                var21_20 /* !! */  = var26_25;
                var14_13 /* !! */  = var32_31 /* !! */ ;
                var17_16 = var50_49 /* !! */ ;
                var16_15 = var52_51;
                var15_14 /* !! */  = var54_53 /* !! */ ;
                var13_12 = var56_55 /* !! */ ;
                var9_8 /* !! */  = var58_57 /* !! */ ;
            }
            var50_49 /* !! */  = var17_16;
            var26_25 = var21_20 /* !! */ ;
            var58_57 /* !! */  = var9_8 /* !! */ ;
            var56_55 /* !! */  = var13_12;
            var32_31 /* !! */  = var14_13 /* !! */ ;
            var54_53 /* !! */  = var15_14 /* !! */ ;
            var52_51 = var16_15;
            var59_58 = 0.0f;
            var17_16 = null;
            for (var60_59 /* !! */  = 0; var60_59 /* !! */  < (var42_41 = (var21_20 /* !! */  = (String[])var20_19.o).length); var60_59 /* !! */  += var64_63 /* !! */ ) {
                var93_91 /* !! */  = var21_20 /* !! */ [var60_59 /* !! */ ];
                var42_41 = 6;
                var44_43 = 8.4E-45f;
                if (var93_91 /* !! */  < var42_41) {
                    var21_20 /* !! */  = new StringBuilder();
                    var9_8 /* !! */  = pq1_0.r;
                    var64_63 /* !! */  = var20_19.o[var60_59 /* !! */ ];
                    var9_8 /* !! */  = var9_8 /* !! */ [var64_63 /* !! */ ];
                    var10_9 /* !! */  = " [";
                    var21_20 /* !! */  = h30_0.a((StringBuilder)var21_20 /* !! */ , (String)var9_8 /* !! */ , (String)var10_9 /* !! */ );
                    var53_52 = 0.0f;
                    var9_8 /* !! */  = null;
                    for (var61_60 = 0; var61_60 < var76_75; var61_60 += var64_63 /* !! */ ) {
                        var21_20 /* !! */  = Ex0.a((String)var21_20 /* !! */ );
                        var10_9 /* !! */  = var5_4[var61_60];
                        var98_94 = var10_9 /* !! */ [var60_59 /* !! */ ];
                        var21_20 /* !! */ .append((double)var98_94);
                        var21_20 /* !! */  = var21_20 /* !! */ .toString();
                        var64_63 /* !! */  = 1;
                        var51_50 = 1.4E-45f;
                    }
                }
                var64_63 /* !! */  = 1;
                var51_50 = 1.4E-45f;
            }
            var42_41 = 6;
            var44_43 = 8.4E-45f;
            var64_63 /* !! */  = 1;
            var51_50 = 1.4E-45f;
            var17_16 = new zf0_1[var20_19.r.length + var64_63 /* !! */ ];
            var20_19.j = var17_16;
            var60_59 /* !! */  = 0;
            var59_58 = 0.0f;
            var17_16 = null;
            while (var60_59 /* !! */  < (var61_60 = (var21_20 /* !! */  = var20_19.r).length)) {
                var21_20 /* !! */  = var21_20 /* !! */ [var60_59 /* !! */ ];
                var53_52 = 0.0f;
                var9_8 /* !! */  = null;
                var64_63 /* !! */  = 0;
                var51_50 = 0.0f;
                var10_9 /* !! */  = null;
                var40_39 /* !! */  = 0;
                var11_10 /* !! */  = null;
                var80_79 = 0;
                var79_78 = 0.0f;
                var12_11 /* !! */  = null;
                for (var61_60 = 0; var61_60 < var76_75; var61_60 += var49_48) {
                    var13_12 = var6_5 /* !! */ [var61_60].n;
                    var49_48 = (int)var13_12.containsKey(var21_20 /* !! */ );
                    if (var49_48 != 0) {
                        if (var12_11 /* !! */  == null) {
                            var11_10 /* !! */  = (qo1_1[])new double[var76_75];
                            var80_79 = var6_5 /* !! */ [var61_60].f((String)var21_20 /* !! */ );
                            var14_13 /* !! */  = (String[])new int[2];
                            var49_48 = 1;
                            var48_47 = 1.4E-45f;
                            var14_13 /* !! */ [var49_48] = (String)var80_79;
                            var80_79 = 0;
                            var79_78 = 0.0f;
                            var14_13 /* !! */ [0] = (String)var76_75;
                            var12_11 /* !! */  = (String[])((double[][])Array.newInstance(Double.TYPE, (int[])var14_13 /* !! */ ));
                        }
                        var13_12 = var6_5 /* !! */ [var61_60];
                        var57_56 = var13_12.c;
                        var94_92 = var57_56;
                        var11_10 /* !! */ [var64_63 /* !! */ ] = (qo1_1)var94_92;
                        var14_13 /* !! */  = var12_11 /* !! */ [var64_63 /* !! */ ];
                        var13_12.e((String)var21_20 /* !! */ , (double[])var14_13 /* !! */ );
                        var49_48 = 1;
                        var48_47 = 1.4E-45f;
                        var64_63 /* !! */  += var49_48;
                        continue;
                    }
                    var49_48 = 1;
                    var48_47 = 1.4E-45f;
                }
                var49_48 = 1;
                var48_47 = 1.4E-45f;
                var21_20 /* !! */  = (String[])Arrays.copyOf((double[])var11_10 /* !! */ , var64_63 /* !! */ );
                var9_8 /* !! */  = (qo1_1[])((double[][])Arrays.copyOf(var12_11 /* !! */ , var64_63 /* !! */ ));
                var10_9 /* !! */  = var20_19.j;
                var40_39 /* !! */  = var20_19.e;
                var10_9 /* !! */ [var60_59 /* !! */  += var49_48] = var21_20 /* !! */  = zf0_1.a(var40_39 /* !! */ , (double[])var21_20 /* !! */ , (double[][])var9_8 /* !! */ );
            }
            var17_16 = var20_19.j;
            var93_91 /* !! */  = var20_19.e;
            var5_4 = zf0_1.a((int)var93_91 /* !! */ , (double[])var19_18, (double[][])var5_4);
            var24_23 = 0;
            var73_72 = 0.0f;
            var19_18 = null;
            var17_16[0] = var5_4;
            var5_4 = var6_5 /* !! */ [0];
            var31_30 = var5_4.j;
            var60_59 /* !! */  = -1;
            var59_58 = 0.0f / 0.0f;
            if (var31_30 != var60_59 /* !! */ ) {
                var5_4 = new int[var76_75];
                var21_20 /* !! */  = (String[])new double[var76_75];
                var61_60 = 2;
                var53_52 = 2.8E-45f;
                var10_9 /* !! */  = (String[])new int[var61_60];
                var40_39 /* !! */  = 1;
                var10_9 /* !! */ [var40_39 /* !! */ ] = (String)var61_60;
                var10_9 /* !! */ [0] = (String)var76_75;
                var19_18 = (double[][])Array.newInstance(Double.TYPE, (int[])var10_9 /* !! */ );
                var51_50 = 0.0f;
                var10_9 /* !! */  = null;
                for (var64_63 /* !! */  = 0; var64_63 /* !! */  < var76_75; var64_63 /* !! */  += var40_39 /* !! */ ) {
                    var11_10 /* !! */  = var6_5 /* !! */ [var64_63 /* !! */ ];
                    var80_79 = var11_10 /* !! */ .j;
                    var5_4[var64_63 /* !! */ ] = var80_79;
                    var79_78 = var11_10 /* !! */ .c;
                    var100_95 = var79_78;
                    var21_20 /* !! */ [var64_63 /* !! */ ] = (String)var100_95;
                    var12_11 /* !! */  = var19_18[var64_63 /* !! */ ];
                    var48_47 = var11_10 /* !! */ .e;
                    var102_96 = var48_47;
                    var78_77 = 0;
                    var55_54 = 0.0f;
                    var15_14 /* !! */  = null;
                    var12_11 /* !! */ [0] = (String)var102_96;
                    var102_96 = var11_10 /* !! */ .f;
                    var40_39 /* !! */  = 1;
                    var12_11 /* !! */ [var40_39 /* !! */ ] = (String)var102_96;
                }
                var40_39 /* !! */  = 1;
                var20_19.k = var6_5 /* !! */  = new up((int[])var5_4, (double[])var21_20 /* !! */ , (double[][])var19_18);
            } else {
                var61_60 = 2;
                var53_52 = 2.8E-45f;
                var40_39 /* !! */  = 1;
            }
            var5_4 = new HashMap();
            var20_19.z = var5_4;
            if (var63_62 == null) break block240;
            var5_4 = var25_24.iterator();
            var80_79 = 2143289344;
            var79_78 = 0.0f / 0.0f;
            block135: while ((var24_23 = (int)var5_4.hasNext()) != 0) {
                block223: {
                    block224: {
                        var19_18 = (String)var5_4.next();
                        var93_91 /* !! */  = var19_18.startsWith((String)(var21_20 /* !! */  = "CUSTOM"));
                        if (var93_91 /* !! */  != false) {
                            var21_20 /* !! */  = new uD3$b();
                            var81_80 = var5_4;
                            var5_4 = var21_20 /* !! */ ;
                            var16_15 = var26_25;
                            var7_6 = var32_31 /* !! */ ;
                            var11_10 /* !! */  = var35_34 /* !! */ ;
                            var9_8 /* !! */  = var39_38 /* !! */ ;
                            var8_7 /* !! */  = var41_40 /* !! */ ;
                            var15_14 /* !! */  = var47_46 /* !! */ ;
                            var14_13 /* !! */  = var50_49 /* !! */ ;
                            var13_12 = var52_51;
                            var10_9 /* !! */  = var54_53 /* !! */ ;
                            var6_5 /* !! */  = var56_55 /* !! */ ;
                            var21_20 /* !! */  = var58_57 /* !! */ ;
lbl2039:
                            // 3 sources

                            while (true) {
                                var60_59 /* !! */  = 0;
                                var59_58 = 0.0f;
                                var17_16 = null;
                                break block223;
                                break;
                            }
                        }
                        var93_91 /* !! */  = var19_18.hashCode();
                        switch (var93_91 /* !! */ ) lbl-1000:
                        // 2 sources

                        {
                            default: {
                                var16_15 = var26_25;
                                var7_6 = var32_31 /* !! */ ;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
lbl2059:
                                // 12 sources

                                while (true) {
                                    var84_83 = -1;
                                    break block224;
                                    break;
                                }
                            }
                            case 156108012: {
                                var21_20 /* !! */  = "waveOffset";
                                var93_91 /* !! */  = var19_18.equals(var21_20 /* !! */ );
                                if (var93_91 /* !! */  == false) ** GOTO lbl-1000
                                var93_91 /* !! */  = 13;
                                var91_89 = 1.8E-44f;
                                var16_15 = var26_25;
                                var7_6 = var32_31 /* !! */ ;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var84_83 = 13;
                                break block224;
                            }
                            case 92909918: {
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var27_26 = (int)var19_18.equals(var58_57 /* !! */ );
                                if (var27_26 != 0) ** GOTO lbl2098
                                var16_15 = var26_25;
                                var7_6 = var32_31 /* !! */ ;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                ** GOTO lbl2059
lbl2098:
                                // 1 sources

                                var27_26 = 12;
                                var28_27 = 1.7E-44f;
                                var16_15 = var26_25;
                                var7_6 = var32_31 /* !! */ ;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var84_83 = 12;
                                break block224;
                            }
                            case 37232917: {
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var76_75 = (int)var19_18.equals(var56_55 /* !! */ );
                                if (var76_75 != 0) ** GOTO lbl2121
                                var16_15 = var26_25;
                                var7_6 = var32_31 /* !! */ ;
                                ** GOTO lbl2142
lbl2121:
                                // 1 sources

                                var76_75 = 11;
                                var75_74 = 1.5E-44f;
                                var16_15 = var26_25;
                                var7_6 = var32_31 /* !! */ ;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var84_83 = 11;
                                break block224;
                            }
                            case -4379043: {
                                var7_6 = var32_31 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var64_63 /* !! */  = (int)var19_18.equals(var32_31 /* !! */ );
                                if (var64_63 /* !! */  != 0) ** GOTO lbl2151
                                var16_15 = var26_25;
lbl2142:
                                // 2 sources

                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                ** GOTO lbl2059
lbl2151:
                                // 1 sources

                                var64_63 /* !! */  = 10;
                                var51_50 = 1.4E-44f;
                                var16_15 = var26_25;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var84_83 = 10;
                                break block224;
                            }
                            case -40300674: {
                                var7_6 = var32_31 /* !! */ ;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var49_48 = (int)var19_18.equals(var54_53 /* !! */ );
                                if (var49_48 == 0) ** GOTO lbl2191
                                var49_48 = 9;
                                var48_47 = 1.3E-44f;
                                var16_15 = var26_25;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var84_83 = 9;
                                break block224;
                            }
                            case -797520672: {
                                var7_6 = var32_31 /* !! */ ;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var13_12 = "waveVariesBy";
                                var49_48 = (int)var19_18.equals(var13_12);
                                if (var49_48 != 0) ** GOTO lbl2200
lbl2191:
                                // 2 sources

                                var16_15 = var26_25;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                ** GOTO lbl2059
lbl2200:
                                // 1 sources

                                var49_48 = 8;
                                var48_47 = 1.1E-44f;
                                var16_15 = var26_25;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var84_83 = 8;
                                break block224;
                            }
                            case -908189617: {
                                var7_6 = var32_31 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var83_82 = (int)var19_18.equals(var52_51);
                                var16_15 = var26_25;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                if (var83_82 != 0) ** GOTO lbl2228
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                ** GOTO lbl2059
lbl2228:
                                // 1 sources

                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var84_83 = 7;
                                break block224;
                            }
                            case -908189618: {
                                var7_6 = var32_31 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var78_77 = (int)var19_18.equals(var50_49 /* !! */ );
                                var16_15 = var26_25;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                if (var78_77 != 0) ** GOTO lbl2247
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                ** GOTO lbl2059
lbl2247:
                                // 1 sources

                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var84_83 = 6;
                                break block224;
                            }
                            case -1001078227: {
                                var7_6 = var32_31 /* !! */ ;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var33_32 = (int)var19_18.equals(var47_46 /* !! */ );
                                if (var33_32 != 0) ** GOTO lbl2266
                                var16_15 = var26_25;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                ** GOTO lbl2059
lbl2266:
                                // 1 sources

                                var16_15 = var26_25;
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var84_83 = 5;
                                break block224;
                            }
                            case -1225497655: {
                                var16_15 = var26_25;
                                var7_6 = var32_31 /* !! */ ;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var92_90 = var19_18.equals(var26_25);
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                if (!var92_90) ** GOTO lbl2059
                                var84_83 = 4;
                                break block224;
                            }
                            case -1225497656: {
                                var16_15 = var26_25;
                                var7_6 = var32_31 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var92_90 = var19_18.equals(var43_42);
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                if (!var92_90) ** GOTO lbl2059
                                var84_83 = 3;
                                break block224;
                            }
                            case -1225497657: {
                                var16_15 = var26_25;
                                var7_6 = var32_31 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var104_97 = var19_18.equals(var41_40 /* !! */ );
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                if (!var104_97) ** GOTO lbl2059
                                var84_83 = 2;
                                break block224;
                            }
                            case -1249320805: {
                                var16_15 = var26_25;
                                var7_6 = var32_31 /* !! */ ;
                                var9_8 /* !! */  = var39_38 /* !! */ ;
                                var8_7 /* !! */  = var41_40 /* !! */ ;
                                var17_16 = var43_42;
                                var15_14 /* !! */  = var47_46 /* !! */ ;
                                var14_13 /* !! */  = var50_49 /* !! */ ;
                                var13_12 = var52_51;
                                var10_9 /* !! */  = var54_53 /* !! */ ;
                                var6_5 /* !! */  = var56_55 /* !! */ ;
                                var21_20 /* !! */  = var58_57 /* !! */ ;
                                var85_84 = (int)var19_18.equals(var39_38 /* !! */ );
                                var11_10 /* !! */  = var35_34 /* !! */ ;
                                if (var85_84 == 0) ** GOTO lbl2059
                                var84_83 = 1;
                                break block224;
                            }
                            case -1249320806: 
                        }
                        var16_15 = var26_25;
                        var7_6 = var32_31 /* !! */ ;
                        var11_10 /* !! */  = var35_34 /* !! */ ;
                        var9_8 /* !! */  = var39_38 /* !! */ ;
                        var8_7 /* !! */  = var41_40 /* !! */ ;
                        var17_16 = var43_42;
                        var15_14 /* !! */  = var47_46 /* !! */ ;
                        var14_13 /* !! */  = var50_49 /* !! */ ;
                        var13_12 = var52_51;
                        var10_9 /* !! */  = var54_53 /* !! */ ;
                        var6_5 /* !! */  = var56_55 /* !! */ ;
                        var21_20 /* !! */  = var58_57 /* !! */ ;
                        var84_83 = (int)var19_18.equals(var35_34 /* !! */ );
                        if (var84_83 != 0) ** break;
                        ** continue;
                        var84_83 = 0;
                        var22_21 = null;
                    }
                    switch (var84_83) {
                        default: {
                            var81_80 = var5_4;
                            var43_42 = var17_16;
                            var31_30 = 0;
                            var30_29 = 0.0f;
                            var5_4 = null;
                            ** GOTO lbl2039
                        }
                        case 13: {
                            var22_21 = new ud3_1();
lbl2370:
                            // 8 sources

                            while (true) {
                                var81_80 = var5_4;
                                var43_42 = var17_16;
                                var5_4 = var22_21;
                                ** continue;
                                break;
                            }
                        }
                        case 12: {
                            var22_21 = new ud3_1();
                            ** GOTO lbl2370
                        }
                        case 11: {
                            var22_21 = new uD3$d();
                            ** GOTO lbl2370
                        }
                        case 10: {
                            var22_21 = new ud3_1();
                            ** GOTO lbl2370
                        }
                        case 9: {
                            var22_21 = new ud3_1();
                            ** GOTO lbl2370
                        }
                        case 8: {
                            var22_21 = new ud3_1();
                            ** GOTO lbl2370
                        }
                        case 7: {
                            var22_21 = new ud3_1();
                            ** GOTO lbl2370
                        }
                        case 6: {
                            var22_21 = new ud3_1();
                            ** continue;
                        }
                        case 5: {
                            var81_80 = var5_4;
                            var5_4 = new ud3_1();
                            var43_42 = var17_16;
                            var60_59 /* !! */  = 0;
                            var59_58 = 0.0f;
                            var17_16 = null;
                            var5_4.g = false;
                            break;
                        }
                        case 4: {
                            var81_80 = var5_4;
                            var43_42 = var17_16;
                            var60_59 /* !! */  = 0;
                            var59_58 = 0.0f;
                            var17_16 = null;
                            var5_4 = new ud3_1();
                            break;
                        }
                        case 3: {
                            var81_80 = var5_4;
                            var43_42 = var17_16;
                            var60_59 /* !! */  = 0;
                            var59_58 = 0.0f;
                            var17_16 = null;
                            var5_4 = new ud3_1();
                            break;
                        }
                        case 2: {
                            var81_80 = var5_4;
                            var43_42 = var17_16;
                            var60_59 /* !! */  = 0;
                            var59_58 = 0.0f;
                            var17_16 = null;
                            var5_4 = new ud3_1();
                            break;
                        }
                        case 1: {
                            var81_80 = var5_4;
                            var43_42 = var17_16;
                            var60_59 /* !! */  = 0;
                            var59_58 = 0.0f;
                            var17_16 = null;
                            var5_4 = new ud3_1();
                            break;
                        }
                        case 0: {
                            var81_80 = var5_4;
                            var43_42 = var17_16;
                            var60_59 /* !! */  = 0;
                            var59_58 = 0.0f;
                            var17_16 = null;
                            var5_4 = new ud3_1();
                        }
                    }
                }
                if (var5_4 == null) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_4 = var81_80;
                        var58_57 /* !! */  = var21_20 /* !! */ ;
                        var56_55 /* !! */  = var6_5 /* !! */ ;
                        var32_31 /* !! */  = var7_6;
                        var41_40 /* !! */  = var8_7 /* !! */ ;
                        var39_38 /* !! */  = var9_8 /* !! */ ;
                        var54_53 /* !! */  = var10_9 /* !! */ ;
                        var35_34 /* !! */  = var11_10 /* !! */ ;
                        var52_51 = var13_12;
                        var50_49 /* !! */  = var14_13 /* !! */ ;
                        var47_46 /* !! */  = var15_14 /* !! */ ;
                        var26_25 = var16_15;
                        var60_59 /* !! */  = -1;
                        var59_58 = 0.0f / 0.0f;
                        var42_41 = 6;
                        var44_43 = 8.4E-45f;
                        var61_60 = 2;
                        var53_52 = 2.8E-45f;
                        var40_39 /* !! */  = 1;
                        continue block135;
                        break;
                    }
                }
                var105_98 = var5_4.e();
                if (var105_98 && (var105_98 = Float.isNaN(var79_78))) {
                    var79_78 = this.e();
                }
                var5_4.b = var19_18;
                var17_16 = var20_19.z;
                var17_16.put(var19_18, var5_4);
                ** continue;
            }
            var5_4 = var63_62.iterator();
            while ((var60_59 /* !! */  = (int)var5_4.hasNext()) != 0) {
                var17_16 = (Pn1)var5_4.next();
                var24_23 = var17_16 instanceof vn1_1;
                if (var24_23 == 0) continue;
                var17_16 = (vn1_1)var17_16;
                var19_18 = var20_19.z;
                var17_16.h((HashMap)var19_18);
            }
            var5_4 = var20_19.z.values().iterator();
            while ((var60_59 /* !! */  = (int)var5_4.hasNext()) != 0) {
                var17_16 = (ud3_1)var5_4.next();
                var17_16.d();
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(" start: x: ");
        pq1_0 pq1_02 = this.f;
        float f5 = pq1_02.e;
        stringBuilder.append(f5);
        String string2 = " y: ";
        stringBuilder.append(string2);
        float f6 = pq1_02.f;
        stringBuilder.append(f6);
        stringBuilder.append(" end: x: ");
        pq1_02 = this.g;
        float f7 = pq1_02.e;
        stringBuilder.append(f7);
        stringBuilder.append(string2);
        f6 = pq1_02.f;
        stringBuilder.append(f6);
        return stringBuilder.toString();
    }
}

