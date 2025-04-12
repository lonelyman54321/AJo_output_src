/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.auth.account.WorkAccountClient;
import com.google.android.gms.auth.account.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.internal.auth.zzal;

public class WorkAccount {
    public static final Api API;
    public static final WorkAccountApi WorkAccountApi;
    private static final Api$ClientKey zza;
    private static final Api$AbstractClientBuilder zzb;

    static {
        Api api;
        Object object = new Api$ClientKey();
        zza = object;
        zzf zzf2 = new zzf();
        zzb = zzf2;
        API = api = new Api("WorkAccount.API", zzf2, (Api$ClientKey)object);
        WorkAccountApi = object = new zzal();
    }

    private WorkAccount() {
    }

    public static WorkAccountClient getClient(Activity activity) {
        WorkAccountClient workAccountClient = new WorkAccountClient(activity);
        return workAccountClient;
    }

    public static WorkAccountClient getClient(Context context) {
        WorkAccountClient workAccountClient = new WorkAccountClient(context);
        return workAccountClient;
    }
}

