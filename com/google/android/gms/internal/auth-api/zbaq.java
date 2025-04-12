/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.auth-api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationClient;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.zbb;
import com.google.android.gms.auth.api.identity.zbc;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.auth-api.zban;
import com.google.android.gms.internal.auth-api.zbao;
import com.google.android.gms.internal.auth-api.zbbi;
import com.google.android.gms.internal.auth-api.zbbj;
import com.google.android.gms.tasks.Task;

public final class zbaq
extends GoogleApi
implements AuthorizationClient {
    private static final Api$ClientKey zba;
    private static final Api$AbstractClientBuilder zbb;
    private static final Api zbc;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zba = api$ClientKey = new Api$ClientKey();
        zbao zbao2 = new zbao();
        zbb = zbao2;
        zbc = api = new Api("Auth.Api.Identity.Authorization.API", zbao2, api$ClientKey);
    }

    public zbaq(Activity activity, zbc object) {
        Api api = zbc;
        object = com.google.android.gms.auth.api.identity.zbb.zbc((zbc)object);
        Object object2 = zbbj.zba();
        ((zbb)object).zba((String)object2);
        object = ((zbb)object).zbb();
        object2 = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(activity, api, (Api$ApiOptions)object, (GoogleApi$Settings)object2);
    }

    public zbaq(Context context, zbc object) {
        Api api = zbc;
        object = com.google.android.gms.auth.api.identity.zbb.zbc((zbc)object);
        Object object2 = zbbj.zba();
        ((zbb)object).zba((String)object2);
        object = ((zbb)object).zbb();
        object2 = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)object, (GoogleApi$Settings)object2);
    }

    public final Task authorize(AuthorizationRequest object) {
        Preconditions.checkNotNull(object);
        object = AuthorizationRequest.zba((AuthorizationRequest)object);
        Object object2 = ((zbc)this.getApiOptions()).zbb();
        ((AuthorizationRequest$Builder)object).zbb((String)object2);
        object = ((AuthorizationRequest$Builder)object).build();
        object2 = TaskApiCall.builder();
        Feature feature = zbbi.zbc;
        Object object3 = new Feature[]{feature};
        object2 = ((TaskApiCall$Builder)object2).setFeatures((Feature)object3);
        object3 = new zban(this, (AuthorizationRequest)object);
        object = ((TaskApiCall$Builder)object2).run((RemoteCall)object3).setAutoResolveMissingFeatures(false).setMethodKey(1534).build();
        return this.doRead((TaskApiCall)object);
    }

    public final AuthorizationResult getAuthorizationResultFromIntent(Intent object) {
        if (object != null) {
            Parcelable.Creator creator = Status.CREATOR;
            Object object2 = (Status)SafeParcelableSerializer.deserializeFromIntentExtra(object, "status", creator);
            if (object2 != null) {
                boolean bl2 = ((Status)object2).isSuccess();
                if (bl2) {
                    object2 = "authorization_result";
                    creator = AuthorizationResult.CREATOR;
                    if ((object = (AuthorizationResult)SafeParcelableSerializer.deserializeFromIntentExtra(object, (String)object2, creator)) != null) {
                        return object;
                    }
                    object2 = Status.RESULT_INTERNAL_ERROR;
                    object = new ApiException((Status)object2);
                    throw object;
                }
                object = new ApiException((Status)object2);
                throw object;
            }
            object2 = Status.RESULT_CANCELED;
            object = new ApiException((Status)object2);
            throw object;
        }
        Status status = Status.RESULT_INTERNAL_ERROR;
        object = new ApiException(status);
        throw object;
    }
}

