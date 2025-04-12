/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Objects;

public abstract class ConstraintProxy
extends BroadcastReceiver {
    public static final /* synthetic */ int a;

    static {
        qx1.b("ConstraintProxy");
    }

    public final void onReceive(Context context, Intent intent) {
        qx1 qx12 = qx1.a();
        Objects.toString(intent);
        qx12.getClass();
        intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent);
    }
}

