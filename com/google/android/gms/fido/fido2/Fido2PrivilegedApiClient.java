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
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.zzk;
import com.google.android.gms.fido.fido2.zzl;
import com.google.android.gms.fido.fido2.zzm;
import com.google.android.gms.fido.fido2.zzn;
import com.google.android.gms.fido.fido2.zzo;
import com.google.android.gms.fido.fido2.zzp;
import com.google.android.gms.fido.zza;
import com.google.android.gms.internal.fido.zzj;
import com.google.android.gms.tasks.Task;

public class Fido2PrivilegedApiClient
extends GoogleApi {
    private static final Api$ClientKey zza;
    private static final Api zzb;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zza = api$ClientKey = new Api$ClientKey();
        zzj zzj2 = new zzj();
        zzb = api = new Api("Fido.FIDO2_PRIVILEGED_API", zzj2, api$ClientKey);
    }

    public Fido2PrivilegedApiClient(Activity activity) {
        Api api = zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        super(activity, api, (Api$ApiOptions)api$ApiOptions$NoOptions, (StatusExceptionMapper)apiExceptionMapper);
    }

    public Fido2PrivilegedApiClient(Context context) {
        Api api = zzb;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, (StatusExceptionMapper)apiExceptionMapper);
    }

    public Task getCredentialList(String object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzk zzk2 = new zzk(this, (String)object);
        object = taskApiCall$Builder.run(zzk2).setMethodKey(5430).build();
        return this.doRead((TaskApiCall)object);
    }

    public Task getRegisterIntent(BrowserPublicKeyCredentialCreationOptions object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder().setMethodKey(5414);
        zzo zzo2 = new zzo(this, (BrowserPublicKeyCredentialCreationOptions)object);
        object = taskApiCall$Builder.run(zzo2).build();
        return this.doRead((TaskApiCall)object);
    }

    public Task getRegisterPendingIntent(BrowserPublicKeyCredentialCreationOptions object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzl zzl2 = new zzl(this, (BrowserPublicKeyCredentialCreationOptions)object);
        object = taskApiCall$Builder.run(zzl2).setMethodKey(5412).build();
        return this.doRead((TaskApiCall)object);
    }

    public Task getSignIntent(BrowserPublicKeyCredentialRequestOptions object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder().setMethodKey(5415);
        zzn zzn2 = new zzn(this, (BrowserPublicKeyCredentialRequestOptions)object);
        object = taskApiCall$Builder.run(zzn2).build();
        return this.doRead((TaskApiCall)object);
    }

    public Task getSignPendingIntent(BrowserPublicKeyCredentialRequestOptions object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        zzm zzm2 = new zzm(this, (BrowserPublicKeyCredentialRequestOptions)object);
        object = taskApiCall$Builder.run(zzm2).setMethodKey(5413).build();
        return this.doRead((TaskApiCall)object);
    }

    public Task isUserVerifyingPlatformAuthenticatorAvailable() {
        Object object = TaskApiCall.builder();
        Feature[] featureArray = new zzp(this);
        object = ((TaskApiCall$Builder)object).run((RemoteCall)featureArray);
        Feature feature = com.google.android.gms.fido.zza.zzh;
        featureArray = new Feature[]{feature};
        object = ((TaskApiCall$Builder)object).setFeatures(featureArray).setMethodKey(5416).build();
        return this.doRead((TaskApiCall)object);
    }
}

