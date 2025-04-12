/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.google.android.gms.internal.consent_sdk.zzu;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateFailureListener;
import com.google.android.ump.ConsentInformation$OnConsentInfoUpdateSuccessListener;
import com.google.android.ump.ConsentRequestParameters;

public final class zzq
implements Runnable {
    public final /* synthetic */ zzu zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ ConsentRequestParameters zzc;
    public final /* synthetic */ ConsentInformation$OnConsentInfoUpdateSuccessListener zzd;
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateFailureListener zze;

    public /* synthetic */ zzq(zzu zzu2, Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation$OnConsentInfoUpdateSuccessListener consentInformation$OnConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zza = zzu2;
        this.zzb = activity;
        this.zzc = consentRequestParameters;
        this.zzd = consentInformation$OnConsentInfoUpdateSuccessListener;
        this.zze = onConsentInfoUpdateFailureListener;
    }

    public final void run() {
        zzu zzu2 = this.zza;
        Activity activity = this.zzb;
        ConsentRequestParameters consentRequestParameters = this.zzc;
        ConsentInformation$OnConsentInfoUpdateSuccessListener consentInformation$OnConsentInfoUpdateSuccessListener = this.zzd;
        ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener = this.zze;
        zzu2.zzb(activity, consentRequestParameters, consentInformation$OnConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener);
    }
}

