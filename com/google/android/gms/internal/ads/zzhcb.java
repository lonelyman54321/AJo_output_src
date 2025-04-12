/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzham;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzhcb {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzham zzf;

    static {
        byte[] byArray = new byte[]{};
        zzd = byArray;
        zze = ByteBuffer.wrap(byArray);
        zzf = zzham.zzJ(byArray, 0, 0, false);
    }

    public static int zza(boolean bl2) {
        if (bl2) {
            return 1231;
        }
        return 1237;
    }

    public static int zzb(int n3, byte[] byArray, int n4, int n7) {
        int n8;
        for (int i3 = n4; i3 < (n8 = n4 + n7); ++i3) {
            n3 *= 31;
            n8 = byArray[i3];
            n3 += n8;
        }
        return n3;
    }

    public static Object zzc(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static String zzd(byte[] byArray) {
        Charset charset = zzb;
        String string2 = new String(byArray, charset);
        return string2;
    }
}

