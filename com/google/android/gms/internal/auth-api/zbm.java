/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.auth-api;

import android.content.Context;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.internal.auth-api.zbt;

abstract class zbm
extends BaseImplementation$ApiMethodImpl {
    public zbm(GoogleApiClient googleApiClient) {
        Api api = Auth.CREDENTIALS_API;
        super(api, googleApiClient);
    }

    public abstract void zba(Context var1, zbt var2);
}

