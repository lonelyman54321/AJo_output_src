/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.share.LinkGenerator$ResponseListener;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyer2dXConversionCallback
implements AppsFlyerConversionListener,
DeepLinkListener,
LinkGenerator$ResponseListener {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void getRevenue(String var1_1, String var2_3) {
        block9: {
            block8: {
                block7: {
                    try {
                        var3_4 = new JSONObject();
                        var4_6 = "status";
                        var5_8 = "failure";
                        var3_4.put(var4_6, (Object)var5_8);
                        var4_6 = "data";
                        var3_4.put(var4_6, (Object)var2_3);
                        var6_9 = var1_1.hashCode();
                        var7_10 = -1390007222;
                        var8_11 = 1;
                        if (var6_9 == var7_10) break block7;
                        var7_10 = 1050716216;
                        if (var6_9 == var7_10 && (var9_12 = (int)var1_1.equals(var2_3 = "onInstallConversionFailure")) != 0) {
                            var9_12 = 0;
                            var1_1 = null;
                            break block8;
                        }
                        ** GOTO lbl-1000
                    }
                    catch (JSONException var1_2) {
                        break block9;
                    }
                }
                var2_3 = "onAttributionFailure";
                var9_12 = var1_1.equals(var2_3);
                if (var9_12 != 0) {
                    var9_12 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var9_12 = -1;
                }
            }
            if (var9_12 == 0) {
                this.onInstallConversionFailureNative(var3_4);
                return;
            }
            if (var9_12 != var8_11) {
                return;
            }
            this.onAttributionFailureNative(var3_4);
            return;
        }
        var3_5 = AFLogger.INSTANCE;
        var4_7 = AFh1vSDK.getMonetizationNetwork;
        var3_5.e(var4_7, "2dx error", var1_2, false, false);
    }

    public void onAppOpenAttribution(Map map2) {
        this.onAppOpenAttributionNative(map2);
    }

    public native void onAppOpenAttributionNative(Object var1);

    public void onAttributionFailure(String string2) {
        this.getRevenue("onInstallConversionFailure", string2);
    }

    public native void onAttributionFailureNative(Object var1);

    public void onConversionDataFail(String string2) {
        this.getRevenue("onAttributionFailure", string2);
    }

    public void onConversionDataSuccess(Map map2) {
        this.onInstallConversionDataLoadedNative(map2);
    }

    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        this.onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(DeepLinkResult var1);

    public native void onInstallConversionDataLoadedNative(Object var1);

    public native void onInstallConversionFailureNative(Object var1);

    public void onResponse(String string2) {
        this.onResponseNative(string2);
    }

    public void onResponseError(String string2) {
        this.onResponseErrorNative(string2);
    }

    public native void onResponseErrorNative(String var1);

    public native void onResponseNative(String var1);
}

