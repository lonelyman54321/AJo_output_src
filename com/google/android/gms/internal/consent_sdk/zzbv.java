/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import com.google.android.gms.internal.consent_sdk.zzbu;
import com.google.android.gms.internal.consent_sdk.zzbw;
import com.google.android.gms.internal.consent_sdk.zzca;
import com.google.android.gms.internal.consent_sdk.zzcb;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzdn;
import com.google.android.gms.internal.consent_sdk.zzdp;
import com.google.android.gms.internal.consent_sdk.zzdr;

public final class zzbv
implements zzdn {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzbv(zzdr zzdr2, zzdr zzdr3, zzdr zzdr4) {
        this.zza = zzdr2;
        this.zzb = zzdr3;
        this.zzc = zzdr4;
    }

    public final zzbu zzb() {
        zzbw zzbw2 = (zzbw)((Object)this.zza.zza());
        Handler handler = zzcr.zza;
        zzdp.zza(handler);
        zzca zzca2 = ((zzcb)this.zzc).zzb();
        zzbu zzbu2 = new zzbu(zzbw2, handler, zzca2);
        return zzbu2;
    }
}

