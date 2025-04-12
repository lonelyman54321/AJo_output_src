/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcbw;

final class zzcbx {
    private final Object zza;
    private volatile long zzb;
    private volatile int zzc;

    private zzcbx() {
        Object object;
        this.zza = object = new Object();
        this.zzc = 1;
        this.zzb = 0L;
    }

    public /* synthetic */ zzcbx(zzcbw object) {
        this.zza = object = new Object();
        this.zzc = 1;
        this.zzb = 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zza() {
        Object object;
        int n3;
        long l2;
        Clock clock;
        block10: {
            clock = zzu.zzB();
            l2 = clock.currentTimeMillis();
            Object object2 = this.zza;
            // MONITORENTER : object2
            int n4 = this.zzc;
            n3 = 3;
            if (n4 != n3) break block10;
            long l3 = this.zzb;
            object = zzbep.zzgg;
            zzben zzben2 = zzba.zzc();
            object = zzben2.zza((zzbeg)object);
            long l4 = (Long)(object = (Long)object);
            long l7 = (l3 += l4) - l2;
            n4 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n4 <= 0) {
                int n7;
                this.zzc = n7 = 1;
            }
        }
        // MONITOREXIT : object2
        clock = zzu.zzB();
        l2 = clock.currentTimeMillis();
        object = this.zza;
        // MONITORENTER : object
        int n8 = this.zzc;
        int n10 = 2;
        if (n8 != n10) {
            // MONITOREXIT : object
            return;
        }
        this.zzc = n3;
        n8 = this.zzc;
        if (n8 == n3) {
            this.zzb = l2;
        }
        // MONITOREXIT : object
    }
}

