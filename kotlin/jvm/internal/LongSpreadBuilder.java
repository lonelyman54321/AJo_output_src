/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PrimitiveSpreadBuilder;

public final class LongSpreadBuilder
extends PrimitiveSpreadBuilder {
    private final long[] values;

    public LongSpreadBuilder(int n3) {
        super(n3);
        long[] lArray = new long[n3];
        this.values = lArray;
    }

    public final void add(long l2) {
        long[] lArray = this.values;
        int n3 = this.getPosition();
        int n4 = n3 + 1;
        this.setPosition(n4);
        lArray[n3] = l2;
    }

    public int getSize(long[] lArray) {
        Intrinsics.checkNotNullParameter(lArray, "<this>");
        return lArray.length;
    }

    public final long[] toArray() {
        long[] lArray = this.values;
        long[] lArray2 = new long[this.size()];
        return (long[])this.toArray(lArray, lArray2);
    }
}

