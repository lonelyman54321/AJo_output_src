/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentForm$OnConsentFormDismissedListener;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener;

public final class zzbm
implements UserMessagingPlatform$OnConsentFormLoadFailureListener {
    public final /* synthetic */ ConsentForm$OnConsentFormDismissedListener zza;

    public /* synthetic */ zzbm(ConsentForm$OnConsentFormDismissedListener consentForm$OnConsentFormDismissedListener) {
        this.zza = consentForm$OnConsentFormDismissedListener;
    }

    public final void onConsentFormLoadFailure(FormError formError) {
        this.zza.onConsentFormDismissed(formError);
    }
}

