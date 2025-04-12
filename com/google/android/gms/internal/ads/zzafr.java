/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafj;
import com.google.android.gms.internal.ads.zzafo;
import com.google.android.gms.internal.ads.zzafp;
import com.google.android.gms.internal.ads.zzafs;
import com.google.android.gms.internal.ads.zzaft;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import java.util.List;

final class zzafr
implements zzafj {
    public final zzgbc zza;
    private final int zzb;

    private zzafr(int n3, zzgbc zzgbc2) {
        this.zzb = n3;
        this.zza = zzgbc2;
    }

    /*
     * Unable to fully structure code
     */
    public static zzafr zzc(int var0, zzfu var1_1) {
        var2_2 = var1_1;
        var3_3 = new zzgaz();
        var4_4 = var1_1.zze();
        var5_5 = -2;
        while ((var6_6 = var1_1.zzb()) > (var7_7 = 8)) {
            block36: {
                block35: {
                    var6_6 = var1_1.zzi();
                    var7_7 = var1_1.zzi();
                    var8_8 = var1_1.zzd() + var7_7;
                    var2_2.zzJ(var8_8);
                    var7_7 = 1414744396;
                    var9_9 = 2;
                    var10_10 = 1;
                    if (var6_6 != var7_7) break block35;
                    var6_6 = var1_1.zzi();
                    var11_11 = zzafr.zzc(var6_6, (zzfu)var2_2);
                    break block36;
                }
                var7_7 = 0;
                var12_12 = null;
                switch (var6_6) lbl-1000:
                // 5 sources

                {
                    default: {
                        var11_11 = var12_12;
                        break;
                    }
                    case 1852994675: {
                        var11_11 = zzaft.zzb(var1_1);
                        break;
                    }
                    case 1752331379: {
                        var11_11 = zzafp.zzb(var1_1);
                        break;
                    }
                    case 1751742049: {
                        var11_11 = zzafo.zzb(var1_1);
                        break;
                    }
                    case 1718776947: {
                        var11_11 = "StreamFormatChunk";
                        if (var5_5 != var9_9) ** GOTO lbl75
                        var13_13 = 4;
                        var2_2.zzL(var13_13);
                        var14_14 = var1_1.zzi();
                        var15_15 = var1_1.zzi();
                        var2_2.zzL(var13_13);
                        var13_13 = var1_1.zzi();
                        switch (var13_13) {
                            default: {
                                var16_16 = 0;
                                var17_17 = null;
                                break;
                            }
                            case 1196444237: 
                            case 1735420525: {
                                var17_17 = "video/mjpeg";
                                break;
                            }
                            case 859066445: {
                                var17_17 = "video/mp43";
                                break;
                            }
                            case 842289229: {
                                var17_17 = "video/mp42";
                                break;
                            }
                            case 826496577: 
                            case 828601953: 
                            case 875967048: {
                                var17_17 = "video/avc";
                                break;
                            }
                            case 808802372: 
                            case 877677894: 
                            case 1145656883: 
                            case 1145656920: 
                            case 1482049860: 
                            case 1684633208: 
                            case 2021026148: {
                                var17_17 = "video/mp4v-es";
                            }
                        }
                        if (var17_17 != null) ** GOTO lbl65
                        var18_18 = "Ignoring track with unsupported compression ";
                        w12_0.a(var13_13, var18_18, (String)var11_11);
                        ** GOTO lbl-1000
lbl65:
                        // 1 sources

                        var11_11 = new zzal();
                        var11_11.zzac(var14_14);
                        var11_11.zzI(var15_15);
                        var11_11.zzX(var17_17);
                        var11_11 = var11_11.zzad();
                        var12_12 = new zzafs((zzan)var11_11);
                        ** GOTO lbl-1000
lbl75:
                        // 1 sources

                        if (var5_5 != var10_10) ** GOTO lbl129
                        var13_13 = var1_1.zzk();
                        var18_18 = "audio/raw";
                        var19_19 = "audio/mp4a-latm";
                        if (var13_13 != var10_10) {
                            var16_16 = 85;
                            if (var13_13 != var16_16) {
                                var16_16 = 255;
                                if (var13_13 != var16_16) {
                                    var16_16 = 8192;
                                    if (var13_13 != var16_16) {
                                        var16_16 = 8193;
                                        if (var13_13 != var16_16) {
                                            var16_16 = 0;
                                            var17_17 = null;
                                        } else {
                                            var17_17 = "audio/vnd.dts";
                                        }
                                    } else {
                                        var17_17 = "audio/ac3";
                                    }
                                } else {
                                    var17_17 = var19_19;
                                }
                            } else {
                                var17_17 = "audio/mpeg";
                            }
                        } else {
                            var17_17 = var18_18;
                        }
                        if (var17_17 != null) ** GOTO lbl104
                        var18_18 = "Ignoring track with unsupported format tag ";
                        w12_0.a(var13_13, var18_18, (String)var11_11);
                        ** GOTO lbl-1000
lbl104:
                        // 1 sources

                        var6_6 = var1_1.zzk();
                        var7_7 = var1_1.zzi();
                        var2_2.zzL(6);
                        var13_13 = zzgd.zzl(var1_1.zzq());
                        var20_20 = var1_1.zzk();
                        var21_21 = new byte[var20_20];
                        var2_2.zzG(var21_21, 0, var20_20);
                        var22_22 = new zzal();
                        var22_22.zzX(var17_17);
                        var22_22.zzy(var6_6);
                        var22_22.zzY(var7_7);
                        var6_6 = (int)var18_18.equals(var17_17);
                        if (var6_6 != 0 && var13_13 != 0) {
                            var22_22.zzR(var13_13);
                        }
                        if ((var6_6 = (int)var19_19.equals(var17_17)) != 0 && var20_20 > 0) {
                            var11_11 = zzgbc.zzn(var21_21);
                            var22_22.zzL((List)var11_11);
                        }
                        var12_12 = var22_22.zzad();
                        var11_11 = new zzafs((zzan)var12_12);
                        break;
lbl129:
                        // 1 sources

                        var18_18 = zzgd.zzC(var5_5);
                        var23_23 = "Ignoring strf box for unsupported track type: ".concat(var18_18);
                        zzfk.zzf((String)var11_11, var23_23);
                        ** GOTO lbl-1000
                    }
                }
            }
            if (var11_11 != null) {
                var7_7 = var11_11.zza();
                if (var7_7 == (var13_13 = 1752331379)) {
                    var24_24 = var11_11;
                    var24_24 = (zzafp)var11_11;
                    var5_5 = var24_24.zza;
                    var7_7 = 1935960438;
                    if (var5_5 != var7_7) {
                        var7_7 = 1935963489;
                        if (var5_5 != var7_7) {
                            var7_7 = 1937012852;
                            if (var5_5 != var7_7) {
                                var24_24 = String.valueOf(Integer.toHexString(var5_5));
                                var12_12 = "AviStreamHeaderChunk";
                                var25_25 = "Found unsupported streamType fourCC: ";
                                var24_24 = var25_25.concat((String)var24_24);
                                zzfk.zzf((String)var12_12, (String)var24_24);
                                var5_5 = -1;
                            } else {
                                var5_5 = 3;
                            }
                        } else {
                            var5_5 = 1;
                        }
                    } else {
                        var5_5 = 2;
                    }
                }
                var3_3.zzf(var11_11);
            }
            var2_2.zzK(var8_8);
            var2_2.zzJ(var4_4);
        }
        var3_3 = var3_3.zzi();
        var4_4 = var0;
        var2_2 = new zzafr(var0, (zzgbc)var3_3);
        return var2_2;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzafj zzb(Class clazz) {
        zzgbc zzgbc2 = this.zza;
        int n3 = zzgbc2.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            zzafj zzafj2 = (zzafj)zzgbc2.get(i3);
            Class<?> clazz2 = zzafj2.getClass();
            if (clazz2 != clazz) continue;
            return zzafj2;
        }
        return null;
    }
}

