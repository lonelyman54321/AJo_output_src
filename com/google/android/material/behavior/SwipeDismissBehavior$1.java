/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.behavior;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper$b;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener;
import com.google.android.material.behavior.SwipeDismissBehavior$SettleRunnable;

class SwipeDismissBehavior$1
extends ViewDragHelper$b {
    private static final int INVALID_POINTER_ID = 255;
    private int activePointerId = -1;
    private int originalCapturedViewLeft;
    final /* synthetic */ SwipeDismissBehavior this$0;

    public SwipeDismissBehavior$1(SwipeDismissBehavior swipeDismissBehavior) {
        this.this$0 = swipeDismissBehavior;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean shouldDismiss(View view, float f5) {
        boolean bl2 = false;
        int n3 = 1;
        int n4 = 0;
        float f6 = 0.0f;
        SwipeDismissBehavior swipeDismissBehavior = null;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            Object object2 = ViewCompat.a;
            int n7 = view.getLayoutDirection();
            if (n7 == n3) {
                n7 = 1;
                float f8 = Float.MIN_VALUE;
            } else {
                n7 = 0;
                float f11 = 0.0f;
                view = null;
            }
            object2 = this.this$0;
            int n8 = ((SwipeDismissBehavior)object2).swipeDirection;
            int n10 = 2;
            if (n8 == n10) {
                return n3 != 0;
            }
            if (n8 == 0) {
                if (n7 != 0) {
                    float f12 = f5 - 0.0f;
                    n7 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                    if (n7 >= 0) return bl2;
                    return true;
                }
                if (object <= 0) return bl2;
                return true;
            }
            if (n8 != n3) return bl2;
            if (n7 != 0) {
                if (object <= 0) return bl2;
                return true;
            }
            float f14 = f5 - 0.0f;
            n7 = (int)(f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1));
            if (n7 >= 0) return bl2;
            return true;
        }
        int n14 = view.getLeft();
        n4 = this.originalCapturedViewLeft;
        n14 -= n4;
        float f15 = view.getWidth();
        swipeDismissBehavior = this.this$0;
        f6 = swipeDismissBehavior.dragDismissThreshold;
        int n15 = Math.round(f15 *= f6);
        if ((n14 = Math.abs(n14)) < n15) return bl2;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int clampViewPositionHorizontal(View view, int n3, int n4) {
        int n7;
        int n8;
        n4 = view.getLayoutDirection();
        n4 = n4 == (n8 = 1) ? 1 : 0;
        SwipeDismissBehavior swipeDismissBehavior = this.this$0;
        int n10 = swipeDismissBehavior.swipeDirection;
        if (n10 == 0) {
            if (n4 != 0) {
                n4 = this.originalCapturedViewLeft;
                n7 = view.getWidth();
                n4 -= n7;
                n7 = this.originalCapturedViewLeft;
                return SwipeDismissBehavior.clamp(n4, n3, n7);
            }
            n4 = this.originalCapturedViewLeft;
            n7 = view.getWidth();
            return SwipeDismissBehavior.clamp(n4, n3, n7 += n4);
        } else {
            if (n10 != n8) {
                n4 = this.originalCapturedViewLeft;
                n8 = view.getWidth();
                n4 -= n8;
                n8 = this.originalCapturedViewLeft;
                n7 = view.getWidth() + n8;
                return SwipeDismissBehavior.clamp(n4, n3, n7);
            }
            if (n4 == 0) {
                n4 = this.originalCapturedViewLeft;
                n7 = view.getWidth();
                n4 -= n7;
                n7 = this.originalCapturedViewLeft;
                return SwipeDismissBehavior.clamp(n4, n3, n7);
            }
            n4 = this.originalCapturedViewLeft;
            n7 = view.getWidth();
        }
        return SwipeDismissBehavior.clamp(n4, n3, n7 += n4);
    }

    public int clampViewPositionVertical(View view, int n3, int n4) {
        return view.getTop();
    }

    public int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    public void onViewCaptured(View object, int n3) {
        this.activePointerId = n3;
        this.originalCapturedViewLeft = n3 = object.getLeft();
        if ((object = object.getParent()) != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.this$0;
            boolean bl2 = true;
            SwipeDismissBehavior.access$002(swipeDismissBehavior, bl2);
            object.requestDisallowInterceptTouchEvent(bl2);
            object = this.this$0;
            n3 = 0;
            swipeDismissBehavior = null;
            SwipeDismissBehavior.access$002((SwipeDismissBehavior)object, false);
        }
    }

    public void onViewDragStateChanged(int n3) {
        SwipeDismissBehavior$OnDismissListener swipeDismissBehavior$OnDismissListener = this.this$0.listener;
        if (swipeDismissBehavior$OnDismissListener != null) {
            swipeDismissBehavior$OnDismissListener.onDragStateChanged(n3);
        }
    }

    public void onViewPositionChanged(View view, int n3, int n4, int n7, int n8) {
        n4 = view.getWidth();
        float f5 = n4;
        SwipeDismissBehavior swipeDismissBehavior = this.this$0;
        float f6 = swipeDismissBehavior.alphaStartSwipeDistance;
        f5 *= f6;
        n7 = view.getWidth();
        f6 = n7;
        SwipeDismissBehavior swipeDismissBehavior2 = this.this$0;
        float f7 = swipeDismissBehavior2.alphaEndSwipeDistance;
        f6 *= f7;
        n8 = this.originalCapturedViewLeft;
        n3 = Math.abs(n3 - n8);
        float f8 = n3;
        n8 = 1065353216;
        f7 = 1.0f;
        Object object = f8 == f5 ? 0 : (f8 < f5 ? -1 : 1);
        if (object <= 0) {
            view.setAlpha(f7);
        } else {
            object = false;
            Object object2 = f8 == f6 ? 0 : (f8 > f6 ? 1 : -1);
            if (object2 >= 0) {
                view.setAlpha(0.0f);
            } else {
                f8 = SwipeDismissBehavior.fraction(f5, f6, f8);
                f8 = f7 - f8;
                f8 = SwipeDismissBehavior.clamp(0.0f, f8, f7);
                view.setAlpha(f8);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void onViewReleased(View view, float f5, float f6) {
        void var5_12;
        Object object;
        Object object2;
        SwipeDismissBehavior swipeDismissBehavior;
        this.activePointerId = -1;
        int n3 = view.getWidth();
        boolean bl2 = this.shouldDismiss(view, f5);
        if (bl2) {
            int n4;
            boolean bl3 = false;
            swipeDismissBehavior = null;
            float f7 = f5 - 0.0f;
            object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object2 >= 0 && (object2 = view.getLeft()) >= (n4 = this.originalCapturedViewLeft)) {
                int n7 = n4 + n3;
            } else {
                object2 = this.originalCapturedViewLeft;
                int n8 = object2 - n3;
            }
            object2 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            int n10 = this.originalCapturedViewLeft;
            object2 = 0;
            f5 = 0.0f;
            object = null;
        }
        Object object3 = this.this$0.viewDragHelper;
        int n14 = view.getTop();
        n3 = (int)(((ViewDragHelper)object3).s((int)var5_12, n14) ? 1 : 0);
        if (n3 != 0) {
            swipeDismissBehavior = this.this$0;
            object3 = new SwipeDismissBehavior$SettleRunnable(swipeDismissBehavior, view, (boolean)object2);
            object = ViewCompat.a;
            view.postOnAnimation((Runnable)object3);
        } else if (object2 != 0 && (object = this.this$0.listener) != null) {
            object.onDismiss(view);
        }
    }

    public boolean tryCaptureView(View view, int n3) {
        SwipeDismissBehavior swipeDismissBehavior;
        boolean bl2;
        int n4 = this.activePointerId;
        int n7 = -1;
        if ((n4 == n7 || n4 == n3) && (bl2 = (swipeDismissBehavior = this.this$0).canSwipeDismissView(view))) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }
}

