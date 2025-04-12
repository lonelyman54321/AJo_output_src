/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeu;
import com.google.android.gms.internal.ads.zzgey;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class zzgev
extends zzgeu {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    public zzgev(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    public final int zza(zzgey zzgey2) {
        return this.zzb.decrementAndGet(zzgey2);
    }

    public final void zzb(zzgey zzgey2, Set object, Set set) {
        block0: do {
            Object var4_4;
            object = this.zza;
            do {
                var4_4 = null;
                boolean bl2 = ((AtomicReferenceFieldUpdater)object).compareAndSet(zzgey2, null, set);
                if (bl2) break block0;
            } while ((var4_4 = ((AtomicReferenceFieldUpdater)object).get(zzgey2)) == null);
        } while ((object = ((AtomicReferenceFieldUpdater)object).get(zzgey2)) == null);
    }
}

