/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzevw;
import com.google.android.gms.internal.ads.zzewe;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfal;
import com.google.android.gms.internal.ads.zzfav;
import com.google.android.gms.internal.ads.zzfbq;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfbh {
    public static zzexw zza(zzfal zzexw2, zzevw zzevw2, ScheduledExecutorService scheduledExecutorService, int n3) {
        if (n3 == 0) {
            zzexw2 = zzevw2;
        }
        zzewe zzewe2 = new zzewe(zzexw2, 0L, scheduledExecutorService);
        return zzewe2;
    }

    public static zzexw zzb(zzfav zzfav2, ScheduledExecutorService scheduledExecutorService) {
        zzbeg zzbeg2 = zzbep.zzee;
        long l2 = (Long)zzba.zzc().zza(zzbeg2);
        zzewe zzewe2 = new zzewe(zzfav2, l2, scheduledExecutorService);
        return zzewe2;
    }

    public static zzexw zzc(zzfbq zzfbq2, ScheduledExecutorService scheduledExecutorService) {
        zzewe zzewe2 = new zzewe(zzfbq2, 0L, scheduledExecutorService);
        return zzewe2;
    }
}

