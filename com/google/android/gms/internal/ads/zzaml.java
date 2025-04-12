/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 */
package com.google.android.gms.internal.ads;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzamk;
import com.google.android.gms.internal.ads.zzamm;
import com.google.android.gms.internal.ads.zzamn;
import com.google.android.gms.internal.ads.zzamo;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgd;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzaml
implements zzalv {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzamk zzc;
    private final zzfu zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzaml() {
        this(null);
    }

    public zzaml(List object) {
        int n3;
        float f5;
        this.zzf = f5 = -3.4028235E38f;
        this.zzg = f5;
        Object object2 = new zzfu();
        this.zzd = object2;
        f5 = 0.0f;
        object2 = null;
        if (object != null && (n3 = object.isEmpty()) == 0) {
            n3 = 1;
            this.zzb = n3;
            object2 = zzgd.zzA((byte[])object.get(0));
            zzeq.zzd(((String)object2).startsWith("Format:"));
            object2 = zzamk.zza((String)object2);
            object2.getClass();
            this.zzc = object2;
            object = (byte[])object.get(n3);
            object2 = new zzfu((byte[])object);
            object = zzfxs.zzc;
            this.zze((zzfu)object2, (Charset)object);
            return;
        }
        this.zzb = false;
        this.zzc = null;
    }

    private static float zzb(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return -3.4028235E38f;
                }
                return 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    private static int zzc(long l2, List list, List list2) {
        int n3;
        block4: {
            n3 = list.size();
            while ((n3 += -1) >= 0) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                long l7 = l4 - l2;
                Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object == false) {
                    return n3;
                }
                l3 = (Long)list.get(n3);
                l4 = l3;
                long l8 = l4 - l2;
                object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object >= 0) continue;
                ++n3;
                break block4;
            }
            n3 = 0;
        }
        ArrayList arrayList = l2;
        list.add(n3, arrayList);
        if (n3 == 0) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2;
            int n4 = n3 + -1;
            arrayList = (Collection)list2.get(n4);
            arrayList = arrayList2 = new ArrayList(arrayList);
        }
        list2.add(n3, arrayList);
        return n3;
    }

    private static long zzd(String object) {
        Object object2 = zza;
        object = ((String)object).trim();
        boolean bl2 = ((Matcher)(object = ((Pattern)object2).matcher((CharSequence)object))).matches();
        if (!bl2) {
            return -9223372036854775807L;
        }
        object2 = ((Matcher)object).group(1);
        long l2 = Long.parseLong((String)object2) * 3600000000L;
        long l3 = Long.parseLong(((Matcher)object).group(2)) * 60000000L;
        long l4 = Long.parseLong(((Matcher)object).group(3)) * 1000000L;
        long l7 = Long.parseLong(((Matcher)object).group(4)) * 10000L;
        return l2 + l3 + l4 + l7;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zze(zzfu var1_1, Charset var2_2) {
        while ((var3_3 = var1_1.zzy(var2_2)) != null) {
            block16: {
                var4_4 = "[Script Info]";
                var5_5 = var4_4.equalsIgnoreCase((String)var3_3);
                var6_6 = 91;
                if (var5_5 == 0) {
                    var4_4 = "[V4+ Styles]";
                    var5_5 = var4_4.equalsIgnoreCase((String)var3_3);
                    var8_8 = "SsaParser";
                    if (var5_5 != 0) {
                        var3_3 = new LinkedHashMap();
                        var5_5 = 0;
                        var4_4 = null;
                        break block16;
                    } else {
                        var4_4 = "[V4 Styles]";
                        var5_5 = (int)var4_4.equalsIgnoreCase((String)var3_3);
                        if (var5_5 != 0) {
                            var3_3 = "[V4 Styles] are not supported";
                            zzfk.zze(var8_8, (String)var3_3);
                            continue;
                        }
                        var4_4 = "[Events]";
                        var14_14 = var4_4.equalsIgnoreCase((String)var3_3);
                        if (!var14_14) continue;
                        return;
                    }
                }
                while ((var3_3 = var1_1.zzy(var2_2)) != null && ((var5_5 = var1_1.zzb()) == 0 || (var5_5 = (int)var1_1.zza(var2_2)) != var6_6)) {
                    block17: {
                        var4_4 = ":";
                        var5_5 = ((String[])(var3_3 = var3_3.split((String)var4_4))).length;
                        if (var5_5 != (var7_7 = 2)) continue;
                        var5_5 = 0;
                        var4_4 = null;
                        var8_8 = zzfxm.zza(var3_3[0].trim());
                        var9_9 = var8_8.hashCode();
                        var10_10 = 1;
                        switch (var9_9) {
                            default: {
                                break;
                            }
                            case 1879649549: {
                                var4_4 = "playresy";
                                var5_5 = (int)var8_8.equals(var4_4);
                                if (var5_5 == 0) break;
                                var5_5 = 1;
                                break block17;
                            }
                            case 1879649548: {
                                var11_11 = "playresx";
                                var7_7 = (int)var8_8.equals(var11_11);
                                if (var7_7 != 0) break block17;
                            }
                        }
                        var5_5 = -1;
                    }
                    if (var5_5 == 0) ** GOTO lbl-1000
                    if (var5_5 != var10_10) continue;
                    try {
                        var3_3 = var3_3[var10_10];
                        var3_3 = var3_3.trim();
                        this.zzg = var12_12 = Float.parseFloat((String)var3_3);
                    }
                    catch (NumberFormatException v0) {}
                    continue;
lbl-1000:
                    // 1 sources

                    {
                        var3_3 = var3_3[var10_10];
                        var3_3 = var3_3.trim();
                        this.zzf = var12_12 = Float.parseFloat((String)var3_3);
                    }
                }
                continue;
            }
            while ((var11_11 = var1_1.zzy(var2_2)) != null && ((var10_10 = var1_1.zzb()) == 0 || (var10_10 = (int)var1_1.zza(var2_2)) != var6_6)) {
                var13_13 = "Format:";
                var10_10 = (int)var11_11.startsWith(var13_13);
                if (var10_10 != 0) {
                    var4_4 = zzamm.zza((String)var11_11);
                    continue;
                }
                var13_13 = "Style:";
                var10_10 = (int)var11_11.startsWith(var13_13);
                if (var10_10 == 0) continue;
                if (var4_4 == null) {
                    var13_13 = "Skipping 'Style:' line before 'Format:' line: ";
                    var11_11 = var13_13.concat((String)var11_11);
                    zzfk.zzf(var8_8, (String)var11_11);
                    continue;
                }
                if ((var11_11 = zzamo.zzb((String)var11_11, (zzamm)var4_4)) == null) continue;
                var13_13 = var11_11.zza;
                var3_3.put(var13_13, var11_11);
            }
            this.zze = var3_3;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zza(byte[] var1_1, int var2_2, int var3_3, zzalu var4_4, zzev var5_5) {
        var6_6 = this;
        var7_7 = var2_2;
        var8_8 = new ArrayList<E>();
        var9_9 = new ArrayList<E>();
        var10_10 = var2_2 + var3_3;
        var11_11 = this.zzd;
        var12_12 = var1_1;
        var11_11.zzI(var1_1, var10_10);
        var13_13 = this.zzd;
        var13_13.zzK(var2_2);
        var14_14 = this.zzd.zzB();
        if (var14_14 == null) {
            var14_14 = zzfxs.zzc;
        }
        if ((var10_10 = (int)var6_6.zzb) == 0) {
            var13_13 = var6_6.zzd;
            var6_6.zze(var13_13, (Charset)var14_14);
        }
        var13_13 = var6_6.zzd;
        var15_15 = var6_6.zzb;
        if (var15_15 != 0) {
            var11_11 = var6_6.zzc;
        } else {
            var15_15 = 0;
            var11_11 = null;
        }
        while (true) {
            block48: {
                block56: {
                    block54: {
                        block49: {
                            block55: {
                                block53: {
                                    block52: {
                                        block51: {
                                            block50: {
                                                var16_16 = var13_13.zzy((Charset)var14_14);
                                                var17_17 = -1;
                                                var18_18 = 0.0f / 0.0f;
                                                if (var16_16 == null) break;
                                                var19_19 /* !! */  = "Format:";
                                                var20_20 = var16_16.startsWith((String)var19_19 /* !! */ );
                                                if (var20_20 != 0) {
                                                    var11_11 = zzamk.zza((String)var16_16);
                                                    continue;
                                                }
                                                var19_19 /* !! */  = "Dialogue:";
                                                var21_21 = var16_16.startsWith((String)var19_19 /* !! */ );
                                                if (!var21_21) break block50;
                                                var22_22 = "SsaParser";
                                                if (var11_11 != null) break block51;
                                                var23_23 = "Skipping dialogue line before complete format: ";
                                                var16_16 = var23_23.concat((String)var16_16);
                                                zzfk.zzf(var22_22, (String)var16_16);
                                            }
lbl43:
                                            // 4 sources

                                            while (true) {
                                                var24_24 = var14_14;
                                                var25_25 = var13_13;
                                                var26_26 = var11_11;
                                                break block48;
                                                break;
                                            }
                                        }
                                        zzeq.zzd(var16_16.startsWith((String)var19_19 /* !! */ ));
                                        var20_20 = 9;
                                        var19_19 /* !! */  = var16_16.substring(var20_20);
                                        var27_27 = ",";
                                        var28_28 = var11_11.zze;
                                        var19_19 /* !! */  = var19_19 /* !! */ .split(var27_27, var28_28);
                                        var29_29 = var19_19 /* !! */ .length;
                                        var28_28 = var11_11.zze;
                                        if (var29_29 == var28_28) break block52;
                                        var23_23 = "Skipping dialogue line with fewer columns than format: ";
                                        var16_16 = var23_23.concat((String)var16_16);
                                        zzfk.zzf(var22_22, (String)var16_16);
                                        ** GOTO lbl43
                                    }
                                    var29_29 = var11_11.zza;
                                    var27_27 = var19_19 /* !! */ [var29_29];
                                    var30_30 = zzaml.zzd(var27_27);
                                    var32_31 = "Skipping invalid timing: ";
                                    var33_32 = -9223372036854775807L;
                                    cfr_temp_0 = var30_30 - var33_32;
                                    var35_33 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                    if (var35_33 /* !! */  != false) break block53;
                                    var16_16 = var32_31.concat((String)var16_16);
                                    zzfk.zzf(var22_22, (String)var16_16);
                                    ** GOTO lbl43
                                }
                                var36_34 = var11_11.zzb;
                                var12_12 = var19_19 /* !! */ [var36_34];
                                var37_35 = zzaml.zzd((String)var12_12);
                                cfr_temp_1 = var37_35 - var33_32;
                                if ((var36_34 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) == 0) {
                                    var12_12 = var32_31.concat((String)var16_16);
                                    zzfk.zzf(var22_22, (String)var12_12);
                                    ** continue;
                                }
                                var12_12 = var6_6.zze;
                                if (var12_12 != null && (var39_36 = var11_11.zzc) != var17_17) {
                                    var16_16 = var19_19 /* !! */ [var39_36].trim();
                                    var12_12 = (zzamo)var12_12.get(var16_16);
                                } else {
                                    var36_34 = 0;
                                    var12_12 = null;
                                }
                                var39_36 = var11_11.zzd;
                                var16_16 = var19_19 /* !! */ [var39_36];
                                var19_19 /* !! */  = zzamn.zza((String)var16_16);
                                var16_16 = zzamn.zzb((String)var16_16);
                                var23_23 = "\n";
                                var16_16 = var16_16.replace("\\N", var23_23).replace("\\n", var23_23);
                                var23_23 = "\\h";
                                var32_31 = "\u00a0";
                                var16_16 = var16_16.replace(var23_23, var32_31);
                                var18_18 = var6_6.zzf;
                                var40_37 = var6_6.zzg;
                                var6_6 = new SpannableString((CharSequence)var16_16);
                                var16_16 = new zzeg();
                                var16_16.zzl((CharSequence)var6_6);
                                var24_24 = var14_14;
                                var41_38 = -3.4028235E38f;
                                if (var12_12 == null) break block54;
                                var14_14 = var12_12.zzc;
                                var25_25 = var13_13;
                                if (var14_14 != null) {
                                    var7_7 = var14_14.intValue();
                                    var13_13 = new ForegroundColorSpan(var7_7);
                                    var7_7 = var6_6.length();
                                    var26_26 = var11_11;
                                    var42_39 = var37_35;
                                    var15_15 = 0;
                                    var11_11 = null;
                                    var44_40 = 33;
                                    var6_6.setSpan((Object)var13_13, 0, var7_7, var44_40);
                                } else {
                                    var26_26 = var11_11;
                                    var42_39 = var37_35;
                                }
                                var7_7 = var12_12.zzj;
                                var10_10 = 3;
                                if (var7_7 == var10_10 && (var14_14 = var12_12.zzd) != null) {
                                    var7_7 = var14_14.intValue();
                                    var11_11 = new BackgroundColorSpan(var7_7);
                                    var7_7 = var6_6.length();
                                    var44_40 = 0;
                                    var45_41 = 33;
                                    var6_6.setSpan(var11_11, 0, var7_7, var45_41);
                                }
                                if ((var15_15 = (cfr_temp_2 = (var46_42 = var12_12.zze) - var41_38) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1)) != 0 && (var15_15 = var40_37 == var41_38 ? 0 : (var40_37 > var41_38 ? 1 : -1)) != 0) {
                                    var15_15 = 1;
                                    var16_16.zzn(var46_42 /= var40_37, var15_15);
                                }
                                if ((var7_7 = (int)var12_12.zzf) == 0) break block55;
                                var7_7 = (int)var12_12.zzg;
                                if (var7_7 != 0) {
                                    var14_14 = new StyleSpan(var10_10);
                                    var10_10 = var6_6.length();
                                    var15_15 = 0;
                                    var11_11 = null;
                                    var44_40 = 33;
                                    var6_6.setSpan(var14_14, 0, var10_10, var44_40);
lbl145:
                                    // 3 sources

                                    while (true) {
                                        var10_10 = 2;
                                        break block49;
                                        break;
                                    }
                                }
                                var15_15 = 0;
                                var11_11 = null;
                                var44_40 = 33;
                                var14_14 = new StyleSpan(1);
                                var10_10 = var6_6.length();
                                var6_6.setSpan(var14_14, 0, var10_10, var44_40);
                                ** GOTO lbl145
                            }
                            var15_15 = 0;
                            var11_11 = null;
                            var44_40 = 33;
                            var7_7 = (int)var12_12.zzg;
                            if (var7_7 != 0) ** break;
                            ** continue;
                            var10_10 = 2;
                            var14_14 = new StyleSpan(var10_10);
                            var45_41 = var6_6.length();
                            var6_6.setSpan(var14_14, 0, var45_41, var44_40);
                        }
                        var7_7 = (int)var12_12.zzh;
                        if (var7_7 != 0) {
                            var14_14 = new UnderlineSpan();
                            var45_41 = var6_6.length();
                            var6_6.setSpan(var14_14, 0, var45_41, var44_40);
                        }
                        if ((var7_7 = (int)var12_12.zzi) != 0) {
                            var14_14 = new StrikethroughSpan();
                            var45_41 = var6_6.length();
                            var6_6.setSpan(var14_14, 0, var45_41, var44_40);
                        }
                        break block56;
                    }
                    var25_25 = var13_13;
                    var26_26 = var11_11;
                    var42_39 = var37_35;
                    var10_10 = 2;
                }
                var47_43 = var19_19 /* !! */ .zza;
                var7_7 = -1;
                var46_42 = 0.0f / 0.0f;
                if (var47_43 == var7_7) {
                    if (var12_12 != null) {
                        var47_43 = var12_12.zzb;
                    } else {
                        var47_43 = -1;
                        var48_44 = 0.0f / 0.0f;
                    }
                }
                var14_14 = "Unknown alignment: ";
                switch (var47_43) {
                    default: {
                        w12_0.a(var47_43, (String)var14_14, var22_22);
                    }
                    case -1: {
                        var15_15 = 0;
                        var11_11 = null;
                        break;
                    }
                    case 3: 
                    case 6: 
                    case 9: {
                        var11_11 = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    }
                    case 2: 
                    case 5: 
                    case 8: {
                        var11_11 = Layout.Alignment.ALIGN_CENTER;
                        break;
                    }
                    case 1: 
                    case 4: 
                    case 7: {
                        var11_11 = Layout.Alignment.ALIGN_NORMAL;
                    }
                }
                var16_16.zzm((Layout.Alignment)var11_11);
                var15_15 = -1 << -1;
                switch (var47_43) {
                    default: {
                        w12_0.a(var47_43, (String)var14_14, var22_22);
                    }
                    case -1: {
                        var36_34 = -1 << -1;
                        break;
                    }
                    case 3: 
                    case 6: 
                    case 9: {
                        var36_34 = 2;
                        break;
                    }
                    case 2: 
                    case 5: 
                    case 8: {
                        var36_34 = 1;
                        break;
                    }
                    case 1: 
                    case 4: 
                    case 7: {
                        var36_34 = 0;
                        var12_12 = null;
                    }
                }
                var16_16.zzi(var36_34);
                switch (var47_43) {
                    default: {
                        w12_0.a(var47_43, (String)var14_14, var22_22);
                    }
                    case -1: {
                        var44_40 = -1 << -1;
                        break;
                    }
                    case 7: 
                    case 8: 
                    case 9: {
                        var44_40 = 0;
                        break;
                    }
                    case 4: 
                    case 5: 
                    case 6: {
                        var44_40 = 1;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 3: {
                        var44_40 = 2;
                    }
                }
                var16_16.zzf(var44_40);
                var6_6 = var19_19 /* !! */ .zzb;
                if (var6_6 != null && (var7_7 = (int)(var40_37 == var41_38 ? 0 : (var40_37 > var41_38 ? 1 : -1))) != 0 && (var7_7 = (int)(var18_18 == var41_38 ? 0 : (var18_18 > var41_38 ? 1 : -1))) != 0) {
                    var48_44 = var6_6.x / var18_18;
                    var16_16.zzh(var48_44);
                    var6_6 = var19_19 /* !! */ .zzb;
                    var48_44 = var6_6.y / var40_37;
                    var15_15 = 0;
                    var11_11 = null;
                    var16_16.zze(var48_44, 0);
                } else {
                    var15_15 = 0;
                    var11_11 = null;
                    var48_44 = zzaml.zzb(var16_16.zzb());
                    var16_16.zzh(var48_44);
                    var47_43 = var16_16.zza();
                    var48_44 = zzaml.zzb(var47_43);
                    var16_16.zze(var48_44, 0);
                }
                var6_6 = var16_16.zzp();
                var10_10 = zzaml.zzc(var42_39, var9_9, var8_8);
                for (var7_7 = zzaml.zzc(var30_30, var9_9, var8_8); var7_7 < var10_10; ++var7_7) {
                    var11_11 = (List)var8_8.get(var7_7);
                    var11_11.add(var6_6);
                }
            }
            var6_6 = this;
            var14_14 = var24_24;
            var13_13 = var25_25;
            var11_11 = var26_26;
        }
        var15_15 = 0;
        var11_11 = null;
        var48_44 = 0.0f;
        var6_6 = null;
        for (var47_43 = 0; var47_43 < (var7_7 = var8_8.size()); var47_43 += var7_7) {
            var16_16 = var14_14 = var8_8.get(var47_43);
            var16_16 = (List)var14_14;
            var7_7 = (int)var16_16.isEmpty();
            if (var7_7 != 0) {
                if (var47_43 != 0) {
                    var12_12 = var5_5;
                    var7_7 = 1;
                    var46_42 = 1.4E-45f;
                    var10_10 = -1;
                    continue;
                }
                var47_43 = 0;
                var48_44 = 0.0f;
                var6_6 = null;
            }
            var7_7 = var8_8.size();
            var10_10 = -1;
            if (var47_43 != (var7_7 += var10_10)) {
                var49_45 = (Long)var9_9.get(var47_43);
                var7_7 = var47_43 + 1;
                var51_46 = (Long)var9_9.get(var7_7);
                var53_47 = (Long)var9_9.get(var47_43);
                var12_12 = var14_14;
                var14_14 = new zzaln((List)var16_16, var49_45, var51_46 -= var53_47);
                var12_12 = var5_5;
                var5_5.zza(var14_14);
                var7_7 = 1;
                var46_42 = 1.4E-45f;
                continue;
            }
            var6_6 = new IllegalStateException();
            throw var6_6;
        }
    }
}

