/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

public final class zbe
implements CredentialRequestResult {
    private final Status zba;
    private final Credential zbb;

    public zbe(Status status, Credential credential) {
        this.zba = status;
        this.zbb = credential;
    }

    public final Credential getCredential() {
        return this.zbb;
    }

    public final Status getStatus() {
        return this.zba;
    }
}

