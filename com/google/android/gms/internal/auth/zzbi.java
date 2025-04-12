/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.internal.auth.zzbh;
import com.google.android.gms.internal.auth.zzbu;

abstract class zzbi
extends BaseImplementation$ApiMethodImpl {
    public zzbi(GoogleApiClient googleApiClient) {
        Api api = AuthProxy.API;
        super(api, googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        zzbu zzbu2 = new zzbu(status);
        return zzbu2;
    }

    public abstract void zza(Context var1, zzbh var2);
}

