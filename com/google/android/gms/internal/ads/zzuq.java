/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzajg;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzu;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzxs;
import java.io.EOFException;
import java.util.List;
import java.util.Map;

public final class zzuq
implements zzwg {
    private final zzaea zza;
    private zzadu zzb;
    private zzadv zzc;

    public zzuq(zzaea zzaea2) {
        this.zza = zzaea2;
    }

    public final int zza(zzaeq zzaeq2) {
        zzadu zzadu2 = this.zzb;
        zzadu2.getClass();
        zzadv zzadv2 = this.zzc;
        zzadv2.getClass();
        return zzadu2.zzb(zzadv2, zzaeq2);
    }

    public final long zzb() {
        zzadv zzadv2 = this.zzc;
        if (zzadv2 != null) {
            return zzadv2.zzf();
        }
        return -1;
    }

    public final void zzc() {
        boolean bl2;
        zzadu zzadu2 = this.zzb;
        if (zzadu2 != null && (bl2 = zzadu2 instanceof zzajg)) {
            zzadu2 = (zzajg)zzadu2;
            ((zzajg)zzadu2).zza();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzu var1_1, Uri var2_3, Map var3_4, long var4_5, long var6_6, zzadx var8_7) {
        block18: {
            block17: {
                var10_9 = var4_5;
                var9_8 = new zzadi((zzu)var1_1 /* !! */ , var4_5, var6_6);
                this.zzc = var9_8;
                var1_1 /* !! */  = this.zzb;
                if (var1_1 /* !! */  != null) {
                    return;
                }
                var1_1 /* !! */  = this.zza.zza(var2_3 /* !! */ , (Map)var3_4);
                var12_10 = var1_1 /* !! */ .length;
                var13_11 = zzgbc.zzi(var12_10);
                var14_12 = 0;
                var15_13 = 1;
                if (var12_10 != var15_13) break block17;
                this.zzb = var1_1 /* !! */  = var1_1 /* !! */ [0];
                break block18;
            }
            block4: for (var16_14 = 0; var16_14 < var12_10; ++var16_14) {
                block15: {
                    block14: {
                        block16: {
                            var17_15 = var1_1 /* !! */ [var16_14];
                            try {
                                var18_16 = var17_15.zzf(var9_8);
                                if (var18_16) {
                                    this.zzb = var17_15;
                                }
                                ** GOTO lbl-1000
                            }
                            catch (Throwable var1_2) {
                                break block14;
                            }
                            catch (EOFException v0) {
                                break block15;
                            }
                            zzeq.zzf((boolean)var15_13);
                            var9_8.zzj();
                            break;
lbl-1000:
                            // 1 sources

                            {
                                var17_15 = var17_15.zzc();
                                var13_11.zzh((Iterable)var17_15);
                                var17_15 = this.zzb;
                                if (var17_15 == null && (var19_17 = (cfr_temp_0 = (var10_9 = var9_8.zzf()) - var4_5) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false) break block16;
                            }
lbl36:
                            // 2 sources

                            while (true) {
                                var20_18 = true;
                                ** GOTO lbl43
                                break;
                            }
                        }
                        while (true) {
                            var20_18 = false;
                            var17_15 = null;
lbl43:
                            // 2 sources

                            zzeq.zzf(var20_18);
                            var9_8.zzj();
                            continue block4;
                            break;
                        }
                    }
                    var2_3 /* !! */  = this.zzb;
                    if (var2_3 /* !! */  != null || (var23_20 = (cfr_temp_1 = (var21_19 = var9_8.zzf()) - var4_5) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        var14_12 = 1;
                    }
                    zzeq.zzf((boolean)var14_12);
                    var9_8.zzj();
                    throw var1_2;
                }
                if ((var17_15 = this.zzb) == null && (var19_17 = (cfr_temp_2 = (var10_9 = var9_8.zzf()) - var4_5) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) != false) ** continue;
                ** continue;
            }
            if ((var3_4 = this.zzb) == null) {
                var24_21 = new StringBuilder();
                while (true) {
                    if (var14_12 >= (var25_22 = var1_1 /* !! */ .length)) {
                        var1_1 /* !! */  = var24_21.toString();
                        var1_1 /* !! */  = cP.a("None of the available extractors (", (String)var1_1 /* !! */ , ") could read the stream.");
                        var24_21 = var13_11.zzi();
                        var3_4 = new zzxs((String)var1_1 /* !! */ , var2_3 /* !! */ , (List)var24_21);
                        throw var3_4;
                    }
                    var8_7 = var1_1 /* !! */ [var14_12].getClass().getSimpleName();
                    var24_21.append((String)var8_7);
                    if (var14_12 < (var25_22 += -1)) {
                        var26_23 = ", ";
                        var24_21.append(var26_23);
                    }
                    ++var14_12;
                }
            }
        }
        this.zzb.zzd((zzadx)var8_7);
    }

    public final void zze() {
        zzadu zzadu2 = this.zzb;
        if (zzadu2 != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    public final void zzf(long l2, long l3) {
        zzadu zzadu2 = this.zzb;
        zzadu2.getClass();
        zzadu2.zze(l2, l3);
    }
}

