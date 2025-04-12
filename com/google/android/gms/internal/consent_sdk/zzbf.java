/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener;

public final class zzbf
implements UserMessagingPlatform$OnConsentFormLoadFailureListener {
    public static final /* synthetic */ zzbf zza;

    static {
        zzbf zzbf2;
        zza = zzbf2 = new zzbf();
    }

    private /* synthetic */ zzbf() {
    }

    public final void onConsentFormLoadFailure(FormError object) {
        object = String.valueOf(((FormError)object).getMessage());
        "Failed to load and cache a form, error=".concat((String)object);
    }
}

