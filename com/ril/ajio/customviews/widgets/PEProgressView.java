/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public class PEProgressView
extends FrameLayout {
    private LottieAnimationView animationView = null;
    private int ref = 0;

    public PEProgressView(Context context) {
        super(context);
        this.initLayout(context);
    }

    public PEProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initLayout(context);
    }

    public PEProgressView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.initLayout(context);
    }

    private void initLayout(Context object) {
        int n3 = R$layout.loader_layout_lottie_anim;
        object = View.inflate((Context)object, (int)n3, (ViewGroup)this);
        n3 = R$id.loader_lottie_anim_view;
        object = (LottieAnimationView)object.findViewById(n3);
        this.animationView = object;
        this.setVisibility(8);
    }

    public void dismiss() {
        int n3 = this.ref;
        int n4 = 8;
        if (n3 == 0) {
            Object object = this.animationView;
            if (object != null) {
                object.i = false;
                object = object.e;
                ((yc1_1)((Object)object)).l();
            }
            this.setVisibility(n4);
            return;
        }
        this.ref = n3 += -1;
        if (n3 == 0) {
            Object object = this.animationView;
            if (object != null) {
                object.i = false;
                object = object.e;
                ((yc1_1)((Object)object)).l();
            }
            this.setVisibility(n4);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent = this.getParent();
        boolean bl2 = true;
        motionEvent.requestDisallowInterceptTouchEvent(bl2);
        return bl2;
    }

    public void show() {
        int n3;
        LottieAnimationView lottieAnimationView = this.animationView;
        if (lottieAnimationView != null) {
            lottieAnimationView.f();
        }
        this.setVisibility(0);
        this.ref = n3 = this.ref + 1;
    }
}

