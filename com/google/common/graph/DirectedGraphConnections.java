/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.Iterators;
import com.google.common.graph.DirectedGraphConnections$1;
import com.google.common.graph.DirectedGraphConnections$2;
import com.google.common.graph.DirectedGraphConnections$3;
import com.google.common.graph.DirectedGraphConnections$4;
import com.google.common.graph.DirectedGraphConnections$5;
import com.google.common.graph.DirectedGraphConnections$NodeConnection;
import com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred;
import com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ;
import com.google.common.graph.DirectedGraphConnections$PredAndSucc;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ElementOrder$Type;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.GraphConnections;
import com.google.common.graph.Graphs;
import com.google.common.graph.f;
import com.google.common.graph.g;
import com.google.common.graph.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class DirectedGraphConnections
implements GraphConnections {
    private static final Object PRED;
    private final Map adjacentNodeValues;
    private final List orderedNodeConnections;
    private int predecessorCount;
    private int successorCount;

    static {
        Object object;
        PRED = object = new Object();
    }

    private DirectedGraphConnections(Map map2, List list, int n3, int n4) {
        int n7;
        int n8;
        Map map3;
        this.adjacentNodeValues = map3 = (Map)Preconditions.checkNotNull(map2);
        this.orderedNodeConnections = list;
        this.predecessorCount = n8 = Graphs.checkNonNegative(n3);
        this.successorCount = n8 = Graphs.checkNonNegative(n4);
        n8 = map2.size();
        if (n3 <= n8 && n4 <= (n7 = map2.size())) {
            n7 = 1;
        } else {
            n7 = 0;
            map2 = null;
        }
        Preconditions.checkState(n7 != 0);
    }

    public static /* synthetic */ EndpointPair a(Object object, Object object2) {
        return DirectedGraphConnections.lambda$incidentEdgeIterator$0(object, object2);
    }

    public static /* synthetic */ List access$000(DirectedGraphConnections directedGraphConnections) {
        return directedGraphConnections.orderedNodeConnections;
    }

    public static /* synthetic */ Map access$100(DirectedGraphConnections directedGraphConnections) {
        return directedGraphConnections.adjacentNodeValues;
    }

    public static /* synthetic */ boolean access$200(Object object) {
        return DirectedGraphConnections.isPredecessor(object);
    }

    public static /* synthetic */ int access$300(DirectedGraphConnections directedGraphConnections) {
        return directedGraphConnections.predecessorCount;
    }

    public static /* synthetic */ boolean access$400(Object object) {
        return DirectedGraphConnections.isSuccessor(object);
    }

    public static /* synthetic */ int access$500(DirectedGraphConnections directedGraphConnections) {
        return directedGraphConnections.successorCount;
    }

    public static /* synthetic */ EndpointPair b(Object object, DirectedGraphConnections$NodeConnection directedGraphConnections$NodeConnection) {
        return DirectedGraphConnections.lambda$incidentEdgeIterator$2(object, directedGraphConnections$NodeConnection);
    }

    public static /* synthetic */ EndpointPair c(Object object, Object object2) {
        return DirectedGraphConnections.lambda$incidentEdgeIterator$1(object, object2);
    }

    private static boolean isPredecessor(Object object) {
        boolean bl2;
        Object object2 = PRED;
        if (object != object2 && !(bl2 = object instanceof DirectedGraphConnections$PredAndSucc)) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private static boolean isSuccessor(Object object) {
        boolean bl2;
        Object object2 = PRED;
        if (object != object2 && object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$0(Object object, Object object2) {
        return EndpointPair.ordered(object2, object);
    }

    private static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$1(Object object, Object object2) {
        return EndpointPair.ordered(object, object2);
    }

    private static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$2(Object object, DirectedGraphConnections$NodeConnection object2) {
        boolean bl2 = object2 instanceof DirectedGraphConnections$NodeConnection$Succ;
        if (bl2) {
            object2 = ((DirectedGraphConnections$NodeConnection)object2).node;
            return EndpointPair.ordered(object, object2);
        }
        return EndpointPair.ordered(((DirectedGraphConnections$NodeConnection)object2).node, object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static DirectedGraphConnections of(ElementOrder object) {
        void var0_4;
        int[] nArray = DirectedGraphConnections$5.$SwitchMap$com$google$common$graph$ElementOrder$Type;
        ElementOrder$Type elementOrder$Type = ((ElementOrder)object).type();
        int n3 = elementOrder$Type.ordinal();
        int n4 = nArray[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                ElementOrder$Type elementOrder$Type2 = ((ElementOrder)object).type();
                AssertionError assertionError = new AssertionError((Object)elementOrder$Type2);
                throw assertionError;
            }
            ArrayList arrayList = new ArrayList();
        } else {
            Object var0_3 = null;
        }
        HashMap hashMap = new HashMap(4, 1.0f);
        return new DirectedGraphConnections(hashMap, (List)var0_4, 0, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static DirectedGraphConnections ofImmutable(Object object, Iterable object2, Function function) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(function);
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        object2 = object2.iterator();
        int n3 = 0;
        int n4 = 0;
        while (true) {
            boolean bl2;
            if (!(bl2 = object2.hasNext())) {
                object2 = immutableList$Builder.build();
                return new DirectedGraphConnections(hashMap, (List)object2, n3, n4);
            }
            Object object3 = (EndpointPair)object2.next();
            Object object4 = ((EndpointPair)object3).nodeU();
            boolean bl3 = object4.equals(object);
            if (bl3 && (bl3 = (object4 = ((EndpointPair)object3).nodeV()).equals(object))) {
                object4 = function.apply(object);
                object3 = new DirectedGraphConnections$PredAndSucc(object4);
                hashMap.put(object, object3);
                object3 = new DirectedGraphConnections$NodeConnection$Pred(object);
                immutableList$Builder.add(object3);
                object3 = new DirectedGraphConnections$NodeConnection$Succ(object);
                immutableList$Builder.add(object3);
                ++n3;
            } else {
                Object object5;
                object4 = ((EndpointPair)object3).nodeV();
                bl3 = object4.equals(object);
                if (bl3) {
                    object3 = ((EndpointPair)object3).nodeU();
                    object4 = PRED;
                    if ((object4 = hashMap.put(object3, object4)) != null) {
                        object5 = new DirectedGraphConnections$PredAndSucc(object4);
                        hashMap.put(object3, object5);
                    }
                    object4 = new DirectedGraphConnections$NodeConnection$Pred(object3);
                    immutableList$Builder.add(object4);
                    ++n3;
                    continue;
                }
                bl3 = ((EndpointPair)object3).nodeU().equals(object);
                Preconditions.checkArgument(bl3);
                object3 = ((EndpointPair)object3).nodeV();
                object4 = function.apply(object3);
                object5 = hashMap.put(object3, object4);
                if (object5 != null) {
                    boolean bl4;
                    Object object6 = PRED;
                    if (object5 == object6) {
                        bl4 = true;
                    } else {
                        bl4 = false;
                        object5 = null;
                    }
                    Preconditions.checkArgument(bl4);
                    object5 = new DirectedGraphConnections$PredAndSucc(object4);
                    hashMap.put(object3, object5);
                }
                object4 = new DirectedGraphConnections$NodeConnection$Succ(object3);
                immutableList$Builder.add(object4);
            }
            ++n4;
        }
    }

    public void addPredecessor(Object object, Object object2) {
        block6: {
            int n3;
            Object object3;
            block4: {
                block5: {
                    object2 = this.adjacentNodeValues;
                    object3 = PRED;
                    if ((object2 = object2.put(object, object3)) == null) break block4;
                    boolean bl2 = object2 instanceof DirectedGraphConnections$PredAndSucc;
                    if (!bl2) break block5;
                    object3 = this.adjacentNodeValues;
                    object3.put(object, object2);
                    break block6;
                }
                if (object2 == object3) break block6;
                object3 = this.adjacentNodeValues;
                DirectedGraphConnections$PredAndSucc directedGraphConnections$PredAndSucc = new DirectedGraphConnections$PredAndSucc(object2);
                object3.put(object, directedGraphConnections$PredAndSucc);
            }
            this.predecessorCount = n3 = this.predecessorCount + 1;
            Graphs.checkPositive(n3);
            object2 = this.orderedNodeConnections;
            if (object2 != null) {
                object3 = new DirectedGraphConnections$NodeConnection$Pred(object);
                object2.add(object3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object addSuccessor(Object object, Object object2) {
        Object object3;
        Object object4;
        Object object5;
        block7: {
            block5: {
                block6: {
                    object5 = this.adjacentNodeValues.put(object, object2);
                    object4 = null;
                    if (object5 == null) break block5;
                    boolean bl2 = object5 instanceof DirectedGraphConnections$PredAndSucc;
                    if (!bl2) break block6;
                    object3 = this.adjacentNodeValues;
                    DirectedGraphConnections$PredAndSucc directedGraphConnections$PredAndSucc = new DirectedGraphConnections$PredAndSucc(object2);
                    object3.put(object, directedGraphConnections$PredAndSucc);
                    object5 = DirectedGraphConnections$PredAndSucc.access$600((DirectedGraphConnections$PredAndSucc)object5);
                    break block7;
                }
                object3 = PRED;
                if (object5 != object3) break block7;
                object5 = this.adjacentNodeValues;
                object3 = new DirectedGraphConnections$PredAndSucc(object2);
                object5.put(object, object3);
            }
            object5 = null;
        }
        if (object5 == null) {
            int n3;
            this.successorCount = n3 = this.successorCount + 1;
            Graphs.checkPositive(n3);
            object2 = this.orderedNodeConnections;
            if (object2 != null) {
                object3 = new DirectedGraphConnections$NodeConnection$Succ(object);
                object2.add(object3);
            }
        }
        if (object5 != null) return object5;
        return object4;
    }

    public Set adjacentNodes() {
        Collection collection = this.orderedNodeConnections;
        if (collection == null) {
            return Collections.unmodifiableSet(this.adjacentNodeValues.keySet());
        }
        collection = new DirectedGraphConnections$1(this);
        return collection;
    }

    public Iterator incidentEdgeIterator(Object object) {
        Object object2;
        Preconditions.checkNotNull(object);
        Object object3 = this.orderedNodeConnections;
        if (object3 == null) {
            object3 = this.predecessors().iterator();
            object2 = new f(object);
            object3 = Iterators.transform(object3, (Function)object2);
            object2 = this.successors().iterator();
            g g3 = new g(object);
            object = Iterators.transform((Iterator)object2, g3);
            object = Iterators.concat((Iterator)object3, (Iterator)object);
        } else {
            object3 = object3.iterator();
            object2 = new h(object);
            object = Iterators.transform(object3, (Function)object2);
        }
        object3 = new AtomicBoolean(false);
        object2 = new DirectedGraphConnections$4(this, (Iterator)object, (AtomicBoolean)object3);
        return object2;
    }

    public Set predecessors() {
        DirectedGraphConnections$2 directedGraphConnections$2 = new DirectedGraphConnections$2(this);
        return directedGraphConnections$2;
    }

    public void removePredecessor(Object object) {
        block6: {
            int n3;
            Object object2;
            Object object3;
            block5: {
                block4: {
                    Preconditions.checkNotNull(object);
                    object3 = this.adjacentNodeValues.get(object);
                    object2 = PRED;
                    if (object3 != object2) break block4;
                    object3 = this.adjacentNodeValues;
                    object3.remove(object);
                    break block5;
                }
                boolean bl2 = object3 instanceof DirectedGraphConnections$PredAndSucc;
                if (!bl2) break block6;
                object2 = this.adjacentNodeValues;
                object3 = DirectedGraphConnections$PredAndSucc.access$600((DirectedGraphConnections$PredAndSucc)object3);
                object2.put(object, object3);
            }
            this.predecessorCount = n3 = this.predecessorCount + -1;
            Graphs.checkNonNegative(n3);
            object3 = this.orderedNodeConnections;
            if (object3 != null) {
                object2 = new DirectedGraphConnections$NodeConnection$Pred(object);
                object3.remove(object2);
            }
        }
    }

    public Object removeSuccessor(Object object) {
        Object object2;
        Object object3;
        Preconditions.checkNotNull(object);
        Object object4 = this.adjacentNodeValues.get(object);
        Object var3_3 = null;
        if (object4 != null && object4 != (object3 = PRED)) {
            boolean bl2 = object4 instanceof DirectedGraphConnections$PredAndSucc;
            if (bl2) {
                object2 = this.adjacentNodeValues;
                object2.put(object, object3);
                object4 = DirectedGraphConnections$PredAndSucc.access$600((DirectedGraphConnections$PredAndSucc)object4);
            } else {
                object3 = this.adjacentNodeValues;
                object3.remove(object);
            }
        } else {
            object4 = null;
        }
        if (object4 != null) {
            int n3;
            this.successorCount = n3 = this.successorCount + -1;
            Graphs.checkNonNegative(n3);
            object3 = this.orderedNodeConnections;
            if (object3 != null) {
                object2 = new DirectedGraphConnections$NodeConnection$Succ(object);
                object3.remove(object2);
            }
        }
        if (object4 != null) {
            var3_3 = object4;
        }
        return var3_3;
    }

    public Set successors() {
        DirectedGraphConnections$3 directedGraphConnections$3 = new DirectedGraphConnections$3(this);
        return directedGraphConnections$3;
    }

    public Object value(Object object) {
        Preconditions.checkNotNull(object);
        object = this.adjacentNodeValues.get(object);
        Object object2 = PRED;
        if (object == object2) {
            return null;
        }
        boolean bl2 = object instanceof DirectedGraphConnections$PredAndSucc;
        if (bl2) {
            object = DirectedGraphConnections$PredAndSucc.access$600((DirectedGraphConnections$PredAndSucc)object);
        }
        return object;
    }
}

