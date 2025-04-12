/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzq;
import com.google.android.gms.internal.ads.zzt;

public final class zzr {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzr() {
        int n3;
        this.zza = n3 = -1;
        this.zzb = n3;
        this.zzc = n3;
        this.zze = n3;
        this.zzf = n3;
    }

    public /* synthetic */ zzr(zzt zzt2, zzq object) {
        int n3;
        int n4;
        this.zza = n4 = zzt2.zzd;
        this.zzb = n4 = zzt2.zze;
        this.zzc = n4 = zzt2.zzf;
        object = zzt2.zzg;
        this.zzd = (byte[])object;
        this.zze = n4 = zzt2.zzh;
        this.zzf = n3 = zzt2.zzi;
    }

    public final zzr zza(int n3) {
        this.zzf = n3;
        return this;
    }

    public final zzr zzb(int n3) {
        this.zzb = n3;
        return this;
    }

    public final zzr zzc(int n3) {
        this.zza = n3;
        return this;
    }

    public final zzr zzd(int n3) {
        this.zzc = n3;
        return this;
    }

    public final zzr zze(byte[] byArray) {
        this.zzd = byArray;
        return this;
    }

    public final zzr zzf(int n3) {
        this.zze = n3;
        return this;
    }

    public final zzt zzg() {
        int n3 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        byte[] byArray = this.zzd;
        int n8 = this.zze;
        int n10 = this.zzf;
        zzt zzt2 = new zzt(n3, n4, n7, byArray, n8, n10, null);
        return zzt2;
    }
}

