/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PrimitiveSpreadBuilder;

public final class IntSpreadBuilder
extends PrimitiveSpreadBuilder {
    private final int[] values;

    public IntSpreadBuilder(int n3) {
        super(n3);
        int[] nArray = new int[n3];
        this.values = nArray;
    }

    public final void add(int n3) {
        int[] nArray = this.values;
        int n4 = this.getPosition();
        int n7 = n4 + 1;
        this.setPosition(n7);
        nArray[n4] = n3;
    }

    public int getSize(int[] nArray) {
        Intrinsics.checkNotNullParameter(nArray, "<this>");
        return nArray.length;
    }

    public final int[] toArray() {
        int[] nArray = this.values;
        int[] nArray2 = new int[this.size()];
        return (int[])this.toArray(nArray, nArray2);
    }
}

