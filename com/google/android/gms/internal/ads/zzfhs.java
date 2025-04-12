/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;

public final class zzfhs {
    private final zzaxd zza;

    public zzfhs(zzaxd zzaxd2) {
        this.zza = zzaxd2;
    }

    /*
     * Unable to fully structure code
     */
    private static final Uri zzb(Uri var0, String var1_1) {
        block54: {
            block55: {
                block57: {
                    block56: {
                        var2_2 = "ms";
                        var3_3 = ";";
                        var4_4 = "ms=";
                        var5_5 = ";dc_ms=";
                        var6_6 = "dc_ms=";
                        var7_7 = null;
                        var8_8 = -1;
                        if (var0 == null) break block54;
                        var9_9 = var0.getHost();
                        var10_10 = var0.getPath();
                        if (var9_9 == null) break block54;
                        var11_11 = "ad.doubleclick.net";
                        var12_12 = var9_9.equals(var11_11);
                        if (!var12_12 || var10_10 == null) break block54;
                        var12_12 = var10_10.contains(var3_3);
                        if (!var12_12) break block54;
                        var2_2 = var0.toString();
                        var13_13 = var2_2.contains(var6_6);
                        if (var13_13) break block55;
                        var2_2 = var0.toString();
                        var4_4 = ";adurl";
                        var14_14 = var2_2.indexOf(var4_4);
                        if (var14_14 == var8_8) break block56;
                        ++var14_14;
                        var5_5 = var2_2.substring(0, var14_14);
                        var0 = new StringBuilder(var5_5);
                        var0.append((String)var6_6);
                        var0.append(var1_1);
                        var0.append(var3_3);
                        var15_15 = var2_2.length();
                        var0.append(var2_2, var14_14, var15_15);
                        var0 = var0.toString();
                        var0 = Uri.parse((String)var0);
                        ** GOTO lbl140
                    }
                    var0 = var0.getEncodedPath();
                    if (var0 == null) break block57;
                    var14_14 = var2_2.indexOf((String)var0);
                    var8_8 = var0.length() + var14_14;
                    var7_7 = var2_2.substring(0, var8_8);
                    var6_6 = new StringBuilder(var7_7);
                    var6_6.append(var5_5);
                    var6_6.append(var1_1);
                    var6_6.append(var3_3);
                    var16_17 = var0.length();
                    var14_14 += var16_17;
                    var16_17 = var2_2.length();
                    var6_6.append(var2_2, var14_14, var16_17);
                    var0 = var6_6.toString();
                    var0 = Uri.parse((String)var0);
                    ** GOTO lbl140
                }
                var0 = new UnsupportedOperationException();
                throw var0;
            }
            var1_1 = "Parameter already exists: dc_ms";
            try {
                var0 = new zzaxe(var1_1);
                throw var0;
            }
            catch (UnsupportedOperationException v1) {
                ** continue;
            }
        }
lbl96:
        // 2 sources

        while (true) {
            block58: {
                block59: {
                    var3_3 = var0.getQueryParameter(var2_2);
                    if (var3_3 != null) break block58;
                    var3_3 = var0.toString();
                    var5_5 = "&adurl";
                    var17_18 = var3_3.indexOf(var5_5);
                    if (var17_18 != var8_8) break block59;
                    var5_5 = "?adurl";
                    var17_18 = var3_3.indexOf(var5_5);
                }
                if (var17_18 != var8_8) {
                    ++var17_18;
                    var2_2 = var3_3.substring(0, var17_18);
                    var0 = new StringBuilder(var2_2);
                    var0.append(var4_4);
                    var0.append(var1_1);
                    var1_1 = "&";
                    var0.append(var1_1);
                    var15_16 = var3_3.length();
                    var0.append(var3_3, var17_18, var15_16);
                    var0 = var0.toString();
                    var0 = Uri.parse((String)var0);
                } else {
                    var0 = var0.buildUpon();
                    var0 = var0.appendQueryParameter(var2_2, var1_1);
                    var0 = var0.build();
                }
lbl140:
                // 4 sources

                return var0;
            }
            var1_1 = "Query parameter already exists: ms";
            var0 = new zzaxe(var1_1);
            throw var0;
            break;
        }
lbl146:
        // 1 sources

        while (true) {
            var0 = new zzaxe("Provided Uri is not in a valid state");
            throw var0;
        }
        catch (NullPointerException v0) {
            ** continue;
        }
    }

    public final Uri zza(Uri object, Context object2, View view, Activity activity) {
        Object object3;
        try {
            object3 = this.zza;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            object = new zzaxe("Provided Uri is not in a valid state");
            throw object;
        }
        object3 = ((zzaxd)object3).zzc();
        String string2 = "ai";
        string2 = object.getQueryParameter(string2);
        object2 = object3.zzf((Context)object2, string2, view, activity);
        return zzfhs.zzb(object, (String)object2);
    }
}

