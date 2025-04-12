/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.play.core.appupdate.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.appupdate.internal.zzj;
import com.google.android.play.core.appupdate.internal.zzl;

final class zzk
extends BroadcastReceiver {
    final /* synthetic */ zzl zza;

    public /* synthetic */ zzk(zzl zzl2, zzj zzj2) {
        this.zza = zzl2;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zza(context, intent);
    }
}

