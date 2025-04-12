/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events;

import com.affise.attribution.events.EventsManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class EventsManager$sendEventsOnStop$1
extends Lambda
implements Function0 {
    final /* synthetic */ EventsManager this$0;

    public EventsManager$sendEventsOnStop$1(EventsManager eventsManager2) {
        this.this$0 = eventsManager2;
        super(0);
    }

    public final void invoke() {
        this.this$0.sendEvents(false, false);
    }
}

