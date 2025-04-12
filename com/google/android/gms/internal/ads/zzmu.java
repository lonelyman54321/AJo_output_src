/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzcl;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzlp;

public final class zzmu
implements zzlp {
    private final zzer zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzcl zze;

    public zzmu(zzer object) {
        this.zza = object;
        this.zze = object = zzcl.zza;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long zza() {
        long l2 = this.zzc;
        boolean bl2 = this.zzb;
        if (!bl2) return l2;
        long l3 = SystemClock.elapsedRealtime();
        long l4 = this.zzd;
        l3 -= l4;
        zzcl zzcl2 = this.zze;
        float f5 = zzcl2.zzc;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        l3 = object == false ? zzgd.zzr(l3) : zzcl2.zza(l3);
        return l2 += l3;
    }

    public final void zzb(long l2) {
        this.zzc = l2;
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzd = l2 = SystemClock.elapsedRealtime();
        }
    }

    public final zzcl zzc() {
        return this.zze;
    }

    public final void zzd() {
        boolean bl2 = this.zzb;
        if (!bl2) {
            long l2;
            this.zzd = l2 = SystemClock.elapsedRealtime();
            this.zzb = bl2 = true;
        }
    }

    public final void zze() {
        boolean bl2 = this.zzb;
        if (bl2) {
            long l2 = this.zza();
            this.zzb(l2);
            bl2 = false;
            this.zzb = false;
        }
    }

    public final void zzg(zzcl zzcl2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            long l2 = this.zza();
            this.zzb(l2);
        }
        this.zze = zzcl2;
    }

    public final /* synthetic */ boolean zzj() {
        throw null;
    }
}

