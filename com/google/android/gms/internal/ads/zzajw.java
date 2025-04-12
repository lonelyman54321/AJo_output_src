/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzact;
import com.google.android.gms.internal.ads.zzacx;
import com.google.android.gms.internal.ads.zzado;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzaek;
import com.google.android.gms.internal.ads.zzaep;
import com.google.android.gms.internal.ads.zzaim;
import com.google.android.gms.internal.ads.zzajm;
import com.google.android.gms.internal.ads.zzajn;
import com.google.android.gms.internal.ads.zzajo;
import com.google.android.gms.internal.ads.zzajp;
import com.google.android.gms.internal.ads.zzajq;
import com.google.android.gms.internal.ads.zzajs;
import com.google.android.gms.internal.ads.zzajt;
import com.google.android.gms.internal.ads.zzaju;
import com.google.android.gms.internal.ads.zzajv;
import com.google.android.gms.internal.ads.zzakf;
import com.google.android.gms.internal.ads.zzakp;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgea;
import com.google.android.gms.internal.ads.zzgh;
import com.google.android.gms.internal.ads.zzgk;
import com.google.android.gms.internal.ads.zzgn;
import com.google.android.gms.internal.ads.zzr;
import com.google.android.gms.internal.ads.zzt;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

final class zzajw {
    private static final byte[] zza;

    static {
        Charset charset = zzfxs.zzc;
        zza = "OpusHead".getBytes(charset);
    }

