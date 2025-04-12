/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.animation.Interpolator
 *  android.widget.OverScroller
 */
package com.ril.ajio.plp;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.ril.ajio.plp.PlpBottomSheetBehavior;
import com.ril.ajio.plp.PlpBottomSheetBehavior$SettleRunnable;
import com.ril.ajio.plp.PlpBottomSheetBehavior$a;
import com.ril.ajio.plp.PlpViewDragHelper$2;
import com.ril.ajio.plp.PlpViewDragHelper$a;
import com.ril.ajio.plp.PlpViewDragHelper$b;
import java.util.Arrays;

public final class PlpViewDragHelper {
    public static final PlpViewDragHelper$a v;
    public int a;
    public final int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final PlpViewDragHelper$b q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public final Runnable u;

    static {
        PlpViewDragHelper$a plpViewDragHelper$a;
        v = plpViewDragHelper$a = new Object();
    }

    public PlpViewDragHelper(Context object, ViewGroup viewGroup, PlpBottomSheetBehavior$a object2) {
        int n3;
        this.c = n3 = -1;
        PlpViewDragHelper$2 plpViewDragHelper$2 = new PlpViewDragHelper$2(this);
        this.u = plpViewDragHelper$2;
        if (viewGroup != null) {
            if (object2 != null) {
                float f5;
                float f6;
                int n4;
                this.t = viewGroup;
                this.q = object2;
                viewGroup = ViewConfiguration.get((Context)object);
                this.o = n4 = (int)(object.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
                this.b = n4 = viewGroup.getScaledTouchSlop();
                this.m = f6 = (float)viewGroup.getScaledMaximumFlingVelocity();
                this.n = f5 = (float)viewGroup.getScaledMinimumFlingVelocity();
                object2 = v;
                super(object, (Interpolator)object2);
                this.p = viewGroup;
                return;
            }
            super("Callback may not be null");
            throw object;
        }
        super("Parent view may not be null");
        throw object;
    }

    public final void a() {
        int n3;
        this.c = n3 = -1;
        Object object = this.d;
        if (object != null) {
            Arrays.fill(object, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            object = this.j;
            Arrays.fill((int[])object, 0);
            this.k = 0;
        }
        object = this.l;
        if (object != null) {
            object.recycle();
            n3 = 0;
            object = null;
            this.l = null;
        }
    }

    public final void b(int n3, View object) {
        ViewGroup viewGroup;
        ViewParent viewParent = object.getParent();
        if (viewParent == (viewGroup = this.t)) {
            this.r = object;
            this.c = n3;
            this.q.getClass();
            this.k(1);
            return;
        }
        object = new StringBuilder("captureChildView: parameter must be a descendant of the PlpViewDragHelper's tracked parent view (");
        ((StringBuilder)object).append(viewGroup);
        ((StringBuilder)object).append(")");
        object = ((StringBuilder)object).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final void c(int n3) {
        int n4;
        int n7;
        int n8;
        Object[] objectArray = this.d;
        if (objectArray != null && (n8 = (n7 = this.k) & (n4 = 1 << n3)) != 0) {
            objectArray[n3] = 0.0f;
            this.e[n3] = 0.0f;
            this.f[n3] = 0.0f;
            this.g[n3] = 0.0f;
            objectArray = this.h;
            n8 = 0;
            objectArray[n3] = 0.0f;
            this.i[n3] = 0;
            objectArray = this.j;
            objectArray[n3] = 0.0f;
            this.k = n3 = ~n4 & n7;
        }
    }

    public final int d(int n3, int n4, int n7) {
        if (n3 == 0) {
            return 0;
        }
        ViewGroup viewGroup = this.t;
        int n8 = viewGroup.getWidth();
        int n10 = n8 / 2;
        int n14 = Math.abs(n3);
        float f5 = n14;
        float f6 = n8;
        f5 /= f6;
        n8 = 1065353216;
        f6 = 1.0f;
        f5 = Math.min(f6, f5);
        float f7 = n10;
        float f8 = 0.47123894f;
        double d2 = Math.sin((f5 -= 0.5f) * f8);
        f5 = (float)d2 * f7 + f7;
        n4 = Math.abs(n4);
        n10 = 1148846080;
        f7 = 1000.0f;
        if (n4 > 0) {
            float f11 = n4;
            f5 /= f11;
            f11 = Math.abs(f5) * f7;
            n3 = Math.round(f11) * 4;
        } else {
            float f12 = Math.abs(n3);
            float f14 = n7;
            f12 = (f12 / f14 + f6) * f7;
            n3 = (int)f12;
        }
        return Math.min(n3, 1000);
    }

    public final void e(float f5) {
        PlpBottomSheetBehavior$SettleRunnable plpBottomSheetBehavior$SettleRunnable;
        int n3;
        int n4;
        block9: {
            int n7;
            Object object;
            block7: {
                block8: {
                    int n8;
                    VelocityTracker velocityTracker;
                    float f6;
                    int n10;
                    Object object2;
                    PlpViewDragHelper plpViewDragHelper;
                    View view;
                    block2: {
                        block6: {
                            block4: {
                                block5: {
                                    int n14;
                                    block3: {
                                        block1: {
                                            this.s = n4 = 1;
                                            view = this.r;
                                            object = ((PlpBottomSheetBehavior$a)this.q).a;
                                            n7 = 3;
                                            n14 = 0;
                                            plpViewDragHelper = null;
                                            float f7 = f5 - 0.0f;
                                            object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                                            if (object2 >= 0) break block1;
                                            n3 = ((PlpBottomSheetBehavior)object).e;
                                            break block2;
                                        }
                                        object2 = ((PlpBottomSheetBehavior)object).g;
                                        if (object2 == false || (object2 = (Object)((PlpBottomSheetBehavior)object).d(f5, view)) == false) break block3;
                                        n3 = ((PlpBottomSheetBehavior)object).n;
                                        n7 = 5;
                                        break block2;
                                    }
                                    object2 = 4;
                                    float f8 = f5 - 0.0f;
                                    n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                                    if (n3 != 0) break block4;
                                    n3 = view.getTop();
                                    n14 = ((PlpBottomSheetBehavior)object).e;
                                    if ((n14 = Math.abs(n3 - n14)) >= (n3 = Math.abs(n3 - (n10 = ((PlpBottomSheetBehavior)object).f)))) break block5;
                                    n3 = ((PlpBottomSheetBehavior)object).e;
                                    break block2;
                                }
                                n3 = ((PlpBottomSheetBehavior)object).f;
                                break block6;
                            }
                            n3 = ((PlpBottomSheetBehavior)object).f;
                        }
                        n7 = 4;
                    }
                    plpViewDragHelper = ((PlpBottomSheetBehavior)object).j;
                    if (plpViewDragHelper == null) break block7;
                    object2 = view.getLeft();
                    n10 = plpViewDragHelper.s;
                    if (n10 == 0) break block8;
                    VelocityTracker velocityTracker2 = plpViewDragHelper.l;
                    int n15 = plpViewDragHelper.c;
                    float f11 = velocityTracker2.getXVelocity(n15);
                    n10 = (int)f11;
                    if ((n3 = (int)(plpViewDragHelper.g((int)object2, n3, n10, n15 = (int)(f6 = (velocityTracker = plpViewDragHelper.l).getYVelocity(n8 = plpViewDragHelper.c))) ? 1 : 0)) == 0) break block7;
                    n3 = 2;
                    f5 = 2.8E-45f;
                    ((PlpBottomSheetBehavior)object).c(n3);
                    plpBottomSheetBehavior$SettleRunnable = new PlpBottomSheetBehavior$SettleRunnable((PlpBottomSheetBehavior)object, view, n7);
                    object = ViewCompat.a;
                    view.postOnAnimation((Runnable)plpBottomSheetBehavior$SettleRunnable);
                    break block9;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                throw illegalStateException;
            }
            ((PlpBottomSheetBehavior)object).c(n7);
        }
        n3 = 0;
        f5 = 0.0f;
        plpBottomSheetBehavior$SettleRunnable = null;
        this.s = false;
        int n16 = this.a;
        if (n16 == n4) {
            this.k(0);
        }
    }

    public final View f(int n3, int n4) {
        ViewGroup viewGroup = this.t;
        for (int i3 = viewGroup.getChildCount() + -1; i3 >= 0; i3 += -1) {
            this.q.getClass();
            View view = viewGroup.getChildAt(i3);
            int n7 = view.getLeft();
            if (n3 < n7 || n3 >= (n7 = view.getRight()) || n4 < (n7 = view.getTop()) || n4 >= (n7 = view.getBottom())) continue;
            return view;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean g(int n3, int n4, int n7, int n8) {
        float f5;
        int n10 = this.r.getLeft();
        View view = this.r;
        int n14 = view.getTop();
        int n15 = n3 - n10;
        int n16 = n4 - n14;
        OverScroller overScroller = this.p;
        n3 = 0;
        float f6 = 0.0f;
        if (n15 == 0 && n16 == 0) {
            overScroller.abortAnimation();
            this.k(0);
            return false;
        }
        float f7 = this.n;
        n4 = (int)f7;
        float f8 = this.m;
        int n17 = (int)f8;
        int n18 = Math.abs(n7);
        if (n18 < n4) {
            n7 = 0;
        } else if (n18 > n17) {
            n7 = n7 > 0 ? n17 : -n17;
        }
        n18 = Math.abs(n8);
        if (n18 < n4) {
            n8 = 0;
        } else if (n18 > n17) {
            n8 = n8 > 0 ? n17 : (n4 = -n17);
        }
        n4 = Math.abs(n15);
        n17 = Math.abs(n16);
        n18 = Math.abs(n7);
        int n19 = Math.abs(n8);
        int n20 = n18 + n19;
        int n21 = n4 + n17;
        if (n7 != 0) {
            f7 = n18;
            f5 = n20;
        } else {
            f7 = n4;
            f5 = n21;
        }
        f7 /= f5;
        if (n8 != 0) {
            f8 = n19;
            f5 = n20;
        } else {
            f8 = n17;
            f5 = n21;
        }
        f8 /= f5;
        PlpViewDragHelper$b plpViewDragHelper$b = this.q;
        plpViewDragHelper$b.getClass();
        n3 = this.d(n15, n7, 0);
        n7 = plpViewDragHelper$b.a();
        n7 = this.d(n16, n8, n7);
        f6 = (float)n3 * f7;
        n18 = (int)((float)n7 * f8 + f6);
        overScroller.startScroll(n10, n14, n15, n16, n18);
        this.k(2);
        return true;
    }

    public final void h() {
        VelocityTracker velocityTracker = this.l;
        float f5 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f5);
        velocityTracker = this.l;
        int n3 = this.c;
        float f6 = velocityTracker.getXVelocity(n3);
        float f7 = this.n;
        Math.abs(f6);
        velocityTracker = this.l;
        int n4 = this.c;
        f6 = velocityTracker.getYVelocity(n4);
        float f8 = Math.abs(f6);
        n3 = (int)(f8 == f7 ? 0 : (f8 < f7 ? -1 : 1));
        if (n3 < 0) {
            boolean bl2 = false;
            f6 = 0.0f;
            velocityTracker = null;
        } else {
            n3 = (int)(f8 == f5 ? 0 : (f8 > f5 ? 1 : -1));
            if (n3 > 0) {
                float f11 = f6 - 0.0f;
                Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                if (object <= 0) {
                    f5 = -f5;
                }
                f6 = f5;
            }
        }
        this.e(f6);
    }

    public final void i(float f5, float f6, int n3) {
        Object object;
        int n4;
        Object[] objectArray = this.d;
        int n7 = 0;
        if (objectArray == null || (n4 = objectArray.length) <= n3) {
            n4 = n3 + 1;
            float[] fArray = new float[n4];
            float[] fArray2 = new float[n4];
            float[] fArray3 = new float[n4];
            float[] fArray4 = new float[n4];
            int[] nArray = new int[n4];
            int[] nArray2 = new int[n4];
            object = new int[n4];
            if (objectArray != null) {
                int n8 = objectArray.length;
                System.arraycopy(objectArray, 0, fArray, 0, n8);
                objectArray = this.e;
                n8 = objectArray.length;
                System.arraycopy(objectArray, 0, fArray2, 0, n8);
                objectArray = this.f;
                n8 = objectArray.length;
                System.arraycopy(objectArray, 0, fArray3, 0, n8);
                objectArray = this.g;
                n8 = objectArray.length;
                System.arraycopy(objectArray, 0, fArray4, 0, n8);
                objectArray = this.h;
                n8 = objectArray.length;
                System.arraycopy(objectArray, 0, nArray, 0, n8);
                objectArray = this.i;
                n8 = objectArray.length;
                System.arraycopy(objectArray, 0, nArray2, 0, n8);
                objectArray = this.j;
                n8 = objectArray.length;
                System.arraycopy(objectArray, 0, object, 0, n8);
            }
            this.d = fArray;
            this.e = fArray2;
            this.f = fArray3;
            this.g = fArray4;
            this.h = nArray;
            this.i = nArray2;
            this.j = object;
        }
        objectArray = this.d;
        this.f[n3] = f5;
        objectArray[n3] = f5;
        objectArray = this.e;
        this.g[n3] = f6;
        objectArray[n3] = f6;
        objectArray = this.h;
        int n10 = (int)f5;
        int n14 = (int)f6;
        object = this.t;
        int n15 = object.getLeft();
        int n16 = this.o;
        int n17 = 1;
        if (n10 < (n15 += n16)) {
            n7 = 1;
        }
        if (n14 < (n15 = object.getTop() + n16)) {
            n7 |= 4;
        }
        if (n10 > (n15 = object.getRight() - n16)) {
            n7 |= 2;
        }
        if (n14 > (n10 = object.getBottom() - n16)) {
            n7 |= 8;
        }
        objectArray[n3] = n7;
        n10 = this.k;
        n14 = n17 << n3;
        this.k = n10 |= n14;
    }

    public final void j(MotionEvent motionEvent) {
        int n3 = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = motionEvent.getPointerId(i3);
            int n7 = this.k;
            float f5 = Float.MIN_VALUE;
            int n8 = 1 << n4;
            if ((n7 &= n8) == 0) continue;
            float f6 = motionEvent.getX(i3);
            f5 = motionEvent.getY(i3);
            float[] fArray = this.f;
            fArray[n4] = f6;
            float[] fArray2 = this.g;
            fArray2[n4] = f5;
        }
    }

    public final void k(int n3) {
        Object object = this.u;
        ViewGroup viewGroup = this.t;
        viewGroup.removeCallbacks((Runnable)object);
        int n4 = this.a;
        if (n4 != n3) {
            PlpBottomSheetBehavior plpBottomSheetBehavior;
            this.a = n3;
            object = (PlpBottomSheetBehavior$a)this.q;
            int n7 = 1;
            if (n3 == n7) {
                plpBottomSheetBehavior = ((PlpBottomSheetBehavior$a)object).a;
                plpBottomSheetBehavior.c(n7);
            } else {
                object.getClass();
            }
            n3 = this.a;
            if (n3 == 0) {
                n3 = 0;
                plpBottomSheetBehavior = null;
                this.r = null;
            }
        }
    }

    public final boolean l(int n3, View view) {
        int n4;
        Object object = this.r;
        int n7 = 1;
        if (view == object && (n4 = this.c) == n3) {
            return n7 != 0;
        }
        if (view != null) {
            View view2;
            int n8;
            object = ((PlpBottomSheetBehavior$a)this.q).a;
            int n10 = object.i;
            if (n10 != n7 && (n8 = object.t) == 0 && (n10 != (n8 = 3) || (n10 = object.r) != n3 || (view2 = (View)object.p.get()) == null || (n10 = (int)(view2.canScrollVertically(n8 = -1) ? 1 : 0)) == 0) && (object = object.o) != null && (object = object.get()) == view) {
                this.c = n3;
                this.b(n3, view);
                return n7 != 0;
            }
        }
        return false;
    }
}

