/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.graphics.drawable.shapes.OvalShape
 *  android.graphics.drawable.shapes.Shape
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.widget.ListView
 */
package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f;

public class SwipeRefreshLayout
extends ViewGroup
implements uU1 {
    public static final int[] M = new int[]{0x101000E};
    public final QU A;
    public zg3_0 B;
    public ah3_1 C;
    public bh3_2 D;
    public bh3_2 E;
    public ch3_1 F;
    public boolean G;
    public int H;
    public boolean I;
    public final SwipeRefreshLayout$a J;
    public final SwipeRefreshLayout$c K;
    public final SwipeRefreshLayout$d L;
    public View a;
    public SwipeRefreshLayout$f b;
    public boolean c = false;
    public final int d;
    public float e = -1.0f;
    public float f;
    public final yu1_0 g;
    public final vU1 h;
    public final int[] i;
    public final int[] j;
    public boolean k;
    public final int l;
    public int m;
    public float n;
    public float o;
    public boolean p;
    public int q;
    public boolean r;
    public final DecelerateInterpolator s;
    public final KU t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public int z;

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f5;
        int n3;
        int n4 = 2;
        Object object = new int[n4];
        this.i = object;
        Object object2 = new int[n4];
        this.j = object2;
        this.q = n4 = -1;
        this.u = n4;
        object2 = new SwipeRefreshLayout$a;
        super(this);
        this.J = object2;
        object2 = (Object)new SwipeRefreshLayout$c;
        super(this);
        this.K = (SwipeRefreshLayout$c)((Object)object2);
        object2 = (Object)new SwipeRefreshLayout$d;
        super(this);
        this.L = (SwipeRefreshLayout$d)((Object)object2);
        this.d = n4 = ViewConfiguration.get((Context)context).getScaledTouchSlop();
        this.l = n4 = this.getResources().getInteger(0x10E0001);
        this.setWillNotDraw(false);
        object2 = new DecelerateInterpolator;
        super(2.0f);
        this.s = (DecelerateInterpolator)object2;
        object2 = this.getResources().getDisplayMetrics();
        this.H = n3 = (int)(object2.density * 40.0f);
        object = (Object)new KU;
        Context context2 = this.getContext();
        super(context2);
        float f6 = object.getContext().getResources().getDisplayMetrics().density;
        Object object3 = new OvalShape();
        Object object4 = new ShapeDrawable((Shape)object3);
        object3 = ViewCompat.a;
        ViewCompat$c.m((View)object, f6 *= 4.0f);
        object4.getPaint().setColor(-328966);
        object.setBackground((Drawable)object4);
        this.t = (KU)((Object)object);
        object = (Object)new QU;
        context2 = this.getContext();
        super(context2);
        this.A = (QU)((Object)object);
        boolean bl2 = true;
        object.c((int)(bl2 ? 1 : 0));
        object = this.t;
        object4 = this.A;
        object.setImageDrawable((Drawable)object4);
        this.t.setVisibility(8);
        object = (Object)this.t;
        this.addView((View)object);
        this.setChildrenDrawingOrderEnabled(bl2);
        this.y = n4 = (int)(object2.density * 64.0f);
        this.e = f5 = (float)n4;
        object2 = new yu1_0;
        super();
        this.g = (yu1_0)object2;
        object2 = new vU1;
        super((View)this);
        this.h = (vU1)object2;
        this.setNestedScrollingEnabled(bl2);
        this.m = n4 = -this.H;
        this.x = n4;
        this.e(1.0f);
        object2 = M;
        context = context.obtainStyledAttributes(attributeSet, object2);
        boolean bl3 = context.getBoolean(0, bl2);
        this.setEnabled(bl3);
        context.recycle();
    }

    private void setColorViewAlpha(int n3) {
        this.t.getBackground().setAlpha(n3);
        this.A.setAlpha(n3);
    }

    public final boolean a() {
        View view = this.a;
        boolean bl2 = view instanceof ListView;
        int n3 = -1;
        if (bl2) {
            return ((ListView)view).canScrollList(n3);
        }
        return view.canScrollVertically(n3);
    }

    public final void b() {
        View view = this.a;
        if (view == null) {
            int n3;
            view = null;
            for (int i3 = 0; i3 < (n3 = this.getChildCount()); ++i3) {
                KU kU;
                View view2 = this.getChildAt(i3);
                boolean bl2 = view2.equals((Object)(kU = this.t));
                if (bl2) continue;
                this.a = view2;
                break;
            }
        }
    }

    public final void c(float f5) {
        float f6 = this.e;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
            f5 = Float.MIN_VALUE;
            this.g((boolean)object, (boolean)object);
        } else {
            object = false;
            f5 = 0.0f;
            this.c = false;
            Object object2 = this.A;
            Object object3 = object2.a;
            int n3 = 0;
            Object object4 = null;
            ((QU$a)object3).e = 0.0f;
            ((QU$a)object3).f = 0.0f;
            object2.invalidateSelf();
            boolean bl2 = this.r;
            object3 = !bl2 ? new SwipeRefreshLayout$b(this) : null;
            n3 = this.m;
            if (bl2) {
                this.v = n3;
                this.w = f6 = this.t.getScaleX();
                object2 = new ch3_1(this);
                this.F = object2;
                long l2 = 150L;
                object2.setDuration(l2);
                if (object3 != null) {
                    object2 = this.t;
                    ((KU)((Object)object2)).a = object3;
                }
                this.t.clearAnimation();
                object2 = this.t;
                object3 = this.F;
                object2.startAnimation((Animation)object3);
            } else {
                this.v = n3;
                object2 = this.L;
                object2.reset();
                long l3 = 200L;
                object2.setDuration(l3);
                object4 = this.s;
                object2.setInterpolator((Interpolator)object4);
                if (object3 != null) {
                    object4 = this.t;
                    object4.a = object3;
                }
                this.t.clearAnimation();
                object3 = this.t;
                object3.startAnimation((Animation)object2);
            }
            object2 = this.A;
            object3 = object2.a;
            n3 = (int)(((QU$a)object3).n ? 1 : 0);
            if (n3 != 0) {
                ((QU$a)object3).n = false;
            }
            object2.invalidateSelf();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(float f5) {
        QU qU;
        int n3;
        QU qU2 = this.A;
        QU$a qU$a = qU2.a;
        int n4 = qU$a.n;
        int n7 = 1;
        float f6 = Float.MIN_VALUE;
        if (n4 != n7) {
            qU$a.n = n7;
        }
        qU2.invalidateSelf();
        float f7 = this.e;
        f7 = Math.abs(f5 / f7);
        float f8 = 1.0f;
        f7 = Math.min(f8, f7);
        double d2 = (double)f7 - 0.4;
        double d5 = 0.0;
        d2 = Math.max(d2, d5);
        float f11 = (float)d2 * 5.0f;
        n7 = 0x40400000;
        f11 /= 3.0f;
        f6 = Math.abs(f5);
        float f12 = this.e;
        f6 -= f12;
        int n8 = this.z;
        if (n8 <= 0) {
            n8 = (int)(this.I ? 1 : 0);
            if (n8 != 0) {
                n8 = this.y;
                n3 = this.x;
                n8 -= n3;
            } else {
                n8 = this.y;
            }
        }
        f12 = n8;
        n3 = 0x40000000;
        float f14 = 2.0f;
        float f15 = f12 * f14;
        f6 = Math.min(f6, f15) / f12;
        f15 = 0.0f;
        f6 = Math.max(0.0f, f6);
        int n10 = 0x40800000;
        double d7 = f6 / 4.0f;
        long l2 = 0x4000000000000000L;
        double d9 = Math.pow(d7, 2.0);
        f6 = (float)(d7 -= d9) * f14;
        float f16 = f12 * f6 * f14;
        int n14 = this.x;
        f12 = f12 * f7 + f16;
        int n15 = (int)f12;
        n14 += n15;
        KU kU = this.t;
        n15 = kU.getVisibility();
        if (n15 != 0) {
            KU kU2 = this.t;
            n8 = 0;
            f12 = 0.0f;
            qU = null;
            kU2.setVisibility(0);
        }
        if ((n15 = (int)(this.r ? 1 : 0)) == 0) {
            this.t.setScaleX(f8);
            KU kU3 = this.t;
            kU3.setScaleY(f8);
        }
        if ((n15 = (int)(this.r ? 1 : 0)) != 0) {
            f7 = this.e;
            f7 = f5 / f7;
            f7 = Math.min(f8, f7);
            this.setAnimationProgress(f7);
        }
        f7 = this.e;
        n8 = 0;
        f12 = 0.0f;
        qU = null;
        l2 = 300L;
        d9 = 1.48E-321;
        Object object = f5 == f7 ? 0 : (f5 < f7 ? -1 : 1);
        if (object < 0) {
            boolean bl2;
            bh3_2 bh3_22;
            QU$a qU$a2 = this.A.a;
            int n16 = qU$a2.t;
            n15 = 76;
            f7 = 1.06E-43f;
            if (n16 > n15 && ((bh3_22 = this.D) == null || (n10 = (int)(bh3_22.hasStarted() ? 1 : 0)) == 0 || (bl2 = bh3_22.hasEnded()))) {
                int n17 = this.A.a.t;
                bh3_2 bh3_23 = new bh3_2(this, n17, n15);
                bh3_23.setDuration(l2);
                KU kU4 = this.t;
                kU4.a = null;
                kU4.clearAnimation();
                KU kU5 = this.t;
                kU5.startAnimation(bh3_23);
                this.D = bh3_23;
            }
        } else {
            boolean bl3;
            bh3_2 bh3_24;
            QU$a qU$a3 = this.A.a;
            int n18 = qU$a3.t;
            n15 = 255;
            f7 = 3.57E-43f;
            if (n18 < n15 && ((bh3_24 = this.E) == null || (n10 = (int)(bh3_24.hasStarted() ? 1 : 0)) == 0 || (bl3 = bh3_24.hasEnded()))) {
                int n19 = this.A.a.t;
                bh3_2 bh3_25 = new bh3_2(this, n19, n15);
                bh3_25.setDuration(l2);
                KU kU6 = this.t;
                kU6.a = null;
                kU6.clearAnimation();
                KU kU7 = this.t;
                kU7.startAnimation(bh3_25);
                this.E = bh3_25;
            }
        }
        int n20 = 1061997773;
        f5 = 0.8f;
        f7 = f11 * f5;
        qU = this.A;
        f5 = Math.min(f5, f7);
        QU$a qU$a4 = qU.a;
        qU$a4.e = 0.0f;
        qU$a4.f = f5;
        qU.invalidateSelf();
        QU qU3 = this.A;
        f7 = Math.min(f8, f11);
        qU$a = qU3.a;
        f12 = qU$a.p;
        n8 = (int)(f7 == f12 ? 0 : (f7 > f12 ? 1 : -1));
        if (n8 != 0) {
            qU$a.p = f7;
        }
        qU3.invalidateSelf();
        f11 = f11 * 0.4f + -0.25f;
        f6 = (f6 * f14 + f11) * 0.5f;
        QU qU4 = this.A;
        qU4.a.g = f6;
        qU4.invalidateSelf();
        int n21 = this.m;
        this.setTargetOffsetTopAndBottom(n14 -= n21);
    }

    public final boolean dispatchNestedFling(float f5, float f6, boolean bl2) {
        return this.h.a(f5, f6, bl2);
    }

    public final boolean dispatchNestedPreFling(float f5, float f6) {
        return this.h.b(f5, f6);
    }

    public final boolean dispatchNestedPreScroll(int n3, int n4, int[] nArray, int[] nArray2) {
        return this.h.c(n3, n4, nArray, nArray2, 0);
    }

    public final boolean dispatchNestedScroll(int n3, int n4, int n7, int n8, int[] nArray) {
        return this.h.e(n3, n4, n7, n8, nArray, 0, null);
    }

    public final void e(float f5) {
        int n3 = this.v;
        int n4 = (int)((float)(this.x - n3) * f5);
        n3 += n4;
        n4 = this.t.getTop();
        this.setTargetOffsetTopAndBottom(n3 -= n4);
    }

    public final void f() {
        this.t.clearAnimation();
        this.A.stop();
        KU kU = this.t;
        int n3 = 8;
        kU.setVisibility(n3);
        this.setColorViewAlpha(255);
        int n4 = this.r;
        if (n4 != 0) {
            n4 = 0;
            kU = null;
            this.setAnimationProgress(0.0f);
        } else {
            n4 = this.x;
            n3 = this.m;
            this.setTargetOffsetTopAndBottom(n4 -= n3);
        }
        this.m = n4 = this.t.getTop();
    }

    /*
     * WARNING - void declaration
     */
    public final void g(boolean bl2, boolean bl3) {
        boolean bl4 = this.c;
        if (bl4 != bl2) {
            void var2_3;
            this.G = var2_3;
            this.b();
            this.c = bl2;
            Object object = this.J;
            if (bl2) {
                int n3;
                this.v = n3 = this.m;
                SwipeRefreshLayout$c object3 = this.K;
                object3.reset();
                long l3 = 200L;
                object3.setDuration(l3);
                Object object2 = this.s;
                object3.setInterpolator((Interpolator)object2);
                if (object != null) {
                    object2 = this.t;
                    object2.a = object;
                }
                this.t.clearAnimation();
                object = this.t;
                object.startAnimation(object3);
            } else {
                Object object3;
                this.C = object3 = new ah3_1(this);
                long l2 = 150L;
                object3.setDuration(l2);
                object3 = this.t;
                ((KU)((Object)object3)).a = object;
                object3.clearAnimation();
                object3 = this.t;
                object = this.C;
                object3.startAnimation((Animation)object);
            }
        }
    }

    public final int getChildDrawingOrder(int n3, int n4) {
        int n7 = this.u;
        if (n7 < 0) {
            return n4;
        }
        if (n4 == (n3 += -1)) {
            return n7;
        }
        if (n4 >= n7) {
            ++n4;
        }
        return n4;
    }

    public int getNestedScrollAxes() {
        yu1_0 yu1_02 = this.g;
        int n3 = yu1_02.a;
        return yu1_02.b | n3;
    }

    public int getProgressCircleDiameter() {
        return this.H;
    }

    public int getProgressViewEndOffset() {
        return this.y;
    }

    public int getProgressViewStartOffset() {
        return this.x;
    }

    public final void h(float f5) {
        float f6 = this.o;
        int n3 = this.d;
        float f7 = n3;
        float f8 = (f5 -= f6) - f7;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object > 0 && (object = (Object)this.p) == false) {
            f5 = n3;
            this.n = f6 += f5;
            object = true;
            f5 = Float.MIN_VALUE;
            this.p = object;
            QU qU = this.A;
            int n4 = 76;
            f6 = 1.06E-43f;
            qU.setAlpha(n4);
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.h.g(0);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.h.d;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        block5: {
            block9: {
                float f5;
                int n3;
                int n4;
                block6: {
                    int n7;
                    block7: {
                        block8: {
                            this.b();
                            n4 = motionEvent.getActionMasked();
                            n3 = this.isEnabled();
                            int n8 = 0;
                            if (n3 == 0 || (n3 = this.a()) != 0 || (n3 = this.c) != 0 || (n3 = this.k) != 0) break block5;
                            if (n4 == 0) break block6;
                            n3 = 1;
                            n7 = -1;
                            if (n4 == n3) break block7;
                            int n10 = 2;
                            if (n4 == n10) break block8;
                            n10 = 3;
                            if (n4 == n10) break block7;
                            n7 = 6;
                            if (n4 == n7 && (n7 = motionEvent.getPointerId(n4 = motionEvent.getActionIndex())) == (n10 = this.q)) {
                                int n14;
                                if (n4 == 0) {
                                    n8 = 1;
                                }
                                this.q = n14 = motionEvent.getPointerId(n8);
                            }
                            break block9;
                        }
                        n4 = this.q;
                        if (n4 == n7) {
                            return false;
                        }
                        if ((n4 = motionEvent.findPointerIndex(n4)) < 0) {
                            return false;
                        }
                        float f6 = motionEvent.getY(n4);
                        this.h(f6);
                        break block9;
                    }
                    this.p = false;
                    this.q = n7;
                    break block9;
                }
                n4 = this.x;
                KU kU = this.t;
                n3 = kU.getTop();
                this.setTargetOffsetTopAndBottom(n4 -= n3);
                this.q = n4 = motionEvent.getPointerId(0);
                this.p = false;
                n4 = motionEvent.findPointerIndex(n4);
                if (n4 < 0) {
                    return false;
                }
                this.o = f5 = motionEvent.getY(n4);
            }
            return this.p;
        }
        return false;
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        int n10 = this.getMeasuredWidth();
        int n14 = this.getMeasuredHeight();
        int n15 = this.getChildCount();
        if (n15 == 0) {
            return;
        }
        View view = this.a;
        if (view == null) {
            this.b();
        }
        if ((view = this.a) == null) {
            return;
        }
        int n16 = this.getPaddingLeft();
        int n17 = this.getPaddingTop();
        int n18 = this.getPaddingLeft();
        n18 = n10 - n18;
        int n19 = this.getPaddingRight();
        n18 -= n19;
        n19 = this.getPaddingTop();
        n14 -= n19;
        n19 = this.getPaddingBottom();
        n14 -= n19;
        view.layout(n16, n17, n18 += n16, n14 += n17);
        n14 = this.t.getMeasuredWidth();
        n15 = this.t.getMeasuredHeight();
        KU kU = this.t;
        int n20 = n10 / 2;
        n17 = n20 - (n14 /= 2);
        n18 = this.m;
        int n21 = n20 + n14;
        kU.layout(n17, n18, n21, n15 += n18);
    }

    public final void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        Object object = this.a;
        if (object == null) {
            this.b();
        }
        if ((object = this.a) == null) {
            return;
        }
        n4 = this.getMeasuredWidth();
        int n7 = this.getPaddingLeft();
        n4 -= n7;
        n7 = this.getPaddingRight();
        n4 -= n7;
        n7 = 0x40000000;
        n4 = View.MeasureSpec.makeMeasureSpec((int)n4, (int)n7);
        int n8 = this.getMeasuredHeight();
        int n10 = this.getPaddingTop();
        n8 -= n10;
        n10 = this.getPaddingBottom();
        n8 = View.MeasureSpec.makeMeasureSpec((int)(n8 - n10), (int)n7);
        object.measure(n4, n8);
        object = this.t;
        n4 = View.MeasureSpec.makeMeasureSpec((int)this.H, (int)n7);
        n8 = this.H;
        n7 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)n7);
        object.measure(n4, n7);
        this.u = -1;
        object = null;
        for (n3 = 0; n3 < (n4 = this.getChildCount()); ++n3) {
            KU kU;
            View view = this.getChildAt(n3);
            if (view != (kU = this.t)) continue;
            this.u = n3;
            break;
        }
    }

    public final boolean onNestedFling(View view, float f5, float f6, boolean bl2) {
        return this.h.a(f5, f6, bl2);
    }

    public final boolean onNestedPreFling(View view, float f5, float f6) {
        return this.h.b(f5, f6);
    }

    public final void onNestedPreScroll(View object, int n3, int n4, int[] nArray) {
        float f5;
        int n7;
        float f6;
        float f7;
        float f8;
        int n8 = 0;
        object = null;
        int n10 = 1;
        if (n4 > 0 && (f8 = (f7 = (f6 = this.f) - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0) {
            float f11 = n4;
            float f12 = f11 - f6;
            Object object2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object2 > 0) {
                n7 = (int)f6;
                nArray[n10] = n7 = n4 - n7;
                this.f = 0.0f;
            } else {
                this.f = f6 -= f11;
                nArray[n10] = n4;
            }
            f6 = this.f;
            this.d(f6);
        }
        if ((n7 = this.I) != 0 && n4 > 0 && (n8 = (f5 = (f6 = this.f) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) == 0) {
            n8 = nArray[n10];
            if ((n8 = Math.abs(n4 - n8)) > 0) {
                object = this.t;
                n7 = 8;
                f6 = 1.1E-44f;
                object.setVisibility(n7);
            }
        }
        n8 = 0;
        object = null;
        n7 = nArray[0];
        n3 -= n7;
        n7 = nArray[n10];
        n4 -= n7;
        n7 = 0;
        f6 = 0.0f;
        int[] nArray2 = this.i;
        if ((n3 = (int)(this.dispatchNestedPreScroll(n3, n4, nArray2, null) ? 1 : 0)) != 0) {
            n3 = nArray[0];
            n4 = nArray2[0];
            nArray[0] = n3 += n4;
            n8 = nArray[n10];
            n3 = nArray2[n10];
            nArray[n10] = n8 += n3;
        }
    }

    public final void onNestedScroll(View object, int n3, int n4, int n7, int n8) {
        int[] nArray = this.j;
        this.dispatchNestedScroll(n3, n4, n7, n8, nArray);
        object = this.j;
        n3 = 1;
        float f5 = Float.MIN_VALUE;
        Object object2 = object[n3];
        if ((n8 += object2) < 0 && (object2 = (Object)this.a()) == false) {
            float f6 = this.f;
            n3 = Math.abs(n8);
            f5 = n3;
            this.f = f6 += f5;
            this.d(f6);
        }
    }

    public final void onNestedScrollAccepted(View view, View view2, int n3) {
        this.g.a = n3;
        int n4 = n3 & 2;
        this.startNestedScroll(n4);
        this.f = 0.0f;
        this.k = true;
    }

    public final boolean onStartNestedScroll(View view, View view2, int n3) {
        int n4 = this.isEnabled();
        n4 = n4 != 0 && (n4 = this.c) == 0 && (n4 = n3 & 2) != 0 ? 1 : 0;
        return n4 != 0;
    }

    public final void onStopNestedScroll(View object) {
        object = this.g;
        object.a = 0;
        this.k = false;
        float f5 = this.f;
        float f6 = f5 - 0.0f;
        Object object2 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            this.c(f5);
            this.f = 0.0f;
        }
        this.stopNestedScroll();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int n3 = motionEvent.getActionMasked();
        boolean bl2 = this.isEnabled();
        int n4 = 0;
        if (!bl2) return false;
        boolean bl3 = this.a();
        if (bl3) return false;
        boolean bl4 = this.c;
        if (bl4) return false;
        boolean bl5 = this.k;
        if (bl5) {
            return false;
        }
        int n7 = 1;
        if (n3 == 0) {
            int n8;
            this.q = n8 = motionEvent.getPointerId(0);
            this.p = false;
            return n7 != 0;
        }
        int n10 = 0x3F000000;
        float f5 = 0.5f;
        if (n3 != n7) {
            int n14 = 2;
            if (n3 != n14) {
                int n15;
                n10 = 3;
                f5 = 4.2E-45f;
                if (n3 == n10) return false;
                n10 = 5;
                f5 = 7.0E-45f;
                if (n3 != n10) {
                    int n16;
                    n10 = 6;
                    f5 = 8.4E-45f;
                    if (n3 != n10) {
                        return n7 != 0;
                    }
                    n3 = motionEvent.getActionIndex();
                    n10 = motionEvent.getPointerId(n3);
                    if (n10 != (n14 = this.q)) return n7 != 0;
                    if (n3 == 0) {
                        n4 = 1;
                    }
                    this.q = n16 = motionEvent.getPointerId(n4);
                    return n7 != 0;
                }
                n3 = motionEvent.getActionIndex();
                if (n3 < 0) {
                    return false;
                }
                this.q = n15 = motionEvent.getPointerId(n3);
                return n7 != 0;
            }
            n3 = this.q;
            if ((n3 = motionEvent.findPointerIndex(n3)) < 0) {
                return false;
            }
            float f6 = motionEvent.getY(n3);
            this.h(f6);
            n3 = (int)(this.p ? 1 : 0);
            if (n3 == 0) return n7 != 0;
            float f7 = this.n;
            f6 = (f6 - f7) * f5;
            f7 = 0.0f;
            float f8 = f6 - 0.0f;
            n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n3 <= 0) return false;
            this.d(f6);
            return n7 != 0;
        }
        n3 = this.q;
        if ((n3 = motionEvent.findPointerIndex(n3)) < 0) {
            return false;
        }
        boolean bl6 = this.p;
        if (bl6) {
            float f11 = motionEvent.getY(n3);
            float f12 = this.n;
            f11 = (f11 - f12) * f5;
            this.p = false;
            this.c(f11);
        }
        this.q = -1;
        return false;
    }

    public final void requestDisallowInterceptTouchEvent(boolean bl2) {
        block3: {
            block2: {
                View view = this.a;
                if (view == null) break block2;
                boolean bl3 = ViewCompat$c.j(view);
                if (!bl3) break block3;
            }
            super.requestDisallowInterceptTouchEvent(bl2);
        }
    }

    public void setAnimationProgress(float f5) {
        this.t.setScaleX(f5);
        this.t.setScaleY(f5);
    }

    public void setColorScheme(int ... nArray) {
        this.setColorSchemeResources(nArray);
    }

    public void setColorSchemeColors(int ... nArray) {
        this.b();
        QU qU = this.A;
        QU$a qU$a = qU.a;
        qU$a.i = nArray;
        qU$a.a(0);
        qU$a.a(0);
        qU.invalidateSelf();
    }

    public void setColorSchemeResources(int ... nArray) {
        int n3;
        Context context = this.getContext();
        int n4 = nArray.length;
        int[] nArray2 = new int[n4];
        for (int i3 = 0; i3 < (n3 = nArray.length); ++i3) {
            n3 = nArray[i3];
            nArray2[i3] = n3 = t70.getColor(context, n3);
        }
        this.setColorSchemeColors(nArray2);
    }

    public void setDistanceToTriggerSync(int n3) {
        float f5;
        this.e = f5 = (float)n3;
    }

    public void setEnabled(boolean bl2) {
        super.setEnabled(bl2);
        if (!bl2) {
            this.f();
        }
    }

    public void setNestedScrollingEnabled(boolean bl2) {
        this.h.h(bl2);
    }

    public void setOnChildScrollUpCallback(SwipeRefreshLayout$e swipeRefreshLayout$e) {
    }

    public void setOnRefreshListener(SwipeRefreshLayout$f swipeRefreshLayout$f) {
        this.b = swipeRefreshLayout$f;
    }

    public void setProgressBackgroundColor(int n3) {
        this.setProgressBackgroundColorSchemeResource(n3);
    }

    public void setProgressBackgroundColorSchemeColor(int n3) {
        this.t.setBackgroundColor(n3);
    }

    public void setProgressBackgroundColorSchemeResource(int n3) {
        n3 = t70.getColor(this.getContext(), n3);
        this.setProgressBackgroundColorSchemeColor(n3);
    }

    public void setProgressViewEndTarget(boolean bl2, int n3) {
        this.y = n3;
        this.r = bl2;
        this.t.invalidate();
    }

    public void setProgressViewOffset(boolean bl2, int n3, int n4) {
        this.r = bl2;
        this.x = n3;
        this.y = n4;
        this.I = true;
        this.f();
        this.c = false;
    }

    public void setRefreshing(boolean n3) {
        int n4;
        Object object = null;
        if (n3 && (n4 = this.c) != n3) {
            this.c = n3;
            n3 = this.I;
            if (!n3) {
                n3 = this.y;
                n4 = this.x;
                n3 += n4;
            } else {
                n3 = this.y;
            }
            n4 = this.m;
            this.setTargetOffsetTopAndBottom(n3 -= n4);
            this.G = false;
            Object object2 = this.J;
            KU kU = this.t;
            kU.setVisibility(0);
            this.A.setAlpha(255);
            this.B = object = new zg3_0(this);
            n4 = this.l;
            long l2 = n4;
            object.setDuration(l2);
            if (object2 != null) {
                object = this.t;
                ((KU)((Object)object)).a = object2;
            }
            this.t.clearAnimation();
            object2 = this.t;
            object = this.B;
            object2.startAnimation(object);
        } else {
            this.g(n3 != 0, false);
        }
    }

    public void setSize(int n3) {
        float f5;
        int n4;
        if (n3 != 0) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
            if (n3 != n4) {
                return;
            }
        }
        Object object = this.getResources().getDisplayMetrics();
        if (n3 == 0) {
            float f6 = 56.0f;
            f5 = object.density * f6;
            this.H = n4 = (int)f5;
        } else {
            float f7 = 40.0f;
            f5 = object.density * f7;
            this.H = n4 = (int)f5;
        }
        this.t.setImageDrawable(null);
        this.A.c(n3);
        KU kU = this.t;
        object = this.A;
        kU.setImageDrawable((Drawable)object);
    }

    public void setSlingshotDistance(int n3) {
        this.z = n3;
    }

    public void setTargetOffsetTopAndBottom(int n3) {
        this.t.bringToFront();
        KU kU = this.t;
        ViewCompat.m(n3, (View)kU);
        this.m = n3 = this.t.getTop();
    }

    public final boolean startNestedScroll(int n3) {
        return this.h.i(n3, 0);
    }

    public final void stopNestedScroll() {
        this.h.j(0);
    }
}

