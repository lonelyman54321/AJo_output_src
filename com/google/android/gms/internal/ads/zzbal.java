/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.zzbao;

final class zzbal
extends BroadcastReceiver {
    final /* synthetic */ zzbao zza;

    public zzbal(zzbao zzbao2) {
        this.zza = zzbao2;
    }

    public final void onReceive(Context context, Intent intent) {
        zzbao.zzb(this.zza, 3);
    }
}

