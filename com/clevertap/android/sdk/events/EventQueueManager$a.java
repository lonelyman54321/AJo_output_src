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
import java.util.concurrent.Callable;

public final class EventQueueManager$a
implements Callable {
    public final /* synthetic */ FB0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ EventQueueManager c;

    public EventQueueManager$a(EventQueueManager eventQueueManager, FB0 fB0, Context context) {
        this.c = eventQueueManager;
        this.a = fB0;
        this.b = context;
    }

    public final Object call() {
        Object object = FB0.PUSH_NOTIFICATION_VIEWED;
        EventQueueManager eventQueueManager = this.c;
        FB0 fB0 = this.a;
        if (fB0 == object) {
            object = eventQueueManager.j;
            String string2 = eventQueueManager.d.a;
            String string3 = "Pushing Notification Viewed event onto queue flush sync";
            ((b)object).b(string2, string3);
        } else {
            object = eventQueueManager.j;
            String string4 = eventQueueManager.d.a;
            String string5 = "Pushing event onto queue flush sync";
            ((b)object).b(string4, string5);
        }
        object = this.b;
        eventQueueManager.T((Context)object, fB0, null);
        return null;
    }
}

