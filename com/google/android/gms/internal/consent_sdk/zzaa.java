/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzan;
import com.google.android.gms.internal.consent_sdk.zzao;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzdn;
import com.google.android.gms.internal.consent_sdk.zzdr;
import com.google.android.gms.internal.consent_sdk.zze;
import com.google.android.gms.internal.consent_sdk.zzx;

public final class zzaa
implements zzdn {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzaa(zzdr zzdr2, zzdr zzdr3, zzdr zzdr4) {
        this.zza = zzdr2;
        this.zzb = zzdr3;
        this.zzc = zzdr4;
    }

    public final zzx zzb() {
        zze zze2 = (zze)this.zza.zza();
        zzan zzan2 = ((zzao)this.zzb).zzb();
        zzap zzap2 = (zzap)this.zzc.zza();
        zzx zzx2 = new zzx(zze2, zzan2, zzap2);
        return zzx2;
    }
}

