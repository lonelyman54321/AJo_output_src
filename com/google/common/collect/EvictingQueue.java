/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingQueue;
import com.google.common.collect.Iterables;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class EvictingQueue
extends ForwardingQueue
implements Serializable {
    private static final long serialVersionUID;
    private final Queue delegate;
    final int maxSize;

    private EvictingQueue(int n3) {
        ArrayDeque arrayDeque;
        boolean bl2;
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            arrayDeque = null;
        }
        Preconditions.checkArgument(bl2, "maxSize (%s) must >= 0", n3);
        this.delegate = arrayDeque = new ArrayDeque(n3);
        this.maxSize = n3;
    }

    public static EvictingQueue create(int n3) {
        EvictingQueue evictingQueue = new EvictingQueue(n3);
        return evictingQueue;
    }

    public boolean add(Object object) {
        int n3;
        Preconditions.checkNotNull(object);
        int n4 = this.maxSize;
        boolean bl2 = true;
        if (n4 == 0) {
            return bl2;
        }
        n4 = this.size();
        if (n4 == (n3 = this.maxSize)) {
            Queue queue = this.delegate;
            queue.remove();
        }
        this.delegate.add(object);
        return bl2;
    }

    public boolean addAll(Collection iterable) {
        int n3;
        int n4 = iterable.size();
        if (n4 >= (n3 = this.maxSize)) {
            this.clear();
            n3 = this.maxSize;
            iterable = Iterables.skip(iterable, n4 -= n3);
            return Iterables.addAll(this, iterable);
        }
        return this.standardAddAll((Collection)iterable);
    }

    public Queue delegate() {
        return this.delegate;
    }

    public boolean offer(Object object) {
        return this.add(object);
    }

    public int remainingCapacity() {
        int n3 = this.maxSize;
        int n4 = this.size();
        return n3 - n4;
    }

    public Object[] toArray() {
        return super.toArray();
    }
}

