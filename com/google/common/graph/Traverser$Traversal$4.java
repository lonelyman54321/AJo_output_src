/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.graph.Traverser$Traversal;
import java.util.Deque;
import java.util.Iterator;

class Traverser$Traversal$4
extends AbstractIterator {
    final /* synthetic */ Traverser$Traversal this$0;
    final /* synthetic */ Deque val$ancestorStack;
    final /* synthetic */ Deque val$horizon;

    public Traverser$Traversal$4(Traverser$Traversal traverser$Traversal, Deque deque, Deque deque2) {
        this.this$0 = traverser$Traversal;
        this.val$horizon = deque;
        this.val$ancestorStack = deque2;
    }

    public Object computeNext() {
        Object object;
        while (true) {
            object = this.this$0;
            Iterator iterator = this.val$horizon;
            if ((object = ((Traverser$Traversal)object).visitNext((Deque)((Object)iterator))) == null) break;
            iterator = this.this$0.successorFunction.successors(object).iterator();
            boolean bl2 = iterator.hasNext();
            if (!bl2) {
                return object;
            }
            Deque deque = this.val$horizon;
            deque.addFirst(iterator);
            iterator = this.val$ancestorStack;
            iterator.push(object);
        }
        object = this.val$ancestorStack;
        boolean bl3 = object.isEmpty();
        if (!bl3) {
            return this.val$ancestorStack.pop();
        }
        return this.endOfData();
    }
}

