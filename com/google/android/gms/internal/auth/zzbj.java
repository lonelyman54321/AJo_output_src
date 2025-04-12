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
import com.google.android.gms.internal.auth.zzbv;

abstract class zzbj
extends BaseImplementation$ApiMethodImpl {
    public zzbj(GoogleApiClient googleApiClient) {
        Api api = AuthProxy.API;
        super(api, googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        zzbv zzbv2 = new zzbv(status);
        return zzbv2;
    }

    public abstract void zza(Context var1, zzbh var2);
}

