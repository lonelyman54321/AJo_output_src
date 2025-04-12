/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 */
package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResponse;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.GoogleApi$Settings$Builder;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth-api.zbn;
import com.google.android.gms.tasks.Task;

public class CredentialsClient
extends GoogleApi {
    public CredentialsClient(Activity activity, Auth$AuthCredentialsOptions auth$AuthCredentialsOptions) {
        Api api = Auth.CREDENTIALS_API;
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        super(activity, api, (Api$ApiOptions)auth$AuthCredentialsOptions, (StatusExceptionMapper)apiExceptionMapper);
    }

    public CredentialsClient(Context context, Auth$AuthCredentialsOptions auth$AuthCredentialsOptions) {
        Api api = Auth.CREDENTIALS_API;
        Object object = new GoogleApi$Settings$Builder();
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        object = ((GoogleApi$Settings$Builder)object).setMapper(apiExceptionMapper).build();
        super(context, api, (Api$ApiOptions)auth$AuthCredentialsOptions, (GoogleApi$Settings)object);
    }

    public Task delete(Credential credential) {
        CredentialsApi credentialsApi = Auth.CredentialsApi;
        GoogleApiClient googleApiClient = this.asGoogleApiClient();
        return PendingResultUtil.toVoidTask(credentialsApi.delete(googleApiClient, credential));
    }

    public Task disableAutoSignIn() {
        CredentialsApi credentialsApi = Auth.CredentialsApi;
        GoogleApiClient googleApiClient = this.asGoogleApiClient();
        return PendingResultUtil.toVoidTask(credentialsApi.disableAutoSignIn(googleApiClient));
    }

    public PendingIntent getHintPickerIntent(HintRequest hintRequest) {
        Context context = this.getApplicationContext();
        Auth$AuthCredentialsOptions auth$AuthCredentialsOptions = (Auth$AuthCredentialsOptions)this.getApiOptions();
        String string2 = ((Auth$AuthCredentialsOptions)this.getApiOptions()).zbd();
        return zbn.zba(context, auth$AuthCredentialsOptions, hintRequest, string2);
    }

    public Task request(CredentialRequest object) {
        Object object2 = Auth.CredentialsApi;
        GoogleApiClient googleApiClient = this.asGoogleApiClient();
        object = object2.request(googleApiClient, (CredentialRequest)object);
        object2 = new CredentialRequestResponse();
        return PendingResultUtil.toResponseTask((PendingResult)object, (Response)object2);
    }

    public Task save(Credential credential) {
        CredentialsApi credentialsApi = Auth.CredentialsApi;
        GoogleApiClient googleApiClient = this.asGoogleApiClient();
        return PendingResultUtil.toVoidTask(credentialsApi.save(googleApiClient, credential));
    }
}

