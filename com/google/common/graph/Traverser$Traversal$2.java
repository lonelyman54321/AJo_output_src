/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser$Traversal;
import java.util.Deque;
import java.util.Iterator;

class Traverser$Traversal$2
extends Traverser$Traversal {
    public Traverser$Traversal$2(SuccessorsFunction successorsFunction) {
        super(successorsFunction);
    }

    public Object visitNext(Deque deque) {
        Iterator iterator = (Iterator)deque.getFirst();
        boolean bl2 = iterator.hasNext();
        if (bl2) {
            return Preconditions.checkNotNull(iterator.next());
        }
        deque.removeFirst();
        return null;
    }
}

