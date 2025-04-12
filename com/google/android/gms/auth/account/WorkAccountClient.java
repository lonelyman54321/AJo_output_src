/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.account.WorkAccount;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.auth.account.zzg;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.PendingResultUtil$ResultConverter;
import com.google.android.gms.tasks.Task;

public class WorkAccountClient
extends GoogleApi {
    private final WorkAccountApi zza;

    public WorkAccountClient(Activity object) {
        Api api = WorkAccount.API;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super((Activity)object, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
        super();
        this.zza = object;
    }

    public WorkAccountClient(Context object) {
        Api api = WorkAccount.API;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super((Context)object, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
        super();
        this.zza = object;
    }

    public Task addWorkAccount(String object) {
        Object object2 = this.zza;
        GoogleApiClient googleApiClient = this.asGoogleApiClient();
        object = object2.addWorkAccount(googleApiClient, (String)object);
        object2 = new zzg(this);
        return PendingResultUtil.toTask((PendingResult)object, (PendingResultUtil$ResultConverter)object2);
    }

    public Task removeWorkAccount(Account account) {
        WorkAccountApi workAccountApi = this.zza;
        GoogleApiClient googleApiClient = this.asGoogleApiClient();
        return PendingResultUtil.toVoidTask(workAccountApi.removeWorkAccount(googleApiClient, account));
    }

    public Task setWorkAuthenticatorEnabled(boolean bl2) {
        WorkAccountApi workAccountApi = this.zza;
        GoogleApiClient googleApiClient = this.asGoogleApiClient();
        return PendingResultUtil.toVoidTask(workAccountApi.setWorkAuthenticatorEnabledWithResult(googleApiClient, bl2));
    }
}

