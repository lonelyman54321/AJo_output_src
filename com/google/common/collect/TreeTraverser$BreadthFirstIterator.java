/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Iterables;
import com.google.common.collect.PeekingIterator;
import com.google.common.collect.TreeTraverser;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayDeque;
import java.util.Queue;

final class TreeTraverser$BreadthFirstIterator
extends UnmodifiableIterator
implements PeekingIterator {
    private final Queue queue;
    final /* synthetic */ TreeTraverser this$0;

    public TreeTraverser$BreadthFirstIterator(TreeTraverser arrayDeque, Object object) {
        this.this$0 = arrayDeque;
        this.queue = arrayDeque = new ArrayDeque<Object>();
        arrayDeque.add(object);
    }

    public boolean hasNext() {
        return this.queue.isEmpty() ^ true;
    }

    public Object next() {
        Object e2 = this.queue.remove();
        Queue queue = this.queue;
        Iterable iterable = this.this$0.children(e2);
        Iterables.addAll(queue, iterable);
        return e2;
    }

    public Object peek() {
        return this.queue.element();
    }
}

