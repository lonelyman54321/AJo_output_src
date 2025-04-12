/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzzb;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzaco {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] byArray = new byte[]{};
        zzb = byArray;
        ByteBuffer.wrap(byArray);
        zzzb.zzH(byArray, 0, 0, false);
    }

    public static int zza(boolean bl2) {
        if (bl2) {
            return 1231;
        }
        return 1237;
    }

    public static int zzb(int n3, byte[] byArray, int n4, int n7) {
        for (n4 = 0; n4 < n7; ++n4) {
            n3 *= 31;
            byte by2 = byArray[n4];
            n3 += by2;
        }
        return n3;
    }

    public static Object zzc(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException("messageType");
        throw object;
    }
}

