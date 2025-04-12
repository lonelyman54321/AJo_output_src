/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzezt;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzezv
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzezv(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
    }

    public static zzezt zza(String string2, zzbcp zzbcp2, zzcby zzcby2, ScheduledExecutorService scheduledExecutorService, zzgge zzgge2) {
        zzezt zzezt2 = new zzezt(string2, zzbcp2, zzcby2, scheduledExecutorService, zzgge2);
        return zzezt2;
    }
}

