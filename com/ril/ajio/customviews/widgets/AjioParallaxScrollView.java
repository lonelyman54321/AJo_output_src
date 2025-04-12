/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ScrollView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.ril.ajio.customviews.widgets.AjioParallaxScrollView$1;
import com.ril.ajio.customviews.widgets.ScrollViewCallbacks;
import com.ril.ajio.customviews.widgets.Scrollable;
import com.ril.ajio.customviews.widgets.ViewSavedState;

public class AjioParallaxScrollView
extends ScrollView
implements Scrollable {
    private ScrollViewCallbacks mCallbacks;
    private boolean mDragging;
    private boolean mFirstScroll;
    private boolean mIntercepted;
    private MotionEvent mPrevMoveEvent;
    private int mPrevScrollY;
    private int mScrollY;
    private ViewGroup mTouchInterceptionViewGroup;

    public AjioParallaxScrollView(Context context) {
        super(context);
    }

    public AjioParallaxScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AjioParallaxScrollView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    private void dispatchOnScrollChanged(int n3, boolean bl2, boolean bl3) {
        ScrollViewCallbacks scrollViewCallbacks = this.mCallbacks;
        if (scrollViewCallbacks != null) {
            scrollViewCallbacks.onScrollChanged(n3, bl2, bl3);
        }
    }

    private boolean hasNoCallbacks() {
        boolean bl2;
        ScrollViewCallbacks scrollViewCallbacks = this.mCallbacks;
        if (scrollViewCallbacks == null) {
            bl2 = true;
        } else {
            bl2 = false;
            scrollViewCallbacks = null;
        }
        return bl2;
    }

    public int getCurrentScrollY() {
        return this.mScrollY;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int n3 = this.hasNoCallbacks();
        if (n3 != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        n3 = motionEvent.getActionMasked();
        if (n3 == 0) {
            n3 = 1;
            this.mDragging = n3;
            this.mFirstScroll = n3;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onRestoreInstanceState(Parcelable object) {
        int n3;
        object = (ViewSavedState)((Object)object);
        this.mPrevScrollY = n3 = object.prevScrollY;
        this.mScrollY = n3 = object.scrollY;
        object = object.getSuperState();
        super.onRestoreInstanceState(object);
    }

    public Parcelable onSaveInstanceState() {
        int n3;
        Parcelable parcelable = super.onSaveInstanceState();
        ViewSavedState viewSavedState = new ViewSavedState(parcelable);
        viewSavedState.prevScrollY = n3 = this.mPrevScrollY;
        viewSavedState.scrollY = n3 = this.mScrollY;
        return viewSavedState;
    }

    public void onScrollChanged(int n3, int n4, int n7, int n8) {
        super.onScrollChanged(n3, n4, n7, n8);
        n3 = (int)(this.hasNoCallbacks() ? 1 : 0);
        if (n3 != 0) {
            return;
        }
        this.mScrollY = n4;
        n3 = (int)(this.mFirstScroll ? 1 : 0);
        n7 = (int)(this.mDragging ? 1 : 0);
        this.dispatchOnScrollChanged(n4, n3 != 0, n7 != 0);
        n3 = (int)(this.mFirstScroll ? 1 : 0);
        if (n3 != 0) {
            n3 = 0;
            this.mFirstScroll = false;
        }
        this.mPrevScrollY = n4;
    }

    public boolean onStartNestedScroll(View view, View view2, int n3) {
        return super.onStartNestedScroll(view, view2, n3);
    }

    public boolean onTouchEvent(MotionEvent object) {
        block8: {
            block6: {
                MotionEvent motionEvent;
                float f5;
                int n3;
                int n4;
                int n7;
                block7: {
                    n7 = this.hasNoCallbacks();
                    if (n7 != 0) {
                        return super.onTouchEvent(object);
                    }
                    n7 = object.getActionMasked();
                    if (n7 == (n4 = 1)) break block6;
                    n3 = 2;
                    f5 = 2.8E-45f;
                    if (n7 == n3) break block7;
                    n4 = 3;
                    if (n7 == n4) break block6;
                    break block8;
                }
                MotionEvent motionEvent2 = this.mPrevMoveEvent;
                if (motionEvent2 == null) {
                    this.mPrevMoveEvent = object;
                }
                float f6 = object.getY();
                f5 = this.mPrevMoveEvent.getY();
                f6 -= f5;
                this.mPrevMoveEvent = motionEvent = MotionEvent.obtainNoHistory((MotionEvent)object);
                f5 = (float)this.getCurrentScrollY() - f6;
                n7 = 0;
                f6 = 0.0f;
                motionEvent2 = null;
                float f7 = f5 - 0.0f;
                n3 = (int)(f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1));
                if (n3 <= 0) {
                    AjioParallaxScrollView ajioParallaxScrollView;
                    n3 = (int)(this.mIntercepted ? 1 : 0);
                    if (n3 != 0) {
                        return false;
                    }
                    motionEvent = this.mTouchInterceptionViewGroup;
                    motionEvent = motionEvent == null && (n3 = (motionEvent = this.getParent()) instanceof ViewGroup) != 0 ? (ViewGroup)this.getParent() : this.mTouchInterceptionViewGroup;
                    float f8 = 0.0f;
                    for (ajioParallaxScrollView = this; ajioParallaxScrollView != null && ajioParallaxScrollView != motionEvent; ajioParallaxScrollView = (View)ajioParallaxScrollView.getParent()) {
                        int n8 = ajioParallaxScrollView.getLeft();
                        int n10 = ajioParallaxScrollView.getScrollX();
                        float f11 = n8 - n10;
                        f6 += f11;
                        n8 = ajioParallaxScrollView.getTop();
                        n10 = ajioParallaxScrollView.getScrollY();
                        f11 = n8 -= n10;
                        f8 += f11;
                    }
                    ajioParallaxScrollView = MotionEvent.obtainNoHistory((MotionEvent)object);
                    ajioParallaxScrollView.offsetLocation(f6, f8);
                    n7 = (int)(motionEvent.onInterceptTouchEvent((MotionEvent)ajioParallaxScrollView) ? 1 : 0);
                    if (n7 != 0) {
                        this.mIntercepted = n4;
                        ajioParallaxScrollView.setAction(0);
                        object = new AjioParallaxScrollView$1(this, (ViewGroup)motionEvent, (MotionEvent)ajioParallaxScrollView);
                        this.post((Runnable)object);
                        return false;
                    }
                    return super.onTouchEvent(object);
                }
                break block8;
            }
            this.mIntercepted = false;
            this.mDragging = false;
        }
        return super.onTouchEvent(object);
    }

    public void scrollVerticallyTo(int n3) {
        this.scrollTo(0, n3);
    }

    public void setScrollViewCallbacks(ScrollViewCallbacks scrollViewCallbacks) {
        this.mCallbacks = scrollViewCallbacks;
    }

    public void setTouchInterceptionViewGroup(ViewGroup viewGroup) {
        this.mTouchInterceptionViewGroup = viewGroup;
    }
}

