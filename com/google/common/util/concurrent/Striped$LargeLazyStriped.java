/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.MapMaker;
import com.google.common.util.concurrent.Striped$PowerOfTwoStriped;
import java.util.concurrent.ConcurrentMap;

class Striped$LargeLazyStriped
extends Striped$PowerOfTwoStriped {
    final ConcurrentMap locks;
    final int size;
    final Supplier supplier;

    public Striped$LargeLazyStriped(int n3, Supplier supplier) {
        super(n3);
        n3 = this.mask;
        int n4 = -1;
        n3 = n3 == n4 ? -1 >>> 1 : ++n3;
        this.size = n3;
        this.supplier = supplier;
        Object object = new MapMaker();
        this.locks = object = ((MapMaker)object).weakValues().makeMap();
    }

    public Object getAt(int n3) {
        int n4 = this.size;
        int n7 = -1 >>> 1;
        if (n4 != n7) {
            n4 = this.size();
            Preconditions.checkElementIndex(n3, n4);
        }
        Object object = this.locks;
        Object object2 = n3;
        if ((object = object.get(object2)) != null) {
            return object;
        }
        object = this.supplier.get();
        object2 = this.locks;
        Integer n8 = n3;
        return MoreObjects.firstNonNull(object2.putIfAbsent(n8, object), object);
    }

    public int size() {
        return this.size;
    }
}

