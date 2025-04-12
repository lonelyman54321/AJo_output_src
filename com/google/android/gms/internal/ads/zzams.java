/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.text.Layout$Alignment
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.RelativeSizeSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 *  android.util.Base64
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzamq;
import com.google.android.gms.internal.ads.zzamw;
import com.google.android.gms.internal.ads.zzamx;
import com.google.android.gms.internal.ads.zzamy;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzem;
import com.google.android.gms.internal.ads.zzen;
import com.google.android.gms.internal.ads.zzeo;
import com.google.android.gms.internal.ads.zzep;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgd;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

final class zzams {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzamy zzf;
    public final String zzg;
    public final String zzh;
    public final zzams zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzams(String hashMap, String string2, long l2, long l3, zzamy zzamy2, String[] stringArray, String string3, String string4, zzams zzams2) {
        boolean bl2;
        this.zza = hashMap;
        this.zzb = string2;
        this.zzh = string4;
        this.zzf = zzamy2;
        this.zzj = stringArray;
        if (string2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            hashMap = null;
        }
        this.zzc = bl2;
        this.zzd = l2;
        this.zze = l3;
        string3.getClass();
        this.zzg = string3;
        this.zzi = zzams2;
        this.zzk = hashMap = new HashMap();
        this.zzl = hashMap = new HashMap();
    }

    public static zzams zzb(String string2, long l2, long l3, zzamy zzamy2, String[] stringArray, String string3, String string4, zzams zzams2) {
        zzams zzams3 = new zzams(string2, null, l2, l3, zzamy2, stringArray, string3, string4, zzams2);
        return zzams3;
    }

    public static zzams zzc(String string2) {
        zzams zzams2;
        String string3 = "\n";
        string2 = string2.replaceAll("\r\n", string3).replaceAll(" *\n *", string3);
        Object object = " ";
        String string4 = string2.replaceAll(string3, (String)object).replaceAll("[ \t\\x0B\f\r]+", (String)object);
        long l2 = -9223372036854775807L;
        object = zzams2;
        zzams2 = new zzams(null, string4, l2, l2, null, null, "", null, null);
        return zzams2;
    }

    private static SpannableStringBuilder zzi(String charSequence, Map map2) {
        boolean bl2 = map2.containsKey(charSequence);
        if (!bl2) {
            zzeg zzeg2 = new zzeg();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            zzeg2.zzl((CharSequence)spannableStringBuilder);
            map2.put(charSequence, zzeg2);
        }
        charSequence = ((zzeg)map2.get(charSequence)).zzq();
        charSequence.getClass();
        return (SpannableStringBuilder)charSequence;
    }

    private final void zzj(TreeSet treeSet, boolean bl2) {
        Object object = this.zza;
        String string2 = "p";
        boolean bl3 = string2.equals(object);
        String string3 = "div";
        Object object2 = string3.equals(object);
        if (bl2 || bl3 || object2 && (object = this.zzh) != null) {
            long l2;
            long l3 = this.zzd;
            long l4 = -9223372036854775807L;
            long l7 = l3 - l4;
            object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2) {
                object = l3;
                treeSet.add(object);
            }
            if (object2 = (l2 = (l3 = this.zze) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) {
                object = l3;
                treeSet.add(object);
            }
        }
        if ((object = this.zzm) != null) {
            Object object3;
            int n3;
            object2 = false;
            object = null;
            string3 = null;
            for (int i3 = 0; i3 < (n3 = (object3 = this.zzm).size()); ++i3) {
                object3 = (zzams)this.zzm.get(i3);
                boolean bl4 = true;
                if (!bl2 && !bl3) {
                    bl4 = false;
                }
                super.zzj(treeSet, bl4);
            }
        }
    }

    private final void zzk(long l2, String string2, List list) {
        int n3;
        String string3;
        boolean bl2;
        Object object = "";
        String string4 = this.zzg;
        boolean n32 = ((String)object).equals(string4);
        if (!n32) {
            string2 = this.zzg;
        }
        boolean bl3 = this.zzg(l2);
        string4 = null;
        if (bl3 && (bl2 = (string3 = "div").equals(object = this.zza)) && (object = this.zzh) != null) {
            Pair pair = new Pair((Object)string2, object);
            list.add(pair);
            return;
        }
        for (int i3 = 0; i3 < (n3 = this.zza()); ++i3) {
            object = this.zzd(i3);
            super.zzk(l2, string2, list);
        }
    }

