/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzamm;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgea;
import java.util.Locale;

final class zzamo {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamo(String string2, int n3, Integer n4, Integer n7, float f5, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n8) {
        this.zza = string2;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = n7;
        this.zze = f5;
        this.zzf = bl2;
        this.zzg = bl3;
        this.zzh = bl4;
        this.zzi = bl5;
        this.zzj = n8;
    }

    public static /* bridge */ /* synthetic */ int zza(String string2) {
        return zzamo.zzd(string2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzamo zzb(String var0, zzamm var1_1) {
        block23: {
            block24: {
                block22: {
                    block21: {
                        var2_2 = var0;
                        var3_3 = var1_1;
                        var4_4 = "Failed to parse font size: '";
                        zzeq.zzd(var0.startsWith("Style:"));
                        var5_5 = 8.4E-45f;
                        var6_6 = var0.substring(6);
                        var7_9 /* !! */  = TextUtils.split((String)var6_6, (String)",");
                        var8_10 = var7_9 /* !! */ .length;
                        var9_11 = var1_1.zzk;
                        var10_12 = "'";
                        var11_13 = "SsaStyle";
                        if (var8_10 != var9_11) {
                            var3_3 = Locale.US;
                            var6_6 = fQ2.a("Skipping malformed 'Style:' line (expected ", " values, found ", "): '", var9_11, var8_10);
                            var6_6.append(var0);
                            var6_6.append(var10_12);
                            var6_6 = var6_6.toString();
                            zzfk.zzf(var11_13, (String)var6_6);
                            return null;
                        }
                        try {
                            var8_10 = var1_1.zza;
                            var6_6 = var7_9 /* !! */ [var8_10];
                            var13_15 = var6_6.trim();
                            var8_10 = var1_1.zzb;
                            var14_16 = -1;
                            if (var8_10 == var14_16) break block21;
                            var6_6 = var7_9 /* !! */ [var8_10];
                            var6_6 = var6_6.trim();
                            var15_17 = var8_10 = zzamo.zzd((String)var6_6);
                            break block22;
                        }
                        catch (RuntimeException var6_7) {
                            break block23;
                        }
                    }
                    var15_17 = -1;
                }
                var8_10 = var3_3.zzc;
                if (var8_10 != var14_16) {
                    var6_6 = var7_9 /* !! */ [var8_10];
                    var6_6 = var6_6.trim();
                    var16_18 = var6_6 = zzamo.zzc((String)var6_6);
                } else {
                    var16_18 = null;
                }
                var8_10 = var3_3.zzd;
                if (var8_10 != var14_16) {
                    var6_6 = var7_9 /* !! */ [var8_10];
                    var6_6 = var6_6.trim();
                    var17_19 = var6_6 = zzamo.zzc((String)var6_6);
                } else {
                    var17_19 = null;
                }
                var8_10 = var3_3.zze;
                if (var8_10 != var14_16) {
                    var6_6 = var7_9 /* !! */ [var8_10];
                    var18_20 = var6_6.trim();
                    try {
                        var19_21 = var5_5 = Float.parseFloat(var18_20);
                        break block24;
                    }
                    catch (NumberFormatException var6_8) {
                        var20_22 = var6_8;
                        var6_6 = new StringBuilder(var4_4);
                        var6_6.append(var18_20);
                        var6_6.append(var10_12);
                        var6_6 = var6_6.toString();
                        zzfk.zzg(var11_13, (String)var6_6, var20_22);
                    }
                }
                var19_21 = -3.4028235E38f;
            }
            var8_10 = var3_3.zzf;
            var21_23 = 1;
            if (var8_10 == var14_16) ** GOTO lbl-1000
            var6_6 = var7_9 /* !! */ [var8_10];
            var8_10 = (int)zzamo.zze((String)(var6_6 = var6_6.trim()));
            if (var8_10) {
                var8_10 = 1;
                var5_5 = 1.4E-45f;
            } else lbl-1000:
            // 2 sources

            {
                var8_10 = 0;
                var5_5 = 0.0f;
                var6_6 = null;
            }
            var22_24 = var3_3.zzg;
            if (var22_24 == var14_16) ** GOTO lbl-1000
            var18_20 = var7_9 /* !! */ [var22_24];
            var22_24 = (int)zzamo.zze(var18_20 = var18_20.trim());
            if (var22_24) {
                var23_25 = 1;
            } else lbl-1000:
            // 2 sources

            {
                var23_25 = 0;
            }
            var22_24 = var3_3.zzh;
            if (var22_24 == var14_16) ** GOTO lbl-1000
            var18_20 = var7_9 /* !! */ [var22_24];
            var22_24 = (int)zzamo.zze(var18_20 = var18_20.trim());
            if (var22_24) {
                var24_26 = 1;
                var25_27 = 1.4E-45f;
            } else lbl-1000:
            // 2 sources

            {
                var24_26 = 0;
                var25_27 = 0.0f;
            }
            var22_24 = var3_3.zzi;
            if (var22_24 == var14_16) ** GOTO lbl-1000
            var18_20 = var7_9 /* !! */ [var22_24];
            var22_24 = (int)zzamo.zze(var18_20 = var18_20.trim());
            if (var22_24) {
                var26_28 = 1;
                var27_29 = 1.4E-45f;
            } else lbl-1000:
            // 2 sources

            {
                var26_28 = 0;
                var27_29 = 0.0f;
            }
            var28_30 = var3_3.zzj;
            if (var28_30 == var14_16) ** GOTO lbl125
            var3_3 = var7_9 /* !! */ [var28_30];
            var3_3 = var3_3.trim();
            try {
                var7_9 /* !! */  = var3_3.trim();
                var29_31 = Integer.parseInt((String)var7_9 /* !! */ );
                if (var29_31 == var21_23 || var29_31 == (var21_23 = 3)) ** GOTO lbl126
lbl118:
                // 2 sources

                while (true) {
                    var4_4 = "Ignoring unknown BorderStyle: ";
                    break;
                }
            }
            catch (NumberFormatException v0) {
                ** continue;
            }
            {
                var3_3 = String.valueOf(var3_3);
                var3_3 = var4_4.concat((String)var3_3);
                zzfk.zzf(var11_13, (String)var3_3);
lbl125:
                // 2 sources

                var29_31 = -1;
lbl126:
                // 2 sources

                var22_24 = var8_10;
                var30_32 = var23_25;
                var23_25 = var24_26;
                var24_26 = var26_28;
                var25_27 = var27_29;
                var26_28 = var29_31;
                return new zzamo(var13_15, var15_17, (Integer)var16_18, (Integer)var17_19, var19_21, (boolean)var8_10, (boolean)var30_32, (boolean)var23_25, (boolean)var24_26, var29_31);
            }
        }
        var3_3 = new StringBuilder("Skipping malformed 'Style:' line: '");
        var3_3.append(var2_2);
        var3_3.append(var10_12);
        var2_2 = var3_3.toString();
        zzfk.zzg(var11_13, var2_2, var6_7);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Integer zzc(String string2) {
        IllegalArgumentException illegalArgumentException2;
        block6: {
            long l2;
            int n3;
            int n4;
            String string3;
            block5: {
                block4: {
                    string3 = "&H";
                    try {
                        n4 = string2.startsWith(string3);
                        n3 = 16;
                        if (n4 == 0) break block4;
                        n4 = 2;
                        string3 = string2.substring(n4);
                        l2 = Long.parseLong(string3, n3);
                        break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException2) {
                        break block6;
                    }
                }
                l2 = Long.parseLong(string2);
            }
            long l3 = 0xFFFFFFFFL;
            n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n4 <= 0) {
                n4 = 1;
            } else {
                n4 = 0;
                string3 = null;
            }
            zzeq.zzd(n4 != 0);
            l3 = l2 >> 24;
            long l4 = l2 >> n3;
            long l7 = l2 >> 8;
            long l8 = 255L;
            int n7 = zzgea.zzb(l3 & l8 ^ l8);
            n4 = zzgea.zzb(l4 & l8);
            n3 = zzgea.zzb(l7 & l8);
            int n8 = zzgea.zzb(l2 &= l8);
            return Color.argb((int)n7, (int)n8, (int)n3, (int)n4);
        }
        StringBuilder stringBuilder = new StringBuilder("Failed to parse color expression: '");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        string2 = stringBuilder.toString();
        zzfk.zzg("SsaStyle", string2, illegalArgumentException2);
        return null;
    }

    private static int zzd(String string2) {
        String string3;
        try {
            string3 = string2.trim();
        }
        catch (NumberFormatException numberFormatException) {}
        int n3 = Integer.parseInt(string3);
        switch (n3) {
            default: {
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return n3;
            }
        }
        LO1.c(string2, "Ignoring unknown alignment: ", "SsaStyle");
        return -1;
    }

    private static boolean zze(String string2) {
        try {
            int n3;
            int n4 = Integer.parseInt(string2);
            int n7 = 1;
            if (n4 != n7 && n4 != (n3 = -1)) {
                return false;
            }
            return n7 != 0;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder("Failed to parse boolean value: '");
            stringBuilder.append(string2);
            stringBuilder.append("'");
            string2 = stringBuilder.toString();
            zzfk.zzg("SsaStyle", string2, numberFormatException);
            return false;
        }
    }
}

