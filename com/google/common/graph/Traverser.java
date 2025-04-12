/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.BaseGraph;
import com.google.common.graph.Network;
import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser$1;
import com.google.common.graph.Traverser$2;
import com.google.common.graph.Traverser$3;
import com.google.common.graph.Traverser$4;
import com.google.common.graph.Traverser$5;
import com.google.common.graph.Traverser$Traversal;

public abstract class Traverser {
    private final SuccessorsFunction successorFunction;

    private Traverser(SuccessorsFunction successorsFunction) {
        this.successorFunction = successorsFunction = (SuccessorsFunction)Preconditions.checkNotNull(successorsFunction);
    }

    public /* synthetic */ Traverser(SuccessorsFunction successorsFunction, Traverser$1 traverser$1) {
        this(successorsFunction);
    }

    public static Traverser forGraph(SuccessorsFunction successorsFunction) {
        Traverser$1 traverser$1 = new Traverser$1(successorsFunction, successorsFunction);
        return traverser$1;
    }

    public static Traverser forTree(SuccessorsFunction successorsFunction) {
        String string2;
        Object object;
        boolean bl2 = successorsFunction instanceof BaseGraph;
        if (bl2) {
            object = successorsFunction;
            object = (BaseGraph)successorsFunction;
            bl2 = object.isDirected();
            string2 = "Undirected graphs can never be trees.";
            Preconditions.checkArgument(bl2, string2);
        }
        if (bl2 = successorsFunction instanceof Network) {
            object = successorsFunction;
            object = (Network)successorsFunction;
            bl2 = object.isDirected();
            string2 = "Undirected networks can never be trees.";
            Preconditions.checkArgument(bl2, string2);
        }
        object = new Traverser$2(successorsFunction, successorsFunction);
        return object;
    }

    private ImmutableSet validate(Iterable iterable) {
        boolean bl2;
        iterable = ImmutableSet.copyOf(iterable);
        UnmodifiableIterator unmodifiableIterator = ((ImmutableSet)iterable).iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            Object e2 = unmodifiableIterator.next();
            SuccessorsFunction successorsFunction = this.successorFunction;
            successorsFunction.successors(e2);
        }
        return iterable;
    }

    public final Iterable breadthFirst(Iterable iterable) {
        iterable = this.validate(iterable);
        Traverser$3 traverser$3 = new Traverser$3(this, (ImmutableSet)iterable);
        return traverser$3;
    }

    public final Iterable breadthFirst(Object object) {
        object = ImmutableSet.of(object);
        return this.breadthFirst((Iterable)object);
    }

    public final Iterable depthFirstPostOrder(Iterable iterable) {
        iterable = this.validate(iterable);
        Traverser$5 traverser$5 = new Traverser$5(this, (ImmutableSet)iterable);
        return traverser$5;
    }

    public final Iterable depthFirstPostOrder(Object object) {
        object = ImmutableSet.of(object);
        return this.depthFirstPostOrder((Iterable)object);
    }

    public final Iterable depthFirstPreOrder(Iterable iterable) {
        iterable = this.validate(iterable);
        Traverser$4 traverser$4 = new Traverser$4(this, (ImmutableSet)iterable);
        return traverser$4;
    }

    public final Iterable depthFirstPreOrder(Object object) {
        object = ImmutableSet.of(object);
        return this.depthFirstPreOrder((Iterable)object);
    }

    public abstract Traverser$Traversal newTraversal();
}