    public static zzcd zza(zzajm object) {
        int n3;
        int n4 = 1751411826;
        Object object2 = ((zzajm)object).zzb(n4);
        int n7 = 1801812339;
        zzajn zzajn2 = ((zzajm)object).zzb(n7);
        object = ((zzajm)object).zzb(1768715124);
        if (object2 != null && zzajn2 != null && object != null && (n4 = zzajw.zzg((zzfu)(object2 = ((zzajn)object2).zza))) == (n3 = 1835299937)) {
            String string2;
            int n8;
            int n10;
            object2 = zzajn2.zza;
            ((zzfu)object2).zzK(12);
            n7 = ((zzfu)object2).zzg();
            String[] stringArray = new String[n7];
            ArrayList<String> arrayList = null;
            for (int i3 = 0; i3 < n7; ++i3) {
                n10 = ((zzfu)object2).zzg();
                n8 = 4;
                ((zzfu)object2).zzL(n8);
                Charset charset = zzfxs.zzc;
                stringArray[i3] = string2 = ((zzfu)object2).zzA(n10 += -8, charset);
            }
            object = ((zzajn)object).zza;
            n4 = 8;
            ((zzfu)object).zzK(n4);
            arrayList = new ArrayList<String>();
            while ((n10 = ((zzfu)object).zzb()) > n4) {
                Object object3;
                n10 = ((zzfu)object).zzd();
                n8 = ((zzfu)object).zzg() + n10;
                n10 = ((zzfu)object).zzg() + -1;
                if (n10 >= 0 && n10 < n7) {
                    block9: {
                        int n14;
                        int n15;
                        string2 = stringArray[n10];
                        while ((n15 = ((zzfu)object).zzd()) < n8) {
                            int n16;
                            n14 = ((zzfu)object).zzg();
                            int n17 = ((zzfu)object).zzg();
                            if (n17 == (n16 = 1684108385)) {
                                n15 = ((zzfu)object).zzg();
                                n17 = ((zzfu)object).zzg();
                                byte[] byArray = new byte[n14 += -16];
                                ((zzfu)object).zzG(byArray, 0, n14);
                                object3 = new zzgh(string2, byArray, n17, n15);
                                break block9;
                            }
                            ((zzfu)object).zzK(n15 += n14);
                        }
                        n14 = 0;
                        object3 = null;
                    }
                    if (object3 != null) {
                        arrayList.add((String)object3);
                    }
                } else {
                    String string3 = "Skipped metadata with unknown key index: ";
                    object3 = "AtomParsers";
                    w12_0.a(n10, string3, (String)object3);
                }
                ((zzfu)object).zzK(n8);
            }
            boolean bl2 = arrayList.isEmpty();
            if (!bl2) {
                object = new zzcd(arrayList);
                return object;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static zzcd zzb(zzajn var0) {
        var1_1 = 1;
        var0 = var0.zza;
        var2_2 = 8;
        var0.zzK(var2_2);
        var4_4 = new zzcc[]{};
        var5_5 = -9223372036854775807L;
        var3_3 = new zzcd(var5_5, (zzcc[])var4_4);
        while ((var7_6 = var0.zzb()) >= var2_2) {
            block12: {
                block13: {
                    block11: {
                        var7_6 = var0.zzd();
                        var8_7 = var0.zzg() + var7_6;
                        var9_8 = var0.zzg();
                        var10_9 = 1835365473;
                        var11_10 = null;
                        if (var9_8 != var10_9) break block11;
                        var0.zzK(var7_6);
                        var0.zzL(var2_2);
                        zzajw.zze((zzfu)var0);
                        while ((var7_6 = var0.zzd()) < var8_7) {
                            var7_6 = var0.zzd();
                            var9_8 = var0.zzg() + var7_6;
                            var10_9 = var0.zzg();
                            if (var10_9 == (var12_11 = 1768715124)) {
                                var0.zzK(var7_6);
                                var0.zzL(var2_2);
                                var4_4 = new ArrayList();
                                while ((var10_9 = var0.zzd()) < var9_8) {
                                    var13_12 = zzakf.zza((zzfu)var0);
                                    if (var13_12 == null) continue;
                                    var4_4.add(var13_12);
                                }
                                var9_8 = (int)var4_4.isEmpty();
                                if (var9_8 != 0) break;
                                var11_10 = new zzcd((List)var4_4);
                                break;
                            }
                            var0.zzK(var9_8);
                        }
                        var3_3 = var3_3.zzd(var11_10);
                        break block12;
                    }
                    var10_9 = 1936553057;
                    if (var9_8 != var10_9) break block13;
                    var0.zzK(var7_6);
                    var7_6 = 12;
                    var14_13 = 1.7E-44f;
                    var0.zzL(var7_6);
                    while ((var9_8 = var0.zzd()) < var8_7) {
                        block14: {
                            block10: {
                                block16: {
                                    block15: {
                                        var9_8 = var0.zzd();
                                        var10_9 = var0.zzg();
                                        var12_11 = var0.zzg();
                                        if (var12_11 != (var15_14 = 1935766900)) break block14;
                                        var9_8 = 16;
                                        if (var10_9 < var9_8) break;
                                        var0.zzL(4);
                                        var9_8 = -1;
                                        var13_12 = null;
                                        var12_11 = 0;
                                        for (var10_9 = 0; var10_9 < (var15_14 = 2); var10_9 += var1_1) {
                                            var15_14 = var0.zzm();
                                            var16_15 = var0.zzm();
                                            if (var15_14 == 0) {
                                                var9_8 = var16_15;
                                                continue;
                                            }
                                            if (var15_14 != var1_1) continue;
                                            var12_11 = var16_15;
                                        }
                                        var10_9 = -2147483647;
                                        if (var9_8 != var7_6) break block15;
                                        var7_6 = 240;
                                        var14_13 = 3.36E-43f;
                                        break block10;
                                    }
                                    var15_14 = 13;
                                    if (var9_8 != var15_14) break block16;
                                    var7_6 = 120;
                                    var14_13 = 1.68E-43f;
                                    break block10;
                                }
                                var15_14 = 21;
                                if (var9_8 != var15_14) lbl-1000:
                                // 4 sources

                                {
                                    while (true) {
                                        var7_6 = -2147483647;
                                        var14_13 = -1.4E-45f;
                                        break block10;
                                        break;
                                    }
                                }
                                var9_8 = var0.zzb();
                                if (var9_8 < var2_2 || (var9_8 = var0.zzd() + var2_2) > var8_7) ** GOTO lbl-1000
                                var9_8 = var0.zzg();
                                var15_14 = var0.zzg();
                                if (var9_8 < var7_6) ** GOTO lbl-1000
                                var7_6 = 1936877170;
                                var14_13 = 1.9204921E31f;
                                if (var15_14 == var7_6) ** break;
                                ** continue;
                                var7_6 = var0.zzn();
                            }
                            if (var7_6 == var10_9) break;
                            var14_13 = var7_6;
                            var17_16 = new zzaim(var14_13, var12_11);
                            var4_4 = new zzcc[var1_1];
                            var4_4[0] = var17_16;
                            var11_10 = new zzcd(var5_5, (zzcc[])var4_4);
                            break;
                        }
                        var0.zzK(var9_8 += var10_9);
                    }
                    var3_3 = var3_3.zzd(var11_10);
                    break block12;
                }
                var7_6 = -1451722374;
                var14_13 = -5.5172426E-14f;
                if (var9_8 == var7_6) {
                    var4_4 = zzajw.zzi((zzfu)var0);
                    var3_3 = var3_3.zzd((zzcd)var4_4);
                }
            }
            var0.zzK(var8_7);
        }
        return var3_3;
    }

    public static zzgn zzc(zzfu object) {
        long l2;
        long l3;
        ((zzfu)object).zzK(8);
        int n3 = zzajo.zze(((zzfu)object).zzg());
        if (n3 == 0) {
            l3 = ((zzfu)object).zzu();
            l2 = ((zzfu)object).zzu();
        } else {
            l3 = ((zzfu)object).zzt();
            l2 = ((zzfu)object).zzt();
        }
        long l4 = ((zzfu)object).zzu();
        object = new zzgn(l3, l2, l4);
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List zzd(zzajm var0, zzaej var1_1, long var2_2, zzae var4_3, boolean var5_4, boolean var6_5, zzfxu var7_6) {
        var8_7 = var0;
        var9_8 = var4_3;
        var10_9 = new ArrayList();
        var11_10 = 0;
        var12_11 /* !! */  = null;
        while (var11_10 < (var14_13 = (var13_12 = var8_7.zzc).size())) {
            block145: {
                block130: {
                    block135: {
                        block128: {
                            block140: {
                                block122: {
                                    block141: {
                                        block142: {
                                            block143: {
                                                block144: {
                                                    block136: {
                                                        block137: {
                                                            block138: {
                                                                block139: {
                                                                    block121: {
                                                                        block134: {
                                                                            block132: {
                                                                                block133: {
                                                                                    block131: {
                                                                                        block129: {
                                                                                            var15_14 = var13_12 = var8_7.zzc.get(var11_10);
                                                                                            var15_14 = (zzajm)var13_12;
                                                                                            var14_13 = var15_14.zzd;
                                                                                            var16_15 = 1953653099;
                                                                                            if (var14_13 == var16_15) break block129;
                                                                                            var17_16 = var1_1;
                                                                                            var8_7 = var7_6;
                                                                                            var18_17 = var10_9;
                                                                                            var19_18 = var11_10;
                                                                                            break block130;
                                                                                        }
                                                                                        var14_13 = 1836476516;
                                                                                        var20_19 = 4.7662196E27f;
                                                                                        var13_12 = var8_7.zzb(var14_13);
                                                                                        var13_12.getClass();
                                                                                        var16_15 = 1835297121;
                                                                                        var18_17 = var15_14.zza(var16_15);
                                                                                        var18_17.getClass();
                                                                                        var17_16 = var18_17.zzb(1751411826);
                                                                                        var17_16.getClass();
                                                                                        var17_16 = var17_16.zza;
                                                                                        var21_20 = zzajw.zzg((zzfu)var17_16);
                                                                                        var22_21 = 1936684398;
                                                                                        var23_22 = 1.8971874E31f;
                                                                                        var24_23 = -1;
                                                                                        if (var21_20 != var22_21) break block131;
                                                                                        var25_24 = 1;
                                                                                        var26_25 = 1.4E-45f;
                                                                                        break block132;
                                                                                    }
                                                                                    var22_21 = 1986618469;
                                                                                    var23_22 = 1.1834389E33f;
                                                                                    if (var21_20 != var22_21) break block133;
                                                                                    var25_24 = 2;
                                                                                    var26_25 = 2.8E-45f;
                                                                                    break block132;
                                                                                }
                                                                                var22_21 = 1952807028;
                                                                                var23_22 = 7.272211E31f;
                                                                                if (var21_20 == var22_21) ** GOTO lbl-1000
                                                                                var22_21 = 1935832172;
                                                                                var23_22 = 1.7941596E31f;
                                                                                if (var21_20 == var22_21) ** GOTO lbl-1000
                                                                                var22_21 = 1937072756;
                                                                                var23_22 = 1.944137E31f;
                                                                                if (var21_20 == var22_21) ** GOTO lbl-1000
                                                                                var22_21 = 1668047728;
                                                                                var23_22 = 4.3605968E21f;
                                                                                if (var21_20 == var22_21) lbl-1000:
                                                                                // 4 sources

                                                                                {
                                                                                    var25_24 = 3;
                                                                                    var26_25 = 4.2E-45f;
                                                                                } else {
                                                                                    var22_21 = 1835365473;
                                                                                    var23_22 = 4.4382975E27f;
                                                                                    if (var21_20 == var22_21) {
                                                                                        var25_24 = 5;
                                                                                        var26_25 = 7.0E-45f;
                                                                                    } else {
                                                                                        var25_24 = -1;
                                                                                        var26_25 = 0.0f / 0.0f;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (var25_24 != var24_23) break block134;
                                                                            var8_7 = var7_6;
                                                                            var27_26 = var10_9;
                                                                            var19_18 = var11_10;
                                                                            var13_12 = var15_14;
                                                                            var22_21 = 0;
                                                                            var23_22 = 0.0f;
                                                                            var28_27 = null;
                                                                            break block135;
                                                                        }
                                                                        var21_20 = 1953196132;
                                                                        var17_16 = var15_14.zzb(var21_20);
                                                                        var17_16.getClass();
                                                                        var17_16 = var17_16.zza;
                                                                        var29_28 = 8;
                                                                        var17_16.zzK(var29_28);
                                                                        var30_29 = zzajo.zze(var17_16.zzg());
                                                                        var31_30 = 16;
                                                                        if (var30_29 == 0) {
                                                                            var22_21 = 8;
                                                                            var23_22 = 1.1E-44f;
                                                                        } else {
                                                                            var22_21 = 16;
                                                                            var23_22 = 2.2E-44f;
                                                                        }
                                                                        var17_16.zzL(var22_21);
                                                                        var22_21 = var17_16.zzg();
                                                                        var29_28 = 4;
                                                                        var17_16.zzL(var29_28);
                                                                        var32_31 = var17_16.zzd();
                                                                        var33_32 = 0;
                                                                        var34_33 = 0.0f;
                                                                        var35_34 = null;
                                                                        while (true) {
                                                                            if (var30_29 == 0) {
                                                                                var36_35 = 4;
                                                                                var37_36 = 5.6E-45f;
                                                                            } else {
                                                                                var36_35 = 8;
                                                                                var37_36 = 1.1E-44f;
                                                                            }
                                                                            var38_37 = -9223372036854775807L;
                                                                            if (var33_32 >= var36_35) break;
                                                                            var40_38 /* !! */  = var17_16.zzM();
                                                                            var36_35 = var40_38 /* !! */ [var41_39 = var32_31 + var33_32];
                                                                            if (var36_35 != var24_23) {
                                                                                var42_40 = var30_29 == 0 ? var17_16.zzu() : var17_16.zzv();
                                                                                cfr_temp_0 = var42_40 - (var44_41 = 0L);
                                                                                var33_32 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                                                if (var33_32 == 0) lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    while (true) {
                                                                                        var46_42 = var38_37;
                                                                                        ** GOTO lbl129
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    var46_42 = var42_40;
                                                                                }
                                                                                break block121;
                                                                            }
                                                                            ++var33_32;
                                                                        }
                                                                        var17_16.zzL(var36_35);
                                                                        ** continue;
                                                                    }
                                                                    var17_16.zzL(var31_30);
                                                                    var33_32 = var17_16.zzg();
                                                                    var48_43 = var17_16.zzg();
                                                                    var17_16.zzL(var29_28);
                                                                    var29_28 = var17_16.zzg();
                                                                    var21_20 = var17_16.zzg();
                                                                    var31_30 = 65536;
                                                                    var49_44 = -65536;
                                                                    if (var33_32 != 0) break block136;
                                                                    if (var48_43 != var31_30) break block137;
                                                                    if (var29_28 != var49_44) break block138;
                                                                    if (var21_20 != 0) break block139;
                                                                    var49_44 = 90;
                                                                    break block140;
                                                                }
                                                                var29_28 = -65536;
                                                            }
                                                            var33_32 = 0;
                                                            var34_33 = 0.0f;
                                                            var35_34 = null;
                                                            var48_43 = 65536;
                                                            break block136;
                                                        }
                                                        var33_32 = 0;
                                                        var34_33 = 0.0f;
                                                        var35_34 = null;
                                                    }
                                                    if (var33_32 != 0) break block141;
                                                    if (var48_43 != var49_44) break block142;
                                                    if (var29_28 != var31_30) break block143;
                                                    if (var21_20 != 0) break block144;
                                                    var49_44 = 270;
                                                    break block140;
                                                }
lbl164:
                                                // 2 sources

                                                while (true) {
                                                    var33_32 = 0;
                                                    var34_33 = 0.0f;
                                                    var35_34 = null;
                                                    var48_43 = -65536;
                                                    break block122;
                                                    break;
                                                }
                                            }
                                            var31_30 = var29_28;
                                            ** continue;
                                        }
                                        var31_30 = var29_28;
                                        var33_32 = 0;
                                        var34_33 = 0.0f;
                                        var35_34 = null;
                                        break block122;
                                    }
                                    var31_30 = var29_28;
                                }
                                if (var33_32 == var49_44 && var48_43 == 0 && var31_30 == 0 && var21_20 == var49_44) {
                                    var49_44 = 180;
                                } else {
                                    var49_44 = 0;
                                    var8_7 = null;
                                }
                            }
                            var50_45 = new zzajv(var22_21, var46_42, var49_44);
                            var49_44 = (int)(var2_2 == var38_37 ? 0 : (var2_2 < var38_37 ? -1 : 1));
                            var53_47 = var49_44 == 0 ? (var51_46 = zzajv.zzc(var50_45)) : var2_2;
                            var8_7 = zzajw.zzc(var13_12.zza);
                            var55_48 = var8_7.zzc;
                            var49_44 = (int)(var53_47 == var38_37 ? 0 : (var53_47 < var38_37 ? -1 : 1));
                            if (var49_44 != 0) {
                                var57_49 = 1000000L;
                                var59_50 = RoundingMode.FLOOR;
                                var38_37 = var60_51 = zzgd.zzt(var53_47, var57_49, var55_48, var59_50);
                            }
                            var49_44 = 1835626086;
                            var8_7 = var18_17.zza(var49_44);
                            var8_7.getClass();
                            var8_7 = var8_7.zza(1937007212);
                            var8_7.getClass();
                            var14_13 = 1835296868;
                            var20_19 = 4.418049E27f;
                            var13_12 = var18_17.zzb(var14_13);
                            var13_12.getClass();
                            var13_12 = var13_12.zza;
                            var29_28 = 8;
                            var13_12.zzK(var29_28);
                            var16_15 = zzajo.zze(var13_12.zzg());
                            var21_20 = var16_15 == 0 ? 8 : 16;
                            var13_12.zzL(var21_20);
                            var16_15 = var16_15 == 0 ? 4 : 8;
                            var51_46 = var13_12.zzu();
                            var13_12.zzL(var16_15);
                            var14_13 = var13_12.zzq();
                            var16_15 = var14_13 >> 10;
                            var33_32 = var14_13 >> 5;
                            var14_13 &= 31;
                            var62_52 = new StringBuilder();
                            var16_15 = (char)((var16_15 & 31) + 96);
                            var62_52.append((char)var16_15);
                            var16_15 = (char)((var33_32 & 31) + 96);
                            var62_52.append((char)var16_15);
                            var14_13 = (char)(var14_13 + 96);
                            var62_52.append((char)var14_13);
                            var13_12 = var62_52.toString();
                            var18_17 = var51_46;
                            var62_52 = Pair.create((Object)var18_17, (Object)var13_12);
                            var14_13 = 1937011556;
                            var20_19 = 1.9367383E31f;
                            var8_7 = var8_7.zzb(var14_13);
                            if (var8_7 == null) break block145;
                            var33_32 = zzajv.zza(var50_45);
                            var22_21 = zzajv.zzb(var50_45);
                            var13_12 = var62_52.second;
                            var17_16 = var13_12;
                            var17_16 = (String)var13_12;
                            var8_7 = var8_7.zza;
                            var16_15 = 12;
                            var8_7.zzK(var16_15);
                            var14_13 = var8_7.zzg();
                            var19_18 = var11_10;
                            var12_11 /* !! */  = new zzajs(var14_13);
                            var27_26 = var10_9;
                            var63_53 = 0;
                            var10_9 = null;
                            while (var63_53 < var14_13) {
                                block123: {
                                    block146: {
                                        block147: {
                                            block124: {
                                                block151: {
                                                    block150: {
                                                        block149: {
                                                            block148: {
                                                                var64_54 = var50_45;
                                                                var31_30 = var8_7.zzd();
                                                                var65_55 = var15_14;
                                                                var66_56 = var8_7.zzg();
                                                                if (var66_56 > 0) {
                                                                    var16_15 = 1;
                                                                } else {
                                                                    var16_15 = 0;
                                                                    var18_17 = null;
                                                                }
                                                                var67_57 = "childAtomSize must be positive";
                                                                zzady.zzb((boolean)var16_15, (String)var67_57);
                                                                var16_15 = var8_7.zzg();
                                                                var29_28 = 1635148593;
                                                                var68_58 = var14_13;
                                                                var14_13 = 1701733238;
                                                                var20_19 = 7.035987E22f;
                                                                if (var16_15 == var29_28 || var16_15 == (var29_28 = 1635148595) || var16_15 == var14_13 || var16_15 == (var29_28 = 1831958048) || var16_15 == (var29_28 = 1836070006) || var16_15 == (var29_28 = 1752589105) || var16_15 == (var29_28 = 1751479857) || var16_15 == (var29_28 = 1932670515) || var16_15 == (var29_28 = 1211250227) || var16_15 == (var29_28 = 1987063864) || var16_15 == (var29_28 = 1987063865) || var16_15 == (var29_28 = 1635135537) || var16_15 == (var29_28 = 1685479798) || var16_15 == (var29_28 = 1685479729) || var16_15 == (var29_28 = 1685481573) || var16_15 == (var29_28 = 1685481521)) break block146;
                                                                var14_13 = 1836069985;
                                                                var20_19 = 4.6462328E27f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1701733217;
                                                                var20_19 = 7.0359778E22f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1633889587;
                                                                var20_19 = 2.6191674E20f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1700998451;
                                                                var20_19 = 6.7050686E22f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1633889588;
                                                                var20_19 = 2.6191676E20f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1835823201;
                                                                var20_19 = 4.573395E27f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1685353315;
                                                                var20_19 = 1.803728E22f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1685353317;
                                                                var20_19 = 1.8037282E22f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1685353320;
                                                                var20_19 = 1.8037286E22f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1685353324;
                                                                var20_19 = 1.803729E22f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1685353336;
                                                                var20_19 = 1.8037304E22f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1935764850;
                                                                var20_19 = 1.7860208E31f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1935767394;
                                                                var20_19 = 1.7863284E31f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1819304813;
                                                                var20_19 = 1.1624469E27f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1936684916;
                                                                var20_19 = 1.89725E31f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1953984371;
                                                                var20_19 = 7.841539E31f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 778924082;
                                                                var20_19 = 5.398721E-11f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 778924083;
                                                                var20_19 = 5.3987214E-11f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1835557169;
                                                                var20_19 = 4.4948762E27f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1835560241;
                                                                var20_19 = 4.495783E27f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1634492771;
                                                                var20_19 = 2.7252807E20f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1634492791;
                                                                var20_19 = 2.7252842E20f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1970037111;
                                                                var20_19 = 2.9964816E32f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1332770163;
                                                                var20_19 = 4.034229E9f;
                                                                if (var16_15 == var14_13) break block147;
                                                                var14_13 = 1716281667;
                                                                var20_19 = 2.4128923E23f;
                                                                if (var16_15 != var14_13) break block148;
                                                                break block147;
                                                            }
                                                            var14_13 = 1414810956;
                                                            var20_19 = 3.6473196E12f;
                                                            if (var16_15 == var14_13) break block149;
                                                            var14_13 = 1954034535;
                                                            var20_19 = 7.865797E31f;
                                                            if (var16_15 == var14_13) break block149;
                                                            var14_13 = 0x77767474;
                                                            var20_19 = 4.998699E33f;
                                                            if (var16_15 == var14_13) break block149;
                                                            var14_13 = 1937010800;
                                                            var20_19 = 1.9366469E31f;
                                                            if (var16_15 == var14_13) break block149;
                                                            var14_13 = 1664495672;
                                                            var20_19 = 3.360782E21f;
                                                            if (var16_15 == var14_13) break block149;
                                                            var14_13 = 1835365492;
                                                            var20_19 = 4.4383032E27f;
                                                            if (var16_15 == var14_13) {
                                                                var14_13 = var31_30 + 16;
                                                                var8_7.zzK(var14_13);
                                                                var14_13 = 0;
                                                                var20_19 = 0.0f;
                                                                var13_12 = null;
                                                                var8_7.zzx('\u0000');
                                                                var18_17 = var8_7.zzx('\u0000');
                                                                if (var18_17 != null) {
                                                                    var13_12 = new zzal();
                                                                    var13_12.zzJ(var33_32);
                                                                    var13_12.zzX((String)var18_17);
                                                                    var12_11 /* !! */ .zzb = var13_12 = var13_12.zzad();
                                                                }
lbl382:
                                                                // 5 sources

                                                                while (true) {
                                                                    var69_59 = var17_16;
                                                                    var16_15 = var22_21;
                                                                    var71_61 = var25_24;
                                                                    var72_62 = var26_25;
                                                                    var21_20 = var33_32;
                                                                    var74_64 /* !! */  = var62_52;
                                                                    var75_65 = var55_48;
                                                                    var32_31 = var63_53;
                                                                    var79_68 = var31_30;
                                                                    var67_57 = var12_11 /* !! */ ;
                                                                    var80_69 = var66_56;
                                                                    var77_66 = var68_58;
lbl395:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var22_21 = 3;
                                                                        var23_22 = 4.2E-45f;
                                                                        var25_24 = -1;
                                                                        var26_25 = 0.0f / 0.0f;
                                                                        break block123;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            var14_13 = 1667329389;
                                                            var20_19 = 4.1584024E21f;
                                                            if (var16_15 != var14_13) ** GOTO lbl382
                                                            var13_12 = new zzal();
                                                            var13_12.zzJ(var33_32);
                                                            var18_17 = "application/x-camera-motion";
                                                            var13_12.zzX((String)var18_17);
                                                            var12_11 /* !! */ .zzb = var13_12 = var13_12.zzad();
                                                            ** continue;
                                                        }
                                                        var14_13 = var31_30 + 16;
                                                        var8_7.zzK(var14_13);
                                                        var14_13 = 1414810956;
                                                        var20_19 = 3.6473196E12f;
                                                        var81_70 = 0x7FFFFFFFFFFFFFFFL;
                                                        var83_71 = 0.0 / 0.0;
                                                        if (var16_15 == var14_13) {
                                                            var13_12 = "application/ttml+xml";
lbl421:
                                                            // 3 sources

                                                            while (true) {
                                                                var18_17 = var13_12;
lbl423:
                                                                // 2 sources

                                                                while (true) {
                                                                    var85_72 = var81_70;
                                                                    var14_13 = 0;
                                                                    var20_19 = 0.0f;
                                                                    var13_12 = null;
                                                                    break block124;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        var14_13 = 1954034535;
                                                        var20_19 = 7.865797E31f;
                                                        if (var16_15 != var14_13) break block150;
                                                        var14_13 = var66_56 + -16;
                                                        var18_17 = new byte[var14_13];
                                                        var29_28 = 0;
                                                        var67_57 = null;
                                                        var8_7.zzG((byte[])var18_17, 0, var14_13);
                                                        var13_12 = zzgbc.zzn(var18_17);
                                                        var18_17 = "application/x-quicktime-tx3g";
                                                        var85_72 = var81_70;
                                                        break block124;
                                                    }
                                                    var29_28 = 0;
                                                    var67_57 = null;
                                                    var14_13 = 0x77767474;
                                                    var20_19 = 4.998699E33f;
                                                    if (var16_15 != var14_13) break block151;
                                                    var13_12 = "application/x-mp4-vtt";
                                                    ** GOTO lbl421
                                                }
                                                var14_13 = 1937010800;
                                                var20_19 = 1.9366469E31f;
                                                if (var16_15 == var14_13) {
                                                    var81_70 = 0L;
                                                    var83_71 = 0.0;
                                                    var13_12 = "application/ttml+xml";
                                                    ** continue;
                                                }
                                                var14_13 = 1;
                                                var20_19 = 1.4E-45f;
                                                var12_11 /* !! */ .zzd = var14_13;
                                                var18_17 = "application/x-mp4-cea-608";
                                                ** continue;
                                            }
                                            var67_57 = new zzal();
                                            var67_57.zzJ(var33_32);
                                            var67_57.zzX((String)var18_17);
                                            var67_57.zzO((String)var17_16);
                                            var78_67 = var17_16;
                                            var67_57.zzab(var85_72);
                                            var67_57.zzL((List)var13_12);
                                            var12_11 /* !! */ .zzb = var13_12 = var67_57.zzad();
                                            var16_15 = var22_21;
                                            var71_61 = var25_24;
                                            var72_62 = var26_25;
                                            var21_20 = var33_32;
                                            var74_64 /* !! */  = var62_52;
                                            var75_65 = var55_48;
                                            var32_31 = var63_53;
                                            var79_68 = var31_30;
                                            var67_57 = var12_11 /* !! */ ;
                                            var80_69 = var66_56;
                                            var77_66 = var68_58;
                                            var69_59 = var17_16;
                                            ** continue;
                                        }
                                        var78_67 = var17_16;
                                        var77_66 = var68_58;
                                        var29_28 = 1;
                                        var13_12 = var8_7;
                                        var69_59 = var17_16;
                                        var21_20 = var31_30;
                                        var70_60 = var22_21;
                                        var22_21 = var66_56;
                                        var71_61 = var25_24;
                                        var72_62 = var26_25;
                                        var25_24 = var33_32;
                                        var67_57 = var17_16;
                                        var73_63 = var33_32;
                                        var33_32 = (int)var6_5;
                                        var74_64 /* !! */  = var62_52;
                                        var62_52 = var4_3;
                                        var75_65 = var55_48;
                                        var40_38 /* !! */  = (byte[])var12_11 /* !! */ ;
                                        var48_43 = var63_53;
                                        zzajw.zzm((zzfu)var8_7, var16_15, var31_30, var66_56, var25_24, (String)var17_16, var6_5, var4_3, (zzajs)var12_11 /* !! */ , var63_53);
                                        var32_31 = var63_53;
                                        var79_68 = var31_30;
                                        var67_57 = var12_11 /* !! */ ;
                                        var80_69 = var66_56;
                                        var16_15 = var70_60;
                                        var21_20 = var25_24;
                                        var22_21 = 3;
                                        var23_22 = 4.2E-45f;
                                        var25_24 = -1;
                                        var26_25 = 0.0f / 0.0f;
                                        break block123;
                                    }
                                    var69_59 = var17_16;
                                    var70_60 = var22_21;
                                    var71_61 = var25_24;
                                    var72_62 = var26_25;
                                    var73_63 = var33_32;
                                    var74_64 /* !! */  = var62_52;
                                    var75_65 = var55_48;
                                    var77_66 = var68_58;
                                    var21_20 = var31_30 + 16;
                                    var8_7.zzK(var21_20);
                                    var21_20 = 16;
                                    var8_7.zzL(var21_20);
                                    var22_21 = var8_7.zzq();
                                    var25_24 = var8_7.zzq();
                                    var8_7.zzL(50);
                                    var29_28 = var8_7.zzd();
                                    if (var16_15 == var14_13) {
                                        var18_17 = zzajw.zzh((zzfu)var8_7, var31_30, var66_56);
                                        if (var18_17 != null) {
                                            var13_12 = (Integer)var18_17.first;
                                            var14_13 = var13_12.intValue();
                                            if (var9_8 == null) {
                                                var33_32 = 0;
                                                var34_33 = 0.0f;
                                                var35_34 = null;
                                            } else {
                                                var35_34 = ((zzakq)var18_17.second).zzb;
                                                var35_34 = var9_8.zzb((String)var35_34);
                                            }
                                            var62_52 = var12_11 /* !! */ .zza;
                                            var62_52[var63_53] = var18_17 = (zzakq)var18_17.second;
                                            var16_15 = var14_13;
                                        } else {
                                            var35_34 = var9_8;
                                            var16_15 = 1701733238;
                                        }
                                        var8_7.zzK(var29_28);
                                    } else {
                                        var35_34 = var9_8;
                                    }
                                    var14_13 = 1831958048;
                                    var20_19 = 3.4326032E27f;
                                    if (var16_15 == var14_13) {
                                        var18_17 = var13_12 = "video/mpeg";
                                        var14_13 = var16_15;
                                    } else {
                                        var14_13 = 1211250227;
                                        var20_19 = 182488.8f;
                                        if (var16_15 == var14_13) {
                                            var18_17 = "video/3gpp";
                                        } else {
                                            var14_13 = var16_15;
                                            var16_15 = 0;
                                            var18_17 = null;
                                        }
                                    }
                                    var24_23 = 1065353216;
                                    var21_20 = var29_28;
                                    var78_67 = var35_34;
                                    var32_31 = var63_53;
                                    var29_28 = 0;
                                    var67_57 = null;
                                    var33_32 = 1065353216;
                                    var34_33 = 1.0f;
                                    var36_35 = 0;
                                    var37_36 = 0.0f;
                                    var40_38 /* !! */  = null;
                                    var48_43 = 0;
                                    var87_73 = null;
                                    var88_74 = -1;
                                    var63_53 = -1;
                                    var30_29 = 0;
                                    var89_75 = null;
                                    var41_39 = 0;
                                    var90_76 = 8;
                                    var68_58 = 8;
                                    var91_77 = -1;
                                    var92_78 = null;
                                    var93_79 = -1;
                                    var94_80 = 0.0f / 0.0f;
                                    while ((var24_23 = var21_20 - var31_30) < var66_56) {
                                        block125: {
                                            block153: {
                                                block127: {
                                                    block181: {
                                                        block180: {
                                                            block174: {
                                                                block176: {
                                                                    block177: {
                                                                        block178: {
                                                                            block179: {
                                                                                block175: {
                                                                                    block173: {
                                                                                        block172: {
                                                                                            block170: {
                                                                                                block171: {
                                                                                                    block169: {
                                                                                                        block154: {
                                                                                                            block126: {
                                                                                                                block163: {
                                                                                                                    block168: {
                                                                                                                        block165: {
                                                                                                                            block164: {
                                                                                                                                block166: {
                                                                                                                                    block167: {
                                                                                                                                        block162: {
                                                                                                                                            block161: {
                                                                                                                                                block160: {
                                                                                                                                                    block159: {
                                                                                                                                                        block158: {
                                                                                                                                                            block157: {
                                                                                                                                                                block156: {
                                                                                                                                                                    block155: {
                                                                                                                                                                        block152: {
                                                                                                                                                                            var8_7.zzK(var21_20);
                                                                                                                                                                            var24_23 = var8_7.zzd();
                                                                                                                                                                            var79_68 = var8_7.zzg();
                                                                                                                                                                            if (var79_68 == 0) {
                                                                                                                                                                                var79_68 = var8_7.zzd();
                                                                                                                                                                                var95_81 = var87_73;
                                                                                                                                                                                var48_43 = var79_68 - var31_30;
                                                                                                                                                                                if (var48_43 == var66_56) {
                                                                                                                                                                                    var96_82 = var22_21;
                                                                                                                                                                                    var97_83 = var25_24;
                                                                                                                                                                                    var98_84 = var34_33;
                                                                                                                                                                                    var99_85 /* !! */  = var40_38 /* !! */ ;
lbl610:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        continue;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                var48_43 = 0;
                                                                                                                                                                                var87_73 = null;
                                                                                                                                                                            } else {
                                                                                                                                                                                var95_81 = var87_73;
                                                                                                                                                                                var48_43 = var79_68;
                                                                                                                                                                            }
                                                                                                                                                                            if (var48_43 > 0) {
                                                                                                                                                                                var79_68 = var31_30;
                                                                                                                                                                                var80_69 = var66_56;
                                                                                                                                                                                var31_30 = 1;
                                                                                                                                                                            } else {
                                                                                                                                                                                var79_68 = var31_30;
                                                                                                                                                                                var80_69 = var66_56;
                                                                                                                                                                                var31_30 = 0;
                                                                                                                                                                                var50_45 = null;
                                                                                                                                                                            }
                                                                                                                                                                            var15_14 = "childAtomSize must be positive";
                                                                                                                                                                            zzady.zzb((boolean)var31_30, (String)var15_14);
                                                                                                                                                                            var31_30 = var8_7.zzg();
                                                                                                                                                                            var66_56 = 1635148611;
                                                                                                                                                                            if (var31_30 == var66_56) {
                                                                                                                                                                                var24_23 += 8;
                                                                                                                                                                                if (var18_17 == null) {
                                                                                                                                                                                    var16_15 = 1;
lbl634:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        continue;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                var16_15 = 0;
                                                                                                                                                                                var18_17 = null;
                                                                                                                                                                                ** continue;
                                                                                                                                                                                var66_56 = 0;
                                                                                                                                                                                var15_14 = null;
                                                                                                                                                                                zzady.zzb((boolean)var16_15, null);
                                                                                                                                                                                var8_7.zzK(var24_23);
                                                                                                                                                                                var18_17 = zzacx.zza((zzfu)var8_7);
                                                                                                                                                                                var62_52 = var18_17.zza;
                                                                                                                                                                                var12_11 /* !! */ .zzc = var36_35 = var18_17.zzb;
                                                                                                                                                                                if (var41_39 == 0) {
                                                                                                                                                                                    var37_36 = var18_17.zzj;
                                                                                                                                                                                    var33_32 = 0;
                                                                                                                                                                                    var34_33 = 0.0f;
                                                                                                                                                                                    var35_34 = null;
                                                                                                                                                                                } else {
                                                                                                                                                                                    var37_36 = var34_33;
                                                                                                                                                                                    var33_32 = 1;
                                                                                                                                                                                    var34_33 = 1.4E-45f;
                                                                                                                                                                                }
                                                                                                                                                                                var9_8 = var18_17.zzk;
                                                                                                                                                                                var63_53 = var18_17.zzg;
                                                                                                                                                                                var31_30 = var18_17.zzh;
                                                                                                                                                                                var66_56 = var18_17.zzi;
                                                                                                                                                                                var41_39 = var33_32;
                                                                                                                                                                                var33_32 = var18_17.zze;
                                                                                                                                                                                var16_15 = var18_17.zzf;
                                                                                                                                                                                var101_87 = "video/avc";
lbl663:
                                                                                                                                                                                // 2 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    var102_88 = var14_13;
                                                                                                                                                                                    var96_82 = var22_21;
                                                                                                                                                                                    var97_83 = var25_24;
                                                                                                                                                                                    var68_58 = var33_32;
                                                                                                                                                                                    var92_78 = var62_52;
                                                                                                                                                                                    var34_33 = var37_36;
                                                                                                                                                                                    var40_38 /* !! */  = (byte[])var9_8;
                                                                                                                                                                                    var91_77 = var31_30;
                                                                                                                                                                                    var100_86 /* !! */  = var12_11 /* !! */ ;
                                                                                                                                                                                    var88_74 = var66_56;
                                                                                                                                                                                    var22_21 = 3;
                                                                                                                                                                                    var23_22 = 4.2E-45f;
                                                                                                                                                                                    var25_24 = -1;
                                                                                                                                                                                    var26_25 = 0.0f / 0.0f;
                                                                                                                                                                                    var90_76 = var16_15;
                                                                                                                                                                                    var18_17 = var101_87;
                                                                                                                                                                                    break block125;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            var66_56 = 1752589123;
                                                                                                                                                                            if (var31_30 == var66_56) {
                                                                                                                                                                                var24_23 += 8;
                                                                                                                                                                                if (var18_17 == null) {
                                                                                                                                                                                    var16_15 = 1;
lbl686:
                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        continue;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                var16_15 = 0;
                                                                                                                                                                                var18_17 = null;
                                                                                                                                                                                ** continue;
                                                                                                                                                                                var36_35 = 0;
                                                                                                                                                                                var37_36 = 0.0f;
                                                                                                                                                                                var40_38 /* !! */  = null;
                                                                                                                                                                                zzady.zzb((boolean)var16_15, null);
                                                                                                                                                                                var8_7.zzK(var24_23);
                                                                                                                                                                                var18_17 = zzaek.zza((zzfu)var8_7);
                                                                                                                                                                                var62_52 = var18_17.zza;
                                                                                                                                                                                var12_11 /* !! */ .zzc = var36_35 = var18_17.zzb;
                                                                                                                                                                                if (var41_39 == 0) {
                                                                                                                                                                                    var37_36 = var18_17.zzh;
                                                                                                                                                                                    var33_32 = 0;
                                                                                                                                                                                    var34_33 = 0.0f;
                                                                                                                                                                                    var35_34 = null;
                                                                                                                                                                                } else {
                                                                                                                                                                                    var37_36 = var34_33;
                                                                                                                                                                                    var33_32 = 1;
                                                                                                                                                                                    var34_33 = 1.4E-45f;
                                                                                                                                                                                }
                                                                                                                                                                                var9_8 = var18_17.zzi;
                                                                                                                                                                                var63_53 = var18_17.zze;
                                                                                                                                                                                var31_30 = var18_17.zzf;
                                                                                                                                                                                var66_56 = var18_17.zzg;
                                                                                                                                                                                var41_39 = var33_32;
                                                                                                                                                                                var33_32 = var18_17.zzc;
                                                                                                                                                                                var16_15 = var18_17.zzd;
                                                                                                                                                                                var101_87 = "video/hevc";
                                                                                                                                                                                ** continue;
                                                                                                                                                                            }
                                                                                                                                                                            var66_56 = 1685480259;
                                                                                                                                                                            if (var31_30 != var66_56 && var31_30 != (var66_56 = 1685485123)) break block152;
                                                                                                                                                                            var102_88 = var14_13;
                                                                                                                                                                            var96_82 = var22_21;
                                                                                                                                                                            var97_83 = var25_24;
                                                                                                                                                                            var98_84 = var34_33;
                                                                                                                                                                            var99_85 /* !! */  = var40_38 /* !! */ ;
                                                                                                                                                                            var100_86 /* !! */  = var12_11 /* !! */ ;
                                                                                                                                                                            var22_21 = 3;
                                                                                                                                                                            var23_22 = 4.2E-45f;
                                                                                                                                                                            var25_24 = -1;
                                                                                                                                                                            var26_25 = 0.0f / 0.0f;
                                                                                                                                                                            break block153;
                                                                                                                                                                        }
                                                                                                                                                                        var66_56 = 1987076931;
                                                                                                                                                                        if (var31_30 == var66_56) {
                                                                                                                                                                            if (var18_17 == null) {
                                                                                                                                                                                var16_15 = 1;
lbl735:
                                                                                                                                                                                // 2 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    continue;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            var16_15 = 0;
                                                                                                                                                                            var18_17 = null;
                                                                                                                                                                            ** continue;
                                                                                                                                                                            var88_74 = 0;
                                                                                                                                                                            var9_8 = null;
                                                                                                                                                                            zzady.zzb((boolean)var16_15, null);
                                                                                                                                                                            var8_7.zzK(var24_23 += 12);
                                                                                                                                                                            var66_56 = 2;
                                                                                                                                                                            var8_7.zzL(var66_56);
                                                                                                                                                                            var16_15 = var8_7.zzm();
                                                                                                                                                                            var24_23 = var16_15 >> 4;
                                                                                                                                                                            var88_74 = 1;
                                                                                                                                                                            var63_53 = var8_7.zzm();
                                                                                                                                                                            var31_30 = var8_7.zzm();
                                                                                                                                                                            var63_53 = zzt.zza(var63_53);
                                                                                                                                                                            var16_15 = var88_74 != (var16_15 &= var88_74) ? 2 : 1;
                                                                                                                                                                            var31_30 = zzt.zzb(var31_30);
                                                                                                                                                                            var88_74 = 1987063864;
                                                                                                                                                                            var9_8 = var14_13 == var88_74 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                                                                                                                                            var102_88 = var14_13;
                                                                                                                                                                            var91_77 = var16_15;
                                                                                                                                                                            var96_82 = var22_21;
                                                                                                                                                                            var97_83 = var25_24;
                                                                                                                                                                            var90_76 = var24_23;
                                                                                                                                                                            var68_58 = var24_23;
                                                                                                                                                                            var18_17 = var9_8;
                                                                                                                                                                            var88_74 = var31_30;
                                                                                                                                                                            var100_86 /* !! */  = var12_11 /* !! */ ;
lbl765:
                                                                                                                                                                            // 2 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                var22_21 = 3;
                                                                                                                                                                                var23_22 = 4.2E-45f;
                                                                                                                                                                                var25_24 = -1;
                                                                                                                                                                                var26_25 = 0.0f / 0.0f;
                                                                                                                                                                                break block125;
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        var66_56 = 1635135811;
                                                                                                                                                                        var102_88 = var14_13;
                                                                                                                                                                        var13_12 = "AtomParsers";
                                                                                                                                                                        if (var31_30 != var66_56) break block154;
                                                                                                                                                                        var8_7.zzK(var24_23 += 8);
                                                                                                                                                                        var18_17 = new zzr();
                                                                                                                                                                        var9_8 = var8_7.zzM();
                                                                                                                                                                        var63_53 = ((Object)var9_8).length;
                                                                                                                                                                        var62_52 = new zzft((byte[])var9_8, var63_53);
                                                                                                                                                                        var88_74 = var8_7.zzd() * 8;
                                                                                                                                                                        var62_52.zzk(var88_74);
                                                                                                                                                                        var62_52.zzn(1);
                                                                                                                                                                        var31_30 = var62_52.zzd(3);
                                                                                                                                                                        var62_52.zzm(6);
                                                                                                                                                                        var63_53 = (int)var62_52.zzo();
                                                                                                                                                                        var66_56 = (int)var62_52.zzo();
                                                                                                                                                                        var90_76 = 10;
                                                                                                                                                                        var88_74 = 2;
                                                                                                                                                                        if (var31_30 != var88_74) ** GOTO lbl802
                                                                                                                                                                        if (var63_53 != 0) {
                                                                                                                                                                            var63_53 = 1;
                                                                                                                                                                            var31_30 = var63_53 != var66_56 ? 10 : 12;
                                                                                                                                                                            var18_17.zzf(var31_30);
                                                                                                                                                                            var18_17.zza(var31_30);
                                                                                                                                                                            var66_56 = 1;
                                                                                                                                                                        } else {
                                                                                                                                                                            var63_53 = 0;
                                                                                                                                                                            var10_9 = null;
                                                                                                                                                                            var31_30 = 2;
lbl802:
                                                                                                                                                                            // 2 sources

                                                                                                                                                                            var66_56 = 1;
                                                                                                                                                                            if (var31_30 <= var88_74) {
                                                                                                                                                                                var88_74 = var66_56 != var63_53 ? 8 : 10;
                                                                                                                                                                                var18_17.zzf(var88_74);
                                                                                                                                                                                var18_17.zza(var88_74);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        var88_74 = 13;
                                                                                                                                                                        var62_52.zzm(var88_74);
                                                                                                                                                                        var62_52.zzl();
                                                                                                                                                                        var63_53 = 4;
                                                                                                                                                                        var31_30 = var62_52.zzd(var63_53);
                                                                                                                                                                        if (var31_30 != var66_56) {
                                                                                                                                                                            var9_8 = "Unsupported obu_type: ";
                                                                                                                                                                            var62_52 = new StringBuilder((String)var9_8);
                                                                                                                                                                            var62_52.append(var31_30);
                                                                                                                                                                            var62_52 = var62_52.toString();
                                                                                                                                                                            zzfk.zze((String)var13_12, (String)var62_52);
                                                                                                                                                                            var13_12 = var18_17.zzg();
lbl822:
                                                                                                                                                                            // 6 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                var88_74 = 3;
                                                                                                                                                                                break block126;
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        var31_30 = (int)var62_52.zzo();
                                                                                                                                                                        if (var31_30 == 0) break block155;
                                                                                                                                                                        var62_52 = "Unsupported obu_extension_flag";
                                                                                                                                                                        zzfk.zze((String)var13_12, (String)var62_52);
                                                                                                                                                                        var13_12 = var18_17.zzg();
                                                                                                                                                                        ** GOTO lbl822
                                                                                                                                                                    }
                                                                                                                                                                    var31_30 = (int)var62_52.zzo();
                                                                                                                                                                    var62_52.zzl();
                                                                                                                                                                    if (var31_30 == 0 || (var66_56 = var62_52.zzd(8)) <= (var31_30 = 127)) break block156;
                                                                                                                                                                    var62_52 = "Excessive obu_size";
                                                                                                                                                                    zzfk.zze((String)var13_12, (String)var62_52);
                                                                                                                                                                    var13_12 = var18_17.zzg();
                                                                                                                                                                    ** GOTO lbl822
                                                                                                                                                                }
                                                                                                                                                                var66_56 = var62_52.zzd(3);
                                                                                                                                                                var62_52.zzl();
                                                                                                                                                                var31_30 = (int)var62_52.zzo();
                                                                                                                                                                if (var31_30 == 0) break block157;
                                                                                                                                                                var62_52 = "Unsupported reduced_still_picture_header";
                                                                                                                                                                zzfk.zze((String)var13_12, (String)var62_52);
                                                                                                                                                                var13_12 = var18_17.zzg();
                                                                                                                                                                ** GOTO lbl822
                                                                                                                                                            }
                                                                                                                                                            var31_30 = (int)var62_52.zzo();
                                                                                                                                                            if (var31_30 == 0) break block158;
                                                                                                                                                            var62_52 = "Unsupported timing_info_present_flag";
                                                                                                                                                            zzfk.zze((String)var13_12, (String)var62_52);
                                                                                                                                                            var13_12 = var18_17.zzg();
                                                                                                                                                            ** GOTO lbl822
                                                                                                                                                        }
                                                                                                                                                        var31_30 = (int)var62_52.zzo();
                                                                                                                                                        if (var31_30 != 0) {
                                                                                                                                                            var62_52 = "Unsupported initial_display_delay_present_flag";
                                                                                                                                                            zzfk.zze((String)var13_12, (String)var62_52);
                                                                                                                                                            var13_12 = var18_17.zzg();
                                                                                                                                                            ** continue;
                                                                                                                                                        }
                                                                                                                                                        var14_13 = 5;
                                                                                                                                                        var20_19 = 7.0E-45f;
                                                                                                                                                        var31_30 = var62_52.zzd(var14_13);
                                                                                                                                                        var9_8 = null;
                                                                                                                                                        for (var88_74 = 0; var88_74 <= var31_30; ++var88_74) {
                                                                                                                                                            var62_52.zzm(12);
                                                                                                                                                            var63_53 = var62_52.zzd(var14_13);
                                                                                                                                                            var14_13 = 7;
                                                                                                                                                            var20_19 = 9.8E-45f;
                                                                                                                                                            if (var63_53 > var14_13) {
                                                                                                                                                                var62_52.zzl();
                                                                                                                                                            }
                                                                                                                                                            var14_13 = 5;
                                                                                                                                                            var20_19 = 7.0E-45f;
                                                                                                                                                            var63_53 = 4;
                                                                                                                                                        }
                                                                                                                                                        var14_13 = 4;
                                                                                                                                                        var20_19 = 5.6E-45f;
                                                                                                                                                        var88_74 = var62_52.zzd(var14_13);
                                                                                                                                                        var63_53 = var62_52.zzd(var14_13);
                                                                                                                                                        var31_30 = 1;
                                                                                                                                                        var62_52.zzm(var88_74 += var31_30);
                                                                                                                                                        var62_52.zzm(var63_53 += var31_30);
                                                                                                                                                        var88_74 = (int)var62_52.zzo();
                                                                                                                                                        if (var88_74 != 0) {
                                                                                                                                                            var88_74 = 7;
                                                                                                                                                            var62_52.zzm(var88_74);
                                                                                                                                                        }
                                                                                                                                                        var62_52.zzm(7);
                                                                                                                                                        var88_74 = (int)var62_52.zzo();
                                                                                                                                                        if (var88_74 != 0) {
                                                                                                                                                            var63_53 = 2;
                                                                                                                                                            var62_52.zzm(var63_53);
                                                                                                                                                        }
                                                                                                                                                        if ((var63_53 = (int)var62_52.zzo()) == 0) break block159;
                                                                                                                                                        var63_53 = 1;
                                                                                                                                                        break block160;
                                                                                                                                                    }
                                                                                                                                                    var63_53 = 1;
                                                                                                                                                    var31_30 = var62_52.zzd(var63_53);
                                                                                                                                                    if (var31_30 <= 0) break block161;
                                                                                                                                                }
                                                                                                                                                var31_30 = (int)var62_52.zzo();
                                                                                                                                                if (var31_30 == 0) {
                                                                                                                                                    var62_52.zzm(var63_53);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            if (var88_74 != 0) {
                                                                                                                                                var88_74 = 3;
                                                                                                                                                var62_52.zzm(var88_74);
                                                                                                                                            } else {
                                                                                                                                                var88_74 = 3;
                                                                                                                                            }
                                                                                                                                            var62_52.zzm(var88_74);
                                                                                                                                            var63_53 = (int)var62_52.zzo();
                                                                                                                                            var31_30 = 2;
                                                                                                                                            if (var66_56 != var31_30) break block162;
                                                                                                                                            if (var63_53 != 0) {
                                                                                                                                                var62_52.zzl();
                                                                                                                                            }
                                                                                                                                            ** GOTO lbl-1000
                                                                                                                                        }
                                                                                                                                        var63_53 = 1;
                                                                                                                                        if (var66_56 == var63_53) {
                                                                                                                                            while (true) {
                                                                                                                                                var63_53 = 0;
                                                                                                                                                var10_9 = null;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        } else lbl-1000:
                                                                                                                                        // 2 sources

                                                                                                                                        {
                                                                                                                                            if ((var63_53 = (int)var62_52.zzo()) == 0) ** continue;
                                                                                                                                            var63_53 = 1;
                                                                                                                                        }
                                                                                                                                        var31_30 = (int)var62_52.zzo();
                                                                                                                                        if (var31_30 == 0) break block163;
                                                                                                                                        var31_30 = 8;
                                                                                                                                        var66_56 = var62_52.zzd(var31_30);
                                                                                                                                        var14_13 = var62_52.zzd(var31_30);
                                                                                                                                        var68_58 = var62_52.zzd(var31_30);
                                                                                                                                        if (var63_53 != 0) break block164;
                                                                                                                                        var63_53 = 1;
                                                                                                                                        if (var66_56 != var63_53) break block165;
                                                                                                                                        var31_30 = 13;
                                                                                                                                        if (var14_13 != var31_30) break block166;
                                                                                                                                        if (var68_58 != 0) break block167;
                                                                                                                                        var24_23 = 1;
                                                                                                                                        var66_56 = 1;
                                                                                                                                        break block168;
                                                                                                                                    }
                                                                                                                                    var14_13 = 13;
                                                                                                                                    var20_19 = 1.8E-44f;
                                                                                                                                }
                                                                                                                                var66_56 = 1;
                                                                                                                                break block165;
                                                                                                                            }
                                                                                                                            var63_53 = 1;
                                                                                                                        }
                                                                                                                        var24_23 = var62_52.zzd(var63_53);
                                                                                                                        var31_30 = var14_13;
                                                                                                                    }
                                                                                                                    var14_13 = zzt.zza(var66_56);
                                                                                                                    var18_17.zzc(var14_13);
                                                                                                                    if (var24_23 == var63_53) {
                                                                                                                        var14_13 = 1;
                                                                                                                        var20_19 = 1.4E-45f;
                                                                                                                    } else {
                                                                                                                        var14_13 = 2;
                                                                                                                        var20_19 = 2.8E-45f;
                                                                                                                    }
                                                                                                                    var18_17.zzb(var14_13);
                                                                                                                    var14_13 = zzt.zzb(var31_30);
                                                                                                                    var18_17.zzd(var14_13);
                                                                                                                }
                                                                                                                var13_12 = var18_17.zzg();
                                                                                                            }
                                                                                                            var16_15 = var13_12.zzf;
                                                                                                            var24_23 = var13_12.zze;
                                                                                                            var63_53 = var13_12.zzd;
                                                                                                            var31_30 = var13_12.zzi;
                                                                                                            var14_13 = var13_12.zzh;
                                                                                                            var15_14 = "video/av01";
                                                                                                            var68_58 = var14_13;
                                                                                                            var88_74 = var16_15;
                                                                                                            var96_82 = var22_21;
                                                                                                            var97_83 = var25_24;
                                                                                                            var91_77 = var24_23;
                                                                                                            var90_76 = var31_30;
                                                                                                            var100_86 /* !! */  = var12_11 /* !! */ ;
                                                                                                            var18_17 = var15_14;
                                                                                                            ** continue;
                                                                                                        }
                                                                                                        var66_56 = 1668050025;
                                                                                                        if (var31_30 == var66_56) {
                                                                                                            if (var67_57 == null) {
                                                                                                                var67_57 = zzajw.zzl();
                                                                                                            }
                                                                                                            var20_19 = 2.9E-44f;
                                                                                                            var67_57.position(21);
                                                                                                            var14_13 = var8_7.zzD();
                                                                                                            var67_57.putShort((short)var14_13);
                                                                                                            var14_13 = var8_7.zzD();
                                                                                                            var67_57.putShort((short)var14_13);
                                                                                                            var96_82 = var22_21;
                                                                                                            var97_83 = var25_24;
                                                                                                            var100_86 /* !! */  = var12_11 /* !! */ ;
lbl1002:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                var22_21 = 3;
                                                                                                                var23_22 = 4.2E-45f;
                                                                                                                var25_24 = -1;
                                                                                                                var26_25 = 0.0f / 0.0f;
                                                                                                                break block125;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var66_56 = 1835295606;
                                                                                                        if (var31_30 == var66_56) {
                                                                                                            if (var67_57 == null) {
                                                                                                                var67_57 = zzajw.zzl();
                                                                                                            }
                                                                                                            var14_13 = var8_7.zzD();
                                                                                                            var24_23 = var8_7.zzD();
                                                                                                            var31_30 = var8_7.zzD();
                                                                                                            var66_56 = var8_7.zzD();
                                                                                                            var100_86 /* !! */  = var12_11 /* !! */ ;
                                                                                                            var11_10 = var8_7.zzD();
                                                                                                            var98_84 = var34_33;
                                                                                                            var33_32 = var8_7.zzD();
                                                                                                            var97_83 = var25_24;
                                                                                                            var25_24 = var8_7.zzD();
                                                                                                            var96_82 = var22_21;
                                                                                                            var22_21 = var8_7.zzD();
                                                                                                            var103_89 = var8_7.zzu();
                                                                                                            var105_90 = var8_7.zzu();
                                                                                                            var99_85 /* !! */  = var40_38 /* !! */ ;
                                                                                                            var36_35 = 1;
                                                                                                            var37_36 = 1.4E-45f;
                                                                                                            var67_57.position(var36_35);
                                                                                                            var67_57.putShort((short)var11_10);
                                                                                                            var67_57.putShort((short)var33_32);
                                                                                                            var67_57.putShort((short)var14_13);
                                                                                                            var67_57.putShort((short)var24_23);
                                                                                                            var67_57.putShort((short)var31_30);
                                                                                                            var67_57.putShort((short)var66_56);
                                                                                                            var67_57.putShort((short)var25_24);
                                                                                                            var67_57.putShort((short)var22_21);
                                                                                                            var14_13 = (short)(var103_89 / 10000L);
                                                                                                            var67_57.putShort((short)var14_13);
                                                                                                            var107_91 = var105_90 / 10000L;
                                                                                                            var14_13 = (short)var107_91;
                                                                                                            var67_57.putShort((short)var14_13);
lbl1054:
                                                                                                            // 5 sources

                                                                                                            while (true) {
                                                                                                                var34_33 = var98_84;
                                                                                                                var40_38 /* !! */  = var99_85 /* !! */ ;
                                                                                                                ** continue;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var96_82 = var22_21;
                                                                                                        var97_83 = var25_24;
                                                                                                        var98_84 = var34_33;
                                                                                                        var99_85 /* !! */  = var40_38 /* !! */ ;
                                                                                                        var100_86 /* !! */  = var12_11 /* !! */ ;
                                                                                                        var22_21 = 1681012275;
                                                                                                        var23_22 = 1.3149704E22f;
                                                                                                        if (var31_30 != var22_21) break block169;
                                                                                                        if (var18_17 == null) {
                                                                                                            var14_13 = 1;
                                                                                                            var20_19 = 1.4E-45f;
lbl1069:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                continue;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var14_13 = 0;
                                                                                                        var20_19 = 0.0f;
                                                                                                        var13_12 = null;
                                                                                                        ** continue;
                                                                                                        var22_21 = 0;
                                                                                                        var23_22 = 0.0f;
                                                                                                        var28_27 = null;
                                                                                                        zzady.zzb((boolean)var14_13, null);
                                                                                                        var18_17 = var13_12 = "video/3gpp";
                                                                                                        ** GOTO lbl1054
                                                                                                    }
                                                                                                    var22_21 = 0;
                                                                                                    var23_22 = 0.0f;
                                                                                                    var28_27 = null;
                                                                                                    var25_24 = 1702061171;
                                                                                                    var26_25 = 7.183675E22f;
                                                                                                    if (var31_30 != var25_24) break block170;
                                                                                                    if (var18_17 == null) {
                                                                                                        var14_13 = 1;
                                                                                                        var20_19 = 1.4E-45f;
                                                                                                    } else {
                                                                                                        var14_13 = 0;
                                                                                                        var20_19 = 0.0f;
                                                                                                        var13_12 = null;
                                                                                                    }
                                                                                                    zzady.zzb((boolean)var14_13, null);
                                                                                                    var13_12 = zzajw.zzj((zzfu)var8_7, var24_23);
                                                                                                    var18_17 = zzajq.zzc((zzajq)var13_12);
                                                                                                    var28_27 = zzajq.zzd((zzajq)var13_12);
                                                                                                    if (var28_27 == null) break block171;
                                                                                                    var28_27 = zzgbc.zzn(var28_27);
                                                                                                    var89_75 = var13_12;
                                                                                                    var92_78 = var28_27;
                                                                                                    ** GOTO lbl1054
                                                                                                }
                                                                                                var89_75 = var13_12;
                                                                                                ** GOTO lbl1054
                                                                                            }
                                                                                            var22_21 = 1885434736;
                                                                                            var23_22 = 2.7909473E29f;
                                                                                            if (var31_30 != var22_21) break block172;
                                                                                            var8_7.zzK(var24_23 += 8);
                                                                                            var14_13 = var8_7.zzp();
                                                                                            var22_21 = var8_7.zzp();
                                                                                            var20_19 = var14_13;
                                                                                            var23_22 = var22_21;
                                                                                            var34_33 = var20_19 /= var23_22;
                                                                                            var22_21 = 3;
                                                                                            var23_22 = 4.2E-45f;
                                                                                            var25_24 = -1;
                                                                                            var26_25 = 0.0f / 0.0f;
                                                                                            var41_39 = 1;
                                                                                            break block125;
                                                                                        }
                                                                                        var22_21 = 1937126244;
                                                                                        var23_22 = 1.9506033E31f;
                                                                                        if (var31_30 != var22_21) break block173;
                                                                                        var14_13 = var24_23 + 8;
                                                                                        while ((var22_21 = var14_13 - var24_23) < var48_43) {
                                                                                            var8_7.zzK(var14_13);
                                                                                            var22_21 = var8_7.zzg() + var14_13;
                                                                                            var25_24 = var8_7.zzg();
                                                                                            var33_32 = 1886547818;
                                                                                            var34_33 = 3.0012025E29f;
                                                                                            if (var25_24 == var33_32) {
                                                                                                var109_92 /* !! */  = var8_7.zzM();
                                                                                                var95_81 = var13_12 = (Object)Arrays.copyOfRange((byte[])var109_92 /* !! */ , var14_13, var22_21);
                                                                                                ** continue;
                                                                                            }
                                                                                            var14_13 = var22_21;
                                                                                        }
                                                                                        var34_33 = var98_84;
                                                                                        var40_38 /* !! */  = var99_85 /* !! */ ;
                                                                                        var22_21 = 3;
                                                                                        var23_22 = 4.2E-45f;
                                                                                        var25_24 = -1;
                                                                                        var26_25 = 0.0f / 0.0f;
                                                                                        var95_81 = null;
                                                                                        break block125;
                                                                                    }
                                                                                    var22_21 = 1936995172;
                                                                                    var23_22 = 1.9347576E31f;
                                                                                    if (var31_30 != var22_21) break block174;
                                                                                    var14_13 = var8_7.zzm();
                                                                                    var22_21 = 3;
                                                                                    var23_22 = 4.2E-45f;
                                                                                    var8_7.zzL(var22_21);
                                                                                    if (var14_13 != 0) break block175;
                                                                                    var14_13 = var8_7.zzm();
                                                                                    if (var14_13 == 0) break block176;
                                                                                    var25_24 = 1;
                                                                                    var26_25 = 1.4E-45f;
                                                                                    if (var14_13 == var25_24) break block177;
                                                                                    var25_24 = 2;
                                                                                    var26_25 = 2.8E-45f;
                                                                                    if (var14_13 == var25_24) break block178;
                                                                                    if (var14_13 == var22_21) break block179;
                                                                                }
                                                                                while (true) {
                                                                                    var25_24 = -1;
                                                                                    var26_25 = 0.0f / 0.0f;
                                                                                    break block127;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var25_24 = -1;
                                                                            var26_25 = 0.0f / 0.0f;
                                                                            var93_79 = 3;
                                                                            var94_80 = 4.2E-45f;
                                                                            break block125;
                                                                        }
                                                                        var25_24 = -1;
                                                                        var26_25 = 0.0f / 0.0f;
                                                                        var93_79 = 2;
                                                                        var94_80 = 2.8E-45f;
                                                                        break block125;
                                                                    }
                                                                    var25_24 = -1;
                                                                    var26_25 = 0.0f / 0.0f;
                                                                    var93_79 = 1;
                                                                    var94_80 = 1.4E-45f;
                                                                    break block125;
                                                                }
                                                                var25_24 = -1;
                                                                var26_25 = 0.0f / 0.0f;
                                                                var93_79 = 0;
                                                                var94_80 = 0.0f;
                                                                break block125;
                                                            }
                                                            var22_21 = 3;
                                                            var23_22 = 4.2E-45f;
                                                            var25_24 = 1668246642;
                                                            var26_25 = 4.4165861E21f;
                                                            if (var31_30 != var25_24) ** continue;
                                                            var25_24 = -1;
                                                            var26_25 = 0.0f / 0.0f;
                                                            if (var63_53 != var25_24) break block127;
                                                            if (var88_74 != var25_24) break block180;
                                                            var33_32 = var8_7.zzg();
                                                            if (var33_32 == (var24_23 = 1852009592) || var33_32 == (var24_23 = 1852009571)) break block181;
                                                            var62_52 = "Unsupported color type: ";
                                                            var35_34 = zzajo.zzf(var33_32);
                                                            var35_34 = var62_52.concat((String)var35_34);
                                                            zzfk.zzf((String)var13_12, (String)var35_34);
                                                            var88_74 = -1;
                                                        }
                                                        var63_53 = -1;
                                                        break block125;
                                                    }
                                                    var14_13 = var8_7.zzq();
                                                    var33_32 = var8_7.zzq();
                                                    var8_7.zzL(2);
                                                    var24_23 = 19;
                                                    if (var48_43 != var24_23) ** GOTO lbl1227
                                                    var24_23 = var8_7.zzm() & 128;
                                                    if (var24_23 != 0) {
                                                        var48_43 = 19;
                                                        var24_23 = 1;
                                                    } else {
                                                        var48_43 = 19;
lbl1227:
                                                        // 2 sources

                                                        var24_23 = 0;
                                                        var62_52 = null;
                                                    }
                                                    var14_13 = zzt.zza(var14_13);
                                                    var36_35 = 1;
                                                    var37_36 = 1.4E-45f;
                                                    var24_23 = var36_35 != var24_23 ? 2 : 1;
                                                    var33_32 = zzt.zzb(var33_32);
                                                    var63_53 = var14_13;
                                                    var88_74 = var33_32;
                                                    var91_77 = var24_23;
                                                }
                                                while (true) {
                                                    var34_33 = var98_84;
                                                    var40_38 /* !! */  = var99_85 /* !! */ ;
                                                    break block125;
                                                    break;
                                                }
                                            }
                                            if ((var13_12 = zzado.zza((zzfu)var8_7)) == null) ** continue;
                                            var13_12 = var13_12.zza;
                                            var18_17 = "video/dolby-vision";
                                            var40_38 /* !! */  = (byte[])var13_12;
                                        }
                                        var21_20 += var48_43;
                                        var31_30 = var79_68;
                                        var87_73 = var95_81;
                                        var66_56 = var80_69;
                                        var14_13 = var102_88;
                                        var12_11 /* !! */  = var100_86 /* !! */ ;
                                        var25_24 = var97_83;
                                        var22_21 = var96_82;
                                    }
                                    var96_82 = var22_21;
                                    var97_83 = var25_24;
                                    var98_84 = var34_33;
                                    var99_85 /* !! */  = var40_38 /* !! */ ;
                                    var95_81 = var87_73;
                                    ** continue;
                                    var79_68 = var31_30;
                                    var100_86 /* !! */  = var12_11 /* !! */ ;
                                    var80_69 = var66_56;
                                    var22_21 = 3;
                                    var23_22 = 4.2E-45f;
                                    var25_24 = -1;
                                    var26_25 = 0.0f / 0.0f;
                                    if (var18_17 == null) {
                                        var16_15 = var70_60;
                                        var21_20 = var73_63;
                                        var67_57 = var12_11 /* !! */ ;
                                    } else {
                                        var13_12 = new zzal();
                                        var21_20 = var73_63;
                                        var13_12.zzJ(var73_63);
                                        var13_12.zzX((String)var18_17);
                                        var40_38 /* !! */  = var99_85 /* !! */ ;
                                        var13_12.zzz((String)var99_85 /* !! */ );
                                        var16_15 = var96_82;
                                        var13_12.zzac(var96_82);
                                        var16_15 = var97_83;
                                        var13_12.zzI(var97_83);
                                        var13_12.zzT(var98_84);
                                        var16_15 = var70_60;
                                        var13_12.zzW(var70_60);
                                        var35_34 = var95_81;
                                        var13_12.zzU((byte[])var95_81);
                                        var33_32 = var93_79;
                                        var34_33 = var94_80;
                                        var13_12.zzaa(var93_79);
                                        var35_34 = var92_78;
                                        var13_12.zzL((List)var92_78);
                                        var35_34 = var78_67;
                                        var13_12.zzE((zzae)var78_67);
                                        var35_34 = new zzr();
                                        var35_34.zzc(var63_53);
                                        var24_23 = var91_77;
                                        var35_34.zzb(var91_77);
                                        var35_34.zzd(var88_74);
                                        if (var67_57 != null) {
                                            var67_57 = var67_57.array();
                                        } else {
                                            var29_28 = 0;
                                            var67_57 = null;
                                        }
                                        var35_34.zze((byte[])var67_57);
                                        var29_28 = var68_58;
                                        var35_34.zzf(var68_58);
                                        var29_28 = var90_76;
                                        var35_34.zza(var90_76);
                                        var67_57 = var35_34.zzg();
                                        var13_12.zzA((zzt)var67_57);
                                        if (var89_75 != null) {
                                            var29_28 = zzgea.zze(zzajq.zza((zzajq)var89_75));
                                            var13_12.zzx(var29_28);
                                            var110_93 = zzajq.zzb((zzajq)var89_75);
                                            var29_28 = zzgea.zze(var110_93);
                                            var13_12.zzS(var29_28);
                                        }
                                        var13_12 = var13_12.zzad();
                                        var67_57 = var100_86 /* !! */ ;
                                        var100_86 /* !! */ .zzb = var13_12;
                                    }
                                }
                                var31_30 = var79_68 + var80_69;
                                var8_7.zzK(var31_30);
                                var63_53 = var32_31 + 1;
                                var9_8 = var4_3;
                                var22_21 = var16_15;
                                var33_32 = var21_20;
                                var12_11 /* !! */  = var67_57;
                                var14_13 = var77_66;
                                var25_24 = var71_61;
                                var26_25 = var72_62;
                                var50_45 = var64_54;
                                var55_48 = var75_65;
                                var17_16 = var69_59;
                                var15_14 = var65_55;
                                var62_52 = var74_64 /* !! */ ;
                                var16_15 = 12;
                                var29_28 = 8;
                            }
                            var71_61 = var25_24;
                            var72_62 = var26_25;
                            var74_64 /* !! */  = var62_52;
                            var75_65 = var55_48;
                            var64_54 = var50_45;
                            var67_57 = var12_11 /* !! */ ;
                            var65_55 = var15_14;
                            if (var5_4) ** GOTO lbl1419
                            var49_44 = 1701082227;
                            var13_12 = var15_14;
                            var8_7 = var15_14.zza(var49_44);
                            if (var8_7 == null) ** GOTO lbl-1000
                            var16_15 = 1701606260;
                            if ((var8_7 = var8_7.zzb(var16_15)) == null) {
                                var22_21 = 0;
                                var23_22 = 0.0f;
                                var28_27 = null;
                            } else {
                                var8_7 = var8_7.zza;
                                var8_7.zzK(8);
                                var16_15 = zzajo.zze(var8_7.zzg());
                                var21_20 = var8_7.zzp();
                                var28_27 = new long[var21_20];
                                var109_92 /* !! */  = new long[var21_20];
                                var34_33 = 0.0f;
                                var35_34 = null;
                                for (var33_32 = 0; var33_32 < var21_20; ++var33_32) {
                                    var24_23 = 1;
                                    var55_48 = var16_15 == var24_23 ? var8_7.zzv() : var8_7.zzu();
                                    var28_27[var33_32] = var55_48;
                                    if (var16_15 == var24_23) {
                                        var55_48 = var8_7.zzt();
                                    } else {
                                        var36_35 = var8_7.zzg();
                                        var55_48 = var36_35;
                                    }
                                    var109_92 /* !! */ [var33_32] = var55_48;
                                    var36_35 = var8_7.zzD();
                                    if (var36_35 == var24_23) {
                                        var36_35 = 2;
                                        var37_36 = 2.8E-45f;
                                        var8_7.zzL(var36_35);
                                        continue;
                                    }
                                    var8_7 = new IllegalArgumentException("Unsupported media rate.");
                                    throw var8_7;
                                }
                                var28_27 = Pair.create((Object)var28_27, (Object)var109_92 /* !! */ );
                            }
                            if (var28_27 != null) {
                                var8_7 = (long[])var28_27.first;
                                var18_17 = (long[])var28_27.second;
                                var112_94 = var8_7;
                                var113_95 = var18_17;
                            } else lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    var68_58 = 0;
                                    var112_94 = null;
                                    var91_77 = 0;
                                    var113_95 = null;
                                    break block128;
                                    break;
                                }
lbl1419:
                                // 1 sources

                                var13_12 = var15_14;
                                ** continue;
                            }
                        }
                        var8_7 = var67_57.zzb;
                        if (var8_7 == null) {
                            var8_7 = var7_6;
                            var22_21 = 0;
                            var23_22 = 0.0f;
                            var28_27 = null;
                        } else {
                            var30_29 = zzajv.zza(var64_54);
                            var8_7 = var74_64 /* !! */ ;
                            var114_96 = (Long)var74_64 /* !! */ .first;
                            var8_7 = var67_57.zzb;
                            var16_15 = var67_57.zzd;
                            var17_16 = var67_57.zza;
                            var25_24 = var67_57.zzc;
                            var69_59 = var17_16;
                            var90_76 = var25_24;
                            var28_27 = new zzakp(var30_29, var71_61, var114_96, var75_65, var38_37, (zzan)var8_7, var16_15, var17_16, var25_24, (long[])var112_94, (long[])var113_95);
                            var8_7 = var7_6;
                        }
                    }
                    var18_17 = (zzakp)var8_7.apply(var28_27);
                    if (var18_17 != null) {
                        var13_12 = var13_12.zza(1835297121);
                        var13_12.getClass();
                        var13_12 = var13_12.zza(1835626086);
                        var13_12.getClass();
                        var21_20 = 1937007212;
                        var13_12 = var13_12.zza(var21_20);
                        var13_12.getClass();
                        var17_16 = var1_1;
                        var13_12 = zzajw.zzk((zzakp)var18_17, (zzajm)var13_12, var1_1);
                        var18_17 = var27_26;
                        var27_26.add(var13_12);
                    } else {
                        var17_16 = var1_1;
                        var18_17 = var27_26;
                    }
                }
                var11_10 = var19_18 + 1;
                var8_7 = var0;
                var9_8 = var4_3;
                var10_9 = var18_17;
                continue;
            }
            throw zzch.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        var18_17 = var10_9;
        return var10_9;
    }

    public static void zze(zzfu zzfu2) {
        int n3 = zzfu2.zzd();
        zzfu2.zzL(4);
        int n4 = zzfu2.zzg();
        int n7 = 1751411826;
        if (n4 != n7) {
            n3 += 4;
        }
        zzfu2.zzK(n3);
    }

    private static int zzf(zzfu zzfu2) {
        int n3;
        int n4 = zzfu2.zzm();
        int n7 = n4 & 0x7F;
        while ((n4 &= (n3 = 128)) == n3) {
            n4 = zzfu2.zzm();
            n7 <<= 7;
            n3 = n4 & 0x7F;
            n7 |= n3;
        }
        return n7;
    }

    private static int zzg(zzfu zzfu2) {
        zzfu2.zzK(16);
        return zzfu2.zzg();
    }

    private static Pair zzh(zzfu zzfu2, int n3, int n4) {
        int n7;
        zzfu zzfu3 = zzfu2;
        int n8 = zzfu2.zzd();
        while ((n7 = n8 - n3) < n4) {
            Object object;
            int n10;
            zzfu3.zzK(n8);
            n7 = zzfu2.zzg();
            int n14 = 1;
            String string2 = null;
            if (n7 > 0) {
                n10 = 1;
            } else {
                n10 = 0;
                object = null;
            }
            Object object2 = "childAtomSize must be positive";
            zzady.zzb(n10 != 0, (String)object2);
            n10 = zzfu2.zzg();
            int n15 = 1936289382;
            if (n10 == n15) {
                Object object3;
                int n16;
                int n17;
                int n18;
                int n19;
                n10 = n8 + 8;
                n15 = -1;
                int n20 = -1;
                int n21 = 0;
                String string3 = null;
                Integer n22 = null;
                while (true) {
                    n19 = n10 - n8;
                    n18 = 4;
                    if (n19 >= n7) break;
                    zzfu3.zzK(n10);
                    n19 = zzfu2.zzg();
                    n17 = zzfu2.zzg();
                    n16 = 1718775137;
                    if (n17 == n16) {
                        n16 = zzfu2.zzg();
                        n22 = n16;
                    } else {
                        n16 = 1935894637;
                        if (n17 == n16) {
                            zzfu3.zzL(n18);
                            object3 = zzfxs.zzc;
                            string3 = zzfu3.zzA(n18, (Charset)object3);
                        } else {
                            n16 = 1935894633;
                            if (n17 == n16) {
                                n20 = n10;
                                n21 = n19;
                            }
                        }
                    }
                    n10 += n19;
                }
                object3 = "cenc";
                n16 = ((String)object3).equals(string3);
                if (n16 == 0 && (n16 = (int)(((String)(object3 = "cbc1")).equals(string3) ? 1 : 0)) == 0 && (n16 = (int)(((String)(object3 = "cens")).equals(string3) ? 1 : 0)) == 0 && (n16 = ((String)(object3 = "cbcs")).equals(string3)) == 0) {
                    n16 = 0;
                    object3 = null;
                } else {
                    block24: {
                        if (n22 != null) {
                            n16 = 1;
                        } else {
                            n16 = 0;
                            object3 = null;
                        }
                        object = "frma atom is mandatory";
                        zzady.zzb(n16 != 0, (String)object);
                        if (n20 != n15) {
                            n16 = 1;
                        } else {
                            n16 = 0;
                            object3 = null;
                        }
                        object = "schi atom is mandatory";
                        zzady.zzb(n16 != 0, (String)object);
                        n16 = n20 + 8;
                        while ((n10 = n16 - n20) < n21) {
                            zzfu3.zzK(n16);
                            n10 = zzfu2.zzg();
                            n15 = zzfu2.zzg();
                            n19 = 1952804451;
                            if (n15 == n19) {
                                Object object4;
                                n16 = zzajo.zze(zzfu2.zzg());
                                zzfu3.zzL(n14);
                                if (n16 == 0) {
                                    zzfu3.zzL(n14);
                                    n16 = 0;
                                    object3 = null;
                                    n17 = 0;
                                } else {
                                    n16 = zzfu2.zzm();
                                    n10 = (n16 & 0xF0) >> n18;
                                    n16 &= 0xF;
                                    n17 = n10;
                                }
                                n10 = zzfu2.zzm();
                                n21 = n10 == n14 ? 1 : 0;
                                n19 = zzfu2.zzm();
                                n10 = 16;
                                byte[] byArray = new byte[n10];
                                zzfu3.zzG(byArray, 0, n10);
                                if (n21 != 0 && n19 == 0) {
                                    n10 = zzfu2.zzm();
                                    object2 = new byte[n10];
                                    zzfu3.zzG((byte[])object2, 0, n10);
                                    object4 = object2;
                                } else {
                                    object4 = null;
                                }
                                object2 = n22;
                                object3 = object = new zzakq(n21 != 0, string3, n19, byArray, n17, n16, (byte[])object4);
                                break block24;
                            }
                            object2 = n22;
                            n16 += n10;
                        }
                        object2 = n22;
                        n16 = 0;
                        object3 = null;
                    }
                    if (object3 == null) {
                        n14 = 0;
                    }
                    string2 = "tenc atom is mandatory";
                    zzady.zzb(n14 != 0, string2);
                    n14 = zzgd.zza;
                    object3 = Pair.create((Object)object2, (Object)object3);
                }
                if (object3 != null) {
                    return object3;
                }
            }
            n8 += n7;
        }
        return null;
    }

    private static zzcd zzi(zzfu zzccArray) {
        int n3 = zzccArray.zzD();
        zzccArray.zzL(2);
        Object object = zzfxs.zzc;
        zzccArray = zzccArray.zzA(n3, (Charset)object);
        n3 = zzccArray.lastIndexOf(43);
        float f5 = 6.3E-44f;
        int n4 = zzccArray.lastIndexOf(45);
        n3 = Math.max(n3, n4);
        object = zzccArray.substring(0, n3);
        f5 = Float.parseFloat((String)object);
        int n7 = zzccArray.length() + -1;
        zzccArray = zzccArray.substring(n3, n7);
        float f6 = Float.parseFloat((String)zzccArray);
        zzgk zzgk2 = new zzgk(f5, f6);
        int n8 = 1;
        f6 = Float.MIN_VALUE;
        zzccArray = new zzcc[n8];
        zzccArray[0] = zzgk2;
        long l2 = -9223372036854775807L;
        try {
            zzcd zzcd2 = new zzcd(l2, zzccArray);
            return zzcd2;
        }
        catch (IndexOutOfBoundsException | NumberFormatException runtimeException) {
            return null;
        }
    }

    private static zzajq zzj(zzfu object, int n3) {
        ((zzfu)object).zzK(n3 += 12);
        n3 = 1;
        ((zzfu)object).zzL(n3);
        zzajw.zzf((zzfu)object);
        int n4 = 2;
        ((zzfu)object).zzL(n4);
        int n7 = ((zzfu)object).zzm();
        int n8 = n7 & 0x80;
        if (n8 != 0) {
            ((zzfu)object).zzL(n4);
        }
        if ((n8 = n7 & 0x40) != 0) {
            n8 = ((zzfu)object).zzm();
            ((zzfu)object).zzL(n8);
        }
        if ((n7 &= 0x20) != 0) {
            ((zzfu)object).zzL(n4);
        }
        ((zzfu)object).zzL(n3);
        zzajw.zzf((zzfu)object);
        String string2 = zzcg.zzd(((zzfu)object).zzm());
        String string3 = "audio/mpeg";
        n4 = (int)(string3.equals(string2) ? 1 : 0);
        if (n4 == 0 && (n4 = (int)((string3 = "audio/vnd.dts").equals(string2) ? 1 : 0)) == 0 && (n4 = (int)((string3 = "audio/vnd.dts.hd").equals(string2) ? 1 : 0)) == 0) {
            n4 = 4;
            ((zzfu)object).zzL(n4);
            long l2 = ((zzfu)object).zzu();
            long l3 = ((zzfu)object).zzu();
            ((zzfu)object).zzL(n3);
            n3 = zzajw.zzf((zzfu)object);
            byte[] byArray = new byte[n3];
            ((zzfu)object).zzG(byArray, 0, n3);
            long l4 = -1;
            long l7 = 0L;
            long l8 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
            long l12 = l8 <= 0 ? l4 : l3;
            long l14 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
            l7 = l14 > 0 ? l2 : l4;
            object = new zzajq(string2, byArray, l12, l7);
            return object;
        }
        long l15 = -1;
        object = new zzajq(string2, null, l15, l15);
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static zzaks zzk(zzakp zzakp2, zzajm object, zzaej zzaej2) {
        int n3;
        int n4;
        void var28_124;
        int n7;
        int n8;
        long l2;
        long l3;
        long l4;
        Object object2;
        long l7;
        long l8;
        long l12;
        long l14;
        long l15;
        long l16;
        long l17;
        int n10;
        void var47_165;
        long l18;
        long l19;
        Object object3;
        Object object4;
        int n14;
        Object object5;
        Object object6;
        int n15;
        Object object7;
        Object object8;
        int n16;
        Object object9;
        Object object10;
        Object object11;
        int n17;
        Object object12;
        zzan zzan2;
        int n18;
        Object object13;
        Object object14;
        Object object15;
        Object object16;
        block91: {
            void var10_23;
            void var33_135;
            void var15_46;
            block88: {
                block90: {
                    long l20;
                    void var17_72;
                    block89: {
                        long l21;
                        long l22;
                        long l23;
                        Object object17;
                        reference var28_122;
                        int n19;
                        int n20;
                        int n21;
                        block78: {
                            void var50_171;
                            void var71_203;
                            long l24;
                            int n22;
                            int n24;
                            block86: {
                                void var28_119;
                                void var19_97;
                                void var15_42;
                                int n25;
                                block85: {
                                    int n26;
                                    int n27;
                                    block79: {
                                        block80: {
                                            block81: {
                                                block87: {
                                                    block82: {
                                                        zzajp zzajp2;
                                                        block83: {
                                                            block84: {
                                                                void var70_199;
                                                                Object object18;
                                                                block75: {
                                                                    void var42_159;
                                                                    long l25;
                                                                    int n28;
                                                                    block73: {
                                                                        Object object19;
                                                                        void var15_39;
                                                                        int n29;
                                                                        boolean bl2;
                                                                        int n30;
                                                                        int n32;
                                                                        block76: {
                                                                            block77: {
                                                                                int n34;
                                                                                void var17_60;
                                                                                Object object20;
                                                                                long l26;
                                                                                int n35;
                                                                                void var17_57;
                                                                                object16 = zzakp2;
                                                                                object15 = object;
                                                                                object14 = zzaej2;
                                                                                int n36 = -1;
                                                                                n24 = 1937011578;
                                                                                object13 = ((zzajm)object).zzb(n24);
                                                                                n18 = 0;
                                                                                Object var10_17 = null;
                                                                                if (object13 != null) {
                                                                                    zzan2 = zzakp2.zzf;
                                                                                    object12 = new zzajt((zzajn)object13, zzan2);
                                                                                } else {
                                                                                    n24 = 1937013298;
                                                                                    object13 = ((zzajm)object).zzb(n24);
                                                                                    if (object13 == null) {
                                                                                        throw zzch.zza("Track has no sample table size information", null);
                                                                                    }
                                                                                    object12 = new zzaju((zzajn)object13);
                                                                                }
                                                                                n24 = object12.zzb();
                                                                                n17 = 0;
                                                                                zzan2 = null;
                                                                                if (n24 == 0) {
                                                                                    zzaks zzaks2;
                                                                                    object14 = new long[0];
                                                                                    int[] nArray = new int[]{};
                                                                                    object13 = new long[0];
                                                                                    int[] nArray2 = new int[]{};
                                                                                    object15 = zzaks2;
                                                                                    object16 = zzakp2;
                                                                                    return new zzaks(zzakp2, (long[])object14, nArray, 0, (long[])object13, nArray2, 0L);
                                                                                }
                                                                                n27 = 1937007471;
                                                                                object11 = ((zzajm)object15).zzb(n27);
                                                                                if (object11 == null) {
                                                                                    n27 = 1668232756;
                                                                                    object11 = ((zzajm)object15).zzb(n27);
                                                                                    object11.getClass();
                                                                                    boolean bl3 = true;
                                                                                } else {
                                                                                    boolean bl4 = false;
                                                                                    Object var18_76 = null;
                                                                                }
                                                                                int n37 = 1937011555;
                                                                                object10 = ((zzajm)object15).zzb(n37);
                                                                                object10.getClass();
                                                                                n32 = 0x73747473;
                                                                                object9 = ((zzajm)object15).zzb(n32);
                                                                                object9.getClass();
                                                                                n16 = 0x73747373;
                                                                                object8 = ((zzajm)object15).zzb(n16);
                                                                                if (object8 != null) {
                                                                                    object8 = ((zzajn)object8).zza;
                                                                                } else {
                                                                                    n16 = 0;
                                                                                    object8 = null;
                                                                                }
                                                                                object7 = 1668576371;
                                                                                object15 = ((zzajm)object15).zzb((int)object7);
                                                                                if (object15 != null) {
                                                                                    object15 = ((zzajn)object15).zza;
                                                                                } else {
                                                                                    n15 = 0;
                                                                                    object15 = null;
                                                                                }
                                                                                object9 = ((zzajn)object9).zza;
                                                                                object10 = ((zzajn)object10).zza;
                                                                                object11 = ((zzajn)object11).zza;
                                                                                zzajp2 = new zzajp((zzfu)object10, (zzfu)object11, (boolean)var17_57);
                                                                                n27 = 12;
                                                                                ((zzfu)object9).zzK(n27);
                                                                                int n38 = ((zzfu)object9).zzp() + n36;
                                                                                int n39 = ((zzfu)object9).zzp();
                                                                                int n41 = ((zzfu)object9).zzp();
                                                                                if (object15 != null) {
                                                                                    ((zzfu)object15).zzK(n27);
                                                                                    n28 = ((zzfu)object15).zzp();
                                                                                } else {
                                                                                    n28 = 0;
                                                                                    object6 = null;
                                                                                }
                                                                                if (object8 != null) {
                                                                                    ((zzfu)object8).zzK(n27);
                                                                                    n27 = ((zzfu)object8).zzp();
                                                                                    if (n27 > 0) {
                                                                                        n18 = ((zzfu)object8).zzp() + n36;
                                                                                    } else {
                                                                                        n16 = 0;
                                                                                        object8 = null;
                                                                                        n18 = -1;
                                                                                    }
                                                                                } else {
                                                                                    n18 = -1;
                                                                                    n27 = 0;
                                                                                    object11 = null;
                                                                                }
                                                                                n17 = object12.zza();
                                                                                object5 = ((zzakp)object16).zzf.zzn;
                                                                                if (n17 == n36 || (n14 = ((String)(object16 = "audio/raw")).equals(object5)) == 0 && (n14 = ((String)(object16 = "audio/g711-mlaw")).equals(object5)) == 0 && (n14 = ((String)(object16 = "audio/g711-alaw")).equals(object5)) == 0 || n38 != 0) break block76;
                                                                                if (n28 != 0 || n27 != 0) break block77;
                                                                                n15 = zzajp2.zza;
                                                                                object16 = new long[n15];
                                                                                object14 = new int[n15];
                                                                                while ((n35 = zzajp2.zza()) != 0) {
                                                                                    n35 = zzajp2.zzb;
                                                                                    l26 = zzajp2.zzd;
                                                                                    object16[n35] = l26;
                                                                                    n18 = zzajp2.zzc;
                                                                                    object14[n35] = n18;
                                                                                }
                                                                                l26 = n41;
                                                                                int n42 = 8192 / n17;
                                                                                Object var10_19 = null;
                                                                                boolean bl5 = false;
                                                                                Object var18_77 = null;
                                                                                for (n18 = 0; n18 < n15; var17_60 += object20, n18 += object20) {
                                                                                    object20 = object14[n18];
                                                                                    n32 = zzgd.zza;
                                                                                    Object object20 = (object20 + n42 + n36) / n42;
                                                                                    object20 = true;
                                                                                }
                                                                                long[] lArray = new long[var17_60];
                                                                                object10 = new int[var17_60];
                                                                                object9 = new long[var17_60];
                                                                                int[] nArray = new int[var17_60];
                                                                                object8 = null;
                                                                                object7 = 0;
                                                                                zzajp2 = null;
                                                                                boolean bl6 = false;
                                                                                object4 = null;
                                                                                n28 = 0;
                                                                                object6 = null;
                                                                                for (n16 = 0; n16 < n15; ++n16) {
                                                                                    reference var6_7;
                                                                                    Object object21 = object14[n16];
                                                                                    object3 = object16[n16];
                                                                                    for (var6_7 = object21; var6_7 > 0; object3 += l19, object7 += n26, var6_7 -= n26, ++n28) {
                                                                                        n26 = Math.min(n42, (int)var6_7);
                                                                                        lArray[n28] = (long)object3;
                                                                                        n30 = n15;
                                                                                        n15 = n17 * n26;
                                                                                        object10[n28] = n15;
                                                                                        n34 = Math.max(n34, n15);
                                                                                        Object object22 = object16;
                                                                                        l19 = (long)object7 * l26;
                                                                                        object9[n28] = l19;
                                                                                        nArray[n28] = 1;
                                                                                        n14 = (int)object10[n28];
                                                                                        l19 = n14;
                                                                                        n15 = n30;
                                                                                    }
                                                                                    n30 = n15;
                                                                                    Object object23 = object16;
                                                                                    var6_7 = (reference)-1;
                                                                                }
                                                                                l19 = object7;
                                                                                n15 = n24;
                                                                                object14 = lArray;
                                                                                l18 = l26 *= l19;
                                                                                int[] nArray3 = nArray;
                                                                                Object object24 = object10;
                                                                                object13 = object9;
                                                                                void var33_132 = n34;
                                                                                object11 = zzakp2;
                                                                                break block78;
                                                                            }
                                                                            bl2 = false;
                                                                            Object var18_79 = null;
                                                                        }
                                                                        object16 = new long[n24];
                                                                        object14 = new int[n24];
                                                                        long[] lArray = new long[n24];
                                                                        object5 = new int[n24];
                                                                        var47_165 = bl2;
                                                                        Object object25 = object9;
                                                                        n30 = 0;
                                                                        object = null;
                                                                        n17 = 0;
                                                                        zzan2 = null;
                                                                        boolean bl7 = false;
                                                                        Object var18_81 = null;
                                                                        n10 = 0;
                                                                        Object var50_168 = null;
                                                                        n26 = 0;
                                                                        l17 = 0L;
                                                                        l25 = 0L;
                                                                        while (true) {
                                                                            Object object26;
                                                                            int n43;
                                                                            int n44;
                                                                            int n45;
                                                                            boolean bl8;
                                                                            long l27;
                                                                            block72: {
                                                                                object9 = "AtomParsers";
                                                                                if (n17 >= n24) break;
                                                                                l27 = l17;
                                                                                bl8 = true;
                                                                                n45 = n30;
                                                                                while (n45 == 0) {
                                                                                    bl8 = zzajp2.zza();
                                                                                    n29 = n24;
                                                                                    n44 = n18;
                                                                                    if (bl8) {
                                                                                        l27 = l16 = zzajp2.zzd;
                                                                                        n45 = zzajp2.zzc;
                                                                                        n24 = n29;
                                                                                        continue;
                                                                                    }
                                                                                    n24 = 0;
                                                                                    object13 = null;
                                                                                    break block72;
                                                                                }
                                                                                n29 = n24;
                                                                                n44 = n18;
                                                                                n24 = n45;
                                                                            }
                                                                            if (!bl8) {
                                                                                object13 = "Unexpected end of chunk data";
                                                                                zzfk.zzf((String)object9, (String)object13);
                                                                                object16 = Arrays.copyOf((long[])object16, n17);
                                                                                object14 = Arrays.copyOf((int[])object14, n17);
                                                                                long[] lArray2 = Arrays.copyOf((long[])var15_39, n17);
                                                                                object5 = Arrays.copyOf((int[])object5, n17);
                                                                                n24 = n17;
                                                                                n18 = n10;
                                                                                Object object27 = object15;
                                                                                n15 = n45;
                                                                                break block73;
                                                                            }
                                                                            if (object15 != null) {
                                                                                block74: {
                                                                                    while (n26 == 0) {
                                                                                        if (n28 > 0) {
                                                                                            n18 = -1;
                                                                                            n28 += -1;
                                                                                            n26 = ((zzfu)object15).zzp();
                                                                                            n10 = ((zzfu)object15).zzg();
                                                                                            continue;
                                                                                        }
                                                                                        n18 = -1;
                                                                                        n26 = 0;
                                                                                        break block74;
                                                                                    }
                                                                                    n18 = -1;
                                                                                }
                                                                                n26 += -1;
                                                                            }
                                                                            n18 = n10;
                                                                            object16[n17] = l27;
                                                                            n32 = object12.zzc();
                                                                            object14[n17] = n32;
                                                                            Object object28 = object15;
                                                                            object19 = object16;
                                                                            if (n32 > n22) {
                                                                                n22 = n32;
                                                                            }
                                                                            l19 = n18;
                                                                            var15_39[n17] = l19 = l25 + l19;
                                                                            if (object8 == null) {
                                                                                n15 = 1;
                                                                            } else {
                                                                                n15 = 0;
                                                                                object15 = null;
                                                                            }
                                                                            object5[n17] = n15;
                                                                            n15 = n44;
                                                                            if (n17 == n44) {
                                                                                object5[n17] = true;
                                                                                n14 = -1;
                                                                                if ((n27 += n14) > 0) {
                                                                                    object8.getClass();
                                                                                    n15 = ((zzfu)object8).zzp() + n14;
                                                                                }
                                                                            } else {
                                                                                n14 = -1;
                                                                            }
                                                                            void var64_182 = var15_39;
                                                                            Object object29 = object5;
                                                                            l15 = n43;
                                                                            l25 += l15;
                                                                            if (!(object18 += n14)) {
                                                                                if (var47_165 > 0) {
                                                                                    object26 = ((zzfu)object25).zzp();
                                                                                    int n46 = ((zzfu)object25).zzg();
                                                                                    var47_165 += -1;
                                                                                    object18 = object26;
                                                                                    n43 = n46;
                                                                                } else {
                                                                                    object18 = false;
                                                                                    object10 = null;
                                                                                }
                                                                            }
                                                                            object26 = object14[n17];
                                                                            l15 = (long)object26;
                                                                            l15 = l27 + l15;
                                                                            n24 += n14;
                                                                            n14 = 1;
                                                                            n17 += n14;
                                                                            n30 = n24;
                                                                            n10 = n18;
                                                                            object16 = object19;
                                                                            n24 = n29;
                                                                            n18 = n15;
                                                                            object15 = object28;
                                                                            l17 = l15;
                                                                            void var15_41 = var64_182;
                                                                            object5 = object29;
                                                                        }
                                                                        Object object30 = object15;
                                                                        object19 = object16;
                                                                        void var64_183 = var15_39;
                                                                        Object object31 = object5;
                                                                        n29 = n24;
                                                                        n15 = n30;
                                                                        n18 = n10;
                                                                    }
                                                                    l24 = n18;
                                                                    l24 = l25 + l24;
                                                                    if (var42_159 != null) {
                                                                        while (n28 > 0) {
                                                                            int n47 = var42_159.zzp();
                                                                            if (n47 != 0) {
                                                                                boolean bl9 = false;
                                                                                object12 = null;
                                                                                break block75;
                                                                            }
                                                                            var42_159.zzg();
                                                                            n47 = -1;
                                                                            n28 += -1;
                                                                        }
                                                                    }
                                                                    boolean bl10 = true;
                                                                }
                                                                if (n27 != 0) break block79;
                                                                if (object18) break block80;
                                                                if (n15 != 0) break block81;
                                                                if (var47_165 != false) break block82;
                                                                if (n26 != 0) break block83;
                                                                if (var70_199 != false) break block84;
                                                                n15 = 0;
                                                                object15 = null;
                                                                n25 = 0;
                                                                object12 = null;
                                                                boolean bl11 = false;
                                                                object10 = null;
                                                                n16 = 0;
                                                                object8 = null;
                                                                object7 = 0;
                                                                zzajp2 = null;
                                                                boolean bl12 = false;
                                                                object4 = null;
                                                                object11 = zzakp2;
                                                                object = object16;
                                                                break block85;
                                                            }
                                                            object11 = zzakp2;
                                                            object = object16;
                                                            object6 = object14;
                                                            var71_203 = var15_42;
                                                            Object object32 = object5;
                                                            break block86;
                                                        }
                                                        n15 = 0;
                                                        object15 = null;
                                                        boolean bl13 = false;
                                                        object10 = null;
                                                        n16 = 0;
                                                        object8 = null;
                                                        object7 = 0;
                                                        zzajp2 = null;
                                                        object11 = zzakp2;
                                                        object = object16;
                                                        break block87;
                                                    }
                                                    n15 = 0;
                                                    object15 = null;
                                                    boolean bl14 = false;
                                                    object10 = null;
                                                    n16 = 0;
                                                    object8 = null;
                                                    object11 = zzakp2;
                                                    object = object16;
                                                    object7 = var47_165;
                                                }
                                                int n48 = n26;
                                                break block85;
                                            }
                                            boolean bl15 = false;
                                            object10 = null;
                                        }
                                        object11 = zzakp2;
                                        n16 = n15;
                                        object = object16;
                                        object7 = var47_165;
                                        int n49 = n26;
                                        n15 = 0;
                                        object15 = null;
                                        break block85;
                                    }
                                    n16 = n15;
                                    object = object16;
                                    n15 = n27;
                                    object7 = var47_165;
                                    int n50 = n26;
                                    object11 = zzakp2;
                                }
                                n14 = ((zzakp)object11).zza;
                                object6 = object14;
                                var71_203 = var15_42;
                                String string2 = ": remainingSynchronizationSamples ";
                                Object object33 = object5;
                                object5 = ", remainingSamplesAtTimestampDelta ";
                                object15 = fQ2.a("Inconsistent stbl box for track ", string2, (String)object5, n14, n15);
                                object14 = ", remainingTimestampDeltaChanges ";
                                m10.a((StringBuilder)object15, (int)var19_97, ", remainingSamplesInChunk ", n16, (String)object14);
                                ((StringBuilder)object15).append((int)object7);
                                object16 = ", remainingSamplesAtTimestampOffset ";
                                ((StringBuilder)object15).append((String)object16);
                                ((StringBuilder)object15).append((int)var28_119);
                                n14 = 1;
                                object16 = n14 != n25 ? ", ctts invalid" : "";
                                ((StringBuilder)object15).append((String)object16);
                                object15 = ((StringBuilder)object15).toString();
                                zzfk.zzf((String)object9, (String)object15);
                            }
                            object14 = object;
                            n15 = n24;
                            l18 = l24;
                            int n51 = n22;
                            Object object34 = object6;
                            object13 = var71_203;
                            void var10_22 = var50_171;
                        }
                        l14 = ((zzakp)object11).zzc;
                        object16 = RoundingMode.FLOOR;
                        l12 = 1000000L;
                        l8 = l18;
                        object6 = object16;
                        l8 = zzgd.zzt(l18, l12, l14, (RoundingMode)((Object)object16));
                        object9 = ((zzakp)object11).zzh;
                        l7 = 1000000L;
                        if (object9 == null) {
                            l19 = ((zzakp)object11).zzc;
                            zzgd.zzF((long[])object13, l7, l19);
                            object15 = object9;
                            object16 = zzakp2;
                            l18 = l8;
                            return new zzaks(zzakp2, (long[])object14, (int[])var15_46, (int)var33_135, (long[])object13, (int[])var10_23, l8);
                        }
                        int n52 = ((Object)object9).length;
                        int n54 = 1;
                        if (n52 != n54 || (n21 = ((zzakp)object11).zzb) != n54 || (n20 = ((Object)object13).length) < (n19 = 2)) break block88;
                        object10 = ((zzakp)object11).zzi;
                        object10.getClass();
                        object2 = object10[0];
                        object3 = object9[0];
                        l4 = ((zzakp)object11).zzc;
                        l7 = ((zzakp)object11).zzd;
                        l3 = l4;
                        Object object35 = object16;
                        l4 = zzgd.zzt((long)object3, l4, l7, (RoundingMode)((Object)object16));
                        l4 = (long)(object2 + l4);
                        n16 = -1 + n20;
                        object7 = Math.min(4, n16);
                        boolean bl16 = false;
                        object4 = null;
                        object7 = Math.max(0, object7);
                        int n56 = Math.min(n20 + -4, n16);
                        n56 = Math.max(0, n56);
                        l2 = (long)object13[0];
                        n16 = (int)(l2 == object2 ? 0 : (l2 < object2 ? -1 : 1));
                        if (n16 > 0 || (var28_122 = (object17 = object2 - (l7 = (long)object13[object7])) == 0 ? 0 : (object17 < 0 ? -1 : 1)) >= 0 || (l23 = (l22 = (l7 = (long)object13[n56]) - l4) == 0L ? 0 : (l22 < 0L ? -1 : 1)) >= 0 || (l21 = l4 == l18 ? 0 : (l4 < l18 ? -1 : 1)) > 0) break block88;
                        object3 = object2 - l2;
                        zzan zzan3 = ((zzakp)object11).zzf;
                        l7 = zzan3.zzB;
                        object = var15_46;
                        var17_72 = var33_135;
                        l15 = ((zzakp)object11).zzc;
                        l3 = l7;
                        l15 = zzgd.zzt((long)object3, l7, l15, (RoundingMode)((Object)object16));
                        object8 = ((zzakp)object11).zzf;
                        l7 = ((zzan)object8).zzB;
                        object4 = object13;
                        object6 = var10_23;
                        l16 = ((zzakp)object11).zzc;
                        object3 = l18 - l4;
                        l3 = l7;
                        l16 = zzgd.zzt((long)object3, l7, l16, (RoundingMode)((Object)object16));
                        l4 = 0L;
                        long l28 = l15 - l4;
                        n16 = (int)(l28 == 0L ? 0 : (l28 < 0L ? -1 : 1));
                        if (n16 != 0) break block89;
                        Object object36 = l16 == l4 ? 0 : (l16 < l4 ? -1 : 1);
                        if (object36 == false) break block90;
                        l15 = 0L;
                    }
                    if ((n16 = (int)((l20 = l15 - (l4 = Integer.MAX_VALUE)) == 0L ? 0 : (l20 < 0L ? -1 : 1))) <= 0 && (n16 = (int)(l16 == l4 ? 0 : (l16 < l4 ? -1 : 1))) <= 0) {
                        n15 = (int)l15;
                        zzaej zzaej3 = zzaej2;
                        zzaej2.zza = n15;
                        zzaej2.zzb = n15 = (int)l16;
                        l15 = ((zzakp)object11).zzc;
                        object9 = object4;
                        zzgd.zzF((long[])object4, 1000000L, l15);
                        object3 = ((zzakp)object11).zzh[0];
                        l15 = ((zzakp)object11).zzd;
                        Object object37 = object16;
                        l18 = zzgd.zzt((long)object3, 1000000L, l15, (RoundingMode)((Object)object16));
                        object15 = object10;
                        object16 = zzakp2;
                        Object object38 = object;
                        void var33_136 = var17_72;
                        object13 = object4;
                        Object object39 = object6;
                        return new zzaks(zzakp2, (long[])object14, (int[])object, (int)var17_72, (long[])object4, (int[])object6, l18);
                    }
                }
                object9 = object4;
                break block91;
            }
            object = var15_46;
            void var17_73 = var33_135;
            object9 = object13;
            object6 = var10_23;
        }
        object16 = ((zzakp)object11).zzh;
        int n57 = ((Object)object16).length;
        int n58 = 1;
        if (n57 == n58) {
            boolean bl17 = false;
            object5 = null;
            l16 = (long)object16[0];
            l7 = 0L;
            long l29 = l16 - l7;
            n14 = (int)(l29 == 0L ? 0 : (l29 < 0L ? -1 : 1));
            if (n14 == 0) {
                object15 = ((zzakp)object11).zzi;
                object15.getClass();
                l16 = (long)object15[0];
                n15 = 0;
                object15 = null;
                while (true) {
                    if (n15 >= (n14 = ((Object)object9).length)) {
                        void var17_74;
                        long l30 = l18 - l16;
                        l19 = ((zzakp)object11).zzc;
                        RoundingMode roundingMode = RoundingMode.FLOOR;
                        l2 = l19;
                        l18 = zzgd.zzt(l30, 1000000L, l19, roundingMode);
                        object15 = object10;
                        object16 = zzakp2;
                        Object object40 = object;
                        void var33_139 = var17_74;
                        object13 = object9;
                        Object object41 = object6;
                        return new zzaks(zzakp2, (long[])object14, (int[])object, (int)var17_74, (long[])object9, (int[])object6, l18);
                    }
                    reference var89_220 = object9[n15] - l16;
                    l15 = ((zzakp)object11).zzc;
                    RoundingMode roundingMode = RoundingMode.FLOOR;
                    l2 = 1000000L;
                    long l31 = l15;
                    l15 = zzgd.zzt((long)var89_220, l2, l15, roundingMode);
                    object9[n15] = l15;
                    n14 = 1;
                    n15 += n14;
                }
            }
            n8 = 1;
        }
        if ((n14 = ((zzakp)object11).zzb) == (n7 = 1)) {
            n14 = 1;
        } else {
            n14 = 0;
            object16 = null;
        }
        object5 = ((zzakp)object11).zzi;
        object13 = new int[n8];
        int[] nArray = new int[n8];
        object5.getClass();
        n18 = 0;
        Object var10_26 = null;
        n17 = 0;
        zzan2 = null;
        boolean bl18 = false;
        object12 = null;
        boolean bl19 = false;
        object4 = null;
        while (var28_124 < (n16 = ((Object)(object10 = (Object)((zzakp)object11).zzh)).length)) {
            Object object42;
            void var37_146;
            l7 = (long)object5[var28_124];
            l2 = -1;
            long l34 = l7 - l2;
            n10 = (int)(l34 == 0L ? 0 : (l34 < 0L ? -1 : 1));
            if (n10 != 0) {
                l3 = (long)object10[var28_124];
                var37_146 = n4;
                l8 = ((zzakp)object11).zzc;
                n3 = n17;
                var47_165 = object42;
                l18 = ((zzakp)object11).zzd;
                RoundingMode roundingMode = RoundingMode.FLOOR;
                l18 = zzgd.zzt(l3, l8, l18, roundingMode);
                n4 = 1;
                int n59 = zzgd.zzc((long[])object9, l7, n4 != 0, n4 != 0);
                object13[var28_124] = n59;
                n17 = 0;
                zzan2 = null;
                nArray[var28_124] = object42 = zzgd.zza((long[])object9, l7 += l18, n14 != 0, false);
                while ((object42 = (Object)object13[var28_124]) < (n59 = nArray[var28_124]) && (n16 = object6[object42] & n4) == 0) {
                    object13[var28_124] = object42 += n4;
                    n4 = 1;
                }
                n4 = n59 - object42 + n18;
                n16 = var47_165;
                if (var47_165 != object42) {
                    n18 = 1;
                } else {
                    n18 = 0;
                    Object var10_28 = null;
                }
                object42 = n3 | n18;
                n18 = n4;
                n16 = n59;
            } else {
                n3 = n17;
                n16 = object42;
                var37_146 = n4;
                n17 = 0;
                zzan2 = null;
                object42 = n3;
            }
            n4 = 1;
            var28_124 += n4;
            n17 = object42;
            object42 = n16;
            n4 = var37_146;
        }
        n3 = n17;
        void var37_147 = n4;
        n17 = 0;
        zzan2 = null;
        if (n18 != n15) {
            n15 = 1;
        } else {
            n15 = 0;
            object15 = null;
        }
        n15 = n3 | n15;
        object5 = n15 != 0 ? (object16 = (Object)new long[n18]) : object14;
        object12 = n15 != 0 ? (object16 = (Object)new int[n18]) : object;
        n14 = 1;
        if (n14 == n15) {
            boolean bl20 = false;
        }
        if (n15 != 0) {
            Object object43 = object16 = (Object)new int[n18];
        } else {
            Object object44 = object6;
        }
        long[] lArray = new long[n18];
        n14 = 0;
        object16 = null;
        l7 = 0L;
        while (true) {
            void var97_227;
            Object object45;
            long l35;
            Object object46;
            Object object47;
            Object object48;
            void var15_51;
            void var18_87;
            void var37_149;
            long l36;
            Object object49;
            if (n17 >= (object49 = ((Object)(object10 = (Object)((zzakp)object11).zzh)).length)) {
                object6 = object5;
                l36 = l7;
                l19 = ((zzakp)object11).zzd;
                RoundingMode roundingMode = RoundingMode.FLOOR;
                object3 = l7;
                l4 = zzgd.zzt(l7, 1000000L, l19, roundingMode);
                object15 = object8;
                object16 = zzakp2;
                object14 = object5;
                Object object50 = object12;
                void var33_142 = var37_149;
                object13 = lArray;
                void var10_30 = var18_87;
                l18 = l4;
                return new zzaks(zzakp2, (long[])object5, (int[])object12, (int)var37_149, (long[])object13, (int[])var18_87, l4);
            }
            object10 = ((zzakp)object11).zzi;
            object2 = object10[n17];
            object49 = object13[n17];
            Object object51 = var15_51[n17];
            if (n15 != 0) {
                void var97_228 = var15_51;
                object48 = object51 - object49;
                System.arraycopy(object14, object49, object5, n14, (int)object48);
                object47 = object14;
                object14 = object;
                System.arraycopy(object, object49, object12, n14, (int)object48);
                object46 = object13;
                object13 = object6;
                System.arraycopy(object6, object49, var18_87, n14, (int)object48);
            } else {
                object47 = object14;
                void var97_229 = var15_51;
                object46 = object13;
                object13 = object6;
                object14 = object;
            }
            object48 = var37_149;
            while (object49 < object51) {
                object6 = object5;
                Object object52 = object13;
                long l37 = ((zzakp)object11).zzd;
                RoundingMode roundingMode = RoundingMode.FLOOR;
                l3 = 1000000L;
                object3 = l7;
                RoundingMode roundingMode2 = roundingMode;
                l37 = zzgd.zzt(l7, l3, l37, roundingMode);
                l2 = (long)(object9[object49] - object2);
                long l38 = 1000000L;
                Object object53 = object9;
                l35 = l7;
                l17 = l12 = ((zzakp)object11).zzc;
                l12 = zzgd.zzt(l2, l38, l12, roundingMode);
                object7 = ((zzakp)object11).zzb;
                var47_165 = object51;
                object51 = 1;
                if (object7 != object51) {
                    l14 = 0L;
                    l12 = Math.max(l14, l12);
                } else {
                    l14 = 0L;
                }
                lArray[n14] = l37 += l12;
                if (n15 != 0 && (object45 = (Object)object12[n14]) > object48) {
                    object48 = object14[object49];
                }
                object45 = 1;
                n14 += object45;
                object49 += object45;
                l7 = l35;
                object5 = object6;
                object51 = var47_165;
                object9 = object53;
                object13 = object52;
            }
            object6 = object5;
            Object object54 = object13;
            Object object55 = object9;
            l35 = l7;
            object45 = 1;
            l14 = 0L;
            l4 = ((zzakp)object11).zzh[n17];
            l36 = l7;
            l4 = l7 + l4;
            n17 += object45;
            object = object14;
            var37_149 = object48;
            l7 = l4;
            void var15_52 = var97_227;
            object14 = object47;
            object13 = object46;
            object6 = object54;
        }
    }

    private static ByteBuffer zzl() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(25);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        return byteBuffer.order(byteOrder);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void zzm(zzfu var0, int var1_1, int var2_2, int var3_3, int var4_4, String var5_5, boolean var6_6, zzae var7_7, zzajs var8_8, int var9_9) {
        block105: {
            block106: {
                block104: {
                    block99: {
                        var10_10 = var0;
                        var11_11 = var2_2;
                        var12_12 = var3_3;
                        var13_13 = var4_4;
                        var14_14 = var5_5;
                        var15_15 = var7_7;
                        var16_16 = var8_8;
                        var17_17 = 1;
                        var18_18 = 16;
                        var19_19 = 2.2E-44f;
                        var20_20 = var2_2 + 16;
                        var0.zzK(var20_20);
                        var20_20 = 6;
                        var21_21 = 8;
                        if (var6_6) {
                            var22_22 = var0.zzq();
                            var0.zzL(var20_20);
                        } else {
                            var0.zzL(var21_21);
                            var22_22 = 0;
                            var23_23 = null;
                        }
                        var24_24 = 4;
                        var25_25 = 2;
                        if (var22_22 == 0 || var22_22 == var17_17) break block104;
                        if (var22_22 != var25_25) break block105;
                        var10_10.zzL(var18_18);
                        var26_26 = var0.zzt();
                        var28_27 = Double.longBitsToDouble(var26_26);
                        var30_28 = Math.round(var28_27);
                        var20_20 = (int)var30_28;
                        var22_22 = var0.zzp();
                        var10_10.zzL(var24_24);
                        var32_29 = var0.zzp();
                        var33_30 = var0.zzp();
                        var34_31 = var33_30 & 1;
                        var33_30 &= var25_25;
                        if (var34_31 != 0) ** GOTO lbl76
                        if (var32_29 == var21_21) {
                            var18_18 = 3;
                            var19_19 = 4.2E-45f;
                        } else if (var32_29 == var18_18) {
                            if (var33_30 != 0) {
                                var18_18 = 0x10000000;
                                var19_19 = 2.524355E-29f;
                            } else {
                                var18_18 = 2;
                                var19_19 = 2.8E-45f;
                            }
                        } else {
                            var18_18 = 24;
                            var19_19 = 3.4E-44f;
                            if (var32_29 == var18_18) {
                                if (var33_30 != 0) {
                                    var18_18 = 0x50000000;
                                    var19_19 = 8.589935E9f;
                                } else {
                                    var18_18 = 21;
                                    var19_19 = 2.9E-44f;
                                }
                            } else {
                                var18_18 = 32;
                                var19_19 = 4.5E-44f;
                                if (var32_29 == var18_18) {
                                    if (var33_30 != 0) {
                                        var32_29 = 0x60000000;
                                        var18_18 = 0x60000000;
                                        var19_19 = 3.689349E19f;
                                    } else {
                                        var32_29 = 22;
                                        var18_18 = 22;
                                        var19_19 = 3.1E-44f;
                                    }
                                } else {
                                    while (true) {
                                        var18_18 = -1;
                                        var19_19 = 0.0f / 0.0f;
                                        break block99;
                                        break;
                                    }
lbl76:
                                    // 1 sources

                                    var18_18 = 32;
                                    var19_19 = 4.5E-44f;
                                    if (var32_29 != var18_18) ** continue;
                                    var18_18 = 4;
                                    var19_19 = 5.6E-45f;
                                }
                            }
                        }
                    }
                    var10_10.zzL(var21_21);
                    var33_30 = 0;
                    break block106;
                }
                var32_29 = var0.zzq();
                var10_10.zzL(var20_20);
                var20_20 = var0.zzn();
                var33_30 = var0.zzd() + -4;
                var10_10.zzK(var33_30);
                var33_30 = var0.zzg();
                if (var22_22 == var17_17) {
                    var10_10.zzL(var18_18);
                }
                var22_22 = var32_29;
                var18_18 = -1;
                var19_19 = 0.0f / 0.0f;
            }
            var32_29 = var0.zzd();
            var24_24 = 1701733217;
            var25_25 = var1_1;
            if (var1_1 == var24_24) {
                var35_32 /* !! */  = zzajw.zzh((zzfu)var10_10, var11_11, var12_12);
                if (var35_32 /* !! */  != null) {
                    var36_33 = (Integer)var35_32 /* !! */ .first;
                    var24_24 = var36_33.intValue();
                    if (var15_15 == null) {
                        var15_15 = null;
                    } else {
                        var37_34 = ((zzakq)var35_32 /* !! */ .second).zzb;
                        var15_15 = var15_15.zzb((String)var37_34);
                    }
                    var37_34 = var16_16.zza;
                    var35_32 /* !! */  = (zzakq)var35_32 /* !! */ .second;
                    var37_34[var9_9] = var35_32 /* !! */ ;
                }
                var10_10.zzK(var32_29);
            } else {
                var24_24 = var1_1;
            }
            var17_17 = 1633889587;
            var38_35 = "audio/mhm1";
            var35_32 /* !! */  = "audio/ac4";
            if (var24_24 == var17_17) {
                var36_33 = "audio/ac3";
            } else {
                var17_17 = 1700998451;
                if (var24_24 == var17_17) {
                    var36_33 = "audio/eac3";
                } else {
                    var17_17 = 1633889588;
                    if (var24_24 == var17_17) {
                        var36_33 = var35_32 /* !! */ ;
                    } else {
                        var17_17 = 1685353315;
                        if (var24_24 == var17_17) {
                            var36_33 = "audio/vnd.dts";
                        } else {
                            var17_17 = 1685353320;
                            if (var24_24 != var17_17 && var24_24 != (var17_17 = 1685353324)) {
                                var17_17 = 1685353317;
                                if (var24_24 == var17_17) {
                                    var36_33 = "audio/vnd.dts.hd;profile=lbr";
                                } else {
                                    var17_17 = 1685353336;
                                    if (var24_24 == var17_17) {
                                        var36_33 = "audio/vnd.dts.uhd;profile=p2";
                                    } else {
                                        var17_17 = 1935764850;
                                        if (var24_24 == var17_17) {
                                            var36_33 = "audio/3gpp";
                                        } else {
                                            var17_17 = 1935767394;
                                            if (var24_24 == var17_17) {
                                                var36_33 = "audio/amr-wb";
                                            } else {
                                                var17_17 = 1936684916;
                                                var39_36 = "audio/raw";
                                                if (var24_24 == var17_17) {
                                                    while (true) {
                                                        var36_33 = var39_36;
                                                        var18_18 = 2;
                                                        var19_19 = 2.8E-45f;
                                                        break;
                                                    }
                                                } else {
                                                    var17_17 = 1953984371;
                                                    if (var24_24 == var17_17) {
                                                        var36_33 = var39_36;
                                                        var18_18 = 0x10000000;
                                                        var19_19 = 2.524355E-29f;
                                                    } else {
                                                        var17_17 = 1819304813;
                                                        if (var24_24 == var17_17) {
                                                            if (var18_18 == (var17_17 = -1)) ** continue;
                                                            var36_33 = var39_36;
                                                        } else {
                                                            var17_17 = 778924082;
                                                            if (var24_24 != var17_17 && var24_24 != (var17_17 = 778924083)) {
                                                                var17_17 = 1835557169;
                                                                if (var24_24 == var17_17) {
                                                                    var36_33 = "audio/mha1";
                                                                } else {
                                                                    var17_17 = 1835560241;
                                                                    if (var24_24 == var17_17) {
                                                                        var36_33 = var38_35;
                                                                    } else {
                                                                        var17_17 = 1634492771;
                                                                        if (var24_24 == var17_17) {
                                                                            var36_33 = "audio/alac";
                                                                        } else {
                                                                            var17_17 = 1634492791;
                                                                            if (var24_24 == var17_17) {
                                                                                var36_33 = "audio/g711-alaw";
                                                                            } else {
                                                                                var17_17 = 1970037111;
                                                                                if (var24_24 == var17_17) {
                                                                                    var36_33 = "audio/g711-mlaw";
                                                                                } else {
                                                                                    var17_17 = 1332770163;
                                                                                    if (var24_24 == var17_17) {
                                                                                        var36_33 = "audio/opus";
                                                                                    } else {
                                                                                        var17_17 = 1716281667;
                                                                                        if (var24_24 == var17_17) {
                                                                                            var36_33 = "audio/flac";
                                                                                        } else {
                                                                                            var17_17 = 1835823201;
                                                                                            if (var24_24 == var17_17) {
                                                                                                var36_33 = "audio/true-hd";
                                                                                            } else {
                                                                                                var24_24 = 0;
                                                                                                var36_33 = null;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                var36_33 = "audio/mpeg";
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var36_33 = "audio/vnd.dts.hd";
                            }
                        }
                    }
                }
            }
            var40_37 = var18_18;
            var7_7 = null;
            var18_18 = 0;
            var19_19 = 0.0f;
            var41_38 /* !! */  = null;
            var39_36 = null;
            while ((var17_17 = var32_29 - var11_11) < var12_12) {
                block100: {
                    block101: {
                        block102: {
                            block110: {
                                block114: {
                                    block116: {
                                        block115: {
                                            block113: {
                                                block112: {
                                                    block111: {
                                                        block108: {
                                                            block109: {
                                                                block107: {
                                                                    var10_10.zzK(var32_29);
                                                                    var17_17 = var0.zzg();
                                                                    if (var17_17 > 0) {
                                                                        var11_11 = 1;
                                                                    } else {
                                                                        var11_11 = 0;
                                                                        var42_39 = null;
                                                                    }
                                                                    var43_40 = "childAtomSize must be positive";
                                                                    zzady.zzb((boolean)var11_11, (String)var43_40);
                                                                    var11_11 = var0.zzg();
                                                                    var9_9 = var20_20;
                                                                    var20_20 = 1835557187;
                                                                    if (var11_11 != var20_20) break block107;
                                                                    var11_11 = var32_29 + 8;
                                                                    var10_10.zzK(var11_11);
                                                                    var11_11 = 1;
                                                                    var10_10.zzL(var11_11);
                                                                    var12_12 = var0.zzm();
                                                                    var10_10.zzL(var11_11);
                                                                    var20_20 = (int)Objects.equals(var36_33, var38_35);
                                                                    if (var20_20 != 0) {
                                                                        var43_40 = var12_12;
                                                                        var44_41 /* !! */  = new Object[var11_11];
                                                                        var11_11 = 0;
                                                                        var42_39 = null;
                                                                        var44_41 /* !! */ [0] = var43_40;
                                                                        var43_40 = String.format("mhm1.%02X", var44_41 /* !! */ );
                                                                        var45_42 = var38_35;
                                                                    } else {
                                                                        var11_11 = 0;
                                                                        var42_39 = null;
                                                                        var43_40 = var12_12;
                                                                        var45_42 = var38_35;
                                                                        var20_20 = 1;
                                                                        var38_35 = new Object[var20_20];
                                                                        var38_35[0] = var43_40;
                                                                        var43_40 = String.format("mha1.%02X", (Object[])var38_35);
                                                                    }
                                                                    var20_20 = var0.zzq();
                                                                    var38_35 = new byte[var20_20];
                                                                    var10_10.zzG((byte[])var38_35, 0, var20_20);
                                                                    if (var41_38 /* !! */  == null) {
                                                                        var41_38 /* !! */  = zzgbc.zzn(var38_35);
lbl261:
                                                                        // 3 sources

                                                                        while (true) {
                                                                            var20_20 = var9_9;
                                                                            var46_43 /* !! */  = var35_32 /* !! */ ;
                                                                            var21_21 = 0;
                                                                            var38_35 = null;
lbl266:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var47_44 = 3;
                                                                                var48_45 = 2;
                                                                                break block100;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    var41_38 /* !! */  = (byte[])var41_38 /* !! */ .get(0);
                                                                    var41_38 /* !! */  = zzgbc.zzo(var38_35, var41_38 /* !! */ );
                                                                    ** GOTO lbl261
                                                                }
                                                                var20_20 = var11_11;
                                                                var45_42 = var38_35;
                                                                var11_11 = 0;
                                                                var42_39 = null;
                                                                var21_21 = 1835557200;
                                                                if (var20_20 != var21_21) break block108;
                                                                var21_21 = 8;
                                                                var12_12 = var32_29 + 8;
                                                                var10_10.zzK(var12_12);
                                                                var12_12 = var0.zzm();
                                                                if (var12_12 <= 0) break block109;
                                                                var44_41 /* !! */  = new byte[var12_12];
                                                                var10_10.zzG((byte[])var44_41 /* !! */ , 0, var12_12);
                                                                if (var41_38 /* !! */  == null) {
                                                                    var41_38 /* !! */  = zzgbc.zzn(var44_41 /* !! */ );
lbl289:
                                                                    // 3 sources

                                                                    while (true) {
                                                                        var43_40 = var7_7;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var43_40 = (byte[])var41_38 /* !! */ .get(0);
                                                                var41_38 /* !! */  = zzgbc.zzo(var43_40, var44_41 /* !! */ );
                                                                ** GOTO lbl289
                                                            }
lbl296:
                                                            // 4 sources

                                                            while (true) {
                                                                var20_20 = var9_9;
                                                                var46_43 /* !! */  = var35_32 /* !! */ ;
                                                                var21_21 = 0;
                                                                var38_35 = null;
                                                                var47_44 = 3;
                                                                var48_45 = 2;
                                                                break block101;
                                                                break;
                                                            }
                                                        }
                                                        var11_11 = 1702061171;
                                                        if (var20_20 == var11_11) break block110;
                                                        if (!var6_6 || var20_20 != (var21_21 = 2002876005)) break block111;
                                                        var20_20 = var0.zzd();
                                                        if (var20_20 >= var32_29) {
                                                            var11_11 = 0;
                                                            var42_39 = null;
                                                            var21_21 = 1;
                                                        } else {
                                                            var11_11 = 0;
                                                            var42_39 = null;
                                                            var21_21 = 0;
                                                            var38_35 = null;
                                                        }
                                                        zzady.zzb((boolean)var21_21, null);
                                                        while ((var11_11 = var20_20 - var32_29) < var17_17) {
                                                            var10_10.zzK(var20_20);
                                                            var11_11 = var0.zzg();
                                                            if (var11_11 > 0) {
                                                                var21_21 = 1;
                                                            } else {
                                                                var21_21 = 0;
                                                                var38_35 = null;
                                                            }
                                                            zzady.zzb((boolean)var21_21, (String)var43_40);
                                                            var21_21 = var0.zzg();
                                                            var12_12 = 1702061171;
                                                            if (var21_21 != var12_12) {
                                                                var20_20 += var11_11;
                                                                continue;
                                                            }
                                                            var11_11 = var20_20;
                                                            var12_12 = -1;
                                                            var21_21 = 1634492771;
                                                            var47_44 = 3;
                                                            var48_45 = 2;
                                                            var20_20 = var9_9;
                                                            break block102;
                                                        }
                                                        var20_20 = var9_9;
                                                        var11_11 = -1;
                                                        var12_12 = -1;
                                                        var21_21 = 1634492771;
                                                        var47_44 = 3;
                                                        var48_45 = 2;
                                                        break block102;
                                                    }
                                                    var11_11 = 1684103987;
                                                    if (var20_20 != var11_11) break block112;
                                                    var11_11 = 8;
                                                    var21_21 = var32_29 + 8;
                                                    var10_10.zzK(var21_21);
                                                    var43_40 = Integer.toString(var4_4);
                                                    var16_16.zzb = var43_40 = zzact.zzc((zzfu)var10_10, (String)var43_40, var14_14, var15_15);
                                                    ** GOTO lbl296
                                                }
                                                var11_11 = 8;
                                                var12_12 = 1684366131;
                                                if (var20_20 != var12_12) break block113;
                                                var21_21 = var32_29 + 8;
                                                var10_10.zzK(var21_21);
                                                var43_40 = Integer.toString(var4_4);
                                                var16_16.zzb = var43_40 = zzact.zzd((zzfu)var10_10, (String)var43_40, var14_14, var15_15);
                                                ** GOTO lbl296
                                            }
                                            var12_12 = 1684103988;
                                            if (var20_20 == var12_12) {
                                                var21_21 = var32_29 + 8;
                                                var10_10.zzK(var21_21);
                                                var42_39 = Integer.toString(var4_4);
                                                var12_12 = 1;
                                                var10_10.zzL(var12_12);
                                                var20_20 = var0.zzm();
                                                var21_21 = 32;
                                                var20_20 &= var21_21;
                                                var38_35 = new zzal();
                                                var38_35.zzK((String)var42_39);
                                                var38_35.zzX((String)var35_32 /* !! */ );
                                                var38_35.zzy(2);
                                                var11_11 = var20_20 >> 5;
                                                var11_11 = var12_12 != var11_11 ? 44100 : 48000;
                                                var38_35.zzY(var11_11);
                                                var38_35.zzE(var15_15);
                                                var38_35.zzO(var14_14);
                                                var16_16.zzb = var42_39 = var38_35.zzad();
                                                ** continue;
                                            }
                                            var11_11 = 1684892784;
                                            if (var20_20 == var11_11) {
                                                if (var33_30 > 0) {
                                                    var43_40 = var7_7;
                                                    var46_43 /* !! */  = var35_32 /* !! */ ;
                                                    var20_20 = var33_30;
                                                    var21_21 = 0;
                                                    var38_35 = null;
                                                    var22_22 = 2;
                                                    ** continue;
                                                }
                                                var10_10 = new StringBuilder("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                                var10_10.append(var33_30);
                                                throw zzch.zza(var10_10.toString(), null);
                                            }
                                            var11_11 = 0;
                                            var42_39 = null;
                                            var12_12 = 1684305011;
                                            if (var20_20 == var12_12 || var20_20 == (var12_12 = 1969517683)) break block114;
                                            var12_12 = 1682927731;
                                            if (var20_20 == var12_12) {
                                                var12_12 = 8;
                                                var21_21 = var32_29 + 8;
                                                var18_18 = var17_17 + -8;
                                                var44_41 /* !! */  = zzajw.zza;
                                                var11_11 = var44_41 /* !! */ .length + var18_18;
                                                var42_39 = Arrays.copyOf((byte[])var44_41 /* !! */ , var11_11);
                                                var10_10.zzK(var21_21);
                                                var20_20 = var44_41 /* !! */ .length;
                                                var10_10.zzG((byte[])var42_39, var20_20, var18_18);
                                                var41_38 /* !! */  = zzaep.zze((byte[])var42_39);
                                                ** continue;
                                            }
                                            var12_12 = 8;
                                            var11_11 = 1684425825;
                                            if (var20_20 != var11_11) break block115;
                                            var11_11 = var32_29 + 12;
                                            var18_18 = var17_17 + -12;
                                            var44_41 /* !! */  = new byte[var17_17 + -8];
                                            var44_41 /* !! */ [0] = 102;
                                            var49_46 = 1;
                                            var44_41 /* !! */ [var49_46] = 76;
                                            var48_45 = 2;
                                            var44_41 /* !! */ [var48_45] = 97;
                                            var47_44 = 3;
                                            var44_41 /* !! */ [var47_44] = 67;
                                            var10_10.zzK(var11_11);
                                            var11_11 = 4;
                                            var10_10.zzG((byte[])var44_41 /* !! */ , var11_11, var18_18);
                                            var41_38 /* !! */  = zzgbc.zzn(var44_41 /* !! */ );
                                            var43_40 = var7_7;
                                            var20_20 = var9_9;
                                            var46_43 /* !! */  = var35_32 /* !! */ ;
                                            var21_21 = 0;
                                            var38_35 = null;
                                            break block100;
                                        }
                                        var11_11 = 4;
                                        var21_21 = 1634492771;
                                        var47_44 = 3;
                                        var48_45 = 2;
                                        if (var20_20 != var21_21) break block116;
                                        var18_18 = var32_29 + 12;
                                        var20_20 = var17_17 + -12;
                                        var23_23 = new byte[var20_20];
                                        var10_10.zzK(var18_18);
                                        var19_19 = 0.0f;
                                        var10_10.zzG(var23_23, 0, var20_20);
                                        var41_38 /* !! */  = new zzfu(var23_23);
                                        var41_38 /* !! */ .zzK(9);
                                        var20_20 = var41_38 /* !! */ .zzm();
                                        var41_38 /* !! */ .zzK(20);
                                        var42_39 = var41_38 /* !! */ .zzp();
                                        var41_38 /* !! */  = var20_20;
                                        var42_39 = Pair.create((Object)var42_39, (Object)var41_38 /* !! */ );
                                        var18_18 = (Integer)var42_39.first;
                                        var42_39 = (Integer)var42_39.second;
                                        var11_11 = var42_39.intValue();
                                        var44_41 /* !! */  = zzgbc.zzn(var23_23);
                                        var43_40 = var7_7;
                                        var22_22 = var11_11;
                                        var46_43 /* !! */  = var35_32 /* !! */ ;
                                        var21_21 = 0;
                                        var38_35 = null;
                                        var20_20 = var18_18;
                                        var41_38 /* !! */  = var44_41 /* !! */ ;
                                        break block100;
                                    }
                                    var20_20 = var9_9;
lbl480:
                                    // 3 sources

                                    while (true) {
                                        var46_43 /* !! */  = var35_32 /* !! */ ;
                                        var21_21 = 0;
                                        var38_35 = null;
                                        break block101;
                                        break;
                                    }
                                }
                                var12_12 = 8;
                                var21_21 = 1634492771;
                                var47_44 = 3;
                                var48_45 = 2;
                                var42_39 = new zzal();
                                var42_39.zzJ(var13_13);
                                var42_39.zzX((String)var36_33);
                                var42_39.zzy(var22_22);
                                var20_20 = var9_9;
                                var42_39.zzY(var9_9);
                                var42_39.zzE(var15_15);
                                var42_39.zzO(var14_14);
                                var16_16.zzb = var42_39 = var42_39.zzad();
                                ** GOTO lbl480
                            }
                            var20_20 = var9_9;
                            var21_21 = 1634492771;
                            var47_44 = 3;
                            var48_45 = 2;
                            var11_11 = var32_29;
                            var12_12 = -1;
                        }
                        if (var11_11 != var12_12) ** break;
                        ** continue;
                        var39_36 = zzajw.zzj((zzfu)var10_10, var11_11);
                        var42_39 = zzajq.zzc((zzajq)var39_36);
                        var36_33 = zzajq.zzd((zzajq)var39_36);
                        if (var36_33 != null) {
                            var41_38 /* !! */  = "audio/vorbis";
                            var18_18 = (int)var41_38 /* !! */ .equals(var42_39);
                            if (var18_18 != 0) {
                                block103: {
                                    var41_38 /* !! */  = new zzfu((byte[])var36_33);
                                    var12_12 = 1;
                                    var41_38 /* !! */ .zzL(var12_12);
                                    var21_21 = 0;
                                    var38_35 = null;
                                    while ((var49_46 = var41_38 /* !! */ .zzb()) > 0) {
                                        var50_47 = var41_38 /* !! */ .zzf();
                                        var46_43 /* !! */  = var35_32 /* !! */ ;
                                        var25_25 = 255;
                                        if (var50_47 == var25_25) {
                                            var41_38 /* !! */ .zzL(var12_12);
                                            var21_21 += var25_25;
                                            var10_10 = var0;
                                            var12_12 = 1;
                                            continue;
                                        }
                                        break block103;
                                    }
                                    var46_43 /* !! */  = var35_32 /* !! */ ;
                                    var25_25 = 255;
                                }
                                var50_47 = var41_38 /* !! */ .zzm() + var21_21;
                                var12_12 = 0;
                                var43_40 = null;
                                while ((var21_21 = var41_38 /* !! */ .zzb()) > 0 && (var21_21 = var41_38 /* !! */ .zzf()) == var25_25) {
                                    var21_21 = 1;
                                    var41_38 /* !! */ .zzL(var21_21);
                                    var12_12 += var25_25;
                                }
                                var51_48 = var41_38 /* !! */ .zzm() + var12_12;
                                var43_40 = new byte[var50_47];
                                var18_18 = var41_38 /* !! */ .zzd();
                                var21_21 = 0;
                                var38_35 = null;
                                System.arraycopy(var36_33, var18_18, var43_40, 0, var50_47);
                                var18_18 += var50_47;
                                var50_47 = ((Object)var36_33).length;
                                var35_32 /* !! */  = (Pair)new byte[var50_47 -= (var18_18 += var51_48)];
                                System.arraycopy(var36_33, var18_18, var35_32 /* !! */ , 0, var50_47);
                                var41_38 /* !! */  = zzgbc.zzo(var43_40, var35_32 /* !! */ );
lbl561:
                                // 2 sources

                                while (true) {
                                    var43_40 = var7_7;
lbl563:
                                    // 2 sources

                                    while (true) {
                                        var36_33 = var42_39;
                                        break block100;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var46_43 /* !! */  = var35_32 /* !! */ ;
                            var21_21 = 0;
                            var38_35 = null;
                            var10_10 = "audio/mp4a-latm";
                            var50_47 = var10_10.equals(var42_39);
                            if (var50_47 != 0) {
                                var10_10 = zzacq.zza((byte[])var36_33);
                                var20_20 = var10_10.zza;
                                var22_22 = var10_10.zzb;
                                var10_10 = var10_10.zzc;
                            } else {
                                var10_10 = var7_7;
                            }
                            var41_38 /* !! */  = zzgbc.zzn(var36_33);
                            var43_40 = var10_10;
                            ** continue;
                        }
                        var46_43 /* !! */  = var35_32 /* !! */ ;
                        var21_21 = 0;
                        var38_35 = null;
                        ** continue;
                    }
                    var43_40 = var7_7;
                }
                var32_29 += var17_17;
                var10_10 = var0;
                var11_11 = var2_2;
                var35_32 /* !! */  = var46_43 /* !! */ ;
                var7_7 = var43_40;
                var38_35 = var45_42;
                var12_12 = var3_3;
            }
            var10_10 = var16_16.zzb;
            if (var10_10 == null && var36_33 != null) {
                var10_10 = new zzal();
                var10_10.zzJ(var13_13);
                var10_10.zzX((String)var36_33);
                var43_40 = var7_7;
                var10_10.zzz((String)var7_7);
                var10_10.zzy(var22_22);
                var10_10.zzY(var20_20);
                var11_11 = var40_37;
                var10_10.zzR(var40_37);
                var10_10.zzL((List)var41_38 /* !! */ );
                var10_10.zzE(var15_15);
                var10_10.zzO(var14_14);
                if (var39_36 != null) {
                    var11_11 = zzgea.zze(zzajq.zza((zzajq)var39_36));
                    var10_10.zzx(var11_11);
                    var52_49 = zzajq.zzb((zzajq)var39_36);
                    var11_11 = zzgea.zze(var52_49);
                    var10_10.zzS(var11_11);
                }
                var16_16.zzb = var10_10 = var10_10.zzad();
            }
        }
    }
}

