/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.common.graph.AbstractBaseGraph;
import com.google.common.graph.AbstractValueGraph$1;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.ValueGraph;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class AbstractValueGraph
extends AbstractBaseGraph
implements ValueGraph {
    public static /* synthetic */ Object a(ValueGraph valueGraph, EndpointPair endpointPair) {
        return AbstractValueGraph.lambda$edgeValueMap$0(valueGraph, endpointPair);
    }

    private static Map edgeValueMap(ValueGraph valueGraph) {
        Set set = valueGraph.edges();
        s1_0 s1_02 = new s1_0(valueGraph);
        return Maps.asMap(set, (Function)s1_02);
    }

    private static /* synthetic */ Object lambda$edgeValueMap$0(ValueGraph object, EndpointPair object2) {
        Object object3 = ((EndpointPair)object2).nodeU();
        object2 = ((EndpointPair)object2).nodeV();
        object = object.edgeValueOrDefault(object3, object2, null);
        Objects.requireNonNull(object);
        return object;
    }

    public Graph asGraph() {
        AbstractValueGraph$1 abstractValueGraph$1 = new AbstractValueGraph$1(this);
        return abstractValueGraph$1;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Set set;
        Object object2;
        boolean bl3;
        boolean bl4 = true;
        if (object == this) {
            return bl4;
        }
        boolean bl5 = object instanceof ValueGraph;
        if (!bl5) {
            return false;
        }
        object = (ValueGraph)object;
        bl5 = this.isDirected();
        if (bl5 != (bl3 = object.isDirected()) || !(bl5 = (object2 = this.nodes()).equals(set = object.nodes())) || !(bl2 = (object2 = AbstractValueGraph.edgeValueMap(this)).equals(object = AbstractValueGraph.edgeValueMap((ValueGraph)object)))) {
            bl4 = false;
        }
        return bl4;
    }

    public final int hashCode() {
        return AbstractValueGraph.edgeValueMap(this).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("isDirected: ");
        boolean bl2 = this.isDirected();
        stringBuilder.append(bl2);
        stringBuilder.append(", allowsSelfLoops: ");
        bl2 = this.allowsSelfLoops();
        stringBuilder.append(bl2);
        stringBuilder.append(", nodes: ");
        Object object = this.nodes();
        stringBuilder.append(object);
        stringBuilder.append(", edges: ");
        object = AbstractValueGraph.edgeValueMap(this);
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

