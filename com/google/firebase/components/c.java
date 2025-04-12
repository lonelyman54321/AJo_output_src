/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.EventBus;
import com.google.firebase.events.Event;
import java.util.Map;

public final class c
implements Runnable {
    public final /* synthetic */ Map.Entry a;
    public final /* synthetic */ Event b;

    public /* synthetic */ c(Map.Entry entry, Event event) {
        this.a = entry;
        this.b = event;
    }

    public final void run() {
        Map.Entry entry = this.a;
        Event event = this.b;
        EventBus.a(entry, event);
    }
}

