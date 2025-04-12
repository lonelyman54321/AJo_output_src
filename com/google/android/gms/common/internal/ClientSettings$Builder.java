/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;

public final class ClientSettings$Builder {
    private Account zaa;
    private Np zab;
    private String zac;
    private String zad;
    private final SignInOptions zae;

    public ClientSettings$Builder() {
        SignInOptions signInOptions;
        this.zae = signInOptions = SignInOptions.zaa;
    }

    public ClientSettings build() {
        Account account = this.zaa;
        Np np = this.zab;
        String string2 = this.zac;
        String string3 = this.zad;
        SignInOptions signInOptions = this.zae;
        ClientSettings clientSettings = new ClientSettings(account, np, null, 0, null, string2, string3, signInOptions, false);
        return clientSettings;
    }

    public ClientSettings$Builder setRealClientPackageName(String string2) {
        this.zac = string2;
        return this;
    }

    public final ClientSettings$Builder zaa(Collection collection) {
        Np np = this.zab;
        if (np == null) {
            this.zab = np = new Np();
        }
        this.zab.addAll(collection);
        return this;
    }

    public final ClientSettings$Builder zab(Account account) {
        this.zaa = account;
        return this;
    }

    public final ClientSettings$Builder zac(String string2) {
        this.zad = string2;
        return this;
    }
}

