/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzmh;
import com.google.android.gms.internal.ads.zzmi;
import java.util.concurrent.TimeoutException;

public final class zzmj {
    private final zzmi zza;
    private final zzmh zzb;
    private final zzer zzc;
    private final zzdc zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzmj(zzmh zzmh2, zzmi zzmi2, zzdc zzdc2, int n3, zzer zzer2, Looper looper) {
        this.zzb = zzmh2;
        this.zza = zzmi2;
        this.zzd = zzdc2;
        this.zzg = looper;
        this.zzc = zzer2;
        this.zzh = n3;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzmi zzc() {
        return this.zza;
    }

    public final zzmj zzd() {
        boolean bl2 = this.zzi;
        boolean bl3 = true;
        zzeq.zzf(bl2 ^ bl3);
        this.zzi = bl3;
        this.zzb.zzm(this);
        return this;
    }

    public final zzmj zze(Object object) {
        zzeq.zzf(this.zzi ^ true);
        this.zzf = object;
        return this;
    }

    public final zzmj zzf(int n3) {
        zzeq.zzf(this.zzi ^ true);
        this.zze = n3;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(boolean bl2) {
        synchronized (this) {
            boolean bl3 = this.zzj;
            this.zzj = bl2 |= bl3;
            this.zzk = bl2 = true;
            this.notifyAll();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzi(long l2) {
        synchronized (this) {
            try {
                block10: {
                    boolean bl2;
                    boolean bl3 = this.zzi;
                    zzeq.zzf(bl3);
                    Object object = this.zzg;
                    object = object.getThread();
                    Thread thread2 = Thread.currentThread();
                    if (object != thread2) {
                        bl3 = true;
                    } else {
                        bl3 = false;
                        object = null;
                    }
                    zzeq.zzf(bl3);
                    long l3 = SystemClock.elapsedRealtime() + l2;
                    while (!(bl2 = this.zzk)) {
                        long l4 = 0L;
                        long l7 = l2 - l4;
                        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object2 > 0) {
                            this.wait(l2);
                            l2 = SystemClock.elapsedRealtime();
                            l2 = l3 - l2;
                            continue;
                        }
                        break block10;
                    }
                    return this.zzj;
                }
                String string2 = "Message delivery timed out.";
                TimeoutException timeoutException = new TimeoutException(string2);
                throw timeoutException;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean zzj() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return false;
    }
}

