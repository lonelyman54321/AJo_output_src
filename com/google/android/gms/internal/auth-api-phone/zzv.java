/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.internal.auth-api-phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsCodeBrowserClient;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.internal.auth-api-phone.zzac;
import com.google.android.gms.internal.auth-api-phone.zzs;
import com.google.android.gms.internal.auth-api-phone.zzt;
import com.google.android.gms.tasks.Task;

public final class zzv
extends GoogleApi
implements SmsCodeBrowserClient {
    private static final Api$ClientKey zza;
    private static final Api$AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zza = api$ClientKey = new Api$ClientKey();
        zzt zzt2 = new zzt();
        zzb = zzt2;
        zzc = api = new Api("SmsCodeBrowser.API", zzt2, api$ClientKey);
    }

    public zzv(Activity activity) {
        Api api = zzc;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public zzv(Context context) {
        Api api = zzc;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public final Task startSmsCodeRetriever() {
        Object object = TaskApiCall.builder();
        Feature feature = zzac.zzb;
        Object object2 = new Feature[]{feature};
        object = ((TaskApiCall$Builder)object).setFeatures((Feature)object2);
        object2 = new zzs(this);
        object = ((TaskApiCall$Builder)object).run((RemoteCall)object2).setMethodKey(1566).build();
        return this.doWrite((TaskApiCall)object);
    }
}

