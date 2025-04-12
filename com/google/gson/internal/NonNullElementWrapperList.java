/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public class NonNullElementWrapperList
extends AbstractList
implements RandomAccess {
    private final ArrayList delegate;

    public NonNullElementWrapperList(ArrayList arrayList) {
        Objects.requireNonNull(arrayList);
        this.delegate = arrayList;
    }

    private Object nonNull(Object object) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException("Element must be non-null");
        throw object;
    }

    public void add(int n3, Object object) {
        ArrayList arrayList = this.delegate;
        object = this.nonNull(object);
        arrayList.add(n3, object);
    }

    public void clear() {
        this.delegate.clear();
    }

    public boolean contains(Object object) {
        return this.delegate.contains(object);
    }

    public boolean equals(Object object) {
        return this.delegate.equals(object);
    }

    public Object get(int n3) {
        return this.delegate.get(n3);
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    public int indexOf(Object object) {
        return this.delegate.indexOf(object);
    }

    public int lastIndexOf(Object object) {
        return this.delegate.lastIndexOf(object);
    }

    public Object remove(int n3) {
        return this.delegate.remove(n3);
    }

    public boolean remove(Object object) {
        return this.delegate.remove(object);
    }

    public boolean removeAll(Collection collection) {
        return this.delegate.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return this.delegate.retainAll(collection);
    }

    public Object set(int n3, Object object) {
        ArrayList arrayList = this.delegate;
        object = this.nonNull(object);
        return arrayList.set(n3, object);
    }

    public int size() {
        return this.delegate.size();
    }

    public Object[] toArray() {
        return this.delegate.toArray();
    }

    public Object[] toArray(Object[] objectArray) {
        return this.delegate.toArray(objectArray);
    }
}

