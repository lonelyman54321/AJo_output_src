/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

public interface CredentialSavingClient
extends HasApiKey {
    public Status getStatusFromIntent(Intent var1);

    public Task saveAccountLinkingToken(SaveAccountLinkingTokenRequest var1);

    public Task savePassword(SavePasswordRequest var1);
}

