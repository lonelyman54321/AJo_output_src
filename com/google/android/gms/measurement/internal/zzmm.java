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

final class zzmm
implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzp zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzme zzd;

    public zzmm(zzme zzme2, AtomicReference atomicReference, zzp zzp2, boolean bl2) {
        this.zza = atomicReference;
        this.zzb = zzp2;
        this.zzc = bl2;
        this.zzd = zzme2;
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
            block11: {
                try {
                    var2_2 = this.zzd;
                    var2_2 = zzme.zza((zzme)var2_2);
                    if (var2_2 == null) {
                        var2_2 = this.zzd;
                        var2_2 = var2_2.zzj();
                        var2_2 = var2_2.zzg();
                        var3_7 = "Failed to get all user properties; not connected to service";
                        var2_2.zza(var3_7);
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var2_4) {
                    ** GOTO lbl45
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
                    break block11;
                }
lbl-1000:
                // 1 sources

                {
                    var3_8 = this.zzb;
                    Preconditions.checkNotNull(var3_8);
                    var3_8 = this.zza;
                    var4_11 = this.zzb;
                    var5_13 = this.zzc;
                    var2_2 = var2_2.zza(var4_11, var5_13);
                    var3_8.set(var2_2);
                    var2_2 = this.zzd;
                    zzme.zzg((zzme)var2_2);
                }
                {
                    var2_2 = this.zza;
                    var2_2.notify();
                    ** GOTO lbl44
                }
lbl-1000:
                // 1 sources

                {
                    var3_9 = this.zzd;
                    var3_9 = var3_9.zzj();
                    var3_9 = var3_9.zzg();
                    var4_12 = "Failed to get all user properties; remote exception";
                    var3_9.zza(var4_12, (Object)var2_5);
                }
                {
                    var2_6 = this.zza;
                    var2_6.notify();
lbl44:
                    // 2 sources

                    return;
lbl45:
                    // 1 sources

                    var3_10 = this.zza;
                    var3_10.notify();
                    throw var2_4;
                }
            }
            throw var2_3;
        }
    }
}

