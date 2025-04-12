/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PrimitiveSpreadBuilder;

public final class ShortSpreadBuilder
extends PrimitiveSpreadBuilder {
    private final short[] values;

    public ShortSpreadBuilder(int n3) {
        super(n3);
        short[] sArray = new short[n3];
        this.values = sArray;
    }

    public final void add(short s7) {
        short[] sArray = this.values;
        int n3 = this.getPosition();
        int n4 = n3 + 1;
        this.setPosition(n4);
        sArray[n3] = s7;
    }

    public int getSize(short[] sArray) {
        Intrinsics.checkNotNullParameter(sArray, "<this>");
        return sArray.length;
    }

    public final short[] toArray() {
        short[] sArray = this.values;
        short[] sArray2 = new short[this.size()];
        return (short[])this.toArray(sArray, sArray2);
    }
}

