/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public class zzih {
    private int zza;

    public final void zza(int n3) {
        this.zza = n3 = this.zza | 0x20000000;
    }

    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int n3) {
        this.zza = n3;
    }

    public final boolean zzd(int n3) {
        int n4 = this.zza & n3;
        return n4 == n3;
    }

    public final boolean zze() {
        return this.zzd(0x10000000);
    }

    public final boolean zzf() {
        return this.zzd(4);
    }

    public final boolean zzg() {
        return this.zzd(1);
    }

    public final boolean zzh() {
        return this.zzd(0x20000000);
    }
}

