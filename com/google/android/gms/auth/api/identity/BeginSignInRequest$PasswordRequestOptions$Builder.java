/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.identity;

import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions;

public final class BeginSignInRequest$PasswordRequestOptions$Builder {
    private boolean zba = false;

    public BeginSignInRequest$PasswordRequestOptions build() {
        boolean bl2 = this.zba;
        BeginSignInRequest$PasswordRequestOptions beginSignInRequest$PasswordRequestOptions = new BeginSignInRequest$PasswordRequestOptions(bl2);
        return beginSignInRequest$PasswordRequestOptions;
    }

    public BeginSignInRequest$PasswordRequestOptions$Builder setSupported(boolean bl2) {
        this.zba = bl2;
        return this;
    }
}

