/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class zzgei {
    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object object, Object object2, Object object3) {
        Object v4;
        do {
            boolean bl2;
            if (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(object, object2, object3))) continue;
            return true;
        } while ((v4 = atomicReferenceFieldUpdater.get(object)) == object2 || (v4 = atomicReferenceFieldUpdater.get(object)) == object2);
        return false;
    }
}

