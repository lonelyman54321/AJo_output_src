/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

class Lists$TwoPlusArrayList
extends AbstractList
implements Serializable,
RandomAccess {
    private static final long serialVersionUID;
    final Object first;
    final Object[] rest;
    final Object second;

    public Lists$TwoPlusArrayList(Object objectArray, Object object, Object[] objectArray2) {
        this.first = objectArray;
        this.second = object;
        objectArray = (Object[])Preconditions.checkNotNull(objectArray2);
        this.rest = objectArray;
    }

    public Object get(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = this.size();
                Preconditions.checkElementIndex(n3, n4);
                Object[] objectArray = this.rest;
                return objectArray[n3 += -2];
            }
            return this.second;
        }
        return this.first;
    }

    public int size() {
        return IntMath.saturatedAdd(this.rest.length, 2);
    }
}

