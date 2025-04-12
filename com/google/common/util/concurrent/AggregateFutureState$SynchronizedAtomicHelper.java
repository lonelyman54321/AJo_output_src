/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AggregateFutureState;
import com.google.common.util.concurrent.AggregateFutureState$1;
import com.google.common.util.concurrent.AggregateFutureState$AtomicHelper;
import java.util.Set;

final class AggregateFutureState$SynchronizedAtomicHelper
extends AggregateFutureState$AtomicHelper {
    private AggregateFutureState$SynchronizedAtomicHelper() {
        super(null);
    }

    public /* synthetic */ AggregateFutureState$SynchronizedAtomicHelper(AggregateFutureState$1 aggregateFutureState$1) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void compareAndSetSeenExceptions(AggregateFutureState aggregateFutureState, Set set, Set set2) {
        synchronized (aggregateFutureState) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Set set3 = AggregateFutureState.access$200(aggregateFutureState);
                        if (set3 != set) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    AggregateFutureState.access$202(aggregateFutureState, set2);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int decrementAndGetRemainingCount(AggregateFutureState aggregateFutureState) {
        synchronized (aggregateFutureState) {
            return AggregateFutureState.access$306(aggregateFutureState);
        }
    }
}

