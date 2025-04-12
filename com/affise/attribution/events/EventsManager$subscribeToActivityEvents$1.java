/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events;

import com.affise.attribution.events.EventsManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class EventsManager$subscribeToActivityEvents$1
extends Lambda
implements Function1 {
    final /* synthetic */ EventsManager this$0;

    public EventsManager$subscribeToActivityEvents$1(EventsManager eventsManager2) {
        this.this$0 = eventsManager2;
        super(1);
    }

    public final void invoke(long l2) {
        long l3;
        long l4;
        long l7;
        EventsManager eventsManager2 = this.this$0;
        long l8 = EventsManager.access$getLastSessionCount$p(eventsManager2);
        long l12 = l8 - (l7 = 1L);
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object == false && (l4 = (l3 = l2 - (l8 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
            eventsManager2 = this.this$0;
            EventsManager.access$stopTimer(eventsManager2);
        }
        EventsManager.access$setLastSessionCount$p(this.this$0, l2);
    }
}

