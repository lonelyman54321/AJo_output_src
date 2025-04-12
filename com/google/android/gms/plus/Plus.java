/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.plus;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.plus.zze;
import com.google.android.gms.internal.plus.zzi;
import com.google.android.gms.internal.plus.zzj;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.internal.zzh;
import com.google.android.gms.plus.zza;
import com.google.android.gms.plus.zzb;
import com.google.android.gms.plus.zzc;

public final class Plus {
    public static final Api API;
    public static final Account AccountApi;
    private static final Api$AbstractClientBuilder CLIENT_BUILDER;
    public static final Api$ClientKey CLIENT_KEY;
    public static final People PeopleApi;
    public static final Scope SCOPE_PLUS_LOGIN;
    public static final Scope SCOPE_PLUS_PROFILE;
    private static final zzb zze;
    private static final zza zzf;

    static {
        Api api;
        Object object = new Api$ClientKey();
        CLIENT_KEY = object;
        zzc zzc2 = new zzc();
        CLIENT_BUILDER = zzc2;
        API = api = new Api("Plus.API", zzc2, (Api$ClientKey)object);
        SCOPE_PLUS_LOGIN = object = new Scope("https://www.googleapis.com/auth/plus.login");
        SCOPE_PLUS_PROFILE = object = new Scope("https://www.googleapis.com/auth/plus.me");
        PeopleApi = object = new zzj();
        AccountApi = object = new zze();
        zze = object = new zzi();
        zzf = object = new com.google.android.gms.internal.plus.zzh();
    }

    private Plus() {
    }

    public static zzh zza(GoogleApiClient object, boolean bl2) {
        Api api;
        boolean bl3;
        if (object != null) {
            bl3 = true;
        } else {
            bl3 = false;
            api = null;
        }
        Preconditions.checkArgument(bl3, "GoogleApiClient parameter is required.");
        bl3 = ((GoogleApiClient)object).isConnected();
        String string2 = "GoogleApiClient must be connected.";
        Preconditions.checkState(bl3, string2);
        api = API;
        boolean bl4 = ((GoogleApiClient)object).hasApi(api);
        String string3 = "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.";
        Preconditions.checkState(bl4, string3);
        bl3 = ((GoogleApiClient)object).hasConnectedApi(api);
        if (bl2 && !bl3) {
            object = new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
            throw object;
        }
        if (bl3) {
            Api$ClientKey api$ClientKey = CLIENT_KEY;
            return (zzh)((GoogleApiClient)object).getClient(api$ClientKey);
        }
        return null;
    }
}

