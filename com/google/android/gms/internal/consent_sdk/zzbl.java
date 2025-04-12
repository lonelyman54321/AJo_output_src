/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentForm$OnConsentFormDismissedListener;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener;

public final class zzbl
implements UserMessagingPlatform$OnConsentFormLoadSuccessListener {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ ConsentForm$OnConsentFormDismissedListener zzb;

    public /* synthetic */ zzbl(Activity activity, ConsentForm$OnConsentFormDismissedListener consentForm$OnConsentFormDismissedListener) {
        this.zza = activity;
        this.zzb = consentForm$OnConsentFormDismissedListener;
    }

    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        Activity activity = this.zza;
        ConsentForm$OnConsentFormDismissedListener consentForm$OnConsentFormDismissedListener = this.zzb;
        consentForm.show(activity, consentForm$OnConsentFormDismissedListener);
    }
}

