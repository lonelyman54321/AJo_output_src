/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

class Lists$Partition
extends AbstractList {
    final List list;
    final int size;

    public Lists$Partition(List list, int n3) {
        this.list = list;
        this.size = n3;
    }

    public List get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        n4 = this.size;
        n3 *= n4;
        n4 += n3;
        int n7 = this.list.size();
        n4 = Math.min(n4, n7);
        return this.list.subList(n3, n4);
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public int size() {
        int n3 = this.list.size();
        int n4 = this.size;
        RoundingMode roundingMode = RoundingMode.CEILING;
        return IntMath.divide(n3, n4, roundingMode);
    }
}

