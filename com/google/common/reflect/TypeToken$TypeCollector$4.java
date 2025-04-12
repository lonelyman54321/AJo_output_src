/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

class TypeToken$TypeCollector$4
extends Ordering {
    final /* synthetic */ Map val$map;
    final /* synthetic */ Comparator val$valueComparator;

    public TypeToken$TypeCollector$4(Comparator comparator, Map map2) {
        this.val$valueComparator = comparator;
        this.val$map = map2;
    }

    public int compare(Object object, Object object2) {
        Comparator comparator = this.val$valueComparator;
        object = this.val$map.get(object);
        Objects.requireNonNull(object);
        object2 = this.val$map.get(object2);
        Objects.requireNonNull(object2);
        return comparator.compare(object, object2);
    }
}