    /*
     * Unable to fully structure code
     */
    private final void zzl(long var1_1, Map var3_2, Map var4_3, String var5_4, Map var6_5) {
        block47: {
            var7_6 = this;
            var8_7 = var3_2;
            var9_8 = -1;
            var10_9 = this.zzg(var1_1);
            if (var10_9 == 0) break block47;
            var12_11 = "";
            var11_10 = this.zzg;
            var10_9 = var12_11.equals(var11_10);
            if (var10_9 == 0) {
                var11_10 = this.zzg;
                var13_12 = var11_10;
            } else {
                var13_12 = var5_4;
            }
            var11_10 = var7_6.zzl.entrySet().iterator();
            while ((var14_13 = var11_10.hasNext()) != 0) {
                block44: {
                    block46: {
                        block45: {
                            block51: {
                                block48: {
                                    block50: {
                                        block49: {
                                            var16_15 = var7_6.zzk;
                                            var12_11 = (Map.Entry)var11_10.next();
                                            var15_14 = (String)var12_11.getKey();
                                            var17_16 = var16_15.containsKey(var15_14);
                                            if (var17_16 != 0) {
                                                var16_15 = (Integer)var7_6.zzk.get(var15_14);
                                                var17_16 = var16_15.intValue();
                                            } else {
                                                var17_16 = 0;
                                                var16_15 = null;
                                            }
                                            if (var17_16 == (var14_13 = (var12_11 = (Integer)var12_11.getValue()).intValue())) continue;
                                            var15_14 = (zzeg)var6_5.get(var15_14);
                                            var15_14.getClass();
                                            var18_17 = (zzamw)var4_3.get(var13_12);
                                            var18_17.getClass();
                                            var19_18 = var7_6.zzf;
                                            var20_19 = var7_6.zzj;
                                            var19_18 = zzamx.zza(var19_18, (String[])var20_19, var8_7);
                                            var20_19 = (SpannableStringBuilder)var15_14.zzq();
                                            if (var20_19 == null) {
                                                var20_19 = new SpannableStringBuilder();
                                                var15_14.zzl((CharSequence)var20_19);
                                            }
                                            if (var19_18 == null) continue;
                                            var21_20 = var7_6.zzi;
                                            var22_21 = var19_18.zzh();
                                            var23_22 = 33;
                                            var24_23 = 4.6E-44f;
                                            if (var22_21 != var9_8) {
                                                var9_8 = var19_18.zzh();
                                                var25_24 = new StyleSpan(var9_8);
                                                var20_19.setSpan(var25_24, var17_16, var14_13, var23_22);
                                            }
                                            if ((var9_8 = (int)var19_18.zzI()) != 0) {
                                                var26_25 = new StrikethroughSpan();
                                                var20_19.setSpan(var26_25, var17_16, var14_13, var23_22);
                                            }
                                            if ((var9_8 = (int)var19_18.zzJ()) != 0) {
                                                var26_25 = new UnderlineSpan();
                                                var20_19.setSpan(var26_25, var17_16, var14_13, var23_22);
                                            }
                                            if ((var9_8 = (int)var19_18.zzH()) != 0) {
                                                var22_21 = var19_18.zzd();
                                                var26_25 = new ForegroundColorSpan(var22_21);
                                                zzeo.zza((Spannable)var20_19, var26_25, var17_16, var14_13, var23_22);
                                            }
                                            if ((var9_8 = (int)var19_18.zzG()) != 0) {
                                                var22_21 = var19_18.zzc();
                                                var26_25 = new BackgroundColorSpan(var22_21);
                                                zzeo.zza((Spannable)var20_19, var26_25, var17_16, var14_13, var23_22);
                                            }
                                            if ((var26_25 = var19_18.zzD()) != null) {
                                                var25_24 = var19_18.zzD();
                                                var26_25 = new TypefaceSpan((String)var25_24);
                                                zzeo.zza((Spannable)var20_19, var26_25, var17_16, var14_13, var23_22);
                                            }
                                            if ((var26_25 = var19_18.zzk()) == null) break block48;
                                            var26_25 = var19_18.zzk();
                                            var26_25.getClass();
                                            var23_22 = var26_25.zza;
                                            var22_21 = -1;
                                            var27_26 = 0.0f / 0.0f;
                                            if (var23_22 != var22_21) break block49;
                                            var22_21 = var18_17.zzj;
                                            var28_27 = 2;
                                            var29_28 = 2.8E-45f;
                                            if (var22_21 == var28_27) ** GOTO lbl-1000
                                            var28_27 = 1;
                                            var29_28 = 1.4E-45f;
                                            if (var22_21 == var28_27) lbl-1000:
                                            // 2 sources

                                            {
                                                var22_21 = 3;
                                                var27_26 = 4.2E-45f;
                                            } else {
                                                var22_21 = 1;
                                                var27_26 = 1.4E-45f;
                                            }
                                            var23_22 = var22_21;
                                            var24_23 = var27_26;
                                            var22_21 = 1;
                                            var27_26 = 1.4E-45f;
                                            break block50;
                                        }
                                        var22_21 = var26_25.zzb;
                                    }
                                    var9_8 = var26_25.zzc;
                                    var28_27 = -2;
                                    var29_28 = 0.0f / 0.0f;
                                    if (var9_8 == var28_27) {
                                        var9_8 = 1;
                                    }
                                    var18_17 = new zzep(var23_22, var22_21, var9_8);
                                    var9_8 = 33;
                                    zzeo.zza((Spannable)var20_19, var18_17, var17_16, var14_13, var9_8);
                                }
                                var9_8 = var19_18.zzg();
                                var22_21 = 2;
                                var27_26 = 2.8E-45f;
                                if (var9_8 == var22_21) break block51;
                                var22_21 = 3;
                                var27_26 = 4.2E-45f;
                                if (var9_8 != var22_21) {
                                    var22_21 = 4;
                                    var27_26 = 5.6E-45f;
                                    if (var9_8 != var22_21) lbl-1000:
                                    // 3 sources

                                    {
                                        while (true) {
                                            var30_29 = var11_10;
                                            while (true) {
                                                var9_8 = -1;
                                                break block44;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                }
                                var26_25 = new zzamq();
                                var22_21 = 33;
                                var27_26 = 4.6E-44f;
                                var20_19.setSpan(var26_25, var17_16, var14_13, var22_21);
                                ** GOTO lbl-1000
                            }
                            while (var21_20 != null) {
                                var25_24 = var21_20.zzf;
                                var18_17 = var21_20.zzj;
                                if ((var25_24 = zzamx.zza((zzamy)var25_24, (String[])var18_17, var8_7)) != null) {
                                    var22_21 = var25_24.zzg();
                                    var28_27 = 1;
                                    var29_28 = 1.4E-45f;
                                    if (var22_21 == var28_27) break block45;
                                }
                                var21_20 = var21_20.zzi;
                            }
                            var31_30 = false;
                            var21_20 = null;
                        }
                        if (var21_20 != null) ** break;
                        ** continue;
                        var25_24 = new ArrayDeque();
                        var25_24.push(var21_20);
                        while ((var28_27 = (int)var25_24.isEmpty()) == 0) {
                            var18_17 = (zzams)var25_24.pop();
                            var32_31 = var18_17.zzf;
                            var26_25 = var18_17.zzj;
                            if ((var26_25 = zzamx.zza((zzamy)var32_31, (String[])var26_25, var8_7)) != null) {
                                var9_8 = var26_25.zzg();
                                var23_22 = 3;
                                var24_23 = 4.2E-45f;
                                if (var9_8 == var23_22) {
                                    var30_29 = var11_10;
                                    var26_25 = var18_17;
                                    break block46;
                                }
                            }
                            var9_8 = var18_17.zza();
                            var23_22 = -1;
                            var24_23 = 0.0f / 0.0f;
                            var9_8 += var23_22;
                            while (var9_8 >= 0) {
                                var30_29 = var11_10;
                                var11_10 = var18_17.zzd(var9_8);
                                var25_24.push(var11_10);
                                var9_8 += var23_22;
                                var11_10 = var30_29;
                            }
                        }
                        var30_29 = var11_10;
                        var9_8 = 0;
                        var26_25 = null;
                    }
                    if (var26_25 == null) ** continue;
                    var10_9 = var26_25.zza();
                    var22_21 = 1;
                    var27_26 = 1.4E-45f;
                    if (var10_9 != var22_21) ** GOTO lbl-1000
                    var10_9 = 0;
                    var33_32 = 0.0f;
                    var11_10 = null;
                    var25_24 = var26_25.zzd((int)0).zzb;
                    if (var25_24 != null) {
                        var11_10 = var26_25.zzd((int)0).zzb;
                        var22_21 = zzgd.zza;
                        var25_24 = var26_25.zzf;
                        var26_25 = var26_25.zzj;
                        if ((var26_25 = zzamx.zza((zzamy)var25_24, (String[])var26_25, var8_7)) != null) {
                            var22_21 = var26_25.zzf();
                            var9_8 = -1;
                        } else {
                            var9_8 = -1;
                            var22_21 = -1;
                            var27_26 = 0.0f / 0.0f;
                        }
                        if (var22_21 == var9_8) {
                            var18_17 = var21_20.zzf;
                            var32_31 = var21_20.zzj;
                            if ((var18_17 = zzamx.zza((zzamy)var18_17, var32_31, var8_7)) != null) {
                                var22_21 = var18_17.zzf();
                            }
                        }
                        var18_17 = new zzen((String)var11_10, var22_21);
                        var10_9 = 33;
                        var33_32 = 4.6E-44f;
                        var20_19.setSpan(var18_17, var17_16, var14_13, var10_9);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var9_8 = -1;
                        var11_10 = "TtmlRenderUtil";
                        var25_24 = "Skipping rubyText node without exactly one text child.";
                        zzfk.zze((String)var11_10, (String)var25_24);
                    }
                }
                var10_9 = var19_18.zzF();
                if (var10_9 != 0) {
                    var11_10 = new zzem();
                    var22_21 = 33;
                    var27_26 = 4.6E-44f;
                    zzeo.zza((Spannable)var20_19, var11_10, var17_16, var14_13, var22_21);
                }
                var10_9 = var19_18.zze();
                var22_21 = 1120403456;
                var27_26 = 100.0f;
                var28_27 = 1;
                var29_28 = 1.4E-45f;
                if (var10_9 != var28_27) {
                    var28_27 = 2;
                    var29_28 = 2.8E-45f;
                    if (var10_9 != var28_27) {
                        var28_27 = 3;
                        var29_28 = 4.2E-45f;
                        if (var10_9 == var28_27) {
                            var29_28 = var19_18.zza() / var27_26;
                            var11_10 = new RelativeSizeSpan(var29_28);
                            var28_27 = 33;
                            var29_28 = 4.6E-44f;
                            zzeo.zza((Spannable)var20_19, var11_10, var17_16, var14_13, var28_27);
                        }
                    } else {
                        var28_27 = 33;
                        var29_28 = 4.6E-44f;
                        var24_23 = var19_18.zza();
                        var11_10 = new RelativeSizeSpan(var24_23);
                        zzeo.zza((Spannable)var20_19, var11_10, var17_16, var14_13, var28_27);
                    }
                } else {
                    var28_27 = 33;
                    var29_28 = 4.6E-44f;
                    var24_23 = var19_18.zza();
                    var23_22 = (int)var24_23;
                    var31_30 = true;
                    var11_10 = new AbsoluteSizeSpan(var23_22, var31_30);
                    zzeo.zza((Spannable)var20_19, var11_10, var17_16, var14_13, var28_27);
                }
                var11_10 = var7_6.zza;
                var12_11 = "p";
                var10_9 = (int)var12_11.equals(var11_10);
                if (var10_9 != 0) {
                    var33_32 = var19_18.zzb();
                    var14_13 = 0x7F7FFFFF;
                    var34_33 = 3.4028235E38f;
                    cfr_temp_0 = var33_32 - var34_33;
                    var10_9 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                    if (var10_9 != 0) {
                        var33_32 = var19_18.zzb();
                        var14_13 = -1028390912;
                        var34_33 = -90.0f;
                        var33_32 = var33_32 * var34_33 / var27_26;
                        var15_14.zzj(var33_32);
                    }
                    if ((var11_10 = var19_18.zzj()) != null) {
                        var11_10 = var19_18.zzj();
                        var15_14.zzm((Layout.Alignment)var11_10);
                    }
                    if ((var11_10 = var19_18.zzi()) != null) {
                        var11_10 = var19_18.zzi();
                        var15_14.zzg((Layout.Alignment)var11_10);
                    }
                }
                var11_10 = var30_29;
            }
            var10_9 = 0;
            var33_32 = 0.0f;
            var11_10 = null;
            var24_23 = 0.0f;
            var32_31 = null;
            for (var23_22 = 0; var23_22 < (var9_8 = this.zza()); var23_22 += var9_8) {
                var26_25 = var7_6.zzd(var23_22);
                var25_24 = var3_2;
                var15_14 = var4_3;
                var16_15 = var13_12;
                var18_17 = var6_5;
                var26_25.zzl(var1_1, var3_2, var4_3, var13_12, var6_5);
                var9_8 = 1;
            }
        }
    }

    private final void zzm(long l2, boolean n3, String string2, Map map2) {
        this.zzk.clear();
        this.zzl.clear();
        Object object = "metadata";
        Object object2 = this.zza;
        boolean n4 = ((String)object).equals(object2);
        if (!n4) {
            boolean bl2;
            object2 = "";
            object = this.zzg;
            boolean bl3 = ((String)object2).equals(object);
            if (!bl3) {
                string2 = this.zzg;
            }
            if ((bl2 = this.zzc) && n3 != 0) {
                SpannableStringBuilder spannableStringBuilder = zzams.zzi(string2, map2);
                String string3 = this.zzb;
                string3.getClass();
                spannableStringBuilder.append((CharSequence)string3);
                return;
            }
            object = this.zza;
            object2 = "br";
            boolean bl4 = ((String)object2).equals(object);
            int n7 = 10;
            if (bl4 && n3 != 0) {
                zzams.zzi(string2, map2).append((char)n7);
                return;
            }
            boolean bl5 = this.zzg(l2);
            if (bl5) {
                int n8;
                Object object3;
                int n10;
                String string4;
                int n14;
                object = map2.entrySet().iterator();
                while ((n14 = object.hasNext()) != 0) {
                    object2 = (Map.Entry)object.next();
                    HashMap hashMap = this.zzk;
                    string4 = (String)object2.getKey();
                    object2 = ((zzeg)object2.getValue()).zzq();
                    object2.getClass();
                    n14 = object2.length();
                    object2 = n14;
                    hashMap.put(string4, object2);
                }
                object = this.zza;
                object2 = "p";
                boolean bl6 = ((String)object2).equals(object);
                for (int i3 = 0; i3 < (n10 = this.zza()); ++i3) {
                    boolean bl7;
                    object = this.zzd(i3);
                    n14 = 1;
                    if (n3 != 0 || bl6) {
                        bl7 = true;
                    } else {
                        bl7 = false;
                        string4 = null;
                    }
                    super.zzm(l2, bl7, string2, map2);
                }
                if (bl6) {
                    int n15;
                    object3 = zzams.zzi(string2, map2);
                    n8 = object3.length();
                    while ((n8 += -1) >= 0 && (n3 = (int)object3.charAt(n8)) == (n15 = 32)) {
                    }
                    if (n8 >= 0 && (n8 = (int)object3.charAt(n8)) != n7) {
                        object3.append((char)n7);
                    }
                }
                object3 = map2.entrySet().iterator();
                while ((n8 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    Object object4 = (Map.Entry)object3.next();
                    HashMap hashMap = this.zzl;
                    string2 = (String)object4.getKey();
                    object4 = ((zzeg)object4.getValue()).zzq();
                    object4.getClass();
                    n8 = object4.length();
                    object4 = n8;
                    hashMap.put(string2, object4);
                }
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzams zzd(int n3) {
        List list = this.zzm;
        if (list != null) {
            return (zzams)list.get(n3);
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
        throw indexOutOfBoundsException;
    }

    public final List zze(long l2, Map map2, Map map3, Map object) {
        boolean bl2;
        int n3;
        int n4;
        float f5;
        Object object2;
        Object object3;
        int n7;
        Object object4 = new ArrayList();
        Object object5 = this.zzg;
        this.zzk(l2, (String)object5, (List)object4);
        object5 = new TreeMap();
        int n8 = 0;
        Object object6 = this.zzg;
        zzamq[] zzamqArray = this;
        Object object7 = object5;
        this.zzm(l2, false, (String)object6, (Map)object5);
        object7 = this.zzg;
        Object object8 = map2;
        object6 = map3;
        this.zzl(l2, map2, map3, (String)object7, (Map)object5);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n10 = ((ArrayList)object4).size();
        map2 = null;
        zzamqArray = null;
        for (n7 = 0; n7 < n10; ++n7) {
            object3 = (Pair)((ArrayList)object4).get(n7);
            object2 = ((Pair)object3).second;
            if ((object2 = (String)object.get(object2)) == null) continue;
            object2 = Base64.decode((String)object2, (int)0);
            n8 = ((Object)object2).length;
            object2 = BitmapFactory.decodeByteArray((byte[])object2, (int)0, (int)n8);
            object3 = ((Pair)object3).first;
            object3 = (zzamw)map3.get(object3);
            object3.getClass();
            object8 = new zzeg();
            ((zzeg)object8).zzc((Bitmap)object2);
            f5 = ((zzamw)object3).zzb;
            ((zzeg)object8).zzh(f5);
            ((zzeg)object8).zzi(0);
            f5 = ((zzamw)object3).zzc;
            ((zzeg)object8).zze(f5, 0);
            n4 = ((zzamw)object3).zze;
            ((zzeg)object8).zzf(n4);
            f5 = ((zzamw)object3).zzf;
            ((zzeg)object8).zzk(f5);
            f5 = ((zzamw)object3).zzg;
            ((zzeg)object8).zzd(f5);
            n3 = ((zzamw)object3).zzj;
            ((zzeg)object8).zzo(n3);
            object3 = ((zzeg)object8).zzp();
            arrayList.add(object3);
        }
        Iterator iterator = ((TreeMap)object5).entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            int n14;
            object = iterator.next();
            object4 = object.getKey();
            object4 = (zzamw)map3.get(object4);
            object4.getClass();
            object = (zzeg)object.getValue();
            object5 = ((zzeg)object).zzq();
            object5.getClass();
            object5 = (SpannableStringBuilder)object5;
            n7 = object5.length();
            object3 = zzamq.class;
            zzamqArray = (zzamq[])object5.getSpans(0, n7, (Class)object3);
            n3 = zzamqArray.length;
            f5 = 0.0f;
            object2 = null;
            for (n4 = 0; n4 < n3; ++n4) {
                object8 = zzamqArray[n4];
                n14 = object5.getSpanStart(object8);
                n8 = object5.getSpanEnd(object8);
                object7 = "";
                object5.replace(n14, n8, (CharSequence)object7);
            }
            n7 = 0;
            zzamqArray = null;
            while (true) {
                n3 = object5.length();
                n4 = 32;
                f5 = 4.5E-44f;
                if (n7 >= n3) break;
                n3 = n7 + 1;
                n8 = object5.charAt(n7);
                if (n8 == n4) {
                    for (n8 = n3; n8 < (n14 = object5.length()) && (n14 = (int)object5.charAt(n8)) == n4; ++n8) {
                    }
                    if ((n8 -= n3) > 0) {
                        object5.delete(n7, n8 += n7);
                    }
                }
                n7 = n3;
            }
            n7 = object5.length();
            if (n7 > 0 && (n7 = (int)object5.charAt(0)) == n4) {
                n7 = 1;
                object5.delete(0, n7);
            }
            n7 = 0;
            zzamqArray = null;
            while (true) {
                n3 = object5.length() + -1;
                n8 = 10;
                if (n7 >= n3) break;
                n3 = n7 + 1;
                n14 = object5.charAt(n7);
                if (n14 == n8 && (n8 = (int)object5.charAt(n3)) == n4) {
                    object5.delete(n3, n7 += 2);
                }
                n7 = n3;
            }
            n7 = object5.length();
            if (n7 > 0) {
                n7 = object5.length() + -1;
                if ((n7 = (int)object5.charAt(n7)) == n4) {
                    n7 = object5.length() + -1;
                    n3 = object5.length();
                    object5.delete(n7, n3);
                }
            }
            n7 = 0;
            zzamqArray = null;
            while (n7 < (n3 = object5.length() + -1)) {
                n3 = n7 + 1;
                n14 = object5.charAt(n7);
                if (n14 == n4 && (n14 = (int)object5.charAt(n3)) == n8) {
                    object5.delete(n7, n3);
                }
                n7 = n3;
            }
            n7 = object5.length();
            if (n7 > 0) {
                n7 = object5.length() + -1;
                if ((n7 = (int)object5.charAt(n7)) == n8) {
                    n7 = object5.length() + -1;
                    n3 = object5.length();
                    object5.delete(n7, n3);
                }
            }
            float f6 = ((zzamw)object4).zzc;
            n7 = ((zzamw)object4).zzd;
            ((zzeg)object).zze(f6, n7);
            int n15 = ((zzamw)object4).zze;
            ((zzeg)object).zzf(n15);
            f6 = ((zzamw)object4).zzb;
            ((zzeg)object).zzh(f6);
            f6 = ((zzamw)object4).zzf;
            ((zzeg)object).zzk(f6);
            f6 = ((zzamw)object4).zzi;
            n7 = ((zzamw)object4).zzh;
            ((zzeg)object).zzn(f6, n7);
            int n16 = ((zzamw)object4).zzj;
            ((zzeg)object).zzo(n16);
            object = ((zzeg)object).zzp();
            arrayList.add(object);
        }
        return arrayList;
    }

    public final void zzf(zzams zzams2) {
        ArrayList arrayList = this.zzm;
        if (arrayList == null) {
            this.zzm = arrayList = new ArrayList();
        }
        this.zzm.add(zzams2);
    }

    public final boolean zzg(long l2) {
        boolean bl2;
        block8: {
            long l3;
            long l4;
            long l7;
            long l8;
            long l12;
            long l14;
            Object object;
            long l15;
            long l16;
            block7: {
                l16 = this.zzd;
                bl2 = true;
                l15 = -9223372036854775807L;
                long l17 = l16 - l15;
                object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                if (object != false) break block7;
                l16 = this.zze;
                long l18 = l16 - l15;
                object = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                if (object == false) break block8;
                l16 = l15;
            }
            if (!((object = l16 == l2 ? 0 : (l16 < l2 ? -1 : 1)) <= 0 && (l14 = (l12 = (l8 = this.zze) - l15) == 0L ? 0 : (l12 < 0L ? -1 : 1)) == false || (l7 = l16 == l15 ? 0 : (l16 < l15 ? -1 : 1)) == false && (l4 = (l3 = l2 - (l16 = this.zze)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0)) {
                if (object <= 0) {
                    l15 = this.zze;
                    long l19 = l2 - l15;
                    Object object2 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
                    if (object2 >= 0) {
                        return false;
                    }
                } else {
                    bl2 = false;
                }
            }
        }
        return bl2;
    }

    public final long[] zzh() {
        boolean bl2;
        Object object = new TreeSet();
        int n3 = 0;
        this.zzj((TreeSet)object, false);
        int n4 = ((TreeSet)object).size();
        long[] lArray = new long[n4];
        object = ((TreeSet)object).iterator();
        while (bl2 = object.hasNext()) {
            Long l2 = (Long)object.next();
            long l3 = l2;
            int n7 = n3 + 1;
            lArray[n3] = l3;
            n3 = n7;
        }
        return lArray;
    }
}

