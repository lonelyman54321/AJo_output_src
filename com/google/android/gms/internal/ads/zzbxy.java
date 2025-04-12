/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.media.AudioManager
 *  android.net.ConnectivityManager
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbxz;
import com.google.android.gms.internal.ads.zzcby;
import java.util.Locale;

public final class zzbxy {
    private int zzA;
    private final String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private String zzo;
    private String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final String zzw;
    private final String zzx;
    private float zzy;
    private int zzz;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzbxy(Context context) {
        int n3;
        void var4_11;
        float f5;
        int n4;
        Object object;
        StringBuilder stringBuilder;
        int n7;
        int n8;
        Object object2;
        Object object3;
        block11: {
            block10: {
                String string2;
                boolean bl2;
                object3 = context.getPackageManager();
                zzbep.zza(context);
                this.zzc(context);
                this.zze(context);
                this.zzd(context);
                object2 = Locale.getDefault();
                ResolveInfo resolveInfo = zzbxy.zzb((PackageManager)object3, "geo:0,0?q=donuts");
                n8 = 1;
                n7 = 0;
                stringBuilder = null;
                if (resolveInfo != null) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    Object var4_5 = null;
                }
                this.zzq = bl2;
                ResolveInfo resolveInfo2 = zzbxy.zzb((PackageManager)object3, "http://www.google.com");
                if (resolveInfo2 == null) {
                    n8 = 0;
                    object = null;
                }
                this.zzr = n8;
                this.zzs = string2 = ((Locale)object2).getCountry();
                com.google.android.gms.ads.internal.zzu.zzp();
                zzay.zzb();
                this.zzt = bl2 = com.google.android.gms.ads.internal.util.client.zzf.zzs();
                this.zzu = bl2 = DeviceProperties.isLatchsky(context);
                this.zzv = bl2 = DeviceProperties.isSidewinder(context);
                this.zzw = object2 = ((Locale)object2).getLanguage();
                object3 = zzbxy.zzb((PackageManager)object3, "market://details?id=com.google.android.gms.ads");
                object2 = ".";
                bl2 = false;
                Object var4_9 = null;
                if (object3 != null && (object3 = ((ResolveInfo)object3).activityInfo) != null) {
                    try {
                        object = Wrappers.packageManager(context);
                        String string3 = ((ActivityInfo)object3).packageName;
                        if ((object = ((PackageManagerWrapper)object).getPackageInfo(string3, 0)) == null) break block10;
                        n8 = ((PackageInfo)object).versionCode;
                        object3 = ((ActivityInfo)object3).packageName;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(n8);
                        stringBuilder.append((String)object2);
                        stringBuilder.append((String)object3);
                        object3 = stringBuilder.toString();
                        break block11;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                }
            }
            n4 = 0;
            object3 = null;
            f5 = 0.0f;
        }
        this.zzx = object3;
        try {
            object3 = Wrappers.packageManager(context);
            object = "com.android.vending";
            n7 = 128;
            object3 = ((PackageManagerWrapper)object3).getPackageInfo((String)object, n7);
            if (object3 != null) {
                n8 = ((PackageInfo)object3).versionCode;
                object3 = ((PackageInfo)object3).packageName;
                stringBuilder = new StringBuilder();
                stringBuilder.append(n8);
                stringBuilder.append((String)object2);
                stringBuilder.append((String)object3);
                String string4 = stringBuilder.toString();
            }
        }
        catch (Exception exception) {}
        this.zzB = var4_11;
        if ((context = context.getResources()) == null) {
            return;
        }
        if ((context = context.getDisplayMetrics()) == null) return;
        this.zzy = f5 = context.density;
        this.zzz = n4 = context.widthPixels;
        this.zzA = n3 = context.heightPixels;
    }

    public zzbxy(Context object, zzbxz zzbxz2) {
        float f5;
        int n3;
        String string2;
        zzbep.zza(object);
        this.zzc((Context)object);
        this.zze((Context)object);
        this.zzd((Context)object);
        this.zzo = string2 = Build.FINGERPRINT;
        this.zzp = string2 = Build.DEVICE;
        this.zzC = n3 = zzbfm.zzg(object);
        this.zzq = n3 = zzbxz2.zza;
        this.zzr = n3 = zzbxz2.zzb;
        object = zzbxz2.zzd;
        this.zzs = object;
        this.zzt = n3 = zzbxz2.zze;
        this.zzu = n3 = zzbxz2.zzf;
        this.zzv = n3 = zzbxz2.zzg;
        object = zzbxz2.zzh;
        this.zzw = object;
        object = zzbxz2.zzi;
        this.zzx = object;
        object = zzbxz2.zzj;
        this.zzB = object;
        this.zzy = f5 = zzbxz2.zzm;
        this.zzz = n3 = zzbxz2.zzn;
        this.zzA = n3 = zzbxz2.zzo;
    }

