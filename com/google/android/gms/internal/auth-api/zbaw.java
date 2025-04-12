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
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder;
import com.google.android.gms.auth.api.identity.zbh;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.auth-api.zbar;
import com.google.android.gms.internal.auth-api.zbas;
import com.google.android.gms.internal.auth-api.zbat;
import com.google.android.gms.internal.auth-api.zbbi;
import com.google.android.gms.internal.auth-api.zbbj;
import com.google.android.gms.tasks.Task;

public final class zbaw
extends GoogleApi
implements CredentialSavingClient {
    private static final Api$ClientKey zba;
    private static final Api$AbstractClientBuilder zbb;
    private static final Api zbc;
    private final String zbd;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zba = api$ClientKey = new Api$ClientKey();
        zbat zbat2 = new zbat();
        zbb = zbat2;
        zbc = api = new Api("Auth.Api.Identity.CredentialSaving.API", zbat2, api$ClientKey);
    }

    public zbaw(Activity object, zbh zbh2) {
        Api api = zbc;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super((Activity)object, api, (Api$ApiOptions)zbh2, googleApi$Settings);
        object = zbbj.zba();
        this.zbd = object;
    }

    public zbaw(Context object, zbh zbh2) {
        Api api = zbc;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super((Context)object, api, (Api$ApiOptions)zbh2, googleApi$Settings);
        object = zbbj.zba();
        this.zbd = object;
    }

    public final Status getStatusFromIntent(Intent object) {
        if (object == null) {
            return Status.RESULT_INTERNAL_ERROR;
        }
        String string2 = "status";
        Parcelable.Creator creator = Status.CREATOR;
        if ((object = (Status)SafeParcelableSerializer.deserializeFromIntentExtra(object, string2, creator)) == null) {
            object = Status.RESULT_INTERNAL_ERROR;
        }
        return object;
    }

    public final Task saveAccountLinkingToken(SaveAccountLinkingTokenRequest object) {
        Preconditions.checkNotNull(object);
        object = SaveAccountLinkingTokenRequest.zba((SaveAccountLinkingTokenRequest)object);
        Object object2 = this.zbd;
        ((SaveAccountLinkingTokenRequest$Builder)object).zba((String)object2);
        object = ((SaveAccountLinkingTokenRequest$Builder)object).build();
        object2 = TaskApiCall.builder();
        Feature feature = zbbi.zbg;
        Object object3 = new Feature[]{feature};
        object2 = ((TaskApiCall$Builder)object2).setFeatures((Feature)object3);
        object3 = new zbar(this, (SaveAccountLinkingTokenRequest)object);
        object = ((TaskApiCall$Builder)object2).run((RemoteCall)object3).setAutoResolveMissingFeatures(false).setMethodKey(1535).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task savePassword(SavePasswordRequest object) {
        Preconditions.checkNotNull(object);
        object = SavePasswordRequest.zba((SavePasswordRequest)object);
        Object object2 = this.zbd;
        ((SavePasswordRequest$Builder)object).zba((String)object2);
        object = ((SavePasswordRequest$Builder)object).build();
        object2 = TaskApiCall.builder();
        Feature feature = zbbi.zbe;
        Object object3 = new Feature[]{feature};
        object2 = ((TaskApiCall$Builder)object2).setFeatures((Feature)object3);
        object3 = new zbas(this, (SavePasswordRequest)object);
        object = ((TaskApiCall$Builder)object2).run((RemoteCall)object3).setAutoResolveMissingFeatures(false).setMethodKey(1536).build();
        return this.doRead((TaskApiCall)object);
    }
}

