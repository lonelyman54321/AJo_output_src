/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzgar;
import com.google.android.gms.internal.ads.zzgcn;
import com.google.android.gms.internal.ads.zzys;
import com.google.android.gms.internal.ads.zzza;
import com.google.android.gms.internal.ads.zzze;

final class zzzd
extends zzza {
    private final boolean zze;
    private final zzys zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final int zzr;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public zzzd(int var1_1, zzde var2_2, int var3_3, zzys var4_4, int var5_5, int var6_6, boolean var7_7) {
        block38: {
            block42: {
                block37: {
                    block36: {
                        block41: {
                            block40: {
                                block39: {
                                    super(var1_1, var2_2, var3_3);
                                    this.zzf = var4_4;
                                    var1_1 = (int)var4_4.zzK;
                                    var8_8 = 1;
                                    var1_1 = var8_8 != var1_1 ? 16 : 24;
                                    var3_3 = -1082130432;
                                    var9_9 = -1.0f;
                                    if (var7_7 == 0) ** GOTO lbl-1000
                                    var10_10 = this.zzd;
                                    var11_11 = var10_10.zzs;
                                    var12_12 = var10_10.zzu;
                                    cfr_temp_0 = var12_12 - var9_9;
                                    var11_11 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                    if (var11_11 != 0) {
                                        var11_11 = 0x4F000000;
                                        var13_13 = 2.1474836E9f;
                                        cfr_temp_1 = var12_12 - var13_13;
                                        var14_14 = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                        ** if (var14_14 <= 0) goto lbl-1000
                                    }
                                    ** GOTO lbl-1000
lbl-1000:
                                    // 2 sources

                                    {
                                        var14_14 = 0;
                                        var12_12 = 0.0f;
                                        var10_10 = null;
                                        ** GOTO lbl27
                                    }
lbl-1000:
                                    // 2 sources

                                    {
                                        var14_14 = 1;
                                        var12_12 = 1.4E-45f;
                                    }
lbl27:
                                    // 2 sources

                                    this.zze = var14_14;
                                    var14_14 = -1;
                                    var12_12 = 0.0f / 0.0f;
                                    if (var7_7 == 0) break block39;
                                    var15_15 = this.zzd;
                                    var11_11 = var15_15.zzs;
                                    if (var11_11 == var14_14 || var11_11 >= 0) break block40;
                                }
lbl35:
                                // 4 sources

                                while (true) {
                                    var7_7 = 0;
                                    var15_15 = null;
                                    break block36;
                                    break;
                                }
                            }
                            var11_11 = var15_15.zzt;
                            if (var11_11 != var14_14 && var11_11 < 0) ** GOTO lbl35
                            var13_13 = var15_15.zzu;
                            cfr_temp_2 = var13_13 - var9_9;
                            var16_16 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                            if (var16_16 /* !! */  == false) break block41;
                            var16_16 /* !! */  = (float)false;
                            cfr_temp_3 = var13_13 - 0.0f;
                            var11_11 = (int)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
                            if (var11_11 < 0) ** GOTO lbl35
                        }
                        if ((var7_7 = var15_15.zzj) == var14_14 || var7_7 >= 0) ** break;
                        ** while (true)
                        var7_7 = 1;
                    }
                    this.zzg = var7_7;
                    this.zzh = var7_7 = zzze.zzo(var5_5, false);
                    var15_15 = this.zzd;
                    var13_13 = var15_15.zzu;
                    var3_3 = (int)(var13_13 == var9_9 ? 0 : (var13_13 > var9_9 ? 1 : -1));
                    if (var3_3 != 0 && (var3_3 = (int)((cfr_temp_4 = var13_13 - (var9_9 = 10.0f)) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1))) >= 0) {
                        var3_3 = 1;
                        var9_9 = 1.4E-45f;
                    } else {
                        var3_3 = 0;
                        var9_9 = 0.0f;
                        var17_17 = null;
                    }
                    this.zzi = var3_3;
                    this.zzj = var3_3 = var15_15.zzj;
                    this.zzk = var3_3 = var15_15.zza();
                    this.zzm = var3_3 = zzze.zzb(this.zzd.zzg, 0);
                    var17_17 = this.zzd;
                    var3_3 = var17_17.zzg;
                    if (var3_3 == 0 || (var3_3 &= var8_8) != 0) {
                        var3_3 = 1;
                        var9_9 = 1.4E-45f;
                    } else {
                        var3_3 = 0;
                        var9_9 = 0.0f;
                        var17_17 = null;
                    }
                    this.zzn = var3_3;
                    var9_9 = 0.0f;
                    var17_17 = null;
                    for (var3_3 = 0; var3_3 < (var7_7 = (var15_15 = var4_4.zzo).size()); ++var3_3) {
                        var15_15 = this.zzd.zzn;
                        if (var15_15 == null || (var7_7 = (int)var15_15.equals(var18_18 /* !! */  = var4_4.zzo.get(var3_3))) == 0) {
                            continue;
                        }
                        break block37;
                    }
                    var3_3 = -1 >>> 1;
                    var9_9 = 0.0f / 0.0f;
                }
                this.zzl = var3_3;
                var3_3 = var5_5 & 384;
                var19_19 = 128;
                if (var3_3 == var19_19) {
                    var3_3 = 1;
                    var9_9 = 1.4E-45f;
                } else {
                    var3_3 = 0;
                    var9_9 = 0.0f;
                    var17_17 = null;
                }
                this.zzp = var3_3;
                var3_3 = var5_5 & 64;
                var19_19 = 64;
                if (var3_3 == var19_19) {
                    var3_3 = 1;
                    var9_9 = 1.4E-45f;
                } else {
                    var3_3 = 0;
                    var9_9 = 0.0f;
                    var17_17 = null;
                }
                this.zzq = var3_3;
                var17_17 = this.zzd;
                var4_4 = var17_17.zzn;
                var7_7 = 2;
                if (var4_4 == null) {
                    while (true) {
                        var16_16 /* !! */  = (float)false;
                        break block38;
                        break;
                    }
                }
                var11_11 = var4_4.hashCode();
                var16_16 /* !! */  = 4;
                var20_20 = 3;
                switch (var11_11) {
                    default: {
                        break;
                    }
                    case 1599127257: {
                        var18_18 /* !! */  = "video/x-vnd.on2.vp9";
                        var19_19 = (int)var4_4.equals(var18_18 /* !! */ );
                        if (var19_19 == 0) break;
                        var19_19 = 3;
                        break block42;
                    }
                    case 1331836730: {
                        var18_18 /* !! */  = "video/avc";
                        var19_19 = (int)var4_4.equals(var18_18 /* !! */ );
                        if (var19_19 == 0) break;
                        var19_19 = 4;
                        break block42;
                    }
                    case -1662541442: {
                        var18_18 /* !! */  = "video/hevc";
                        var19_19 = (int)var4_4.equals(var18_18 /* !! */ );
                        if (var19_19 == 0) break;
                        var19_19 = 2;
                        break block42;
                    }
                    case -1662735862: {
                        var18_18 /* !! */  = "video/av01";
                        var19_19 = (int)var4_4.equals(var18_18 /* !! */ );
                        if (var19_19 == 0) break;
                        var19_19 = 1;
                        break block42;
                    }
                    case -1851077871: {
                        var18_18 /* !! */  = "video/dolby-vision";
                        var19_19 = (int)var4_4.equals(var18_18 /* !! */ );
                        if (var19_19 == 0) break;
                        var19_19 = 0;
                        var4_4 = null;
                        break block42;
                    }
                }
                var19_19 = -1;
            }
            if (var19_19 != 0) {
                if (var19_19 != var8_8) {
                    if (var19_19 != var7_7) {
                        if (var19_19 != var20_20) {
                            if (var19_19 != var16_16 /* !! */ ) ** continue;
                            var16_16 /* !! */  = (float)true;
                        } else {
                            var16_16 /* !! */  = 2;
                        }
                    } else {
                        var16_16 /* !! */  = 3;
                    }
                }
            } else {
                var16_16 /* !! */  = 5;
            }
        }
        this.zzr = (int)var16_16 /* !! */ ;
        var19_19 = var17_17.zzg & 16384;
        if (var19_19 != 0) {
            while (true) {
                var8_8 = 0;
                var2_2 = null;
                break;
            }
        } else {
            var4_4 = this.zzf;
            var11_11 = (int)var4_4.zzT;
            if ((var11_11 = zzze.zzo(var5_5, (boolean)var11_11)) == 0 || (var11_11 = this.zze) == 0 && (var19_19 = (int)var4_4.zzI) == 0) ** continue;
            var19_19 = (int)zzze.zzo(var5_5, false);
            if (var19_19 != 0 && (var19_19 = (int)this.zzg) != 0 && var11_11 != 0 && (var3_3 = var17_17.zzj) != var14_14 && (var1_1 &= var5_5) != 0) {
                var8_8 = 2;
            }
        }
        this.zzo = var8_8;
    }

    public static /* synthetic */ int zza(zzzd object, zzzd object2) {
        boolean bl2 = ((zzzd)object).zze;
        zzgcn zzgcn2 = bl2 && (bl2 = ((zzzd)object).zzh) ? zzze.zzg() : zzze.zzg().zza();
        zzgar zzgar2 = zzgar.zzk();
        boolean cfr_ignored_0 = ((zzzd)object).zzf.zzB;
        Integer n3 = ((zzzd)object).zzk;
        Integer n4 = ((zzzd)object2).zzk;
        zzgar2 = zzgar2.zzd(n3, n4, zzgcn2);
        object = ((zzzd)object).zzj;
        object2 = ((zzzd)object2).zzj;
        return zzgar2.zzd(object, object2, zzgcn2).zza();
    }

    public static /* synthetic */ int zzd(zzzd zzzd2, zzzd zzzd3) {
        zzgar zzgar2 = zzgar.zzk();
        boolean bl2 = zzzd2.zzh;
        boolean bl3 = zzzd3.zzh;
        zzgar2 = zzgar2.zze(bl2, bl3);
        int n3 = zzzd2.zzm;
        int n4 = zzzd3.zzm;
        zzgar2 = zzgar2.zzb(n3, n4);
        boolean bl4 = zzzd2.zzn;
        boolean bl5 = zzzd3.zzn;
        zzgar2 = zzgar2.zze(bl4, bl5);
        boolean bl6 = zzzd2.zzi;
        boolean bl7 = zzzd3.zzi;
        zzgar2 = zzgar2.zze(bl6, bl7);
        boolean bl8 = zzzd2.zze;
        boolean bl9 = zzzd3.zze;
        zzgar2 = zzgar2.zze(bl8, bl9);
        boolean bl10 = zzzd2.zzg;
        boolean bl11 = zzzd3.zzg;
        zzgar2 = zzgar2.zze(bl10, bl11);
        Integer n7 = zzzd2.zzl;
        Integer n8 = zzzd3.zzl;
        zzgcn zzgcn2 = zzgcn.zzc().zza();
        zzgar2 = zzgar2.zzd(n7, n8, zzgcn2);
        boolean bl12 = zzzd2.zzp;
        boolean bl13 = zzzd3.zzp;
        zzgar2 = zzgar2.zze(bl12, bl13);
        boolean bl14 = zzzd2.zzq;
        boolean bl15 = zzzd3.zzq;
        zzgar2 = zzgar2.zze(bl14, bl15);
        if (bl12 && bl14) {
            int n10 = zzzd2.zzr;
            int n14 = zzzd3.zzr;
            zzgar2 = zzgar2.zzb(n10, n14);
        }
        return zzgar2.zza();
    }

    public final int zzb() {
        return this.zzo;
    }
}

