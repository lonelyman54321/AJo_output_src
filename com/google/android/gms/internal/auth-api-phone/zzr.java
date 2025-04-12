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
import com.google.android.gms.auth.api.phone.SmsCodeAutofillClient;
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
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth-api-phone.zzac;
import com.google.android.gms.internal.auth-api-phone.zzk;
import com.google.android.gms.internal.auth-api-phone.zzl;
import com.google.android.gms.internal.auth-api-phone.zzm;
import com.google.android.gms.internal.auth-api-phone.zzn;
import com.google.android.gms.tasks.Task;

public final class zzr
extends GoogleApi
implements SmsCodeAutofillClient {
    private static final Api$ClientKey zza;
    private static final Api$AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zza = api$ClientKey = new Api$ClientKey();
        zzn zzn2 = new zzn();
        zzb = zzn2;
        zzc = api = new Api("SmsCodeAutofill.API", zzn2, api$ClientKey);
    }

    public zzr(Activity activity) {
        Api api = zzc;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public zzr(Context context) {
        Api api = zzc;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
    }

    public final Task checkPermissionState() {
        Object object = TaskApiCall.builder();
        Feature feature = zzac.zza;
        Object object2 = new Feature[]{feature};
        object = ((TaskApiCall$Builder)object).setFeatures((Feature)object2);
        object2 = new zzk(this);
        object = ((TaskApiCall$Builder)object).run((RemoteCall)object2).setMethodKey(1564).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task hasOngoingSmsRequest(String object) {
        Feature feature;
        Preconditions.checkNotNull(object);
        boolean bl2 = ((String)object).isEmpty();
        int n3 = 1;
        Preconditions.checkArgument(bl2 ^ n3, "The package name cannot be empty.");
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        Object object2 = new Feature[n3];
        object2[0] = feature = zzac.zza;
        taskApiCall$Builder = taskApiCall$Builder.setFeatures((Feature)object2);
        object2 = new zzl(this, (String)object);
        object = taskApiCall$Builder.run((RemoteCall)object2).setMethodKey(1565).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task startSmsCodeRetriever() {
        Object object = TaskApiCall.builder();
        Feature feature = zzac.zza;
        Object object2 = new Feature[]{feature};
        object = ((TaskApiCall$Builder)object).setFeatures((Feature)object2);
        object2 = new zzm(this);
        object = ((TaskApiCall$Builder)object).run((RemoteCall)object2).setMethodKey(1563).build();
        return this.doWrite((TaskApiCall)object);
    }
}

