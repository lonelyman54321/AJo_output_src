/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PrimitiveSpreadBuilder;

public final class ByteSpreadBuilder
extends PrimitiveSpreadBuilder {
    private final byte[] values;

    public ByteSpreadBuilder(int n3) {
        super(n3);
        byte[] byArray = new byte[n3];
        this.values = byArray;
    }

    public final void add(byte by2) {
        byte[] byArray = this.values;
        int n3 = this.getPosition();
        int n4 = n3 + 1;
        this.setPosition(n4);
        byArray[n3] = by2;
    }

    public int getSize(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "<this>");
        return byArray.length;
    }

    public final byte[] toArray() {
        byte[] byArray = this.values;
        byte[] byArray2 = new byte[this.size()];
        return (byte[])this.toArray(byArray, byArray2);
    }
}

