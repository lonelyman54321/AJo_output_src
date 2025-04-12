/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.search;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.internal.icing.zzbc;
import com.google.android.gms.search.SearchAuthApi;
import com.google.android.gms.search.zzb;

public class SearchAuth {
    public static final Api API;
    public static final SearchAuthApi SearchAuthApi;
    public static final Api$ClientKey zza;
    private static final Api$AbstractClientBuilder zzb;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        Object object = new zzb();
        zzb = object;
        zza = api$ClientKey = new Api$ClientKey();
        API = api = new Api("SearchAuth.API", (Api$AbstractClientBuilder)object, api$ClientKey);
        SearchAuthApi = object = new zzbc();
    }

    private SearchAuth() {
    }
}

