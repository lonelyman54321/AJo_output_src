/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioTrack
 *  android.media.AudioTrack$Builder
 */
package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzdw;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzqp;
import com.google.android.gms.internal.ads.zzqr;

final class zzrm {
    public final zzan zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdw zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;

    public zzrm(zzan zzan2, int n3, int n4, int n7, int n8, int n10, int n14, int n15, zzdw zzdw2, boolean bl2, boolean bl3, boolean bl4) {
        this.zza = zzan2;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = n7;
        this.zze = n8;
        this.zzf = n10;
        this.zzg = n14;
        this.zzh = n15;
        this.zzi = zzdw2;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AudioTrack zza(zzk var1_1, int var2_5) {
        block10: {
            block9: {
                block8: {
                    try {
                        var3_6 = zzgd.zza;
                        var4_7 = 29;
                        var5_8 = 1;
                        if (var3_6 < var4_7) break block8;
                        var3_6 = this.zze;
                        var4_7 = this.zzf;
                        var6_10 = this.zzg;
                        var7_13 = zzgd.zzw(var3_6, var4_7, var6_10);
                        var1_1 = var1_1.zza();
                        var1_1 = var1_1.zza;
                        bl3_1.a();
                        var8_16 = el0_1.a();
                        var1_1 = fl0.a(var8_16, (AudioAttributes)var1_1);
                        var1_1 = gl0.a((AudioTrack.Builder)var1_1, var7_13);
                        var1_1 = hl0_0.a((AudioTrack.Builder)var1_1);
                        var3_6 = this.zzh;
                        var1_1 = il0.a((AudioTrack.Builder)var1_1, var3_6);
                        var1_1 = jl0.a((AudioTrack.Builder)var1_1, var2_5);
                        var2_5 = this.zzc;
                        var2_5 = var2_5 == var5_8 ? 1 : 0;
                        var1_1 = DG3.a((AudioTrack.Builder)var1_1, (boolean)var2_5);
                        var1_1 = kl0.a((AudioTrack.Builder)var1_1);
                        break block9;
                    }
                    catch (IllegalArgumentException var1_2) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var9_17 = var1_3;
                            break block10;
                            break;
                        }
                    }
                    catch (UnsupportedOperationException var1_4) {
                        ** continue;
                    }
                }
                var1_1 = var1_1.zza();
                var10_18 = var1_1.zza;
                var11_19 = this.zze;
                var4_7 = this.zzf;
                var6_11 = this.zzg;
                var12_20 = zzgd.zzw(var11_19, var4_7, var6_11);
                var13_22 = this.zzh;
                var14_24 = 1;
                var7_14 = new AudioTrack(var10_18, var12_20, var13_22, var14_24, var2_5);
                var1_1 = var7_14;
            }
            var15_25 = var1_1.getState();
            if (var15_25 == var5_8) {
                return var1_1;
            }
            try {
                var1_1.release();
lbl48:
                // 2 sources

                while (true) {
                    var16_27 = this.zze;
                    var13_22 = this.zzf;
                    var14_24 = this.zzh;
                    var17_28 = this.zza;
                    var18_29 = this.zzc();
                    var1_1 = new zzqr(var15_25, var16_27, var13_22, var14_24, var17_28, var18_29, null);
                    break;
                }
            }
            catch (Exception v0) {
                ** continue;
            }
            {
                throw var1_1;
            }
        }
        var5_9 = this.zze;
        var6_12 = this.zzf;
        var15_26 = this.zzh;
        var12_21 = this.zza;
        var13_23 = this.zzc();
        var7_15 = var1_3;
        var1_3 = new zzqr(0, var5_9, var6_12, var15_26, var12_21, var13_23, (Exception)var9_17);
        throw var1_3;
    }

    public final zzqp zzb() {
        boolean bl2;
        int n3 = this.zzc;
        int n4 = 1;
        if (n3 == n4) {
            bl2 = true;
        } else {
            n3 = 0;
            bl2 = false;
        }
        int n7 = this.zzf;
        int n8 = this.zze;
        int n10 = this.zzg;
        int n14 = this.zzh;
        zzqp zzqp2 = new zzqp(n10, n8, n7, false, bl2, n14);
        return zzqp2;
    }

    public final boolean zzc() {
        int n3 = this.zzc;
        int n4 = 1;
        if (n3 == n4) {
            return n4 != 0;
        }
        return false;
    }
}

