/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbk;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzff;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzci {
    private static final Charset ISO_8859_1;
    static final Charset UTF_8;
    public static final byte[] zzkt;
    private static final ByteBuffer zzku;
    private static final zzbk zzkv;

    static {
        UTF_8 = Charset.forName("UTF-8");
        ISO_8859_1 = Charset.forName("ISO-8859-1");
        byte[] byArray = new byte[]{};
        zzkt = byArray;
        zzku = ByteBuffer.wrap(byArray);
        int n3 = byArray.length;
        zzkv = zzbk.zza(byArray, 0, n3, false);
    }

    public static Object checkNotNull(Object object) {
        object.getClass();
        return object;
    }

    public static int hashCode(byte[] byArray) {
        int n3 = byArray.length;
        int n4 = zzci.zza(n3, byArray, 0, n3);
        if (n4 == 0) {
            n4 = 1;
        }
        return n4;
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

    public static Object zza(Object object, Object object2) {
        object = ((zzdo)object).zzbc();
        object2 = (zzdo)object2;
        return object.zza((zzdo)object2).zzbi();
    }

    public static Object zza(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static int zzc(boolean bl2) {
        if (bl2) {
            return 1231;
        }
        return 1237;
    }

    public static boolean zze(byte[] byArray) {
        return zzff.zze(byArray);
    }

    public static String zzf(byte[] byArray) {
        Charset charset = UTF_8;
        String string2 = new String(byArray, charset);
        return string2;
    }

    public static boolean zzf(zzdo zzdo2) {
        return false;
    }

    public static int zzl(long l2) {
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3);
    }
}

