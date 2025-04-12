/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser;
import com.google.common.graph.Traverser$Traversal;

class Traverser$2
extends Traverser {
    final /* synthetic */ SuccessorsFunction val$tree;

    public Traverser$2(SuccessorsFunction successorsFunction, SuccessorsFunction successorsFunction2) {
        this.val$tree = successorsFunction2;
        super(successorsFunction, null);
    }

    public Traverser$Traversal newTraversal() {
        return Traverser$Traversal.inTree(this.val$tree);
    }
}

