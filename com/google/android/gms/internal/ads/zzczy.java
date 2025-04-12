/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzczp;
import com.google.android.gms.internal.ads.zzczq;
import com.google.android.gms.internal.ads.zzczr;
import com.google.android.gms.internal.ads.zzczs;
import com.google.android.gms.internal.ads.zzczt;
import com.google.android.gms.internal.ads.zzczx;
import com.google.android.gms.internal.ads.zzdey;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdjo;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzczy
extends zzdez
implements zzczp {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd = false;

    public zzczy(zzczx zzczx2, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzb = scheduledExecutorService;
        this.zzo(zzczx2, executor);
    }

    public final void zza(zze zze2) {
        zzczq zzczq2 = new zzczq(zze2);
        this.zzq(zzczq2);
    }

    public final void zzb() {
        zzczr zzczr2 = new zzczr();
        this.zzq(zzczr2);
    }

    public final void zzc(zzdjo zzdjo2) {
        boolean bl2 = this.zzd;
        if (bl2) {
            return;
        }
        Object object = this.zzc;
        if (object != null) {
            boolean bl3 = true;
            object.cancel(bl3);
        }
        object = new zzczt(zzdjo2);
        this.zzq((zzdey)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzd() {
        synchronized (this) {
            boolean bl2;
            Object object = "Timeout waiting for show call succeed to be called.";
            zzm.zzg((String)object);
            String string2 = "Timeout for show call succeed.";
            object = new zzdjo(string2);
            this.zzc((zzdjo)object);
            this.zzd = bl2 = true;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    ScheduledFuture scheduledFuture = this.zzc;
                    if (scheduledFuture != null) {
                        boolean bl2 = true;
                        scheduledFuture.cancel(bl2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzf() {
        ScheduledFuture<?> scheduledFuture = zzbep.zzkJ;
        int n3 = (Integer)zzba.zzc().zza((zzbeg)((Object)scheduledFuture));
        zzczs zzczs2 = new zzczs(this);
        long l2 = n3;
        scheduledFuture = this.zzb;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.zzc = scheduledFuture = scheduledFuture.schedule(zzczs2, l2, timeUnit);
    }
}

