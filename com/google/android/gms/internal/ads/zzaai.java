/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzaaa;
import com.google.android.gms.internal.ads.zzaac;
import com.google.android.gms.internal.ads.zzaad;
import com.google.android.gms.internal.ads.zzaae;
import com.google.android.gms.internal.ads.zzaaf;
import com.google.android.gms.internal.ads.zzaag;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class zzaai {
    public static final zzaac zza;
    public static final zzaac zzb;
    public static final zzaac zzc;
    public static final zzaac zzd;
    private final ExecutorService zze;
    private zzaad zzf;
    private IOException zzg;

    static {
        zzaac zzaac2;
        long l2 = -9223372036854775807L;
        zza = zzaac2 = new zzaac(0, l2, null);
        zzb = zzaac2 = new zzaac(1, l2, null);
        zzc = zzaac2 = new zzaac(2, l2, null);
        zzd = zzaac2 = new zzaac(3, l2, null);
    }

    public zzaai(String object) {
        this.zze = object = zzgd.zzE("ExoPlayer:Loader:ProgressiveMediaPeriod");
    }

    public static zzaac zzb(boolean bl2, long l2) {
        zzaac zzaac2 = new zzaac((int)(bl2 ? 1 : 0), l2, null);
        return zzaac2;
    }

    public static /* bridge */ /* synthetic */ zzaad zzc(zzaai zzaai2) {
        return zzaai2.zzf;
    }

    public static /* bridge */ /* synthetic */ ExecutorService zzd(zzaai zzaai2) {
        return zzaai2.zze;
    }

    public static /* bridge */ /* synthetic */ void zze(zzaai zzaai2, zzaad zzaad2) {
        zzaai2.zzf = zzaad2;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzaai zzaai2, IOException iOException) {
        zzaai2.zzg = iOException;
    }

    public final long zza(zzaae zzaae2, zzaaa zzaaa2, int n3) {
        Looper looper = Looper.myLooper();
        zzeq.zzb(looper);
        this.zzg = null;
        long l2 = SystemClock.elapsedRealtime();
        zzaad zzaad2 = new zzaad(this, looper, zzaae2, zzaaa2, n3, l2);
        zzaad2.zzc(0L);
        return l2;
    }

    public final void zzg() {
        zzaad zzaad2 = this.zzf;
        zzeq.zzb(zzaad2);
        zzaad2.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int n3) {
        Object object = this.zzg;
        if (object == null) {
            object = this.zzf;
            if (object != null) {
                ((zzaad)object).zzb(n3);
            }
            return;
        }
        throw object;
    }

    public final void zzj(zzaaf zzaaf2) {
        Object object = this.zzf;
        if (object != null) {
            boolean bl2 = true;
            ((zzaad)object).zza(bl2);
        }
        object = this.zze;
        zzaag zzaag2 = new zzaag(zzaaf2);
        object.execute(zzaag2);
        this.zze.shutdown();
    }

    public final boolean zzk() {
        IOException iOException = this.zzg;
        return iOException != null;
    }

    public final boolean zzl() {
        zzaad zzaad2 = this.zzf;
        return zzaad2 != null;
    }
}

