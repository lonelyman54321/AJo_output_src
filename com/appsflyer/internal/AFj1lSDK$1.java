/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.miui.referrer.api.GetAppsReferrerClient
 *  com.miui.referrer.api.GetAppsReferrerStateListener
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFj1lSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.AbstractMap;
import java.util.HashMap;

final class AFj1lSDK$1
implements GetAppsReferrerStateListener {
    private /* synthetic */ AFj1lSDK AFAdRevenueData;
    private /* synthetic */ GetAppsReferrerClient getCurrencyIso4217Code;
    private /* synthetic */ Context getRevenue;

    public AFj1lSDK$1(AFj1lSDK aFj1lSDK, Context context, GetAppsReferrerClient getAppsReferrerClient) {
        this.AFAdRevenueData = aFj1lSDK;
        this.getRevenue = context;
        this.getCurrencyIso4217Code = getAppsReferrerClient;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onGetAppsReferrerSetupFinished(int n3) {
        Object object;
        Object object2;
        block6: {
            Object object3;
            Object object4;
            block10: {
                Throwable throwable2;
                Object object5;
                block9: {
                    block7: {
                        long l2;
                        block8: {
                            block11: {
                                block12: {
                                    block13: {
                                        object2 = this.AFAdRevenueData.getMediationNetwork;
                                        object4 = this.getRevenue;
                                        object3 = "com.xiaomi.mipicks";
                                        l2 = AFb1qSDK.AFAdRevenueData((Context)object4, (String)object3);
                                        object4 = l2;
                                        object5 = "api_ver";
                                        object2.put(object5, object4);
                                        object2 = this.AFAdRevenueData.getMediationNetwork;
                                        object4 = AFb1qSDK.getMediationNetwork(this.getRevenue, (String)object3);
                                        object3 = "api_ver_name";
                                        object2.put(object3, object4);
                                        int n4 = -1;
                                        object4 = "response";
                                        if (n3 == n4) break block10;
                                        if (n3 == 0) break block11;
                                        n4 = 1;
                                        if (n3 == n4) break block12;
                                        n4 = 2;
                                        if (n3 == n4) break block13;
                                        n4 = 3;
                                        object3 = "XiaomiInstallReferrer DEVELOPER_ERROR";
                                        if (n3 != n4) {
                                            n4 = 4;
                                            if (n3 != n4) {
                                                object = AFLogger.INSTANCE;
                                                object2 = AFh1vSDK.hashCode;
                                                object4 = "responseCode not found.";
                                                ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), (String)object4);
                                                break block6;
                                            } else {
                                                object = AFLogger.INSTANCE;
                                                object2 = AFh1vSDK.hashCode;
                                                ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), (String)object3);
                                                object = this.AFAdRevenueData.getMediationNetwork;
                                                object2 = "PERMISSION_ERROR";
                                                object.put(object4, object2);
                                            }
                                            break block6;
                                        } else {
                                            object = AFLogger.INSTANCE;
                                            object2 = AFh1vSDK.hashCode;
                                            ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), (String)object3);
                                            object = this.AFAdRevenueData.getMediationNetwork;
                                            object2 = "DEVELOPER_ERROR";
                                            object.put(object4, object2);
                                        }
                                        break block6;
                                    }
                                    object = AFLogger.INSTANCE;
                                    object2 = AFh1vSDK.hashCode;
                                    object3 = "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED";
                                    ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), (String)object3);
                                    object = this.AFAdRevenueData.getMediationNetwork;
                                    object2 = "FEATURE_NOT_SUPPORTED";
                                    object.put(object4, object2);
                                    break block6;
                                }
                                this.AFAdRevenueData.getMediationNetwork.put(object4, "SERVICE_UNAVAILABLE");
                                object = AFLogger.INSTANCE;
                                object2 = AFh1vSDK.hashCode;
                                object4 = "XiaomiInstallReferrer not supported";
                                ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), (String)object4);
                                break block6;
                            }
                            object = this.AFAdRevenueData;
                            object2 = this.getCurrencyIso4217Code;
                            object3 = ((AFj1sSDK)object).getMediationNetwork;
                            object5 = "OK";
                            object3.put(object4, object5);
                            try {
                                object4 = AFLogger.INSTANCE;
                                object3 = AFh1vSDK.hashCode;
                                object5 = "XiaomiInstallReferrer connected";
                                ((AFh1uSDK)object4).d((AFh1vSDK)((Object)object3), (String)object5);
                                boolean bl2 = object2.isReady();
                                if (!bl2) break block7;
                                object4 = (object2 = object2.getInstallReferrer()).getInstallReferrer();
                                if (object4 == null) break block8;
                                object3 = ((AFj1sSDK)object).getMediationNetwork;
                                object5 = "referrer";
                                object3.put(object5, object4);
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        long l3 = object2.getReferrerClickTimestampSeconds();
                        object5 = ((AFj1sSDK)object).getMediationNetwork;
                        String string2 = "click_ts";
                        object4 = l3;
                        object5.put(string2, object4);
                        l3 = object2.getInstallBeginTimestampSeconds();
                        object5 = ((AFj1sSDK)object).getMediationNetwork;
                        string2 = "install_begin_ts";
                        object4 = l3;
                        object5.put(string2, object4);
                        object4 = new HashMap();
                        object3 = "click_server_ts";
                        l2 = object2.getReferrerClickTimestampServerSeconds();
                        object5 = l2;
                        ((AbstractMap)object4).put(object3, object5);
                        object3 = "install_begin_server_ts";
                        l2 = object2.getInstallBeginTimestampServerSeconds();
                        object5 = l2;
                        ((AbstractMap)object4).put(object3, object5);
                        object3 = "install_version";
                        object2 = object2.getInstallVersion();
                        ((AbstractMap)object4).put(object3, object2);
                        object = ((AFj1sSDK)object).getMediationNetwork;
                        object2 = "xiaomi_custom";
                        object.put(object2, object4);
                        break block6;
                    }
                    object = "XiaomiReferrerClient: XiaomiInstallReferrer is not ready";
                    ((AFh1uSDK)object4).w((AFh1vSDK)((Object)object3), (String)object);
                    break block6;
                }
                object2 = AFLogger.INSTANCE;
                object4 = AFh1vSDK.hashCode;
                object5 = "Failed to get Xiaomi install referrer: ";
                object3 = new StringBuilder((String)object5);
                object = throwable2.getMessage();
                ((StringBuilder)object3).append((String)object);
                object = object3.toString();
                ((AFh1uSDK)object2).w((AFh1vSDK)((Object)object4), (String)object);
                break block6;
            }
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.hashCode;
            object3 = "XiaomiInstallReferrer SERVICE_DISCONNECTED";
            ((AFh1uSDK)object).w((AFh1vSDK)((Object)object2), (String)object3);
            object = this.AFAdRevenueData.getMediationNetwork;
            object2 = "SERVICE_DISCONNECTED";
            object.put(object4, object2);
        }
        object = AFLogger.INSTANCE;
        object2 = AFh1vSDK.hashCode;
        ((AFh1uSDK)object).d((AFh1vSDK)((Object)object2), "Xiaomi Install Referrer collected locally");
        this.AFAdRevenueData.getRevenue();
        this.getCurrencyIso4217Code.endConnection();
    }

    public final void onGetAppsServiceDisconnected() {
    }
}

