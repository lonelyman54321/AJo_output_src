/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnDrawListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.google.firebase.perf.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.perf.util.FirstDrawDoneListener$1;
import java.util.concurrent.atomic.AtomicReference;

public class FirstDrawDoneListener
implements ViewTreeObserver.OnDrawListener {
    private final Runnable callback;
    private final Handler mainThreadHandler;
    private final AtomicReference viewReference;

    private FirstDrawDoneListener(View view, Runnable runnable2) {
        Object object;
        Looper looper = Looper.getMainLooper();
        this.mainThreadHandler = object = new Handler(looper);
        super(view);
        this.viewReference = object;
        this.callback = runnable2;
    }

    public static /* synthetic */ void a(FirstDrawDoneListener firstDrawDoneListener, View view) {
        firstDrawDoneListener.lambda$onDraw$0(view);
    }

    private static boolean isAliveAndAttached(View view) {
        boolean bl2;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        boolean bl3 = viewTreeObserver.isAlive();
        if (bl3 && (bl2 = FirstDrawDoneListener.isAttachedToWindow(view))) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    private static boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    private /* synthetic */ void lambda$onDraw$0(View view) {
        view.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)this);
    }

    public static void registerForNextDraw(View view, Runnable object) {
        FirstDrawDoneListener firstDrawDoneListener = new FirstDrawDoneListener(view, (Runnable)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 < n4 && (n3 = (int)(FirstDrawDoneListener.isAliveAndAttached(view) ? 1 : 0)) == 0) {
            object = new FirstDrawDoneListener$1(firstDrawDoneListener);
            view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
        } else {
            view = view.getViewTreeObserver();
            view.addOnDrawListener((ViewTreeObserver.OnDrawListener)firstDrawDoneListener);
        }
    }

    public void onDraw() {
        AtomicReference atomicReference = this.viewReference;
        Object object = null;
        if ((atomicReference = (View)atomicReference.getAndSet(null)) == null) {
            return;
        }
        object = atomicReference.getViewTreeObserver();
        ho0_1 ho0_12 = new ho0_1(this, (View)atomicReference);
        object.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)ho0_12);
        atomicReference = this.mainThreadHandler;
        object = this.callback;
        atomicReference.postAtFrontOfQueue((Runnable)object);
    }
}

