/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcu;
import com.google.android.gms.internal.gtm.zzfy;

abstract class zzcv {
    private static volatile Handler zza;
    private final zzbu zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzcv(zzbu object) {
        Preconditions.checkNotNull(object);
        this.zzb = object;
        this.zzc = object = new zzcu(this);
    }

    public static /* bridge */ /* synthetic */ zzbu zzc(zzcv zzcv2) {
        return zzcv2.zzb;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzcv zzcv2, long l2) {
        zzcv2.zzd = 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Handler zzi() {
        Object object = zza;
        if (object != null) {
            return zza;
        }
        object = zzcv.class;
        synchronized (object) {
            try {
                Handler handler = zza;
                if (handler != null) return zza;
                zzbu zzbu2 = this.zzb;
                zzbu2 = zzbu2.zza();
                zzbu2 = zzbu2.getMainLooper();
                zza = handler = new zzfy((Looper)zzbu2);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public abstract void zza();

    public final long zzb() {
        long l2 = this.zzd;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return l3;
        }
        l2 = this.zzb.zzr().currentTimeMillis();
        l3 = this.zzd;
        return Math.abs(l2 - l3);
    }

    public final void zze(long l2) {
        boolean bl2 = this.zzh();
        if (bl2) {
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object < 0) {
                this.zzf();
                return;
            }
            Clock clock = this.zzb.zzr();
            long l7 = clock.currentTimeMillis();
            long l8 = this.zzd;
            long l12 = (l2 -= (l7 = Math.abs(l7 - l8))) - l3;
            object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object >= 0) {
                l3 = l2;
            }
            Object object2 = this.zzi();
            Object object3 = this.zzc;
            object2.removeCallbacks((Runnable)object3);
            object2 = this.zzi();
            object3 = this.zzc;
            boolean bl3 = object2.postDelayed((Runnable)object3, l3);
            if (!bl3) {
                object2 = this.zzb.zzm();
                object3 = l3;
                String string2 = "Failed to adjust delayed post. time";
                ((zzbq)object2).zzJ(string2, object3);
            }
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        Handler handler = this.zzi();
        Runnable runnable2 = this.zzc;
        handler.removeCallbacks(runnable2);
    }

    public final void zzg(long l2) {
        this.zzf();
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            Runnable runnable2;
            this.zzd = l3 = this.zzb.zzr().currentTimeMillis();
            Object object = this.zzi();
            boolean bl2 = object.postDelayed(runnable2 = this.zzc, l2);
            if (!bl2) {
                object = this.zzb.zzm();
                Long l7 = l2;
                String string2 = "Failed to schedule delayed post. time";
                ((zzbq)object).zzJ(string2, l7);
            }
        }
    }

    public final boolean zzh() {
        long l2 = this.zzd;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }
}

