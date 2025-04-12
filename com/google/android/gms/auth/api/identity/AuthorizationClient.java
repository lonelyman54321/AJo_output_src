/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

public interface AuthorizationClient
extends HasApiKey {
    public Task authorize(AuthorizationRequest var1);

    public AuthorizationResult getAuthorizationResultFromIntent(Intent var1);
}

