/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdr;
import com.google.android.gms.internal.auth.zzhe;
import com.google.android.gms.internal.auth.zzhf;
import com.google.android.gms.internal.auth.zzhg;
import com.google.android.gms.internal.auth.zzhh;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzhi {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhh zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        Class[] classArray;
        boolean bl2;
        int n3;
        block14: {
            boolean bl3;
            Class<Object> clazz;
            String string2;
            Class[] classArray2;
            Object object2;
            AnnotatedElement annotatedElement;
            Class[] classArray3;
            Class<Long> clazz2;
            int n4;
            int n7;
            block13: {
                block12: {
                    boolean bl4;
                    n3 = 3;
                    n7 = 2;
                    bl2 = false;
                    n4 = 1;
                    clazz2 = Class.class;
                    classArray3 = zzhi.zzg();
                    zzb = classArray3;
                    zzc = zzdr.zza();
                    annotatedElement = Long.TYPE;
                    zzd = bl4 = zzhi.zzs(annotatedElement);
                    object2 = Integer.TYPE;
                    boolean bl5 = zzhi.zzs(object2);
                    classArray2 = null;
                    if (classArray3 != null) {
                        if (bl4) {
                            classArray2 = new zzhg((Unsafe)classArray3);
                        } else if (bl5) {
                            classArray2 = new zzhf((Unsafe)classArray3);
                        }
                    }
                    zze = classArray2;
                    classArray3 = "getLong";
                    string2 = "objectFieldOffset";
                    object2 = Field.class;
                    clazz = Object.class;
                    if (classArray2 != null) {
                        classArray2 = classArray2.zza;
                        try {
                            classArray2 = classArray2.getClass();
                            Class[] classArray4 = new Class[n4];
                            classArray4[0] = object2;
                            classArray2.getMethod(string2, classArray4);
                            classArray4 = new Class[n7];
                            classArray4[0] = clazz;
                            classArray4[n4] = annotatedElement;
                            classArray2.getMethod((String)classArray3, classArray4);
                            annotatedElement = zzhi.zzy();
                            if (annotatedElement == null) break block12;
                            bl3 = true;
                            break block13;
                        }
                        catch (Throwable throwable) {
                            zzhi.zzh(throwable);
                        }
                    }
                }
                bl3 = false;
                annotatedElement = null;
            }
            zzf = bl3;
            annotatedElement = zze;
            if (annotatedElement != null) {
                annotatedElement = ((zzhh)((Object)annotatedElement)).zza;
                try {
                    annotatedElement = annotatedElement.getClass();
                    classArray2 = new Class[n4];
                    classArray2[0] = object2;
                    ((Class)annotatedElement).getMethod(string2, classArray2);
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
                    ((Class)annotatedElement).getMethod((String)classArray3, classArray9);
                    classArray3 = new Class[n3];
                    classArray3[0] = clazz;
                    classArray3[n4] = clazz2;
                    classArray3[n7] = clazz2;
                    String string3 = "putLong";
                    ((Class)annotatedElement).getMethod(string3, classArray3);
                    classArray3 = new Class[n7];
                    classArray3[0] = clazz;
                    classArray3[n4] = clazz2;
                    String string4 = "getObject";
                    ((Class)annotatedElement).getMethod(string4, classArray3);
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
                    zzhi.zzh(throwable);
                }
            }
            n3 = 0;
            classArray = null;
        }
        zzg = n3;
        zzhi.zzw(byte[].class);
        classArray = boolean[].class;
        zzhi.zzw(classArray);
        zzhi.zzx(classArray);
        classArray = int[].class;
        zzhi.zzw(classArray);
        zzhi.zzx(classArray);
        classArray = long[].class;
        zzhi.zzw(classArray);
        zzhi.zzx(classArray);
        classArray = float[].class;
        zzhi.zzw(classArray);
        zzhi.zzx(classArray);
        classArray = double[].class;
        zzhi.zzw(classArray);
        zzhi.zzx(classArray);
        classArray = Object[].class;
        zzhi.zzw(classArray);
        zzhi.zzx(classArray);
        classArray = zzhi.zzy();
        if (classArray != null && (object = zze) != null) {
            ((zzhh)object).zzk((Field)classArray);
        }
        if ((classArray = ByteOrder.nativeOrder()) == (object = ByteOrder.BIG_ENDIAN)) {
            bl2 = true;
        }
        zza = bl2;
    }

    private zzhi() {
    }

    public static double zza(Object object, long l2) {
        return zze.zza(object, l2);
    }

    public static float zzb(Object object, long l2) {
        return zze.zzb(object, l2);
    }

    public static int zzc(Object object, long l2) {
        return zze.zzi(object, l2);
    }

    public static long zzd(Object object, long l2) {
        return zze.zzj(object, l2);
    }

    public static Object zze(Class clazz) {
        Object object;
        try {
            object = zzb;
        }
        catch (InstantiationException instantiationException) {
            object = new IllegalStateException(instantiationException);
            throw object;
        }
        return ((Unsafe)object).allocateInstance(clazz);
    }

    public static Object zzf(Object object, long l2) {
        return zze.zzl(object, l2);
    }

    public static Unsafe zzg() {
        Object object = new zzhe();
        object = AccessController.doPrivileged(object);
        try {
            object = (Unsafe)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable object) {
        Logger logger = Logger.getLogger(zzhi.class.getName());
        Level level = Level.WARNING;
        object = object.toString();
        object = "platform method missing - proto runtime falling back to safer methods: ".concat((String)object);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", (String)object);
    }

    public static /* synthetic */ void zzi(Object object, long l2, boolean bl2) {
        long l3 = (long)-4 & l2;
        zzhh zzhh2 = zze;
        int n3 = zzhh2.zzi(object, l3);
        int n4 = (~((int)l2) & 3) << 3;
        int n7 = ~(255 << n4) & n3;
        n4 = bl2 << n4 | n7;
        zzhh2.zzm(object, l3, n4);
    }

    public static /* synthetic */ void zzj(Object object, long l2, boolean bl2) {
        long l3 = (long)-4 & l2;
        zzhh zzhh2 = zze;
        int n3 = zzhh2.zzi(object, l3);
        int n4 = ((int)l2 & 3) << 3;
        int n7 = ~(255 << n4) & n3;
        n4 = bl2 << n4 | n7;
        zzhh2.zzm(object, l3, n4);
    }

    public static void zzk(Object object, long l2, boolean bl2) {
        zze.zzc(object, l2, bl2);
    }

    public static void zzl(Object object, long l2, double d2) {
        zze.zzd(object, l2, d2);
    }

    public static void zzm(Object object, long l2, float f5) {
        zze.zze(object, l2, f5);
    }

    public static void zzn(Object object, long l2, int n3) {
        zze.zzm(object, l2, n3);
    }

    public static void zzo(Object object, long l2, long l3) {
        zze.zzn(object, l2, l3);
    }

    public static void zzp(Object object, long l2, Object object2) {
        zze.zzo(object, l2, object2);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object object, long l2) {
        zzhh zzhh2 = zze;
        long l3 = (long)-4 & l2;
        int n3 = zzhh2.zzi(object, l3);
        l2 ^= (long)-1;
        long l4 = 3;
        l2 &= l4;
        int n4 = 3;
        int n7 = (int)(l2 <<= n4);
        return (n3 = (int)((byte)(n3 >>> n7 & 0xFF))) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object object, long l2) {
        zzhh zzhh2 = zze;
        long l3 = (long)-4 & l2;
        int n3 = zzhh2.zzi(object, l3);
        long l4 = 3;
        l2 &= l4;
        int n4 = 3;
        int n7 = (int)(l2 <<= n4);
        return (n3 = (int)((byte)(n3 >>> n7 & 0xFF))) != 0;
    }

    public static boolean zzs(Class object) {
        Class clazz;
        int n3 = 4;
        int n4 = 3;
        int n7 = 2;
        boolean bl2 = true;
        Class<byte[]> clazz2 = byte[].class;
        try {
            clazz = zzc;
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

    public static boolean zzt(Object object, long l2) {
        return zze.zzf(object, l2);
    }

    public static boolean zzu() {
        return zzg;
    }

    public static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class clazz) {
        boolean bl2 = zzg;
        if (bl2) {
            return zze.zzg(clazz);
        }
        return -1;
    }

    private static int zzx(Class clazz) {
        boolean bl2 = zzg;
        if (bl2) {
            return zze.zzh(clazz);
        }
        return -1;
    }

    private static Field zzy() {
        Class clazz = Buffer.class;
        Field field = zzhi.zzz(clazz, "effectiveDirectAddress");
        if (field == null) {
            Class<Long> clazz2;
            field = zzhi.zzz(clazz, "address");
            if (field != null && (clazz = field.getType()) == (clazz2 = Long.TYPE)) {
                return field;
            }
            field = null;
        }
        return field;
    }

    private static Field zzz(Class annotatedElement, String string2) {
        try {
            annotatedElement = annotatedElement.getDeclaredField(string2);
        }
        catch (Throwable throwable) {
            annotatedElement = null;
        }
        return annotatedElement;
    }
}

