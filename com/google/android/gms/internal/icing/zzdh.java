/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzch;
import com.google.android.gms.internal.icing.zzci;
import com.google.android.gms.internal.icing.zzdj;
import com.google.android.gms.internal.icing.zzee;
import com.google.android.gms.internal.icing.zzfr;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzdh {
    static final Charset zza;
    static final Charset zzb;
    public static final byte[] zzc;
    public static final ByteBuffer zzd;
    public static final zzci zze;

    static {
        zzch zzch2;
        zza = Charset.forName("UTF-8");
        zzb = Charset.forName("ISO-8859-1");
        Object var0 = null;
        byte[] byArray = new byte[]{};
        zzc = byArray;
        zzd = ByteBuffer.wrap(byArray);
        Object object = zzch2;
        zzch2 = new zzch(byArray, 0, 0, false, null);
        try {
            zzch2.zza(0);
            zze = zzch2;
            return;
        }
        catch (zzdj zzdj2) {
            object = new IllegalArgumentException(zzdj2);
            throw object;
        }
    }

    public static Object zza(Object object) {
        object.getClass();
        return object;
    }

    public static Object zzb(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static boolean zzc(byte[] byArray) {
        return zzfr.zza(byArray);
    }

    public static String zzd(byte[] byArray) {
        Charset charset = zza;
        String string2 = new String(byArray, charset);
        return string2;
    }

    public static int zze(long l2) {
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }

    public static int zzf(boolean bl2) {
        if (bl2) {
            return 1231;
        }
        return 1237;
    }

    public static int zzg(byte[] byArray) {
        int n3 = byArray.length;
        int n4 = zzdh.zzh(n3, byArray, 0, n3);
        if (n4 == 0) {
            n4 = 1;
        }
        return n4;
    }

    public static int zzh(int n3, byte[] byArray, int n4, int n7) {
        for (n4 = 0; n4 < n7; ++n4) {
            n3 *= 31;
            byte by2 = byArray[n4];
            n3 += by2;
        }
        return n3;
    }

    public static Object zzi(Object object, Object object2) {
        object = ((zzee)object).zzy();
        object2 = (zzee)object2;
        return object.zzf((zzee)object2).zzl();
    }
}

