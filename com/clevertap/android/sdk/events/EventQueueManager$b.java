/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.events;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.events.EventQueueManager;
import java.util.concurrent.Callable;

public final class EventQueueManager$b
implements Callable {
    public final /* synthetic */ EventQueueManager a;

    public EventQueueManager$b(EventQueueManager eventQueueManager) {
        this.a = eventQueueManager;
    }

    public final Object call() {
        Object object = this.a;
        Object object2 = ((EventQueueManager)object).d;
        object2 = ((CleverTapInstanceConfig)object2).b();
        Object object3 = ((EventQueueManager)object).d;
        object3 = ((CleverTapInstanceConfig)object3).a;
        String string2 = "Queuing daily events";
        ((b)object2).b((String)object3, string2);
        object2 = null;
        try {
            ((EventQueueManager)object).W(null, false);
        }
        catch (Throwable throwable) {
            object2 = ((EventQueueManager)object).d.b();
            object = ((EventQueueManager)object).d.a;
            object2.getClass();
            b.m();
        }
        return null;
    }
}

