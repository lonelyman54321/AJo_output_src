/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 */
package com.ril.ajio.plp;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.ril.ajio.plp.PlpBottomSheetBehavior$SavedState;
import com.ril.ajio.plp.PlpBottomSheetBehavior$SettleRunnable;
import com.ril.ajio.plp.PlpBottomSheetBehavior$a;
import com.ril.ajio.plp.PlpViewDragHelper;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class PlpBottomSheetBehavior
extends CoordinatorLayout$Behavior {
    public final float a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public final boolean g;
    public final boolean h;
    public int i = 4;
    public PlpViewDragHelper j;
    public boolean k;
    public int l;
    public boolean m;
    public int n;
    public WeakReference o;
    public WeakReference p;
    public VelocityTracker q;
    public int r;
    public int s;
    public boolean t;
    public final PlpBottomSheetBehavior$a u;

    public PlpBottomSheetBehavior() {
        PlpBottomSheetBehavior$a plpBottomSheetBehavior$a;
        this.u = plpBottomSheetBehavior$a = new PlpBottomSheetBehavior$a(this);
    }

    public PlpBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        Object object = new PlpBottomSheetBehavior$a(this);
        this.u = object;
        object = R$styleable.BottomSheetBehavior_Layout;
        attributeSet = context.obtainStyledAttributes(attributeSet, (int[])object);
        int n3 = R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        object = attributeSet.peekValue(n3);
        int n4 = -1;
        if (object != null && (n3 = ((TypedValue)object).data) == n4) {
            this.setPeekHeight(n3);
        } else {
            n3 = R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
            n3 = attributeSet.getDimensionPixelSize(n3, n4);
            this.setPeekHeight(n3);
        }
        n3 = R$styleable.BottomSheetBehavior_Layout_behavior_hideable;
        n3 = (int)(attributeSet.getBoolean(n3, false) ? 1 : 0);
        this.g = n3;
        n3 = R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed;
        n3 = (int)(attributeSet.getBoolean(n3, false) ? 1 : 0);
        this.h = n3;
        attributeSet.recycle();
        this.a = f5 = (float)ViewConfiguration.get((Context)context).getScaledMaximumFlingVelocity();
    }

    public static View a(View view) {
        int n3 = ViewCompat$c.j(view);
        if (n3 != 0) {
            return view;
        }
        n3 = view instanceof ViewGroup;
        if (n3 != 0) {
            view = (ViewGroup)view;
            n3 = view.getChildCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                View view2 = PlpBottomSheetBehavior.a(view.getChildAt(i3));
                if (view2 == null) continue;
                return view2;
            }
        }
        return null;
    }

    public final void b() {
        int n3;
        this.r = n3 = -1;
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            n3 = 0;
            velocityTracker = null;
            this.q = null;
        }
    }

    public final void c(int n3) {
        int n4 = this.i;
        if (n4 == n3) {
            return;
        }
        this.i = n3;
        View cfr_ignored_0 = (View)this.o.get();
    }

    public final boolean d(float f5, View view) {
        int n3;
        int n4 = this.h;
        boolean bl2 = true;
        if (n4 != 0) {
            return bl2;
        }
        n4 = view.getTop();
        if (n4 < (n3 = this.f)) {
            return false;
        }
        float f6 = view.getTop();
        n4 = 0x3DCCCCCD;
        float f7 = 0.1f;
        f5 = f5 * f7 + f6;
        f6 = this.f;
        f5 = Math.abs(f5 - f6);
        f6 = this.b;
        float f8 = (f5 /= f6) - (f6 = 0.5f);
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object <= 0) {
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onInterceptTouchEvent(CoordinatorLayout var1_1, View var2_2, MotionEvent var3_3) {
        block38: {
            block29: {
                block26: {
                    block30: {
                        block31: {
                            block32: {
                                block35: {
                                    block33: {
                                        block34: {
                                            block28: {
                                                block27: {
                                                    var4_4 = this;
                                                    var5_5 = var1_1;
                                                    var6_6 /* !! */  = var3_3;
                                                    var7_7 = var2_2.isShown();
                                                    var8_8 = 0;
                                                    var9_9 = 0.0f;
                                                    var10_10 = null;
                                                    var11_11 = 1;
                                                    if (var7_7 == 0) {
                                                        this.k = var11_11;
                                                        return false;
                                                    }
                                                    var7_7 = var3_3.getActionMasked();
                                                    if (var7_7 == 0) {
                                                        this.b();
                                                    }
                                                    if ((var12_12 /* !! */  = var4_4.q) == null) {
                                                        var4_4.q = var12_12 /* !! */  = VelocityTracker.obtain();
                                                    }
                                                    var12_12 /* !! */  = var4_4.q;
                                                    var12_12 /* !! */ .addMovement(var6_6 /* !! */ );
                                                    var13_13 = -1;
                                                    var14_14 /* !! */  = 3;
                                                    if (var7_7 == 0) break block27;
                                                    if (var7_7 == var11_11 || var7_7 == var14_14 /* !! */ ) {
                                                        var4_4.t = false;
                                                        var4_4.r = var13_13;
                                                        var13_13 = (int)var4_4.k;
                                                        if (var13_13 != 0) {
                                                            var4_4.k = false;
                                                            return false;
                                                        }
                                                    }
                                                    break block28;
                                                }
                                                var15_15 = var3_3.getX();
                                                var16_16 = (int)var15_15;
                                                var17_17 = var3_3.getY();
                                                var4_4.s = var18_18 = (int)var17_17;
                                                var19_19 = var4_4.p;
                                                if (var19_19 != null) {
                                                    var19_19 = (View)var19_19.get();
                                                } else {
                                                    var18_18 = 0;
                                                    var17_17 = 0.0f;
                                                    var19_19 = null;
                                                }
                                                if (var19_19 != null && (var18_18 = (int)var5_5.isPointInChildBounds((View)var19_19, var16_16, var20_20 = var4_4.s)) != 0) {
                                                    var18_18 = var3_3.getActionIndex();
                                                    var4_4.r = var18_18 = var6_6 /* !! */ .getPointerId(var18_18);
                                                    var4_4.t = var11_11;
                                                }
                                                if ((var18_18 = var4_4.r) != var13_13) ** GOTO lbl-1000
                                                var13_13 = var4_4.s;
                                                var19_19 = var2_2;
                                                if ((var13_13 = (int)var5_5.isPointInChildBounds(var2_2, var16_16, var13_13)) == 0) {
                                                    var13_13 = 1;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var13_13 = 0;
                                                    var21_21 = null;
                                                }
                                                var4_4.k = var13_13;
                                            }
                                            var13_13 = (int)var4_4.k;
                                            var16_16 = 2;
                                            var15_15 = 2.8E-45f;
                                            if (var13_13 != 0 || (var21_21 = var4_4.j) == null) break block29;
                                            var18_18 = var3_3.getActionMasked();
                                            var20_20 = var3_3.getActionIndex();
                                            if (var18_18 == 0) {
                                                var21_21.a();
                                            }
                                            if ((var22_22 = var21_21.l) == null) {
                                                var21_21.l = var22_22 = VelocityTracker.obtain();
                                            }
                                            var22_22 = var21_21.l;
                                            var22_22.addMovement(var6_6 /* !! */ );
                                            if (var18_18 == 0) break block30;
                                            if (var18_18 == var11_11) break block31;
                                            if (var18_18 == var16_16) break block32;
                                            if (var18_18 == var14_14 /* !! */ ) break block31;
                                            var14_14 /* !! */  = 5;
                                            if (var18_18 == var14_14 /* !! */ ) break block33;
                                            var14_14 /* !! */  = 6;
                                            if (var18_18 == var14_14 /* !! */ ) break block34;
lbl76:
                                            // 7 sources

                                            while (true) {
                                                var11_11 = 0;
                                                break block26;
                                                break;
                                            }
                                        }
                                        var14_14 /* !! */  = var6_6 /* !! */ .getPointerId(var20_20);
                                        var21_21.c(var14_14 /* !! */ );
                                        ** GOTO lbl76
                                    }
                                    var14_14 /* !! */  = var6_6 /* !! */ .getPointerId(var20_20);
                                    var17_17 = var6_6 /* !! */ .getX(var20_20);
                                    var23_26 = var6_6 /* !! */ .getY(var20_20);
                                    var21_21.i(var17_17, var23_26, var14_14 /* !! */ );
                                    var24_27 = var21_21.a;
                                    if (var24_27 != 0) break block35;
                                    var19_19 = var21_21.h;
                                    var14_14 /* !! */  = (int)var19_19[var14_14 /* !! */ ];
                                    ** GOTO lbl76
                                }
                                if (var24_27 != var16_16 || (var19_19 = var21_21.f(var18_18 = (int)var17_17, var20_20 = (int)var23_26)) != (var25_29 = var21_21.r)) ** GOTO lbl76
                                var21_21.l(var14_14 /* !! */ , (View)var19_19);
                                ** GOTO lbl76
                            }
                            var26_30 = var21_21.d;
                            if (var26_30 == null || (var26_30 = var21_21.e) == null) ** GOTO lbl76
                            var14_14 /* !! */  = var3_3.getPointerCount();
                            var17_17 = 0.0f;
                            var19_19 = null;
                            for (var18_18 = 0; var18_18 < var14_14 /* !! */ ; ++var18_18) {
                                block37: {
                                    block36: {
                                        var20_20 = var6_6 /* !! */ .getPointerId(var18_18);
                                        var24_28 = var21_21.k;
                                        var27_31 = var11_11 << var20_20;
                                        if ((var24_28 &= var27_31) == 0) break block36;
                                        var28_32 = var6_6 /* !! */ .getX(var18_18);
                                        var29_33 = var6_6 /* !! */ .getY(var18_18);
                                        var30_34 = var21_21.d;
                                        var31_35 = var30_34[var20_20];
                                        var31_35 = var28_32 - var31_35;
                                        var32_36 = var21_21.e;
                                        var33_37 = var32_36[var20_20];
                                        var33_37 = var29_33 - var33_37;
                                        var24_28 = (int)var28_32;
                                        var27_31 = (int)var29_33;
                                        var22_22 = var21_21.f(var24_28, var27_31);
                                        var34_38 = var21_21.q;
                                        if (var22_22 == null) ** GOTO lbl-1000
                                        var34_38.getClass();
                                        var35_39 = var34_38.a();
                                        if (var35_39 > 0 && (var38_24 = (int)((cfr_temp_0 = (var36_40 = Math.abs(var33_37)) - (var37_23 = (float)var21_21.b)) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) > 0) {
                                            var38_24 = 1;
                                            var37_23 = 1.4E-45f;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var38_24 = 0;
                                            var37_23 = 0.0f;
                                            var12_12 /* !! */  = null;
                                        }
                                        if (var38_24 != 0) {
                                            var22_22.getLeft();
                                            var39_41 = var34_38;
                                            var39_41 = (PlpBottomSheetBehavior$a)var34_38;
                                            var39_41.getClass();
                                            var22_22.getLeft();
                                            var8_8 = var22_22.getTop();
                                            var11_11 = (int)var33_37 + var8_8;
                                            var39_41 = var39_41.a;
                                            var40_42 /* !! */  = var14_14 /* !! */ ;
                                            var14_14 /* !! */  = var39_41.e;
                                            var41_25 /* !! */  = (int)var39_41.g;
                                            var41_25 /* !! */  = var41_25 /* !! */  != 0 ? var39_41.n : var39_41.f;
                                            var41_25 /* !! */  = PK1.b(var11_11, var14_14 /* !! */ , var41_25 /* !! */ );
                                            var11_11 = var34_38.a();
                                            if (var11_11 == 0 || var11_11 > 0 && var41_25 /* !! */  == var8_8) {
                                                break;
                                            }
                                        } else {
                                            var40_42 /* !! */  = var14_14 /* !! */ ;
                                        }
                                        Math.abs(var31_35);
                                        Math.abs(var33_37);
                                        var41_25 /* !! */  = var21_21.h[var20_20];
                                        Math.abs(var33_37);
                                        Math.abs(var31_35);
                                        var41_25 /* !! */  = var21_21.h[var20_20];
                                        Math.abs(var31_35);
                                        Math.abs(var33_37);
                                        var41_25 /* !! */  = var21_21.h[var20_20];
                                        Math.abs(var33_37);
                                        Math.abs(var31_35);
                                        var5_5 = var21_21.h;
                                        var41_25 /* !! */  = (int)var5_5[var20_20];
                                        var41_25 /* !! */  = var21_21.a;
                                        var8_8 = 1;
                                        var9_9 = 1.4E-45f;
                                        if (var41_25 /* !! */  == var8_8 || var38_24 != 0 && (var41_25 /* !! */  = (int)var21_21.l(var20_20, (View)var22_22)) != 0) {
                                            break;
                                        }
                                        break block37;
                                    }
                                    var40_42 /* !! */  = var14_14 /* !! */ ;
                                }
                                var5_5 = var1_1;
                                var14_14 /* !! */  = var40_42 /* !! */ ;
                                var8_8 = 0;
                                var9_9 = 0.0f;
                                var10_10 = null;
                                var11_11 = 1;
                                var16_16 = 2;
                                var15_15 = 2.8E-45f;
                            }
                            var21_21.j(var6_6 /* !! */ );
                            ** GOTO lbl76
                        }
                        var21_21.a();
                        ** while (true)
                    }
                    var42_43 = var3_3.getX();
                    var9_9 = var3_3.getY();
                    var11_11 = 0;
                    var38_24 = var6_6 /* !! */ .getPointerId(0);
                    var21_21.i(var42_43, var9_9, var38_24);
                    var41_25 /* !! */  = (int)var42_43;
                    var8_8 = (int)var9_9;
                    var5_5 = var21_21.f(var41_25 /* !! */ , var8_8);
                    var10_10 = var21_21.r;
                    if (var5_5 == var10_10 && (var8_8 = var21_21.a) == (var14_14 /* !! */  = 2)) {
                        var21_21.l(var38_24, (View)var5_5);
                    }
                    var5_5 = var21_21.h;
                    var41_25 /* !! */  = (int)var5_5[var38_24];
                }
                var41_25 /* !! */  = var21_21.a;
                var8_8 = 1;
                var9_9 = 1.4E-45f;
                if (var41_25 /* !! */  == var8_8) {
                    return (boolean)var8_8;
                }
                break block38;
            }
            var11_11 = 0;
        }
        if ((var5_5 = var4_4.p) != null) {
            var5_5 = var5_5.get();
            var12_12 /* !! */  = var5_5;
            var12_12 /* !! */  = (View)var5_5;
            var41_25 /* !! */  = 2;
            var42_43 = 2.8E-45f;
        } else {
            var41_25 /* !! */  = 2;
            var42_43 = 2.8E-45f;
            var38_24 = 0;
            var37_23 = 0.0f;
            var12_12 /* !! */  = null;
        }
        if (var7_7 != var41_25 /* !! */  || var12_12 /* !! */  == null || (var5_5 = var4_4.j) == null || (var41_25 /* !! */  = (int)var4_4.k) != 0 || (var41_25 /* !! */  = var4_4.i) == (var7_7 = 1)) ** GOTO lbl-1000
        var42_43 = var3_3.getX();
        var41_25 /* !! */  = (int)var42_43;
        var9_9 = var3_3.getY();
        var8_8 = (int)var9_9;
        var21_21 = var1_1;
        if ((var41_25 /* !! */  = (int)var1_1.isPointInChildBounds((View)var12_12 /* !! */ , var41_25 /* !! */ , var8_8)) != 0) ** GOTO lbl-1000
        var42_43 = var4_4.s;
        var43_44 = var3_3.getY();
        var42_43 = Math.abs(var42_43 - var43_44);
        var6_6 /* !! */  = var4_4.j;
        var44_45 = var6_6 /* !! */ .b;
        var43_44 = var44_45;
        cfr_temp_1 = var42_43 - var43_44;
        var41_25 /* !! */  = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
        if (var41_25 /* !! */  > 0) {
            var8_8 = 1;
            var9_9 = 1.4E-45f;
        } else lbl-1000:
        // 3 sources

        {
            var8_8 = 0;
            var9_9 = 0.0f;
            var10_10 = null;
        }
        return (boolean)var8_8;
    }

    public final boolean onLayoutChild(CoordinatorLayout weakReference, View view, int n3) {
        int n4;
        int n7;
        Object object;
        WeakHashMap weakHashMap = ViewCompat.a;
        int n8 = weakReference.getFitsSystemWindows();
        int n10 = 1;
        if (n8 != 0 && (n8 = view.getFitsSystemWindows()) == 0) {
            view.setFitsSystemWindows(n10 != 0);
        }
        n8 = view.getTop();
        ((CoordinatorLayout)((Object)weakReference)).onLayoutChild(view, n3);
        this.n = n3 = weakReference.getHeight();
        n3 = (int)(this.c ? 1 : 0);
        if (n3 != 0) {
            n3 = this.d;
            if (n3 == 0) {
                object = weakReference.getResources();
                n7 = R$dimen.design_bottom_sheet_peek_height_min;
                this.d = n3 = object.getDimensionPixelSize(n7);
            }
            n3 = this.d;
            n7 = this.n;
            n4 = weakReference.getWidth() * 9 / 16;
            n3 = Math.max(n3, n7 -= n4);
        } else {
            n3 = this.b;
        }
        n7 = this.n;
        n4 = view.getHeight();
        n7 -= n4;
        n7 = Math.max(0, n7);
        this.e = n7;
        this.f = n3 = Math.max(this.n - n3, n7);
        n7 = this.i;
        n4 = 3;
        if (n7 == n4) {
            n3 = this.e;
            ViewCompat.m(n3, view);
        } else {
            n4 = (int)(this.g ? 1 : 0);
            if (n4 != 0 && n7 == (n4 = 5)) {
                n3 = this.n;
                ViewCompat.m(n3, view);
            } else {
                n4 = 4;
                if (n7 == n4) {
                    ViewCompat.m(n3, view);
                } else if (n7 == n10 || n7 == (n3 = 2)) {
                    n3 = view.getTop();
                    ViewCompat.m(n8 -= n3, view);
                }
            }
        }
        object = this.j;
        if (object == null) {
            weakHashMap = weakReference.getContext();
            PlpBottomSheetBehavior$a plpBottomSheetBehavior$a = this.u;
            object = new PlpViewDragHelper((Context)weakHashMap, (ViewGroup)weakReference, plpBottomSheetBehavior$a);
            this.j = object;
        }
        this.o = weakReference = new WeakReference<View>(view);
        view = PlpBottomSheetBehavior.a(view);
        this.p = weakReference = new WeakReference<View>(view);
        return n10;
    }

    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f5, float f6) {
        boolean bl2;
        int n3;
        int n4;
        Object t3 = this.p.get();
        if (view2 == t3 && ((n4 = this.i) != (n3 = 3) || (bl2 = super.onNestedPreFling(coordinatorLayout, view, view2, f5, f6)))) {
            bl2 = true;
        } else {
            bl2 = false;
            coordinatorLayout = null;
        }
        return bl2;
    }

    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int n3, int n4, int[] nArray) {
        int n7;
        int n8;
        coordinatorLayout = (View)this.p.get();
        if (view2 != coordinatorLayout) {
            return;
        }
        int n10 = view.getTop();
        n3 = n10 - n4;
        int n14 = 1;
        if (n4 > 0) {
            int n15 = this.e;
            if (n3 < n15) {
                nArray[n14] = n10 -= n15;
                ViewCompat.m(-n10, view);
                n10 = 3;
                this.c(n10);
            } else {
                nArray[n14] = n4;
                n10 = -n4;
                ViewCompat.m(n10, view);
                this.c(n14);
            }
        } else if (n4 < 0 && (n8 = view2.canScrollVertically(n7 = -1)) == 0) {
            n8 = this.f;
            if (n3 > n8 && (n3 = (int)(this.g ? 1 : 0)) == 0) {
                nArray[n14] = n10 -= n8;
                ViewCompat.m(-n10, view);
                n10 = 4;
                this.c(n10);
            } else {
                nArray[n14] = n4;
                n10 = -n4;
                ViewCompat.m(n10, view);
                this.c(n14);
            }
        }
        view.getTop();
        coordinatorLayout = (View)this.o.get();
        this.l = n4;
        this.m = n14;
    }

    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        parcelable = (PlpBottomSheetBehavior$SavedState)parcelable;
        Parcelable parcelable2 = parcelable.getSuperState();
        super.onRestoreInstanceState(coordinatorLayout, view, parcelable2);
        int n3 = 1;
        int n4 = parcelable.a;
        this.i = n4 != n3 && n4 != (n3 = 2) ? n4 : (n3 = 4);
    }

    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        coordinatorLayout = super.onSaveInstanceState(coordinatorLayout, view);
        int n3 = this.i;
        PlpBottomSheetBehavior$SavedState plpBottomSheetBehavior$SavedState = new PlpBottomSheetBehavior$SavedState((Parcelable)coordinatorLayout, n3);
        return plpBottomSheetBehavior$SavedState;
    }

    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int n3) {
        boolean bl2 = false;
        this.l = 0;
        this.m = false;
        int n4 = n3 & 2;
        if (n4 != 0) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public final void onStopNestedScroll(CoordinatorLayout var1_1, View var2_2, View var3_3) {
        block6: {
            block8: {
                block12: {
                    block10: {
                        block11: {
                            block9: {
                                block7: {
                                    var4_4 = var2_2.getTop();
                                    var5_5 = this.e;
                                    var6_6 = 3;
                                    if (var4_4 == var5_5) {
                                        this.c(var6_6);
                                        return;
                                    }
                                    var1_1 = this.p;
                                    if (var1_1 == null || var3_3 != (var1_1 = var1_1.get()) || (var4_4 = (int)this.m) == 0) break block6;
                                    var4_4 = this.l;
                                    if (var4_4 <= 0) break block7;
                                    var4_4 = this.e;
                                    break block8;
                                }
                                var4_4 = (int)this.g;
                                if (var4_4 == 0) break block9;
                                var1_1 = this.q;
                                if (var1_1 != null) {
                                    var7_7 = this.a;
                                    var1_1.computeCurrentVelocity(1000, var7_7);
                                    var1_1 = this.q;
                                    var8_8 = this.r;
                                    var9_9 = var1_1.getYVelocity(var8_8);
                                } else {
                                    var4_4 = 0;
                                    var9_9 = 0.0f;
                                    var1_1 = null;
                                }
                                var4_4 = (int)this.d(var9_9, var2_2);
                                if (var4_4 == 0) break block9;
                                var4_4 = this.n;
                                var6_6 = 5;
                                break block8;
                            }
                            var4_4 = this.l;
                            var8_8 = 4;
                            if (var4_4 != 0) break block10;
                            var4_4 = var2_2.getTop();
                            var5_5 = this.e;
                            if ((var5_5 = Math.abs(var4_4 - var5_5)) >= (var4_4 = Math.abs(var4_4 - (var10_10 = this.f)))) break block11;
                            var4_4 = this.e;
                            break block8;
                        }
                        var4_4 = this.f;
                        break block12;
                    }
                    var4_4 = this.f;
                }
                var6_6 = 4;
            }
            var3_3 = this.j;
            var5_5 = 0;
            var7_7 = 0.0f;
            if (var3_3 == null) ** GOTO lbl-1000
            var10_10 = var2_2.getLeft();
            var3_3.r = var2_2;
            var3_3.c = var11_11 = -1;
            if ((var4_4 = (int)var3_3.g(var10_10, var4_4, 0, 0)) == 0 && (var10_10 = var3_3.a) == 0 && (var12_12 = var3_3.r) != null) {
                var10_10 = 0;
                var12_12 = null;
                var3_3.r = null;
            }
            if (var4_4 != 0) {
                var4_4 = 2;
                var9_9 = 2.8E-45f;
                this.c(var4_4);
                var1_1 = new PlpBottomSheetBehavior$SettleRunnable(this, var2_2, var6_6);
                var3_3 = ViewCompat.a;
                var2_2.postOnAnimation((Runnable)var1_1);
            } else lbl-1000:
            // 2 sources

            {
                this.c(var6_6);
            }
            this.m = false;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onTouchEvent(CoordinatorLayout var1_1, View var2_2, MotionEvent var3_3) {
        var4_4 = this;
        var5_5 = var3_3;
        var6_6 = var2_2.isShown();
        var7_7 /* !! */  = 0;
        var8_8 = 0.0f;
        var9_9 /* !! */  = null;
        if (var6_6 == 0) {
            return false;
        }
        var6_6 = var3_3.getActionMasked();
        var10_10 = this.i;
        var11_11 = 1;
        if (var10_10 == var11_11 && var6_6 == 0) {
            return (boolean)var11_11;
        }
        var12_12 = var4_4.j;
        var13_13 = 2;
        if (var12_12 != null) {
            var14_14 = var3_3.getActionMasked();
            var15_15 = var3_3.getActionIndex();
            if (var14_14 == 0) {
                var12_12.a();
            }
            if ((var16_16 /* !! */  = var12_12.l) == null) {
                var12_12.l = var16_16 /* !! */  = VelocityTracker.obtain();
            }
            var16_16 /* !! */  = var12_12.l;
            var16_16 /* !! */ .addMovement(var5_5);
            if (var14_14 != 0) {
                if (var14_14 != var11_11) {
                    if (var14_14 != var13_13) {
                        var17_17 = 3;
                        var18_21 = 4.2E-45f;
                        if (var14_14 != var17_17) {
                            var17_17 = 5;
                            var18_21 = 7.0E-45f;
                            if (var14_14 != var17_17) {
                                var17_17 = 6;
                                var18_21 = 8.4E-45f;
                                if (var14_14 == var17_17) {
                                    var14_14 = var5_5.getPointerId(var15_15);
                                    var15_15 = var12_12.a;
                                    if (var15_15 == var11_11 && var14_14 == (var15_15 = var12_12.c)) {
                                        block43: {
                                            var15_15 = var3_3.getPointerCount();
                                            while (true) {
                                                var17_17 = -1;
                                                var18_21 = 0.0f / 0.0f;
                                                if (var7_7 /* !! */  >= var15_15) break;
                                                var19_24 = var5_5.getPointerId(var7_7 /* !! */ );
                                                if (var19_24 != (var20_29 = var12_12.c) && (var24_40 = var12_12.f(var20_29 = (int)(var21_33 = var5_5.getX(var7_7 /* !! */ )), var23_37 = (int)(var22_35 = var5_5.getY(var7_7 /* !! */ )))) == (var25_43 = var12_12.r) && (var19_24 = (int)var12_12.l(var19_24, var25_43)) != 0) {
                                                    var7_7 /* !! */  = var12_12.c;
                                                    break block43;
                                                }
                                                ++var7_7 /* !! */ ;
                                            }
                                            var7_7 /* !! */  = -1;
                                            var8_8 = 0.0f / 0.0f;
                                        }
                                        if (var7_7 /* !! */  == var17_17) {
                                            var12_12.h();
                                        }
                                    }
                                    var12_12.c(var14_14);
                                }
                            } else {
                                var14_14 = var5_5.getPointerId(var15_15);
                                var18_21 = var5_5.getX(var15_15);
                                var26_46 = var5_5.getY(var15_15);
                                var12_12.i(var18_21, var26_46, var14_14);
                                var19_25 = var12_12.a;
                                if (var19_25 == 0) {
                                    var7_7 /* !! */  = (int)var18_21;
                                    var15_15 = (int)var26_46;
                                    var9_9 /* !! */  = var12_12.f(var7_7 /* !! */ , var15_15);
                                    var12_12.l(var14_14, (View)var9_9 /* !! */ );
                                    var9_9 /* !! */  = (VelocityTracker)var12_12.h;
                                    var7_7 /* !! */  = (int)var9_9 /* !! */ [var14_14];
                                } else {
                                    var17_17 = (int)var18_21;
                                    var15_15 = (int)var26_46;
                                    var27_48 = var12_12.r;
                                    if (var27_48 != null && var17_17 >= (var20_30 = var27_48.getLeft()) && var17_17 < (var20_30 = var27_48.getRight()) && var15_15 >= (var17_17 = var27_48.getTop()) && var15_15 < (var17_17 = var27_48.getBottom())) {
                                        var7_7 /* !! */  = 1;
                                        var8_8 = 1.4E-45f;
                                    }
                                    if (var7_7 /* !! */  != 0) {
                                        var9_9 /* !! */  = var12_12.r;
                                        var12_12.l(var14_14, (View)var9_9 /* !! */ );
                                    }
                                }
                            }
                        } else {
                            var7_7 /* !! */  = var12_12.a;
                            if (var7_7 /* !! */  == var11_11) {
                                var7_7 /* !! */  = 0;
                                var8_8 = 0.0f;
                                var9_9 /* !! */  = null;
                                var12_12.e(0.0f);
                            }
                            var12_12.a();
                        }
                    } else {
                        var14_14 = var12_12.a;
                        var28_50 = var12_12.q;
                        if (var14_14 == var11_11) {
                            var14_14 = var12_12.c;
                            var17_18 = var12_12.k;
                            var19_26 = var11_11 << var14_14;
                            if ((var17_18 &= var19_26) != 0) {
                                var7_7 /* !! */  = 1;
                                var8_8 = 1.4E-45f;
                            }
                            if (var7_7 /* !! */  != 0) {
                                var7_7 /* !! */  = var5_5.findPointerIndex(var14_14);
                                var29_51 = var5_5.getX(var7_7 /* !! */ );
                                var8_8 = var5_5.getY(var7_7 /* !! */ );
                                var16_16 /* !! */  = (VelocityTracker)var12_12.f;
                                var19_26 = var12_12.c;
                                var18_22 /* !! */  = var16_16 /* !! */ [var19_26];
                                var14_14 = (int)(var29_51 -= var18_22 /* !! */ );
                                var18_22 /* !! */  = (VelocityTracker)var12_12.g[var19_26];
                                var7_7 /* !! */  = (int)(var8_8 -= var18_22 /* !! */ );
                                var12_12.r.getLeft();
                                var16_16 /* !! */  = var12_12.r;
                                var17_18 = var16_16 /* !! */ .getTop() + var7_7 /* !! */ ;
                                var27_49 /* !! */  = var12_12.r;
                                var19_26 = var27_49 /* !! */ .getLeft();
                                var24_41 = var12_12.r;
                                var20_31 = var24_41.getTop();
                                if (var14_14 != 0) {
                                    var25_44 = var12_12.r;
                                    var30_53 = var28_50;
                                    ((PlpBottomSheetBehavior$a)var28_50).getClass();
                                    var23_38 = var25_44.getLeft();
                                    var30_53 = var12_12.r;
                                    ViewCompat.l(var23_38 -= var19_26, (View)var30_53);
                                }
                                if (var7_7 /* !! */  != 0) {
                                    var27_49 /* !! */  = var28_50;
                                    var27_49 /* !! */  = ((PlpBottomSheetBehavior$a)var28_50).a;
                                    var23_38 = var27_49 /* !! */ .e;
                                    var31_55 = var27_49 /* !! */ .g;
                                    var19_26 = var31_55 != false ? var27_49 /* !! */ .n : var27_49 /* !! */ .f;
                                    var17_18 = PK1.b(var17_18, var23_38, var19_26);
                                    var27_49 /* !! */  = var12_12.r;
                                    ViewCompat.m(var17_18 -= var20_31, var27_49 /* !! */ );
                                }
                                if (var14_14 != 0 || var7_7 /* !! */  != 0) {
                                    var28_50 = (PlpBottomSheetBehavior$a)var28_50;
                                    var9_9 /* !! */  = (View)var28_50.a.o.get();
                                }
                                var12_12.j(var5_5);
                            }
                        } else {
                            var14_14 = var3_3.getPointerCount();
                            var18_23 = 0.0f;
                            var16_16 /* !! */  = null;
                            for (var17_19 = 0; var17_19 < var14_14; ++var17_19) {
                                var19_27 = var5_5.getPointerId(var17_19);
                                var20_32 = var12_12.k;
                                var23_39 = var11_11 << var19_27;
                                if ((var20_32 &= var23_39) != 0) {
                                    var20_32 = 1;
                                    var21_34 = 1.4E-45f;
                                } else {
                                    var20_32 = 0;
                                    var21_34 = 0.0f;
                                    var24_42 = null;
                                }
                                if (var20_32 == 0) continue;
                                var21_34 = var5_5.getX(var17_19);
                                var22_36 = var5_5.getY(var17_19);
                                var32_57 = var12_12.d[var19_27];
                                var32_57 = var21_34 - var32_57;
                                var33_58 = var12_12.e;
                                var34_59 = var33_58[var19_27];
                                var34_59 = var22_36 - var34_59;
                                Math.abs(var32_57);
                                Math.abs(var34_59);
                                var12_12.h[var19_27];
                                Math.abs(var34_59);
                                Math.abs(var32_57);
                                var12_12.h[var19_27];
                                Math.abs(var32_57);
                                Math.abs(var34_59);
                                var35_60 = var12_12.h;
                                var35_60[var19_27];
                                Math.abs(var34_59);
                                Math.abs(var32_57);
                                var30_54 = var12_12.h;
                                var31_56 = var30_54[var19_27];
                                var31_56 = var12_12.a;
                                if (var31_56 == var11_11) break;
                                var20_32 = (int)var21_34;
                                var23_39 = (int)var22_36;
                                var24_42 = var12_12.f(var20_32, var23_39);
                                if (var24_42 == null) {
                                    while (true) {
                                        var23_39 = 0;
                                        var22_36 = 0.0f;
                                        var25_45 = null;
                                        break;
                                    }
                                } else {
                                    var28_50.getClass();
                                    if ((var23_39 = var28_50.a()) <= 0 || (var23_39 = (int)((cfr_temp_0 = (var22_36 = Math.abs(var34_59)) - (var32_57 = (float)(var31_56 = var12_12.b))) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1))) <= 0) ** continue;
                                    var23_39 = 1;
                                    var22_36 = 1.4E-45f;
                                }
                                if (var23_39 != 0 && (var19_27 = (int)var12_12.l(var19_27, var24_42)) != 0) break;
                            }
                            var12_12.j(var5_5);
                        }
                    }
                } else {
                    var7_7 /* !! */  = var12_12.a;
                    if (var7_7 /* !! */  == var11_11) {
                        var12_12.h();
                    }
                    var12_12.a();
                }
            } else {
                var29_52 = var3_3.getX();
                var26_47 = var3_3.getY();
                var7_7 /* !! */  = var5_5.getPointerId(0);
                var17_20 = (int)var29_52;
                var19_28 = (int)var26_47;
                var16_16 /* !! */  = var12_12.f(var17_20, var19_28);
                var12_12.i(var29_52, var26_47, var7_7 /* !! */ );
                var12_12.l(var7_7 /* !! */ , (View)var16_16 /* !! */ );
                var12_12 = var12_12.h;
                var7_7 /* !! */  = (int)var12_12[var7_7 /* !! */ ];
            }
        }
        if (var6_6 == 0) {
            this.b();
        }
        if ((var9_9 /* !! */  = var4_4.q) == null) {
            var4_4.q = var9_9 /* !! */  = VelocityTracker.obtain();
        }
        var9_9 /* !! */  = var4_4.q;
        var9_9 /* !! */ .addMovement(var5_5);
        if (var6_6 == var13_13 && (var6_6 = (int)var4_4.k) == 0 && (var36_61 = var4_4.j) != null) {
            var37_62 = var4_4.s;
            var8_8 = var3_3.getY();
            var37_62 = Math.abs(var37_62 - var8_8);
            var9_9 /* !! */  = var4_4.j;
            var10_10 = var9_9 /* !! */ .b;
            var38_63 = var10_10;
            cfr_temp_1 = var37_62 - var38_63;
            var6_6 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
            if (var6_6 > 0) {
                var6_6 = var3_3.getActionIndex();
                var39_64 = var5_5.getPointerId(var6_6);
                var36_61 = var2_2;
                var9_9 /* !! */ .b(var39_64, var2_2);
            }
        }
        return var4_4.k ^ var11_11;
    }

    public final void setPeekHeight(int n3) {
        block5: {
            WeakReference weakReference;
            int n4;
            block6: {
                block4: {
                    n4 = -1;
                    if (n3 != n4) break block4;
                    n3 = (int)(this.c ? 1 : 0);
                    if (n3 != 0) break block5;
                    n3 = 1;
                    this.c = n3;
                    break block6;
                }
                n4 = (int)(this.c ? 1 : 0);
                if (n4 == 0 && (n4 = this.b) == n3) break block5;
                this.c = false;
                this.b = n4 = Math.max(0, n3);
                this.f = n4 = this.n - n3;
            }
            n3 = this.i;
            n4 = 4;
            if (n3 == n4 && (weakReference = this.o) != null && (weakReference = (View)weakReference.get()) != null) {
                weakReference.requestLayout();
            }
        }
    }
}

