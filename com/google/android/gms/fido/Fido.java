/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.fido;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.fido.u2f.U2fApiClient;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;

public class Fido {
    public static final String FIDO2_KEY_CREDENTIAL_EXTRA = "FIDO2_CREDENTIAL_EXTRA";
    public static final String FIDO2_KEY_ERROR_EXTRA = "FIDO2_ERROR_EXTRA";
    public static final String FIDO2_KEY_RESPONSE_EXTRA = "FIDO2_RESPONSE_EXTRA";
    public static final String KEY_RESPONSE_EXTRA = "RESPONSE_EXTRA";
    public static final Api$ClientKey zza;
    public static final Api zzb;
    public static final zzaa zzc;

    static {
        Api api;
        Object object = new Api$ClientKey();
        zza = object;
        zzab zzab2 = new zzab();
        zzb = api = new Api("Fido.U2F_ZERO_PARTY_API", zzab2, (Api$ClientKey)object);
        zzc = object = new zzaa();
    }

    private Fido() {
    }

    public static Fido2ApiClient getFido2ApiClient(Activity activity) {
        Fido2ApiClient fido2ApiClient = new Fido2ApiClient(activity);
        return fido2ApiClient;
    }

    public static Fido2ApiClient getFido2ApiClient(Context context) {
        Fido2ApiClient fido2ApiClient = new Fido2ApiClient(context);
        return fido2ApiClient;
    }

    public static Fido2PrivilegedApiClient getFido2PrivilegedApiClient(Activity activity) {
        Fido2PrivilegedApiClient fido2PrivilegedApiClient = new Fido2PrivilegedApiClient(activity);
        return fido2PrivilegedApiClient;
    }

    public static Fido2PrivilegedApiClient getFido2PrivilegedApiClient(Context context) {
        Fido2PrivilegedApiClient fido2PrivilegedApiClient = new Fido2PrivilegedApiClient(context);
        return fido2PrivilegedApiClient;
    }

    public static U2fApiClient getU2fApiClient(Activity activity) {
        U2fApiClient u2fApiClient = new U2fApiClient(activity);
        return u2fApiClient;
    }

    public static U2fApiClient getU2fApiClient(Context context) {
        U2fApiClient u2fApiClient = new U2fApiClient(context);
        return u2fApiClient;
    }
}

