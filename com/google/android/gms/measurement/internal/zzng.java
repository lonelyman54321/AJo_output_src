/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class zzng
implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzp zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zzme zzg;

    public zzng(zzme zzme2, AtomicReference atomicReference, String string2, String string3, String string4, zzp zzp2, boolean bl2) {
        this.zza = atomicReference;
        this.zzb = string2;
        this.zzc = string3;
        this.zzd = string4;
        this.zze = zzp2;
        this.zzf = bl2;
        this.zzg = zzme2;
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
            block13: {
                try {
                    var2_2 = this.zzg;
                    var2_2 = zzme.zza((zzme)var2_2);
                    if (var2_2 == null) {
                        var2_2 = this.zzg;
                        var2_2 = var2_2.zzj();
                        var2_2 = var2_2.zzg();
                        var3_6 = "(legacy) Failed to get user properties; not connected to service";
                        var4_10 = this.zzb;
                        var4_10 = zzgo.zza((String)var4_10);
                        var5_14 = this.zzc;
                        var6_18 = this.zzd;
                        var2_2.zza((String)var3_6, var4_10, var5_14, var6_18);
                        var2_2 = this.zza;
                        var3_6 = Collections.emptyList();
                        var2_2.set(var3_6);
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var2_4) {
                    ** GOTO lbl71
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
                    break block13;
                }
lbl-1000:
                // 1 sources

                {
                    var3_7 = this.zzb;
                    var7_21 = TextUtils.isEmpty((CharSequence)var3_7);
                    if (var7_21) {
                        var3_7 = this.zze;
                        Preconditions.checkNotNull(var3_7);
                        var3_7 = this.zza;
                        var4_11 = this.zzc;
                        var5_15 = this.zzd;
                        var8_22 = this.zzf;
                        var9_23 = this.zze;
                        var2_2 = var2_2.zza(var4_11, var5_15, var8_22, var9_23);
                        var3_7.set(var2_2);
                    } else {
                        var3_7 = this.zza;
                        var4_12 = this.zzb;
                        var5_16 = this.zzc;
                        var6_19 = this.zzd;
                        var10_24 = this.zzf;
                        var2_2 = var2_2.zza(var4_12, var5_16, var6_19, var10_24);
                        var3_7.set(var2_2);
                    }
                    var2_2 = this.zzg;
                    zzme.zzg((zzme)var2_2);
                }
                {
                    var2_2 = this.zza;
                    var2_2.notify();
                    ** GOTO lbl70
                }
lbl-1000:
                // 1 sources

                {
                    var3_8 = this.zzg;
                    var3_8 = var3_8.zzj();
                    var3_8 = var3_8.zzg();
                    var4_13 = "(legacy) Failed to get user properties; remote exception";
                    var5_17 = this.zzb;
                    var5_17 = zzgo.zza((String)var5_17);
                    var6_20 = this.zzc;
                    var3_8.zza(var4_13, var5_17, var6_20, (Object)var2_5);
                    var2_2 = this.zza;
                    var3_8 = Collections.emptyList();
                    var2_2.set(var3_8);
                }
                {
                    var2_2 = this.zza;
                    var2_2.notify();
lbl70:
                    // 2 sources

                    return;
lbl71:
                    // 1 sources

                    var3_9 = this.zza;
                    var3_9.notify();
                    throw var2_4;
                }
            }
            throw var2_3;
        }
    }
}

