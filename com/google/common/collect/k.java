/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.SortedSetMultimap;
import java.util.Collection;
import java.util.Set;

public final class k {
    public static /* bridge */ /* synthetic */ Collection a(SortedSetMultimap sortedSetMultimap, Object object) {
        return sortedSetMultimap.get(object);
    }

    public static /* bridge */ /* synthetic */ Set b(SortedSetMultimap sortedSetMultimap, Object object) {
        return sortedSetMultimap.get(object);
    }

    public static /* bridge */ /* synthetic */ Collection c(SortedSetMultimap sortedSetMultimap, Object object) {
        return sortedSetMultimap.removeAll(object);
    }

    public static /* bridge */ /* synthetic */ Set d(SortedSetMultimap sortedSetMultimap, Object object) {
        return sortedSetMultimap.removeAll(object);
    }

    public static /* bridge */ /* synthetic */ Collection e(SortedSetMultimap sortedSetMultimap, Object object, Iterable iterable) {
        return sortedSetMultimap.replaceValues(object, iterable);
    }

    public static /* bridge */ /* synthetic */ Set f(SortedSetMultimap sortedSetMultimap, Object object, Iterable iterable) {
        return sortedSetMultimap.replaceValues(object, iterable);
    }
}

