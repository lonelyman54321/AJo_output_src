/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser;
import com.google.common.graph.Traverser$Traversal;

class Traverser$1
extends Traverser {
    final /* synthetic */ SuccessorsFunction val$graph;

    public Traverser$1(SuccessorsFunction successorsFunction, SuccessorsFunction successorsFunction2) {
        this.val$graph = successorsFunction2;
        super(successorsFunction, null);
    }

    public Traverser$Traversal newTraversal() {
        return Traverser$Traversal.inGraph(this.val$graph);
    }
}

