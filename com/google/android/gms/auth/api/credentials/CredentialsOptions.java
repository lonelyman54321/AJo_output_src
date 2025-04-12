/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.CredentialsOptions$Builder;
import com.google.android.gms.auth.api.credentials.zbd;

public final class CredentialsOptions
extends Auth$AuthCredentialsOptions {
    public static final CredentialsOptions DEFAULT;

    static {
        CredentialsOptions$Builder credentialsOptions$Builder = new CredentialsOptions$Builder();
        DEFAULT = credentialsOptions$Builder.build();
    }

    public /* synthetic */ CredentialsOptions(CredentialsOptions$Builder credentialsOptions$Builder, zbd zbd2) {
        super(credentialsOptions$Builder);
    }
}

