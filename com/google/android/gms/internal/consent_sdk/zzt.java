/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateSuccessListener;

public final class zzt
implements Runnable {
    public final /* synthetic */ ConsentInformation$OnConsentInfoUpdateSuccessListener zza;

    public /* synthetic */ zzt(ConsentInformation$OnConsentInfoUpdateSuccessListener consentInformation$OnConsentInfoUpdateSuccessListener) {
        this.zza = consentInformation$OnConsentInfoUpdateSuccessListener;
    }

    public final void run() {
        this.zza.onConsentInfoUpdateSuccess();
    }
}

