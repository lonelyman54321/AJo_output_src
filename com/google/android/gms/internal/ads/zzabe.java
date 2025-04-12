/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzabd;

final class zzabe {
    private zzabd zza;
    private zzabd zzb;
    private boolean zzc;
    private long zzd;
    private int zze;

    public zzabe() {
        zzabd zzabd2;
        this.zza = zzabd2 = new zzabd();
        this.zzb = zzabd2 = new zzabd();
        this.zzd = -9223372036854775807L;
    }

    public final float zza() {
        zzabd zzabd2 = this.zza;
        boolean bl2 = zzabd2.zzf();
        if (bl2) {
            double d2 = this.zza.zza();
            return (float)(1.0E9 / d2);
        }
        return -1.0f;
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc() {
        zzabd zzabd2 = this.zza;
        boolean bl2 = zzabd2.zzf();
        if (bl2) {
            return this.zza.zza();
        }
        return -9223372036854775807L;
    }

    public final long zzd() {
        zzabd zzabd2 = this.zza;
        boolean bl2 = zzabd2.zzf();
        if (bl2) {
            return this.zza.zzb();
        }
        return -9223372036854775807L;
    }

    public final void zze(long l2) {
        this.zza.zzc(l2);
        zzabd zzabd2 = this.zza;
        Object object = zzabd2.zzf();
        boolean bl2 = true;
        int n3 = 0;
        if (object) {
            this.zzc = false;
        } else {
            long l3 = this.zzd;
            long l4 = -9223372036854775807L;
            long l7 = l3 - l4;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object) {
                object = this.zzc;
                if (!object || (object = (zzabd2 = this.zzb).zze())) {
                    this.zzb.zzd();
                    zzabd2 = this.zzb;
                    l3 = this.zzd;
                    zzabd2.zzc(l3);
                }
                this.zzc = bl2;
                zzabd2 = this.zzb;
                zzabd2.zzc(l2);
            }
        }
        object = this.zzc;
        if (object && (object = (zzabd2 = this.zzb).zzf())) {
            zzabd zzabd3;
            zzabd2 = this.zza;
            this.zza = zzabd3 = this.zzb;
            this.zzb = zzabd2;
            this.zzc = false;
        }
        this.zzd = l2;
        zzabd zzabd4 = this.zza;
        int n4 = zzabd4.zzf();
        if (n4 == 0) {
            n4 = this.zze;
            n3 = n4 + 1;
        }
        this.zze = n3;
    }

    public final void zzf() {
        this.zza.zzd();
        this.zzb.zzd();
        this.zzc = false;
        this.zzd = -9223372036854775807L;
        this.zze = 0;
    }

    public final boolean zzg() {
        return this.zza.zzf();
    }
}

