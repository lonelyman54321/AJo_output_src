/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder;
import com.google.android.gms.auth.api.credentials.CredentialsOptions;

public final class CredentialsOptions$Builder
extends Auth$AuthCredentialsOptions$Builder {
    public CredentialsOptions build() {
        CredentialsOptions credentialsOptions = new CredentialsOptions(this, null);
        return credentialsOptions;
    }

    public CredentialsOptions$Builder forceEnableSaveDialog() {
        Boolean bl2;
        this.zba = bl2 = Boolean.TRUE;
        return this;
    }
}

