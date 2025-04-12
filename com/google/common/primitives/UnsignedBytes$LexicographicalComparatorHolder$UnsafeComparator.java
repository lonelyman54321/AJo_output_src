/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.primitives;

import com.google.common.primitives.UnsignedBytes;
import com.google.common.primitives.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1;
import com.google.common.primitives.UnsignedLongs;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Comparator;
import sun.misc.Unsafe;

final class UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator
extends Enum
implements Comparator {
    private static final /* synthetic */ UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[] $VALUES;
    static final boolean BIG_ENDIAN;
    static final int BYTE_ARRAY_BASE_OFFSET;
    public static final /* enum */ UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator INSTANCE;
    static final Unsafe theUnsafe;

    private static /* synthetic */ UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[] $values() {
        UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator unsignedBytes$LexicographicalComparatorHolder$UnsafeComparator = INSTANCE;
        UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[] unsignedBytes$LexicographicalComparatorHolder$UnsafeComparatorArray = new UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[]{unsignedBytes$LexicographicalComparatorHolder$UnsafeComparator};
        return unsignedBytes$LexicographicalComparatorHolder$UnsafeComparatorArray;
    }

    static {
        int n3;
        int n4;
        int n7;
        Object object = new UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator("INSTANCE", 0);
        INSTANCE = object;
        $VALUES = UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator.$values();
        object = ByteOrder.nativeOrder();
        Object object2 = ByteOrder.BIG_ENDIAN;
        BIG_ENDIAN = n7 = object.equals(object2);
        theUnsafe = object = UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator.getUnsafe();
        object2 = byte[].class;
        BYTE_ARRAY_BASE_OFFSET = n4 = ((Unsafe)object).arrayBaseOffset((Class<?>)object2);
        String string2 = "64";
        String string3 = System.getProperty("sun.arch.data.model");
        boolean bl2 = string2.equals(string3);
        if (bl2 && (n4 %= 8) == 0 && (n7 = ((Unsafe)object).arrayIndexScale((Class<?>)object2)) == (n3 = 1)) {
            return;
        }
        object = new Error();
        throw object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator() {
        void var2_-1;
        void var1_-1;
    }

    private static Unsafe getUnsafe() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1 unsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1;
            try {
                unsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1 = new UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1();
                unsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1 = AccessController.doPrivileged(unsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1);
            }
            catch (PrivilegedActionException privilegedActionException) {
                Throwable throwable = privilegedActionException.getCause();
                RuntimeException runtimeException = new RuntimeException("Could not initialize intrinsics", throwable);
                throw runtimeException;
            }
            return (Unsafe)((Object)unsignedBytes$LexicographicalComparatorHolder$UnsafeComparator$1);
        }
    }

    public static UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator valueOf(String string2) {
        return Enum.valueOf(UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator.class, string2);
    }

    public static UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[] values() {
        return (UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[])$VALUES.clone();
    }

    public int compare(byte[] byArray, byte[] byArray2) {
        int n3;
        int n4 = byArray.length;
        int n7 = byArray2.length;
        n4 = Math.min(n4, n7);
        n7 = n4 & 0xFFFFFFF8;
        for (n3 = 0; n3 < n7; n3 += 8) {
            long l2;
            long l3;
            Unsafe unsafe = theUnsafe;
            int n8 = BYTE_ARRAY_BASE_OFFSET;
            long l4 = n8;
            long l7 = n3;
            l4 += l7;
            long l8 = (l4 = unsafe.getLong(byArray, l4)) - (l3 = unsafe.getLong(byArray2, l2 = (long)n8 + l7));
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object == false) continue;
            int n10 = BIG_ENDIAN;
            if (n10 != 0) {
                return UnsignedLongs.compare(l4, l3);
            }
            n10 = Long.numberOfTrailingZeros(l4 ^ l3) & 0xFFFFFFF8;
            long l12 = l4 >>> n10;
            l4 = 255L;
            int n14 = (int)(l12 & l4);
            n10 = (int)(l3 >>> n10 & l4);
            return n14 - n10;
        }
        while (n3 < n4) {
            n7 = byArray[n3];
            byte by2 = byArray2[n3];
            if ((n7 = UnsignedBytes.compare((byte)n7, by2)) != 0) {
                return n7;
            }
            ++n3;
        }
        int n15 = byArray.length;
        int n16 = byArray2.length;
        return n15 - n16;
    }

    public String toString() {
        return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
    }
}

