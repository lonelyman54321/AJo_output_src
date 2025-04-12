/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbe
implements UserMessagingPlatform$OnConsentFormLoadSuccessListener {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzbe(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        this.zza.set(consentForm);
    }
}

