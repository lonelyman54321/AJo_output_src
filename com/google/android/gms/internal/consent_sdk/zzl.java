/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzci;
import com.google.android.gms.internal.consent_sdk.zzn;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentDebugSettings$Builder;
import com.google.android.ump.ConsentRequestParameters;

final class zzl {
    private final Application zza;
    private final zzap zzb;

    public zzl(Application application, zzap zzap2) {
        this.zza = application;
        this.zzb = zzap2;
    }

    public static /* bridge */ /* synthetic */ Application zza(zzl zzl2) {
        return zzl2.zza;
    }

    public static /* bridge */ /* synthetic */ zzap zzb(zzl zzl2) {
        return zzl2.zzb;
    }

    public final zzci zzc(Activity activity, ConsentRequestParameters consentRequestParameters) {
        Object object;
        Object object2 = consentRequestParameters.getConsentDebugSettings();
        if (object2 == null) {
            object2 = this.zza;
            object = new ConsentDebugSettings$Builder((Context)object2);
            object2 = ((ConsentDebugSettings$Builder)object).build();
        }
        ConsentDebugSettings consentDebugSettings = object2;
        object = object2;
        object2 = new zzn(this, activity, consentDebugSettings, consentRequestParameters, null);
        return zzn.zza((zzn)object2);
    }
}

