/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.ump;

import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

public final class ConsentRequestParameters$Builder {
    private boolean zza;
    private String zzb;
    private ConsentDebugSettings zzc;

    public static /* bridge */ /* synthetic */ ConsentDebugSettings zza(ConsentRequestParameters$Builder consentRequestParameters$Builder) {
        return consentRequestParameters$Builder.zzc;
    }

    public static /* bridge */ /* synthetic */ String zzb(ConsentRequestParameters$Builder consentRequestParameters$Builder) {
        return consentRequestParameters$Builder.zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzc(ConsentRequestParameters$Builder consentRequestParameters$Builder) {
        return consentRequestParameters$Builder.zza;
    }

    public ConsentRequestParameters build() {
        ConsentRequestParameters consentRequestParameters = new ConsentRequestParameters(this, null);
        return consentRequestParameters;
    }

    public ConsentRequestParameters$Builder setAdMobAppId(String string2) {
        this.zzb = string2;
        return this;
    }

    public ConsentRequestParameters$Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
        this.zzc = consentDebugSettings;
        return this;
    }

    public ConsentRequestParameters$Builder setTagForUnderAgeOfConsent(boolean bl2) {
        this.zza = bl2;
        return this;
    }
}

