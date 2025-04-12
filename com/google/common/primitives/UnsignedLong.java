/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedLongs;
import java.io.Serializable;
import java.math.BigInteger;

public final class UnsignedLong
extends Number
implements Comparable,
Serializable {
    public static final UnsignedLong MAX_VALUE;
    public static final UnsignedLong ONE;
    private static final long UNSIGNED_MASK = Long.MAX_VALUE;
    public static final UnsignedLong ZERO;
    private final long value;

    static {
        UnsignedLong unsignedLong;
        ZERO = unsignedLong = new UnsignedLong(0L);
        ONE = unsignedLong = new UnsignedLong(1L);
        MAX_VALUE = unsignedLong = new UnsignedLong(-1);
    }

    private UnsignedLong(long l2) {
        this.value = l2;
    }

    public static UnsignedLong fromLongBits(long l2) {
        UnsignedLong unsignedLong = new UnsignedLong(l2);
        return unsignedLong;
    }

    public static UnsignedLong valueOf(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        Preconditions.checkArgument(bl2, "value (%s) is outside the range for an unsigned long value", l2);
        return UnsignedLong.fromLongBits(l2);
    }

    public static UnsignedLong valueOf(String string2) {
        return UnsignedLong.valueOf(string2, 10);
    }

    public static UnsignedLong valueOf(String string2, int n3) {
        return UnsignedLong.fromLongBits(UnsignedLongs.parseUnsignedLong(string2, n3));
    }

    public static UnsignedLong valueOf(BigInteger bigInteger) {
        int n3;
        Preconditions.checkNotNull(bigInteger);
        int n4 = bigInteger.signum();
        n4 = n4 >= 0 && (n4 = bigInteger.bitLength()) <= (n3 = 64) ? 1 : 0;
        Preconditions.checkArgument(n4 != 0, "value (%s) is outside the range for an unsigned long value", (Object)bigInteger);
        return UnsignedLong.fromLongBits(bigInteger.longValue());
    }

    public BigInteger bigIntegerValue() {
        long l2 = this.value;
        long l3 = Long.MAX_VALUE;
        BigInteger bigInteger = BigInteger.valueOf(l2 &= l3);
        long l4 = this.value;
        long l7 = 0L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object < 0) {
            int n3 = 63;
            bigInteger = bigInteger.setBit(n3);
        }
        return bigInteger;
    }

    public int compareTo(UnsignedLong unsignedLong) {
        Preconditions.checkNotNull(unsignedLong);
        long l2 = this.value;
        long l3 = unsignedLong.value;
        return UnsignedLongs.compare(l2, l3);
    }

    public UnsignedLong dividedBy(UnsignedLong unsignedLong) {
        long l2 = this.value;
        long l3 = ((UnsignedLong)Preconditions.checkNotNull((Object)unsignedLong)).value;
        return UnsignedLong.fromLongBits(UnsignedLongs.divide(l2, l3));
    }

    public double doubleValue() {
        long l2 = this.value;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            return l2;
        }
        l3 = l2 >>> 1;
        return (double)(l2 & 1L | l3) * 2.0;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof UnsignedLong;
        boolean bl3 = false;
        if (bl2) {
            object = (UnsignedLong)object;
            long l2 = this.value;
            long l3 = ((UnsignedLong)object).value;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public float floatValue() {
        long l2 = this.value;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            return l2;
        }
        l3 = l2 >>> 1;
        return (float)(l2 & 1L | l3) * 2.0f;
    }

    public int hashCode() {
        return Longs.hashCode(this.value);
    }

    public int intValue() {
        return (int)this.value;
    }

    public long longValue() {
        return this.value;
    }

    public UnsignedLong minus(UnsignedLong unsignedLong) {
        long l2 = this.value;
        long l3 = ((UnsignedLong)Preconditions.checkNotNull((Object)unsignedLong)).value;
        return UnsignedLong.fromLongBits(l2 - l3);
    }

    public UnsignedLong mod(UnsignedLong unsignedLong) {
        long l2 = this.value;
        long l3 = ((UnsignedLong)Preconditions.checkNotNull((Object)unsignedLong)).value;
        return UnsignedLong.fromLongBits(UnsignedLongs.remainder(l2, l3));
    }

    public UnsignedLong plus(UnsignedLong unsignedLong) {
        long l2 = this.value;
        long l3 = ((UnsignedLong)Preconditions.checkNotNull((Object)unsignedLong)).value;
        return UnsignedLong.fromLongBits(l2 + l3);
    }

    public UnsignedLong times(UnsignedLong unsignedLong) {
        long l2 = this.value;
        long l3 = ((UnsignedLong)Preconditions.checkNotNull((Object)unsignedLong)).value;
        return UnsignedLong.fromLongBits(l2 * l3);
    }

    public String toString() {
        return UnsignedLongs.toString(this.value);
    }

    public String toString(int n3) {
        return UnsignedLongs.toString(this.value, n3);
    }
}

