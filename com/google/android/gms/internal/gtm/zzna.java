/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzna
extends zzjo {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        block12: {
            block10: {
                block11: {
                    block9: {
                        block6: {
                            block7: {
                                block8: {
                                    var3_3 = 1;
                                    Preconditions.checkArgument((boolean)var3_3);
                                    var4_4 = var2_2 /* !! */ .length;
                                    var5_5 = 2;
                                    if (var4_4 == var5_5) {
                                        var4_4 = 1;
                                    } else {
                                        var4_4 = 0;
                                        var6_6 = null;
                                    }
                                    Preconditions.checkArgument((boolean)var4_4);
                                    var4_4 = var2_2 /* !! */ [0] instanceof zzqz;
                                    Preconditions.checkArgument((boolean)var4_4);
                                    var6_6 = zzjn.zzd(var2_2 /* !! */ [var3_3]);
                                    var7_7 = ((zzqz)var2_2 /* !! */ [0]).zzk();
                                    var8_8 = var7_7.hashCode();
                                    var9_9 = 101;
                                    var10_10 = 3;
                                    if (var8_8 == var9_9) break block6;
                                    var9_9 = 105;
                                    if (var8_8 == var9_9) break block7;
                                    var9_9 = 118;
                                    if (var8_8 == var9_9) break block8;
                                    var9_9 = 119;
                                    if (var8_8 != var9_9 || (var12_15 = (int)var7_7.equals(var11_11 = "w")) == 0) ** GOTO lbl-1000
                                    var12_15 = 3;
                                    break block9;
                                }
                                var11_12 = "v";
                                var12_15 = (int)var7_7.equals(var11_12);
                                if (var12_15 == 0) ** GOTO lbl-1000
                                var12_15 = 2;
                                break block9;
                            }
                            var11_13 = "i";
                            var12_15 = (int)var7_7.equals(var11_13);
                            if (var12_15 == 0) ** GOTO lbl-1000
                            var12_15 = 1;
                            break block9;
                        }
                        var11_14 = "e";
                        var12_15 = var7_7.equals(var11_14);
                        if (var12_15 != 0) {
                            var12_15 = 0;
                            var7_7 = null;
                        } else lbl-1000:
                        // 4 sources

                        {
                            var12_15 = -1;
                        }
                    }
                    if (var12_15 == 0) break block10;
                    if (var12_15 == var3_3) break block11;
                    if (var12_15 == var5_5) ** GOTO lbl58
                    if (var12_15 == var10_10) {
                        zzhi.zze(var6_6);
                    } else {
                        var2_2 /* !! */  = String.valueOf(((zzqz)var2_2 /* !! */ [0]).zzk());
                        var2_2 /* !! */  = "Invalid logging level: ".concat((String)var2_2 /* !! */ );
                        var1_1 = new IllegalArgumentException((String)var2_2 /* !! */ );
                        throw var1_1;
lbl58:
                        // 1 sources

                        zzhi.zzd(var6_6);
                    }
                    break block12;
                }
                zzhi.zzc(var6_6);
                break block12;
            }
            zzhi.zza(var6_6);
        }
        return zzqs.zze;
    }
}

