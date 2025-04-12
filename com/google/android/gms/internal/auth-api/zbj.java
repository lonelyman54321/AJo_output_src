/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.auth-api;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.auth-api.zbk;
import com.google.android.gms.internal.auth-api.zbl;
import com.google.android.gms.internal.auth-api.zbm;
import com.google.android.gms.internal.auth-api.zbs;
import com.google.android.gms.internal.auth-api.zbt;

final class zbj
extends zbm {
    public zbj(zbl zbl2, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final void zba(Context object, zbt zbt2) {
        object = new zbk(this);
        zbt2.zbf((zbs)object);
    }
}

