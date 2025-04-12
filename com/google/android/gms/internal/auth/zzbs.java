/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.auth.zzbg;
import com.google.android.gms.internal.auth.zzbh;
import com.google.android.gms.internal.auth.zzbj;
import com.google.android.gms.internal.auth.zzbr;
import com.google.android.gms.internal.auth.zzbt;

final class zzbs
extends zzbj {
    public zzbs(zzbt zzbt2, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final void zza(Context object, zzbh zzbh2) {
        object = new zzbr(this);
        zzbh2.zzd((zzbg)object);
    }
}

