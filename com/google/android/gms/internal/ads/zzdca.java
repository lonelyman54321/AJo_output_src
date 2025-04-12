/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzdbz;
import com.google.android.gms.internal.ads.zzdez;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzdca
extends zzdez {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private long zzd;
    private long zze;
    private boolean zzf;
    private ScheduledFuture zzg;

    public zzdca(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        long l2;
        Set set = Collections.emptySet();
        super(set);
        this.zzd = l2 = (long)-1;
        this.zze = l2;
        this.zzf = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zze(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                ScheduledFuture<?> scheduledFuture;
                long l3;
                Object object;
                block3: {
                    try {
                        boolean bl2;
                        object = this.zzg;
                        if (object == null || (bl2 = object.isDone())) break block3;
                        object = this.zzg;
                        boolean bl3 = true;
                        object.cancel(bl3);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = this.zzc;
                this.zzd = l3 = object.elapsedRealtime() + l2;
                object = this.zzb;
                TimeUnit timeUnit = null;
                zzdbz zzdbz2 = new zzdbz(this, null);
                timeUnit = TimeUnit.MILLISECONDS;
                this.zzg = scheduledFuture = object.schedule(zzdbz2, l2, timeUnit);
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
    public final void zza() {
        synchronized (this) {
            Object var1_1 = null;
            this.zzf = false;
            long l2 = 0L;
            this.zze(l2);
            return;
        }
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
                                boolean bl3 = this.zzf;
                                if (bl3) break block4;
                                Object object = this.zzg;
                                bl2 = true;
                                if (object == null || (bl3 = object.isCancelled())) break block5;
                                object = this.zzg;
                                object.cancel(bl2);
                                long l4 = this.zzd;
                                object = this.zzc;
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
                    this.zzf = bl2;
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
                ScheduledFuture scheduledFuture;
                boolean bl2;
                block4: {
                    try {
                        bl2 = this.zzf;
                        if (!bl2) {
                            return;
                        }
                        long l2 = this.zze;
                        long l3 = 0L;
                        long l4 = l2 - l3;
                        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (object <= 0 || !(bl2 = (scheduledFuture = this.zzg).isCancelled())) break block4;
                        l2 = this.zze;
                        this.zze(l2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                bl2 = false;
                scheduledFuture = null;
                this.zzf = false;
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
    public final void zzd(int n3) {
        synchronized (this) {
            Throwable throwable2;
            long l2;
            block10: {
                block9: {
                    long l3;
                    long l4;
                    block8: {
                        if (n3 <= 0) break block9;
                        try {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            long l7 = n3;
                            l2 = timeUnit.toMillis(l7);
                            n3 = (int)(this.zzf ? 1 : 0);
                            if (n3 == 0) break block8;
                            long l8 = this.zze;
                            long l12 = 0L;
                            long l14 = l8 - l12;
                            n3 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                            if (n3 <= 0 || (n3 = (int)(l2 == l8 ? 0 : (l2 < l8 ? -1 : 1))) >= 0) {
                                l2 = l8;
                            }
                            this.zze = l2;
                            return;
                        }
                        catch (Throwable throwable2) {}
                    }
                    Clock clock = this.zzc;
                    long l15 = clock.elapsedRealtime();
                    long l16 = l15 - (l4 = this.zzd);
                    n3 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                    if (n3 > 0 || (n3 = (int)((l3 = (l4 -= (l15 = (clock = this.zzc).elapsedRealtime())) - l2) == 0L ? 0 : (l3 < 0L ? -1 : 1))) > 0) break block10;
                }
                return;
            }
            this.zze(l2);
            return;
            throw throwable2;
        }
    }
}

