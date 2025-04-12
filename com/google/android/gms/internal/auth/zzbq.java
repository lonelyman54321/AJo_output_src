/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.auth.zzbg;
import com.google.android.gms.internal.auth.zzbh;
import com.google.android.gms.internal.auth.zzbi;
import com.google.android.gms.internal.auth.zzbp;
import com.google.android.gms.internal.auth.zzbt;

final class zzbq
extends zzbi {
    final /* synthetic */ ProxyRequest zza;

    public zzbq(zzbt zzbt2, GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        this.zza = proxyRequest;
        super(googleApiClient);
    }

    public final void zza(Context object, zzbh zzbh2) {
        object = new zzbp(this);
        ProxyRequest proxyRequest = this.zza;
        zzbh2.zze((zzbg)object, proxyRequest);
    }
}

