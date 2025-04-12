/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeg;
import com.google.android.gms.internal.auth.zzei;
import com.google.android.gms.internal.auth.zzfa;
import com.google.android.gms.internal.auth.zzfw;
import com.google.android.gms.internal.auth.zzhm;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzez {
    static final Charset zza;
    static final Charset zzb;
    static final Charset zzc;
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzei zzf;

    static {
        zzeg zzeg2;
        zza = Charset.forName("US-ASCII");
        zzb = Charset.forName("UTF-8");
        zzc = Charset.forName("ISO-8859-1");
        Object var0 = null;
        byte[] byArray = new byte[]{};
        zzd = byArray;
        zze = ByteBuffer.wrap(byArray);
        Object object = zzeg2;
        zzeg2 = new zzeg(byArray, 0, 0, false, null);
        try {
            zzeg2.zza(0);
            zzf = zzeg2;
            return;
        }
        catch (zzfa zzfa2) {
            object = new IllegalArgumentException(zzfa2);
            throw object;
        }
    }

    public static int zza(boolean bl2) {
        if (bl2) {
            return 1231;
        }
        return 1237;
    }

    public static int zzb(byte[] byArray) {
        int n3 = byArray.length;
        int n4 = zzez.zzd(n3, byArray, 0, n3);
        if (n4 == 0) {
            n4 = 1;
        }
        return n4;
    }

    public static int zzc(long l2) {
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public static int zzd(int n3, byte[] byArray, int n4, int n7) {
        for (n4 = 0; n4 < n7; ++n4) {
            n3 *= 31;
            byte by2 = byArray[n4];
            n3 += by2;
        }
        return n3;
    }

    public static Object zze(Object object) {
        object.getClass();
        return object;
    }

    public static Object zzf(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object zzg(Object object, Object object2) {
        object = ((zzfw)object).zzd();
        object2 = (zzfw)object2;
        return object.zzc((zzfw)object2).zzg();
    }

    public static String zzh(byte[] byArray) {
        Charset charset = zzb;
        String string2 = new String(byArray, charset);
        return string2;
    }

    public static boolean zzi(byte[] byArray) {
        return zzhm.zzc(byArray);
    }
}

