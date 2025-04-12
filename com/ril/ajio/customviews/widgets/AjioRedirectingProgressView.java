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
import com.ril.ajio.R$color;
import com.ril.ajio.R$layout;

public class AjioRedirectingProgressView
extends FrameLayout {
    public AjioRedirectingProgressView(Context context) {
        super(context);
    }

    public AjioRedirectingProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3 = R$layout.redirect_progress_view_layout;
        View.inflate((Context)context, (int)n3, (ViewGroup)this);
        context = this.getResources();
        n3 = R$color.white;
        int n4 = context.getColor(n3);
        this.setBackgroundColor(n4);
        this.setVisibility(8);
    }

    public AjioRedirectingProgressView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4 = R$layout.redirect_progress_view_layout;
        View.inflate((Context)context, (int)n4, (ViewGroup)this);
        context = this.getResources();
        n4 = R$color.white;
        int n7 = context.getColor(n4);
        this.setBackgroundColor(n7);
        this.setVisibility(8);
    }

    public void dismiss() {
        this.setVisibility(8);
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
        this.setVisibility(0);
    }
}

