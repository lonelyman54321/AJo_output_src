/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractService;
import com.google.common.util.concurrent.ListenerCallQueue$Event;
import com.google.common.util.concurrent.Service$Listener;
import com.google.common.util.concurrent.Service$State;

class AbstractService$5
implements ListenerCallQueue$Event {
    final /* synthetic */ Throwable val$cause;
    final /* synthetic */ Service$State val$from;

    public AbstractService$5(AbstractService abstractService, Service$State service$State, Throwable throwable) {
        this.val$from = service$State;
        this.val$cause = throwable;
    }

    public void call(Service$Listener service$Listener) {
        Service$State service$State = this.val$from;
        Throwable throwable = this.val$cause;
        service$Listener.failed(service$State, throwable);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("failed({from = ");
        Object object = this.val$from;
        stringBuilder.append(object);
        stringBuilder.append(", cause = ");
        object = this.val$cause;
        stringBuilder.append(object);
        stringBuilder.append("})");
        return stringBuilder.toString();
    }
}

