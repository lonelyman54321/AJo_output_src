/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 */
package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.accounttransfer.zzb;
import com.google.android.gms.auth.api.accounttransfer.zzc;
import com.google.android.gms.auth.api.accounttransfer.zze;
import com.google.android.gms.auth.api.accounttransfer.zzg;
import com.google.android.gms.auth.api.accounttransfer.zzh;
import com.google.android.gms.auth.api.accounttransfer.zzi;
import com.google.android.gms.auth.api.accounttransfer.zzr;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.GoogleApi$Settings$Builder;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.tasks.Task;

public class AccountTransferClient
extends GoogleApi {
    public static final /* synthetic */ int zza;
    private static final Api$ClientKey zzb;
    private static final Api$AbstractClientBuilder zzc;
    private static final Api zzd;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        zzb = api$ClientKey = new Api$ClientKey();
        zzb zzb2 = new zzb();
        zzc = zzb2;
        zzd = api = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zzb2, api$ClientKey);
    }

    public AccountTransferClient(Activity activity, zzr object) {
        object = zzd;
        zzr zzr2 = zzr.zza;
        Object object2 = new GoogleApi$Settings$Builder();
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        object2 = ((GoogleApi$Settings$Builder)object2).setMapper(apiExceptionMapper).build();
        super(activity, (Api)object, (Api$ApiOptions)zzr2, (GoogleApi$Settings)object2);
    }

    public AccountTransferClient(Context context, zzr object) {
        object = zzd;
        zzr zzr2 = zzr.zza;
        Object object2 = new GoogleApi$Settings$Builder();
        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        object2 = ((GoogleApi$Settings$Builder)object2).setMapper(apiExceptionMapper).build();
        super(context, (Api)object, (Api$ApiOptions)zzr2, (GoogleApi$Settings)object2);
    }

    public Task getDeviceMetaData(String object) {
        Preconditions.checkNotNull(object);
        zzaq zzaq2 = new zzaq((String)object);
        object = new zzg(this, 1608, zzaq2);
        return this.doRead((TaskApiCall)object);
    }

    public Task notifyCompletion(String object, int n3) {
        Preconditions.checkNotNull(object);
        zzav zzav2 = new zzav((String)object, n3);
        object = new zzi(this, 1610, zzav2);
        return this.doWrite((TaskApiCall)object);
    }

    public Task retrieveData(String object) {
        Preconditions.checkNotNull(object);
        zzax zzax2 = new zzax((String)object);
        object = new zze(this, 1607, zzax2);
        return this.doRead((TaskApiCall)object);
    }

    public Task sendData(String object, byte[] byArray) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(byArray);
        zzaz zzaz2 = new zzaz((String)object, byArray);
        object = new zzc(this, 1606, zzaz2);
        return this.doWrite((TaskApiCall)object);
    }

    public Task showUserChallenge(String object, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(pendingIntent);
        zzbb zzbb2 = new zzbb((String)object, pendingIntent);
        object = new zzh(this, 1609, zzbb2);
        return this.doWrite((TaskApiCall)object);
    }
}

