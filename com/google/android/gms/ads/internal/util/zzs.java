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
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.util.zzt;

final class zzs
extends BroadcastReceiver {
    final /* synthetic */ zzt zza;

    public /* synthetic */ zzs(zzt zzt2, zzr zzr2) {
        this.zza = zzt2;
    }

    public final void onReceive(Context object, Intent object2) {
        String string2 = "android.intent.action.USER_PRESENT";
        object = object2.getAction();
        boolean bl2 = string2.equals(object);
        if (bl2) {
            zzt.zze(this.zza, true);
            return;
        }
        object2 = "android.intent.action.SCREEN_OFF";
        object = object2.getAction();
        bl2 = ((String)object2).equals(object);
        if (bl2) {
            object = this.zza;
            object2 = null;
            zzt.zze((zzt)object, false);
        }
    }
}

