/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PrimitiveSpreadBuilder;

public final class FloatSpreadBuilder
extends PrimitiveSpreadBuilder {
    private final float[] values;

    public FloatSpreadBuilder(int n3) {
        super(n3);
        float[] fArray = new float[n3];
        this.values = fArray;
    }

    public final void add(float f5) {
        float[] fArray = this.values;
        int n3 = this.getPosition();
        int n4 = n3 + 1;
        this.setPosition(n4);
        fArray[n3] = f5;
    }

    public int getSize(float[] fArray) {
        Intrinsics.checkNotNullParameter(fArray, "<this>");
        return fArray.length;
    }

    public final float[] toArray() {
        float[] fArray = this.values;
        float[] fArray2 = new float[this.size()];
        return (float[])this.toArray(fArray, fArray2);
    }
}

