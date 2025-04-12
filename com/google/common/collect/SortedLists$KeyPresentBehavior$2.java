/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.SortedLists$KeyPresentBehavior;
import java.util.Comparator;
import java.util.List;

final class SortedLists$KeyPresentBehavior$2
extends SortedLists$KeyPresentBehavior {
    public int resultIndex(Comparator comparator, Object object, List list, int n3) {
        int n4 = list.size() + -1;
        while (n3 < n4) {
            int n7 = n3 + n4 + 1 >>> 1;
            Object e2 = list.get(n7);
            int n8 = comparator.compare(e2, object);
            if (n8 > 0) {
                n4 = n7 += -1;
                continue;
            }
            n3 = n7;
        }
        return n3;
    }
}

