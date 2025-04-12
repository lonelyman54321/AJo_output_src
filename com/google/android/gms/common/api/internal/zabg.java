/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.api.internal.zabi;

abstract class zabg {
    private final zabf zaa;

    public zabg(zabf zabf2) {
        this.zaa = zabf2;
    }

    public abstract void zaa();

    public final void zab(zabi zabi2) {
        Throwable throwable2;
        block5: {
            block4: {
                Object object = zabi.zah(zabi2);
                object.lock();
                try {
                    object = zabi.zag(zabi2);
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                zabf zabf2 = this.zaa;
                if (object != zabf2) break block4;
                this.zaa();
            }
            zabi.zah(zabi2).unlock();
            return;
        }
        zabi.zah(zabi2).unlock();
        throw throwable2;
    }
}

