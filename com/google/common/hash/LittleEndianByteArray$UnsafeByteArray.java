/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.LittleEndianByteArray$1;
import com.google.common.hash.LittleEndianByteArray$LittleEndianBytes;
import com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$1;
import com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$2;
import com.google.common.hash.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

abstract class LittleEndianByteArray$UnsafeByteArray
extends Enum
implements LittleEndianByteArray$LittleEndianBytes {
    private static final /* synthetic */ LittleEndianByteArray$UnsafeByteArray[] $VALUES;
    private static final int BYTE_ARRAY_BASE_OFFSET;
    public static final /* enum */ LittleEndianByteArray$UnsafeByteArray UNSAFE_BIG_ENDIAN;
    public static final /* enum */ LittleEndianByteArray$UnsafeByteArray UNSAFE_LITTLE_ENDIAN;
    private static final Unsafe theUnsafe;

    private static /* synthetic */ LittleEndianByteArray$UnsafeByteArray[] $values() {
        LittleEndianByteArray$UnsafeByteArray littleEndianByteArray$UnsafeByteArray = UNSAFE_LITTLE_ENDIAN;
        littleEndianByteArray$UnsafeByteArray = UNSAFE_BIG_ENDIAN;
        LittleEndianByteArray$UnsafeByteArray[] littleEndianByteArray$UnsafeByteArrayArray = new LittleEndianByteArray$UnsafeByteArray[]{littleEndianByteArray$UnsafeByteArray, littleEndianByteArray$UnsafeByteArray};
        return littleEndianByteArray$UnsafeByteArrayArray;
    }

    static {
        int n3;
        Object object = new LittleEndianByteArray$UnsafeByteArray$1();
        UNSAFE_LITTLE_ENDIAN = object;
        int n4 = 1;
        object = new LittleEndianByteArray$UnsafeByteArray$2();
        UNSAFE_BIG_ENDIAN = object;
        $VALUES = LittleEndianByteArray$UnsafeByteArray.$values();
        theUnsafe = object = LittleEndianByteArray$UnsafeByteArray.getUnsafe();
        Class<byte[]> clazz = byte[].class;
        BYTE_ARRAY_BASE_OFFSET = n3 = ((Unsafe)object).arrayBaseOffset(clazz);
        int n7 = ((Unsafe)object).arrayIndexScale(clazz);
        if (n7 == n4) {
            return;
        }
        object = new AssertionError();
        throw object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LittleEndianByteArray$UnsafeByteArray() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ LittleEndianByteArray$UnsafeByteArray(LittleEndianByteArray$1 littleEndianByteArray$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static /* synthetic */ Unsafe a() {
        return LittleEndianByteArray$UnsafeByteArray.lambda$getUnsafe$0();
    }

    public static /* synthetic */ int access$100() {
        return BYTE_ARRAY_BASE_OFFSET;
    }

    public static /* synthetic */ Unsafe access$200() {
        return theUnsafe;
    }

    private static Unsafe getUnsafe() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            a a2;
            try {
                a2 = new a();
                a2 = AccessController.doPrivileged(a2);
            }
            catch (PrivilegedActionException privilegedActionException) {
                Throwable throwable = privilegedActionException.getCause();
                RuntimeException runtimeException = new RuntimeException("Could not initialize intrinsics", throwable);
                throw runtimeException;
            }
            return (Unsafe)((Object)a2);
        }
    }

    private static /* synthetic */ Unsafe lambda$getUnsafe$0() {
        Object object = Unsafe.class;
        for (Field field : ((Class)object).getDeclaredFields()) {
            ((AccessibleObject)field).setAccessible(true);
            Object object2 = field.get(null);
            boolean bl2 = ((Class)object).isInstance(object2);
            if (!bl2) continue;
            return (Unsafe)((Class)object).cast(object2);
        }
        object = new NoSuchFieldError("the Unsafe");
        throw object;
    }

    public static LittleEndianByteArray$UnsafeByteArray valueOf(String string2) {
        return Enum.valueOf(LittleEndianByteArray$UnsafeByteArray.class, string2);
    }

    public static LittleEndianByteArray$UnsafeByteArray[] values() {
        return (LittleEndianByteArray$UnsafeByteArray[])$VALUES.clone();
    }
}

