/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Synchronized;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public final class Queues {
    private Queues() {
    }

    public static int drain(BlockingQueue blockingQueue, Collection collection, int n3, long l2, TimeUnit timeUnit) {
        Preconditions.checkNotNull(collection);
        long l3 = System.nanoTime();
        l2 = timeUnit.toNanos(l2) + l3;
        int n4 = 0;
        timeUnit = null;
        while (n4 < n3) {
            int n7 = n3 - n4;
            if ((n4 += (n7 = blockingQueue.drainTo(collection, n7))) >= n3) continue;
            l3 = System.nanoTime();
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            Object e2 = blockingQueue.poll(l3 = l2 - l3, timeUnit2);
            if (e2 == null) break;
            collection.add(e2);
            ++n4;
        }
        return n4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int drainUninterruptibly(BlockingQueue object, Collection object2, int n3, long l2, TimeUnit timeUnit) {
        Preconditions.checkNotNull(object2);
        long l3 = System.nanoTime();
        l2 = timeUnit.toNanos(l2) + l3;
        int n4 = 0;
        timeUnit = null;
        boolean bl2 = false;
        while (n4 < n3) {
            Throwable throwable2222;
            block10: {
                long l4;
                int n7 = n3 - n4;
                try {
                    if ((n4 += (n7 = object.drainTo(object2, n7))) >= n3) continue;
                    while (true) {
                        try {
                            l4 = System.nanoTime();
                            l4 = l2 - l4;
                        }
                        catch (InterruptedException interruptedException) {
                            bl2 = true;
                            continue;
                        }
                        break;
                    }
                }
                catch (Throwable throwable2222) {
                    break block10;
                }
                {
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    Object e2 = object.poll(l4, timeUnit2);
                    if (e2 == null) break;
                    object2.add(e2);
                }
                ++n4;
                continue;
            }
            if (bl2) {
                object2 = Thread.currentThread();
                ((Thread)object2).interrupt();
            }
            throw throwable2222;
        }
        if (bl2) {
            object = Thread.currentThread();
            ((Thread)object).interrupt();
        }
        return n4;
    }

    public static ArrayBlockingQueue newArrayBlockingQueue(int n3) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(n3);
        return arrayBlockingQueue;
    }

    public static ArrayDeque newArrayDeque() {
        ArrayDeque arrayDeque = new ArrayDeque();
        return arrayDeque;
    }

    public static ArrayDeque newArrayDeque(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            iterable = (Collection)iterable;
            ArrayDeque arrayDeque = new ArrayDeque(iterable);
            return arrayDeque;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterables.addAll(arrayDeque, iterable);
        return arrayDeque;
    }

    public static ConcurrentLinkedQueue newConcurrentLinkedQueue() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        return concurrentLinkedQueue;
    }

    public static ConcurrentLinkedQueue newConcurrentLinkedQueue(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            iterable = (Collection)iterable;
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(iterable);
            return concurrentLinkedQueue;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        Iterables.addAll(concurrentLinkedQueue, iterable);
        return concurrentLinkedQueue;
    }

    public static LinkedBlockingDeque newLinkedBlockingDeque() {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        return linkedBlockingDeque;
    }

    public static LinkedBlockingDeque newLinkedBlockingDeque(int n3) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque(n3);
        return linkedBlockingDeque;
    }

    public static LinkedBlockingDeque newLinkedBlockingDeque(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            iterable = (Collection)iterable;
            LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque(iterable);
            return linkedBlockingDeque;
        }
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        Iterables.addAll(linkedBlockingDeque, iterable);
        return linkedBlockingDeque;
    }

    public static LinkedBlockingQueue newLinkedBlockingQueue() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        return linkedBlockingQueue;
    }

    public static LinkedBlockingQueue newLinkedBlockingQueue(int n3) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(n3);
        return linkedBlockingQueue;
    }

    public static LinkedBlockingQueue newLinkedBlockingQueue(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            iterable = (Collection)iterable;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(iterable);
            return linkedBlockingQueue;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Iterables.addAll(linkedBlockingQueue, iterable);
        return linkedBlockingQueue;
    }

    public static PriorityBlockingQueue newPriorityBlockingQueue() {
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        return priorityBlockingQueue;
    }

    public static PriorityBlockingQueue newPriorityBlockingQueue(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            iterable = (Collection)iterable;
            PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(iterable);
            return priorityBlockingQueue;
        }
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        Iterables.addAll(priorityBlockingQueue, iterable);
        return priorityBlockingQueue;
    }

    public static PriorityQueue newPriorityQueue() {
        PriorityQueue priorityQueue = new PriorityQueue();
        return priorityQueue;
    }

    public static PriorityQueue newPriorityQueue(Iterable iterable) {
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            iterable = (Collection)iterable;
            PriorityQueue priorityQueue = new PriorityQueue(iterable);
            return priorityQueue;
        }
        PriorityQueue priorityQueue = new PriorityQueue();
        Iterables.addAll(priorityQueue, iterable);
        return priorityQueue;
    }

    public static SynchronousQueue newSynchronousQueue() {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        return synchronousQueue;
    }

    public static Deque synchronizedDeque(Deque deque) {
        return Synchronized.deque(deque, null);
    }

    public static Queue synchronizedQueue(Queue queue) {
        return Synchronized.queue(queue, null);
    }
}

