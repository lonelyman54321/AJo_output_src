/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.internal.zbl;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zbg
extends zbl {
    final /* synthetic */ Context zba;
    final /* synthetic */ GoogleSignInOptions zbb;

    public zbg(GoogleApiClient googleApiClient, Context context, GoogleSignInOptions googleSignInOptions) {
        this.zba = context;
        this.zbb = googleSignInOptions;
        super(googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        GoogleSignInResult googleSignInResult = new GoogleSignInResult(null, status);
        return googleSignInResult;
    }
}

