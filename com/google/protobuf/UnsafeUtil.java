/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Android;
import com.google.protobuf.UnsafeUtil$1;
import com.google.protobuf.UnsafeUtil$Android32MemoryAccessor;
import com.google.protobuf.UnsafeUtil$Android64MemoryAccessor;
import com.google.protobuf.UnsafeUtil$JvmMemoryAccessor;
import com.google.protobuf.UnsafeUtil$MemoryAccessor;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET = 0L;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE = 0L;
    private static final long BUFFER_ADDRESS_OFFSET = 0L;
    private static final int BYTE_ARRAY_ALIGNMENT = 0;
    static final long BYTE_ARRAY_BASE_OFFSET = 0L;
    private static final long DOUBLE_ARRAY_BASE_OFFSET = 0L;
    private static final long DOUBLE_ARRAY_INDEX_SCALE = 0L;
    private static final long FLOAT_ARRAY_BASE_OFFSET = 0L;
    private static final long FLOAT_ARRAY_INDEX_SCALE = 0L;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = false;
    private static final long INT_ARRAY_BASE_OFFSET = 0L;
    private static final long INT_ARRAY_INDEX_SCALE = 0L;
    private static final boolean IS_ANDROID_32 = false;
    private static final boolean IS_ANDROID_64 = false;
    static final boolean IS_BIG_ENDIAN = false;
    private static final long LONG_ARRAY_BASE_OFFSET = 0L;
    private static final long LONG_ARRAY_INDEX_SCALE = 0L;
    private static final UnsafeUtil$MemoryAccessor MEMORY_ACCESSOR;
    private static final Class MEMORY_CLASS;
    private static final long OBJECT_ARRAY_BASE_OFFSET = 0L;
    private static final long OBJECT_ARRAY_INDEX_SCALE = 0L;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE;

    static {
        ByteOrder byteOrder;
        int n3;
        long l2;
        long l3;
        UNSAFE = UnsafeUtil.getUnsafe();
        MEMORY_CLASS = Android.getMemoryClass();
        IS_ANDROID_64 = UnsafeUtil.determineAndroidSupportByAddressSize(Long.TYPE);
        IS_ANDROID_32 = UnsafeUtil.determineAndroidSupportByAddressSize(Integer.TYPE);
        MEMORY_ACCESSOR = UnsafeUtil.getMemoryAccessor();
        HAS_UNSAFE_BYTEBUFFER_OPERATIONS = UnsafeUtil.supportsUnsafeByteBufferOperations();
        HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.supportsUnsafeArrayOperations();
        int n4 = UnsafeUtil.arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = l3 = (long)n4;
        Object object = boolean[].class;
        BOOLEAN_ARRAY_BASE_OFFSET = UnsafeUtil.arrayBaseOffset(object);
        BOOLEAN_ARRAY_INDEX_SCALE = UnsafeUtil.arrayIndexScale(object);
        object = int[].class;
        INT_ARRAY_BASE_OFFSET = UnsafeUtil.arrayBaseOffset(object);
        INT_ARRAY_INDEX_SCALE = UnsafeUtil.arrayIndexScale(object);
        object = long[].class;
        LONG_ARRAY_BASE_OFFSET = UnsafeUtil.arrayBaseOffset(object);
        LONG_ARRAY_INDEX_SCALE = UnsafeUtil.arrayIndexScale(object);
        object = float[].class;
        FLOAT_ARRAY_BASE_OFFSET = UnsafeUtil.arrayBaseOffset(object);
        FLOAT_ARRAY_INDEX_SCALE = UnsafeUtil.arrayIndexScale(object);
        object = double[].class;
        DOUBLE_ARRAY_BASE_OFFSET = UnsafeUtil.arrayBaseOffset(object);
        DOUBLE_ARRAY_INDEX_SCALE = UnsafeUtil.arrayIndexScale(object);
        object = Object[].class;
        int n7 = UnsafeUtil.arrayBaseOffset(object);
        OBJECT_ARRAY_BASE_OFFSET = l2 = (long)n7;
        int n8 = UnsafeUtil.arrayIndexScale(object);
        OBJECT_ARRAY_INDEX_SCALE = n8;
        object = UnsafeUtil.bufferAddressField();
        BUFFER_ADDRESS_OFFSET = UnsafeUtil.fieldOffset((Field)object);
        long l4 = 7;
        BYTE_ARRAY_ALIGNMENT = n3 = (int)(l3 &= l4);
        ByteOrder byteOrder2 = ByteOrder.nativeOrder();
        if (byteOrder2 == (byteOrder = ByteOrder.BIG_ENDIAN)) {
            n4 = 1;
        } else {
            n4 = 0;
            byteOrder2 = null;
        }
        IS_BIG_ENDIAN = n4;
    }

    private UnsafeUtil() {
    }

    public static /* synthetic */ void access$000(Throwable throwable) {
        UnsafeUtil.logMissingMethod(throwable);
    }

    public static /* synthetic */ Field access$100() {
        return UnsafeUtil.bufferAddressField();
    }

    public static /* synthetic */ byte access$200(Object object, long l2) {
        return UnsafeUtil.getByteBigEndian(object, l2);
    }

    public static /* synthetic */ byte access$300(Object object, long l2) {
        return UnsafeUtil.getByteLittleEndian(object, l2);
    }

    public static /* synthetic */ void access$400(Object object, long l2, byte by2) {
        UnsafeUtil.putByteBigEndian(object, l2, by2);
    }

    public static /* synthetic */ void access$500(Object object, long l2, byte by2) {
        UnsafeUtil.putByteLittleEndian(object, l2, by2);
    }

    public static /* synthetic */ boolean access$600(Object object, long l2) {
        return UnsafeUtil.getBooleanBigEndian(object, l2);
    }

    public static /* synthetic */ boolean access$700(Object object, long l2) {
        return UnsafeUtil.getBooleanLittleEndian(object, l2);
    }

    public static /* synthetic */ void access$800(Object object, long l2, boolean bl2) {
        UnsafeUtil.putBooleanBigEndian(object, l2, bl2);
    }

    public static /* synthetic */ void access$900(Object object, long l2, boolean bl2) {
        UnsafeUtil.putBooleanLittleEndian(object, l2, bl2);
    }

    public static long addressOffset(ByteBuffer byteBuffer) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l2 = BUFFER_ADDRESS_OFFSET;
        return unsafeUtil$MemoryAccessor.getLong(byteBuffer, l2);
    }

    public static Object allocateInstance(Class clazz) {
        Object object;
        try {
            object = UNSAFE;
        }
        catch (InstantiationException instantiationException) {
            object = new IllegalStateException(instantiationException);
            throw object;
        }
        return ((Unsafe)object).allocateInstance(clazz);
    }

    private static int arrayBaseOffset(Class clazz) {
        int n3;
        boolean bl2 = HAS_UNSAFE_ARRAY_OPERATIONS;
        if (bl2) {
            UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
            n3 = unsafeUtil$MemoryAccessor.arrayBaseOffset(clazz);
        } else {
            n3 = -1;
        }
        return n3;
    }

    private static int arrayIndexScale(Class clazz) {
        int n3;
        boolean bl2 = HAS_UNSAFE_ARRAY_OPERATIONS;
        if (bl2) {
            UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
            n3 = unsafeUtil$MemoryAccessor.arrayIndexScale(clazz);
        } else {
            n3 = -1;
        }
        return n3;
    }

    private static Field bufferAddressField() {
        Class<Long> clazz;
        Field field;
        boolean bl2 = Android.isOnAndroidDevice();
        Class clazz2 = Buffer.class;
        if (bl2 && (field = UnsafeUtil.field(clazz2, "effectiveDirectAddress")) != null) {
            return field;
        }
        field = UnsafeUtil.field(clazz2, "address");
        if (field == null || (clazz2 = field.getType()) != (clazz = Long.TYPE)) {
            bl2 = false;
            field = null;
        }
        return field;
    }

    public static void copyMemory(long l2, byte[] byArray, long l3, long l4) {
        MEMORY_ACCESSOR.copyMemory(l2, byArray, l3, l4);
    }

    public static void copyMemory(byte[] byArray, long l2, long l3, long l4) {
        MEMORY_ACCESSOR.copyMemory(byArray, l2, l3, l4);
    }

    public static void copyMemory(byte[] byArray, long l2, byte[] byArray2, long l3, long l4) {
        int n3 = (int)l2;
        int n4 = (int)l3;
        int n7 = (int)l4;
        System.arraycopy(byArray, n3, byArray2, n4, n7);
    }

    public static boolean determineAndroidSupportByAddressSize(Class clazz) {
        String string2;
        Class clazz2;
        int n3 = 4;
        int n4 = 3;
        int n7 = 2;
        boolean bl2 = true;
        Class<byte[]> clazz3 = byte[].class;
        boolean bl3 = Android.isOnAndroidDevice();
        if (!bl3) {
            return false;
        }
        try {
            clazz2 = MEMORY_CLASS;
            string2 = "peekLong";
        }
        catch (Throwable throwable) {
            return false;
        }
        Class[] classArray = Boolean.TYPE;
        Object object = new Class[n7];
        object[0] = clazz;
        object[bl2] = classArray;
        clazz2.getMethod(string2, (Class<?>)object);
        string2 = "pokeLong";
        object = new Class[n4];
        object[0] = clazz;
        Object object2 = Long.TYPE;
        object[bl2] = object2;
        object[n7] = classArray;
        clazz2.getMethod(string2, (Class<?>)object);
        string2 = "pokeInt";
        object = Integer.TYPE;
        object2 = new Class[n4];
        object2[0] = clazz;
        object2[bl2] = object;
        object2[n7] = classArray;
        clazz2.getMethod(string2, (Class<?>)object2);
        string2 = "peekInt";
        object2 = new Class[n7];
        object2[0] = clazz;
        object2[bl2] = classArray;
        clazz2.getMethod(string2, (Class<?>)object2);
        string2 = "pokeByte";
        classArray = new Class[n7];
        classArray[0] = clazz;
        object2 = Byte.TYPE;
        classArray[bl2] = object2;
        clazz2.getMethod(string2, classArray);
        string2 = "peekByte";
        classArray = new Class[bl2];
        classArray[0] = clazz;
        clazz2.getMethod(string2, classArray);
        string2 = "pokeByteArray";
        classArray = new Class[n3];
        classArray[0] = clazz;
        classArray[bl2] = clazz3;
        classArray[n7] = object;
        classArray[n4] = object;
        clazz2.getMethod(string2, classArray);
        string2 = "peekByteArray";
        Class[] classArray2 = new Class[n3];
        classArray2[0] = clazz;
        classArray2[bl2] = clazz3;
        classArray2[n7] = object;
        classArray2[n4] = object;
        clazz2.getMethod(string2, classArray2);
        return bl2;
    }

    private static Field field(Class annotatedElement, String string2) {
        try {
            annotatedElement = annotatedElement.getDeclaredField(string2);
        }
        catch (Throwable throwable) {
            annotatedElement = null;
        }
        return annotatedElement;
    }

    private static long fieldOffset(Field field) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor;
        long l2 = field != null && (unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR) != null ? unsafeUtil$MemoryAccessor.objectFieldOffset(field) : (long)-1;
        return l2;
    }

    private static int firstDifferingByteIndexNativeEndian(long l2, long l3) {
        boolean bl2 = IS_BIG_ENDIAN;
        int n3 = bl2 ? Long.numberOfLeadingZeros(l2 ^= l3) : Long.numberOfTrailingZeros(l2 ^= l3);
        return n3 >> 3;
    }

    public static boolean getBoolean(Object object, long l2) {
        return MEMORY_ACCESSOR.getBoolean(object, l2);
    }

    public static boolean getBoolean(boolean[] blArray, long l2) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = BOOLEAN_ARRAY_BASE_OFFSET;
        long l4 = BOOLEAN_ARRAY_INDEX_SCALE;
        l2 = l2 * l4 + l3;
        return unsafeUtil$MemoryAccessor.getBoolean(blArray, l2);
    }

    private static boolean getBooleanBigEndian(Object object, long l2) {
        byte by2 = UnsafeUtil.getByteBigEndian(object, l2);
        if (by2) {
            by2 = 1;
        } else {
            by2 = 0;
            object = null;
        }
        return by2 != 0;
    }

    private static boolean getBooleanLittleEndian(Object object, long l2) {
        byte by2 = UnsafeUtil.getByteLittleEndian(object, l2);
        if (by2) {
            by2 = 1;
        } else {
            by2 = 0;
            object = null;
        }
        return by2 != 0;
    }

    public static byte getByte(long l2) {
        return MEMORY_ACCESSOR.getByte(l2);
    }

    public static byte getByte(Object object, long l2) {
        return MEMORY_ACCESSOR.getByte(object, l2);
    }

    public static byte getByte(byte[] byArray, long l2) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = BYTE_ARRAY_BASE_OFFSET + l2;
        return unsafeUtil$MemoryAccessor.getByte(byArray, l3);
    }

    private static byte getByteBigEndian(Object object, long l2) {
        long l3 = (long)-4 & l2;
        int n3 = UnsafeUtil.getInt(object, l3);
        int n4 = (int)(((l2 ^ (long)-1) & (long)3) << 3);
        return (byte)(n3 >>> n4 & 0xFF);
    }

    private static byte getByteLittleEndian(Object object, long l2) {
        long l3 = (long)-4 & l2;
        int n3 = UnsafeUtil.getInt(object, l3);
        int n4 = (int)((l2 & (long)3) << 3);
        return (byte)(n3 >>> n4 & 0xFF);
    }

    public static double getDouble(Object object, long l2) {
        return MEMORY_ACCESSOR.getDouble(object, l2);
    }

    public static double getDouble(double[] dArray, long l2) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = DOUBLE_ARRAY_BASE_OFFSET;
        long l4 = DOUBLE_ARRAY_INDEX_SCALE;
        l2 = l2 * l4 + l3;
        return unsafeUtil$MemoryAccessor.getDouble(dArray, l2);
    }

    public static float getFloat(Object object, long l2) {
        return MEMORY_ACCESSOR.getFloat(object, l2);
    }

    public static float getFloat(float[] fArray, long l2) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = FLOAT_ARRAY_BASE_OFFSET;
        long l4 = FLOAT_ARRAY_INDEX_SCALE;
        l2 = l2 * l4 + l3;
        return unsafeUtil$MemoryAccessor.getFloat(fArray, l2);
    }

    public static int getInt(long l2) {
        return MEMORY_ACCESSOR.getInt(l2);
    }

    public static int getInt(Object object, long l2) {
        return MEMORY_ACCESSOR.getInt(object, l2);
    }

    public static int getInt(int[] nArray, long l2) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = INT_ARRAY_BASE_OFFSET;
        long l4 = INT_ARRAY_INDEX_SCALE;
        l2 = l2 * l4 + l3;
        return unsafeUtil$MemoryAccessor.getInt(nArray, l2);
    }

    public static long getLong(long l2) {
        return MEMORY_ACCESSOR.getLong(l2);
    }

    public static long getLong(Object object, long l2) {
        return MEMORY_ACCESSOR.getLong(object, l2);
    }

    public static long getLong(long[] lArray, long l2) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = LONG_ARRAY_BASE_OFFSET;
        long l4 = LONG_ARRAY_INDEX_SCALE;
        l2 = l2 * l4 + l3;
        return unsafeUtil$MemoryAccessor.getLong(lArray, l2);
    }

    private static UnsafeUtil$MemoryAccessor getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = null;
        if (unsafe == null) {
            return null;
        }
        boolean bl2 = Android.isOnAndroidDevice();
        if (bl2) {
            bl2 = IS_ANDROID_64;
            if (bl2) {
                unsafeUtil$MemoryAccessor = new UnsafeUtil$Android64MemoryAccessor(unsafe);
                return unsafeUtil$MemoryAccessor;
            }
            bl2 = IS_ANDROID_32;
            if (bl2) {
                unsafeUtil$MemoryAccessor = new UnsafeUtil$Android32MemoryAccessor(unsafe);
            }
            return unsafeUtil$MemoryAccessor;
        }
        unsafeUtil$MemoryAccessor = new UnsafeUtil$JvmMemoryAccessor(unsafe);
        return unsafeUtil$MemoryAccessor;
    }

    public static Object getObject(Object object, long l2) {
        return MEMORY_ACCESSOR.getObject(object, l2);
    }

    public static Object getObject(Object[] objectArray, long l2) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = OBJECT_ARRAY_BASE_OFFSET;
        long l4 = OBJECT_ARRAY_INDEX_SCALE;
        l2 = l2 * l4 + l3;
        return unsafeUtil$MemoryAccessor.getObject(objectArray, l2);
    }

    public static Object getStaticObject(Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    public static Unsafe getUnsafe() {
        Object object = new UnsafeUtil$1();
        object = AccessController.doPrivileged(object);
        try {
            object = (Unsafe)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    public static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    public static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    public static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    private static void logMissingMethod(Throwable object) {
        Logger logger = Logger.getLogger(UnsafeUtil.class.getName());
        Level level = Level.WARNING;
        StringBuilder stringBuilder = new StringBuilder("platform method missing - proto runtime falling back to safer methods: ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        logger.log(level, (String)object);
    }

    public static int mismatch(byte[] object, int n3, byte[] byArray, int n4, int n7) {
        int n8;
        int n10;
        if (n3 >= 0 && n4 >= 0 && n7 >= 0 && (n10 = n3 + n7) <= (n8 = ((byte[])object).length) && (n10 = n4 + n7) <= (n8 = byArray.length)) {
            int n14;
            n10 = (int)(HAS_UNSAFE_ARRAY_OPERATIONS ? 1 : 0);
            n8 = 0;
            if (n10 != 0) {
                n10 = BYTE_ARRAY_ALIGNMENT + n3 & 7;
                while (n8 < n7 && (n14 = n10 & 7) != 0) {
                    n14 = n3 + n8;
                    n14 = object[n14];
                    int n15 = n4 + n8;
                    if (n14 != (n15 = byArray[n15])) {
                        return n8;
                    }
                    ++n8;
                    ++n10;
                }
                n10 = (n7 - n8 & 0xFFFFFFF8) + n8;
                while (n8 < n10) {
                    long l2 = BYTE_ARRAY_BASE_OFFSET;
                    long l3 = (long)n3 + l2;
                    long l4 = n8;
                    l3 += l4;
                    l3 = UnsafeUtil.getLong(object, l3);
                    long l7 = n4;
                    l2 = l2 + l7 + l4;
                    long l8 = l3 - (l2 = UnsafeUtil.getLong((Object)byArray, l2));
                    Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object2 != false) {
                        int n16 = UnsafeUtil.firstDifferingByteIndexNativeEndian(l3, l2);
                        return n8 + n16;
                    }
                    n8 += 8;
                }
            }
            while (n8 < n7) {
                n10 = n3 + n8;
                n10 = object[n10];
                n14 = n4 + n8;
                if (n10 != (n14 = byArray[n14])) {
                    return n8;
                }
                ++n8;
            }
            return -1;
        }
        object = new IndexOutOfBoundsException;
        object();
        throw object;
    }

    public static long objectFieldOffset(Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    public static void putBoolean(Object object, long l2, boolean bl2) {
        MEMORY_ACCESSOR.putBoolean(object, l2, bl2);
    }

    public static void putBoolean(boolean[] blArray, long l2, boolean bl2) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = BOOLEAN_ARRAY_BASE_OFFSET;
        long l4 = BOOLEAN_ARRAY_INDEX_SCALE;
        l2 = l2 * l4 + l3;
        unsafeUtil$MemoryAccessor.putBoolean(blArray, l2, bl2);
    }

    private static void putBooleanBigEndian(Object object, long l2, boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        UnsafeUtil.putByteBigEndian(object, l2, by2);
    }

    private static void putBooleanLittleEndian(Object object, long l2, boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        UnsafeUtil.putByteLittleEndian(object, l2, by2);
    }

    public static void putByte(long l2, byte by2) {
        MEMORY_ACCESSOR.putByte(l2, by2);
    }

    public static void putByte(Object object, long l2, byte by2) {
        MEMORY_ACCESSOR.putByte(object, l2, by2);
    }

    public static void putByte(byte[] byArray, long l2, byte by2) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = BYTE_ARRAY_BASE_OFFSET + l2;
        unsafeUtil$MemoryAccessor.putByte(byArray, l3, by2);
    }

    private static void putByteBigEndian(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        int n3 = UnsafeUtil.getInt(object, l3);
        int n4 = (~((int)l2) & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        UnsafeUtil.putInt(object, l3, n4);
    }

    private static void putByteLittleEndian(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        int n3 = UnsafeUtil.getInt(object, l3);
        int n4 = ((int)l2 & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        UnsafeUtil.putInt(object, l3, n4);
    }

    public static void putDouble(Object object, long l2, double d2) {
        MEMORY_ACCESSOR.putDouble(object, l2, d2);
    }

    public static void putDouble(double[] dArray, long l2, double d2) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = DOUBLE_ARRAY_BASE_OFFSET;
        long l4 = DOUBLE_ARRAY_INDEX_SCALE;
        long l7 = l2 * l4 + l3;
        unsafeUtil$MemoryAccessor.putDouble(dArray, l7, d2);
    }

    public static void putFloat(Object object, long l2, float f5) {
        MEMORY_ACCESSOR.putFloat(object, l2, f5);
    }

    public static void putFloat(float[] fArray, long l2, float f5) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = FLOAT_ARRAY_BASE_OFFSET;
        long l4 = FLOAT_ARRAY_INDEX_SCALE;
        l2 = l2 * l4 + l3;
        unsafeUtil$MemoryAccessor.putFloat(fArray, l2, f5);
    }

    public static void putInt(long l2, int n3) {
        MEMORY_ACCESSOR.putInt(l2, n3);
    }

    public static void putInt(Object object, long l2, int n3) {
        MEMORY_ACCESSOR.putInt(object, l2, n3);
    }

    public static void putInt(int[] nArray, long l2, int n3) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = INT_ARRAY_BASE_OFFSET;
        long l4 = INT_ARRAY_INDEX_SCALE;
        l2 = l2 * l4 + l3;
        unsafeUtil$MemoryAccessor.putInt(nArray, l2, n3);
    }

    public static void putLong(long l2, long l3) {
        MEMORY_ACCESSOR.putLong(l2, l3);
    }

    public static void putLong(Object object, long l2, long l3) {
        MEMORY_ACCESSOR.putLong(object, l2, l3);
    }

    public static void putLong(long[] lArray, long l2, long l3) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l4 = LONG_ARRAY_BASE_OFFSET;
        long l7 = LONG_ARRAY_INDEX_SCALE;
        long l8 = l2 * l7 + l4;
        unsafeUtil$MemoryAccessor.putLong(lArray, l8, l3);
    }

    public static void putObject(Object object, long l2, Object object2) {
        MEMORY_ACCESSOR.putObject(object, l2, object2);
    }

    public static void putObject(Object[] objectArray, long l2, Object object) {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        long l3 = OBJECT_ARRAY_BASE_OFFSET;
        long l4 = OBJECT_ARRAY_INDEX_SCALE;
        l2 = l2 * l4 + l3;
        unsafeUtil$MemoryAccessor.putObject(objectArray, l2, object);
    }

    private static boolean supportsUnsafeArrayOperations() {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        if (unsafeUtil$MemoryAccessor == null) {
            return false;
        }
        return unsafeUtil$MemoryAccessor.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        UnsafeUtil$MemoryAccessor unsafeUtil$MemoryAccessor = MEMORY_ACCESSOR;
        if (unsafeUtil$MemoryAccessor == null) {
            return false;
        }
        return unsafeUtil$MemoryAccessor.supportsUnsafeByteBufferOperations();
    }
}

