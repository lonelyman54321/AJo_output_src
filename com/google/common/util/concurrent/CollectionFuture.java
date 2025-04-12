/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.AggregateFuture;
import com.google.common.util.concurrent.AggregateFuture$ReleaseResourcesReason;
import com.google.common.util.concurrent.CollectionFuture$Present;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class CollectionFuture
extends AggregateFuture {
    private List values;

    public CollectionFuture(ImmutableCollection immutableCollection, boolean bl2) {
        int n3;
        ArrayList arrayList;
        int n4 = 1;
        super(immutableCollection, bl2, n4 != 0);
        boolean bl3 = immutableCollection.isEmpty();
        if (bl3) {
            arrayList = Collections.emptyList();
        } else {
            int n7 = immutableCollection.size();
            arrayList = Lists.newArrayListWithCapacity(n7);
        }
        for (n4 = 0; n4 < (n3 = immutableCollection.size()); ++n4) {
            n3 = 0;
            arrayList.add(null);
        }
        this.values = arrayList;
    }

    public final void collectOneValue(int n3, Object object) {
        List list = this.values;
        if (list != null) {
            CollectionFuture$Present collectionFuture$Present = new CollectionFuture$Present(object);
            list.set(n3, collectionFuture$Present);
        }
    }

    public abstract Object combine(List var1);

    public final void handleAllCompleted() {
        Object object = this.values;
        if (object != null) {
            object = this.combine((List)object);
            this.set(object);
        }
    }

    public void releaseResources(AggregateFuture$ReleaseResourcesReason aggregateFuture$ReleaseResourcesReason) {
        super.releaseResources(aggregateFuture$ReleaseResourcesReason);
        this.values = null;
    }
}

