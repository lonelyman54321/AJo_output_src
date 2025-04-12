/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbu;
import com.google.android.gms.internal.icing.zzfj;
import com.google.android.gms.internal.icing.zzfk;
import com.google.android.gms.internal.icing.zzfl;
import com.google.android.gms.internal.icing.zzfm;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzfn {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final boolean zzf;
    private static final zzfm zzg;
    private static final boolean zzh;
    private static final boolean zzi;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2;
        Object object;
        Class[] classArray;
        boolean bl2;
        int n3;
        block14: {
            boolean bl3;
            Class<Object> clazz;
            String string2;
            Object object2;
            AnnotatedElement annotatedElement;
            Class[] classArray2;
            Class<Long> clazz2;
            int n4;
            int n7;
            block13: {
                block12: {
                    Unsafe unsafe;
                    void var10_14;
                    boolean bl4;
                    boolean bl5;
                    n3 = 3;
                    n7 = 2;
                    bl2 = false;
                    n4 = 1;
                    clazz2 = Class.class;
                    classArray2 = zzfn.zzq();
                    zzc = classArray2;
                    zzd = zzbu.zza();
                    annotatedElement = Long.TYPE;
                    zze = bl5 = zzfn.zzr(annotatedElement);
                    object2 = Integer.TYPE;
                    zzf = bl4 = zzfn.zzr(object2);
                    Object var10_11 = null;
                    if (classArray2 != null) {
                        if (bl5) {
                            zzfl zzfl2 = new zzfl((Unsafe)classArray2);
                        } else if (bl4) {
                            zzfk zzfk2 = new zzfk((Unsafe)classArray2);
                        }
                    }
                    zzg = var10_14;
                    classArray2 = "getLong";
                    string2 = "objectFieldOffset";
                    object2 = Field.class;
                    clazz = Object.class;
                    if (var10_14 != null && (unsafe = var10_14.zza) != null) {
                        try {
                            Class<?> clazz3 = unsafe.getClass();
                            Class[] classArray3 = new Class[n4];
                            classArray3[0] = object2;
                            clazz3.getMethod(string2, classArray3);
                            classArray3 = new Class[n7];
                            classArray3[0] = clazz;
                            classArray3[n4] = annotatedElement;
                            clazz3.getMethod((String)classArray2, classArray3);
                            annotatedElement = zzfn.zzB();
                            if (annotatedElement == null) break block12;
                            bl3 = true;
                            break block13;
                        }
                        catch (Throwable throwable) {
                            zzfn.zzs(throwable);
                        }
                    }
                }
                bl3 = false;
                annotatedElement = null;
            }
            zzh = bl3;
            annotatedElement = zzg;
            if (annotatedElement != null && (annotatedElement = ((zzfm)((Object)annotatedElement)).zza) != null) {
                try {
                    annotatedElement = annotatedElement.getClass();
                    Class[] classArray4 = new Class[n4];
                    classArray4[0] = object2;
                    ((Class)annotatedElement).getMethod(string2, classArray4);
                    Class[] classArray5 = new Class[n4];
                    classArray5[0] = clazz2;
                    object2 = "arrayBaseOffset";
                    ((Class)annotatedElement).getMethod((String)object2, classArray5);
                    Class[] classArray6 = new Class[n4];
                    classArray6[0] = clazz2;
                    clazz2 = "arrayIndexScale";
                    ((Class)annotatedElement).getMethod((String)((Object)clazz2), classArray6);
                    clazz2 = Long.TYPE;
                    Class[] classArray7 = new Class[n7];
                    classArray7[0] = clazz;
                    classArray7[n4] = clazz2;
                    object2 = "getInt";
                    ((Class)annotatedElement).getMethod((String)object2, classArray7);
                    Class[] classArray8 = new Class[n3];
                    classArray8[0] = clazz;
                    classArray8[n4] = clazz2;
                    object2 = Integer.TYPE;
                    classArray8[n7] = object2;
                    object2 = "putInt";
                    ((Class)annotatedElement).getMethod((String)object2, classArray8);
                    Class[] classArray9 = new Class[n7];
                    classArray9[0] = clazz;
                    classArray9[n4] = clazz2;
                    ((Class)annotatedElement).getMethod((String)classArray2, classArray9);
                    classArray2 = new Class[n3];
                    classArray2[0] = clazz;
                    classArray2[n4] = clazz2;
                    classArray2[n7] = clazz2;
                    String string3 = "putLong";
                    ((Class)annotatedElement).getMethod(string3, classArray2);
                    classArray2 = new Class[n7];
                    classArray2[0] = clazz;
                    classArray2[n4] = clazz2;
                    String string4 = "getObject";
                    ((Class)annotatedElement).getMethod(string4, classArray2);
                    classArray = new Class[n3];
                    classArray[0] = clazz;
                    classArray[n4] = clazz2;
                    classArray[n7] = clazz;
                    object = "putObject";
                    ((Class)annotatedElement).getMethod((String)object, classArray);
                    n3 = 1;
                    break block14;
                }
                catch (Throwable throwable) {
                    zzfn.zzs(throwable);
                }
            }
            n3 = 0;
            classArray = null;
        }
        zzi = n3;
        n3 = zzfn.zzz(byte[].class);
        zza = l2 = (long)n3;
        classArray = boolean[].class;
        zzfn.zzz(classArray);
        zzfn.zzA(classArray);
        classArray = int[].class;
        zzfn.zzz(classArray);
        zzfn.zzA(classArray);
        classArray = long[].class;
        zzfn.zzz(classArray);
        zzfn.zzA(classArray);
        classArray = float[].class;
        zzfn.zzz(classArray);
        zzfn.zzA(classArray);
        classArray = double[].class;
        zzfn.zzz(classArray);
        zzfn.zzA(classArray);
        classArray = Object[].class;
        zzfn.zzz(classArray);
        zzfn.zzA(classArray);
        classArray = zzfn.zzB();
        if (classArray != null && (object = zzg) != null) {
            ((zzfm)object).zzh((Field)classArray);
        }
        if ((classArray = ByteOrder.nativeOrder()) == (object = ByteOrder.BIG_ENDIAN)) {
            bl2 = true;
        }
        zzb = bl2;
    }

    private zzfn() {
    }

    private static int zzA(Class clazz) {
        boolean bl2 = zzi;
        if (bl2) {
            return zzg.zzj(clazz);
        }
        return -1;
    }

    private static Field zzB() {
        Class clazz = Buffer.class;
        Field field = zzfn.zzC(clazz, "effectiveDirectAddress");
        if (field == null) {
            Class<Long> clazz2;
            field = zzfn.zzC(clazz, "address");
            if (field != null && (clazz = field.getType()) == (clazz2 = Long.TYPE)) {
                return field;
            }
            field = null;
        }
        return field;
    }

    private static Field zzC(Class annotatedElement, String string2) {
        try {
            annotatedElement = annotatedElement.getDeclaredField(string2);
        }
        catch (Throwable throwable) {
            annotatedElement = null;
        }
        return annotatedElement;
    }

    private static void zzD(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        zzfm zzfm2 = zzg;
        int n3 = zzfm2.zzk(object, l3);
        int n4 = (~((int)l2) & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        zzfm2.zzl(object, l3, n4);
    }

    private static void zzE(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        zzfm zzfm2 = zzg;
        int n3 = zzfm2.zzk(object, l3);
        int n4 = ((int)l2 & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        zzfm2.zzl(object, l3, n4);
    }

    public static boolean zza() {
        return zzi;
    }

    public static boolean zzb() {
        return zzh;
    }

    public static Object zzc(Class clazz) {
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

    public static int zzd(Object object, long l2) {
        return zzg.zzk(object, l2);
    }

    public static void zze(Object object, long l2, int n3) {
        zzg.zzl(object, l2, n3);
    }

    public static long zzf(Object object, long l2) {
        return zzg.zzm(object, l2);
    }

    public static void zzg(Object object, long l2, long l3) {
        zzg.zzn(object, l2, l3);
    }

    public static boolean zzh(Object object, long l2) {
        return zzg.zzb(object, l2);
    }

    public static void zzi(Object object, long l2, boolean bl2) {
        zzg.zzc(object, l2, bl2);
    }

    public static float zzj(Object object, long l2) {
        return zzg.zzd(object, l2);
    }

    public static void zzk(Object object, long l2, float f5) {
        zzg.zze(object, l2, f5);
    }

    public static double zzl(Object object, long l2) {
        return zzg.zzf(object, l2);
    }

    public static void zzm(Object object, long l2, double d2) {
        zzg.zzg(object, l2, d2);
    }

    public static Object zzn(Object object, long l2) {
        return zzg.zzo(object, l2);
    }

    public static void zzo(Object object, long l2, Object object2) {
        zzg.zzp(object, l2, object2);
    }

    public static void zzp(byte[] byArray, long l2, byte by2) {
        zzfm zzfm2 = zzg;
        long l3 = zza + l2;
        zzfm2.zza(byArray, l3, by2);
    }

    public static Unsafe zzq() {
        Object object = new zzfj();
        object = AccessController.doPrivileged(object);
        try {
            object = (Unsafe)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    public static boolean zzr(Class object) {
        Class clazz;
        int n3 = 4;
        int n4 = 3;
        int n7 = 2;
        boolean bl2 = true;
        Class<byte[]> clazz2 = byte[].class;
        try {
            clazz = zzd;
        }
        catch (Throwable throwable) {
            return false;
        }
        Class[] classArray = Boolean.TYPE;
        Object object2 = new Class[n7];
        object2[0] = object;
        object2[bl2] = classArray;
        Object object3 = "peekLong";
        clazz.getMethod((String)object3, (Class<?>)object2);
        object2 = new Class[n4];
        object2[0] = object;
        object3 = Long.TYPE;
        object2[bl2] = object3;
        object2[n7] = classArray;
        object3 = "pokeLong";
        clazz.getMethod((String)object3, (Class<?>)object2);
        object2 = Integer.TYPE;
        object3 = new Class[n4];
        object3[0] = object;
        object3[bl2] = object2;
        object3[n7] = classArray;
        String string2 = "pokeInt";
        clazz.getMethod(string2, (Class<?>)object3);
        object3 = new Class[n7];
        object3[0] = object;
        object3[bl2] = classArray;
        classArray = "peekInt";
        clazz.getMethod((String)classArray, (Class<?>)object3);
        classArray = new Class[n7];
        classArray[0] = object;
        object3 = Byte.TYPE;
        classArray[bl2] = object3;
        object3 = "pokeByte";
        clazz.getMethod((String)object3, classArray);
        classArray = new Class[bl2];
        classArray[0] = object;
        object3 = "peekByte";
        clazz.getMethod((String)object3, classArray);
        classArray = new Class[n3];
        classArray[0] = object;
        classArray[bl2] = clazz2;
        classArray[n7] = object2;
        classArray[n4] = object2;
        object3 = "pokeByteArray";
        clazz.getMethod((String)object3, classArray);
        Class[] classArray2 = new Class[n3];
        classArray2[0] = object;
        classArray2[bl2] = clazz2;
        classArray2[n7] = object2;
        classArray2[n4] = object2;
        object = "peekByteArray";
        clazz.getMethod((String)object, classArray2);
        return bl2;
    }

    public static /* synthetic */ void zzs(Throwable object) {
        Logger logger = Logger.getLogger(zzfn.class.getName());
        Level level = Level.WARNING;
        object = String.valueOf(object);
        int n3 = ((String)object).length();
        StringBuilder stringBuilder = new StringBuilder(n3 += 71);
        object = h30_0.a(stringBuilder, "platform method missing - proto runtime falling back to safer methods: ", (String)object);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", (String)object);
    }

    public static /* synthetic */ void zzt(Object object, long l2, byte by2) {
        zzfn.zzD(object, l2, by2);
    }

    public static /* synthetic */ void zzu(Object object, long l2, byte by2) {
        zzfn.zzE(object, l2, by2);
    }

    public static /* synthetic */ boolean zzv(Object object, long l2) {
        zzfm zzfm2 = zzg;
        long l3 = (long)-4 & l2;
        int n3 = zzfm2.zzk(object, l3);
        l2 ^= (long)-1;
        long l4 = 3;
        l2 &= l4;
        int n4 = 3;
        int n7 = (int)(l2 <<= n4);
        return (n3 = (int)((byte)(n3 >>> n7 & 0xFF))) != 0;
    }

    public static /* synthetic */ boolean zzw(Object object, long l2) {
        zzfm zzfm2 = zzg;
        long l3 = (long)-4 & l2;
        int n3 = zzfm2.zzk(object, l3);
        long l4 = 3;
        l2 &= l4;
        int n4 = 3;
        int n7 = (int)(l2 <<= n4);
        return (n3 = (int)((byte)(n3 >>> n7 & 0xFF))) != 0;
    }

    public static /* synthetic */ void zzx(Object object, long l2, boolean bl2) {
        zzfn.zzD(object, l2, (byte)(bl2 ? 1 : 0));
    }

    public static /* synthetic */ void zzy(Object object, long l2, boolean bl2) {
        zzfn.zzE(object, l2, (byte)(bl2 ? 1 : 0));
    }

    private static int zzz(Class clazz) {
        boolean bl2 = zzi;
        if (bl2) {
            return zzg.zzi(clazz);
        }
        return -1;
    }
}

