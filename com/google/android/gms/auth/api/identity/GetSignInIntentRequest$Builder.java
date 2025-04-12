/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.identity;

import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.internal.Preconditions;

public final class GetSignInIntentRequest$Builder {
    private String zba;
    private String zbb;
    private String zbc;
    private String zbd;
    private boolean zbe;
    private int zbf;

    public GetSignInIntentRequest build() {
        String string2 = this.zba;
        String string3 = this.zbb;
        String string4 = this.zbc;
        String string5 = this.zbd;
        boolean bl2 = this.zbe;
        int n3 = this.zbf;
        GetSignInIntentRequest getSignInIntentRequest = new GetSignInIntentRequest(string2, string3, string4, string5, bl2, n3);
        return getSignInIntentRequest;
    }

    public GetSignInIntentRequest$Builder filterByHostedDomain(String string2) {
        this.zbb = string2;
        return this;
    }

    public GetSignInIntentRequest$Builder setNonce(String string2) {
        this.zbd = string2;
        return this;
    }

    public GetSignInIntentRequest$Builder setRequestVerifiedPhoneNumber(boolean bl2) {
        this.zbe = bl2;
        return this;
    }

    public GetSignInIntentRequest$Builder setServerClientId(String string2) {
        Preconditions.checkNotNull(string2);
        this.zba = string2;
        return this;
    }

    public final GetSignInIntentRequest$Builder zba(String string2) {
        this.zbc = string2;
        return this;
    }

    public final GetSignInIntentRequest$Builder zbb(int n3) {
        this.zbf = n3;
        return this;
    }
}

