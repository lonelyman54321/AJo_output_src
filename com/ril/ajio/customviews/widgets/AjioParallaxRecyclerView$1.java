/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.ViewGroup
 */
package com.ril.ajio.customviews.widgets;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.ril.ajio.customviews.widgets.AjioParallaxRecyclerView;

class AjioParallaxRecyclerView$1
implements Runnable {
    final /* synthetic */ AjioParallaxRecyclerView this$0;
    final /* synthetic */ MotionEvent val$event;
    final /* synthetic */ ViewGroup val$parent;

    public AjioParallaxRecyclerView$1(AjioParallaxRecyclerView ajioParallaxRecyclerView, ViewGroup viewGroup, MotionEvent motionEvent) {
        this.this$0 = ajioParallaxRecyclerView;
        this.val$parent = viewGroup;
        this.val$event = motionEvent;
    }

    public void run() {
        ViewGroup viewGroup = this.val$parent;
        MotionEvent motionEvent = this.val$event;
        viewGroup.dispatchTouchEvent(motionEvent);
    }
}

