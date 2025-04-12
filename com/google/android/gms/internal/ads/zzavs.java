/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzauj;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzavk;
import com.google.android.gms.internal.ads.zzavl;
import com.google.android.gms.internal.ads.zzavm;
import com.google.android.gms.internal.ads.zzavo;
import com.google.android.gms.internal.ads.zzavr;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzaws;
import com.google.android.gms.internal.ads.zzhac;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzavs {
    static boolean zza = false;
    static final CountDownLatch zzb;
    public static final /* synthetic */ int zzc;
    private static MessageDigest zzd;
    private static final Object zze;
    private static final Object zzf;

    static {
        Object object;
        zze = object = new Object();
        zzf = object = new Object();
        zzb = object = new CountDownLatch(1);
    }

    public static zzaus zza(zzauj zzauj2) {
        zzatp zzatp2 = zzaus.zza();
        long l2 = zzauj2.zza();
        zzatp2.zzJ(l2);
        return (zzaus)zzatp2.zzbn();
    }

    public static String zzb(byte[] object, String object2) {
        boolean bl2;
        int n3 = 255;
        Vector vector = zzavs.zzc(object, n3);
        int n4 = 1;
        if (vector != null && !(bl2 = vector.isEmpty())) {
            zzavk zzavk2 = zzavl.zza();
            int n7 = vector.size();
            for (int i3 = 0; i3 < n7; i3 += n4) {
                Object object3 = zzavs.zzg((byte[])vector.get(i3), (String)object2, false);
                int n8 = 256;
                object3 = zzhac.zzv(object3, 0, n8);
                zzavk2.zza((zzhac)object3);
            }
            object = zzavs.zzf(object);
            object2 = zzhac.zzb;
            int n10 = ((byte[])object).length;
            object = zzhac.zzv(object, 0, n10);
            zzavk2.zzc((zzhac)object);
            object = ((zzavl)zzavk2.zzbn()).zzaV();
        } else {
            object = zzavs.zzg(zzavs.zza(zzauj.zzu).zzaV(), (String)object2, n4 != 0);
        }
        return zzavo.zza(object, n4 != 0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Vector zzc(byte[] byArray, int n3) {
        n3 = byArray.length;
        if (n3 <= 0) {
            return null;
        }
        n3 += 254;
        Vector<byte[]> vector = new Vector<byte[]>();
        int n4 = 0;
        while (true) {
            int n7;
            int n8 = 255;
            int n10 = n3 / 255;
            if (n4 >= n10) {
                return vector;
            }
            n10 = n4 * 255;
            try {
                n7 = byArray.length;
                int n14 = n7 - n10;
                if (n14 > n8) {
                    n7 = n10 + 255;
                }
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                return null;
            }
            {
                byte[] byArray2 = Arrays.copyOfRange(byArray, n10, n7);
                vector.add(byArray2);
                ++n4;
                continue;
            }
            break;
        }
    }

    public static /* bridge */ /* synthetic */ void zzd(MessageDigest messageDigest) {
        zzd = messageDigest;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zze() {
        Object object = zzf;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        boolean bl2 = zza;
                        if (bl2) break block3;
                        zza = bl2 = true;
                        zzavr zzavr2 = new zzavr(null);
                        Thread thread2 = new Thread(zzavr2);
                        thread2.start();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] zzf(byte[] object) {
        Object object2 = zze;
        synchronized (object2) {
            Throwable throwable2;
            block8: {
                Object object3;
                try {
                    zzavs.zze();
                    object3 = null;
                    try {
                        Object object4 = zzb;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        long l2 = 2;
                        boolean bl2 = ((CountDownLatch)object4).await(l2, timeUnit);
                        if (bl2 && (object4 = zzd) != null) {
                            object3 = object4;
                        }
                    }
                    catch (InterruptedException interruptedException) {}
                    if (object3 != null) {
                        ((MessageDigest)object3).reset();
                        ((MessageDigest)object3).update((byte[])object);
                        object = zzd;
                        return object.digest();
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object = new NoSuchAlgorithmException;
                object3 = "Cannot compute hash";
                object((String)object3);
                throw object;
            }
            throw throwable2;
        }
    }

    private static byte[] zzg(byte[] byArray, String object, boolean n3) {
        int n4;
        Object object2;
        zzavt[] zzavtArray;
        SecureRandom secureRandom;
        Object object3;
        int n7 = byArray.length;
        int n8 = 1;
        n8 = n8 != n3 ? 255 : 239;
        if (n7 > n8) {
            byArray = zzavs.zza(zzauj.zzu).zzaV();
        }
        n7 = n8 + 1;
        int n10 = byArray.length;
        int n14 = n10;
        if (n10 < n8) {
            object3 = new byte[n8 -= n10];
            secureRandom = new SecureRandom();
            secureRandom.nextBytes((byte[])object3);
            zzavtArray = ByteBuffer.allocate(n7).put((byte)n14);
            byArray = zzavtArray.put(byArray).put((byte[])object3).array();
        } else {
            zzavtArray = ByteBuffer.allocate(n7).put((byte)n14);
            byArray = zzavtArray.put(byArray).array();
        }
        n7 = 256;
        if (n3 != 0) {
            object2 = zzavs.zzf(byArray);
            object3 = ByteBuffer.allocate(n7);
            object2 = ((ByteBuffer)object3).put((byte[])object2);
            byArray = ((ByteBuffer)object2).put(byArray).array();
        }
        object2 = new byte[n7];
        zzavtArray = new zzaws();
        zzavtArray = zzavtArray.zzcG;
        n8 = zzavtArray.length;
        n8 = 0;
        object3 = null;
        secureRandom = null;
        for (n10 = 0; n10 < (n14 = 12); ++n10) {
            zzavt zzavt2 = zzavtArray[n10];
            zzavt2.zza(byArray, (byte[])object2);
        }
        if (object != null && (n4 = ((String)object).length()) > 0) {
            n4 = ((String)object).length();
            if (n4 > (n7 = 32)) {
                object = ((String)object).substring(0, n7);
            }
            byArray = ((String)object).getBytes("UTF-8");
            object = new zzavm(byArray);
            ((zzavm)object).zza((byte[])object2);
        }
        return object2;
    }
}

