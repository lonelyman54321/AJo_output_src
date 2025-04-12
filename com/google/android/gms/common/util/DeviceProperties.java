/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build
 */
package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.common.util.PlatformVersion;

public final class DeviceProperties {
    private static Boolean zza;
    private static Boolean zzb;
    private static Boolean zzc;
    private static Boolean zzd;
    private static Boolean zze;
    private static Boolean zzf;
    private static Boolean zzg;
    private static Boolean zzh;
    private static Boolean zzi;
    private static Boolean zzj;
    private static Boolean zzk;
    private static Boolean zzl;
    private static Boolean zzm;
    private static Boolean zzn;

    private DeviceProperties() {
    }

    public static boolean isAuto(Context object) {
        object = object.getPackageManager();
        Object object2 = zzj;
        if (object2 == null) {
            boolean bl2;
            boolean bl3 = PlatformVersion.isAtLeastO();
            boolean bl4 = false;
            if (bl3 && (bl2 = object.hasSystemFeature((String)(object2 = "android.hardware.type.automotive")))) {
                bl4 = true;
            }
            object = bl4;
            zzj = object;
        }
        return zzj;
    }

    public static boolean isBstar(Context object) {
        Object object2 = zzm;
        if (object2 == null) {
            boolean bl2;
            boolean bl3 = PlatformVersion.isAtLeastR();
            boolean bl4 = false;
            if (bl3 && (bl2 = (object = object.getPackageManager()).hasSystemFeature((String)(object2 = "com.google.android.play.feature.HPE_EXPERIENCE")))) {
                bl4 = true;
            }
            object = bl4;
            zzm = object;
        }
        return zzm;
    }

    public static boolean isFoldable(Context object) {
        Object object2 = zzc;
        if (object2 == null) {
            boolean bl2;
            boolean bl3 = PlatformVersion.isAtLeastR();
            boolean bl4 = false;
            if (bl3 && (bl2 = (object = object.getPackageManager()).hasSystemFeature((String)(object2 = "android.hardware.sensor.hinge_angle")))) {
                bl4 = true;
            }
            object = bl4;
            zzc = object;
        }
        return zzc;
    }

    public static boolean isLatchsky(Context object) {
        Object object2 = zzg;
        if (object2 == null) {
            boolean bl2;
            object = object.getPackageManager();
            object2 = "com.google.android.feature.services_updater";
            boolean bl3 = object.hasSystemFeature((String)object2);
            boolean bl4 = false;
            if (bl3 && (bl2 = object.hasSystemFeature((String)(object2 = "cn.google.services")))) {
                bl4 = true;
            }
            object = bl4;
            zzg = object;
        }
        return zzg;
    }

    public static boolean isPhone(Context object) {
        block5: {
            boolean bl2;
            block6: {
                block7: {
                    boolean bl3;
                    String string2;
                    Boolean bl4 = zza;
                    if (bl4 != null) break block5;
                    boolean bl5 = DeviceProperties.isFoldable(object);
                    bl2 = true;
                    if (bl5) break block6;
                    bl5 = DeviceProperties.isTablet(object);
                    if (bl5 || (bl5 = DeviceProperties.isWearable(object)) || (bl5 = DeviceProperties.zzb(object))) break block7;
                    bl4 = zzi;
                    if (bl4 == null) {
                        bl4 = object.getPackageManager();
                        string2 = "org.chromium.arc";
                        bl5 = bl4.hasSystemFeature(string2);
                        zzi = bl4 = Boolean.valueOf(bl5);
                    }
                    if ((bl5 = (bl4 = zzi).booleanValue()) || (bl5 = DeviceProperties.isAuto(object)) || (bl5 = DeviceProperties.isTv(object))) break block7;
                    bl4 = zzl;
                    if (bl4 == null) {
                        bl4 = object.getPackageManager();
                        string2 = "com.google.android.feature.AMATI_EXPERIENCE";
                        bl5 = bl4.hasSystemFeature(string2);
                        zzl = bl4 = Boolean.valueOf(bl5);
                    }
                    if (!(bl5 = (bl4 = zzl).booleanValue()) && !(bl5 = DeviceProperties.isBstar(object)) && !(bl3 = DeviceProperties.isXr(object))) break block6;
                }
                bl2 = false;
            }
            object = bl2;
            zza = object;
        }
        return zza;
    }

