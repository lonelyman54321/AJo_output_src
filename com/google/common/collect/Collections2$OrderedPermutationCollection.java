/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Collections2;
import com.google.common.collect.Collections2$OrderedPermutationIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.math.IntMath;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class Collections2$OrderedPermutationCollection
extends AbstractCollection {
    final Comparator comparator;
    final ImmutableList inputList;
    final int size;

    public Collections2$OrderedPermutationCollection(Iterable iterable, Comparator comparator) {
        int n3;
        iterable = ImmutableList.sortedCopyOf(comparator, iterable);
        this.inputList = iterable;
        this.comparator = comparator;
        this.size = n3 = Collections2$OrderedPermutationCollection.calculateSize((List)iterable, comparator);
    }

    private static int calculateSize(List list, Comparator comparator) {
        int n3;
        int n4 = 1;
        int n7 = 1;
        int n8 = 1;
        int n10 = 1;
        while (n7 < (n3 = list.size())) {
            Object e2;
            n3 = n7 + -1;
            Object e5 = list.get(n3);
            if ((n3 = comparator.compare(e5, e2 = list.get(n7))) < 0) {
                n10 = IntMath.binomial(n7, n10);
                if ((n8 = IntMath.saturatedMultiply(n8, n10)) == (n10 = -1 >>> 1)) {
                    return n10;
                }
                n10 = 0;
            }
            ++n7;
            n10 += n4;
        }
        int n14 = IntMath.binomial(n7, n10);
        return IntMath.saturatedMultiply(n8, n14);
    }

    public boolean contains(Object object) {
        boolean bl2 = object instanceof List;
        if (bl2) {
            object = (List)object;
            return Collections2.access$000(this.inputList, (List)object);
        }
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        ImmutableList immutableList = this.inputList;
        Comparator comparator = this.comparator;
        Collections2$OrderedPermutationIterator collections2$OrderedPermutationIterator = new Collections2$OrderedPermutationIterator(immutableList, comparator);
        return collections2$OrderedPermutationIterator;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("orderedPermutationCollection(");
        ImmutableList immutableList = this.inputList;
        stringBuilder.append(immutableList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

