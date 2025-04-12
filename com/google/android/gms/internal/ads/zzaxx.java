/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class zzaxx
extends BroadcastReceiver {
    private boolean zza = true;

    public zzaxx(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver((BroadcastReceiver)this, intentFilter);
    }

    public final void onReceive(Context object, Intent object2) {
        String string2 = "android.intent.action.USER_PRESENT";
        object = object2.getAction();
        boolean bl2 = string2.equals(object);
        if (bl2) {
            this.zza = true;
            return;
        }
        object2 = "android.intent.action.SCREEN_OFF";
        object = object2.getAction();
        bl2 = ((String)object2).equals(object);
        if (bl2) {
            bl2 = false;
            object = null;
            this.zza = false;
        }
    }

    public final boolean zza() {
        return this.zza;
    }
}

