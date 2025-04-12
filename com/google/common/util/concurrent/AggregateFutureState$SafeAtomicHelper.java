/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AggregateFutureState;
import com.google.common.util.concurrent.AggregateFutureState$AtomicHelper;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class AggregateFutureState$SafeAtomicHelper
extends AggregateFutureState$AtomicHelper {
    final AtomicIntegerFieldUpdater remainingCountUpdater;
    final AtomicReferenceFieldUpdater seenExceptionsUpdater;

    public AggregateFutureState$SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.seenExceptionsUpdater = atomicReferenceFieldUpdater;
        this.remainingCountUpdater = atomicIntegerFieldUpdater;
    }

    public void compareAndSetSeenExceptions(AggregateFutureState aggregateFutureState, Set set, Set set2) {
        Object v4;
        boolean bl2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.seenExceptionsUpdater;
        while (!(bl2 = atomicReferenceFieldUpdater.compareAndSet(aggregateFutureState, set, set2)) && (v4 = atomicReferenceFieldUpdater.get(aggregateFutureState)) == set) {
        }
    }

    public int decrementAndGetRemainingCount(AggregateFutureState aggregateFutureState) {
        return this.remainingCountUpdater.decrementAndGet(aggregateFutureState);
    }
}

