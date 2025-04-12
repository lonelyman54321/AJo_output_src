/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class nw3 {
    public static final Logger a;
    public static final Unsafe b;
    public static final Class c;
    public static final nw3$e d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static {
        block132: {
            var0 = 0;
            var1_1 /* !! */  = null;
            var2_2 = 1;
            nw3.a = Logger.getLogger(nw3.class.getName());
            var3_3 = nw3.l();
            nw3.b = var3_3;
            nw3.c = Ye.a;
            var4_9 = Long.TYPE;
            var5_10 = nw3.e(var4_9);
            var6_11 = Integer.TYPE;
            var7_12 = nw3.e(var6_11);
            var8_13 = null;
            if (var3_3 != null) {
                var9_14 = Ye.a();
                if (var9_14) {
                    if (var5_10 != 0) {
                        var8_13 = new nw3$e((Unsafe)var3_3);
                    } else if (var7_12) {
                        var8_13 = new nw3$e((Unsafe)var3_3);
                    }
                } else {
                    var8_13 = new nw3$e((Unsafe)var3_3);
                }
            }
            nw3.d = var8_13;
            var10_15 = "copyMemory";
            var11_16 = "platform method missing - proto runtime falling back to safer methods: ";
            var8_13 = "putLong";
            var12_17 = "putInt";
            var13_18 = "getInt";
            var14_19 = "putByte";
            var15_20 = "getByte";
            var16_21 = Field.class;
            var17_22 = "objectFieldOffset";
            var18_23 = Object.class;
            var19_24 = "getLong";
            if (var3_3 != null) {
                block133: {
                    var3_3 = var3_3.getClass();
                    var20_25 = new Class[var2_2];
                    var20_25[0] = var16_21;
                    var3_3.getMethod(var17_22, (Class<?>)var20_25);
                    var21_26 = 2;
                    var22_27 /* !! */  = new Class[var21_26];
                    var22_27 /* !! */ [0] = var18_23;
                    var21_26 = 1;
                    var22_27 /* !! */ [var21_26] = var4_9;
                    var3_3.getMethod((String)var19_24, var22_27 /* !! */ );
                    var20_25 = nw3.d();
                    if (var20_25 == null) break block132;
                    var21_26 = (int)Ye.a();
                    if (var21_26 == 0) break block133;
lbl61:
                    // 2 sources

                    while (true) {
                        var0 = 1;
                        break block132;
                        break;
                    }
                }
                var21_26 = 1;
                var22_27 /* !! */  = new Class[var21_26];
                var22_27 /* !! */ [0] = var4_9;
                var3_3.getMethod(var15_20, var22_27 /* !! */ );
                var21_26 = 2;
                var22_27 /* !! */  = new Class[var21_26];
                var22_27 /* !! */ [0] = var4_9;
                var20_25 = Byte.TYPE;
                var0 = 1;
                var22_27 /* !! */ [var0] = var20_25;
                var3_3.getMethod(var14_19, var22_27 /* !! */ );
                var20_25 = new Class[var0];
                var2_2 = 0;
                var22_27 /* !! */  = null;
                var20_25[0] = var4_9;
                var3_3.getMethod(var13_18, (Class<?>)var20_25);
                var21_26 = 2;
                var1_1 /* !! */  = new Class[var21_26];
                var1_1 /* !! */ [0] = var4_9;
                var21_26 = 1;
                var1_1 /* !! */ [var21_26] = var6_11;
                var3_3.getMethod(var12_17, var1_1 /* !! */ );
                var1_1 /* !! */  = new Class[var21_26];
                var1_1 /* !! */ [0] = var4_9;
                var3_3.getMethod((String)var19_24, var1_1 /* !! */ );
                var0 = 2;
                var6_11 = new Class[var0];
                var6_11[0] = var4_9;
                var6_11[var21_26] = var4_9;
                var3_3.getMethod((String)var8_13, var6_11);
                var0 = 3;
                var6_11 = new Class[var0];
                var6_11[0] = var4_9;
                var6_11[var21_26] = var4_9;
                var0 = 2;
                var6_11[var0] = var4_9;
                var3_3.getMethod((String)var10_15, var6_11);
                var23_28 = 5;
                var6_11 = new Class[var23_28];
                var6_11[0] = var18_23;
                var6_11[var21_26] = var4_9;
                var6_11[var0] = var18_23;
                var21_26 = 3;
                var6_11[var21_26] = var4_9;
                var21_26 = 4;
                var6_11[var21_26] = var4_9;
                try {
                    var3_3.getMethod((String)var10_15, var6_11);
                    ** continue;
                }
                catch (Throwable var3_4) {
                    var20_25 = Level.WARNING;
                    var1_1 /* !! */  = new StringBuilder(var11_16);
                    var1_1 /* !! */ .append(var3_4);
                    var3_3 = var1_1 /* !! */ .toString();
                    nw3.a.log((Level)var20_25, (String)var3_3);
                    var0 = 0;
                    var1_1 /* !! */  = null;
                }
            }
        }
        nw3.e = var0;
        var3_3 = Class.class;
        var20_25 = nw3.b;
        if (var20_25 != null) {
            try {
                var20_25 = var20_25.getClass();
                var0 = 1;
                var22_27 /* !! */  = new Class[var0];
            }
            finally {
                var2_2 = 0;
                var22_27 /* !! */  = null;
            }
        }
        var21_26 = 0;
        var20_25 = null;
        var2_2 = 0;
        var22_27 /* !! */  = null;
        var24_29 = 1;
        nw3.f = var21_26;
        var26_31 = nw3.b(byte[].class);
        nw3.g = var27_32 = (long)var26_31;
        var3_3 = boolean[].class;
        nw3.b(var3_3);
        nw3.c(var3_3);
        var3_3 = int[].class;
        nw3.b(var3_3);
        nw3.c(var3_3);
        var3_3 = long[].class;
        nw3.b(var3_3);
        nw3.c(var3_3);
        var3_3 = float[].class;
        nw3.b(var3_3);
        nw3.c(var3_3);
        var3_3 = double[].class;
        nw3.b(var3_3);
        nw3.c(var3_3);
        var3_3 = Object[].class;
        nw3.b(var3_3);
        nw3.c(var3_3);
        var3_3 = nw3.d();
        if (var3_3 != null && (var19_24 = nw3.d) != null) {
            var19_24.j((Field)var3_3);
        }
        if ((var3_3 = ByteOrder.nativeOrder()) == (var19_24 = ByteOrder.BIG_ENDIAN)) {
            var0 = 1;
        } else {
            var0 = 0;
            var1_1 /* !! */  = null;
        }
        nw3.h = var0;
    }

    public static Object a(Class clazz) {
        Object object;
        try {
            object = b;
        }
        catch (InstantiationException instantiationException) {
            object = new IllegalStateException(instantiationException);
            throw object;
        }
        return ((Unsafe)object).allocateInstance(clazz);
    }

    public static int b(Class clazz) {
        int n3;
        boolean bl2 = f;
        if (bl2) {
            nw3$e nw3$e = d;
            n3 = nw3$e.a(clazz);
        } else {
            n3 = -1;
        }
        return n3;
    }

    public static void c(Class clazz) {
        boolean bl2 = f;
        if (bl2) {
            nw3$e nw3$e = d;
            nw3$e.b(clazz);
        }
    }

    public static Field d() {
        Class<Long> clazz;
        Object object;
        boolean bl2 = Ye.a();
        Class clazz2 = Buffer.class;
        Object object2 = null;
        if (bl2) {
            object = "effectiveDirectAddress";
            try {
                object = clazz2.getDeclaredField((String)object);
            }
            catch (Throwable throwable) {
                bl2 = false;
                object = null;
            }
            if (object != null) {
                return object;
            }
        }
        object = "address";
        try {
            object = clazz2.getDeclaredField((String)object);
        }
        catch (Throwable throwable) {
            bl2 = false;
            object = null;
        }
        if (object != null && (clazz2 = ((Field)object).getType()) == (clazz = Long.TYPE)) {
            object2 = object;
        }
        return object2;
    }

    public static boolean e(Class clazz) {
        String string2;
        Class clazz2;
        int n3 = 4;
        int n4 = 3;
        int n7 = 2;
        boolean bl2 = true;
        Class<byte[]> clazz3 = byte[].class;
        boolean bl3 = Ye.a();
        if (!bl3) {
            return false;
        }
        try {
            clazz2 = c;
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

    public static byte f(byte[] byArray, long l2) {
        long l3 = g + l2;
        return d.d(byArray, l3);
    }

    public static byte g(Object object, long l2) {
        long l3 = (long)-4 & l2;
        int n3 = d.g(object, l3);
        int n4 = (int)(((l2 ^ (long)-1) & (long)3) << 3);
        return (byte)(n3 >>> n4 & 0xFF);
    }

    public static byte h(Object object, long l2) {
        long l3 = (long)-4 & l2;
        int n3 = d.g(object, l3);
        int n4 = (int)((l2 & (long)3) << 3);
        return (byte)(n3 >>> n4 & 0xFF);
    }

    public static int i(Object object, long l2) {
        return d.g(object, l2);
    }

    public static long j(Object object, long l2) {
        return d.h(object, l2);
    }

    public static Object k(Object object, long l2) {
        return d.i(object, l2);
    }

    public static Unsafe l() {
        Object object = new nw3$a();
        object = AccessController.doPrivileged(object);
        try {
            object = (Unsafe)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    public static void m(byte[] byArray, long l2, byte by2) {
        long l3 = g + l2;
        d.l(byArray, l3, by2);
    }

    public static void n(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        int n3 = d.g(object, l3);
        int n4 = (~((int)l2) & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        nw3.p(object, l3, n4);
    }

    public static void o(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        int n3 = d.g(object, l3);
        int n4 = ((int)l2 & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        nw3.p(object, l3, n4);
    }

    public static void p(Object object, long l2, int n3) {
        d.o(object, l2, n3);
    }

    public static void q(Object object, long l2, long l3) {
        d.p(object, l2, l3);
    }

    public static void r(Object object, long l2, Object object2) {
        d.q(object, l2, object2);
    }
}

