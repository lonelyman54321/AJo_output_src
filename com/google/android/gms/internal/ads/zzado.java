/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfu;

public final class zzado {
    public final String zza;

    private zzado(int n3, int n4, String string2) {
        this.zza = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static zzado zza(zzfu zzfu2) {
        Object object;
        zzfu2.zzL(2);
        int n3 = zzfu2.zzm();
        int n4 = n3 >> 1;
        n3 &= 1;
        int n7 = zzfu2.zzm() >> 3;
        int n8 = 4;
        int n10 = 5;
        if (n4 != n8 && n4 != n10 && n4 != (n8 = 7)) {
            n8 = 8;
            if (n4 == n8) {
                object = "hev1";
            } else {
                n8 = 9;
                if (n4 != n8) return null;
                object = "avc3";
            }
        } else {
            object = "dvhe";
        }
        n7 |= (n3 <<= n10);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        object = ".0";
        stringBuilder.append((String)object);
        stringBuilder.append(n4);
        n10 = 10;
        if (n7 >= n10) {
            object = ".";
        }
        stringBuilder.append((String)object);
        stringBuilder.append(n7);
        String string2 = stringBuilder.toString();
        return new zzado(n4, n7, string2);
    }
}

