/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdz;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzpp;
import com.google.android.gms.internal.ads.zzrd;
import com.google.android.gms.internal.ads.zzrk;
import com.google.android.gms.internal.ads.zzrn;
import com.google.android.gms.internal.ads.zzrz;

public final class zzrl {
    private final Context zza;
    private final zzpp zzb;
    private boolean zzc;
    private final zzrk zzd;
    private zzrn zze;
    private zzrd zzf;

    public zzrl() {
        this.zza = null;
        Object object = zzpp.zza;
        this.zzb = object;
        this.zzd = object = zzrk.zza;
    }

    public zzrl(Context object) {
        this.zza = object;
        object = zzpp.zza;
        this.zzb = object;
        object = zzrk.zza;
        this.zzd = object;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzrl zzrl2) {
        return zzrl2.zza;
    }

    public static /* bridge */ /* synthetic */ zzpp zzb(zzrl zzrl2) {
        return zzrl2.zzb;
    }

    public static /* bridge */ /* synthetic */ zzrk zzc(zzrl zzrl2) {
        return zzrl2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzrn zze(zzrl zzrl2) {
        return zzrl2.zze;
    }

    public static /* bridge */ /* synthetic */ zzrd zzf(zzrl zzrl2) {
        return zzrl2.zzf;
    }

    public final zzrz zzd() {
        Object object;
        boolean bl2 = this.zzc;
        boolean bl3 = true;
        zzeq.zzf(bl2 ^= bl3);
        this.zzc = bl3;
        Object object2 = this.zze;
        if (object2 == null) {
            bl3 = false;
            object = new zzdz[]{};
            this.zze = object2 = new zzrn((zzdz)object);
        }
        if ((object2 = this.zzf) == null) {
            object2 = this.zza;
            this.zzf = object = new zzrd((Context)object2);
        }
        object2 = new zzrz(this, null);
        return object2;
    }
}

