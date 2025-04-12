/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import com.google.android.gms.internal.consent_sdk.zzan;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzdn;
import com.google.android.gms.internal.consent_sdk.zzdp;
import com.google.android.gms.internal.consent_sdk.zzdr;
import java.util.concurrent.Executor;

public final class zzao
implements zzdn {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;

    public zzao(zzdr zzdr2, zzdr zzdr3, zzdr zzdr4) {
        this.zza = zzdr2;
        this.zzb = zzdr3;
        this.zzc = zzdr4;
    }

    public final zzan zzb() {
        Application application = (Application)this.zza.zza();
        zzap zzap2 = (zzap)this.zzb.zza();
        Executor executor = zzcr.zzb;
        zzdp.zza(executor);
        zzan zzan2 = new zzan(application, zzap2, executor);
        return zzan2;
    }
}

