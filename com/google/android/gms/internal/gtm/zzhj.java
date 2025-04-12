/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzhz;

final class zzhj
extends BroadcastReceiver {
    static final String zza = "com.google.android.gms.internal.gtm.zzhj";
    private final zzhz zzb;

    public zzhj(zzhz zzhz2) {
        this.zzb = zzhz2;
    }

    public final void onReceive(Context object, Intent object2) {
        Object object3 = "android.net.conn.CONNECTIVITY_CHANGE";
        object = object2.getAction();
        boolean bl2 = ((String)object3).equals(object);
        if (bl2) {
            object = object2.getExtras();
            object3 = Boolean.FALSE;
            if (object != null) {
                object = object2.getExtras();
                object2 = "noConnectivity";
                boolean bl3 = object.getBoolean((String)object2);
                object3 = bl3;
            }
            object = this.zzb;
            boolean bl4 = (Boolean)object3 ^ true;
            ((zzhz)object).zzb(bl4);
            return;
        }
        object3 = "com.google.analytics.RADIO_POWERED";
        boolean bl5 = ((String)object3).equals(object);
        if (bl5 && !(bl5 = object2.hasExtra((String)(object = zza)))) {
            object = this.zzb;
            ((zzhz)object).zza();
        }
    }
}

