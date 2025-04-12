/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;

final class TreeTraverser$PostOrderNode {
    final Iterator childIterator;
    final Object root;

    public TreeTraverser$PostOrderNode(Object object, Iterator iterator) {
        this.root = object = Preconditions.checkNotNull(object);
        this.childIterator = object = (Iterator)Preconditions.checkNotNull(iterator);
    }
}

