/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ViewObserver
implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final HashMap d;
    public final WeakReference a;
    public final Handler b;
    public final AtomicBoolean c;

    static {
        HashMap hashMap;
        d = hashMap = new HashMap();
    }

    public ViewObserver(Activity object) {
        Looper looper;
        this.a = looper = new WeakReference(object);
        looper = Looper.getMainLooper();
        super(looper);
        this.b = object;
        super(false);
        this.c = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Throwable throwable2;
        block5: {
            Thread thread2;
            j9 j92;
            block4: {
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                try {
                    int n3 = 1;
                    j92 = new j9(this, n3);
                    thread2 = Thread.currentThread();
                    Object object = Looper.getMainLooper();
                    object = object.getThread();
                    if (thread2 != object) break block4;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                j92.run();
                return;
            }
            thread2 = this.b;
            thread2.post(j92);
            return;
        }
        td0.a(this, throwable2);
    }

    public final void onGlobalLayout() {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            this.a();
            return;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
    }
}

