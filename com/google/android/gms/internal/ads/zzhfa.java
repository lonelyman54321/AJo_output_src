/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  libcore.io.Memory
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzm;
import com.google.android.gms.internal.ads.zzhew;
import com.google.android.gms.internal.ads.zzhex;
import com.google.android.gms.internal.ads.zzhey;
import com.google.android.gms.internal.ads.zzhez;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzhfa {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhez zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        long l2;
        boolean bl2;
        int n3;
        block14: {
            Class<Object> clazz;
            Class<Long> clazz2;
            Class[] classArray;
            AnnotatedElement annotatedElement;
            int n4;
            Class[] classArray2;
            Class<Class> clazz3;
            int n7;
            int n8;
            block13: {
                block12: {
                    void var11_21;
                    boolean bl3;
                    n3 = 3;
                    n8 = 2;
                    bl2 = false;
                    n7 = 1;
                    clazz3 = Class.class;
                    classArray2 = zzhfa.zzi();
                    zzc = classArray2;
                    n4 = zzgzm.zza;
                    zzd = Memory.class;
                    annotatedElement = Long.TYPE;
                    zze = bl3 = zzhfa.zzy(annotatedElement);
                    classArray = Integer.TYPE;
                    boolean bl4 = zzhfa.zzy(classArray);
                    Object var11_18 = null;
                    if (classArray2 != null) {
                        if (bl3) {
                            zzhey zzhey2 = new zzhey((Unsafe)classArray2);
                        } else if (bl4) {
                            zzhex zzhex2 = new zzhex((Unsafe)classArray2);
                        }
                    }
                    zzf = var11_21;
                    classArray2 = "getLong";
                    clazz2 = Field.class;
                    classArray = "objectFieldOffset";
                    clazz = Object.class;
                    if (var11_21 != null) {
                        Unsafe unsafe = var11_21.zza;
                        try {
                            Class<?> clazz4 = unsafe.getClass();
                            Class[] classArray3 = new Class[n7];
                            classArray3[0] = clazz2;
                            clazz4.getMethod((String)classArray, classArray3);
                            classArray3 = new Class[n8];
                            classArray3[0] = clazz;
                            classArray3[n7] = annotatedElement;
                            clazz4.getMethod((String)classArray2, classArray3);
                            annotatedElement = zzhfa.zzE();
                            if (annotatedElement == null) break block12;
                            n4 = 1;
                            break block13;
                        }
                        catch (Throwable throwable) {
                            zzhfa.zzj(throwable);
                        }
                    }
                }
                n4 = 0;
                annotatedElement = null;
            }
            zzg = n4;
            annotatedElement = zzf;
            if (annotatedElement != null) {
                annotatedElement = ((zzhez)((Object)annotatedElement)).zza;
                try {
                    Class<Integer> clazz5;
                    annotatedElement = annotatedElement.getClass();
                    Class[] classArray4 = new Class[n7];
                    classArray4[0] = clazz2;
                    ((Class)annotatedElement).getMethod((String)classArray, classArray4);
                    clazz2 = "arrayBaseOffset";
                    classArray = new Class[n7];
                    classArray[0] = clazz3;
                    ((Class)annotatedElement).getMethod((String)((Object)clazz2), classArray);
                    clazz2 = "arrayIndexScale";
                    classArray = new Class[n7];
                    classArray[0] = clazz3;
                    ((Class)annotatedElement).getMethod((String)((Object)clazz2), classArray);
                    String string2 = "getInt";
                    clazz2 = Long.TYPE;
                    classArray = new Class[n8];
                    classArray[0] = clazz;
                    classArray[n7] = clazz2;
                    ((Class)annotatedElement).getMethod(string2, classArray);
                    String string3 = "putInt";
                    classArray = new Class[n3];
                    classArray[0] = clazz;
                    classArray[n7] = clazz2;
                    classArray[n8] = clazz5 = Integer.TYPE;
                    ((Class)annotatedElement).getMethod(string3, classArray);
                    Class[] classArray5 = new Class[n8];
                    classArray5[0] = clazz;
                    classArray5[n7] = clazz2;
                    ((Class)annotatedElement).getMethod((String)classArray2, classArray5);
                    String string4 = "putLong";
                    classArray2 = new Class[n3];
                    classArray2[0] = clazz;
                    classArray2[n7] = clazz2;
                    classArray2[n8] = clazz2;
                    ((Class)annotatedElement).getMethod(string4, classArray2);
                    String string5 = "getObject";
                    classArray2 = new Class[n8];
                    classArray2[0] = clazz;
                    classArray2[n7] = clazz2;
                    ((Class)annotatedElement).getMethod(string5, classArray2);
                    String string6 = "putObject";
                    Class[] classArray6 = new Class[n3];
                    classArray6[0] = clazz;
                    classArray6[n7] = clazz2;
                    classArray6[n8] = clazz;
                    ((Class)annotatedElement).getMethod(string6, classArray6);
                    n3 = 1;
                    break block14;
                }
                catch (Throwable throwable) {
                    zzhfa.zzj(throwable);
                }
            }
            n3 = 0;
            Object var15_31 = null;
        }
        zzh = n3;
        n3 = zzhfa.zzC(byte[].class);
        zza = l2 = (long)n3;
        Class<boolean[]> clazz = boolean[].class;
        zzhfa.zzC(clazz);
        zzhfa.zzD(clazz);
        Class<int[]> clazz6 = int[].class;
        zzhfa.zzC(clazz6);
        zzhfa.zzD(clazz6);
        Class<long[]> clazz7 = long[].class;
        zzhfa.zzC(clazz7);
        zzhfa.zzD(clazz7);
        Class<float[]> clazz8 = float[].class;
        zzhfa.zzC(clazz8);
        zzhfa.zzD(clazz8);
        Class<double[]> clazz9 = double[].class;
        zzhfa.zzC(clazz9);
        zzhfa.zzD(clazz9);
        Class<Object[]> clazz10 = Object[].class;
        zzhfa.zzC(clazz10);
        zzhfa.zzD(clazz10);
        Field field = zzhfa.zzE();
        long l3 = -1;
        if (field != null && (object = zzf) != null) {
            object = ((zzhez)object).zza;
            l3 = ((Unsafe)object).objectFieldOffset(field);
        }
        zzi = l3;
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        if (byteOrder == (object = ByteOrder.BIG_ENDIAN)) {
            bl2 = true;
        }
        zzb = bl2;
    }

    private zzhfa() {
    }

    public static boolean zzA() {
        return zzh;
    }

    public static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class clazz) {
        boolean bl2 = zzh;
        if (bl2) {
            return zzhfa.zzf.zza.arrayBaseOffset(clazz);
        }
        return -1;
    }

    private static int zzD(Class clazz) {
        boolean bl2 = zzh;
        if (bl2) {
            return zzhfa.zzf.zza.arrayIndexScale(clazz);
        }
        return -1;
    }

    private static Field zzE() {
        Class clazz = Buffer.class;
        Field field = zzhfa.zzF(clazz, "effectiveDirectAddress");
        if (field == null) {
            Class<Long> clazz2;
            field = zzhfa.zzF(clazz, "address");
            if (field != null && (clazz = field.getType()) == (clazz2 = Long.TYPE)) {
                return field;
            }
            field = null;
        }
        return field;
    }

    private static Field zzF(Class annotatedElement, String string2) {
        try {
            annotatedElement = annotatedElement.getDeclaredField(string2);
        }
        catch (Throwable throwable) {
            annotatedElement = null;
        }
        return annotatedElement;
    }

    private static void zzG(Object object, long l2, byte by2) {
        Object object2 = zzf;
        Unsafe unsafe = ((zzhez)object2).zza;
        long l3 = (long)-4 & l2;
        int n3 = unsafe.getInt(object, l3);
        int n4 = (~((int)l2) & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        object2 = ((zzhez)object2).zza;
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        ((Unsafe)object2).putInt(object, l3, n4);
    }

    private static void zzH(Object object, long l2, byte by2) {
        Object object2 = zzf;
        Unsafe unsafe = ((zzhez)object2).zza;
        long l3 = (long)-4 & l2;
        int n3 = unsafe.getInt(object, l3);
        int n4 = ((int)l2 & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        object2 = ((zzhez)object2).zza;
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        ((Unsafe)object2).putInt(object, l3, n4);
    }

    public static byte zza(long l2) {
        return zzf.zza(l2);
    }

    public static double zzb(Object object, long l2) {
        return zzf.zzb(object, l2);
    }

    public static float zzc(Object object, long l2) {
        return zzf.zzc(object, l2);
    }

    public static int zzd(Object object, long l2) {
        return zzhfa.zzf.zza.getInt(object, l2);
    }

    public static long zze(ByteBuffer byteBuffer) {
        zzhez zzhez2 = zzf;
        long l2 = zzi;
        return zzhez2.zza.getLong(byteBuffer, l2);
    }

    public static long zzf(Object object, long l2) {
        return zzhfa.zzf.zza.getLong(object, l2);
    }

    public static Object zzg(Class clazz) {
        Object object;
        try {
            object = zzc;
        }
        catch (InstantiationException instantiationException) {
            object = new IllegalStateException(instantiationException);
            throw object;
        }
        return ((Unsafe)object).allocateInstance(clazz);
    }

    public static Object zzh(Object object, long l2) {
        return zzhfa.zzf.zza.getObject(object, l2);
    }

    public static Unsafe zzi() {
        Object object = new zzhew();
        object = AccessController.doPrivileged(object);
        try {
            object = (Unsafe)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    public static /* bridge */ /* synthetic */ void zzj(Throwable object) {
        Logger logger = Logger.getLogger(zzhfa.class.getName());
        Level level = Level.WARNING;
        object = object.toString();
        object = "platform method missing - proto runtime falling back to safer methods: ".concat((String)object);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", (String)object);
    }

    public static /* synthetic */ void zzk(Object object, long l2, boolean bl2) {
        zzhfa.zzG(object, l2, (byte)(bl2 ? 1 : 0));
    }

    public static /* synthetic */ void zzl(Object object, long l2, boolean bl2) {
        zzhfa.zzH(object, l2, (byte)(bl2 ? 1 : 0));
    }

    public static /* bridge */ /* synthetic */ void zzm(Object object, long l2, byte by2) {
        zzhfa.zzG(object, l2, by2);
    }

    public static /* bridge */ /* synthetic */ void zzn(Object object, long l2, byte by2) {
        zzhfa.zzH(object, l2, by2);
    }

    public static void zzo(long l2, byte[] byArray, long l3, long l4) {
        zzf.zzd(l2, byArray, l3, l4);
    }

    public static void zzp(Object object, long l2, boolean bl2) {
        zzf.zze(object, l2, bl2);
    }

    public static void zzq(byte[] byArray, long l2, byte by2) {
        zzhez zzhez2 = zzf;
        long l3 = zza + l2;
        zzhez2.zzf(byArray, l3, by2);
    }

    public static void zzr(Object object, long l2, double d2) {
        zzf.zzg(object, l2, d2);
    }

    public static void zzs(Object object, long l2, float f5) {
        zzf.zzh(object, l2, f5);
    }

    public static void zzt(Object object, long l2, int n3) {
        zzhfa.zzf.zza.putInt(object, l2, n3);
    }

    public static void zzu(Object object, long l2, long l3) {
        zzhfa.zzf.zza.putLong(object, l2, l3);
    }

    public static void zzv(Object object, long l2, Object object2) {
        zzhfa.zzf.zza.putObject(object, l2, object2);
    }

    public static /* bridge */ /* synthetic */ boolean zzw(Object object, long l2) {
        Unsafe unsafe = zzhfa.zzf.zza;
        long l3 = (long)-4 & l2;
        int n3 = unsafe.getInt(object, l3);
        l2 ^= (long)-1;
        long l4 = 3;
        l2 &= l4;
        int n4 = 3;
        int n7 = (int)(l2 <<= n4);
        return (n3 = (int)((byte)(n3 >>> n7 & 0xFF))) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzx(Object object, long l2) {
        Unsafe unsafe = zzhfa.zzf.zza;
        long l3 = (long)-4 & l2;
        int n3 = unsafe.getInt(object, l3);
        long l4 = 3;
        l2 &= l4;
        int n4 = 3;
        int n7 = (int)(l2 <<= n4);
        return (n3 = (int)((byte)(n3 >>> n7 & 0xFF))) != 0;
    }

    public static boolean zzy(Class clazz) {
        String string2;
        Class clazz2;
        int n3 = 4;
        int n4 = 3;
        int n7 = 2;
        boolean bl2 = true;
        Class<byte[]> clazz3 = byte[].class;
        try {
            clazz2 = zzd;
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

    public static boolean zzz(Object object, long l2) {
        return zzf.zzi(object, l2);
    }
}

