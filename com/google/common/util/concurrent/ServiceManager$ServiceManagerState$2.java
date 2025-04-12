/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ListenerCallQueue$Event;
import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.ServiceManager$Listener;
import com.google.common.util.concurrent.ServiceManager$ServiceManagerState;

class ServiceManager$ServiceManagerState$2
implements ListenerCallQueue$Event {
    final /* synthetic */ Service val$service;

    public ServiceManager$ServiceManagerState$2(ServiceManager$ServiceManagerState serviceManager$ServiceManagerState, Service service) {
        this.val$service = service;
    }

    public void call(ServiceManager$Listener serviceManager$Listener) {
        Service service = this.val$service;
        serviceManager$Listener.failure(service);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("failed({service=");
        Service service = this.val$service;
        stringBuilder.append(service);
        stringBuilder.append("})");
        return stringBuilder.toString();
    }
}

