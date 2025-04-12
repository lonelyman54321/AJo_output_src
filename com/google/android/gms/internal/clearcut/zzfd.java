/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzaw;
import com.google.android.gms.internal.clearcut.zzfd$zza;
import com.google.android.gms.internal.clearcut.zzfd$zzb;
import com.google.android.gms.internal.clearcut.zzfd$zzc;
import com.google.android.gms.internal.clearcut.zzfd$zzd;
import com.google.android.gms.internal.clearcut.zzfe;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzfd {
    private static final Logger logger = Logger.getLogger(zzfd.class.getName());
    private static final Class zzfb;
    private static final boolean zzfy;
    private static final Unsafe zzmh;
    private static final boolean zzpg;
    private static final boolean zzph;
    private static final zzfd$zzd zzpi;
    private static final boolean zzpj;
    private static final long zzpk;
    private static final long zzpl;
    private static final long zzpm;
    private static final long zzpn;
    private static final long zzpo;
    private static final long zzpp;
    private static final long zzpq;
    private static final long zzpr;
    private static final long zzps;
    private static final long zzpt;
    private static final long zzpu;
    private static final long zzpv;
    private static final long zzpw;
    private static final long zzpx;
    private static final long zzpy;
    private static final boolean zzpz;

    /*
     * Unable to fully structure code
     */
    static {
        var0 = zzfd.zzef();
        zzfd.zzmh = var0;
        zzfd.zzfb = zzaw.zzy();
        var1_1 = Long.TYPE;
        zzfd.zzpg = var2_2 = zzfd.zzi(var1_1);
        var3_3 = Integer.TYPE;
        zzfd.zzph = var4_4 = zzfd.zzi(var3_3);
        var5_5 = null;
        if (var0 == null) {
            while (true) {
                var2_2 = 0;
                var1_1 = null;
                break;
            }
        } else {
            var6_6 = zzaw.zzx();
            if (var6_6) {
                if (var2_2 != 0) {
                    var1_1 = new zzfd$zzb((Unsafe)var0);
                } else {
                    if (!var4_4) ** continue;
                    var1_1 = new zzfd$zza((Unsafe)var0);
                }
            } else {
                var1_1 = new zzfd$zzc((Unsafe)var0);
            }
        }
        zzfd.zzpi = var1_1;
        zzfd.zzpj = zzfd.zzeh();
        zzfd.zzfy = zzfd.zzeg();
        zzfd.zzpk = zzfd.zzg(byte[].class);
        var0 = boolean[].class;
        zzfd.zzpl = zzfd.zzg((Class)var0);
        zzfd.zzpm = zzfd.zzh((Class)var0);
        var0 = int[].class;
        zzfd.zzpn = zzfd.zzg(var0);
        zzfd.zzpo = zzfd.zzh(var0);
        var0 = long[].class;
        zzfd.zzpp = zzfd.zzg(var0);
        zzfd.zzpq = zzfd.zzh(var0);
        var0 = float[].class;
        zzfd.zzpr = zzfd.zzg(var0);
        zzfd.zzps = zzfd.zzh(var0);
        var0 = double[].class;
        zzfd.zzpt = zzfd.zzg(var0);
        zzfd.zzpu = zzfd.zzh(var0);
        var0 = Object[].class;
        var2_2 = zzfd.zzg(var0);
        zzfd.zzpv = var7_7 = (long)var2_2;
        var9_8 = zzfd.zzh(var0);
        zzfd.zzpw = var9_8;
        zzfd.zzpx = var10_9 = zzfd.zzb(zzfd.zzei());
        var1_1 = "value";
        var0 = zzfd.zzb(String.class, (String)var1_1);
        if (var0 != null && (var1_1 = var0.getType()) == (var3_3 = char[].class)) {
            var5_5 = var0;
        }
        zzfd.zzpy = var10_9 = zzfd.zzb(var5_5);
        var0 = ByteOrder.nativeOrder();
        if (var0 == (var1_1 = ByteOrder.BIG_ENDIAN)) {
            var9_8 = 1;
        } else {
            var9_8 = 0;
            var0 = null;
        }
        zzfd.zzpz = var9_8;
    }

    private zzfd() {
    }

    public static byte zza(byte[] byArray, long l2) {
        zzfd$zzd zzfd$zzd = zzpi;
        long l3 = zzpk + l2;
        return zzfd$zzd.zzx(byArray, l3);
    }

    public static long zza(Field field) {
        return zzpi.zza(field);
    }

    public static void zza(long l2, byte by2) {
        zzpi.zza(l2, by2);
    }

    private static void zza(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        int n3 = zzfd.zzj(object, l3);
        int n4 = (~((int)l2) & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        zzfd.zza(object, l3, n4);
    }

    public static void zza(Object object, long l2, double d2) {
        zzpi.zza(object, l2, d2);
    }

    public static void zza(Object object, long l2, float f5) {
        zzpi.zza(object, l2, f5);
    }

    public static void zza(Object object, long l2, int n3) {
        zzpi.zza(object, l2, n3);
    }

    public static void zza(Object object, long l2, long l3) {
        zzpi.zza(object, l2, l3);
    }

    public static void zza(Object object, long l2, Object object2) {
        zzfd.zzpi.zzqa.putObject(object, l2, object2);
    }

    public static void zza(Object object, long l2, boolean bl2) {
        zzpi.zza(object, l2, bl2);
    }

    public static void zza(byte[] byArray, long l2, byte by2) {
        zzfd$zzd zzfd$zzd = zzpi;
        long l3 = zzpk + l2;
        zzfd$zzd.zze(byArray, l3, by2);
    }

    public static void zza(byte[] byArray, long l2, long l3, long l4) {
        zzpi.zza(byArray, l2, l3, l4);
    }

    public static /* synthetic */ boolean zzah() {
        return zzpz;
    }

    private static long zzb(Field field) {
        zzfd$zzd zzfd$zzd;
        if (field != null && (zzfd$zzd = zzpi) != null) {
            return zzfd$zzd.zza(field);
        }
        return -1;
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzfd$zzd zzfd$zzd = zzpi;
        long l2 = zzpx;
        return zzfd$zzd.zzk(byteBuffer, l2);
    }

    private static Field zzb(Class annotatedElement, String string2) {
        annotatedElement = ((Class)annotatedElement).getDeclaredField(string2);
        boolean bl2 = true;
        try {
            ((AccessibleObject)annotatedElement).setAccessible(bl2);
        }
        catch (Throwable throwable) {
            annotatedElement = null;
        }
        return annotatedElement;
    }

    private static void zzb(Object object, long l2, byte by2) {
        long l3 = (long)-4 & l2;
        int n3 = zzfd.zzj(object, l3);
        int n4 = ((int)l2 & 3) << 3;
        int n7 = 255;
        int n8 = ~(n7 << n4);
        n4 = (n7 & by2) << n4 | (n3 &= n8);
        zzfd.zza(object, l3, n4);
    }

    private static void zzb(Object object, long l2, boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        zzfd.zza(object, l2, by2);
    }

    public static /* synthetic */ void zzc(Object object, long l2, byte by2) {
        zzfd.zza(object, l2, by2);
    }

    private static void zzc(Object object, long l2, boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        zzfd.zzb(object, l2, by2);
    }

    public static /* synthetic */ void zzd(Object object, long l2, byte by2) {
        zzfd.zzb(object, l2, by2);
    }

    public static /* synthetic */ void zzd(Object object, long l2, boolean bl2) {
        zzfd.zzb(object, l2, bl2);
    }

    public static /* synthetic */ void zze(Object object, long l2, boolean bl2) {
        zzfd.zzc(object, l2, bl2);
    }

    public static boolean zzed() {
        return zzfy;
    }

    public static boolean zzee() {
        return zzpj;
    }

    public static Unsafe zzef() {
        Object object = new zzfe();
        object = AccessController.doPrivileged(object);
        try {
            object = (Unsafe)object;
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    private static boolean zzeg() {
        int n3;
        Object object;
        int n4 = 3;
        int n7 = 2;
        boolean bl2 = true;
        Object object2 = Class.class;
        Class<Double> clazz = Object.class;
        Object object3 = zzmh;
        if (object3 == null) {
            return false;
        }
        try {
            object3 = object3.getClass();
            object = "objectFieldOffset";
        }
        catch (Throwable throwable) {
            Logger logger = zzfd.logger;
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
        n3 = (int)(zzaw.zzx() ? 1 : 0);
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

    private static boolean zzeh() {
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
            object3 = zzmh;
            if (object3 == null) {
                return false;
            }
            try {
                object3 = object3.getClass();
                object2 = "objectFieldOffset";
            }
            catch (Throwable throwable) {
                Logger logger = zzfd.logger;
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
            object = zzfd.zzei();
            if (object != null) break block43;
            return false;
        }
        boolean bl3 = zzaw.zzx();
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

    private static Field zzei() {
        Class<Long> clazz;
        Field field;
        boolean bl2 = zzaw.zzx();
        Class clazz2 = Buffer.class;
        if (bl2 && (field = zzfd.zzb(clazz2, "effectiveDirectAddress")) != null) {
            return field;
        }
        field = zzfd.zzb(clazz2, "address");
        if (field != null && (clazz2 = field.getType()) == (clazz = Long.TYPE)) {
            return field;
        }
        return null;
    }

    public static /* synthetic */ long zzej() {
        return zzpk;
    }

    private static int zzg(Class clazz) {
        boolean bl2 = zzfy;
        if (bl2) {
            return zzfd.zzpi.zzqa.arrayBaseOffset(clazz);
        }
        return -1;
    }

    private static int zzh(Class clazz) {
        boolean bl2 = zzfy;
        if (bl2) {
            return zzfd.zzpi.zzqa.arrayIndexScale(clazz);
        }
        return -1;
    }

    private static boolean zzi(Class clazz) {
        String string2;
        Class clazz2;
        int n3 = 4;
        int n4 = 3;
        int n7 = 2;
        boolean bl2 = true;
        Class<byte[]> clazz3 = byte[].class;
        boolean bl3 = zzaw.zzx();
        if (!bl3) {
            return false;
        }
        try {
            clazz2 = zzfb;
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

    public static int zzj(Object object, long l2) {
        return zzpi.zzj(object, l2);
    }

    public static long zzk(Object object, long l2) {
        return zzpi.zzk(object, l2);
    }

    public static boolean zzl(Object object, long l2) {
        return zzpi.zzl(object, l2);
    }

    public static float zzm(Object object, long l2) {
        return zzpi.zzm(object, l2);
    }

    public static double zzn(Object object, long l2) {
        return zzpi.zzn(object, l2);
    }

    public static Object zzo(Object object, long l2) {
        return zzfd.zzpi.zzqa.getObject(object, l2);
    }

    private static byte zzp(Object object, long l2) {
        long l3 = (long)-4 & l2;
        int n3 = zzfd.zzj(object, l3);
        int n4 = (int)(((l2 ^ (long)-1) & (long)3) << 3);
        return (byte)(n3 >>> n4);
    }

    private static byte zzq(Object object, long l2) {
        long l3 = (long)-4 & l2;
        int n3 = zzfd.zzj(object, l3);
        int n4 = (int)((l2 & (long)3) << 3);
        return (byte)(n3 >>> n4);
    }

    private static boolean zzr(Object object, long l2) {
        byte by2 = zzfd.zzp(object, l2);
        return by2 != 0;
    }

    private static boolean zzs(Object object, long l2) {
        byte by2 = zzfd.zzq(object, l2);
        return by2 != 0;
    }

    public static /* synthetic */ byte zzt(Object object, long l2) {
        return zzfd.zzp(object, l2);
    }

    public static /* synthetic */ byte zzu(Object object, long l2) {
        return zzfd.zzq(object, l2);
    }

    public static /* synthetic */ boolean zzv(Object object, long l2) {
        return zzfd.zzr(object, l2);
    }

    public static /* synthetic */ boolean zzw(Object object, long l2) {
        return zzfd.zzs(object, l2);
    }
}

