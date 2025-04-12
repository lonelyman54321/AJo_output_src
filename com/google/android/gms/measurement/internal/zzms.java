/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.atomic.AtomicReference;

final class zzms
implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzp zzb;
    private final /* synthetic */ zzme zzc;

    public zzms(zzme zzme2, AtomicReference atomicReference, zzp zzp2) {
        this.zza = atomicReference;
        this.zzb = zzp2;
        this.zzc = zzme2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        var1_1 = this.zza;
        synchronized (var1_1) {
            block14: {
                try {
                    var2_2 = this.zzc;
                    var2_2 = var2_2.zzk();
                    var2_2 = var2_2.zzp();
                    var3_7 = var2_2.zzh();
                    if (!var3_7) {
                        var2_2 = this.zzc;
                        var2_2 = var2_2.zzj();
                        var2_2 = var2_2.zzw();
                        var4_8 = "Analytics storage consent denied; will not get app instance id";
                        var2_2.zza(var4_8);
                        var2_2 = this.zzc;
                        var2_2 = var2_2.zzm();
                        var4_8 = null;
                        var2_2.zzb((String)null);
                        var2_2 = this.zzc;
                        var2_2 = var2_2.zzk();
                        var2_2 = var2_2.zze;
                        var2_2.zza(null);
                        var2_2 = this.zza;
                        var2_2.set(null);
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var2_4) {
                    ** GOTO lbl77
                }
                catch (RemoteException var2_5) {
                    ** GOTO lbl-1000
                }
                try {
                    var2_2 = this.zza;
                    var2_2.notify();
                    return;
                }
                catch (Throwable var2_3) {
                    break block14;
                }
lbl-1000:
                // 1 sources

                {
                    var2_2 = this.zzc;
                    if ((var2_2 = zzme.zza((zzme)var2_2)) != null) ** GOTO lbl-1000
                    var2_2 = this.zzc;
                    var2_2 = var2_2.zzj();
                    var2_2 = var2_2.zzg();
                    var4_9 = "Failed to get app instance id";
                    var2_2.zza(var4_9);
                }
                {
                    var2_2 = this.zza;
                    var2_2.notify();
                    return;
                }
lbl-1000:
                // 1 sources

                {
                    var4_10 = this.zzb;
                    Preconditions.checkNotNull(var4_10);
                    var4_10 = this.zza;
                    var5_13 = this.zzb;
                    var2_2 = var2_2.zzb(var5_13);
                    var4_10.set(var2_2);
                    var2_2 = this.zza;
                    var2_2 = var2_2.get();
                    var2_2 = (String)var2_2;
                    if (var2_2 != null) {
                        var4_10 = this.zzc;
                        var4_10 = var4_10.zzm();
                        var4_10.zzb((String)var2_2);
                        var4_10 = this.zzc;
                        var4_10 = var4_10.zzk();
                        var4_10 = var4_10.zze;
                        var4_10.zza((String)var2_2);
                    }
                    var2_2 = this.zzc;
                    zzme.zzg((zzme)var2_2);
                }
                {
                    var2_2 = this.zza;
                    var2_2.notify();
                    ** GOTO lbl76
                }
lbl-1000:
                // 1 sources

                {
                    var4_11 = this.zzc;
                    var4_11 = var4_11.zzj();
                    var4_11 = var4_11.zzg();
                    var5_14 = "Failed to get app instance id";
                    var4_11.zza(var5_14, (Object)var2_5);
                }
                {
                    var2_6 = this.zza;
                    var2_6.notify();
lbl76:
                    // 2 sources

                    return;
lbl77:
                    // 1 sources

                    var4_12 = this.zza;
                    var4_12.notify();
                    throw var2_4;
                }
            }
            throw var2_3;
        }
    }
}

