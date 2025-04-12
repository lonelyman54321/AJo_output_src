/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.utils.ForceStopRunnable;

public class ForceStopRunnable$BroadcastReceiver
extends BroadcastReceiver {
    static {
        qx1.b("ForceStopRunnable$Rcvr");
    }

    public final void onReceive(Context context, Intent object) {
        String string2;
        boolean bl2;
        if (object != null && (bl2 = (string2 = "ACTION_FORCE_STOP_RESCHEDULE").equals(object = object.getAction()))) {
            object = qx1.a();
            object.getClass();
            ForceStopRunnable.b(context);
        }
    }
}

