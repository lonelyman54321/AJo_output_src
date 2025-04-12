/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzjh;

abstract class zzbb {
    private static volatile Handler zza;
    private final zzjh zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzbb(zzjh zzjh2) {
        Preconditions.checkNotNull(zzjh2);
        this.zzb = zzjh2;
        zzba zzba2 = new zzba(this, zzjh2);
        this.zzc = zzba2;
    }

    public static /* bridge */ /* synthetic */ void zza(zzbb zzbb2, long l2) {
        zzbb2.zzd = 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Handler zzd() {
        Object object = zza;
        if (object != null) {
            return zza;
        }
        object = zzbb.class;
        synchronized (object) {
            try {
                Handler handler = zza;
                if (handler != null) return zza;
                zzjh zzjh2 = this.zzb;
                zzjh2 = zzjh2.zza();
                zzjh2 = zzjh2.getMainLooper();
                zza = handler = new zzdj((Looper)zzjh2);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void zza() {
        this.zzd = 0L;
        Handler handler = this.zzd();
        Runnable runnable2 = this.zzc;
        handler.removeCallbacks(runnable2);
    }

    public final void zza(long l2) {
        this.zza();
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            Runnable runnable2;
            this.zzd = l3 = this.zzb.zzb().currentTimeMillis();
            Object object = this.zzd();
            boolean bl2 = object.postDelayed(runnable2 = this.zzc, l2);
            if (!bl2) {
                object = this.zzb.zzj().zzg();
                Long l7 = l2;
                String string2 = "Failed to schedule delayed post. time";
                ((zzgq)object).zza(string2, l7);
            }
        }
    }

    public abstract void zzb();

    public final boolean zzc() {
        long l2 = this.zzd;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }
}

