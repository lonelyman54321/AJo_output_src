/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzcq;
import com.google.android.gms.internal.location.zzcr;

final class zzco
extends zzcq {
    final /* synthetic */ PendingIntent zza;

    public zzco(zzcr zzcr2, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        this.zza = pendingIntent;
        super(googleApiClient);
    }
}

