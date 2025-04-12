/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzada;
import com.google.android.gms.internal.ads.zzadb;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;

public final class zzacy
implements zzaet {
    private final zzadb zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzacy(zzadb zzadb2, long l2, long l3, long l4, long l7, long l8, long l12) {
        this.zza = zzadb2;
        this.zzb = l2;
        this.zzc = l4;
        this.zzd = l7;
        this.zze = l8;
        this.zzf = l12;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzacy zzacy2) {
        return zzacy2.zzf;
    }

    public static /* bridge */ /* synthetic */ long zzc(zzacy zzacy2) {
        return zzacy2.zze;
    }

    public static /* bridge */ /* synthetic */ long zzd(zzacy zzacy2) {
        return zzacy2.zzc;
    }

    public static /* bridge */ /* synthetic */ long zze(zzacy zzacy2) {
        return zzacy2.zzd;
    }

    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long l2) {
        return this.zza.zza(l2);
    }

    public final zzaer zzg(long l2) {
        long l3 = this.zza.zza(l2);
        long l4 = this.zzc;
        long l7 = this.zzd;
        long l8 = this.zze;
        long l12 = this.zzf;
        long l14 = zzada.zzf(l3, 0L, l4, l7, l8, l12);
        zzaeu zzaeu2 = new zzaeu(l2, l14);
        zzaer zzaer2 = new zzaer(zzaeu2, zzaeu2);
        return zzaer2;
    }

    public final boolean zzh() {
        return true;
    }
}

