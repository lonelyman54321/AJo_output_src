/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events;

import com.affise.attribution.events.EventsManager;
import java.util.TimerTask;

public final class EventsManager$startTimer$2
extends TimerTask {
    final /* synthetic */ EventsManager this$0;

    public EventsManager$startTimer$2(EventsManager eventsManager2) {
        this.this$0 = eventsManager2;
    }

    public void run() {
        EventsManager.sendEvents$default(this.this$0, false, false, 3, null);
        EventsManager.access$stopTimer(this.this$0);
    }
}

