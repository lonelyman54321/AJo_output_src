/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

public final class AuthorizationRequest$Builder {
    private List zba;
    private String zbb;
    private boolean zbc;
    private boolean zbd;
    private Account zbe;
    private String zbf;
    private String zbg;
    private boolean zbh;

    private final String zbc(String string2) {
        boolean bl2;
        Preconditions.checkNotNull(string2);
        String string3 = this.zbb;
        boolean bl3 = true;
        if (string3 != null && !(bl2 = string3.equals(string2))) {
            bl3 = false;
        }
        Preconditions.checkArgument(bl3, "two different server client ids provided");
        return string2;
    }

    public AuthorizationRequest build() {
        List list = this.zba;
        String string2 = this.zbb;
        boolean bl2 = this.zbc;
        boolean bl3 = this.zbd;
        Account account = this.zbe;
        String string3 = this.zbf;
        String string4 = this.zbg;
        boolean bl4 = this.zbh;
        AuthorizationRequest authorizationRequest = new AuthorizationRequest(list, string2, bl2, bl3, account, string3, string4, bl4);
        return authorizationRequest;
    }

    public AuthorizationRequest$Builder filterByHostedDomain(String string2) {
        this.zbf = string2 = Preconditions.checkNotEmpty(string2);
        return this;
    }

    public AuthorizationRequest$Builder requestOfflineAccess(String string2) {
        this.requestOfflineAccess(string2, false);
        return this;
    }

    public AuthorizationRequest$Builder requestOfflineAccess(String string2, boolean bl2) {
        this.zbc(string2);
        this.zbb = string2;
        this.zbc = true;
        this.zbh = bl2;
        return this;
    }

    public AuthorizationRequest$Builder setAccount(Account account) {
        this.zbe = account = (Account)Preconditions.checkNotNull(account);
        return this;
    }

    public AuthorizationRequest$Builder setRequestedScopes(List list) {
        boolean bl2;
        boolean bl3 = false;
        if (list != null && !(bl2 = list.isEmpty())) {
            bl3 = true;
        }
        Preconditions.checkArgument(bl3, "requestedScopes cannot be null or empty");
        this.zba = list;
        return this;
    }

    public final AuthorizationRequest$Builder zba(String string2) {
        this.zbc(string2);
        this.zbb = string2;
        this.zbd = true;
        return this;
    }

    public final AuthorizationRequest$Builder zbb(String string2) {
        this.zbg = string2;
        return this;
    }
}

