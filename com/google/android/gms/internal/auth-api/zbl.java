/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 */
package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth-api.zbg;
import com.google.android.gms.internal.auth-api.zbh;
import com.google.android.gms.internal.auth-api.zbi;
import com.google.android.gms.internal.auth-api.zbj;
import com.google.android.gms.internal.auth-api.zbn;
import com.google.android.gms.internal.auth-api.zbo;

public final class zbl
implements CredentialsApi {
    public final PendingResult delete(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credential, "credential must not be null");
        zbi zbi2 = new zbi(this, googleApiClient, credential);
        return googleApiClient.execute(zbi2);
    }

    public final PendingResult disableAutoSignIn(GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        zbj zbj2 = new zbj(this, googleApiClient);
        return googleApiClient.execute(zbj2);
    }

    public final PendingIntent getHintPickerIntent(GoogleApiClient googleApiClient, HintRequest hintRequest) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(hintRequest, "request must not be null");
        Object object = Auth.zba;
        object = ((zbo)googleApiClient.getClient((Api$AnyClientKey)object)).zba();
        googleApiClient = googleApiClient.getContext();
        String string2 = ((Auth$AuthCredentialsOptions)object).zbd();
        return zbn.zba((Context)googleApiClient, (Auth$AuthCredentialsOptions)object, hintRequest, string2);
    }

    public final PendingResult request(GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credentialRequest, "request must not be null");
        zbg zbg2 = new zbg(this, googleApiClient, credentialRequest);
        return googleApiClient.enqueue(zbg2);
    }

    public final PendingResult save(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credential, "credential must not be null");
        zbh zbh2 = new zbh(this, googleApiClient, credential);
        return googleApiClient.execute(zbh2);
    }
}

