/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

final class Collections2$OrderedPermutationIterator
extends AbstractIterator {
    final Comparator comparator;
    List nextPermutation;

    public Collections2$OrderedPermutationIterator(List list, Comparator comparator) {
        this.nextPermutation = list = Lists.newArrayList(list);
        this.comparator = comparator;
    }

    public void calculateNextPermutation() {
        int n3;
        int n4 = this.findNextJ();
        if (n4 == (n3 = -1)) {
            this.nextPermutation = null;
            return;
        }
        Objects.requireNonNull(this.nextPermutation);
        n3 = this.findNextL(n4);
        Collections.swap(this.nextPermutation, n4, n3);
        n3 = this.nextPermutation.size();
        List list = this.nextPermutation;
        Collections.reverse(list.subList(++n4, n3));
    }

    public List computeNext() {
        List list = this.nextPermutation;
        if (list == null) {
            return (List)this.endOfData();
        }
        list = ImmutableList.copyOf((Collection)list);
        this.calculateNextPermutation();
        return list;
    }

    public int findNextJ() {
        Objects.requireNonNull(this.nextPermutation);
        List list = this.nextPermutation;
        for (int i3 = list.size() + -2; i3 >= 0; i3 += -1) {
            Comparator comparator = this.comparator;
            Object e2 = this.nextPermutation.get(i3);
            List list2 = this.nextPermutation;
            int n3 = i3 + 1;
            int n4 = comparator.compare(e2, list2 = list2.get(n3));
            if (n4 >= 0) continue;
            return i3;
        }
        return -1;
    }

    public int findNextL(int n3) {
        Objects.requireNonNull(this.nextPermutation);
        Object e2 = this.nextPermutation.get(n3);
        List list = this.nextPermutation;
        for (int i3 = list.size() + -1; i3 > n3; i3 += -1) {
            Comparator comparator = this.comparator;
            Object e5 = this.nextPermutation.get(i3);
            int n4 = comparator.compare(e2, e5);
            if (n4 >= 0) continue;
            return i3;
        }
        AssertionError assertionError = new AssertionError((Object)"this statement should be unreachable");
        throw assertionError;
    }
}

