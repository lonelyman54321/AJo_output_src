/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.CollectionFuture;
import com.google.common.util.concurrent.CollectionFuture$Present;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class CollectionFuture$ListFuture
extends CollectionFuture {
    public CollectionFuture$ListFuture(ImmutableCollection immutableCollection, boolean bl2) {
        super(immutableCollection, bl2);
        this.init();
    }

    public List combine(List object) {
        boolean bl2;
        int n3 = object.size();
        ArrayList arrayList = Lists.newArrayListWithCapacity(n3);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (CollectionFuture$Present)object.next();
            if (object2 != null) {
                object2 = ((CollectionFuture$Present)object2).value;
            } else {
                bl2 = false;
                object2 = null;
            }
            arrayList.add(object2);
        }
        return Collections.unmodifiableList(arrayList);
    }
}

