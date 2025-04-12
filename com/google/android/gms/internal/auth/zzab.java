/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.auth.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ApiOptions$NoOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzq;
import com.google.android.gms.internal.auth.zzr;
import com.google.android.gms.internal.auth.zzs;
import com.google.android.gms.internal.auth.zzt;
import com.google.android.gms.internal.auth.zzu;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzab
extends GoogleApi
implements zzg {
    private static final Api$ClientKey zza;
    private static final Api$AbstractClientBuilder zzb;
    private static final Api zzc;
    private static final Logger zzd;
    private final Context zze;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zza = api$ClientKey = new Api$ClientKey();
        zzv zzv2 = new zzv();
        zzb = zzv2;
        zzc = api = new Api("GoogleAuthService.API", zzv2, api$ClientKey);
        zzd = com.google.android.gms.auth.zzd.zza("GoogleAuthServiceClient");
    }

    public zzab(Context context) {
        Api api = zzc;
        Api$ApiOptions$NoOptions api$ApiOptions$NoOptions = Api$ApiOptions.NO_OPTIONS;
        GoogleApi$Settings googleApi$Settings = GoogleApi$Settings.DEFAULT_SETTINGS;
        super(context, api, (Api$ApiOptions)api$ApiOptions$NoOptions, googleApi$Settings);
        this.zze = context;
    }

    public static /* bridge */ /* synthetic */ void zzf(Status object, Object objectArray, TaskCompletionSource object2) {
        boolean bl2 = TaskUtil.trySetResultOrApiException((Status)object, objectArray, (TaskCompletionSource)object2);
        if (!bl2) {
            object = zzd;
            objectArray = new Object[]{};
            object2 = "The task is already complete.";
            ((Logger)object).w((String)object2, objectArray);
        }
    }

    public final Task zza(zzbw object) {
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        Feature feature = com.google.android.gms.auth.zze.zzj;
        Object object2 = new Feature[]{feature};
        taskApiCall$Builder = taskApiCall$Builder.setFeatures((Feature)object2);
        object2 = new zzt(this, (zzbw)object);
        object = taskApiCall$Builder.run((RemoteCall)object2).setMethodKey(1513).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task zzb(AccountChangeEventsRequest object) {
        Preconditions.checkNotNull(object, "request cannot be null.");
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        Feature feature = com.google.android.gms.auth.zze.zzi;
        Object object2 = new Feature[]{feature};
        taskApiCall$Builder = taskApiCall$Builder.setFeatures((Feature)object2);
        object2 = new zzu(this, (AccountChangeEventsRequest)object);
        object = taskApiCall$Builder.run((RemoteCall)object2).setMethodKey(1515).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task zzc(Account object, String string2, Bundle bundle) {
        Preconditions.checkNotNull(object, "Account name cannot be null!");
        Preconditions.checkNotEmpty(string2, "Scope cannot be null!");
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        Feature feature = com.google.android.gms.auth.zze.zzj;
        Object object2 = new Feature[]{feature};
        taskApiCall$Builder = taskApiCall$Builder.setFeatures((Feature)object2);
        object2 = new zzs(this, (Account)object, string2, bundle);
        object = taskApiCall$Builder.run((RemoteCall)object2).setMethodKey(1512).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task zzd(Account object) {
        Preconditions.checkNotNull(object, "account cannot be null.");
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        Feature feature = com.google.android.gms.auth.zze.zzi;
        Object object2 = new Feature[]{feature};
        taskApiCall$Builder = taskApiCall$Builder.setFeatures((Feature)object2);
        object2 = new zzr(this, (Account)object);
        object = taskApiCall$Builder.run((RemoteCall)object2).setMethodKey(1517).build();
        return this.doWrite((TaskApiCall)object);
    }

    public final Task zze(String object) {
        Preconditions.checkNotNull(object, "Client package name cannot be null!");
        TaskApiCall$Builder taskApiCall$Builder = TaskApiCall.builder();
        Feature feature = com.google.android.gms.auth.zze.zzi;
        Object object2 = new Feature[]{feature};
        taskApiCall$Builder = taskApiCall$Builder.setFeatures((Feature)object2);
        object2 = new zzq(this, (String)object);
        object = taskApiCall$Builder.run((RemoteCall)object2).setMethodKey(1514).build();
        return this.doWrite((TaskApiCall)object);
    }
}

