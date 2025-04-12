/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzaxe;

public final class zzaxd {
    private static final String[] zza = new String[]{"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zzb;
    private final String[] zzc;
    private final zzawz zzd;

    public zzaxd(zzawz zzawz2) {
        this.zzb = "ad.doubleclick.net";
        String[] stringArray = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
        this.zzc = stringArray;
        this.zzd = zzawz2;
    }

    /*
     * Unable to fully structure code
     */
    private final Uri zzg(Uri var1_1, String var2_2) {
        block62: {
            block57: {
                block58: {
                    block59: {
                        var3_3 = "ms";
                        var4_4 = ";";
                        var5_5 = "ms=";
                        var6_6 = ";dc_ms=";
                        var7_7 = "dc_ms=";
                        if (var1_1 == null) break block62;
                        var8_8 = null;
                        var9_9 = -1;
                        var10_10 = var1_1.getHost();
                        var11_11 = this.zzb;
                        var12_12 = var10_10.equals(var11_11);
                        if (!var12_12) break block57;
                        var10_10 = var1_1.getPath();
                        var12_12 = var10_10.contains(var4_4);
                        if (!var12_12) break block57;
                        var3_3 = var1_1.toString();
                        var13_13 = var3_3.contains(var7_7);
                        if (var13_13) break block58;
                        var3_3 = var1_1.toString();
                        var5_5 = ";adurl";
                        var14_14 = var3_3.indexOf(var5_5);
                        if (var14_14 == var9_9) break block59;
                        ++var14_14;
                        var6_6 = var3_3.substring(0, var14_14);
                        var1_1 = new StringBuilder(var6_6);
                        var1_1.append((String)var7_7);
                        var1_1.append(var2_2);
                        var1_1.append(var4_4);
                        var2_2 = var3_3.substring(var14_14);
                        var1_1.append(var2_2);
                        var1_1 = var1_1.toString();
                        var1_1 = Uri.parse((String)var1_1);
                        ** GOTO lbl137
                    }
                    var1_1 = var1_1.getEncodedPath();
                    var14_14 = var3_3.indexOf((String)var1_1);
                    var9_9 = var1_1.length() + var14_14;
                    var8_8 = var3_3.substring(0, var9_9);
                    var7_7 = new StringBuilder(var8_8);
                    var7_7.append(var6_6);
                    var7_7.append(var2_2);
                    var7_7.append(var4_4);
                    var15_15 = var1_1.length();
                    var14_14 += var15_15;
                    var1_1 = var3_3.substring(var14_14);
                    var7_7.append((String)var1_1);
                    var1_1 = var7_7.toString();
                    var1_1 = Uri.parse((String)var1_1);
                    ** GOTO lbl137
                }
                var2_2 = "Parameter already exists: dc_ms";
                var1_1 = new zzaxe(var2_2);
                throw var1_1;
            }
lbl92:
            // 2 sources

            while (true) {
                block60: {
                    block61: {
                        var4_4 = var1_1.getQueryParameter(var3_3);
                        if (var4_4 != null) break block60;
                        var4_4 = var1_1.toString();
                        var6_6 = "&adurl";
                        var16_17 = var4_4.indexOf(var6_6);
                        if (var16_17 != var9_9) break block61;
                        var6_6 = "?adurl";
                        var16_17 = var4_4.indexOf(var6_6);
                    }
                    if (var16_17 != var9_9) {
                        ++var16_17;
                        var3_3 = var4_4.substring(0, var16_17);
                        var1_1 = new StringBuilder(var3_3);
                        var1_1.append(var5_5);
                        var1_1.append(var2_2);
                        var2_2 = "&";
                        var1_1.append(var2_2);
                        var2_2 = var4_4.substring(var16_17);
                        var1_1.append(var2_2);
                        var1_1 = var1_1.toString();
                        var1_1 = Uri.parse((String)var1_1);
                    } else {
                        var1_1 = var1_1.buildUpon();
                        var1_1 = var1_1.appendQueryParameter(var3_3, var2_2);
                        var1_1 = var1_1.build();
                    }
lbl137:
                    // 4 sources

                    return var1_1;
                }
                var2_2 = "Query parameter already exists: ms";
                var1_1 = new zzaxe(var2_2);
                throw var1_1;
                break;
            }
        }
        var15_16 = false;
        var1_1 = null;
        try {
            throw null;
        }
        catch (UnsupportedOperationException v0) {
            ** continue;
        }
lbl150:
        // 1 sources

        while (true) {
            var1_1 = new zzaxe("Provided Uri is not in a valid state");
            throw var1_1;
        }
        catch (NullPointerException v1) {
            ** continue;
        }
    }

    public final Uri zza(Uri object, Context object2, View view, Activity activity) {
        String string2;
        zzawz zzawz2;
        try {
            zzawz2 = this.zzd;
            string2 = "ai";
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            object = new zzaxe("Provided Uri is not in a valid state");
            throw object;
        }
        string2 = object.getQueryParameter(string2);
        object2 = zzawz2.zzf((Context)object2, string2, view, activity);
        return this.zzg((Uri)object, (String)object2);
    }

    public final Uri zzb(Uri uri, Context object) {
        object = this.zzd.zzg((Context)object);
        return this.zzg(uri, (String)object);
    }

    public final zzawz zzc() {
        return this.zzd;
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zzd.zzk(motionEvent);
    }

    public final boolean zze(Uri uri) {
        boolean bl2 = this.zzf(uri);
        if (bl2) {
            int n3;
            String[] stringArray = zza;
            for (int i3 = 0; i3 < (n3 = 3); ++i3) {
                String string2 = stringArray[i3];
                String string3 = uri.getPath();
                n3 = (int)(string3.endsWith(string2) ? 1 : 0);
                if (n3 == 0) continue;
                return true;
            }
        }
        return false;
    }

    public final boolean zzf(Uri object) {
        int n3;
        object.getClass();
        object = object.getHost();
        String[] stringArray = this.zzc;
        for (int i3 = 0; i3 < (n3 = 3); ++i3) {
            String string2;
            try {
                string2 = stringArray[i3];
            }
            catch (NullPointerException nullPointerException) {}
            n3 = (int)(((String)object).endsWith(string2) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
            break;
        }
        return false;
    }
}

