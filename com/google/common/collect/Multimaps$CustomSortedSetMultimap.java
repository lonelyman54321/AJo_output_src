/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.AbstractSortedSetMultimap;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

class Multimaps$CustomSortedSetMultimap
extends AbstractSortedSetMultimap {
    private static final long serialVersionUID;
    transient Supplier factory;
    transient Comparator valueComparator;

    public Multimaps$CustomSortedSetMultimap(Map comparator, Supplier supplier) {
        super((Map)((Object)comparator));
        comparator = (Supplier)Preconditions.checkNotNull(supplier);
        this.factory = comparator;
        this.valueComparator = comparator = ((SortedSet)supplier.get()).comparator();
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        Comparator comparator = ((ObjectInputStream)object).readObject();
        Objects.requireNonNull(comparator);
        comparator = (Supplier)((Object)comparator);
        this.factory = comparator;
        this.valueComparator = comparator = ((SortedSet)comparator.get()).comparator();
        object = ((ObjectInputStream)object).readObject();
        Objects.requireNonNull(object);
        object = (Map)object;
        this.setMap((Map)object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Object object = this.factory;
        objectOutputStream.writeObject(object);
        object = this.backingMap();
        objectOutputStream.writeObject(object);
    }

    public Map createAsMap() {
        return this.createMaybeNavigableAsMap();
    }

    public SortedSet createCollection() {
        return (SortedSet)this.factory.get();
    }

    public Set createKeySet() {
        return this.createMaybeNavigableKeySet();
    }

    public Comparator valueComparator() {
        return this.valueComparator;
    }
}

