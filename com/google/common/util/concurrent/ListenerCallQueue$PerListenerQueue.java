/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.ListenerCallQueue$Event;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

final class ListenerCallQueue$PerListenerQueue
implements Runnable {
    final Executor executor;
    boolean isThreadScheduled;
    final Queue labelQueue;
    final Object listener;
    final Queue waitQueue;

    public ListenerCallQueue$PerListenerQueue(Object object, Executor executor) {
        ArrayDeque arrayDeque = Queues.newArrayDeque();
        this.waitQueue = arrayDeque;
        arrayDeque = Queues.newArrayDeque();
        this.labelQueue = arrayDeque;
        this.listener = object = Preconditions.checkNotNull(object);
        this.executor = object = (Executor)Preconditions.checkNotNull(executor);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void add(ListenerCallQueue$Event object, Object object2) {
        synchronized (this) {
            Queue queue = this.waitQueue;
            queue.add(object);
            object = this.labelQueue;
            object.add(object2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void dispatch() {
        Executor executor;
        Logger logger;
        boolean bl2;
        block10: {
            block9: {
                // MONITORENTER : this
                bl2 = this.isThreadScheduled;
                logger = null;
                if (bl2) break block9;
                this.isThreadScheduled = bl2 = true;
                break block10;
            }
            bl2 = false;
            executor = null;
        }
        // MONITOREXIT : this
        if (!bl2) return;
        try {
            executor = this.executor;
            executor.execute(this);
            return;
        }
        catch (RuntimeException runtimeException) {
            // MONITORENTER : this
            this.isThreadScheduled = false;
            // MONITOREXIT : this
            logger = ListenerCallQueue.access$000();
            Level level = Level.SEVERE;
            CharSequence charSequence = new StringBuilder("Exception while running callbacks for ");
            Object object = this.listener;
            charSequence.append(object);
            charSequence.append(" on ");
            object = this.executor;
            charSequence.append(object);
            charSequence = charSequence.toString();
            logger.log(level, (String)charSequence, runtimeException);
            throw runtimeException;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void run() {
        Throwable throwable;
        boolean bl2;
        block14: {
            Throwable throwable2;
            boolean bl3;
            while (true) {
                Object object;
                Object object2;
                Object object3;
                Object var1_1 = null;
                bl2 = true;
                try {
                    bl3 = this.isThreadScheduled;
                    Preconditions.checkState(bl3);
                    object3 = this.waitQueue;
                    object3 = object3.poll();
                    object3 = (ListenerCallQueue$Event)object3;
                    object2 = this.labelQueue;
                    object2 = object2.poll();
                    if (object3 == null) {
                        this.isThreadScheduled = false;
                        // MONITOREXIT : this
                        return;
                    }
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    bl3 = true;
                    break;
                }
                try {
                    object = this.listener;
                    object3.call(object);
                }
                catch (Throwable throwable4) {
                    break block14;
                }
                catch (RuntimeException runtimeException) {
                    object = ListenerCallQueue.access$000();
                    Level level = Level.SEVERE;
                    StringBuilder stringBuilder = new StringBuilder();
                    Object object4 = "Exception while executing callback: ";
                    stringBuilder.append((String)object4);
                    object4 = this.listener;
                    stringBuilder.append(object4);
                    object4 = " ";
                    stringBuilder.append((String)object4);
                    stringBuilder.append(object2);
                    object2 = stringBuilder.toString();
                    ((Logger)object).log(level, (String)object2, runtimeException);
                }
            }
            try {
                throw throwable2;
            }
            catch (Throwable throwable5) {
                throwable = throwable5;
                bl2 = bl3;
            }
        }
        if (!bl2) throw throwable;
        // MONITORENTER : this
        this.isThreadScheduled = false;
        // MONITOREXIT : this
        throw throwable;
    }
}

