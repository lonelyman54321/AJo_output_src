/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableCollection$Builder;
import com.google.common.collect.ObjectArrays;
import java.util.Arrays;
import java.util.Collection;

abstract class ImmutableCollection$ArrayBasedBuilder
extends ImmutableCollection$Builder {
    Object[] contents;
    boolean forceCopy;
    int size;

    public ImmutableCollection$ArrayBasedBuilder(int n3) {
        CollectPreconditions.checkNonnegative(n3, "initialCapacity");
        Object[] objectArray = new Object[n3];
        this.contents = objectArray;
        this.size = 0;
    }

    private void getReadyToExpandTo(int n3) {
        Object[] objectArray = this.contents;
        int n4 = objectArray.length;
        if (n4 < n3) {
            n4 = objectArray.length;
            n3 = ImmutableCollection$Builder.expandedCapacity(n4, n3);
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            this.contents = objectArray2;
            this.forceCopy = false;
        } else {
            n3 = (int)(this.forceCopy ? 1 : 0);
            if (n3 != 0) {
                Object[] objectArray3 = (Object[])objectArray.clone();
                this.contents = objectArray3;
                this.forceCopy = false;
            }
        }
    }

    public ImmutableCollection$ArrayBasedBuilder add(Object object) {
        int n3;
        Preconditions.checkNotNull(object);
        int n4 = this.size + 1;
        this.getReadyToExpandTo(n4);
        Object[] objectArray = this.contents;
        int n7 = this.size;
        this.size = n3 = n7 + 1;
        objectArray[n7] = object;
        return this;
    }

    public ImmutableCollection$Builder add(Object ... objectArray) {
        int n3 = objectArray.length;
        this.addAll(objectArray, n3);
        return this;
    }

    public ImmutableCollection$Builder addAll(Iterable objectArray) {
        boolean bl2 = objectArray instanceof Collection;
        if (bl2) {
            Object[] objectArray2 = objectArray;
            objectArray2 = (Collection)objectArray;
            int n3 = this.size;
            int n4 = objectArray2.size() + n3;
            this.getReadyToExpandTo(n4);
            n3 = objectArray2 instanceof ImmutableCollection;
            if (n3 != 0) {
                int n7;
                objectArray2 = (ImmutableCollection)objectArray2;
                objectArray = this.contents;
                n3 = this.size;
                this.size = n7 = objectArray2.copyIntoArray(objectArray, n3);
                return this;
            }
        }
        super.addAll((Iterable)objectArray);
        return this;
    }

    public final void addAll(Object[] objectArray, int n3) {
        int n4;
        ObjectArrays.checkElementsNotNull(objectArray, n3);
        int n7 = this.size + n3;
        this.getReadyToExpandTo(n7);
        Object[] objectArray2 = this.contents;
        int n8 = this.size;
        System.arraycopy(objectArray, 0, objectArray2, n8, n3);
        this.size = n4 = this.size + n3;
    }
}

