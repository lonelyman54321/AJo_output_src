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
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zbu;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.auth-api.zbam;
import com.google.android.gms.internal.auth-api.zbax;
import com.google.android.gms.internal.auth-api.zbay;
import com.google.android.gms.internal.auth-api.zbaz;
import com.google.android.gms.internal.auth-api.zbba;
import com.google.android.gms.internal.auth-api.zbbb;
import com.google.android.gms.internal.auth-api.zbbd;
import com.google.android.gms.internal.auth-api.zbbf;
import com.google.android.gms.internal.auth-api.zbbh;
import com.google.android.gms.internal.auth-api.zbbi;
import com.google.android.gms.internal.auth-api.zbbj;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zbbg
extends GoogleApi
implements SignInClient {
    private static final Api$ClientKey zba;
    private static final Api$AbstractClientBuilder zbb;
    private static final Api zbc;
    private final String zbd;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zba = api$ClientKey = new Api$ClientKey();
        zbbb zbbb2 = new zbbb();
        zbb = zbbb2;
        zbc = api = new Api("Auth.Api.Identity.SignIn.API", zbbb2, api$ClientKey);
    }

    public zbbg(Activity object, zbu zbu2) {
        Api api = zbc;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super((Activity)object, api, (Api$ApiOptions)zbu2, googleApi$Settings);
        object = zbbj.zba();
        this.zbd = object;
    }

    public zbbg(Context object, zbu zbu2) {
        Api api = zbc;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super((Context)object, api, (Api$ApiOptions)zbu2, googleApi$Settings);
        object = zbbj.zba();
        this.zbd = object;
    }

    public final Task beginSignIn(BeginSignInRequest object) {
        Preconditions.checkNotNull(object);
        object = BeginSignInRequest.zba((BeginSignInRequest)object);
        Object object2 = this.zbd;
        ((BeginSignInRequest$Builder)object).zba((String)object2);
        object = ((BeginSignInRequest$Builder)object).build();
        object2 = TaskApiCall.builder();
        Feature feature = zbbi.zba;
        Object object3 = new Feature[]{feature};
        object2 = ((TaskApiCall$Builder)object2).setFeatures((Feature)object3);
        object3 = new zbax(this, (BeginSignInRequest)object);
        object = ((TaskApiCall$Builder)object2).run((RemoteCall)object3).setAutoResolveMissingFeatures(false).setMethodKey(1553).build();
        return this.doRead((TaskApiCall)object);
    }

    public final String getPhoneNumberFromIntent(Intent object) {
        if (object != null) {
            Parcelable.Creator creator = Status.CREATOR;
            Object object2 = (Status)SafeParcelableSerializer.deserializeFromIntentExtra(object, "status", creator);
            if (object2 != null) {
                boolean bl2 = ((Status)object2).isSuccess();
                if (bl2) {
                    object2 = "phone_number_hint_result";
                    if ((object = object.getStringExtra((String)object2)) != null) {
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

    public final Task getPhoneNumberHintIntent(GetPhoneNumberHintIntentRequest object) {
        Preconditions.checkNotNull(object);
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        Feature feature = zbbi.zbh;
        Object object2 = new Feature[]{feature};
        taskApiCall$Builder = taskApiCall$Builder.setFeatures((Feature)object2);
        object2 = new zbba(this, (GetPhoneNumberHintIntentRequest)object);
        object = taskApiCall$Builder.run((RemoteCall)object2).setMethodKey(1653).build();
        return this.doRead((TaskApiCall)object);
    }

    public final SignInCredential getSignInCredentialFromIntent(Intent object) {
        if (object != null) {
            Parcelable.Creator creator = Status.CREATOR;
            Object object2 = (Status)SafeParcelableSerializer.deserializeFromIntentExtra(object, "status", creator);
            if (object2 != null) {
                boolean bl2 = ((Status)object2).isSuccess();
                if (bl2) {
                    object2 = "sign_in_credential";
                    creator = SignInCredential.CREATOR;
                    if ((object = (SignInCredential)SafeParcelableSerializer.deserializeFromIntentExtra(object, (String)object2, creator)) != null) {
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

    public final Task getSignInIntent(GetSignInIntentRequest object) {
        Preconditions.checkNotNull(object);
        object = GetSignInIntentRequest.zba((GetSignInIntentRequest)object);
        Object object2 = this.zbd;
        ((GetSignInIntentRequest$Builder)object).zba((String)object2);
        object = ((GetSignInIntentRequest$Builder)object).build();
        object2 = TaskApiCall.builder();
        Feature feature = zbbi.zbf;
        Object object3 = new Feature[]{feature};
        object2 = ((TaskApiCall$Builder)object2).setFeatures((Feature)object3);
        object3 = new zbay(this, (GetSignInIntentRequest)object);
        object = ((TaskApiCall$Builder)object2).run((RemoteCall)object3).setMethodKey(1555).build();
        return this.doRead((TaskApiCall)object);
    }

    public final Task signOut() {
        boolean bl2;
        Object object = this.getApplicationContext();
        Object object2 = "com.google.android.gms.signin";
        object.getSharedPreferences((String)object2, 0).edit().clear().apply();
        object = GoogleApiClient.getAllClients().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (GoogleApiClient)object.next();
            object2.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        object = TaskApiCall.builder();
        Feature feature = zbbi.zbb;
        object2 = new Feature[]{feature};
        object = ((TaskApiCall$Builder)object).setFeatures((Feature)object2);
        object2 = new zbaz(this);
        object = ((TaskApiCall$Builder)object).run((RemoteCall)object2).setAutoResolveMissingFeatures(false).setMethodKey(1554).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final /* synthetic */ void zba(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, zbbh object, TaskCompletionSource object2) {
        zbbf zbbf2 = new zbbf(this, (TaskCompletionSource)object2);
        object = (zbam)((BaseGmsClient)object).getService();
        object2 = this.zbd;
        ((zbam)object).zbd(zbbf2, getPhoneNumberHintIntentRequest, (String)object2);
    }

    public final /* synthetic */ void zbb(zbbh object, TaskCompletionSource object2) {
        zbbd zbbd2 = new zbbd(this, (TaskCompletionSource)object2);
        object = (zbam)((BaseGmsClient)object).getService();
        object2 = this.zbd;
        ((zbam)object).zbf(zbbd2, (String)object2);
    }
}

