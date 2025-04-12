/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.SyncTask;

class SyncTask$ConnectivityChangeReceiver
extends BroadcastReceiver {
    private SyncTask task;

    public SyncTask$ConnectivityChangeReceiver(SyncTask syncTask) {
        this.task = syncTask;
    }

    public void onReceive(Context object, Intent object2) {
        object = this.task;
        if (object == null) {
            return;
        }
        boolean bl2 = ((SyncTask)object).isDeviceConnected();
        if (!bl2) {
            return;
        }
        SyncTask.isDebugLogEnabled();
        object = SyncTask.access$000(this.task);
        object2 = this.task;
        ((FirebaseMessaging)object).enqueueTaskWithDelaySeconds((Runnable)object2, 0L);
        this.task.getContext().unregisterReceiver((BroadcastReceiver)this);
        this.task = null;
    }

    public void registerReceiver() {
        SyncTask.isDebugLogEnabled();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.task.getContext().registerReceiver((BroadcastReceiver)this, intentFilter);
    }
}

