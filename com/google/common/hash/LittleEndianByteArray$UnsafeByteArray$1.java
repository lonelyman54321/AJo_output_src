/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.LittleEndianByteArray$UnsafeByteArray;
import sun.misc.Unsafe;

final class LittleEndianByteArray$UnsafeByteArray$1
extends LittleEndianByteArray$UnsafeByteArray {
    public long getLongLittleEndian(byte[] byArray, int n3) {
        Unsafe unsafe = LittleEndianByteArray$UnsafeByteArray.access$200();
        long l2 = n3;
        long l3 = LittleEndianByteArray$UnsafeByteArray.access$100();
        return unsafe.getLong(byArray, l2 += l3);
    }

    public void putLongLittleEndian(byte[] byArray, int n3, long l2) {
        Unsafe unsafe = LittleEndianByteArray$UnsafeByteArray.access$200();
        long l3 = n3;
        long l4 = LittleEndianByteArray$UnsafeByteArray.access$100();
        long l7 = l3 + l4;
        unsafe.putLong(byArray, l7, l2);
    }
}

