/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhi;
import com.google.android.gms.internal.vision.zzma$zza;
import com.google.android.gms.internal.vision.zzma$zzb;
import com.google.android.gms.internal.vision.zzma$zzc;
import com.google.android.gms.internal.vision.zzma$zzd;
import com.google.android.gms.internal.vision.zzmc;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzma {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzma$zzd zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    static {
        long l2;
        long l3;
        long l4;
        int n3;
        int n4;
        int n7;
        Object object = zzma.zzc();
        zzb = object;
        zzc = zzhi.zzb();
        Object object2 = Long.TYPE;
        zzd = n7 = zzma.zzd(object2);
        AnnotatedElement annotatedElement = Integer.TYPE;
        zze = n4 = zzma.zzd(annotatedElement);
        Object object3 = null;
        if (object != null) {
            n3 = zzhi.zza();
            if (n3 != 0) {
                if (n7 != 0) {
                    object3 = new zzma$zzc((Unsafe)object);
                } else if (n4 != 0) {
                    object3 = new zzma$zza((Unsafe)object);
                }
            } else {
                object3 = new zzma$zzb((Unsafe)object);
            }
        }
        zzf = object3;
        zzg = zzma.zze();
        zzh = zzma.zzd();
        object = byte[].class;
        int n8 = zzma.zzb((Class)object);
        zzi = l4 = (long)n8;
        annotatedElement = boolean[].class;
        zzj = zzma.zzb(annotatedElement);
        zzk = zzma.zzc(annotatedElement);
        annotatedElement = int[].class;
        zzl = zzma.zzb(annotatedElement);
        zzm = zzma.zzc(annotatedElement);
        annotatedElement = long[].class;
        zzn = zzma.zzb(annotatedElement);
        zzo = zzma.zzc(annotatedElement);
        annotatedElement = float[].class;
        zzp = zzma.zzb(annotatedElement);
        zzq = zzma.zzc(annotatedElement);
        annotatedElement = double[].class;
        zzr = zzma.zzb(annotatedElement);
        zzs = zzma.zzc(annotatedElement);
        annotatedElement = Object[].class;
        n3 = zzma.zzb(annotatedElement);
        zzt = n3;
        n4 = zzma.zzc(annotatedElement);
        zzu = l3 = (long)n4;
        annotatedElement = zzma.zzf();
        if (annotatedElement != null && object3 != null) {
            object3 = ((zzma$zzd)object3).zza;
            l2 = ((Unsafe)object3).objectFieldOffset((Field)annotatedElement);
        } else {
            l2 = -1;
        }
        zzv = l2;
        l2 = 7;
        zzw = n7 = (int)(l4 &= l2);
        object = ByteOrder.nativeOrder();
        object2 = ByteOrder.BIG_ENDIAN;
        if (object == object2) {
            n8 = 1;
        } else {
            n8 = 0;
            object = null;
        }
        zza = n8;
    }

    private zzma() {
    }

    public static byte zza(byte[] byArray, long l2) {
        zzma$zzd zzma$zzd = zzf;
        long l3 = zzi + l2;
        return zzma$zzd.zza(byArray, l3);
    }

    public static int zza(Object object, long l2) {
        return zzf.zze(object, l2);
    }

    public static Object zza(Class clazz) {
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

    private static Field zza(Class annotatedElement, String string2) {
        try {
            annotatedElement = annotatedElement.getDeclaredField(string2);
        }
        catch (Throwable throwable) {
            annotatedElement = null;
        }
        return annotatedElement;
    }

    public static /* synthetic */ void zza(Object object, long l2, byte by2) {
        zzma.zzc(object, l2, by2);
    }

    public static void zza(Object object, long l2, double d2) {
        zzf.zza(object, l2, d2);
    }

    public static void zza(Object object, long l2, float f5) {
        zzf.zza(object, l2, f5);
    }

    public static void zza(Object object, long l2, int n3) {
        zzf.zza(object, l2, n3);
    }

    public static void zza(Object object, long l2, long l3) {
        zzf.zza(object, l2, l3);
    }

    public static void zza(Object object, long l2, Object object2) {
        zzma.zzf.zza.putObject(object, l2, object2);
    }

    public static void zza(Object object, long l2, boolean bl2) {
        zzf.zza(object, l2, bl2);
    }

    public static void zza(byte[] byArray, long l2, byte by2) {
        zzma$zzd zzma$zzd = zzf;
        long l3 = zzi + l2;
        zzma$zzd.zza((Object)byArray, l3, by2);
    }

    public static boolean zza() {
        return zzh;
    }

    private static int zzb(Class clazz) {
        boolean bl2 = zzh;
        if (bl2) {
            return zzma.zzf.zza.arrayBaseOffset(clazz);
        }
        return -1;
    }

    public static long zzb(Object object, long l2) {
        return zzf.zzf(object, l2);
    }

    public static /* synthetic */ void zzb(Object object, long l2, byte by2) {
        zzma.zzd(object, l2, by2);
    }

    public static /* synthetic */ void zzb(Object object, long l2, boolean bl2) {
        zzma.zzd(object, l2, bl2);
    }

    public static boolean zzb() {
        return zzg;
    }

    private static int zzc(Class clazz) {
        boolean bl2 = zzh;
        if (bl2) {
            return zzma.zzf.zza.arrayIndexScale(clazz);
        }
        return -1;
    }

    public static Unsafe zzc() {
        Object object = new zzmc();
        object = AccessController.doPrivileged(object);
        try {
            object = (Unsafe)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    private static void zzc(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        int n3 = zzma.zza(object, l3);
        int n4 = (~((int)l2) & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        zzma.zza(object, l3, n4);
    }

    public static /* synthetic */ void zzc(Object object, long l2, boolean bl2) {
        zzma.zze(object, l2, bl2);
    }

    public static boolean zzc(Object object, long l2) {
        return zzf.zzb(object, l2);
    }

    public static float zzd(Object object, long l2) {
        return zzf.zzc(object, l2);
    }

    private static void zzd(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        int n3 = zzma.zza(object, l3);
        int n4 = ((int)l2 & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        zzma.zza(object, l3, n4);
    }

    private static void zzd(Object object, long l2, boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        zzma.zzc(object, l2, by2);
    }

    private static boolean zzd() {
        int n3;
        Object object;
        int n4 = 3;
        int n7 = 2;
        boolean bl2 = true;
        Object object2 = Class.class;
        Class<Double> clazz = Object.class;
        Object object3 = zzb;
        if (object3 == null) {
            return false;
        }
        try {
            object3 = object3.getClass();
            object = "objectFieldOffset";
        }
        catch (Throwable throwable) {
            Logger logger = Logger.getLogger(zzma.class.getName());
            Level level = Level.WARNING;
            String string2 = String.valueOf(throwable);
            n3 = string2.length() + 71;
            clazz = new Class<Double>(n3);
            ((StringBuilder)((Object)clazz)).append("platform method missing - proto runtime falling back to safer methods: ");
            ((StringBuilder)((Object)clazz)).append(string2);
            string2 = ((StringBuilder)((Object)clazz)).toString();
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", string2);
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
        classArray = new Class[n7];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putInt";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        clazz2 = Integer.TYPE;
        classArray[n7] = clazz2;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "getLong";
        classArray = new Class[n7];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putLong";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        classArray[n7] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "getObject";
        classArray = new Class[n7];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putObject";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        classArray[n7] = clazz;
        ((Class)object3).getMethod((String)object2, classArray);
        n3 = (int)(zzhi.zza() ? 1 : 0);
        if (n3 != 0) {
            return bl2;
        }
        object2 = "getByte";
        classArray = new Class[n7];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putByte";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        clazz2 = Byte.TYPE;
        classArray[n7] = clazz2;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "getBoolean";
        classArray = new Class[n7];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putBoolean";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        clazz2 = Boolean.TYPE;
        classArray[n7] = clazz2;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "getFloat";
        classArray = new Class[n7];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putFloat";
        classArray = new Class[n4];
        classArray[0] = clazz;
        classArray[bl2] = object;
        clazz2 = Float.TYPE;
        classArray[n7] = clazz2;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "getDouble";
        classArray = new Class[n7];
        classArray[0] = clazz;
        classArray[bl2] = object;
        ((Class)object3).getMethod((String)object2, classArray);
        object2 = "putDouble";
        Class[] classArray2 = new Class[n4];
        classArray2[0] = clazz;
        classArray2[bl2] = object;
        clazz = Double.TYPE;
        classArray2[n7] = clazz;
        ((Class)object3).getMethod((String)object2, classArray2);
        return bl2;
    }

    private static boolean zzd(Class clazz) {
        String string2;
        Class clazz2;
        int n3 = 4;
        int n4 = 3;
        int n7 = 2;
        boolean bl2 = true;
        Class<byte[]> clazz3 = byte[].class;
        boolean bl3 = zzhi.zza();
        if (!bl3) {
            return false;
        }
        try {
            clazz2 = zzc;
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

    public static double zze(Object object, long l2) {
        return zzf.zzd(object, l2);
    }

    private static void zze(Object object, long l2, boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        zzma.zzd(object, l2, by2);
    }

    private static boolean zze() {
        Class[] classArray;
        Object object;
        Object object2;
        Object object3;
        Class<Object> clazz;
        CharSequence charSequence;
        String string2;
        boolean bl2;
        int n3;
        int n4;
        block43: {
            n4 = 3;
            n3 = 2;
            bl2 = true;
            string2 = "copyMemory";
            charSequence = "getLong";
            clazz = Object.class;
            object3 = zzb;
            if (object3 == null) {
                return false;
            }
            try {
                object3 = object3.getClass();
                object2 = "objectFieldOffset";
            }
            catch (Throwable throwable) {
                Logger logger = Logger.getLogger(zzma.class.getName());
                Level level = Level.WARNING;
                String string3 = String.valueOf(throwable);
                int n7 = string3.length() + 71;
                charSequence = new StringBuilder(n7);
                ((StringBuilder)charSequence).append("platform method missing - proto runtime falling back to safer methods: ");
                ((StringBuilder)charSequence).append(string3);
                string3 = ((StringBuilder)charSequence).toString();
                logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", string3);
                return false;
            }
            object = new Class[bl2];
            classArray = Field.class;
            object[0] = classArray;
            ((Class)object3).getMethod((String)object2, (Class<?>)object);
            object2 = Long.TYPE;
            object = new Class[n3];
            object[0] = clazz;
            object[bl2] = object2;
            ((Class)object3).getMethod((String)charSequence, (Class<?>)object);
            object = zzma.zzf();
            if (object != null) break block43;
            return false;
        }
        boolean bl3 = zzhi.zza();
        if (bl3) {
            return bl2;
        }
        object = "getByte";
        classArray = new Class[bl2];
        classArray[0] = object2;
        ((Class)object3).getMethod((String)object, classArray);
        object = "putByte";
        classArray = new Class[n3];
        classArray[0] = object2;
        Class<Number> clazz2 = Byte.TYPE;
        classArray[bl2] = clazz2;
        ((Class)object3).getMethod((String)object, classArray);
        object = "getInt";
        classArray = new Class[bl2];
        classArray[0] = object2;
        ((Class)object3).getMethod((String)object, classArray);
        object = "putInt";
        classArray = new Class[n3];
        classArray[0] = object2;
        clazz2 = Integer.TYPE;
        classArray[bl2] = clazz2;
        ((Class)object3).getMethod((String)object, classArray);
        object = new Class[bl2];
        object[0] = object2;
        ((Class)object3).getMethod((String)charSequence, (Class<?>)object);
        charSequence = "putLong";
        object = new Class[n3];
        object[0] = object2;
        object[bl2] = object2;
        ((Class)object3).getMethod((String)charSequence, (Class<?>)object);
        charSequence = new Class[n4];
        charSequence[0] = object2;
        charSequence[bl2] = object2;
        charSequence[n3] = object2;
        ((Class)object3).getMethod(string2, (Class<?>)((Object)charSequence));
        int n8 = 5;
        charSequence = new Class[n8];
        charSequence[0] = clazz;
        charSequence[bl2] = object2;
        charSequence[n3] = clazz;
        charSequence[n4] = object2;
        n4 = 4;
        charSequence[n4] = object2;
        ((Class)object3).getMethod(string2, (Class<?>)((Object)charSequence));
        return bl2;
    }

    public static Object zzf(Object object, long l2) {
        return zzma.zzf.zza.getObject(object, l2);
    }

    private static Field zzf() {
        Class<Long> clazz;
        Field field;
        boolean bl2 = zzhi.zza();
        Class clazz2 = Buffer.class;
        if (bl2 && (field = zzma.zza(clazz2, "effectiveDirectAddress")) != null) {
            return field;
        }
        field = zzma.zza(clazz2, "address");
        if (field != null && (clazz2 = field.getType()) == (clazz = Long.TYPE)) {
            return field;
        }
        return null;
    }

    public static /* synthetic */ byte zzg(Object object, long l2) {
        return zzma.zzk(object, l2);
    }

    public static /* synthetic */ byte zzh(Object object, long l2) {
        return zzma.zzl(object, l2);
    }

    public static /* synthetic */ boolean zzi(Object object, long l2) {
        return zzma.zzm(object, l2);
    }

    public static /* synthetic */ boolean zzj(Object object, long l2) {
        return zzma.zzn(object, l2);
    }

    private static byte zzk(Object object, long l2) {
        long l3 = (long)-4 & l2;
        int n3 = zzma.zza(object, l3);
        int n4 = (int)(((l2 ^ (long)-1) & (long)3) << 3);
        return (byte)(n3 >>> n4);
    }

    private static byte zzl(Object object, long l2) {
        long l3 = (long)-4 & l2;
        int n3 = zzma.zza(object, l3);
        int n4 = (int)((l2 & (long)3) << 3);
        return (byte)(n3 >>> n4);
    }

    private static boolean zzm(Object object, long l2) {
        byte by2 = zzma.zzk(object, l2);
        return by2 != 0;
    }

    private static boolean zzn(Object object, long l2) {
        byte by2 = zzma.zzl(object, l2);
        return by2 != 0;
    }
}

