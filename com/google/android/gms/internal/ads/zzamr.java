/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzgbi;
import com.google.android.gms.internal.ads.zzgde;
import java.util.Set;
import java.util.regex.Pattern;

final class zzamr {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgbh zze = zzgbh.zzp("auto", "none");
    private static final zzgbh zzf = zzgbh.zzq("dot", "sesame", "circle");
    private static final zzgbh zzg = zzgbh.zzp("filled", "open");
    private static final zzgbh zzh = zzgbh.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzamr(int n3, int n4, int n7) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
    }

    /*
     * Unable to fully structure code
     */
    public static zzamr zza(String var0) {
        block14: {
            block16: {
                block15: {
                    if (var0 == null || (var1_1 = (var0 = zzfxm.zza(var0.trim())).isEmpty()) != 0) break block14;
                    var2_2 = zzamr.zzd;
                    var0 = zzgbh.zzm(TextUtils.split((String)var0, (Pattern)var2_2));
                    var2_2 = zzgde.zzb(zzamr.zzh, (Set)var0);
                    var3_3 = "outside";
                    var2_2 = (String)zzgbi.zza((Iterable)var2_2, var3_3);
                    var4_4 = var2_2.hashCode();
                    var5_5 = -1106037339;
                    var6_6 = -1;
                    var7_7 = 0;
                    var8_8 = 1;
                    if (var4_4 == var5_5) break block15;
                    var9_9 = 92734940;
                    if (var4_4 != var9_9 || (var1_1 = (int)var2_2.equals(var3_3 = "after")) == 0) ** GOTO lbl-1000
                    var1_1 = 0;
                    var2_2 = null;
                    break block16;
                }
                var1_1 = var2_2.equals(var3_3);
                if (var1_1 != 0) {
                    var1_1 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = -1;
                }
            }
            var9_9 = 2;
            var1_1 = var1_1 != 0 ? (var1_1 != var8_8 ? 1 : -2) : 2;
            var10_10 = zzgde.zzb(zzamr.zze, (Set)var0);
            var5_5 = (int)var10_10.isEmpty();
            if (var5_5 == 0) {
                var0 = (String)var10_10.iterator().next();
                var9_9 = var0.hashCode();
                if (var9_9 == (var4_4 = 3387192) && (var11_11 = var0.equals(var3_3 = "none"))) {
                    var6_6 = 0;
                }
            } else {
                var10_10 = zzgde.zzb(zzamr.zzg, (Set)var0);
                var12_14 = zzamr.zzf;
                var0 = zzgde.zzb((Set)var12_14, (Set)var0);
                var5_5 = (int)var10_10.isEmpty();
                if (var5_5 == 0 || (var5_5 = (int)var0.isEmpty()) == 0) {
                    var12_14 = "filled";
                    var5_5 = (var10_10 = (String)zzgbi.zza((Iterable)var10_10, var12_14)).hashCode();
                    var4_4 = var5_5 == (var13_15 = 3417674) && (var4_4 = (int)var10_10.equals(var12_14 = "open")) != 0 ? 2 : 1;
                    var12_14 = "circle";
                    var5_5 = (var0 = (String)zzgbi.zza((Iterable)var0, var12_14)).hashCode();
                    if (var5_5 != (var13_15 = -905816648)) {
                        var13_15 = 99657;
                        if (var5_5 == var13_15 && (var11_12 = var0.equals(var12_14 = "dot"))) {
                            var6_6 = 0;
                        }
                    } else {
                        var12_14 = "sesame";
                        var11_13 = var0.equals(var12_14);
                        if (var11_13) {
                            var6_6 = 1;
                        }
                    }
                    if (var6_6 != 0) {
                        if (var6_6 != var8_8) {
                            var7_7 = var4_4;
                            var6_6 = 1;
                        } else {
                            var6_6 = 3;
                            var7_7 = var4_4;
                        }
                    } else {
                        var7_7 = var4_4;
                        var6_6 = 2;
                    }
                }
            }
            var0 = new zzamr(var6_6, var7_7, var1_1);
            return var0;
        }
        return null;
    }
}

