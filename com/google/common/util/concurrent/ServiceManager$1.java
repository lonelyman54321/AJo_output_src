/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ListenerCallQueue$Event;
import com.google.common.util.concurrent.ServiceManager$Listener;

class ServiceManager$1
implements ListenerCallQueue$Event {
    public void call(ServiceManager$Listener serviceManager$Listener) {
        serviceManager$Listener.healthy();
    }

    public String toString() {
        return "healthy()";
    }
}

