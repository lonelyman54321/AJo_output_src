/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.widget.OverScroller
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.HeaderBehavior$FlingRunnable;
import com.google.android.material.appbar.ViewOffsetBehavior;

abstract class HeaderBehavior
extends ViewOffsetBehavior {
    private static final int INVALID_POINTER = 255;
    private int activePointerId;
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;
    private VelocityTracker velocityTracker;

    public HeaderBehavior() {
        int n3;
        this.activePointerId = n3 = -1;
        this.touchSlop = n3;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        this.activePointerId = n3 = -1;
        this.touchSlop = n3;
    }

    private void ensureVelocityTracker() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            this.velocityTracker = velocityTracker = VelocityTracker.obtain();
        }
    }

    public boolean canDragView(View view) {
        return false;
    }

    public final boolean fling(CoordinatorLayout coordinatorLayout, View view, int n3, int n4, float f5) {
        Object object;
        boolean bl2;
        HeaderBehavior headerBehavior = this;
        Runnable runnable2 = this.flingRunnable;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
            bl2 = false;
            runnable2 = null;
            this.flingRunnable = null;
        }
        if ((runnable2 = headerBehavior.scroller) == null) {
            object = view.getContext();
            runnable2 = new OverScroller(object);
            headerBehavior.scroller = runnable2;
        }
        OverScroller overScroller = headerBehavior.scroller;
        int n7 = this.getTopAndBottomOffset();
        int n8 = Math.round(f5);
        overScroller.fling(0, n7, 0, n8, 0, 0, n3, n4);
        runnable2 = headerBehavior.scroller;
        bl2 = runnable2.computeScrollOffset();
        if (bl2) {
            object = coordinatorLayout;
            headerBehavior.flingRunnable = runnable2 = new HeaderBehavior$FlingRunnable(this, coordinatorLayout, view);
            object = ViewCompat.a;
            view.postOnAnimation(runnable2);
            return true;
        }
        object = coordinatorLayout;
        this.onFlingFinished(coordinatorLayout, view);
        return false;
    }

    public int getMaxDragOffset(View view) {
        return -view.getHeight();
    }

    public int getScrollRangeForDragFling(View view) {
        return view.getHeight();
    }

    public int getTopBottomOffsetForScrollingSibling() {
        return this.getTopAndBottomOffset();
    }

    public void onFlingFinished(CoordinatorLayout coordinatorLayout, View view) {
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        float f5;
        int n3 = this.touchSlop;
        if (n3 < 0) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)coordinatorLayout.getContext());
            this.touchSlop = n3 = viewConfiguration.getScaledTouchSlop();
        }
        n3 = motionEvent.getActionMasked();
        int n4 = 2;
        float f6 = 2.8E-45f;
        boolean bl2 = true;
        int n7 = -1;
        if (n3 == n4 && (n3 = (int)(this.isBeingDragged ? 1 : 0)) != 0) {
            int n8;
            n3 = this.activePointerId;
            if (n3 == n7) {
                return false;
            }
            if ((n3 = motionEvent.findPointerIndex(n3)) == n7) {
                return false;
            }
            f5 = motionEvent.getY(n3);
            n3 = (int)f5;
            n4 = this.lastMotionY;
            if ((n4 = Math.abs(n3 - n4)) > (n8 = this.touchSlop)) {
                this.lastMotionY = n3;
                return bl2;
            }
        }
        if ((n3 = motionEvent.getActionMasked()) == 0) {
            int n10;
            this.activePointerId = n7;
            f5 = motionEvent.getX();
            n3 = (int)f5;
            f6 = motionEvent.getY();
            n4 = (int)f6;
            n7 = (int)(this.canDragView(view) ? 1 : 0);
            if (n7 != 0 && (n10 = coordinatorLayout.isPointInChildBounds(view, n3, n4)) != 0) {
                n10 = 1;
            } else {
                n10 = 0;
                coordinatorLayout = null;
            }
            this.isBeingDragged = n10;
            if (n10 != 0) {
                this.lastMotionY = n4;
                this.activePointerId = n10 = motionEvent.getPointerId(0);
                this.ensureVelocityTracker();
                coordinatorLayout = this.scroller;
                if (coordinatorLayout != null && (n10 = (int)(coordinatorLayout.isFinished() ? 1 : 0)) == 0) {
                    this.scroller.abortAnimation();
                    return bl2;
                }
            }
        }
        if ((coordinatorLayout = this.velocityTracker) != null) {
            coordinatorLayout.addMovement(motionEvent);
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public boolean onTouchEvent(CoordinatorLayout var1_1, View var2_2, MotionEvent var3_3) {
        block12: {
            block9: {
                block11: {
                    block10: {
                        var4_4 = var3_3.getActionMasked();
                        var5_5 = -1;
                        var6_6 = 1;
                        if (var4_4 == var6_6) break block9;
                        var7_7 = 2;
                        if (var4_4 == var7_7) break block10;
                        var8_9 = 3;
                        var9_10 = 4.2E-45f;
                        if (var4_4 == var8_9) ** GOTO lbl-1000
                        var8_9 = 6;
                        var9_10 = 8.4E-45f;
                        if (var4_4 == var8_9) {
                            var8_9 = var3_3.getActionIndex();
                            if (var8_9 == 0) {
                                var8_9 = 1;
                                var9_10 = 1.4E-45f;
                            } else {
                                var8_9 = 0;
                                var9_10 = 0.0f;
                                var1_1 = null;
                            }
                            this.activePointerId = var10_12 = var3_3.getPointerId(var8_9);
                            var9_10 = var3_3.getY(var8_9);
                            var10_12 = 0x3F000000;
                            var11_13 = 0.5f;
                            this.lastMotionY = var8_9 = (int)(var9_10 += var11_13);
                        }
                        break block11;
                    }
                    var4_4 = this.activePointerId;
                    if ((var4_4 = var3_3.findPointerIndex(var4_4)) == var5_5) {
                        return false;
                    }
                    var12_15 = var3_3.getY(var4_4);
                    var4_4 = (int)var12_15;
                    var5_5 = this.lastMotionY;
                    var13_16 = var5_5 - var4_4;
                    this.lastMotionY = var4_4;
                    var14_17 = this.getMaxDragOffset(var2_2);
                    this.scroll(var1_1, var2_2, var13_16, var14_17, 0);
                }
                var8_9 = 0;
                var9_10 = 0.0f;
                var1_1 = null;
                break block12;
            }
            var15_19 = this.velocityTracker;
            if (var15_19 != null) {
                var15_19.addMovement(var3_3);
                this.velocityTracker.computeCurrentVelocity(1000);
                var15_19 = this.velocityTracker;
                var7_8 = this.activePointerId;
                var16_20 = var15_19.getYVelocity(var7_8);
                var4_4 = this.getScrollRangeForDragFling(var2_2);
                var14_18 = -var4_4;
                this.fling(var1_1, var2_2, var14_18, 0, var16_20);
                var8_9 = 1;
                var9_11 = 1.4E-45f;
            } else lbl-1000:
            // 2 sources

            {
                var8_9 = 0;
                var9_10 = 0.0f;
                var1_1 = null;
            }
            this.isBeingDragged = false;
            this.activePointerId = var5_5;
            var2_2 = this.velocityTracker;
            if (var2_2 != null) {
                var2_2.recycle();
                var10_12 = 0;
                var11_14 = 0.0f;
                var2_2 = null;
                this.velocityTracker = null;
            }
        }
        var2_2 = this.velocityTracker;
        if (var2_2 != null) {
            var2_2.addMovement(var3_3);
        }
        if ((var10_12 = this.isBeingDragged) == 0 && var8_9 == 0) {
            var6_6 = 0;
        }
        return (boolean)var6_6;
    }

    public final int scroll(CoordinatorLayout coordinatorLayout, View view, int n3, int n4, int n7) {
        int n8 = this.getTopBottomOffsetForScrollingSibling() - n3;
        return this.setHeaderTopBottomOffset(coordinatorLayout, view, n8, n4, n7);
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, View view, int n3) {
        return this.setHeaderTopBottomOffset(coordinatorLayout, view, n3, -1 << -1, -1 >>> 1);
    }

    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, View view, int n3, int n4, int n7) {
        int n8;
        int n10 = this.getTopAndBottomOffset();
        if (n4 != 0 && n10 >= n4 && n10 <= n7 && n10 != (n8 = PK1.b(n3, n4, n7))) {
            this.setTopAndBottomOffset(n8);
            n10 -= n8;
        } else {
            n10 = 0;
        }
        return n10;
    }
}

