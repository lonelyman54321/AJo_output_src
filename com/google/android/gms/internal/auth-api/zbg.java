/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.auth-api;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbe;
import com.google.android.gms.internal.auth-api.zbf;
import com.google.android.gms.internal.auth-api.zbl;
import com.google.android.gms.internal.auth-api.zbm;
import com.google.android.gms.internal.auth-api.zbs;
import com.google.android.gms.internal.auth-api.zbt;

final class zbg
extends zbm {
    final /* synthetic */ CredentialRequest zba;

    public zbg(zbl zbl2, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        this.zba = credentialRequest;
        super(googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        zbe zbe2 = new zbe(status, null);
        return zbe2;
    }

    public final void zba(Context object, zbt zbt2) {
        object = new zbf(this);
        CredentialRequest credentialRequest = this.zba;
        zbt2.zbd((zbs)object, credentialRequest);
    }
}

