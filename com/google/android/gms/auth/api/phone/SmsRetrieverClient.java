/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverApi;
import com.google.android.gms.auth.api.phone.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.tasks.Task;

public abstract class SmsRetrieverClient
extends GoogleApi
implements SmsRetrieverApi {
    private static final Api$ClientKey zza;
    private static final Api$AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zza = api$ClientKey = new Api$ClientKey();
        zza zza2 = new zza();
        zzb = zza2;
        zzc = api = new Api("SmsRetriever.API", zza2, api$ClientKey);
    }

    public SmsRetrieverClient(Activity activity) {
        Api api = zzc;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public SmsRetrieverClient(Context context) {
        Api api = zzc;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public abstract Task startSmsRetriever();

    public abstract Task startSmsUserConsent(String var1);
}

