/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.ViewConfiguration
 */
package com.ril.ajio.customviews.widgets.photoviewer.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.GestureDetector;
import com.ril.ajio.customviews.widgets.photoviewer.gestures.OnGestureListener;
import com.ril.ajio.customviews.widgets.photoviewer.log.LogManager;

public class CupcakeGestureDetector
implements GestureDetector {
    private static final String LOG_TAG = "CupcakeGestureDetector";
    private boolean mIsDragging;
    float mLastTouchX;
    float mLastTouchY;
    OnGestureListener mListener;
    private final float mMinimumVelocity;
    private final float mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public CupcakeGestureDetector(Context context) {
        float f5;
        float f6;
        context = ViewConfiguration.get((Context)context);
        this.mMinimumVelocity = f6 = (float)context.getScaledMinimumFlingVelocity();
        this.mTouchSlop = f5 = (float)context.getScaledTouchSlop();
    }

    public float getActiveX(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    public float getActiveY(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    public boolean isDragging() {
        return this.mIsDragging;
    }

    public boolean isScaling() {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n3 = motionEvent.getAction();
        int n4 = 0;
        float f5 = 0.0f;
        OnGestureListener onGestureListener = null;
        int n7 = 1;
        if (n3 != 0) {
            float f6 = 0.0f;
            Object var8_8 = null;
            if (n3 != n7) {
                int n8 = 2;
                float f7 = 2.8E-45f;
                if (n3 != n8) {
                    int n10 = 3;
                    float f8 = 4.2E-45f;
                    if (n3 == n10 && (motionEvent = this.mVelocityTracker) != null) {
                        motionEvent.recycle();
                        this.mVelocityTracker = null;
                    }
                } else {
                    float f11 = this.getActiveX(motionEvent);
                    f6 = this.getActiveY(motionEvent);
                    f7 = this.mLastTouchX;
                    f7 = f11 - f7;
                    float f12 = this.mLastTouchY;
                    f12 = f6 - f12;
                    boolean bl2 = this.mIsDragging;
                    if (!bl2) {
                        float f14;
                        double d2;
                        float f15 = f7 * f7;
                        float f16 = f12 * f12 + f15;
                        double d5 = Math.sqrt(f16);
                        double d7 = d5 - (d2 = (double)(f14 = this.mTouchSlop));
                        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                        if (object >= 0) {
                            n4 = 1;
                            f5 = Float.MIN_VALUE;
                        }
                        this.mIsDragging = n4;
                    }
                    if ((n4 = this.mIsDragging) != 0) {
                        onGestureListener = this.mListener;
                        onGestureListener.onDrag(f7, f12);
                        this.mLastTouchX = f11;
                        this.mLastTouchY = f6;
                        VelocityTracker velocityTracker = this.mVelocityTracker;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker;
                n3 = (int)(this.mIsDragging ? 1 : 0);
                if (n3 != 0 && (velocityTracker = this.mVelocityTracker) != null) {
                    float f17;
                    this.mLastTouchX = f17 = this.getActiveX(motionEvent);
                    this.mLastTouchY = f17 = this.getActiveY(motionEvent);
                    this.mVelocityTracker.addMovement(motionEvent);
                    motionEvent = this.mVelocityTracker;
                    n3 = 1000;
                    motionEvent.computeCurrentVelocity(n3);
                    motionEvent = this.mVelocityTracker;
                    float f18 = motionEvent.getXVelocity();
                    velocityTracker = this.mVelocityTracker;
                    f17 = velocityTracker.getYVelocity();
                    f5 = Math.abs(f18);
                    float f19 = Math.abs(f17);
                    f5 = Math.max(f5, f19);
                    f19 = this.mMinimumVelocity;
                    n4 = f5 == f19 ? 0 : (f5 > f19 ? 1 : -1);
                    if (n4 >= 0) {
                        onGestureListener = this.mListener;
                        f19 = this.mLastTouchX;
                        float f20 = this.mLastTouchY;
                        f18 = -f18;
                        f17 = -f17;
                        onGestureListener.onFling(f19, f20, f18, f17);
                    }
                }
                if ((motionEvent = this.mVelocityTracker) != null) {
                    motionEvent.recycle();
                    this.mVelocityTracker = null;
                }
            }
        } else {
            float f22;
            float f23;
            Object object = VelocityTracker.obtain();
            this.mVelocityTracker = object;
            if (object != null) {
                object.addMovement(motionEvent);
            } else {
                object = LogManager.getLogger();
                String string2 = LOG_TAG;
                String string3 = "Velocity tracker is null";
                object.i(string2, string3);
            }
            this.mLastTouchX = f23 = this.getActiveX(motionEvent);
            this.mLastTouchY = f22 = this.getActiveY(motionEvent);
            this.mIsDragging = false;
        }
        return n7 != 0;
    }

    public void setOnGestureListener(OnGestureListener onGestureListener) {
        this.mListener = onGestureListener;
    }
}

