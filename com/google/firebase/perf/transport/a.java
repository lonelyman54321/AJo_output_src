/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.transport;

import com.google.firebase.perf.transport.PendingPerfEvent;
import com.google.firebase.perf.transport.TransportManager;

public final class a
implements Runnable {
    public final /* synthetic */ TransportManager a;
    public final /* synthetic */ PendingPerfEvent b;

    public /* synthetic */ a(TransportManager transportManager, PendingPerfEvent pendingPerfEvent) {
        this.a = transportManager;
        this.b = pendingPerfEvent;
    }

    public final void run() {
        TransportManager transportManager = this.a;
        PendingPerfEvent pendingPerfEvent = this.b;
        TransportManager.b(transportManager, pendingPerfEvent);
    }
}

