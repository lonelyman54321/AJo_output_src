/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ForwardingSortedMap;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public abstract class ForwardingSortedSet
extends ForwardingSet
implements SortedSet {
    public Comparator comparator() {
        return this.delegate().comparator();
    }

    public abstract SortedSet delegate();

    public Object first() {
        return this.delegate().first();
    }

    public SortedSet headSet(Object object) {
        return this.delegate().headSet(object);
    }

    public Object last() {
        return this.delegate().last();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean standardContains(Object object) {
        boolean bl2 = false;
        Object object2 = this.tailSet(object);
        object2 = object2.first();
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

    public boolean standardRemove(Object object) {
        block8: {
            Object object2 = this.tailSet(object);
            object2 = object2.iterator();
            boolean bl2 = object2.hasNext();
            if (!bl2) break block8;
            Object e2 = object2.next();
            Comparator comparator = this.comparator();
            int n3 = ForwardingSortedMap.unsafeCompare(comparator, e2, object);
            if (n3 != 0) break block8;
            try {
                object2.remove();
                return true;
            }
            catch (ClassCastException | NullPointerException runtimeException) {}
        }
        return false;
    }

    public SortedSet standardSubSet(Object object, Object object2) {
        return this.tailSet(object).headSet(object2);
    }

    public SortedSet subSet(Object object, Object object2) {
        return this.delegate().subSet(object, object2);
    }

    public SortedSet tailSet(Object object) {
        return this.delegate().tailSet(object);
    }
}

