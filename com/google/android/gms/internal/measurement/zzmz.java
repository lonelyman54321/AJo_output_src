/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzir;
import com.google.android.gms.internal.measurement.zzmy;
import com.google.android.gms.internal.measurement.zzmz$zza;
import com.google.android.gms.internal.measurement.zzmz$zzb;
import com.google.android.gms.internal.measurement.zzmz$zzc;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzmz {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzmz$zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /*
     * Unable to fully structure code
     */
    static {
        zzmz.zzb = var0 = zzmz.zzb();
        zzmz.zzc = zzir.zza();
        var1_1 = Long.TYPE;
        zzmz.zzd = var2_2 = zzmz.zzd(var1_1);
        var3_3 = Integer.TYPE;
        zzmz.zze = var4_4 = zzmz.zzd(var3_3);
        if (var0 == null) ** GOTO lbl-1000
        if (var2_2) {
            var1_1 = new zzmz$zza(var0);
        } else if (var4_4 != 0) {
            var1_1 = new zzmz$zzb(var0);
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = false;
            var1_1 = null;
        }
        zzmz.zzf = var1_1;
        var5_5 = false;
        var0 = null;
        if (var1_1 == null) {
            var4_4 = 0;
            var3_3 = null;
        } else {
            var4_4 = var1_1.zzb();
        }
        zzmz.zzg = var4_4;
        if (var1_1 == null) {
            var4_4 = 0;
            var3_3 = null;
        } else {
            var4_4 = var1_1.zza();
        }
        zzmz.zzh = var4_4;
        var4_4 = zzmz.zzb(byte[].class);
        zzmz.zzi = var6_6 = (long)var4_4;
        var3_3 = boolean[].class;
        zzmz.zzb(var3_3);
        zzmz.zzc(var3_3);
        var3_3 = int[].class;
        zzmz.zzb(var3_3);
        zzmz.zzc(var3_3);
        var3_3 = long[].class;
        zzmz.zzb(var3_3);
        zzmz.zzc(var3_3);
        var3_3 = float[].class;
        zzmz.zzb(var3_3);
        zzmz.zzc(var3_3);
        var3_3 = double[].class;
        zzmz.zzb(var3_3);
        zzmz.zzc(var3_3);
        var3_3 = Object[].class;
        zzmz.zzb(var3_3);
        zzmz.zzc(var3_3);
        var3_3 = zzmz.zze();
        if (var3_3 != null && var1_1 != null) {
            var1_1 = var1_1.zza;
            var1_1.objectFieldOffset((Field)var3_3);
        }
        if ((var1_1 = ByteOrder.nativeOrder()) == (var3_3 = ByteOrder.BIG_ENDIAN)) {
            var5_5 = true;
        }
        zzmz.zza = var5_5;
    }

    private zzmz() {
    }

    public static double zza(Object object, long l2) {
        return zzf.zza(object, l2);
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

    public static /* synthetic */ Field zza() {
        return zzmz.zze();
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
        zzmz.zzc(object, l2, by2);
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
        zzmz.zzf.zza.putObject(object, l2, object2);
    }

    public static /* synthetic */ void zza(Object object, long l2, boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        zzmz.zzc(object, l2, by2);
    }

    public static /* synthetic */ void zza(Throwable object) {
        Logger logger = Logger.getLogger(zzmz.class.getName());
        Level level = Level.WARNING;
        object = String.valueOf(object);
        object = "platform method missing - proto runtime falling back to safer methods: ".concat((String)object);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", (String)object);
    }

    public static void zza(byte[] byArray, long l2, byte by2) {
        zzmz$zzc zzmz$zzc = zzf;
        long l3 = zzi + l2;
        zzmz$zzc.zza((Object)byArray, l3, by2);
    }

    public static float zzb(Object object, long l2) {
        return zzf.zzb(object, l2);
    }

    private static int zzb(Class clazz) {
        boolean bl2 = zzh;
        if (bl2) {
            return zzmz.zzf.zza.arrayBaseOffset(clazz);
        }
        return -1;
    }

    public static Unsafe zzb() {
        Object object = new zzmy();
        object = AccessController.doPrivileged(object);
        try {
            object = (Unsafe)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    public static /* synthetic */ void zzb(Object object, long l2, byte by2) {
        zzmz.zzd(object, l2, by2);
    }

    public static /* synthetic */ void zzb(Object object, long l2, boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        zzmz.zzd(object, l2, by2);
    }

    private static int zzc(Class clazz) {
        boolean bl2 = zzh;
        if (bl2) {
            return zzmz.zzf.zza.arrayIndexScale(clazz);
        }
        return -1;
    }

    public static int zzc(Object object, long l2) {
        return zzf.zzd(object, l2);
    }

    private static void zzc(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        int n3 = zzmz.zzc(object, l3);
        int n4 = (~((int)l2) & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        zzmz.zza(object, l3, n4);
    }

    public static void zzc(Object object, long l2, boolean bl2) {
        zzf.zza(object, l2, bl2);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static long zzd(Object object, long l2) {
        return zzf.zze(object, l2);
    }

    private static void zzd(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        int n3 = zzmz.zzc(object, l3);
        int n4 = ((int)l2 & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        zzmz.zza(object, l3, n4);
    }

    public static boolean zzd() {
        return zzg;
    }

    private static boolean zzd(Class clazz) {
        String string2;
        Class clazz2;
        int n3 = 4;
        int n4 = 3;
        int n7 = 2;
        boolean bl2 = true;
        Class<byte[]> clazz3 = byte[].class;
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

    public static Object zze(Object object, long l2) {
        return zzmz.zzf.zza.getObject(object, l2);
    }

    private static Field zze() {
        Class<Long> clazz;
        Class clazz2 = Buffer.class;
        Field field = zzmz.zza(clazz2, "effectiveDirectAddress");
        if (field != null) {
            return field;
        }
        field = zzmz.zza(clazz2, "address");
        if (field != null && (clazz2 = field.getType()) == (clazz = Long.TYPE)) {
            return field;
        }
        return null;
    }

    public static /* synthetic */ boolean zzf(Object object, long l2) {
        long l3 = (long)-4 & l2;
        int n3 = zzmz.zzc(object, l3);
        l2 ^= (long)-1;
        l3 = 3;
        l2 &= l3;
        int n4 = 3;
        int n7 = (int)(l2 <<= n4);
        return (n3 = (int)((byte)(n3 >>> n7))) != 0;
    }

    public static /* synthetic */ boolean zzg(Object object, long l2) {
        long l3 = (long)-4 & l2;
        int n3 = zzmz.zzc(object, l3);
        l3 = 3;
        l2 &= l3;
        int n4 = 3;
        int n7 = (int)(l2 <<= n4);
        return (n3 = (int)((byte)(n3 >>> n7))) != 0;
    }

    public static boolean zzh(Object object, long l2) {
        return zzf.zzc(object, l2);
    }
}

