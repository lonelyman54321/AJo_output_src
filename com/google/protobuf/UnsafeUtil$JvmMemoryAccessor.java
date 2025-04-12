/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.UnsafeUtil$MemoryAccessor;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

final class UnsafeUtil$JvmMemoryAccessor
extends UnsafeUtil$MemoryAccessor {
    public UnsafeUtil$JvmMemoryAccessor(Unsafe unsafe) {
        super(unsafe);
    }

    public void copyMemory(long l2, byte[] byArray, long l3, long l4) {
        Unsafe unsafe = this.unsafe;
        long l7 = UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + l3;
        unsafe.copyMemory(null, l2, byArray, l7, l4);
    }

    public void copyMemory(byte[] byArray, long l2, long l3, long l4) {
        Unsafe unsafe = this.unsafe;
        long l7 = UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + l2;
        unsafe.copyMemory(byArray, l7, null, l3, l4);
    }

    public boolean getBoolean(Object object, long l2) {
        return this.unsafe.getBoolean(object, l2);
    }

    public byte getByte(long l2) {
        return this.unsafe.getByte(l2);
    }

    public byte getByte(Object object, long l2) {
        return this.unsafe.getByte(object, l2);
    }

    public double getDouble(Object object, long l2) {
        return this.unsafe.getDouble(object, l2);
    }

    public float getFloat(Object object, long l2) {
        return this.unsafe.getFloat(object, l2);
    }

    public int getInt(long l2) {
        return this.unsafe.getInt(l2);
    }

    public long getLong(long l2) {
        return this.unsafe.getLong(l2);
    }

    public Object getStaticObject(Field field) {
        Object object = this.unsafe.staticFieldBase(field);
        long l2 = this.unsafe.staticFieldOffset(field);
        return this.getObject(object, l2);
    }

    public void putBoolean(Object object, long l2, boolean bl2) {
        this.unsafe.putBoolean(object, l2, bl2);
    }

    public void putByte(long l2, byte by2) {
        this.unsafe.putByte(l2, by2);
    }

    public void putByte(Object object, long l2, byte by2) {
        this.unsafe.putByte(object, l2, by2);
    }

    public void putDouble(Object object, long l2, double d2) {
        this.unsafe.putDouble(object, l2, d2);
    }

    public void putFloat(Object object, long l2, float f5) {
        this.unsafe.putFloat(object, l2, f5);
    }

    public void putInt(long l2, int n3) {
        this.unsafe.putInt(l2, n3);
    }

    public void putLong(long l2, long l3) {
        this.unsafe.putLong(l2, l3);
    }

    public boolean supportsUnsafeArrayOperations() {
        Object object;
        int n3 = 3;
        int n4 = 2;
        boolean bl2 = true;
        Class<Object> clazz = Object.class;
        boolean bl3 = super.supportsUnsafeArrayOperations();
        if (!bl3) {
            return false;
        }
        try {
            object = this.unsafe;
        }
        catch (Throwable throwable) {
            UnsafeUtil.access$000(throwable);
            return false;
        }
        object = object.getClass();
        String string2 = "getByte";
        Class<Long> clazz2 = Long.TYPE;
        Class[] classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = clazz2;
        ((Class)object).getMethod(string2, classArray);
        string2 = "putByte";
        classArray = new Class[n3];
        classArray[0] = clazz;
        classArray[bl2] = clazz2;
        Class<Comparable<Byte>> clazz3 = Byte.TYPE;
        classArray[n4] = clazz3;
        ((Class)object).getMethod(string2, classArray);
        string2 = "getBoolean";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = clazz2;
        ((Class)object).getMethod(string2, classArray);
        string2 = "putBoolean";
        classArray = new Class[n3];
        classArray[0] = clazz;
        classArray[bl2] = clazz2;
        clazz3 = Boolean.TYPE;
        classArray[n4] = clazz3;
        ((Class)object).getMethod(string2, classArray);
        string2 = "getFloat";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = clazz2;
        ((Class)object).getMethod(string2, classArray);
        string2 = "putFloat";
        classArray = new Class[n3];
        classArray[0] = clazz;
        classArray[bl2] = clazz2;
        clazz3 = Float.TYPE;
        classArray[n4] = clazz3;
        ((Class)object).getMethod(string2, classArray);
        string2 = "getDouble";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = clazz2;
        ((Class)object).getMethod(string2, classArray);
        string2 = "putDouble";
        Class[] classArray2 = new Class[n3];
        classArray2[0] = clazz;
        classArray2[bl2] = clazz2;
        clazz = Double.TYPE;
        classArray2[n4] = clazz;
        ((Class)object).getMethod(string2, classArray2);
        return bl2;
    }

    public boolean supportsUnsafeByteBufferOperations() {
        Object object;
        int n3 = 3;
        int n4 = 2;
        boolean bl2 = true;
        String string2 = "copyMemory";
        boolean bl3 = super.supportsUnsafeByteBufferOperations();
        if (!bl3) {
            return false;
        }
        try {
            object = this.unsafe;
        }
        catch (Throwable throwable) {
            UnsafeUtil.access$000(throwable);
            return false;
        }
        object = object.getClass();
        Class[] classArray = "getByte";
        Class<Long> clazz = Long.TYPE;
        Object object2 = new Class[bl2];
        object2[0] = clazz;
        ((Class)object).getMethod((String)classArray, (Class<?>)object2);
        classArray = "putByte";
        object2 = new Class[n4];
        object2[0] = clazz;
        Class<Number> clazz2 = Byte.TYPE;
        object2[bl2] = clazz2;
        ((Class)object).getMethod((String)classArray, (Class<?>)object2);
        classArray = "getInt";
        object2 = new Class[bl2];
        object2[0] = clazz;
        ((Class)object).getMethod((String)classArray, (Class<?>)object2);
        classArray = "putInt";
        object2 = new Class[n4];
        object2[0] = clazz;
        clazz2 = Integer.TYPE;
        object2[bl2] = clazz2;
        ((Class)object).getMethod((String)classArray, (Class<?>)object2);
        classArray = "getLong";
        object2 = new Class[bl2];
        object2[0] = clazz;
        ((Class)object).getMethod((String)classArray, (Class<?>)object2);
        classArray = "putLong";
        object2 = new Class[n4];
        object2[0] = clazz;
        object2[bl2] = clazz;
        ((Class)object).getMethod((String)classArray, (Class<?>)object2);
        classArray = new Class[n3];
        classArray[0] = clazz;
        classArray[bl2] = clazz;
        classArray[n4] = clazz;
        ((Class)object).getMethod(string2, classArray);
        int n7 = 5;
        classArray = new Class[n7];
        object2 = Object.class;
        classArray[0] = object2;
        classArray[bl2] = clazz;
        classArray[n4] = object2;
        classArray[n3] = clazz;
        n3 = 4;
        classArray[n3] = clazz;
        ((Class)object).getMethod(string2, classArray);
        return bl2;
    }
}

