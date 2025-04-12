/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode$BytesHashCode;
import com.google.common.hash.HashCode$IntHashCode;
import com.google.common.hash.HashCode$LongHashCode;
import com.google.common.primitives.Ints;

public abstract class HashCode {
    private static final char[] hexDigits = "0123456789abcdef".toCharArray();

    private static int decode(char n3) {
        int n4;
        int n7 = 48;
        if (n3 >= n7 && n3 <= (n4 = 57)) {
            return n3 - n7;
        }
        n7 = 97;
        if (n3 >= n7 && n3 <= (n7 = 102)) {
            return n3 + -87;
        }
        StringBuilder stringBuilder = new StringBuilder("Illegal hexadecimal character: ");
        stringBuilder.append((char)n3);
        String string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static HashCode fromBytes(byte[] byArray) {
        boolean bl2 = byArray.length;
        boolean bl3 = true;
        if (bl2 < bl3) {
            bl3 = false;
        }
        Preconditions.checkArgument(bl3, "A HashCode must contain at least 1 byte.");
        return HashCode.fromBytesNoCopy((byte[])byArray.clone());
    }

    public static HashCode fromBytesNoCopy(byte[] byArray) {
        HashCode$BytesHashCode hashCode$BytesHashCode = new HashCode$BytesHashCode(byArray);
        return hashCode$BytesHashCode;
    }

    public static HashCode fromInt(int n3) {
        HashCode$IntHashCode hashCode$IntHashCode = new HashCode$IntHashCode(n3);
        return hashCode$IntHashCode;
    }

    public static HashCode fromLong(long l2) {
        HashCode$LongHashCode hashCode$LongHashCode = new HashCode$LongHashCode(l2);
        return hashCode$LongHashCode;
    }

    public static HashCode fromString(String string2) {
        byte[] byArray;
        int n3 = string2.length();
        int n4 = 0;
        int n7 = 1;
        int n8 = 2;
        if (n3 >= n8) {
            n3 = 1;
        } else {
            n3 = 0;
            byArray = null;
        }
        String string3 = "input string (%s) must have at least 2 characters";
        Preconditions.checkArgument(n3 != 0, string3, (Object)string2);
        n3 = string2.length() % n8;
        if (n3 != 0) {
            n7 = 0;
        }
        Preconditions.checkArgument(n7 != 0, "input string (%s) must have an even number of characters", (Object)string2);
        n3 = string2.length() / n8;
        byArray = new byte[n3];
        while (n4 < (n7 = string2.length())) {
            n7 = HashCode.decode(string2.charAt(n4)) << 4;
            n8 = n4 + 1;
            n8 = HashCode.decode(string2.charAt(n8));
            int n10 = n4 / 2;
            byArray[n10] = n7 = (int)((byte)(n7 + n8));
            n4 += 2;
        }
        return HashCode.fromBytesNoCopy(byArray);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    public final boolean equals(Object object) {
        int n3 = object instanceof HashCode;
        boolean bl2 = false;
        if (n3 != 0) {
            boolean bl3;
            int n4;
            object = (HashCode)object;
            n3 = this.bits();
            if (n3 == (n4 = ((HashCode)object).bits()) && (bl3 = this.equalsSameBits((HashCode)object))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public abstract boolean equalsSameBits(HashCode var1);

    public byte[] getBytesInternal() {
        return this.asBytes();
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = this.bits();
        if (n7 >= (n4 = 32)) {
            return this.asInt();
        }
        byte[] byArray = this.getBytesInternal();
        n4 = byArray[0] & 0xFF;
        for (int i3 = 1; i3 < (n3 = byArray.length); ++i3) {
            n3 = byArray[i3] & 0xFF;
            int n8 = i3 * 8;
            n4 |= (n3 <<= n8);
        }
        return n4;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] byArray = this.getBytesInternal();
        int n3 = byArray.length * 2;
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (char c2 : byArray) {
            char[] cArray = hexDigits;
            char c3 = c2 >> 4 & 0xF;
            c3 = cArray[c3];
            stringBuilder.append(c3);
            c2 &= 0xF;
            c2 = cArray[c2];
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public int writeBytesTo(byte[] byArray, int n3, int n4) {
        int n7 = this.bits() / 8;
        n4 = Ints.min(n4, n7);
        n7 = n3 + n4;
        int n8 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, n8);
        this.writeBytesToImpl(byArray, n3, n4);
        return n4;
    }

    public abstract void writeBytesToImpl(byte[] var1, int var2, int var3);
}

