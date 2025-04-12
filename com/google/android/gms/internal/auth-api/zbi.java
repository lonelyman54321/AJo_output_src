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
import com.google.android.gms.internal.auth-api.zbp;
import com.google.android.gms.internal.auth-api.zbs;
import com.google.android.gms.internal.auth-api.zbt;

final class zbi
extends zbm {
    final /* synthetic */ Credential zba;

    public zbi(zbl zbl2, GoogleApiClient googleApiClient, Credential credential) {
        this.zba = credential;
        super(googleApiClient);
    }

    public final void zba(Context object, zbt zbt2) {
        object = new zbk(this);
        Credential credential = this.zba;
        zbp zbp2 = new zbp(credential);
        zbt2.zbc((zbs)object, zbp2);
    }
}

