/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcm;

final class zzcl
extends BroadcastReceiver {
    final /* synthetic */ zzcm zza;

    public zzcl(zzcm zzcm2) {
        this.zza = zzcm2;
    }

    public final void onReceive(Context context, Intent intent) {
        zzcm.zza(this.zza, context, intent);
    }
}

