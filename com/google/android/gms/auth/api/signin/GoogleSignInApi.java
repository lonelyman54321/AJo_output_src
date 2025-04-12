/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;

public interface GoogleSignInApi {
    public static final String EXTRA_SIGN_IN_ACCOUNT = "signInAccount";

    public Intent getSignInIntent(GoogleApiClient var1);

    public GoogleSignInResult getSignInResultFromIntent(Intent var1);

    public PendingResult revokeAccess(GoogleApiClient var1);

    public PendingResult signOut(GoogleApiClient var1);

    public OptionalPendingResult silentSignIn(GoogleApiClient var1);
}

