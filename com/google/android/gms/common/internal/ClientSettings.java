/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Context
 *  android.view.View
 */
package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient$Builder;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class ClientSettings {
    private final Account zaa;
    private final Set zab;
    private final Set zac;
    private final Map zad;
    private final int zae;
    private final View zaf;
    private final String zag;
    private final String zah;
    private final SignInOptions zai;
    private Integer zaj;

    public ClientSettings(Account account, Set set, Map map2, int n3, View view, String string2, String string3, SignInOptions signInOptions) {
        this(account, set, map2, n3, view, string2, string3, signInOptions, false);
    }

    public ClientSettings(Account object, Set set, Map object2, int n3, View view, String string2, String string3, SignInOptions signInOptions, boolean bl2) {
        boolean bl3;
        this.zaa = object;
        object = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.zab = object;
        if (object2 == null) {
            object2 = Collections.emptyMap();
        }
        this.zad = object2;
        this.zaf = view;
        this.zae = n3;
        this.zag = string2;
        this.zah = string3;
        if (signInOptions == null) {
            signInOptions = SignInOptions.zaa;
        }
        this.zai = signInOptions;
        super(object);
        object = object2.values().iterator();
        while (bl3 = object.hasNext()) {
            object2 = ((zab)object.next()).zaa;
            set.addAll(object2);
        }
        this.zac = object = Collections.unmodifiableSet(set);
    }

    public static ClientSettings createDefault(Context context) {
        GoogleApiClient$Builder googleApiClient$Builder = new GoogleApiClient$Builder(context);
        return googleApiClient$Builder.zaa();
    }

    public Account getAccount() {
        return this.zaa;
    }

    public String getAccountName() {
        Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account getAccountOrDefault() {
        Account account = this.zaa;
        if (account != null) {
            return account;
        }
        account = new Account("<<default account>>", "com.google");
        return account;
    }

    public Set getAllRequestedScopes() {
        return this.zac;
    }

    public Set getApplicableScopes(Api object) {
        boolean bl2;
        Object object2 = this.zad;
        if ((object = (zab)object2.get(object)) != null && !(bl2 = (object2 = ((zab)object).zaa).isEmpty())) {
            object2 = this.zab;
            HashSet hashSet = new HashSet(object2);
            object = ((zab)object).zaa;
            hashSet.addAll(object);
            return hashSet;
        }
        return this.zab;
    }

    public int getGravityForPopups() {
        return this.zae;
    }

    public String getRealClientPackageName() {
        return this.zag;
    }

    public Set getRequiredScopes() {
        return this.zab;
    }

    public View getViewForPopups() {
        return this.zaf;
    }

    public final SignInOptions zaa() {
        return this.zai;
    }

    public final Integer zab() {
        return this.zaj;
    }

    public final String zac() {
        return this.zah;
    }

    public final Map zad() {
        return this.zad;
    }

    public final void zae(Integer n3) {
        this.zaj = n3;
    }
}

