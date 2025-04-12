/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.clevertap.android.sdk.events;

import android.content.Context;
import com.clevertap.android.sdk.events.EventQueueManager;

class EventQueueManager$5
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ EventQueueManager b;

    public EventQueueManager$5(EventQueueManager eventQueueManager, Context context) {
        this.b = eventQueueManager;
        this.a = context;
    }

    public final void run() {
        FB0 fB0 = FB0.REGULAR;
        EventQueueManager eventQueueManager = this.b;
        Context context = this.a;
        eventQueueManager.b0(context, fB0);
        fB0 = FB0.PUSH_NOTIFICATION_VIEWED;
        eventQueueManager.b0(context, fB0);
    }
}

