/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;

abstract class zbl
extends BaseImplementation$ApiMethodImpl {
    public zbl(GoogleApiClient googleApiClient) {
        Api api = Auth.GOOGLE_SIGN_IN_API;
        super(api, googleApiClient);
    }
}

