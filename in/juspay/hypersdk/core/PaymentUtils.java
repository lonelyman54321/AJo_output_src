/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  android.telephony.TelephonyManager
 *  android.util.Base64
 *  android.webkit.CookieManager
 *  android.webkit.CookieSyncManager
 */
package in.juspay.hypersdk.core;

import android.app.ActivityManager;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.ConnectivityReceiver;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.PaymentSessionInfo;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.safe.Godel;
import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.Utils;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Set;

public class PaymentUtils
extends Utils {
    private static final String LOG_TAG = "PaymentUtils";

    public static void clearCookies(JuspayServices juspayServices) {
        Context context = juspayServices.getContext();
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        juspayServices = CookieSyncManager.createInstance((Context)context);
        juspayServices.sync();
        juspayServices = CookieManager.getInstance();
        try {
            juspayServices.removeAllCookie();
        }
        catch (Exception exception) {
            String string2 = LOG_TAG;
            String string3 = "util";
            String string4 = "Failed to clear cookies";
            String string5 = "action";
            String string6 = "system";
            sdkTracker.trackAndLogException(string2, string5, string6, string3, string4, exception);
        }
    }

    public static void deleteRecursive(File file) {
        boolean bl2 = file.exists();
        if (!bl2) {
            return;
        }
        bl2 = file.isDirectory();
        if (bl2) {
            File[] fileArray = file.listFiles();
            int n3 = 0;
            if (fileArray == null) {
                fileArray = new File[]{};
            }
            int n4 = fileArray.length;
            while (n3 < n4) {
                File file2 = fileArray[n3];
                PaymentUtils.deleteRecursive(file2);
                ++n3;
            }
        }
        file.delete();
    }

    public static String getConfigVariableDeclarations(Context object, SessionInfo object2) {
        boolean bl2;
        String string2 = ((SessionInfo)object2).getDeviceId();
        String string3 = ((SessionInfo)object2).getAndroidId();
        if (string2 == null || (bl2 = string2.isEmpty())) {
            string2 = "";
        }
        StringBuilder stringBuilder = new StringBuilder("var clientId = '");
        object2 = ((SessionInfo)object2).getClientId();
        stringBuilder.append((String)object2);
        stringBuilder.append("';var juspayDeviceId = '");
        stringBuilder.append(string2);
        stringBuilder.append("';var juspayAndroidId = '");
        stringBuilder.append(string3);
        stringBuilder.append("';var godelRemotesVersion = '");
        object2 = PaymentSessionInfo.getGodelRemotesVersion(object);
        stringBuilder.append((String)object2);
        stringBuilder.append("';var godelVersion = '");
        object2 = IntegrationUtils.getGodelVersion(object);
        stringBuilder.append((String)object2);
        stringBuilder.append("';var buildVersion = '");
        object = IntegrationUtils.getGodelBuildVersion(object);
        stringBuilder.append((String)object);
        stringBuilder.append("';var os_version = '");
        object = SessionInfo.getOSVersion();
        stringBuilder.append((String)object);
        stringBuilder.append("';");
        return stringBuilder.toString();
    }

    public static ConnectivityReceiver getConnectivityReceiver(JuspayServices juspayServices) {
        Object object;
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            object = new ConnectivityReceiver(juspayServices);
            return object;
        }
        catch (Throwable throwable) {
            object = LOG_TAG;
            sdkTracker.trackAndLogException((String)object, "action", "system", "util", "Failed to register Connectivity receiver (Ignoring)", throwable);
            return null;
        }
    }

    public static boolean hasTelephonyService(JuspayServices juspayServices) {
        Object object = juspayServices.getContext();
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        boolean bl2 = false;
        juspayServices = null;
        String string2 = "phone";
        try {
            object = object.getSystemService(string2);
        }
        catch (Throwable throwable) {
            string2 = LOG_TAG;
            sdkTracker.trackAndLogException(string2, "action", "system", "util", "Exception while trying to get telephony service. Returning false.", throwable);
            return false;
        }
        object = (TelephonyManager)object;
        int n3 = object.getPhoneType();
        if (n3 != 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean isClassAvailable(String string2) {
        try {
            Class.forName(string2);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private static void logMemoryInfo(SdkTracker sdkTracker, ActivityManager.MemoryInfo memoryInfo) {
        Long l2 = memoryInfo.availMem;
        sdkTracker.trackContext("device", "info", "memory", "available_memory", l2);
        l2 = memoryInfo.threshold;
        sdkTracker.trackContext("device", "info", "memory", "threshold_memory", l2);
        l2 = memoryInfo.totalMem;
        sdkTracker.trackContext("device", "info", "memory", "total_memory", l2);
    }

    public static void refreshPage(JuspayWebView juspayWebView) {
        if (juspayWebView != null) {
            String string2 = "window.location.reload(true);";
            juspayWebView.addJsToWebView(string2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void switchOffGodelIfLowOnMemory(Godel var0, JuspayServices var1_2, PaymentSessionInfo var2_3) {
        block35: {
            block34: {
                block36: {
                    block33: {
                        var3_4 = " MB";
                        var4_5 = "low on memory - Available memory : ";
                        try {
                            var5_6 /* !! */  = var1_2.getContext();
                        }
                        catch (Exception v0) {
                            ** continue;
                        }
                        var1_2 = var1_2.getSdkTracker();
                        var6_7 = "activity";
                        var5_6 /* !! */  = var5_6 /* !! */ .getSystemService((String)var6_7);
                        var5_6 /* !! */  = (ActivityManager)var5_6 /* !! */ ;
                        var7_9 = new ActivityManager.MemoryInfo();
                        var0 = var0.getWebLabRules();
                        if (var0 == null) break block33;
                        var8_10 = "shouldUseMemory";
                        var9_11 = var0.getInt(var8_10);
                        var8_10 = "system";
                        var10_12 = "info";
                        var11_13 = "util";
                        var12_14 = "weblab_shouldUseMemory";
                        var6_7 = new StringBuilder();
                        var6_7.append(var9_11);
                        var6_7.append(var3_4);
                        var13_15 = var6_7.toString();
                        var6_7 = var1_2;
                        try {
                            var1_2.trackAction(var8_10, var10_12, var11_13, var12_14, var13_15);
                            break block34;
                        }
                        catch (Exception var6_8) {
                            var14_16 = var6_8;
                        }
                        break block36;
                        catch (Exception var0_1) {
                            var14_16 = var0_1;
                            var9_11 = 4;
                        }
                        break block36;
                    }
                    var9_11 = 4;
                    break block34;
                }
                var8_10 = PaymentUtils.LOG_TAG;
                var10_12 = "action";
                var11_13 = "system";
                var12_14 = "util";
                var13_15 = "Exception while fetching shouldUseMemory from config";
                var6_7 = var1_2;
                var1_2.trackAndLogException(var8_10, var10_12, var11_13, var12_14, var13_15, var14_16);
            }
            if (var5_6 /* !! */  == null) ** GOTO lbl107
            var5_6 /* !! */ .getMemoryInfo(var7_9);
            var15_17 = var5_6 /* !! */ .getMemoryClass();
            if (var15_17 >= var9_11) break block35;
            var6_7 = "LOW_ON_MEMORY";
            var2_3.setGodelDisabled((String)var6_7);
            var8_10 = "system";
            var10_12 = "info";
            var11_13 = "util";
            var12_14 = "switching_godel_off";
            var2_3 = new StringBuilder(var4_5);
            var2_3.append(var15_17);
            var2_3.append(var3_4);
            var13_15 = var2_3.toString();
            var6_7 = var1_2;
            var1_2.trackAction(var8_10, var10_12, var11_13, var12_14, var13_15);
        }
        PaymentUtils.logMemoryInfo((SdkTracker)var1_2, var7_9);
        var8_10 = "system";
        var10_12 = "info";
        var11_13 = "util";
        var12_14 = "switchoffgodeliflowonmemory";
        var2_3 = new StringBuilder();
        var2_3.append(var15_17);
        var3_4 = " MB <";
        var2_3.append(var3_4);
        var2_3.append(var9_11);
        var13_15 = var2_3.toString();
        var6_7 = var1_2;
        var1_2.trackAction(var8_10, var10_12, var11_13, var12_14, var13_15);
lbl107:
        // 3 sources

    }

    public static String toJavascriptArray(ArrayList object) {
        boolean bl2;
        if (object == null) {
            return "[]";
        }
        String string2 = "[";
        StringBuilder stringBuilder = new StringBuilder(string2);
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            string2 = "\"";
            stringBuilder.append(string2);
            String string3 = (String)object.next();
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            bl2 = object.hasNext();
            if (!bl2) continue;
            string2 = ",";
            stringBuilder.append(string2);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static boolean validatePinning(X509Certificate[] object, Set object2) {
        StringBuilder stringBuilder = new StringBuilder();
        Object object3 = "SHA-256";
        try {
            object3 = MessageDigest.getInstance((String)object3);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            object = new CertificateException("couldn't create digest");
            throw object;
        }
        int n3 = ((X509Certificate[])object).length;
        boolean bl2 = true;
        if (n3 > 0) {
            object = object[0];
            byte[] byArray = ((Certificate)object).getPublicKey().getEncoded();
            int n4 = byArray.length;
            ((MessageDigest)object3).update(byArray, 0, n4);
            object3 = Base64.encodeToString((byte[])((MessageDigest)object3).digest(), (int)2);
            stringBuilder.append("    sha256/");
            stringBuilder.append((String)object3);
            stringBuilder.append(" : ");
            object = ((X509Certificate)object).getSubjectDN().toString();
            stringBuilder.append((String)object);
            stringBuilder.append("\n");
            return object2.contains(object3) ^ bl2;
        }
        object = LOG_TAG;
        object2 = stringBuilder.toString();
        JuspayLogger.d((String)object, (String)object2);
        return bl2;
    }
}

