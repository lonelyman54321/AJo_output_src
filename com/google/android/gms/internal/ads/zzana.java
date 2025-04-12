/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 */
package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzev;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import java.nio.charset.Charset;
import java.util.List;

public final class zzana
implements zzalv {
    private final zzfu zza;
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzana(List object) {
        int n3;
        Object object2;
        Object object3 = new zzfu();
        this.zza = object3;
        Object object4 = object.size();
        int n4 = 1062836634;
        float f5 = 0.85f;
        String string2 = "sans-serif";
        boolean bl2 = false;
        int n7 = 1;
        if (object4 == n7 && ((object4 = ((Object)(object3 = (Object)((byte[])object.get(0)))).length) == (object2 = 48) || (object4 = ((Object)(object3 = (Object)((byte[])object.get(0)))).length) == (object2 = 53))) {
            object = (byte[])object.get(0);
            float f6 = 3.4E-44f;
            this.zzc = object2 = (Object)object[24];
            object2 = object[26] & 0xFF;
            int n8 = object[27] & 0xFF;
            int n10 = object[28] & 0xFF;
            int n14 = object[29] & 0xFF;
            object4 = object2 << 24;
            object2 = n8 << 16;
            object4 |= object2;
            object2 = n10 << 8;
            this.zzd = object4 = object4 | object2 | n14;
            object4 = ((Object)object).length + -43;
            String string3 = "Serif";
            object2 = 43;
            object3 = zzgd.zzB((byte[])object, object2, object4);
            if (n7 == (object4 = (Object)string3.equals(object3))) {
                string2 = "serif";
            }
            this.zze = string2;
            f6 = 3.5E-44f;
            this.zzg = object4 = (Object)(object[25] * 20);
            int n15 = object[0] & 0x20;
            if (n15 != 0) {
                bl2 = true;
            }
            this.zzb = bl2;
            if (bl2) {
                n4 = (object[10] & 0xFF) << 8;
                int n16 = object[11] & 0xFF;
                f6 = object4;
                float f7 = Math.min((float)(n16 | n4) / f6, 0.95f);
                this.zzf = f7 = Math.max(0.0f, f7);
                return;
            }
            this.zzf = f5;
            return;
        }
        this.zzc = 0;
        this.zzd = n3 = -1;
        this.zze = string2;
        this.zzb = false;
        this.zzf = f5;
        this.zzg = n3;
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int n3, int n4, int n7, int n8, int n10) {
        if (n3 != n4) {
            n4 = (n3 & 0xFF) << 24;
            n3 >>>= 8;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n3 |= n4);
            n3 = n10 | 0x21;
            spannableStringBuilder.setSpan((Object)foregroundColorSpan, n7, n8, n3);
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void zzc(SpannableStringBuilder var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block7: {
            block6: {
                if (var1_1 == var2_2) break block7;
                var2_2 = var5_5 | 33;
                var5_5 = var1_1 & 1;
                var6_6 = var1_1 & 2;
                var7_7 = 1;
                if (var5_5 == 0) ** GOTO lbl17
                if (var6_6 != 0) {
                    var9_11 = 3;
                    var8_8 = new StyleSpan(var9_11);
                    var0.setSpan((Object)var8_8, var3_3, var4_4, var2_2);
                } else {
                    var8_9 = new StyleSpan(var7_7);
                    var0.setSpan((Object)var8_9, var3_3, var4_4, var2_2);
                    while (true) {
                        var7_7 = 0;
                        break block6;
                        break;
                    }
lbl17:
                    // 1 sources

                    if (var6_6 == 0) ** continue;
                    var9_12 = 2;
                    var8_10 = new StyleSpan(var9_12);
                    var0.setSpan((Object)var8_10, var3_3, var4_4, var2_2);
                }
            }
            if ((var1_1 &= 4) == 0) {
                if (var5_5 == 0 && var7_7 == 0) {
                    var10_13 = new StyleSpan(0);
                    var0.setSpan((Object)var10_13, var3_3, var4_4, var2_2);
                    return;
                }
            } else {
                var10_14 = new UnderlineSpan();
                var0.setSpan((Object)var10_14, var3_3, var4_4, var2_2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(byte[] byArray, int n3, int n4, zzalu zzalu2, zzev zzev2) {
        float f5;
        int n7;
        Object object;
        int n8;
        zzana zzana2 = this;
        int n10 = n3;
        zzev zzev3 = zzev2;
        int n14 = n3 + n4;
        Object object2 = this.zza;
        Object object3 = byArray;
        ((zzfu)object2).zzI(byArray, n14);
        Object object4 = this.zza;
        ((zzfu)object4).zzK(n3);
        Object object5 = this.zza;
        n14 = ((zzfu)object5).zzb();
        int n15 = 1;
        float f6 = 0.0f;
        object3 = null;
        int n16 = 2;
        if (n14 >= n16) {
            n14 = 1;
        } else {
            n14 = 0;
            object4 = null;
        }
        zzeq.zzd(n14 != 0);
        n14 = ((zzfu)object5).zzq();
        if (n14 == 0) {
            object5 = "";
        } else {
            n8 = ((zzfu)object5).zzd();
            object = ((zzfu)object5).zzB();
            n7 = ((zzfu)object5).zzd() - n8;
            if (object == null) {
                object = zzfxs.zzc;
            }
            object5 = ((zzfu)object5).zzA(n14 -= n7, (Charset)object);
        }
        n14 = (int)(((String)object5).isEmpty() ? 1 : 0);
        if (n14 != 0) {
            object = zzgbc.zzm();
            long l2 = -9223372036854775807L;
            Object object6 = object5;
            object5 = new zzaln((List)object, l2, l2);
            zzev3.zza(object5);
            return;
        }
        object4 = new SpannableStringBuilder((CharSequence)object5);
        int n17 = zzana2.zzc;
        int n18 = object4.length();
        int n19 = 0xFF0000;
        zzana.zzc((SpannableStringBuilder)object4, n17, 0, 0, n18, n19);
        n17 = zzana2.zzd;
        n18 = object4.length();
        int n20 = -1;
        zzana.zzb((SpannableStringBuilder)object4, n17, n20, 0, n18, n19);
        object5 = zzana2.zze;
        n8 = object4.length();
        object = "sans-serif";
        if (object5 != object) {
            object = new TypefaceSpan((String)object5);
            n10 = 16711713;
            f5 = 2.3418098E-38f;
            object4.setSpan(object, 0, n8, n10);
        }
        f5 = zzana2.zzf;
        while (true) {
            block21: {
                block20: {
                    int n21;
                    Object object7;
                    block19: {
                        block18: {
                            zzfu zzfu2;
                            int n22;
                            if ((n22 = (zzfu2 = zzana2.zza).zzb()) < (n7 = 8)) {
                                object2 = new zzeg();
                                ((zzeg)object2).zzl((CharSequence)object4);
                                ((zzeg)object2).zze(f5, 0);
                                ((zzeg)object2).zzf(0);
                                object5 = ((zzeg)object2).zzp();
                                object2 = zzgbc.zzn(object5);
                                long l3 = -9223372036854775807L;
                                object4 = object7;
                                object7 = new zzaln((List)object2, l3, l3);
                                zzev3.zza(object7);
                                return;
                            }
                            n22 = zzfu2.zzd();
                            n8 = zzfu2.zzg();
                            object7 = zzana2.zza;
                            n7 = ((zzfu)object7).zzg();
                            if (n7 != (n21 = 1937013100)) break block18;
                            object7 = zzana2.zza;
                            n7 = ((zzfu)object7).zzb();
                            if (n7 >= n16) {
                                n7 = 1;
                            } else {
                                n7 = 0;
                                object7 = null;
                            }
                            zzeq.zzd(n7 != 0);
                            object7 = zzana2.zza;
                            n7 = ((zzfu)object7).zzq();
                            break block19;
                        }
                        n15 = 1952608120;
                        if (n7 != n15 || (n15 = (int)(zzana2.zzb ? 1 : 0)) == 0) break block20;
                        object5 = zzana2.zza;
                        n10 = ((zzfu)object5).zzb();
                        if (n10 >= (n15 = 2)) {
                            n10 = 1;
                            f5 = Float.MIN_VALUE;
                        } else {
                            n10 = 0;
                            f5 = 0.0f;
                            object5 = null;
                        }
                        zzeq.zzd(n10 != 0);
                        object5 = zzana2.zza;
                        n10 = ((zzfu)object5).zzq();
                        f5 = n10;
                        f6 = zzana2.zzg;
                        f5 = Math.min(f5 / f6, 0.95f);
                        f6 = 0.0f;
                        object3 = null;
                        f5 = Math.max(0.0f, f5);
                        break block21;
                    }
                    for (n21 = 0; n21 < n7; ++n21) {
                        int n24;
                        int n25;
                        Object object8 = zzana2.zza;
                        int n26 = ((zzfu)object8).zzb();
                        n26 = n26 >= (n25 = 12) ? 1 : 0;
                        zzeq.zzd(n26 != 0);
                        n26 = ((zzfu)object8).zzq();
                        n25 = ((zzfu)object8).zzq();
                        ((zzfu)object8).zzL(n16);
                        n17 = ((zzfu)object8).zzm();
                        ((zzfu)object8).zzL(n15);
                        int n27 = ((zzfu)object8).zzg();
                        n20 = object4.length();
                        object2 = "Tx3gParser";
                        object3 = ").";
                        if (n25 > n20) {
                            n20 = object4.length();
                            n24 = n7;
                            object7 = ") to cueText.length() (";
                            String string2 = z41.a("Truncating styl end (", (String)object7, (String)object3, n25, n20);
                            zzfk.zzf((String)object2, string2);
                            n16 = object4.length();
                        } else {
                            n24 = n7;
                            n16 = n25;
                        }
                        if (n26 >= n16) {
                            object7 = "Ignoring styl with start (";
                            object8 = ") >= end (";
                            object3 = z41.a((String)object7, (String)object8, (String)object3, n26, n16);
                            zzfk.zzf((String)object2, (String)object3);
                        } else {
                            n20 = zzana2.zzc;
                            n19 = 0;
                            n18 = n16;
                            zzana.zzc((SpannableStringBuilder)object4, n17, n20, n26, n16, 0);
                            n20 = zzana2.zzd;
                            n17 = n27;
                            zzana.zzb((SpannableStringBuilder)object4, n27, n20, n26, n16, 0);
                        }
                        n7 = n24;
                        n15 = 1;
                        f6 = 0.0f;
                        object3 = null;
                        n16 = 2;
                    }
                }
                n15 = 2;
            }
            object3 = zzana2.zza;
            ((zzfu)object3).zzK(n22 += n8);
            n15 = 1;
            f6 = 0.0f;
            object3 = null;
            n16 = 2;
        }
    }
}

