/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.Traverser;
import com.google.common.graph.Traverser$Traversal;
import java.util.Iterator;

class Traverser$5
implements Iterable {
    final /* synthetic */ Traverser this$0;
    final /* synthetic */ ImmutableSet val$validated;

    public Traverser$5(Traverser traverser, ImmutableSet immutableSet) {
        this.this$0 = traverser;
        this.val$validated = immutableSet;
    }

    public Iterator iterator() {
        Traverser$Traversal traverser$Traversal = this.this$0.newTraversal();
        UnmodifiableIterator unmodifiableIterator = this.val$validated.iterator();
        return traverser$Traversal.postOrder(unmodifiableIterator);
    }
}

