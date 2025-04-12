/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes;
import com.google.common.hash.LittleEndianByteArray$LittleEndianBytes;
import com.google.common.hash.LittleEndianByteArray$UnsafeByteArray;
import java.nio.ByteOrder;

final class LittleEndianByteArray {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final LittleEndianByteArray$LittleEndianBytes byteArray;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        void var0_3;
        block4: {
            LittleEndianByteArray$JavaLittleEndianBytes littleEndianByteArray$JavaLittleEndianBytes = LittleEndianByteArray$JavaLittleEndianBytes.INSTANCE;
            Object object = "os.arch";
            try {
                object = System.getProperty((String)object);
                Object object2 = "amd64";
                boolean bl2 = ((String)object2).equals(object);
                if (!bl2) break block4;
                object = ByteOrder.nativeOrder();
                bl2 = object.equals(object2 = ByteOrder.LITTLE_ENDIAN);
                if (bl2) {
                    LittleEndianByteArray$UnsafeByteArray littleEndianByteArray$UnsafeByteArray = LittleEndianByteArray$UnsafeByteArray.UNSAFE_LITTLE_ENDIAN;
                } else {
                    LittleEndianByteArray$UnsafeByteArray littleEndianByteArray$UnsafeByteArray = LittleEndianByteArray$UnsafeByteArray.UNSAFE_BIG_ENDIAN;
                }
            }
            catch (Throwable throwable) {}
        }
        byteArray = var0_3;
    }

    private LittleEndianByteArray() {
    }

    public static int load32(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = (byArray[n7] & 0xFF) << 8;
        n4 |= n7;
        n7 = n3 + 2;
        n7 = (byArray[n7] & 0xFF) << 16;
        return (byArray[n3 += 3] & 0xFF) << 24 | (n4 |= n7);
    }

    public static long load64(byte[] byArray, int n3) {
        return byteArray.getLongLittleEndian(byArray, n3);
    }

    public static long load64Safely(byte[] byArray, int n3, int n4) {
        int n7 = 8;
        n4 = Math.min(n4, n7);
        long l2 = 0L;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n8 = n3 + i3;
            n8 = byArray[n8];
            long l3 = n8;
            long l4 = 255L;
            l3 &= l4;
            int n10 = i3 * 8;
            l2 |= (l3 <<= n10);
        }
        return l2;
    }

    public static void store64(byte[] byArray, int n3, long l2) {
        byteArray.putLongLittleEndian(byArray, n3, l2);
    }

    public static boolean usingUnsafe() {
        return byteArray instanceof LittleEndianByteArray$UnsafeByteArray;
    }
}

