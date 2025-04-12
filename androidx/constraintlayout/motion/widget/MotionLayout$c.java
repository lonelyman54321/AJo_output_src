/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AnimationUtils
 *  android.view.animation.BounceInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.OvershootInterpolator
 */
package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints$LayoutParams;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.b$a;
import androidx.constraintlayout.widget.b$b;
import androidx.constraintlayout.widget.b$c;
import androidx.constraintlayout.widget.b$d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class MotionLayout$c {
    public Z50 a;
    public Z50 b;
    public b c;
    public b d;
    public int e;
    public int f;
    public final /* synthetic */ MotionLayout g;

    public MotionLayout$c(MotionLayout object) {
        this.g = object;
        this.a = object = new Z50();
        this.b = object = new Z50();
        this.c = null;
        this.d = null;
    }

    public static void c(Z50 iterator, Z50 y50) {
        boolean bl2;
        boolean bl3;
        Object object = ((tf3_0)((Object)iterator)).x0;
        HashMap<Object, Y50> hashMap = new HashMap<Object, Y50>();
        hashMap.put(iterator, y50);
        Object object2 = ((tf3_0)y50).x0;
        ((ArrayList)object2).clear();
        y50.k((Y50)((Object)iterator), hashMap);
        iterator = ((ArrayList)object).iterator();
        while (bl3 = iterator.hasNext()) {
            object2 = (Y50)iterator.next();
            boolean bl4 = object2 instanceof Lv;
            Y50 y502 = bl4 ? new Lv() : ((bl4 = object2 instanceof w11_0) ? new w11_0() : ((bl4 = object2 instanceof ds0_1) ? new ds0_1() : ((bl4 = object2 instanceof qs2_0) ? new se3_0() : ((bl4 = object2 instanceof C41) ? new F41() : new Y50()))));
            ((tf3_0)y50).a(y502);
            hashMap.put(object2, y502);
        }
        iterator = ((ArrayList)object).iterator();
        while (bl2 = iterator.hasNext()) {
            y50 = (Y50)iterator.next();
            object = (Y50)hashMap.get(y50);
            ((Y50)object).k(y50, hashMap);
        }
    }

    public static Y50 d(Z50 object, View view) {
        Object object2 = ((Y50)object).j0;
        if (object2 == view) {
            return object;
        }
        object = ((tf3_0)object).x0;
        int n3 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Y50 y50 = (Y50)((ArrayList)object).get(i3);
            Object object3 = y50.j0;
            if (object3 != view) continue;
            return y50;
        }
        return null;
    }

    public final void a() {
        float f5;
        Object object;
        float f6;
        int n3;
        int n4;
        SparseArray sparseArray;
        Object object2;
        Object object3;
        Object object4;
        int n7;
        MotionLayout$c motionLayout$c = this;
        Object object5 = this.g;
        int n8 = object5.getChildCount();
        ((MotionLayout)object5).k.clear();
        Object object6 = new SparseArray();
        int[] nArray = new int[n8];
        Object object7 = null;
        for (n7 = 0; n7 < n8; ++n7) {
            int n10;
            object4 = object5.getChildAt(n7);
            object3 = new fQ1((View)object4);
            nArray[n7] = n10 = object4.getId();
            object6.put(n10, object3);
            object2 = ((MotionLayout)object5).k;
            ((HashMap)object2).put(object4, object3);
        }
        object7 = null;
        for (n7 = 0; n7 < n8; ++n7) {
            object3 = object5.getChildAt(n7);
            object2 = (fQ1)((MotionLayout)object5).k.get(object3);
            if (object2 == null) {
                sparseArray = object6;
            } else {
                int n14;
                float f7;
                int n15;
                int n16;
                float f8;
                int n17;
                float f11;
                float f12;
                int n18;
                Object object8 = motionLayout$c.c;
                dQ1 dQ12 = ((fQ1)object2).h;
                pq1_0 pq1_02 = ((fQ1)object2).f;
                if (object8 != null) {
                    object8 = MotionLayout$c.d(motionLayout$c.a, (View)object3);
                    if (object8 != null) {
                        object8 = MotionLayout.a((MotionLayout)object5, (Y50)object8);
                        b b2 = motionLayout$c.c;
                        int n19 = object5.getWidth();
                        n4 = object5.getHeight();
                        n3 = b2.d;
                        if (n3 != 0) {
                            Rect rect = ((fQ1)object2).a;
                            fQ1.h((Rect)object8, rect, n3, n19, n4);
                        }
                        pq1_02.c = 0.0f;
                        pq1_02.d = 0.0f;
                        ((fQ1)object2).g(pq1_02);
                        f6 = ((Rect)object8).left;
                        n18 = ((Rect)object8).top;
                        f12 = n18;
                        n19 = object8.width();
                        float f14 = n19;
                        sparseArray = object6;
                        f11 = object8.height();
                        pq1_02.g(f6, f12, f14, f11);
                        n17 = ((fQ1)object2).c;
                        object6 = b2.j(n17);
                        pq1_02.a((b$a)object6);
                        object = ((b$a)object6).d;
                        ((fQ1)object2).l = f8 = ((b$c)object).g;
                        n16 = ((fQ1)object2).c;
                        dQ12.d((Rect)object8, b2, n3, n16);
                        ((fQ1)object2).C = n17 = ((b$a)object6).f.i;
                        ((fQ1)object2).E = n17 = ((b$c)object).j;
                        ((fQ1)object2).F = f11 = ((b$c)object).i;
                        object6 = ((fQ1)object2).b.getContext();
                        n3 = ((b$c)object).l;
                        object8 = ((b$c)object).k;
                        n4 = ((b$c)object).m;
                        n15 = -2;
                        f7 = 0.0f / 0.0f;
                        if (n3 != n15) {
                            n15 = -1;
                            f7 = 0.0f / 0.0f;
                            if (n3 != n15) {
                                if (n3 != 0) {
                                    n17 = 1;
                                    f11 = Float.MIN_VALUE;
                                    if (n3 != n17) {
                                        n17 = 2;
                                        f11 = 2.8E-45f;
                                        if (n3 != n17) {
                                            n17 = 4;
                                            f11 = 5.6E-45f;
                                            if (n3 != n17) {
                                                n17 = 5;
                                                f11 = 7.0E-45f;
                                                if (n3 != n17) {
                                                    n17 = 0;
                                                    f11 = 0.0f;
                                                    object6 = null;
                                                } else {
                                                    object6 = new OvershootInterpolator();
                                                }
                                            } else {
                                                object6 = new BounceInterpolator();
                                            }
                                        } else {
                                            object6 = new DecelerateInterpolator();
                                        }
                                    } else {
                                        object6 = new AccelerateInterpolator();
                                    }
                                } else {
                                    object6 = new AccelerateDecelerateInterpolator();
                                }
                            } else {
                                object6 = bx0_0.c((String)object8);
                                object6 = object = new eq1_0((bx0_0)object6);
                            }
                        } else {
                            object6 = AnimationUtils.loadInterpolator((Context)object6, (int)n4);
                        }
                        ((fQ1)object2).G = object6;
                    } else {
                        sparseArray = object6;
                        n17 = ((MotionLayout)object5).u;
                        if (n17 != 0) {
                            oi0_0.b();
                            oi0_0.d((View)object3);
                            object3.getClass();
                        }
                    }
                } else {
                    sparseArray = object6;
                    n17 = ((MotionLayout)object5).w0;
                    if (n17 != 0) {
                        object6 = (KD3)((MotionLayout)object5).x0.get(object3);
                        n4 = 0;
                        f6 = 0.0f;
                        pq1_02.c = 0.0f;
                        pq1_02.d = 0.0f;
                        object = new Rect();
                        n3 = ((Rect)object).left;
                        f5 = n3;
                        n14 = ((Rect)object).top;
                        float f15 = n14;
                        n18 = object.width();
                        f12 = n18;
                        int n20 = object.height();
                        float f16 = n20;
                        pq1_02.g(f5, f15, f12, f16);
                        object6.getClass();
                        dQ12.getClass();
                        object.width();
                        object.height();
                        dQ12.b((View)object3);
                        n17 = 2143289344;
                        dQ12.k = f11 = 0.0f / 0.0f;
                        dQ12.l = f11;
                    }
                }
                object6 = motionLayout$c.d;
                if (object6 != null) {
                    object6 = MotionLayout$c.d(motionLayout$c.b, (View)object3);
                    if (object6 != null) {
                        float f17;
                        object6 = MotionLayout.a((MotionLayout)object5, (Y50)object6);
                        object = motionLayout$c.d;
                        n3 = object5.getWidth();
                        int n21 = object5.getHeight();
                        n14 = ((b)object).d;
                        if (n14 != 0) {
                            dQ12 = ((fQ1)object2).a;
                            fQ1.h((Rect)object6, (Rect)dQ12, n14, n3, n21);
                            object6 = ((fQ1)object2).a;
                        }
                        object4 = ((fQ1)object2).g;
                        ((pq1_0)object4).c = f17 = 1.0f;
                        ((pq1_0)object4).d = f17;
                        ((fQ1)object2).g((pq1_0)object4);
                        f17 = ((Rect)object6).left;
                        n15 = ((Rect)object6).top;
                        f7 = n15;
                        n16 = object6.width();
                        f8 = n16;
                        n18 = object6.height();
                        f12 = n18;
                        ((pq1_0)object4).g(f17, f7, f8, f12);
                        n21 = ((fQ1)object2).c;
                        object3 = ((b)object).j(n21);
                        ((pq1_0)object4).a((b$a)object3);
                        object4 = ((fQ1)object2).i;
                        n21 = ((fQ1)object2).c;
                        ((dQ1)object4).d((Rect)object6, (b)object, n14, n21);
                    } else {
                        n17 = ((MotionLayout)object5).u;
                        if (n17 != 0) {
                            oi0_0.b();
                            oi0_0.d((View)object3);
                            object3.getClass();
                        }
                    }
                }
            }
            object6 = sparseArray;
        }
        sparseArray = object6;
        f6 = 0.0f;
        object = null;
        for (n4 = 0; n4 < n8; ++n4) {
            int n22 = nArray[n4];
            object6 = sparseArray;
            object5 = (fQ1)sparseArray.get(n22);
            object7 = ((fQ1)object5).f;
            n7 = ((pq1_0)object7).k;
            n3 = -1;
            f5 = 0.0f / 0.0f;
            if (n7 != n3) {
                object7 = (fQ1)sparseArray.get(n7);
                object3 = ((fQ1)object7).f;
                object2 = ((fQ1)object5).f;
                ((pq1_0)object2).i((fQ1)object7, (pq1_0)object3);
                object5 = ((fQ1)object5).g;
                object3 = ((fQ1)object7).g;
                ((pq1_0)object5).i((fQ1)object7, (pq1_0)object3);
            }
            sparseArray = object6;
        }
    }

    public final void b(int n3, int n4) {
        MotionLayout motionLayout = this.g;
        int n7 = motionLayout.getOptimizationLevel();
        int n8 = motionLayout.f;
        int n10 = motionLayout.getStartState();
        if (n8 == n10) {
            int n14;
            Object object = this.b;
            Object object2 = this.d;
            n14 = object2 != null && (n14 = ((b)object2).d) != 0 ? n4 : n3;
            n10 = object2 != null && (n10 = ((b)object2).d) != 0 ? n3 : n4;
            motionLayout.resolveSystem((Z50)object, n7, n14, n10);
            object = this.c;
            if (object != null) {
                object2 = this.a;
                n8 = ((b)object).d;
                n14 = n8 == 0 ? n3 : n4;
                if (n8 == 0) {
                    n3 = n4;
                }
                motionLayout.resolveSystem((Z50)object2, n7, n14, n3);
            }
        } else {
            int n15;
            Object object;
            Object object3 = this.c;
            if (object3 != null) {
                object = this.a;
                n8 = ((b)object3).d;
                n15 = n8 == 0 ? n3 : n4;
                n8 = n8 == 0 ? n4 : n3;
                motionLayout.resolveSystem((Z50)object, n7, n15, n8);
            }
            object3 = this.b;
            object = this.d;
            n15 = object != null && (n15 = ((b)object).d) != 0 ? n4 : n3;
            if (object == null || (n10 = ((b)object).d) == 0) {
                n3 = n4;
            }
            motionLayout.resolveSystem((Z50)object3, n7, n15, n3);
        }
    }

    public final void e(b object, b object2) {
        int n3;
        Z50 z50;
        this.c = object;
        this.d = object2;
        this.a = z50 = new Z50();
        this.b = z50 = new Z50();
        z50 = this.a;
        Object object3 = this.g;
        Object object4 = MotionLayout.b((MotionLayout)object3).B0;
        z50.B0 = object4;
        z50.z0.f = object4;
        z50 = this.b;
        object4 = MotionLayout.c((MotionLayout)object3).B0;
        z50.B0 = object4;
        z50.z0.f = object4;
        this.a.x0.clear();
        this.b.x0.clear();
        z50 = MotionLayout.d(object3);
        object4 = this.a;
        MotionLayout$c.c(z50, (Z50)object4);
        z50 = MotionLayout.e(object3);
        object4 = this.b;
        MotionLayout$c.c(z50, (Z50)object4);
        float f5 = object3.o;
        double d2 = f5;
        double d5 = 0.5;
        double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (d7 > 0) {
            if (object != null) {
                z50 = this.a;
                this.g(z50, (b)object);
            }
            object = this.b;
            this.g((Z50)object, (b)object2);
        } else {
            z50 = this.b;
            this.g(z50, (b)object2);
            if (object != null) {
                object2 = this.a;
                this.g((Z50)object2, (b)object);
            }
        }
        object = this.a;
        ((Z50)object).C0 = n3 = object3.isRtl();
        object = this.a;
        ((Z50)object).y0.c((Z50)object);
        object = this.b;
        ((Z50)object).C0 = n3 = object3.isRtl();
        object = this.b;
        object2 = ((Z50)object).y0;
        ((Zw)object2).c((Z50)object);
        object = object3.getLayoutParams();
        if (object != null) {
            int n4;
            n3 = ((ViewGroup.LayoutParams)object).width;
            d7 = -2;
            f5 = 0.0f / 0.0f;
            if (n3 == d7) {
                object2 = this.a;
                object3 = Y50$b.WRAP_CONTENT;
                ((Y50)object2).S((Y50$b)((Object)object3));
                object2 = this.b;
                ((Y50)object2).S((Y50$b)((Object)object3));
            }
            if ((n4 = ((ViewGroup.LayoutParams)object).height) == d7) {
                object = this.a;
                object2 = Y50$b.WRAP_CONTENT;
                ((Y50)object).U((Y50$b)((Object)object2));
                object = this.b;
                ((Y50)object).U((Y50$b)((Object)object2));
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void f() {
        block39: {
            block41: {
                block40: {
                    var1_1 = this.g;
                    var2_2 = var1_1.h;
                    var3_3 = var1_1.i;
                    var4_4 = View.MeasureSpec.getMode((int)var2_2);
                    var5_5 = View.MeasureSpec.getMode((int)var3_3);
                    var1_1.p0 = var4_4;
                    var1_1.q0 = var5_5;
                    this.b(var2_2, var3_3);
                    var6_6 /* !! */  = var1_1.getParent();
                    var7_7 = var6_6 /* !! */  instanceof MotionLayout;
                    var8_8 = true;
                    var9_9 = 0;
                    if (var7_7 == 0) break block40;
                    var7_7 = 0x40000000;
                    var10_10 = 2.0f;
                    if (var4_4 == var7_7 && var5_5 == var7_7) break block41;
                }
                this.b(var2_2, var3_3);
                var1_1.S = var4_4 = this.a.v();
                var1_1.T = var4_4 = this.a.p();
                var1_1.U = var4_4 = this.b.v();
                var11_11 = this.b;
                var1_1.k0 = var4_4 = var11_11.p();
                var5_5 = var1_1.S;
                var7_7 = var1_1.U;
                if (var5_5 == var7_7 && (var5_5 = var1_1.T) == var4_4) {
                    var4_4 = 0;
                    var12_12 = 0.0f;
                    var11_11 = null;
                } else {
                    var4_4 = 1;
                    var12_12 = 1.4E-45f;
                }
                var1_1.R = var4_4;
            }
            var4_4 = var1_1.S;
            var5_5 = var1_1.T;
            var7_7 = var1_1.p0;
            var13_13 = -1 << -1;
            var14_14 = -0.0f;
            if (var7_7 != var13_13 && var7_7 != 0) lbl-1000:
            // 2 sources

            {
                while (true) {
                    continue;
                    break;
                }
            }
            var10_10 = var4_4;
            var15_15 = var1_1.r0;
            var16_16 = var1_1.U - var4_4;
            var12_12 = var16_16;
            var15_15 = var15_15 * var12_12 + var10_10;
            var4_4 = (int)var15_15;
            ** while (true)
            var7_7 = var4_4;
            var4_4 = var1_1.q0;
            if (var4_4 != var13_13 && var4_4 != 0) {
                var13_13 = var5_5;
            } else {
                var12_12 = var5_5;
                var14_14 = var1_1.r0;
                var17_17 = var1_1.k0 - var5_5;
                var18_18 = var17_17;
                var14_14 = var14_14 * var18_18 + var12_12;
                var13_13 = var4_4 = (int)var14_14;
            }
            var11_11 = this.a;
            var5_5 = (int)var11_11.L0;
            if (var5_5 != 0) ** GOTO lbl-1000
            var19_19 = this.b;
            var5_5 = (int)var19_19.L0;
            if (var5_5 == 0) {
                var17_17 = 0;
                var15_15 = 0.0f;
                var20_20 = null;
            } else lbl-1000:
            // 2 sources

            {
                var17_17 = 1;
                var15_15 = 1.4E-45f;
            }
            var4_4 = (int)var11_11.M0;
            if (var4_4 != 0) ** GOTO lbl-1000
            var11_11 = this.b;
            var4_4 = (int)var11_11.M0;
            if (var4_4 == 0) {
                var16_16 = 0;
                var21_21 = 0.0f;
                var22_22 = null;
            } else lbl-1000:
            // 2 sources

            {
                var16_16 = 1;
                var21_21 = 1.4E-45f;
            }
            var11_11 = var1_1;
            var5_5 = var7_7;
            var7_7 = var13_13;
            var13_13 = var17_17;
            var14_14 = var15_15;
            var17_17 = var16_16;
            var15_15 = var21_21;
            var1_1.resolveMeasuredDimension(var2_2, var3_3, var5_5, var7_7, (boolean)var13_13, (boolean)var16_16);
            var4_4 = var1_1.getChildCount();
            var1_1.B0.a();
            var1_1.s = var8_8;
            var23_23 /* !! */  = new SparseArray();
            var3_3 = 0;
            var24_24 = 0.0f;
            var25_25 /* !! */  = null;
            while (true) {
                var19_19 = var1_1.k;
                if (var3_3 >= var4_4) break;
                var6_6 /* !! */  = var1_1.getChildAt(var3_3);
                var13_13 = var6_6 /* !! */ .getId();
                var19_19 = (fQ1)var19_19.get(var6_6 /* !! */ );
                var23_23 /* !! */ .put(var13_13, var19_19);
                ++var3_3;
            }
            var2_2 = var1_1.getWidth();
            var3_3 = var1_1.getHeight();
            var6_6 /* !! */  = var1_1.a.c;
            var13_13 = -1;
            var14_14 = 0.0f / 0.0f;
            if (var6_6 /* !! */  != null) {
                var7_7 = var6_6 /* !! */ .p;
            } else {
                var7_7 = -1;
                var10_10 = 0.0f / 0.0f;
            }
            if (var7_7 != var13_13) {
                var15_15 = 0.0f;
                var20_20 = null;
                for (var17_17 = 0; var17_17 < var4_4; ++var17_17) {
                    var22_22 = var1_1.getChildAt(var17_17);
                    if ((var22_22 = (fQ1)var19_19.get(var22_22)) == null) continue;
                    var22_22.B = var7_7;
                }
            }
            var6_6 /* !! */  = new SparseBooleanArray();
            var17_17 = var19_19.size();
            var20_20 = new int[var17_17];
            var21_21 = 0.0f;
            var22_22 = null;
            var26_26 = 0;
            var27_27 = 0.0f;
            var28_28 = null;
            for (var16_16 = 0; var16_16 < var4_4; ++var16_16) {
                var29_29 = var1_1.getChildAt(var16_16);
                var29_29 = (fQ1)var19_19.get(var29_29);
                var30_30 = var29_29.f;
                var31_31 = var30_30.k;
                if (var31_31 == var13_13) continue;
                var6_6 /* !! */ .put(var31_31, var8_8);
                var31_31 = var26_26 + 1;
                var29_29 = var29_29.f;
                var20_20[var26_26] = var32_32 = var29_29.k;
                var26_26 = var31_31;
            }
            var33_33 = var1_1.K;
            if (var33_33 != null) {
                var14_14 = 0.0f;
                var33_33 = null;
                for (var13_13 = 0; var13_13 < var26_26; ++var13_13) {
                    var16_16 = var20_20[var13_13];
                    var22_22 = var1_1.findViewById(var16_16);
                    if ((var22_22 = (fQ1)var19_19.get(var22_22)) == null) continue;
                    var29_29 = var1_1.a;
                    var29_29.f((fQ1)var22_22);
                }
                var33_33 = var1_1.K.iterator();
                while ((var16_16 = (int)var33_33.hasNext()) != 0) {
                    var22_22 = (MotionHelper)var33_33.next();
                    var22_22.r(var1_1, (HashMap)var19_19);
                }
                var14_14 = 0.0f;
                var33_33 = null;
                for (var13_13 = 0; var13_13 < var26_26; ++var13_13) {
                    var16_16 = var20_20[var13_13];
                    var22_22 = var1_1.findViewById(var16_16);
                    if ((var22_22 = (fQ1)var19_19.get(var22_22)) == null) continue;
                    var34_34 = var1_1.getNanoTime();
                    var22_22.i(var2_2, var3_3, var34_34);
                }
            } else {
                var14_14 = 0.0f;
                var33_33 = null;
                for (var13_13 = 0; var13_13 < var26_26; ++var13_13) {
                    var16_16 = var20_20[var13_13];
                    var22_22 = var1_1.findViewById(var16_16);
                    if ((var22_22 = (fQ1)var19_19.get(var22_22)) == null) continue;
                    var29_29 = var1_1.a;
                    var29_29.f((fQ1)var22_22);
                    var34_34 = var1_1.getNanoTime();
                    var22_22.i(var2_2, var3_3, var34_34);
                }
            }
            var14_14 = 0.0f;
            var33_33 = null;
            for (var13_13 = 0; var13_13 < var4_4; ++var13_13) {
                var20_20 = var1_1.getChildAt(var13_13);
                var22_22 = (fQ1)var19_19.get(var20_20);
                var17_17 = var20_20.getId();
                if ((var17_17 = (int)var6_6 /* !! */ .get(var17_17)) != 0 || var22_22 == null) continue;
                var20_20 = var1_1.a;
                var20_20.f((fQ1)var22_22);
                var36_35 = var1_1.getNanoTime();
                var22_22.i(var2_2, var3_3, var36_35);
            }
            var23_23 /* !! */  = var1_1.a.c;
            var3_3 = 0;
            var24_24 = 0.0f;
            var25_25 /* !! */  = null;
            if (var23_23 /* !! */  != null) {
                var38_36 = var23_23 /* !! */ .i;
            } else {
                var2_2 = 0;
                var38_36 = 0.0f;
                var23_23 /* !! */  = null;
            }
            var3_3 = (int)((cfr_temp_0 = var38_36 - 0.0f) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
            if (var3_3 != 0) {
                var39_37 = var38_36;
                var41_38 = 0.0;
                cfr_temp_1 = var39_37 - var41_38;
                var3_3 = (int)(cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1));
                if (var3_3 >= 0) {
                    var8_8 = false;
                }
                var38_36 = Math.abs(var38_36);
                var3_3 = -8388609;
                var24_24 = -3.4028235E38f;
                var7_7 = 0x7F7FFFFF;
                var10_10 = 3.4028235E38f;
                var13_13 = 0;
                var14_14 = 0.0f;
                var33_33 = null;
                var17_17 = 0x7F7FFFFF;
                var15_15 = 3.4028235E38f;
                var16_16 = -8388609;
                var21_21 = -3.4028235E38f;
                while (true) {
                    var26_26 = 1065353216;
                    var27_27 = 1.0f;
                    if (var13_13 >= var4_4) break;
                    var29_29 = var1_1.getChildAt(var13_13);
                    var29_29 = (fQ1)var19_19.get(var29_29);
                    var43_39 = var29_29.l;
                    var31_31 = (int)Float.isNaN(var43_39);
                    if (var31_31 == 0) {
                        var14_14 = 0.0f;
                        var33_33 = null;
                        for (var13_13 = 0; var13_13 < var4_4; ++var13_13) {
                            var20_20 = var1_1.getChildAt(var13_13);
                            var20_20 = (fQ1)var19_19.get(var20_20);
                            var21_21 = var20_20.l;
                            var16_16 = (int)Float.isNaN(var21_21);
                            if (var16_16 != 0) continue;
                            var21_21 = var20_20.l;
                            var10_10 = Math.min(var10_10, var21_21);
                            var15_15 = var20_20.l;
                            var24_24 = Math.max(var24_24, var15_15);
                        }
                        while (var9_9 < var4_4) {
                            var33_33 = var1_1.getChildAt(var9_9);
                            var33_33 = (fQ1)var19_19.get(var33_33);
                            var15_15 = var33_33.l;
                            var17_17 = (int)Float.isNaN(var15_15);
                            if (var17_17 == 0) {
                                var15_15 = var27_27 - var38_36;
                                var33_33.n = var15_15 = var27_27 / var15_15;
                                if (var8_8) {
                                    var15_15 = var33_33.l;
                                    var15_15 = var24_24 - var15_15;
                                    var21_21 = var24_24 - var10_10;
                                    var15_15 = var15_15 / var21_21 * var38_36;
                                    var33_33.m = var15_15 = var38_36 - var15_15;
                                } else {
                                    var15_15 = (var33_33.l - var10_10) * var38_36;
                                    var21_21 = var24_24 - var10_10;
                                    var15_15 /= var21_21;
                                    var33_33.m = var15_15 = var38_36 - var15_15;
                                }
                            }
                            ++var9_9;
                        }
                        break block39;
                    }
                    var28_28 = var29_29.g;
                    var44_40 = var28_28.e;
                    var27_27 = var28_28.f;
                    var27_27 = var8_8 ? (var27_27 -= var44_40) : (var27_27 += var44_40);
                    var15_15 = Math.min(var15_15, var27_27);
                    var21_21 = Math.max(var21_21, var27_27);
                    ++var13_13;
                }
                while (var9_9 < var4_4) {
                    var25_25 /* !! */  = var1_1.getChildAt(var9_9);
                    var25_25 /* !! */  = (fQ1)var19_19.get(var25_25 /* !! */ );
                    var6_6 /* !! */  = var25_25 /* !! */ .g;
                    var14_14 = var6_6 /* !! */ .e;
                    var10_10 = var6_6 /* !! */ .f;
                    var10_10 = var8_8 ? (var10_10 -= var14_14) : (var10_10 += var14_14);
                    var14_14 = var27_27 - var38_36;
                    var25_25 /* !! */ .n = var14_14 = var27_27 / var14_14;
                    var10_10 = (var10_10 - var15_15) * var38_36;
                    var14_14 = var21_21 - var15_15;
                    var10_10 /= var14_14;
                    var25_25 /* !! */ .m = var10_10 = var38_36 - var10_10;
                    ++var9_9;
                }
            }
        }
    }

    public final void g(Z50 z50, b b2) {
        boolean bl2;
        Object object;
        Object object2;
        int n3;
        int n4;
        int n7;
        Object object3;
        MotionLayout$c motionLayout$c = this;
        Object object4 = z50;
        Object object5 = b2;
        int n8 = 1;
        SparseArray sparseArray = new SparseArray();
        Constraints$LayoutParams constraints$LayoutParams = new Constraints$LayoutParams();
        sparseArray.clear();
        sparseArray.put(0, (Object)z50);
        MotionLayout motionLayout = this.g;
        int n10 = motionLayout.getId();
        sparseArray.put(n10, (Object)z50);
        if (b2 != null && (n10 = b2.d) != 0) {
            object3 = this.b;
            n7 = motionLayout.getOptimizationLevel();
            n4 = motionLayout.getHeight();
            n3 = 0x40000000;
            n4 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n3);
            n3 = View.MeasureSpec.makeMeasureSpec((int)motionLayout.getWidth(), (int)n3);
            motionLayout.resolveSystem((Z50)object3, n7, n4, n3);
        }
        object3 = ((tf3_0)object4).x0.iterator();
        while ((n7 = object3.hasNext()) != 0) {
            object2 = (Y50)object3.next();
            ((Y50)object2).l0 = n8;
            object = (View)((Y50)object2).j0;
            n4 = object.getId();
            sparseArray.put(n4, object2);
        }
        object3 = ((tf3_0)object4).x0;
        Iterator iterator = ((ArrayList)object3).iterator();
        while ((n10 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            Object object6;
            Object object7 = object3 = iterator.next();
            object7 = (Y50)object3;
            Object object8 = object3 = ((Y50)object7).j0;
            object2 = ((b)object5).g;
            object8 = (View)object3;
            n10 = object8.getId();
            object = n10;
            n4 = (int)(((HashMap)object2).containsKey(object) ? 1 : 0);
            if (n4 != 0) {
                object3 = n10;
                if ((object3 = (b$a)((HashMap)object2).get(object3)) != null) {
                    ((b$a)object3).a(constraints$LayoutParams);
                }
            }
            n10 = object8.getId();
            n10 = ((b)object5).j((int)n10).e.c;
            ((Y50)object7).W(n10);
            n10 = object8.getId();
            object3 = ((b)object5).j((int)n10).e;
            n10 = ((b$b)object3).d;
            ((Y50)object7).R(n10);
            n10 = object8 instanceof ConstraintHelper;
            if (n10 != 0) {
                object3 = object8;
                object = ((b)object5).g;
                object3 = (ConstraintHelper)((Object)object8);
                n7 = object3.getId();
                object6 = n7;
                n3 = (int)(((HashMap)object).containsKey(object6) ? 1 : 0);
                if (n3 != 0) {
                    object2 = n7;
                    if ((object2 = (b$a)((HashMap)object).get(object2)) != null && (n4 = object7 instanceof F41) != 0) {
                        object = object7;
                        object = (F41)object7;
                        ((ConstraintHelper)((Object)object3)).l((b$a)object2, (F41)object, constraints$LayoutParams, sparseArray);
                    }
                }
                if ((n10 = object8 instanceof Barrier) != 0) {
                    object3 = object8;
                    object3 = (Barrier)((Object)object8);
                    ((ConstraintHelper)((Object)object3)).q();
                }
            }
            n10 = motionLayout.getLayoutDirection();
            constraints$LayoutParams.resolveLayoutDirection(n10);
            n10 = (int)(MotionLayout.H0 ? 1 : 0);
            object3 = motionLayout$c.g;
            n7 = 0;
            object2 = null;
            object = object8;
            object6 = object7;
            object8 = sparseArray;
            ((ConstraintLayout)((Object)object3)).applyConstraintsFromLayoutParams(false, (View)object, (Y50)object7, constraints$LayoutParams, sparseArray);
            n10 = ((View)object).getId();
            object3 = ((b)object5).j((int)n10).c;
            n10 = ((b$d)object3).c;
            if (n10 == n8) {
                ((Y50)object7).k0 = n10 = ((View)object).getVisibility();
                continue;
            }
            n10 = ((View)object).getId();
            object3 = ((b)object5).j((int)n10).c;
            ((Y50)object7).k0 = n10 = ((b$d)object3).b;
        }
        object4 = ((tf3_0)object4).x0.iterator();
        while (bl2 = object4.hasNext()) {
            object5 = (Y50)object4.next();
            n10 = object5 instanceof se3_0;
            if (n10 == 0) continue;
            object3 = (ConstraintHelper)((Object)((Y50)object5).j0);
            object5 = (C41)object5;
            ((ConstraintHelper)((Object)object3)).p((C41)object5, sparseArray);
            object5 = (se3_0)object5;
            object3 = null;
            for (n10 = 0; n10 < (n7 = ((F41)object5).y0); n10 += n8) {
                object2 = ((F41)object5).x0[n10];
                if (object2 == null) continue;
                ((Y50)object2).I = n8;
            }
        }
    }
}

