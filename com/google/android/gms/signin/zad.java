/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zab;

public final class zad {
    public static final Api$ClientKey zaa;
    public static final Api$ClientKey zab;
    public static final Api$AbstractClientBuilder zac;
    static final Api$AbstractClientBuilder zad;
    public static final Scope zae;
    public static final Scope zaf;
    public static final Api zag;
    public static final Api zah;

    static {
        Api$ClientKey api$ClientKey;
        Object object = new Api$ClientKey();
        zaa = object;
        zab = api$ClientKey = new Api$ClientKey();
        zaa zaa2 = new zaa();
        zac = zaa2;
        zab zab2 = new zab();
        zad = zab2;
        Object object2 = new Scope("profile");
        zae = object2;
        object2 = new Scope("email");
        zaf = object2;
        zag = object2 = new Api("SignIn.API", zaa2, (Api$ClientKey)object);
        zah = object = new Api("SignIn.INTERNAL_API", zab2, api$ClientKey);
    }
}

