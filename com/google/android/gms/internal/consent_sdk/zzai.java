/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzag;
import com.google.android.gms.internal.consent_sdk.zzah;
import com.google.android.gms.internal.consent_sdk.zzdp;

final class zzai {
    private Application zza;

    private zzai() {
    }

    public /* synthetic */ zzai(zzah zzah2) {
    }

    public final zza zza() {
        zzdp.zzb(this.zza, Application.class);
        Application application = this.zza;
        zzag zzag2 = new zzag(application, null);
        return zzag2;
    }

    public final zzai zzb(Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }
}

