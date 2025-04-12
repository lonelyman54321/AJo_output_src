/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.Sets;
import com.google.common.util.concurrent.AbstractFuture$TrustedFuture;
import com.google.common.util.concurrent.AggregateFutureState$AtomicHelper;
import com.google.common.util.concurrent.AggregateFutureState$SafeAtomicHelper;
import com.google.common.util.concurrent.AggregateFutureState$SynchronizedAtomicHelper;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class AggregateFutureState
extends AbstractFuture$TrustedFuture {
    private static final AggregateFutureState$AtomicHelper ATOMIC_HELPER;
    private static final Logger log;
    private volatile int remaining;
    private volatile Set seenExceptions = null;

    static {
        Object object;
        Object object2;
        Class<AggregateFutureState> clazz;
        AtomicIntegerFieldUpdater<AggregateFutureState> atomicIntegerFieldUpdater;
        block7: {
            atomicIntegerFieldUpdater = AggregateFutureState.class;
            log = Logger.getLogger(((Class)((Object)atomicIntegerFieldUpdater)).getName());
            clazz = null;
            object2 = Set.class;
            String string2 = "seenExceptions";
            object2 = AtomicReferenceFieldUpdater.newUpdater(atomicIntegerFieldUpdater, object2, string2);
            string2 = "remaining";
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(atomicIntegerFieldUpdater, string2);
            try {
                object = new AggregateFutureState$SafeAtomicHelper((AtomicReferenceFieldUpdater)object2, atomicIntegerFieldUpdater);
                break block7;
            }
            catch (Error error) {
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            object = new AggregateFutureState$SynchronizedAtomicHelper(null);
            clazz = atomicIntegerFieldUpdater;
        }
        ATOMIC_HELPER = object;
        if (clazz != null) {
            atomicIntegerFieldUpdater = log;
            object = Level.SEVERE;
            object2 = "SafeAtomicHelper is broken!";
            ((Logger)((Object)atomicIntegerFieldUpdater)).log((Level)object, (String)object2, (Throwable)((Object)clazz));
        }
    }

    public AggregateFutureState(int n3) {
        this.remaining = n3;
    }

    public static /* synthetic */ Set access$200(AggregateFutureState aggregateFutureState) {
        return aggregateFutureState.seenExceptions;
    }

    public static /* synthetic */ Set access$202(AggregateFutureState aggregateFutureState, Set set) {
        aggregateFutureState.seenExceptions = set;
        return set;
    }

    public static /* synthetic */ int access$306(AggregateFutureState aggregateFutureState) {
        int n3;
        aggregateFutureState.remaining = n3 = aggregateFutureState.remaining + -1;
        return n3;
    }

    public abstract void addInitialException(Set var1);

    public final void clearSeenExceptions() {
        this.seenExceptions = null;
    }

    public final int decrementRemainingAndGet() {
        return ATOMIC_HELPER.decrementAndGetRemainingCount(this);
    }

    public final Set getOrInitSeenExceptions() {
        Set set = this.seenExceptions;
        if (set == null) {
            set = Sets.newConcurrentHashSet();
            this.addInitialException(set);
            AggregateFutureState$AtomicHelper aggregateFutureState$AtomicHelper = ATOMIC_HELPER;
            aggregateFutureState$AtomicHelper.compareAndSetSeenExceptions(this, null, set);
            set = this.seenExceptions;
            Objects.requireNonNull(set);
        }
        return set;
    }
}

