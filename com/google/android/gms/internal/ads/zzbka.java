/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbjz;

public final class zzbka {
    private final zzg zza;
    private final zzf zzb;
    private zzbiq zzc;

    public zzbka(zzg zzg2, zzf zzf2) {
        this.zza = zzg2;
        this.zzb = zzf2;
    }

    public static /* bridge */ /* synthetic */ zzf zza(zzbka zzbka2) {
        return zzbka2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzg zzb(zzbka zzbka2) {
        return zzbka2.zza;
    }

    public static /* bridge */ /* synthetic */ zzbiq zze(zzbka zzbka2, zzbip zzbip2) {
        return zzbka2.zzf(zzbip2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzbiq zzf(zzbip zzbip2) {
        synchronized (this) {
            zzbiq zzbiq2 = this.zzc;
            if (zzbiq2 != null) {
                return zzbiq2;
            }
            this.zzc = zzbiq2 = new zzbiq(zzbip2);
            return zzbiq2;
        }
    }

    public final zzbiz zzc() {
        Object object = this.zzb;
        if (object == null) {
            return null;
        }
        object = new zzbjx(this, null);
        return object;
    }

    public final zzbjc zzd() {
        zzbjz zzbjz2 = new zzbjz(this, null);
        return zzbjz2;
    }
}

