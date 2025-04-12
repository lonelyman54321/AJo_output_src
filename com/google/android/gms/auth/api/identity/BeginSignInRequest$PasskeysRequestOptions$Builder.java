/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.identity;

import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions;

public final class BeginSignInRequest$PasskeysRequestOptions$Builder {
    private boolean zba = false;
    private byte[] zbb;
    private String zbc;

    public BeginSignInRequest$PasskeysRequestOptions build() {
        boolean bl2 = this.zba;
        byte[] byArray = this.zbb;
        String string2 = this.zbc;
        BeginSignInRequest$PasskeysRequestOptions beginSignInRequest$PasskeysRequestOptions = new BeginSignInRequest$PasskeysRequestOptions(bl2, byArray, string2);
        return beginSignInRequest$PasskeysRequestOptions;
    }

    public BeginSignInRequest$PasskeysRequestOptions$Builder setChallenge(byte[] byArray) {
        this.zbb = byArray;
        return this;
    }

    public BeginSignInRequest$PasskeysRequestOptions$Builder setRpId(String string2) {
        this.zbc = string2;
        return this;
    }

    public BeginSignInRequest$PasskeysRequestOptions$Builder setSupported(boolean bl2) {
        this.zba = bl2;
        return this;
    }
}

