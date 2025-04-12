/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractService;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Monitor$Guard;
import com.google.common.util.concurrent.Service$State;

final class AbstractService$HasReachedRunningGuard
extends Monitor$Guard {
    final /* synthetic */ AbstractService this$0;

    public AbstractService$HasReachedRunningGuard(AbstractService object) {
        this.this$0 = object;
        object = AbstractService.access$000((AbstractService)object);
        super((Monitor)object);
    }

    public boolean isSatisfied() {
        Service$State service$State;
        Service$State service$State2 = this.this$0.state();
        int n3 = service$State2.compareTo(service$State = Service$State.RUNNING);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            service$State2 = null;
        }
        return n3 != 0;
    }
}

