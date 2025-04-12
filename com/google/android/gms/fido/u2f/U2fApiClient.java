/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.zza;
import com.google.android.gms.fido.u2f.zzb;
import com.google.android.gms.internal.fido.zzx;
import com.google.android.gms.tasks.Task;

public class U2fApiClient
extends GoogleApi {
    private static final Api$ClientKey zza;
    private static final Api zzb;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zza = api$ClientKey = new Api$ClientKey();
        zzx zzx2 = new zzx();
        zzb = api = new Api("Fido.U2F_API", zzx2, api$ClientKey);
    }

    public U2fApiClient(Activity activity) {
        Api api = zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, (StatusExceptionMapper)apiExceptionMapper);
    }

    public U2fApiClient(Context context) {
        Api api = zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, (StatusExceptionMapper)apiExceptionMapper);
    }

    public Task getRegisterIntent(RegisterRequestParams object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder().setMethodKey(5424);
        zzb zzb2 = new zzb(this, (RegisterRequestParams)object);
        object = taskApiCall$Builder.run(zzb2).build();
        return this.doRead((TaskApiCall)object);
    }

    public Task getSignIntent(SignRequestParams object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder().setMethodKey(5425);
        zza zza2 = new zza(this, (SignRequestParams)object);
        object = taskApiCall$Builder.run(zza2).build();
        return this.doRead((TaskApiCall)object);
    }
}

