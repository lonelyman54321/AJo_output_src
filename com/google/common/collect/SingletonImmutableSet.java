/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;

final class SingletonImmutableSet
extends ImmutableSet {
    final transient Object element;

    public SingletonImmutableSet(Object object) {
        this.element = object = Preconditions.checkNotNull(object);
    }

    public ImmutableList asList() {
        return ImmutableList.of(this.element);
    }

    public boolean contains(Object object) {
        return this.element.equals(object);
    }

    public int copyIntoArray(Object[] objectArray, int n3) {
        Object object;
        objectArray[n3] = object = this.element;
        return n3 + 1;
    }

    public final int hashCode() {
        return this.element.hashCode();
    }

    public boolean isPartialView() {
        return false;
    }

    public UnmodifiableIterator iterator() {
        return Iterators.singletonIterator(this.element);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        String string2 = this.element.toString();
        stringBuilder.append(string2);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

