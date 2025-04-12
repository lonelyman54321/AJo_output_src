/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import java.util.Queue;

final class ConsumingQueueIterator
extends AbstractIterator {
    private final Queue queue;

    public ConsumingQueueIterator(Queue queue) {
        this.queue = queue = (Queue)Preconditions.checkNotNull(queue);
    }

    public Object computeNext() {
        Queue queue = this.queue;
        boolean bl2 = queue.isEmpty();
        if (bl2) {
            return this.endOfData();
        }
        return this.queue.remove();
    }
}

