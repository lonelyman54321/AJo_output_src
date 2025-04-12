/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.Gravity
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 */
package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.y;
import androidx.viewpager2.R$styleable;
import androidx.viewpager2.widget.ViewPager2$SavedState;
import androidx.viewpager2.widget.ViewPager2$SmoothScrollToPosition;
import androidx.viewpager2.widget.ViewPager2$a;
import androidx.viewpager2.widget.ViewPager2$b;
import androidx.viewpager2.widget.ViewPager2$c;
import androidx.viewpager2.widget.ViewPager2$f;
import androidx.viewpager2.widget.ViewPager2$g;
import androidx.viewpager2.widget.ViewPager2$h;
import androidx.viewpager2.widget.ViewPager2$i;
import androidx.viewpager2.widget.ViewPager2$j;
import androidx.viewpager2.widget.ViewPager2$k;
import androidx.viewpager2.widget.a;
import androidx.viewpager2.widget.c;
import androidx.viewpager2.widget.d;
import androidx.viewpager2.widget.d$a;

public final class ViewPager2
extends ViewGroup {
    public final Rect a;
    public final Rect b;
    public final a c;
    public int d;
    public boolean e;
    public final ViewPager2$a f;
    public ViewPager2$f g;
    public int h;
    public Parcelable i;
    public ViewPager2$k j;
    public ViewPager2$j k;
    public d l;
    public a m;
    public TI0 n;
    public c o;
    public RecyclerView$l p;
    public boolean q;
    public boolean r;
    public int s;
    public ViewPager2$h t;

    public ViewPager2(Context context) {
        super(context);
        int n3;
        ViewPager2$a viewPager2$a;
        Object object;
        this.a = object = new Rect();
        this.b = object = new Rect();
        super();
        this.c = object;
        this.e = false;
        this.f = viewPager2$a = new ViewPager2$a(this);
        this.h = n3 = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = n3;
        this.d(context, null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        ViewPager2$a viewPager2$a;
        Object object;
        this.a = object = new Rect();
        this.b = object = new Rect();
        super();
        this.c = object;
        this.e = false;
        this.f = viewPager2$a = new ViewPager2$a(this);
        this.h = n3 = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = n3;
        this.d(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        ViewPager2$a viewPager2$a;
        Object object;
        this.a = object = new Rect();
        this.b = object = new Rect();
        super();
        this.c = object;
        this.e = false;
        this.f = viewPager2$a = new ViewPager2$a(this);
        this.h = n4 = -1;
        this.p = null;
        this.q = false;
        this.r = true;
        this.s = n4;
        this.d(context, attributeSet);
    }

    public final boolean a() {
        VelocityTracker velocityTracker;
        float f5;
        TI0 tI0 = this.n;
        Object object = tI0.b;
        int n3 = ((d)object).f;
        boolean bl2 = false;
        int n4 = 1;
        if (n3 == n4) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            velocityTracker = null;
        }
        if (n3 == 0) {
            long l2;
            tI0.g = 0;
            tI0.f = f5 = 0.0f;
            tI0.h = l2 = SystemClock.uptimeMillis();
            velocityTracker = tI0.d;
            if (velocityTracker == null) {
                tI0.d = velocityTracker = VelocityTracker.obtain();
                velocityTracker = ViewConfiguration.get((Context)tI0.a.getContext());
                tI0.e = n3 = velocityTracker.getScaledMaximumFlingVelocity();
            } else {
                velocityTracker.clear();
            }
            n3 = 4;
            f5 = 5.6E-45f;
            ((d)object).e = n3;
            ((d)object).d(n4 != 0);
            int n7 = ((d)object).f;
            if (n7 != 0) {
                object = tI0.c;
                ((RecyclerView)object).stopScroll();
            }
            long l3 = tI0.h;
            object = MotionEvent.obtain((long)l3, (long)l3, (int)0, (float)0.0f, (float)0.0f, (int)0);
            tI0 = tI0.d;
            tI0.addMovement((MotionEvent)object);
            object.recycle();
            bl2 = true;
        }
        return bl2;
    }

    public final void b() {
        Object object = this.n;
        Object object2 = ((TI0)object).b;
        Object object3 = ((d)object2).m;
        if (object3 != 0) {
            float f5;
            Object object4;
            Object object5;
            Object object6 = ((d)object2).f;
            int n3 = 1;
            if (object6 == n3) {
                object6 = 1;
            } else {
                object6 = 0;
                object5 = null;
            }
            if (object6 == 0 || object3 != 0) {
                ((d)object2).m = false;
                ((d)object2).e();
                object4 = ((d)object2).g;
                object6 = ((d$a)object4).c;
                if (object6 == 0) {
                    object3 = ((d$a)object4).a;
                    object6 = ((d)object2).h;
                    if (object3 != object6) {
                        ((d)object2).a((int)object3);
                    }
                    ((d)object2).b(0);
                    ((d)object2).c();
                } else {
                    object3 = 2;
                    f5 = 2.8E-45f;
                    ((d)object2).b((int)object3);
                }
            }
            object2 = ((TI0)object).d;
            f5 = ((TI0)object).e;
            object6 = 1000;
            object2.computeCurrentVelocity(object6, f5);
            f5 = object2.getXVelocity();
            object3 = (int)f5;
            float f6 = object2.getYVelocity();
            Object object7 = (int)f6;
            object5 = ((TI0)object).c;
            object7 = ((RecyclerView)object5).fling((int)object3, (int)object7);
            if (object7 == 0) {
                object = ((TI0)object).a;
                object2 = ((ViewPager2)((Object)object)).k;
                object4 = ((ViewPager2)((Object)object)).g;
                if ((object2 = ((ViewPager2$j)object2).findSnapView((RecyclerView$o)object4)) != null && ((object3 = (Object)(object2 = (Object)((u)(object4 = ((ViewPager2)((Object)object)).k)).calculateDistanceToFinalSnap((RecyclerView$o)(object5 = ((ViewPager2)((Object)object)).g), (View)object2))[0]) != 0 || (object6 = (Object)object2[n3]) != 0)) {
                    object = ((ViewPager2)((Object)object)).j;
                    object7 = object2[n3];
                    ((RecyclerView)object).smoothScrollBy((int)object3, (int)object7);
                }
            }
        }
    }

    public final void c(float f5) {
        TI0 tI0 = this.n;
        Object object = tI0.b;
        int n3 = object.m;
        if (n3 != 0) {
            float f6;
            MotionEvent motionEvent;
            float f7;
            tI0.f = f7 = tI0.f - f5;
            f5 = tI0.g;
            int n4 = Math.round(f7 -= f5);
            tI0.g = n3 = tI0.g + n4;
            long l2 = SystemClock.uptimeMillis();
            object = tI0.a;
            n3 = ((ViewPager2)((Object)object)).getOrientation();
            if (n3 == 0) {
                n3 = 1;
                f7 = Float.MIN_VALUE;
            } else {
                n3 = 0;
                f7 = 0.0f;
                object = null;
            }
            int n7 = n3 != 0 ? n4 : 0;
            if (n3 != 0) {
                n4 = 0;
                f5 = 0.0f;
                motionEvent = null;
            }
            float f8 = n3 != 0 ? (f6 = tI0.f) : 0.0f;
            float f11 = n3 != 0 ? 0.0f : (f7 = tI0.f);
            object = tI0.c;
            ((RecyclerView)object).scrollBy(n7, n4);
            long l3 = tI0.h;
            int n8 = 2;
            f6 = 2.8E-45f;
            motionEvent = MotionEvent.obtain((long)l3, (long)l2, (int)n8, (float)f8, (float)f11, (int)0);
            tI0 = tI0.d;
            tI0.addMovement(motionEvent);
            motionEvent.recycle();
        }
    }

    public final boolean canScrollHorizontally(int n3) {
        return this.j.canScrollHorizontally(n3);
    }

    public final boolean canScrollVertically(int n3) {
        return this.j.canScrollVertically(n3);
    }

    public final void d(Context object, AttributeSet attributeSet) {
        Object object2 = new ViewPager2$h(this);
        this.t = object2;
        this.j = object2 = new ViewPager2$k(this, (Context)object);
        int n3 = View.generateViewId();
        object2.setId(n3);
        this.j.setDescendantFocusability(131072);
        this.g = object2 = new ViewPager2$f(this, (Context)object);
        this.j.setLayoutManager((RecyclerView$o)object2);
        object2 = this.j;
        n3 = 1;
        ((RecyclerView)object2).setScrollingTouchSlop(n3);
        object2 = R$styleable.ViewPager2;
        object2 = object.obtainStyledAttributes(attributeSet, (int[])object2);
        int[] nArray = R$styleable.ViewPager2;
        ViewGroup viewGroup = this;
        ViewCompat.r((View)this, (Context)object, nArray, attributeSet, (TypedArray)object2, 0, 0);
        int n4 = R$styleable.ViewPager2_android_orientation;
        attributeSet = null;
        n4 = object2.getInt(n4, 0);
        this.setOrientation(n4);
        object = this.j;
        n3 = -1;
        object2 = new ViewGroup.LayoutParams(n3, n3);
        object.setLayoutParams((ViewGroup.LayoutParams)object2);
        object = this.j;
        object2 = new Object();
        ((RecyclerView)object).addOnChildAttachStateChangeListener((RecyclerView$p)object2);
        this.l = object = new d(this);
        viewGroup = this.j;
        this.n = object2 = new TI0(this, (d)object, (RecyclerView)viewGroup);
        this.k = object = new ViewPager2$j(this);
        object2 = this.j;
        ((y)object).attachToRecyclerView((RecyclerView)object2);
        object = this.j;
        object2 = this.l;
        ((RecyclerView)object).addOnScrollListener((RecyclerView$s)object2);
        this.m = object = new a();
        this.l.a = object;
        object = new ViewPager2$b(this);
        object2 = new ViewPager2$c(this);
        this.m.a.add(object);
        this.m.a.add(object2);
        object = this.t;
        object2 = this.j;
        ((ViewPager2$h)object).a((RecyclerView)object2);
        object = this.m;
        object2 = this.c;
        ((a)object).a.add(object2);
        object2 = this.g;
        this.o = object = new c((LinearLayoutManager)object2);
        this.m.a.add(object);
        object = this.j;
        object2 = object.getLayoutParams();
        this.attachViewToParent((View)object, 0, (ViewGroup.LayoutParams)object2);
        return;
        finally {
            object2.recycle();
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        int n3 = this.getId();
        Object object = (Parcelable)sparseArray.get(n3);
        int n4 = object instanceof ViewPager2$SavedState;
        if (n4 != 0) {
            object = (ViewPager2$SavedState)((Object)object);
            n3 = object.a;
            ViewPager2$k viewPager2$k = this.j;
            n4 = viewPager2$k.getId();
            Parcelable parcelable = (Parcelable)sparseArray.get(n3);
            sparseArray.put(n4, (Object)parcelable);
            sparseArray.remove(n3);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        this.g();
    }

    public final boolean e() {
        return this.n.b.m;
    }

    public final void f(ViewPager2$g viewPager2$g) {
        this.c.a.add(viewPager2$g);
    }

    public final void g() {
        int n3;
        int n4 = this.h;
        int n7 = -1;
        if (n4 == n7) {
            return;
        }
        RecyclerView$f recyclerView$f = this.getAdapter();
        if (recyclerView$f == null) {
            return;
        }
        Parcelable parcelable = this.i;
        if (parcelable != null) {
            boolean bl2 = recyclerView$f instanceof Ub3;
            if (bl2) {
                Object object = recyclerView$f;
                object = (Ub3)((Object)recyclerView$f);
                object.e(parcelable);
            }
            n3 = 0;
            parcelable = null;
            this.i = null;
        }
        n3 = this.h;
        n4 = recyclerView$f.getItemCount() + -1;
        n4 = Math.min(n3, n4);
        this.d = n4 = Math.max(0, n4);
        this.h = n7;
        this.j.scrollToPosition(n4);
        this.t.b();
    }

    public CharSequence getAccessibilityClassName() {
        this.t.getClass();
        this.t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView$f getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.s;
    }

    public int getOrientation() {
        int n3;
        ViewPager2$f viewPager2$f = this.g;
        int n4 = viewPager2$f.getOrientation();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getPageSize() {
        int n3;
        ViewPager2$k viewPager2$k = this.j;
        int n4 = this.getOrientation();
        if (n4 == 0) {
            n4 = viewPager2$k.getWidth();
            int n7 = viewPager2$k.getPaddingLeft();
            n4 -= n7;
            n3 = viewPager2$k.getPaddingRight();
            return n4 -= n3;
        } else {
            n4 = viewPager2$k.getHeight();
            int n8 = viewPager2$k.getPaddingTop();
            n4 -= n8;
            n3 = viewPager2$k.getPaddingBottom();
            return n4 -= n3;
        }
    }

    public int getScrollState() {
        return this.l.f;
    }

    public final void h(int n3, boolean n4) {
        double d2;
        double d5;
        int n7;
        Object object = this.getAdapter();
        boolean bl2 = false;
        if (object == null) {
            n4 = this.h;
            int n8 = -1;
            float f5 = 0.0f / 0.0f;
            if (n4 != n8) {
                this.h = n3 = Math.max(n3, 0);
            }
            return;
        }
        int n10 = ((RecyclerView$f)object).getItemCount();
        if (n10 <= 0) {
            return;
        }
        n3 = Math.max(n3, 0);
        int n14 = ((RecyclerView$f)object).getItemCount();
        n10 = 1;
        n14 -= n10;
        if ((n3 = Math.min(n3, n14)) == (n14 = this.d)) {
            d d7 = this.l;
            n7 = d7.f;
            if (n7 == 0) {
                return;
            }
        }
        if (n3 == n14 && n4 != 0) {
            return;
        }
        double d9 = n14;
        this.d = n3;
        this.t.b();
        object = this.l;
        int n15 = ((d)object).f;
        if (n15 != 0) {
            ((d)object).e();
            object = ((d)object).g;
            n7 = ((d$a)object).a;
            d9 = n7;
            float f6 = ((d$a)object).b;
            d5 = f6;
            d9 += d5;
        }
        object = this.l;
        object.getClass();
        n15 = 2;
        int n16 = n4 != 0 ? 2 : 3;
        ((d)object).e = n16;
        ((d)object).m = false;
        n16 = ((d)object).i;
        if (n16 != n3) {
            bl2 = true;
        }
        ((d)object).i = n3;
        ((d)object).b(n15);
        if (bl2) {
            ((d)object).a(n3);
        }
        if (n4 == 0) {
            this.j.scrollToPosition(n3);
            return;
        }
        double d12 = n3;
        d5 = Math.abs(d12 - d9);
        double d13 = d5 - (d2 = 3.0);
        n4 = (int)(d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1));
        if (n4 > 0) {
            ViewPager2$k viewPager2$k = this.j;
            n10 = (int)(d12 == d9 ? 0 : (d12 > d9 ? 1 : -1));
            n14 = n10 > 0 ? n3 + -3 : n3 + 3;
            viewPager2$k.scrollToPosition(n14);
            viewPager2$k = this.j;
            object = new ViewPager2$SmoothScrollToPosition(viewPager2$k, n3);
            viewPager2$k.post((Runnable)object);
        } else {
            ViewPager2$k viewPager2$k = this.j;
            viewPager2$k.smoothScrollToPosition(n3);
        }
    }

    public final void i() {
        Object object = this.k;
        if (object != null) {
            int n3;
            Object object2 = this.g;
            if ((object = ((ViewPager2$j)object).findSnapView((RecyclerView$o)object2)) == null) {
                return;
            }
            object2 = this.g;
            int n4 = ((RecyclerView$o)object2).getPosition((View)object);
            if (n4 != (n3 = this.d) && (n3 = this.getScrollState()) == 0) {
                object2 = this.m;
                ((a)object2).onPageSelected(n4);
            }
            this.e = false;
            return;
        }
        object = new IllegalStateException("Design assumption violated.");
        throw object;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int n3;
        int n4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = this.t.d;
        RecyclerView$f recyclerView$f = viewPager2.getAdapter();
        int n7 = 1;
        int n8 = 0;
        if (recyclerView$f != null) {
            n4 = viewPager2.getOrientation();
            if (n4 == n7) {
                recyclerView$f = viewPager2.getAdapter();
                n4 = recyclerView$f.getItemCount();
                n3 = 1;
            } else {
                recyclerView$f = viewPager2.getAdapter();
                n3 = recyclerView$f.getItemCount();
                n4 = 1;
            }
        } else {
            n4 = 0;
            recyclerView$f = null;
            n3 = 0;
        }
        recyclerView$f = (AccessibilityNodeInfo.CollectionInfo)C2$e.a((int)n4, (int)n3, (int)0, (boolean)false).a;
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)recyclerView$f);
        recyclerView$f = viewPager2.getAdapter();
        if (recyclerView$f != null && (n4 = recyclerView$f.getItemCount()) && (n8 = viewPager2.r) != 0) {
            int n10;
            n8 = viewPager2.d;
            if (n8 > 0) {
                n8 = 8192;
                accessibilityNodeInfo.addAction(n8);
            }
            if ((n10 = viewPager2.d) < (n4 -= n7)) {
                n10 = 4096;
                accessibilityNodeInfo.addAction(n10);
            }
            accessibilityNodeInfo.setScrollable(n7 != 0);
        }
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        int n15 = this.j.getMeasuredWidth();
        ViewPager2$k viewPager2$k = this.j;
        int n16 = viewPager2$k.getMeasuredHeight();
        int n17 = this.getPaddingLeft();
        Rect rect = this.a;
        rect.left = n17;
        n18 -= n14;
        n14 = this.getPaddingRight();
        rect.right = n18 -= n14;
        rect.top = n14 = this.getPaddingTop();
        n19 -= n10;
        n14 = this.getPaddingBottom();
        rect.bottom = n19 -= n14;
        Rect rect2 = this.b;
        Gravity.apply((int)0x800033, (int)n15, (int)n16, (Rect)rect, (Rect)rect2);
        ViewPager2$k viewPager2$k2 = this.j;
        n14 = rect2.left;
        int n18 = rect2.top;
        int n19 = rect2.right;
        n10 = rect2.bottom;
        viewPager2$k2.layout(n14, n18, n19, n10);
        boolean bl3 = this.e;
        if (bl3) {
            this.i();
        }
    }

    public final void onMeasure(int n3, int n4) {
        ViewPager2$k viewPager2$k = this.j;
        this.measureChild((View)viewPager2$k, n3, n4);
        int n7 = this.j.getMeasuredWidth();
        int n8 = this.j.getMeasuredHeight();
        int n10 = this.j.getMeasuredState();
        int n14 = this.getPaddingLeft();
        int n15 = this.getPaddingRight() + n14 + n7;
        n7 = this.getPaddingTop();
        n14 = this.getPaddingBottom() + n7 + n8;
        n7 = this.getSuggestedMinimumWidth();
        n7 = Math.max(n15, n7);
        n8 = this.getSuggestedMinimumHeight();
        n8 = Math.max(n14, n8);
        n3 = View.resolveSizeAndState((int)n7, (int)n3, (int)n10);
        n7 = n10 << 16;
        n4 = View.resolveSizeAndState((int)n8, (int)n4, (int)n7);
        this.setMeasuredDimension(n3, n4);
    }

    public final void onRestoreInstanceState(Parcelable object) {
        int n3 = object instanceof ViewPager2$SavedState;
        if (n3 == 0) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (ViewPager2$SavedState)((Object)object);
        Parcelable parcelable = object.getSuperState();
        super.onRestoreInstanceState(parcelable);
        this.h = n3 = object.b;
        this.i = object = object.c;
    }

    public final Parcelable onSaveInstanceState() {
        int n3;
        Object object = super.onSaveInstanceState();
        ViewPager2$SavedState viewPager2$SavedState = new View.BaseSavedState(object);
        object = this.j;
        viewPager2$SavedState.a = n3 = object.getId();
        n3 = this.h;
        int n4 = -1;
        if (n3 == n4) {
            n3 = this.d;
        }
        viewPager2$SavedState.b = n3;
        object = this.i;
        if (object != null) {
            viewPager2$SavedState.c = object;
        } else {
            object = this.j.getAdapter();
            n4 = object instanceof Ub3;
            if (n4 != 0) {
                viewPager2$SavedState.c = object = ((Ub3)object).a();
            }
        }
        return viewPager2$SavedState;
    }

    public final void onViewAdded(View object) {
        object = new IllegalStateException("ViewPager2 does not support direct child views");
        throw object;
    }

    public final boolean performAccessibilityAction(int n3, Bundle object) {
        ViewPager2$h viewPager2$h = this.t;
        viewPager2$h.getClass();
        int n4 = 4096;
        int n7 = 8192;
        if (n3 != n7 && n3 != n4) {
            return super.performAccessibilityAction(n3, (Bundle)object);
        }
        object = this.t;
        object.getClass();
        if (n3 != n7 && n3 != n4) {
            IllegalStateException illegalStateException = new IllegalStateException();
            throw illegalStateException;
        }
        n4 = 1;
        object = ((ViewPager2$h)object).d;
        n3 = n3 == n7 ? ((ViewPager2)((Object)object)).getCurrentItem() - n4 : ((ViewPager2)((Object)object)).getCurrentItem() + n4;
        n7 = (int)(((ViewPager2)((Object)object)).r ? 1 : 0);
        if (n7 != 0) {
            ((ViewPager2)((Object)object)).h(n3, n4 != 0);
        }
        return n4 != 0;
    }

    public void setAdapter(RecyclerView$f recyclerView$f) {
        Object object = this.j.getAdapter();
        Object object2 = this.t;
        if (object != null) {
            object2 = ((ViewPager2$h)object2).c;
            ((RecyclerView$f)object).unregisterAdapterDataObserver((RecyclerView$h)object2);
        } else {
            object2.getClass();
        }
        object2 = this.f;
        if (object != null) {
            ((RecyclerView$f)object).unregisterAdapterDataObserver((RecyclerView$h)object2);
        }
        this.j.setAdapter(recyclerView$f);
        this.d = 0;
        this.g();
        object = this.t;
        ((ViewPager2$h)object).b();
        if (recyclerView$f != null) {
            object = ((ViewPager2$h)object).c;
            recyclerView$f.registerAdapterDataObserver((RecyclerView$h)object);
        }
        if (recyclerView$f != null) {
            recyclerView$f.registerAdapterDataObserver((RecyclerView$h)object2);
        }
    }

    public void setCurrentItem(int n3) {
        this.setCurrentItem(n3, true);
    }

    public void setCurrentItem(int n3, boolean bl2) {
        boolean bl3 = this.e();
        if (!bl3) {
            this.h(n3, bl2);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        throw illegalStateException;
    }

    public void setLayoutDirection(int n3) {
        super.setLayoutDirection(n3);
        this.t.b();
    }

    public void setOffscreenPageLimit(int n3) {
        int n4 = 1;
        if (n3 < n4 && n3 != (n4 = -1)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
            throw illegalArgumentException;
        }
        this.s = n3;
        this.j.requestLayout();
    }

    public void setOrientation(int n3) {
        this.g.setOrientation(n3);
        this.t.b();
    }

    public void setPageTransformer(ViewPager2$i object) {
        Object object2;
        float f5;
        Object object3;
        int n3;
        int n4 = 0;
        float f6 = 0.0f;
        c c2 = null;
        if (object != null) {
            n3 = this.q;
            if (n3 == 0) {
                this.p = object3 = this.j.getItemAnimator();
                n3 = 1;
                f5 = Float.MIN_VALUE;
                this.q = n3;
            }
            object3 = this.j;
            ((RecyclerView)object3).setItemAnimator(null);
        } else {
            n3 = this.q;
            if (n3 != 0) {
                object3 = this.j;
                object2 = this.p;
                ((RecyclerView)object3).setItemAnimator((RecyclerView$l)object2);
                this.p = null;
                n4 = 0;
                f6 = 0.0f;
                c2 = null;
                this.q = false;
            }
        }
        c2 = this.o;
        object3 = c2.b;
        if (object == object3) {
            return;
        }
        c2.b = object;
        if (object != null) {
            object = this.l;
            ((d)object).e();
            object = ((d)object).g;
            n4 = ((d$a)object).a;
            double d2 = n4;
            float f7 = ((d$a)object).b;
            double d5 = f7;
            int n7 = (int)(d2 += d5);
            d5 = n7;
            f6 = (float)(d2 -= d5);
            f5 = (float)this.getPageSize() * f6;
            n3 = Math.round(f5);
            object2 = this.o;
            ((c)object2).onPageScrolled(n7, f6, n3);
        }
    }

    public void setUserInputEnabled(boolean bl2) {
        this.r = bl2;
        this.t.b();
    }
}

