/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.animation.Interpolator
 */
package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout$1;
import androidx.constraintlayout.motion.widget.MotionLayout$3;
import androidx.constraintlayout.motion.widget.MotionLayout$4;
import androidx.constraintlayout.motion.widget.MotionLayout$a;
import androidx.constraintlayout.motion.widget.MotionLayout$b;
import androidx.constraintlayout.motion.widget.MotionLayout$c;
import androidx.constraintlayout.motion.widget.MotionLayout$d;
import androidx.constraintlayout.motion.widget.MotionLayout$e;
import androidx.constraintlayout.motion.widget.MotionLayout$f;
import androidx.constraintlayout.motion.widget.MotionLayout$g;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.motion.widget.a$b;
import androidx.constraintlayout.motion.widget.a$b$a;
import androidx.constraintlayout.motion.widget.b;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.motion.widget.c$a;
import androidx.constraintlayout.motion.widget.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b$b;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView$d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MotionLayout
extends ConstraintLayout
implements xu1_2 {
    public static boolean H0;
    public int A;
    public MotionLayout$g A0;
    public int B;
    public final MotionLayout$c B0;
    public boolean C;
    public boolean C0;
    public float D;
    public final RectF D0;
    public float E;
    public View E0;
    public long F;
    public Matrix F0;
    public float G;
    public final ArrayList G0;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public CopyOnWriteArrayList L;
    public int M;
    public long N;
    public float O;
    public int P;
    public float Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public a a;
    public oq1_0 b;
    public Interpolator c = null;
    public float d = 0.0f;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public final HashMap k;
    public int k0;
    public long l;
    public float m;
    public float n;
    public float o;
    public long p;
    public int p0;
    public float q;
    public int q0;
    public boolean r;
    public float r0;
    public boolean s;
    public final Tn1 s0;
    public MotionLayout$f t;
    public boolean t0;
    public int u;
    public MotionLayout$e u0;
    public MotionLayout$b v;
    public Runnable v0;
    public boolean w;
    public final boolean w0;
    public final ec3_1 x;
    public final HashMap x0;
    public final MotionLayout$a y;
    public final Rect y0;
    public tp0_0 z;
    public boolean z0;

    public MotionLayout(Context context) {
        super(context);
        int n3;
        this.e = n3 = -1;
        this.f = n3;
        this.g = n3;
        this.h = 0;
        this.i = 0;
        this.j = true;
        Object object = new HashMap();
        this.k = object;
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.u = 0;
        this.w = false;
        this.x = object = new ec3_1();
        this.y = object = new MotionLayout$a(this);
        this.C = false;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = 0;
        this.N = -1;
        this.O = 0.0f;
        this.P = 0;
        this.Q = 0.0f;
        this.R = false;
        Object object2 = new Tn1();
        this.s0 = object2;
        this.t0 = false;
        this.v0 = null;
        this.w0 = false;
        this.x0 = object2 = new HashMap();
        this.y0 = object2 = new Rect();
        this.z0 = false;
        object2 = MotionLayout$g.UNDEFINED;
        this.A0 = object2;
        super(this);
        this.B0 = object2;
        this.C0 = false;
        super();
        this.D0 = object2;
        this.E0 = null;
        this.F0 = null;
        super();
        this.G0 = object2;
        this.n(null);
    }

    public MotionLayout(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        int n3;
        this.e = n3 = -1;
        this.f = n3;
        this.g = n3;
        this.h = 0;
        this.i = 0;
        this.j = true;
        Object object2 = new HashMap();
        this.k = object2;
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.u = 0;
        this.w = false;
        this.x = object2 = new ec3_1();
        this.y = object2 = new MotionLayout$a(this);
        this.C = false;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = 0;
        this.N = -1;
        this.O = 0.0f;
        this.P = 0;
        this.Q = 0.0f;
        this.R = false;
        Object object3 = new Tn1();
        this.s0 = object3;
        this.t0 = false;
        this.v0 = null;
        this.w0 = false;
        this.x0 = object3 = new HashMap();
        this.y0 = object3 = new Rect();
        this.z0 = false;
        object3 = MotionLayout$g.UNDEFINED;
        this.A0 = object3;
        super(this);
        this.B0 = object3;
        this.C0 = false;
        super();
        this.D0 = object3;
        this.E0 = null;
        this.F0 = null;
        super();
        this.G0 = object;
        this.n(attributeSet);
    }

    public MotionLayout(Context object, AttributeSet attributeSet, int n3) {
        super((Context)object, attributeSet, n3);
        int n4;
        this.e = n4 = -1;
        this.f = n4;
        this.g = n4;
        this.h = 0;
        this.i = 0;
        this.j = true;
        Object object2 = new HashMap();
        this.k = object2;
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.u = 0;
        this.w = false;
        this.x = object2 = new ec3_1();
        this.y = object2 = new MotionLayout$a(this);
        this.C = false;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = 0;
        this.N = -1;
        this.O = 0.0f;
        this.P = 0;
        this.Q = 0.0f;
        this.R = false;
        Object object3 = new Tn1();
        this.s0 = object3;
        this.t0 = false;
        this.v0 = null;
        this.w0 = false;
        this.x0 = object3 = new HashMap();
        this.y0 = object3 = new Rect();
        this.z0 = false;
        object3 = MotionLayout$g.UNDEFINED;
        this.A0 = object3;
        super(this);
        this.B0 = object3;
        this.C0 = false;
        super();
        this.D0 = object3;
        this.E0 = null;
        this.F0 = null;
        super();
        this.G0 = object;
        this.n(attributeSet);
    }

    public static Rect a(MotionLayout motionLayout, Y50 y50) {
        motionLayout.getClass();
        int n3 = y50.x();
        motionLayout = motionLayout.y0;
        ((Rect)motionLayout).top = n3;
        ((Rect)motionLayout).left = n3 = y50.w();
        n3 = y50.v();
        int n4 = ((Rect)motionLayout).left;
        ((Rect)motionLayout).right = n3 += n4;
        int n7 = y50.p();
        n3 = ((Rect)motionLayout).top;
        ((Rect)motionLayout).bottom = n7 += n3;
        return motionLayout;
    }

    public static /* synthetic */ Z50 b(MotionLayout motionLayout) {
        return motionLayout.mLayoutWidget;
    }

    public static /* synthetic */ Z50 c(MotionLayout motionLayout) {
        return motionLayout.mLayoutWidget;
    }

    public static /* synthetic */ Z50 d(MotionLayout motionLayout) {
        return motionLayout.mLayoutWidget;
    }

    public static /* synthetic */ Z50 e(MotionLayout motionLayout) {
        return motionLayout.mLayoutWidget;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void dispatchDraw(Canvas var1_1) {
        block63: {
            var2_2 = this;
            var3_3 /* !! */  = var1_1;
            var4_4 = this.K;
            if (var4_4 != null) {
                var4_4 = var4_4.iterator();
                while ((var5_5 = var4_4.hasNext()) != 0) {
                    var6_6 = (MotionHelper)var4_4.next();
                    var6_6.getClass();
                }
            }
            var7_7 = 0;
            var8_8 = 0.0f;
            var4_4 = null;
            var2_2.h(false);
            var6_6 = var2_2.a;
            var9_9 = 0;
            var10_10 = 0.0f;
            var11_11 /* !! */  = null;
            if (var6_6 != null && (var6_6 = var6_6.q) != null && (var12_12 = var6_6.d) != null) {
                var12_12 = var12_12.iterator();
                while ((var13_13 = var12_12.hasNext()) != 0) {
                    var14_14 = (c$a)var12_12.next();
                    var14_14.a();
                }
                var12_12 = var6_6.d;
                var14_14 = var6_6.e;
                var12_12.removeAll((Collection<?>)var14_14);
                var14_14.clear();
                var12_12 = var6_6.d;
                var15_15 = (int)var12_12.isEmpty();
                if (var15_15 != 0) {
                    var6_6.d = null;
                }
            }
            super.dispatchDraw(var1_1);
            var6_6 = var2_2.a;
            if (var6_6 == null) {
                return;
            }
            var5_5 = var2_2.u;
            var15_15 = 1;
            var16_16 /* !! */  = 1.4E-45f;
            var13_13 = 1093664768;
            var17_17 = 11.0f;
            var18_18 = 1092616192;
            var19_19 = 10.0f;
            if ((var5_5 &= var15_15) == var15_15 && (var5_5 = (int)this.isInEditMode()) == 0) {
                var2_2.M = var5_5 = var2_2.M + var15_15;
                var20_20 = this.getNanoTime();
                var22_21 = var2_2.N;
                var24_22 = -1;
                cfr_temp_0 = var22_21 - var24_22;
                var5_5 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var5_5 != 0) {
                    var24_22 = 200000000L;
                    cfr_temp_1 = (var22_21 = var20_20 - var22_21) - var24_22;
                    var5_5 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var5_5 > 0) {
                        var26_23 = var2_2.M;
                        var27_24 = var22_21;
                        var28_25 = 814313567;
                        var29_26 = 1.0E-9f;
                        var30_27 = 1120403456;
                        var27_24 = 100.0f;
                        var5_5 = (int)((var26_23 /= (var27_24 *= var29_26)) * var27_24);
                        var2_2.O = var26_23 = (float)var5_5 / var27_24;
                        var2_2.M = 0;
                        var2_2.N = var20_20;
                    }
                } else {
                    var2_2.N = var20_20;
                }
                var6_6 = new Paint();
                var6_6.setTextSize(42.0f);
                var31_28 = this.getProgress();
                var32_29 = 1148846080;
                var33_30 /* !! */  = 1000.0f;
                var31_28 = (float)((int)(var31_28 * var33_30 /* !! */ )) / var19_19;
                var34_31 = new StringBuilder();
                var27_24 = var2_2.O;
                var34_31.append(var27_24);
                var34_31.append(" fps ");
                var35_32 = oi0_0.e(var2_2.e, (MotionLayout)var2_2);
                var34_31.append((String)var35_32);
                var34_31.append(" -> ");
                var34_31 = Ex0.a(var34_31.toString());
                var35_32 = oi0_0.e(var2_2.g, (MotionLayout)var2_2);
                var34_31.append((String)var35_32);
                var35_32 = " (progress: ";
                var34_31.append((String)var35_32);
                var34_31.append(var31_28);
                var36_33 = " ) state=";
                var34_31.append((String)var36_33);
                var37_34 = var2_2.f;
                var30_27 = -1;
                var27_24 = 0.0f / 0.0f;
                var36_33 = var37_34 == var30_27 ? "undefined" : oi0_0.e(var37_34, (MotionLayout)var2_2);
                var34_31.append((String)var36_33);
                var36_33 = var34_31.toString();
                var6_6.setColor(-16777216);
                var33_30 /* !! */  = this.getHeight() + -29;
                var3_3 /* !! */ .drawText((String)var36_33, var17_17, var33_30 /* !! */ , (Paint)var6_6);
                var6_6.setColor(-7864184);
                var32_29 = this.getHeight() + -30;
                var33_30 /* !! */  = var32_29;
                var3_3 /* !! */ .drawText((String)var36_33, var19_19, var33_30 /* !! */ , (Paint)var6_6);
            }
            if ((var5_5 = var2_2.u) <= var15_15) break block63;
            var6_6 = var2_2.v;
            if (var6_6 == null) {
                var2_2.v = var6_6 = new MotionLayout$b((MotionLayout)var2_2);
            }
            var6_6 = var2_2.v;
            var36_33 = var2_2.k;
            var34_31 = var2_2.a;
            var32_29 = var34_31.c();
            var30_27 = var2_2.u;
            var6_6.getClass();
            if (var36_33 == null || (var28_25 = var36_33.size()) == 0) break block63;
            var1_1.save();
            var38_35 = var6_6.n;
            var39_36 = var38_35.isInEditMode();
            var40_37 = var6_6.e;
            var41_38 = 2;
            var42_39 = 2.8E-45f;
            if (var39_36 == 0 && (var39_36 = var30_27 & 1) == var41_38) {
                var43_40 = new StringBuilder();
                var44_41 = var38_35.getContext().getResources();
                var41_38 = var38_35.g;
                var45_42 = var44_41.getResourceName(var41_38);
                var43_40.append((String)var45_42);
                var45_42 = ":";
                var43_40.append((String)var45_42);
                var42_39 = var38_35.getProgress();
                var43_40.append(var42_39);
                var43_40 = var43_40.toString();
                var41_38 = var38_35.getHeight() + -30;
                var42_39 = var41_38;
                var44_41 = var6_6.h;
                var3_3 /* !! */ .drawText((String)var43_40, var19_19, var42_39, (Paint)var44_41);
                var18_18 = var38_35.getHeight() + -29;
                var19_19 = var18_18;
                var3_3 /* !! */ .drawText((String)var43_40, var17_17, var19_19, var40_37);
            }
            var14_14 = var36_33.values().iterator();
            while ((var18_18 = (int)var14_14.hasNext()) != 0) {
                block62: {
                    var46_43 = (fQ1)var14_14.next();
                    var36_33 = var46_43.f;
                    var37_34 = var36_33.b;
                    var38_35 = var46_43.u;
                    var43_40 = var38_35.iterator();
                    while ((var41_38 = (int)var43_40.hasNext()) != 0) {
                        var45_42 = (pq1_0)var43_40.next();
                        var41_38 = var45_42.b;
                        var37_34 = Math.max(var37_34, var41_38);
                    }
                    var43_40 = var46_43.g;
                    var39_36 = var43_40.b;
                    var37_34 = Math.max(var37_34, var39_36);
                    if (var30_27 > 0 && var37_34 == 0) {
                        var37_34 = 1;
                        var31_28 = 1.4E-45f;
                    }
                    if (var37_34 == 0) continue;
                    var43_40 = var6_6.c;
                    if (var43_40 != null) {
                        var45_42 = var46_43.j[0].g();
                        var44_41 = var6_6.b;
                        if (var44_41 != null) {
                            var47_44 = var38_35.iterator();
                            var48_45 = 0;
                            var49_46 = 0.0f;
                            while ((var50_47 = var47_44.hasNext()) != 0) {
                                var51_48 = var47_44.next();
                                var11_11 /* !! */  = (float[])var51_48;
                                var11_11 /* !! */  = (float[])((pq1_0)var51_48);
                                var50_47 = var48_45 + 1;
                                var9_9 = var11_11 /* !! */ .o;
                                var44_41[var48_45] = (Resources)var9_9;
                                var48_45 = var50_47;
                                var9_9 = 0;
                                var10_10 = 0.0f;
                                var11_11 /* !! */  = null;
                            }
                        }
                        var10_10 = 0.0f;
                        var11_11 /* !! */  = null;
                        var52_49 = 0;
                        var53_50 /* !! */  = 0.0f;
                        var44_41 = null;
                        for (var9_9 = 0; var9_9 < (var15_15 = ((Object)var45_42).length); ++var9_9) {
                            var12_12 = var46_43.j[0];
                            var54_51 = var6_6;
                            var55_52 = var45_42[var9_9];
                            var57_53 = var14_14;
                            var14_14 = var46_43.p;
                            var12_12.c((double)var55_52, (double[])var14_14);
                            var58_54 /* !! */  = var45_42[var9_9];
                            var4_4 = var46_43.o;
                            var6_6 = var46_43.p;
                            var47_44 = var12_12 = var46_43.f;
                            var12_12.d((double)var58_54 /* !! */ , (int[])var4_4, (double[])var6_6, (float[])var43_40, var52_49);
                            var52_49 += 2;
                            var6_6 = var54_51;
                            var14_14 = var57_53;
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var4_4 = null;
                        }
                        var54_51 = var6_6;
                        var57_53 = var14_14;
                        var7_7 = var52_49 / 2;
                    } else {
                        var57_53 = var14_14;
                        var7_7 = 0;
                        var8_8 = 0.0f;
                        var4_4 = null;
                    }
                    var6_6.k = var7_7;
                    var7_7 = 1;
                    var8_8 = 1.4E-45f;
                    if (var37_34 < var7_7) ** GOTO lbl601
                    var7_7 = var32_29 / 16;
                    var11_11 /* !! */  = var6_6.a;
                    if (var11_11 /* !! */  == null || (var9_9 = var11_11 /* !! */ .length) != (var15_15 = var7_7 * 2)) {
                        var9_9 = var7_7 * 2;
                        var11_11 /* !! */  = new float[var9_9];
                        var6_6.a = var11_11 /* !! */ ;
                        var11_11 /* !! */  = (float[])new Path;
                        var11_11 /* !! */ ();
                        var6_6.d = (Path)var11_11 /* !! */ ;
                    }
                    var9_9 = var6_6.m;
                    var16_16 /* !! */  = var9_9;
                    var3_3 /* !! */ .translate(var16_16 /* !! */ , var16_16 /* !! */ );
                    var15_15 = 0x77000000;
                    var16_16 /* !! */  = 2.5961484E33f;
                    var40_37.setColor(var15_15);
                    var14_14 = var6_6.i;
                    var14_14.setColor(var15_15);
                    var43_40 = var6_6.f;
                    var43_40.setColor(var15_15);
                    var45_42 = var6_6.g;
                    var45_42.setColor(var15_15);
                    var12_12 = var6_6.a;
                    var52_49 = var7_7 + -1;
                    var53_50 /* !! */  = var52_49;
                    var60_55 = var32_29;
                    var32_29 = 1065353216;
                    var33_30 /* !! */  = 1.0f;
                    var53_50 /* !! */  = var33_30 /* !! */  / var53_50 /* !! */ ;
                    var34_31 = var46_43.y;
                    var61_56 = var30_27;
                    var35_32 = "translationX";
                    if (var34_31 == null) {
                        var32_29 = 0;
                        var33_30 /* !! */  = 0.0f;
                        var34_31 = null;
                    } else {
                        var34_31 = (Ua3)var34_31.get(var35_32);
                    }
                    var2_2 = var46_43.y;
                    var62_57 = var9_9;
                    var11_11 /* !! */  = (float[])"translationY";
                    if (var2_2 == null) {
                        var63_58 = var45_42;
                        var64_59 = 0;
                        var65_60 = 0.0f;
                        var2_2 = null;
                    } else {
                        var2_2 = (Ua3)var2_2.get(var11_11 /* !! */ );
                        var63_58 = var45_42;
                    }
                    var45_42 = var46_43.z;
                    if (var45_42 == null) {
                        var30_27 = 0;
                        var27_24 = 0.0f;
                        var35_32 = null;
                    } else {
                        var35_32 = (ud3_1)var45_42.get(var35_32);
                    }
                    var45_42 = var46_43.z;
                    if (var45_42 == null) {
                        var9_9 = 0;
                        var10_10 = 0.0f;
                        var11_11 /* !! */  = null;
                    } else {
                        var11_11 /* !! */  = (float[])((ud3_1)var45_42.get(var11_11 /* !! */ ));
                    }
                    var66_61 = var14_14;
                    var41_38 = 0;
                    var42_39 = 0.0f;
                    var45_42 = null;
                    while (true) {
                        block66: {
                            block65: {
                                block64: {
                                    var14_14 = var46_43.f;
                                    var67_62 = 0.0f / 0.0f;
                                    var68_63 = var43_40;
                                    if (var41_38 >= var7_7) break;
                                    var69_64 = (float)var41_38 * var53_50 /* !! */ ;
                                    var70_65 = var7_7;
                                    var8_8 = var46_43.n;
                                    var50_47 = 1065353216;
                                    var71_66 = 1.0f;
                                    cfr_temp_2 = var8_8 - var71_66;
                                    var72_67 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                                    if (var72_67 /* !! */  == false) break block64;
                                    var73_68 = var53_50 /* !! */ ;
                                    var53_50 /* !! */  = var46_43.m;
                                    cfr_temp_3 = var69_64 - var53_50 /* !! */ ;
                                    var50_47 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                                    if (var50_47 < 0) {
                                        var39_36 = 0;
                                        var69_64 = 0.0f;
                                        var43_40 = null;
                                    }
                                    var50_47 = (int)(var69_64 == var53_50 /* !! */  ? 0 : (var69_64 > var53_50 /* !! */  ? 1 : -1));
                                    var74_69 = var2_2;
                                    if (var50_47 <= 0 || (var79_72 = (cfr_temp_4 = (var75_70 = (double)var69_64) - (var77_71 = 1.0)) == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1)) >= 0) break block65;
                                    var69_64 = (var69_64 - var53_50 /* !! */ ) * var8_8;
                                    var64_59 = 1065353216;
                                    var65_60 = 1.0f;
                                    var69_64 = Math.min(var69_64, var65_60);
                                    break block66;
                                }
                                var74_69 = var2_2;
                                var73_68 = var53_50 /* !! */ ;
                            }
                            var64_59 = 1065353216;
                            var65_60 = 1.0f;
                        }
                        var80_73 = var69_64;
                        var14_14 = var14_14.a;
                        var44_41 = var38_35.iterator();
                        var48_45 = 0;
                        var49_46 = 0.0f;
                        while ((var50_47 = (int)var44_41.hasNext()) != 0) {
                            var51_48 = var44_41.next();
                            var2_2 = var51_48;
                            var2_2 = (pq1_0)var51_48;
                            var77_71 = var80_73;
                            var3_3 /* !! */  = var2_2.a;
                            if (var3_3 /* !! */  != null) {
                                var8_8 = var2_2.c;
                                cfr_temp_5 = var8_8 - var69_64;
                                var79_72 = (double)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1));
                                if (var79_72 < 0) {
                                    var14_14 = var3_3 /* !! */ ;
                                    var49_46 = var8_8;
                                } else {
                                    var82_74 = Float.isNaN(var67_62);
                                    if (var82_74 != 0) {
                                        var67_62 = var65_60 = var2_2.c;
                                    }
                                }
                            }
                            var80_73 = var77_71;
                            var64_59 = 1065353216;
                            var65_60 = 1.0f;
                        }
                        var77_71 = var80_73;
                        if (var14_14 != null) {
                            var64_59 = (int)Float.isNaN(var67_62);
                            if (var64_59 != 0) {
                                var50_47 = 1065353216;
                                var71_66 = 1.0f;
                            } else {
                                var71_66 = var67_62;
                            }
                            var65_60 = var69_64 - var49_46;
                            var75_70 = var65_60 / (var71_66 -= var49_46);
                            var65_60 = (float)var14_14.a(var75_70) * var71_66 + var49_46;
                            var75_70 = var65_60;
                        } else {
                            var75_70 = var80_73;
                        }
                        var4_4 = var46_43.j;
                        var13_13 = 0;
                        var17_17 = 0.0f;
                        var4_4 = var4_4[0];
                        var14_14 = var46_43.p;
                        var4_4.c(var75_70, (double[])var14_14);
                        var4_4 = var46_43.k;
                        if (var4_4 != null && (var52_49 = ((Object)(var14_14 = (Object)var46_43.p)).length) > 0) {
                            var4_4.c(var75_70, (double[])var14_14);
                        }
                        var4_4 = var46_43.o;
                        var14_14 = var46_43.p;
                        var52_49 = var41_38 * 2;
                        var83_75 = var38_35;
                        var47_44 = var38_35 = var46_43.f;
                        var58_54 /* !! */  = var75_70;
                        var38_35.d(var75_70, (int[])var4_4, (double[])var14_14, (float[])var12_12, var52_49);
                        if (var35_32 != null) {
                            var65_60 = (float)var12_12[var52_49];
                            var84_76 /* !! */  = var35_32.a(var69_64) + var65_60;
                            var12_12[var52_49] = var84_76 /* !! */ ;
                        } else if (var34_31 != null) {
                            var65_60 = (float)var12_12[var52_49];
                            var84_76 /* !! */  = var34_31.a(var69_64) + var65_60;
                            var12_12[var52_49] = var84_76 /* !! */ ;
                        }
                        if (var11_11 /* !! */  != null) {
                            var65_60 = (float)var12_12[++var52_49];
                            var84_76 /* !! */  = var11_11 /* !! */ .a(var69_64) + var65_60;
                            var12_12[var52_49] = var84_76 /* !! */ ;
                            while (true) {
                                var3_3 /* !! */  = var74_69;
                                break;
                            }
                        } else {
                            if (var74_69 == null) ** continue;
                            var65_60 = (float)var12_12[++var52_49];
                            var3_3 /* !! */  = var74_69;
                            var8_8 = var74_69.a(var69_64) + var65_60;
                            var12_12[var52_49] = var8_8;
                        }
                        ++var41_38;
                        var2_2 = var3_3 /* !! */ ;
                        var43_40 = var68_63;
                        var7_7 = var70_65;
                        var53_50 /* !! */  = var73_68;
                        var38_35 = var83_75;
                        var3_3 /* !! */  = var1_1;
                    }
                    var64_59 = var6_6.k;
                    var3_3 /* !! */  = var1_1;
                    var6_6.a(var1_1, var37_34, var64_59, var46_43);
                    var40_37.setColor(-21965);
                    var64_59 = -2067046;
                    var4_4 = var43_40;
                    var43_40.setColor(var64_59);
                    var4_4 = var66_61;
                    var66_61.setColor(var64_59);
                    var4_4 = var63_58;
                    var63_58.setColor(-13391360);
                    var64_59 = var62_57;
                    var65_60 = -var62_57;
                    var1_1.translate(var65_60, var65_60);
                    var64_59 = var6_6.k;
                    var6_6.a(var1_1, var37_34, var64_59, var46_43);
                    var64_59 = 5;
                    var65_60 = 7.0E-45f;
                    if (var37_34 == var64_59) {
                        var6_6.d.reset();
                        var7_7 = 0;
                        var8_8 = 0.0f;
                        var4_4 = null;
                        while (true) {
                            var15_15 = 50;
                            var16_16 /* !! */  = 7.0E-44f;
                            if (var7_7 > var15_15) break;
                            var31_28 = var7_7;
                            var16_16 /* !! */  = var15_15;
                            var31_28 /= var16_16 /* !! */ ;
                            var15_15 = 0;
                            var16_16 /* !! */  = 0.0f;
                            var12_12 = null;
                            var31_28 = var46_43.b(var31_28, null);
                            var34_31 = var46_43.j[0];
                            var85_77 = var31_28;
                            var36_33 = var46_43.p;
                            var34_31.c(var85_77, (double[])var36_33);
                            var36_33 = var46_43.o;
                            var34_31 = var46_43.p;
                            var27_24 = var14_14.e;
                            var29_26 = var14_14.f;
                            var69_64 = var14_14.g;
                            var53_50 /* !! */  = var14_14.h;
                            var42_39 = var69_64;
                            var69_64 = var29_26;
                            var29_26 = var27_24;
                            var30_27 = 0;
                            var27_24 = 0.0f;
                            var35_32 = null;
                            while (true) {
                                var15_15 = ((Object)var36_33).length;
                                var9_9 = 3;
                                var10_10 = 4.2E-45f;
                                if (var30_27 >= var15_15) break;
                                var75_70 = (double)var34_31[var30_27];
                                var65_60 = (float)var75_70;
                                var82_74 = (int)var36_33[var30_27];
                                var15_15 = 1;
                                var16_16 /* !! */  = 1.4E-45f;
                                if (var82_74 != var15_15) {
                                    var15_15 = 2;
                                    var16_16 /* !! */  = 2.8E-45f;
                                    if (var82_74 != var15_15) {
                                        if (var82_74 != var9_9) {
                                            var9_9 = 4;
                                            var10_10 = 5.6E-45f;
                                            if (var82_74 == var9_9) {
                                                var53_50 /* !! */  = var65_60;
                                            }
                                        } else {
                                            var42_39 = var65_60;
                                        }
                                    } else {
                                        var69_64 = var65_60;
                                    }
                                } else {
                                    var29_26 = var65_60;
                                }
                                ++var30_27;
                                var3_3 /* !! */  = var1_1;
                                var64_59 = 5;
                                var65_60 = 7.0E-45f;
                            }
                            var2_2 = var14_14.m;
                            if (var2_2 != null) {
                                var64_59 = 0;
                                var2_2 = null;
                                var87_78 = 0.0f;
                                var75_70 = var29_26;
                                var85_77 = var69_64;
                                var89_79 = Math.sin(var85_77) * var75_70 + var87_78;
                                var39_36 = 0x40000000;
                                var69_64 = 2.0f;
                                var16_16 /* !! */  = var42_39 / var69_64;
                                var91_80 = var16_16 /* !! */ ;
                                var91_80 = var89_79 - var91_80;
                                var10_10 = (float)var91_80;
                                var85_77 = Math.cos(var85_77) * var75_70;
                                var87_78 -= var85_77;
                                var65_60 = var53_50 /* !! */  / var69_64;
                                var75_70 = var65_60;
                                var69_64 = (float)(var87_78 -= var75_70);
                                var29_26 = var10_10;
                            }
                            var42_39 += var29_26;
                            var53_50 /* !! */  += var69_64;
                            Float.isNaN(var67_62);
                            Float.isNaN(var67_62);
                            var2_2 = null;
                            var29_26 += 0.0f;
                            var69_64 += 0.0f;
                            var42_39 += 0.0f;
                            var53_50 /* !! */  += 0.0f;
                            var3_3 /* !! */  = (Canvas)var6_6.j;
                            var9_9 = 0;
                            var10_10 = 0.0f;
                            var11_11 /* !! */  = null;
                            var3_3 /* !! */ [0] = (Canvas)var29_26;
                            var37_34 = 1;
                            var31_28 = 1.4E-45f;
                            var3_3 /* !! */ [var37_34] = (Canvas)var69_64;
                            var3_3 /* !! */ [2] = (Canvas)var42_39;
                            var3_3 /* !! */ [3] = (Canvas)var69_64;
                            var3_3 /* !! */ [4] = (Canvas)var42_39;
                            var3_3 /* !! */ [5] = (Canvas)var53_50 /* !! */ ;
                            var32_29 = 6;
                            var3_3 /* !! */ [var32_29] = (Canvas)var29_26;
                            var30_27 = 7;
                            var27_24 = 9.8E-45f;
                            var3_3 /* !! */ [var30_27] = (Canvas)var53_50 /* !! */ ;
                            var45_42 = var6_6.d;
                            var45_42.moveTo(var29_26, var69_64);
                            var38_35 = var6_6.d;
                            var39_36 = 2;
                            var69_64 = 2.8E-45f;
                            var42_39 = (float)var3_3 /* !! */ [var39_36];
                            var52_49 = 3;
                            var53_50 /* !! */  = (float)var3_3 /* !! */ [var52_49];
                            var38_35.lineTo(var42_39, var53_50 /* !! */ );
                            var38_35 = var6_6.d;
                            var15_15 = 4;
                            var16_16 /* !! */  = (float)var3_3 /* !! */ [var15_15];
                            var41_38 = 5;
                            var42_39 = 7.0E-45f;
                            var53_50 /* !! */  = (float)var3_3 /* !! */ [var41_38];
                            var38_35.lineTo(var16_16 /* !! */ , var53_50 /* !! */ );
                            var12_12 = var6_6.d;
                            var33_30 /* !! */  = (float)var3_3 /* !! */ [var32_29];
                            var84_76 /* !! */  = (float)var3_3 /* !! */ [var30_27];
                            var12_12.lineTo(var33_30 /* !! */ , var84_76 /* !! */ );
                            var6_6.d.close();
                            ++var7_7;
                            var3_3 /* !! */  = var1_1;
                            var64_59 = 5;
                            var65_60 = 7.0E-45f;
                        }
                        var9_9 = 0;
                        var10_10 = 0.0f;
                        var11_11 /* !! */  = null;
                        var37_34 = 1;
                        var31_28 = 1.4E-45f;
                        var39_36 = 2;
                        var69_64 = 2.8E-45f;
                        var64_59 = 0x44000000;
                        var65_60 = 512.0f;
                        var40_37.setColor(var64_59);
                        var2_2 = var1_1;
                        var84_76 /* !! */  = 2.0f;
                        var1_1.translate(var84_76 /* !! */ , var84_76 /* !! */ );
                        var3_3 /* !! */  = var6_6.d;
                        var1_1.drawPath((Path)var3_3 /* !! */ , var40_37);
                        var84_76 /* !! */  = -2.0f;
                        var1_1.translate(var84_76 /* !! */ , var84_76 /* !! */ );
                        var82_74 = -65536;
                        var84_76 /* !! */  = 0.0f / 0.0f;
                        var40_37.setColor(var82_74);
                        var3_3 /* !! */  = var6_6.d;
                        var1_1.drawPath((Path)var3_3 /* !! */ , var40_37);
                    } else {
                        var2_2 = var1_1;
lbl592:
                        // 2 sources

                        while (true) {
                            var9_9 = 0;
                            var10_10 = 0.0f;
                            var11_11 /* !! */  = null;
                            var37_34 = 1;
                            var31_28 = 1.4E-45f;
                            var39_36 = 2;
                            var69_64 = 2.8E-45f;
                            break block62;
                            break;
                        }
lbl601:
                        // 1 sources

                        var2_2 = var3_3 /* !! */ ;
                        var60_55 = var32_29;
                        var61_56 = var30_27;
                        ** continue;
                    }
                }
                var7_7 = 0;
                var8_8 = 0.0f;
                var4_4 = null;
                var9_9 = 0;
                var10_10 = 0.0f;
                var11_11 /* !! */  = null;
                var15_15 = 1;
                var16_16 /* !! */  = 1.4E-45f;
                var3_3 /* !! */  = var2_2;
                var32_29 = var60_55;
                var14_14 = var57_53;
                var30_27 = var61_56;
                var2_2 = this;
            }
            var2_2 = var3_3 /* !! */ ;
            var1_1.restore();
        }
        var2_2 = this;
        var3_3 /* !! */  = this.K;
        if (var3_3 /* !! */  != null) {
            var3_3 /* !! */  = var3_3 /* !! */ .iterator();
            while ((var7_7 = var3_3 /* !! */ .hasNext()) != 0) {
                var4_4 = (MotionHelper)var3_3 /* !! */ .next();
                var4_4.getClass();
            }
        }
    }

    public final void f(float f5) {
        long l2;
        Interpolator interpolator2;
        float f6;
        float f7;
        a a2 = this.a;
        if (a2 == null) {
            return;
        }
        float f8 = this.o;
        float f11 = this.n;
        float f12 = f8 - f11;
        Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object != false && (object = (Object)this.r) != false) {
            this.o = f11;
        }
        if ((f7 = (f6 = (f8 = this.o) - f5) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) == false) {
            return;
        }
        this.w = false;
        this.q = f5;
        this.m = f5 = (float)a2.c() / 1000.0f;
        f5 = this.q;
        this.setProgress(f5);
        this.b = null;
        this.c = interpolator2 = this.a.e();
        this.r = false;
        this.l = l2 = this.getNanoTime();
        this.s = true;
        this.n = f8;
        this.o = f8;
        this.invalidate();
    }

    public final void g(boolean bl2) {
        int n3 = this.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            Object object;
            int n7;
            Object object2 = this.getChildAt(i3);
            Object object3 = this.k;
            if ((object2 = (fQ1)object3.get(object2)) == null || (n7 = ((String)(object = "button")).equals(object3 = oi0_0.d(object2.b))) == 0 || (object3 = object2.A) == null) continue;
            object3 = null;
            for (n7 = 0; n7 < (n4 = ((qo1_1[])(object = object2.A)).length); ++n7) {
                float f5;
                object = object[n7];
                if (bl2) {
                    n4 = -1027080192;
                    f5 = -100.0f;
                } else {
                    n4 = 1120403456;
                    f5 = 100.0f;
                }
                View view = object2.b;
                ((qo1_1)object).h(f5, view);
            }
        }
    }

    public int[] getConstraintSetIds() {
        a a2 = this.a;
        if (a2 == null) {
            return null;
        }
        a2 = a2.g;
        int n3 = a2.size();
        int[] nArray = new int[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            nArray[i3] = n4 = a2.keyAt(i3);
        }
        return nArray;
    }

    public int getCurrentState() {
        return this.f;
    }

    public ArrayList getDefinedTransitions() {
        a a2 = this.a;
        if (a2 == null) {
            return null;
        }
        return a2.d;
    }

    public tp0_0 getDesignTool() {
        tp0_0 tp0_02 = this.z;
        if (tp0_02 == null) {
            this.z = tp0_02 = new Object();
        }
        return this.z;
    }

    public int getEndState() {
        return this.g;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.o;
    }

    public a getScene() {
        return this.a;
    }

    public int getStartState() {
        return this.e;
    }

    public float getTargetPosition() {
        return this.q;
    }

    public Bundle getTransitionState() {
        float f5;
        float f6;
        int n3;
        MotionLayout$e motionLayout$e = this.u0;
        if (motionLayout$e == null) {
            this.u0 = motionLayout$e = new MotionLayout$e(this);
        }
        motionLayout$e = this.u0;
        MotionLayout motionLayout = motionLayout$e.e;
        motionLayout$e.d = n3 = motionLayout.g;
        motionLayout$e.c = n3 = motionLayout.e;
        motionLayout$e.b = f6 = motionLayout.getVelocity();
        motionLayout$e.a = f5 = motionLayout.getProgress();
        motionLayout$e = this.u0;
        motionLayout$e.getClass();
        motionLayout = new Bundle();
        float f7 = motionLayout$e.a;
        motionLayout.putFloat("motion.progress", f7);
        f7 = motionLayout$e.b;
        motionLayout.putFloat("motion.velocity", f7);
        int n4 = motionLayout$e.c;
        motionLayout.putInt("motion.StartState", n4);
        int n7 = motionLayout$e.d;
        motionLayout.putInt("motion.EndState", n7);
        return motionLayout;
    }

    public long getTransitionTimeMs() {
        a a2 = this.a;
        float f5 = 1000.0f;
        if (a2 != null) {
            float f6;
            int n3 = a2.c();
            this.m = f6 = (float)n3 / f5;
        }
        return (long)(this.m * f5);
    }

    public float getVelocity() {
        return this.d;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void h(boolean var1_1) {
        block44: {
            block52: {
                block51: {
                    block50: {
                        block47: {
                            block49: {
                                block48: {
                                    block43: {
                                        block45: {
                                            block46: {
                                                var2_2 = this;
                                                var3_3 = this.p;
                                                var5_4 = -1;
                                                cfr_temp_0 = var3_3 - var5_4;
                                                var7_5 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                if (var7_5 /* !! */  == false) {
                                                    this.p = var3_3 = this.getNanoTime();
                                                }
                                                var8_6 = var2_2.o;
                                                var9_7 = -1;
                                                var10_8 = 0.0f / 0.0f;
                                                var11_9 = 1065353216;
                                                var12_10 = 1.0f;
                                                cfr_temp_1 = var8_6 - 0.0f;
                                                var7_5 /* !! */  = (long)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                                if (var7_5 /* !! */  > 0 && (var7_5 /* !! */  = (long)(var8_6 == var12_10 ? 0 : (var8_6 < var12_10 ? -1 : 1))) < 0) {
                                                    var2_2.f = var9_7;
                                                }
                                                var7_5 /* !! */  = (long)var2_2.H;
                                                var13_11 = 1;
                                                var14_12 = 1.4E-45f;
                                                var15_13 = 0;
                                                var16_14 = 0.0f;
                                                if (var7_5 /* !! */  == false && ((var7_5 /* !! */  = (long)var2_2.s) == false || !var1_1 && (var7_5 /* !! */  = (long)((cfr_temp_2 = (var17_15 = var2_2.q) - var8_6) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) == false)) break block44;
                                                var17_15 = var2_2.q - var8_6;
                                                var8_6 = Math.signum(var17_15);
                                                var18_16 = this.getNanoTime();
                                                var20_17 = var2_2.b;
                                                var21_18 = var20_17 instanceof oq1_0;
                                                var22_19 = 814313567;
                                                var23_20 = 1.0E-9f;
                                                if (var21_18 == 0) {
                                                    var24_21 = var2_2.p;
                                                    var24_21 = var18_16 - var24_21;
                                                    var26_22 = (float)var24_21 * var8_6 * var23_20;
                                                    var27_23 = var2_2.m;
                                                    var26_22 /= var27_23;
                                                } else {
                                                    var21_18 = 0;
                                                    var26_22 = 0.0f;
                                                    var28_24 = null;
                                                }
                                                var27_23 = var2_2.o + var26_22;
                                                var29_25 = var2_2.r;
                                                if (var29_25 != 0) {
                                                    var27_23 = var2_2.q;
                                                }
                                                if ((var29_25 = (cfr_temp_3 = var8_6 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1)) > 0 && (var31_27 = (cfr_temp_4 = var27_23 - (var30_26 = var2_2.q)) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1)) >= 0 || (var31_27 = (cfr_temp_5 = var8_6 - 0.0f) == 0.0f ? 0 : (cfr_temp_5 < 0.0f ? -1 : 1)) <= 0 && (var31_27 = (cfr_temp_6 = var27_23 - (var30_26 = var2_2.q)) == 0.0f ? 0 : (cfr_temp_6 < 0.0f ? -1 : 1)) <= 0) {
                                                    var27_23 = var2_2.q;
                                                    var2_2.s = false;
                                                    var31_27 = (float)true;
                                                    var30_26 = 1.4E-45f;
                                                } else {
                                                    var31_27 = (float)false;
                                                    var30_26 = 0.0f;
                                                }
                                                var2_2.o = var27_23;
                                                var2_2.n = var27_23;
                                                var2_2.p = var18_16;
                                                var32_28 = 1.0E-5f;
                                                if (var20_17 == null || var31_27 != false) break block45;
                                                var31_27 = (float)var2_2.w;
                                                if (var31_27 == false) break block46;
                                                var33_29 = var2_2.l;
                                                var33_29 = var18_16 - var33_29;
                                                var10_8 = (float)var33_29 * var23_20;
                                                var10_8 = var20_17.getInterpolation(var10_8);
                                                var35_30 = var2_2.b;
                                                var20_17 = var2_2.x;
                                                var21_18 = 2;
                                                var26_22 = 2.8E-45f;
                                                if (var35_30 == var20_17) {
                                                    var35_30 = var20_17.c;
                                                    var11_9 = (int)var35_30.b();
                                                    if (var11_9 != 0) {
                                                        var11_9 = 2;
                                                        var12_10 = 2.8E-45f;
                                                    } else {
                                                        var11_9 = 1;
                                                        var12_10 = 1.4E-45f;
                                                    }
                                                } else {
                                                    var11_9 = 0;
                                                    var12_10 = 0.0f;
                                                    var35_30 = null;
                                                }
                                                var2_2.o = var10_8;
                                                var2_2.p = var18_16;
                                                var20_17 = var2_2.b;
                                                var36_31 /* !! */  = var20_17 instanceof oq1_0;
                                                if (var36_31 /* !! */  == 0) ** GOTO lbl-1000
                                                var2_2.d = var17_15 = var20_17.a();
                                                var37_32 = Math.abs(var17_15);
                                                var38_33 = var2_2.m;
                                                cfr_temp_7 = (var37_32 *= var38_33) - var32_28;
                                                var36_31 /* !! */  = (int)(cfr_temp_7 == 0.0f ? 0 : (cfr_temp_7 < 0.0f ? -1 : 1));
                                                if (var36_31 /* !! */  <= 0 && var11_9 == var21_18) {
                                                    var2_2.s = false;
                                                }
                                                if ((var36_31 /* !! */  = (int)((cfr_temp_8 = var17_15 - 0.0f) == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1))) > 0) {
                                                    var36_31 /* !! */  = 1065353216;
                                                    var37_32 = 1.0f;
                                                    cfr_temp_9 = var10_8 - var37_32;
                                                    var39_34 /* !! */  = (float)(cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1));
                                                    if (var39_34 /* !! */  >= 0) {
                                                        var2_2.o = var37_32;
                                                        var2_2.s = false;
                                                        var9_7 = 1065353216;
                                                        var10_8 = 1.0f;
                                                    }
                                                }
                                                if ((var7_5 /* !! */  = (long)((cfr_temp_10 = var17_15 - 0.0f) == 0.0f ? 0 : (cfr_temp_10 < 0.0f ? -1 : 1))) < 0 && (var7_5 /* !! */  = (long)((cfr_temp_11 = var10_8 - 0.0f) == 0.0f ? 0 : (cfr_temp_11 < 0.0f ? -1 : 1))) <= 0) {
                                                    var2_2.o = 0.0f;
                                                    var2_2.s = false;
                                                    var27_23 = 0.0f;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var27_23 = var10_8;
                                                }
                                                break block43;
                                            }
                                            var10_8 = var20_17.getInterpolation(var27_23);
                                            var35_30 = var2_2.b;
                                            var7_5 /* !! */  = var35_30 instanceof oq1_0;
                                            var2_2.d = var7_5 /* !! */  != false ? (var12_10 = var35_30.a()) : (var12_10 = (var35_30.getInterpolation(var27_23 += var26_22) - var10_8) * var8_6 / var26_22);
                                            var27_23 = var10_8;
lbl115:
                                            // 2 sources

                                            while (true) {
                                                var11_9 = 0;
                                                var12_10 = 0.0f;
                                                var35_30 = null;
                                                break block43;
                                                break;
                                            }
                                        }
                                        var2_2.d = var26_22;
                                        ** while (true)
                                    }
                                    var10_8 = Math.abs(var2_2.d);
                                    var9_7 = (int)(var10_8 == var32_28 ? 0 : (var10_8 > var32_28 ? 1 : -1));
                                    if (var9_7 > 0) {
                                        var40_35 = MotionLayout$g.MOVING;
                                        var2_2.setState(var40_35);
                                    }
                                    if (var11_9 != var13_11) {
                                        if (var29_25 > 0 && (var9_7 = (int)((cfr_temp_12 = var27_23 - (var10_8 = var2_2.q)) == 0.0f ? 0 : (cfr_temp_12 > 0.0f ? 1 : -1))) >= 0 || (var9_7 = (int)((cfr_temp_13 = var8_6 - 0.0f) == 0.0f ? 0 : (cfr_temp_13 < 0.0f ? -1 : 1))) <= 0 && (var9_7 = (int)((cfr_temp_14 = var27_23 - (var10_8 = var2_2.q)) == 0.0f ? 0 : (cfr_temp_14 < 0.0f ? -1 : 1))) <= 0) {
                                            var27_23 = var2_2.q;
                                            var2_2.s = false;
                                        }
                                        var9_7 = 1065353216;
                                        var10_8 = 1.0f;
                                        cfr_temp_15 = var27_23 - var10_8;
                                        var11_9 = (int)(cfr_temp_15 == 0.0f ? 0 : (cfr_temp_15 > 0.0f ? 1 : -1));
                                        if (var11_9 >= 0 || (var9_7 = (int)((cfr_temp_16 = var27_23 - 0.0f) == 0.0f ? 0 : (cfr_temp_16 < 0.0f ? -1 : 1))) <= 0) {
                                            var2_2.s = false;
                                            var40_35 = MotionLayout$g.FINISHED;
                                            var2_2.setState(var40_35);
                                        }
                                    }
                                    var9_7 = this.getChildCount();
                                    var2_2.H = false;
                                    var18_16 = this.getNanoTime();
                                    var2_2.r0 = var27_23;
                                    var35_30 = var2_2.c;
                                    var12_10 = var35_30 == null ? var27_23 : var35_30.getInterpolation(var27_23);
                                    var20_17 = var2_2.c;
                                    if (var20_17 != null) {
                                        var26_22 = var2_2.m;
                                        var26_22 = var8_6 / var26_22 + var27_23;
                                        var2_2.d = var17_15 = var20_17.getInterpolation(var26_22);
                                        var28_24 = var2_2.c;
                                        var26_22 = var28_24.getInterpolation(var27_23);
                                        var2_2.d = var17_15 -= var26_22;
                                    }
                                    var17_15 = 0.0f;
                                    var20_17 = null;
                                    for (var7_5 /* !! */  = (long)0; var7_5 /* !! */  < var9_7; ++var7_5 /* !! */ ) {
                                        var28_24 = var2_2.getChildAt((int)var7_5 /* !! */ );
                                        var41_36 = var2_2.k.get(var28_24);
                                        var42_37 = var41_36;
                                        var42_37 = (fQ1)var41_36;
                                        if (var42_37 == null) continue;
                                        var22_19 = (int)var2_2.H;
                                        var43_38 = var2_2.s0;
                                        var21_18 = var42_37.f(var12_10, var18_16, var43_38, var28_24) | var22_19;
                                        var2_2.H = var21_18;
                                    }
                                    if (var29_25 > 0 && (var9_7 = (int)((cfr_temp_17 = var27_23 - (var10_8 = var2_2.q)) == 0.0f ? 0 : (cfr_temp_17 > 0.0f ? 1 : -1))) >= 0 || (var9_7 = (int)((cfr_temp_18 = var8_6 - 0.0f) == 0.0f ? 0 : (cfr_temp_18 < 0.0f ? -1 : 1))) <= 0 && (var9_7 = (int)((cfr_temp_19 = var27_23 - (var10_8 = var2_2.q)) == 0.0f ? 0 : (cfr_temp_19 < 0.0f ? -1 : 1))) <= 0) {
                                        var9_7 = 1;
                                        var10_8 = 1.4E-45f;
                                    } else {
                                        var9_7 = 0;
                                        var10_8 = 0.0f;
                                        var40_35 = null;
                                    }
                                    var11_9 = (int)var2_2.H;
                                    if (var11_9 == 0 && (var11_9 = (int)var2_2.s) == 0 && var9_7 != 0) {
                                        var35_30 = MotionLayout$g.FINISHED;
                                        var2_2.setState((MotionLayout$g)var35_30);
                                    }
                                    if ((var11_9 = (int)var2_2.R) != 0) {
                                        this.requestLayout();
                                    }
                                    var11_9 = (int)var2_2.H;
                                    var9_7 = var9_7 ^ var13_11 | var11_9;
                                    var2_2.H = var9_7;
                                    cfr_temp_20 = var27_23 - 0.0f;
                                    var9_7 = (int)(cfr_temp_20 == 0.0f ? 0 : (cfr_temp_20 < 0.0f ? -1 : 1));
                                    if (var9_7 <= 0) {
                                        var9_7 = var2_2.e;
                                        var11_9 = -1;
                                        var12_10 = 0.0f / 0.0f;
                                        if (var9_7 != var11_9 && (var11_9 = var2_2.f) != var9_7) {
                                            var2_2.f = var9_7;
                                            var35_30 = var2_2.a;
                                            var35_30.b(var9_7).a(var2_2);
                                            var40_35 = MotionLayout$g.FINISHED;
                                            var2_2.setState(var40_35);
                                            var15_13 = 1;
                                            var16_14 = 1.4E-45f;
                                        }
                                    }
                                    var44_39 = var27_23;
                                    var18_16 = 0x3FF0000000000000L;
                                    var46_40 = 1.0;
                                    cfr_temp_21 = var44_39 - var46_40;
                                    var7_5 /* !! */  = (long)(cfr_temp_21 == 0.0 ? 0 : (cfr_temp_21 > 0.0 ? 1 : -1));
                                    if (var7_5 /* !! */  >= 0 && (var9_7 = var2_2.f) != (var11_9 = var2_2.g)) {
                                        var2_2.f = var11_9;
                                        var2_2.a.b(var11_9).a(var2_2);
                                        var40_35 = MotionLayout$g.FINISHED;
                                        var2_2.setState(var40_35);
                                        var15_13 = 1;
                                        var16_14 = 1.4E-45f;
                                    }
                                    if ((var9_7 = (int)var2_2.H) != 0 || (var9_7 = (int)var2_2.s) != 0) break block47;
                                    if (var29_25 <= 0) break block48;
                                    var9_7 = 1065353216;
                                    var10_8 = 1.0f;
                                    cfr_temp_22 = var27_23 - var10_8;
                                    var11_9 = (int)(cfr_temp_22 == 0.0f ? 0 : (cfr_temp_22 > 0.0f ? 1 : -1));
                                    if (var11_9 == 0) break block49;
                                }
                                if ((var9_7 = (int)((cfr_temp_23 = var8_6 - 0.0f) == 0.0f ? 0 : (cfr_temp_23 < 0.0f ? -1 : 1))) >= 0 || (var9_7 = (int)((cfr_temp_24 = var27_23 - 0.0f) == 0.0f ? 0 : (cfr_temp_24 > 0.0f ? 1 : -1))) != 0) break block50;
                            }
                            var40_35 = MotionLayout$g.FINISHED;
                            var2_2.setState(var40_35);
                            break block50;
                        }
                        this.invalidate();
                    }
                    if ((var9_7 = (int)var2_2.H) != 0 || (var9_7 = (int)var2_2.s) != 0) break block44;
                    if (var29_25 <= 0) break block51;
                    var9_7 = 1065353216;
                    var10_8 = 1.0f;
                    cfr_temp_25 = var27_23 - var10_8;
                    var11_9 = (int)(cfr_temp_25 == 0.0f ? 0 : (cfr_temp_25 > 0.0f ? 1 : -1));
                    if (var11_9 == 0) break block52;
                }
                if ((var48_41 = (int)((cfr_temp_26 = var8_6 - 0.0f) == 0.0f ? 0 : (cfr_temp_26 < 0.0f ? -1 : 1))) >= 0 || (var48_41 = (int)((cfr_temp_27 = var27_23 - 0.0f) == 0.0f ? 0 : (cfr_temp_27 > 0.0f ? 1 : -1))) != 0) break block44;
            }
            this.o();
        }
        if ((var9_7 = (int)((cfr_temp_28 = (var8_6 = var2_2.o) - (var10_8 = 1.0f)) == 0.0f ? 0 : (cfr_temp_28 > 0.0f ? 1 : -1))) >= 0) {
            var48_41 = var2_2.f;
            var9_7 = var2_2.g;
            if (var48_41 == var9_7) {
                var13_11 = var15_13;
                var14_12 = var16_14;
            }
            var2_2.f = var9_7;
lbl246:
            // 2 sources

            while (true) {
                var15_13 = var13_11;
                var16_14 = var14_12;
                break;
            }
        } else {
            cfr_temp_29 = var8_6 - 0.0f;
            var48_41 = (int)(cfr_temp_29 == 0.0f ? 0 : (cfr_temp_29 < 0.0f ? -1 : 1));
            if (var48_41 <= 0) {
                var48_41 = var2_2.f;
                var9_7 = var2_2.e;
                if (var48_41 == var9_7) {
                    var13_11 = var15_13;
                    var14_12 = var16_14;
                }
                var2_2.f = var9_7;
                ** continue;
            }
        }
        var48_41 = var2_2.C0 | var15_13;
        var2_2.C0 = var48_41;
        if (var15_13 != 0 && (var48_41 = (int)var2_2.t0) == 0) {
            this.requestLayout();
        }
        var2_2.n = var8_6 = var2_2.o;
    }

    public final void i() {
        float f5;
        float f6;
        float f7;
        int n3;
        Object object = this.t;
        if ((object != null || (object = this.L) != null && (n3 = ((CopyOnWriteArrayList)object).isEmpty()) == 0) && (n3 = (f7 = (f6 = this.Q) - (f5 = this.n)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) != 0) {
            n3 = this.P;
            int n4 = -1;
            f5 = 0.0f / 0.0f;
            if (n3 != n4 && (object = this.L) != null) {
                boolean bl2;
                object = ((CopyOnWriteArrayList)object).iterator();
                while (bl2 = object.hasNext()) {
                    MotionLayout$f motionLayout$f = (MotionLayout$f)object.next();
                    motionLayout$f.getClass();
                }
            }
            this.P = n4;
            this.Q = f6 = this.n;
            object = this.L;
            if (object != null) {
                object = ((CopyOnWriteArrayList)object).iterator();
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    MotionLayout$f motionLayout$f = (MotionLayout$f)object.next();
                    motionLayout$f.getClass();
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void j() {
        int n3;
        int n4;
        Object object = this.t;
        if ((object != null || (object = this.L) != null && (n4 = (int)(((CopyOnWriteArrayList)object).isEmpty() ? 1 : 0)) == 0) && (n4 = this.P) == (n3 = -1)) {
            void var4_7;
            this.P = n4 = this.f;
            object = this.G0;
            boolean n7 = ((ArrayList)object).isEmpty();
            if (!n7) {
                Integer n8 = (Integer)pp_0.a(1, (ArrayList)object);
                int n10 = n8;
            } else {
                int n14 = -1;
            }
            int n15 = this.f;
            if (var4_7 != n15 && n15 != n3) {
                Integer n16 = n15;
                ((ArrayList)object).add(n16);
            }
        }
        this.p();
        object = this.v0;
        if (object != null) {
            object.run();
            n4 = 0;
            object = null;
            this.v0 = null;
        }
    }

    public final void k(int n3, float f5, float f6, float f7, float[] fArray) {
        View view = this.getViewById(n3);
        fQ1 fQ12 = (fQ1)this.k.get(view);
        if (fQ12 != null) {
            fQ12.d(f5, f6, f7, fArray);
            view.getY();
        } else if (view != null) {
            Resources resources = view.getContext().getResources();
            resources.getResourceName(n3);
        }
    }

    public final a$b l(int n3) {
        a$b a$b;
        block1: {
            boolean bl2;
            Iterator iterator = this.a.d.iterator();
            while (bl2 = iterator.hasNext()) {
                a$b = (a$b)iterator.next();
                int n4 = a$b.a;
                if (n4 != n3) continue;
                break block1;
            }
            bl2 = false;
            a$b = null;
        }
        return a$b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void loadLayoutDescription(int n3) {
        Exception exception3;
        Iterator iterator;
        String string2;
        block17: {
            block13: {
                Exception exception22;
                block16: {
                    Object object;
                    int n4;
                    block14: {
                        block15: {
                            string2 = "unable to parse MotionScene file";
                            n4 = 0;
                            iterator = null;
                            if (n3 == 0) {
                                this.a = null;
                                return;
                            }
                            Context context = this.getContext();
                            Object object2 = new a(context, this, n3);
                            this.a = object2;
                            n3 = this.f;
                            int n7 = -1;
                            if (n3 == n7) {
                                this.f = n3 = ((a)object2).h();
                                object = this.a;
                                this.e = n3 = ((a)object).h();
                                object = this.a;
                                object = ((a)object).c;
                                if (object != null) {
                                    n7 = ((a$b)object).c;
                                }
                                this.g = n7;
                            }
                            if ((n3 = (int)(this.isAttachedToWindow() ? 1 : 0)) == 0) break block13;
                            try {
                                boolean bl2;
                                object = this.getDisplay();
                                if (object != null) {
                                    object.getRotation();
                                }
                                object = this.a;
                                if (object == null) break block14;
                                n4 = this.f;
                                object = ((a)object).b(n4);
                                iterator = this.a;
                                ((a)((Object)iterator)).n(this);
                                iterator = this.K;
                                if (iterator == null) break block15;
                                iterator = ((ArrayList)((Object)iterator)).iterator();
                                while (bl2 = iterator.hasNext()) {
                                    object2 = iterator.next();
                                    object2 = (MotionHelper)object2;
                                    object2.getClass();
                                }
                            }
                            catch (Exception exception22) {
                                break block16;
                            }
                        }
                        if (object != null) {
                            ((androidx.constraintlayout.widget.b)object).b(this);
                        }
                        this.e = n3 = this.f;
                    }
                    this.o();
                    object = this.u0;
                    if (object == null) {
                        object = this.a;
                        if (object == null) return;
                        object = ((a)object).c;
                        if (object == null) return;
                        n3 = ((a$b)object).n;
                        n4 = 4;
                        if (n3 != n4) return;
                        this.s();
                        object = MotionLayout$g.SETUP;
                        this.setState((MotionLayout$g)((Object)object));
                        object = MotionLayout$g.MOVING;
                        this.setState((MotionLayout$g)((Object)object));
                        return;
                    }
                    n4 = (int)(this.z0 ? 1 : 0);
                    if (n4 != 0) {
                        object = new MotionLayout$1(this);
                        this.post((Runnable)object);
                        return;
                    }
                    ((MotionLayout$e)object).a();
                    return;
                }
                try {
                    iterator = new Iterator(string2, exception22);
                    throw iterator;
                }
                catch (Exception exception3) {}
                break block17;
            }
            this.a = null;
            return;
        }
        iterator = new Iterator(string2, exception3);
        throw iterator;
    }

    public final boolean m(float f5, float f6, View view, MotionEvent motionEvent) {
        int n3;
        block10: {
            int n4;
            block9: {
                boolean bl2;
                int n7;
                float f7;
                int n8;
                int n10;
                View view2;
                n4 = view instanceof ViewGroup;
                n3 = 1;
                if (n4 != 0) {
                    view2 = view;
                    view2 = (ViewGroup)view;
                    for (n10 = view2.getChildCount() - n3; n10 >= 0; n10 += -1) {
                        View view3 = view2.getChildAt(n10);
                        n8 = view3.getLeft();
                        f7 = (float)n8 + f5;
                        float f8 = view.getScrollX();
                        f7 -= f8;
                        int n14 = view3.getTop();
                        f8 = (float)n14 + f6;
                        int n15 = view.getScrollY();
                        float f11 = n15;
                        n7 = (int)(this.m(f7, f8 -= f11, view3, motionEvent) ? 1 : 0);
                        if (n7 == 0) continue;
                        n4 = 1;
                        break;
                    }
                } else {
                    n4 = 0;
                    view2 = null;
                }
                if (n4 != 0) break block9;
                float f12 = (float)view.getRight() + f5;
                float f14 = view.getLeft();
                f12 -= f14;
                n7 = view.getBottom();
                f14 = (float)n7 + f6;
                n8 = view.getTop();
                f7 = n8;
                RectF rectF = this.D0;
                rectF.set(f5, f6, f12, f14 -= f7);
                n10 = motionEvent.getAction();
                if (n10 == 0 && (n10 = (int)(rectF.contains(f12 = motionEvent.getX(), f14 = motionEvent.getY()) ? 1 : 0)) == 0) break block9;
                f5 = -f5;
                f6 = -f6;
                Matrix matrix = view.getMatrix();
                n7 = (int)(matrix.isIdentity() ? 1 : 0);
                if (n7 != 0) {
                    motionEvent.offsetLocation(f5, f6);
                    bl2 = view.onTouchEvent(motionEvent);
                    f5 = -f5;
                    f6 = -f6;
                    motionEvent.offsetLocation(f5, f6);
                } else {
                    motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
                    motionEvent.offsetLocation(f5, f6);
                    Matrix matrix2 = this.F0;
                    if (matrix2 == null) {
                        this.F0 = matrix2 = new Matrix();
                    }
                    matrix2 = this.F0;
                    matrix.invert(matrix2);
                    matrix2 = this.F0;
                    motionEvent.transform(matrix2);
                    bl2 = view.onTouchEvent(motionEvent);
                    motionEvent.recycle();
                }
                if (bl2) break block10;
            }
            n3 = n4;
        }
        return n3 != 0;
    }

    public final void n(AttributeSet object) {
        Object object2;
        Object object3;
        int n3;
        int n4;
        Object object4;
        Object object5;
        int n7;
        Object object6;
        Object object7;
        H0 = this.isInEditMode();
        int n8 = -1;
        int n10 = 0;
        SparseIntArray sparseIntArray = null;
        if (object != null) {
            object7 = this.getContext();
            object6 = R$styleable.MotionLayout;
            object = object7.obtainStyledAttributes((AttributeSet)object, object6);
            int n14 = object.getIndexCount();
            n7 = 1;
            object5 = null;
            object4 = 1;
            for (n4 = 0; n4 < n14; ++n4) {
                float f5;
                a a2;
                int n15;
                n3 = object.getIndex(n4);
                if (n3 == (n15 = R$styleable.MotionLayout_layoutDescription)) {
                    n3 = object.getResourceId(n3, n8);
                    Context context = this.getContext();
                    this.a = a2 = new a(context, this, n3);
                    continue;
                }
                n15 = R$styleable.MotionLayout_currentState;
                if (n3 == n15) {
                    this.f = n3 = object.getResourceId(n3, n8);
                    continue;
                }
                n15 = R$styleable.MotionLayout_motionProgress;
                if (n3 == n15) {
                    n15 = 0;
                    a2 = null;
                    this.q = f5 = object.getFloat(n3, 0.0f);
                    this.s = n7;
                    continue;
                }
                n15 = R$styleable.MotionLayout_applyMotionScene;
                if (n3 == n15) {
                    object4 = object.getBoolean(n3, (boolean)object4);
                    continue;
                }
                n15 = R$styleable.MotionLayout_showPaths;
                if (n3 == n15) {
                    n15 = this.u;
                    if (n15 != 0) continue;
                    if ((n3 = (int)(object.getBoolean(n3, false) ? 1 : 0)) != 0) {
                        n3 = 2;
                        f5 = 2.8E-45f;
                    } else {
                        n3 = 0;
                        f5 = 0.0f;
                        object3 = null;
                    }
                    this.u = n3;
                    continue;
                }
                n15 = R$styleable.MotionLayout_motionDebug;
                if (n3 != n15) continue;
                this.u = n3 = object.getInt(n3, 0);
            }
            object.recycle();
            if (object4 == 0) {
                object2 = 0;
                object = null;
                this.a = null;
            }
        }
        if ((object2 = this.u) != 0 && (object = this.a) != null) {
            Object object8;
            object2 = ((a)object).h();
            object7 = this.a;
            n7 = ((a)object7).h();
            object7 = ((a)object7).b(n7);
            object6 = this.getContext();
            oi0_0.c(object2, (Context)object6);
            object2 = this.getChildCount();
            object6 = null;
            for (n7 = 0; n7 < object2; ++n7) {
                object5 = this.getChildAt(n7);
                object4 = object5.getId();
                object8 = ((androidx.constraintlayout.widget.b)object7).k((int)object4);
                if (object8 != null) continue;
                oi0_0.d((View)object5);
            }
            object = ((androidx.constraintlayout.widget.b)object7).g.keySet();
            object6 = new Integer[0];
            object = object.toArray((T[])object6);
            n7 = ((Object)object).length;
            object5 = new int[n7];
            object8 = null;
            for (object4 = 0; object4 < n7; ++object4) {
                object3 = object[object4];
                n3 = (Integer)object3;
                object5[object4] = (View)n3;
            }
            while (n10 < n7) {
                object2 = object5[n10];
                object8 = this.getContext();
                oi0_0.c(object2, (Context)object8);
                object4 = object5[n10];
                this.findViewById((int)object4);
                object8 = ((androidx.constraintlayout.widget.b)object7).j((int)object2).e;
                object4 = ((b$b)object8).d;
                object = ((androidx.constraintlayout.widget.b)object7).j((int)object2).e;
                object2 = ((b$b)object).c;
                ++n10;
            }
            object = new SparseIntArray();
            sparseIntArray = new SparseIntArray();
            object7 = this.a.d.iterator();
            while ((n7 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                object6 = (a$b)object7.next();
                object5 = this.a.c;
                n4 = object6.d;
                n7 = object6.c;
                object8 = this.getContext();
                oi0_0.c(n4, (Context)object8);
                object8 = this.getContext();
                oi0_0.c(n7, (Context)object8);
                object.get(n4);
                sparseIntArray.get(n7);
                object.put(n4, n7);
                sparseIntArray.put(n7, n4);
                object8 = this.a;
                ((a)object8).b(n4);
                object5 = this.a;
                ((a)object5).b(n7);
            }
        }
        if ((object2 = this.f) == n8 && (object = this.a) != null) {
            this.f = object2 = ((a)object).h();
            this.e = object2 = this.a.h();
            object = this.a.c;
            if (object != null) {
                n8 = ((a$b)object).c;
            }
            this.g = n8;
        }
    }

    public final void o() {
        boolean bl2;
        Object object = this.a;
        if (object == null) {
            return;
        }
        int n3 = this.f;
        boolean n4 = ((a)object).a(n3, this);
        if (n4) {
            this.requestLayout();
            return;
        }
        int n7 = this.f;
        n3 = 0;
        xu1_2 xu1_22 = null;
        int n8 = -1;
        if (n7 != n8) {
            boolean bl3;
            int n10;
            int n14;
            Object object2;
            Object object3;
            int n15;
            Iterator iterator = this.a;
            Object object4 = ((a)((Object)iterator)).d;
            Object object5 = ((ArrayList)object4).iterator();
            while ((n15 = object5.hasNext()) != 0) {
                object3 = (a$b)object5.next();
                object2 = ((a$b)object3).m;
                n14 = ((ArrayList)object2).size();
                if (n14 <= 0) continue;
                object3 = ((a$b)object3).m.iterator();
                while ((n14 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    object2 = (a$b$a)object3.next();
                    n14 = ((a$b$a)object2).b;
                    if (n14 == n8 || (object2 = this.findViewById(n14)) == null) continue;
                    object2.setOnClickListener(null);
                }
            }
            iterator = ((a)((Object)iterator)).f;
            object5 = ((ArrayList)((Object)iterator)).iterator();
            while ((n15 = object5.hasNext()) != 0) {
                object3 = (a$b)object5.next();
                object2 = ((a$b)object3).m;
                n14 = ((ArrayList)object2).size();
                if (n14 <= 0) continue;
                object3 = ((a$b)object3).m.iterator();
                while ((n14 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    object2 = (a$b$a)object3.next();
                    n14 = ((a$b$a)object2).b;
                    if (n14 == n8 || (object2 = this.findViewById(n14)) == null) continue;
                    object2.setOnClickListener(null);
                }
            }
            object4 = ((ArrayList)object4).iterator();
            while ((n10 = object4.hasNext()) != 0) {
                object5 = (a$b)object4.next();
                object3 = ((a$b)object5).m;
                n15 = ((ArrayList)object3).size();
                if (n15 <= 0) continue;
                object3 = ((a$b)object5).m.iterator();
                while ((n14 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    object2 = (a$b$a)object3.next();
                    ((a$b$a)object2).a(this, n7, (a$b)object5);
                }
            }
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while (bl3 = iterator.hasNext()) {
                object4 = (a$b)iterator.next();
                object5 = ((a$b)object4).m;
                n10 = ((ArrayList)object5).size();
                if (n10 <= 0) continue;
                object5 = ((a$b)object4).m.iterator();
                while ((n15 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                    object3 = (a$b$a)object5.next();
                    ((a$b$a)object3).a(this, n7, (a$b)object4);
                }
            }
        }
        if ((bl2 = ((a)(object = this.a)).p()) && (object = this.a.c) != null && (object = ((a$b)object).l) != null) {
            boolean bl4;
            int n16 = ((b)object).d;
            if (n16 != n8) {
                xu1_22 = ((b)object).r;
                View view = xu1_22.findViewById(n16);
                if (view == null) {
                    xu1_22 = xu1_22.getContext();
                    int n17 = ((b)object).d;
                    oi0_0.c(n17, (Context)xu1_22);
                }
                xu1_22 = view;
            }
            if (bl4 = xu1_22 instanceof NestedScrollView) {
                xu1_22 = (NestedScrollView)xu1_22;
                object = new Object();
                xu1_22.setOnTouchListener((View.OnTouchListener)object);
                object = new Object();
                ((NestedScrollView)xu1_22).setOnScrollChangeListener((NestedScrollView$d)object);
            }
        }
    }

    public final void onAttachedToWindow() {
        int n3;
        int n4;
        int n7;
        super.onAttachedToWindow();
        Object object = this.getDisplay();
        if (object != null) {
            object.getRotation();
        }
        if ((object = this.a) != null && (n7 = this.f) != (n4 = -1)) {
            object = object.b(n7);
            this.a.n(this);
            Object object2 = this.K;
            if (object2 != null) {
                object2 = ((ArrayList)object2).iterator();
                while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                    MotionHelper motionHelper = (MotionHelper)object2.next();
                    motionHelper.getClass();
                }
            }
            if (object != null) {
                object.b(this);
            }
            this.e = n3 = this.f;
        }
        this.o();
        object = this.u0;
        if (object != null) {
            n7 = (int)(this.z0 ? 1 : 0);
            if (n7 != 0) {
                object = new MotionLayout$4(this);
                this.post((Runnable)object);
            } else {
                object.a();
            }
        } else {
            object = this.a;
            if (object != null && (object = object.c) != null && (n3 = object.n) == (n7 = 4)) {
                this.s();
                object = MotionLayout$g.SETUP;
                this.setState((MotionLayout$g)((Object)object));
                object = MotionLayout$g.MOVING;
                this.setState((MotionLayout$g)((Object)object));
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int n3;
        MotionLayout motionLayout = this;
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        Object object = this.a;
        if (object == null || (n3 = this.j) == 0) {
            n4 = 0;
            f5 = 0.0f;
            Object var7_7 = null;
        } else {
            b b2;
            int n7;
            float f6;
            Object object2;
            int n8;
            Rect rect;
            Object object3;
            int n10;
            object = ((a)object).q;
            n3 = -1;
            float f7 = 0.0f / 0.0f;
            if (object != null && (n10 = ((MotionLayout)(object3 = ((d)object).a)).getCurrentState()) != n3) {
                Object object4;
                int n14;
                int n15;
                int n16;
                View[] viewArray;
                int n17;
                Object object5 = ((d)object).c;
                Object object6 = ((d)object).b;
                if (object5 == null) {
                    object5 = new HashSet();
                    ((d)object).c = object5;
                    object5 = ((ArrayList)object6).iterator();
                    while ((n17 = object5.hasNext()) != 0) {
                        viewArray = (c)object5.next();
                        n16 = object3.getChildCount();
                        for (n15 = 0; n15 < n16; n15 += n4) {
                            View view = object3.getChildAt(n15);
                            boolean bl2 = viewArray.c(view);
                            if (!bl2) continue;
                            view.getId();
                            HashSet hashSet = ((d)object).c;
                            hashSet.add(view);
                        }
                    }
                }
                float f8 = motionEvent.getX();
                float f11 = motionEvent.getY();
                Rect rect2 = new Rect();
                int n18 = motionEvent.getAction();
                object5 = ((d)object).d;
                n15 = 2;
                if (object5 != null && (n14 = ((ArrayList)object5).isEmpty()) == 0) {
                    object5 = ((d)object).d.iterator();
                    while ((n17 = object5.hasNext()) != 0) {
                        viewArray = (c$a)object5.next();
                        if (n18 != n4) {
                            if (n18 != n15) {
                                viewArray.getClass();
                            } else {
                                object4 = viewArray.c.b;
                                rect = viewArray.l;
                                object4.getHitRect(rect);
                                n16 = (int)f8;
                                n8 = (int)f11;
                                n8 = (int)(rect.contains(n16, n8) ? 1 : 0);
                                if (n8 == 0 && (n8 = (int)(viewArray.h ? 1 : 0)) == 0) {
                                    viewArray.b();
                                }
                            }
                        } else {
                            n8 = viewArray.h;
                            if (n8 == 0) {
                                viewArray.b();
                            }
                        }
                        n3 = -1;
                        f7 = 0.0f / 0.0f;
                    }
                }
                if (n18 == 0 || n18 == n4) {
                    object2 = ((MotionLayout)object3).a;
                    if (object2 == null) {
                        n8 = 0;
                        f6 = 0.0f;
                        object2 = null;
                    } else {
                        object2 = ((a)object2).b(n10);
                    }
                    rect = ((ArrayList)object6).iterator();
                    while ((n7 = rect.hasNext()) != 0) {
                        object4 = object3 = rect.next();
                        object4 = (c)object3;
                        n7 = ((c)object4).b;
                        if (n7 == n4 ? n18 == 0 : (n7 == n15 ? n18 == n4 : n7 == (n14 = 3) && n18 == 0)) {
                            object3 = ((d)object).c;
                            Iterator iterator = ((HashSet)object3).iterator();
                            while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                                Object object7;
                                object3 = (View)iterator.next();
                                n14 = (int)(((c)object4).c((View)object3) ? 1 : 0);
                                if (n14 == 0) continue;
                                object3.getHitRect(rect2);
                                n14 = (int)f8;
                                int n19 = (int)f11;
                                n14 = (int)(rect2.contains(n14, n19) ? 1 : 0);
                                if (n14 != 0) {
                                    object6 = ((d)object).a;
                                    viewArray = new View[n4];
                                    n14 = 0;
                                    viewArray[0] = object3;
                                    object3 = object4;
                                    object5 = object;
                                    n17 = n10;
                                    object7 = object4;
                                    object4 = object2;
                                    ((c)object3).a((d)object, (MotionLayout)object6, n10, (androidx.constraintlayout.widget.b)object2, viewArray);
                                } else {
                                    object7 = object4;
                                }
                                object4 = object7;
                                n15 = 2;
                            }
                        }
                        n15 = 2;
                    }
                }
            }
            if ((object = motionLayout.a.c) != null && (n4 ^= (n8 = ((a$b)object).o)) != 0 && (b2 = ((a$b)object).l) != null) {
                int n20 = motionEvent.getAction();
                if (n20 == 0) {
                    object = new RectF();
                    if ((object = b2.b(motionLayout, (RectF)object)) != null && (n20 = (int)(object.contains(f6 = motionEvent.getX(), f7 = motionEvent.getY()) ? 1 : 0)) == 0) {
                        return false;
                    }
                }
                n4 = b2.e;
                n20 = -1;
                float f12 = 0.0f / 0.0f;
                if (n4 != n20) {
                    object = motionLayout.E0;
                    if (object == null || (n20 = object.getId()) != n4) {
                        b2 = motionLayout.findViewById(n4);
                        motionLayout.E0 = b2;
                    }
                    if ((b2 = motionLayout.E0) != null) {
                        object = motionLayout.D0;
                        f5 = b2.getLeft();
                        object2 = motionLayout.E0;
                        n8 = object2.getTop();
                        f6 = n8;
                        rect = motionLayout.E0;
                        n3 = rect.getRight();
                        f7 = n3;
                        object3 = motionLayout.E0;
                        n7 = object3.getBottom();
                        float f14 = n7;
                        object.set(f5, f6, f7, f14);
                        f5 = motionEvent.getX();
                        f6 = motionEvent.getY();
                        n4 = (int)(object.contains(f5, f6) ? 1 : 0);
                        if (n4 != 0) {
                            b2 = motionLayout.E0;
                            f5 = b2.getLeft();
                            object = motionLayout.E0;
                            n20 = object.getTop();
                            f12 = n20;
                            object2 = motionLayout.E0;
                            rect = motionEvent;
                            n4 = (int)(motionLayout.m(f5, f12, (View)object2, motionEvent) ? 1 : 0);
                            if (n4 == 0) {
                                return this.onTouchEvent(motionEvent);
                            }
                        }
                    }
                }
            }
            n4 = 0;
            f5 = 0.0f;
            b2 = null;
        }
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onLayout(boolean n3, int n4, int n7, int n8, int n10) {
        Throwable throwable2;
        block5: {
            boolean bl2;
            this.t0 = bl2 = true;
            try {
                a a2 = this.a;
                if (a2 == null) {
                    super.onLayout(n3 != 0, n4, n7, n8, n10);
                    this.t0 = false;
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            {
                n3 = this.A;
                if (n3 != (n8 -= n4) || (n3 = this.B) != (n10 -= n7)) {
                    this.q();
                    this.h(bl2);
                }
                this.A = n8;
                this.B = n10;
                this.t0 = false;
                return;
            }
        }
        this.t0 = false;
        throw throwable2;
    }

    public final void onMeasure(int n3, int n4) {
        float f5;
        float f6;
        float f7;
        Interpolator interpolator2;
        float f8;
        float f11;
        float f12;
        float f14;
        float f15;
        float f16;
        float f17;
        long l2;
        float f18;
        float f19;
        Object object;
        int n7;
        float f20;
        int n8;
        float f22;
        MotionLayout motionLayout = this;
        int n10 = n3;
        int n14 = n4;
        Object object2 = this.a;
        if (object2 == null) {
            super.onMeasure(n3, n4);
            return;
        }
        int n15 = this.h;
        boolean bl2 = true;
        int n16 = 0;
        if (n15 == n3 && (n15 = this.i) == n4) {
            n15 = 0;
            f22 = 0.0f;
            object2 = null;
        } else {
            n15 = 1;
            f22 = Float.MIN_VALUE;
        }
        int n17 = motionLayout.C0;
        if (n17 != 0) {
            motionLayout.C0 = false;
            this.o();
            this.p();
            n15 = 1;
            f22 = Float.MIN_VALUE;
        }
        if ((n17 = motionLayout.mDirtyHierarchy) != 0) {
            n15 = 1;
            f22 = Float.MIN_VALUE;
        }
        motionLayout.h = n10;
        motionLayout.i = n14;
        Object object3 = motionLayout.a;
        n17 = ((a)object3).h();
        a$b a$b = motionLayout.a.c;
        int n18 = -1;
        float f23 = 0.0f / 0.0f;
        if (a$b == null) {
            n8 = -1;
            f20 = 0.0f / 0.0f;
        } else {
            n8 = a$b.c;
        }
        MotionLayout$c motionLayout$c = motionLayout.B0;
        if ((n15 != 0 || n17 != (n7 = motionLayout$c.e) || n8 != (n7 = motionLayout$c.f)) && (n7 = motionLayout.e) != n18) {
            super.onMeasure(n3, n4);
            object = motionLayout.a.b(n17);
            androidx.constraintlayout.widget.b b2 = motionLayout.a.b(n8);
            motionLayout$c.e((androidx.constraintlayout.widget.b)object, b2);
            motionLayout$c.f();
            motionLayout$c.e = n17;
            motionLayout$c.f = n8;
            n10 = 0;
            f19 = 0.0f;
            object = null;
        } else {
            if (n15 != 0) {
                super.onMeasure(n3, n4);
            }
            n10 = 1;
            f19 = Float.MIN_VALUE;
        }
        n14 = (int)(motionLayout.R ? 1 : 0);
        if (n14 != 0 || n10 != 0) {
            n10 = this.getPaddingTop();
            n14 = this.getPaddingBottom() + n10;
            n10 = this.getPaddingLeft();
            n15 = this.getPaddingRight() + n10;
            object = motionLayout.mLayoutWidget;
            n10 = ((Y50)object).v() + n15;
            object2 = motionLayout.mLayoutWidget;
            n15 = ((Y50)object2).p() + n14;
            n14 = motionLayout.p0;
            n17 = -1 << -1;
            float f24 = -0.0f;
            if (n14 == n17 || n14 == 0) {
                n10 = motionLayout.S;
                f18 = n10;
                f20 = motionLayout.r0;
                n18 = motionLayout.U - n10;
                f19 = n18;
                f20 = f20 * f19 + f18;
                n10 = (int)f20;
                this.requestLayout();
            }
            if ((n14 = motionLayout.q0) == n17 || n14 == 0) {
                n14 = motionLayout.T;
                f22 = n14;
                f24 = motionLayout.r0;
                n8 = motionLayout.k0 - n14;
                f18 = n8;
                f24 = f24 * f18 + f22;
                n15 = (int)f24;
                this.requestLayout();
            }
            motionLayout.setMeasuredDimension(n10, n15);
        }
        f19 = motionLayout.q;
        f18 = motionLayout.o;
        f19 = Math.signum(f19 - f18);
        long l3 = this.getNanoTime();
        object3 = motionLayout.b;
        n8 = object3 instanceof ec3_1;
        n18 = 814313567;
        f23 = 1.0E-9f;
        motionLayout$c = null;
        if (n8 == 0) {
            l2 = motionLayout.p;
            l2 = l3 - l2;
            f20 = (float)l2 * f19 * f23;
            f17 = motionLayout.m;
            f20 /= f17;
        } else {
            n8 = 0;
            f20 = 0.0f;
            a$b = null;
        }
        f17 = motionLayout.o + f20;
        n8 = (int)(motionLayout.r ? 1 : 0);
        if (n8 != 0) {
            f17 = motionLayout.q;
        }
        if ((n8 = (int)((f16 = f19 - 0.0f) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1))) > 0 && (f15 = (f14 = f17 - (f12 = motionLayout.q)) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1)) >= 0 || (f15 = (f11 = f19 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) <= 0 && (f15 = (f8 = f17 - (f12 = motionLayout.q)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) <= 0) {
            f17 = motionLayout.q;
        } else {
            bl2 = false;
            interpolator2 = null;
        }
        if (object3 != null && !bl2) {
            bl2 = motionLayout.w;
            if (bl2) {
                l2 = motionLayout.l;
                f18 = (float)(l3 -= l2) * f23;
                f17 = object3.getInterpolation(f18);
            } else {
                f17 = object3.getInterpolation(f17);
            }
        }
        if (n8 > 0 && (n14 = (int)((f7 = f17 - (f18 = motionLayout.q)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) >= 0 || (n10 = (int)((f6 = f19 - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) <= 0 && (n10 = (int)((f5 = f17 - (f19 = motionLayout.q)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) <= 0) {
            f17 = motionLayout.q;
        }
        motionLayout.r0 = f17;
        n10 = this.getChildCount();
        l3 = this.getNanoTime();
        interpolator2 = motionLayout.c;
        if (interpolator2 != null) {
            f17 = interpolator2.getInterpolation(f17);
        }
        while (n16 < n10) {
            interpolator2 = motionLayout.getChildAt(n16);
            Object object4 = object3 = motionLayout.k.get(interpolator2);
            object4 = (fQ1)object3;
            if (object4 != null) {
                Tn1 tn1 = motionLayout.s0;
                ((fQ1)object4).f(f17, l3, tn1, (View)interpolator2);
            }
            ++n16;
        }
        n10 = (int)(motionLayout.R ? 1 : 0);
        if (n10 != 0) {
            this.requestLayout();
        }
    }

    public final boolean onNestedFling(View view, float f5, float f6, boolean bl2) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f5, float f6) {
        return false;
    }

    public final void onNestedPreScroll(View view, int n3, int n4, int[] nArray, int n7) {
        block25: {
            float f5;
            float f6;
            float f7;
            float f8;
            float f11;
            int n8;
            Object object;
            Object object2;
            float f12;
            int n10;
            float f14;
            float f15;
            float f16;
            int n14;
            Object object3;
            Object object4;
            int n15;
            int n16;
            MotionLayout motionLayout;
            block26: {
                View view2;
                block27: {
                    float f17;
                    float f18;
                    int n17;
                    float f19;
                    int n18;
                    Object object5;
                    motionLayout = this;
                    view2 = view;
                    n16 = n3;
                    n15 = n4;
                    object4 = this.a;
                    if (object4 == null) {
                        return;
                    }
                    object3 = ((a)object4).c;
                    if (object3 == null) break block25;
                    n14 = ((a$b)object3).o;
                    int n19 = 1;
                    f16 = Float.MIN_VALUE;
                    if ((n14 ^= n19) == 0) break block25;
                    int n20 = -1;
                    f15 = 0.0f / 0.0f;
                    if (n14 != 0 && (object5 = ((a$b)object3).l) != null && (n14 = ((b)object5).e) != n20 && (n18 = view.getId()) != n14) {
                        return;
                    }
                    object5 = ((a)object4).c;
                    n18 = 0;
                    if (object5 != null && (object5 = ((a$b)object5).l) != null) {
                        n14 = (int)(((b)object5).u ? 1 : 0);
                    } else {
                        n14 = 0;
                        f14 = 0.0f;
                        object5 = null;
                    }
                    n10 = 1065353216;
                    f12 = 1.0f;
                    if (n14 != 0) {
                        float f20;
                        float f22;
                        object5 = ((a$b)object3).l;
                        if (object5 != null && (n14 = ((b)object5).w & 4) != 0) {
                            n20 = n15;
                        }
                        if (((f19 = (f22 = (f14 = motionLayout.n) - f12) == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1)) == false || (n14 = (int)((f20 = f14 - 0.0f) == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1))) == 0) && (n14 = (int)(view2.canScrollVertically(n20) ? 1 : 0)) != 0) {
                            return;
                        }
                    }
                    if ((object3 = ((a$b)object3).l) == null || (n17 = ((b)object3).w & n19) == 0) break block26;
                    float f23 = n16;
                    f14 = n15;
                    Object object6 = ((a)object4).c;
                    if (object6 != null && (object6 = ((a$b)object6).l) != null) {
                        object2 = ((b)object6).r;
                        object = ((MotionLayout)object2).getProgress();
                        n8 = ((b)object6).d;
                        float f24 = ((b)object6).h;
                        f11 = ((b)object6).g;
                        float[] fArray = ((b)object6).n;
                        MotionLayout motionLayout2 = ((b)object6).r;
                        motionLayout2.k(n8, (float)object, f24, f11, fArray);
                        f16 = ((b)object6).k;
                        fArray = ((b)object6).n;
                        f19 = 869711765;
                        f24 = 1.0E-7f;
                        float f25 = f16 - 0.0f;
                        f8 = f25 == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
                        if (f8 != false) {
                            f14 = fArray[0];
                            float f26 = f14 - 0.0f;
                            n14 = (int)(f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1));
                            if (n14 == 0) {
                                fArray[0] = f24;
                            }
                            f23 *= f16;
                            f14 = fArray[0];
                            f23 /= f14;
                        } else {
                            n17 = 1;
                            f23 = Float.MIN_VALUE;
                            f16 = fArray[n17];
                            float f27 = f16 - 0.0f;
                            n19 = (int)(f27 == 0.0f ? 0 : (f27 > 0.0f ? 1 : -1));
                            if (n19 == 0) {
                                fArray[n17] = f24;
                            }
                            f16 = ((b)object6).l;
                            f14 *= f16;
                            f16 = fArray[n17];
                            f23 = f14 / f16;
                        }
                    } else {
                        n17 = 0;
                        f23 = 0.0f;
                        object3 = null;
                    }
                    f14 = motionLayout.o;
                    float f28 = f14 - 0.0f;
                    n19 = (int)(f28 == 0.0f ? 0 : (f28 < 0.0f ? -1 : 1));
                    if (n19 <= 0 && (n19 = (int)((f18 = f23 - 0.0f) == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1))) < 0) break block27;
                    n19 = 1065353216;
                    f16 = 1.0f;
                    float f29 = f14 - f16;
                    n14 = (int)(f29 == 0.0f ? 0 : (f29 > 0.0f ? 1 : -1));
                    if (n14 < 0 || (n17 = (int)((f17 = f23 - 0.0f) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1))) <= 0) break block26;
                }
                view2.setNestedScrollingEnabled(false);
                MotionLayout$3 motionLayout$3 = new MotionLayout$3(view2);
                view2.post((Runnable)motionLayout$3);
                return;
            }
            float f30 = motionLayout.n;
            long l2 = this.getNanoTime();
            motionLayout.D = f16 = (float)n16;
            motionLayout.E = f15 = (float)n15;
            long l3 = motionLayout.F;
            l3 = l2 - l3;
            double d2 = l3;
            double d5 = 1.0E-9;
            motionLayout.G = f12 = (float)(d2 *= d5);
            motionLayout.F = l2;
            object4 = ((a)object4).c;
            if (object4 != null && (object4 = ((a$b)object4).l) != null) {
                int n21;
                float f31;
                object3 = ((b)object4).r;
                f14 = ((MotionLayout)object3).getProgress();
                n10 = (int)(((b)object4).m ? 1 : 0);
                if (n10 == 0) {
                    n10 = 1;
                    f12 = Float.MIN_VALUE;
                    ((b)object4).m = n10;
                    ((MotionLayout)object3).setProgress(f14);
                }
                f8 = ((b)object4).d;
                object = ((b)object4).h;
                f12 = ((b)object4).g;
                float[] fArray = ((b)object4).n;
                ((b)object4).r.k((int)f8, f14, (float)object, f12, fArray);
                f12 = ((b)object4).k;
                object2 = ((b)object4).n;
                f11 = (float)object2[0];
                f12 *= f11;
                f11 = ((b)object4).l;
                n8 = 1;
                object = object2[n8];
                f11 = f11 * object + f12;
                f12 = Math.abs(f11);
                d5 = f12;
                double d7 = 0.01;
                n10 = (int)(d5 == d7 ? 0 : (d5 < d7 ? -1 : 1));
                if (n10 < 0) {
                    n10 = 1008981770;
                    f12 = 0.01f;
                    object2[0] = f12;
                    f8 = 1.0f;
                    f11 = Float.MIN_VALUE;
                    object2[f8] = f12;
                }
                if ((f8 = (f31 = (f12 = ((b)object4).k) - 0.0f) == 0.0f ? 0 : (f31 > 0.0f ? 1 : -1)) != false) {
                    f16 *= f12;
                    f7 = (float)object2[0];
                    f16 /= f7;
                } else {
                    f7 = ((b)object4).l;
                    f15 *= f7;
                    n21 = 1;
                    f7 = Float.MIN_VALUE;
                    f16 = (float)object2[n21];
                    f16 = f15 / f16;
                }
                n21 = 1065353216;
                f7 = Math.max(Math.min(f14 += f16, 1.0f), 0.0f);
                f14 = ((MotionLayout)object3).getProgress();
                n14 = (int)(f7 == f14 ? 0 : (f7 > f14 ? 1 : -1));
                if (n14 != 0) {
                    ((MotionLayout)object3).setProgress(f7);
                }
            }
            if ((f6 = (f5 = f30 - (f7 = motionLayout.n)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) != false) {
                nArray[0] = n16;
                f6 = 1.0f;
                f30 = Float.MIN_VALUE;
                nArray[f6] = n15;
            } else {
                f6 = 1.0f;
                f30 = Float.MIN_VALUE;
            }
            motionLayout.h(false);
            n16 = nArray[0];
            if (n16 != 0 || (n16 = nArray[f6]) != 0) {
                motionLayout.C = f6;
            }
        }
    }

    public final void onNestedScroll(View view, int n3, int n4, int n7, int n8, int n10) {
    }

    public final void onNestedScroll(View view, int n3, int n4, int n7, int n8, int n10, int[] nArray) {
        int n14 = this.C;
        if (n14 != 0 || n3 != 0 || n4 != 0) {
            nArray[0] = n14 = nArray[0] + n7;
            n14 = 1;
            nArray[n14] = n3 = nArray[n14] + n8;
        }
        this.C = false;
    }

    public final void onNestedScrollAccepted(View view, View view2, int n3, int n4) {
        long l2;
        this.F = l2 = this.getNanoTime();
        this.G = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
    }

    public final void onRtlPropertiesChanged(int n3) {
        Object object = this.a;
        if (object != null) {
            boolean bl2;
            ((a)object).p = bl2 = this.isRtl();
            object = ((a)object).c;
            if (object != null && (object = ((a$b)object).l) != null) {
                ((b)object).c(bl2);
            }
        }
    }

    public final boolean onStartNestedScroll(View object, View view, int n3, int n4) {
        int n7;
        object = this.a;
        return object != null && (object = object.c) != null && (object = object.l) != null && (n7 = object.w & 2) == 0;
        {
        }
    }

    public final void onStopNestedScroll(View object, int n3) {
        object = this.a;
        if (object != null) {
            float f5 = this.G;
            float f6 = 0.0f;
            float f7 = f5 - 0.0f;
            Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object2 != false) {
                float f8 = this.D / f5;
                float f11 = this.E / f5;
                object = object.c;
                if (object != null && (object = object.l) != null) {
                    float f12;
                    n3 = 0;
                    object.m = false;
                    MotionLayout motionLayout = object.r;
                    float f14 = motionLayout.getProgress();
                    int n4 = object.d;
                    float f15 = object.h;
                    float f16 = object.g;
                    float[] fArray = object.n;
                    MotionLayout motionLayout2 = object.r;
                    float f17 = f14;
                    motionLayout2.k(n4, f14, f15, f16, fArray);
                    float f18 = object.k;
                    float[] fArray2 = object.n;
                    f5 = fArray2[0];
                    f17 = object.l;
                    f15 = Float.MIN_VALUE;
                    float f19 = fArray2[1];
                    float f20 = f18 - 0.0f;
                    float f22 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                    f8 = f22 != false ? f8 * f18 / f5 : (f11 *= f17) / f19;
                    n3 = (int)(Float.isNaN(f8) ? 1 : 0);
                    if (n3 == 0) {
                        n3 = 0x40400000;
                        f5 = f8 / 3.0f;
                        f14 += f5;
                    }
                    if ((n3 = (int)((f12 = f14 - 0.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) != 0) {
                        n3 = 1065353216;
                        f5 = 1.0f;
                        float f23 = f14 - f5;
                        Object object3 = f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                        if (object3 != false) {
                            int n7 = object.c;
                            object3 = 3;
                            f11 = 4.2E-45f;
                            if (n7 != object3) {
                                double d2 = f14;
                                double d5 = 0.5;
                                double d7 = d2 - d5;
                                object3 = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
                                if (object3 >= 0) {
                                    f6 = 1.0f;
                                }
                                motionLayout.r(f6, f8, n7);
                            }
                        }
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onTouchEvent(MotionEvent var1_1) {
        block117: {
            block120: {
                block135: {
                    block131: {
                        block136: {
                            block137: {
                                block141: {
                                    block138: {
                                        block140: {
                                            block139: {
                                                block132: {
                                                    block133: {
                                                        block134: {
                                                            block118: {
                                                                block119: {
                                                                    block130: {
                                                                        block121: {
                                                                            var2_2 /* !! */  = this;
                                                                            var3_3 = var1_1;
                                                                            var4_4 = this.a;
                                                                            if (var4_4 == null || (var5_5 = this.j) == 0 || (var6_6 = var4_4.p()) == 0) break block117;
                                                                            var4_4 = this.a;
                                                                            var7_7 = var4_4.c;
                                                                            var8_8 = 1;
                                                                            var9_9 = 1.4E-45f;
                                                                            if (var7_7 != null && (var5_5 = var7_7.o ^ var8_8) == 0) {
                                                                                return super.onTouchEvent(var1_1);
                                                                            }
                                                                            var5_5 = this.getCurrentState();
                                                                            var10_10 /* !! */  = new RectF();
                                                                            var11_11 = var4_4.o;
                                                                            var12_12 = var4_4.a;
                                                                            if (var11_11 == null) {
                                                                                var12_12.getClass();
                                                                                var11_11 = MotionLayout$d.b;
                                                                                var13_13 = VelocityTracker.obtain();
                                                                                var11_11.a = var13_13;
                                                                                var4_4.o = var11_11;
                                                                            }
                                                                            if ((var11_11 = var4_4.o.a) != null) {
                                                                                var11_11.addMovement((MotionEvent)var3_3);
                                                                            }
                                                                            var14_14 = 2;
                                                                            var15_15 = 2.8E-45f;
                                                                            var16_16 = -1;
                                                                            var17_17 = 0.0f / 0.0f;
                                                                            if (var5_5 == var16_16) break block118;
                                                                            var18_18 = var1_1.getAction();
                                                                            if (var18_18 == 0) break block119;
                                                                            if (var18_18 != var14_14 || (var18_18 = (int)var4_4.m) != 0) break block118;
                                                                            var19_19 = var1_1.getRawY();
                                                                            var20_20 = var4_4.s;
                                                                            var19_19 -= var20_20;
                                                                            var20_20 = var1_1.getRawX();
                                                                            var21_21 = var4_4.r;
                                                                            var22_22 = var20_20 -= var21_21;
                                                                            var24_23 = 0.0;
                                                                            cfr_temp_0 = var22_22 - var24_23;
                                                                            var26_24 /* !! */  = (double)(cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1));
                                                                            if (var26_24 /* !! */  == false && (var26_24 /* !! */  = (cfr_temp_1 = (var22_22 = (double)var19_19) - var24_23) == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1)) == false || (var27_25 = var4_4.l) == null) break block120;
                                                                            if (var5_5 == var16_16) break block121;
                                                                            var28_26 = var4_4.b;
                                                                            if (var28_26 == null || (var29_27 = var28_26.a(var5_5)) == var16_16) {
                                                                                var29_27 = var5_5;
                                                                            }
                                                                            var11_11 = new ArrayList();
                                                                            var30_28 = var4_4.d.iterator();
                                                                            while ((var26_24 /* !! */  = (double)var30_28.hasNext()) != false) {
                                                                                var31_29 = var30_28.next();
                                                                                var13_13 = var31_29;
                                                                                var13_13 = (a$b)var31_29;
                                                                                var8_8 = var13_13.d;
                                                                                if (var8_8 == var29_27 || (var8_8 = var13_13.c) == var29_27) {
                                                                                    var11_11.add(var13_13);
                                                                                }
                                                                                var8_8 = 1;
                                                                                var9_9 = 1.4E-45f;
                                                                                var14_14 = 2;
                                                                                var15_15 = 2.8E-45f;
                                                                            }
                                                                            var32_30 = new RectF();
                                                                            var11_11 = var11_11.iterator();
                                                                            var14_14 = 0;
                                                                            var15_15 = 0.0f;
                                                                            var13_13 = null;
                                                                            var16_16 = 0;
                                                                            var17_17 = 0.0f;
                                                                            var30_28 = null;
                                                                            while ((var29_27 = (int)var11_11.hasNext()) != 0) {
                                                                                block129: {
                                                                                    block128: {
                                                                                        block124: {
                                                                                            block127: {
                                                                                                block123: {
                                                                                                    block126: {
                                                                                                        block125: {
                                                                                                            block122: {
                                                                                                                var28_26 = (a$b)var11_11.next();
                                                                                                                var33_32 /* !! */  = (int)var28_26.o;
                                                                                                                if (var33_32 /* !! */  == 0) break block122;
                                                                                                                var34_33 = var11_11;
                                                                                                                break block123;
                                                                                                            }
                                                                                                            var35_34 = var28_26.l;
                                                                                                            if (var35_34 == null) break block124;
                                                                                                            var36_35 = (int)var4_4.p;
                                                                                                            var35_34.c((boolean)var36_35);
                                                                                                            var35_34 = var28_26.l.b((ViewGroup)var12_12, (RectF)var32_30);
                                                                                                            if (var35_34 == null) break block125;
                                                                                                            var37_36 = var27_25.getX();
                                                                                                            var34_33 = var11_11;
                                                                                                            var38_37 = var27_25.getY();
                                                                                                            var39_38 /* !! */  = var35_34.contains(var37_36, var38_37);
                                                                                                            if (var39_38 /* !! */  != 0) break block126;
                                                                                                            break block123;
                                                                                                        }
                                                                                                        var34_33 = var11_11;
                                                                                                    }
                                                                                                    if ((var11_11 = var28_26.l.a((ViewGroup)var12_12, (RectF)var32_30)) == null || (var39_38 /* !! */  = var11_11.contains(var40_39 = var27_25.getX(), var37_36 = var27_25.getY())) != 0) break block127;
                                                                                                }
                                                                                                var11_11 = var34_33;
                                                                                                continue;
                                                                                            }
                                                                                            var11_11 = var28_26.l;
                                                                                            var40_39 = var11_11.k * var20_20;
                                                                                            var37_36 = var11_11.l * var19_19 + var40_39;
                                                                                            var39_38 /* !! */  = var11_11.j;
                                                                                            if (var39_38 /* !! */  != 0) {
                                                                                                var38_37 = var27_25.getX();
                                                                                                var28_26.l.getClass();
                                                                                                var38_37 -= 0.5f;
                                                                                                var37_36 = var27_25.getY();
                                                                                                var35_34 = var28_26.l;
                                                                                                var35_34.getClass();
                                                                                                var33_32 /* !! */  = 0x3F000000;
                                                                                                var40_39 = var20_20 + var38_37;
                                                                                                var41_40 = var32_30;
                                                                                                var9_9 = var19_19 + (var37_36 -= 0.5f);
                                                                                                var42_41 = var19_19;
                                                                                                var43_42 = var20_20;
                                                                                                var44_43 = var9_9;
                                                                                                var32_30 = var30_28;
                                                                                                var46_44 = var40_39;
                                                                                                var46_44 = Math.atan2(var44_43, var46_44);
                                                                                                var44_43 = var38_37;
                                                                                                var48_45 = var30_28;
                                                                                                var11_11 = var10_10 /* !! */ ;
                                                                                                var49_46 = var37_36;
                                                                                                var49_46 = Math.atan2(var44_43, var49_46);
                                                                                                var9_9 = (float)(var46_44 -= var49_46);
                                                                                                var51_47 = 1092616192;
                                                                                                var52_48 = 10.0f;
                                                                                                var37_36 = var9_9 * var52_48;
                                                                                            } else {
                                                                                                var41_40 = var32_30;
                                                                                                var11_11 = var10_10 /* !! */ ;
                                                                                                var48_45 = var30_28;
                                                                                                var42_41 = var19_19;
                                                                                                var43_42 = var20_20;
                                                                                            }
                                                                                            var8_8 = var28_26.c;
                                                                                            if (var8_8 == var5_5) {
                                                                                                var8_8 = -1082130432;
                                                                                                var9_9 = -1.0f;
lbl138:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    break;
                                                                                                }
                                                                                            } else {
                                                                                                var8_8 = 1066192077;
                                                                                                var9_9 = 1.1f;
                                                                                                ** continue;
                                                                                            }
                                                                                            cfr_temp_2 = (var37_36 *= var9_9) - var15_15;
                                                                                            var8_8 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                                                                                            if (var8_8 <= 0) break block128;
                                                                                            var15_15 = var37_36;
                                                                                            var30_28 = var28_26;
                                                                                            break block129;
                                                                                        }
                                                                                        var41_40 = var32_30;
                                                                                        var34_33 = var11_11;
                                                                                        var48_45 = var30_28;
                                                                                        var42_41 = var19_19;
                                                                                        var43_42 = var20_20;
                                                                                        var11_11 = var10_10 /* !! */ ;
                                                                                    }
                                                                                    var30_28 = var48_45;
                                                                                }
                                                                                var10_10 /* !! */  = var11_11;
                                                                                var11_11 = var34_33;
                                                                                var32_30 = var41_40;
                                                                                var19_19 = var42_41;
                                                                                var20_20 = var43_42;
                                                                            }
                                                                            var11_11 = var10_10 /* !! */ ;
                                                                            var48_45 = var30_28;
                                                                            break block130;
                                                                        }
                                                                        var11_11 = var10_10 /* !! */ ;
                                                                        var30_28 = var4_4.c;
                                                                    }
                                                                    if (var30_28 == null) break block118;
                                                                    var2_2 /* !! */ .setTransition((a$b)var30_28);
                                                                    var7_7 = var4_4.c.l.b((ViewGroup)var12_12, (RectF)var11_11);
                                                                    if (var7_7 != null && (var5_5 = (int)var7_7.contains(var9_9 = (var32_30 = var4_4.l).getX(), var52_48 = (var10_10 /* !! */  = var4_4.l).getY())) == 0) {
                                                                        var5_5 = 1;
                                                                        var53_49 = 1.4E-45f;
                                                                    } else {
                                                                        var5_5 = 0;
                                                                        var53_49 = 0.0f;
                                                                        var7_7 = null;
                                                                    }
                                                                    var4_4.n = var5_5;
                                                                    var7_7 = var4_4.c.l;
                                                                    var9_9 = var4_4.r;
                                                                    var52_48 = var4_4.s;
                                                                    var7_7.p = var9_9;
                                                                    var7_7.q = var52_48;
                                                                    var8_8 = 0;
                                                                    var9_9 = 0.0f;
                                                                    var32_30 = null;
                                                                    var7_7.m = false;
                                                                    break block118;
                                                                }
                                                                var11_11 = var10_10 /* !! */ ;
                                                                var8_8 = 0;
                                                                var9_9 = 0.0f;
                                                                var32_31 = null;
                                                                var4_4.r = var53_50 = var1_1.getRawX();
                                                                var4_4.s = var53_50 = var1_1.getRawY();
                                                                var4_4.l = var3_3;
                                                                var4_4.m = false;
                                                                var3_3 = var4_4.c.l;
                                                                if (var3_3 != null) {
                                                                    if ((var3_3 = var3_3.a((ViewGroup)var12_12, var10_10 /* !! */ )) != null && !(var54_51 = var3_3.contains(var53_50 = (var7_7 = var4_4.l).getX(), var9_9 = (var32_31 = var4_4.l).getY()))) {
                                                                        var3_3 = null;
                                                                        var4_4.l = null;
                                                                        var4_4.m = var54_51 = true;
                                                                    } else {
                                                                        var3_3 = var4_4.c.l.b((ViewGroup)var12_12, (RectF)var11_11);
                                                                        if (var3_3 != null && !(var54_51 = var3_3.contains(var53_50 = (var7_7 = var4_4.l).getX(), var9_9 = (var32_31 = var4_4.l).getY()))) {
                                                                            var4_4.n = var54_51 = true;
                                                                        } else {
                                                                            var54_51 = false;
                                                                            var3_3 = null;
                                                                            var4_4.n = false;
                                                                        }
                                                                        var3_3 = var4_4.c.l;
                                                                        var53_50 = var4_4.r;
                                                                        var55_53 = var4_4.s;
                                                                        var3_3.p = var53_50;
                                                                        var3_3.q = var55_53;
                                                                    }
                                                                }
                                                                break block120;
                                                            }
                                                            if ((var5_5 = (int)var4_4.m) != 0) break block120;
                                                            var7_7 = var4_4.c;
                                                            if (var7_7 == null || (var7_7 = var7_7.l) == null || (var8_8 = var4_4.n) != 0) break block131;
                                                            var32_30 = var4_4.o;
                                                            var51_47 = var7_7.j;
                                                            var11_11 = var7_7.n;
                                                            var27_25 = var7_7.r;
                                                            if (var51_47 == 0) break block132;
                                                            var10_10 /* !! */  = var32_30.a;
                                                            if (var10_10 /* !! */  != null) {
                                                                var10_10 /* !! */ .addMovement((MotionEvent)var3_3);
                                                            }
                                                            if ((var51_47 = var1_1.getAction()) == 0) break block133;
                                                            var12_12 = var7_7.o;
                                                            var56_57 = 2.0f;
                                                            var33_32 /* !! */  = 1;
                                                            var40_39 = 1.4E-45f;
                                                            if (var51_47 == var33_32 /* !! */ ) break block134;
                                                            var33_32 /* !! */  = 2;
                                                            var40_39 = 2.8E-45f;
                                                            if (var51_47 != var33_32 /* !! */ ) break block131;
                                                            var1_1.getRawY();
                                                            var1_1.getRawX();
                                                            var51_47 = var27_25.getWidth();
                                                            var52_48 = (float)var51_47 / var56_57;
                                                            var33_32 /* !! */  = var27_25.getHeight();
                                                            var40_39 = (float)var33_32 /* !! */  / var56_57;
                                                            var16_16 = var7_7.i;
                                                            var29_27 = -1;
                                                            var57_58 = 0.0f / 0.0f;
                                                            if (var16_16 != var29_27) {
                                                                var10_10 /* !! */  = var27_25.findViewById(var16_16);
                                                                var27_25.getLocationOnScreen((int[])var12_12);
                                                                var33_32 /* !! */  = 0;
                                                                var35_34 = null;
                                                                var40_39 = (float)var12_12[0];
                                                                var16_16 = var10_10 /* !! */ .getLeft();
                                                                var29_27 = var10_10 /* !! */ .getRight() + var16_16;
                                                                var17_17 = (float)var29_27 / var56_57;
                                                                var40_39 += var17_17;
                                                                var17_17 = 1.4E-45f;
                                                                var58_59 = var12_12[1];
                                                                var59_66 = (float)var58_59;
                                                                var16_16 = var10_10 /* !! */ .getTop();
                                                                var51_47 = var10_10 /* !! */ .getBottom() + var16_16;
                                                                var52_48 = (float)var51_47 / var56_57 + var59_66;
                                                                var60_70 = var40_39;
                                                                var40_39 = var52_48;
                                                                var52_48 = var60_70;
                                                            } else {
                                                                var16_16 = var7_7.d;
                                                                var29_27 = -1;
                                                                var57_58 = 0.0f / 0.0f;
                                                                if (var16_16 != var29_27) {
                                                                    var28_26 = var27_25.k;
                                                                    var30_28 = var27_25.findViewById(var16_16);
                                                                    var16_16 = ((fQ1)var28_26.get((Object)var30_28)).f.k;
                                                                    var30_28 = var27_25.findViewById(var16_16);
                                                                    if (var30_28 != null) {
                                                                        var27_25.getLocationOnScreen((int[])var12_12);
                                                                        var51_47 = 0;
                                                                        var10_10 /* !! */  = null;
                                                                        var52_48 = (float)var12_12[0];
                                                                        var33_32 /* !! */  = var30_28.getLeft();
                                                                        var29_27 = var30_28.getRight() + var33_32 /* !! */ ;
                                                                        var40_39 = (float)var29_27 / var56_57;
                                                                        var52_48 += var40_39;
                                                                        var58_60 = var12_12[1];
                                                                        var59_66 = (float)var58_60;
                                                                        var33_32 /* !! */  = var30_28.getTop();
                                                                        var16_16 = var30_28.getBottom() + var33_32 /* !! */ ;
                                                                        var40_39 = (float)var16_16 / var56_57 + var59_66;
                                                                    }
                                                                }
                                                            }
                                                            var59_66 = var1_1.getRawX() - var52_48;
                                                            var17_17 = var1_1.getRawY() - var40_39;
                                                            var57_58 = var1_1.getRawY() - var40_39;
                                                            var61_71 = var27_25;
                                                            var62_72 = var57_58;
                                                            var57_58 = var1_1.getRawX() - var52_48;
                                                            var64_73 = var57_58;
                                                            var64_73 = Math.atan2(var62_72, var64_73);
                                                            var20_20 = var7_7.q - var40_39;
                                                            var62_72 = var20_20;
                                                            var66_76 = var7_7.p - var52_48;
                                                            var66_76 = Math.atan2(var62_72, var66_76);
                                                            var66_76 = (var64_73 - var66_76) * 180.0;
                                                            var62_72 = 3.141592653589793;
                                                            var15_15 = (float)(var66_76 /= var62_72);
                                                            var40_39 = 330.0f;
                                                            var33_32 /* !! */  = (int)(var15_15 == var40_39 ? 0 : (var15_15 > var40_39 ? 1 : -1));
                                                            if (var33_32 /* !! */  > 0) {
                                                                var51_47 = 1135869952;
                                                                var52_48 = 360.0f;
                                                                var15_15 -= var52_48;
                                                            } else {
                                                                var51_47 = 1135869952;
                                                                var52_48 = 360.0f;
                                                                var40_39 = -330.0f;
                                                                cfr_temp_3 = var15_15 - var40_39;
                                                                var33_32 /* !! */  = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                                                                if (var33_32 /* !! */  < 0) {
                                                                    var15_15 += var52_48;
                                                                }
                                                            }
                                                            var40_39 = Math.abs(var15_15);
                                                            var62_72 = var40_39;
                                                            var68_79 = 0.01;
                                                            var33_32 /* !! */  = (int)(var62_72 == var68_79 ? 0 : (var62_72 > var68_79 ? 1 : -1));
                                                            if (var33_32 /* !! */  <= 0 && (var33_32 /* !! */  = (int)var7_7.m) == 0) break block131;
                                                            var40_39 = var61_71.getProgress();
                                                            var70_80 = var7_7.m;
                                                            if (!var70_80) {
                                                                var70_80 = true;
                                                                var20_20 = 1.4E-45f;
                                                                var7_7.m = var70_80;
                                                                var71_81 = var61_71;
                                                                var61_71.setProgress(var40_39);
                                                            } else {
                                                                var71_81 = var61_71;
                                                            }
                                                            var72_84 = var7_7.d;
                                                            var29_27 = -1;
                                                            var57_58 = 0.0f / 0.0f;
                                                            if (var72_84 != var29_27) {
                                                                var52_48 = var7_7.h;
                                                                var57_58 = var7_7.g;
                                                                var2_2 /* !! */  = var7_7.n;
                                                                var61_71 = var4_4;
                                                                var34_33 = var4_4 = var7_7.r;
                                                                var42_41 = var40_39;
                                                                var43_42 = var52_48;
                                                                var56_57 = var57_58;
                                                                var4_4.k(var72_84, var40_39, var52_48, var57_58, (float[])var2_2 /* !! */ );
                                                                var73_87 = 1;
                                                                var74_88 = 1.4E-45f;
                                                                var22_22 = Math.toDegrees((double)var11_11[var73_87]);
                                                                var55_54 = (float)var22_22;
                                                                var11_11[var73_87] = var55_54;
                                                            } else {
                                                                var61_71 = var4_4;
                                                                var73_87 = 1;
                                                                var74_88 = 1.4E-45f;
                                                                var6_6 = 1135869952;
                                                                var55_54 = 360.0f;
                                                                var11_11[var73_87] = var55_54;
                                                            }
                                                            var55_54 = var7_7.v;
                                                            var15_15 *= var55_54;
                                                            var55_54 = (float)var11_11[var73_87];
                                                            var15_15 = var15_15 / var55_54 + var40_39;
                                                            var73_87 = 1065353216;
                                                            var74_88 = 1.0f;
                                                            var55_54 = Math.min(var15_15, var74_88);
                                                            var51_47 = 0;
                                                            var52_48 = 0.0f;
                                                            var10_10 /* !! */  = null;
                                                            var55_54 = Math.max(var55_54, 0.0f);
                                                            var38_37 = var71_81.getProgress();
                                                            var14_14 = (int)(var55_54 == var38_37 ? 0 : (var55_54 > var38_37 ? 1 : -1));
                                                            if (var14_14 != 0) {
                                                                cfr_temp_4 = var38_37 - 0.0f;
                                                                var14_14 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                                                                if (var14_14 == 0 || (var73_87 = (int)(var38_37 == var74_88 ? 0 : (var38_37 > var74_88 ? 1 : -1))) == 0) {
                                                                    if (var14_14 == 0) {
                                                                        var73_87 = 1;
                                                                        var74_88 = 1.4E-45f;
                                                                    } else {
                                                                        var73_87 = 0;
                                                                        var74_88 = 0.0f;
                                                                        var2_2 /* !! */  = null;
                                                                    }
                                                                    var71_81.g((boolean)var73_87);
                                                                }
                                                                var71_81.setProgress(var55_54);
                                                                var2_2 /* !! */  = var32_30.a;
                                                                if (var2_2 /* !! */  != null) {
                                                                    var6_6 = 1000;
                                                                    var55_54 = 1.401E-42f;
                                                                    var2_2 /* !! */ .computeCurrentVelocity(var6_6);
                                                                }
                                                                if ((var2_2 /* !! */  = var32_30.a) != null) {
                                                                    var74_88 = var2_2 /* !! */ .getXVelocity();
                                                                } else {
                                                                    var73_87 = 0;
                                                                    var74_88 = 0.0f;
                                                                    var2_2 /* !! */  = null;
                                                                }
                                                                var4_4 = var32_30.a;
                                                                if (var4_4 != null) {
                                                                    var38_37 = var4_4.getYVelocity();
                                                                } else {
                                                                    var39_38 /* !! */  = 0;
                                                                    var38_37 = 0.0f;
                                                                    var11_11 = null;
                                                                }
                                                                var49_46 = var38_37;
                                                                var66_76 = var74_88;
                                                                var22_22 = Math.hypot(var49_46, var66_76);
                                                                var49_46 = Math.sin(Math.atan2(var49_46, var66_76) - var64_73) * var22_22;
                                                                var75_89 = var59_66;
                                                                var66_76 = var17_17;
                                                                var75_89 = Math.hypot(var75_89, var66_76);
                                                                var49_46 = Math.toDegrees((float)(var49_46 / var75_89));
                                                                var71_81.d = var74_88 = (float)var49_46;
                                                            } else {
                                                                var73_87 = 0;
                                                                var74_88 = 0.0f;
                                                                var2_2 /* !! */  = null;
                                                                var71_81.d = 0.0f;
                                                            }
                                                            var7_7.p = var74_88 = var1_1.getRawX();
                                                            var7_7.q = var74_88 = var1_1.getRawY();
                                                            break block135;
                                                        }
                                                        var61_71 = var4_4;
                                                        var71_82 = var27_25;
                                                        var73_87 = 0;
                                                        var74_88 = 0.0f;
                                                        var7_7.m = false;
                                                        var2_2 /* !! */  = var32_30.a;
                                                        if (var2_2 /* !! */  != null) {
                                                            var6_6 = 16;
                                                            var55_55 = 2.2E-44f;
                                                            var2_2 /* !! */ .computeCurrentVelocity(var6_6);
                                                        }
                                                        if ((var2_2 /* !! */  = var32_30.a) != null) {
                                                            var74_88 = var2_2 /* !! */ .getXVelocity();
                                                        } else {
                                                            var73_87 = 0;
                                                            var74_88 = 0.0f;
                                                            var2_2 /* !! */  = null;
                                                        }
                                                        var4_4 = var32_30.a;
                                                        if (var4_4 != null) {
                                                            var55_55 = var4_4.getYVelocity();
                                                        } else {
                                                            var6_6 = 0;
                                                            var55_55 = 0.0f;
                                                            var4_4 = null;
                                                        }
                                                        var9_9 = var71_82.getProgress();
                                                        var14_14 = var71_82.getWidth();
                                                        var15_15 = (float)var14_14 / var56_57;
                                                        var33_32 /* !! */  = var71_82.getHeight();
                                                        var40_39 = (float)var33_32 /* !! */  / var56_57;
                                                        var36_35 = var7_7.i;
                                                        var18_18 = -1;
                                                        var19_19 = 0.0f / 0.0f;
                                                        if (var36_35 != var18_18) {
                                                            var13_13 = var71_82.findViewById(var36_35);
                                                            var71_82.getLocationOnScreen((int[])var12_12);
                                                            var35_34 = null;
                                                            var33_32 /* !! */  = (int)var12_12[0];
                                                            var40_39 = var33_32 /* !! */ ;
                                                            var36_35 = var13_13.getLeft();
                                                            var18_18 = var13_13.getRight() + var36_35;
                                                            var37_36 = (float)var18_18 / var56_57;
                                                            var40_39 += var37_36;
                                                            var37_36 = 1.4E-45f;
                                                            var58_61 = var12_12[1];
                                                            var59_67 = (float)var58_61;
                                                            var36_35 = var13_13.getTop();
                                                            var14_14 = var13_13.getBottom();
lbl473:
                                                            // 2 sources

                                                            while (true) {
                                                                var15_15 = (float)(var14_14 += var36_35) / var56_57;
                                                                var59_67 += var15_15;
                                                                var15_15 = var40_39;
                                                                var40_39 = var59_67;
                                                                break;
                                                            }
                                                        } else {
                                                            var36_35 = var7_7.d;
                                                            var18_18 = -1;
                                                            var19_19 = 0.0f / 0.0f;
                                                            if (var36_35 != var18_18) {
                                                                var13_13 = var71_82.k;
                                                                var35_34 = var71_82.findViewById(var36_35);
                                                                var14_14 = ((fQ1)var13_13.get((Object)var35_34)).f.k;
                                                                var13_13 = var71_82.findViewById(var14_14);
                                                                var71_82.getLocationOnScreen((int[])var12_12);
                                                                var35_34 = null;
                                                                var33_32 /* !! */  = (int)var12_12[0];
                                                                var40_39 = var33_32 /* !! */ ;
                                                                var36_35 = var13_13.getLeft();
                                                                var18_18 = var13_13.getRight() + var36_35;
                                                                var37_36 = (float)var18_18 / var56_57;
                                                                var40_39 += var37_36;
                                                                var37_36 = 1.4E-45f;
                                                                var58_62 = var12_12[1];
                                                                var59_67 = (float)var58_62;
                                                                var36_35 = var13_13.getTop();
                                                                var14_14 = var13_13.getBottom();
                                                                ** continue;
                                                            }
                                                        }
                                                        var59_67 = var1_1.getRawX() - var15_15;
                                                        var15_15 = var1_1.getRawY() - var40_39;
                                                        var64_74 = var15_15;
                                                        var22_22 = var59_67;
                                                        var64_74 = Math.toDegrees(Math.atan2(var64_74, var22_22));
                                                        var33_32 /* !! */  = var7_7.d;
                                                        var72_85 = -1;
                                                        var21_21 = 0.0f / 0.0f;
                                                        if (var33_32 /* !! */  != var72_85) {
                                                            var52_48 = var7_7.h;
                                                            var21_21 = var7_7.g;
                                                            var28_26 = var7_7.n;
                                                            var30_28 = var7_7.r;
                                                            var30_28.k(var33_32 /* !! */ , var9_9, var52_48, var21_21, (float[])var28_26);
                                                            var51_47 = 1;
                                                            var52_48 = 1.4E-45f;
                                                            var46_44 = Math.toDegrees((double)var11_11[var51_47]);
                                                            var40_39 = (float)var46_44;
                                                            var11_11[var51_47] = var40_39;
                                                        } else {
                                                            var51_47 = 1;
                                                            var52_48 = 1.4E-45f;
                                                            var33_32 /* !! */  = 1135869952;
                                                            var40_39 = 360.0f;
                                                            var11_11[var51_47] = var40_39;
                                                        }
                                                        var66_77 = var55_55 + var15_15;
                                                        var22_22 = var74_88 + var59_67;
                                                        var77_91 = Math.toDegrees(Math.atan2(var66_77, var22_22)) - var64_74;
                                                        var74_88 = (float)var77_91;
                                                        var55_55 = 62.5f;
                                                        var6_6 = (int)Float.isNaN(var74_88 *= var55_55);
                                                        if (var6_6 == 0) {
                                                            var17_17 = var74_88 * 3.0f;
                                                            var55_55 = var7_7.v;
                                                            var17_17 *= var55_55;
                                                            var6_6 = 1;
                                                            var55_55 = 1.4E-45f;
                                                            var52_48 = (float)var11_11[var6_6];
                                                            var17_17 = var17_17 / var52_48 + var9_9;
lbl540:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var17_17 = var9_9;
                                                        ** while (true)
                                                        var6_6 = 0;
                                                        var55_55 = 0.0f;
                                                        var4_4 = null;
                                                        cfr_temp_5 = var17_17 - 0.0f;
                                                        var51_47 = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1));
                                                        if (var51_47 == 0) ** GOTO lbl-1000
                                                        var6_6 = 1065353216;
                                                        var55_55 = 1.0f;
                                                        cfr_temp_6 = var17_17 - var55_55;
                                                        var51_47 = (int)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
                                                        if (var51_47 == 0) ** GOTO lbl-1000
                                                        var6_6 = var7_7.c;
                                                        var51_47 = 3;
                                                        var52_48 = 4.2E-45f;
                                                        if (var6_6 != var51_47) {
                                                            var52_48 = var7_7.v;
                                                            var74_88 *= var52_48;
                                                            var51_47 = 1;
                                                            var52_48 = 1.4E-45f;
                                                            var38_37 = (float)var11_11[var51_47];
                                                            var74_88 /= var38_37;
                                                            var79_93 = var17_17;
                                                            var77_91 = 0.5;
                                                            cfr_temp_7 = var79_93 - var77_91;
                                                            var33_32 /* !! */  = (int)(cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 < 0.0 ? -1 : 1));
                                                            if (var33_32 /* !! */  < 0) {
                                                                var51_47 = 0;
                                                                var52_48 = 0.0f;
                                                                var10_10 /* !! */  = null;
lbl573:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            var51_47 = 1065353216;
                                                            var52_48 = 1.0f;
                                                            ** continue;
                                                            var39_38 /* !! */  = 6;
                                                            var38_37 = 8.4E-45f;
                                                            if (var6_6 == var39_38 /* !! */ ) {
                                                                var55_55 = var9_9 + var74_88;
                                                                var51_47 = 0;
                                                                var52_48 = 0.0f;
                                                                var10_10 /* !! */  = null;
                                                                cfr_temp_8 = var55_55 - 0.0f;
                                                                var6_6 = (int)(cfr_temp_8 == 0.0f ? 0 : (cfr_temp_8 < 0.0f ? -1 : 1));
                                                                if (var6_6 < 0) {
                                                                    var74_88 = Math.abs(var74_88);
                                                                }
                                                                var51_47 = 1065353216;
                                                                var52_48 = 1.0f;
                                                            }
                                                            var6_6 = var7_7.c;
                                                            var39_38 /* !! */  = 7;
                                                            var38_37 = 9.8E-45f;
                                                            if (var6_6 == var39_38 /* !! */ ) {
                                                                var55_55 = var9_9 + var74_88;
                                                                var51_47 = 1065353216;
                                                                var52_48 = 1.0f;
                                                                cfr_temp_9 = var55_55 - var52_48;
                                                                var6_6 = (int)(cfr_temp_9 == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1));
                                                                if (var6_6 > 0) {
                                                                    var74_88 = -Math.abs(var74_88);
                                                                }
                                                                var51_47 = 0;
                                                                var52_48 = 0.0f;
                                                                var10_10 /* !! */  = null;
                                                            }
                                                            var6_6 = var7_7.c;
                                                            var5_5 = 0x40400000;
                                                            var53_49 = 3.0f;
                                                            var71_82.r(var52_48, var74_88 *= var53_49, var6_6);
                                                            var74_88 = 0.0f;
                                                            var2_2 /* !! */  = null;
                                                            cfr_temp_10 = 0.0f - var9_9;
                                                            var73_87 = cfr_temp_10 == 0.0f ? 0 : (cfr_temp_10 > 0.0f ? 1 : -1);
                                                            if (var73_87 >= 0 || (var73_87 = (int)((cfr_temp_11 = (var74_88 = 1.0f) - var9_9) == 0.0f ? 0 : (cfr_temp_11 < 0.0f ? -1 : 1))) <= 0) {
                                                                var2_2 /* !! */  = MotionLayout$g.FINISHED;
                                                                var71_82.setState((MotionLayout$g)var2_2 /* !! */ );
                                                            }
                                                        } else lbl-1000:
                                                        // 3 sources

                                                        {
                                                            var74_88 = 0.0f;
                                                            var2_2 /* !! */  = null;
                                                            cfr_temp_12 = 0.0f - var17_17;
                                                            var73_87 = (int)(cfr_temp_12 == 0.0f ? 0 : (cfr_temp_12 > 0.0f ? 1 : -1));
                                                            if (var73_87 >= 0 || (var73_87 = (int)((cfr_temp_13 = (var74_88 = 1.0f) - var17_17) == 0.0f ? 0 : (cfr_temp_13 < 0.0f ? -1 : 1))) <= 0) {
                                                                var2_2 /* !! */  = MotionLayout$g.FINISHED;
                                                                var71_82.setState((MotionLayout$g)var2_2 /* !! */ );
                                                            }
                                                        }
                                                        break block135;
                                                    }
                                                    var61_71 = var4_4;
                                                    var7_7.p = var74_88 = var1_1.getRawX();
                                                    var7_7.q = var74_88 = var1_1.getRawY();
                                                    var73_87 = 0;
                                                    var74_88 = 0.0f;
                                                    var2_2 /* !! */  = null;
                                                    var7_7.m = false;
                                                    break block135;
                                                }
                                                var61_71 = var4_4;
                                                var71_83 = var27_25;
                                                var2_2 /* !! */  = var32_30.a;
                                                if (var2_2 /* !! */  != null) {
                                                    var2_2 /* !! */ .addMovement((MotionEvent)var3_3);
                                                }
                                                if ((var73_87 = var1_1.getAction()) == 0) break block136;
                                                var6_6 = 1;
                                                var55_56 = 1.4E-45f;
                                                if (var73_87 == var6_6) break block137;
                                                var6_6 = 2;
                                                var55_56 = 2.8E-45f;
                                                if (var73_87 != var6_6) break block135;
                                                var74_88 = var1_1.getRawY();
                                                var55_56 = var7_7.q;
                                                var74_88 -= var55_56;
                                                var55_56 = var1_1.getRawX();
                                                var52_48 = var7_7.p;
                                                var55_56 -= var52_48;
                                                var52_48 = var7_7.k * var55_56;
                                                cfr_temp_14 = (var52_48 = Math.abs(var7_7.l * var74_88 + var52_48)) - (var59_68 = var7_7.x);
                                                var51_47 = (int)(cfr_temp_14 == 0.0f ? 0 : (cfr_temp_14 > 0.0f ? 1 : -1));
                                                if (var51_47 <= 0 && (var51_47 = (int)var7_7.m) == 0) break block135;
                                                var52_48 = var71_83.getProgress();
                                                var58_63 = var7_7.m;
                                                if (var58_63 == 0) {
                                                    var58_63 = 1;
                                                    var59_68 = 1.4E-45f;
                                                    var7_7.m = var58_63;
                                                    var71_83.setProgress(var52_48);
                                                }
                                                var14_14 = var7_7.d;
                                                var58_63 = -1;
                                                var59_68 = 0.0f / 0.0f;
                                                if (var14_14 != var58_63) {
                                                    var17_17 = var7_7.h;
                                                    var37_36 = var7_7.g;
                                                    var81_94 = var7_7.n;
                                                    var12_12 = var7_7.r;
                                                    var40_39 = var52_48;
                                                    var12_12.k(var14_14, var52_48, var17_17, var37_36, var81_94);
                                                    var14_14 = 0;
                                                    var15_15 = 0.0f;
                                                    var13_13 = null;
                                                    var33_32 /* !! */  = 1;
                                                    var40_39 = 1.4E-45f;
                                                } else {
                                                    var58_63 = var71_83.getWidth();
                                                    var14_14 = var71_83.getHeight();
                                                    var58_63 = Math.min(var58_63, var14_14);
                                                    var59_68 = var58_63;
                                                    var15_15 = var7_7.l * var59_68;
                                                    var33_32 /* !! */  = 1;
                                                    var40_39 = 1.4E-45f;
                                                    var11_11[var33_32 /* !! */ ] = var15_15;
                                                    var15_15 = var7_7.k;
                                                    var59_68 *= var15_15;
                                                    var14_14 = 0;
                                                    var15_15 = 0.0f;
                                                    var13_13 = null;
                                                    var11_11[0] = var59_68;
                                                }
                                                var59_68 = var7_7.k;
                                                var17_17 = (float)var11_11[0];
                                                var59_68 *= var17_17;
                                                var15_15 = var7_7.l;
                                                var17_17 = (float)var11_11[var33_32 /* !! */ ];
                                                var15_15 = var15_15 * var17_17 + var59_68;
                                                var59_68 = var7_7.v;
                                                var77_92 = Math.abs(var15_15 *= var59_68);
                                                var16_16 = 1008981770;
                                                var17_17 = 0.01f;
                                                var64_75 = 0.01;
                                                var72_86 = var77_92 == var64_75 ? 0 : (var77_92 < var64_75 ? -1 : 1);
                                                var58_63 = 0;
                                                var59_68 = 0.0f;
                                                var12_12 = null;
                                                if (var72_86 < 0) {
                                                    var11_11[0] = var17_17;
                                                    var11_11[var33_32 /* !! */ ] = var17_17;
                                                }
                                                var15_15 = var7_7.k;
                                                var36_35 = 0;
                                                var37_36 = 0.0f;
                                                cfr_temp_15 = var15_15 - 0.0f;
                                                var14_14 = (int)(cfr_temp_15 == 0.0f ? 0 : (cfr_temp_15 > 0.0f ? 1 : -1));
                                                if (var14_14 != 0) {
                                                    var74_88 = (float)var11_11[0];
                                                    var55_56 /= var74_88;
                                                } else {
                                                    var55_56 = (float)var11_11[var33_32 /* !! */ ];
                                                    var55_56 = var74_88 / var55_56;
                                                }
                                                var52_48 += var55_56;
                                                var73_87 = 1065353216;
                                                var55_56 = Math.min(var52_48, 1.0f);
                                                var74_88 = Math.max(var55_56, 0.0f);
                                                var6_6 = var7_7.c;
                                                var51_47 = 6;
                                                var52_48 = 8.4E-45f;
                                                if (var6_6 == var51_47) {
                                                    var74_88 = Math.max(var74_88, var17_17);
                                                }
                                                var6_6 = var7_7.c;
                                                var51_47 = 7;
                                                var52_48 = 9.8E-45f;
                                                if (var6_6 == var51_47) {
                                                    var6_6 = 1065185444;
                                                    var55_56 = 0.99f;
                                                    var74_88 = Math.min(var74_88, var55_56);
                                                }
                                                if ((var51_47 = (int)((cfr_temp_16 = var74_88 - (var55_56 = var71_83.getProgress())) == 0.0f ? 0 : (cfr_temp_16 > 0.0f ? 1 : -1))) == 0) break block138;
                                                var51_47 = 0;
                                                var52_48 = 0.0f;
                                                var10_10 /* !! */  = null;
                                                cfr_temp_17 = var55_56 - 0.0f;
                                                var58_63 = (int)(cfr_temp_17 == 0.0f ? 0 : (cfr_temp_17 > 0.0f ? 1 : -1));
                                                if (var58_63 == 0) break block139;
                                                var51_47 = 1065353216;
                                                var52_48 = 1.0f;
                                                cfr_temp_18 = var55_56 - var52_48;
                                                var6_6 = (int)(cfr_temp_18 == 0.0f ? 0 : (cfr_temp_18 > 0.0f ? 1 : -1));
                                                if (var6_6 != 0) break block140;
                                            }
                                            if (var58_63 == 0) {
                                                var6_6 = 1;
                                                var55_56 = 1.4E-45f;
                                            } else {
                                                var6_6 = 0;
                                                var55_56 = 0.0f;
                                                var4_4 = null;
                                            }
                                            var71_83.g((boolean)var6_6);
                                        }
                                        var71_83.setProgress(var74_88);
                                        var2_2 /* !! */  = var32_30.a;
                                        if (var2_2 /* !! */  != null) {
                                            var6_6 = 1000;
                                            var55_56 = 1.401E-42f;
                                            var2_2 /* !! */ .computeCurrentVelocity(var6_6);
                                        }
                                        if ((var2_2 /* !! */  = var32_30.a) != null) {
                                            var74_88 = var2_2 /* !! */ .getXVelocity();
                                        } else {
                                            var73_87 = 0;
                                            var74_88 = 0.0f;
                                            var2_2 /* !! */  = null;
                                        }
                                        var4_4 = var32_30.a;
                                        if (var4_4 != null) {
                                            var55_56 = var4_4.getYVelocity();
                                        } else {
                                            var6_6 = 0;
                                            var55_56 = 0.0f;
                                            var4_4 = null;
                                        }
                                        var9_9 = var7_7.k;
                                        var51_47 = 0;
                                        var52_48 = 0.0f;
                                        var10_10 /* !! */  = null;
                                        cfr_temp_19 = var9_9 - 0.0f;
                                        var8_8 = (int)(cfr_temp_19 == 0.0f ? 0 : (cfr_temp_19 > 0.0f ? 1 : -1));
                                        if (var8_8 != 0) {
                                            var8_8 = 0;
                                            var9_9 = 0.0f;
                                            var32_30 = null;
                                            var55_56 = (float)var11_11[0];
                                            var74_88 /= var55_56;
                                        } else {
                                            var73_87 = 1;
                                            var9_9 = (float)var11_11[var73_87];
                                            var74_88 = var55_56 / var9_9;
                                        }
                                        var71_83.d = var74_88;
                                        break block141;
                                    }
                                    var51_47 = 0;
                                    var52_48 = 0.0f;
                                    var10_10 /* !! */  = null;
                                    var71_83.d = 0.0f;
                                }
                                var7_7.p = var74_88 = var1_1.getRawX();
                                var7_7.q = var74_88 = var1_1.getRawY();
                                break block135;
                            }
                            var73_87 = 0;
                            var74_88 = 0.0f;
                            var7_7.m = false;
                            var2_2 /* !! */  = var32_30.a;
                            if (var2_2 /* !! */  != null) {
                                var6_6 = 1000;
                                var55_56 = 1.401E-42f;
                                var2_2 /* !! */ .computeCurrentVelocity(var6_6);
                            }
                            if ((var2_2 /* !! */  = var32_30.a) != null) {
                                var74_88 = var2_2 /* !! */ .getXVelocity();
                            } else {
                                var73_87 = 0;
                                var74_88 = 0.0f;
                                var2_2 /* !! */  = null;
                            }
                            var4_4 = var32_30.a;
                            if (var4_4 != null) {
                                var55_56 = var4_4.getYVelocity();
                            } else {
                                var6_6 = 0;
                                var55_56 = 0.0f;
                                var4_4 = null;
                            }
                            var9_9 = var71_83.getProgress();
                            var14_14 = var7_7.d;
                            var51_47 = -1;
                            var52_48 = 0.0f / 0.0f;
                            if (var14_14 != var51_47) {
                                var17_17 = var7_7.h;
                                var37_36 = var7_7.g;
                                var81_95 = var7_7.n;
                                var12_12 = var7_7.r;
                                var40_39 = var9_9;
                                var12_12.k(var14_14, var9_9, var17_17, var37_36, var81_95);
                                var58_64 = false;
                                var59_69 /* !! */  = 0.0f;
                                var12_12 = null;
                                var14_14 = 1;
                                var15_15 = 1.4E-45f;
                            } else {
                                var51_47 = var71_83.getWidth();
                                var58_65 = var71_83.getHeight();
                                var51_47 = Math.min(var51_47, var58_65);
                                var52_48 = var51_47;
                                var59_69 /* !! */  = var7_7.l * var52_48;
                                var14_14 = 1;
                                var15_15 = 1.4E-45f;
                                var11_11[var14_14] = var59_69 /* !! */ ;
                                var59_69 /* !! */  = var7_7.k;
                                var52_48 *= var59_69 /* !! */ ;
                                var58_65 = 0;
                                var59_69 /* !! */  = 0.0f;
                                var12_12 = null;
                                var11_11[0] = var52_48;
                            }
                            var52_48 = var7_7.k;
                            var59_69 /* !! */  = (float)var11_11[0];
                            var38_37 = (float)var11_11[var14_14];
                            var14_14 = 0;
                            var15_15 = 0.0f;
                            var13_13 = null;
                            cfr_temp_20 = var52_48 - 0.0f;
                            var51_47 = (int)(cfr_temp_20 == 0.0f ? 0 : (cfr_temp_20 > 0.0f ? 1 : -1));
                            var74_88 = var51_47 != 0 ? (var74_88 /= var59_69 /* !! */ ) : var55_56 / var38_37;
                            var6_6 = (int)Float.isNaN(var74_88);
                            if (var6_6 == 0) {
                                var6_6 = 0x40400000;
                                var55_56 = var74_88 / 3.0f + var9_9;
lbl873:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var55_56 = var9_9;
                            ** while (true)
                            var51_47 = 0;
                            var52_48 = 0.0f;
                            var10_10 /* !! */  = null;
                            cfr_temp_21 = var55_56 - 0.0f;
                            var39_38 /* !! */  = cfr_temp_21 == 0.0f ? 0 : (cfr_temp_21 > 0.0f ? 1 : -1);
                            if (var39_38 /* !! */  == 0) ** GOTO lbl-1000
                            var51_47 = 1065353216;
                            var52_48 = 1.0f;
                            cfr_temp_22 = var55_56 - var52_48;
                            var39_38 /* !! */  = (int)(cfr_temp_22 == 0.0f ? 0 : (cfr_temp_22 > 0.0f ? 1 : -1));
                            if (var39_38 /* !! */  == 0) ** GOTO lbl-1000
                            var51_47 = var7_7.c;
                            var39_38 /* !! */  = 3;
                            var38_37 = 4.2E-45f;
                            if (var51_47 != var39_38 /* !! */ ) {
                                var75_90 = var55_56;
                                var66_78 = 0.5;
                                cfr_temp_23 = var75_90 - var66_78;
                                var6_6 = (int)(cfr_temp_23 == 0.0 ? 0 : (cfr_temp_23 < 0.0 ? -1 : 1));
                                if (var6_6 < 0) {
                                    var6_6 = 0;
                                    var55_56 = 0.0f;
                                    var4_4 = null;
lbl900:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var6_6 = 1065353216;
                                var55_56 = 1.0f;
                                ** continue;
                                var39_38 /* !! */  = 6;
                                var38_37 = 8.4E-45f;
                                if (var51_47 == var39_38 /* !! */ ) {
                                    var55_56 = var9_9 + var74_88;
                                    var51_47 = 0;
                                    var52_48 = 0.0f;
                                    var10_10 /* !! */  = null;
                                    cfr_temp_24 = var55_56 - 0.0f;
                                    var6_6 = (int)(cfr_temp_24 == 0.0f ? 0 : (cfr_temp_24 < 0.0f ? -1 : 1));
                                    if (var6_6 < 0) {
                                        var74_88 = Math.abs(var74_88);
                                    }
                                    var6_6 = 1065353216;
                                    var55_56 = 1.0f;
                                }
                                var51_47 = var7_7.c;
                                var39_38 /* !! */  = 7;
                                var38_37 = 9.8E-45f;
                                if (var51_47 == var39_38 /* !! */ ) {
                                    var55_56 = var9_9 + var74_88;
                                    var51_47 = 1065353216;
                                    var52_48 = 1.0f;
                                    cfr_temp_25 = var55_56 - var52_48;
                                    var6_6 = (int)(cfr_temp_25 == 0.0f ? 0 : (cfr_temp_25 > 0.0f ? 1 : -1));
                                    if (var6_6 > 0) {
                                        var74_88 = -Math.abs(var74_88);
                                    }
                                    var6_6 = 0;
                                    var55_56 = 0.0f;
                                    var4_4 = null;
                                }
                                var5_5 = var7_7.c;
                                var71_83.r(var55_56, var74_88, var5_5);
                                var74_88 = 0.0f;
                                var2_2 /* !! */  = null;
                                cfr_temp_26 = 0.0f - var9_9;
                                var73_87 = (int)(cfr_temp_26 == 0.0f ? 0 : (cfr_temp_26 > 0.0f ? 1 : -1));
                                if (var73_87 >= 0 || (var73_87 = (int)((cfr_temp_27 = (var74_88 = 1.0f) - var9_9) == 0.0f ? 0 : (cfr_temp_27 < 0.0f ? -1 : 1))) <= 0) {
                                    var2_2 /* !! */  = MotionLayout$g.FINISHED;
                                    var71_83.setState((MotionLayout$g)var2_2 /* !! */ );
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                var74_88 = 0.0f;
                                var2_2 /* !! */  = null;
                                cfr_temp_28 = 0.0f - var55_56;
                                var73_87 = (int)(cfr_temp_28 == 0.0f ? 0 : (cfr_temp_28 > 0.0f ? 1 : -1));
                                if (var73_87 >= 0 || (var73_87 = (int)((cfr_temp_29 = (var74_88 = 1.0f) - var55_56) == 0.0f ? 0 : (cfr_temp_29 < 0.0f ? -1 : 1))) <= 0) {
                                    var2_2 /* !! */  = MotionLayout$g.FINISHED;
                                    var71_83.setState((MotionLayout$g)var2_2 /* !! */ );
                                }
                            }
                            break block135;
                        }
                        var7_7.p = var74_88 = var1_1.getRawX();
                        var7_7.q = var74_88 = var1_1.getRawY();
                        var73_87 = 0;
                        var74_88 = 0.0f;
                        var2_2 /* !! */  = null;
                        var7_7.m = false;
                        break block135;
                    }
                    var61_71 = var4_4;
                }
                var74_88 = var1_1.getRawX();
                var4_4 = var61_71;
                var61_71.r = var74_88;
                var61_71.s = var74_88 = var1_1.getRawY();
                var73_87 = var1_1.getAction();
                var54_52 = 1;
                if (var73_87 == var54_52 && (var2_2 /* !! */  = var61_71.o) != null) {
                    var3_3 = var2_2 /* !! */ .a;
                    if (var3_3 != null) {
                        var3_3.recycle();
                        var54_52 = 0;
                        var3_3 = null;
                        var2_2 /* !! */ .a = null;
                    } else {
                        var54_52 = 0;
                        var3_3 = null;
                    }
                    var4_4.o = null;
                    var2_2 /* !! */  = this;
                    var54_52 = this.f;
                    var5_5 = -1;
                    var53_49 = 0.0f / 0.0f;
                    if (var54_52 != var5_5) {
                        var4_4.a(var54_52, this);
                    }
                } else {
                    var2_2 /* !! */  = this;
                }
            }
            var3_3 = var2_2 /* !! */ .a.c;
            var6_6 = var3_3.r & 4;
            if (var6_6 != 0) {
                return var3_3.l.m;
            }
            return true;
        }
        return super.onTouchEvent(var1_1);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean bl2 = view instanceof MotionHelper;
        if (bl2) {
            view = (MotionHelper)view;
            List<View> list = this.L;
            if (list == null) {
                list = new List<View>();
                this.L = list;
            }
            list = this.L;
            ((CopyOnWriteArrayList)list).add(view);
            bl2 = view.j;
            if (bl2) {
                list = this.I;
                if (list == null) {
                    list = new List<View>();
                    this.I = list;
                }
                list = this.I;
                ((ArrayList)list).add(view);
            }
            if (bl2 = view.k) {
                list = this.J;
                if (list == null) {
                    list = new List<View>();
                    this.J = list;
                }
                list = this.J;
                ((ArrayList)list).add(view);
            }
            if (bl2 = view instanceof MotionEffect) {
                list = this.K;
                if (list == null) {
                    list = new List<View>();
                    this.K = list;
                }
                list = this.K;
                ((ArrayList)list).add(view);
            }
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        if ((arrayList = this.J) != null) {
            arrayList.remove(view);
        }
    }

    public final void p() {
        boolean bl2;
        boolean bl3;
        Object object = this.t;
        if (object == null && ((object = this.L) == null || (bl3 = ((CopyOnWriteArrayList)object).isEmpty()))) {
            return;
        }
        object = this.G0;
        Iterator iterator = ((ArrayList)object).iterator();
        while (bl2 = iterator.hasNext()) {
            int n3;
            Integer n4 = (Integer)iterator.next();
            Object object2 = this.t;
            if (object2 != null) {
                n3 = n4;
                object2.a(n3);
            }
            if ((object2 = this.L) == null) continue;
            object2 = ((CopyOnWriteArrayList)object2).iterator();
            while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                MotionLayout$f motionLayout$f = (MotionLayout$f)object2.next();
                int n7 = n4;
                motionLayout$f.a(n7);
            }
        }
        ((ArrayList)object).clear();
    }

    public final void parseLayoutDescription(int n3) {
        this.mConstraintLayoutSpec = null;
    }

    public final void q() {
        this.B0.f();
        this.invalidate();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void r(float var1_1, float var2_2, int var3_3) {
        block29: {
            block26: {
                block27: {
                    block30: {
                        block28: {
                            var4_4 = this;
                            var5_5 = var1_1;
                            var6_6 = var2_2;
                            var7_7 = var3_3;
                            var8_8 = this.a;
                            if (var8_8 == null) {
                                return;
                            }
                            var9_9 = this.o;
                            cfr_temp_0 = var9_9 - var1_1;
                            var10_10 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var10_10 /* !! */  == false) {
                                return;
                            }
                            var10_10 /* !! */  = (float)true;
                            var9_9 = 1.4E-45f;
                            this.w = var10_10 /* !! */ ;
                            this.l = var11_11 = this.getNanoTime();
                            var13_12 = this.a;
                            this.m = var14_13 = (float)var13_12.c() / 1000.0f;
                            this.q = var1_1;
                            this.s = var10_10 /* !! */ ;
                            var15_14 = this.x;
                            var16_15 = 1065353216;
                            var17_16 = 1.0f;
                            var18_17 = 7;
                            var19_18 = 9.8E-45f;
                            var20_19 = 6;
                            var21_20 = 8.4E-45f;
                            var22_21 = 2;
                            if (var3_3 == 0 || var3_3 == var10_10 /* !! */  || var3_3 == var22_21) break block26;
                            var23_22 = this.y;
                            var24_23 = 4;
                            if (var3_3 == var24_23) break block27;
                            var24_23 = 5;
                            if (var3_3 == var24_23) break block28;
                            if (var3_3 == var20_19 || var3_3 == var18_17) break block26;
                            break block29;
                        }
                        var25_24 = this.o;
                        var8_8 = this.a;
                        var9_9 = var8_8.g();
                        var14_13 = 2.0f;
                        cfr_temp_1 = var2_2 - 0.0f;
                        var18_17 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                        if (var18_17 <= 0) break block30;
                        var19_18 = var2_2 / var9_9;
                        var21_20 = var2_2 * var19_18;
                        cfr_temp_2 = (var21_20 = var21_20 - (var9_9 = var9_9 * var19_18 * var19_18 / var14_13) + var25_24) - var17_16;
                        var7_7 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                        if (var7_7 <= 0) ** GOTO lbl-1000
                        ** GOTO lbl-1000
                    }
                    var17_16 = -var2_2 / var9_9;
                    var19_18 = var2_2 * var17_16;
                    cfr_temp_3 = (var9_9 = var9_9 * var17_16 * var17_16 / var14_13 + var19_18 + var25_24) - 0.0f;
                    var7_7 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1));
                    if (var7_7 < 0) lbl-1000:
                    // 2 sources

                    {
                        var25_24 = var4_4.o;
                        var8_8 = var4_4.a;
                        var9_9 = var8_8.g();
                        var23_22.a = var6_6;
                        var23_22.b = var25_24;
                        var23_22.c = var9_9;
                        var4_4.b = var23_22;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var9_9 = var4_4.o;
                        var14_13 = var4_4.m;
                        var19_18 = var4_4.a.g();
                        var26_28 = var4_4.a.c;
                        if (var26_28 != null && (var26_28 = var26_28.l) != null) {
                            var21_20 = var25_24 = var26_28.s;
                        } else {
                            var20_19 = 0;
                            var21_20 = 0.0f;
                            var27_30 = null;
                        }
                        var26_28 = var4_4.x;
                        var17_16 = var1_1;
                        var6_6 = var2_2;
                        var26_28.b(var9_9, var1_1, var2_2, var14_13, var19_18, var21_20);
                        var4_4.d = 0.0f;
                        var7_7 = var4_4.f;
                        var4_4.q = var5_5;
                        var4_4.f = var7_7;
                        var4_4.b = var15_14;
                    }
                    break block29;
                }
                var25_25 = this.o;
                var8_8 = this.a;
                var9_9 = var8_8.g();
                var23_22.a = var2_2;
                var23_22.b = var25_25;
                var23_22.c = var9_9;
                this.b = var23_22;
                break block29;
            }
            if (var7_7 != var10_10 /* !! */  && var7_7 != var18_17) {
                if (var7_7 == var22_21 || var7_7 == var20_19) {
                    var5_5 = 1.0f;
                }
            } else {
                var5_5 = 0.0f;
            }
            var26_29 = var4_4.a;
            var8_8 = var26_29.c;
            if (var8_8 != null && (var13_12 = var8_8.l) != null) {
                var16_15 = var13_12.D;
            } else {
                var16_15 = 0;
                var17_16 = 0.0f;
                var13_12 = null;
            }
            if (var16_15 == 0) {
                var9_9 = var4_4.o;
                var19_18 = var26_29.g();
                var26_29 = var4_4.a.c;
                if (var26_29 != null && (var26_29 = var26_29.l) != null) {
                    var21_20 = var25_26 = var26_29.s;
                } else {
                    var20_19 = 0;
                    var21_20 = 0.0f;
                    var27_31 = null;
                }
                var26_29 = var4_4.x;
                var17_16 = var5_5;
                var6_6 = var2_2;
                var26_29.b(var9_9, var5_5, var2_2, var14_13, var19_18, var21_20);
            } else {
                var25_27 = var4_4.o;
                if (var8_8 != null && (var13_12 = var8_8.l) != null) {
                    var17_16 = var13_12.z;
                } else {
                    var16_15 = 0;
                    var17_16 = 0.0f;
                    var13_12 = null;
                }
                if (var8_8 != null && (var28_33 = var8_8.l) != null) {
                    var6_6 = var28_33.A;
                } else {
                    var6_6 = 0.0f;
                    var28_33 = null;
                }
                if (var8_8 != null && (var29_34 = var8_8.l) != null) {
                    var14_13 = var29_34.y;
                } else {
                    var14_13 = 0.0f;
                    var29_34 = null;
                }
                if (var8_8 != null && (var30_35 = var8_8.l) != null) {
                    var19_18 = var30_35.B;
                } else {
                    var18_17 = 0;
                    var19_18 = 0.0f;
                    var30_35 = null;
                }
                if (var8_8 != null && (var8_8 = var8_8.l) != null) {
                    var10_10 /* !! */  = var8_8.C;
                } else {
                    var10_10 /* !! */  = (float)false;
                    var9_9 = 0.0f;
                    var8_8 = null;
                }
                var27_32 = var15_14.b;
                if (var27_32 == null) {
                    var27_32 = new Object();
                    var27_32.a = var31_36 = 0.5;
                    var27_32.i = 0;
                    var15_14.b = var27_32;
                }
                var27_32 = var15_14.b;
                var15_14.c = var27_32;
                var27_32.c = var31_36 = (double)var5_5;
                var27_32.a = var31_36 = (double)var14_13;
                var27_32.e = var25_27;
                var27_32.b = var33_37 = (double)var6_6;
                var27_32.g = var17_16;
                var27_32.h = var19_18;
                var27_32.i = (int)var10_10 /* !! */ ;
                var27_32.d = 0.0f;
            }
            var7_7 = var4_4.f;
            var4_4.q = var5_5;
            var4_4.f = var7_7;
            var4_4.b = var15_14;
        }
        var4_4.r = false;
        var4_4.l = var35_38 = this.getNanoTime();
        this.invalidate();
    }

    public final void requestLayout() {
        Object object;
        int n3;
        int n4 = this.R;
        if (n4 == 0 && (n4 = this.f) == (n3 = -1) && (object = this.a) != null && (object = ((a)object).c) != null) {
            n4 = ((a$b)object).q;
            if (n4 == 0) {
                return;
            }
            n3 = 2;
            if (n4 == n3) {
                n4 = this.getChildCount();
                for (n3 = 0; n3 < n4; ++n3) {
                    boolean bl2;
                    Object object2 = this.getChildAt(n3);
                    HashMap hashMap = this.k;
                    object2 = (fQ1)hashMap.get(object2);
                    object2.d = bl2 = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s() {
        this.f(1.0f);
        this.v0 = null;
    }

    public void setDebugMode(int n3) {
        this.u = n3;
        this.invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean bl2) {
        this.z0 = bl2;
    }

    public void setInteractionEnabled(boolean bl2) {
        this.j = bl2;
    }

    public void setInterpolatedProgress(float f5) {
        Object object = this.a;
        if (object != null) {
            object = MotionLayout$g.MOVING;
            this.setState((MotionLayout$g)((Object)object));
            object = this.a.e();
            if (object != null) {
                f5 = object.getInterpolation(f5);
                this.setProgress(f5);
                return;
            }
        }
        this.setProgress(f5);
    }

    public void setOnHide(float f5) {
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                MotionHelper motionHelper = (MotionHelper)this.J.get(i3);
                motionHelper.setProgress(f5);
            }
        }
    }

    public void setOnShow(float f5) {
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                MotionHelper motionHelper = (MotionHelper)this.I.get(i3);
                motionHelper.setProgress(f5);
            }
        }
    }

    public void setProgress(float f5) {
        long l2;
        Object object;
        boolean bl2;
        int n3 = 1065353216;
        float f6 = 1.0f;
        Object object2 = 0;
        float f7 = 0.0f;
        MotionLayout$g motionLayout$g = null;
        float f8 = f5 - 0.0f;
        Object object3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object3 >= 0) {
            bl2 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        }
        if (!(bl2 = this.isAttachedToWindow())) {
            MotionLayout$e motionLayout$e = this.u0;
            if (motionLayout$e == null) {
                this.u0 = motionLayout$e = new MotionLayout$e(this);
            }
            this.u0.a = f5;
            return;
        }
        if (object3 <= 0) {
            float f11 = this.o;
            float f12 = f11 - f6;
            n3 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
            if (n3 == 0 && (n3 = this.f) == (object3 = (Object)this.g)) {
                object = MotionLayout$g.MOVING;
                this.setState((MotionLayout$g)((Object)object));
            }
            this.f = n3 = this.e;
            f6 = this.o;
            float f14 = f6 - 0.0f;
            n3 = (int)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
            if (n3 == 0) {
                object = MotionLayout$g.FINISHED;
                this.setState((MotionLayout$g)((Object)object));
            }
        } else {
            object3 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
            if (object3 >= 0) {
                float f15 = this.o;
                float f16 = f15 - 0.0f;
                object2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                if (object2 == 0 && (object2 = this.f) == (object3 = (Object)this.e)) {
                    motionLayout$g = MotionLayout$g.MOVING;
                    this.setState(motionLayout$g);
                }
                this.f = object2 = this.g;
                f7 = this.o;
                float f17 = f7 - f6;
                n3 = (int)(f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1));
                if (n3 == 0) {
                    object = MotionLayout$g.FINISHED;
                    this.setState((MotionLayout$g)((Object)object));
                }
            } else {
                n3 = -1;
                f6 = 0.0f / 0.0f;
                this.f = n3;
                object = MotionLayout$g.MOVING;
                this.setState((MotionLayout$g)((Object)object));
            }
        }
        if ((object = this.a) == null) {
            return;
        }
        n3 = 1;
        this.r = n3;
        this.q = f5;
        this.n = f5;
        this.p = l2 = (long)-1;
        this.l = l2;
        this.b = null;
        this.s = n3;
        this.invalidate();
    }

    public void setProgress(float f5, float f6) {
        int n3 = this.isAttachedToWindow();
        if (n3 == 0) {
            MotionLayout$e motionLayout$e = this.u0;
            if (motionLayout$e == null) {
                this.u0 = motionLayout$e = new MotionLayout$e(this);
            }
            motionLayout$e = this.u0;
            motionLayout$e.a = f5;
            motionLayout$e.b = f6;
            return;
        }
        this.setProgress(f5);
        MotionLayout$g motionLayout$g = MotionLayout$g.MOVING;
        this.setState(motionLayout$g);
        this.d = f6;
        n3 = 1065353216;
        float f7 = 1.0f;
        float f8 = f6 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object != false) {
            if (object <= 0) {
                n3 = 0;
                f7 = 0.0f;
                motionLayout$g = null;
            }
            this.f(f7);
        } else {
            float f11 = f5 - 0.0f;
            object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object != false && (object = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1)) != false) {
                object = 0x3F000000;
                f6 = 0.5f;
                float f12 = f5 - f6;
                Object object2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (object2 <= 0) {
                    n3 = 0;
                    f7 = 0.0f;
                    motionLayout$g = null;
                }
                this.f(f7);
            }
        }
    }

    public void setScene(a object) {
        boolean bl2;
        this.a = object;
        ((a)object).p = bl2 = this.isRtl();
        object = ((a)object).c;
        if (object != null && (object = ((a$b)object).l) != null) {
            ((b)object).c(bl2);
        }
        this.q();
    }

    public void setStartState(int n3) {
        boolean bl2 = this.isAttachedToWindow();
        if (!bl2) {
            MotionLayout$e motionLayout$e = this.u0;
            if (motionLayout$e == null) {
                this.u0 = motionLayout$e = new MotionLayout$e(this);
            }
            motionLayout$e = this.u0;
            motionLayout$e.c = n3;
            motionLayout$e.d = n3;
            return;
        }
        this.f = n3;
    }

    public void setState(int n3, int n4, int n7) {
        int n8;
        Object object = MotionLayout$g.SETUP;
        this.setState((MotionLayout$g)((Object)object));
        this.f = n3;
        this.e = n8 = -1;
        this.g = n8;
        object = this.mConstraintLayoutSpec;
        if (object != null) {
            float f5 = n4;
            float f6 = n7;
            ((D50)object).b(f5, f6, n3);
        } else {
            a a2 = this.a;
            if (a2 != null) {
                androidx.constraintlayout.widget.b b2 = a2.b(n3);
                b2.b(this);
            }
        }
    }

    public void setState(MotionLayout$g motionLayout$g) {
        int n3;
        int n4;
        int n7;
        MotionLayout$g motionLayout$g2 = MotionLayout$g.FINISHED;
        if (motionLayout$g == motionLayout$g2 && (n7 = this.f) == (n4 = -1)) {
            return;
        }
        MotionLayout$g motionLayout$g3 = this.A0;
        this.A0 = motionLayout$g;
        MotionLayout$g motionLayout$g4 = MotionLayout$g.MOVING;
        if (motionLayout$g3 == motionLayout$g4 && motionLayout$g == motionLayout$g4) {
            this.i();
        }
        if ((n7 = motionLayout$g3.ordinal()) != 0 && n7 != (n3 = 1)) {
            n4 = 2;
            if (n7 == n4 && motionLayout$g == motionLayout$g2) {
                this.j();
            }
        } else {
            if (motionLayout$g == motionLayout$g4) {
                this.i();
            }
            if (motionLayout$g == motionLayout$g2) {
                this.j();
            }
        }
    }

    public void setTransition(int n3) {
        a a2 = this.a;
        if (a2 != null) {
            float f5;
            int n4;
            Object object = this.l(n3);
            this.e = n4 = ((a$b)object).d;
            this.g = n4 = ((a$b)object).c;
            n4 = (int)(this.isAttachedToWindow() ? 1 : 0);
            if (n4 == 0) {
                object = this.u0;
                if (object == null) {
                    this.u0 = object = new MotionLayout$e(this);
                }
                object = this.u0;
                ((MotionLayout$e)object).c = n4 = this.e;
                ((MotionLayout$e)object).d = n4 = this.g;
                return;
            }
            n4 = this.f;
            int n7 = this.e;
            float f6 = 1.0f;
            if (n4 == n7) {
                n4 = 0;
                f5 = 0.0f;
                a2 = null;
            } else {
                n7 = this.g;
                if (n4 == n7) {
                    n4 = 1065353216;
                    f5 = 1.0f;
                } else {
                    n4 = 2143289344;
                    f5 = 0.0f / 0.0f;
                }
            }
            Object object2 = this.a;
            ((a)object2).c = object;
            object = ((a$b)object).l;
            if (object != null) {
                n7 = (int)(((a)object2).p ? 1 : 0);
                ((b)object).c(n7 != 0);
            }
            object = this.a;
            n7 = this.e;
            object = ((a)object).b(n7);
            object2 = this.a;
            int n8 = this.g;
            object2 = ((a)object2).b(n8);
            MotionLayout$c motionLayout$c = this.B0;
            motionLayout$c.e((androidx.constraintlayout.widget.b)object, (androidx.constraintlayout.widget.b)object2);
            this.q();
            float f7 = this.o;
            n3 = (int)(f7 == f5 ? 0 : (f7 > f5 ? 1 : -1));
            if (n3 != 0) {
                float f8 = f5 - 0.0f;
                n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                if (n3 == 0) {
                    n3 = 1;
                    f7 = Float.MIN_VALUE;
                    this.g(n3 != 0);
                    object = this.a;
                    n7 = this.e;
                    object = ((a)object).b(n7);
                    ((androidx.constraintlayout.widget.b)object).b(this);
                } else {
                    n3 = (int)(f5 == f6 ? 0 : (f5 > f6 ? 1 : -1));
                    if (n3 == 0) {
                        n3 = 0;
                        f7 = 0.0f;
                        this.g(false);
                        object = this.a;
                        n7 = this.g;
                        object = ((a)object).b(n7);
                        ((androidx.constraintlayout.widget.b)object).b(this);
                    }
                }
            }
            if ((n3 = (int)(Float.isNaN(f5) ? 1 : 0)) != 0) {
                n3 = 0;
                f7 = 0.0f;
                object = null;
            } else {
                n3 = n4;
                f7 = f5;
            }
            this.o = f7;
            n3 = (int)(Float.isNaN(f5) ? 1 : 0);
            if (n3 != 0) {
                oi0_0.b();
                this.f(0.0f);
            } else {
                this.setProgress(f5);
            }
        }
    }

    public void setTransition(int n3, int n4) {
        boolean bl2 = this.isAttachedToWindow();
        if (!bl2) {
            MotionLayout$e motionLayout$e = this.u0;
            if (motionLayout$e == null) {
                this.u0 = motionLayout$e = new MotionLayout$e(this);
            }
            motionLayout$e = this.u0;
            motionLayout$e.c = n3;
            motionLayout$e.d = n4;
            return;
        }
        Object object = this.a;
        if (object != null) {
            this.e = n3;
            this.g = n4;
            ((a)object).o(n3, n4);
            androidx.constraintlayout.widget.b b2 = this.a.b(n3);
            androidx.constraintlayout.widget.b b3 = this.a.b(n4);
            object = this.B0;
            ((MotionLayout$c)object).e(b2, b3);
            this.q();
            n3 = 0;
            b2 = null;
            this.o = 0.0f;
            this.f(0.0f);
        }
    }

    public void setTransition(a$b object) {
        int n3;
        Object object2;
        Object object3 = this.a;
        ((a)object3).c = object;
        if (object != null && (object2 = ((a$b)object).l) != null) {
            n3 = ((a)object3).p;
            ((b)object2).c(n3 != 0);
        }
        object3 = MotionLayout$g.SETUP;
        this.setState((MotionLayout$g)((Object)object3));
        n3 = this.f;
        object2 = this.a.c;
        int n4 = -1;
        int n7 = object2 == null ? -1 : ((a$b)object2).c;
        if (n3 == n7) {
            float f5;
            n3 = 1065353216;
            this.o = f5 = 1.0f;
            this.n = f5;
            this.q = f5;
        } else {
            n3 = 0;
            float f6 = 0.0f;
            object3 = null;
            this.o = 0.0f;
            this.n = 0.0f;
            this.q = 0.0f;
        }
        int n8 = ((a$b)object).r & 1;
        long l2 = n8 != 0 ? (long)-1 : this.getNanoTime();
        this.p = l2;
        object = this.a;
        n8 = ((a)object).h();
        object3 = this.a;
        object2 = ((a)object3).c;
        if (object2 != null) {
            n4 = ((a$b)object2).c;
        }
        n7 = this.e;
        if (n8 == n7 && n4 == (n7 = this.g)) {
            return;
        }
        this.e = n8;
        this.g = n4;
        ((a)object3).o(n8, n4);
        object = this.a;
        n3 = this.e;
        object = ((a)object).b(n3);
        object3 = this.a;
        n7 = this.g;
        object3 = ((a)object3).b(n7);
        object2 = this.B0;
        ((MotionLayout$c)object2).e((androidx.constraintlayout.widget.b)object, (androidx.constraintlayout.widget.b)object3);
        n8 = this.e;
        n3 = this.g;
        ((MotionLayout$c)object2).e = n8;
        ((MotionLayout$c)object2).f = n3;
        ((MotionLayout$c)object2).f();
        this.q();
    }

    public void setTransitionDuration(int n3) {
        a a2 = this.a;
        if (a2 == null) {
            return;
        }
        a$b a$b = a2.c;
        if (a$b != null) {
            int n4 = 8;
            a$b.h = n3 = Math.max(n3, n4);
        } else {
            a2.j = n3;
        }
    }

    public void setTransitionListener(MotionLayout$f motionLayout$f) {
        this.t = motionLayout$f;
    }

    public void setTransitionState(Bundle object) {
        int n3;
        int n4;
        float f5;
        MotionLayout$e motionLayout$e = this.u0;
        if (motionLayout$e == null) {
            this.u0 = motionLayout$e = new MotionLayout$e(this);
        }
        motionLayout$e = this.u0;
        motionLayout$e.getClass();
        motionLayout$e.a = f5 = object.getFloat("motion.progress");
        motionLayout$e.b = f5 = object.getFloat("motion.velocity");
        motionLayout$e.c = n4 = object.getInt("motion.StartState");
        String string2 = "motion.EndState";
        motionLayout$e.d = n3 = object.getInt(string2);
        n3 = (int)(this.isAttachedToWindow() ? 1 : 0);
        if (n3 != 0) {
            object = this.u0;
            ((MotionLayout$e)object).a();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void t(int var1_1) {
        block26: {
            block25: {
                block27: {
                    var2_2 = this.a;
                    var3_3 = -1;
                    var4_4 = 0;
                    var5_5 = 0.0f;
                    if (var2_2 == null || (var2_2 = var2_2.b) == null) break block26;
                    var6_6 = this.f;
                    var7_7 = var3_3;
                    var2_2 = (Sb3$a)var2_2.b.get(var1_1);
                    if (var2_2 != null) break block27;
                    var6_6 = var1_1;
                    break block25;
                }
                var8_8 = var2_2.b;
                var9_9 = var2_2.c;
                var10_10 = -1.0f;
                cfr_temp_0 = var7_7 - var10_10;
                var11_11 /* !! */  = (float)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var11_11 /* !! */  == false || var11_11 /* !! */  == false) ** GOTO lbl38
                var8_8 = var8_8.iterator();
                var11_11 /* !! */  = (float)false;
                var12_12 = null;
                var10_10 = 0.0f;
                while ((var13_13 = var8_8.hasNext()) != 0) {
                    var14_14 = (Sb3$b)var8_8.next();
                    var15_15 = var14_14.a(var7_7, var7_7);
                    if (var15_15 == 0) continue;
                    var11_11 /* !! */  = var14_14.e;
                    if (var6_6 != var11_11 /* !! */ ) {
                        var12_12 = var14_14;
                        continue;
                    }
                    break block25;
                }
                if (var12_12 != null) {
                    var6_6 = var12_12.e;
                } else {
                    while (true) {
                        var6_6 = var9_9;
                        break block25;
                        break;
                    }
lbl38:
                    // 1 sources

                    if (var9_9 != var6_6) {
                        var16_16 = var8_8.iterator();
                        do {
                            if ((var17_17 = (int)var16_16.hasNext()) == 0) ** continue;
                            var8_8 = (Sb3$b)var16_16.next();
                        } while (var6_6 != (var17_17 = var8_8.e));
                    }
                }
            }
            if (var6_6 != var3_3) {
                var1_1 = var6_6;
            }
        }
        if ((var9_9 = this.f) == var1_1) {
            return;
        }
        var6_6 = this.e;
        var7_7 = 0.0f;
        var16_16 = null;
        if (var6_6 == var1_1) {
            this.f(0.0f);
            return;
        }
        var6_6 = this.g;
        var17_17 = 1065353216;
        var18_18 = 1.0f;
        if (var6_6 == var1_1) {
            this.f(var18_18);
            return;
        }
        this.g = var1_1;
        if (var9_9 != var3_3) {
            this.setTransition(var9_9, var1_1);
            this.f(var18_18);
            this.o = 0.0f;
            this.s();
            return;
        }
        var9_9 = 0;
        var2_2 = null;
        this.w = false;
        this.q = var18_18;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = var19_19 = this.getNanoTime();
        this.l = var19_19 = this.getNanoTime();
        this.r = false;
        this.b = null;
        var21_20 = this.a.c();
        var10_10 = 1000.0f;
        this.m = var21_20 /= var10_10;
        this.e = var3_3;
        var22_21 = this.a;
        var11_11 /* !! */  = this.g;
        var22_21.o(var3_3, (int)var11_11 /* !! */ );
        var23_22 = new SparseArray();
        var6_6 = this.getChildCount();
        var12_12 = this.k;
        var12_12.clear();
        var24_23 = 0.0f;
        var14_14 = null;
        for (var13_13 = 0; var13_13 < var6_6; ++var13_13) {
            var25_24 = this.getChildAt(var13_13);
            var26_25 = new fQ1((View)var25_24);
            var12_12.put(var25_24, var26_25);
            var27_26 = var25_24.getId();
            var25_24 = (fQ1)var12_12.get(var25_24);
            var23_22.put(var27_26, var25_24);
        }
        var3_3 = 1;
        this.s = var3_3;
        var28_27 = this.a.b(var1_1);
        var14_14 = this.B0;
        var14_14.e(null, (androidx.constraintlayout.widget.b)var28_27);
        this.q();
        var14_14.a();
        var1_1 = this.getChildCount();
        var5_5 = 0.0f;
        for (var4_4 = 0; var4_4 < var1_1; ++var4_4) {
            var14_14 = this.getChildAt(var4_4);
            var25_24 = (fQ1)var12_12.get(var14_14);
            if (var25_24 == null) continue;
            var26_25 = var25_24.f;
            var26_25.c = 0.0f;
            var26_25.d = 0.0f;
            var29_28 = var14_14.getX();
            var30_29 = var14_14.getY();
            var31_30 = var14_14.getWidth();
            var32_31 = var31_30;
            var33_32 = var14_14.getHeight();
            var34_33 = var33_32;
            var26_25.g(var29_28, var30_29, var32_31, var34_33);
            var25_24 = var25_24.h;
            var25_24.getClass();
            var14_14.getX();
            var14_14.getY();
            var14_14.getWidth();
            var14_14.getHeight();
            var25_24.b((View)var14_14);
        }
        var1_1 = this.getWidth();
        var4_4 = this.getHeight();
        var14_14 = this.K;
        if (var14_14 != null) {
            var24_23 = 0.0f;
            var14_14 = null;
            for (var13_13 = 0; var13_13 < var6_6; ++var13_13) {
                var25_24 = this.getChildAt(var13_13);
                if ((var25_24 = (fQ1)var12_12.get(var25_24)) == null) continue;
                var26_25 = this.a;
                var26_25.f((fQ1)var25_24);
            }
            var14_14 = this.K.iterator();
            while ((var15_15 = var14_14.hasNext()) != 0) {
                var25_24 = (MotionHelper)var14_14.next();
                var25_24.r(this, (HashMap)var12_12);
            }
            var24_23 = 0.0f;
            var14_14 = null;
            for (var13_13 = 0; var13_13 < var6_6; ++var13_13) {
                var25_24 = this.getChildAt(var13_13);
                if ((var25_24 = (fQ1)var12_12.get(var25_24)) == null) continue;
                var35_34 = this.getNanoTime();
                var25_24.i(var1_1, var4_4, var35_34);
            }
        } else {
            var24_23 = 0.0f;
            var14_14 = null;
            for (var13_13 = 0; var13_13 < var6_6; ++var13_13) {
                var25_24 = this.getChildAt(var13_13);
                if ((var25_24 = (fQ1)var12_12.get(var25_24)) == null) continue;
                var26_25 = this.a;
                var26_25.f((fQ1)var25_24);
                var35_34 = this.getNanoTime();
                var25_24.i(var1_1, var4_4, var35_34);
            }
        }
        if ((var28_27 = this.a.c) != null) {
            var37_35 = var28_27.i;
        } else {
            var1_1 = 0;
            var37_35 = 0.0f;
            var28_27 = null;
        }
        var4_4 = (int)((cfr_temp_1 = var37_35 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
        if (var4_4 != 0) {
            var4_4 = 0x7F7FFFFF;
            var5_5 = 3.4028235E38f;
            var13_13 = -8388609;
            var24_23 = -3.4028235E38f;
            var25_24 = null;
            for (var15_15 = 0; var15_15 < var6_6; ++var15_15) {
                var26_25 = this.getChildAt(var15_15);
                var26_25 = ((fQ1)var12_12.get((Object)var26_25)).g;
                var29_28 = var26_25.e;
                var38_36 = var26_25.f + var29_28;
                var5_5 = Math.min(var5_5, var38_36);
                var24_23 = Math.max(var24_23, var38_36);
            }
            while (var9_9 < var6_6) {
                var25_24 = this.getChildAt(var9_9);
                var25_24 = (fQ1)var12_12.get(var25_24);
                var26_25 = var25_24.g;
                var29_28 = var26_25.e;
                var38_36 = var26_25.f;
                var30_29 = var18_18 - var37_35;
                var25_24.n = var30_29 = var18_18 / var30_29;
                var29_28 = (var29_28 + var38_36 - var5_5) * var37_35;
                var38_36 = var24_23 - var5_5;
                var29_28 /= var38_36;
                var25_24.m = var38_36 = var37_35 - var29_28;
                ++var9_9;
            }
        }
        this.n = 0.0f;
        this.o = 0.0f;
        this.s = var3_3;
        this.invalidate();
    }

    public final String toString() {
        Object object = this.getContext();
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = oi0_0.c(this.e, object);
        stringBuilder.append(string2);
        stringBuilder.append("->");
        object = oi0_0.c(this.g, object);
        stringBuilder.append((String)object);
        stringBuilder.append(" (pos:");
        float f5 = this.o;
        stringBuilder.append(f5);
        stringBuilder.append(" Dpos/Dt:");
        f5 = this.d;
        stringBuilder.append(f5);
        return stringBuilder.toString();
    }

    public final void u(int n3, androidx.constraintlayout.widget.b b2) {
        Object object = this.a;
        if (object != null) {
            object = ((a)object).g;
            object.put(n3, (Object)b2);
        }
        object = this.a;
        int n4 = this.e;
        object = ((a)object).b(n4);
        Object object2 = this.a;
        int n7 = this.g;
        object2 = ((a)object2).b(n7);
        MotionLayout$c motionLayout$c = this.B0;
        motionLayout$c.e((androidx.constraintlayout.widget.b)object, (androidx.constraintlayout.widget.b)object2);
        this.q();
        int n8 = this.f;
        if (n8 == n3) {
            b2.b(this);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void v(int n3, View ... viewArray) {
        block7: {
            boolean bl2;
            Object object = this.a;
            if (object == null) break block7;
            object = ((a)object).q;
            object.getClass();
            ArrayList<View> arrayList = new ArrayList<View>();
            Object object2 = ((d)object).b;
            Iterator iterator = ((ArrayList)object2).iterator();
            while (bl2 = iterator.hasNext()) {
                block9: {
                    int n4;
                    View[] viewArray2;
                    Object object3;
                    int n7;
                    MotionLayout motionLayout;
                    block8: {
                        object2 = (c)iterator.next();
                        int n8 = ((c)object2).a;
                        if (n8 != n3) continue;
                        n8 = viewArray.length;
                        int n10 = 0;
                        motionLayout = null;
                        for (n7 = 0; n7 < n8; ++n7) {
                            View view = viewArray[n7];
                            boolean bl3 = ((c)object2).b(view);
                            if (!bl3) continue;
                            arrayList.add(view);
                        }
                        n8 = (int)(arrayList.isEmpty() ? 1 : 0);
                        if (n8 != 0) continue;
                        object3 = new View[]{};
                        object3 = arrayList.toArray((T[])object3);
                        viewArray2 = object3;
                        viewArray2 = object3;
                        object3 = ((d)object).a;
                        n7 = ((MotionLayout)object3).getCurrentState();
                        n10 = ((c)object2).e;
                        n4 = 2;
                        if (n10 == n4) break block8;
                        n10 = -1;
                        if (n7 == n10) {
                            ((MotionLayout)object3).toString();
                            break block9;
                        } else {
                            object3 = ((MotionLayout)object3).a;
                            if (object3 == null) {
                                n8 = 0;
                                object3 = null;
                            } else {
                                object3 = ((a)object3).b(n7);
                            }
                            Object object4 = object3;
                            if (object3 != null) {
                                motionLayout = ((d)object).a;
                                object3 = object;
                                ((c)object2).a((d)object, motionLayout, n7, (androidx.constraintlayout.widget.b)object4, viewArray2);
                            }
                        }
                        break block9;
                    }
                    motionLayout = ((d)object).a;
                    n4 = 0;
                    Object var12_15 = null;
                    object3 = object;
                    ((c)object2).a((d)object, motionLayout, n7, null, viewArray2);
                }
                arrayList.clear();
            }
        }
    }
}

