/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzand;
import com.google.android.gms.internal.ads.zzet;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgd;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

final class zzanc {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzfu zzc;
    private final StringBuilder zzd;

    public zzanc() {
        Object object = new zzfu();
        this.zzc = object;
        this.zzd = object = new StringBuilder();
    }

    public static String zza(zzfu zzfu2, StringBuilder charSequence) {
        zzanc.zzc(zzfu2);
        int n3 = zzfu2.zzb();
        if (n3 == 0) {
            return null;
        }
        String string2 = "";
        n3 = (int)(string2.equals(charSequence = zzanc.zzd(zzfu2, (StringBuilder)charSequence)) ? 1 : 0);
        if (n3 == 0) {
            return charSequence;
        }
        char c2 = (char)zzfu2.zzm();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(c2);
        return ((StringBuilder)charSequence).toString();
    }

    public static void zzc(zzfu zzfu2) {
        int n3 = 1;
        block0: while (true) {
            int n4;
            int n7 = 1;
            while ((n4 = zzfu2.zzb()) > 0 && n7 != 0) {
                n7 = zzfu2.zzd();
                byte[] byArray = zzfu2.zzM();
                n7 = (char)byArray[n7];
                if (n7 != (n4 = 9) && n7 != (n4 = 10) && n7 != (n4 = 12) && n7 != (n4 = 13) && n7 != (n4 = 32)) {
                    n7 = zzfu2.zzd();
                    n4 = zzfu2.zze();
                    byte[] byArray2 = zzfu2.zzM();
                    int n8 = n7 + 2;
                    char c2 = '\u0000';
                    if (n8 <= n4) {
                        n8 = n7 + 1;
                        int n10 = byArray2[n7];
                        int n14 = 47;
                        if (n10 == n14) {
                            n7 += 2;
                            n10 = 42;
                            if ((n8 = byArray2[n8]) == n10) {
                                while ((n8 = n7 + 1) < n4) {
                                    c2 = (char)byArray2[n7];
                                    if (c2 == n10 && (c2 = (char)byArray2[n8]) == n14) {
                                        n7 = n4 = n7 + 2;
                                        continue;
                                    }
                                    n7 = n8;
                                }
                                n7 = zzfu2.zzd();
                                zzfu2.zzL(n4 -= n7);
                                continue block0;
                            }
                        }
                    }
                    n7 = 0;
                    continue;
                }
                zzfu2.zzL(n3);
                continue block0;
            }
            break;
        }
    }

