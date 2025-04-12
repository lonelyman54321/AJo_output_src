/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.Feature;

public final class zbbi {
    public static final Feature zba;
    public static final Feature zbb;
    public static final Feature zbc;
    public static final Feature zbd;
    public static final Feature zbe;
    public static final Feature zbf;
    public static final Feature zbg;
    public static final Feature zbh;
    public static final Feature[] zbi;

    static {
        Feature feature;
        Feature feature2;
        Feature feature3;
        Feature feature4;
        Feature feature5;
        Feature feature6;
        Feature feature7;
        Feature feature8;
        zba = feature8 = new Feature("auth_api_credentials_begin_sign_in", 8);
        zbb = feature7 = new Feature("auth_api_credentials_sign_out", 2);
        long l2 = 1L;
        zbc = feature6 = new Feature("auth_api_credentials_authorize", l2);
        zbd = feature5 = new Feature("auth_api_credentials_revoke_access", l2);
        zbe = feature4 = new Feature("auth_api_credentials_save_password", 4);
        zbf = feature3 = new Feature("auth_api_credentials_get_sign_in_intent", 6);
        long l3 = 3;
        zbg = feature2 = new Feature("auth_api_credentials_save_account_linking_token", l3);
        zbh = feature = new Feature("auth_api_credentials_get_phone_number_hint_intent", l3);
        Feature[] featureArray = new Feature[]{feature8, feature7, feature6, feature5, feature4, feature3, feature2, feature};
        zbi = featureArray;
    }
}

