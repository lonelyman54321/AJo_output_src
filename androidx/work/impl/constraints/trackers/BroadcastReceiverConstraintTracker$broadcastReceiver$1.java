/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import kotlin.jvm.internal.Intrinsics;

public final class BroadcastReceiverConstraintTracker$broadcastReceiver$1
extends BroadcastReceiver {
    public final /* synthetic */ BroadcastReceiverConstraintTracker a;

    public BroadcastReceiverConstraintTracker$broadcastReceiver$1(BroadcastReceiverConstraintTracker broadcastReceiverConstraintTracker) {
        this.a = broadcastReceiverConstraintTracker;
    }

    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.a.f(intent);
    }
}

