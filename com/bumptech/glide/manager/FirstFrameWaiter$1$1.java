/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnDrawListener
 */
package com.bumptech.glide.manager;

import android.view.ViewTreeObserver;
import com.bumptech.glide.manager.FirstFrameWaiter$1;
import java.util.concurrent.atomic.AtomicBoolean;

class FirstFrameWaiter$1$1
implements Runnable {
    public final /* synthetic */ ViewTreeObserver.OnDrawListener a;
    public final /* synthetic */ FirstFrameWaiter$1 b;

    public FirstFrameWaiter$1$1(FirstFrameWaiter$1 var1_1, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.b = var1_1;
        this.a = onDrawListener;
    }

    public final void run() {
        Object object = M31.a();
        object.getClass();
        dz3.a();
        object = ((M31)object).d;
        boolean bl2 = true;
        ((AtomicBoolean)object).set(bl2);
        this.b.b.b = bl2;
        object = this.b.a;
        ViewTreeObserver.OnDrawListener onDrawListener = this.a;
        object.getViewTreeObserver().removeOnDrawListener(onDrawListener);
        this.b.b.a.clear();
    }
}

