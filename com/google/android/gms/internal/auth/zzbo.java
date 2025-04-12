/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.auth.api.proxy.ProxyClient;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.internal.auth.zzbk;
import com.google.android.gms.internal.auth.zzbl;
import com.google.android.gms.tasks.Task;

public final class zzbo
extends GoogleApi
implements ProxyClient {
    public zzbo(Activity activity, AuthProxyOptions authProxyOptions) {
        Api api = AuthProxy.API;
        if (authProxyOptions == null) {
            authProxyOptions = AuthProxyOptions.zza;
        }
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)authProxyOptions, googleApi$Settings);
    }

    public zzbo(Context context, AuthProxyOptions authProxyOptions) {
        Api api = AuthProxy.API;
        if (authProxyOptions == null) {
            authProxyOptions = AuthProxyOptions.zza;
        }
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)authProxyOptions, googleApi$Settings);
    }

    public final Task getSpatulaHeader() {
        Object object = TaskApiCall.builder();
        zzbk zzbk2 = new zzbk(this);
        object = ((TaskApiCall$Builder)object).run(zzbk2).setMethodKey(1520).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task performProxyRequest(ProxyRequest object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzbl zzbl2 = new zzbl(this, (ProxyRequest)object);
        object = taskApiCall$Builder.run(zzbl2).setMethodKey(1518).build();
        return this.doWrite((TaskApiCall)object);
    }
}

