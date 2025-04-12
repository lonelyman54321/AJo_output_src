/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package io.reactivex.android;

import android.os.Looper;
import io.reactivex.Scheduler;
import io.reactivex.android.MainThreadDisposable$1;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MainThreadDisposable
implements yr0_2 {
    public final AtomicBoolean a;

    public MainThreadDisposable() {
        AtomicBoolean atomicBoolean;
        this.a = atomicBoolean = new AtomicBoolean();
    }

    public abstract void a();

    public final void dispose() {
        Object object = this.a;
        Object object2 = null;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (bl3) {
            object = Looper.myLooper();
            if (object == (object2 = Looper.getMainLooper())) {
                this.a();
            } else {
                object = ti_2.a();
                object2 = new MainThreadDisposable$1(this);
                ((Scheduler)object).b((Runnable)object2);
            }
        }
    }

    public final boolean isDisposed() {
        return this.a.get();
    }
}

