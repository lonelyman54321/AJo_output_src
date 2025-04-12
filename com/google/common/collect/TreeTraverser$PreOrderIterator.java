/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.TreeTraverser;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

final class TreeTraverser$PreOrderIterator
extends UnmodifiableIterator {
    private final Deque stack;
    final /* synthetic */ TreeTraverser this$0;

    public TreeTraverser$PreOrderIterator(TreeTraverser arrayDeque, Object object) {
        this.this$0 = arrayDeque;
        this.stack = arrayDeque = new ArrayDeque<Object>();
        object = Iterators.singletonIterator(Preconditions.checkNotNull(object));
        arrayDeque.addLast(object);
    }

    public boolean hasNext() {
        return this.stack.isEmpty() ^ true;
    }

    public Object next() {
        boolean bl2;
        Iterator iterator = (Iterator)this.stack.getLast();
        Object object = Preconditions.checkNotNull(iterator.next());
        boolean bl3 = iterator.hasNext();
        if (!bl3) {
            iterator = this.stack;
            iterator.removeLast();
        }
        if (bl2 = (iterator = this.this$0.children(object).iterator()).hasNext()) {
            Deque deque = this.stack;
            deque.addLast(iterator);
        }
        return object;
    }
}

