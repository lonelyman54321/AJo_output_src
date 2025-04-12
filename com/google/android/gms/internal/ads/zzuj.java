/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zztp;
import com.google.android.gms.internal.ads.zztx;
import com.google.android.gms.internal.ads.zzty;
import com.google.android.gms.internal.ads.zztz;
import com.google.android.gms.internal.ads.zzua;
import com.google.android.gms.internal.ads.zzub;
import com.google.android.gms.internal.ads.zzud;
import com.google.android.gms.internal.ads.zzue;
import com.google.android.gms.internal.ads.zzug;
import com.google.android.gms.internal.ads.zzui;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public final class zzuj {
    public static final /* synthetic */ int zza;
    private static final Pattern zzb;
    private static final HashMap zzc;

    static {
        HashMap hashMap;
        zzb = Pattern.compile("^\\D?(\\d+)$");
        zzc = hashMap = new HashMap();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Pair zza(zzan var0) {
        block238: {
            block247: {
                block241: {
                    block246: {
                        block240: {
                            block245: {
                                block239: {
                                    block244: {
                                        block243: {
                                            block242: {
                                                var1_1 = var0;
                                                var2_2 /* !! */  = var0.zzk;
                                                if (var2_2 /* !! */  == null) lbl-1000:
                                                // 28 sources

                                                {
                                                    while (true) {
                                                        var3_3 = 0;
                                                        var4_4 /* !! */  = null;
                                                        break block238;
                                                        break;
                                                    }
                                                }
                                                var2_2 /* !! */  = var2_2 /* !! */ .split("\\.");
                                                var5_5 = var0.zzn;
                                                var6_6 = "video/dolby-vision".equals(var5_5);
                                                var7_7 = 1024;
                                                var8_8 = 128;
                                                var9_9 = 256;
                                                var10_10 = 512;
                                                var11_11 = 32;
                                                var12_12 = 64;
                                                var13_13 = 8;
                                                var14_14 = 3;
                                                var15_15 = 16;
                                                var16_16 = 4;
                                                var3_3 = 2;
                                                var17_17 = "MediaCodecUtil";
                                                var18_18 = 1;
                                                if (var6_6 == 0) break block241;
                                                var1_1 = var0.zzk;
                                                var6_6 = var2_2 /* !! */ .length;
                                                if (var6_6 >= var14_14) break block242;
                                                var2_2 /* !! */  = "Ignoring malformed Dolby Vision codec string: ";
                                                LO1.c((String)var1_1, (String)var2_2 /* !! */ , var17_17);
                                                ** GOTO lbl-1000
                                            }
                                            var5_5 = zzuj.zzb;
                                            var19_19 = var2_2 /* !! */ [var18_18];
                                            var14_14 = (int)(var5_5 = var5_5.matcher(var19_19)).matches();
                                            if (var14_14 != 0) break block243;
                                            var2_2 /* !! */  = "Ignoring malformed Dolby Vision codec string: ";
                                            LO1.c((String)var1_1, (String)var2_2 /* !! */ , var17_17);
                                            ** GOTO lbl-1000
                                        }
                                        var1_1 = var5_5.group(var18_18);
                                        if (var1_1 == null) lbl-1000:
                                        // 13 sources

                                        {
                                            while (true) {
                                                var6_6 = 0;
                                                var5_5 = null;
                                                break block239;
                                                break;
                                            }
                                        }
                                        var6_6 = var1_1.hashCode();
                                        if (var6_6 == (var14_14 = 1567)) break block244;
                                        switch (var6_6) {
                                            default: {
                                                ** GOTO lbl-1000
                                            }
                                            case 1545: {
                                                var5_5 = "09";
                                                var6_6 = (int)var1_1.equals(var5_5);
                                                if (var6_6 == 0) ** GOTO lbl-1000
                                                var5_5 = var10_10;
                                                break;
                                            }
                                            case 1544: {
                                                var5_5 = "08";
                                                var6_6 = (int)var1_1.equals(var5_5);
                                                if (var6_6 == 0) ** GOTO lbl-1000
                                                var5_5 = var9_9;
                                                break;
                                            }
                                            case 1543: {
                                                var5_5 = "07";
                                                var6_6 = (int)var1_1.equals(var5_5);
                                                if (var6_6 == 0) ** GOTO lbl-1000
                                                var5_5 = var8_8;
                                                break;
                                            }
                                            case 1542: {
                                                var5_5 = "06";
                                                var6_6 = (int)var1_1.equals(var5_5);
                                                if (var6_6 == 0) ** GOTO lbl-1000
                                                var5_5 = var12_12;
                                                break;
                                            }
                                            case 1541: {
                                                var5_5 = "05";
                                                var6_6 = (int)var1_1.equals(var5_5);
                                                if (var6_6 == 0) ** GOTO lbl-1000
                                                var5_5 = var11_11;
                                                break;
                                            }
                                            case 1540: {
                                                var5_5 = "04";
                                                var6_6 = (int)var1_1.equals(var5_5);
                                                if (var6_6 == 0) ** GOTO lbl-1000
                                                var5_5 = var15_15;
                                                break;
                                            }
                                            case 1539: {
                                                var5_5 = "03";
                                                var6_6 = (int)var1_1.equals(var5_5);
                                                if (var6_6 == 0) ** GOTO lbl-1000
                                                var5_5 = var13_13;
                                                break;
                                            }
                                            case 1538: {
                                                var5_5 = "02";
                                                var6_6 = (int)var1_1.equals(var5_5);
                                                if (var6_6 == 0) ** GOTO lbl-1000
                                                var5_5 = var16_16;
                                                break;
                                            }
                                            case 1537: {
                                                var5_5 = "01";
                                                var6_6 = (int)var1_1.equals(var5_5);
                                                if (var6_6 == 0) ** GOTO lbl-1000
                                                var5_5 = var3_3;
                                                break;
                                            }
                                            case 1536: {
                                                var5_5 = "00";
                                                var6_6 = (int)var1_1.equals(var5_5);
                                                if (var6_6 == 0) ** GOTO lbl-1000
                                                var5_5 = var18_18;
                                                break;
                                            }
                                        }
                                        break block239;
                                    }
                                    var5_5 = "10";
                                    var6_6 = (int)var1_1.equals(var5_5);
                                    if (var6_6 != 0) ** break;
                                    ** while (true)
                                    var5_5 = var7_7;
                                }
                                if (var5_5 != null) break block245;
                                var2_2 /* !! */  = "Unknown Dolby Vision profile string: ";
                                LO1.c((String)var1_1, (String)var2_2 /* !! */ , var17_17);
                                ** GOTO lbl-1000
                            }
                            var1_1 = var2_2 /* !! */ [var3_3];
                            if (var1_1 == null) lbl-1000:
                            // 15 sources

                            {
                                while (true) {
                                    var20_21 = 0;
                                    var2_2 /* !! */  = null;
                                    break block240;
                                    break;
                                }
                            }
                            var20_21 = var1_1.hashCode();
                            block49 : switch (var20_21) {
                                default: {
                                    switch (var20_21) {
                                        default: {
                                            ** GOTO lbl-1000
                                        }
                                        case 1570: {
                                            var2_2 /* !! */  = "13";
                                            var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                            if (var20_21 == 0) ** GOTO lbl-1000
                                            var20_21 = 4096;
                                            var2_2 /* !! */  = var20_21;
                                            break block49;
                                        }
                                        case 1569: {
                                            var2_2 /* !! */  = "12";
                                            var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                            if (var20_21 == 0) ** GOTO lbl-1000
                                            var20_21 = 2048;
                                            var2_2 /* !! */  = var20_21;
                                            break block49;
                                        }
                                        case 1568: {
                                            var2_2 /* !! */  = "11";
                                            var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                            if (var20_21 == 0) ** GOTO lbl-1000
                                            var2_2 /* !! */  = var7_7;
                                            break block49;
                                        }
                                        case 1567: 
                                    }
                                    var2_2 /* !! */  = "10";
                                    var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                    if (var20_21 == 0) ** GOTO lbl-1000
                                    var2_2 /* !! */  = var10_10;
                                    break;
                                }
                                case 1545: {
                                    var2_2 /* !! */  = "09";
                                    var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                    if (var20_21 == 0) ** GOTO lbl-1000
                                    var2_2 /* !! */  = var9_9;
                                    break;
                                }
                                case 1544: {
                                    var2_2 /* !! */  = "08";
                                    var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                    if (var20_21 == 0) ** GOTO lbl-1000
                                    var2_2 /* !! */  = var8_8;
                                    break;
                                }
                                case 1543: {
                                    var2_2 /* !! */  = "07";
                                    var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                    if (var20_21 == 0) ** GOTO lbl-1000
                                    var2_2 /* !! */  = var12_12;
                                    break;
                                }
                                case 1542: {
                                    var2_2 /* !! */  = "06";
                                    var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                    if (var20_21 == 0) ** GOTO lbl-1000
                                    var2_2 /* !! */  = var11_11;
                                    break;
                                }
                                case 1541: {
                                    var2_2 /* !! */  = "05";
                                    var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                    if (var20_21 == 0) ** GOTO lbl-1000
                                    var2_2 /* !! */  = var15_15;
                                    break;
                                }
                                case 1540: {
                                    var2_2 /* !! */  = "04";
                                    var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                    if (var20_21 == 0) ** GOTO lbl-1000
                                    var2_2 /* !! */  = var13_13;
                                    break;
                                }
                                case 1539: {
                                    var2_2 /* !! */  = "03";
                                    var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                    if (var20_21 == 0) ** GOTO lbl-1000
                                    var2_2 /* !! */  = var16_16;
                                    break;
                                }
                                case 1538: {
                                    var2_2 /* !! */  = "02";
                                    var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                    if (var20_21 == 0) ** GOTO lbl-1000
                                    var2_2 /* !! */  = var3_3;
                                    break;
                                }
                                case 1537: {
                                    var2_2 /* !! */  = "01";
                                    var20_21 = (int)var1_1.equals(var2_2 /* !! */ );
                                    if (var20_21 != 0) ** break;
                                    ** continue;
                                    var2_2 /* !! */  = var18_18;
                                }
                            }
                        }
                        if (var2_2 /* !! */  != null) break block246;
                        var2_2 /* !! */  = "Unknown Dolby Vision level string: ";
                        LO1.c((String)var1_1, (String)var2_2 /* !! */ , var17_17);
                        ** GOTO lbl-1000
                    }
                    var4_4 /* !! */  = new Pair(var5_5, (Object)var2_2 /* !! */ );
                    break block238;
                }
                var6_6 = 0;
                var5_5 = null;
                var21_26 = var2_2 /* !! */ [0];
                var22_27 = var21_26.hashCode();
                var9_9 = 6;
                var7_7 = -1;
                switch (var22_27) {
                    default: {
                        break;
                    }
                    case 3624515: {
                        var23_28 = "vp09";
                        var11_11 = (int)var21_26.equals(var23_28);
                        if (var11_11 == 0) break;
                        var11_11 = 2;
                        break block247;
                    }
                    case 3356560: {
                        var23_28 = "mp4a";
                        var11_11 = (int)var21_26.equals(var23_28);
                        if (var11_11 == 0) break;
                        var11_11 = 6;
                        break block247;
                    }
                    case 3214780: {
                        var23_28 = "hvc1";
                        var11_11 = (int)var21_26.equals(var23_28);
                        if (var11_11 == 0) break;
                        var11_11 = 4;
                        break block247;
                    }
                    case 3199032: {
                        var23_28 = "hev1";
                        var11_11 = (int)var21_26.equals(var23_28);
                        if (var11_11 == 0) break;
                        var11_11 = 3;
                        break block247;
                    }
                    case 3006244: {
                        var23_28 = "avc2";
                        var11_11 = (int)var21_26.equals(var23_28);
                        if (var11_11 == 0) break;
                        var11_11 = 1;
                        break block247;
                    }
                    case 3006243: {
                        var23_28 = "avc1";
                        var11_11 = (int)var21_26.equals(var23_28);
                        if (var11_11 == 0) break;
                        var11_11 = 0;
                        var23_28 = null;
                        break block247;
                    }
                    case 3004662: {
                        var23_28 = "av01";
                        var11_11 = (int)var21_26.equals(var23_28);
                        if (var11_11 == 0) break;
                        var11_11 = 5;
                        break block247;
                    }
                }
                var11_11 = -1;
            }
            var12_12 = 8192;
            var8_8 = 20;
            block75 : switch (var11_11) {
                default: {
                    ** GOTO lbl-1000
                }
                case 6: {
                    var1_1 = var1_1.zzk;
                    var10_10 = var2_2 /* !! */ .length;
                    if (var10_10 == var14_14) ** GOTO lbl292
                    var2_2 /* !! */  = "Ignoring malformed MP4A codec string: ";
                    LO1.c((String)var1_1, (String)var2_2 /* !! */ , var17_17);
                    ** GOTO lbl-1000
lbl292:
                    // 2 sources

                    var24_29 = var2_2 /* !! */ [var18_18];
                    var10_10 = Integer.parseInt(var24_29, var15_15);
                    var24_29 = zzcg.zzd(var10_10);
                    var23_28 = "audio/mp4a-latm";
                    var10_10 = (int)var23_28.equals(var24_29);
                    if (var10_10 == 0) ** GOTO lbl-1000
                    var2_2 /* !! */  = var2_2 /* !! */ [var3_3];
                    var20_22 = Integer.parseInt((String)var2_2 /* !! */ );
                    var10_10 = 17;
                    if (var20_22 == var10_10) ** GOTO lbl347
                    if (var20_22 == var8_8) ** GOTO lbl345
                    var8_8 = 23;
                    if (var20_22 == var8_8) ** GOTO lbl343
                    var8_8 = 29;
                    if (var20_22 == var8_8) ** GOTO lbl341
                    var8_8 = 39;
                    if (var20_22 == var8_8) ** GOTO lbl339
                    var8_8 = 42;
                    if (var20_22 == var8_8) ** GOTO lbl337
                    switch (var20_22) {
                        default: {
                            var14_14 = -1;
                            ** GOTO lbl348
                        }
                        case 6: {
                            var14_14 = 6;
                            ** GOTO lbl348
                        }
                        case 5: {
                            var14_14 = 5;
                            ** GOTO lbl348
                        }
                        case 4: {
                            var14_14 = 4;
                            ** GOTO lbl348
                        }
                        case 2: {
                            var14_14 = 2;
                            ** GOTO lbl348
                        }
                        case 1: {
                            var14_14 = 1;
                            ** GOTO lbl348
                        }
                        case 3: {
                            if (var14_14 == var7_7) ** GOTO lbl-1000
                        }
                    }
lbl337:
                    // 1 sources

                    var14_14 = 42;
                    ** GOTO lbl348
lbl339:
                    // 1 sources

                    var14_14 = 39;
                    ** GOTO lbl348
lbl341:
                    // 1 sources

                    var14_14 = 29;
                    ** GOTO lbl348
lbl343:
                    // 1 sources

                    var14_14 = 23;
                    ** GOTO lbl348
lbl345:
                    // 1 sources

                    var14_14 = 20;
                    ** GOTO lbl348
lbl347:
                    // 1 sources

                    var14_14 = 17;
lbl348:
                    // 12 sources

                    if (var14_14 == var7_7) ** GOTO lbl-1000
                    var4_4 /* !! */  = var14_14;
                    var5_5 = 0;
                    try {
                        var2_2 /* !! */  = new Pair((Object)var4_4 /* !! */ , var5_5);
                    }
                    catch (NumberFormatException v0) {
                        var2_2 /* !! */  = "Ignoring malformed MP4A codec string: ";
                        LO1.c((String)var1_1, (String)var2_2 /* !! */ , var17_17);
                        ** GOTO lbl-1000
                    }
lbl355:
                    // 2 sources

                    while (true) {
                        var4_4 /* !! */  = var2_2 /* !! */ ;
                        break block75;
                        break;
                    }
                }
                case 5: {
                    var25_30 = var1_1.zzk;
                    var1_1 = var1_1.zzz;
                    var11_11 = var2_2 /* !! */ .length;
                    if (var11_11 >= var16_16) ** GOTO lbl370
                    var1_1 = "Ignoring malformed AV1 codec string: ";
                    LO1.c(var25_30, (String)var1_1, var17_17);
                    ** GOTO lbl-1000
lbl370:
                    // 1 sources

                    try {
                        var23_28 = var2_2 /* !! */ [var18_18];
                    }
                    catch (NumberFormatException v1) {
                        var1_1 = "Ignoring malformed AV1 codec string: ";
                        LO1.c(var25_30, (String)var1_1, var17_17);
                        ** GOTO lbl-1000
                    }
                    var11_11 = Integer.parseInt(var23_28);
                    var26_32 = var2_2 /* !! */ [var3_3];
                    var5_5 = var26_32.substring(0, var3_3);
                    var6_6 = Integer.parseInt((String)var5_5);
                    var2_2 /* !! */  = var2_2 /* !! */ [var14_14];
                    var20_23 = Integer.parseInt((String)var2_2 /* !! */ );
                    if (var11_11 == 0) ** GOTO lbl392
                    var1_1 = "Unknown AV1 profile: ";
                    w12_0.a(var11_11, (String)var1_1, var17_17);
                    ** GOTO lbl-1000
lbl392:
                    // 1 sources

                    if (var20_23 == var13_13) ** GOTO lbl400
                    var8_8 = 10;
                    if (var20_23 == var8_8) ** GOTO lbl398
                    var1_1 = "Unknown AV1 bit depth: ";
                    w12_0.a(var20_23, (String)var1_1, var17_17);
                    ** GOTO lbl-1000
lbl398:
                    // 1 sources

                    var20_23 = var1_1 != null && ((var2_2 /* !! */  = (String[])var1_1.zzg) != null || (var27_34 = var1_1.zzf) == (var20_23 = 7) || var27_34 == var9_9) ? 4096 : 2;
                    ** GOTO lbl401
lbl400:
                    // 1 sources

                    var20_23 = 1;
lbl401:
                    // 2 sources

                    switch (var6_6) {
                        default: {
                            var27_34 = -1;
                            break;
                        }
                        case 23: {
                            var27_34 = 0x800000;
                            break;
                        }
                        case 22: {
                            var27_34 = 0x400000;
                            break;
                        }
                        case 21: {
                            var27_34 = 0x200000;
                            break;
                        }
                        case 20: {
                            var27_34 = 0x100000;
                            break;
                        }
                        case 19: {
                            var27_34 = 524288;
                            break;
                        }
                        case 18: {
                            var27_34 = 262144;
                            break;
                        }
                        case 17: {
                            var27_34 = 131072;
                            break;
                        }
                        case 16: {
                            var27_34 = 65536;
                            break;
                        }
                        case 15: {
                            var27_34 = 32768;
                            break;
                        }
                        case 14: {
                            var27_34 = 16384;
                            break;
                        }
                        case 13: {
                            var27_34 = 8192;
                            break;
                        }
                        case 12: {
                            var27_34 = 4096;
                            break;
                        }
                        case 11: {
                            var27_34 = 2048;
                            break;
                        }
                        case 10: {
                            var27_34 = 1024;
                            break;
                        }
                        case 9: {
                            var27_34 = 512;
                            break;
                        }
                        case 8: {
                            var27_34 = 256;
                            break;
                        }
                        case 7: {
                            var27_34 = 128;
                            break;
                        }
                        case 6: {
                            var27_34 = 64;
                            break;
                        }
                        case 5: {
                            var27_34 = 32;
                            break;
                        }
                        case 4: {
                            var27_34 = 16;
                            break;
                        }
                        case 3: {
                            var27_34 = 8;
                            break;
                        }
                        case 2: {
                            var27_34 = 4;
                            break;
                        }
                        case 1: {
                            var27_34 = 2;
                            break;
                        }
                        case 0: {
                            var27_34 = 1;
                        }
                    }
                    if (var27_34 != var7_7) ** GOTO lbl480
                    var1_1 = "Unknown AV1 level: ";
                    w12_0.a(var6_6, (String)var1_1, var17_17);
                    ** GOTO lbl-1000
lbl480:
                    // 1 sources

                    var2_2 /* !! */  = var20_23;
                    var1_1 = var27_34;
                    var4_4 /* !! */  = new Pair((Object)var2_2 /* !! */ , var1_1);
                    break;
                }
                case 3: 
                case 4: {
                    var23_28 = var1_1.zzk;
                    var1_1 = var1_1.zzz;
                    var15_15 = var2_2 /* !! */ .length;
                    if (var15_15 >= var16_16) ** GOTO lbl492
                    var1_1 = "Ignoring malformed HEVC codec string: ";
                    LO1.c(var23_28, (String)var1_1, var17_17);
                    ** GOTO lbl-1000
lbl492:
                    // 1 sources

                    var26_33 = zzuj.zzb;
                    var5_5 = var2_2 /* !! */ [var18_18];
                    var15_15 = (int)(var5_5 = var26_33.matcher((CharSequence)var5_5)).matches();
                    if (var15_15 != 0) ** GOTO lbl499
                    var1_1 = "Ignoring malformed HEVC codec string: ";
                    LO1.c(var23_28, (String)var1_1, var17_17);
                    ** GOTO lbl-1000
lbl499:
                    // 1 sources

                    var23_28 = "1";
                    var11_11 = (int)var23_28.equals(var5_5 = var5_5.group(var18_18));
                    if (var11_11 == 0) ** GOTO lbl504
                    var27_35 = 1;
                    ** GOTO lbl508
lbl504:
                    // 1 sources

                    var23_28 = "2";
                    var11_11 = (int)var23_28.equals(var5_5);
                    if (var11_11 == 0) ** GOTO lbl782
                    var27_35 = var1_1 != null && (var27_35 = var1_1.zzf) == var9_9 ? 4096 : 2;
lbl508:
                    // 2 sources

                    var2_2 /* !! */  = var2_2 /* !! */ [var14_14];
                    if (var2_2 /* !! */  != null) ** GOTO lbl514
lbl510:
                    // 2 sources

                    while (true) {
                        var3_3 = 0;
                        var4_4 /* !! */  = null;
                        ** GOTO lbl775
                        break;
                    }
lbl514:
                    // 1 sources

                    var6_6 = var2_2 /* !! */ .hashCode();
                    switch (var6_6) {
                        default: {
                            break;
                        }
                        case 2312995: {
                            var5_5 = "L186";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 12;
                            ** GOTO lbl675
                        }
                        case 2312992: {
                            var5_5 = "L183";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 11;
                            ** GOTO lbl675
                        }
                        case 2312989: {
                            var5_5 = "L180";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 10;
                            ** GOTO lbl675
                        }
                        case 2312902: {
                            var5_5 = "L156";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 9;
                            ** GOTO lbl675
                        }
                        case 2312899: {
                            var5_5 = "L153";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 8;
                            ** GOTO lbl675
                        }
                        case 2312896: {
                            var5_5 = "L150";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 7;
                            ** GOTO lbl675
                        }
                        case 2312806: {
                            var5_5 = "L123";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 6;
                            ** GOTO lbl675
                        }
                        case 2312803: {
                            var5_5 = "L120";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 5;
                            ** GOTO lbl675
                        }
                        case 2193831: {
                            var5_5 = "H186";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 25;
                            ** GOTO lbl675
                        }
                        case 2193828: {
                            var5_5 = "H183";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 24;
                            ** GOTO lbl675
                        }
                        case 2193825: {
                            var5_5 = "H180";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 23;
                            ** GOTO lbl675
                        }
                        case 2193738: {
                            var5_5 = "H156";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 22;
                            ** GOTO lbl675
                        }
                        case 2193735: {
                            var5_5 = "H153";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 21;
                            ** GOTO lbl675
                        }
                        case 2193732: {
                            var5_5 = "H150";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 20;
                            ** GOTO lbl675
                        }
                        case 2193642: {
                            var5_5 = "H123";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 19;
                            ** GOTO lbl675
                        }
                        case 2193639: {
                            var5_5 = "H120";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 18;
                            ** GOTO lbl675
                        }
                        case 74854: {
                            var5_5 = "L93";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 4;
                            ** GOTO lbl675
                        }
                        case 74851: {
                            var5_5 = "L90";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            ** GOTO lbl675
                        }
                        case 74761: {
                            var5_5 = "L63";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 2;
                            ** GOTO lbl675
                        }
                        case 74758: {
                            var5_5 = "L60";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 1;
                            ** GOTO lbl675
                        }
                        case 74665: {
                            var5_5 = "L30";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 0;
                            var19_20 = null;
                            ** GOTO lbl675
                        }
                        case 71010: {
                            var5_5 = "H93";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 17;
                            ** GOTO lbl675
                        }
                        case 71007: {
                            var5_5 = "H90";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 16;
                            ** GOTO lbl675
                        }
                        case 70917: {
                            var5_5 = "H63";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 15;
                            ** GOTO lbl675
                        }
                        case 70914: {
                            var5_5 = "H60";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 14;
                            ** GOTO lbl675
                        }
                        case 70821: {
                            var5_5 = "H30";
                            var6_6 = (int)var2_2 /* !! */ .equals(var5_5);
                            if (var6_6 == 0) break;
                            var14_14 = 13;
                            ** GOTO lbl675
                        }
                    }
                    var14_14 = -1;
lbl675:
                    // 27 sources

                    switch (var14_14) {
                        default: {
                            ** continue;
                        }
                        case 25: {
                            var3_3 = 0x2000000;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 24: {
                            var3_3 = 0x800000;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 23: {
                            var3_3 = 0x200000;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 22: {
                            var3_3 = 524288;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 21: {
                            var3_3 = 131072;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 20: {
                            var3_3 = 32768;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 19: {
                            var4_4 /* !! */  = var12_12;
                            break;
                        }
                        case 18: {
                            var6_6 = 2048;
                            var4_4 /* !! */  = var6_6;
                            break;
                        }
                        case 17: {
                            var4_4 /* !! */  = var10_10;
                            break;
                        }
                        case 16: {
                            var11_11 = 128;
                            var4_4 /* !! */  = var11_11;
                            break;
                        }
                        case 15: {
                            var15_15 = 32;
                            var4_4 /* !! */  = var15_15;
                            break;
                        }
                        case 14: {
                            var4_4 /* !! */  = var13_13;
                            break;
                        }
                        case 13: {
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 12: {
                            var3_3 = 0x1000000;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 11: {
                            var3_3 = 0x400000;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 10: {
                            var3_3 = 0x100000;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 9: {
                            var3_3 = 262144;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 8: {
                            var3_3 = 65536;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 7: {
                            var3_3 = 16384;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 6: {
                            var28_38 = 4096;
                            var4_4 /* !! */  = var28_38;
                            break;
                        }
                        case 5: {
                            var8_8 = 1024;
                            var4_4 /* !! */  = var8_8;
                            break;
                        }
                        case 4: {
                            var29_41 = 256;
                            var4_4 /* !! */  = var29_41;
                            break;
                        }
                        case 3: {
                            var30_44 = 64;
                            var4_4 /* !! */  = var30_44;
                            break;
                        }
                        case 2: {
                            var3_3 = 16;
                            var4_4 /* !! */  = var3_3;
                            break;
                        }
                        case 1: {
                            var4_4 /* !! */  = var16_16;
                            break;
                        }
                        case 0: {
                            var4_4 /* !! */  = var18_18;
                        }
                    }
lbl775:
                    // 27 sources

                    if (var4_4 /* !! */  != null) ** GOTO lbl779
                    var1_1 = "Unknown HEVC level string: ";
                    LO1.c((String)var2_2 /* !! */ , (String)var1_1, var17_17);
                    ** GOTO lbl-1000
lbl779:
                    // 1 sources

                    var1_1 = var27_35;
                    var2_2 /* !! */  = new Pair(var1_1, (Object)var4_4 /* !! */ );
                    ** continue;
lbl782:
                    // 1 sources

                    var1_1 = "Unknown HEVC profile string: ";
                    LO1.c((String)var5_5, (String)var1_1, var17_17);
                    ** GOTO lbl-1000
                }
                case 2: {
                    var6_6 = 2048;
                    var11_11 = 128;
                    var15_15 = 32;
                    var28_39 = 4096;
                    var29_42 = 256;
                    var30_45 = 64;
                    var1_1 = var1_1.zzk;
                    var9_9 = var2_2 /* !! */ .length;
                    if (var9_9 >= var14_14) ** GOTO lbl799
                    var2_2 /* !! */  = "Ignoring malformed VP9 codec string: ";
                    LO1.c((String)var1_1, (String)var2_2 /* !! */ , var17_17);
                    ** GOTO lbl-1000
lbl799:
                    // 2 sources

                    var31_47 = var2_2 /* !! */ [var18_18];
                    var9_9 = Integer.parseInt(var31_47);
                    var2_2 /* !! */  = var2_2 /* !! */ [var3_3];
                    try {
                        var27_36 = Integer.parseInt((String)var2_2 /* !! */ );
                        var20_24 = var9_9 != 0 ? (var9_9 != var18_18 ? (var9_9 != var3_3 ? (var9_9 != var14_14 ? -1 : 8) : 4) : 2) : 1;
                        if (var20_24 != var7_7) ** GOTO lbl811
                        var1_1 = "Unknown VP9 profile: ";
                    }
                    catch (NumberFormatException v2) {
                        var2_2 /* !! */  = "Ignoring malformed VP9 codec string: ";
                        LO1.c((String)var1_1, (String)var2_2 /* !! */ , var17_17);
                        ** GOTO lbl-1000
                    }
                    w12_0.a(var9_9, (String)var1_1, var17_17);
                    ** GOTO lbl-1000
lbl811:
                    // 1 sources

                    var9_9 = 10;
                    if (var27_36 != var9_9) {
                        var9_9 = 11;
                        if (var27_36 != var9_9) {
                            if (var27_36 != var8_8) {
                                var3_3 = 21;
                                if (var27_36 != var3_3) {
                                    var3_3 = 30;
                                    if (var27_36 != var3_3) {
                                        var3_3 = 31;
                                        if (var27_36 != var3_3) {
                                            var3_3 = 40;
                                            if (var27_36 != var3_3) {
                                                var3_3 = 41;
                                                if (var27_36 != var3_3) {
                                                    var3_3 = 50;
                                                    if (var27_36 != var3_3) {
                                                        var3_3 = 51;
                                                        if (var27_36 != var3_3) {
                                                            switch (var27_36) {
                                                                default: {
                                                                    var3_3 = -1;
                                                                    break;
                                                                }
                                                                case 62: {
                                                                    var3_3 = 8192;
                                                                    break;
                                                                }
                                                                case 61: {
                                                                    var3_3 = 4096;
                                                                    break;
                                                                }
                                                                case 60: {
                                                                    var3_3 = 2048;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            var3_3 = 512;
                                                        }
                                                    } else {
                                                        var3_3 = 256;
                                                    }
                                                } else {
                                                    var3_3 = 128;
                                                }
                                            } else {
                                                var3_3 = 64;
                                            }
                                        } else {
                                            var3_3 = 32;
                                        }
                                    } else {
                                        var3_3 = 16;
                                    }
                                } else {
                                    var3_3 = 8;
                                }
                            } else {
                                var3_3 = 4;
                            }
                        }
                    } else {
                        var3_3 = 1;
                    }
                    if (var3_3 != var7_7) ** GOTO lbl865
                    var2_2 /* !! */  = "Unknown VP9 level: ";
                    w12_0.a(var27_36, (String)var2_2 /* !! */ , var17_17);
                    ** GOTO lbl-1000
lbl865:
                    // 1 sources

                    var2_2 /* !! */  = var20_24;
                    var4_4 /* !! */  = var3_3;
                    var1_1 = new Pair((Object)var2_2 /* !! */ , (Object)var4_4 /* !! */ );
lbl868:
                    // 2 sources

                    while (true) {
                        var4_4 /* !! */  = var1_1;
                        break block75;
                        break;
                    }
                }
                case 0: 
                case 1: {
                    var8_8 = 1024;
                    var11_11 = 128;
                    var15_15 = 32;
                    var28_40 = 4096;
                    var29_43 = 256;
                    var30_46 = 64;
                    var1_1 = var1_1.zzk;
                    var6_6 = var2_2 /* !! */ .length;
                    var25_31 = "Ignoring malformed AVC codec string: ";
                    if (var6_6 >= var3_3) ** GOTO lbl889
                    LO1.c((String)var1_1, var25_31, var17_17);
                    ** GOTO lbl-1000
lbl889:
                    // 2 sources

                    var32_49 = var2_2 /* !! */ [var18_18];
                    var10_10 = var32_49.length();
                    if (var10_10 != var9_9) ** GOTO lbl909
                    var5_5 = var2_2 /* !! */ [var18_18];
                    var9_9 = 0;
                    var31_48 = null;
                    var5_5 = var5_5.substring(0, var3_3);
                    var9_9 = 16;
                    var6_6 = Integer.parseInt((String)var5_5, var9_9);
                    var2_2 /* !! */  = var2_2 /* !! */ [var18_18];
                    var2_2 /* !! */  = var2_2 /* !! */ .substring(var16_16);
                    var27_37 = Integer.parseInt((String)var2_2 /* !! */ , var9_9);
                    ** GOTO lbl919
lbl909:
                    // 1 sources

                    var9_9 = 16;
                    if (var6_6 < var14_14) ** GOTO lbl999
                    var5_5 = var2_2 /* !! */ [var18_18];
                    var6_6 = Integer.parseInt((String)var5_5);
                    var2_2 /* !! */  = var2_2 /* !! */ [var3_3];
                    var27_37 = Integer.parseInt((String)var2_2 /* !! */ );
lbl919:
                    // 2 sources

                    var20_25 = 66;
                    if (var6_6 != var20_25) {
                        var20_25 = 77;
                        if (var6_6 != var20_25) {
                            var20_25 = 88;
                            var3_3 = var6_6 != var20_25 ? (var6_6 != (var20_25 = 100) ? (var6_6 != (var20_25 = 110) ? (var6_6 != (var20_25 = 122) ? (var6_6 != (var20_25 = 244) ? -1 : 64) : 32) : 16) : 8) : 4;
                        }
                    } else {
                        var3_3 = 1;
                    }
                    if (var3_3 != var7_7) ** GOTO lbl931
                    var1_1 = "Unknown AVC profile: ";
                    w12_0.a(var6_6, (String)var1_1, var17_17);
                    ** GOTO lbl-1000
lbl931:
                    // 1 sources

                    block177 : switch (var27_37) {
                        default: {
                            switch (var27_37) {
                                default: {
                                    switch (var27_37) {
                                        default: {
                                            switch (var27_37) {
                                                default: {
                                                    switch (var27_37) {
                                                        default: {
                                                            var20_25 = -1;
                                                            break block177;
                                                        }
                                                        case 52: {
                                                            var20_25 = 65536;
                                                            break block177;
                                                        }
                                                        case 51: {
                                                            var20_25 = 32768;
                                                            break block177;
                                                        }
                                                        case 50: 
                                                    }
                                                    var20_25 = 16384;
                                                    break block177;
                                                }
                                                case 42: {
                                                    var20_25 = 8192;
                                                    break block177;
                                                }
                                                case 41: {
                                                    var20_25 = 4096;
                                                    break block177;
                                                }
                                                case 40: 
                                            }
                                            var20_25 = 2048;
                                            break block177;
                                        }
                                        case 32: {
                                            var20_25 = 1024;
                                            break block177;
                                        }
                                        case 31: {
                                            var20_25 = 512;
                                            break block177;
                                        }
                                        case 30: 
                                    }
                                    var20_25 = 256;
                                    break block177;
                                }
                                case 22: {
                                    var20_25 = 128;
                                    break block177;
                                }
                                case 21: {
                                    var20_25 = 64;
                                    break block177;
                                }
                                case 20: 
                            }
                            var20_25 = 32;
                            break;
                        }
                        case 13: {
                            var20_25 = 16;
                            break;
                        }
                        case 12: {
                            var20_25 = 8;
                            break;
                        }
                        case 11: {
                            var20_25 = 4;
                            break;
                        }
                        case 10: {
                            var20_25 = 1;
                        }
                    }
                    if (var20_25 != var7_7) ** GOTO lbl994
                    var2_2 /* !! */  = "Unknown AVC level: ";
                    w12_0.a(var27_37, (String)var2_2 /* !! */ , var17_17);
                    ** GOTO lbl-1000
lbl994:
                    // 1 sources

                    var4_4 /* !! */  = var3_3;
                    var2_2 /* !! */  = var20_25;
                    var1_1 = new Pair((Object)var4_4 /* !! */ , (Object)var2_2 /* !! */ );
                    ** continue;
lbl999:
                    // 2 sources

                    var2_2 /* !! */  = new StringBuilder(var25_31);
                    var2_2 /* !! */ .append((String)var1_1);
                    var2_2 /* !! */  = var2_2 /* !! */ .toString();
                    try {
                        zzfk.zzf(var17_17, (String)var2_2 /* !! */ );
                    }
                    catch (NumberFormatException v3) {
                        LO1.c((String)var1_1, var25_31, var17_17);
                    }
                    ** continue;
                }
            }
        }
        return var4_4 /* !! */ ;
    }

    public static zztp zzb() {
        List list = zzuj.zze("audio/raw", false, false);
        boolean bl2 = list.isEmpty();
        if (bl2) {
            return null;
        }
        return (zztp)list.get(0);
    }

    public static String zzc(zzan object) {
        String string2 = "audio/eac3-joc";
        String string3 = ((zzan)object).zzn;
        int n3 = string2.equals(string3);
        if (n3 != 0) {
            return "audio/eac3";
        }
        string2 = "video/dolby-vision";
        string3 = ((zzan)object).zzn;
        n3 = string2.equals(string3);
        if (n3 != 0 && (object = zzuj.zza((zzan)object)) != null) {
            object = (Integer)((Pair)object).first;
            int n4 = (Integer)object;
            if (n4 != (n3 = 16) && n4 != (n3 = 256)) {
                n3 = 512;
                if (n4 == n3) {
                    return "video/avc";
                }
            } else {
                return "video/hevc";
            }
        }
        return null;
    }

    public static List zzd(zztx object, zzan zzan2, boolean bl2, boolean bl3) {
        object = zzuj.zzc(zzan2);
        if (object == null) {
            return zzgbc.zzm();
        }
        return zzuj.zze((String)object, bl2, bl3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static List zze(String var0, boolean var1_1, boolean var2_2) {
        var3_3 = var0;
        var4_5 = var1_1;
        var5_6 = "MediaCodecList API didn't list secure decoder for: ";
        var6_7 = zzuj.class;
        synchronized (var6_7) {
            block11: {
                block12: {
                    block10: {
                        var7_8 = new zzub(var0, (boolean)var1_1, var2_2);
                        var8_9 = zzuj.zzc;
                        var9_10 /* !! */  = var8_9.get(var7_8);
                        var9_10 /* !! */  = (List)var9_10 /* !! */ ;
                        if (var9_10 /* !! */  == null) break block10;
lbl-1000:
                        // 3 sources

                        {
                            catch (Throwable var3_4) {
                                break block11;
                            }
                        }
                        return var9_10 /* !! */ ;
                    }
                    ** try [egrp 1[TRYBLOCK] [5 : 62->65)] { 
lbl17:
                    // 1 sources

                    var9_10 /* !! */  = new V((boolean)var1_1, var2_2);
                    var10_11 = zzuj.zzh(var7_8, var9_10 /* !! */ );
                    var9_10 /* !! */  = null;
                    if (var1_1 == 0 || (var4_5 = (int)var10_11.isEmpty()) == 0 || (var4_5 = zzgd.zza) > (var11_12 = 23)) break block12;
                    var10_11 = null;
                    var12_13 = new zzug(null);
                    var10_11 = zzuj.zzh(var7_8, (zzue)var12_13);
                    var4_5 = (int)var10_11.isEmpty();
                    if (var4_5 != 0) break block12;
                    var12_13 = var10_11.get(0);
                    var12_13 = (zztp)var12_13;
                    var12_13 = var12_13.zza;
                    var13_14 = new StringBuilder(var5_6);
                    var13_14.append(var0);
                    var5_6 = ". Assuming: ";
                    var13_14.append(var5_6);
                    var13_14.append((String)var12_13);
                    var12_13 = var13_14.toString();
                    var5_6 = "MediaCodecUtil";
                    zzfk.zzf(var5_6, (String)var12_13);
                }
                var12_13 = "audio/raw";
                var14_15 = var12_13.equals(var3_3);
                var4_5 = 1;
                if (var14_15 != 0) {
                    var14_15 = zzgd.zza;
                    var15_16 = 26;
                    if (var14_15 < var15_16 && (var14_15 = (int)(var3_3 = zzgd.zzb).equals(var5_6 = "R9")) != 0 && (var14_15 = var10_11.size()) == var4_5) {
                        var3_3 = var10_11.get(0);
                        var3_3 = (zztp)var3_3;
                        var3_3 = var3_3.zza;
                        var5_6 = "OMX.MTK.AUDIO.DECODER.RAW";
                        var14_15 = (int)var3_3.equals(var5_6);
                        if (var14_15 != 0) {
                            var13_14 = "OMX.google.raw.decoder";
                            var16_17 = "audio/raw";
                            var17_18 = "audio/raw";
                            var18_19 = true;
                            var3_3 = zztp.zzc((String)var13_14, var16_17, var17_18, null, false, var18_19, false, false, false);
                            var10_11.add(var3_3);
                        }
                    }
                    var3_3 = new zztz();
                    zzuj.zzi(var10_11, (zzui)var3_3);
                }
                if ((var14_15 = zzgd.zza) < (var15_16 = 32) && (var14_15 = var10_11.size()) > var4_5) {
                    var3_3 = var10_11.get(0);
                    var3_3 = (zztp)var3_3;
                    var12_13 = "OMX.qti.audio.decoder.flac";
                    var3_3 = var3_3.zza;
                    var14_15 = (int)var12_13.equals(var3_3);
                    if (var14_15 != 0) {
                        var3_3 = var10_11.remove(0);
                        var3_3 = (zztp)var3_3;
                        var10_11.add(var3_3);
                    }
                }
                var3_3 = zzgbc.zzk(var10_11);
                var8_9.put(var7_8, var3_3);
                return var3_3;
            }
            throw var3_4;
        }
    }

    public static List zzf(zztx object, zzan object2, boolean bl2, boolean bl3) {
        List list = zzuj.zze(((zzan)object2).zzn, bl2, bl3);
        object = zzuj.zzd((zztx)object, (zzan)object2, bl2, bl3);
        object2 = new zzgaz();
        ((zzgaz)object2).zzh(list);
        ((zzgaz)object2).zzh((Iterable)object);
        return ((zzgaz)object2).zzi();
    }

    public static List zzg(List object, zzan zzan2) {
        ArrayList arrayList = new ArrayList(object);
        object = new zzua(zzan2);
        zzuj.zzi(arrayList, (zzui)object);
        return arrayList;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ArrayList zzh(zzub var0, zzue var1_1) {
        block35: {
            block34: {
                block39: {
                    block38: {
                        block37: {
                            block36: {
                                block40: {
                                    var2_2 = var0;
                                    var3_3 = var1_1;
                                    var4_4 = "secure-playback";
                                    var5_5 = "tunneled-playback";
                                    try {
                                        var6_6 = new ArrayList<Object>();
                                        var7_7 = var0.zza;
                                        var8_8 = var1_1.zza();
                                        var9_9 = var1_1.zze();
                                        var10_10 = 0;
lbl11:
                                        // 2 sources

                                        while (true) {
                                            if (var10_10 >= var8_8) return var6_6;
                                            var11_11 = var3_3.zzb(var10_10);
                                            var12_18 = zzgd.zza;
                                            var13_19 = 29;
                                            if (var12_18 < var13_19 || !(var14_20 = SL1.a((MediaCodecInfo)var11_11))) break;
lbl17:
                                            // 8 sources

                                            while (true) {
                                                var15_21 = var10_10;
                                                var16_22 = var8_8;
                                                var3_3 = var7_7;
                                                break block34;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    catch (Exception var11_12) {
                                        break block35;
                                    }
                                    var17_23 = var11_11.getName();
                                    var14_20 = var11_11.isEncoder();
                                    if (var14_20) ** GOTO lbl17
                                    var18_24 = ".secure";
                                    if (!var9_9 && (var19_25 = (int)var17_23.endsWith((String)var18_24)) || var12_18 < (var19_25 = 24) && ((var19_25 = (int)(var20_26 = "OMX.SEC.aac.dec").equals(var17_23)) || (var19_25 = (int)(var20_26 = "OMX.Exynos.AAC.Decoder").equals(var17_23))) && (var19_25 = (int)(var20_26 = "samsung").equals(var21_27 = zzgd.zzc)) && ((var22_28 = (int)(var20_26 = zzgd.zzb).startsWith(var21_27 = "zeroflte")) || (var22_28 = (int)var20_26.startsWith(var21_27 = "zerolte")) || (var22_28 = (int)var20_26.startsWith(var21_27 = "zenlte")) || (var22_28 = (int)(var21_27 = "SC-05G").equals(var20_26)) || (var22_28 = (int)(var21_27 = "marinelteatt").equals(var20_26)) || (var22_28 = (int)(var21_27 = "404SC").equals(var20_26)) || (var22_28 = (int)(var21_27 = "SC-04G").equals(var20_26)) || (var19_25 = (int)(var21_27 = "SCV31").equals(var20_26))) || var12_18 <= (var22_28 = 23) && (var12_18 = (int)(var23_29 = "audio/eac3-joc").equals(var7_7)) && (var12_18 = (int)(var23_29 = "OMX.MTK.AUDIO.DECODER.DSPAC3").equals(var17_23))) ** GOTO lbl17
                                    var23_29 = var11_11.getSupportedTypes();
                                    var19_25 = ((String[])var23_29).length;
                                    var21_27 = null;
                                    for (var22_28 = 0; var22_28 < var19_25; var22_28 += 1) {
                                        var24_30 = var23_29[var22_28];
                                        var25_31 = var24_30.equalsIgnoreCase((String)var7_7);
                                        if (!var25_31) {
                                            continue;
                                        }
                                        break block36;
                                    }
                                    var24_30 = "video/dolby-vision";
                                    var26_32 = var7_7.equals(var24_30);
                                    if (!var26_32) break block40;
                                    var24_30 = "OMX.MS.HEVCDV.Decoder";
                                    var26_32 = var24_30.equals(var17_23);
                                    if (var26_32) {
                                        var24_30 = "video/hevcdv";
                                        break block36;
                                    } else {
                                        var24_30 = "OMX.RTK.video.decoder";
                                        var26_32 = var24_30.equals(var17_23);
                                        if (!var26_32 && !(var26_32 = (var24_30 = "OMX.realtek.video.decoder.tunneled").equals(var17_23))) {
                                            while (true) {
                                                var26_32 = false;
                                                var24_30 = null;
                                                break block36;
                                                break;
                                            }
                                        } else {
                                            var24_30 = "video/dv_hevc";
                                        }
                                    }
                                    break block36;
                                }
                                var24_30 = "audio/alac";
                                var26_32 = var7_7.equals(var24_30);
                                if (var26_32 && (var26_32 = (var24_30 = "OMX.lge.alac.decoder").equals(var17_23))) {
                                    var24_30 = "audio/x-lg-alac";
                                } else {
                                    var24_30 = "audio/flac";
                                    var26_32 = var7_7.equals(var24_30);
                                    if (var26_32 && (var26_32 = (var24_30 = "OMX.lge.flac.decoder").equals(var17_23))) {
                                        var24_30 = "audio/x-lg-flac";
                                    } else {
                                        if (!(var26_32 = var7_7.equals(var24_30 = "audio/ac3")) || !(var26_32 = (var24_30 = "OMX.lge.ac3.decoder").equals(var17_23))) ** continue;
                                        var24_30 = "audio/lg-ac3";
                                    }
                                }
                            }
                            if (var24_30 == null) ** GOTO lbl17
                            try {
                                block44: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                var20_26 = var11_11.getCapabilitiesForType((String)var24_30);
                                                var12_18 = (int)var3_3.zzd(var5_5, (String)var24_30, (MediaCodecInfo.CodecCapabilities)var20_26);
                                                var22_28 = (int)var3_3.zzc(var5_5, (String)var24_30, (MediaCodecInfo.CodecCapabilities)var20_26);
                                                var13_19 = (int)var2_2.zzc;
                                                if (var13_19) break block41;
                                                if (var22_28) ** GOTO lbl17
                                                break block42;
                                            }
                                            if (!var12_18) ** GOTO lbl17
                                        }
                                        var12_18 = (int)var3_3.zzd(var4_4, (String)var24_30, (MediaCodecInfo.CodecCapabilities)var20_26);
                                        var13_19 = (int)var3_3.zzc(var4_4, (String)var24_30, (MediaCodecInfo.CodecCapabilities)var20_26);
                                        var22_28 = (int)var2_2.zzb;
                                        var16_22 = 1;
                                        if (var22_28) break block43;
                                        if (var13_19) ** GOTO lbl17
                                        break block44;
                                    }
                                    if (var12_18) ** break;
                                    ** continue;
                                    var12_18 = 1;
                                }
                                var13_19 = zzgd.zza;
                                var22_28 = 29;
                                if (var13_19 < var22_28) break block37;
                                var22_28 = (int)QL1.a((MediaCodecInfo)var11_11);
                                break block38;
                            }
                            catch (Exception var11_13) {
                                var2_2 = var17_23;
                                var15_21 = var10_10;
                                var16_22 = var8_8;
                                var3_3 = var7_7;
                                ** GOTO lbl-1000
                            }
                        }
                        var22_28 = (int)zzuj.zzj((MediaCodecInfo)var11_11, (String)var7_7);
                        if (!var22_28) {
                            var22_28 = 1;
                        } else {
                            var22_28 = 0;
                            var21_27 = null;
                        }
                    }
                    var27_33 = zzuj.zzj((MediaCodecInfo)var11_11, (String)var7_7);
                    var28_34 = 29;
                    if (var13_19 >= var28_34) {
                        var29_35 = RL1.a((MediaCodecInfo)var11_11);
                    } else {
                        var11_11 = var11_11.getName();
                        var28_34 = (int)(var11_11 = zzfxm.zza((String)var11_11)).startsWith((String)(var3_3 = "omx.google."));
                        if (!(var28_34 || (var28_34 = (int)var11_11.startsWith((String)(var3_3 = "c2.android."))) || (var29_35 = var11_11.startsWith((String)(var3_3 = "c2.google."))))) {
                            var29_35 = true;
                        } else {
                            var29_35 = false;
                            var11_11 = null;
                        }
                    }
                    if (var9_9 && (var28_34 = (int)var2_2.zzb) == var12_18) ** GOTO lbl137
                    if (var9_9) break block39;
                    var28_34 = (int)var2_2.zzb;
                    if (var28_34) break block39;
                    {
                        catch (Exception var11_15) {
                            var31_37 = var17_23;
                            var15_21 = var10_10;
                            var16_22 = var8_8;
                            var3_3 = var7_7;
                            ** GOTO lbl-1000
                        }
lbl137:
                        // 2 sources

                        var28_34 = 0;
                        var25_31 = false;
                        var23_29 = var17_23;
                        var30_36 = var7_7;
                        var18_24 = var24_30;
                        var31_37 = var17_23;
                        var15_21 = var10_10;
                        var10_10 = (int)var29_35;
                        var16_22 = var8_8;
                        var8_8 = 0;
                        var3_3 = var7_7;
                        var7_7 = null;
                        ** try [egrp 3[TRYBLOCK] [59 : 1128->1211)] { 
lbl150:
                        // 1 sources

                        var11_11 = zztp.zzc(var17_23, (String)var30_36, (String)var24_30, (MediaCodecInfo.CodecCapabilities)var20_26, (boolean)var22_28, var27_33, var29_35, false, false);
                        var6_6.add(var11_11);
                        break block34;
                    }
lbl154:
                    // 1 sources

                    catch (Exception var11_14) lbl-1000:
                    // 2 sources

                    {
                        var2_2 = var31_37;
                        ** GOTO lbl-1000
                    }
                }
                var31_37 = var17_23;
                var15_21 = var10_10;
                var16_22 = var8_8;
                var3_3 = var7_7;
                if (var9_9 || !var12_18) break block34;
                var23_29 = new StringBuilder();
                var7_7 = var17_23;
                try {
                    var23_29.append(var17_23);
                    var23_29.append((String)var18_24);
                    var23_29 = var23_29.toString();
                    var8_8 = 0;
                    var25_31 = true;
                    var30_36 = var3_3;
                    var18_24 = var24_30;
                }
                catch (Exception var11_17) {
                    var2_2 = var7_7;
                    ** GOTO lbl-1000
                }
                var10_10 = (int)var29_35;
                var2_2 = var17_23;
                try {
                    var11_11 = zztp.zzc((String)var23_29, (String)var3_3, (String)var24_30, (MediaCodecInfo.CodecCapabilities)var20_26, (boolean)var22_28, var27_33, var29_35, false, var25_31);
                    var6_6.add(var11_11);
                    return var6_6;
                }
                catch (Exception var11_16) {}
lbl-1000:
                // 4 sources

                {
                    var12_18 = zzgd.zza;
                    var30_36 = "MediaCodecUtil";
                    var14_20 = 23;
                    if (var12_18 <= var14_20 && !(var12_18 = (int)var6_6.isEmpty())) {
                        var11_11 = new StringBuilder();
                        var24_30 = "Skipping codec ";
                        var11_11.append((String)var24_30);
                        var11_11.append((String)var2_2);
                        var2_2 = " (failed to query capabilities)";
                        var11_11.append((String)var2_2);
                        var11_11 = var11_11.toString();
                        zzfk.zzc((String)var30_36, (String)var11_11);
                        break block34;
                    }
                    var3_3 = new StringBuilder();
                    var4_4 = "Failed to query codec ";
                    var3_3.append(var4_4);
                    var3_3.append((String)var2_2);
                    var2_2 = " (";
                    var3_3.append((String)var2_2);
                    var3_3.append((String)var24_30);
                    var2_2 = ")";
                    var3_3.append((String)var2_2);
                    var2_2 = var3_3.toString();
                    zzfk.zzc((String)var30_36, (String)var2_2);
                    throw var11_11;
                }
            }
            var10_10 = var15_21 + 1;
            var2_2 = var0;
            var7_7 = var3_3;
            var8_8 = var16_22;
            var3_3 = var1_1;
            ** while (true)
        }
        var2_2 = new zzud(var11_12, null);
        throw var2_2;
    }

    private static void zzi(List list, zzui zzui2) {
        zzty zzty2 = new zzty(zzui2);
        Collections.sort(list, zzty2);
    }

    private static boolean zzj(MediaCodecInfo object, String string2) {
        int n3 = zzgd.zza;
        int n4 = 29;
        if (n3 >= n4) {
            return PL1.a((MediaCodecInfo)object);
        }
        boolean bl2 = zzcg.zzg(string2);
        n3 = 1;
        if (bl2) {
            return n3 != 0;
        }
        object = zzfxm.zza(object.getName());
        string2 = "arc.";
        bl2 = ((String)object).startsWith(string2);
        n4 = 0;
        if (bl2) {
            return false;
        }
        string2 = "omx.google.";
        bl2 = ((String)object).startsWith(string2);
        if (!(bl2 || (bl2 = ((String)object).startsWith(string2 = "omx.ffmpeg.")) || (bl2 = ((String)object).startsWith(string2 = "omx.sec.")) && (bl2 = ((String)object).contains(string2 = ".sw.")) || (bl2 = ((String)object).equals(string2 = "omx.qcom.video.decoder.hevcswvdec")) || (bl2 = ((String)object).startsWith(string2 = "c2.android.")) || (bl2 = ((String)object).startsWith(string2 = "c2.google.")))) {
            string2 = "omx.";
            bl2 = ((String)object).startsWith(string2);
            if (!bl2) {
                string2 = "c2.";
                boolean bl3 = ((String)object).startsWith(string2);
                if (bl3) {
                    return false;
                }
            } else {
                n3 = 0;
            }
        }
        return n3 != 0;
    }
}

