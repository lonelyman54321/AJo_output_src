/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.auth.api;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyClient;
import com.google.android.gms.auth.api.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.internal.auth.zzbo;
import com.google.android.gms.internal.auth.zzbt;

public final class AuthProxy {
    public static final Api API;
    public static final ProxyApi ProxyApi;
    public static final Api$ClientKey zza;
    private static final Api$AbstractClientBuilder zzb;

    static {
        Api api;
        Object object = new Api$ClientKey();
        zza = object;
        zza zza2 = new zza();
        zzb = zza2;
        API = api = new Api("Auth.PROXY_API", zza2, (Api$ClientKey)object);
        ProxyApi = object = new zzbt();
    }

    public static ProxyClient getClient(Activity activity, AuthProxyOptions authProxyOptions) {
        zzbo zzbo2 = new zzbo(activity, authProxyOptions);
        return zzbo2;
    }

    public static ProxyClient getClient(Context context, AuthProxyOptions authProxyOptions) {
        zzbo zzbo2 = new zzbo(context, authProxyOptions);
        return zzbo2;
    }
}

