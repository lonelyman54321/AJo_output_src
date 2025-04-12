/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Objects;

class RegularImmutableList
extends ImmutableList {
    static final ImmutableList EMPTY;
    final transient Object[] array;
    private final transient int size;

    static {
        Object[] objectArray = new Object[]{};
        RegularImmutableList regularImmutableList = new RegularImmutableList(objectArray, 0);
        EMPTY = regularImmutableList;
    }

    public RegularImmutableList(Object[] objectArray, int n3) {
        this.array = objectArray;
        this.size = n3;
    }

    public int copyIntoArray(Object[] objectArray, int n3) {
        Object[] objectArray2 = this.array;
        int n4 = this.size;
        System.arraycopy(objectArray2, 0, objectArray, n3, n4);
        int n7 = this.size;
        return n3 + n7;
    }

    public Object get(int n3) {
        int n4 = this.size;
        Preconditions.checkElementIndex(n3, n4);
        Object object = this.array[n3];
        Objects.requireNonNull(object);
        return object;
    }

    public Object[] internalArray() {
        return this.array;
    }

    public int internalArrayEnd() {
        return this.size;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.size;
    }
}

