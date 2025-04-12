/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 */
package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcdj;
import com.google.android.gms.internal.ads.zzcdx;
import java.util.concurrent.TimeUnit;

public final class zzcdy {
    private final long zza;
    private long zzb;
    private boolean zzc;

    public zzcdy() {
        long l2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zzbeg zzbeg2 = zzbep.zzD;
        long l3 = (Long)zzba.zzc().zza(zzbeg2);
        this.zza = l2 = timeUnit.toNanos(l3);
        this.zzc = true;
    }

    public final void zza(SurfaceTexture object, zzcdj zzcdj2) {
        long l2;
        block3: {
            block2: {
                if (zzcdj2 == null) break block2;
                l2 = object.getTimestamp();
                Object object2 = this.zzc;
                if (object2 != 0) break block3;
                long l3 = this.zzb;
                l3 = l2 - l3;
                long l4 = this.zza;
                long l7 = (l3 = Math.abs(l3)) - l4;
                object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object2 >= 0) break block3;
            }
            return;
        }
        this.zzc = false;
        this.zzb = l2;
        object = zzt.zza;
        zzcdx zzcdx2 = new zzcdx(zzcdj2);
        object.post((Runnable)zzcdx2);
    }

    public final void zzb() {
        this.zzc = true;
    }
}

