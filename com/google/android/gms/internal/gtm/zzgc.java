/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Process
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzfz;
import com.google.android.gms.internal.gtm.zzga;
import com.google.android.gms.internal.gtm.zzgb;
import com.google.android.gms.internal.gtm.zzhi;

public final class zzgc {
    private static final Object zza;
    private static zzgc zzb;
    private volatile long zzc = 900000L;
    private volatile long zzd;
    private volatile boolean zze;
    private volatile boolean zzf;
    private volatile AdvertisingIdClient$Info zzg;
    private volatile long zzh;
    private volatile long zzi;
    private final Context zzj;
    private final Clock zzk;
    private final Thread zzl;
    private final Object zzm;
    private final zzgb zzn;

    static {
        Object object;
        zza = object = new Object();
    }

    public zzgc(Context object, zzgb object2, Clock clock) {
        long l2;
        long l3;
        this.zzd = l3 = 30000L;
        this.zze = true;
        this.zzf = false;
        this.zzm = object2 = new Object();
        this.zzn = object2 = new zzfz(this);
        this.zzk = clock;
        if (object != null) {
            this.zzj = object = object.getApplicationContext();
        } else {
            object = null;
            this.zzj = null;
        }
        this.zzh = l2 = clock.currentTimeMillis();
        object2 = new zzga(this);
        super((Runnable)object2);
        this.zzl = object;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzgc zzgc2) {
        return zzgc2.zzj;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzgc zzb(Context object) {
        Object object2 = zzb;
        if (object2 != null) return zzb;
        object2 = zza;
        synchronized (object2) {
            try {
                zzgc zzgc2 = zzb;
                if (zzgc2 != null) return zzb;
                Clock clock = DefaultClock.getInstance();
                zzb = zzgc2 = new zzgc((Context)object, null, clock);
                object = zzgc2.zzl;
                ((Thread)object).start();
                return zzb;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* bridge */ /* synthetic */ void zzd(zzgc zzgc2, boolean bl2) {
        zzgc2.zze = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ void zze(zzgc zzgc2) {
        int n3 = 10;
        Process.setThreadPriority((int)n3);
        while (true) {
            Object object;
            block12: {
                long l2;
                Object object2;
                n3 = (int)(zzgc2.zzf ? 1 : 0);
                n3 = (int)(zzgc2.zze ? 1 : 0);
                if (n3 != 0) {
                    object = zzgc2.zzn.zza();
                } else {
                    n3 = 0;
                    object = null;
                }
                if (object != null) {
                    long l3;
                    zzgc2.zzg = object;
                    zzgc2.zzi = l3 = zzgc2.zzk.currentTimeMillis();
                    object = "Obtained fresh AdvertisingId info from GmsCore.";
                    zzhi.zzc((String)object);
                }
                synchronized (zzgc2) {
                    zzgc2.notifyAll();
                }
                try {
                    object = zzgc2.zzm;
                    synchronized (object) {
                        object2 = zzgc2.zzm;
                        l2 = zzgc2.zzc;
                    }
                }
                catch (InterruptedException interruptedException) {
                    break block12;
                }
                {
                    object2.wait(l2);
                    continue;
                }
            }
            object = "sleep interrupted in AdvertiserDataPoller thread; continuing";
            zzhi.zzc((String)object);
        }
    }

    private final void zzg() {
        Clock clock = this.zzk;
        long l2 = clock.currentTimeMillis();
        long l3 = this.zzi;
        long l4 = (l2 -= l3) - (l3 = 3600000L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            clock = null;
            this.zzg = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzh() {
        Object object = this.zzk;
        long l2 = object.currentTimeMillis();
        long l3 = this.zzh;
        long l4 = (l2 -= l3) - (l3 = this.zzd);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 > 0) {
            object = this.zzm;
            synchronized (object) {
                Object object3 = this.zzm;
                object3.notify();
            }
            this.zzh = l2 = this.zzk.currentTimeMillis();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzi() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    this.zzh();
                    long l2 = 500L;
                    this.wait(l2);
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                catch (InterruptedException interruptedException) {}
                return;
            }
            throw throwable2;
        }
    }

    public final String zzc() {
        AdvertisingIdClient$Info advertisingIdClient$Info = this.zzg;
        if (advertisingIdClient$Info == null) {
            this.zzi();
        } else {
            this.zzh();
        }
        this.zzg();
        advertisingIdClient$Info = this.zzg;
        if (advertisingIdClient$Info == null) {
            return null;
        }
        return this.zzg.getId();
    }

    public final boolean zzf() {
        AdvertisingIdClient$Info advertisingIdClient$Info = this.zzg;
        if (advertisingIdClient$Info == null) {
            this.zzi();
        } else {
            this.zzh();
        }
        this.zzg();
        advertisingIdClient$Info = this.zzg;
        if (advertisingIdClient$Info == null) {
            return true;
        }
        return this.zzg.isLimitAdTrackingEnabled();
    }
}

