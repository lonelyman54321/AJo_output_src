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
package androidx.customview.widget;

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
import androidx.customview.widget.ViewDragHelper$2;
import androidx.customview.widget.ViewDragHelper$a;
import androidx.customview.widget.ViewDragHelper$b;
import java.util.Arrays;

public final class ViewDragHelper {
    public static final ViewDragHelper$a x;
    public int a;
    public int b;
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
    public float n;
    public int o;
    public final int p;
    public int q;
    public final OverScroller r;
    public final ViewDragHelper$b s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public final Runnable w;

    static {
        ViewDragHelper$a viewDragHelper$a;
        x = viewDragHelper$a = new Object();
    }

    public ViewDragHelper(Context object, ViewGroup viewGroup, ViewDragHelper$b object2) {
        int n3;
        this.c = n3 = -1;
        ViewDragHelper$2 viewDragHelper$2 = new ViewDragHelper$2(this);
        this.w = viewDragHelper$2;
        if (viewGroup != null) {
            if (object2 != null) {
                float f5;
                float f6;
                int n4;
                this.v = viewGroup;
                this.s = object2;
                viewGroup = ViewConfiguration.get((Context)object);
                this.p = n4 = (int)(object.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
                this.o = n4;
                this.b = n4 = viewGroup.getScaledTouchSlop();
                this.m = f6 = (float)viewGroup.getScaledMaximumFlingVelocity();
                this.n = f5 = (float)viewGroup.getScaledMinimumFlingVelocity();
                object2 = x;
                super(object, (Interpolator)object2);
                this.r = viewGroup;
                return;
            }
            super("Callback may not be null");
            throw object;
        }
        super("Parent view may not be null");
        throw object;
    }

    public static ViewDragHelper i(ViewGroup viewGroup, float f5, ViewDragHelper$b viewDragHelper$b) {
        int n3;
        Context context = viewGroup.getContext();
        ViewDragHelper viewDragHelper = new ViewDragHelper(context, viewGroup, viewDragHelper$b);
        float f6 = viewDragHelper.b;
        viewDragHelper.b = n3 = (int)(1.0f / f5 * f6);
        return viewDragHelper;
    }

    public static boolean l(View view, int n3, int n4) {
        int n7;
        boolean bl2 = false;
        if (view == null) {
            return false;
        }
        int n8 = view.getLeft();
        if (n3 >= n8 && n3 < (n8 = view.getRight()) && n4 >= (n3 = view.getTop()) && n4 < (n7 = view.getBottom())) {
            bl2 = true;
        }
        return bl2;
    }

    public final void a() {
        this.b();
        int n3 = this.a;
        int n4 = 2;
        if (n3 == n4) {
            OverScroller overScroller = this.r;
            n4 = overScroller.getCurrX();
            int n7 = overScroller.getCurrY();
            overScroller.abortAnimation();
            int n8 = overScroller.getCurrX();
            int n10 = overScroller.getCurrY();
            View view = this.t;
            int n14 = n8 - n4;
            int n15 = n10 - n7;
            ViewDragHelper$b viewDragHelper$b = this.s;
            viewDragHelper$b.onViewPositionChanged(view, n8, n10, n14, n15);
        }
        this.r(0);
    }

    public final void b() {
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

    public final void c(int n3, View object) {
        ViewGroup viewGroup;
        ViewParent viewParent = object.getParent();
        if (viewParent == (viewGroup = this.v)) {
            this.t = object;
            this.c = n3;
            this.s.onViewCaptured((View)object, n3);
            this.r(1);
            return;
        }
        object = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        ((StringBuilder)object).append(viewGroup);
        ((StringBuilder)object).append(")");
        object = ((StringBuilder)object).toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final boolean d(float f5, float f6, int n3, int n4) {
        float f7;
        float f8;
        float f11;
        f5 = Math.abs(f5);
        f6 = Math.abs(f6);
        int[] nArray = this.h;
        int n7 = nArray[n3] & n4;
        boolean bl2 = false;
        if (n7 == n4 && (n7 = this.q & n4) != 0 && (n7 = (nArray = this.j)[n3] & n4) != n4 && (n7 = (nArray = this.i)[n3] & n4) != n4 && ((f11 = (f8 = f5 - (f7 = (float)(n7 = this.b))) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) > 0 || (n7 = (int)(f6 == f7 ? 0 : (f6 < f7 ? -1 : 1))) > 0)) {
            float f12;
            float f14;
            Object object;
            n7 = 0x3F000000;
            f7 = 0.5f;
            float f15 = f5 - (f6 *= f7);
            Object object2 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
            if (object2 < 0 && (object2 = (Object)((ViewDragHelper$b)(object = this.s)).onEdgeLock(n4)) != false) {
                int[] nArray2 = this.j;
                object2 = nArray2[n3] | n4;
                nArray2[n3] = (int)object2;
                return false;
            }
            object = this.i;
            object2 = object[n3] & n4;
            if (object2 == false && (f14 = (f12 = f5 - (f6 = (float)(object2 = (Object)this.b))) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) > 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean e(float f5, float f6, View view) {
        int n3;
        float f7;
        float f8;
        boolean bl2 = false;
        if (view == null) {
            return false;
        }
        ViewDragHelper$b viewDragHelper$b = this.s;
        int n4 = viewDragHelper$b.getViewHorizontalDragRange(view);
        n4 = n4 > 0 ? 1 : 0;
        int n7 = viewDragHelper$b.getViewVerticalDragRange(view);
        if (n7 > 0) {
            n7 = 1;
        } else {
            n7 = 0;
            view = null;
        }
        if (n4 != 0 && n7 != 0) {
            f5 *= f5;
            f6 = f6 * f6 + f5;
            int n8 = this.b;
            f5 = n8 * n8;
            float f11 = f6 - f5;
            if ((n8 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1))) > 0) {
                bl2 = true;
            }
            return bl2;
        }
        if (n4 != 0) {
            int n10;
            float f12 = (f5 = Math.abs(f5)) - (f6 = (float)(n10 = this.b));
            Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object > 0) {
                bl2 = true;
            }
            return bl2;
        }
        if (n7 != 0 && (f8 = (f7 = (f5 = Math.abs(f6)) - (f6 = (float)(n3 = this.b))) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final void f(int n3) {
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

    public final int g(int n3, int n4, int n7) {
        if (n3 == 0) {
            return 0;
        }
        ViewGroup viewGroup = this.v;
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
        if ((n4 = Math.abs(n4)) > 0) {
            float f11 = n4;
            f5 /= f11;
            f11 = Math.abs(f5);
            n4 = 1148846080;
            float f12 = 1000.0f;
            n3 = Math.round(f11 *= f12) * 4;
        } else {
            float f14 = Math.abs(n3);
            float f15 = n7;
            f14 = f14 / f15 + f6;
            n4 = 1132462080;
            f15 = 256.0f;
            n3 = (int)(f14 *= f15);
        }
        return Math.min(n3, 600);
    }

    public final boolean h() {
        int n3 = this.a;
        boolean bl2 = false;
        int n4 = 2;
        if (n3 == n4) {
            ViewGroup viewGroup;
            Object object = this.r;
            boolean bl3 = object.computeScrollOffset();
            int n7 = object.getCurrX();
            int n8 = object.getCurrY();
            int n10 = this.t.getLeft();
            int n14 = n7 - n10;
            Object object2 = this.t;
            n10 = object2.getTop();
            int n15 = n8 - n10;
            if (n14 != 0) {
                object2 = this.t;
                ViewCompat.l(n14, (View)object2);
            }
            if (n15 != 0) {
                object2 = this.t;
                ViewCompat.m(n15, (View)object2);
            }
            if (n14 != 0 || n15 != 0) {
                object2 = this.s;
                View view = this.t;
                ((ViewDragHelper$b)object2).onViewPositionChanged(view, n7, n8, n14, n15);
            }
            if (bl3 && n7 == (n10 = object.getFinalX()) && n8 == (n10 = object.getFinalY())) {
                object.abortAnimation();
                bl3 = false;
                viewGroup = null;
            }
            if (!bl3) {
                object = this.w;
                viewGroup = this.v;
                viewGroup.post((Runnable)object);
            }
        }
        if ((n3 = this.a) == n4) {
            bl2 = true;
        }
        return bl2;
    }

    public final View j(int n3, int n4) {
        ViewGroup viewGroup = this.v;
        for (int i3 = viewGroup.getChildCount() + -1; i3 >= 0; i3 += -1) {
            int n7 = this.s.getOrderedChildIndex(i3);
            View view = viewGroup.getChildAt(n7);
            int n8 = view.getLeft();
            if (n3 < n8 || n3 >= (n8 = view.getRight()) || n4 < (n8 = view.getTop()) || n4 >= (n8 = view.getBottom())) continue;
            return view;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean k(int n3, int n4, int n7, int n8) {
        float f5;
        int n10 = this.t.getLeft();
        View view = this.t;
        int n14 = view.getTop();
        int n15 = n3 - n10;
        int n16 = n4 - n14;
        OverScroller overScroller = this.r;
        n3 = 0;
        float f6 = 0.0f;
        if (n15 == 0 && n16 == 0) {
            overScroller.abortAnimation();
            this.r(0);
            return false;
        }
        View view2 = this.t;
        float f7 = this.n;
        int n17 = (int)f7;
        float f8 = this.m;
        int n18 = (int)f8;
        int n19 = Math.abs(n7);
        if (n19 < n17) {
            n7 = 0;
            f5 = 0.0f;
        } else if (n19 > n18) {
            n7 = n7 > 0 ? n18 : -n18;
        }
        f7 = this.n;
        n17 = (int)f7;
        n19 = Math.abs(n8);
        if (n19 < n17) {
            n8 = 0;
        } else if (n19 > n18) {
            n8 = n8 > 0 ? n18 : (n3 = -n18);
        }
        n3 = Math.abs(n15);
        n17 = Math.abs(n16);
        n18 = Math.abs(n7);
        n19 = Math.abs(n8);
        int n20 = n18 + n19;
        int n21 = n3 + n17;
        if (n7 != 0) {
            f6 = n18;
            f8 = n20;
        } else {
            f6 = n3;
            f8 = n21;
        }
        f6 /= f8;
        if (n8 != 0) {
            f7 = n19;
            f8 = n20;
        } else {
            f7 = n17;
            f8 = n21;
        }
        f7 /= f8;
        ViewDragHelper$b viewDragHelper$b = this.s;
        n19 = viewDragHelper$b.getViewHorizontalDragRange(view2);
        n7 = this.g(n15, n7, n19);
        n4 = viewDragHelper$b.getViewVerticalDragRange(view2);
        n4 = this.g(n16, n8, n4);
        f5 = (float)n7 * f6;
        n18 = (int)((float)n4 * f7 + f5);
        overScroller.startScroll(n10, n14, n15, n16, n18);
        this.r(2);
        return true;
    }

    public final void m(MotionEvent motionEvent) {
        Object object;
        ViewDragHelper viewDragHelper = this;
        Object object2 = motionEvent;
        int n3 = motionEvent.getActionMasked();
        int n4 = motionEvent.getActionIndex();
        if (n3 == 0) {
            this.b();
        }
        if ((object = viewDragHelper.l) == null) {
            viewDragHelper.l = object = VelocityTracker.obtain();
        }
        viewDragHelper.l.addMovement(object2);
        int n7 = 0;
        float f5 = 0.0f;
        object = null;
        ViewDragHelper$b viewDragHelper$b = viewDragHelper.s;
        if (n3 != 0) {
            int n8 = 1;
            if (n3 != n8) {
                int n10 = 2;
                float f6 = 2.8E-45f;
                if (n3 != n10) {
                    n10 = 3;
                    f6 = 4.2E-45f;
                    if (n3 != n10) {
                        n10 = 5;
                        f6 = 7.0E-45f;
                        if (n3 != n10) {
                            int n14 = 6;
                            if (n3 == n14) {
                                n3 = object2.getPointerId(n4);
                                n4 = viewDragHelper.a;
                                if (n4 == n8 && n3 == (n4 = viewDragHelper.c)) {
                                    int n15;
                                    block35: {
                                        n4 = motionEvent.getPointerCount();
                                        while (true) {
                                            View view;
                                            float f7;
                                            int n16;
                                            View view2;
                                            n14 = -1;
                                            if (n7 >= n4) break;
                                            n8 = object2.getPointerId(n7);
                                            if (n8 != (n10 = viewDragHelper.c) && (view2 = viewDragHelper.j(n10 = (int)(f6 = object2.getX(n7)), n16 = (int)(f7 = object2.getY(n7)))) == (view = viewDragHelper.t) && (n8 = (int)(viewDragHelper.v(n8, view) ? 1 : 0)) != 0) {
                                                n15 = viewDragHelper.c;
                                                break block35;
                                            }
                                            ++n7;
                                        }
                                        n15 = -1;
                                        float f8 = 0.0f / 0.0f;
                                    }
                                    if (n15 == n14) {
                                        this.n();
                                    }
                                }
                                viewDragHelper.f(n3);
                            }
                        } else {
                            n3 = object2.getPointerId(n4);
                            f5 = object2.getX(n4);
                            float f11 = object2.getY(n4);
                            viewDragHelper.p(f5, f11, n3);
                            n4 = viewDragHelper.a;
                            if (n4 == 0) {
                                n4 = (int)f5;
                                Object object3 = (int)f11;
                                object2 = viewDragHelper.j(n4, (int)object3);
                                viewDragHelper.v(n3, (View)object2);
                                object2 = viewDragHelper.h;
                                object3 = object2[n3];
                                n4 = viewDragHelper.q;
                                if ((object3 &= n4) != 0) {
                                    viewDragHelper$b.onEdgeTouched((int)object3, n3);
                                }
                            } else {
                                n4 = (int)f5;
                                int n17 = (int)f11;
                                object = viewDragHelper.t;
                                if ((n17 = (int)(ViewDragHelper.l((View)object, n4, n17) ? 1 : 0)) != 0) {
                                    object2 = viewDragHelper.t;
                                    viewDragHelper.v(n3, (View)object2);
                                }
                            }
                        }
                    } else {
                        int n18 = viewDragHelper.a;
                        if (n18 == n8) {
                            viewDragHelper.u = n8;
                            object2 = viewDragHelper.t;
                            n3 = 0;
                            float f12 = 0.0f;
                            Object var21_38 = null;
                            viewDragHelper$b.onViewReleased((View)object2, 0.0f, 0.0f);
                            viewDragHelper.u = false;
                            n18 = viewDragHelper.a;
                            if (n18 == n8) {
                                viewDragHelper.r(0);
                            }
                        }
                        this.b();
                    }
                } else {
                    n3 = viewDragHelper.a;
                    if (n3 == n8) {
                        n3 = viewDragHelper.c;
                        n4 = viewDragHelper.k;
                        n10 = n8 << n3;
                        if ((n4 &= n10) != 0) {
                            n7 = 1;
                            f5 = Float.MIN_VALUE;
                        }
                        if (n7 != 0) {
                            n3 = object2.findPointerIndex(n3);
                            float f14 = object2.getX(n3);
                            float f15 = object2.getY(n3);
                            object = viewDragHelper.f;
                            n8 = viewDragHelper.c;
                            f5 = (float)object[n8];
                            n4 = (int)(f14 -= f5);
                            f5 = viewDragHelper.g[n8];
                            n3 = (int)(f15 -= f5);
                            object = viewDragHelper.t;
                            n7 = object.getLeft() + n4;
                            View view = viewDragHelper.t;
                            n8 = view.getTop() + n3;
                            View view3 = viewDragHelper.t;
                            n10 = view3.getLeft();
                            View view4 = viewDragHelper.t;
                            int n19 = view4.getTop();
                            if (n4 != 0) {
                                View view5 = viewDragHelper.t;
                                n7 = viewDragHelper$b.clampViewPositionHorizontal(view5, n7, n4);
                                view5 = viewDragHelper.t;
                                int n20 = n7 - n10;
                                ViewCompat.l(n20, view5);
                            }
                            int n21 = n7;
                            if (n3 != 0) {
                                object = viewDragHelper.t;
                                n8 = viewDragHelper$b.clampViewPositionVertical((View)object, n8, n3);
                                object = viewDragHelper.t;
                                int n22 = n8 - n19;
                                ViewCompat.m(n22, (View)object);
                            }
                            int n24 = n8;
                            if (n4 != 0 || n3 != 0) {
                                int n25 = n21 - n10;
                                int n26 = n24 - n19;
                                ViewDragHelper$b viewDragHelper$b2 = viewDragHelper.s;
                                View view6 = viewDragHelper.t;
                                viewDragHelper$b2.onViewPositionChanged(view6, n21, n24, n25, n26);
                            }
                            this.q(motionEvent);
                        }
                    } else {
                        n3 = motionEvent.getPointerCount();
                        float f16 = 0.0f;
                        for (n4 = 0; n4 < n3; ++n4) {
                            View view;
                            int n27 = object2.getPointerId(n4);
                            n10 = viewDragHelper.k;
                            int n28 = n8 << n27;
                            if ((n10 &= n28) != 0) {
                                n10 = 1;
                                f6 = Float.MIN_VALUE;
                            } else {
                                n10 = 0;
                                f6 = 0.0f;
                                view = null;
                            }
                            if (n10 == 0) continue;
                            f6 = object2.getX(n4);
                            float f17 = object2.getY(n4);
                            float[] fArray = viewDragHelper.d;
                            float f18 = fArray[n27];
                            f18 = f6 - f18;
                            float[] fArray2 = viewDragHelper.e;
                            float f19 = fArray2[n27];
                            f19 = f17 - f19;
                            viewDragHelper.o(f18, f19, n27);
                            int n29 = viewDragHelper.a;
                            if (n29 == n8) break;
                            n10 = (int)f6;
                            n28 = (int)f17;
                            view = viewDragHelper.j(n10, n28);
                            if ((n28 = (int)(viewDragHelper.e(f18, f19, view) ? 1 : 0)) != 0 && (n27 = (int)(viewDragHelper.v(n27, view) ? 1 : 0)) != 0) break;
                        }
                        this.q(motionEvent);
                    }
                }
            } else {
                int n30 = viewDragHelper.a;
                if (n30 == n8) {
                    this.n();
                }
                this.b();
            }
        } else {
            float f20 = motionEvent.getX();
            float f22 = motionEvent.getY();
            int n32 = object2.getPointerId(0);
            n7 = (int)f20;
            int n34 = (int)f22;
            object = viewDragHelper.j(n7, n34);
            viewDragHelper.p(f20, f22, n32);
            viewDragHelper.v(n32, (View)object);
            int[] nArray = viewDragHelper.h;
            n3 = nArray[n32];
            n4 = viewDragHelper.q;
            if ((n3 &= n4) != 0) {
                viewDragHelper$b.onEdgeTouched(n3, n32);
            }
        }
    }

    public final void n() {
        Object object;
        VelocityTracker velocityTracker = this.l;
        float f5 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f5);
        velocityTracker = this.l;
        int n3 = this.c;
        float f6 = velocityTracker.getXVelocity(n3);
        float f7 = this.n;
        float f8 = Math.abs(f6);
        float f11 = 0.0f;
        n3 = (int)(f8 == f7 ? 0 : (f8 < f7 ? -1 : 1));
        if (n3 < 0) {
            object = 0;
            f6 = 0.0f;
            velocityTracker = null;
        } else {
            n3 = (int)(f8 == f5 ? 0 : (f8 > f5 ? 1 : -1));
            if (n3 > 0) {
                float f12 = f6 - 0.0f;
                object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                f6 = object > 0 ? f5 : -f5;
            }
        }
        Object object2 = this.l;
        int n4 = this.c;
        f7 = object2.getYVelocity(n4);
        f8 = this.n;
        float f14 = Math.abs(f7);
        n4 = (int)(f14 == f8 ? 0 : (f14 < f8 ? -1 : 1));
        if (n4 >= 0) {
            n4 = (int)(f14 == f5 ? 0 : (f14 > f5 ? 1 : -1));
            if (n4 > 0) {
                float f15 = f7 - 0.0f;
                n3 = (int)(f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1));
                if (n3 <= 0) {
                    f5 = -f5;
                }
                f11 = f5;
            } else {
                f11 = f7;
            }
        }
        int n7 = 1;
        f5 = Float.MIN_VALUE;
        this.u = n7;
        object2 = this.s;
        View view = this.t;
        ((ViewDragHelper$b)object2).onViewReleased(view, f6, f11);
        object = 0;
        f6 = 0.0f;
        velocityTracker = null;
        this.u = false;
        n3 = this.a;
        if (n3 == n7) {
            this.r(0);
        }
    }

    public final void o(float f5, float f6, int n3) {
        int n4;
        boolean bl2;
        int n7;
        int n8;
        int n42 = this.d(f5, f6, n3, 1);
        int n10 = this.d(f6, f5, n3, 4);
        if (n10 != 0) {
            n8 = n42 | 4;
        }
        if ((n10 = this.d(f5, f6, n3, 2)) != 0) {
            n7 = n8 | 2;
        }
        if (bl2 = this.d(f6, f5, n3, n10 = 8)) {
            n4 = n7 | 8;
        }
        if (n4 != 0) {
            int n14;
            Object object = this.i;
            object[n3] = n14 = object[n3] | n4;
            object = this.s;
            ((ViewDragHelper$b)object).onEdgeDragStarted(n4, n3);
        }
    }

    public final void p(float f5, float f6, int n3) {
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
        object = this.v;
        int n15 = object.getLeft();
        int n16 = this.o;
        n15 += n16;
        n16 = 1;
        if (n10 < n15) {
            n7 = 1;
        }
        n15 = object.getTop();
        int n17 = this.o;
        if (n14 < (n15 += n17)) {
            n7 |= 4;
        }
        n15 = object.getRight();
        n17 = this.o;
        if (n10 > (n15 -= n17)) {
            n7 |= 2;
        }
        n10 = object.getBottom();
        n4 = this.o;
        if (n14 > (n10 -= n4)) {
            n7 |= 8;
        }
        objectArray[n3] = n7;
        n10 = this.k;
        n14 = n16 << n3;
        this.k = n10 |= n14;
    }

    public final void q(MotionEvent motionEvent) {
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

    public final void r(int n3) {
        Object object = this.w;
        ViewGroup viewGroup = this.v;
        viewGroup.removeCallbacks((Runnable)object);
        int n4 = this.a;
        if (n4 != n3) {
            this.a = n3;
            object = this.s;
            ((ViewDragHelper$b)object).onViewDragStateChanged(n3);
            n3 = this.a;
            if (n3 == 0) {
                n3 = 0;
                this.t = null;
            }
        }
    }

    public final boolean s(int n3, int n4) {
        int n7 = this.u;
        if (n7 != 0) {
            VelocityTracker velocityTracker = this.l;
            int n8 = this.c;
            n7 = (int)velocityTracker.getXVelocity(n8);
            VelocityTracker velocityTracker2 = this.l;
            int n10 = this.c;
            n8 = (int)velocityTracker2.getYVelocity(n10);
            return this.k(n3, n4, n7, n8);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        throw illegalStateException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean t(MotionEvent var1_1) {
        block11: {
            block12: {
                block13: {
                    block14: {
                        block17: {
                            block15: {
                                block16: {
                                    var2_2 = this;
                                    var3_3 /* !! */  = var1_1;
                                    var4_4 /* !! */  = var1_1.getActionMasked();
                                    var5_5 = var1_1.getActionIndex();
                                    if (var4_4 /* !! */  == 0) {
                                        this.b();
                                    }
                                    if ((var6_6 = var2_2.l) == null) {
                                        var2_2.l = var6_6 = VelocityTracker.obtain();
                                    }
                                    var6_6 = var2_2.l;
                                    var6_6.addMovement(var3_3 /* !! */ );
                                    var7_7 = 1;
                                    var8_8 = 2;
                                    var9_9 = var2_2.s;
                                    if (var4_4 /* !! */  == 0) break block12;
                                    if (var4_4 /* !! */  == var7_7) break block13;
                                    if (var4_4 /* !! */  == var8_8) break block14;
                                    var10_10 = 3;
                                    var11_12 = 4.2E-45f;
                                    if (var4_4 /* !! */  == var10_10) break block13;
                                    var10_10 = 5;
                                    var11_12 = 7.0E-45f;
                                    if (var4_4 /* !! */  == var10_10) break block15;
                                    var8_8 = 6;
                                    if (var4_4 /* !! */  == var8_8) break block16;
lbl25:
                                    // 7 sources

                                    while (true) {
                                        var12_14 = 0;
                                        break block11;
                                        break;
                                    }
                                }
                                var13_16 /* !! */  = var3_3 /* !! */ .getPointerId(var5_5);
                                var2_2.f(var13_16 /* !! */ );
                                ** GOTO lbl25
                            }
                            var4_4 /* !! */  = var3_3 /* !! */ .getPointerId(var5_5);
                            var11_12 = var3_3 /* !! */ .getX(var5_5);
                            var14_17 = var3_3 /* !! */ .getY(var5_5);
                            var2_2.p(var11_12, var14_17, var4_4 /* !! */ );
                            var5_5 = var2_2.a;
                            if (var5_5 != 0) break block17;
                            var3_3 /* !! */  = (MotionEvent)var2_2.h;
                            var13_16 /* !! */  = (int)var3_3 /* !! */ [var4_4 /* !! */ ];
                            var5_5 = var2_2.q;
                            if ((var13_16 /* !! */  &= var5_5) != 0) {
                                var9_9.onEdgeTouched(var13_16 /* !! */ , var4_4 /* !! */ );
                            }
                            ** GOTO lbl25
                        }
                        if (var5_5 != var8_8 || (var3_3 /* !! */  = var2_2.j(var5_5 = (int)var11_12, var13_16 /* !! */  = (int)var14_17)) != (var15_18 = var2_2.t)) ** GOTO lbl25
                        var2_2.v(var4_4 /* !! */ , (View)var3_3 /* !! */ );
                        ** GOTO lbl25
                    }
                    var16_21 = var2_2.d;
                    if (var16_21 == null || (var16_21 = var2_2.e) == null) ** GOTO lbl25
                    var4_4 /* !! */  = var1_1.getPointerCount();
                    var17_23 = 0.0f;
                    var15_19 = null;
                    for (var5_5 = 0; var5_5 < var4_4 /* !! */ ; ++var5_5) {
                        var8_8 = var3_3 /* !! */ .getPointerId(var5_5);
                        var10_11 = var2_2.k;
                        var18_25 = var7_7 << var8_8;
                        if ((var10_11 &= var18_25) == 0) continue;
                        var11_13 = var3_3 /* !! */ .getX(var5_5);
                        var19_26 = var3_3 /* !! */ .getY(var5_5);
                        var20_27 = var2_2.d;
                        var21_28 = var20_27[var8_8];
                        var21_28 = var11_13 - var21_28;
                        var22_29 = var2_2.e;
                        var23_30 = var22_29[var8_8];
                        var23_30 = var19_26 - var23_30;
                        var10_11 = (int)var11_13;
                        var18_25 = (int)var19_26;
                        var24_31 = var2_2.j(var10_11, var18_25);
                        if (var24_31 != null && (var18_25 = (int)var2_2.e(var21_28, var23_30, var24_31)) != 0) {
                            var18_25 = 1;
                            var19_26 = 1.4E-45f;
                        } else {
                            var18_25 = 0;
                            var19_26 = 0.0f;
                        }
                        if (var18_25 != 0) {
                            var25_32 = var24_31.getLeft();
                            var26_33 = (int)var21_28;
                            var27_34 = var25_32 + var26_33;
                            var26_33 = var9_9.clampViewPositionHorizontal(var24_31, var27_34, var26_33);
                            var27_34 = var24_31.getTop();
                            var28_35 = (int)var23_30;
                            var12_14 = var27_34 + var28_35;
                            var12_14 = var9_9.clampViewPositionVertical(var24_31, var12_14, var28_35);
                            var28_35 = var9_9.getViewHorizontalDragRange(var24_31);
                            var29_36 = var9_9.getViewVerticalDragRange(var24_31);
                            if ((var28_35 == 0 || var28_35 > 0 && var26_33 == var25_32) && (var29_36 == 0 || var29_36 > 0 && var12_14 == var27_34)) break;
                        }
                        var2_2.o(var21_28, var23_30, var8_8);
                        var12_14 = var2_2.a;
                        if (var12_14 == var7_7 || var18_25 != 0 && (var8_8 = (int)var2_2.v(var8_8, var24_31)) != 0) break;
                    }
                    this.q(var1_1);
                    ** GOTO lbl25
                }
                this.b();
                ** while (true)
            }
            var30_37 = var1_1.getX();
            var17_24 = var1_1.getY();
            var12_15 = false;
            var13_16 /* !! */  = var3_3 /* !! */ .getPointerId(0);
            var2_2.p(var30_37, var17_24, var13_16 /* !! */ );
            var4_4 /* !! */  = (int)var30_37;
            var5_5 = (int)var17_24;
            var16_22 /* !! */  = var2_2.j(var4_4 /* !! */ , var5_5);
            var15_20 = var2_2.t;
            if (var16_22 /* !! */  == var15_20 && (var5_5 = var2_2.a) == var8_8) {
                var2_2.v(var13_16 /* !! */ , var16_22 /* !! */ );
            }
            var16_22 /* !! */  = (View)var2_2.h;
            var4_4 /* !! */  = (int)var16_22 /* !! */ [var13_16 /* !! */ ];
            var5_5 = var2_2.q;
            if ((var4_4 /* !! */  &= var5_5) != 0) {
                var9_9.onEdgeTouched(var4_4 /* !! */ , var13_16 /* !! */ );
            }
        }
        var13_16 /* !! */  = var2_2.a;
        if (var13_16 /* !! */  != var7_7) {
            var7_7 = 0;
            var6_6 = null;
        }
        return (boolean)var7_7;
    }

    public final boolean u(View view, int n3, int n4) {
        View view2;
        this.t = view;
        this.c = -1;
        view = null;
        boolean bl2 = this.k(n3, n4, 0, 0);
        if (!bl2 && (n3 = this.a) == 0 && (view2 = this.t) != null) {
            n3 = 0;
            view2 = null;
            this.t = null;
        }
        return bl2;
    }

    public final boolean v(int n3, View view) {
        int n4;
        Object object = this.t;
        boolean bl2 = true;
        if (view == object && (n4 = this.c) == n3) {
            return bl2;
        }
        if (view != null && (n4 = (int)(((ViewDragHelper$b)(object = this.s)).tryCaptureView(view, n3) ? 1 : 0)) != 0) {
            this.c = n3;
            this.c(n3, view);
            return bl2;
        }
        return false;
    }
}

