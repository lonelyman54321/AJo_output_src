/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.zzq;
import java.util.concurrent.atomic.AtomicReference;

public final class zzr {
    private static final AtomicReference zza;

    static {
        AtomicReference<Object> atomicReference;
        zza = atomicReference = new AtomicReference<Object>(null);
    }

    public static zzq zza() {
        return (zzq)zza.get();
    }

    public static void zzb(zzq zzq2) {
        Object var2_2;
        boolean bl2;
        AtomicReference atomicReference = zza;
        do {
            var2_2 = null;
        } while (!(bl2 = atomicReference.compareAndSet(null, zzq2)) && ((var2_2 = atomicReference.get()) == null || (var2_2 = atomicReference.get()) == null));
    }
}

