/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.vision.clearcut;

public final class zzb {
    private final long zza;
    private final Object zzb;
    private long zzc;

    public zzb(double d2) {
        long l2;
        Object object;
        this.zzb = object = new Object();
        this.zzc = Long.MIN_VALUE;
        this.zza = l2 = Math.round(30000.0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zza() {
        Object object = this.zzb;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                long l2;
                try {
                    l2 = System.currentTimeMillis();
                    long l3 = this.zzc;
                    long l4 = this.zza;
                    long l7 = (l3 += l4) - l2;
                    long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (l8 > 0) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.zzc = l2;
                return true;
            }
            throw throwable2;
        }
    }
}

