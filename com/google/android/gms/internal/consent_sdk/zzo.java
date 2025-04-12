/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzdn;
import com.google.android.gms.internal.consent_sdk.zzdr;
import com.google.android.gms.internal.consent_sdk.zzl;

public final class zzo
implements zzdn {
    private final zzdr zza;
    private final zzdr zzb;

    public zzo(zzdr zzdr2, zzdr zzdr3) {
        this.zza = zzdr2;
        this.zzb = zzdr3;
    }

    public final zzl zzb() {
        Application application = (Application)this.zza.zza();
        zzap zzap2 = (zzap)this.zzb.zza();
        zzl zzl2 = new zzl(application, zzap2);
        return zzl2;
    }
}

