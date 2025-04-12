/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth;

import com.google.android.gms.common.Feature;

public final class zze {
    public static final Feature zza;
    public static final Feature zzb;
    public static final Feature zzc;
    public static final Feature zzd;
    public static final Feature zze;
    public static final Feature zzf;
    public static final Feature zzg;
    public static final Feature zzh;
    public static final Feature zzi;
    public static final Feature zzj;
    public static final Feature zzk;
    public static final Feature zzl;
    public static final Feature[] zzm;

    static {
        Feature feature;
        Feature feature2;
        Feature feature3;
        Feature feature4;
        Feature feature5;
        Feature feature6;
        Feature feature7;
        Feature feature8;
        Feature feature9;
        Feature feature10;
        Feature feature11;
        Feature feature12;
        long l2 = 1L;
        zza = feature12 = new Feature("account_capability_api", l2);
        zzb = feature11 = new Feature("account_data_service", 6);
        zzc = feature10 = new Feature("account_data_service_legacy", l2);
        zzd = feature9 = new Feature("account_data_service_token", 8);
        zze = feature8 = new Feature("account_data_service_visibility", l2);
        zzf = feature7 = new Feature("config_sync", l2);
        zzg = feature6 = new Feature("device_account_api", l2);
        zzh = feature5 = new Feature("gaiaid_primary_email_api", l2);
        zzi = feature4 = new Feature("google_auth_service_accounts", 2);
        zzj = feature3 = new Feature("google_auth_service_token", 3);
        zzk = feature2 = new Feature("hub_mode_api", l2);
        zzl = feature = new Feature("work_account_client_is_whitelisted", l2);
        Feature[] featureArray = new Feature[]{feature12, feature11, feature10, feature9, feature8, feature7, feature6, feature5, feature4, feature3, feature2, feature};
        zzm = featureArray;
    }
}

