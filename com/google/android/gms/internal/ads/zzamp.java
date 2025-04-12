/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Html
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzamp
implements zzalv {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc;
    private final ArrayList zzd;
    private final zzfu zze;

    public zzamp() {
        Object object = new StringBuilder();
        this.zzc = object;
        this.zzd = object;
        this.zze = object = new zzfu();
    }

    public static float zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 == n4) {
                    return 0.92f;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                throw illegalArgumentException;
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long zzc(Matcher object, int n3) {
        long l2;
        long l3;
        int n4 = n3 + 1;
        String string2 = ((Matcher)object).group(n4);
        if (string2 != null) {
            l3 = Long.parseLong(string2);
            l2 = 3600000L;
            l3 *= l2;
        } else {
            l3 = 0L;
        }
        int n7 = n3 + 2;
        String string3 = ((Matcher)object).group(n7);
        string3.getClass();
        l2 = Long.parseLong(string3) * 60000L + l3;
        n4 = n3 + 3;
        string2 = ((Matcher)object).group(n4);
        string2.getClass();
        l3 = Long.parseLong(string2);
        long l4 = 1000L;
        l3 = l3 * l4 + l2;
        object = ((Matcher)object).group(n3 += 4);
        if (object != null) {
            long l7 = Long.parseLong((String)object);
            l3 += l7;
        }
        return l3 * l4;
    }

    /*
     * Unable to fully structure code
     */
    public final void zza(byte[] var1_1, int var2_2, int var3_3, zzalu var4_4, zzev var5_5) {
        var6_6 = this;
        var7_7 = "SubripParser";
        var8_8 = var2_2 + var3_3;
        var9_9 = this.zze;
        var9_9.zzI(var1_1, var8_8);
        var10_10 = this.zze;
        var10_10.zzK(var2_2);
        var11_11 = this.zze.zzB();
        if (var11_11 == null) {
            var11_11 = zzfxs.zzc;
        }
        while ((var10_10 = var6_6.zze.zzy(var11_11)) != null) {
            block41: {
                block35: {
                    block36: {
                        block38: {
                            block40: {
                                block39: {
                                    block37: {
                                        block34: {
                                            var12_12 = var10_10.length();
                                            if (var12_12 == 0) break block35;
                                            try {
                                                Integer.parseInt((String)var10_10);
                                            }
                                            catch (NumberFormatException v0) {
                                                var6_6 = var5_5;
                                                var9_9 = "Skipping invalid index: ";
                                                var10_10 = var9_9.concat((String)var10_10);
                                                zzfk.zzf(var7_7, (String)var10_10);
                                            }
                                            var10_10 = var6_6.zze.zzy(var11_11);
                                            if (var10_10 == null) {
                                                zzfk.zzf(var7_7, "Unexpected end");
                                                return;
                                            }
                                            var9_9 = zzamp.zza.matcher((CharSequence)var10_10);
                                            var13_13 = var9_9.matches();
                                            if (var13_13 == 0) break block36;
                                            var8_8 = 1;
                                            var14_14 = zzamp.zzc((Matcher)var9_9, var8_8);
                                            var13_13 = 6;
                                            var16_15 = zzamp.zzc((Matcher)var9_9, var13_13);
                                            var18_16 = var6_6.zzc;
                                            var19_17 = 0;
                                            var20_18 = null;
                                            var18_16.setLength(0);
                                            var6_6.zzd.clear();
                                            var18_16 = var6_6.zze.zzy(var11_11);
                                            while ((var21_19 = TextUtils.isEmpty((CharSequence)var18_16)) == 0) {
                                                var22_20 = var6_6.zzc;
                                                var21_19 = var22_20.length();
                                                if (var21_19 > 0) {
                                                    var22_20 = var6_6.zzc;
                                                    var23_21 = "<br>";
                                                    var22_20.append((String)var23_21);
                                                }
                                                var22_20 = var6_6.zzc;
                                                var23_21 = var6_6.zzd;
                                                var18_16 = var18_16.trim();
                                                var24_22 = new StringBuilder((String)var18_16);
                                                var18_16 = zzamp.zzb.matcher((CharSequence)var18_16);
                                                var25_23 = 0;
                                                var26_24 = null;
                                                while ((var27_25 = var18_16.find()) != 0) {
                                                    var28_26 = var18_16.group();
                                                    var23_21.add(var28_26);
                                                    var29_27 = var18_16.start() - var25_23;
                                                    var27_25 = var28_26.length();
                                                    var19_17 = var29_27 + var27_25;
                                                    var10_10 = "";
                                                    var24_22.replace(var29_27, var19_17, (String)var10_10);
                                                    var25_23 += var27_25;
                                                    var8_8 = 1;
                                                    var19_17 = 0;
                                                    var20_18 = null;
                                                }
                                                var10_10 = var24_22.toString();
                                                var22_20.append((String)var10_10);
                                                var10_10 = var6_6.zze;
                                                var18_16 = var10_10.zzy(var11_11);
                                                var8_8 = 1;
                                                var19_17 = 0;
                                                var20_18 = null;
                                            }
                                            var10_10 = Html.fromHtml((String)var6_6.zzc.toString());
                                            var18_16 = null;
                                            for (var30_28 = 0; var30_28 < (var19_17 = (var20_18 = var6_6.zzd).size()); ++var30_28) {
                                                var20_18 = (String)var6_6.zzd.get(var30_28);
                                                var21_19 = (int)var20_18.matches((String)(var22_20 = "\\{\\\\an[1-9]\\}"));
                                                if (var21_19 == 0) {
                                                    continue;
                                                }
                                                break block34;
                                            }
                                            var19_17 = 0;
                                            var20_18 = null;
                                        }
                                        var18_16 = new zzeg();
                                        var18_16.zzl((CharSequence)var10_10);
                                        if (var20_18 != null) break block37;
                                        var10_10 = var18_16.zzp();
                                        break block38;
                                    }
                                    var8_8 = var20_18.hashCode();
                                    var24_22 = "{\\an1}";
                                    var26_24 = "{\\an3}";
                                    var28_26 = "{\\an7}";
                                    var31_29 = "{\\an9}";
                                    var21_19 = 2;
                                    switch (var8_8) {
                                        default: {
                                            break;
                                        }
                                        case -685620462: {
                                            var8_8 = (int)var20_18.equals(var31_29);
                                            if (var8_8 == 0) break;
                                            var8_8 = 5;
                                            break block39;
                                        }
                                        case -685620524: {
                                            var8_8 = (int)var20_18.equals(var28_26);
                                            if (var8_8 == 0) break;
                                            var8_8 = 2;
                                            break block39;
                                        }
                                        case -685620555: {
                                            var10_10 = "{\\an6}";
                                            var8_8 = (int)var20_18.equals(var10_10);
                                            if (var8_8 == 0) break;
                                            var8_8 = 4;
                                            break block39;
                                        }
                                        case -685620617: {
                                            var10_10 = "{\\an4}";
                                            var8_8 = (int)var20_18.equals(var10_10);
                                            if (var8_8 == 0) break;
                                            var8_8 = 1;
                                            break block39;
                                        }
                                        case -685620648: {
                                            var8_8 = (int)var20_18.equals(var26_24);
                                            if (var8_8 == 0) break;
                                            var8_8 = 3;
                                            break block39;
                                        }
                                        case -685620710: {
                                            var8_8 = (int)var20_18.equals(var24_22);
                                            if (var8_8 == 0) break;
                                            var8_8 = 0;
                                            var10_10 = null;
                                            break block39;
                                        }
                                    }
                                    var8_8 = -1;
                                }
                                if (var8_8 == 0) ** GOTO lbl-1000
                                var32_30 = 1;
                                var33_31 = 1.4E-45f;
                                if (var8_8 != var32_30 && var8_8 != var21_19) {
                                    var21_19 = 3;
                                    if (var8_8 != var21_19 && var8_8 != (var21_19 = 4) && var8_8 != (var21_19 = 5)) {
                                        var18_16.zzi(var32_30);
                                    } else {
                                        var32_30 = 2;
                                        var33_31 = 2.8E-45f;
                                        var18_16.zzi(var32_30);
                                    }
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var32_30 = 0;
                                    var33_31 = 0.0f;
                                    var6_6 = null;
                                    var18_16.zzi(0);
                                }
                                var32_30 = var20_18.hashCode();
                                switch (var32_30) {
                                    default: {
                                        break;
                                    }
                                    case -685620462: {
                                        var32_30 = (int)var20_18.equals(var31_29);
                                        if (var32_30 == 0) break;
                                        var32_30 = 5;
                                        var33_31 = 7.0E-45f;
                                        break block40;
                                    }
                                    case -685620493: {
                                        var6_6 = "{\\an8}";
                                        var32_30 = (int)var20_18.equals(var6_6);
                                        if (var32_30 == 0) break;
                                        var32_30 = 4;
                                        var33_31 = 5.6E-45f;
                                        break block40;
                                    }
                                    case -685620524: {
                                        var32_30 = (int)var20_18.equals(var28_26);
                                        if (var32_30 == 0) break;
                                        var32_30 = 3;
                                        var33_31 = 4.2E-45f;
                                        break block40;
                                    }
                                    case -685620648: {
                                        var32_30 = (int)var20_18.equals(var26_24);
                                        if (var32_30 == 0) break;
                                        var32_30 = 2;
                                        var33_31 = 2.8E-45f;
                                        break block40;
                                    }
                                    case -685620679: {
                                        var6_6 = "{\\an2}";
                                        var32_30 = (int)var20_18.equals(var6_6);
                                        if (var32_30 == 0) break;
                                        var32_30 = 1;
                                        var33_31 = 1.4E-45f;
                                        break block40;
                                    }
                                    case -685620710: {
                                        var32_30 = (int)var20_18.equals(var24_22);
                                        if (var32_30 == 0) break;
                                        var32_30 = 0;
                                        var33_31 = 0.0f;
                                        var6_6 = null;
                                        break block40;
                                    }
                                }
                                var32_30 = -1;
                                var33_31 = 0.0f / 0.0f;
                            }
                            if (var32_30 != 0 && var32_30 != (var8_8 = 1) && var32_30 != (var19_17 = 2)) {
                                var19_17 = 3;
                                if (var32_30 != var19_17 && var32_30 != (var19_17 = 4) && var32_30 != (var19_17 = 5)) {
                                    var18_16.zzf(var8_8);
                                } else {
                                    var32_30 = 0;
                                    var33_31 = 0.0f;
                                    var6_6 = null;
                                    var18_16.zzf(0);
                                }
                            } else {
                                var32_30 = 2;
                                var33_31 = 2.8E-45f;
                                var18_16.zzf(var32_30);
                            }
                            var33_31 = zzamp.zzb(var18_16.zzb());
                            var18_16.zzh(var33_31);
                            var32_30 = var18_16.zza();
                            var33_31 = zzamp.zzb(var32_30);
                            var8_8 = 0;
                            var18_16.zze(var33_31, 0);
                            var10_10 = var18_16.zzp();
                        }
                        var34_32 = var16_15 - var14_14;
                        var18_16 = zzgbc.zzn(var10_10);
                        var23_21 = new zzaln((List)var18_16, var14_14, var34_32);
                        var6_6 = var5_5;
                        var5_5.zza(var23_21);
                        break block41;
                    }
                    var6_6 = var5_5;
                    var9_9 = "Skipping invalid timing: ";
                    var10_10 = var9_9.concat((String)var10_10);
                    zzfk.zzf(var7_7, (String)var10_10);
                    break block41;
                    break block41;
                }
                var6_6 = var5_5;
            }
            var6_6 = this;
        }
    }
}

