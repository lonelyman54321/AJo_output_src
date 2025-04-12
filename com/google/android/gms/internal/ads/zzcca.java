/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.math.BigInteger;

public final class zzcca {
    private BigInteger zza;
    private String zzb;

    public zzcca() {
        BigInteger bigInteger;
        this.zza = bigInteger = BigInteger.ONE;
        this.zzb = "0";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zza() {
        synchronized (this) {
            Object object = this.zza;
            object = ((BigInteger)object).toString();
            BigInteger bigInteger = this.zza;
            BigInteger bigInteger2 = BigInteger.ONE;
            this.zza = bigInteger = bigInteger.add(bigInteger2);
            this.zzb = object;
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzb() {
        synchronized (this) {
            return this.zzb;
        }
    }
}

