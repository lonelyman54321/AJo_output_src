/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;

public final class zzfgs {
    private final Clock zza;
    private final Object zzb;
    private volatile long zzc;
    private volatile int zzd;

    public zzfgs(Clock clock) {
        Object object;
        this.zzb = object = new Object();
        this.zzd = 1;
        this.zzc = 0L;
        this.zza = clock;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zze() {
        Clock clock = this.zza;
        long l2 = clock.currentTimeMillis();
        Object object = this.zzb;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        int n3;
                        int n4 = this.zzd;
                        int n7 = 3;
                        if (n4 != n7) break block3;
                        long l3 = this.zzc;
                        Object object2 = zzbep.zzgg;
                        zzben zzben2 = zzba.zzc();
                        object2 = zzben2.zza((zzbeg)object2);
                        long l4 = (Long)(object2 = (Long)object2);
                        long l7 = (l3 += l4) - l2;
                        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object3 > 0) break block3;
                        this.zzd = n3 = 1;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzf(int n3, int n4) {
        this.zze();
        Object object = this.zzb;
        Clock clock = this.zza;
        long l2 = clock.currentTimeMillis();
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    int n7 = this.zzd;
                    if (n7 != n3) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.zzd = n4;
                n3 = this.zzd;
                if (n3 == (n4 = 3)) {
                    this.zzc = l2;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zza() {
        this.zzf(2, 3);
    }

    public final void zzb(boolean bl2) {
        int n3 = 2;
        int n4 = 1;
        if (bl2) {
            this.zzf(n4, n3);
            return;
        }
        this.zzf(n3, n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzc() {
        Object object = this.zzb;
        synchronized (object) {
            this.zze();
            boolean bl2 = this.zzd;
            boolean bl3 = 3 != 0;
            if (bl2 != bl3) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd() {
        Object object = this.zzb;
        synchronized (object) {
            this.zze();
            boolean bl2 = this.zzd;
            boolean bl3 = 2 != 0;
            if (bl2 != bl3) return false;
            return true;
        }
    }
}

