/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.Traverser$InsertionOrder;
import java.util.Deque;

final class Traverser$InsertionOrder$1
extends Traverser$InsertionOrder {
    public void insertInto(Deque deque, Object object) {
        deque.addFirst(object);
    }
}

