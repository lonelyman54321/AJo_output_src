/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.TreeTraverser;
import com.google.common.collect.TreeTraverser$BreadthFirstIterator;
import com.google.common.collect.UnmodifiableIterator;

class TreeTraverser$4
extends FluentIterable {
    final /* synthetic */ TreeTraverser this$0;
    final /* synthetic */ Object val$root;

    public TreeTraverser$4(TreeTraverser treeTraverser, Object object) {
        this.this$0 = treeTraverser;
        this.val$root = object;
    }

    public UnmodifiableIterator iterator() {
        TreeTraverser treeTraverser = this.this$0;
        Object object = this.val$root;
        TreeTraverser$BreadthFirstIterator treeTraverser$BreadthFirstIterator = new TreeTraverser$BreadthFirstIterator(treeTraverser, object);
        return treeTraverser$BreadthFirstIterator;
    }
}

