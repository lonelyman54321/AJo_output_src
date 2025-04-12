/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.UnsafeUtil$MemoryAccessor;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

final class UnsafeUtil$Android32MemoryAccessor
extends UnsafeUtil$MemoryAccessor {
    private static final long SMALL_ADDRESS_MASK = 255L;

    public UnsafeUtil$Android32MemoryAccessor(Unsafe unsafe) {
        super(unsafe);
    }

    private static int smallAddress(long l2) {
        return (int)l2;
    }

    public void copyMemory(long l2, byte[] byArray, long l3, long l4) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public void copyMemory(byte[] object, long l2, long l3, long l4) {
        object = new UnsupportedOperationException;
        object();
        throw object;
    }

    public boolean getBoolean(Object object, long l2) {
        boolean bl2 = UnsafeUtil.IS_BIG_ENDIAN;
        if (bl2) {
            return UnsafeUtil.access$600(object, l2);
        }
        return UnsafeUtil.access$700(object, l2);
    }

    public byte getByte(long l2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public byte getByte(Object object, long l2) {
        boolean bl2 = UnsafeUtil.IS_BIG_ENDIAN;
        if (bl2) {
            return UnsafeUtil.access$200(object, l2);
        }
        return UnsafeUtil.access$300(object, l2);
    }

    public double getDouble(Object object, long l2) {
        return Double.longBitsToDouble(this.getLong(object, l2));
    }

    public float getFloat(Object object, long l2) {
        return Float.intBitsToFloat(this.getInt(object, l2));
    }

    public int getInt(long l2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public long getLong(long l2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public Object getStaticObject(Field field) {
        try {
            return field.get(null);
        }
        catch (IllegalAccessException illegalAccessException) {
            return null;
        }
    }

    public void putBoolean(Object object, long l2, boolean bl2) {
        boolean bl3 = UnsafeUtil.IS_BIG_ENDIAN;
        if (bl3) {
            UnsafeUtil.access$800(object, l2, bl2);
        } else {
            UnsafeUtil.access$900(object, l2, bl2);
        }
    }

    public void putByte(long l2, byte by2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public void putByte(Object object, long l2, byte by2) {
        boolean bl2 = UnsafeUtil.IS_BIG_ENDIAN;
        if (bl2) {
            UnsafeUtil.access$400(object, l2, by2);
        } else {
            UnsafeUtil.access$500(object, l2, by2);
        }
    }

    public void putDouble(Object object, long l2, double d2) {
        long l3 = Double.doubleToLongBits(d2);
        this.putLong(object, l2, l3);
    }

    public void putFloat(Object object, long l2, float f5) {
        int n3 = Float.floatToIntBits(f5);
        this.putInt(object, l2, n3);
    }

    public void putInt(long l2, int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public void putLong(long l2, long l3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public boolean supportsUnsafeByteBufferOperations() {
        return false;
    }
}

