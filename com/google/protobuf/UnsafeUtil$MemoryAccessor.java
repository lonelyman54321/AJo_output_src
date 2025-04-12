/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.UnsafeUtil;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class UnsafeUtil$MemoryAccessor {
    Unsafe unsafe;

    public UnsafeUtil$MemoryAccessor(Unsafe unsafe) {
        this.unsafe = unsafe;
    }

    public final int arrayBaseOffset(Class clazz) {
        return this.unsafe.arrayBaseOffset(clazz);
    }

    public final int arrayIndexScale(Class clazz) {
        return this.unsafe.arrayIndexScale(clazz);
    }

    public abstract void copyMemory(long var1, byte[] var3, long var4, long var6);

    public abstract void copyMemory(byte[] var1, long var2, long var4, long var6);

    public abstract boolean getBoolean(Object var1, long var2);

    public abstract byte getByte(long var1);

    public abstract byte getByte(Object var1, long var2);

    public abstract double getDouble(Object var1, long var2);

    public abstract float getFloat(Object var1, long var2);

    public abstract int getInt(long var1);

    public final int getInt(Object object, long l2) {
        return this.unsafe.getInt(object, l2);
    }

    public abstract long getLong(long var1);

    public final long getLong(Object object, long l2) {
        return this.unsafe.getLong(object, l2);
    }

    public final Object getObject(Object object, long l2) {
        return this.unsafe.getObject(object, l2);
    }

    public abstract Object getStaticObject(Field var1);

    public final long objectFieldOffset(Field field) {
        return this.unsafe.objectFieldOffset(field);
    }

    public abstract void putBoolean(Object var1, long var2, boolean var4);

    public abstract void putByte(long var1, byte var3);

    public abstract void putByte(Object var1, long var2, byte var4);

    public abstract void putDouble(Object var1, long var2, double var4);

    public abstract void putFloat(Object var1, long var2, float var4);

    public abstract void putInt(long var1, int var3);

    public final void putInt(Object object, long l2, int n3) {
        this.unsafe.putInt(object, l2, n3);
    }

    public abstract void putLong(long var1, long var3);

    public final void putLong(Object object, long l2, long l3) {
        this.unsafe.putLong(object, l2, l3);
    }

    public final void putObject(Object object, long l2, Object object2) {
        this.unsafe.putObject(object, l2, object2);
    }

    public boolean supportsUnsafeArrayOperations() {
        Object object;
        int n3 = 3;
        int n4 = 2;
        boolean bl2 = true;
        Object object2 = Class.class;
        Class<Object> clazz = Object.class;
        Object object3 = this.unsafe;
        if (object3 == null) {
            return false;
        }
        try {
            object3 = object3.getClass();
            object = "objectFieldOffset";
        }
        catch (Throwable throwable) {
            UnsafeUtil.access$000(throwable);
            return false;
        }
        Class[] classArray = new Class[bl2];
        Class clazz2 = Field.class;
        classArray[0] = clazz2;
        ((Class)object3).getMethod((String)object, classArray);
        object = "arrayBaseOffset";
        classArray = new Class[bl2];
        classArray[0] = object2;
        ((Class)object3).getMethod((String)object, classArray);
        object = "arrayIndexScale";
        classArray = new Class[bl2];
        classArray[0] = object2;
        ((Class)object3).getMethod((String)object, classArray);
        object2 = "getInt";
        object = Long.TYPE;
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putInt";
        classArray = new Class[n3];
        classArray[0] = clazz;
        classArray[bl2] = object;
        clazz2 = Integer.TYPE;
        classArray[n4] = clazz2;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "getLong";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putLong";
        classArray = new Class[n3];
        classArray[0] = clazz;
        classArray[bl2] = object;
        classArray[n4] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "getObject";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putObject";
        Class[] classArray2 = new Class[n3];
        classArray2[0] = clazz;
        classArray2[bl2] = object;
        classArray2[n4] = clazz;
        ((Class)object3).getMethod((String)object2, classArray2);
        return bl2;
    }

    public boolean supportsUnsafeByteBufferOperations() {
        String string2;
        boolean bl2 = true;
        Object object = this.unsafe;
        if (object == null) {
            return false;
        }
        try {
            object = object.getClass();
            string2 = "objectFieldOffset";
        }
        catch (Throwable throwable) {
            UnsafeUtil.access$000(throwable);
            return false;
        }
        Class[] classArray = new Class[bl2];
        Class clazz = Field.class;
        classArray[0] = clazz;
        ((Class)object).getMethod(string2, classArray);
        string2 = "getLong";
        int n3 = 2;
        classArray = new Class[n3];
        clazz = Object.class;
        classArray[0] = clazz;
        clazz = Long.TYPE;
        classArray[bl2] = clazz;
        ((Class)object).getMethod(string2, classArray);
        object = UnsafeUtil.access$100();
        if (object == null) {
            return false;
        }
        return bl2;
    }
}

