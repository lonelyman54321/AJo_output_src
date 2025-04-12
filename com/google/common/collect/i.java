/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.SetMultimap;
import java.util.Collection;

public final class i {
    public static /* bridge */ /* synthetic */ Collection a(SetMultimap setMultimap) {
        return setMultimap.entries();
    }

    public static /* bridge */ /* synthetic */ Collection b(SetMultimap setMultimap, Object object) {
        return setMultimap.get(object);
    }

    public static /* bridge */ /* synthetic */ Collection c(SetMultimap setMultimap, Object object) {
        return setMultimap.removeAll(object);
    }

    public static /* bridge */ /* synthetic */ Collection d(SetMultimap setMultimap, Object object, Iterable iterable) {
        return setMultimap.replaceValues(object, iterable);
    }
}

