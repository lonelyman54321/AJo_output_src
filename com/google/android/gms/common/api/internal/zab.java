/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ActivityLifecycleObserver;
import com.google.android.gms.common.api.internal.zaa;
import java.lang.ref.WeakReference;

public final class zab
extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    public zab(zaa zaa2) {
        WeakReference<zaa> weakReference;
        this.zaa = weakReference = new WeakReference<zaa>(zaa2);
    }

    public final ActivityLifecycleObserver onStopCallOnce(Runnable object) {
        zaa zaa2 = (zaa)this.zaa.get();
        if (zaa2 != null) {
            com.google.android.gms.common.api.internal.zaa.zab(zaa2, (Runnable)object);
            return this;
        }
        object = new IllegalStateException("The target activity has already been GC'd");
        throw object;
    }
}

