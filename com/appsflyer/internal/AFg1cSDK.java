/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1rSDK;
import com.appsflyer.internal.AFf1fSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1aSDK;
import java.util.Map;
import org.json.JSONException;

public final class AFg1cSDK
extends AFe1eSDK {
    private final AFd1rSDK areAllFieldsValid;
    private final Throwable component3;
    private final AFe1kSDK component4;

    public AFg1cSDK(AFf1fSDK object, AFd1rSDK aFd1rSDK) {
        Object object2 = AFf1zSDK.copydefault;
        AFf1zSDK aFf1zSDK = AFf1zSDK.getRevenue;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{aFf1zSDK};
        super((AFf1zSDK)((Object)object2), aFf1zSDKArray, "GCD-CHECK");
        object2 = ((AFe1eSDK)object).component1();
        this.component3 = object2;
        this.component4 = object = ((AFf1oSDK)object).component4;
        this.areAllFieldsValid = aFd1rSDK;
    }

    private Map component4() {
        Object object = this.areAllFieldsValid;
        Object object2 = "attributionId";
        if ((object = object.getMonetizationNetwork((String)object2, null)) == null) {
            return null;
        }
        try {
            object2 = new AFe1rSDK();
            return AFe1rSDK.AFAdRevenueData((String)object);
        }
        catch (JSONException jSONException) {
            object2 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            String string2 = jSONException.getMessage();
            ((StringBuilder)object2).append(string2);
            AFLogger.afErrorLog(object2.toString(), jSONException);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1cSDK AFAdRevenueData() {
        Exception exception3;
        String string2;
        Object object;
        block9: {
            long l2;
            long l3;
            Object object2 = "is_first_launch";
            object = this.areAllFieldsValid;
            boolean bl2 = false;
            Boolean bl3 = null;
            object = String.valueOf(object.getMediationNetwork("appsFlyerCount", 0));
            AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat((String)object));
            object = this.areAllFieldsValid;
            string2 = "appsflyerConversionDataCacheExpiration";
            long l4 = 0L;
            long l7 = object.getMediationNetwork(string2, l4);
            long l8 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
            if (l8 != false && (l8 = (l3 = (l2 = System.currentTimeMillis() - l7) - (l7 = 5184000000L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
                AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
                this.areAllFieldsValid.getRevenue("sixtyDayConversionData", true);
                object = this.areAllFieldsValid;
                String string3 = "attributionId";
                object.AFAdRevenueData(string3, null);
                object = this.areAllFieldsValid;
                object.getMonetizationNetwork(string2, l4);
            }
            object = this.component4();
            string2 = "[GCD] Error executing conversion data callback: ";
            if (object != null) {
                Exception exception22;
                block8: {
                    block7: {
                        try {
                            bl2 = object.containsKey(object2);
                            if (bl2) break block7;
                            bl3 = Boolean.FALSE;
                            object.put(object2, bl3);
                        }
                        catch (Exception exception22) {
                            break block8;
                        }
                    }
                    AFg1aSDK.AFAdRevenueData((Map)object);
                    return AFe1cSDK.getRevenue;
                }
                object = new StringBuilder(string2);
                string2 = exception22.getLocalizedMessage();
                ((StringBuilder)object).append(string2);
                object = object.toString();
                AFLogger.afErrorLog((String)object, exception22);
                return AFe1cSDK.getRevenue;
            }
            try {
                object2 = this.component3;
                if (object2 != null) {
                    object = "Launch exception: ";
                    object2 = new StringBuilder((String)object);
                    object = this.component3;
                    object = ((Throwable)object).getMessage();
                    ((StringBuilder)object2).append((String)object);
                    object2 = object2.toString();
                    AFg1aSDK.getRevenue((String)object2);
                    return AFe1cSDK.getRevenue;
                }
            }
            catch (Exception exception3) {
                break block9;
            }
            object2 = this.component4;
            if (object2 == null) return AFe1cSDK.getMonetizationNetwork;
            boolean bl4 = ((AFe1kSDK)object2).isSuccessful();
            if (bl4) return AFe1cSDK.getMonetizationNetwork;
            object = "Launch status code: ";
            object2 = new StringBuilder((String)object);
            object = this.component4;
            l8 = ((AFe1kSDK)object).getStatusCode();
            ((StringBuilder)object2).append((int)l8);
            object2 = object2.toString();
            AFg1aSDK.getRevenue((String)object2);
            return AFe1cSDK.getRevenue;
        }
        object = new StringBuilder(string2);
        string2 = exception3.getLocalizedMessage();
        ((StringBuilder)object).append(string2);
        object = object.toString();
        AFLogger.afErrorLog((String)object, exception3);
        return AFe1cSDK.getMonetizationNetwork;
    }

    public final boolean getMediationNetwork() {
        return false;
    }

    public final long getMonetizationNetwork() {
        return 1000L;
    }
}

