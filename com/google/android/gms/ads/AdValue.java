/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads;

public final class AdValue {
    private final int zza;
    private final String zzb;
    private final long zzc;

    private AdValue(int n3, String string2, long l2) {
        this.zza = n3;
        this.zzb = string2;
        this.zzc = l2;
    }

    public static AdValue zza(int n3, String string2, long l2) {
        AdValue adValue = new AdValue(n3, string2, l2);
        return adValue;
    }

    public String getCurrencyCode() {
        return this.zzb;
    }

    public int getPrecisionType() {
        return this.zza;
    }

    public long getValueMicros() {
        return this.zzc;
    }
}

