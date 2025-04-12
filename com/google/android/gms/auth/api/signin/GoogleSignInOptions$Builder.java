/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class GoogleSignInOptions$Builder {
    private Set zaa;
    private boolean zab;
    private boolean zac;
    private boolean zad;
    private String zae;
    private Account zaf;
    private String zag;
    private Map zah;
    private String zai;

    public GoogleSignInOptions$Builder() {
        Cloneable cloneable;
        this.zaa = cloneable = new Cloneable();
        this.zah = cloneable;
    }

    public GoogleSignInOptions$Builder(GoogleSignInOptions object) {
        boolean bl2;
        Object object2 = new HashSet();
        this.zaa = object2;
        this.zah = object2;
        Preconditions.checkNotNull(object);
        ArrayList arrayList = GoogleSignInOptions.zah((GoogleSignInOptions)object);
        object2 = new HashSet(arrayList);
        this.zaa = object2;
        this.zab = bl2 = GoogleSignInOptions.zal((GoogleSignInOptions)object);
        this.zac = bl2 = GoogleSignInOptions.zaj((GoogleSignInOptions)object);
        this.zad = bl2 = GoogleSignInOptions.zak((GoogleSignInOptions)object);
        this.zae = object2 = GoogleSignInOptions.zae((GoogleSignInOptions)object);
        object2 = GoogleSignInOptions.zaa((GoogleSignInOptions)object);
        this.zaf = object2;
        this.zag = object2 = GoogleSignInOptions.zac((GoogleSignInOptions)object);
        this.zah = object2 = GoogleSignInOptions.zai(GoogleSignInOptions.zag((GoogleSignInOptions)object));
        this.zai = object = GoogleSignInOptions.zad((GoogleSignInOptions)object);
    }

    private final String zaa(String string2) {
        boolean bl2;
        Preconditions.checkNotEmpty(string2);
        String string3 = this.zae;
        boolean bl3 = true;
        if (string3 != null && !(bl2 = string3.equals(string2))) {
            bl3 = false;
        }
        Preconditions.checkArgument(bl3, "two different server client ids provided");
        return string2;
    }

    public GoogleSignInOptions$Builder addExtension(GoogleSignInOptionsExtension object) {
        Object object2 = this.zah;
        int n3 = object.getExtensionType();
        Object object3 = n3;
        boolean bl2 = object2.containsKey(object3);
        if (!bl2) {
            object2 = object.getImpliedScopes();
            if (object2 != null) {
                object3 = this.zaa;
                object3.addAll(object2);
            }
            object2 = this.zah;
            object3 = object.getExtensionType();
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = new GoogleSignInOptionsExtensionParcelable((GoogleSignInOptionsExtension)object);
            object2.put(object3, googleSignInOptionsExtensionParcelable);
            return this;
        }
        object = new IllegalStateException("Only one extension per type may be added");
        throw object;
    }

    public GoogleSignInOptions build() {
        Object object = this.zaa;
        Object object2 = GoogleSignInOptions.zae;
        boolean bl2 = object.contains(object2);
        if (bl2 && (bl2 = (object = this.zaa).contains(object2 = GoogleSignInOptions.zad))) {
            object = this.zaa;
            object.remove(object2);
        }
        if ((bl2 = this.zad) && ((object = this.zaf) == null || !(bl2 = (object = this.zaa).isEmpty()))) {
            this.requestId();
        }
        object2 = this.zaa;
        ArrayList arrayList = new ArrayList(object2);
        Account account = this.zaf;
        boolean bl3 = this.zad;
        boolean bl4 = this.zab;
        boolean bl5 = this.zac;
        String string2 = this.zae;
        String string3 = this.zag;
        Map map2 = this.zah;
        String string4 = this.zai;
        object2 = object;
        object = new GoogleSignInOptions(3, arrayList, account, bl3, bl4, bl5, string2, string3, map2, string4, null);
        return object;
    }

    public GoogleSignInOptions$Builder requestEmail() {
        Set set = this.zaa;
        Scope scope = GoogleSignInOptions.zab;
        set.add(scope);
        return this;
    }

    public GoogleSignInOptions$Builder requestId() {
        Set set = this.zaa;
        Scope scope = GoogleSignInOptions.zac;
        set.add(scope);
        return this;
    }

    public GoogleSignInOptions$Builder requestIdToken(String string2) {
        this.zad = true;
        this.zaa(string2);
        this.zae = string2;
        return this;
    }

    public GoogleSignInOptions$Builder requestProfile() {
        Set set = this.zaa;
        Scope scope = GoogleSignInOptions.zaa;
        set.add(scope);
        return this;
    }

    public GoogleSignInOptions$Builder requestScopes(Scope object, Scope ... object2) {
        this.zaa.add(object);
        object = this.zaa;
        object2 = Arrays.asList(object2);
        object.addAll(object2);
        return this;
    }

    public GoogleSignInOptions$Builder requestServerAuthCode(String string2) {
        this.requestServerAuthCode(string2, false);
        return this;
    }

    public GoogleSignInOptions$Builder requestServerAuthCode(String string2, boolean bl2) {
        this.zab = true;
        this.zaa(string2);
        this.zae = string2;
        this.zac = bl2;
        return this;
    }

    public GoogleSignInOptions$Builder setAccountName(String string2) {
        Account account;
        string2 = Preconditions.checkNotEmpty(string2);
        this.zaf = account = new Account(string2, "com.google");
        return this;
    }

    public GoogleSignInOptions$Builder setHostedDomain(String string2) {
        this.zag = string2 = Preconditions.checkNotEmpty(string2);
        return this;
    }

    public GoogleSignInOptions$Builder setLogSessionId(String string2) {
        this.zai = string2;
        return this;
    }
}

