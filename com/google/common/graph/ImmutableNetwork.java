/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.Maps;
import com.google.common.graph.DirectedMultiNetworkConnections;
import com.google.common.graph.DirectedNetworkConnections;
import com.google.common.graph.Graph;
import com.google.common.graph.ImmutableGraph;
import com.google.common.graph.Network;
import com.google.common.graph.NetworkBuilder;
import com.google.common.graph.NetworkConnections;
import com.google.common.graph.StandardNetwork;
import com.google.common.graph.UndirectedMultiNetworkConnections;
import com.google.common.graph.UndirectedNetworkConnections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ImmutableNetwork
extends StandardNetwork {
    private ImmutableNetwork(Network object) {
        NetworkBuilder networkBuilder = NetworkBuilder.from((Network)object);
        Map map2 = ImmutableNetwork.getNodeConnections((Network)object);
        object = ImmutableNetwork.getEdgeToReferenceNode((Network)object);
        super(networkBuilder, map2, (Map)object);
    }

    public static /* synthetic */ Object a(Network network, Object object) {
        return ImmutableNetwork.lambda$targetNodeFn$1(network, object);
    }

    private static Function adjacentNodeFn(Network network, Object object) {
        Ze1 ze1 = new Ze1(network, object);
        return ze1;
    }

    public static /* synthetic */ Object b(Network network, Object object) {
        return ImmutableNetwork.lambda$sourceNodeFn$0(network, object);
    }

    public static /* synthetic */ Object c(Network network, Object object, Object object2) {
        return ImmutableNetwork.lambda$adjacentNodeFn$2(network, object, object2);
    }

    private static NetworkConnections connectionsOf(Network object, Object object2) {
        boolean bl2 = object.isDirected();
        if (bl2) {
            Object object3 = object.inEdges(object2);
            Object object4 = ImmutableNetwork.sourceNodeFn((Network)object);
            object3 = Maps.asMap((Set)object3, (Function)object4);
            object4 = object.outEdges(object2);
            Function function = ImmutableNetwork.targetNodeFn((Network)object);
            object4 = Maps.asMap((Set)object4, function);
            object2 = object.edgesConnecting(object2, object2);
            int n3 = object2.size();
            boolean bl3 = object.allowsParallelEdges();
            object = bl3 ? DirectedMultiNetworkConnections.ofImmutable((Map)object3, (Map)object4, n3) : DirectedNetworkConnections.ofImmutable((Map)object3, (Map)object4, n3);
            return object;
        }
        Set set = object.incidentEdges(object2);
        object2 = ImmutableNetwork.adjacentNodeFn((Network)object, object2);
        object2 = Maps.asMap(set, (Function)object2);
        boolean bl4 = object.allowsParallelEdges();
        object = bl4 ? UndirectedMultiNetworkConnections.ofImmutable((Map)object2) : UndirectedNetworkConnections.ofImmutable((Map)object2);
        return object;
    }

    public static ImmutableNetwork copyOf(ImmutableNetwork immutableNetwork) {
        return (ImmutableNetwork)Preconditions.checkNotNull(immutableNetwork);
    }

    public static ImmutableNetwork copyOf(Network network) {
        boolean bl2 = network instanceof ImmutableNetwork;
        if (bl2) {
            network = (ImmutableNetwork)network;
        } else {
            ImmutableNetwork immutableNetwork = new ImmutableNetwork(network);
            network = immutableNetwork;
        }
        return network;
    }

    private static Map getEdgeToReferenceNode(Network network) {
        boolean bl2;
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        Iterator iterator = network.edges().iterator();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            Object object = network.incidentNodes(e2).nodeU();
            immutableMap$Builder.put(e2, object);
        }
        return immutableMap$Builder.buildOrThrow();
    }

    private static Map getNodeConnections(Network network) {
        boolean bl2;
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        Iterator iterator = network.nodes().iterator();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            NetworkConnections networkConnections = ImmutableNetwork.connectionsOf(network, e2);
            immutableMap$Builder.put(e2, networkConnections);
        }
        return immutableMap$Builder.buildOrThrow();
    }

    private static /* synthetic */ Object lambda$adjacentNodeFn$2(Network network, Object object, Object object2) {
        return network.incidentNodes(object2).adjacentNode(object);
    }

    private static /* synthetic */ Object lambda$sourceNodeFn$0(Network network, Object object) {
        return network.incidentNodes(object).source();
    }

    private static /* synthetic */ Object lambda$targetNodeFn$1(Network network, Object object) {
        return network.incidentNodes(object).target();
    }

    private static Function sourceNodeFn(Network network) {
        Ye1 ye1 = new Ye1(network);
        return ye1;
    }

    private static Function targetNodeFn(Network network) {
        af1_0 af1_02 = new af1_0(network);
        return af1_02;
    }

    public ImmutableGraph asGraph() {
        Graph graph = super.asGraph();
        ImmutableGraph immutableGraph = new ImmutableGraph(graph);
        return immutableGraph;
    }
}

