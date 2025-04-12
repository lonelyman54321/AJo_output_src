/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.getkeepsafe.taptargetview;

import android.view.View;
import android.view.ViewTreeObserver;
import com.getkeepsafe.taptargetview.ViewUtil;

class ViewUtil$1
implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ViewTreeObserver val$observer;
    final /* synthetic */ Runnable val$runnable;
    final /* synthetic */ View val$view;

    public ViewUtil$1(ViewTreeObserver viewTreeObserver, View view, Runnable runnable2) {
        this.val$observer = viewTreeObserver;
        this.val$view = view;
        this.val$runnable = runnable2;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.val$observer;
        boolean bl2 = viewTreeObserver.isAlive();
        viewTreeObserver = bl2 ? this.val$observer : this.val$view.getViewTreeObserver();
        ViewUtil.removeOnGlobalLayoutListener(viewTreeObserver, this);
        this.val$runnable.run();
    }
}

