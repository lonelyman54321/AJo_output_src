/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import com.google.android.gms.internal.ads.zzamo;
import com.google.android.gms.internal.ads.zzfk;
import java.util.Locale;
import java.util.regex.Pattern;

final class zzamn {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;
    public final int zza;
    public final PointF zzb;

    static {
        String string2 = "\\s*\\d+(?:\\.\\d+)?\\s*";
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        Locale locale = Locale.US;
        zzd = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", objectArray));
        Object[] objectArray2 = new Object[n3];
        objectArray2[0] = string2;
        zze = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", objectArray2));
        zzf = Pattern.compile("\\\\an(\\d+)");
    }

    private zzamn(int n3, PointF pointF) {
        this.zza = n3;
        this.zzb = pointF;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzamn zza(String var0) {
        var0 = zzamn.zzc.matcher((CharSequence)var0);
        var1_1 = -1;
        var2_2 = null;
        var3_3 = -1;
        block5: while (true) {
            block16: {
                if ((var4_4 = var0.find()) == 0) {
                    return new zzamn(var3_3, (PointF)var2_2);
                }
                var4_4 = 1;
                var5_5 = var0.group(var4_4);
                var5_5.getClass();
                var6_6 = zzamn.zzd;
                var6_6 = var6_6.matcher((CharSequence)var5_5);
                var7_7 = zzamn.zze;
                var7_7 = var7_7.matcher((CharSequence)var5_5);
                var8_8 = var6_6.find();
                var9_9 = var7_7.find();
                var10_10 = 2;
                if (!var8_8) break block16;
                if (var9_9) {
                    var7_7 = "SsaStyle.Overrides";
                    var11_11 /* !! */  = new StringBuilder();
                    var12_12 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='";
                    var11_11 /* !! */ .append(var12_12);
                    var11_11 /* !! */ .append((String)var5_5);
                    var12_12 = "'";
                    var11_11 /* !! */ .append(var12_12);
                    var11_11 /* !! */  = var11_11 /* !! */ .toString();
                    zzfk.zze((String)var7_7, (String)var11_11 /* !! */ );
                }
                var7_7 = var6_6.group(var4_4);
                var6_6 = var6_6.group(var10_10);
                ** GOTO lbl43
            }
            if (var9_9) {
                var6_6 = var7_7.group(var4_4);
                var13_13 = var7_7.group(var10_10);
                var7_7 = var6_6;
                var6_6 = var13_13;
lbl43:
                // 2 sources

                if (var7_7 == null) {
                    throw null;
                }
                var7_7 = var7_7.trim();
                var14_14 = Float.parseFloat((String)var7_7);
                if (var6_6 == null) {
                    throw null;
                }
                var6_6 = var6_6.trim();
                var15_15 = Float.parseFloat((String)var6_6);
                var11_11 /* !! */  = new PointF(var14_14, var15_15);
            } else {
                var8_8 = false;
                var11_11 /* !! */  = null;
            }
            if (var11_11 /* !! */  == null) ** break block13
            var2_2 = var11_11 /* !! */ ;
            break;
        }
        catch (RuntimeException v0) {
            ** continue;
        }
        {
lbl60:
            // 2 sources

            while (true) {
                block15: {
                    block14: {
                        try {
                            var6_6 = zzamn.zzf;
                            var5_5 = var6_6.matcher((CharSequence)var5_5);
                            var16_16 = var5_5.find();
                            if (!var16_16) break block14;
                            var17_17 = var5_5.group(var4_4);
                            if (var17_17 == null) throw null;
                            var4_4 = zzamo.zza(var17_17);
                            break block15;
                        }
                        catch (RuntimeException v1) {
                            continue block5;
                        }
                    }
                    var4_4 = -1;
                }
                if (var4_4 == var1_1) continue block5;
                var3_3 = var4_4;
                continue block5;
                break;
            }
        }
    }

    public static String zzb(String string2) {
        return zzc.matcher(string2).replaceAll("");
    }
}

