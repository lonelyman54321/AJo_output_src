/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateFailureListener;
import com.google.android.ump.FormError;

public final class zzr
implements Runnable {
    public final /* synthetic */ ConsentInformation$OnConsentInfoUpdateFailureListener zza;
    public final /* synthetic */ zzg zzb;

    public /* synthetic */ zzr(ConsentInformation$OnConsentInfoUpdateFailureListener consentInformation$OnConsentInfoUpdateFailureListener, zzg zzg2) {
        this.zza = consentInformation$OnConsentInfoUpdateFailureListener;
        this.zzb = zzg2;
    }

    public final void run() {
        ConsentInformation$OnConsentInfoUpdateFailureListener consentInformation$OnConsentInfoUpdateFailureListener = this.zza;
        FormError formError = this.zzb.zza();
        consentInformation$OnConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(formError);
    }
}

