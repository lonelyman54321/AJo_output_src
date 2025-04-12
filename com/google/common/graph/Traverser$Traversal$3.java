/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.graph.Traverser$InsertionOrder;
import com.google.common.graph.Traverser$Traversal;
import java.util.Deque;
import java.util.Iterator;

class Traverser$Traversal$3
extends AbstractIterator {
    final /* synthetic */ Traverser$Traversal this$0;
    final /* synthetic */ Deque val$horizon;
    final /* synthetic */ Traverser$InsertionOrder val$order;

    public Traverser$Traversal$3(Traverser$Traversal traverser$Traversal, Deque deque, Traverser$InsertionOrder traverser$InsertionOrder) {
        this.this$0 = traverser$Traversal;
        this.val$horizon = deque;
        this.val$order = traverser$InsertionOrder;
    }

    public Object computeNext() {
        Object object;
        boolean bl2;
        do {
            object = this.this$0;
            Iterator iterator = this.val$horizon;
            if ((object = ((Traverser$Traversal)object).visitNext((Deque)((Object)iterator))) == null) continue;
            iterator = this.this$0.successorFunction.successors(object).iterator();
            boolean bl3 = iterator.hasNext();
            if (bl3) {
                Traverser$InsertionOrder traverser$InsertionOrder = this.val$order;
                Deque deque = this.val$horizon;
                traverser$InsertionOrder.insertInto(deque, iterator);
            }
            return object;
        } while (!(bl2 = (object = this.val$horizon).isEmpty()));
        return this.endOfData();
    }
}

