/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzae;
import com.google.android.gms.internal.location.zzaf;

final class zzac
extends zzae {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    public zzac(zzaf zzaf2, GoogleApiClient googleApiClient, long l2, PendingIntent pendingIntent) {
        this.zza = l2;
        this.zzb = pendingIntent;
        super(googleApiClient);
    }
}

