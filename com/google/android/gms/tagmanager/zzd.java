/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Process
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tagmanager.zza;
import com.google.android.gms.tagmanager.zzb;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzc;
import com.google.android.gms.tagmanager.zzdc;

public final class zzd {
    private static final Object zza;
    private static zzd zzb;
    private volatile long zzc = 900000L;
    private volatile long zzd;
    private volatile boolean zze;
    private volatile AdvertisingIdClient$Info zzf;
    private volatile long zzg;
    private volatile long zzh;
    private final Context zzi;
    private final Clock zzj;
    private final Thread zzk;
    private final Object zzl;
    private final zzc zzm;

    static {
        Object object;
        zza = object = new Object();
    }

    public zzd(Context object, zzc object2, Clock clock) {
        long l2;
        long l3;
        this.zzd = l3 = 30000L;
        this.zze = false;
        this.zzl = object2 = new Object();
        this.zzm = object2 = new zza(this);
        this.zzj = clock;
        if (object != null) {
            this.zzi = object = object.getApplicationContext();
        } else {
            object = null;
            this.zzi = null;
        }
        this.zzg = l2 = clock.currentTimeMillis();
        object2 = new zzb(this);
        super((Runnable)object2);
        this.zzk = object;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzd zzd2) {
        return zzd2.zzi;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzd zzb(Context object) {
        Object object2 = zzb;
        if (object2 != null) return zzb;
        object2 = zza;
        synchronized (object2) {
            try {
                zzd zzd2 = zzb;
                if (zzd2 != null) return zzb;
                Clock clock = DefaultClock.getInstance();
                zzb = zzd2 = new zzd((Context)object, null, clock);
                object = zzd2.zzk;
                ((Thread)object).start();
                return zzb;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzd(zzd zzd2) {
        int n3 = 10;
        Process.setThreadPriority((int)n3);
        while (true) {
            Object object;
            Object object2;
            block11: {
                long l2;
                if ((n3 = (int)(zzd2.zze ? 1 : 0)) != 0) {
                    return;
                }
                object2 = zzd2.zzm.zza();
                if (object2 != null) {
                    long l3;
                    zzd2.zzf = object2;
                    zzd2.zzh = l3 = zzd2.zzj.currentTimeMillis();
                    object2 = zzdc.zzb;
                    object = "Obtained fresh AdvertisingId info from GmsCore.";
                    ((zzbb)object2).zzb((String)object);
                }
                synchronized (zzd2) {
                    zzd2.notifyAll();
                }
                try {
                    object2 = zzd2.zzl;
                    synchronized (object2) {
                        object = zzd2.zzl;
                        l2 = zzd2.zzc;
                    }
                }
                catch (InterruptedException interruptedException) {
                    break block11;
                }
                {
                    object.wait(l2);
                    continue;
                }
            }
            object2 = zzdc.zzb;
            object = "sleep interrupted in AdvertiserDataPoller thread; continuing";
            ((zzbb)object2).zzb((String)object);
        }
    }

    private final void zzg() {
        Clock clock = this.zzj;
        long l2 = clock.currentTimeMillis();
        long l3 = this.zzh;
        long l4 = (l2 -= l3) - (l3 = 3600000L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            clock = null;
            this.zzf = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzh() {
        Object object = this.zzj;
        long l2 = object.currentTimeMillis();
        long l3 = this.zzg;
        long l4 = (l2 -= l3) - (l3 = this.zzd);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 > 0) {
            object = this.zzl;
            synchronized (object) {
                Object object3 = this.zzl;
                object3.notify();
            }
            this.zzg = l2 = this.zzj.currentTimeMillis();
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
            block6: {
                try {
                    boolean bl2 = this.zze;
                    if (!bl2) {
                        this.zzh();
                        long l2 = 500L;
                        this.wait(l2);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (InterruptedException interruptedException) {}
                return;
            }
            throw throwable2;
        }
    }

    public final String zzc() {
        AdvertisingIdClient$Info advertisingIdClient$Info = this.zzf;
        if (advertisingIdClient$Info == null) {
            this.zzi();
        } else {
            this.zzh();
        }
        this.zzg();
        advertisingIdClient$Info = this.zzf;
        if (advertisingIdClient$Info == null) {
            return null;
        }
        return this.zzf.getId();
    }

    public final void zze() {
        this.zze = true;
        this.zzk.interrupt();
    }

    public final boolean zzf() {
        boolean bl2;
        AdvertisingIdClient$Info advertisingIdClient$Info = this.zzf;
        if (advertisingIdClient$Info == null) {
            this.zzi();
        } else {
            this.zzh();
        }
        this.zzg();
        advertisingIdClient$Info = this.zzf;
        return advertisingIdClient$Info == null || (bl2 = (advertisingIdClient$Info = this.zzf).isLimitAdTrackingEnabled());
        {
        }
    }
}

