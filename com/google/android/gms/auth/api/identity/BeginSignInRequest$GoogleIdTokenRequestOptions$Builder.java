/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.identity;

import com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

public final class BeginSignInRequest$GoogleIdTokenRequestOptions$Builder {
    private boolean zba = false;
    private String zbb = null;
    private String zbc = null;
    private boolean zbd = true;
    private String zbe = null;
    private List zbf = null;
    private boolean zbg = false;

    public BeginSignInRequest$GoogleIdTokenRequestOptions$Builder associateLinkedAccounts(String string2, List list) {
        this.zbe = string2 = (String)Preconditions.checkNotNull(string2, "linkedServiceId must be provided if you want to associate linked accounts.");
        this.zbf = list;
        return this;
    }

    public BeginSignInRequest$GoogleIdTokenRequestOptions build() {
        boolean bl2 = this.zba;
        String string2 = this.zbb;
        String string3 = this.zbc;
        boolean bl3 = this.zbd;
        String string4 = this.zbe;
        List list = this.zbf;
        boolean bl4 = this.zbg;
        BeginSignInRequest$GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions = new BeginSignInRequest$GoogleIdTokenRequestOptions(bl2, string2, string3, bl3, string4, list, bl4);
        return beginSignInRequest$GoogleIdTokenRequestOptions;
    }

    public BeginSignInRequest$GoogleIdTokenRequestOptions$Builder setFilterByAuthorizedAccounts(boolean bl2) {
        this.zbd = bl2;
        return this;
    }

    public BeginSignInRequest$GoogleIdTokenRequestOptions$Builder setNonce(String string2) {
        this.zbc = string2;
        return this;
    }

    public BeginSignInRequest$GoogleIdTokenRequestOptions$Builder setRequestVerifiedPhoneNumber(boolean bl2) {
        this.zbg = bl2;
        return this;
    }

    public BeginSignInRequest$GoogleIdTokenRequestOptions$Builder setServerClientId(String string2) {
        this.zbb = string2 = Preconditions.checkNotEmpty(string2);
        return this;
    }

    public BeginSignInRequest$GoogleIdTokenRequestOptions$Builder setSupported(boolean bl2) {
        this.zba = bl2;
        return this;
    }
}

