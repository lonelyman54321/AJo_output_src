/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.graph.AbstractNetwork$1;
import com.google.common.graph.AbstractNetwork$2;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.Network;
import com.google.common.math.IntMath;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public abstract class AbstractNetwork
implements Network {
    private Predicate connectedPredicate(Object object, Object object2) {
        AbstractNetwork$2 abstractNetwork$2 = new AbstractNetwork$2(this, object, object2);
        return abstractNetwork$2;
    }

    private static Map edgeIncidentNodesMap(Network network) {
        Set set = network.edges();
        h1_0 h1_02 = new h1_0(network);
        return Maps.asMap(set, (Function)h1_02);
    }

    public Set adjacentEdges(Object object) {
        Object object2 = this.incidentNodes(object);
        Object object3 = ((EndpointPair)object2).nodeU();
        object3 = this.incidentEdges(object3);
        object2 = ((EndpointPair)object2).nodeV();
        object2 = this.incidentEdges(object2);
        object2 = Sets.union((Set)object3, (Set)object2);
        object = ImmutableSet.of(object);
        return Sets.difference((Set)object2, (Set)object);
    }

    public Graph asGraph() {
        AbstractNetwork$1 abstractNetwork$1 = new AbstractNetwork$1(this);
        return abstractNetwork$1;
    }

    public int degree(Object object) {
        int n3 = this.isDirected();
        if (n3 != 0) {
            n3 = this.inEdges(object).size();
            int n4 = this.outEdges(object).size();
            return IntMath.saturatedAdd(n3, n4);
        }
        n3 = this.incidentEdges(object).size();
        int n7 = this.edgesConnecting(object, object).size();
        return IntMath.saturatedAdd(n3, n7);
    }

    public Object edgeConnectingOrNull(EndpointPair object) {
        this.validateEndpoints((EndpointPair)object);
        Object object2 = ((EndpointPair)object).nodeU();
        object = ((EndpointPair)object).nodeV();
        return this.edgeConnectingOrNull(object2, object);
    }

    public Object edgeConnectingOrNull(Object object, Object object2) {
        int n3 = 1;
        Object object3 = this.edgesConnecting(object, object2);
        int n4 = object3.size();
        if (n4 != 0) {
            if (n4 == n3) {
                return object3.iterator().next();
            }
            Object[] objectArray = new Object[2];
            objectArray[0] = object;
            objectArray[n3] = object2;
            object = String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", objectArray);
            object3 = new IllegalArgumentException((String)object);
            throw object3;
        }
        return null;
    }

    public Set edgesConnecting(EndpointPair object) {
        this.validateEndpoints((EndpointPair)object);
        Object object2 = ((EndpointPair)object).nodeU();
        object = ((EndpointPair)object).nodeV();
        return this.edgesConnecting(object2, object);
    }

    public Set edgesConnecting(Object set, Object object) {
        int n3;
        Set set2 = this.outEdges(set);
        Set set3 = this.inEdges(object);
        int n4 = set2.size();
        if (n4 <= (n3 = set3.size())) {
            set = this.connectedPredicate(set, object);
            set = Collections.unmodifiableSet(Sets.filter(set2, (Predicate)((Object)set)));
        } else {
            set = this.connectedPredicate(object, set);
            set = Collections.unmodifiableSet(Sets.filter(set3, (Predicate)((Object)set)));
        }
        return set;
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
        boolean bl5 = object instanceof Network;
        if (!bl5) {
            return false;
        }
        object = (Network)object;
        bl5 = this.isDirected();
        if (bl5 != (bl3 = object.isDirected()) || !(bl5 = (object2 = this.nodes()).equals(set = object.nodes())) || !(bl2 = (object2 = AbstractNetwork.edgeIncidentNodesMap(this)).equals(object = AbstractNetwork.edgeIncidentNodesMap((Network)object)))) {
            bl4 = false;
        }
        return bl4;
    }

    public boolean hasEdgeConnecting(EndpointPair object) {
        Preconditions.checkNotNull(object);
        boolean bl2 = this.isOrderingCompatible((EndpointPair)object);
        if (!bl2) {
            return false;
        }
        Object object2 = ((EndpointPair)object).nodeU();
        object = ((EndpointPair)object).nodeV();
        return this.hasEdgeConnecting(object2, object);
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

    public final int hashCode() {
        return AbstractNetwork.edgeIncidentNodesMap(this).hashCode();
    }

    public int inDegree(Object object) {
        int n3;
        boolean bl2 = this.isDirected();
        if (bl2) {
            object = this.inEdges(object);
            n3 = object.size();
        } else {
            n3 = this.degree(object);
        }
        return n3;
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
            object = this.outEdges(object);
            n3 = object.size();
        } else {
            n3 = this.degree(object);
        }
        return n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("isDirected: ");
        boolean bl2 = this.isDirected();
        stringBuilder.append(bl2);
        stringBuilder.append(", allowsParallelEdges: ");
        bl2 = this.allowsParallelEdges();
        stringBuilder.append(bl2);
        stringBuilder.append(", allowsSelfLoops: ");
        bl2 = this.allowsSelfLoops();
        stringBuilder.append(bl2);
        stringBuilder.append(", nodes: ");
        Object object = this.nodes();
        stringBuilder.append(object);
        stringBuilder.append(", edges: ");
        object = AbstractNetwork.edgeIncidentNodesMap(this);
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public final void validateEndpoints(EndpointPair endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(this.isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }
}

