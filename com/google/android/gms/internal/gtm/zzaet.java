/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  libcore.io.Memory
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzaep;
import com.google.android.gms.internal.gtm.zzaeq;
import com.google.android.gms.internal.gtm.zzaer;
import com.google.android.gms.internal.gtm.zzaes;
import com.google.android.gms.internal.gtm.zzyk;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzaet {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzaes zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        long l2;
        Class[] classArray;
        boolean bl2;
        int n3;
        block14: {
            Class<Object> clazz;
            Class<Long> clazz2;
            Class[] classArray2;
            AnnotatedElement annotatedElement;
            int n4;
            Class[] classArray3;
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
                    classArray3 = zzaet.zzg();
                    zzc = classArray3;
                    n4 = zzyk.zza;
                    zzd = Memory.class;
                    annotatedElement = Long.TYPE;
                    zze = bl3 = zzaet.zzv(annotatedElement);
                    classArray2 = Integer.TYPE;
                    boolean bl4 = zzaet.zzv(classArray2);
                    Object var11_18 = null;
                    if (classArray3 != null) {
                        if (bl3) {
                            zzaer zzaer2 = new zzaer((Unsafe)classArray3);
                        } else if (bl4) {
                            zzaeq zzaeq2 = new zzaeq((Unsafe)classArray3);
                        }
                    }
                    zzf = var11_21;
                    classArray3 = "getLong";
                    clazz2 = Field.class;
                    classArray2 = "objectFieldOffset";
                    clazz = Object.class;
                    if (var11_21 != null) {
                        Unsafe unsafe = var11_21.zza;
                        try {
                            Class<?> clazz4 = unsafe.getClass();
                            Class[] classArray4 = new Class[n7];
                            classArray4[0] = clazz2;
                            clazz4.getMethod((String)classArray2, classArray4);
                            classArray4 = new Class[n8];
                            classArray4[0] = clazz;
                            classArray4[n7] = annotatedElement;
                            clazz4.getMethod((String)classArray3, classArray4);
                            annotatedElement = zzaet.zzB();
                            if (annotatedElement == null) break block12;
                            n4 = 1;
                            break block13;
                        }
                        catch (Throwable throwable) {
                            zzaet.zzh(throwable);
                        }
                    }
                }
                n4 = 0;
                annotatedElement = null;
            }
            zzg = n4;
            annotatedElement = zzf;
            if (annotatedElement != null) {
                annotatedElement = ((zzaes)((Object)annotatedElement)).zza;
                try {
                    Class<Integer> clazz5;
                    annotatedElement = annotatedElement.getClass();
                    Class[] classArray5 = new Class[n7];
                    classArray5[0] = clazz2;
                    ((Class)annotatedElement).getMethod((String)classArray2, classArray5);
                    clazz2 = "arrayBaseOffset";
                    classArray2 = new Class[n7];
                    classArray2[0] = clazz3;
                    ((Class)annotatedElement).getMethod((String)((Object)clazz2), classArray2);
                    clazz2 = "arrayIndexScale";
                    classArray2 = new Class[n7];
                    classArray2[0] = clazz3;
                    ((Class)annotatedElement).getMethod((String)((Object)clazz2), classArray2);
                    String string2 = "getInt";
                    clazz2 = Long.TYPE;
                    classArray2 = new Class[n8];
                    classArray2[0] = clazz;
                    classArray2[n7] = clazz2;
                    ((Class)annotatedElement).getMethod(string2, classArray2);
                    String string3 = "putInt";
                    classArray2 = new Class[n3];
                    classArray2[0] = clazz;
                    classArray2[n7] = clazz2;
                    classArray2[n8] = clazz5 = Integer.TYPE;
                    ((Class)annotatedElement).getMethod(string3, classArray2);
                    Class[] classArray6 = new Class[n8];
                    classArray6[0] = clazz;
                    classArray6[n7] = clazz2;
                    ((Class)annotatedElement).getMethod((String)classArray3, classArray6);
                    String string4 = "putLong";
                    classArray3 = new Class[n3];
                    classArray3[0] = clazz;
                    classArray3[n7] = clazz2;
                    classArray3[n8] = clazz2;
                    ((Class)annotatedElement).getMethod(string4, classArray3);
                    String string5 = "getObject";
                    classArray3 = new Class[n8];
                    classArray3[0] = clazz;
                    classArray3[n7] = clazz2;
                    ((Class)annotatedElement).getMethod(string5, classArray3);
                    String string6 = "putObject";
                    classArray = new Class[n3];
                    classArray[0] = clazz;
                    classArray[n7] = clazz2;
                    classArray[n8] = clazz;
                    ((Class)annotatedElement).getMethod(string6, classArray);
                    n3 = 1;
                    break block14;
                }
                catch (Throwable throwable) {
                    zzaet.zzh(throwable);
                }
            }
            n3 = 0;
            classArray = null;
        }
        zzh = n3;
        n3 = zzaet.zzz(byte[].class);
        zza = l2 = (long)n3;
        classArray = boolean[].class;
        zzaet.zzz(classArray);
        zzaet.zzA(classArray);
        classArray = int[].class;
        zzaet.zzz(classArray);
        zzaet.zzA(classArray);
        classArray = long[].class;
        zzaet.zzz(classArray);
        zzaet.zzA(classArray);
        classArray = float[].class;
        zzaet.zzz(classArray);
        zzaet.zzA(classArray);
        classArray = double[].class;
        zzaet.zzz(classArray);
        zzaet.zzA(classArray);
        classArray = Object[].class;
        zzaet.zzz(classArray);
        zzaet.zzA(classArray);
        classArray = zzaet.zzB();
        if (classArray != null && (object = zzf) != null) {
            object = ((zzaes)object).zza;
            ((Unsafe)object).objectFieldOffset((Field)classArray);
        }
        if ((classArray = ByteOrder.nativeOrder()) == (object = ByteOrder.BIG_ENDIAN)) {
            bl2 = true;
        }
        zzb = bl2;
    }

    private zzaet() {
    }

    private static int zzA(Class clazz) {
        boolean bl2 = zzh;
        if (bl2) {
            return zzaet.zzf.zza.arrayIndexScale(clazz);
        }
        return -1;
    }

    private static Field zzB() {
        Class clazz = Buffer.class;
        Field field = zzaet.zzC(clazz, "effectiveDirectAddress");
        if (field == null) {
            Class<Long> clazz2;
            field = zzaet.zzC(clazz, "address");
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
        Object object2 = zzf;
        Unsafe unsafe = ((zzaes)object2).zza;
        long l3 = (long)-4 & l2;
        int n3 = unsafe.getInt(object, l3);
        int n4 = (~((int)l2) & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        object2 = ((zzaes)object2).zza;
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        ((Unsafe)object2).putInt(object, l3, n4);
    }

    private static void zzE(Object object, long l2, byte by2) {
        Object object2 = zzf;
        Unsafe unsafe = ((zzaes)object2).zza;
        long l3 = (long)-4 & l2;
        int n3 = unsafe.getInt(object, l3);
        int n4 = ((int)l2 & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        object2 = ((zzaes)object2).zza;
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        ((Unsafe)object2).putInt(object, l3, n4);
    }

    public static double zza(Object object, long l2) {
        return zzf.zza(object, l2);
    }

    public static float zzb(Object object, long l2) {
        return zzf.zzb(object, l2);
    }

    public static int zzc(Object object, long l2) {
        return zzaet.zzf.zza.getInt(object, l2);
    }

    public static long zzd(Object object, long l2) {
        return zzaet.zzf.zza.getLong(object, l2);
    }

    public static Object zze(Class clazz) {
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

    public static Object zzf(Object object, long l2) {
        return zzaet.zzf.zza.getObject(object, l2);
    }

    public static Unsafe zzg() {
        Object object = new zzaep();
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
        Logger logger = Logger.getLogger(zzaet.class.getName());
        Level level = Level.WARNING;
        object = object.toString();
        object = "platform method missing - proto runtime falling back to safer methods: ".concat((String)object);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", (String)object);
    }

    public static /* synthetic */ void zzi(Object object, long l2, boolean bl2) {
        zzaet.zzD(object, l2, (byte)(bl2 ? 1 : 0));
    }

    public static /* synthetic */ void zzj(Object object, long l2, boolean bl2) {
        zzaet.zzE(object, l2, (byte)(bl2 ? 1 : 0));
    }

    public static /* bridge */ /* synthetic */ void zzk(Object object, long l2, byte by2) {
        zzaet.zzD(object, l2, by2);
    }

    public static /* bridge */ /* synthetic */ void zzl(Object object, long l2, byte by2) {
        zzaet.zzE(object, l2, by2);
    }

    public static void zzm(Object object, long l2, boolean bl2) {
        zzf.zzc(object, l2, bl2);
    }

    public static void zzn(byte[] byArray, long l2, byte by2) {
        zzaes zzaes2 = zzf;
        long l3 = zza + l2;
        zzaes2.zzd(byArray, l3, by2);
    }

    public static void zzo(Object object, long l2, double d2) {
        zzf.zze(object, l2, d2);
    }

    public static void zzp(Object object, long l2, float f5) {
        zzf.zzf(object, l2, f5);
    }

    public static void zzq(Object object, long l2, int n3) {
        zzaet.zzf.zza.putInt(object, l2, n3);
    }

    public static void zzr(Object object, long l2, long l3) {
        zzaet.zzf.zza.putLong(object, l2, l3);
    }

    public static void zzs(Object object, long l2, Object object2) {
        zzaet.zzf.zza.putObject(object, l2, object2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object object, long l2) {
        Unsafe unsafe = zzaet.zzf.zza;
        long l3 = (long)-4 & l2;
        int n3 = unsafe.getInt(object, l3);
        l2 ^= (long)-1;
        long l4 = 3;
        l2 &= l4;
        int n4 = 3;
        int n7 = (int)(l2 <<= n4);
        return (n3 = (int)((byte)(n3 >>> n7 & 0xFF))) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object object, long l2) {
        Unsafe unsafe = zzaet.zzf.zza;
        long l3 = (long)-4 & l2;
        int n3 = unsafe.getInt(object, l3);
        long l4 = 3;
        l2 &= l4;
        int n4 = 3;
        int n7 = (int)(l2 <<= n4);
        return (n3 = (int)((byte)(n3 >>> n7 & 0xFF))) != 0;
    }

    public static boolean zzv(Class clazz) {
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

    public static boolean zzw(Object object, long l2) {
        return zzf.zzg(object, l2);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class clazz) {
        boolean bl2 = zzh;
        if (bl2) {
            return zzaet.zzf.zza.arrayBaseOffset(clazz);
        }
        return -1;
    }
}

