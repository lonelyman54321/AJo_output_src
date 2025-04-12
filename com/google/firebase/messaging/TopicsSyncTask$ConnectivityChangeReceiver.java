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
import com.google.firebase.messaging.TopicsSubscriber;
import com.google.firebase.messaging.TopicsSyncTask;

class TopicsSyncTask$ConnectivityChangeReceiver
extends BroadcastReceiver {
    private TopicsSyncTask task;
    final /* synthetic */ TopicsSyncTask this$0;

    public TopicsSyncTask$ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask, TopicsSyncTask topicsSyncTask2) {
        this.this$0 = topicsSyncTask;
        this.task = topicsSyncTask2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onReceive(Context context, Intent object) {
        synchronized (this) {
            object = this.task;
            if (object == null) {
                return;
            }
            boolean bl2 = TopicsSyncTask.access$000((TopicsSyncTask)object);
            if (!bl2) {
                return;
            }
            TopicsSyncTask.access$100();
            object = this.task;
            object = TopicsSyncTask.access$200((TopicsSyncTask)object);
            TopicsSyncTask topicsSyncTask = this.task;
            long l2 = 0L;
            ((TopicsSubscriber)object).scheduleSyncTaskWithDelaySeconds(topicsSyncTask, l2);
            context.unregisterReceiver((BroadcastReceiver)this);
            context = null;
            this.task = null;
            return;
        }
    }

    public void registerReceiver() {
        TopicsSyncTask.access$100();
        Context context = TopicsSyncTask.access$300(this.this$0);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver((BroadcastReceiver)this, intentFilter);
    }
}

