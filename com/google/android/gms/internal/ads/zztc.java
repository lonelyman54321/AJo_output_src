/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class zztc {
    public static /* synthetic */ boolean zza(AtomicReference atomicReference, Object object, Object object2) {
        do {
            object = null;
            boolean bl2 = atomicReference.compareAndSet(null, object2);
            if (!bl2) continue;
            return true;
        } while ((object = atomicReference.get()) == null || (object = atomicReference.get()) == null);
        return false;
    }
}

