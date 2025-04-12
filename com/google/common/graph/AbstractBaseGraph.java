/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.graph.AbstractBaseGraph$1;
import com.google.common.graph.AbstractBaseGraph$2;
import com.google.common.graph.BaseGraph;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import com.google.common.math.IntMath;
import java.util.Iterator;
import java.util.Set;

abstract class AbstractBaseGraph
implements BaseGraph {
    public int degree(Object object) {
        int n3;
        int n4 = this.isDirected();
        if (n4 != 0) {
            n4 = this.predecessors(object).size();
            int n7 = this.successors(object).size();
            return IntMath.saturatedAdd(n4, n7);
        }
        Set set = this.adjacentNodes(object);
        boolean bl2 = this.allowsSelfLoops();
        if (bl2 && (n3 = set.contains(object)) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return IntMath.saturatedAdd(set.size(), n3);
    }

    public long edgeCount() {
        long l2;
        int n3;
        long l3;
        Iterator iterator = this.nodes().iterator();
        long l4 = l3 = 0L;
        while ((n3 = iterator.hasNext()) != 0) {
            Object e2 = iterator.next();
            n3 = this.degree(e2);
            l2 = n3;
            l4 += l2;
        }
        l2 = 1L & l4;
        int n4 = 1;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object == false;
        Preconditions.checkState(bl2);
        return l4 >>> n4;
    }

    public Set edges() {
        AbstractBaseGraph$1 abstractBaseGraph$1 = new AbstractBaseGraph$1(this);
        return abstractBaseGraph$1;
    }

    public boolean hasEdgeConnecting(EndpointPair object) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        boolean bl3 = this.isOrderingCompatible((EndpointPair)object);
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        Object object2 = ((EndpointPair)object).nodeU();
        object = ((EndpointPair)object).nodeV();
        Set set = this.nodes();
        boolean bl5 = set.contains(object2);
        if (bl5 && (bl2 = (object2 = this.successors(object2)).contains(object))) {
            bl4 = true;
        }
        return bl4;
    }

    public boolean hasEdgeConnecting(Object object, Object object2) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        Set set = this.nodes();
        boolean bl3 = set.contains(object);
        if (bl3 && (bl2 = (object = this.successors(object)).contains(object2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public int inDegree(Object object) {
        int n3;
        boolean bl2 = this.isDirected();
        if (bl2) {
            object = this.predecessors(object);
            n3 = object.size();
        } else {
            n3 = this.degree(object);
        }
        return n3;
    }

    public ElementOrder incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    public Set incidentEdges(Object object) {
        Preconditions.checkNotNull(object);
        Preconditions.checkArgument(this.nodes().contains(object), "Node %s is not an element of this graph.", object);
        AbstractBaseGraph$2 abstractBaseGraph$2 = new AbstractBaseGraph$2(this, this, object);
        return abstractBaseGraph$2;
    }

    public final boolean isOrderingCompatible(EndpointPair endpointPair) {
        boolean bl2;
        boolean bl3 = endpointPair.isOrdered();
        if (bl3 == (bl2 = this.isDirected())) {
            bl3 = true;
        } else {
            bl3 = false;
            endpointPair = null;
        }
        return bl3;
    }

    public int outDegree(Object object) {
        int n3;
        boolean bl2 = this.isDirected();
        if (bl2) {
            object = this.successors(object);
            n3 = object.size();
        } else {
            n3 = this.degree(object);
        }
        return n3;
    }

    public final void validateEndpoints(EndpointPair endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(this.isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }
}

