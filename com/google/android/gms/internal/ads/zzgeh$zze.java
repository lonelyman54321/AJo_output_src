/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;
import com.google.android.gms.internal.ads.zzgeh$zza;
import com.google.android.gms.internal.ads.zzgeh$zzd;
import com.google.android.gms.internal.ads.zzgeh$zzk;
import com.google.android.gms.internal.ads.zzgei;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class zzgeh$zze
extends zzgeh$zza {
    final AtomicReferenceFieldUpdater zza;
    final AtomicReferenceFieldUpdater zzb;
    final AtomicReferenceFieldUpdater zzc;
    final AtomicReferenceFieldUpdater zzd;
    final AtomicReferenceFieldUpdater zze;

    public zzgeh$zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicReferenceFieldUpdater2;
        this.zzc = atomicReferenceFieldUpdater3;
        this.zzd = atomicReferenceFieldUpdater4;
        this.zze = atomicReferenceFieldUpdater5;
    }

    public final zzgeh$zzd zza(zzgeh zzgeh2, zzgeh$zzd zzgeh$zzd) {
        return this.zzd.getAndSet(zzgeh2, zzgeh$zzd);
    }

    public final zzgeh$zzk zzb(zzgeh zzgeh2, zzgeh$zzk zzgeh$zzk) {
        return this.zzc.getAndSet(zzgeh2, zzgeh$zzk);
    }

    public final void zzc(zzgeh$zzk zzgeh$zzk, zzgeh$zzk zzgeh$zzk2) {
        this.zzb.lazySet(zzgeh$zzk, zzgeh$zzk2);
    }

    public final void zzd(zzgeh$zzk zzgeh$zzk, Thread thread2) {
        this.zza.lazySet(zzgeh$zzk, thread2);
    }

    public final boolean zze(zzgeh zzgeh2, zzgeh$zzd zzgeh$zzd, zzgeh$zzd zzgeh$zzd2) {
        return zzgei.zza(this.zzd, zzgeh2, zzgeh$zzd, zzgeh$zzd2);
    }

    public final boolean zzf(zzgeh zzgeh2, Object object, Object object2) {
        return zzgei.zza(this.zze, zzgeh2, object, object2);
    }

    public final boolean zzg(zzgeh zzgeh2, zzgeh$zzk zzgeh$zzk, zzgeh$zzk zzgeh$zzk2) {
        return zzgei.zza(this.zzc, zzgeh2, zzgeh$zzk, zzgeh$zzk2);
    }
}

