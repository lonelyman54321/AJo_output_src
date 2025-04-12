/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Result;

public interface CredentialRequestResult
extends Result {
    public Credential getCredential();
}

