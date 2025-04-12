/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PrimitiveSpreadBuilder;

public final class BooleanSpreadBuilder
extends PrimitiveSpreadBuilder {
    private final boolean[] values;

    public BooleanSpreadBuilder(int n3) {
        super(n3);
        boolean[] blArray = new boolean[n3];
        this.values = blArray;
    }

    public final void add(boolean bl2) {
        boolean[] blArray = this.values;
        int n3 = this.getPosition();
        int n4 = n3 + 1;
        this.setPosition(n4);
        blArray[n3] = bl2;
    }

    public int getSize(boolean[] blArray) {
        Intrinsics.checkNotNullParameter(blArray, "<this>");
        return blArray.length;
    }

    public final boolean[] toArray() {
        boolean[] blArray = this.values;
        boolean[] blArray2 = new boolean[this.size()];
        return (boolean[])this.toArray(blArray, blArray2);
    }
}

