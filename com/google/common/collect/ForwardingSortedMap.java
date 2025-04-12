/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMap;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;

public abstract class ForwardingSortedMap
extends ForwardingMap
implements SortedMap {
    public static int unsafeCompare(Comparator comparator, Object object, Object object2) {
        if (comparator == null) {
            return ((Comparable)object).compareTo(object2);
        }
        return comparator.compare(object, object2);
    }

    public Comparator comparator() {
        return this.delegate().comparator();
    }

    public abstract SortedMap delegate();

    public Object firstKey() {
        return this.delegate().firstKey();
    }

    public SortedMap headMap(Object object) {
        return this.delegate().headMap(object);
    }

    public Object lastKey() {
        return this.delegate().lastKey();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean standardContainsKey(Object object) {
        boolean bl2 = false;
        Object object2 = this.tailMap(object);
        object2 = object2.firstKey();
        Comparator comparator = this.comparator();
        try {
            int n3 = ForwardingSortedMap.unsafeCompare(comparator, object2, object);
            if (n3 != 0) return bl2;
            return true;
        }
        catch (ClassCastException | NullPointerException | NoSuchElementException runtimeException) {
            return bl2;
        }
    }

    public SortedMap standardSubMap(Object object, Object object2) {
        Comparator comparator = this.comparator();
        int n3 = ForwardingSortedMap.unsafeCompare(comparator, object, object2);
        if (n3 <= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            comparator = null;
        }
        Preconditions.checkArgument(n3 != 0, "fromKey must be <= toKey");
        return this.tailMap(object).headMap(object2);
    }

    public SortedMap subMap(Object object, Object object2) {
        return this.delegate().subMap(object, object2);
    }

    public SortedMap tailMap(Object object) {
        return this.delegate().tailMap(object);
    }
}

