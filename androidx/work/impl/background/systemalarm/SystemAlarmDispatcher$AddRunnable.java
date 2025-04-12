/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;

class SystemAlarmDispatcher$AddRunnable
implements Runnable {
    public final SystemAlarmDispatcher a;
    public final Intent b;
    public final int c;

    public SystemAlarmDispatcher$AddRunnable(int n3, Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.a = systemAlarmDispatcher;
        this.b = intent;
        this.c = n3;
    }

    public final void run() {
        int n3 = this.c;
        SystemAlarmDispatcher systemAlarmDispatcher = this.a;
        Intent intent = this.b;
        systemAlarmDispatcher.b(n3, intent);
    }
}

