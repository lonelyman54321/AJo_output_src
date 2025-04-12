/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Objects;

final class RegularImmutableMap$KeysOrValuesAsList
extends ImmutableList {
    private final transient Object[] alternatingKeysAndValues;
    private final transient int offset;
    private final transient int size;

    public RegularImmutableMap$KeysOrValuesAsList(Object[] objectArray, int n3, int n4) {
        this.alternatingKeysAndValues = objectArray;
        this.offset = n3;
        this.size = n4;
    }

    public Object get(int n3) {
        int n4 = this.size;
        Preconditions.checkElementIndex(n3, n4);
        Object[] objectArray = this.alternatingKeysAndValues;
        n3 *= 2;
        int n7 = this.offset;
        Object object = objectArray[n3 += n7];
        Objects.requireNonNull(object);
        return object;
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.size;
    }
}

