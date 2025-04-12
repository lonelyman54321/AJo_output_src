/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziq;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzlm;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzkj {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] byArray = new byte[]{};
        zzb = byArray;
        ByteBuffer.wrap(byArray);
        int n3 = byArray.length;
        zzjk.zza(byArray, 0, n3, false);
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

    public static int zza(byte[] byArray) {
        int n3 = byArray.length;
        int n4 = zzkj.zza(n3, byArray, 0, n3);
        if (n4 == 0) {
            n4 = 1;
        }
        return n4;
    }

    public static Object zza(Object object) {
        object.getClass();
        return object;
    }

    public static Object zza(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static boolean zza(zzlm zzlm2) {
        boolean cfr_ignored_0 = zzlm2 instanceof zziq;
        return false;
    }
}

