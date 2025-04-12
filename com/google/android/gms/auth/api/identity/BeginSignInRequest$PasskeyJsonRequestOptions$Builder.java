/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.identity;

import com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions;

public final class BeginSignInRequest$PasskeyJsonRequestOptions$Builder {
    private boolean zba = false;
    private String zbb;

    public BeginSignInRequest$PasskeyJsonRequestOptions build() {
        boolean bl2 = this.zba;
        String string2 = this.zbb;
        BeginSignInRequest$PasskeyJsonRequestOptions beginSignInRequest$PasskeyJsonRequestOptions = new BeginSignInRequest$PasskeyJsonRequestOptions(bl2, string2);
        return beginSignInRequest$PasskeyJsonRequestOptions;
    }

    public BeginSignInRequest$PasskeyJsonRequestOptions$Builder setRequestJson(String string2) {
        this.zbb = string2;
        return this;
    }

    public BeginSignInRequest$PasskeyJsonRequestOptions$Builder setSupported(boolean bl2) {
        this.zba = bl2;
        return this;
    }
}

