/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Process
 *  com.google.android.play.core.integrity.IntegrityManagerFactory
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFh1vSDK;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class AFb1qSDK {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long AFAdRevenueData(Context context, String string2) {
        try {
            context = context.getPackageManager();
            int n3 = 0;
            context = context.getPackageInfo(string2, 0);
            int n4 = Build.VERSION.SDK_INT;
            n3 = 28;
            if (n4 < n3) return context.versionCode;
            return ep.a((PackageInfo)context);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        AFLogger.afErrorLog(nameNotFoundException.getMessage(), nameNotFoundException);
        return 0L;
    }

    public static boolean AFAdRevenueData(Context object) {
        int n3;
        int n4;
        if (object != null && (n4 = Build.VERSION.SDK_INT) >= (n3 = 33)) {
            object = object.getApplicationContext();
            object = gl1_1.a(object);
            try {
                object = (ll1_0)object;
                return object != null;
            }
            catch (Throwable throwable) {
                Throwable throwable2 = throwable;
                String string2 = throwable.getMessage();
                string2 = string2 != null ? throwable2.getMessage() : "";
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.getMediationNetwork;
                aFLogger.e(aFh1vSDK, string2, throwable2, false, false);
            }
        }
        return false;
    }

    public static boolean c_(Context object, Intent intent) {
        int n3 = (object = object.getPackageManager().queryIntentServices(intent, 0)).size();
        return n3 > 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Map d_(Context var0, Map var1_2, Uri var2_3) {
        block21: {
            var3_4 = "install_time";
            var4_5 = var2_3 /* !! */ .getQueryParameterNames().iterator();
            while (true) {
                block27: {
                    block22: {
                        block26: {
                            block25: {
                                block23: {
                                    block24: {
                                        var5_6 = var4_5.hasNext();
                                        var6_7 = "media_source";
                                        var7_8 = 0;
                                        var8_9 = null;
                                        var9_10 = "agency";
                                        if (!var5_6) break;
                                        var10_11 = (String)var4_5.next();
                                        var11_12 = var2_3 /* !! */ .getQueryParameter((String)var10_11);
                                        var12_13 = var1_2.containsKey(var10_11);
                                        if (var12_13 != 0) break block22;
                                        var12_13 = var10_11.hashCode();
                                        var13_14 = -1420799080;
                                        var14_15 = 2;
                                        var15_16 = 1;
                                        if (var12_13 == var13_14) break block23;
                                        var13_14 = 99;
                                        if (var12_13 == var13_14) break block24;
                                        var7_8 = 110987;
                                        if (var12_13 != var7_8 || (var7_8 = (int)var10_11.equals(var8_9 = "pid")) == 0) ** GOTO lbl-1000
                                        var7_8 = 1;
                                        break block25;
                                    }
                                    var16_17 = "c";
                                    var12_13 = (int)var10_11.equals(var16_17);
                                    if (var12_13 == 0) ** GOTO lbl-1000
                                    break block25;
                                }
                                var8_9 = "af_prt";
                                var7_8 = var10_11.equals(var8_9);
                                if (var7_8 != 0) {
                                    var7_8 = 2;
                                } else lbl-1000:
                                // 3 sources

                                {
                                    var7_8 = -1;
                                }
                            }
                            if (var7_8 == 0) break block26;
                            if (var7_8 == var15_16) break block27;
                            if (var7_8 != var14_15) break block22;
                            var6_7 = var9_10;
                            break block27;
                        }
                        var6_7 = "campaign";
                        break block27;
                    }
                    var6_7 = var10_11;
                }
                var1_2.put(var6_7, var11_12);
            }
            var17_18 = var1_2.containsKey(var3_4);
            if (var17_18) break block21;
            var4_5 = "yyyy-MM-dd HH:mm:ss";
            var11_12 = Locale.US;
            var10_11 = new SimpleDateFormat((String)var4_5, (Locale)var11_12);
            var4_5 = var0 /* !! */ .getPackageManager();
            var0 /* !! */  = var0 /* !! */ .getPackageName();
            var0 /* !! */  = var4_5.getPackageInfo((String)var0 /* !! */ , 0);
            var18_19 = var0 /* !! */ .firstInstallTime;
            var0 /* !! */  = "UTC";
            var0 /* !! */  = TimeZone.getTimeZone((String)var0 /* !! */ );
            var10_11.setTimeZone((TimeZone)var0 /* !! */ );
            var0 /* !! */  = new Date(var18_19);
            var0 /* !! */  = var10_11.format((Date)var0 /* !! */ );
            try {
                var1_2.put(var3_4, var0 /* !! */ );
            }
            catch (Exception var0_1) {
                var3_4 = "Could not fetch install time. ";
                AFLogger.afErrorLog(var3_4, var0_1);
            }
        }
        if ((var20_20 = var1_2.containsKey(var0 /* !! */  = "af_deeplink")) && !(var21_21 = var1_2.containsKey(var0 /* !! */  = "af_status"))) {
            var3_4 = "Non-organic";
            var1_2.put(var0 /* !! */ , var3_4);
        }
        if (var20_20 = var1_2.containsKey(var9_10)) {
            var1_2.remove(var6_7);
        }
        if ((var0 /* !! */  = var2_3 /* !! */ .getPath()) != null) {
            var3_4 = "path";
            var1_2.put(var3_4, var0 /* !! */ );
        }
        if ((var0 /* !! */  = var2_3 /* !! */ .getScheme()) != null) {
            var3_4 = "scheme";
            var1_2.put(var3_4, var0 /* !! */ );
        }
        if ((var0 /* !! */  = var2_3 /* !! */ .getHost()) != null) {
            var2_3 /* !! */  = "host";
            var1_2.put(var2_3 /* !! */ , var0 /* !! */ );
        }
        return var1_2;
    }

    public static String e_(PackageManager object, String objectArray) {
        int n3 = 1;
        int n4 = 64;
        object = object.getPackageInfo((String)objectArray, (int)n4).signatures;
        if (object == null) {
            return null;
        }
        objectArray = CertificateFactory.getInstance("X.509");
        object = object[0].toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        object = (X509Certificate)objectArray.generateCertificate(byteArrayInputStream);
        objectArray = MessageDigest.getInstance("SHA256");
        object = object.getEncoded();
        objectArray.update((byte[])object);
        objectArray = objectArray.digest();
        object = new BigInteger(n3, (byte[])objectArray);
        objectArray = new Object[n3];
        objectArray[0] = object;
        return String.format("%032X", objectArray);
    }

    public static Application f_(Context object) {
        boolean bl2 = object instanceof Application;
        if (bl2) {
            return (Application)object;
        }
        bl2 = object instanceof Activity;
        if (bl2) {
            return ((Activity)object).getApplication();
        }
        try {
            object = object.getApplicationContext();
        }
        catch (ClassCastException classCastException) {
            object = new IllegalStateException();
            boolean bl3 = true;
            AFLogger.afErrorLog("Application or Activity Context should be used", (Throwable)object, bl3, bl3);
            return null;
        }
        return (Application)object;
    }

    public static String getMediationNetwork(Context context, String string2) {
        try {
            context = context.getPackageManager();
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            AFLogger.afErrorLog(nameNotFoundException.getMessage(), nameNotFoundException);
            return "";
        }
        context = context.getPackageInfo(string2, 0);
        return context.versionName;
    }

    public static boolean getMediationNetwork() {
        return Build.BRAND.equals("OPPO");
    }

    public static boolean getMonetizationNetwork(Context context) {
        if (context != null) {
            try {
                IntegrityManagerFactory.create((Context)context);
                return true;
            }
            catch (Throwable throwable) {}
        }
        return false;
    }

    public static boolean getRevenue(Context context) {
        if (context != null) {
            GoogleApiAvailability googleApiAvailability;
            try {
                googleApiAvailability = GoogleApiAvailability.getInstance();
            }
            catch (Throwable throwable) {}
            int n3 = googleApiAvailability.isGooglePlayServicesAvailable(context);
            if (n3 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean getRevenue(Context context, String string2) {
        int n3 = Process.myPid();
        int n4 = Process.myUid();
        int n7 = context.checkPermission(string2, n3, n4);
        String string3 = "is Permission Available: ";
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append(string2);
        stringBuilder.append("; res: ");
        stringBuilder.append(n7);
        string2 = ((Object)stringBuilder).toString();
        AFLogger.afRDLog(string2);
        return n7 == 0;
    }
}