    private static String zzd(zzfu zzfu2, StringBuilder stringBuilder) {
        int n3 = 0;
        stringBuilder.setLength(0);
        int n4 = zzfu2.zzd();
        int n7 = zzfu2.zze();
        block0: while (true) {
            int n8 = 0;
            byte[] byArray = null;
            while (n4 < n7 && n8 == 0) {
                int n10;
                byArray = zzfu2.zzM();
                n8 = byArray[n4];
                if (!(n8 >= (n10 = 65) && n8 <= (n10 = 90) || n8 >= (n10 = 97) && n8 <= (n10 = 122) || n8 >= (n10 = 48) && n8 <= (n10 = 57) || n8 == (n10 = 35) || n8 == (n10 = 45) || n8 == (n10 = 46) || n8 == (n10 = 95))) {
                    n8 = 1;
                    continue;
                }
                stringBuilder.append((char)n8);
                ++n4;
                continue block0;
            }
            break;
        }
        n3 = zzfu2.zzd();
        zzfu2.zzL(n4 -= n3);
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final List zzb(zzfu var1_1) {
        var2_2 = this;
        var3_3 = -1;
        var4_4 = 0.0f / 0.0f;
        var5_5 = 1;
        var6_6 = this.zzd;
        var7_7 = 0;
        var8_8 = null;
        var6_6.setLength(0);
        var9_9 = var1_1.zzd();
        do {
            var10_10 = zzfxs.zzc;
            var11_11 = var1_1;
        } while (!(var12_12 = TextUtils.isEmpty((CharSequence)(var10_10 = var1_1.zzy((Charset)var10_10)))));
        var10_10 = var2_2.zzc;
        var13_13 = var1_1.zzM();
        var14_14 = var1_1.zzd();
        var10_10.zzI((byte[])var13_13, var14_14);
        var10_10 = var2_2.zzc;
        var10_10.zzK(var9_9);
        var6_6 = new ArrayList();
        while (true) {
            block36: {
                var10_10 = var2_2.zzc;
                var11_11 = var2_2.zzd;
                zzanc.zzc((zzfu)var10_10);
                var15_15 = var10_10.zzb();
                var16_16 = "{";
                var17_17 = 5;
                var18_18 = "";
                if (var15_15 < var17_17) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        var15_15 = 0;
                        var13_13 = null;
                        break block36;
                        break;
                    }
                }
                var13_13 = zzfxs.zzc;
                var19_19 = "::cue";
                var15_15 = (int)var19_19.equals(var13_13 = (Object)var10_10.zzA(var17_17, (Charset)var13_13));
                if (var15_15 == 0) ** GOTO lbl-1000
                var15_15 = var10_10.zzd();
                var19_19 = zzanc.zza((zzfu)var10_10, (StringBuilder)var11_11);
                if (var19_19 == null) ** GOTO lbl-1000
                var20_20 = var16_16.equals(var19_19);
                if (var20_20 != 0) {
                    var10_10.zzK(var15_15);
                    var13_13 = var18_18;
                } else {
                    var13_13 = "(";
                    var15_15 = (int)var13_13.equals(var19_19);
                    if (var15_15 != 0) {
                        var15_15 = var10_10.zzd();
                        var17_17 = var10_10.zze();
                        var20_20 = 0;
                        var21_21 /* !! */  = null;
                        while (var15_15 < var17_17 && var20_20 == 0) {
                            var21_21 /* !! */  = var10_10.zzM();
                            var22_22 = var15_15 + 1;
                            var20_20 = 41;
                            if ((var15_15 = (int)((char)var21_21 /* !! */ [var15_15])) == var20_20) {
                                var20_20 = 1;
                            } else {
                                var20_20 = 0;
                                var21_21 /* !! */  = null;
                            }
                            var15_15 = var22_22;
                        }
                        var15_15 += var3_3;
                        var17_17 = var10_10.zzd();
                        var19_19 = zzfxs.zzc;
                        var13_13 = var10_10.zzA(var15_15 -= var17_17, (Charset)var19_19).trim();
                    } else {
                        var15_15 = 0;
                        var13_13 = null;
                    }
                    if (var12_12 = (var11_11 = ")").equals(var10_10 = zzanc.zza((zzfu)var10_10, (StringBuilder)var11_11))) ** break;
                    ** continue;
                }
            }
            if (var13_13 == null) break;
            var10_10 = var2_2.zzc;
            var11_11 = var2_2.zzd;
            var12_12 = var16_16.equals(var10_10 = zzanc.zza((zzfu)var10_10, (StringBuilder)var11_11));
            if (!var12_12) break;
            var10_10 = new zzand();
            var14_14 = (int)var18_18.equals(var13_13);
            if (var14_14 != 0) lbl-1000:
            // 3 sources

            {
                while (true) {
                    continue;
                    break;
                }
            }
            var14_14 = var13_13.indexOf(91);
            if (var14_14 != var3_3) {
                var16_16 = zzanc.zza;
                var19_19 = var13_13.substring(var14_14);
                var17_17 = (int)(var16_16 = var16_16.matcher((CharSequence)var19_19)).matches();
                if (var17_17 != 0) {
                    var16_16 = var16_16.group(var5_5);
                    var16_16.getClass();
                    var10_10.zzv((String)var16_16);
                }
                var13_13 = var13_13.substring(0, var14_14);
            }
            var14_14 = zzgd.zza;
            var11_11 = var13_13.split("\\.", var3_3);
            var23_23 = (var13_13 = var11_11[0]).indexOf(35);
            if (var23_23 != var3_3) {
                var19_19 = var13_13.substring(0, var23_23);
                var10_10.zzu((String)var19_19);
                var13_13 = var13_13.substring(var23_23 += var5_5);
                var10_10.zzt((String)var13_13);
            } else {
                var10_10.zzu((String)var13_13);
            }
            if ((var15_15 = ((Object)var11_11).length) <= var5_5) ** GOTO lbl-1000
            var11_11 = (String[])Arrays.copyOfRange(var11_11, var5_5, var15_15);
            var10_10.zzs((String[])var11_11);
            ** continue;
            var14_14 = 0;
            var11_11 = null;
            var15_15 = 0;
            var13_13 = null;
            while (true) {
                block38: {
                    block53: {
                        block52: {
                            block51: {
                                block49: {
                                    block50: {
                                        block48: {
                                            block47: {
                                                block46: {
                                                    block45: {
                                                        block44: {
                                                            block43: {
                                                                block42: {
                                                                    block41: {
                                                                        block40: {
                                                                            block39: {
                                                                                block37: {
                                                                                    var16_16 = "}";
                                                                                    if (var14_14 != 0) break;
                                                                                    var11_11 = var2_2.zzc;
                                                                                    var13_13 = var2_2.zzd;
                                                                                    var17_17 = var11_11.zzd();
                                                                                    if ((var13_13 = zzanc.zza((zzfu)var11_11, (StringBuilder)var13_13)) == null || (var14_14 = (int)var16_16.equals(var13_13)) != 0) {
                                                                                        var14_14 = 1;
                                                                                    } else {
                                                                                        var14_14 = 0;
                                                                                        var11_11 = null;
                                                                                    }
                                                                                    if (var14_14 != 0) break block38;
                                                                                    var2_2.zzc.zzK(var17_17);
                                                                                    var19_19 = var2_2.zzc;
                                                                                    var21_21 /* !! */  = (byte[])var2_2.zzd;
                                                                                    zzanc.zzc((zzfu)var19_19);
                                                                                    var24_24 = zzanc.zzd((zzfu)var19_19, (StringBuilder)var21_21 /* !! */ );
                                                                                    var25_25 = var18_18.equals(var24_24);
                                                                                    if (var25_25 || !(var25_25 = (var27_27 = ":").equals(var26_26 = zzanc.zza((zzfu)var19_19, (StringBuilder)var21_21 /* !! */ )))) break block38;
                                                                                    zzanc.zzc((zzfu)var19_19);
                                                                                    var26_26 = new StringBuilder();
                                                                                    var28_28 = false;
                                                                                    var27_27 = null;
                                                                                    while (true) {
                                                                                        var29_29 = ";";
                                                                                        if (var28_28) break;
                                                                                        var7_7 = var19_19.zzd();
                                                                                        var30_30 = zzanc.zza((zzfu)var19_19, (StringBuilder)var21_21 /* !! */ );
                                                                                        if (var30_30 == null) {
                                                                                            var7_7 = 0;
                                                                                            var8_8 = null;
                                                                                            break block37;
                                                                                        }
                                                                                        var31_31 = var16_16.equals(var30_30);
                                                                                        if (!var31_31 && (var3_3 = (int)var29_29.equals(var30_30)) == 0) {
                                                                                            var26_26.append(var30_30);
                                                                                            var7_7 = 0;
                                                                                            var8_8 = null;
                                                                                            continue;
                                                                                        }
                                                                                        var19_19.zzK(var7_7);
                                                                                        var7_7 = 0;
                                                                                        var8_8 = null;
                                                                                        var28_28 = true;
                                                                                    }
                                                                                    var8_8 = var26_26.toString();
                                                                                }
                                                                                if (var8_8 == null || (var32_32 = var18_18.equals(var8_8)) != 0) break block38;
                                                                                var32_32 = var19_19.zzd();
                                                                                var3_3 = (int)var29_29.equals(var21_21 /* !! */  = (byte[])zzanc.zza((zzfu)var19_19, (StringBuilder)var21_21 /* !! */ ));
                                                                                if (var3_3 != 0) break block39;
                                                                                var3_3 = (int)var16_16.equals(var21_21 /* !! */ );
                                                                                if (var3_3 == 0) break block38;
                                                                                var19_19.zzK(var32_32);
                                                                            }
                                                                            if ((var3_3 = (int)(var29_29 = "color").equals(var24_24)) == 0) break block40;
                                                                            var3_3 = zzet.zza(var8_8);
                                                                            var10_10.zzk(var3_3);
                                                                            break block38;
                                                                        }
                                                                        var29_29 = "background-color";
                                                                        var3_3 = (int)var29_29.equals(var24_24);
                                                                        if (var3_3 == 0) break block41;
                                                                        var3_3 = zzet.zza(var8_8);
                                                                        var10_10.zzh(var3_3);
                                                                        break block38;
                                                                    }
                                                                    var29_29 = "ruby-position";
                                                                    var3_3 = (int)var29_29.equals(var24_24);
                                                                    var23_23 = 2;
                                                                    if (var3_3 == 0) break block42;
                                                                    var29_29 = "over";
                                                                    var3_3 = (int)var29_29.equals(var8_8);
                                                                    if (var3_3 != 0) {
                                                                        var10_10.zzp(var5_5);
                                                                    } else {
                                                                        var29_29 = "under";
                                                                        var3_3 = (int)var29_29.equals(var8_8);
                                                                        if (var3_3 != 0) {
                                                                            var10_10.zzp(var23_23);
                                                                        }
                                                                    }
                                                                    break block38;
                                                                }
                                                                var29_29 = "text-combine-upright";
                                                                var3_3 = (int)var29_29.equals(var24_24);
                                                                if (var3_3 == 0) break block43;
                                                                var29_29 = "all";
                                                                var3_3 = (int)var29_29.equals(var8_8);
                                                                if (var3_3 != 0 || (var3_3 = (int)var8_8.startsWith((String)(var29_29 = "digits"))) != 0) {
                                                                    var3_3 = 1;
                                                                    var4_4 = 1.4E-45f;
                                                                } else {
                                                                    var3_3 = 0;
                                                                    var4_4 = 0.0f;
                                                                    var29_29 = null;
                                                                }
                                                                var10_10.zzj((boolean)var3_3);
                                                                break block38;
                                                            }
                                                            var29_29 = "text-decoration";
                                                            var3_3 = (int)var29_29.equals(var24_24);
                                                            if (var3_3 == 0) break block44;
                                                            var29_29 = "underline";
                                                            var3_3 = (int)var29_29.equals(var8_8);
                                                            if (var3_3 != 0) {
                                                                var10_10.zzq((boolean)var5_5);
                                                            }
                                                            break block38;
                                                        }
                                                        var29_29 = "font-family";
                                                        var3_3 = (int)var29_29.equals(var24_24);
                                                        if (var3_3 == 0) break block45;
                                                        var10_10.zzl(var8_8);
                                                        break block38;
                                                    }
                                                    var29_29 = "font-weight";
                                                    var3_3 = var29_29.equals(var24_24);
                                                    if (var3_3 == 0) break block46;
                                                    var29_29 = "bold";
                                                    var3_3 = var29_29.equals(var8_8);
                                                    if (var3_3 != 0) {
                                                        var10_10.zzi((boolean)var5_5);
                                                    }
                                                    break block38;
                                                }
                                                var29_29 = "font-style";
                                                var3_3 = var29_29.equals(var24_24);
                                                if (var3_3 == 0) break block47;
                                                var29_29 = "italic";
                                                var3_3 = var29_29.equals(var8_8);
                                                if (var3_3 != 0) {
                                                    var10_10.zzo((boolean)var5_5);
                                                }
                                                break block38;
                                            }
                                            var29_29 = "font-size";
                                            var3_3 = var29_29.equals(var24_24);
                                            if (var3_3 == 0) break block38;
                                            var29_29 = zzanc.zzb;
                                            var19_19 = zzfxm.zza(var8_8);
                                            var17_17 = (var29_29 = var29_29.matcher((CharSequence)var19_19)).matches();
                                            if (var17_17 != 0) break block48;
                                            var16_16 = "Invalid font-size: '";
                                            var29_29 = new StringBuilder((String)var16_16);
                                            var29_29.append(var8_8);
                                            var29_29.append("'.");
                                            var29_29 = var29_29.toString();
                                            var8_8 = "WebvttCssParser";
                                            zzfk.zzf(var8_8, (String)var29_29);
                                            break block38;
                                        }
                                        var8_8 = var29_29.group(var23_23);
                                        var8_8.getClass();
                                        var17_17 = var8_8.hashCode();
                                        var32_32 = 37;
                                        if (var17_17 == var32_32) break block49;
                                        var32_32 = 3240;
                                        if (var17_17 == var32_32) break block50;
                                        var32_32 = 3592;
                                        if (var17_17 != var32_32 || (var7_7 = (int)var8_8.equals(var19_19 = "px")) == 0) ** GOTO lbl-1000
                                        var7_7 = 0;
                                        var8_8 = null;
                                        break block51;
                                    }
                                    var19_19 = "em";
                                    var7_7 = (int)var8_8.equals(var19_19);
                                    if (var7_7 == 0) ** GOTO lbl-1000
                                    var7_7 = 1;
                                    break block51;
                                }
                                var19_19 = "%";
                                var7_7 = (int)var8_8.equals(var19_19);
                                if (var7_7 != 0) {
                                    var7_7 = 2;
                                } else lbl-1000:
                                // 3 sources

                                {
                                    var7_7 = -1;
                                }
                            }
                            if (var7_7 == 0) break block52;
                            if (var7_7 == var5_5) ** GOTO lbl305
                            if (var7_7 == var23_23) {
                                var7_7 = 3;
                                var10_10.zzn(var7_7);
                            } else {
                                var29_29 = new IllegalStateException();
                                throw var29_29;
lbl305:
                                // 1 sources

                                var10_10.zzn(var23_23);
                            }
                            break block53;
                        }
                        var10_10.zzn(var5_5);
                    }
                    var29_29 = var29_29.group(var5_5);
                    var29_29.getClass();
                    var4_4 = Float.parseFloat((String)var29_29);
                    var10_10.zzm(var4_4);
                }
                var3_3 = -1;
                var4_4 = 0.0f / 0.0f;
                var7_7 = 0;
                var8_8 = null;
            }
            var3_3 = (int)var16_16.equals(var13_13);
            if (var3_3 != 0) {
                var6_6.add(var10_10);
            }
            var3_3 = -1;
            var4_4 = 0.0f / 0.0f;
            var7_7 = 0;
            var8_8 = null;
        }
        return var6_6;
    }
}

