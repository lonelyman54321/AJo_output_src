/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.SortedLists$KeyPresentBehavior;
import java.util.Comparator;
import java.util.List;

final class SortedLists$KeyPresentBehavior$4
extends SortedLists$KeyPresentBehavior {
    public int resultIndex(Comparator comparator, Object object, List list, int n3) {
        return SortedLists$KeyPresentBehavior.LAST_PRESENT.resultIndex(comparator, object, list, n3) + 1;
    }
}

