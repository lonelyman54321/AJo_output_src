/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbj;
import com.google.android.gms.internal.gtm.zzbk;
import com.google.android.gms.internal.gtm.zzbl;
import com.google.android.gms.internal.gtm.zzbm;
import com.google.android.gms.internal.gtm.zzbn;
import com.google.android.gms.internal.gtm.zzbo;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbw;
import com.google.android.gms.internal.gtm.zzcj;
import com.google.android.gms.internal.gtm.zzcy;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzev;
import com.google.android.gms.internal.gtm.zzfa;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzbp
extends zzbr {
    private final zzcj zza;

    public zzbp(zzbu zzbu2, zzbv zzbv2) {
        super(zzbu2);
        zzcj zzcj2;
        Preconditions.checkNotNull(zzbv2);
        this.zza = zzcj2 = new zzcj(zzbu2, zzbv2);
    }

    public static /* bridge */ /* synthetic */ zzcj zzb(zzbp zzbp2) {
        return zzbp2.zza;
    }

    public final long zza(zzbw zzbw2) {
        this.zzV();
        Preconditions.checkNotNull(zzbw2);
        zzr.zzh();
        zzcj zzcj2 = this.zza;
        boolean bl2 = true;
        long l2 = zzcj2.zzb(zzbw2, bl2);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            this.zza.zzk(zzbw2);
            return l3;
        }
        return l2;
    }

    public final void zzc() {
        this.zzV();
        Context context = this.zzo();
        boolean bl2 = zzev.zzb(context);
        if (bl2 && (bl2 = zzfa.zzh(context))) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            ComponentName componentName = new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService");
            intent.setComponent(componentName);
            context.startService(intent);
            return;
        }
        this.zze(null);
    }

    public final void zzd() {
        this.zza.zzW();
    }

    public final void zze(zzcy zzcy2) {
        this.zzV();
        zzr zzr2 = this.zzq();
        zzbn zzbn2 = new zzbn(this, zzcy2);
        zzr2.zzi(zzbn2);
    }

    public final void zzf(String string2, Runnable runnable2) {
        Preconditions.checkNotEmpty(string2, "campaign param can't be empty");
        zzr zzr2 = this.zzq();
        zzbj zzbj2 = new zzbj(this, string2, runnable2);
        zzr2.zzi(zzbj2);
    }

    public final void zzg() {
        this.zzV();
        this.zzw();
        zzr zzr2 = this.zzq();
        zzbm zzbm2 = new zzbm(this);
        zzr2.zzi(zzbm2);
    }

    public final void zzh(zzek zzek2) {
        Preconditions.checkNotNull(zzek2);
        this.zzV();
        this.zzF("Hit delivery requested", zzek2);
        zzr zzr2 = this.zzq();
        zzbl zzbl2 = new zzbl(this, zzek2);
        zzr2.zzi(zzbl2);
    }

    public final void zzi() {
        zzr.zzh();
        this.zza.zzl();
    }

    public final void zzj() {
        zzr.zzh();
        this.zza.zzm();
    }

    public final void zzk() {
        this.zzV();
        zzr.zzh();
        zzr.zzh();
        zzcj zzcj2 = this.zza;
        zzcj2.zzV();
        zzcj2.zzN("Service disconnected");
    }

    public final void zzl(int n3) {
        this.zzV();
        Object object = n3;
        this.zzF("setLocalDispatchPeriod (sec)", object);
        object = this.zzq();
        zzbk zzbk2 = new zzbk(this, n3);
        ((zzr)object).zzi(zzbk2);
    }

    public final void zzm() {
        this.zza.zzZ();
    }

    public final boolean zzn() {
        InterruptedException interruptedException2;
        block7: {
            ExecutionException executionException2;
            block6: {
                this.zzV();
                Object object = this.zzq();
                zzbo zzbo2 = new zzbo(this);
                object = ((zzr)object).zzg(zzbo2);
                zzbo2 = null;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long l2 = 4;
                try {
                    object.get(l2, timeUnit);
                    return true;
                }
                catch (TimeoutException timeoutException) {
                }
                catch (ExecutionException executionException2) {
                    break block6;
                }
                catch (InterruptedException interruptedException2) {
                    break block7;
                }
                this.zzR("syncDispatchLocalHits timed out", timeoutException);
                return false;
            }
            this.zzJ("syncDispatchLocalHits failed", executionException2);
            return false;
        }
        this.zzR("syncDispatchLocalHits interrupted", interruptedException2);
        return false;
    }
}

