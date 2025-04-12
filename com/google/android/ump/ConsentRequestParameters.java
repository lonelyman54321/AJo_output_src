/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.ump;

import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters$Builder;
import com.google.android.ump.zzb;

public class ConsentRequestParameters {
    private final boolean zza;
    private final String zzb;
    private final ConsentDebugSettings zzc;

    public /* synthetic */ ConsentRequestParameters(ConsentRequestParameters$Builder object, zzb object2) {
        boolean bl2;
        this.zza = bl2 = ConsentRequestParameters$Builder.zzc((ConsentRequestParameters$Builder)object);
        this.zzb = object2 = ConsentRequestParameters$Builder.zzb((ConsentRequestParameters$Builder)object);
        this.zzc = object = ConsentRequestParameters$Builder.zza((ConsentRequestParameters$Builder)object);
    }

    public ConsentDebugSettings getConsentDebugSettings() {
        return this.zzc;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.zza;
    }

    public final String zza() {
        return this.zzb;
    }
}

