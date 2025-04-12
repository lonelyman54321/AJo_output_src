/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

class zzajo {
    public final int zzd;

    public zzajo(int n3) {
        this.zzd = n3;
    }

    public static int zze(int n3) {
        return n3 >> 24 & 0xFF;
    }

    public static String zzf(int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = (char)(n3 >> 24 & 0xFF);
        stringBuilder.append(c2);
        c2 = (char)(n3 >> 16 & 0xFF);
        stringBuilder.append(c2);
        c2 = (char)(n3 >> 8 & 0xFF);
        stringBuilder.append(c2);
        n3 = (char)(n3 & 0xFF);
        stringBuilder.append((char)n3);
        return stringBuilder.toString();
    }

    public String toString() {
        return zzajo.zzf(this.zzd);
    }
}

