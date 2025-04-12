/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Striped$1;
import com.google.common.util.concurrent.Striped$PowerOfTwoStriped;

class Striped$CompactStriped
extends Striped$PowerOfTwoStriped {
    private final Object[] array;

    private Striped$CompactStriped(int n3, Supplier supplier) {
        super(n3);
        Object[] objectArray;
        int n4 = 0x40000000;
        int n7 = 0;
        int n8 = 1;
        if (n3 <= n4) {
            n3 = 1;
        } else {
            n3 = 0;
            objectArray = null;
        }
        Object object = "Stripes must be <= 2^30)";
        Preconditions.checkArgument(n3 != 0, object);
        n3 = this.mask + n8;
        objectArray = new Object[n3];
        this.array = objectArray;
        while (n7 < (n4 = (objectArray = this.array).length)) {
            objectArray[n7] = object = supplier.get();
            ++n7;
        }
    }

    public /* synthetic */ Striped$CompactStriped(int n3, Supplier supplier, Striped$1 striped$1) {
        this(n3, supplier);
    }

    public Object getAt(int n3) {
        return this.array[n3];
    }

    public int size() {
        return this.array.length;
    }
}

