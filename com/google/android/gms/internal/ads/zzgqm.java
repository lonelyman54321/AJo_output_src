/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgwm;
import com.google.android.gms.internal.ads.zzgze;

public final class zzgqm
implements zzgqq {
    private final zzgze zza;
    private final zzgwm zzb;

    private zzgqm(zzgwm zzgwm2, zzgze zzgze2) {
        this.zzb = zzgwm2;
        this.zza = zzgze2;
    }

    public static zzgqm zza(zzgwm zzgwm2) {
        zzgze zzgze2 = zzgra.zza(zzgwm2.zzi());
        zzgqm zzgqm2 = new zzgqm(zzgwm2, zzgze2);
        return zzgqm2;
    }

    public static zzgqm zzb(zzgwm zzgwm2) {
        zzgze zzgze2 = zzgra.zzb(zzgwm2.zzi());
        zzgqm zzgqm2 = new zzgqm(zzgwm2, zzgze2);
        return zzgqm2;
    }

    public final zzgwm zzc() {
        return this.zzb;
    }

    public final zzgze zzd() {
        return this.zza;
    }
}

