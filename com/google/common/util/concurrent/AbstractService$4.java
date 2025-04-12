/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ListenerCallQueue$Event;
import com.google.common.util.concurrent.Service$Listener;
import com.google.common.util.concurrent.Service$State;

class AbstractService$4
implements ListenerCallQueue$Event {
    final /* synthetic */ Service$State val$from;

    public AbstractService$4(Service$State service$State) {
        this.val$from = service$State;
    }

    public void call(Service$Listener service$Listener) {
        Service$State service$State = this.val$from;
        service$Listener.stopping(service$State);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("stopping({from = ");
        Service$State service$State = this.val$from;
        stringBuilder.append((Object)service$State);
        stringBuilder.append("})");
        return stringBuilder.toString();
    }
}

