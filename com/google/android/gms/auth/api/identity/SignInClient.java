/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

public interface SignInClient
extends HasApiKey {
    public Task beginSignIn(BeginSignInRequest var1);

    public String getPhoneNumberFromIntent(Intent var1);

    public Task getPhoneNumberHintIntent(GetPhoneNumberHintIntentRequest var1);

    public SignInCredential getSignInCredentialFromIntent(Intent var1);

    public Task getSignInIntent(GetSignInIntentRequest var1);

    public Task signOut();
}

