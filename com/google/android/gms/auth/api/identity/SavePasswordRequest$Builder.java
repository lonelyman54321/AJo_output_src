/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.identity;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;

public final class SavePasswordRequest$Builder {
    private SignInPassword zba;
    private String zbb;
    private int zbc;

    public SavePasswordRequest build() {
        SignInPassword signInPassword = this.zba;
        String string2 = this.zbb;
        int n3 = this.zbc;
        SavePasswordRequest savePasswordRequest = new SavePasswordRequest(signInPassword, string2, n3);
        return savePasswordRequest;
    }

    public SavePasswordRequest$Builder setSignInPassword(SignInPassword signInPassword) {
        this.zba = signInPassword;
        return this;
    }

    public final SavePasswordRequest$Builder zba(String string2) {
        this.zbb = string2;
        return this;
    }

    public final SavePasswordRequest$Builder zbb(int n3) {
        this.zbc = n3;
        return this;
    }
}

