/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class PreDrawListener
implements ViewTreeObserver.OnPreDrawListener {
    private final Runnable callbackBoQ;
    private final Runnable callbackFoQ;
    private final Handler mainThreadHandler;
    private final AtomicReference viewReference;

    private PreDrawListener(View view, Runnable runnable2, Runnable runnable3) {
        Object object;
        Looper looper = Looper.getMainLooper();
        this.mainThreadHandler = object = new Handler(looper);
        super(view);
        this.viewReference = object;
        this.callbackBoQ = runnable2;
        this.callbackFoQ = runnable3;
    }

    public static void registerForNextDraw(View view, Runnable runnable2, Runnable runnable3) {
        PreDrawListener preDrawListener = new PreDrawListener(view, runnable2, runnable3);
        view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)preDrawListener);
    }

    public boolean onPreDraw() {
        View view = this.viewReference.getAndSet(null);
        boolean bl2 = true;
        if (view == null) {
            return bl2;
        }
        view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        view = this.mainThreadHandler;
        Runnable runnable2 = this.callbackBoQ;
        view.post(runnable2);
        view = this.mainThreadHandler;
        runnable2 = this.callbackFoQ;
        view.postAtFrontOfQueue(runnable2);
        return bl2;
    }
}

