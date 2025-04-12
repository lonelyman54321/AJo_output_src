/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.fido.fido2;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.zzb;
import com.google.android.gms.fido.fido2.zzc;
import com.google.android.gms.fido.fido2.zzd;
import com.google.android.gms.fido.fido2.zze;
import com.google.android.gms.fido.zza;
import com.google.android.gms.internal.fido.zzo;
import com.google.android.gms.tasks.Task;

public class Fido2ApiClient
extends GoogleApi {
    private static final Api$ClientKey zza;
    private static final Api zzb;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zza = api$ClientKey = new Api$ClientKey();
        zzo zzo2 = new zzo();
        zzb = api = new Api("Fido.FIDO2_API", zzo2, api$ClientKey);
    }

    public Fido2ApiClient(Activity activity) {
        Api api = zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, (StatusExceptionMapper)apiExceptionMapper);
    }

    public Fido2ApiClient(Context context) {
        Api api = zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, (StatusExceptionMapper)apiExceptionMapper);
    }

    public Task getRegisterIntent(PublicKeyCredentialCreationOptions object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder().setMethodKey(5409);
        zzd zzd2 = new zzd(this, (PublicKeyCredentialCreationOptions)object);
        object = taskApiCall$Builder.run(zzd2).build();
        return this.doRead((TaskApiCall)object);
    }

    public Task getRegisterPendingIntent(PublicKeyCredentialCreationOptions object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzc zzc2 = new zzc(this, (PublicKeyCredentialCreationOptions)object);
        object = taskApiCall$Builder.run(zzc2).setMethodKey(5407).build();
        return this.doRead((TaskApiCall)object);
    }

    public Task getSignIntent(PublicKeyCredentialRequestOptions object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder().setMethodKey(5410);
        com.google.android.gms.fido.fido2.zza zza2 = new com.google.android.gms.fido.fido2.zza(this, (PublicKeyCredentialRequestOptions)object);
        object = taskApiCall$Builder.run(zza2).build();
        return this.doRead((TaskApiCall)object);
    }

    public Task getSignPendingIntent(PublicKeyCredentialRequestOptions object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zze zze2 = new zze(this, (PublicKeyCredentialRequestOptions)object);
        object = taskApiCall$Builder.run(zze2).setMethodKey(5408).build();
        return this.doRead((TaskApiCall)object);
    }

    public Task isUserVerifyingPlatformAuthenticatorAvailable() {
        Object object = TaskApiCall.builder();
        Feature[] featureArray = new zzb(this);
        object = ((TaskApiCall$Builder)object).run((RemoteCall)featureArray);
        Feature feature = com.google.android.gms.fido.zza.zzh;
        featureArray = new Feature[]{feature};
        object = ((TaskApiCall$Builder)object).setFeatures(featureArray).setMethodKey(5411).build();
        return this.doRead((TaskApiCall)object);
    }
}

