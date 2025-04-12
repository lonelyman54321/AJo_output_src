/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedInts;
import java.math.BigInteger;

public final class UnsignedInteger
extends Number
implements Comparable {
    public static final UnsignedInteger MAX_VALUE;
    public static final UnsignedInteger ONE;
    public static final UnsignedInteger ZERO;
    private final int value;

    static {
        ZERO = UnsignedInteger.fromIntBits(0);
        ONE = UnsignedInteger.fromIntBits(1);
        MAX_VALUE = UnsignedInteger.fromIntBits(-1);
    }

    private UnsignedInteger(int n3) {
        this.value = n3;
    }

    public static UnsignedInteger fromIntBits(int n3) {
        UnsignedInteger unsignedInteger = new UnsignedInteger(n3);
        return unsignedInteger;
    }

    public static UnsignedInteger valueOf(long l2) {
        long l3 = 0xFFFFFFFFL & l2;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        Preconditions.checkArgument(bl2, "value (%s) is outside the range for an unsigned integer value", l2);
        return UnsignedInteger.fromIntBits((int)l2);
    }

    public static UnsignedInteger valueOf(String string2) {
        return UnsignedInteger.valueOf(string2, 10);
    }

    public static UnsignedInteger valueOf(String string2, int n3) {
        return UnsignedInteger.fromIntBits(UnsignedInts.parseUnsignedInt(string2, n3));
    }

    public static UnsignedInteger valueOf(BigInteger bigInteger) {
        int n3;
        Preconditions.checkNotNull(bigInteger);
        int n4 = bigInteger.signum();
        n4 = n4 >= 0 && (n4 = bigInteger.bitLength()) <= (n3 = 32) ? 1 : 0;
        Preconditions.checkArgument(n4 != 0, "value (%s) is outside the range for an unsigned integer value", (Object)bigInteger);
        return UnsignedInteger.fromIntBits(bigInteger.intValue());
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this.longValue());
    }

    public int compareTo(UnsignedInteger unsignedInteger) {
        Preconditions.checkNotNull(unsignedInteger);
        int n3 = this.value;
        int n4 = unsignedInteger.value;
        return UnsignedInts.compare(n3, n4);
    }

    public UnsignedInteger dividedBy(UnsignedInteger unsignedInteger) {
        int n3 = this.value;
        int n4 = ((UnsignedInteger)Preconditions.checkNotNull((Object)unsignedInteger)).value;
        return UnsignedInteger.fromIntBits(UnsignedInts.divide(n3, n4));
    }

    public double doubleValue() {
        return this.longValue();
    }

    public boolean equals(Object object) {
        int n3 = object instanceof UnsignedInteger;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (UnsignedInteger)object;
            n3 = this.value;
            int n4 = ((UnsignedInteger)object).value;
            if (n3 == n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public float floatValue() {
        return this.longValue();
    }

    public int hashCode() {
        return this.value;
    }

    public int intValue() {
        return this.value;
    }

    public long longValue() {
        return UnsignedInts.toLong(this.value);
    }

    public UnsignedInteger minus(UnsignedInteger unsignedInteger) {
        int n3 = this.value;
        int n4 = ((UnsignedInteger)Preconditions.checkNotNull((Object)unsignedInteger)).value;
        return UnsignedInteger.fromIntBits(n3 - n4);
    }

    public UnsignedInteger mod(UnsignedInteger unsignedInteger) {
        int n3 = this.value;
        int n4 = ((UnsignedInteger)Preconditions.checkNotNull((Object)unsignedInteger)).value;
        return UnsignedInteger.fromIntBits(UnsignedInts.remainder(n3, n4));
    }

    public UnsignedInteger plus(UnsignedInteger unsignedInteger) {
        int n3 = this.value;
        int n4 = ((UnsignedInteger)Preconditions.checkNotNull((Object)unsignedInteger)).value;
        return UnsignedInteger.fromIntBits(n3 + n4);
    }

    public UnsignedInteger times(UnsignedInteger unsignedInteger) {
        int n3 = this.value;
        int n4 = ((UnsignedInteger)Preconditions.checkNotNull((Object)unsignedInteger)).value;
        return UnsignedInteger.fromIntBits(n3 * n4);
    }

    public String toString() {
        return this.toString(10);
    }

    public String toString(int n3) {
        return UnsignedInts.toString(this.value, n3);
    }
}

