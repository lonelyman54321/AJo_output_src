/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.AbstractBaseGraph;
import com.google.common.graph.BaseGraph;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.IncidentEdgeSet;
import com.google.common.graph.a;
import com.google.common.graph.b;
import com.google.common.graph.c;
import java.util.Iterator;
import java.util.Set;

class AbstractBaseGraph$2
extends IncidentEdgeSet {
    public AbstractBaseGraph$2(AbstractBaseGraph abstractBaseGraph, BaseGraph baseGraph, Object object) {
        super(baseGraph, object);
    }

    public static /* synthetic */ EndpointPair a(AbstractBaseGraph$2 abstractBaseGraph$2, Object object) {
        return abstractBaseGraph$2.lambda$iterator$1(object);
    }

    public static /* synthetic */ EndpointPair c(AbstractBaseGraph$2 abstractBaseGraph$2, Object object) {
        return abstractBaseGraph$2.lambda$iterator$2(object);
    }

    public static /* synthetic */ EndpointPair d(AbstractBaseGraph$2 abstractBaseGraph$2, Object object) {
        return abstractBaseGraph$2.lambda$iterator$0(object);
    }

    private /* synthetic */ EndpointPair lambda$iterator$0(Object object) {
        Object object2 = this.node;
        return EndpointPair.ordered(object, object2);
    }

    private /* synthetic */ EndpointPair lambda$iterator$1(Object object) {
        return EndpointPair.ordered(this.node, object);
    }

    private /* synthetic */ EndpointPair lambda$iterator$2(Object object) {
        return EndpointPair.unordered(this.node, object);
    }

    public UnmodifiableIterator iterator() {
        Object object = this.graph;
        boolean bl2 = object.isDirected();
        if (bl2) {
            object = this.graph;
            Object object2 = this.node;
            object = object.predecessors(object2).iterator();
            object2 = new a(this);
            object = Iterators.transform(object, (Function)object2);
            object2 = this.graph;
            Object object3 = this.node;
            object2 = object2.successors(object3);
            object3 = ImmutableSet.of(this.node);
            object2 = Sets.difference((Set)object2, (Set)object3).iterator();
            object3 = new b(this);
            object2 = Iterators.transform((Iterator)object2, (Function)object3);
            return Iterators.unmodifiableIterator(Iterators.concat((Iterator)object, (Iterator)object2));
        }
        object = this.graph;
        Object object4 = this.node;
        object = object.adjacentNodes(object4).iterator();
        object4 = new c(this);
        return Iterators.unmodifiableIterator(Iterators.transform(object, (Function)object4));
    }
}

