/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo$VideoCapabilities
 *  android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zztp;
import com.google.android.gms.internal.ads.zztr;
import com.google.android.gms.internal.ads.zztx;
import com.google.android.gms.internal.ads.zzud;
import com.google.android.gms.internal.ads.zzuj;
import java.util.List;

final class zztq {
    /*
     * Unable to fully structure code
     */
    public static int zza(MediaCodecInfo.VideoCapabilities var0, int var1_1, int var2_2, double var3_3) {
        if ((var0 = HL1.a((MediaCodecInfo.VideoCapabilities)var0)) != null && !(var5_4 = var0.isEmpty())) {
            var6_5 = (int)var3_3;
            var7_6 = ML1.a(var1_1, var2_2, var6_5);
            var8_7 = zztq.zzb((List)var0, (MediaCodecInfo.VideoCapabilities.PerformancePoint)var7_6);
            if (var8_7 == (var1_1 = 1) && (var9_8 = zztr.zzb()) == null) {
                block29: {
                    var2_2 = zzgd.zza;
                    var6_5 = 35;
                    if (var2_2 >= var6_5) {
                        while (true) {
                            var1_1 = 0;
                            var7_6 = null;
                            break block29;
                            break;
                        }
                    }
                    var9_8 = new zzal();
                    var10_9 = "video/avc";
                    var9_8.zzX((String)var10_9);
                    var9_8 = var9_8.zzad();
                    var10_9 = var9_8.zzn;
                    if (var10_9 == null) break block29;
                    var10_9 = zztx.zza;
                    var9_8 = zzuj.zzf((zztx)var10_9, (zzan)var9_8, false, false);
                    var6_5 = 0;
                    var10_9 = null;
                    while (true) {
                        block30: {
                            try {
                                var11_10 = var9_8.size();
                                if (var6_5 >= var11_10) break;
                            }
                            catch (zzud v0) {}
                            var12_11 = var9_8.get(var6_5);
                            var12_11 = (zztp)var12_11;
                            var12_11 = var12_11.zzd;
                            if (var12_11 == null) break block30;
                            var12_11 = var9_8.get(var6_5);
                            var12_11 = (zztp)var12_11;
                            var12_11 = var12_11.zzd;
                            var12_11 = var12_11.getVideoCapabilities();
                            if (var12_11 == null) break block30;
                            var12_11 = var9_8.get(var6_5);
                            var12_11 = (zztp)var12_11;
                            var12_11 = var12_11.zzd;
                            var12_11 = var12_11.getVideoCapabilities();
                            var12_11 = HL1.a(var12_11);
                            if (var12_11 == null) break block30;
                            var5_4 = var12_11.isEmpty();
                            if (var5_4) break block30;
                            LL1.a();
                            var9_8 = KL1.a();
                            if ((var2_2 = zztq.zzb((List)var12_11, (MediaCodecInfo.VideoCapabilities.PerformancePoint)var9_8)) != var1_1) ** continue;
                            break;
                        }
                        ++var6_5;
                    }
                }
                zztr.zzc((boolean)var1_1);
                var7_6 = zztr.zzb();
                var1_1 = (int)var7_6.booleanValue();
                if (var1_1 != 0) {
                    return 0;
                }
            }
            return var8_7;
        }
        return 0;
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        int n3;
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint2 = IL1.a(list.get(i3));
            n3 = (int)(JL1.a(performancePoint2, performancePoint) ? 1 : 0);
            if (n3 == 0) continue;
            return 2;
        }
        return 1;
    }
}

