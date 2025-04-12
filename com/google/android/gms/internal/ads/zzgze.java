/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgze {
    private final byte[] zza;

    private zzgze(byte[] byArray, int n3, int n4) {
        byte[] byArray2 = new byte[n4];
        this.zza = byArray2;
        System.arraycopy(byArray, 0, byArray2, 0, n4);
    }

    public static zzgze zzb(byte[] object) {
        if (object != null) {
            int n3 = ((byte[])object).length;
            zzgze zzgze2 = new zzgze((byte[])object, 0, n3);
            return zzgze2;
        }
        object = new NullPointerException;
        object("data must be non-null");
        throw object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzgze;
        if (!bl2) {
            return false;
        }
        object = ((zzgze)object).zza;
        byte[] byArray = this.zza;
        return Arrays.equals((byte[])object, byArray);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        char c2;
        Object object = this.zza;
        int n3 = ((byte[])object).length;
        n3 += n3;
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (n3 = 0; n3 < (c2 = ((byte[])object).length); ++n3) {
            c2 = object[n3];
            char c3 = (c2 & 0xFF) >> 4;
            String string2 = "0123456789abcdef";
            c3 = string2.charAt(c3);
            stringBuilder.append(c3);
            c2 &= 0xF;
            c2 = string2.charAt(c2);
            stringBuilder.append(c2);
        }
        object = stringBuilder.toString();
        return cP.a("Bytes(", (String)object, ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzc() {
        byte[] byArray = this.zza;
        int n3 = byArray.length;
        byte[] byArray2 = new byte[n3];
        System.arraycopy(byArray, 0, byArray2, 0, n3);
        return byArray2;
    }
}

