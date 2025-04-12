/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.Hashing;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;

final class RegularImmutableSet
extends ImmutableSet {
    static final RegularImmutableSet EMPTY;
    private static final Object[] EMPTY_ARRAY;
    final transient Object[] elements;
    private final transient int hashCode;
    private final transient int mask;
    private final transient int size;
    final transient Object[] table;

    static {
        RegularImmutableSet regularImmutableSet;
        Object[] objectArray = new Object[]{};
        EMPTY_ARRAY = objectArray;
        EMPTY = regularImmutableSet = new RegularImmutableSet(objectArray, 0, objectArray, 0, 0);
    }

    public RegularImmutableSet(Object[] objectArray, int n3, Object[] objectArray2, int n4, int n7) {
        this.elements = objectArray;
        this.hashCode = n3;
        this.table = objectArray2;
        this.mask = n4;
        this.size = n7;
    }

    public boolean contains(Object object) {
        int n3;
        Object[] objectArray = this.table;
        if (object != null && (n3 = objectArray.length) != 0) {
            n3 = Hashing.smearedHash(object);
            while (true) {
                int n4;
                Object object2;
                if ((object2 = objectArray[n3 &= (n4 = this.mask)]) == null) {
                    return false;
                }
                n4 = (int)(object2.equals(object) ? 1 : 0);
                if (n4 != 0) {
                    return true;
                }
                ++n3;
            }
        }
        return false;
    }

    public int copyIntoArray(Object[] objectArray, int n3) {
        Object[] objectArray2 = this.elements;
        int n4 = this.size;
        System.arraycopy(objectArray2, 0, objectArray, n3, n4);
        int n7 = this.size;
        return n3 + n7;
    }

    public ImmutableList createAsList() {
        Object[] objectArray = this.elements;
        int n3 = this.size;
        return ImmutableList.asImmutableList(objectArray, n3);
    }

    public int hashCode() {
        return this.hashCode;
    }

    public Object[] internalArray() {
        return this.elements;
    }

    public int internalArrayEnd() {
        return this.size;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public UnmodifiableIterator iterator() {
        return this.asList().iterator();
    }

    public int size() {
        return this.size;
    }
}

