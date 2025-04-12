/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

final class CompoundOrdering
extends Ordering
implements Serializable {
    private static final long serialVersionUID;
    final Comparator[] comparators;

    public CompoundOrdering(Iterable comparatorArray) {
        Object[] objectArray = new Comparator[]{};
        comparatorArray = (Comparator[])Iterables.toArray((Iterable)comparatorArray, objectArray);
        this.comparators = comparatorArray;
    }

    public CompoundOrdering(Comparator comparator, Comparator comparator2) {
        Comparator[] comparatorArray = new Comparator[]{comparator, comparator2};
        this.comparators = comparatorArray;
    }

    public int compare(Object object, Object object2) {
        Object object3;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((Comparator[])(object3 = this.comparators)).length); ++i3) {
            int n4 = (object3 = object3[i3]).compare(object, object2);
            if (n4 == 0) continue;
            return n4;
        }
        return 0;
    }

    public boolean equals(Object objectArray) {
        if (objectArray == this) {
            return true;
        }
        boolean bl2 = objectArray instanceof CompoundOrdering;
        if (bl2) {
            objectArray = (CompoundOrdering)objectArray;
            Object[] objectArray2 = this.comparators;
            objectArray = objectArray.comparators;
            return Arrays.equals(objectArray2, objectArray);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Ordering.compound(");
        String string2 = Arrays.toString(this.comparators);
        return h30_0.a(stringBuilder, string2, ")");
    }
}

