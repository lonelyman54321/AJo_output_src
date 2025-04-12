/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.internal.ads.zzcra;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzdad;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdhk;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzend
implements zzg {
    final AtomicBoolean zza;
    private final zzczj zzb;
    private final zzdad zzc;
    private final zzdhk zzd;
    private final zzdhc zze;
    private final zzcra zzf;

    public zzend(zzczj zzczj2, zzdad zzdad2, zzdhk zzdhk2, zzdhc zzdhc2, zzcra zzcra2) {
        AtomicBoolean atomicBoolean;
        this.zza = atomicBoolean = new AtomicBoolean(false);
        this.zzb = zzczj2;
        this.zzc = zzdad2;
        this.zzd = zzdhk2;
        this.zze = zzdhc2;
        this.zzf = zzcra2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(View view) {
        synchronized (this) {
            Object object = this.zza;
            boolean bl2 = true;
            boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
            if (!bl3) {
                return;
            }
            object = this.zzf;
            ((zzcra)object).zzr();
            object = this.zze;
            ((zzdhc)object).zza(view);
            return;
        }
    }

    public final void zzb() {
        Object object = this.zza;
        boolean bl2 = ((AtomicBoolean)object).get();
        if (bl2) {
            object = this.zzb;
            ((zzczj)object).onAdClicked();
        }
    }

    public final void zzc() {
        Object object = this.zza;
        boolean bl2 = ((AtomicBoolean)object).get();
        if (bl2) {
            this.zzc.zza();
            object = this.zzd;
            ((zzdhk)object).zza();
        }
    }
}

