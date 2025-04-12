/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIndexedListIterator;
import com.google.common.collect.UnmodifiableListIterator;

final class Iterators$ArrayItr
extends AbstractIndexedListIterator {
    static final UnmodifiableListIterator EMPTY;
    private final Object[] array;
    private final int offset;

    static {
        Object[] objectArray = new Object[]{};
        Iterators$ArrayItr iterators$ArrayItr = new Iterators$ArrayItr(objectArray, 0, 0, 0);
        EMPTY = iterators$ArrayItr;
    }

    public Iterators$ArrayItr(Object[] objectArray, int n3, int n4, int n7) {
        super(n4, n7);
        this.array = objectArray;
        this.offset = n3;
    }

    public Object get(int n3) {
        Object[] objectArray = this.array;
        int n4 = this.offset + n3;
        return objectArray[n4];
    }
}

