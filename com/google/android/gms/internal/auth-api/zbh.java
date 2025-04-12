/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.auth-api;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.auth-api.zbk;
import com.google.android.gms.internal.auth-api.zbl;
import com.google.android.gms.internal.auth-api.zbm;
import com.google.android.gms.internal.auth-api.zbs;
import com.google.android.gms.internal.auth-api.zbt;
import com.google.android.gms.internal.auth-api.zbu;

final class zbh
extends zbm {
    final /* synthetic */ Credential zba;

    public zbh(zbl zbl2, GoogleApiClient googleApiClient, Credential credential) {
        this.zba = credential;
        super(googleApiClient);
    }

    public final void zba(Context object, zbt zbt2) {
        object = new zbk(this);
        Credential credential = this.zba;
        zbu zbu2 = new zbu(credential);
        zbt2.zbe((zbs)object, zbu2);
    }
}

