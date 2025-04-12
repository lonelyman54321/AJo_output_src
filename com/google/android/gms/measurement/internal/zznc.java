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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzgm;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;

final class zznc
implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzp zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzbl zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzme zzf;

    public zznc(zzme zzme2, boolean bl2, zzp zzp2, boolean bl3, zzbl zzbl2, String string2) {
        this.zza = bl2;
        this.zzb = zzp2;
        this.zzc = bl3;
        this.zzd = zzbl2;
        this.zze = string2;
        this.zzf = zzme2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block17: {
            block15: {
                block16: {
                    block14: {
                        block18: {
                            var1_1 = this;
                            var2_2 = zzme.zza(this.zzf);
                            if (var2_2 == null) {
                                this.zzf.zzj().zzg().zza("Discarding data. Failed to send event to service");
                                return;
                            }
                            var3_7 = this.zza;
                            if (!var3_7) break block18;
                            Preconditions.checkNotNull(this.zzb);
                            var4_8 = this.zzf;
                            var5_10 = this.zzc;
                            if (var5_10) {
                                var5_10 = false;
                                var6_11 = null;
                            } else {
                                var6_11 = this.zzd;
                            }
                            var7_13 = var1_1.zzb;
                            var4_8.zza((zzfz)var2_2, (AbstractSafeParcelable)var6_11, var7_13);
                            break block17;
                        }
                        var4_9 = this.zzf.zze();
                        var6_12 = zzbn.zzco;
                        var3_7 = var4_9.zza(var6_12);
                        var8_14 = 0L;
                        try {
                            var10_15 = this.zze;
                            var11_16 = TextUtils.isEmpty((CharSequence)var10_15);
                            if (var11_16) {
                                var10_15 = this.zzb;
                                Preconditions.checkNotNull(var10_15);
                                if (!var3_7) break block14;
                                var10_15 = this.zzf;
                                var10_15 = var10_15.zzu;
                                var10_15 = var10_15.zzb();
                                var12_17 = var10_15.currentTimeMillis();
                            }
                            ** GOTO lbl-1000
                        }
                        catch (RemoteException var2_5) {
                            var15_20 = var8_14;
                            var17_23 = var8_14;
                            break block15;
                        }
                        try {
                            var14_18 = this.zzf;
                            var14_18 = var14_18.zzu;
                            var14_18 = var14_18.zzb();
                            var15_20 = var14_18.elapsedRealtime();
                            break block16;
                        }
                        catch (RemoteException var2_3) {
                            var15_20 = var8_14;
lbl51:
                            // 2 sources

                            while (true) {
                                var17_23 = var12_17;
                                break block15;
                                break;
                            }
                        }
                    }
                    var12_17 = var8_14;
                    var15_20 = var8_14;
                }
                try {
                    var19_24 = var1_1.zzd;
                    var20_25 = var1_1.zzb;
                    var2_2.zza((zzbl)var19_24, var20_25);
                    if (!var3_7) break block17;
                    var2_2 = var1_1.zzf;
                    var2_2 = var2_2.zzj();
                    var2_2 = var2_2.zzq();
                    var19_24 = "Logging telemetry for logEvent";
                    var2_2.zza((String)var19_24);
                    var2_2 = var1_1.zzf;
                    var2_2 = var2_2.zzu;
                    var19_24 = zzgm.zza((zzic)var2_2);
                    var2_2 = var1_1.zzf;
                    var2_2 = var2_2.zzu;
                    var2_2 = var2_2.zzb();
                    var21_26 = var2_2.currentTimeMillis();
                    var2_2 = var1_1.zzf;
                    var2_2 = var2_2.zzu;
                    var2_2 = var2_2.zzb();
                    var23_27 = var2_2.elapsedRealtime() - var15_20;
                }
                catch (RemoteException var2_6) {
                    ** continue;
                }
                var25_21 = (int)var23_27;
                var26_22 = 36301;
                {
                    var19_24.zza(var26_22, 0, var12_17, var21_26, (int)var25_21);
                    break block17;
                }
lbl-1000:
                // 1 sources

                {
                    var10_15 = this.zzd;
                    var27_28 = this.zze;
                    var14_19 = this.zzf;
                    var14_19 = var14_19.zzj();
                    var14_19 = var14_19.zzy();
                    var2_2.zza((zzbl)var10_15, var27_28, (String)var14_19);
                    break block17;
                }
            }
            var10_15 = var1_1.zzf.zzj().zzg();
            var27_29 = "Failed to send event to the service";
            var10_15.zza(var27_29, var2_4);
            if (var3_7 && (var25_21 = var17_23 == var8_14 ? 0 : (var17_23 < var8_14 ? -1 : 1)) != false) {
                var2_4 = zzgm.zza(var1_1.zzf.zzu);
                var28_30 = var1_1.zzf.zzu.zzb().currentTimeMillis();
                var4_9 = var1_1.zzf.zzu.zzb();
                var30_31 = var4_9.elapsedRealtime() - var15_20;
                var32_32 = (int)var30_31;
                var33_33 = 36301;
                var26_22 = 13;
                var2_4.zza(var33_33, var26_22, var17_23, var28_30, var32_32);
            }
        }
        zzme.zzg(var1_1.zzf);
    }
}

