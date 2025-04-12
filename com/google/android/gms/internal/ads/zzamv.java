/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 *  org.xmlpull.v1.XmlPullParserFactory
 */
package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzalq;
import com.google.android.gms.internal.ads.zzalr;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzamr;
import com.google.android.gms.internal.ads.zzamt;
import com.google.android.gms.internal.ads.zzamy;
import com.google.android.gms.internal.ads.zzet;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzgd;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class zzamv
implements zzalv {
    static final Pattern zza;
    static final Pattern zzb;
    private static final Pattern zzc;
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;
    private static final Pattern zzg;
    private static final zzamt zzh;
    private final XmlPullParserFactory zzi;

    static {
        zzamt zzamt2;
        zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
        zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
        zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
        zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
        zzb = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
        zzf = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
        zzg = Pattern.compile("^(\\d+) (\\d+)$");
        int n3 = 1;
        zzh = zzamt2 = new zzamt(30.0f, n3, n3);
    }

    public zzamv() {
        XmlPullParserFactory xmlPullParserFactory;
        try {
            xmlPullParserFactory = XmlPullParserFactory.newInstance();
        }
        catch (XmlPullParserException xmlPullParserException) {
            RuntimeException runtimeException = new RuntimeException("Couldn't create XmlPullParserFactory instance", xmlPullParserException);
            throw runtimeException;
        }
        this.zzi = xmlPullParserFactory;
        boolean bl2 = true;
        xmlPullParserFactory.setNamespaceAware(bl2);
    }

    /*
     * Unable to fully structure code
     */
    private static long zzc(String var0, zzamt var1_1) {
        block12: {
            block11: {
                block19: {
                    block20: {
                        block21: {
                            block22: {
                                block18: {
                                    block13: {
                                        block14: {
                                            block15: {
                                                block16: {
                                                    block17: {
                                                        var2_2 = zzamv.zzc.matcher(var0);
                                                        var3_3 = var2_2.matches();
                                                        var4_4 = 1000000.0;
                                                        var6_5 = 5;
                                                        var7_6 = 4;
                                                        var8_7 = 3;
                                                        var9_8 = 2;
                                                        var10_9 = 1;
                                                        if (var3_3 != 0) {
                                                            var0 = var2_2.group(var10_9);
                                                            var0.getClass();
                                                            var11_10 = Long.parseLong(var0);
                                                            var13_11 = 3600L;
                                                            var0 = var2_2.group(var9_8);
                                                            var0.getClass();
                                                            var15_12 = var11_10 *= var13_11;
                                                            var17_13 = Long.parseLong(var0);
                                                            var19_14 = 60;
                                                            var21_15 = 2.96E-322;
                                                            var0 = var2_2.group(var8_7);
                                                            var0.getClass();
                                                            var23_16 = var17_13 *= var19_14;
                                                            var15_12 += var23_16;
                                                            var17_13 = Long.parseLong(var0);
                                                            var23_16 = var17_13;
                                                            var0 = var2_2.group(var7_6);
                                                            var25_18 = 0L;
                                                            var27_19 = 0.0;
                                                            if (var0 != null) {
                                                                var21_15 = Double.parseDouble(var0);
                                                            } else {
                                                                var19_14 = var25_18;
                                                                var21_15 = var27_19;
                                                            }
                                                            var15_12 += var23_16;
                                                            var0 = var2_2.group(var6_5);
                                                            if (var0 != null) {
                                                                var17_13 = Long.parseLong(var0);
                                                                var29_20 = var17_13;
                                                                var30_22 = var1_1.zza;
                                                                var23_16 = var29_20 /= var30_22;
                                                            } else {
                                                                var17_13 = var25_18;
                                                                var23_16 = var27_19;
                                                            }
                                                            var15_12 += var21_15;
                                                            var31_24 = 6;
                                                            var29_20 = 8.4E-45f;
                                                            var0 = var2_2.group(var31_24);
                                                            if (var0 != null) {
                                                                var32_26 = Long.parseLong(var0);
                                                                var34_27 = var32_26;
                                                                var31_24 = var1_1.zzb;
                                                                var36_28 = var31_24;
                                                                var29_20 = var1_1.zza;
                                                                var38_29 = var29_20;
                                                                var27_19 = (var34_27 /= var36_28) / var38_29;
                                                            }
                                                            return (long)((var15_12 + var23_16 + var27_19) * var4_4);
                                                        }
                                                        var2_2 = zzamv.zzd.matcher(var0);
                                                        var3_3 = var2_2.matches();
                                                        if (var3_3 == 0) break block12;
                                                        var0 = var2_2.group(var10_9);
                                                        var0.getClass();
                                                        var23_17 = Double.parseDouble(var0);
                                                        var0 = var2_2.group(var9_8);
                                                        var0.getClass();
                                                        var40_32 = var0.hashCode();
                                                        var3_3 = 102;
                                                        var30_23 = 1.43E-43f;
                                                        if (var40_32 == var3_3) break block13;
                                                        var3_3 = 104;
                                                        var30_23 = 1.46E-43f;
                                                        if (var40_32 == var3_3) break block14;
                                                        var3_3 = 109;
                                                        var30_23 = 1.53E-43f;
                                                        if (var40_32 == var3_3) break block15;
                                                        var3_3 = 3494;
                                                        var30_23 = 4.896E-42f;
                                                        if (var40_32 == var3_3) break block16;
                                                        var3_3 = 115;
                                                        var30_23 = 1.61E-43f;
                                                        if (var40_32 == var3_3) break block17;
                                                        var3_3 = 116;
                                                        var30_23 = 1.63E-43f;
                                                        if (var40_32 != var3_3 || (var31_25 = (int)var0.equals(var2_2 = "t")) == 0) ** GOTO lbl-1000
                                                        var9_8 = 5;
                                                        break block18;
                                                    }
                                                    var2_2 = "s";
                                                    var31_25 = (int)var0.equals(var2_2);
                                                    if (var31_25 == 0) ** GOTO lbl-1000
                                                    break block18;
                                                }
                                                var2_2 = "ms";
                                                var31_25 = var0.equals(var2_2);
                                                if (var31_25 == 0) ** GOTO lbl-1000
                                                var9_8 = 3;
                                                break block18;
                                            }
                                            var2_2 = "m";
                                            var31_25 = var0.equals(var2_2);
                                            if (var31_25 == 0) ** GOTO lbl-1000
                                            var9_8 = 1;
                                            break block18;
                                        }
                                        var2_2 = "h";
                                        var31_25 = var0.equals(var2_2);
                                        if (var31_25 == 0) ** GOTO lbl-1000
                                        var9_8 = 0;
                                        break block18;
                                    }
                                    var2_2 = "f";
                                    var31_25 = var0.equals(var2_2);
                                    if (var31_25 != 0) {
                                        var9_8 = 4;
                                    } else lbl-1000:
                                    // 6 sources

                                    {
                                        var9_8 = -1;
                                    }
                                }
                                if (var9_8 == 0) break block19;
                                if (var9_8 == var10_9) break block20;
                                if (var9_8 == var8_7) break block21;
                                if (var9_8 == var7_6) break block22;
                                if (var9_8 == var6_5) {
                                    var31_25 = var1_1.zzc;
                                    var38_30 = var31_25;
lbl129:
                                    // 3 sources

                                    while (true) {
                                        var23_17 /= var38_30;
                                        ** GOTO lbl148
                                        break;
                                    }
                                }
                                break block11;
                            }
                            var29_21 = var1_1.zza;
                            var38_30 = var29_21;
                            ** GOTO lbl129
                        }
                        var38_30 = 1000.0;
                        ** while (true)
                    }
                    var38_31 = 60.0;
lbl142:
                    // 2 sources

                    while (true) {
                        var23_17 *= var38_31;
                        break block11;
                        break;
                    }
                }
                var38_31 = 3600.0;
                ** while (true)
            }
            return (long)(var23_17 * var4_4);
        }
        var0 = String.valueOf(var0);
        var0 = "Malformed time expression: ".concat(var0);
        var1_1 = new zzalr(var0);
        throw var1_1;
    }

    private static Layout.Alignment zzd(String string2) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        block10: {
            string2 = zzfxm.zza(string2);
            int n14 = string2.hashCode();
            n10 = 4;
            n8 = 3;
            n7 = 2;
            n4 = 1;
            switch (n14) {
                default: {
                    break;
                }
                case 109757538: {
                    String string3 = "start";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block10;
                }
                case 108511772: {
                    String string4 = "right";
                    n3 = (int)(string2.equals(string4) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block10;
                }
                case 3317767: {
                    String string5 = "left";
                    n3 = (int)(string2.equals(string5) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 0;
                    string2 = null;
                    break block10;
                }
                case 100571: {
                    String string6 = "end";
                    n3 = (int)(string2.equals(string6) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block10;
                }
                case -1364013995: {
                    String string7 = "center";
                    n3 = (int)(string2.equals(string7) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 4;
                    break block10;
                }
            }
            n3 = -1;
        }
        if (n3 != 0 && n3 != n4) {
            if (n3 != n7 && n3 != n8) {
                if (n3 != n10) {
                    return null;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private static zzamy zze(zzamy zzamy2) {
        if (zzamy2 == null) {
            zzamy2 = new zzamy();
        }
        return zzamy2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzamy zzf(XmlPullParser var0, zzamy var1_1) {
        var2_2 = var0;
        var3_3 = 1;
        var4_4 = var0.getAttributeCount();
        var5_5 = 0;
        var6_6 = 0.0f;
        var7_7 = null;
        var8_8 = var1_1;
        var9_10 = 0;
        block57: while (true) {
            block85: {
                if (var9_10 >= var4_4) {
                    return var8_8;
                }
                var10_11 = var2_2.getAttributeValue(var9_10);
                var11_12 = var2_2.getAttributeName(var9_10);
                var12_13 = var11_12.hashCode();
                var13_14 = 5;
                var14_15 = 4;
                var15_16 = 5.6E-45f;
                var16_17 = -1;
                var17_18 = 3;
                var18_19 = 2;
                switch (var12_13) {
                    default: {
                        break;
                    }
                    case 1754920356: {
                        var19_20 = "multiRowAlign";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 8;
                        break block85;
                    }
                    case 1287124693: {
                        var19_20 = "backgroundColor";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 1;
                        break block85;
                    }
                    case 1115953443: {
                        var19_20 = "rubyPosition";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 11;
                        break block85;
                    }
                    case 921125321: {
                        var19_20 = "textEmphasis";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 13;
                        break block85;
                    }
                    case 365601008: {
                        var19_20 = "fontSize";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 4;
                        break block85;
                    }
                    case 110138194: {
                        var19_20 = "textCombine";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 9;
                        break block85;
                    }
                    case 109403361: {
                        var19_20 = "shear";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 14;
                        break block85;
                    }
                    case 94842723: {
                        var19_20 = "color";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 2;
                        break block85;
                    }
                    case 3511770: {
                        var19_20 = "ruby";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 10;
                        break block85;
                    }
                    case 3355: {
                        var19_20 = "id";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 0;
                        var11_12 = null;
                        break block85;
                    }
                    case -734428249: {
                        var19_20 = "fontWeight";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 5;
                        break block85;
                    }
                    case -879295043: {
                        var19_20 = "textDecoration";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 12;
                        break block85;
                    }
                    case -1065511464: {
                        var19_20 = "textAlign";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 7;
                        break block85;
                    }
                    case -1224696685: {
                        var19_20 = "fontFamily";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 3;
                        break block85;
                    }
                    case -1550943582: {
                        var19_20 = "fontStyle";
                        var20_21 = (int)var11_12.equals(var19_20);
                        if (var20_21 == 0) break;
                        var20_21 = 6;
                        break block85;
                    }
                }
                var20_21 = -1;
            }
            var12_13 = 0;
            var21_22 = 0.0f;
            var19_20 = null;
            var22_23 = "TtmlParser";
            switch (var20_21) {
                default: {
                    ** GOTO lbl380
                }
                case 14: {
                    var11_12 = zzamv.zze((zzamy)var8_8);
                    var8_8 = zzamv.zza.matcher((CharSequence)var10_11);
                    var13_14 = (int)var8_8.matches();
                    var14_15 = 0x7F7FFFFF;
                    var15_16 = 3.4028235E38f;
                    if (var13_14 != 0) ** GOTO lbl134
                    var8_8 = "Invalid value for shear: ";
                    LO1.c((String)var10_11, (String)var8_8, var22_23);
                    ** GOTO lbl151
lbl134:
                    // 1 sources

                    try {
                        var8_8 = var8_8.group(var3_3);
                        if (var8_8 == null) {
                            throw null;
                        }
                        var23_24 = Float.parseFloat((String)var8_8);
                        var12_13 = -1027080192;
                        var21_22 = -100.0f;
                        var23_24 = Math.max(var21_22, var23_24);
                        var12_13 = 1120403456;
                        var21_22 = 100.0f;
                        var15_16 = Math.min(var21_22, var23_24);
                        ** GOTO lbl151
                    }
                    catch (NumberFormatException var8_9) {}
                    var10_11 = String.valueOf(var10_11);
                    var19_20 = "Failed to parse shear: ";
                    var10_11 = var19_20.concat((String)var10_11);
                    zzfk.zzg(var22_23, (String)var10_11, var8_9);
lbl151:
                    // 3 sources

                    var11_12.zzy(var15_16);
                    var8_8 = var11_12;
                    ** GOTO lbl380
                }
                case 13: {
                    var8_8 = zzamv.zze((zzamy)var8_8);
                    var10_11 = zzamr.zza((String)var10_11);
                    var8_8.zzB((zzamr)var10_11);
                    ** GOTO lbl380
                }
                case 12: {
                    var10_11 = zzfxm.zza((String)var10_11);
                    var20_21 = var10_11.hashCode();
                    switch (var20_21) {
                        default: {
                            break;
                        }
                        case 1679736913: {
                            var11_12 = "linethrough";
                            var24_25 = var10_11.equals(var11_12);
                            if (!var24_25) break;
                            var16_17 = 0;
                            break;
                        }
                        case 913457136: {
                            var11_12 = "nolinethrough";
                            var24_25 = var10_11.equals(var11_12);
                            if (!var24_25) break;
                            var16_17 = 1;
                            break;
                        }
                        case -1026963764: {
                            var11_12 = "underline";
                            var24_25 = var10_11.equals(var11_12);
                            if (!var24_25) break;
                            var16_17 = 2;
                            break;
                        }
                        case -1461280213: {
                            var11_12 = "nounderline";
                            var24_25 = var10_11.equals(var11_12);
                            if (!var24_25) break;
                            var16_17 = 3;
                        }
                    }
                    if (var16_17 == 0) ** GOTO lbl206
                    if (var16_17 == var3_3) ** GOTO lbl202
                    if (var16_17 != var18_19) {
                        if (var16_17 == var17_18) {
                            var8_8 = zzamv.zze((zzamy)var8_8);
                            var8_8.zzC(false);
                        }
                    } else {
                        var8_8 = zzamv.zze((zzamy)var8_8);
                        var8_8.zzC((boolean)var3_3);
                    }
                    ** GOTO lbl380
lbl202:
                    // 1 sources

                    var8_8 = zzamv.zze((zzamy)var8_8);
                    var8_8.zzu(false);
                    ** GOTO lbl380
lbl206:
                    // 1 sources

                    var8_8 = zzamv.zze((zzamy)var8_8);
                    var8_8.zzu((boolean)var3_3);
                    ** GOTO lbl380
                }
                case 11: {
                    var10_11 = zzfxm.zza((String)var10_11);
                    var20_21 = var10_11.hashCode();
                    var12_13 = -1392885889;
                    var21_22 = -7.112477E-12f;
                    if (var20_21 != var12_13) {
                        var12_13 = 92734940;
                        var21_22 = 1.2697491E-35f;
                        if (var20_21 == var12_13 && (var24_25 = var10_11.equals(var11_12 = "after"))) {
                            var16_17 = 1;
                        }
                    } else {
                        var11_12 = "before";
                        var24_25 = var10_11.equals(var11_12);
                        if (var24_25) {
                            var16_17 = 0;
                        }
                    }
                    if (var16_17 != 0) {
                        if (var16_17 == var3_3) {
                            var8_8 = zzamv.zze((zzamy)var8_8);
                            var8_8.zzw(var18_19);
                        }
                    } else {
                        var8_8 = zzamv.zze((zzamy)var8_8);
                        var8_8.zzw(var3_3);
                    }
                    ** GOTO lbl380
                }
                case 10: {
                    var10_11 = zzfxm.zza((String)var10_11);
                    var20_21 = var10_11.hashCode();
                    switch (var20_21) {
                        default: {
                            break;
                        }
                        case 3556653: {
                            var11_12 = "text";
                            var24_25 = var10_11.equals(var11_12);
                            if (!var24_25) break;
                            var16_17 = 3;
                            break;
                        }
                        case 3016401: {
                            var11_12 = "base";
                            var24_25 = var10_11.equals(var11_12);
                            if (!var24_25) break;
                            var16_17 = 1;
                            break;
                        }
                        case -136074796: {
                            var11_12 = "textContainer";
                            var24_25 = var10_11.equals(var11_12);
                            if (!var24_25) break;
                            var16_17 = 4;
                            break;
                        }
                        case -250518009: {
                            var11_12 = "delimiter";
                            var24_25 = var10_11.equals(var11_12);
                            if (!var24_25) break;
                            var16_17 = 5;
                            break;
                        }
                        case -410956671: {
                            var11_12 = "container";
                            var24_25 = var10_11.equals(var11_12);
                            if (!var24_25) break;
                            var16_17 = 0;
                            break;
                        }
                        case -618561360: {
                            var11_12 = "baseContainer";
                            var24_25 = var10_11.equals(var11_12);
                            if (!var24_25) break;
                            var16_17 = 2;
                        }
                    }
                    if (var16_17 == 0) ** GOTO lbl292
                    if (var16_17 == var3_3 || var16_17 == var18_19) ** GOTO lbl288
                    if (var16_17 != var17_18 && var16_17 != var14_15) {
                        if (var16_17 == var13_14) {
                            var8_8 = zzamv.zze((zzamy)var8_8);
                            var8_8.zzx(var14_15);
                        }
                    } else {
                        var8_8 = zzamv.zze((zzamy)var8_8);
                        var8_8.zzx(var17_18);
                    }
                    ** GOTO lbl380
lbl288:
                    // 1 sources

                    var8_8 = zzamv.zze((zzamy)var8_8);
                    var8_8.zzx(var18_19);
                    ** GOTO lbl380
lbl292:
                    // 1 sources

                    var8_8 = zzamv.zze((zzamy)var8_8);
                    var8_8.zzx(var3_3);
                    ** GOTO lbl380
                }
                case 9: {
                    var10_11 = zzfxm.zza((String)var10_11);
                    var20_21 = var10_11.hashCode();
                    var12_13 = 96673;
                    var21_22 = 1.35468E-40f;
                    if (var20_21 != var12_13) {
                        var12_13 = 3387192;
                        var21_22 = 4.746467E-39f;
                        if (var20_21 == var12_13 && (var24_25 = var10_11.equals(var11_12 = "none"))) {
                            var16_17 = 0;
                        }
                    } else {
                        var11_12 = "all";
                        var24_25 = var10_11.equals(var11_12);
                        if (var24_25) {
                            var16_17 = 1;
                        }
                    }
                    if (var16_17 != 0) {
                        if (var16_17 == var3_3) {
                            var8_8 = zzamv.zze((zzamy)var8_8);
                            var8_8.zzA((boolean)var3_3);
                        }
                    } else {
                        var8_8 = zzamv.zze((zzamy)var8_8);
                        var8_8.zzA(false);
                    }
                    ** GOTO lbl380
                }
                case 8: {
                    var8_8 = zzamv.zze((zzamy)var8_8);
                    var10_11 = zzamv.zzd((String)var10_11);
                    var8_8.zzv((Layout.Alignment)var10_11);
                    ** GOTO lbl380
                }
                case 7: {
                    var8_8 = zzamv.zze((zzamy)var8_8);
                    var10_11 = zzamv.zzd((String)var10_11);
                    var8_8.zzz((Layout.Alignment)var10_11);
                    ** GOTO lbl380
                }
                case 6: {
                    var8_8 = zzamv.zze((zzamy)var8_8);
                    var11_12 = "italic";
                    var24_25 = var11_12.equalsIgnoreCase((String)var10_11);
                    var8_8.zzt(var24_25);
                    ** GOTO lbl380
                }
                case 5: {
                    var8_8 = zzamv.zze((zzamy)var8_8);
                    var11_12 = "bold";
                    var24_25 = var11_12.equalsIgnoreCase((String)var10_11);
                    var8_8.zzn(var24_25);
                    ** GOTO lbl380
                }
                case 4: {
                    try {
                        var8_8 = zzamv.zze((zzamy)var8_8);
                        var11_12 = "\\s+";
                        var13_14 = zzgd.zza;
                        var11_12 = var10_11.split((String)var11_12, var16_17);
                        var13_14 = ((String[])var11_12).length;
                        if (var13_14 != var3_3) ** GOTO lbl358
                        var11_12 = zzamv.zze;
                        var11_12 = var11_12.matcher((CharSequence)var10_11);
                        ** GOTO lbl364
lbl358:
                        // 1 sources

                        if (var13_14 != var18_19) ** GOTO lbl443
                        var25_26 = zzamv.zze;
                        var11_12 = var11_12[var3_3];
                        var11_12 = var25_26.matcher((CharSequence)var11_12);
                        var25_26 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.";
                        zzfk.zzf(var22_23, (String)var25_26);
lbl364:
                        // 2 sources

                        var13_14 = (int)var11_12.matches();
                        var26_27 = "'.";
                        if (var13_14 == 0) ** GOTO lbl432
                        var25_26 = var11_12.group(var17_18);
                        if (var25_26 == null) ** GOTO lbl431
                        var27_28 = var25_26.hashCode();
                        var5_5 = 37;
                        var6_6 = 5.2E-44f;
                        if (var27_28 == var5_5) ** GOTO lbl398
                        var5_5 = 3240;
                        var6_6 = 4.54E-42f;
                        if (var27_28 == var5_5) ** GOTO lbl393
                        var5_5 = 3592;
                        var6_6 = 5.033E-42f;
                        if (var27_28 == var5_5) ** GOTO lbl388
                        ** GOTO lbl402
                    }
                    catch (zzalr v0) {
                        ** GOTO lbl455
                    }
lbl380:
                    // 28 sources

                    while (true) {
                        var9_10 += var3_3;
                        var5_5 = 0;
                        var6_6 = 0.0f;
                        var7_7 = null;
                        continue block57;
                        break;
                    }
lbl388:
                    // 1 sources

                    var7_7 = "px";
                    var5_5 = (int)var25_26.equals(var7_7);
                    if (var5_5 != 0) {
                        var16_17 = 0;
                    }
                    ** GOTO lbl402
lbl393:
                    // 1 sources

                    var7_7 = "em";
                    var5_5 = (int)var25_26.equals(var7_7);
                    if (var5_5 != 0) {
                        var16_17 = 1;
                    }
                    ** GOTO lbl402
lbl398:
                    // 1 sources

                    var7_7 = "%";
                    var5_5 = (int)var25_26.equals(var7_7);
                    if (var5_5 != 0) {
                        var16_17 = 2;
                    }
lbl402:
                    // 6 sources

                    if (var16_17 == 0) ** GOTO lbl422
                    if (var16_17 == var3_3) ** GOTO lbl419
                    if (var16_17 != var18_19) ** GOTO lbl408
                    {
                        var8_8.zzr(var17_18);
                        ** GOTO lbl424
lbl408:
                        // 1 sources

                        var11_12 = new StringBuilder();
                        var19_20 = "Invalid unit for fontSize: '";
                        var11_12.append(var19_20);
                        var11_12.append((String)var25_26);
                        var11_12.append(var26_27);
                        var11_12 = var11_12.toString();
                        var7_7 = new zzalr((String)var11_12);
                        throw var7_7;
lbl419:
                        // 1 sources

                        var8_8.zzr(var18_19);
                        ** GOTO lbl424
lbl422:
                        // 1 sources

                        var8_8.zzr(var3_3);
lbl424:
                        // 3 sources

                        var7_7 = var11_12.group(var3_3);
                        if (var7_7 == null) {
                            throw null;
                        }
                        var6_6 = Float.parseFloat((String)var7_7);
                        var8_8.zzq(var6_6);
                        ** GOTO lbl380
lbl431:
                        // 1 sources

                        throw null;
lbl432:
                        // 1 sources

                        var11_12 = new StringBuilder();
                        var19_20 = "Invalid expression for fontSize: '";
                        var11_12.append(var19_20);
                        var11_12.append((String)var10_11);
                        var11_12.append(var26_27);
                        var11_12 = var11_12.toString();
                        var7_7 = new zzalr((String)var11_12);
                        throw var7_7;
lbl443:
                        // 1 sources

                        var11_12 = new StringBuilder();
                        var19_20 = "Invalid number of entries for fontSize: ";
                        var11_12.append(var19_20);
                        var11_12.append(var13_14);
                        var19_20 = ".";
                        var11_12.append(var19_20);
                        var11_12 = var11_12.toString();
                        var7_7 = new zzalr((String)var11_12);
                        throw var7_7;
                    }
lbl455:
                    // 1 sources

                    var7_7 = "Failed parsing fontSize value: ";
                    LO1.c((String)var10_11, (String)var7_7, var22_23);
                    ** GOTO lbl380
                }
                case 3: {
                    var8_8 = zzamv.zze((zzamy)var8_8);
                    var8_8.zzp((String)var10_11);
                    ** GOTO lbl380
                }
                case 2: {
                    var8_8 = zzamv.zze((zzamy)var8_8);
                    try {
                        var5_5 = zzet.zzb((String)var10_11);
                        var8_8.zzo(var5_5);
                    }
                    catch (IllegalArgumentException v1) {
                        var7_7 = "Failed parsing color value: ";
                        LO1.c((String)var10_11, (String)var7_7, var22_23);
                    }
                    ** GOTO lbl380
                }
                case 1: {
                    var8_8 = zzamv.zze((zzamy)var8_8);
                    try {
                        var5_5 = zzet.zzb((String)var10_11);
                        var8_8.zzm(var5_5);
                    }
                    catch (IllegalArgumentException v2) {
                        var7_7 = "Failed parsing background value: ";
                        LO1.c((String)var10_11, (String)var7_7, var22_23);
                    }
                    ** GOTO lbl380
                }
                case 0: 
            }
            break;
        }
        var11_12 = "style";
        var7_7 = var0.getName();
        var5_5 = (int)var11_12.equals(var7_7);
        if (var5_5 == 0) ** GOTO lbl380
        var8_8 = zzamv.zze((zzamy)var8_8);
        var8_8.zzs((String)var10_11);
        ** while (true)
    }

    private static String[] zzg(String stringArray) {
        int n3 = (stringArray = stringArray.trim()).isEmpty();
        if (n3 != 0) {
            stringArray = new String[]{};
        } else {
            n3 = zzgd.zza;
            String string2 = "\\s+";
            int n4 = -1;
            stringArray = stringArray.split(string2, n4);
        }
        return stringArray;
    }

    public final void zza(byte[] byArray, int n3, int n4, zzalu zzalu2, zzev zzev2) {
        zzalp.zza(this.zzb(byArray, n3, n4), zzalu2, zzev2);
    }

    /*
     * Exception decompiling
     */
    public final zzalq zzb(byte[] var1_1, int var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 18[TRYBLOCK] [49, 48 : 411->418)] java.io.IOException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

