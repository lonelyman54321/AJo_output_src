/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Monitor$Guard;
import com.google.common.util.concurrent.Service$State;
import com.google.common.util.concurrent.ServiceManager$ServiceManagerState;

final class ServiceManager$ServiceManagerState$StoppedGuard
extends Monitor$Guard {
    final /* synthetic */ ServiceManager$ServiceManagerState this$0;

    public ServiceManager$ServiceManagerState$StoppedGuard(ServiceManager$ServiceManagerState object) {
        this.this$0 = object;
        object = ((ServiceManager$ServiceManagerState)object).monitor;
        super((Monitor)object);
    }

    public boolean isSatisfied() {
        Object object = this.this$0.states;
        Object object2 = Service$State.TERMINATED;
        int n3 = object.count(object2);
        object2 = this.this$0.states;
        Service$State service$State = Service$State.FAILED;
        int n4 = object2.count((Object)service$State) + n3;
        object = this.this$0;
        n3 = ((ServiceManager$ServiceManagerState)object).numberOfServices;
        if (n4 == n3) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }
}

