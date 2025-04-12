/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser$Traversal;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Traverser$Traversal$1
extends Traverser$Traversal {
    final /* synthetic */ Set val$visited;

    public Traverser$Traversal$1(SuccessorsFunction successorsFunction, Set set) {
        this.val$visited = set;
        super(successorsFunction);
    }

    public Object visitNext(Deque deque) {
        boolean bl2;
        Iterator iterator = (Iterator)deque.getFirst();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            Objects.requireNonNull(e2);
            Set set = this.val$visited;
            boolean bl3 = set.add(e2);
            if (!bl3) continue;
            return e2;
        }
        deque.removeFirst();
        return null;
    }
}