    private static ResolveInfo zzb(PackageManager packageManager, String string2) {
        String string3 = "android.intent.action.VIEW";
        try {
            string2 = Uri.parse((String)string2);
        }
        catch (Throwable throwable) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(throwable, "DeviceInfo.getResolveInfo");
            return null;
        }
        Intent intent = new Intent(string3, (Uri)string2);
        int n3 = 65536;
        return packageManager.resolveActivity(intent, n3);
    }

    private final void zzc(Context context) {
        String string2 = "audio";
        context = (AudioManager)context.getSystemService(string2);
        int n3 = 2;
        if (context != null) {
            int n4 = context.getMode();
            this.zza = n4;
            n4 = (int)(context.isMusicActive() ? 1 : 0);
            this.zzb = n4;
            n4 = (int)(context.isSpeakerphoneOn() ? 1 : 0);
            this.zzc = n4;
            n4 = 3;
            n4 = context.getStreamVolume(n4);
            this.zzd = n4;
            n4 = context.getRingerMode();
            this.zze = n4;
            int n7 = context.getStreamVolume(n3);
            try {
                this.zzf = n7;
                return;
            }
            catch (Throwable throwable) {
                String string3 = "DeviceInfo.gatherAudioInfo";
                zzcby zzcby2 = com.google.android.gms.ads.internal.zzu.zzo();
                zzcby2.zzw(throwable, string3);
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = n3;
        this.zzf = 0;
    }

    /*
     * Unable to fully structure code
     */
    private final void zzd(Context var1_1) {
        block5: {
            block7: {
                block6: {
                    var2_2 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                    var3_3 = zzbep.zzkW;
                    var4_4 = zzba.zzc();
                    var3_3 = (Boolean)var4_4.zza((zzbeg)var3_3);
                    var5_5 = var3_3.booleanValue();
                    if (var5_5 == 0) ** GOTO lbl-1000
                    var5_5 = Build.VERSION.SDK_INT;
                    var6_6 = 33;
                    var7_7 = 4.6E-44f;
                    if (var5_5 >= var6_6) {
                        var1_1 = bk3_1.a(var1_1, var2_2);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_5 = 0;
                        var3_3 = null;
                        var1_1 = var1_1.registerReceiver(null, var2_2);
                    }
                    var8_8 = false;
                    var2_2 = null;
                    if (var1_1 == null) break block5;
                    var3_3 = "status";
                    var6_6 = -1;
                    var5_5 = var1_1.getIntExtra((String)var3_3, var6_6);
                    var9_9 = "level";
                    var10_10 = var1_1.getIntExtra(var9_9, var6_6);
                    var11_11 = "scale";
                    var12_12 = var1_1.getIntExtra(var11_11, var6_6);
                    var7_7 = var10_10;
                    var13_13 = var12_12;
                    this.zzm = var14_14 = (double)(var7_7 / var13_13);
                    var12_12 = 2;
                    var13_13 = 2.8E-45f;
                    var6_6 = 1;
                    var7_7 = 1.4E-45f;
                    if (var5_5 == var12_12) break block6;
                    var12_12 = 5;
                    var13_13 = 7.0E-45f;
                    if (var5_5 != var12_12) break block7;
                }
                var8_8 = true;
            }
            this.zzn = var8_8;
            return;
        }
        this.zzm = -1.0;
        this.zzn = false;
    }

    /*
     * Unable to fully structure code
     */
    private final void zze(Context var1_1) {
        var2_2 = (TelephonyManager)var1_1.getSystemService("phone");
        var3_3 = (ConnectivityManager)var1_1.getSystemService("connectivity");
        var4_4 = var2_2.getNetworkOperator();
        this.zzg = var4_4;
        var5_5 = PlatformVersion.isAtLeastR();
        if (var5_5 == 0) ** GOTO lbl-1000
        var4_4 = zzbep.zziF;
        var6_6 = zzba.zzc();
        var4_4 = (Boolean)var6_6.zza((zzbeg)var4_4);
        var5_5 = (int)var4_4.booleanValue();
        if (var5_5 != 0) {
            var5_5 = 0;
            var4_4 = null;
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = var2_2.getNetworkType();
        }
        this.zzi = var5_5;
        this.zzj = var7_7 = var2_2.getPhoneType();
        this.zzh = -2;
        this.zzk = false;
        this.zzl = var7_7 = -1;
        com.google.android.gms.ads.internal.zzu.zzp();
        var4_4 = "android.permission.ACCESS_NETWORK_STATE";
        var8_8 = com.google.android.gms.ads.internal.util.zzt.zzA(var1_1, (String)var4_4);
        if (var8_8 != 0) {
            var1_1 = var3_3.getActiveNetworkInfo();
            if (var1_1 != null) {
                this.zzh = var7_7 = var1_1.getType();
                var1_1 = var1_1.getDetailedState();
                this.zzl = var8_8 = var1_1.ordinal();
            } else {
                this.zzh = var7_7;
            }
            this.zzk = var8_8 = var3_3.isActiveNetworkMetered();
        }
    }

    public final zzbxz zza() {
        int n3 = this.zza;
        boolean bl2 = this.zzq;
        boolean bl3 = this.zzr;
        String string2 = this.zzg;
        String string3 = this.zzs;
        boolean bl4 = this.zzt;
        boolean bl5 = this.zzu;
        boolean bl6 = this.zzv;
        boolean bl7 = this.zzb;
        boolean bl8 = this.zzc;
        String string4 = this.zzw;
        String string5 = this.zzx;
        String string6 = this.zzB;
        int n4 = this.zzd;
        int n7 = this.zzh;
        int n8 = this.zzi;
        int n10 = this.zzj;
        int n14 = this.zze;
        int n15 = this.zzf;
        float f5 = this.zzy;
        int n16 = this.zzz;
        int n17 = this.zzA;
        double d2 = this.zzm;
        boolean bl9 = this.zzn;
        boolean bl10 = this.zzk;
        int n18 = this.zzl;
        String string7 = this.zzo;
        boolean bl11 = this.zzC;
        String string8 = this.zzp;
        zzbxz zzbxz2 = new zzbxz(n3, bl2, bl3, string2, string3, bl4, bl5, bl6, bl7, bl8, string4, string5, string6, n4, n7, n8, n10, n14, n15, f5, n16, n17, d2, bl9, bl10, n18, string7, bl11, string8);
        return zzbxz2;
    }
}

