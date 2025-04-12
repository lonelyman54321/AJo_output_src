/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.behavior;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper$b;
import com.google.android.material.behavior.SwipeDismissBehavior$1;
import com.google.android.material.behavior.SwipeDismissBehavior$2;
import com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener;

public class SwipeDismissBehavior
extends CoordinatorLayout$Behavior {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END;
    float alphaEndSwipeDistance;
    float alphaStartSwipeDistance;
    private final ViewDragHelper$b dragCallback;
    float dragDismissThreshold;
    private boolean interceptingEvents;
    SwipeDismissBehavior$OnDismissListener listener;
    private boolean requestingDisallowInterceptTouchEvent;
    private float sensitivity = 0.0f;
    private boolean sensitivitySet;
    int swipeDirection = 2;
    ViewDragHelper viewDragHelper;

    public SwipeDismissBehavior() {
        float f5;
        this.dragDismissThreshold = f5 = 0.5f;
        this.alphaStartSwipeDistance = 0.0f;
        this.alphaEndSwipeDistance = f5;
        SwipeDismissBehavior$1 swipeDismissBehavior$1 = new SwipeDismissBehavior$1(this);
        this.dragCallback = swipeDismissBehavior$1;
    }

    public static /* synthetic */ boolean access$002(SwipeDismissBehavior swipeDismissBehavior, boolean bl2) {
        swipeDismissBehavior.requestingDisallowInterceptTouchEvent = bl2;
        return bl2;
    }

    public static float clamp(float f5, float f6, float f7) {
        return Math.min(Math.max(f5, f6), f7);
    }

    public static int clamp(int n3, int n4, int n7) {
        return Math.min(Math.max(n3, n4), n7);
    }

    private void ensureViewDragHelper(ViewGroup object) {
        Object object2 = this.viewDragHelper;
        if (object2 == null) {
            boolean bl2 = this.sensitivitySet;
            if (bl2) {
                float f5 = this.sensitivity;
                ViewDragHelper$b viewDragHelper$b = this.dragCallback;
                object = ViewDragHelper.i(object, f5, viewDragHelper$b);
            } else {
                object2 = this.dragCallback;
                Context context = object.getContext();
                ViewDragHelper viewDragHelper = new ViewDragHelper(context, (ViewGroup)object, (ViewDragHelper$b)object2);
                object = viewDragHelper;
            }
            this.viewDragHelper = object;
        }
    }

    public static float fraction(float f5, float f6, float f7) {
        return (f7 -= f5) / (f6 -= f5);
    }

    private void updateAccessibilityActions(View view) {
        ViewCompat.p(0x100000, view);
        C2$a c2$a = null;
        ViewCompat.k(0, view);
        boolean bl2 = this.canSwipeDismissView(view);
        if (bl2) {
            c2$a = C2$a.n;
            SwipeDismissBehavior$2 swipeDismissBehavior$2 = new SwipeDismissBehavior$2(this);
            ViewCompat.q(view, c2$a, null, swipeDismissBehavior$2);
        }
    }

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    public int getDragState() {
        int n3;
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null) {
            n3 = viewDragHelper.a;
        } else {
            n3 = 0;
            viewDragHelper = null;
        }
        return n3;
    }

    public SwipeDismissBehavior$OnDismissListener getListener() {
        return this.listener;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout object, View view, MotionEvent motionEvent) {
        int n3 = this.interceptingEvents;
        boolean bl2 = motionEvent.getActionMasked();
        boolean bl3 = true;
        if (bl2) {
            boolean bl4;
            if (bl2 == bl3 || bl2 == (bl4 = 3 != 0)) {
                this.interceptingEvents = false;
            }
        } else {
            float f5 = motionEvent.getX();
            n3 = (int)f5;
            float f6 = motionEvent.getY();
            int n4 = (int)f6;
            n3 = (int)(((CoordinatorLayout)object).isPointInChildBounds(view, n3, n4) ? 1 : 0);
            this.interceptingEvents = n3;
        }
        if (n3 != 0) {
            this.ensureViewDragHelper((ViewGroup)object);
            boolean bl5 = this.requestingDisallowInterceptTouchEvent;
            if (bl5 || !(bl5 = ((ViewDragHelper)(object = this.viewDragHelper)).t(motionEvent))) {
                bl3 = false;
            }
            return bl3;
        }
        return false;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int n3) {
        boolean bl2 = super.onLayoutChild(coordinatorLayout, view, n3);
        n3 = view.getImportantForAccessibility();
        if (n3 == 0) {
            n3 = 1;
            view.setImportantForAccessibility(n3);
            this.updateAccessibilityActions(view);
        }
        return bl2;
    }

    public boolean onTouchEvent(CoordinatorLayout object, View view, MotionEvent motionEvent) {
        object = this.viewDragHelper;
        if (object != null) {
            int n3;
            int n4 = this.requestingDisallowInterceptTouchEvent;
            if (n4 == 0 || (n4 = motionEvent.getActionMasked()) != (n3 = 3)) {
                object = this.viewDragHelper;
                ((ViewDragHelper)object).m(motionEvent);
            }
            return true;
        }
        return false;
    }

    public void setDragDismissDistance(float f5) {
        this.dragDismissThreshold = f5 = SwipeDismissBehavior.clamp(0.0f, f5, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f5) {
        this.alphaEndSwipeDistance = f5 = SwipeDismissBehavior.clamp(0.0f, f5, 1.0f);
    }

    public void setListener(SwipeDismissBehavior$OnDismissListener swipeDismissBehavior$OnDismissListener) {
        this.listener = swipeDismissBehavior$OnDismissListener;
    }

    public void setSensitivity(float f5) {
        this.sensitivity = f5;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f5) {
        this.alphaStartSwipeDistance = f5 = SwipeDismissBehavior.clamp(0.0f, f5, 1.0f);
    }

    public void setSwipeDirection(int n3) {
        this.swipeDirection = n3;
    }
}

