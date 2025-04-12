/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.slidingpanelayout.widget;

import android.view.View;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper$b;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class SlidingPaneLayout$c
extends ViewDragHelper$b {
    public final /* synthetic */ SlidingPaneLayout a;

    public SlidingPaneLayout$c(SlidingPaneLayout slidingPaneLayout) {
        this.a = slidingPaneLayout;
    }

    public final boolean a() {
        int n3;
        int n4;
        SlidingPaneLayout slidingPaneLayout = this.a;
        int n7 = slidingPaneLayout.j;
        if (n7 != 0) {
            return false;
        }
        n7 = slidingPaneLayout.getLockMode();
        if (n7 == (n4 = 3)) {
            return false;
        }
        n7 = (int)(slidingPaneLayout.c() ? 1 : 0);
        n4 = 1;
        if (n7 != 0 && (n7 = slidingPaneLayout.getLockMode()) == n4) {
            return false;
        }
        n7 = (int)(slidingPaneLayout.c() ? 1 : 0);
        if (n7 == 0 && (n3 = slidingPaneLayout.getLockMode()) == (n7 = 2)) {
            return false;
        }
        return n4 != 0;
    }

    public final int clampViewPositionHorizontal(View object, int n3, int n4) {
        int n7;
        object = this.a;
        SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)((SlidingPaneLayout)((Object)object)).f.getLayoutParams();
        boolean n8 = ((SlidingPaneLayout)((Object)object)).b();
        if (n8) {
            int n10 = object.getWidth();
            int n14 = object.getPaddingRight();
            n4 = slidingPaneLayout$LayoutParams.rightMargin;
            n14 += n4;
            slidingPaneLayout$LayoutParams = ((SlidingPaneLayout)((Object)object)).f;
            n4 = slidingPaneLayout$LayoutParams.getWidth() + n14;
            int n15 = n10 - n4;
            n7 = ((SlidingPaneLayout)((Object)object)).i;
            n7 = n15 - n7;
            n3 = Math.min(n3, n15);
            n7 = Math.max(n3, n7);
        } else {
            int n16 = object.getPaddingLeft();
            n4 = slidingPaneLayout$LayoutParams.leftMargin;
            int n17 = n16 + n4;
            n7 = ((SlidingPaneLayout)((Object)object)).i + n17;
            n3 = Math.max(n3, n17);
            n7 = Math.min(n3, n7);
        }
        return n7;
    }

    public final int clampViewPositionVertical(View view, int n3, int n4) {
        return view.getTop();
    }

    public final int getViewHorizontalDragRange(View view) {
        return this.a.i;
    }

    public final void onEdgeDragStarted(int n3, int n4) {
        n3 = (int)(this.a() ? 1 : 0);
        if (n3 == 0) {
            return;
        }
        SlidingPaneLayout slidingPaneLayout = this.a;
        ViewDragHelper viewDragHelper = slidingPaneLayout.p;
        slidingPaneLayout = slidingPaneLayout.f;
        viewDragHelper.c(n4, (View)slidingPaneLayout);
    }

    public final void onEdgeTouched(int n3, int n4) {
        n3 = (int)(this.a() ? 1 : 0);
        if (n3 == 0) {
            return;
        }
        SlidingPaneLayout slidingPaneLayout = this.a;
        ViewDragHelper viewDragHelper = slidingPaneLayout.p;
        slidingPaneLayout = slidingPaneLayout.f;
        viewDragHelper.c(n4, (View)slidingPaneLayout);
    }

    public final void onViewCaptured(View object, int n3) {
        object = this.a;
        n3 = object.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            View view = object.getChildAt(i3);
            int n7 = view.getVisibility();
            if (n7 != (n4 = 4)) continue;
            view.setVisibility(0);
        }
    }

    public final void onViewDragStateChanged(int n3) {
        SlidingPaneLayout slidingPaneLayout = this.a;
        Iterator iterator = slidingPaneLayout.p;
        int n4 = ((ViewDragHelper)((Object)iterator)).a;
        if (n4 == 0) {
            float f5 = slidingPaneLayout.g;
            Object object = slidingPaneLayout.n;
            float f6 = 1.0f;
            int n7 = 32;
            n4 = (int)(f5 == f6 ? 0 : (f5 > f6 ? 1 : -1));
            if (n4 == 0) {
                boolean bl2;
                iterator = slidingPaneLayout.f;
                slidingPaneLayout.f((View)iterator);
                iterator = ((CopyOnWriteArrayList)object).iterator();
                while (bl2 = iterator.hasNext()) {
                    object = (SlidingPaneLayout$d)iterator.next();
                    object.b();
                }
                slidingPaneLayout.sendAccessibilityEvent(n7);
                n4 = 0;
                f5 = 0.0f;
                iterator = null;
                slidingPaneLayout.q = false;
            } else {
                boolean bl3;
                iterator = ((CopyOnWriteArrayList)object).iterator();
                while (bl3 = iterator.hasNext()) {
                    object = (SlidingPaneLayout$d)iterator.next();
                    object.c();
                }
                slidingPaneLayout.sendAccessibilityEvent(n7);
                n4 = 1;
                f5 = Float.MIN_VALUE;
                slidingPaneLayout.q = n4;
            }
        }
    }

    public final void onViewPositionChanged(View object, int n3, int n4, int n7, int n8) {
        object = this.a;
        Object object2 = ((SlidingPaneLayout)((Object)object)).f;
        if (object2 == null) {
            n3 = 0;
            float f5 = 0.0f;
            Object var8_9 = null;
            ((SlidingPaneLayout)((Object)object)).g = 0.0f;
        } else {
            n4 = (int)(((SlidingPaneLayout)((Object)object)).b() ? 1 : 0);
            SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)((SlidingPaneLayout)((Object)object)).f.getLayoutParams();
            View view = ((SlidingPaneLayout)((Object)object)).f;
            n8 = view.getWidth();
            if (n4 != 0) {
                int n10 = object.getWidth() - n3;
                n3 = n10 - n8;
            }
            n8 = n4 != 0 ? object.getPaddingRight() : object.getPaddingLeft();
            n4 = n4 != 0 ? slidingPaneLayout$LayoutParams.rightMargin : slidingPaneLayout$LayoutParams.leftMargin;
            float f6 = n3 -= (n8 += n4);
            float f7 = ((SlidingPaneLayout)((Object)object)).i;
            ((SlidingPaneLayout)((Object)object)).g = f6 /= f7;
            n4 = ((SlidingPaneLayout)((Object)object)).k;
            if (n4 != 0) {
                ((SlidingPaneLayout)((Object)object)).d(f6);
            }
            Iterator iterator = ((SlidingPaneLayout)((Object)object)).n.iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object2 = (SlidingPaneLayout$d)iterator.next();
                object2.a();
            }
        }
        object.invalidate();
    }

    public final void onViewReleased(View view, float f5, float f6) {
        ViewDragHelper viewDragHelper;
        int n3;
        SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)view.getLayoutParams();
        SlidingPaneLayout slidingPaneLayout = this.a;
        int n4 = slidingPaneLayout.b();
        float f7 = 0.5f;
        if (n4 != 0) {
            float f8;
            float f11;
            int n7;
            n4 = slidingPaneLayout.getPaddingRight();
            n3 = slidingPaneLayout$LayoutParams.rightMargin;
            n4 += n3;
            float f12 = f5 - 0.0f;
            n3 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
            if (n3 < 0 || (n7 = (int)((f11 = f5 - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1))) == 0 && (n7 = (int)((f8 = (f5 = slidingPaneLayout.g) - f7) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) > 0) {
                n7 = slidingPaneLayout.i;
                n4 += n7;
            }
            viewDragHelper = slidingPaneLayout.f;
            n7 = viewDragHelper.getWidth();
            n3 = slidingPaneLayout.getWidth() - n4 - n7;
        } else {
            float f14;
            n4 = slidingPaneLayout.getPaddingLeft();
            n3 = slidingPaneLayout$LayoutParams.leftMargin + n4;
            float f15 = f5 - 0.0f;
            Object object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            if (object > 0 || object == false && (object = (f14 = (f5 = slidingPaneLayout.g) - f7) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1)) > 0) {
                object = slidingPaneLayout.i;
                n3 += object;
            }
        }
        viewDragHelper = slidingPaneLayout.p;
        int n8 = view.getTop();
        viewDragHelper.s(n3, n8);
        slidingPaneLayout.invalidate();
    }

    public final boolean tryCaptureView(View view, int n3) {
        n3 = (int)(this.a() ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        return ((SlidingPaneLayout$LayoutParams)view.getLayoutParams()).b;
    }
}

