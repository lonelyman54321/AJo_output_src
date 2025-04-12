/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhh;
import com.google.android.gms.internal.vision.zzif;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzmd;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzjf {
    static final Charset zza = Charset.forName("UTF-8");
    public static final byte[] zzb;
    private static final Charset zzc;
    private static final ByteBuffer zzd;
    private static final zzif zze;

    static {
        zzc = Charset.forName("ISO-8859-1");
        byte[] byArray = new byte[]{};
        zzb = byArray;
        zzd = ByteBuffer.wrap(byArray);
        int n3 = byArray.length;
        zze = zzif.zza(byArray, 0, n3, false);
    }

    public static int zza(int n3, byte[] byArray, int n4, int n7) {
        int n8;
        for (int i3 = n4; i3 < (n8 = n4 + n7); ++i3) {
            n3 *= 31;
            n8 = byArray[i3];
            n3 += n8;
        }
        return n3;
    }

    public static int zza(long l2) {
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public static int zza(boolean bl2) {
        if (bl2) {
            return 1231;
        }
        return 1237;
    }

    public static Object zza(Object object) {
        object.getClass();
        return object;
    }

    public static Object zza(Object object, Object object2) {
        object = ((zzkk)object).zzp();
        object2 = (zzkk)object2;
        return object.zza((zzkk)object2).zze();
    }

    public static Object zza(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static boolean zza(zzkk zzkk2) {
        boolean cfr_ignored_0 = zzkk2 instanceof zzhh;
        return false;
    }

    public static boolean zza(byte[] byArray) {
        return zzmd.zza(byArray);
    }

    public static String zzb(byte[] byArray) {
        Charset charset = zza;
        String string2 = new String(byArray, charset);
        return string2;
    }

    public static int zzc(byte[] byArray) {
        int n3 = byArray.length;
        int n4 = zzjf.zza(n3, byArray, 0, n3);
        if (n4 == 0) {
            n4 = 1;
        }
        return n4;
    }
}

