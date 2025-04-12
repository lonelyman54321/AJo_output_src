/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnDrawListener
 */
package com.google.firebase.perf.util;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.perf.util.FirstDrawDoneListener;

class FirstDrawDoneListener$1
implements View.OnAttachStateChangeListener {
    final /* synthetic */ FirstDrawDoneListener val$listener;

    public FirstDrawDoneListener$1(FirstDrawDoneListener firstDrawDoneListener) {
        this.val$listener = firstDrawDoneListener;
    }

    public void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        FirstDrawDoneListener firstDrawDoneListener = this.val$listener;
        viewTreeObserver.addOnDrawListener((ViewTreeObserver.OnDrawListener)firstDrawDoneListener);
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }
}

