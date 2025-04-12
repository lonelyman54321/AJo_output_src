/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.LocaleList
 *  android.os.StatFs
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzeyb;
import com.google.android.gms.internal.ads.zzeyc;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhlh;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Locale;

final class zzeyd
implements zzexw {
    private final zzgge zza;
    private final Context zzb;

    public zzeyd(zzgge zzgge2, Context context) {
        this.zza = zzgge2;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String string2) {
        string2 = Uri.parse((String)string2);
        Intent intent = new Intent("android.intent.action.VIEW", (Uri)string2);
        return packageManager.resolveActivity(intent, 65536);
    }

    public final int zza() {
        return 38;
    }

    public final ListenableFuture zzb() {
        zzeyc zzeyc2 = new zzeyc(this);
        return this.zza.zzb(zzeyc2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final /* synthetic */ zzeyb zzc() {
        block49: {
            block47: {
                block46: {
                    block45: {
                        block44: {
                            var1_1 = this;
                            var2_2 = "com.google.unity.ads.UNITY_VERSION";
                            var3_3 = this.zzb.getPackageManager();
                            var4_4 = Locale.getDefault();
                            var5_5 /* !! */  = zzeyd.zzd((PackageManager)var3_3, "geo:0,0?q=donuts");
                            var6_6 = zzeyd.zzd((PackageManager)var3_3, "http://www.google.com");
                            var7_7 = var4_4.getCountry();
                            zzu.zzp();
                            zzay.zzb();
                            var8_8 = zzf.zzs();
                            var9_9 = this.zzb;
                            var10_10 = DeviceProperties.isLatchsky((Context)var9_9);
                            var11_11 = DeviceProperties.isSidewinder((Context)var9_9);
                            var12_12 = var4_4.getLanguage();
                            var13_13 = new ArrayList<String>();
                            var14_14 = Build.VERSION.SDK_INT;
                            var15_15 = 24 != 0;
                            var16_16 = false;
                            var17_17 = null;
                            if (var14_14 >= var15_15) {
                                var4_4 = Wh.a();
                                var9_9 = null;
                                for (var15_15 = false; var15_15 < (var18_18 = Xh.a((LocaleList)var4_4)); var15_15 += 1) {
                                    var19_19 = Yh.a((LocaleList)var4_4, (int)var15_15).getLanguage();
                                    var13_13.add((String)var19_19);
                                }
                            }
                            var4_4 = var1_1.zzb;
                            var9_9 = zzeyd.zzd((PackageManager)var3_3, "market://details?id=com.google.android.gms.ads");
                            var19_19 = ".";
                            if (var9_9 == null) lbl-1000:
                            // 4 sources

                            {
                                while (true) {
                                    var20_20 = null;
                                    break block44;
                                    break;
                                }
                            }
                            var9_9 = var9_9.activityInfo;
                            if (var9_9 == null) ** GOTO lbl-1000
                            var4_4 = Wrappers.packageManager((Context)var4_4);
                            var20_20 = var9_9.packageName;
                            if ((var4_4 = var4_4.getPackageInfo((String)var20_20, 0)) == null) ** GOTO lbl-1000
                            var14_14 = var4_4.versionCode;
                            var9_9 = var9_9.packageName;
                            var20_20 = new StringBuilder();
                            var20_20.append((int)var14_14);
                            var20_20.append((String)var19_19);
                            var20_20.append((String)var9_9);
                            var20_20 = var4_4 = var20_20.toString();
                        }
                        var4_4 = var1_1.zzb;
                        var15_15 = 128 != 0;
                        try {
                            var4_4 = Wrappers.packageManager((Context)var4_4);
                            var17_17 = "com.android.vending";
                        }
                        catch (Exception v0) {}
                        var4_4 = var4_4.getPackageInfo((String)var17_17, (int)var15_15);
                        if (var4_4 == null) break block45;
                        var16_16 = var4_4.versionCode;
                        var4_4 = var4_4.packageName;
                        var9_9 = new StringBuilder();
                        var9_9.append((int)var16_16);
                        var9_9.append((String)var19_19);
                        var9_9.append((String)var4_4);
                        var4_4 = var9_9.toString();
                        break block46;
                    }
                    var14_14 = false;
                    var4_4 = null;
                }
                var9_9 = var1_1.zzb;
                var21_21 = Build.FINGERPRINT;
                if (var3_3 == null) {
                    var22_22 = var4_4;
lbl96:
                    // 3 sources

                    while (true) {
                        var23_23 = false;
                        var3_3 = null;
                        break block47;
                        break;
                    }
                }
                var24_24 = "http://www.example.com";
                var22_22 = var4_4;
                var4_4 = Uri.parse((String)var24_24);
                var17_17 = new Intent("android.intent.action.VIEW", (Uri)var4_4);
                var4_4 = null;
                var19_19 = var3_3.resolveActivity((Intent)var17_17, 0);
                var14_14 = 65536 != 0;
                if ((var3_3 = var3_3.queryIntentActivities((Intent)var17_17, (int)var14_14)) == null || var19_19 == null) ** GOTO lbl96
                var14_14 = false;
                var4_4 = null;
                while (true) {
                    if (var14_14 < (var16_16 = var3_3.size())) ** break;
                    ** continue;
                    var17_17 = (ResolveInfo)var3_3.get((int)var14_14);
                    var24_24 = var3_3;
                    var3_3 = var19_19.activityInfo.name;
                    var17_17 = var17_17.activityInfo.name;
                    var23_23 = var3_3.equals(var17_17);
                    if (var23_23) {
                        var3_3 = var19_19.activityInfo.packageName;
                        var4_4 = zzhlh.zza((Context)var9_9);
                        var23_23 = var3_3.equals(var4_4);
                        break;
                    }
                    var14_14 += 1;
                    var3_3 = var24_24;
                }
            }
            zzu.zzp();
            var9_9 = Environment.getDataDirectory().getAbsolutePath();
            var4_4 = new StatFs((String)var9_9);
            var25_25 = var4_4.getAvailableBytes();
            var27_26 = var25_25 / 1024L;
            var4_4 = zzbep.zzlq;
            var9_9 = zzba.zzc();
            var4_4 = (Boolean)var9_9.zza((zzbeg)var4_4);
            var14_14 = var4_4.booleanValue();
            if (!var14_14) ** GOTO lbl-1000
            zzu.zzp();
            var4_4 = var1_1.zzb;
            var14_14 = zzt.zzB((Context)var4_4);
            if (var14_14) {
                var14_14 = true;
            } else lbl-1000:
            // 2 sources

            {
                var14_14 = false;
                var4_4 = null;
            }
            var17_17 = zzbep.zzlu;
            var19_19 = zzba.zzc();
            var17_17 = (Boolean)var19_19.zza((zzbeg)var17_17);
            var16_16 = var17_17.booleanValue();
            if (var16_16) {
                block48: {
                    var17_17 = var1_1.zzb;
                    try {
                        var19_19 = Wrappers.packageManager((Context)var17_17);
                    }
                    catch (PackageManager.NameNotFoundException v1) {}
                    var17_17 = var17_17.getPackageName();
                    var15_15 = 128 != 0;
                    var9_9 = var19_19.getApplicationInfo((String)var17_17, (int)var15_15);
                    var9_9 = var9_9.metaData;
                    if (var9_9 == null) break block48;
                    var16_16 = var9_9.containsKey(var2_2);
                    if (!var16_16) break block48;
                    var2_2 = var9_9.getString(var2_2);
                    break block49;
                }
                var2_2 = null;
            } else {
                var2_2 = "";
            }
        }
        if (var6_6 != null) {
            var18_18 = true;
        } else {
            var18_18 = false;
            var19_19 = null;
        }
        if (var5_5 /* !! */  != null) {
            var16_16 = true;
        } else {
            var16_16 = false;
            var17_17 = null;
        }
        var9_9 = var5_5 /* !! */ ;
        var24_24 = Build.MODEL;
        var29_27 = Build.VERSION.SDK_INT;
        var5_5 /* !! */  = new zzeyb(var16_16, var18_18, var7_7, var8_8, var10_10, var11_11, var12_12, var13_13, (String)var20_20, (String)var22_22, var21_21, var23_23, (String)var24_24, var27_26, var14_14, var2_2, var29_27);
        return var5_5 /* !! */ ;
        catch (PackageManager.NameNotFoundException v2) {
            ** continue;
        }
    }
}

