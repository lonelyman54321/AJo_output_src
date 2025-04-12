/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzbfs {
    private MotionEvent zza;
    private MotionEvent zzb;
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzfmn zze;
    private final zzbfu zzf;

    public zzbfs(Context context, ScheduledExecutorService scheduledExecutorService, zzbfu zzbfu2, zzfmn zzfmn2) {
        MotionEvent motionEvent;
        this.zza = motionEvent = MotionEvent.obtain((long)0L, (long)0L, (int)1, (float)0.0f, (float)0.0f, (int)0);
        this.zzb = motionEvent = MotionEvent.obtain((long)0L, (long)0L, (int)0, (float)0.0f, (float)0.0f, (int)0);
        this.zzc = context;
        this.zzd = scheduledExecutorService;
        this.zzf = zzbfu2;
        this.zze = zzfmn2;
    }

    public final ListenableFuture zza() {
        zzgfk zzgfk2 = zzgfk.zzu(zzgft.zzh(null));
        long l2 = (Long)zzbgj.zzc.zze();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ScheduledExecutorService scheduledExecutorService = this.zzd;
        return (zzgfk)zzgft.zzo(zzgfk2, l2, timeUnit, scheduledExecutorService);
    }

    public final void zzb(MotionEvent motionEvent) {
        long l2;
        MotionEvent motionEvent2;
        long l3;
        long l4;
        long l7;
        long l8;
        int n3;
        int n4 = motionEvent.getAction();
        if (n4 == (n3 = 1) && (l8 = (l7 = (l4 = motionEvent.getEventTime()) - (l3 = (motionEvent2 = this.zza).getEventTime())) == 0L ? 0 : (l7 < 0L ? -1 : 1)) > 0) {
            this.zza = motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
            return;
        }
        n4 = motionEvent.getAction();
        if (n4 == 0 && (l8 = (l2 = (l4 = motionEvent.getEventTime()) - (l3 = (motionEvent2 = this.zzb).getEventTime())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
            this.zzb = motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
        }
    }
}

