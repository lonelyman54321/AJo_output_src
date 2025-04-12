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
import com.google.android.gms.internal.ads.zzfqb;

final class zzfqa
extends BroadcastReceiver {
    public final void onReceive(Context object, Intent intent) {
        String string2;
        object = intent.getAction();
        if (object == (string2 = "android.media.action.HDMI_AUDIO_PLUG")) {
            object = "android.media.extra.AUDIO_PLUG_STATE";
            int n3 = -1;
            int n4 = intent.getIntExtra((String)object, n3);
            int n7 = 1;
            if (n4 == 0) {
                zzfqb.zzc(n7);
                return;
            }
            if (n4 == n7) {
                n4 = 2;
                zzfqb.zzc(n4);
            }
        }
    }
}

