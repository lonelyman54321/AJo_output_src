/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.GoogleApiAvailabilityLight;

public final class zzbs {
    public static final String zza;
    public static final String zzb;

    static {
        String string2;
        zza = string2 = String.valueOf(GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        string2 = String.valueOf(string2);
        zzb = "ma".concat(string2);
    }
}

