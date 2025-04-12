/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.Iterators;
import com.google.common.graph.AbstractBaseGraph;
import com.google.common.graph.AbstractNetwork$1;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.d;
import java.util.AbstractSet;
import java.util.Iterator;

class AbstractNetwork$1$1
extends AbstractSet {
    final /* synthetic */ AbstractNetwork$1 this$1;

    public AbstractNetwork$1$1(AbstractNetwork$1 abstractNetwork$1) {
        this.this$1 = abstractNetwork$1;
    }

    public static /* synthetic */ EndpointPair a(AbstractNetwork$1$1 abstractNetwork$1$1, Object object) {
        return abstractNetwork$1$1.lambda$iterator$0(object);
    }

    private /* synthetic */ EndpointPair lambda$iterator$0(Object object) {
        return this.this$1.this$0.incidentNodes(object);
    }

    public boolean contains(Object object) {
        Object object2;
        boolean bl2 = object instanceof EndpointPair;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        Object object3 = this.this$1;
        bl2 = ((AbstractBaseGraph)object3).isOrderingCompatible((EndpointPair)(object = (EndpointPair)object));
        if (bl2 && (bl2 = (object3 = this.this$1.nodes()).contains(object2 = ((EndpointPair)object).nodeU()))) {
            object3 = this.this$1;
            object2 = ((EndpointPair)object).nodeU();
            boolean bl4 = (object3 = ((AbstractNetwork$1)object3).successors(object2)).contains(object = ((EndpointPair)object).nodeV());
            if (bl4) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public Iterator iterator() {
        Iterator iterator = this.this$1.this$0.edges().iterator();
        d d2 = new d(this);
        return Iterators.transform(iterator, d2);
    }

    public int size() {
        return this.this$1.this$0.edges().size();
    }
}

