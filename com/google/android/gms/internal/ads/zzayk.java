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
import com.google.android.gms.internal.ads.zzayl;

final class zzayk
extends BroadcastReceiver {
    final /* synthetic */ zzayl zza;

    public zzayk(zzayl zzayl2) {
        this.zza = zzayl2;
    }

    public final void onReceive(Context context, Intent intent) {
        zzayl.zzc(this.zza);
    }
}

