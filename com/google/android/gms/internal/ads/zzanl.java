/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.text.SpannedString
 *  android.text.TextUtils
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.RelativeSizeSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 */
package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.ads.zzand;
import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzanh;
import com.google.android.gms.internal.ads.zzani;
import com.google.android.gms.internal.ads.zzanj;
import com.google.android.gms.internal.ads.zzank;
import com.google.android.gms.internal.ads.zzann;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzei;
import com.google.android.gms.internal.ads.zzem;
import com.google.android.gms.internal.ads.zzen;
import com.google.android.gms.internal.ads.zzeo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgd;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzanl {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        int n3 = 255;
        no.c(n3, n3, n3, hashMap, "white");
        no.c(0, n3, 0, hashMap, "lime");
        no.c(0, n3, n3, hashMap, "cyan");
        no.c(n3, 0, 0, hashMap, "red");
        no.c(n3, n3, 0, hashMap, "yellow");
        no.c(n3, 0, n3, hashMap, "magenta");
        no.c(0, 0, n3, hashMap, "blue");
        no.c(0, 0, 0, hashMap, "black");
        zzc = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        no.c(n3, n3, n3, hashMap, "bg_white");
        no.c(0, n3, 0, hashMap, "bg_lime");
        no.c(0, n3, n3, hashMap, "bg_cyan");
        no.c(n3, 0, 0, hashMap, "bg_red");
        no.c(n3, n3, 0, hashMap, "bg_yellow");
        no.c(n3, 0, n3, hashMap, "bg_magenta");
        no.c(0, 0, n3, hashMap, "bg_blue");
        no.c(0, 0, 0, hashMap, "bg_black");
        zzd = Collections.unmodifiableMap(hashMap);
    }

    /*
     * Unable to fully structure code
     */
    public static SpannedString zza(String var0, String var1_1, List var2_2) {
        block31: {
            block41: {
                block45: {
                    block42: {
                        block43: {
                            block44: {
                                var3_3 = var0;
                                var4_4 = var1_1;
                                var5_5 = var2_2;
                                var6_6 = -1;
                                var7_7 = 1;
                                var8_8 = new SpannableStringBuilder();
                                var9_9 = new ArrayDeque<Object>();
                                var10_10 = new ArrayList<Object>();
                                var11_11 = 0;
                                var12_12 = null;
                                var13_13 = 0;
                                var14_14 = null;
                                block3: while (true) {
                                    block32: {
                                        block40: {
                                            block33: {
                                                block34: {
                                                    block35: {
                                                        block36: {
                                                            block37: {
                                                                block38: {
                                                                    block39: {
                                                                        if (var13_13 >= (var15_15 = var1_1.length())) {
                                                                            while (!(var16_26 = var9_9.isEmpty())) {
                                                                                var4_4 = (zzani)var9_9.pop();
                                                                                zzanl.zzg(var3_3, (zzani)var4_4, var10_10, var8_8, var5_5);
                                                                            }
                                                                            var4_4 = zzani.zzb();
                                                                            var17_16 = Collections.emptyList();
                                                                            zzanl.zzg(var3_3, (zzani)var4_4, var17_16, var8_8, var5_5);
                                                                            return SpannedString.valueOf((CharSequence)var8_8);
                                                                        }
                                                                        var15_15 = var13_13 + 1;
                                                                        var18_17 = var4_4.charAt(var13_13);
                                                                        var19_18 = 62;
                                                                        var20_19 = '<';
                                                                        var21_20 = '&';
                                                                        var22_21 = 2;
                                                                        if (var18_17 == var21_20) break;
                                                                        if (var18_17 != var20_19) {
                                                                            var8_8.append((char)var18_17);
                                                                            while (true) {
                                                                                var6_6 = 1;
                                                                                break block31;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (var15_15 >= (var18_17 = var1_1.length())) ** continue;
                                                                        var18_17 = var4_4.charAt(var15_15);
                                                                        var15_15 = (var15_15 = var4_4.indexOf(var19_18, var15_15)) == var6_6 ? var1_1.length() : (var15_15 += var7_7);
                                                                        var19_18 = var15_15 + -2;
                                                                        var20_19 = var4_4.charAt(var19_18);
                                                                        var21_20 = '/';
                                                                        var20_19 = var20_19 == var21_20 ? '\u0001' : '\u0000';
                                                                        var23_22 = var18_17 == var21_20 ? 2 : 1;
                                                                        var13_13 += var23_22;
                                                                        if (var20_19 == '\u0000') {
                                                                            var19_18 = var15_15 + -1;
                                                                        }
                                                                        var14_14 = var4_4.substring(var13_13, var19_18);
                                                                        var24_23 = var14_14.trim();
                                                                        var19_18 = (int)var24_23.isEmpty();
                                                                        if (var19_18 != 0) break block32;
                                                                        var24_23 = var14_14.trim();
                                                                        zzeq.zzd(var24_23.isEmpty() ^ true);
                                                                        var23_22 = zzgd.zza;
                                                                        var25_24 = var24_23.split("[ \\.]", var22_21)[0];
                                                                        var19_18 = var25_24.hashCode();
                                                                        var11_11 = 98;
                                                                        if (var19_18 == var11_11) break block33;
                                                                        var11_11 = 99;
                                                                        if (var19_18 == var11_11) break block34;
                                                                        var11_11 = 105;
                                                                        if (var19_18 == var11_11) break block35;
                                                                        var11_11 = 3650;
                                                                        if (var19_18 == var11_11) break block36;
                                                                        var11_11 = 3314158;
                                                                        if (var19_18 == var11_11) break block37;
                                                                        var11_11 = 3511770;
                                                                        if (var19_18 == var11_11) break block38;
                                                                        var11_11 = 117;
                                                                        if (var19_18 == var11_11) break block39;
                                                                        var11_11 = 118;
                                                                        if (var19_18 != var11_11 || (var11_11 = (int)var25_24.equals(var12_12 = "v")) == 0) ** GOTO lbl-1000
                                                                        var22_21 = 7;
                                                                        break block40;
                                                                    }
                                                                    var12_12 = "u";
                                                                    var11_11 = (int)var25_24.equals(var12_12);
                                                                    if (var11_11 == 0) ** GOTO lbl-1000
                                                                    var22_21 = 6;
                                                                    break block40;
                                                                }
                                                                var12_12 = "ruby";
                                                                var11_11 = (int)var25_24.equals(var12_12);
                                                                if (var11_11 == 0) ** GOTO lbl-1000
                                                                var22_21 = 4;
                                                                break block40;
                                                            }
                                                            var12_12 = "lang";
                                                            var11_11 = (int)var25_24.equals(var12_12);
                                                            if (var11_11 == 0) ** GOTO lbl-1000
                                                            var22_21 = 3;
                                                            break block40;
                                                        }
                                                        var12_12 = "rt";
                                                        var11_11 = (int)var25_24.equals(var12_12);
                                                        if (var11_11 == 0) ** GOTO lbl-1000
                                                        var22_21 = 5;
                                                        break block40;
                                                    }
                                                    var12_12 = "i";
                                                    var11_11 = (int)var25_24.equals(var12_12);
                                                    if (var11_11 == 0) ** GOTO lbl-1000
                                                    break block40;
                                                }
                                                var12_12 = "c";
                                                var11_11 = (int)var25_24.equals(var12_12);
                                                if (var11_11 == 0) ** GOTO lbl-1000
                                                var22_21 = 1;
                                                break block40;
                                            }
                                            var12_12 = "b";
                                            var11_11 = (int)var25_24.equals(var12_12);
                                            if (var11_11 != 0) {
                                                var22_21 = 0;
                                            } else lbl-1000:
                                            // 8 sources

                                            {
                                                var22_21 = -1;
                                            }
                                        }
                                        block0 : switch (var22_21) {
                                            default: {
                                                break;
                                            }
                                            case 0: 
                                            case 1: 
                                            case 2: 
                                            case 3: 
                                            case 4: 
                                            case 5: 
                                            case 6: 
                                            case 7: {
                                                if (var18_17 == var21_20) {
                                                    while ((var11_11 = (int)var9_9.isEmpty()) == 0) {
                                                        var12_12 = (zzani)var9_9.pop();
                                                        zzanl.zzg(var3_3, (zzani)var12_12, var10_10, var8_8, var5_5);
                                                        var13_13 = (int)var9_9.isEmpty();
                                                        if (var13_13 == 0) {
                                                            var18_17 = var8_8.length();
                                                            var19_18 = 0;
                                                            var24_23 = null;
                                                            var14_14 = new zzanh((zzani)var12_12, var18_17, null);
                                                            var10_10.add(var14_14);
                                                        } else {
                                                            var10_10.clear();
                                                        }
                                                        if ((var11_11 = (int)(var12_12 = var12_12.zza).equals(var25_24)) == 0) continue;
                                                        break block0;
                                                    }
                                                    break;
                                                }
                                                if (var20_19 != '\u0000') break;
                                                var7_7 = var8_8.length();
                                                var25_24 = zzani.zza((String)var14_14, var7_7);
                                                var9_9.push(var25_24);
                                            }
                                        }
                                    }
                                    var13_13 = var15_15;
lbl144:
                                    // 2 sources

                                    while (true) {
                                        var7_7 = 1;
                                        var11_11 = 0;
                                        var12_12 = null;
                                        continue block3;
                                        break;
                                    }
                                    break;
                                }
                                var7_7 = var4_4.indexOf(59, var15_15);
                                var11_11 = 32;
                                var13_13 = var4_4.indexOf(var11_11, var15_15);
                                if (var7_7 == var6_6) {
                                    var7_7 = var13_13;
                                } else if (var13_13 != var6_6) {
                                    var7_7 = Math.min(var7_7, var13_13);
                                }
                                if (var7_7 == var6_6) break block41;
                                var26_25 = var4_4.substring(var15_15, var7_7);
                                var18_17 = var26_25.hashCode();
                                if (var18_17 == (var6_6 = 3309)) break block42;
                                var6_6 = 3464;
                                if (var18_17 == var6_6) break block43;
                                var6_6 = 96708;
                                if (var18_17 == var6_6) break block44;
                                var6_6 = 3374865;
                                if (var18_17 != var6_6 || (var6_6 = (int)var26_25.equals(var17_16 = "nbsp")) == 0) ** GOTO lbl-1000
                                var6_6 = 2;
                                break block45;
                            }
                            var17_16 = "amp";
                            var6_6 = (int)var26_25.equals(var17_16);
                            if (var6_6 == 0) ** GOTO lbl-1000
                            var6_6 = 3;
                            break block45;
                        }
                        var17_16 = "lt";
                        var6_6 = (int)var26_25.equals(var17_16);
                        if (var6_6 == 0) ** GOTO lbl-1000
                        var6_6 = 0;
                        var17_16 = null;
                        break block45;
                    }
                    var17_16 = "gt";
                    var6_6 = (int)var26_25.equals(var17_16);
                    if (var6_6 != 0) {
                        var6_6 = 1;
                    } else lbl-1000:
                    // 4 sources

                    {
                        var6_6 = -1;
                    }
                }
                if (var6_6 != 0) {
                    var18_17 = 1;
                    if (var6_6 != var18_17) {
                        if (var6_6 != var22_21) {
                            var18_17 = 3;
                            if (var6_6 != var18_17) {
                                var17_16 = new StringBuilder("ignoring unsupported entity: '&");
                                var17_16.append(var26_25);
                                var17_16.append(";'");
                                var17_16 = var17_16.toString();
                                var12_12 = "WebvttCueParser";
                                zzfk.zzf((String)var12_12, (String)var17_16);
                            } else {
                                var8_8.append(var21_20);
                            }
                        } else {
                            var8_8.append((char)var11_11);
                        }
                    } else {
                        var8_8.append((char)var19_18);
                    }
                } else {
                    var8_8.append(var20_19);
                }
                if (var7_7 == var13_13) {
                    var17_16 = " ";
                    var8_8.append((CharSequence)var17_16);
                }
                var6_6 = 1;
                var13_13 = var7_7 + 1;
lbl222:
                // 2 sources

                while (true) {
                    var6_6 = -1;
                    ** continue;
                    break;
                }
            }
            var6_6 = 1;
            var8_8.append((char)var18_17);
        }
        var13_13 = var15_15;
        ** while (true)
    }

    public static zzeg zzb(String string2) {
        zzank zzank2 = new zzank();
        zzanl.zzh(string2, zzank2);
        return zzank2.zza();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static zzane zzc(zzfu zzfu2, List list) {
        boolean bl2;
        Object object = zzfxs.zzc;
        String string2 = zzfu2.zzy((Charset)object);
        if (string2 == null) return null;
        Pattern pattern = zza;
        Matcher matcher = pattern.matcher(string2);
        boolean bl3 = matcher.matches();
        if (bl3) return zzanl.zze(null, matcher, zzfu2, list);
        if ((object = zzfu2.zzy((Charset)object)) == null || !(bl2 = ((Matcher)(object = pattern.matcher((CharSequence)object))).matches())) return null;
        return zzanl.zze(string2.trim(), (Matcher)object, zzfu2, list);
    }

    private static int zzd(List list, String string2, zzani object) {
        int n3;
        list = zzanl.zzf(list, string2, (zzani)object);
        int n4 = 0;
        string2 = null;
        while (true) {
            int n7 = list.size();
            n3 = -1;
            if (n4 >= n7) break;
            object = ((zzanj)list.get((int)n4)).zzb;
            int n8 = ((zzand)object).zze();
            if (n8 != n3) {
                return ((zzand)object).zze();
            }
            ++n4;
        }
        return n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzane zze(String object, Matcher object2, zzfu zzfu2, List list) {
        block6: {
            long l2;
            Object object3;
            zzank zzank2 = new zzank();
            int n3 = 1;
            int n4 = 0;
            Object object4 = null;
            try {
                object3 = ((Matcher)object2).group(n3);
                if (object3 == null) throw null;
                zzank2.zza = l2 = zzann.zzb((String)object3);
                n3 = 2;
                object3 = ((Matcher)object2).group(n3);
                if (object3 == null) throw null;
                zzank2.zzb = l2 = zzann.zzb((String)object3);
                n3 = 3;
            }
            catch (NumberFormatException numberFormatException) {
                break block6;
            }
            object2 = ((Matcher)object2).group(n3);
            object2.getClass();
            zzanl.zzh((String)object2, zzank2);
            object2 = new StringBuilder();
            object3 = zzfxs.zzc;
            object3 = zzfu2.zzy((Charset)object3);
            while (true) {
                if ((n4 = TextUtils.isEmpty((CharSequence)object3)) != 0) {
                    object2 = ((StringBuilder)object2).toString();
                    zzank2.zzc = object = zzanl.zza((String)object, (String)object2, list);
                    object4 = zzank2.zza().zzp();
                    l2 = zzank2.zza;
                    long l3 = zzank2.zzb;
                    object3 = object;
                    return new zzane((zzei)object4, l2, l3);
                }
                n4 = ((StringBuilder)object2).length();
                if (n4 > 0) {
                    object4 = "\n";
                    ((StringBuilder)object2).append((String)object4);
                }
                object3 = ((String)object3).trim();
                ((StringBuilder)object2).append((String)object3);
                object3 = zzfxs.zzc;
                object3 = zzfu2.zzy((Charset)object3);
            }
        }
        object = String.valueOf(((Matcher)object2).group());
        object = "Skipping cue with bad header: ".concat((String)object);
        zzfk.zzf("WebvttCueParser", (String)object);
        return null;
    }

    private static List zzf(List list, String string2, zzani zzani2) {
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            String string3;
            Object object;
            String string4;
            zzand zzand2 = (zzand)list.get(i3);
            int n4 = zzand2.zzf(string2, string4 = zzani2.zza, (Set)(object = zzani2.zzd), string3 = zzani2.zzc);
            if (n4 <= 0) continue;
            object = new zzanj(n4, zzand2);
            arrayList.add(object);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void zzg(String var0, zzani var1_1, List var2_2, SpannableStringBuilder var3_3, List var4_4) {
        block30: {
            block23: {
                block24: {
                    block25: {
                        block26: {
                            block27: {
                                block28: {
                                    block29: {
                                        var5_5 = var0;
                                        var6_6 = var1_1;
                                        var7_7 = var3_3;
                                        var8_8 = var4_4;
                                        var9_9 = var1_1.zzb;
                                        var10_10 = var3_3.length();
                                        var11_11 = var1_1.zza;
                                        var12_12 = var11_11.hashCode();
                                        var13_13 = 2;
                                        var14_14 = -1;
                                        var15_15 = 0.0f / 0.0f;
                                        if (var12_12 == 0) break block23;
                                        var16_16 = 105;
                                        if (var12_12 == var16_16) break block24;
                                        var16_16 = 3314158;
                                        if (var12_12 == var16_16) break block25;
                                        var16_16 = 3511770;
                                        if (var12_12 == var16_16) break block26;
                                        var16_16 = 98;
                                        if (var12_12 == var16_16) break block27;
                                        var16_16 = 99;
                                        if (var12_12 == var16_16) break block28;
                                        var16_16 = 117;
                                        if (var12_12 == var16_16) break block29;
                                        var16_16 = 118;
                                        if (var12_12 != var16_16 || (var18_18 = (int)var11_11.equals(var17_17 = "v")) == 0) ** GOTO lbl-1000
                                        var18_18 = 6;
                                        break block30;
                                    }
                                    var17_17 = "u";
                                    var18_18 = (int)var11_11.equals(var17_17);
                                    if (var18_18 == 0) ** GOTO lbl-1000
                                    var18_18 = 3;
                                    break block30;
                                }
                                var17_17 = "c";
                                var18_18 = (int)var11_11.equals(var17_17);
                                if (var18_18 == 0) ** GOTO lbl-1000
                                var18_18 = 4;
                                break block30;
                            }
                            var17_17 = "b";
                            var18_18 = (int)var11_11.equals(var17_17);
                            if (var18_18 == 0) ** GOTO lbl-1000
                            var18_18 = 0;
                            var11_11 = null;
                            break block30;
                        }
                        var17_17 = "ruby";
                        var18_18 = (int)var11_11.equals(var17_17);
                        if (var18_18 == 0) ** GOTO lbl-1000
                        var18_18 = 2;
                        break block30;
                    }
                    var17_17 = "lang";
                    var18_18 = (int)var11_11.equals(var17_17);
                    if (var18_18 == 0) ** GOTO lbl-1000
                    var18_18 = 5;
                    break block30;
                }
                var17_17 = "i";
                var18_18 = (int)var11_11.equals(var17_17);
                if (var18_18 == 0) ** GOTO lbl-1000
                var18_18 = 1;
                break block30;
            }
            var17_17 = "";
            var18_18 = var11_11.equals(var17_17);
            if (var18_18 != 0) {
                var18_18 = 7;
            } else lbl-1000:
            // 8 sources

            {
                var18_18 = -1;
            }
        }
        var12_12 = 33;
        switch (var18_18) {
            default: {
                break;
            }
            case 4: {
                var11_11 = var6_6.zzd.iterator();
                while ((var16_16 = (int)var11_11.hasNext()) != 0) {
                    var20_20 = zzanl.zzc;
                    var19_19 = (String)var11_11.next();
                    var21_21 = var20_20.containsKey(var19_19);
                    if (var21_21 != 0) {
                        var19_19 = (Integer)var20_20.get(var19_19);
                        var16_16 = var19_19.intValue();
                        var20_20 = new ForegroundColorSpan(var16_16);
                        var7_7.setSpan(var20_20, var9_9, var10_10, var12_12);
                        continue;
                    }
                    var20_20 = zzanl.zzd;
                    var21_21 = var20_20.containsKey(var19_19);
                    if (var21_21 == 0) continue;
                    var19_19 = (Integer)var20_20.get(var19_19);
                    var16_16 = var19_19.intValue();
                    var20_20 = new BackgroundColorSpan(var16_16);
                    var7_7.setSpan(var20_20, var9_9, var10_10, var12_12);
                }
                ** GOTO lbl148
            }
            case 3: {
                var11_11 = new UnderlineSpan();
                var7_7.setSpan(var11_11, var9_9, var10_10, var12_12);
                ** GOTO lbl148
            }
            case 2: {
                var18_18 = zzanl.zzd((List)var8_8, (String)var5_5, (zzani)var6_6);
                var22_22 = var2_2.size();
                var19_19 = new ArrayList(var22_22);
                var20_20 = var2_2;
                var19_19.addAll(var2_2);
                var20_20 = zzanh.zzd();
                Collections.sort(var19_19, var20_20);
                var22_22 = var6_6.zzb;
                var23_23 = 0;
                for (var21_21 = 0; var21_21 < (var24_24 = var19_19.size()); ++var21_21) {
                    var26_26 = "rt";
                    var25_25 = zzanh.zzc((zzanh)((zzanh)var19_19.get((int)var21_21))).zza;
                    var27_27 = (int)var26_26.equals(var25_25);
                    if (var27_27 != 0) {
                        var26_26 = (zzanh)var19_19.get(var21_21);
                        var25_25 = zzanh.zzc((zzanh)var26_26);
                        var24_24 = zzanl.zzd((List)var8_8, (String)var5_5, (zzani)var25_25);
                        if (var24_24 == var14_14) {
                            var24_24 = var18_18 != var14_14 ? var18_18 : 1;
                        }
                        var28_28 = zzanh.zzc((zzanh)var26_26);
                        var14_14 = var28_28.zzb - var23_23;
                        var27_27 = zzanh.zza((zzanh)var26_26) - var23_23;
                        var29_29 = var7_7.subSequence(var14_14, var27_27);
                        var7_7.delete(var14_14, var27_27);
                        var30_30 = var29_29.toString();
                        var26_26 = new zzen(var30_30, var24_24);
                        var7_7.setSpan(var26_26, var22_22, var14_14, var12_12);
                        var27_27 = var29_29.length();
                        var23_23 = var27_27 + var23_23;
                        var22_22 = var14_14;
                    }
                    var14_14 = -1;
                    var15_15 = 0.0f / 0.0f;
                }
                ** GOTO lbl148
            }
            case 1: {
                var11_11 = new StyleSpan(var13_13);
                var7_7.setSpan(var11_11, var9_9, var10_10, var12_12);
                ** GOTO lbl148
            }
            case 0: {
                var27_27 = 1;
                var11_11 = new StyleSpan(var27_27);
                var7_7.setSpan(var11_11, var9_9, var10_10, var12_12);
            }
lbl148:
            // 6 sources

            case 5: 
            case 6: 
            case 7: {
                var5_5 = zzanl.zzf((List)var8_8, (String)var5_5, (zzani)var6_6);
                var25_25 = null;
                for (var24_24 = 0; var24_24 < (var31_31 = var5_5.size()); ++var24_24) {
                    var6_6 = ((zzanj)var5_5.get((int)var24_24)).zzb;
                    if (var6_6 == null) {
                        var18_18 = -1;
                        var27_27 = 3;
                        var32_32 = true;
                        var33_33 = 1.4E-45f;
                        continue;
                    }
                    var34_34 = var6_6.zzg();
                    if (var34_34 != (var18_18 = -1)) {
                        var27_27 = var6_6.zzg();
                        var8_8 = new StyleSpan(var27_27);
                        zzeo.zza((Spannable)var7_7, var8_8, var9_9, var10_10, var12_12);
                    }
                    if ((var34_34 = (int)var6_6.zzz()) != 0) {
                        var8_8 = new UnderlineSpan();
                        var7_7.setSpan(var8_8, var9_9, var10_10, var12_12);
                    }
                    if ((var34_34 = (int)var6_6.zzy()) != 0) {
                        var27_27 = var6_6.zzc();
                        var8_8 = new ForegroundColorSpan(var27_27);
                        zzeo.zza((Spannable)var7_7, var8_8, var9_9, var10_10, var12_12);
                    }
                    if ((var34_34 = (int)var6_6.zzx()) != 0) {
                        var27_27 = var6_6.zzb();
                        var8_8 = new BackgroundColorSpan(var27_27);
                        zzeo.zza((Spannable)var7_7, var8_8, var9_9, var10_10, var12_12);
                    }
                    if ((var8_8 = var6_6.zzr()) != null) {
                        var26_26 = var6_6.zzr();
                        var8_8 = new TypefaceSpan((String)var26_26);
                        zzeo.zza((Spannable)var7_7, var8_8, var9_9, var10_10, var12_12);
                    }
                    if ((var34_34 = var6_6.zzd()) == (var27_27 = 1)) ** GOTO lbl198
                    if (var34_34 == var13_13) ** GOTO lbl193
                    var27_27 = 3;
                    if (var34_34 == var27_27) ** GOTO lbl187
lbl183:
                    // 2 sources

                    while (true) {
                        var32_32 = true;
                        var33_33 = 1.4E-45f;
                        ** GOTO lbl205
                        break;
                    }
lbl187:
                    // 1 sources

                    var15_15 = var6_6.zza();
                    var32_32 = 1120403456 != 0;
                    var33_33 = 100.0f;
                    var8_8 = new RelativeSizeSpan(var15_15 /= var33_33);
                    zzeo.zza((Spannable)var7_7, var8_8, var9_9, var10_10, var12_12);
                    ** GOTO lbl183
lbl193:
                    // 1 sources

                    var27_27 = 3;
                    var15_15 = var6_6.zza();
                    var8_8 = new RelativeSizeSpan(var15_15);
                    zzeo.zza((Spannable)var7_7, var8_8, var9_9, var10_10, var12_12);
                    ** continue;
lbl198:
                    // 1 sources

                    var27_27 = 3;
                    var15_15 = var6_6.zza();
                    var14_14 = (int)var15_15;
                    var32_32 = true;
                    var33_33 = 1.4E-45f;
                    var8_8 = new AbsoluteSizeSpan(var14_14, var32_32);
                    zzeo.zza((Spannable)var7_7, var8_8, var9_9, var10_10, var12_12);
lbl205:
                    // 2 sources

                    var31_31 = (int)var6_6.zzw();
                    if (var31_31 == 0) continue;
                    var6_6 = new zzem();
                    var7_7.setSpan(var6_6, var9_9, var10_10, var12_12);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void zzh(String var0, zzank var1_1) {
        var2_2 = var1_1;
        var3_3 = "WebvttCueParser";
        var4_4 = zzanl.zzb;
        var5_5 = var0;
        var4_4 = var4_4.matcher(var0);
        while ((var6_6 = var4_4.find()) != 0) {
            block85: {
                block86: {
                    block90: {
                        block91: {
                            block80: {
                                block88: {
                                    block89: {
                                        block84: {
                                            block81: {
                                                block87: {
                                                    block83: {
                                                        block82: {
                                                            var6_6 = 1;
                                                            var7_7 = 1.4E-45f;
                                                            var8_8 = var4_4.group(var6_6);
                                                            var8_8.getClass();
                                                            var9_9 = 2;
                                                            var10_10 = var4_4.group(var9_9);
                                                            var10_10.getClass();
                                                            var11_11 = "line";
                                                            var12_12 = var11_11.equals(var8_8);
                                                            var13_13 = "Invalid anchor value: ";
                                                            var14_14 = 44;
                                                            var15_15 = "center";
                                                            var16_16 = "middle";
                                                            var17_17 = "end";
                                                            var18_18 = "start";
                                                            var19_19 = -1;
                                                            if (var12_12 != 0) break block80;
                                                            var11_11 = "align";
                                                            var12_12 = var11_11.equals(var8_8);
                                                            var20_20 = 5;
                                                            if (var12_12 != 0) ** GOTO lbl170
                                                            var11_11 = "position";
                                                            var12_12 = (int)var11_11.equals(var8_8);
                                                            if (var12_12 != 0) break block81;
                                                            var11_11 = "size";
                                                            var12_12 = (int)var11_11.equals(var8_8);
                                                            if (var12_12 == 0) break block82;
                                                            var7_7 = zzann.zza(var10_10);
                                                            var2_2.zzj = var7_7;
                                                        }
                                                        var11_11 = "vertical";
                                                        var12_12 = (int)var11_11.equals(var8_8);
                                                        if (var12_12 != 0) ** GOTO lbl70
                                                        var5_5 = new StringBuilder();
                                                        var21_21 = "Unknown cue setting ";
                                                        var5_5.append(var21_21);
                                                        var5_5.append(var8_8);
                                                        var8_8 = ":";
                                                        var5_5.append(var8_8);
                                                        var5_5.append(var10_10);
                                                        var5_5 = var5_5.toString();
                                                        zzfk.zzf(var3_3, (String)var5_5);
                                                        continue;
lbl70:
                                                        // 1 sources

                                                        var22_22 = var10_10.hashCode();
                                                        if (var22_22 == (var12_12 = 3462)) break block83;
                                                        var12_12 = 3642;
                                                        if (var22_22 == var12_12 && (var22_22 = (int)var10_10.equals(var8_8 = "rl")) != 0) {
                                                            var19_19 = 0;
                                                        }
                                                        break block87;
                                                    }
                                                    var8_8 = "lr";
                                                    var22_22 = (int)var10_10.equals(var8_8);
                                                    if (var22_22 != 0) {
                                                        var19_19 = 1;
                                                    }
                                                }
                                                if (var19_19 != 0) {
                                                    if (var19_19 != var6_6) {
                                                        var5_5 = "Invalid 'vertical' value: ";
                                                        var5_5 = var5_5.concat(var10_10);
                                                        zzfk.zzf(var3_3, (String)var5_5);
                                                        var6_6 = -1 << -1;
                                                        var7_7 = -0.0f;
                                                    } else {
                                                        var6_6 = 2;
                                                        var7_7 = 2.8E-45f;
                                                    }
                                                }
                                                var2_2.zzk = var6_6;
                                                continue;
                                            }
                                            var22_22 = var10_10.indexOf(var14_14);
                                            if (var22_22 == var19_19) break block84;
                                            var12_12 = var22_22 + 1;
                                            var11_11 = var10_10.substring(var12_12);
                                            var14_14 = var11_11.hashCode();
                                            switch (var14_14) {
                                                default: {
                                                    break;
                                                }
                                                case 109757538: {
                                                    var14_14 = (int)var11_11.equals(var18_18);
                                                    if (var14_14 == 0) break;
                                                    var19_19 = 1;
                                                    break;
                                                }
                                                case 100571: {
                                                    var14_14 = (int)var11_11.equals(var17_17);
                                                    if (var14_14 == 0) break;
                                                    var19_19 = 5;
                                                    break;
                                                }
                                                case -1074341483: {
                                                    var14_14 = (int)var11_11.equals(var16_16);
                                                    if (var14_14 == 0) break;
                                                    var19_19 = 3;
                                                    break;
                                                }
                                                case -1276788989: {
                                                    var23_23 = "line-right";
                                                    var14_14 = (int)var11_11.equals(var23_23);
                                                    if (var14_14 == 0) break;
                                                    var19_19 = 4;
                                                    break;
                                                }
                                                case -1364013995: {
                                                    var14_14 = (int)var11_11.equals(var15_15);
                                                    if (var14_14 == 0) break;
                                                    var19_19 = 2;
                                                    break;
                                                }
                                                case -1842484672: {
                                                    var23_23 = "line-left";
                                                    var14_14 = (int)var11_11.equals(var23_23);
                                                    if (var14_14 == 0) break;
                                                    var19_19 = 0;
                                                }
                                            }
                                            if (var19_19 != 0 && var19_19 != var6_6) {
                                                if (var19_19 != var9_9 && var19_19 != (var14_14 = 3)) {
                                                    var14_14 = 4;
                                                    if (var19_19 != var14_14 && var19_19 != var20_20) {
                                                        var5_5 = var13_13.concat(var11_11);
                                                        zzfk.zzf(var3_3, (String)var5_5);
                                                        var6_6 = -1 << -1;
                                                        var7_7 = -0.0f;
                                                    } else {
                                                        var6_6 = 2;
                                                        var7_7 = 2.8E-45f;
                                                    }
                                                }
                                            } else {
                                                var6_6 = 0;
                                                var7_7 = 0.0f;
                                                var5_5 = null;
                                            }
                                            var2_2.zzi = var6_6;
                                            var6_6 = 0;
                                            var7_7 = 0.0f;
                                            var5_5 = null;
                                            var10_10 = var10_10.substring(0, var22_22);
                                        }
                                        var7_7 = zzann.zza(var10_10);
                                        var2_2.zzh = var7_7;
                                        continue;
lbl170:
                                        // 1 sources

                                        var22_22 = var10_10.hashCode();
                                        switch (var22_22) {
                                            default: {
                                                break;
                                            }
                                            case 109757538: {
                                                var22_22 = (int)var10_10.equals(var18_18);
                                                if (var22_22 == 0) break;
                                                var19_19 = 0;
                                                break;
                                            }
                                            case 108511772: {
                                                var8_8 = "right";
                                                var22_22 = (int)var10_10.equals(var8_8);
                                                if (var22_22 == 0) break;
                                                var19_19 = 5;
                                                break;
                                            }
                                            case 3317767: {
                                                var8_8 = "left";
                                                var22_22 = (int)var10_10.equals(var8_8);
                                                if (var22_22 == 0) break;
                                                var19_19 = 1;
                                                break;
                                            }
                                            case 100571: {
                                                var22_22 = (int)var10_10.equals(var17_17);
                                                if (var22_22 == 0) break;
                                                var19_19 = 4;
                                                break;
                                            }
                                            case -1074341483: {
                                                var22_22 = (int)var10_10.equals(var16_16);
                                                if (var22_22 == 0) break;
                                                var19_19 = 3;
                                                break;
                                            }
                                            case -1364013995: {
                                                var22_22 = (int)var10_10.equals(var15_15);
                                                if (var22_22 == 0) break;
                                                var19_19 = 2;
                                            }
                                        }
                                        if (var19_19 == 0) break block88;
                                        if (var19_19 == var6_6) break block89;
                                        if (var19_19 == var9_9) ** GOTO lbl220
                                        var6_6 = 3;
                                        var7_7 = 4.2E-45f;
                                        if (var19_19 == var6_6) ** GOTO lbl220
                                        var6_6 = 4;
                                        var7_7 = 5.6E-45f;
                                        if (var19_19 != var6_6) {
                                            if (var19_19 != var20_20) {
                                                var5_5 = "Invalid alignment value: ";
                                                var5_5 = var5_5.concat(var10_10);
                                                zzfk.zzf(var3_3, (String)var5_5);
lbl220:
                                                // 3 sources

                                                var6_6 = 2;
                                                var7_7 = 2.8E-45f;
                                            } else {
                                                var6_6 = 5;
                                                var7_7 = 7.0E-45f;
                                            }
                                        } else {
                                            var6_6 = 3;
                                            var7_7 = 4.2E-45f;
                                        }
                                        break block88;
                                    }
                                    var6_6 = 4;
                                    var7_7 = 5.6E-45f;
                                }
                                var2_2.zzd = var6_6;
                                continue;
                            }
                            var22_22 = var10_10.indexOf(var14_14);
                            if (var22_22 == var19_19) break block85;
                            var12_12 = var22_22 + 1;
                            var11_11 = var10_10.substring(var12_12);
                            var14_14 = var11_11.hashCode();
                            switch (var14_14) {
                                default: {
                                    break;
                                }
                                case 109757538: {
                                    var14_14 = (int)var11_11.equals(var18_18);
                                    if (var14_14 == 0) break;
                                    var19_19 = 0;
                                    break;
                                }
                                case 100571: {
                                    var14_14 = (int)var11_11.equals(var17_17);
                                    if (var14_14 == 0) break;
                                    var19_19 = 3;
                                    break;
                                }
                                case -1074341483: {
                                    var14_14 = (int)var11_11.equals(var16_16);
                                    if (var14_14 == 0) break;
                                    var19_19 = 2;
                                    break;
                                }
                                case -1364013995: {
                                    var14_14 = (int)var11_11.equals(var15_15);
                                    if (var14_14 == 0) break;
                                    var19_19 = 1;
                                }
                            }
                            if (var19_19 == 0) break block90;
                            if (var19_19 == var6_6 || var19_19 == var9_9) break block91;
                            var14_14 = 3;
                            if (var19_19 == var14_14) break block86;
                            var21_21 = var13_13.concat(var11_11);
                            zzfk.zzf(var3_3, var21_21);
                            var9_9 = -1 << -1;
                            break block86;
                        }
                        var9_9 = 1;
                        break block86;
                    }
                    var9_9 = 0;
                    var21_21 = null;
                }
                var2_2.zzg = var9_9;
                var9_9 = 0;
                var21_21 = null;
                var10_10 = var10_10.substring(0, var22_22);
            }
            var8_8 = "%";
            var22_22 = (int)var10_10.endsWith(var8_8);
            if (var22_22 == 0) ** GOTO lbl305
            var7_7 = zzann.zza(var10_10);
            var2_2.zze = var7_7;
            var6_6 = 0;
            var7_7 = 0.0f;
            var5_5 = null;
            var2_2.zzf = 0;
            continue;
lbl305:
            // 1 sources

            var22_22 = Integer.parseInt(var10_10);
            var24_24 = var22_22;
            var2_2.zze = var24_24;
            try {
                var2_2.zzf = var6_6;
            }
            catch (NumberFormatException v0) {
                var5_5 = String.valueOf(var4_4.group());
                var8_8 = "Skipping bad cue setting: ";
                var5_5 = var8_8.concat((String)var5_5);
                zzfk.zzf(var3_3, (String)var5_5);
            }
        }
    }
}

