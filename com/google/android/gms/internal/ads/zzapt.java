/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzapu;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import java.math.RoundingMode;

final class zzapt
implements zzapu {
    private static final int[] zza;
    private static final int[] zzb;
    private final zzadx zzc;
    private final zzafa zzd;
    private final zzapx zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfu zzh;
    private final int zzi;
    private final zzan zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[16];
        int[] nArray3 = nArray;
        nArray2[0] = -1;
        nArray3[1] = -1;
        nArray2[2] = -1;
        nArray3[3] = -1;
        nArray2[4] = 2;
        nArray3[5] = 4;
        nArray2[6] = 6;
        nArray3[7] = 8;
        nArray2[8] = -1;
        nArray3[9] = -1;
        nArray2[10] = -1;
        nArray3[11] = -1;
        nArray2[12] = 2;
        nArray3[13] = 4;
        nArray2[14] = 6;
        nArray3[15] = 8;
        zza = nArray;
        int[] nArray4 = nArray = new int[89];
        int[] nArray5 = nArray;
        nArray4[0] = 7;
        nArray5[1] = 8;
        nArray4[2] = 9;
        nArray5[3] = 10;
        nArray4[4] = 11;
        nArray5[5] = 12;
        nArray4[6] = 13;
        nArray5[7] = 14;
        nArray4[8] = 16;
        nArray5[9] = 17;
        nArray4[10] = 19;
        nArray5[11] = 21;
        nArray4[12] = 23;
        nArray5[13] = 25;
        nArray4[14] = 28;
        nArray5[15] = 31;
        nArray4[16] = 34;
        nArray5[17] = 37;
        nArray4[18] = 41;
        nArray5[19] = 45;
        nArray4[20] = 50;
        nArray5[21] = 55;
        nArray4[22] = 60;
        nArray5[23] = 66;
        nArray4[24] = 73;
        nArray5[25] = 80;
        nArray4[26] = 88;
        nArray5[27] = 97;
        nArray4[28] = 107;
        nArray5[29] = 118;
        nArray4[30] = 130;
        nArray5[31] = 143;
        nArray4[32] = 157;
        nArray5[33] = 173;
        nArray4[34] = 190;
        nArray5[35] = 209;
        nArray4[36] = 230;
        nArray5[37] = 253;
        nArray4[38] = 279;
        nArray5[39] = 307;
        nArray4[40] = 337;
        nArray5[41] = 371;
        nArray4[42] = 408;
        nArray5[43] = 449;
        nArray4[44] = 494;
        nArray5[45] = 544;
        nArray4[46] = 598;
        nArray5[47] = 658;
        nArray4[48] = 724;
        nArray5[49] = 796;
        nArray4[50] = 876;
        nArray5[51] = 963;
        nArray4[52] = 1060;
        nArray5[53] = 1166;
        nArray4[54] = 1282;
        nArray5[55] = 1411;
        nArray4[56] = 1552;
        nArray5[57] = 1707;
        nArray4[58] = 1878;
        nArray5[59] = 2066;
        nArray4[60] = 2272;
        nArray5[61] = 2499;
        nArray4[62] = 2749;
        nArray5[63] = 3024;
        nArray4[64] = 3327;
        nArray5[65] = 3660;
        nArray4[66] = 4026;
        nArray5[67] = 4428;
        nArray4[68] = 4871;
        nArray5[69] = 5358;
        nArray4[70] = 5894;
        nArray5[71] = 6484;
        nArray4[72] = 7132;
        nArray5[73] = 7845;
        nArray4[74] = 8630;
        nArray5[75] = 9493;
        nArray4[76] = 10442;
        nArray5[77] = 11487;
        nArray4[78] = 12635;
        nArray5[79] = 13899;
        nArray4[80] = 15289;
        nArray5[81] = 16818;
        nArray4[82] = 18500;
        nArray5[83] = 20350;
        nArray4[84] = 22385;
        nArray5[85] = 24623;
        nArray4[86] = 27086;
        nArray5[87] = 29794;
        nArray5[88] = Short.MAX_VALUE;
        zzb = nArray;
    }

    public zzapt(zzadx object, zzafa zzafa2, zzapx zzapx2) {
        int n3;
        this.zzc = object;
        this.zzd = zzafa2;
        this.zze = zzapx2;
        int n4 = zzapx2.zzc / 10;
        int n7 = 1;
        this.zzi = n4 = Math.max(n7, n4);
        byte[] byArray = zzapx2.zzf;
        Object object2 = new zzfu(byArray);
        ((zzfu)object2).zzk();
        this.zzf = n3 = ((zzfu)object2).zzk();
        int n8 = zzapx2.zzb;
        int n10 = n8 * 4;
        int n14 = zzapx2.zzd;
        n10 = n14 - n10;
        int n15 = zzapx2.zze * n8;
        int n16 = 8;
        n7 = zy_2.a(n10, n16, n15, n7);
        if (n3 == n7) {
            n7 = zzgd.zza;
            n7 = (n4 + n3 + -1) / n3;
            Object object3 = new byte[n14 * n7];
            this.zzg = object3;
            object3 = new zzfu;
            n14 = (n3 + n3) * n8 * n7;
            super(n14);
            this.zzh = object3;
            n7 = zzapx2.zzc;
            n10 = zzapx2.zzd;
            n7 = n7 * n10 * 8 / n3;
            object2 = new zzal();
            ((zzal)object2).zzX("audio/raw");
            ((zzal)object2).zzx(n7);
            ((zzal)object2).zzS(n7);
            n4 = (n4 + n4) * n8;
            ((zzal)object2).zzP(n4);
            n4 = zzapx2.zzb;
            ((zzal)object2).zzy(n4);
            n4 = zzapx2.zzc;
            ((zzal)object2).zzY(n4);
            ((zzal)object2).zzR(2);
            this.zzj = object = ((zzal)object2).zzad();
            return;
        }
        object = new StringBuilder("Expected frames per block: ");
        ((StringBuilder)object).append(n7);
        ((StringBuilder)object).append("; got: ");
        ((StringBuilder)object).append(n3);
        throw zzch.zza(((StringBuilder)object).toString(), null);
    }

    private final int zzd(int n3) {
        int n4 = this.zze.zzb;
        n4 += n4;
        return n3 / n4;
    }

    private final int zze(int n3) {
        zzapx zzapx2 = this.zze;
        n3 += n3;
        int n4 = zzapx2.zzb;
        return n3 * n4;
    }

    private final void zzf(int n3) {
        int n4;
        long l2 = this.zze.zzc;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long l3 = this.zzl;
        long l4 = zzgd.zzt(this.zzn, 1000000L, l2, roundingMode);
        long l7 = l3 + l4;
        int n7 = this.zze(n3);
        int n8 = this.zzm - n7;
        this.zzd.zzs(l7, 1, n7, n8, null);
        long l8 = this.zzn;
        long l12 = n3;
        this.zzn = l8 += l12;
        this.zzm = n4 = this.zzm - n7;
    }

    public final void zza(int n3, long l2) {
        zzapx zzapx2 = this.zze;
        int n4 = this.zzf;
        long l3 = n3;
        zzaqa zzaqa2 = new zzaqa(zzapx2, n4, l3, l2);
        this.zzc.zzO(zzaqa2);
        zzafa zzafa2 = this.zzd;
        zzan zzan2 = this.zzj;
        zzafa2.zzl(zzan2);
    }

    public final void zzb(long l2) {
        this.zzk = 0;
        this.zzl = l2;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean zzc(zzadv var1_1, long var2_2) {
        var4_3 = this;
        var5_4 = var2_2;
        var7_5 = this.zzm;
        var7_5 = this.zzd(var7_5);
        var8_6 = this.zzi - var7_5;
        var7_5 = zzgd.zza;
        var7_5 = this.zzf;
        var8_6 += var7_5;
        var9_7 = this.zze;
        var10_8 = -1;
        var8_6 = (var8_6 + var10_8) / var7_5;
        var7_5 = var9_7.zzd;
        var8_6 *= var7_5;
        var11_9 = 0L;
        var13_10 = 1;
        var14_11 /* !! */  = (long)(var2_2 == var11_9 ? 0 : (var2_2 < var11_9 ? -1 : 1));
        if (var14_11 /* !! */  == false) {
            while (true) {
                var15_12 = true;
                break;
            }
        } else {
            var15_12 = false;
        }
        while (!var15_12 && (var16_13 = var4_3.zzk) < var8_6) {
            var17_14 = Math.min((long)(var8_6 - var16_13), var5_4);
            var14_11 /* !! */  = (int)var17_14;
            var19_15 = var4_3.zzg;
            var20_16 = var4_3.zzk;
            var21_17 = var1_1;
            if ((var16_13 = var1_1.zza(var19_15, var20_16, (int)var14_11 /* !! */ )) == var10_8) ** continue;
            var14_11 /* !! */  = var4_3.zzk + var16_13;
            var4_3.zzk = (int)var14_11 /* !! */ ;
        }
        var22_18 = var4_3.zzk;
        var23_19 = var4_3.zze;
        var24_20 = var23_19.zzd;
        if ((var22_18 /= var24_20) > 0) {
            var23_19 = var4_3.zzg;
            var25_21 = var4_3.zzh;
            for (var10_8 = 0; var10_8 < var22_18; var10_8 += var30_26) {
                var16_13 = 0;
                var19_15 = null;
                while (true) {
                    var26_22 = var4_3.zze;
                    var20_16 = var26_22.zzb;
                    if (var16_13 >= var20_16) break;
                    var21_17 = var25_21.zzM();
                    var14_11 /* !! */  = var26_22.zzd;
                    var27_23 = var10_8 * var14_11 /* !! */ ;
                    var14_11 /* !! */  = var14_11 /* !! */  / var20_16 + -4;
                    var28_24 = var16_13 * 4 + var27_23;
                    var27_23 = var28_24 + 1;
                    var27_23 = var23_19[var27_23] & 255;
                    var29_25 /* !! */  = var23_19[var28_24] & 255;
                    var30_26 = var28_24 + 2;
                    var30_26 = Math.min(var23_19[var30_26] & 255, 88);
                    var31_27 = zzapt.zzb;
                    var32_28 = var31_27[var30_26];
                    var7_5 = var4_3.zzf * var10_8 * var20_16 + var16_13;
                    var27_23 = (short)(var27_23 << 8 | var29_25 /* !! */ );
                    var29_25 /* !! */  = var27_23 & 255;
                    var7_5 += var7_5;
                    var29_25 /* !! */  = (byte)var29_25 /* !! */ ;
                    var21_17[var7_5] = var29_25 /* !! */ ;
                    var29_25 /* !! */  = var7_5 + 1;
                    var13_10 = (byte)(var27_23 >> 8);
                    var21_17[var29_25 /* !! */ ] = var13_10;
                    var9_7 = null;
                    for (var13_10 = 0; var13_10 < (var29_25 /* !! */  = (int)(var14_11 /* !! */  + var14_11 /* !! */ )); var13_10 = (byte)(var13_10 + 1)) {
                        var29_25 /* !! */  = var20_16 * 4 + var28_24;
                        var33_29 = var13_10 / 8;
                        var34_30 = var13_10 / 2 % 4;
                        var33_29 = var33_29 * var20_16 * 4 + var29_25 /* !! */  + var34_30;
                        var29_25 /* !! */  = (int)var23_19[var33_29];
                        var35_31 = var23_19;
                        var24_20 = var29_25 /* !! */  & 255;
                        var34_30 = var13_10 % 2;
                        var24_20 = var34_30 == 0 ? var29_25 /* !! */  & 15 : (var24_20 >>= 4);
                        var29_25 /* !! */  = var24_20 & 7;
                        var29_25 /* !! */  = (var29_25 /* !! */  + var29_25 /* !! */  + 1) * var32_28;
                        var32_28 = var24_20 & 8;
                        var29_25 /* !! */  >>= 3;
                        if (var32_28 != 0) {
                            var29_25 /* !! */  = -var29_25 /* !! */ ;
                        }
                        var27_23 = Math.min(var27_23 + var29_25 /* !! */ , 32767);
                        var27_23 = Math.max(-32768, var27_23);
                        var29_25 /* !! */  = var20_16 + var20_16;
                        var7_5 += var29_25 /* !! */ ;
                        var29_25 /* !! */  = (byte)(var27_23 & 255);
                        var21_17[var7_5] = var29_25 /* !! */ ;
                        var32_28 = var7_5 + 1;
                        var29_25 /* !! */  = (byte)(var27_23 >> 8);
                        var21_17[var32_28] = var29_25 /* !! */ ;
                        var36_32 = zzapt.zza;
                        var24_20 = var36_32[var24_20];
                        var30_26 += var24_20;
                        var24_20 = 88;
                        var29_25 /* !! */  = Math.min(var30_26, var24_20);
                        var29_25 /* !! */  = Math.max(0, var29_25 /* !! */ );
                        var37_33 = zzapt.zzb;
                        var32_28 = var37_33[var29_25 /* !! */ ];
                        var30_26 = var29_25 /* !! */ ;
                        var23_19 = var35_31;
                    }
                    var35_31 = var23_19;
                    var30_26 = 1;
                    var16_13 += var30_26;
                    var13_10 = 1;
                }
                var35_31 = var23_19;
                var30_26 = 1;
                var13_10 = 1;
            }
            var24_20 = var4_3.zzf * var22_18;
            var24_20 = var4_3.zze(var24_20);
            var25_21.zzK(0);
            var25_21.zzJ(var24_20);
            var24_20 = var4_3.zzk;
            var38_34 = var4_3.zze;
            var7_5 = var38_34.zzd;
            var4_3.zzk = var24_20 -= (var22_18 *= var7_5);
            var39_35 = var4_3.zzh;
            var23_19 = var4_3.zzd;
            var7_5 = var39_35.zze();
            zzaey.zzb((zzafa)var23_19, var39_35, var7_5);
            var4_3.zzm = var22_18 = var4_3.zzm + var7_5;
            var22_18 = var4_3.zzd(var22_18);
            var24_20 = var4_3.zzi;
            if (var22_18 >= var24_20) {
                var4_3.zzf(var24_20);
            }
        }
        if (var15_12) {
            var22_18 = var4_3.zzm;
            if ((var22_18 = var4_3.zzd(var22_18)) > 0) {
                var4_3.zzf(var22_18);
            }
        }
        return var15_12;
    }
}

