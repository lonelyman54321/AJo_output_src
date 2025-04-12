/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$1;

public class ConstraintProxyUpdateReceiver
extends BroadcastReceiver {
    public static final /* synthetic */ int a;

    static {
        qx1.b("ConstrntProxyUpdtRecvr");
    }

    public final void onReceive(Context object, Intent intent) {
        boolean bl2;
        String string2;
        if (intent != null) {
            string2 = intent.getAction();
        } else {
            bl2 = false;
            string2 = null;
        }
        Object object2 = "androidx.work.impl.background.systemalarm.UpdateProxies";
        bl2 = ((String)object2).equals(string2);
        if (!bl2) {
            object = qx1.a();
            object.getClass();
        } else {
            string2 = this.goAsync();
            object2 = ni3_1.i((Context)object).d;
            ConstraintProxyUpdateReceiver$1 constraintProxyUpdateReceiver$1 = new ConstraintProxyUpdateReceiver$1((BroadcastReceiver.PendingResult)string2, (Context)object, intent);
            object2.d(constraintProxyUpdateReceiver$1);
        }
    }
}

