/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1hSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFj1dSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AFc1iSDK
implements AFc1hSDK {
    private final AFd1rSDK getCurrencyIso4217Code;

    public AFc1iSDK(AFd1rSDK aFd1rSDK) {
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        this.getCurrencyIso4217Code = aFd1rSDK;
    }

    public final void AFAdRevenueData(Map object) {
        Intrinsics.checkNotNullParameter(object, "");
        AFd1rSDK aFd1rSDK = this.getCurrencyIso4217Code;
        JSONObject jSONObject = new JSONObject((Map)object);
        object = jSONObject.toString();
        aFd1rSDK.AFAdRevenueData("deeplink_data", (String)object);
    }

    public final void getCurrencyIso4217Code() {
        this.getCurrencyIso4217Code.AFAdRevenueData("deeplink_data");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map getMonetizationNetwork() {
        Object object = this.getCurrencyIso4217Code;
        String string2 = "deeplink_data";
        boolean bl2 = object.getMonetizationNetwork(string2);
        if (bl2) {
            Throwable throwable2;
            block4: {
                try {
                    object = this.getCurrencyIso4217Code;
                    Object var4_5 = null;
                    object = object.getMonetizationNetwork(string2, null);
                    if (object == null) {
                        return fh1_2.f();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                string2 = new JSONObject((String)object);
                return AFj1dSDK.AFAdRevenueData((JSONObject)string2);
            }
            string2 = null;
            String string3 = "Exception while parsing stored deeplink data";
            boolean bl3 = true;
            AFLogger.afErrorLog(string3, throwable2, bl3, false);
        }
        return fh1_2.f();
    }
}

