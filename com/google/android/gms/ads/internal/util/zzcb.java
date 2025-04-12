/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;

public final class zzcb {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc;

    public zzcb(long l2) {
        Object object;
        this.zzc = object = new Object();
        this.zza = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(long l2) {
        Object object = this.zzc;
        synchronized (object) {
            this.zza = l2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzb() {
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                long l2;
                try {
                    Clock clock = zzu.zzB();
                    l2 = clock.elapsedRealtime();
                    long l3 = this.zzb;
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
                this.zzb = l2;
                return true;
            }
            throw throwable2;
        }
    }
}

