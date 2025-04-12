/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

class Lists$OnePlusArrayList
extends AbstractList
implements Serializable,
RandomAccess {
    private static final long serialVersionUID;
    final Object first;
    final Object[] rest;

    public Lists$OnePlusArrayList(Object objectArray, Object[] objectArray2) {
        this.first = objectArray;
        objectArray = (Object[])Preconditions.checkNotNull(objectArray2);
        this.rest = objectArray;
    }

    public Object get(int n3) {
        Object object;
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        if (n3 == 0) {
            object = this.first;
        } else {
            Object[] objectArray = this.rest;
            object = objectArray[n3 += -1];
        }
        return object;
    }

    public int size() {
        return IntMath.saturatedAdd(this.rest.length, 1);
    }
}

