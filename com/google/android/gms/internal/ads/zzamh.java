/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Xfermode
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Xfermode;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzalz;
import com.google.android.gms.internal.ads.zzama;
import com.google.android.gms.internal.ads.zzamb;
import com.google.android.gms.internal.ads.zzamc;
import com.google.android.gms.internal.ads.zzamd;
import com.google.android.gms.internal.ads.zzame;
import com.google.android.gms.internal.ads.zzamf;
import com.google.android.gms.internal.ads.zzamg;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import java.util.ArrayList;
import java.util.List;

public final class zzamh
implements zzalv {
    private static final byte[] zza;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzama zzg;
    private final zzalz zzh;
    private final zzamg zzi;
    private Bitmap zzj;

    static {
        byte[] byArray;
        byte[] byArray2;
        int n3 = 4;
        byte[] byArray3 = byArray2 = new byte[n3];
        byte[] byArray4 = byArray2;
        byArray3[0] = 0;
        byArray4[1] = 7;
        byArray3[2] = 8;
        byArray4[3] = 15;
        zza = byArray2;
        byte[] byArray5 = byArray = new byte[n3];
        byte[] byArray6 = byArray;
        byArray5[0] = 0;
        byArray6[1] = 119;
        byArray5[2] = -120;
        byArray6[3] = -1;
        zzb = byArray;
        byte[] byArray7 = byArray = new byte[16];
        byte[] byArray8 = byArray;
        byArray7[0] = 0;
        byArray8[1] = 17;
        byArray7[2] = 34;
        byArray8[3] = 51;
        byArray7[4] = 68;
        byArray8[5] = 85;
        byArray7[6] = 102;
        byArray8[7] = 119;
        byArray7[8] = -120;
        byArray8[9] = -103;
        byArray7[10] = -86;
        byArray8[11] = -69;
        byArray7[12] = -52;
        byArray8[13] = -35;
        byArray7[14] = -18;
        byArray8[15] = -1;
        zzc = byArray;
    }

    public zzamh(List object) {
        zzamg zzamg2;
        Object object2;
        object = (byte[])object.get(0);
        zzfu zzfu2 = new zzfu((byte[])object);
        int n3 = zzfu2.zzq();
        int n4 = zzfu2.zzq();
        this.zzd = object2 = new Paint();
        Object object3 = Paint.Style.FILL_AND_STROKE;
        object2.setStyle(object3);
        Object object4 = PorterDuff.Mode.SRC;
        super(object4);
        object2.setXfermode((Xfermode)object3);
        object2.setPathEffect(null);
        this.zze = object2 = new Paint();
        object4 = Paint.Style.FILL;
        object2.setStyle((Paint.Style)object4);
        Object object5 = PorterDuff.Mode.DST_OVER;
        super(object5);
        object2.setXfermode((Xfermode)object4);
        object2.setPathEffect(null);
        super();
        this.zzf = object2;
        int n7 = 719;
        object3 = object2;
        super(n7, 575, 0, n7, 0, 575);
        this.zzg = object2;
        object3 = zzamh.zzg();
        object4 = zzamh.zzh();
        object5 = zzamh.zzi();
        super(0, (int[])object3, (int[])object4, (int[])object5);
        this.zzh = object2;
        this.zzi = zzamg2 = new zzamg(n3, n4);
    }

    private static int zzb(int n3, int n4, int n7, int n8) {
        n3 <<= 24;
        n4 = n7 << 8;
        return (n3 |= (n4 <<= 16)) | n4 | n8;
    }

    private static zzalz zzc(zzft zzft2, int n3) {
        Object object = zzft2;
        int n4 = 8;
        int n7 = zzft2.zzd(n4);
        zzft2.zzm(n4);
        int[] nArray = zzamh.zzg();
        int[] nArray2 = zzamh.zzh();
        int[] nArray3 = zzamh.zzi();
        int n8 = n3 + -2;
        while (n8 > 0) {
            int n10;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18 = ((zzft)object).zzd(n4);
            int n19 = ((zzft)object).zzd(n4);
            int n20 = n19 & 0x80;
            int[] nArray4 = n20 != 0 ? nArray : ((n20 = n19 & 0x40) != 0 ? nArray2 : nArray3);
            if ((n19 &= 1) != 0) {
                n19 = ((zzft)object).zzd(n4);
                n17 = ((zzft)object).zzd(n4);
                n16 = ((zzft)object).zzd(n4);
                n15 = ((zzft)object).zzd(n4);
                n8 += -6;
            } else {
                n17 = ((zzft)object).zzd(6);
                n16 = 2;
                n17 <<= n16;
                n15 = 4;
                n14 = ((zzft)object).zzd(n15) << n15;
                n10 = ((zzft)object).zzd(n15);
                n15 = n10 << 4;
                n19 = ((zzft)object).zzd(n16) << 6;
                n8 += -4;
                n16 = n15;
                n15 = n19;
                n19 = n17;
                n17 = n14;
            }
            n14 = 255;
            if (n19 == 0) {
                n15 = 255;
            }
            if (n19 == 0) {
                n16 = 0;
            }
            if (n19 == 0) {
                n17 = 0;
            }
            n15 &= n14;
            n15 = 255 - n15;
            n16 += -128;
            double d2 = n19;
            double d5 = n17 += -128;
            double d7 = 1.402 * d5 + d2;
            n19 = Math.min((int)d7, n14);
            n20 = (byte)n15;
            n15 = 0;
            n19 = Math.max(0, n19);
            double d9 = n16;
            double d12 = 0.34414 * d9;
            d12 = d2 - d12;
            double d13 = 0.71414;
            d5 *= d13;
            d5 = d12 - d5;
            n16 = (int)d5;
            n10 = 255;
            n16 = Math.min(n16, n10);
            n16 = Math.max(0, n16);
            double d14 = 1.772;
            d9 = d9 * d14 + d2;
            n4 = Math.min((int)d9, n10);
            n4 = Math.max(0, n4);
            nArray4[n18] = n4 = zzamh.zzb(n20, n19, n16, n4);
            n4 = 8;
        }
        n4 = n7;
        object = new zzalz(n7, nArray, nArray2, nArray3);
        return object;
    }

    /*
     * Unable to fully structure code
     */
    private static zzamb zzd(zzft var0) {
        block3: {
            var1_1 = 16;
            var2_2 = var0.zzd(var1_1);
            var0.zzm(4);
            var3_3 = var0.zzd(2);
            var4_4 = var0.zzo();
            var5_5 = 1;
            var0.zzm(var5_5);
            var6_6 = zzgd.zzf;
            if (var3_3 != var5_5) break block3;
            var3_3 = var0.zzd(8) * 16;
            var0.zzm(var3_3);
            ** GOTO lbl-1000
        }
        if (var3_3 != 0) ** GOTO lbl-1000
        var3_3 = var0.zzd(var1_1);
        var1_1 = var0.zzd(var1_1);
        var5_5 = 0;
        if (var3_3 > 0) {
            var6_6 = new byte[var3_3];
            var0.zzh(var6_6, 0, var3_3);
        }
        if (var1_1 > 0) {
            var7_7 = new byte[var1_1];
            var0.zzh(var7_7, 0, var1_1);
        } else lbl-1000:
        // 3 sources

        {
            var7_7 = var6_6;
        }
        var0 = new zzamb(var2_2, var4_4, var6_6, var7_7);
        return var0;
    }

    /*
     * Unable to fully structure code
     */
    private static void zze(byte[] var0, int[] var1_1, int var2_2, int var3_3, int var4_4, Paint var5_5, Canvas var6_6) {
        var7_7 = var2_2;
        var8_8 = var5_5;
        var10_10 = var0.length;
        var9_9 = new zzft(var0, var10_10);
        var10_10 = var3_3;
        var11_11 = var4_4;
        var12_12 = null;
        var13_13 = null;
        var14_14 = null;
        block10: while ((var15_15 = var9_9.zza()) != 0) {
            block60: {
                var16_16 = 8;
                var15_15 = var9_9.zzd(var16_16);
                var17_17 = 240;
                var18_18 = 3.36E-43f;
                if (var15_15 == var17_17) break block60;
                var19_19 = 3;
                var20_20 = 4;
                var21_21 = 5.6E-45f;
                var22_22 = 1;
                var23_23 = 1.4E-45f;
                var24_24 = 2;
                var25_25 = 2.8E-45f;
                switch (var15_15) {
                    default: {
                        switch (var15_15) {
                            default: {
                                continue block10;
                            }
                            case 34: {
                                var15_15 = 16;
                                var26_26 = 2.2E-44f;
                                var13_13 = zzamh.zzf(var15_15, var16_16, var9_9);
                                continue block10;
                            }
                            case 33: {
                                var12_12 = zzamh.zzf(var20_20, var16_16, var9_9);
                                continue block10;
                            }
                            case 32: 
                        }
                        var14_14 = zzamh.zzf(var20_20, var20_20, var9_9);
                        continue block10;
                    }
                    case 18: {
                        var19_19 = var10_10;
                        var10_10 = 0;
                        var27_27 = 0.0f;
                        while (true) {
                            if ((var15_15 = var9_9.zzd(var16_16)) != 0) {
                                var28_28 = var10_10;
                                var29_29 = var27_27;
                                var30_30 = 1;
                                var31_31 = 1.4E-45f;
                            } else {
                                var15_15 = (int)var9_9.zzo();
                                var17_17 = 7;
                                var18_18 = 9.8E-45f;
                                if (var15_15 == 0) {
                                    var15_15 = var9_9.zzd(var17_17);
                                    if (var15_15 != 0) {
                                        var28_28 = var10_10;
                                        var29_29 = var27_27;
                                        var30_30 = var15_15;
                                        var15_15 = 0;
                                        var26_26 = 0.0f;
                                        var32_32 = null;
                                    } else {
                                        var15_15 = 0;
                                        var26_26 = 0.0f;
                                        var32_32 = null;
                                        var28_28 = 1;
                                        var29_29 = 1.4E-45f;
                                        var30_30 = 0;
                                        var31_31 = 0.0f;
                                    }
                                } else {
                                    var15_15 = var9_9.zzd(var17_17);
                                    var17_17 = var9_9.zzd(var16_16);
                                    var28_28 = var10_10;
                                    var29_29 = var27_27;
                                    var30_30 = var15_15;
                                    var15_15 = var17_17;
                                }
                            }
                            if (var30_30 != 0 && var8_8 != null) {
                                var10_10 = var11_11 + 1;
                                var18_18 = var11_11;
                                var15_15 = var1_1[var15_15];
                                var8_8.setColor(var15_15);
                                var26_26 = var19_19;
                                var24_24 = var19_19 + var30_30;
                                var25_25 = var24_24;
                                var21_21 = var10_10;
                                var33_33 = 1;
                                var34_34 = 1.4E-45f;
                                var23_23 = var21_21;
                                var6_6.drawRect(var26_26, var18_18, var25_25, var21_21, var5_5);
                            } else {
                                var33_33 = 1;
                                var34_34 = 1.4E-45f;
                            }
                            var19_19 += var30_30;
                            if (var28_28 != 0) break;
                            var10_10 = var28_28;
                            var27_27 = var29_29;
                            var22_22 = 1;
                            var23_23 = 1.4E-45f;
                        }
                        var10_10 = var19_19;
                        continue block10;
                    }
                    case 17: {
                        var33_33 = 1;
                        var34_34 = 1.4E-45f;
                        if (var7_7 == var19_19) {
                            if (var13_13 == null) {
                                var32_32 = zzamh.zzc;
                                var35_35 = var32_32;
                            } else {
                                var35_35 = var13_13;
                            }
                        } else {
                            var28_28 = 0;
                            var29_29 = 0.0f;
                            var35_35 = null;
                        }
                        var22_22 = var10_10;
                        var10_10 = 0;
                        var27_27 = 0.0f;
                        while (true) {
                            if ((var15_15 = var9_9.zzd(var20_20)) == 0) ** GOTO lbl126
                            var30_30 = var10_10;
                            var31_31 = var27_27;
lbl122:
                            // 2 sources

                            while (true) {
                                var36_36 = 1;
                                var37_37 = 1.4E-45f;
                                ** GOTO lbl187
                                break;
                            }
lbl126:
                            // 1 sources

                            var15_15 = (int)var9_9.zzo();
                            if (var15_15 != 0) ** GOTO lbl146
                            var15_15 = var9_9.zzd(var19_19);
                            if (var15_15 == 0) ** GOTO lbl137
                            var30_30 = var10_10;
                            var31_31 = var27_27;
                            var36_36 = var15_15 += 2;
                            var15_15 = 0;
                            var26_26 = 0.0f;
                            var32_32 = null;
                            ** GOTO lbl187
lbl137:
                            // 1 sources

                            var15_15 = 0;
                            var26_26 = 0.0f;
                            var32_32 = null;
                            var30_30 = 1;
                            var31_31 = 1.4E-45f;
lbl142:
                            // 2 sources

                            while (true) {
                                var36_36 = 0;
                                var37_37 = 0.0f;
                                ** GOTO lbl187
                                break;
                            }
lbl146:
                            // 1 sources

                            var15_15 = (int)var9_9.zzo();
                            if (var15_15 != 0) ** GOTO lbl156
                            var15_15 = var9_9.zzd(var24_24) + var20_20;
                            var17_17 = var9_9.zzd(var20_20);
lbl150:
                            // 3 sources

                            while (true) {
                                var30_30 = var10_10;
                                var31_31 = var27_27;
                                var36_36 = var15_15;
                                var15_15 = var17_17;
                                ** GOTO lbl187
                                break;
                            }
lbl156:
                            // 1 sources

                            var15_15 = var9_9.zzd(var24_24);
                            if (var15_15 == 0) ** GOTO lbl181
                            if (var15_15 == var33_33) ** GOTO lbl173
                            if (var15_15 == var24_24) ** GOTO lbl170
                            if (var15_15 != var19_19) {
                                var30_30 = var10_10;
                                var31_31 = var27_27;
                                var15_15 = 0;
                                var26_26 = 0.0f;
                                var32_32 = null;
                                ** continue;
                            }
                            var15_15 = var9_9.zzd(var16_16) + 25;
                            var17_17 = var9_9.zzd(var20_20);
                            ** GOTO lbl150
lbl170:
                            // 1 sources

                            var15_15 = var9_9.zzd(var20_20) + 9;
                            var17_17 = var9_9.zzd(var20_20);
                            ** continue;
lbl173:
                            // 1 sources

                            var30_30 = var10_10;
                            var31_31 = var27_27;
                            var15_15 = 0;
                            var26_26 = 0.0f;
                            var32_32 = null;
                            var36_36 = 2;
                            var37_37 = 2.8E-45f;
                            ** GOTO lbl187
lbl181:
                            // 1 sources

                            var30_30 = var10_10;
                            var31_31 = var27_27;
                            var15_15 = 0;
                            var26_26 = 0.0f;
                            var32_32 = null;
                            ** continue;
lbl187:
                            // 5 sources

                            if (var36_36 != 0 && var8_8 != null) {
                                var10_10 = var11_11 + 1;
                                var18_18 = var11_11;
                                if (var35_35 != null) {
                                    var15_15 = var35_35[var15_15];
                                }
                                var27_27 = var10_10;
                                var15_15 = var1_1[var15_15];
                                var8_8.setColor(var15_15);
                                var26_26 = var22_22;
                                var24_24 = var22_22 + var36_36;
                                var25_25 = var24_24;
                                var16_16 = 2;
                                var38_38 = var22_22;
                                var23_23 = var27_27;
                                var6_6.drawRect(var26_26, var18_18, var25_25, var27_27, var5_5);
                            } else {
                                var38_38 = var22_22;
                                var16_16 = 2;
                            }
                            var22_22 = var38_38 + var36_36;
                            if (var30_30 != 0) {
                                var9_9.zze();
                                var10_10 = var22_22;
                                continue block10;
                            }
                            var10_10 = var30_30;
                            var27_27 = var31_31;
                            var24_24 = 2;
                            var25_25 = 2.8E-45f;
                            var20_20 = 4;
                            var21_21 = 5.6E-45f;
                            var16_16 = 8;
                        }
                    }
                    case 16: 
                }
                var33_33 = 1;
                var34_34 = 1.4E-45f;
                var16_16 = 2;
                if (var7_7 == var19_19) {
                    if (var12_12 == null) {
                        var32_32 = zzamh.zzb;
lbl225:
                        // 2 sources

                        while (true) {
                            var35_35 = var32_32;
                            break;
                        }
                    } else {
                        var35_35 = var12_12;
                    }
                } else if (var7_7 == var16_16) {
                    if (var14_14 == null) {
                        var32_32 = zzamh.zza;
                        ** continue;
                    }
                    var35_35 = var14_14;
                } else {
                    var28_28 = 0;
                    var29_29 = 0.0f;
                    var35_35 = null;
                }
                var20_20 = var10_10;
                var22_22 = 0;
                var23_23 = 0.0f;
                while (true) {
                    if ((var10_10 = var9_9.zzd(var16_16)) != 0) {
                        var36_36 = var22_22;
                        var37_37 = var23_23;
lbl246:
                        // 2 sources

                        while (true) {
                            var17_17 = 4;
                            var18_18 = 5.6E-45f;
                            var24_24 = 8;
                            var25_25 = 1.1E-44f;
                            var30_30 = 1;
                            var31_31 = 1.4E-45f;
                            break;
                        }
                    } else {
                        var10_10 = (int)var9_9.zzo();
                        if (var10_10 != 0) {
                            var10_10 = var9_9.zzd(var19_19) + var19_19;
                            var15_15 = var9_9.zzd(var16_16);
                            var30_30 = var10_10;
                            var10_10 = var15_15;
                            var36_36 = var22_22;
                            var37_37 = var23_23;
                            var17_17 = 4;
                            var18_18 = 5.6E-45f;
                            var24_24 = 8;
                            var25_25 = 1.1E-44f;
                        } else {
                            var10_10 = (int)var9_9.zzo();
                            if (var10_10 != 0) {
                                var36_36 = var22_22;
                                var37_37 = var23_23;
                                var10_10 = 0;
                                var27_27 = 0.0f;
                                ** continue;
                            }
                            var10_10 = var9_9.zzd(var16_16);
                            if (var10_10 != 0) {
                                if (var10_10 != var33_33) {
                                    if (var10_10 != var16_16) {
                                        if (var10_10 != var19_19) {
                                            var36_36 = var22_22;
                                            var37_37 = var23_23;
                                            var10_10 = 0;
                                            var27_27 = 0.0f;
                                            var17_17 = 4;
                                            var18_18 = 5.6E-45f;
                                            var24_24 = 8;
                                            var25_25 = 1.1E-44f;
                                            var30_30 = 0;
                                            var31_31 = 0.0f;
                                        } else {
                                            var24_24 = 8;
                                            var25_25 = 1.1E-44f;
                                            var10_10 = var9_9.zzd(var24_24) + 29;
                                            var15_15 = var9_9.zzd(var16_16);
                                            var30_30 = var10_10;
                                            var10_10 = var15_15;
                                            var36_36 = var22_22;
                                            var37_37 = var23_23;
                                            var17_17 = 4;
                                            var18_18 = 5.6E-45f;
                                        }
                                    } else {
                                        var17_17 = 4;
                                        var18_18 = 5.6E-45f;
                                        var24_24 = 8;
                                        var25_25 = 1.1E-44f;
                                        var10_10 = var9_9.zzd(var17_17) + 12;
                                        var15_15 = var9_9.zzd(var16_16);
                                        var30_30 = var10_10;
                                        var10_10 = var15_15;
                                        var36_36 = var22_22;
                                        var37_37 = var23_23;
                                    }
                                } else {
                                    var17_17 = 4;
                                    var18_18 = 5.6E-45f;
                                    var24_24 = 8;
                                    var25_25 = 1.1E-44f;
                                    var36_36 = var22_22;
                                    var37_37 = var23_23;
                                    var10_10 = 0;
                                    var27_27 = 0.0f;
                                    var30_30 = 2;
                                    var31_31 = 2.8E-45f;
                                }
                            } else {
                                var17_17 = 4;
                                var18_18 = 5.6E-45f;
                                var24_24 = 8;
                                var25_25 = 1.1E-44f;
                                var10_10 = 0;
                                var27_27 = 0.0f;
                                var30_30 = 0;
                                var31_31 = 0.0f;
                                var36_36 = 1;
                                var37_37 = 1.4E-45f;
                            }
                        }
                    }
                    if (var30_30 != 0 && var8_8 != null) {
                        var15_15 = var11_11 + 1;
                        var23_23 = var11_11;
                        if (var35_35 != null) {
                            var10_10 = var35_35[var10_10];
                        }
                        var26_26 = var15_15;
                        var10_10 = var1_1[var10_10];
                        var8_8.setColor(var10_10);
                        var27_27 = var20_20;
                        var34_34 = var20_20 + var30_30;
                        var39_39 = var26_26;
                        var26_26 = var27_27;
                        var18_18 = var23_23;
                        var25_25 = var34_34;
                        var23_23 = var39_39;
                        var33_33 = var20_20;
                        var6_6.drawRect(var27_27, var18_18, var34_34, var39_39, var5_5);
                    } else {
                        var33_33 = var20_20;
                    }
                    var20_20 = var33_33 + var30_30;
                    if (var36_36 != 0) {
                        var9_9.zze();
                        var10_10 = var20_20;
                        continue block10;
                    }
                    var22_22 = var36_36;
                    var23_23 = var37_37;
                    var33_33 = 1;
                    var34_34 = 1.4E-45f;
                }
            }
            var11_11 += 2;
            var10_10 = var3_3;
        }
    }

    private static byte[] zzf(int n3, int n4, zzft zzft2) {
        byte[] byArray = new byte[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            byte by2;
            byArray[i3] = by2 = (byte)zzft2.zzd(n4);
        }
        return byArray;
    }

    private static int[] zzg() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zzh() {
        int n3 = 16;
        int[] nArray = new int[n3];
        nArray[0] = 0;
        int n4 = 1;
        for (int i3 = 1; i3 < n3; ++i3) {
            int n7 = i3 & 4;
            int n8 = i3 & 2;
            int n10 = i3 & 1;
            int n14 = 8;
            int n15 = 255;
            if (i3 < n14) {
                n10 = n4 != n10 ? 0 : 255;
                n8 = n8 != 0 ? 255 : 0;
                n7 = n7 != 0 ? 255 : 0;
                nArray[i3] = n7 = zzamh.zzb(n15, n10, n8, n7);
                continue;
            }
            n14 = 127;
            n10 = n4 != n10 ? 0 : 127;
            n8 = n8 != 0 ? 127 : 0;
            if (n7 == 0) {
                n14 = 0;
            }
            nArray[i3] = n7 = zzamh.zzb(n15, n10, n8, n14);
        }
        return nArray;
    }

    private static int[] zzi() {
        int n3 = 256;
        int[] nArray = new int[n3];
        nArray[0] = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            int n7;
            int n8;
            int n10;
            int n14;
            int n15;
            int n16 = 8;
            int n17 = 255;
            int n18 = 1;
            if (i3 < n16) {
                n16 = i3 & 1;
                n15 = i3 & 2;
                n14 = i3 & 4;
                n16 = n18 != n16 ? 0 : 255;
                n18 = n15 != 0 ? 255 : 0;
                if (n14 == 0) {
                    n17 = 0;
                }
                n15 = 63;
                nArray[i3] = n16 = zzamh.zzb(n15, n16, n18, n17);
                continue;
            }
            n15 = i3 & 0x88;
            n14 = 170;
            int n19 = 85;
            if (n15 != 0) {
                n10 = 127;
                if (n15 != n16) {
                    n16 = 128;
                    n14 = 43;
                    if (n15 != n16) {
                        n16 = 136;
                        if (n15 != n16) continue;
                        n16 = i3 & 0x10;
                        n15 = i3 & 1;
                        n10 = i3 & 0x20;
                        n8 = i3 & 2;
                        n7 = i3 & 0x40;
                        n4 = i3 & 4;
                        n18 = n18 != n15 ? 0 : 43;
                        n16 = n16 != 0 ? 85 : 0;
                        n15 = n8 != 0 ? 43 : 0;
                        n10 = n10 != 0 ? 85 : 0;
                        if (n4 == 0) {
                            n14 = 0;
                        }
                        if (n7 == 0) {
                            n19 = 0;
                        }
                        n18 += n16;
                        nArray[i3] = n16 = zzamh.zzb(n17, n18, n15 += n10, n14 += n19);
                        continue;
                    }
                    n16 = i3 & 0x10;
                    n15 = i3 & 1;
                    n8 = i3 & 0x20;
                    n7 = i3 & 2;
                    n4 = i3 & 0x40;
                    int n20 = i3 & 4;
                    n18 = n18 != n15 ? 0 : 43;
                    n18 += n10;
                    n16 = n16 != 0 ? 85 : 0;
                    n15 = n7 != 0 ? 43 : 0;
                    n15 += n10;
                    n8 = n8 != 0 ? 85 : 0;
                    if (n20 == 0) {
                        n14 = 0;
                    }
                    n14 += n10;
                    if (n4 == 0) {
                        n19 = 0;
                    }
                    n18 += n16;
                    nArray[i3] = n16 = zzamh.zzb(n17, n18, n15 += n8, n14 += n19);
                    continue;
                }
                n16 = i3 & 0x10;
                n17 = i3 & 1;
                n15 = i3 & 0x20;
                n8 = i3 & 2;
                n7 = i3 & 0x40;
                n4 = i3 & 4;
                n17 = n18 != n17 ? 0 : 85;
                n16 = n16 != 0 ? 170 : 0;
                n18 = n8 != 0 ? 85 : 0;
                n15 = n15 != 0 ? 170 : 0;
                if (n4 == 0) {
                    n19 = 0;
                }
                if (n7 == 0) {
                    n14 = 0;
                }
                n17 += n16;
                nArray[i3] = n16 = zzamh.zzb(n10, n17, n18 += n15, n19 += n14);
                continue;
            }
            n16 = i3 & 0x10;
            n15 = i3 & 1;
            n10 = i3 & 0x20;
            n8 = i3 & 2;
            n7 = i3 & 0x40;
            n4 = i3 & 4;
            n18 = n18 != n15 ? 0 : 85;
            n16 = n16 != 0 ? 170 : 0;
            n15 = n8 != 0 ? 85 : 0;
            n10 = n10 != 0 ? 170 : 0;
            if (n4 == 0) {
                n19 = 0;
            }
            if (n7 == 0) {
                n14 = 0;
            }
            n18 += n16;
            nArray[i3] = n16 = zzamh.zzb(n17, n18, n15 += n10, n19 += n14);
        }
        return nArray;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(byte[] var1_1, int var2_2, int var3_3, zzalu var4_4, zzev var5_5) {
        var6_6 = this;
        var7_7 = var2_2;
        var8_8 = var2_2 + var3_3;
        var10_10 = var1_1;
        var9_9 = new zzft(var1_1, var8_8);
        var9_9.zzk(var2_2);
        while (true) {
            var7_7 = var9_9.zza();
            var8_8 = 48;
            var11_11 = 6.7E-44f;
            var12_12 = 3;
            var13_13 = 4.2E-45f;
            var14_14 = 1;
            var15_15 = 2;
            if (var7_7 < var8_8) break;
            var7_7 = 8;
            var8_8 = var9_9.zzd(var7_7);
            var16_16 = 15;
            var17_17 = 2.1E-44f;
            if (var8_8 != var16_16) break;
            var18_18 = var6_6.zzi;
            var16_16 = var9_9.zzd(var7_7);
            var19_19 = 16;
            var20_20 = var9_9.zzd(var19_19);
            var21_21 = var9_9.zzd(var19_19);
            var22_22 = var9_9.zzb() + var21_21;
            var23_23 = var21_21 * 8;
            var24_24 = var9_9.zza();
            if (var23_23 > var24_24) {
                var25_25 = "DvbParser";
                var18_18 = "Data field length exceeds limit";
                zzfk.zzf((String)var25_25, (String)var18_18);
                var7_7 = var9_9.zza();
                var9_9.zzm(var7_7);
                continue;
            }
            var23_23 = 4;
            switch (var16_16) {
                default: {
                    break;
                }
                case 20: {
                    var7_7 = var18_18.zza;
                    if (var20_20 != var7_7) break;
                    var9_9.zzm(var23_23);
                    var7_7 = (int)var9_9.zzo();
                    var9_9.zzm(var12_12);
                    var24_24 = var9_9.zzd(var19_19);
                    var26_26 = var9_9.zzd(var19_19);
                    if (var7_7 != 0) {
                        var27_27 = var9_9.zzd(var19_19);
                        var7_7 = var9_9.zzd(var19_19);
                        var12_12 = var9_9.zzd(var19_19);
                        var14_14 = var9_9.zzd(var19_19);
                        var28_28 = var7_7;
                        var29_29 = var12_12;
                        var30_30 = var14_14;
                        var31_31 = var27_27;
                    } else {
                        var28_28 = var24_24;
                        var30_30 = var26_26;
                        var31_31 = 0;
                        var32_32 = null;
                        var29_29 = 0;
                    }
                    var33_33 = var25_25;
                    var18_18.zzh = var25_25 = new zzama(var24_24, var26_26, var31_31, var28_28, var29_29, var30_30);
                    break;
                }
                case 19: {
                    var7_7 = var18_18.zza;
                    if (var20_20 == var7_7) {
                        var25_25 = zzamh.zzd((zzft)var9_9);
                        var18_18 = var18_18.zze;
                        var12_12 = var25_25.zza;
                        var18_18.put(var12_12, var25_25);
                        break;
                    }
                    var7_7 = var18_18.zzb;
                    if (var20_20 != var7_7) break;
                    var25_25 = zzamh.zzd((zzft)var9_9);
                    var18_18 = var18_18.zzg;
                    var12_12 = var25_25.zza;
                    var18_18.put(var12_12, var25_25);
                    break;
                }
                case 18: {
                    var7_7 = var18_18.zza;
                    if (var20_20 == var7_7) {
                        var25_25 = zzamh.zzc((zzft)var9_9, var21_21);
                        var18_18 = var18_18.zzd;
                        var12_12 = var25_25.zza;
                        var18_18.put(var12_12, var25_25);
                        break;
                    }
                    var7_7 = var18_18.zzb;
                    if (var20_20 != var7_7) break;
                    var25_25 = zzamh.zzc((zzft)var9_9, var21_21);
                    var18_18 = var18_18.zzf;
                    var12_12 = var25_25.zza;
                    var18_18.put(var12_12, var25_25);
                    break;
                }
                case 17: {
                    var34_34 = var18_18.zzi;
                    var24_24 = var18_18.zza;
                    if (var20_20 != var24_24 || var34_34 == null) break;
                    var31_31 = var9_9.zzd(var7_7);
                    var9_9.zzm(var23_23);
                    var28_28 = var9_9.zzo();
                    var9_9.zzm(var12_12);
                    var29_29 = var9_9.zzd(var19_19);
                    var30_30 = var9_9.zzd(var19_19);
                    var35_35 = var9_9.zzd(var12_12);
                    var36_36 = var9_9.zzd(var12_12);
                    var9_9.zzm(var15_15);
                    var37_37 = var9_9.zzd(var7_7);
                    var38_38 = var9_9.zzd(var7_7);
                    var39_39 = var9_9.zzd(var23_23);
                    var40_40 = var9_9.zzd(var15_15);
                    var9_9.zzm(var15_15);
                    var21_21 += -10;
                    var10_10 = new SparseArray;
                    var10_10();
                    while (var21_21 > 0) {
                        var20_20 = var9_9.zzd(var19_19);
                        var24_24 = var9_9.zzd(var15_15);
                        var41_41 = var9_9.zzd(var15_15);
                        var26_26 = 12;
                        var42_42 = var9_9.zzd(var26_26);
                        var9_9.zzm(var23_23);
                        var43_43 = var9_9.zzd(var26_26);
                        var26_26 = var21_21 + -6;
                        if (var24_24 == var14_14) ** GOTO lbl134
                        if (var24_24 != var15_15) {
                            var44_44 = var24_24;
                            var21_21 = var26_26;
                            var45_45 = 0;
                            var46_46 = 0;
                        } else {
                            var24_24 = 2;
lbl134:
                            // 2 sources

                            var26_26 = var9_9.zzd(var7_7);
                            var47_47 = var9_9.zzd(var7_7);
                            var21_21 += -8;
                            var44_44 = var24_24;
                            var45_45 = var26_26;
                            var46_46 = var47_47;
                        }
                        var48_48 = new zzamf(var44_44, var41_41, var42_42, var43_43, var45_45, var46_46);
                        var10_10.put(var20_20, (Object)var48_48);
                    }
                    var49_49 = var25_25;
                    var25_25 = new zzame(var31_31, (boolean)var28_28, var29_29, var30_30, var35_35, var36_36, var37_37, var38_38, var39_39, var40_40, (SparseArray)var10_10);
                    var12_12 = var34_34.zzb;
                    if (var12_12 == 0) {
                        var10_10 = var18_18.zzc;
                        var14_14 = var25_25.zza;
                        if ((var10_10 = (Object)((zzame)var10_10.get(var14_14))) != null) {
                            var50_50 = null;
                            for (var27_27 = 0; var27_27 < (var15_15 = (var51_51 /* !! */  = var10_10.zzj).size()); ++var27_27) {
                                var52_52 = var25_25.zzj;
                                var16_16 = var51_51 /* !! */ .keyAt(var27_27);
                                var51_51 /* !! */  = (zzamf)var51_51 /* !! */ .valueAt(var27_27);
                                var52_52.put(var16_16, (Object)var51_51 /* !! */ );
                            }
                        }
                    }
                    var18_18 = var18_18.zzc;
                    var12_12 = var25_25.zza;
                    var18_18.put(var12_12, var25_25);
                    break;
                }
                case 16: {
                    var12_12 = var18_18.zza;
                    if (var20_20 != var12_12) break;
                    var10_10 = var18_18.zzi;
                    var14_14 = var9_9.zzd(var7_7);
                    var27_27 = var9_9.zzd(var23_23);
                    var16_16 = var9_9.zzd(var15_15);
                    var9_9.zzm(var15_15);
                    var21_21 += -2;
                    var52_52 = new SparseArray();
                    while (var21_21 > 0) {
                        var20_20 = var9_9.zzd(var7_7);
                        var9_9.zzm(var7_7);
                        var23_23 = var9_9.zzd(var19_19);
                        var24_24 = var9_9.zzd(var19_19);
                        var49_49 = new zzamd(var23_23, var24_24);
                        var52_52.put(var20_20, var49_49);
                        var21_21 += -6;
                    }
                    var25_25 = new zzamc(var14_14, var27_27, var16_16, var52_52);
                    var14_14 = var25_25.zzb;
                    if (var14_14 != 0) {
                        var18_18.zzi = var25_25;
                        var18_18.zzc.clear();
                        var18_18.zzd.clear();
                        var25_25 = var18_18.zze;
                        var25_25.clear();
                        break;
                    }
                    if (var10_10 == null || (var12_12 = var10_10.zza) == (var14_14 = var25_25.zza)) break;
                    var18_18.zzi = var25_25;
                }
            }
            var7_7 = var9_9.zzb();
            var9_9.zzn(var22_22 -= var7_7);
        }
        var25_25 = var6_6.zzi;
        var18_18 = var25_25.zzi;
        if (var18_18 == null) {
            var53_53 = zzgbc.zzm();
            var54_55 = -9223372036854775807L;
            var34_34 = var25_25;
            var25_25 = new zzaln(var53_53, var54_55, var54_55);
lbl201:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var25_25 = var25_25.zzh;
        if (var25_25 == null) {
            var25_25 = var6_6.zzg;
        }
        if ((var9_9 = var6_6.zzj) == null || (var16_16 = var25_25.zza + var14_14) != (var56_56 = var9_9.getWidth()) || (var56_56 = var25_25.zzb + var14_14) != (var16_16 = (var34_34 = var6_6.zzj).getHeight())) {
            var56_56 = var25_25.zza + var14_14;
            var16_16 = var25_25.zzb + var14_14;
            var53_54 /* !! */  = Bitmap.Config.ARGB_8888;
            var9_9 = Bitmap.createBitmap((int)var56_56, (int)var16_16, (Bitmap.Config)var53_54 /* !! */ );
            var6_6.zzj = var9_9;
            var34_34 = var6_6.zzf;
            var34_34.setBitmap((Bitmap)var9_9);
        }
        var57_57 = new ArrayList<Object>();
        var18_18 = var18_18.zzc;
        var56_56 = 0;
        var58_58 = 0.0f;
        var9_9 = null;
        while (var56_56 < (var16_16 = var18_18.size())) {
            var6_6.zzf.save();
            var34_34 = (zzamd)var18_18.valueAt(var56_56);
            var19_19 = var18_18.keyAt(var56_56);
            var59_59 = var6_6.zzi.zzc;
            var53_54 /* !! */  = (zzame)var59_59.get(var19_19);
            var21_21 = var34_34.zza;
            var22_22 = var25_25.zzc;
            var21_21 += var22_22;
            var16_16 = var34_34.zzb;
            var22_22 = var25_25.zze;
            var16_16 += var22_22;
            var22_22 = var53_54 /* !! */ .zzc + var21_21;
            var23_23 = var25_25.zzd;
            var22_22 = Math.min(var22_22, var23_23);
            var23_23 = var53_54 /* !! */ .zzd + var16_16;
            var24_24 = var25_25.zzf;
            var49_49 = var6_6.zzf;
            var23_23 = Math.min(var23_23, var24_24);
            var49_49.clipRect(var21_21, var16_16, var22_22, var23_23);
            var60_60 = var6_6.zzi;
            var23_23 = var53_54 /* !! */ .zzf;
            var60_60 = (zzalz)var60_60.zzd.get(var23_23);
            if (var60_60 == null) {
                var60_60 = var6_6.zzi;
                var23_23 = var53_54 /* !! */ .zzf;
                var60_60 = (zzalz)var60_60.zzf.get(var23_23);
                if (var60_60 == null) {
                    var60_60 = var6_6.zzh;
                }
            }
            var33_33 = var53_54 /* !! */ .zzj;
            var48_48 = null;
            for (var24_24 = 0; var24_24 < (var26_26 = var33_33.size()); ++var24_24) {
                block42: {
                    block40: {
                        block41: {
                            var26_26 = var33_33.keyAt(var24_24);
                            var50_50 = var32_32 = var33_33.valueAt(var24_24);
                            var50_50 = (zzamf)var32_32;
                            var51_51 /* !! */  = (zzamb)var6_6.zzi.zze.get(var26_26);
                            if (var51_51 /* !! */  == null) {
                                var51_51 /* !! */  = (zzamb)var6_6.zzi.zzg.get(var26_26);
                            }
                            if (var51_51 /* !! */  == null) break block40;
                            var26_26 = (int)var51_51 /* !! */ .zzb;
                            if (var26_26 != 0) {
                                var26_26 = 0;
                                var49_49 = null;
                            } else {
                                var49_49 = var6_6.zzd;
                            }
                            var15_15 = var53_54 /* !! */ .zze;
                            var12_12 = var50_50.zza + var21_21;
                            var27_27 = var50_50.zzb + var16_16;
                            var61_61 = var18_18;
                            var18_18 = var6_6.zzf;
                            var62_62 = var33_33;
                            var23_23 = 3;
                            if (var15_15 == var23_23) {
                                var33_33 = var60_60.zzd;
lbl275:
                                // 3 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var23_23 = 2;
                            if (var15_15 != var23_23) break block41;
                            var33_33 = var60_60.zzc;
                            ** GOTO lbl275
                        }
                        var33_33 = var60_60.zzb;
                        ** continue;
                        var40_40 = var56_56;
                        var32_32 = var9_9 = (Object)var51_51 /* !! */ .zzc;
                        var29_29 = var15_15;
                        var30_30 = var12_12;
                        var35_35 = var27_27;
                        zzamh.zze((byte[])var9_9, (int[])var33_33, var15_15, var12_12, var27_27, (Paint)var49_49, (Canvas)var18_18);
                        var9_9 = var51_51 /* !! */ .zzd;
                        var14_14 = 1;
                        var35_35 = var27_27 + 1;
                        var32_32 = var9_9;
                        zzamh.zze((byte[])var9_9, (int[])var33_33, var15_15, var12_12, var35_35, (Paint)var49_49, (Canvas)var18_18);
                        break block42;
                    }
                    var61_61 = var18_18;
                    var40_40 = var56_56;
                    var62_62 = var33_33;
                    var14_14 = 1;
                }
                var18_18 = var61_61;
                var33_33 = var62_62;
                var56_56 = var40_40;
                var12_12 = 3;
                var13_13 = 4.2E-45f;
                var15_15 = 2;
            }
            var61_61 = var18_18;
            var40_40 = var56_56;
            var11_11 = var16_16;
            var58_58 = var21_21;
            var12_12 = (int)var53_54 /* !! */ .zzb;
            if (var12_12 != 0) {
                var12_12 = var53_54 /* !! */ .zze;
                var15_15 = 3;
                if (var12_12 == var15_15) {
                    var10_10 = var60_60.zzd;
                    var27_27 = var53_54 /* !! */ .zzg;
                    var12_12 = var10_10[var27_27];
                    var27_27 = 2;
                } else {
                    var27_27 = 2;
                    if (var12_12 == var27_27) {
                        var10_10 = var60_60.zzc;
                        var22_22 = var53_54 /* !! */ .zzh;
                        var12_12 = var10_10[var22_22];
                    } else {
                        var10_10 = var60_60.zzb;
                        var22_22 = var53_54 /* !! */ .zzi;
                        var12_12 = var10_10[var22_22];
                    }
                }
                var60_60 = var6_6.zze;
                var60_60.setColor(var12_12);
                var49_49 = var6_6.zzf;
                var12_12 = var53_54 /* !! */ .zzc + var21_21;
                var22_22 = var53_54 /* !! */ .zzd + var16_16;
                var33_33 = var6_6.zze;
                var13_13 = var12_12;
                var63_63 = var22_22;
                var49_49.drawRect(var58_58, var11_11, var13_13, var63_63, (Paint)var33_33);
            } else {
                var15_15 = 3;
                var27_27 = 2;
            }
            var10_10 = new zzeg;
            var10_10();
            var60_60 = var6_6.zzj;
            var23_23 = var53_54 /* !! */ .zzc;
            var24_24 = var53_54 /* !! */ .zzd;
            var34_34 = Bitmap.createBitmap((Bitmap)var60_60, (int)var21_21, (int)var16_16, (int)var23_23, (int)var24_24);
            var10_10.zzc((Bitmap)var34_34);
            var17_17 = var25_25.zza;
            var10_10.zzh(var58_58 /= var17_17);
            var10_10.zzi(0);
            var16_16 = var25_25.zzb;
            var17_17 = var16_16;
            var10_10.zze(var11_11 /= var17_17, 0);
            var10_10.zzf(0);
            var11_11 = var53_54 /* !! */ .zzc;
            var58_58 = var25_25.zza;
            var10_10.zzk(var11_11 /= var58_58);
            var8_8 = var53_54 /* !! */ .zzd;
            var11_11 = var8_8;
            var58_58 = var25_25.zzb;
            var10_10.zzd(var11_11 /= var58_58);
            var18_18 = var10_10.zzp();
            var57_57.add(var18_18);
            var18_18 = var6_6.zzf;
            var9_9 = PorterDuff.Mode.CLEAR;
            var10_10 = null;
            var18_18.drawColor(0, (PorterDuff.Mode)var9_9);
            var6_6.zzf.restore();
            var56_56 = var40_40 + 1;
            var18_18 = var61_61;
            var12_12 = 3;
            var13_13 = 4.2E-45f;
            var15_15 = 2;
        }
        var64_64 = -9223372036854775807L;
        var53_54 /* !! */  = var25_25;
        var25_25 = new zzaln(var57_57, var64_64, var64_64);
        ** while (true)
        var18_18 = var5_5;
        var5_5.zza(var25_25);
    }
}

