/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1mSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFh1sSDK;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class AFh1oSDK {
    public final AFd1rSDK AFAdRevenueData;
    public long areAllFieldsValid;
    public final long[] component1;
    public final long[] component2;
    public long component3;
    public final long[] component4;
    public long equals;
    public final Map getCurrencyIso4217Code;
    public long getMediationNetwork;
    public final Map getMonetizationNetwork;
    public final Map getRevenue;
    public long hashCode;

    public AFh1oSDK(AFd1rSDK aFd1rSDK) {
        long l2;
        long l3;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        Map map2;
        this.getCurrencyIso4217Code = map2 = new Map();
        this.getRevenue = concurrentHashMap2 = new ConcurrentHashMap();
        this.getMonetizationNetwork = concurrentHashMap = new ConcurrentHashMap();
        this.getMediationNetwork = l3 = 0L;
        this.areAllFieldsValid = l3;
        int n3 = 2;
        long[] lArray = new long[n3];
        this.component1 = lArray;
        lArray = new long[n3];
        this.component2 = lArray;
        Object object = new long[n3];
        this.component4 = object;
        this.component3 = l3;
        this.hashCode = l3;
        this.AFAdRevenueData = aFd1rSDK;
        object = this.getRevenue("first_launch");
        map2.putAll(object);
        map2 = this.getRevenue("ddl");
        concurrentHashMap2.putAll(map2);
        map2 = this.getRevenue("gcd");
        concurrentHashMap.putAll(map2);
        this.equals = l2 = aFd1rSDK.getMediationNetwork("prev_session_dur", l3);
    }

    private Map getRevenue(String string2) {
        Map map2 = Collections.emptyMap();
        Object object = this.AFAdRevenueData;
        boolean bl2 = false;
        if ((string2 = object.getMonetizationNetwork(string2, null)) != null) {
            try {
                object = new JSONObject(string2);
                map2 = AFa1mSDK.getRevenue((JSONObject)object);
            }
            catch (Exception exception) {
                object = "Error while parsing cached json data";
                bl2 = true;
                AFLogger.afErrorLog((String)object, exception, bl2);
            }
        }
        return map2;
    }

    public final void AFAdRevenueData(AFh1sSDK object) {
        boolean bl2 = this.getCurrencyIso4217Code();
        if (bl2) {
            Object object2 = this.getCurrencyIso4217Code;
            object = object.toString();
            object2.put("start_with", object);
            object = this.getCurrencyIso4217Code;
            object2 = new JSONObject((Map)object);
            object = this.AFAdRevenueData;
            object2 = object2.toString();
            String string2 = "first_launch";
            object.AFAdRevenueData(string2, (String)object2);
        }
    }

    public final void getCurrencyIso4217Code(int n3) {
        Object object;
        long l2 = System.currentTimeMillis();
        long l3 = this.hashCode;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 != false) {
            Map map2 = this.getMonetizationNetwork;
            object = l2 -= l3;
            String string2 = "net";
            map2.put(string2, object);
        } else {
            object = "Metrics: gcdStart ts is missing";
            AFLogger.afInfoLog((String)object);
        }
        object = this.getMonetizationNetwork;
        Object object3 = n3;
        object.put("retries", object3);
        object3 = this.getMonetizationNetwork;
        object = new JSONObject((Map)object3);
        object3 = this.AFAdRevenueData;
        object = object.toString();
        object3.AFAdRevenueData("gcd", (String)object);
    }

    public final boolean getCurrencyIso4217Code() {
        AFd1rSDK aFd1rSDK = this.AFAdRevenueData;
        String string2 = "appsFlyerCount";
        int n3 = aFd1rSDK.getMediationNetwork(string2, 0);
        return n3 == 0;
    }

    public final void getMonetizationNetwork() {
        long l2;
        this.areAllFieldsValid = l2 = System.currentTimeMillis();
        boolean bl2 = this.getCurrencyIso4217Code();
        if (bl2) {
            l2 = this.getMediationNetwork;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object != false) {
                Map map2 = this.getCurrencyIso4217Code;
                Object object2 = this.areAllFieldsValid - l2;
                map2.put("init_to_fg", object2);
                object2 = this.getCurrencyIso4217Code;
                Object object3 = new JSONObject((Map)object2);
                object2 = this.AFAdRevenueData;
                object3 = object3.toString();
                object2.AFAdRevenueData("first_launch", (String)object3);
                return;
            }
            String string2 = "Metrics: init ts is missing";
            AFLogger.afInfoLog(string2);
        }
    }

    public final void getRevenue(int n3) {
        long l2;
        this.component3 = l2 = System.currentTimeMillis();
        int n4 = 1;
        if (n3 == n4) {
            long l3 = this.areAllFieldsValid;
            long l4 = 0L;
            long l7 = l3 - l4;
            n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n3 != 0) {
                Object object = this.getCurrencyIso4217Code;
                Object object2 = l2 - l3;
                object.put("from_fg", object2);
                object = this.getCurrencyIso4217Code;
                object2 = new JSONObject((Map)object);
                object = this.AFAdRevenueData;
                object2 = object2.toString();
                object.AFAdRevenueData("first_launch", (String)object2);
                return;
            }
            String string2 = "Metrics: fg ts is missing";
            AFLogger.afInfoLog(string2);
        }
    }

    public final void getRevenue(DeepLinkResult object, long l2) {
        Map map2 = this.getRevenue;
        object = ((Object)((Object)((DeepLinkResult)object).getStatus())).toString();
        map2.put("status", object);
        object = this.getRevenue;
        Object object2 = l2;
        object.put("timeout_value", object2);
        object = this.getRevenue;
        object2 = new JSONObject((Map)object);
        object = this.AFAdRevenueData;
        object2 = object2.toString();
        object.AFAdRevenueData("ddl", (String)object2);
    }
}

