/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.ScheduledExecutorService;

public final class zzbft
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzbft(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
    }

    public final /* synthetic */ Object zzb() {
        Context context = ((zzcjj)this.zza).zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.zzb.zzb();
        zzbfu zzbfu2 = new zzbfu();
        zzfmn zzfmn2 = (zzfmn)this.zzd.zzb();
        zzbfs zzbfs2 = new zzbfs(context, scheduledExecutorService, zzbfu2, zzfmn2);
        return zzbfs2;
    }
}

