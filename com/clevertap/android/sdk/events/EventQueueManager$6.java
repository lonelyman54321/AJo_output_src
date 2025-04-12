/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.clevertap.android.sdk.events;

import android.content.Context;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.events.EventQueueManager;

class EventQueueManager$6
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ EventQueueManager b;

    public EventQueueManager$6(EventQueueManager eventQueueManager, Context context) {
        this.b = eventQueueManager;
        this.a = context;
    }

    public final void run() {
        EventQueueManager eventQueueManager = this.b;
        b b2 = eventQueueManager.d.b();
        Object object = eventQueueManager.d.a;
        b2.b((String)object, "Pushing Notification Viewed event onto queue flush async");
        b2 = this.a;
        object = FB0.PUSH_NOTIFICATION_VIEWED;
        eventQueueManager.b0((Context)b2, (FB0)((Object)object));
    }
}

