/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ForwardingCollection;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class ForwardingList
extends ForwardingCollection
implements List {
    public void add(int n3, Object object) {
        this.delegate().add(n3, object);
    }

    public boolean addAll(int n3, Collection collection) {
        return this.delegate().addAll(n3, collection);
    }

    public abstract List delegate();

    public boolean equals(Object object) {
        Object object2;
        boolean bl2;
        if (object != this && !(bl2 = (object2 = this.delegate()).equals(object))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public Object get(int n3) {
        return this.delegate().get(n3);
    }

    public int hashCode() {
        return this.delegate().hashCode();
    }

    public int indexOf(Object object) {
        return this.delegate().indexOf(object);
    }

    public int lastIndexOf(Object object) {
        return this.delegate().lastIndexOf(object);
    }

    public ListIterator listIterator() {
        return this.delegate().listIterator();
    }

    public ListIterator listIterator(int n3) {
        return this.delegate().listIterator(n3);
    }

    public Object remove(int n3) {
        return this.delegate().remove(n3);
    }

    public Object set(int n3, Object object) {
        return this.delegate().set(n3, object);
    }

    public boolean standardAdd(Object object) {
        int n3 = this.size();
        this.add(n3, object);
        return true;
    }

    public boolean standardAddAll(int n3, Iterable iterable) {
        return Lists.addAllImpl(this, n3, iterable);
    }

    public boolean standardEquals(Object object) {
        return Lists.equalsImpl(this, object);
    }

    public int standardHashCode() {
        return Lists.hashCodeImpl(this);
    }

    public int standardIndexOf(Object object) {
        return Lists.indexOfImpl(this, object);
    }

    public Iterator standardIterator() {
        return this.listIterator();
    }

    public int standardLastIndexOf(Object object) {
        return Lists.lastIndexOfImpl(this, object);
    }

    public ListIterator standardListIterator() {
        return this.listIterator(0);
    }

    public ListIterator standardListIterator(int n3) {
        return Lists.listIteratorImpl(this, n3);
    }

    public List standardSubList(int n3, int n4) {
        return Lists.subListImpl(this, n3, n4);
    }

    public List subList(int n3, int n4) {
        return this.delegate().subList(n3, n4);
    }
}

