/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerClient$Builder;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1cSDK;
import com.appsflyer.internal.AFi1eSDK$1;
import com.appsflyer.internal.AFj1sSDK$1;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Observer;
import java.util.concurrent.ExecutorService;

public class AFi1eSDK
extends AFi1cSDK {
    final ExecutorService getCurrencyIso4217Code;
    public final Map getRevenue;

    public AFi1eSDK(Runnable hashMap, ExecutorService executorService, AFd1qSDK aFd1qSDK) {
        super("store", "google", aFd1qSDK, (Runnable)((Object)hashMap));
        this.getRevenue = hashMap = new HashMap();
        this.getCurrencyIso4217Code = executorService;
    }

    private boolean getCurrencyIso4217Code(Context object) {
        Throwable throwable2;
        Object object2;
        Object object3;
        block9: {
            block8: {
                boolean bl2 = this.getMonetizationNetwork();
                if (!bl2) {
                    return false;
                }
                object3 = "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE";
                boolean bl3 = AFb1qSDK.getRevenue((Context)object, (String)object3);
                if (!bl3) break block8;
                try {
                    object = AFLogger.INSTANCE;
                    object3 = AFh1vSDK.hashCode;
                    object2 = "Install referrer is allowed";
                    ((AFh1uSDK)object).d((AFh1vSDK)((Object)object3), (String)object2);
                    return true;
                }
                catch (Throwable throwable2) {}
                catch (ClassNotFoundException classNotFoundException) {}
                finally {
                    break block9;
                }
            }
            object = AFLogger.INSTANCE;
            object3 = AFh1vSDK.hashCode;
            ((AFh1uSDK)object).d((AFh1vSDK)((Object)object3), "Install referrer is not allowed");
            return false;
        }
        object3 = AFLogger.INSTANCE;
        object2 = AFh1vSDK.hashCode;
        String string2 = "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient");
        ((AFh1uSDK)object3).e((AFh1vSDK)((Object)object2), string2, throwable2);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void AFAdRevenueData(InstallReferrerClient object, Context object2, int n3) {
        block11: {
            Object object3;
            block15: {
                String string2;
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                String string3;
                block14: {
                    Object object8;
                    block12: {
                        int n4;
                        block13: {
                            block16: {
                                block17: {
                                    string3 = "err";
                                    object7 = "ReferrerClient: InstallReferrer is not ready";
                                    object6 = "instant";
                                    object3 = this.getRevenue;
                                    object5 = String.valueOf(n3);
                                    object3.put("code", object5);
                                    object3 = this.getMediationNetwork;
                                    object4 = "com.android.vending";
                                    long l2 = AFb1qSDK.AFAdRevenueData((Context)object2, (String)object4);
                                    object5 = l2;
                                    string2 = "api_ver";
                                    object3.put(string2, object5);
                                    object3 = this.getMediationNetwork;
                                    object5 = "api_ver_name";
                                    object2 = AFb1qSDK.getMediationNetwork((Context)object2, (String)object4);
                                    object3.put(object5, object2);
                                    n4 = -1;
                                    object3 = "response";
                                    if (n3 == n4) break block15;
                                    if (n3 == 0) break block16;
                                    int n7 = 1;
                                    if (n3 == n7) break block17;
                                    n7 = 2;
                                    if (n3 != n7) {
                                        n7 = 3;
                                        if (n3 != n7) {
                                            object = AFLogger.INSTANCE;
                                            object2 = AFh1vSDK.hashCode;
                                            String string4 = "responseCode not found.";
                                            ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), string4);
                                            break block11;
                                        } else {
                                            object = AFLogger.INSTANCE;
                                            object2 = AFh1vSDK.hashCode;
                                            String string5 = "InstallReferrer DEVELOPER_ERROR";
                                            ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), string5);
                                            object = this.getMediationNetwork;
                                            object2 = "DEVELOPER_ERROR";
                                            object.put(object3, object2);
                                        }
                                        break block11;
                                    } else {
                                        object = AFLogger.INSTANCE;
                                        object2 = AFh1vSDK.hashCode;
                                        String string6 = "InstallReferrer FEATURE_NOT_SUPPORTED";
                                        ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), string6);
                                        object = this.getMediationNetwork;
                                        object2 = "FEATURE_NOT_SUPPORTED";
                                        object.put(object3, object2);
                                    }
                                    break block11;
                                }
                                this.getMediationNetwork.put(object3, "SERVICE_UNAVAILABLE");
                                object = AFLogger.INSTANCE;
                                object2 = AFh1vSDK.hashCode;
                                String string7 = "InstallReferrer not supported";
                                ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), string7);
                                break block11;
                            }
                            object2 = this.getMediationNetwork;
                            object8 = "OK";
                            object2.put(object3, object8);
                            try {
                                object2 = AFLogger.INSTANCE;
                                object8 = AFh1vSDK.hashCode;
                                object3 = "InstallReferrer connected";
                                ((AFh1uSDK)object2).d((AFh1vSDK)((Object)object8), (String)object3);
                                boolean bl2 = ((InstallReferrerClient)object).isReady();
                                if (!bl2) break block12;
                                object2 = ((InstallReferrerClient)object).getInstallReferrer();
                                object8 = ((ReferrerDetails)object2).getInstallReferrer();
                                if (object8 == null) break block13;
                                object7 = this.getRevenue;
                                object3 = "val";
                                object7.put(object3, object8);
                                object7 = this.getMediationNetwork;
                                object3 = "referrer";
                                object7.put(object3, object8);
                            }
                            catch (Throwable throwable) {
                                object4 = throwable;
                                break block14;
                            }
                        }
                        long l3 = ((ReferrerDetails)object2).getReferrerClickTimestampSeconds();
                        object8 = this.getRevenue;
                        object7 = "clk";
                        object5 = Long.toString(l3);
                        object8.put(object7, object5);
                        object8 = this.getMediationNetwork;
                        object7 = "click_ts";
                        object3 = l3;
                        object8.put(object7, object3);
                        l3 = ((ReferrerDetails)object2).getInstallBeginTimestampSeconds();
                        object8 = this.getRevenue;
                        object7 = "install";
                        object5 = Long.toString(l3);
                        object8.put(object7, object5);
                        object8 = this.getMediationNetwork;
                        object7 = "install_begin_ts";
                        object3 = l3;
                        object8.put(object7, object3);
                        object8 = new HashMap();
                        try {
                            boolean bl3 = ((ReferrerDetails)object2).getGooglePlayInstantParam();
                            object3 = this.getRevenue;
                            object4 = bl3;
                            object3.put(object6, object4);
                            object7 = bl3;
                            ((AbstractMap)object8).put(object6, object7);
                        }
                        catch (NoSuchMethodError noSuchMethodError) {
                            object6 = "getGooglePlayInstantParam not exist";
                            AFLogger.afErrorLogForExcManagerOnly(object6, noSuchMethodError);
                        }
                        object7 = "click_server_ts";
                        try {
                            long l4 = ((ReferrerDetails)object2).getReferrerClickTimestampServerSeconds();
                            object6 = l4;
                            ((AbstractMap)object8).put(object7, object6);
                            object7 = "install_begin_server_ts";
                            l4 = ((ReferrerDetails)object2).getInstallBeginTimestampServerSeconds();
                            object6 = l4;
                            ((AbstractMap)object8).put(object7, object6);
                            object7 = "install_version";
                            object2 = ((ReferrerDetails)object2).getInstallVersion();
                            ((AbstractMap)object8).put(object7, object2);
                        }
                        catch (NoSuchMethodError noSuchMethodError) {
                            object4 = noSuchMethodError;
                            object7 = AFLogger.INSTANCE;
                            object6 = AFh1vSDK.hashCode;
                            object3 = "some method not exist";
                            object5 = null;
                            string2 = null;
                            ((AFh1uSDK)object7).e((AFh1vSDK)((Object)object6), (String)object3, noSuchMethodError, false, false);
                        }
                        n4 = (int)(((AbstractMap)object8).isEmpty() ? 1 : 0);
                        if (n4 == 0) {
                            object2 = this.getMediationNetwork;
                            object7 = "google_custom";
                            object2.put(object7, object8);
                        }
                        ((InstallReferrerClient)object).endConnection();
                        break block11;
                    }
                    ((AFh1uSDK)object2).w((AFh1vSDK)((Object)object8), (String)object7);
                    object = this.getRevenue;
                    object.put(string3, object7);
                    break block11;
                }
                object7 = AFLogger.INSTANCE;
                object6 = AFh1vSDK.hashCode;
                object = new StringBuilder("Failed to get install referrer: ");
                object2 = ((Throwable)object4).getMessage();
                ((StringBuilder)object).append((String)object2);
                object = object.toString();
                ((AFh1uSDK)object7).w((AFh1vSDK)((Object)object6), (String)object);
                object = this.getRevenue;
                object2 = ((Throwable)object4).getMessage();
                object.put(string3, object2);
                object5 = null;
                string2 = null;
                object3 = "Failed to get install referrer";
                ((AFh1uSDK)object7).e((AFh1vSDK)((Object)object6), (String)object3, (Throwable)object4, false, false);
                break block11;
            }
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.hashCode;
            String string8 = "InstallReferrer SERVICE_DISCONNECTED";
            ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), string8);
            object = this.getMediationNetwork;
            object2 = "SERVICE_DISCONNECTED";
            object.put(object3, object2);
        }
        object = AFLogger.INSTANCE;
        object2 = AFh1vSDK.hashCode;
        ((AFh1uSDK)object).d((AFh1vSDK)((Object)object2), "Install Referrer collected locally");
        this.getRevenue();
    }

    public final void getMediationNetwork(Context context) {
        Object object;
        long l2;
        boolean bl2 = this.getCurrencyIso4217Code(context);
        if (!bl2) {
            return;
        }
        this.component1 = l2 = System.currentTimeMillis();
        Object object2 = AFj1sSDK$AFa1zSDK.AFAdRevenueData;
        this.component2 = object2;
        object2 = new AFj1sSDK$1(this);
        this.addObserver((Observer)object2);
        try {
            object2 = InstallReferrerClient.newBuilder(context);
        }
        catch (Throwable throwable) {
            object2 = AFLogger.INSTANCE;
            object = AFh1vSDK.hashCode;
            ((AFh1uSDK)object2).e((AFh1vSDK)((Object)object), "referrerClient -> startConnection", throwable);
            return;
        }
        object2 = ((InstallReferrerClient$Builder)object2).build();
        object = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.hashCode;
        String string2 = "Connecting to Install Referrer Library...";
        ((AFh1uSDK)object).d(aFh1vSDK, string2);
        object = new AFi1eSDK$1(this, (InstallReferrerClient)object2, context);
        ((InstallReferrerClient)object2).startConnection((InstallReferrerStateListener)object);
    }
}

