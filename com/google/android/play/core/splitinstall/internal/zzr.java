/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.play.core.splitinstall.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.internal.zzq;
import com.google.android.play.core.splitinstall.internal.zzs;

final class zzr
extends BroadcastReceiver {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzr(zzs zzs2, zzq zzq2) {
        this.zza = zzs2;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zza(context, intent);
    }
}