    public static boolean isSevenInchTablet(Context context) {
        return DeviceProperties.zzc(context.getResources());
    }

    public static boolean isSidewinder(Context context) {
        return DeviceProperties.zza(context);
    }

    public static boolean isTablet(Context context) {
        return DeviceProperties.isTablet(context.getResources());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean isTablet(Resources object) {
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        Boolean bl3 = zzb;
        if (bl3 == null) {
            Boolean bl4;
            boolean bl5;
            bl3 = object.getConfiguration();
            int n3 = ((Configuration)bl3).screenLayout & 0xF;
            int n4 = 3;
            if (n3 > n4 || (bl5 = DeviceProperties.zzc(object))) {
                bl2 = true;
            }
            zzb = bl4 = Boolean.valueOf(bl2);
        }
        return zzb;
    }

    public static boolean isTv(Context object) {
        object = object.getPackageManager();
        Object object2 = zzk;
        if (object2 == null) {
            boolean bl2;
            object2 = "com.google.android.tv";
            boolean bl3 = object.hasSystemFeature((String)object2);
            boolean bl4 = true;
            if (!(bl3 || (bl3 = object.hasSystemFeature((String)(object2 = "android.hardware.type.television"))) || (bl3 = object.hasSystemFeature((String)(object2 = "android.software.leanback"))) || (bl2 = object.hasSystemFeature((String)(object2 = "com.google.android.feature.AMATI_EXPERIENCE"))))) {
                bl4 = false;
            }
            object = bl4;
            zzk = object;
        }
        return zzk;
    }

    public static boolean isUserBuild() {
        String string2 = Build.TYPE;
        return "user".equals(string2);
    }

    public static boolean isWearable(Context context) {
        return DeviceProperties.zzd(context.getPackageManager());
    }

    public static boolean isWearableWithoutPlayStore(Context context) {
        boolean bl2;
        boolean bl3 = DeviceProperties.isWearable(context);
        return bl3 && !(bl3 = PlatformVersion.isAtLeastN()) || (bl2 = DeviceProperties.zza(context)) && (!(bl2 = PlatformVersion.isAtLeastO()) || (bl2 = PlatformVersion.isAtLeastR()));
    }

    public static boolean isXr(Context object) {
        object = object.getPackageManager();
        Object object2 = zzn;
        if (object2 == null) {
            object2 = "android.software.xr.immersive";
            boolean bl2 = object.hasSystemFeature((String)object2);
            object = bl2;
            zzn = object;
        }
        return zzn;
    }

    public static boolean zza(Context object) {
        Object object2 = zzf;
        if (object2 == null) {
            object = object.getPackageManager();
            object2 = "cn.google";
            boolean bl2 = object.hasSystemFeature((String)object2);
            object = bl2;
            zzf = object;
        }
        return zzf;
    }

    public static boolean zzb(Context object) {
        Object object2 = zzh;
        if (object2 == null) {
            boolean bl2;
            object2 = object.getPackageManager();
            String string2 = "android.hardware.type.iot";
            boolean bl3 = object2.hasSystemFeature(string2);
            boolean bl4 = true;
            if (!bl3 && !(bl2 = (object = object.getPackageManager()).hasSystemFeature((String)(object2 = "android.hardware.type.embedded")))) {
                bl4 = false;
                string2 = null;
            }
            object = bl4;
            zzh = object;
        }
        return zzh;
    }

    public static boolean zzc(Resources object) {
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        Boolean bl3 = zzd;
        if (bl3 == null) {
            int n3;
            object = object.getConfiguration();
            int n4 = object.screenLayout & 0xF;
            int n7 = 3;
            if (n4 <= n7 && (n3 = object.smallestScreenWidthDp) >= (n4 = 600)) {
                bl2 = true;
            }
            object = bl2;
            zzd = object;
        }
        return zzd;
    }

    public static boolean zzd(PackageManager object) {
        Object object2 = zze;
        if (object2 == null) {
            object2 = "android.hardware.type.watch";
            boolean bl2 = object.hasSystemFeature((String)object2);
            object = bl2;
            zze = object;
        }
        return zze;
    }
}

