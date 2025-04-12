/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.Multiset;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Monitor$Guard;
import com.google.common.util.concurrent.Service$State;
import com.google.common.util.concurrent.ServiceManager$ServiceManagerState;

final class ServiceManager$ServiceManagerState$AwaitHealthGuard
extends Monitor$Guard {
    final /* synthetic */ ServiceManager$ServiceManagerState this$0;

    public ServiceManager$ServiceManagerState$AwaitHealthGuard(ServiceManager$ServiceManagerState object) {
        this.this$0 = object;
        object = ((ServiceManager$ServiceManagerState)object).monitor;
        super((Monitor)object);
    }

    public boolean isSatisfied() {
        Multiset multiset = this.this$0.states;
        Object object = Service$State.RUNNING;
        int n3 = multiset.count(object);
        object = this.this$0;
        int n4 = ((ServiceManager$ServiceManagerState)object).numberOfServices;
        if (n3 != n4 && (n3 = (multiset = ((ServiceManager$ServiceManagerState)object).states).contains(object = Service$State.STOPPING)) == 0 && (n3 = (multiset = this.this$0.states).contains(object = Service$State.TERMINATED)) == 0 && (n3 = (multiset = this.this$0.states).contains(object = Service$State.FAILED)) == 0) {
            n3 = 0;
            multiset = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }
}

