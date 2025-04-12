/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ListMultimap;
import java.util.Collection;

public final class d {
    public static /* bridge */ /* synthetic */ Collection a(ListMultimap listMultimap, Object object) {
        return listMultimap.get(object);
    }

    public static /* bridge */ /* synthetic */ Collection b(ListMultimap listMultimap, Object object) {
        return listMultimap.removeAll(object);
    }

    public static /* bridge */ /* synthetic */ Collection c(ListMultimap listMultimap, Object object, Iterable iterable) {
        return listMultimap.replaceValues(object, iterable);
    }
}

