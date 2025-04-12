/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.collect.SortedLists$KeyAbsentBehavior;
import com.google.common.collect.SortedLists$KeyPresentBehavior;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

final class SortedLists {
    private SortedLists() {
    }

    public static int binarySearch(List list, Function function, Comparable comparable, SortedLists$KeyPresentBehavior sortedLists$KeyPresentBehavior, SortedLists$KeyAbsentBehavior sortedLists$KeyAbsentBehavior) {
        Preconditions.checkNotNull(comparable);
        Ordering ordering = Ordering.natural();
        return SortedLists.binarySearch(list, function, comparable, ordering, sortedLists$KeyPresentBehavior, sortedLists$KeyAbsentBehavior);
    }

    public static int binarySearch(List list, Function function, Object object, Comparator comparator, SortedLists$KeyPresentBehavior sortedLists$KeyPresentBehavior, SortedLists$KeyAbsentBehavior sortedLists$KeyAbsentBehavior) {
        return SortedLists.binarySearch(Lists.transform(list, function), object, comparator, sortedLists$KeyPresentBehavior, sortedLists$KeyAbsentBehavior);
    }

    public static int binarySearch(List list, Comparable comparable, SortedLists$KeyPresentBehavior sortedLists$KeyPresentBehavior, SortedLists$KeyAbsentBehavior sortedLists$KeyAbsentBehavior) {
        Preconditions.checkNotNull(comparable);
        Ordering ordering = Ordering.natural();
        return SortedLists.binarySearch(list, comparable, ordering, sortedLists$KeyPresentBehavior, sortedLists$KeyAbsentBehavior);
    }

    public static int binarySearch(List list, Object object, Comparator comparator, SortedLists$KeyPresentBehavior sortedLists$KeyPresentBehavior, SortedLists$KeyAbsentBehavior sortedLists$KeyAbsentBehavior) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull((Object)sortedLists$KeyPresentBehavior);
        Preconditions.checkNotNull((Object)sortedLists$KeyAbsentBehavior);
        int n3 = list instanceof RandomAccess;
        if (n3 == 0) {
            list = Lists.newArrayList(list);
        }
        n3 = list.size() + -1;
        int n4 = 0;
        while (n4 <= n3) {
            int n7 = n4 + n3 >>> 1;
            Object e2 = list.get(n7);
            int n8 = comparator.compare(object, e2);
            if (n8 < 0) {
                n3 = n7 += -1;
                continue;
            }
            if (n8 > 0) {
                n4 = ++n7;
                continue;
            }
            list = list.subList(n4, ++n3);
            int n10 = sortedLists$KeyPresentBehavior.resultIndex(comparator, object, list, n7 -= n4);
            return n4 + n10;
        }
        return sortedLists$KeyAbsentBehavior.resultIndex(n4);
    }
}

