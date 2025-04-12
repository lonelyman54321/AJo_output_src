/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.ump.ConsentForm$OnConsentFormDismissedListener;
import com.google.android.ump.FormError;

public final class zzbg
implements Runnable {
    public final /* synthetic */ ConsentForm$OnConsentFormDismissedListener zza;

    public /* synthetic */ zzbg(ConsentForm$OnConsentFormDismissedListener onConsentFormDismissedListener) {
        this.zza = onConsentFormDismissedListener;
    }

    public final void run() {
        Object object = new zzg(1, "No consentInformation.");
        object = ((zzg)object).zza();
        this.zza.onConsentFormDismissed((FormError)object);
    }
}

