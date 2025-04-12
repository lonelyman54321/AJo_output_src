/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.clevertap.android.sdk.events;

import android.content.Context;
import com.clevertap.android.sdk.events.EventQueueManager;

class EventQueueManager$2
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ FB0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ EventQueueManager d;

    public EventQueueManager$2(EventQueueManager eventQueueManager, Context context, FB0 fB0, String string2) {
        this.d = eventQueueManager;
        this.a = context;
        this.b = fB0;
        this.c = string2;
    }

    public final void run() {
        tu1_1 tu1_12 = this.d.m;
        FB0 fB0 = this.b;
        String string2 = this.c;
        Context context = this.a;
        tu1_12.b(context, fB0, string2);
    }
}

