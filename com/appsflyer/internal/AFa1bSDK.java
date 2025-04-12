/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1bSDK$5;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$2;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFf1eSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFh1aSDK;
import com.appsflyer.internal.AFh1bSDK;
import com.appsflyer.internal.AFh1gSDK;
import com.appsflyer.internal.AFh1pSDK;
import com.appsflyer.internal.AFj1jSDK;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class AFa1bSDK
implements Runnable {
    private final WeakReference AFAdRevenueData;
    private final String areAllFieldsValid;
    private final AFd1qSDK component1;
    private final Map component3;
    private final String component4;
    final String getCurrencyIso4217Code;
    private final String getMediationNetwork;
    final String getMonetizationNetwork;
    final String getRevenue;

    public AFa1bSDK(Context context, String string2, AFd1qSDK aFd1qSDK, String string3, String string4, String string5, String string6, String string7, Map map2) {
        WeakReference<Context> weakReference;
        this.AFAdRevenueData = weakReference = new WeakReference<Context>(context);
        this.getMediationNetwork = string2;
        this.areAllFieldsValid = string3;
        this.getCurrencyIso4217Code = string5;
        this.getRevenue = string6;
        this.getMonetizationNetwork = string7;
        this.component3 = map2;
        this.component4 = string4;
        this.component1 = aFd1qSDK;
    }

    private static AFf1eSDK AFAdRevenueData(Context object, AFh1gSDK object2) {
        Object object3 = AFb1rSDK.getRevenue();
        Object object4 = new Object[]{object3, object};
        int n3 = System.identityHashCode(object3);
        AFb1rSDK.getCurrencyIso4217Code(object4, -608775197, 608775214, n3);
        object = AFb1rSDK.getRevenue().getMonetizationNetwork();
        int n4 = object.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0);
        ((AFa1oSDK)object2).getMediationNetwork(n4);
        object3 = new AFf1eSDK((AFa1oSDK)object2, (AFd1kSDK)object);
        object = object.copy();
        object2 = ((AFe1aSDK)object).AFAdRevenueData;
        object4 = new AFe1aSDK$2((AFe1aSDK)object, (AFe1eSDK)object3);
        object2.execute((Runnable)object4);
        return object3;
    }

    public static void getRevenue(boolean bl2, String charSequence, String string2, String string3, String string4) {
        Object object = AFb1rSDK.getMediationNetwork;
        if (object != null) {
            object = "Validate callback parameters: ";
            String string5 = " ";
            charSequence = og_1.a((String)object, (String)charSequence, string5, string2, string5);
            ((StringBuilder)charSequence).append(string3);
            charSequence = charSequence.toString();
            AFLogger.afDebugLog((String)charSequence);
            if (bl2) {
                String string6 = String.valueOf(string4);
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(string6));
                AFb1rSDK.getMediationNetwork.onValidateInApp();
                return;
            }
            Object object2 = String.valueOf(string4);
            charSequence = "Validate in app purchase failed: ";
            AFLogger.afDebugLog(((String)charSequence).concat((String)object2));
            object2 = AFb1rSDK.getMediationNetwork;
            if (string4 == null) {
                string4 = "Failed validating";
            }
            object2.onValidateInAppFailure(string4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        block11: {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            block10: {
                object7 = this.getMediationNetwork;
                if (object7 == null) return;
                int n3 = ((String)object7).length();
                if (n3 == 0) {
                    return;
                }
                object7 = AppsFlyerLib.getInstance();
                n3 = (int)(((AppsFlyerLib)object7).isStopped() ? 1 : 0);
                if (n3 != 0) {
                    return;
                }
                try {
                    object7 = this.AFAdRevenueData;
                    object7 = ((Reference)object7).get();
                    object7 = (Context)object7;
                    if (object7 == null) {
                        return;
                    }
                    object6 = new HashMap();
                    object5 = "public-key";
                    object4 = this.areAllFieldsValid;
                    ((HashMap)object6).put(object5, object4);
                    object5 = "sig-data";
                    object4 = this.getCurrencyIso4217Code;
                    ((HashMap)object6).put(object5, object4);
                    object5 = "signature";
                    object4 = this.component4;
                    ((HashMap)object6).put(object5, object4);
                    object5 = new HashMap(object6);
                    object4 = this.component3;
                    object3 = AFb1rSDK.getRevenue();
                    object3 = ((AFb1rSDK)object3).getMonetizationNetwork();
                    object3 = object3.getRevenue();
                    object2 = "referrer";
                    object = "";
                    object3 = object3.getMonetizationNetwork((String)object2, (String)object);
                    object2 = new AFh1aSDK();
                    ((AFa1oSDK)object2).component2 = object3;
                    object3 = AFb1rSDK.getRevenue();
                    object = ((AFb1rSDK)object3).getMonetizationNetwork((AFa1oSDK)object2);
                    String string2 = "price";
                    String string3 = this.getRevenue;
                    object.put(string2, string3);
                    string2 = "currency";
                    string3 = this.getMonetizationNetwork;
                    object.put(string2, string3);
                    string2 = "receipt_data";
                    object.put(string2, object5);
                    if (object4 == null) break block10;
                    object5 = "extra_prms";
                    object.put(object5, object4);
                }
                catch (Throwable throwable2) {
                    break block11;
                }
            }
            object5 = ((AFb1rSDK)object3).getMonetizationNetwork();
            object5 = object5.AFKeystoreWrapper();
            object5 = ((AFg1wSDK)object5).getMediationNetwork();
            object.putAll(object5);
            ((AFa1oSDK)object2).getRevenue((Map)object);
            object4 = this.component1;
            object5 = new AFj1jSDK((AFd1qSDK)object4);
            object5 = ((AFj1jSDK)object5).getMediationNetwork((AFh1gSDK)object2);
            ((AFh1aSDK)object2).getRevenue((String)object5);
            AFa1bSDK.AFAdRevenueData((Context)object7, (AFh1gSDK)object2);
            object5 = "dev_key";
            object4 = this.getMediationNetwork;
            ((HashMap)object6).put(object5, object4);
            object5 = "app_id";
            object4 = object7.getPackageName();
            ((HashMap)object6).put(object5, object4);
            object5 = "uid";
            object4 = AppsFlyerLib.getInstance();
            object4 = ((AppsFlyerLib)object4).getAppsFlyerUID((Context)object7);
            ((HashMap)object6).put(object5, object4);
            object5 = AFb1rSDK.getRevenue();
            object5 = ((AFb1rSDK)object5).getMonetizationNetwork();
            object5 = object5.getMediationNetwork();
            object5 = ((AFd1qSDK)object5).AFAdRevenueData;
            object5 = ((AFd1tSDK)object5).component4;
            object4 = null;
            if (object5 != null) {
                object2 = ((AFh1pSDK)object5).getMonetizationNetwork;
                object5 = ((AFh1pSDK)object5).AFAdRevenueData;
                object3 = new AFb1tSDK((String)object2, (Boolean)object5);
            } else {
                object3 = null;
            }
            if (object3 != null) {
                object4 = ((AFb1tSDK)object3).getRevenue;
            }
            if (object4 != null) {
                object5 = "advertiserId";
                ((HashMap)object6).put(object5, object4);
            }
            object5 = new AFh1bSDK();
            object6 = ((AFa1oSDK)object5).getRevenue((Map)object6);
            object6 = (AFh1bSDK)object6;
            object4 = this.component1;
            object5 = new AFj1jSDK((AFd1qSDK)object4);
            object5 = ((AFj1jSDK)object5).getMediationNetwork((AFh1gSDK)object6);
            ((AFa1oSDK)object6).getRevenue((String)object5);
            object7 = AFa1bSDK.AFAdRevenueData((Context)object7, (AFh1gSDK)object6);
            ((AFa1oSDK)object6).getMediationNetwork = object5 = new AFa1bSDK$5(this, (AFf1eSDK)object7);
            return;
        }
        Object object = AFb1rSDK.getMediationNetwork;
        if (object != null) {
            AFLogger.afErrorLog("Failed Validate request + ex", throwable2);
            object = this.getCurrencyIso4217Code;
            String string4 = this.getRevenue;
            String string5 = this.getMonetizationNetwork;
            String string6 = throwable2.getMessage();
            Object var7_13 = null;
            AFa1bSDK.getRevenue(false, (String)object, string4, string5, string6);
        }
        object = throwable2.getMessage();
        AFLogger.afErrorLog((String)object, throwable2);
    }
}

