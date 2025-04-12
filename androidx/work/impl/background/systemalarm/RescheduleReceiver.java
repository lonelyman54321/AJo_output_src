/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;
import java.util.Objects;

public class RescheduleReceiver
extends BroadcastReceiver {
    static {
        qx1.b("RescheduleReceiver");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void onReceive(Context object, Intent intent) {
        Throwable throwable2;
        block9: {
            int n3;
            block8: {
                Object object2 = qx1.a();
                Objects.toString(intent);
                object2.getClass();
                n3 = Build.VERSION.SDK_INT;
                int n4 = 23;
                if (n3 < n4) {
                    n3 = a.f;
                    intent = new Intent((Context)object, SystemAlarmService.class);
                    object2 = "ACTION_RESCHEDULE";
                    intent.setAction((String)object2);
                    object.startService(intent);
                    return;
                }
                try {
                    object = ni3_1.i((Context)object);
                    intent = this.goAsync();
                    object.getClass();
                    object2 = ni3_1.m;
                    // MONITORENTER : object2
                }
                catch (IllegalStateException illegalStateException) {}
                try {
                    BroadcastReceiver.PendingResult pendingResult = ((ni3_1)object).i;
                    if (pendingResult == null) break block8;
                    pendingResult.finish();
                }
                catch (Throwable throwable2) {
                    break block9;
                }
            }
            ((ni3_1)object).i = intent;
            boolean bl2 = ((ni3_1)object).h;
            if (bl2) {
                intent.finish();
                n3 = 0;
                intent = null;
                ((ni3_1)object).i = null;
            }
            // MONITOREXIT : object2
            return;
        }
        // MONITOREXIT : object2
        throw throwable2;
        object = qx1.a();
        object.getClass();
    }
}

