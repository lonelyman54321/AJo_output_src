/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.Striped;

abstract class Striped$PowerOfTwoStriped
extends Striped {
    final int mask;

    public Striped$PowerOfTwoStriped(int n3) {
        super(null);
        int n4 = 1;
        int n7 = n3 > 0 ? 1 : 0;
        String string2 = "Stripes must be positive";
        Preconditions.checkArgument(n7 != 0, string2);
        n7 = 0x40000000;
        n3 = n3 > n7 ? -1 : Striped.access$200(n3) - n4;
        this.mask = n3;
    }

    public final Object get(Object object) {
        int n3 = this.indexFor(object);
        return this.getAt(n3);
    }

    public final int indexFor(Object object) {
        int n3 = Striped.access$300(object.hashCode());
        int n4 = this.mask;
        return n3 & n4;
    }
}

