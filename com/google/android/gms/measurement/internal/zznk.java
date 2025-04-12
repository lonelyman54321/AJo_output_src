/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zznj;

final class zznk
implements Runnable {
    private final /* synthetic */ zzfz zza;
    private final /* synthetic */ zznj zzb;

    public zznk(zznj zznj2, zzfz zzfz2) {
        this.zza = zzfz2;
        this.zzb = zznj2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        zznj zznj2 = this.zzb;
        synchronized (zznj2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object = this.zzb;
                        Object object2 = null;
                        zznj.zza((zznj)object, false);
                        object = this.zzb;
                        object = ((zznj)object).zza;
                        boolean bl2 = ((zzme)object).zzal();
                        if (bl2) break block3;
                        object = this.zzb;
                        object = ((zznj)object).zza;
                        object = ((zzme)object).zzj();
                        object = ((zzgo)object).zzc();
                        object2 = "Connected to remote service";
                        ((zzgq)object).zza((String)object2);
                        object = this.zzb;
                        object = ((zznj)object).zza;
                        object2 = this.zza;
                        ((zzme)object).zza((zzfz)object2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

