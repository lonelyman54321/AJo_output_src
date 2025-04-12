/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.internal.zbe;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;

public final class zbd
implements GoogleSignInApi {
    private static final GoogleSignInOptions zba(GoogleApiClient googleApiClient) {
        Api$ClientKey api$ClientKey = Auth.zbb;
        return ((zbe)googleApiClient.getClient(api$ClientKey)).zba();
    }

    public final Intent getSignInIntent(GoogleApiClient object) {
        Context context = ((GoogleApiClient)object).getContext();
        object = zbd.zba((GoogleApiClient)object);
        return zbm.zbc(context, (GoogleSignInOptions)object);
    }

    public final GoogleSignInResult getSignInResultFromIntent(Intent intent) {
        return zbm.zbd(intent);
    }

    public final PendingResult revokeAccess(GoogleApiClient googleApiClient) {
        Context context = googleApiClient.getContext();
        return zbm.zbf(googleApiClient, context, false);
    }

    public final PendingResult signOut(GoogleApiClient googleApiClient) {
        Context context = googleApiClient.getContext();
        return zbm.zbg(googleApiClient, context, false);
    }

    public final OptionalPendingResult silentSignIn(GoogleApiClient googleApiClient) {
        Context context = googleApiClient.getContext();
        GoogleSignInOptions googleSignInOptions = zbd.zba(googleApiClient);
        return zbm.zbe(googleApiClient, context, googleSignInOptions, false);
    }
}

