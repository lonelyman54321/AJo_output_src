/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1;
import kotlin.jvm.internal.Intrinsics;

public abstract class BroadcastReceiverConstraintTracker
extends N50 {
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 f;

    public BroadcastReceiverConstraintTracker(Context object, Si3 si3) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(si3, "taskExecutor");
        super((Context)object, si3);
        super(this);
        this.f = object;
    }

    public final void c() {
        qx1 qx12 = qx1.a();
        qx12.getClass();
        qx12 = this.e();
        Context context = this.b;
        BroadcastReceiverConstraintTracker$broadcastReceiver$1 broadcastReceiverConstraintTracker$broadcastReceiver$1 = this.f;
        context.registerReceiver((BroadcastReceiver)broadcastReceiverConstraintTracker$broadcastReceiver$1, (IntentFilter)qx12);
    }

    public final void d() {
        Object object = qx1.a();
        object.getClass();
        object = this.f;
        this.b.unregisterReceiver((BroadcastReceiver)object);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent var1);
}

