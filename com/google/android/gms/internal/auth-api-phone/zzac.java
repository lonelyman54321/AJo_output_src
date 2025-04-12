/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.Feature;

public final class zzac {
    public static final Feature zza;
    public static final Feature zzb;
    public static final Feature zzc;
    public static final Feature zzd;
    public static final Feature[] zze;

    static {
        Feature feature;
        Feature feature2;
        Feature feature3;
        Feature feature4;
        long l2 = 2;
        zza = feature4 = new Feature("sms_code_autofill", l2);
        zzb = feature3 = new Feature("sms_code_browser", l2);
        zzc = feature2 = new Feature("sms_retrieve", 1L);
        zzd = feature = new Feature("user_consent", 3);
        Feature[] featureArray = new Feature[]{feature4, feature3, feature2, feature};
        zze = featureArray;
    }
}

