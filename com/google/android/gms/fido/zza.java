/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido;

import com.google.android.gms.common.Feature;

public final class zza {
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
    public static final Feature zzp;
    public static final Feature zzq;
    public static final Feature zzr;
    public static final Feature zzs;
    public static final Feature[] zzt;

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
        zza = feature14 = new Feature("cancel_target_direct_transfer", l2);
        zzb = feature13 = new Feature("delete_credential", l2);
        zzc = feature12 = new Feature("delete_device_public_key", l2);
        zzd = feature11 = new Feature("get_or_generate_device_public_key", l2);
        zze = feature10 = new Feature("get_passkeys", l2);
        zzf = feature9 = new Feature("update_passkey", l2);
        zzg = feature8 = new Feature("is_user_verifying_platform_authenticator_available_for_credential", l2);
        zzh = feature7 = new Feature("is_user_verifying_platform_authenticator_available", l2);
        zzi = feature6 = new Feature("privileged_api_list_credentials", 2);
        zzj = feature5 = new Feature("start_target_direct_transfer", l2);
        l2 = 3;
        zzk = feature4 = new Feature("zero_party_api_register", l2);
        zzl = feature3 = new Feature("zero_party_api_sign", l2);
        zzm = feature2 = new Feature("zero_party_api_list_discoverable_credentials", 2);
        long l3 = 1L;
        Feature[] featureArray = new Feature("zero_party_api_authenticate_passkey", l3);
        zzn = featureArray;
        Feature[] featureArray2 = featureArray;
        zzo = feature = new Feature("zero_party_api_register_passkey", l3);
        Feature feature15 = feature;
        featureArray = new Feature("zero_party_api_get_hybrid_client_registration_pending_intent", l3);
        zzp = featureArray;
        Feature[] featureArray3 = featureArray;
        zzq = feature = new Feature("zero_party_api_get_hybrid_client_sign_pending_intent", l3);
        Feature feature16 = feature;
        featureArray = new Feature("get_browser_hybrid_client_sign_pending_intent", l3);
        zzr = featureArray;
        Feature[] featureArray4 = featureArray;
        zzs = feature = new Feature("get_browser_hybrid_client_registration_pending_intent", l3);
        featureArray = new Feature[]{feature14, feature13, feature12, feature11, feature10, feature9, feature8, feature7, feature6, feature5, feature4, feature3, feature2, featureArray2, feature15, featureArray3, feature16, featureArray4, feature};
        zzt = featureArray;
    }
}

