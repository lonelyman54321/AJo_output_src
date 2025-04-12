/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.Feature;

public final class zzo {
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
    public static final Feature zzm;
    public static final Feature zzn;
    public static final Feature zzo;
    public static final Feature[] zzp;

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
        Feature feature13;
        Feature feature14;
        long l2 = 1L;
        zza = feature14 = new Feature("name_ulr_private", l2);
        zzb = feature13 = new Feature("name_sleep_segment_request", l2);
        zzc = feature12 = new Feature("get_last_activity_feature_id", l2);
        zzd = feature11 = new Feature("support_context_feature_id", l2);
        zze = feature10 = new Feature("get_current_location", 2);
        zzf = feature9 = new Feature("get_last_location_with_request", l2);
        zzg = feature8 = new Feature("set_mock_mode_with_callback", l2);
        zzh = feature7 = new Feature("set_mock_location_with_callback", l2);
        zzi = feature6 = new Feature("inject_location_with_callback", l2);
        zzj = feature5 = new Feature("location_updates_with_callback", l2);
        zzk = feature4 = new Feature("use_safe_parcelable_in_intents", l2);
        zzl = feature3 = new Feature("flp_debug_updates", l2);
        zzm = feature2 = new Feature("google_location_accuracy_enabled", l2);
        Feature feature15 = feature2;
        zzn = feature = new Feature("geofences_with_callback", l2);
        zzo = feature2 = new Feature("location_enabled", l2);
        Feature[] featureArray = new Feature[]{feature14, feature13, feature12, feature11, feature10, feature9, feature8, feature7, feature6, feature5, feature4, feature3, feature15, feature, feature2};
        zzp = featureArray;
    }
}

