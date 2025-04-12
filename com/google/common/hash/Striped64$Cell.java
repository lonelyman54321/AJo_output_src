/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.Striped64;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

final class Striped64$Cell {
    private static final Unsafe UNSAFE;
    private static final long valueOffset;
    volatile long p0;
    volatile long p1;
    volatile long p2;
    volatile long p3;
    volatile long p4;
    volatile long p5;
    volatile long p6;
    volatile long q0;
    volatile long q1;
    volatile long q2;
    volatile long q3;
    volatile long q4;
    volatile long q5;
    volatile long q6;
    volatile long value;

    static {
        Object object;
        Unsafe unsafe;
        try {
            unsafe = Striped64.access$000();
        }
        catch (Exception exception) {
            object = new Error(exception);
            throw object;
        }
        UNSAFE = unsafe;
        object = Striped64$Cell.class;
        String string2 = "value";
        object = ((Class)object).getDeclaredField(string2);
        long l2 = unsafe.objectFieldOffset((Field)object);
        valueOffset = l2;
    }

    public Striped64$Cell(long l2) {
        this.value = l2;
    }

    public final boolean cas(long l2, long l3) {
        Unsafe unsafe = UNSAFE;
        long l4 = valueOffset;
        return unsafe.compareAndSwapLong(this, l4, l2, l3);
    }
}

