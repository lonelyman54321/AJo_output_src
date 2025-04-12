/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.media3.exoplayer.audio.a;

public final class a$c
extends BroadcastReceiver {
    public final /* synthetic */ a a;

    public a$c(a a2) {
        this.a = a2;
    }

    public final void onReceive(Context object, Intent intent) {
        boolean bl2 = this.isInitialStickyBroadcast();
        if (!bl2) {
            a a2 = this.a;
            dr_1 dr_12 = a2.i;
            rr_0 rr_02 = a2.h;
            object = or_0.c(object, intent, dr_12, rr_02);
            a2.a((or_0)object);
        }
    }
}

