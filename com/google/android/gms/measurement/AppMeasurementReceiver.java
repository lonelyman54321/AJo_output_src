/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzhk;
import com.google.android.gms.measurement.internal.zzhk$zza;

public final class AppMeasurementReceiver
extends WakefulBroadcastReceiver
implements zzhk$zza {
    private zzhk zza;

    public final BroadcastReceiver.PendingResult doGoAsync() {
        return this.goAsync();
    }

    public final void doStartService(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        zzhk zzhk2 = this.zza;
        if (zzhk2 == null) {
            this.zza = zzhk2 = new zzhk(this);
        }
        this.zza.zza(context, intent);
    }
}

