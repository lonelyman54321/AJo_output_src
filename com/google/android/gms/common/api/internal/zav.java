/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.zaaa;

final class zav
implements Runnable {
    final /* synthetic */ zaaa zaa;

    public zav(zaaa zaaa2) {
        this.zaa = zaaa2;
    }

    public final void run() {
        Object object = zaaa.zaj(this.zaa);
        object.lock();
        try {
            object = this.zaa;
            zaaa.zap((zaaa)object);
            return;
        }
        finally {
            zaaa.zaj(this.zaa).unlock();
        }
    }
}

