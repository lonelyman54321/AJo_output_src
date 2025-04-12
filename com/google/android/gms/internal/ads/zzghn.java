/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzghk;
import com.google.android.gms.internal.ads.zzghm;
import com.google.android.gms.internal.ads.zzgho;
import com.google.android.gms.internal.ads.zzghp;
import com.google.android.gms.internal.ads.zzghx;

public final class zzghn {
    private boolean zza;
    private final zzghk zzb;
    private final zzghi zzc;
    private final zzghx zzd;
    private zzgho zze;
    private zzghp zzf;

    public /* synthetic */ zzghn(zzghx zzghx2, zzghm object) {
        this.zzb = object = zzghk.zza;
        this.zze = null;
        this.zzf = null;
        this.zzc = null;
        this.zzd = zzghx2;
    }

    public static /* bridge */ /* synthetic */ zzghi zza(zzghn object) {
        object = ((zzghn)object).zzc;
        return null;
    }

    public static /* bridge */ /* synthetic */ zzghk zzb(zzghn zzghn2) {
        return zzghn2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzgho zze(zzghn zzghn2) {
        return zzghn2.zze;
    }

    public static /* bridge */ /* synthetic */ zzghp zzf(zzghn zzghn2) {
        return zzghn2.zzf;
    }

    public static /* bridge */ /* synthetic */ zzghx zzg(zzghn zzghn2) {
        return zzghn2.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzghn zzghn2, zzghp zzghp2) {
        zzghn2.zzf = zzghp2;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzghn zzghn2, boolean bl2) {
        zzghn2.zza = false;
    }

    public static /* bridge */ /* synthetic */ boolean zzj(zzghn zzghn2) {
        return zzghn2.zza;
    }

    public final zzghn zzc() {
        zzghp zzghp2 = this.zzf;
        if (zzghp2 != null) {
            zzghp.zzc(zzghp2);
        }
        this.zza = true;
        return this;
    }

    public final zzghn zzd() {
        zzgho zzgho2;
        this.zze = zzgho2 = zzgho.zzb();
        return this;
    }
}

