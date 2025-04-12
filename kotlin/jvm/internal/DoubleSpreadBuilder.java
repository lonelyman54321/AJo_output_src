/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PrimitiveSpreadBuilder;

public final class DoubleSpreadBuilder
extends PrimitiveSpreadBuilder {
    private final double[] values;

    public DoubleSpreadBuilder(int n3) {
        super(n3);
        double[] dArray = new double[n3];
        this.values = dArray;
    }

    public final void add(double d2) {
        double[] dArray = this.values;
        int n3 = this.getPosition();
        int n4 = n3 + 1;
        this.setPosition(n4);
        dArray[n3] = d2;
    }

    public int getSize(double[] dArray) {
        Intrinsics.checkNotNullParameter(dArray, "<this>");
        return dArray.length;
    }

    public final double[] toArray() {
        double[] dArray = this.values;
        double[] dArray2 = new double[this.size()];
        return (double[])this.toArray(dArray, dArray2);
    }
}

