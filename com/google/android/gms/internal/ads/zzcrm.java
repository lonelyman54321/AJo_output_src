/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbbg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzcrm
implements zzbbg {
    private final ScheduledExecutorService zza;
    private final Clock zzb;
    private ScheduledFuture zzc;
    private long zzd;
    private long zze;
    private Runnable zzf;
    private boolean zzg;

    public zzcrm(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        long l2;
        this.zzd = l2 = (long)-1;
        this.zze = l2;
        this.zzf = null;
        this.zzg = false;
        this.zza = scheduledExecutorService;
        this.zzb = clock;
        zzu.zzb().zzc(this);
    }

    public final void zza(boolean bl2) {
        if (bl2) {
            this.zzc();
            return;
        }
        this.zzb();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block4: {
                    boolean bl2;
                    block7: {
                        long l2;
                        block5: {
                            long l3;
                            try {
                                boolean bl3 = this.zzg;
                                if (bl3) break block4;
                                Object object = this.zzc;
                                bl2 = true;
                                if (object == null || (bl3 = object.isDone())) break block5;
                                object = this.zzc;
                                object.cancel(bl2);
                                long l4 = this.zzd;
                                object = this.zzb;
                                l3 = object.elapsedRealtime();
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                            this.zze = l4 -= l3;
                            break block7;
                        }
                        this.zze = l2 = (long)-1;
                    }
                    this.zzg = bl2;
                    return;
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
    public final void zzc() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ScheduledFuture<?> scheduledFuture;
                boolean bl2;
                block4: {
                    try {
                        bl2 = this.zzg;
                        if (!bl2) {
                            return;
                        }
                        long l2 = this.zze;
                        long l3 = 0L;
                        long l4 = l2 - l3;
                        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (object <= 0 || (scheduledFuture = this.zzc) == null || !(bl2 = scheduledFuture.isCancelled())) break block4;
                        scheduledFuture = this.zza;
                        Runnable runnable2 = this.zzf;
                        l3 = this.zze;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        this.zzc = scheduledFuture = scheduledFuture.schedule(runnable2, l3, timeUnit);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                bl2 = false;
                scheduledFuture = null;
                this.zzg = false;
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
    public final void zzd(int n3, Runnable runnable2) {
        synchronized (this) {
            this.zzf = runnable2;
            Object object = this.zzb;
            long l2 = object.elapsedRealtime();
            long l3 = n3;
            this.zzd = l2 += l3;
            Object object2 = TimeUnit.MILLISECONDS;
            object = this.zza;
            object2 = object.schedule(runnable2, l3, (TimeUnit)((Object)object2));
            this.zzc = object2;
            return;
        }
    }
}

