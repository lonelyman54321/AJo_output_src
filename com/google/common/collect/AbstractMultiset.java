/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractMultiset$ElementSet;
import com.google.common.collect.AbstractMultiset$EntrySet;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

abstract class AbstractMultiset
extends AbstractCollection
implements Multiset {
    private transient Set elementSet;
    private transient Set entrySet;

    public int add(Object object, int n3) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean add(Object object) {
        boolean bl2 = true;
        this.add(object, (int)(bl2 ? 1 : 0));
        return bl2;
    }

    public final boolean addAll(Collection collection) {
        return Multisets.addAllImpl((Multiset)this, collection);
    }

    public abstract void clear();

    public boolean contains(Object object) {
        int n3 = this.count(object);
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public Set createElementSet() {
        AbstractMultiset$ElementSet abstractMultiset$ElementSet = new AbstractMultiset$ElementSet(this);
        return abstractMultiset$ElementSet;
    }

    public Set createEntrySet() {
        AbstractMultiset$EntrySet abstractMultiset$EntrySet = new AbstractMultiset$EntrySet(this);
        return abstractMultiset$EntrySet;
    }

    public abstract int distinctElements();

    public abstract Iterator elementIterator();

    public Set elementSet() {
        Set set = this.elementSet;
        if (set == null) {
            this.elementSet = set = this.createElementSet();
        }
        return set;
    }

    public abstract Iterator entryIterator();

    public Set entrySet() {
        Set set = this.entrySet;
        if (set == null) {
            this.entrySet = set = this.createEntrySet();
        }
        return set;
    }

    public final boolean equals(Object object) {
        return Multisets.equalsImpl(this, object);
    }

    public final int hashCode() {
        return this.entrySet().hashCode();
    }

    public boolean isEmpty() {
        return this.entrySet().isEmpty();
    }

    public int remove(Object object, int n3) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean remove(Object object) {
        boolean bl2 = true;
        int n3 = this.remove(object, (int)(bl2 ? 1 : 0));
        if (n3 <= 0) {
            bl2 = false;
        }
        return bl2;
    }

    public final boolean removeAll(Collection collection) {
        return Multisets.removeAllImpl(this, collection);
    }

    public final boolean retainAll(Collection collection) {
        return Multisets.retainAllImpl(this, collection);
    }

    public int setCount(Object object, int n3) {
        return Multisets.setCountImpl(this, object, n3);
    }

    public boolean setCount(Object object, int n3, int n4) {
        return Multisets.setCountImpl(this, object, n3, n4);
    }

    public final String toString() {
        return this.entrySet().toString();
    }
}

