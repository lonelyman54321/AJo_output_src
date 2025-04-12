/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.zaau;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import java.util.concurrent.locks.Lock;

abstract class zaav
implements Runnable {
    final /* synthetic */ zaaw zab;

    public /* synthetic */ zaav(zaaw zaaw2, zaau zaau2) {
        this.zab = zaaw2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        block6: {
            Lock lock = zaaw.zap(this.zab);
            lock.lock();
            try {
                try {
                    boolean bl2 = Thread.interrupted();
                    if (!bl2) {
                        this.zaa();
                    }
                }
                catch (RuntimeException runtimeException) {
                    Object object = this.zab;
                    object = zaaw.zak((zaaw)object);
                    ((zabi)object).zam(runtimeException);
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            zaaw.zap(this.zab).unlock();
            return;
        }
        zaaw.zap(this.zab).unlock();
        throw throwable2;
    }

    public abstract void zaa();
}

