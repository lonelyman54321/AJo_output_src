/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.ump.ConsentForm$OnConsentFormDismissedListener;
import com.google.android.ump.FormError;

public final class zzbi
implements Runnable {
    public final /* synthetic */ ConsentForm$OnConsentFormDismissedListener zza;

    public /* synthetic */ zzbi(ConsentForm$OnConsentFormDismissedListener consentForm$OnConsentFormDismissedListener) {
        this.zza = consentForm$OnConsentFormDismissedListener;
    }

    public final void run() {
        Object object = new zzg(3, "Privacy options form is not required.");
        object = ((zzg)object).zza();
        this.zza.onConsentFormDismissed((FormError)object);
    }
}

