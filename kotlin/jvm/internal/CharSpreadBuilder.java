/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PrimitiveSpreadBuilder;

public final class CharSpreadBuilder
extends PrimitiveSpreadBuilder {
    private final char[] values;

    public CharSpreadBuilder(int n3) {
        super(n3);
        char[] cArray = new char[n3];
        this.values = cArray;
    }

    public final void add(char c2) {
        char[] cArray = this.values;
        int n3 = this.getPosition();
        int n4 = n3 + 1;
        this.setPosition(n4);
        cArray[n3] = c2;
    }

    public int getSize(char[] cArray) {
        Intrinsics.checkNotNullParameter(cArray, "<this>");
        return cArray.length;
    }

    public final char[] toArray() {
        char[] cArray = this.values;
        char[] cArray2 = new char[this.size()];
        return (char[])this.toArray(cArray, cArray2);
    }
}

