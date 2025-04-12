/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;

class ConstraintProxyUpdateReceiver$1
implements Runnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ BroadcastReceiver.PendingResult c;

    public ConstraintProxyUpdateReceiver$1(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
        this.a = intent;
        this.b = context;
        this.c = pendingResult;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.c;
        Context context = this.b;
        Intent intent = this.a;
        String string2 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
        Object object = null;
        boolean bl2 = intent.getBooleanExtra(string2, false);
        String string3 = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
        boolean bl3 = intent.getBooleanExtra(string3, false);
        String string4 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
        boolean bl4 = intent.getBooleanExtra(string4, false);
        String string5 = "KEY_NETWORK_STATE_PROXY_ENABLED";
        boolean bl5 = intent.getBooleanExtra(string5, false);
        object = qx1.a();
        try {
            object.getClass();
            object = ConstraintProxy.BatteryNotLowProxy.class;
            dk2_0.a(context, (Class)object, bl2);
            Class<ConstraintProxy.BatteryChargingProxy> clazz = ConstraintProxy.BatteryChargingProxy.class;
            dk2_0.a(context, clazz, bl3);
            Class<ConstraintProxy.StorageNotLowProxy> clazz2 = ConstraintProxy.StorageNotLowProxy.class;
            dk2_0.a(context, clazz2, bl4);
            Class<ConstraintProxy$NetworkStateProxy> clazz3 = ConstraintProxy$NetworkStateProxy.class;
            dk2_0.a(context, clazz3, bl5);
            return;
        }
        finally {
            pendingResult.finish();
        }
    }
}

