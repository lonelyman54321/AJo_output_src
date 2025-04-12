/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo
 *  android.util.Pair
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.d;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$a;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$b;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$e;
import androidx.media3.exoplayer.mediacodec.e;
import androidx.media3.exoplayer.mediacodec.g;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class MediaCodecUtil {
    public static final HashMap a;

    static {
        HashMap hashMap;
        a = hashMap = new HashMap();
    }

    public static void a(String object, ArrayList arrayList) {
        int n3;
        String string2 = "audio/raw";
        int n4 = string2.equals(object);
        int n7 = 1;
        if (n4 != 0) {
            Object object2;
            n4 = gz3.a;
            n3 = 26;
            if (n4 < n3 && (n4 = (int)(((String)(object = gz3.b)).equals(object2 = "R9") ? 1 : 0)) != 0 && (n4 = arrayList.size()) == n7 && (n4 = (int)(((String)(object = ((e)arrayList.get((int)0)).a)).equals(object2 = "OMX.MTK.AUDIO.DECODER.RAW") ? 1 : 0)) != 0) {
                boolean bl2 = true;
                object2 = "OMX.google.raw.decoder";
                String string3 = "audio/raw";
                String string4 = "audio/raw";
                object = e.h((String)object2, string3, string4, null, false, bl2, false, false);
                arrayList.add(object);
            }
            object = new Object();
            object2 = new UL1((MediaCodecUtil$e)object);
            Collections.sort(arrayList, object2);
        }
        if ((n4 = gz3.a) < (n3 = 32) && (n4 = arrayList.size()) > n7 && (n4 = (int)((string2 = "OMX.qti.audio.decoder.flac").equals(object = ((e)arrayList.get((int)0)).a) ? 1 : 0)) != 0) {
            object = (e)arrayList.remove(0);
            arrayList.add(object);
        }
    }

    public static String b(d object) {
        int n3;
        String string2 = "audio/eac3-joc";
        String string3 = ((d)object).o;
        int n4 = string2.equals(string3);
        if (n4 != 0) {
            return "audio/eac3";
        }
        string3 = "video/dolby-vision";
        string2 = ((d)object).o;
        n4 = string3.equals(string2);
        String string4 = "video/hevc";
        if (n4 != 0 && (object = MediaCodecUtil.d((d)object)) != null) {
            object = (Integer)((Pair)object).first;
            n3 = (Integer)object;
            if (n3 != (n4 = 16) && n3 != (n4 = 256)) {
                n4 = 512;
                if (n3 == n4) {
                    return "video/avc";
                }
                n4 = 1024;
                if (n3 == n4) {
                    return "video/av01";
                }
            } else {
                return string4;
            }
        }
        if ((n3 = ((String)(object = "video/mv-hevc")).equals(string2)) != 0) {
            return string4;
        }
        return null;
    }

    public static String c(MediaCodecInfo object, String string2, String string3) {
        for (String string4 : object.getSupportedTypes()) {
            boolean bl2 = string4.equalsIgnoreCase(string3);
            if (!bl2) continue;
            return string4;
        }
        object = "video/dolby-vision";
        boolean bl3 = string3.equals(object);
        if (bl3) {
            object = "OMX.MS.HEVCDV.Decoder";
            bl3 = ((String)object).equals(string2);
            if (bl3) {
                return "video/hevcdv";
            }
            object = "OMX.RTK.video.decoder";
            bl3 = ((String)object).equals(string2);
            if (bl3 || (bl3 = ((String)(object = "OMX.realtek.video.decoder.tunneled")).equals(string2))) {
                return "video/dv_hevc";
            }
        } else {
            object = "video/mv-hevc";
            bl3 = string3.equals(object);
            if (bl3) {
                object = "c2.qti.mvhevc.decoder";
                bl3 = ((String)object).equals(string2);
                if (bl3) {
                    return "video/x-mvhevc";
                }
            } else {
                object = "audio/alac";
                bl3 = string3.equals(object);
                if (bl3 && (bl3 = ((String)(object = "OMX.lge.alac.decoder")).equals(string2))) {
                    return "audio/x-lg-alac";
                }
                object = "audio/flac";
                bl3 = string3.equals(object);
                if (bl3 && (bl3 = ((String)(object = "OMX.lge.flac.decoder")).equals(string2))) {
                    return "audio/x-lg-flac";
                }
                object = "audio/ac3";
                bl3 = string3.equals(object);
                if (bl3 && (bl3 = ((String)(object = "OMX.lge.ac3.decoder")).equals(string2))) {
                    return "audio/lg-ac3";
                }
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Pair d(d var0) {
        block235: {
            block236: {
                block240: {
                    block234: {
                        block239: {
                            block233: {
                                block238: {
                                    block237: {
                                        var1_1 = var0;
                                        var2_2 = "10";
                                        var3_3 = "09";
                                        var4_4 = "08";
                                        var5_5 = "07";
                                        var6_6 = "06";
                                        var7_7 = "05";
                                        var8_8 = "04";
                                        var9_9 = "03";
                                        var10_10 = "02";
                                        var11_11 = "01";
                                        var12_12 = 3;
                                        var13_13 = 1;
                                        var14_14 = var0.k;
                                        var15_15 /* !! */  = null;
                                        if (var14_14 == null) break block235;
                                        var16_16 /* !! */  = var14_14.split("\\.");
                                        var17_17 = var0.o;
                                        var18_18 = "video/dolby-vision".equals(var17_17);
                                        var19_19 = 2048;
                                        var20_20 = 4096;
                                        var21_21 = 512;
                                        var22_22 = 256;
                                        var23_23 = 128;
                                        var24_24 = 64;
                                        var25_25 = 32;
                                        var14_14 = var0.k;
                                        if (var18_18 == 0) break block236;
                                        var26_26 = var16_16 /* !! */ .length;
                                        var17_17 = "Ignoring malformed Dolby Vision codec string: ";
                                        if (var26_26 >= var12_12) break block237;
                                        KW.b(var17_17, (String)var14_14);
                                        break block235;
                                    }
                                    var1_1 = LW.c;
                                    var27_31 = var16_16 /* !! */ [var13_13];
                                    var12_12 = (int)(var1_1 = var1_1.matcher(var27_31)).matches();
                                    if (var12_12 != 0) break block238;
                                    KW.b(var17_17, (String)var14_14);
                                    break block235;
                                }
                                if ((var1_1 = var1_1.group(var13_13)) == null) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var14_14 = null;
lbl46:
                                        // 10 sources

                                        while (true) {
                                            var18_18 = 2;
                                            break block233;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                var18_18 = var1_1.hashCode();
                                switch (var18_18) lbl-1000:
                                // 12 sources

                                {
                                    default: {
                                        var18_18 = -1;
                                        break;
                                    }
                                    case 1567: {
                                        var18_18 = (int)var1_1.equals(var2_2);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 10;
                                        break;
                                    }
                                    case 1545: {
                                        var18_18 = (int)var1_1.equals(var3_3);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 9;
                                        break;
                                    }
                                    case 1544: {
                                        var18_18 = (int)var1_1.equals(var4_4);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 8;
                                        break;
                                    }
                                    case 1543: {
                                        var18_18 = (int)var1_1.equals(var5_5);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 7;
                                        break;
                                    }
                                    case 1542: {
                                        var18_18 = (int)var1_1.equals(var6_6);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 6;
                                        break;
                                    }
                                    case 1541: {
                                        var18_18 = (int)var1_1.equals(var7_7);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 5;
                                        break;
                                    }
                                    case 1540: {
                                        var18_18 = (int)var1_1.equals(var8_8);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 4;
                                        break;
                                    }
                                    case 1539: {
                                        var18_18 = (int)var1_1.equals(var9_9);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 3;
                                        break;
                                    }
                                    case 1538: {
                                        var18_18 = (int)var1_1.equals(var10_10);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 2;
                                        break;
                                    }
                                    case 1537: {
                                        var18_18 = (int)var1_1.equals(var11_11);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 1;
                                        break;
                                    }
                                    case 1536: {
                                        var17_17 = "00";
                                        var18_18 = (int)var1_1.equals(var17_17);
                                        if (var18_18 == 0) ** GOTO lbl-1000
                                        var18_18 = 0;
                                        var17_17 = null;
                                    }
                                }
                                switch (var18_18) {
                                    default: {
                                        ** continue;
                                    }
                                    case 10: {
                                        var18_18 = 1024;
                                        var14_14 = var18_18;
                                        ** GOTO lbl46
                                    }
                                    case 9: {
                                        var14_14 = var21_21;
                                        ** GOTO lbl46
                                    }
                                    case 8: {
                                        var14_14 = var22_22;
                                        ** GOTO lbl46
                                    }
                                    case 7: {
                                        var14_14 = var23_23;
                                        ** GOTO lbl46
                                    }
                                    case 6: {
                                        var14_14 = var24_24;
                                        ** GOTO lbl46
                                    }
                                    case 5: {
                                        var14_14 = var25_25;
                                        ** GOTO lbl46
                                    }
                                    case 4: {
                                        var18_18 = 16;
                                        var14_14 = var18_18;
                                        ** GOTO lbl46
                                    }
                                    case 3: {
                                        var18_18 = 8;
                                        var14_14 = var18_18;
                                        ** GOTO lbl46
                                    }
                                    case 2: {
                                        var18_18 = 4;
                                        var14_14 = var18_18;
                                        ** continue;
                                    }
                                    case 1: {
                                        var18_18 = 2;
                                        var14_14 = var18_18;
                                        break;
                                    }
                                    case 0: {
                                        var18_18 = 2;
                                        var14_14 = var13_13;
                                    }
                                }
                            }
                            if (var14_14 != null) break block239;
                            var2_2 = "Unknown Dolby Vision profile string: ";
                            KW.b((String)var2_2, (String)var1_1);
                            break block235;
                        }
                        var1_1 = var16_16 /* !! */ [var18_18];
                        if (var1_1 == null) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var28_33 = 0;
                                var2_2 = null;
                                break block234;
                                break;
                            }
                        }
                        var29_35 = var1_1.hashCode();
                        switch (var29_35) lbl-1000:
                        // 14 sources

                        {
                            default: {
                                var29_35 = -1;
                                break;
                            }
                            case 1570: {
                                var2_2 = "13";
                                var28_33 = var1_1.equals(var2_2);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 12;
                                break;
                            }
                            case 1569: {
                                var2_2 = "12";
                                var28_33 = var1_1.equals(var2_2);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 11;
                                break;
                            }
                            case 1568: {
                                var2_2 = "11";
                                var28_33 = var1_1.equals(var2_2);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 10;
                                break;
                            }
                            case 1567: {
                                var28_33 = var1_1.equals(var2_2);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 9;
                                break;
                            }
                            case 1545: {
                                var28_33 = var1_1.equals(var3_3);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 8;
                                break;
                            }
                            case 1544: {
                                var28_33 = var1_1.equals(var4_4);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 7;
                                break;
                            }
                            case 1543: {
                                var28_33 = var1_1.equals(var5_5);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 6;
                                break;
                            }
                            case 1542: {
                                var28_33 = var1_1.equals(var6_6);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 5;
                                break;
                            }
                            case 1541: {
                                var28_33 = var1_1.equals(var7_7);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 4;
                                break;
                            }
                            case 1540: {
                                var28_33 = var1_1.equals(var8_8);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 3;
                                break;
                            }
                            case 1539: {
                                var28_33 = var1_1.equals(var9_9);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 2;
                                break;
                            }
                            case 1538: {
                                var28_33 = var1_1.equals(var10_10);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 1;
                                break;
                            }
                            case 1537: {
                                var28_33 = var1_1.equals(var11_11);
                                if (var28_33 == 0) ** GOTO lbl-1000
                                var29_35 = 0;
                                var16_16 /* !! */  = null;
                            }
                        }
                        switch (var29_35) {
                            default: {
                                ** continue;
                            }
                            case 12: {
                                var2_2 = var20_20;
                                break;
                            }
                            case 11: {
                                var2_2 = var19_19;
                                break;
                            }
                            case 10: {
                                var28_33 = 1024;
                                var2_2 = var28_33;
                                break;
                            }
                            case 9: {
                                var2_2 = var21_21;
                                break;
                            }
                            case 8: {
                                var2_2 = var22_22;
                                break;
                            }
                            case 7: {
                                var2_2 = var23_23;
                                break;
                            }
                            case 6: {
                                var2_2 = var24_24;
                                break;
                            }
                            case 5: {
                                var2_2 = var25_25;
                                break;
                            }
                            case 4: {
                                var28_33 = 16;
                                var2_2 = var28_33;
                                break;
                            }
                            case 3: {
                                var28_33 = 8;
                                var2_2 = var28_33;
                                break;
                            }
                            case 2: {
                                var28_33 = 4;
                                var2_2 = var28_33;
                                break;
                            }
                            case 1: {
                                var28_33 = 2;
                                var2_2 = var28_33;
                                break;
                            }
                            case 0: {
                                var2_2 = var13_13;
                            }
                        }
                    }
                    if (var2_2 != null) break block240;
                    var2_2 = "Unknown Dolby Vision level string: ";
                    KW.b((String)var2_2, (String)var1_1);
                    break block235;
                }
                var1_1 = new Pair(var14_14, var2_2);
lbl289:
                // 6 sources

                while (true) {
                    var15_15 /* !! */  = var1_1;
                    break block235;
                    break;
                }
            }
            var28_34 = 1024;
            var3_3 = null;
            var4_4 = var16_16 /* !! */ [0];
            var4_4.getClass();
            var30_41 = 16384;
            var31_42 = 20;
            var1_1 = var0.C;
            var32_43 = var4_4.hashCode();
            switch (var32_43) lbl-1000:
            // 9 sources

            {
                default: {
                    var33_44 = -1;
                    break;
                }
                case 3624515: {
                    var9_9 = "vp09";
                    var33_44 = (int)var4_4.equals(var9_9);
                    if (var33_44 == 0) ** GOTO lbl-1000
                    var33_44 = 7;
                    break;
                }
                case 3475740: {
                    var9_9 = "s263";
                    var33_44 = (int)var4_4.equals(var9_9);
                    if (var33_44 == 0) ** GOTO lbl-1000
                    var33_44 = 6;
                    break;
                }
                case 3356560: {
                    var9_9 = "mp4a";
                    var33_44 = (int)var4_4.equals(var9_9);
                    if (var33_44 == 0) ** GOTO lbl-1000
                    var33_44 = 5;
                    break;
                }
                case 3214780: {
                    var9_9 = "hvc1";
                    var33_44 = (int)var4_4.equals(var9_9);
                    if (var33_44 == 0) ** GOTO lbl-1000
                    var33_44 = 4;
                    break;
                }
                case 3199032: {
                    var9_9 = "hev1";
                    var33_44 = (int)var4_4.equals(var9_9);
                    if (var33_44 == 0) ** GOTO lbl-1000
                    var33_44 = 3;
                    break;
                }
                case 3006244: {
                    var9_9 = "avc2";
                    var33_44 = (int)var4_4.equals(var9_9);
                    if (var33_44 == 0) ** GOTO lbl-1000
                    var33_44 = 2;
                    break;
                }
                case 3006243: {
                    var9_9 = "avc1";
                    var33_44 = (int)var4_4.equals(var9_9);
                    if (var33_44 == 0) ** GOTO lbl-1000
                    var33_44 = 1;
                    break;
                }
                case 3004662: {
                    var9_9 = "av01";
                    var33_44 = (int)var4_4.equals(var9_9);
                    if (var33_44 == 0) ** GOTO lbl-1000
                    var33_44 = 0;
                    var4_4 = null;
                }
            }
            switch (var33_44) {
                default: {
                    break;
                }
                case 7: {
                    var26_27 = var16_16 /* !! */ .length;
                    var2_2 = "Ignoring malformed VP9 codec string: ";
                    var30_41 = 3;
                    if (var26_27 < var30_41) {
                        KW.b((String)var2_2, (String)var14_14);
                        break;
                    }
                    var1_1 = var16_16 /* !! */ [var13_13];
                    var26_27 = Integer.parseInt((String)var1_1);
                    var30_41 = 2;
                    var16_16 /* !! */  = var16_16 /* !! */ [var30_41];
                    try {
                        var28_34 = Integer.parseInt((String)var16_16 /* !! */ );
                        if (var26_27 == 0) ** GOTO lbl387
                        if (var26_27 == var13_13) ** GOTO lbl385
                        if (var26_27 == var30_41) ** GOTO lbl383
                        var29_36 = 3;
                        if (var26_27 == var29_36) ** GOTO lbl381
                        var29_36 = -1;
                    }
                    catch (NumberFormatException v0) {
                        KW.b((String)var2_2, (String)var14_14);
                        break;
                    }
lbl379:
                    // 5 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl381:
                    // 1 sources

                    var29_36 = 8;
                    ** GOTO lbl379
lbl383:
                    // 1 sources

                    var29_36 = 4;
                    ** GOTO lbl379
lbl385:
                    // 1 sources

                    var29_36 = 2;
                    ** GOTO lbl379
lbl387:
                    // 1 sources

                    var29_36 = 1;
                    ** continue;
                    var30_41 = -1;
                    if (var29_36 == var30_41) {
                        var2_2 = "Unknown VP9 profile: ";
                        CS1.a(var26_27, (String)var2_2);
                        break;
                    }
                    var26_27 = 10;
                    if (var28_34 != var26_27) {
                        var26_27 = 11;
                        if (var28_34 != var26_27) {
                            if (var28_34 != var31_42) {
                                var26_27 = 21;
                                if (var28_34 != var26_27) {
                                    var26_27 = 30;
                                    if (var28_34 != var26_27) {
                                        var26_27 = 31;
                                        if (var28_34 != var26_27) {
                                            var26_27 = 40;
                                            if (var28_34 != var26_27) {
                                                var26_27 = 41;
                                                if (var28_34 != var26_27) {
                                                    var26_27 = 50;
                                                    if (var28_34 != var26_27) {
                                                        var26_27 = 51;
                                                        if (var28_34 != var26_27) {
                                                            switch (var28_34) {
                                                                default: {
                                                                    var26_27 = -1;
                                                                    var18_18 = -1;
                                                                    break;
                                                                }
                                                                case 62: {
                                                                    var26_27 = -1;
                                                                    var18_18 = 8192;
                                                                    break;
                                                                }
                                                                case 61: {
                                                                    var26_27 = -1;
                                                                    var18_18 = 4096;
                                                                    break;
                                                                }
                                                                case 60: {
                                                                    var26_27 = -1;
                                                                    var18_18 = 2048;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            var26_27 = -1;
                                                            var18_18 = 512;
                                                        }
                                                    } else {
                                                        var26_27 = -1;
                                                        var18_18 = 256;
                                                    }
                                                } else {
                                                    var26_27 = -1;
                                                    var18_18 = 128;
                                                }
                                            } else {
                                                var26_27 = -1;
                                                var18_18 = 64;
                                            }
                                        } else {
                                            var26_27 = -1;
                                            var18_18 = 32;
                                        }
                                    } else {
                                        var26_27 = -1;
                                        var18_18 = 16;
                                    }
                                } else {
                                    var26_27 = -1;
                                    var18_18 = 8;
                                }
                            } else {
                                var26_27 = -1;
                                var18_18 = 4;
                            }
                        } else {
                            var26_27 = -1;
                            var18_18 = 2;
                        }
                    } else {
                        var26_27 = -1;
                        var18_18 = 1;
                    }
                    if (var18_18 == var26_27) {
                        var1_1 = "Unknown VP9 level: ";
                        CS1.a(var28_34, (String)var1_1);
                        break;
                    }
                    var2_2 = var29_36;
                    var16_16 /* !! */  = var18_18;
                    var1_1 = new Pair(var2_2, (Object)var16_16 /* !! */ );
                    ** GOTO lbl289
                }
                case 6: {
                    var2_2 = var13_13;
                    var1_1 = new Pair(var2_2, var2_2);
                    var28_34 = var16_16 /* !! */ .length;
                    var3_3 = "Ignoring malformed H263 codec string: ";
                    var33_44 = 3;
                    if (var28_34 >= var33_44) ** GOTO lbl480
                    KW.b((String)var3_3, (String)var14_14);
                    ** GOTO lbl289
lbl480:
                    // 1 sources

                    try {
                        var2_2 = var16_16 /* !! */ [var13_13];
                    }
                    catch (NumberFormatException v1) {
                        KW.b((String)var3_3, (String)var14_14);
                        ** GOTO lbl289
                    }
                    var28_34 = Integer.parseInt((String)var2_2);
                    var33_44 = 2;
                    var16_16 /* !! */  = var16_16 /* !! */ [var33_44];
                    var29_37 = Integer.parseInt((String)var16_16 /* !! */ );
                    var2_2 = var28_34;
                    var16_16 /* !! */  = var29_37;
                    var4_4 = new Pair(var2_2, (Object)var16_16 /* !! */ );
                    var15_15 /* !! */  = var4_4;
                    break;
                }
                case 5: {
                    var26_28 = var16_16 /* !! */ .length;
                    var2_2 = "Ignoring malformed MP4A codec string: ";
                    var30_41 = 3;
                    if (var26_28 != var30_41) {
                        KW.b((String)var2_2, (String)var14_14);
                        break;
                    }
                    try {
                        var1_1 = var16_16 /* !! */ [var13_13];
                        var30_41 = 16;
                    }
                    catch (NumberFormatException v2) {
                        KW.b((String)var2_2, (String)var14_14);
                        break;
                    }
                    var26_28 = Integer.parseInt((String)var1_1, var30_41);
                    var1_1 = ip1_0.d(var26_28);
                    var3_3 = "audio/mp4a-latm";
                    var26_28 = (int)var3_3.equals(var1_1);
                    if (var26_28 == 0) break;
                    var26_28 = 2;
                    var16_16 /* !! */  = var16_16 /* !! */ [var26_28];
                    var26_28 = Integer.parseInt((String)var16_16 /* !! */ );
                    var29_38 = 17;
                    if (var26_28 == var29_38) ** GOTO lbl582
                    if (var26_28 == var31_42) ** GOTO lbl579
                    var29_38 = 23;
                    if (var26_28 == var29_38) ** GOTO lbl576
                    var29_38 = 29;
                    if (var26_28 == var29_38) ** GOTO lbl573
                    var29_38 = 39;
                    if (var26_28 == var29_38) ** GOTO lbl570
                    var29_38 = 42;
                    if (var26_28 == var29_38) ** GOTO lbl567
                    switch (var26_28) {
                        default: {
                            var26_28 = -1;
                            var12_12 = -1;
                            break;
                        }
                        case 6: {
                            var26_28 = -1;
                            var12_12 = 6;
                            break;
                        }
                        case 5: {
                            var26_28 = -1;
                            var12_12 = 5;
                            break;
                        }
                        case 4: {
                            var26_28 = -1;
                            var12_12 = 4;
                            break;
                        }
                        case 3: {
                            var26_28 = -1;
                            var12_12 = 3;
                            break;
                        }
                        case 2: {
                            var26_28 = -1;
                            var12_12 = 2;
                            break;
                        }
                        case 1: {
                            var26_28 = -1;
                            var12_12 = 1;
                            break;
                        }
                    }
                    ** GOTO lbl584
lbl567:
                    // 1 sources

                    var26_28 = -1;
                    var12_12 = 42;
                    ** GOTO lbl584
lbl570:
                    // 1 sources

                    var26_28 = -1;
                    var12_12 = 39;
                    ** GOTO lbl584
lbl573:
                    // 1 sources

                    var26_28 = -1;
                    var12_12 = 29;
                    ** GOTO lbl584
lbl576:
                    // 1 sources

                    var26_28 = -1;
                    var12_12 = 23;
                    ** GOTO lbl584
lbl579:
                    // 1 sources

                    var26_28 = -1;
                    var12_12 = 20;
                    ** GOTO lbl584
lbl582:
                    // 1 sources

                    var26_28 = -1;
                    var12_12 = 17;
lbl584:
                    // 7 sources

                    if (var12_12 == var26_28) break;
                    var16_16 /* !! */  = var12_12;
                    var30_41 = 0;
                    var3_3 = null;
                    var3_3 = 0;
                    var1_1 = new Pair((Object)var16_16 /* !! */ , var3_3);
                    ** GOTO lbl289
                }
                case 3: 
                case 4: {
                    var15_15 /* !! */  = LW.b((String)var14_14, var16_16 /* !! */ , (VX)var1_1);
                    break;
                }
                case 1: 
                case 2: {
                    var26_29 = var16_16 /* !! */ .length;
                    var4_4 = "Ignoring malformed AVC codec string: ";
                    var31_42 = 2;
                    if (var26_29 < var31_42) {
                        KW.b(var4_4, (String)var14_14);
                        break;
                    }
                    var1_1 = var16_16 /* !! */ [var13_13];
                    var26_29 = var1_1.length();
                    var32_43 = 6;
                    if (var26_29 != var32_43) ** GOTO lbl627
                    var1_1 = var16_16 /* !! */ [var13_13];
                    var32_43 = 0;
                    var9_9 = null;
                    var1_1 = var1_1.substring(0, var31_42);
                    var31_42 = 16;
                    var26_29 = Integer.parseInt((String)var1_1, var31_42);
                    var16_16 /* !! */  = var16_16 /* !! */ [var13_13];
                    var32_43 = 4;
                    var16_16 /* !! */  = var16_16 /* !! */ .substring(var32_43);
                    var29_39 = Integer.parseInt((String)var16_16 /* !! */ , var31_42);
                    ** GOTO lbl641
lbl627:
                    // 1 sources

                    var31_42 = 16;
                    var26_29 = var16_16 /* !! */ .length;
                    var32_43 = 3;
                    if (var26_29 < var32_43) ** GOTO lbl762
                    var1_1 = var16_16 /* !! */ [var13_13];
                    var26_29 = Integer.parseInt((String)var1_1);
                    var32_43 = 2;
                    var16_16 /* !! */  = var16_16 /* !! */ [var32_43];
                    var29_39 = Integer.parseInt((String)var16_16 /* !! */ );
lbl641:
                    // 2 sources

                    var33_44 = 66;
                    if (var26_29 == var33_44) ** GOTO lbl670
                    var33_44 = 77;
                    if (var26_29 == var33_44) ** GOTO lbl668
                    var33_44 = 88;
                    if (var26_29 == var33_44) ** GOTO lbl666
                    var33_44 = 100;
                    if (var26_29 == var33_44) ** GOTO lbl664
                    var33_44 = 110;
                    if (var26_29 == var33_44) ** GOTO lbl662
                    var33_44 = 122;
                    if (var26_29 == var33_44) ** GOTO lbl660
                    var33_44 = 244;
                    if (var26_29 != var33_44) {
                        var33_44 = -1;
lbl656:
                        // 8 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var33_44 = 64;
                    ** GOTO lbl656
lbl660:
                    // 1 sources

                    var33_44 = 32;
                    ** GOTO lbl656
lbl662:
                    // 1 sources

                    var33_44 = 16;
                    ** GOTO lbl656
lbl664:
                    // 1 sources

                    var33_44 = 8;
                    ** GOTO lbl656
lbl666:
                    // 1 sources

                    var33_44 = 4;
                    ** GOTO lbl656
lbl668:
                    // 1 sources

                    var33_44 = 2;
                    ** GOTO lbl656
lbl670:
                    // 1 sources

                    var33_44 = 1;
                    ** continue;
                    var32_43 = -1;
                    if (var33_44 == var32_43) {
                        var2_2 = "Unknown AVC profile: ";
                        CS1.a(var26_29, (String)var2_2);
                        break;
                    }
                    block133 : switch (var29_39) {
                        default: {
                            switch (var29_39) {
                                default: {
                                    switch (var29_39) {
                                        default: {
                                            switch (var29_39) {
                                                default: {
                                                    switch (var29_39) {
                                                        default: {
                                                            var26_29 = -1;
                                                            var18_18 = -1;
                                                            break block133;
                                                        }
                                                        case 52: {
                                                            var26_29 = -1;
                                                            var18_18 = 65536;
                                                            break block133;
                                                        }
                                                        case 51: {
                                                            var26_29 = -1;
                                                            var18_18 = 32768;
                                                            break block133;
                                                        }
                                                        case 50: 
                                                    }
                                                    var26_29 = -1;
                                                    var18_18 = 16384;
                                                    break block133;
                                                }
                                                case 42: {
                                                    var26_29 = -1;
                                                    var18_18 = 8192;
                                                    break block133;
                                                }
                                                case 41: {
                                                    var26_29 = -1;
                                                    var18_18 = 4096;
                                                    break block133;
                                                }
                                                case 40: 
                                            }
                                            var26_29 = -1;
                                            var18_18 = 2048;
                                            break block133;
                                        }
                                        case 32: {
                                            var26_29 = -1;
                                            var18_18 = 1024;
                                            break block133;
                                        }
                                        case 31: {
                                            var26_29 = -1;
                                            var18_18 = 512;
                                            break block133;
                                        }
                                        case 30: 
                                    }
                                    var26_29 = -1;
                                    var18_18 = 256;
                                    break block133;
                                }
                                case 22: {
                                    var26_29 = -1;
                                    var18_18 = 128;
                                    break block133;
                                }
                                case 21: {
                                    var26_29 = -1;
                                    var18_18 = 64;
                                    break block133;
                                }
                                case 20: 
                            }
                            var26_29 = -1;
                            var18_18 = 32;
                            break;
                        }
                        case 13: {
                            var26_29 = -1;
                            var18_18 = 16;
                            break;
                        }
                        case 12: {
                            var26_29 = -1;
                            var18_18 = 8;
                            break;
                        }
                        case 11: {
                            var26_29 = -1;
                            var18_18 = 4;
                            break;
                        }
                        case 10: {
                            var26_29 = -1;
                            var18_18 = 1;
                        }
                    }
                    if (var18_18 == var26_29) {
                        var1_1 = "Unknown AVC level: ";
                        CS1.a(var29_39, (String)var1_1);
                        break;
                    }
                    var2_2 = var33_44;
                    var16_16 /* !! */  = var18_18;
                    var1_1 = new Pair(var2_2, (Object)var16_16 /* !! */ );
                    ** continue;
lbl762:
                    // 2 sources

                    var1_1 = new StringBuilder(var4_4);
                    var1_1.append((String)var14_14);
                    var1_1 = var1_1.toString();
                    try {
                        Cx.f((String)var1_1);
                    }
                    catch (NumberFormatException v3) {
                        KW.b(var4_4, (String)var14_14);
                    }
                    break;
                }
                case 0: {
                    var31_42 = 16;
                    var33_44 = var16_16 /* !! */ .length;
                    var9_9 = "Ignoring malformed AV1 codec string: ";
                    var34_45 = 4;
                    if (var33_44 < var34_45) {
                        KW.b(var9_9, (String)var14_14);
                        break;
                    }
                    var4_4 = var16_16 /* !! */ [var13_13];
                    var33_44 = Integer.parseInt(var4_4);
                    var18_18 = 2;
                    var11_11 = var16_16 /* !! */ [var18_18];
                    var12_12 = 0;
                    var27_32 = null;
                    var11_11 = var11_11.substring(0, var18_18);
                    var35_46 = Integer.parseInt(var11_11);
                    var12_12 = 3;
                    var16_16 /* !! */  = var16_16 /* !! */ [var12_12];
                    try {
                        var29_40 = Integer.parseInt((String)var16_16 /* !! */ );
                        if (var33_44 == 0) ** GOTO lbl803
                        var1_1 = "Unknown AV1 profile: ";
                    }
                    catch (NumberFormatException v4) {
                        KW.b(var9_9, (String)var14_14);
                    }
                    CS1.a(var33_44, (String)var1_1);
                    break;
lbl803:
                    // 1 sources

                    var33_44 = 8;
                    if (var29_40 != var33_44 && var29_40 != (var32_43 = 10)) {
                        var1_1 = "Unknown AV1 bit depth: ";
                        CS1.a(var29_40, (String)var1_1);
                        break;
                    }
                    var26_30 = var29_40 == var33_44 ? 1 : (var1_1 != null && ((var16_16 /* !! */  = (String[])var1_1.d) != null || (var26_30 = var1_1.c) == (var29_40 = 7) || var26_30 == (var29_40 = 6)) ? 4096 : 2);
                    switch (var35_46) {
                        default: {
                            var28_34 = -1;
                            var18_18 = -1;
                            break;
                        }
                        case 23: {
                            var18_18 = 0x800000;
                        }
lbl816:
                        // 8 sources

                        case 1: {
                            var28_34 = -1;
                            break;
                        }
                        case 22: {
                            var18_18 = 0x400000;
                            ** GOTO lbl816
                        }
                        case 21: {
                            var18_18 = 0x200000;
                            ** GOTO lbl816
                        }
                        case 20: {
                            var18_18 = 0x100000;
                            ** GOTO lbl816
                        }
                        case 19: {
                            var18_18 = 524288;
                            ** GOTO lbl816
                        }
                        case 18: {
                            var18_18 = 262144;
                            ** GOTO lbl816
                        }
                        case 17: {
                            var18_18 = 131072;
                            ** GOTO lbl816
                        }
                        case 16: {
                            var28_34 = -1;
                            var18_18 = 65536;
                            break;
                        }
                        case 15: {
                            var28_34 = -1;
                            var18_18 = 32768;
                            break;
                        }
                        case 14: {
                            var28_34 = -1;
                            var18_18 = 16384;
                            break;
                        }
                        case 13: {
                            var28_34 = -1;
                            var18_18 = 8192;
                            break;
                        }
                        case 12: {
                            var28_34 = -1;
                            var18_18 = 4096;
                            break;
                        }
                        case 11: {
                            var28_34 = -1;
                            var18_18 = 2048;
                            break;
                        }
                        case 10: {
                            var28_34 = -1;
                            var18_18 = 1024;
                            break;
                        }
                        case 9: {
                            var28_34 = -1;
                            var18_18 = 512;
                            break;
                        }
                        case 8: {
                            var28_34 = -1;
                            var18_18 = 256;
                            break;
                        }
                        case 7: {
                            var28_34 = -1;
                            var18_18 = 128;
                            break;
                        }
                        case 6: {
                            var28_34 = -1;
                            var18_18 = 64;
                            break;
                        }
                        case 5: {
                            var28_34 = -1;
                            var18_18 = 32;
                            break;
                        }
                        case 4: {
                            var28_34 = -1;
                            var18_18 = 16;
                            break;
                        }
                        case 3: {
                            var28_34 = -1;
                            var18_18 = 8;
                            break;
                        }
                        case 2: {
                            var28_34 = -1;
                            var18_18 = 4;
                            break;
                        }
                        case 0: {
                            var28_34 = -1;
                            var18_18 = 1;
                        }
                    }
                    if (var18_18 == var28_34) {
                        var1_1 = "Unknown AV1 level: ";
                        CS1.a(var35_46, (String)var1_1);
                        break;
                    }
                    var1_1 = var26_30;
                    var16_16 /* !! */  = var18_18;
                    var2_2 = new Pair(var1_1, (Object)var16_16 /* !! */ );
                    var15_15 /* !! */  = var2_2;
                    break;
                }
            }
        }
        return var15_15 /* !! */ ;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List e(String object, boolean n3, boolean bl2) {
        Object object2 = "MediaCodecList API didn't list secure decoder for: ";
        Class<MediaCodecUtil> clazz = MediaCodecUtil.class;
        synchronized (clazz) {
            Throwable throwable2;
            block6: {
                Object object3;
                int n4;
                Object object4;
                HashMap hashMap;
                MediaCodecUtil$a mediaCodecUtil$a;
                block5: {
                    try {
                        mediaCodecUtil$a = new MediaCodecUtil$a((String)object, n3 != 0, bl2);
                        hashMap = a;
                        object4 = hashMap.get(mediaCodecUtil$a);
                        object4 = (List)object4;
                        if (object4 == null) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return object4;
                }
                object4 = new Object(n3 != 0, bl2);
                ArrayList arrayList = MediaCodecUtil.f(mediaCodecUtil$a, object4);
                if (n3 != 0 && (n3 = arrayList.isEmpty()) != 0 && (n3 = gz3.a) <= (n4 = 23) && (n3 = (int)((arrayList = MediaCodecUtil.f(mediaCodecUtil$a, (MediaCodecUtil$b)(object3 = new Object()))).isEmpty() ? 1 : 0)) == 0) {
                    object3 = new StringBuilder((String)object2);
                    ((StringBuilder)object3).append((String)object);
                    object2 = ". Assuming: ";
                    ((StringBuilder)object3).append((String)object2);
                    object2 = null;
                    object2 = arrayList.get(0);
                    object2 = (e)object2;
                    object2 = ((e)object2).a;
                    ((StringBuilder)object3).append((String)object2);
                    object3 = ((StringBuilder)object3).toString();
                    Cx.f((String)object3);
                }
                MediaCodecUtil.a((String)object, arrayList);
                object = ImmutableList.copyOf((Collection)arrayList);
                hashMap.put(mediaCodecUtil$a, object);
                return object;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList f(MediaCodecUtil$a var0, MediaCodecUtil$b var1_1) {
        block19: {
            block24: {
                block22: {
                    block21: {
                        block23: {
                            block20: {
                                block18: {
                                    block17: {
                                        var2_2 = var0;
                                        var3_3 = var1_1;
                                        var4_4 = "secure-playback";
                                        var5_5 = "tunneled-playback";
                                        try {
                                            var6_6 = new ArrayList<Object>();
                                            var7_7 = var0.a;
                                            var8_8 = var1_1.d();
                                            var9_9 = var1_1.e();
                                            var10_10 = false;
lbl11:
                                            // 2 sources

                                            while (var10_10 < var8_8) {
                                                var11_11 = var3_3.a((int)var10_10);
                                                var12_17 = gz3.a;
                                                var13_18 = 29 != 0;
                                                if ((var12_17 < var13_18 || !(var14_19 = SL1.a((MediaCodecInfo)var11_11))) && (var14_19 = MediaCodecUtil.h((MediaCodecInfo)var11_11, var17_22 = var11_11.getName(), var9_9, var7_7)) && (var18_23 = MediaCodecUtil.c((MediaCodecInfo)var11_11, var17_22, var7_7)) != null) break block17;
                                                break block18;
                                            }
                                            return var6_6;
                                        }
                                        catch (Exception var11_16) {
                                            break block19;
                                        }
                                    }
                                    try {
                                        var19_24 = var11_11.getCapabilitiesForType(var18_23);
                                        var14_19 = var3_3.b(var5_5, var18_23, var19_24);
                                        var20_25 = var3_3.c(var5_5, var19_24);
                                        var13_18 = var2_2.c;
                                        if (!var13_18 && var20_25 || var13_18 && !var14_19) break block18;
                                        var13_18 = var3_3.b(var4_4, var18_23, var19_24);
                                        var14_19 = var3_3.c(var4_4, var19_24);
                                        break block20;
                                    }
                                    catch (Exception var11_15) {
                                        var26_31 = var18_23;
                                        var2_2 = var17_22;
                                        var15_20 = var10_10;
                                        var16_21 = var9_9;
                                        break block21;
                                    }
                                }
lbl37:
                                // 2 sources

                                while (true) {
                                    var15_20 = var10_10;
                                    var16_21 = var9_9;
                                    break block22;
                                    break;
                                }
                            }
                            ** while (!(var21_26 = (boolean)var2_2.b) && var14_19 || var21_26 && !var13_18)
lbl43:
                            // 1 sources

                            var14_19 = 29 != 0;
                            if (var12_17 < var14_19) ** GOTO lbl48
                            {
                                var22_27 = var14_19 = (boolean)QL1.a((MediaCodecInfo)var11_11);
                                var20_25 = true;
                                ** GOTO lbl-1000
lbl48:
                                // 1 sources

                                var14_19 = MediaCodecUtil.i((MediaCodecInfo)var11_11, var7_7);
                                var20_25 = true;
                                var22_27 = var14_19 ^= 1;
                            }
lbl-1000:
                            // 2 sources

                            {
                                var23_28 = MediaCodecUtil.i((MediaCodecInfo)var11_11, var7_7);
                                var14_19 = 29 != 0;
                                if (var12_17 >= var14_19) {
                                    var24_29 = RL1.a((MediaCodecInfo)var11_11);
                                } else {
                                    var11_11 = var11_11.getName();
                                    var12_17 = (var11_11 = Ascii.toLowerCase((String)var11_11)).startsWith(var25_30 = "omx.google.");
                                    var14_19 = var12_17 == false && (var12_17 = (boolean)var11_11.startsWith(var25_30 = "c2.android.")) == false && (var24_29 = (boolean)var11_11.startsWith(var25_30 = "c2.google.")) == false;
                                    var24_29 = var14_19;
                                }
                                if ((!var9_9 || var21_26 != var13_18) && (var9_9 || var21_26)) break block23;
                                var21_26 = false;
                                var3_3 = null;
                                var25_30 = var17_22;
                                var26_31 = var18_23;
                                var27_32 = var17_22;
                                var15_20 = var10_10;
                                var10_10 = var24_29;
                                var16_21 = var9_9;
                                var9_9 = false;
                                var28_33 = null;
                            }
                            try {
                                var11_11 = e.h(var17_22, var7_7, var18_23, var19_24, var22_27, var23_28, var24_29, false);
                                var6_6.add(var11_11);
                                break block22;
                            }
                            catch (Exception var11_12) {
                                var2_2 = var27_32;
                                break block21;
                            }
                        }
                        var26_31 = var18_23;
                        var27_32 = var17_22;
                        var15_20 = var10_10;
                        var16_21 = var9_9;
                        if (var9_9 || !var13_18) break block22;
                        var3_3 = new StringBuilder();
                        var28_33 = var17_22;
                        try {
                            var3_3.append(var17_22);
                            var25_30 = ".secure";
                            var3_3.append(var25_30);
                            var25_30 = var3_3.toString();
                            var21_26 = true;
                            var10_10 = var24_29;
                            var2_2 = var17_22;
                            var9_9 = var21_26;
                        }
                        catch (Exception var11_14) {
                            var2_2 = var28_33;
                            break block21;
                        }
                        try {
                            var11_11 = e.h(var25_30, var7_7, var18_23, var19_24, var22_27, var23_28, var24_29, var21_26);
                            var6_6.add(var11_11);
                            return var6_6;
                        }
                        catch (Exception var11_13) {}
                    }
                    var21_26 = gz3.a;
                    var12_17 = 23 != 0;
                    if (var21_26 > var12_17 || (var21_26 = (boolean)var6_6.isEmpty())) break block24;
                    var11_11 = new StringBuilder();
                    var3_3 = "Skipping codec ";
                    var11_11.append((String)var3_3);
                    var11_11.append((String)var2_2);
                    var2_2 = " (failed to query capabilities)";
                    var11_11.append((String)var2_2);
                    var11_11 = var11_11.toString();
                    Cx.c((String)var11_11);
                }
                var10_10 = var15_20 + 1;
                var2_2 = var0;
                var3_3 = var1_1;
                var9_9 = var16_21;
                ** GOTO lbl11
            }
            var3_3 = new StringBuilder();
            var4_4 = "Failed to query codec ";
            var3_3.append(var4_4);
            var3_3.append((String)var2_2);
            var2_2 = " (";
            var3_3.append((String)var2_2);
            var2_2 = var26_31;
            var3_3.append(var26_31);
            var2_2 = ")";
            var3_3.append((String)var2_2);
            var2_2 = var3_3.toString();
            Cx.c((String)var2_2);
            throw var11_11;
        }
        var2_2 = new Exception("Failed to query underlying media codecs", var11_16);
        throw var2_2;
    }

    public static ImmutableList g(g object, d object2, boolean bl2, boolean bl3) {
        Object object3 = ((d)object2).o;
        object3 = object.a((String)object3, bl2, bl3);
        object = (object2 = MediaCodecUtil.b((d)object2)) == null ? ImmutableList.of() : object.a((String)object2, bl2, bl3);
        return ((ImmutableList$Builder)((ImmutableList$Builder)ImmutableList.builder().addAll((Iterable)object3)).addAll((Iterable)object)).build();
    }

    public static boolean h(MediaCodecInfo object, String string2, boolean n3, String string3) {
        int n4 = object.isEncoder();
        if (n4 == 0 && (n3 != 0 || (n4 = (int)(string2.endsWith((String)(object = ".secure")) ? 1 : 0)) == 0)) {
            boolean bl2;
            String string4;
            String string5;
            n4 = gz3.a;
            n3 = 24;
            if (n4 < n3 && ((n3 = (int)((string5 = "OMX.SEC.aac.dec").equals(string2) ? 1 : 0)) != 0 || (n3 = (int)((string5 = "OMX.Exynos.AAC.Decoder").equals(string2) ? 1 : 0)) != 0) && (n3 = (int)((string5 = "samsung").equals(string4 = gz3.c) ? 1 : 0)) != 0 && ((bl2 = (string5 = gz3.b).startsWith(string4 = "zeroflte")) || (bl2 = string5.startsWith(string4 = "zerolte")) || (bl2 = string5.startsWith(string4 = "zenlte")) || (bl2 = (string4 = "SC-05G").equals(string5)) || (bl2 = (string4 = "marinelteatt").equals(string5)) || (bl2 = (string4 = "404SC").equals(string5)) || (bl2 = (string4 = "SC-04G").equals(string5)) || (n3 = (int)((string4 = "SCV31").equals(string5) ? 1 : 0)) != 0)) {
                return false;
            }
            n3 = 23;
            return n4 > n3 || (n4 = (int)(((String)(object = "audio/eac3-joc")).equals(string3) ? 1 : 0)) == 0 || (n4 = (int)(((String)(object = "OMX.MTK.AUDIO.DECODER.DSPAC3")).equals(string2) ? 1 : 0)) == 0;
        }
        return false;
    }

    public static boolean i(MediaCodecInfo object, String string2) {
        boolean bl2;
        int n3 = gz3.a;
        int n4 = 29;
        if (n3 >= n4) {
            return PL1.a((MediaCodecInfo)object);
        }
        boolean bl3 = ip1_0.h(string2);
        n3 = 1;
        if (bl3) {
            return n3 != 0;
        }
        object = Ascii.toLowerCase(object.getName());
        string2 = "arc.";
        bl3 = ((String)object).startsWith(string2);
        n4 = 0;
        if (bl3) {
            return false;
        }
        string2 = "omx.google.";
        bl3 = ((String)object).startsWith(string2);
        if (!(bl3 || (bl3 = ((String)object).startsWith(string2 = "omx.ffmpeg.")) || (bl3 = ((String)object).startsWith(string2 = "omx.sec.")) && (bl3 = ((String)object).contains(string2 = ".sw.")) || (bl3 = ((String)object).equals(string2 = "omx.qcom.video.decoder.hevcswvdec")) || (bl3 = ((String)object).startsWith(string2 = "c2.android.")) || (bl3 = ((String)object).startsWith(string2 = "c2.google.")) || !(bl3 = ((String)object).startsWith(string2 = "omx.")) && !(bl2 = ((String)object).startsWith(string2 = "c2.")))) {
            n3 = 0;
        }
        return n3 != 0;
    }
}

