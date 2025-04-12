/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.internal.zbd;
import com.google.android.gms.auth.api.zba;
import com.google.android.gms.auth.api.zbb;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.internal.auth-api.zbl;

public final class Auth {
    public static final Api CREDENTIALS_API;
    public static final CredentialsApi CredentialsApi;
    public static final Api GOOGLE_SIGN_IN_API;
    public static final GoogleSignInApi GoogleSignInApi;
    public static final Api PROXY_API;
    public static final ProxyApi ProxyApi;
    public static final Api$ClientKey zba;
    public static final Api$ClientKey zbb;
    private static final Api$AbstractClientBuilder zbc;
    private static final Api$AbstractClientBuilder zbd;

    static {
        Api api;
        Api$ClientKey api$ClientKey;
        Object object = new Api$ClientKey();
        zba = object;
        zbb = api$ClientKey = new Api$ClientKey();
        zba zba2 = new zba();
        zbc = zba2;
        zbb zbb2 = new zbb();
        zbd = zbb2;
        PROXY_API = AuthProxy.API;
        CREDENTIALS_API = api = new Api("Auth.CREDENTIALS_API", zba2, (Api$ClientKey)object);
        GOOGLE_SIGN_IN_API = object = new Api("Auth.GOOGLE_SIGN_IN_API", zbb2, api$ClientKey);
        ProxyApi = AuthProxy.ProxyApi;
        CredentialsApi = object = new zbl();
        GoogleSignInApi = object = new zbd();
    }

    private Auth() {
    }
}

