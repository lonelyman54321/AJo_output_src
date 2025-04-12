/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser$InsertionOrder;
import com.google.common.graph.Traverser$Traversal$1;
import com.google.common.graph.Traverser$Traversal$2;
import com.google.common.graph.Traverser$Traversal$3;
import com.google.common.graph.Traverser$Traversal$4;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;

abstract class Traverser$Traversal {
    final SuccessorsFunction successorFunction;

    public Traverser$Traversal(SuccessorsFunction successorsFunction) {
        this.successorFunction = successorsFunction;
    }

    public static Traverser$Traversal inGraph(SuccessorsFunction successorsFunction) {
        HashSet hashSet = new HashSet();
        Traverser$Traversal$1 traverser$Traversal$1 = new Traverser$Traversal$1(successorsFunction, hashSet);
        return traverser$Traversal$1;
    }

    public static Traverser$Traversal inTree(SuccessorsFunction successorsFunction) {
        Traverser$Traversal$2 traverser$Traversal$2 = new Traverser$Traversal$2(successorsFunction);
        return traverser$Traversal$2;
    }

    private Iterator topDown(Iterator iterator, Traverser$InsertionOrder traverser$InsertionOrder) {
        ArrayDeque<Iterator> arrayDeque = new ArrayDeque<Iterator>();
        arrayDeque.add(iterator);
        iterator = new Traverser$Traversal$3(this, arrayDeque, traverser$InsertionOrder);
        return iterator;
    }

    public final Iterator breadthFirst(Iterator iterator) {
        Traverser$InsertionOrder traverser$InsertionOrder = Traverser$InsertionOrder.BACK;
        return this.topDown(iterator, traverser$InsertionOrder);
    }

    public final Iterator postOrder(Iterator iterator) {
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque<Iterator> arrayDeque2 = new ArrayDeque<Iterator>();
        arrayDeque2.add(iterator);
        iterator = new Traverser$Traversal$4(this, arrayDeque2, arrayDeque);
        return iterator;
    }

    public final Iterator preOrder(Iterator iterator) {
        Traverser$InsertionOrder traverser$InsertionOrder = Traverser$InsertionOrder.FRONT;
        return this.topDown(iterator, traverser$InsertionOrder);
    }

    public abstract Object visitNext(Deque var1);
}

