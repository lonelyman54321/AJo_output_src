/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFc1hSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFf1aSDK;
import com.appsflyer.internal.AFf1eSDK;
import com.appsflyer.internal.AFf1fSDK$2;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFh1oSDK;
import com.appsflyer.internal.AFi1eSDK;
import com.appsflyer.internal.AFi1wSDK;
import com.appsflyer.internal.AFi1ySDK;
import com.appsflyer.internal.AFj1sSDK;
import com.appsflyer.internal.AFj1uSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AFf1fSDK
extends AFf1eSDK {
    private final AppsFlyerProperties AFInAppEventParameterName;
    private final AFh1oSDK AFInAppEventType;
    private final AFj1uSDK copy;
    public Map copydefault;
    private final AFd1rSDK hashCode;
    private final AFc1hSDK valueOf;
    private final AFf1aSDK values;

    public AFf1fSDK(AFa1oSDK object, AFd1kSDK aFd1kSDK) {
        super((AFa1oSDK)object, aFd1kSDK);
        this.copy = object = aFd1kSDK.equals();
        this.hashCode = object = aFd1kSDK.getRevenue();
        this.AFInAppEventType = object = aFd1kSDK.component3();
        this.values = object = aFd1kSDK.component2();
        this.AFInAppEventParameterName = object = AppsFlyerProperties.getInstance();
        this.valueOf = object = aFd1kSDK.afInfoLog();
        object = AFf1zSDK.component2;
        this.getCurrencyIso4217Code.add(object);
        object = AFf1zSDK.component3;
        this.getCurrencyIso4217Code.add(object);
    }

    public void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        Object object;
        boolean bl2;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        int n3;
        Object object6;
        super.getCurrencyIso4217Code(aFa1oSDK);
        boolean bl4 = aFa1oSDK.component1;
        this.getMonetizationNetwork((int)(bl4 ? 1 : 0));
        Object object7 = aFa1oSDK.getMonetizationNetwork();
        AFj1sSDK[] aFj1sSDKArray = "meta";
        object7 = (Map)object7.get(aFj1sSDKArray);
        if (object7 == null) {
            object7 = new HashMap();
            object6 = aFa1oSDK.getMonetizationNetwork();
            object6.put(aFj1sSDKArray, object7);
        }
        if ((n3 = (object6 = aFa1oSDK.getMonetizationNetwork()).containsKey(object5 = "af_deeplink")) == 0) {
            object6 = this.valueOf.getMonetizationNetwork();
            aFa1oSDK.getRevenue((Map)object6);
        }
        if ((object6 = this.values.AFAdRevenueData()) != null) {
            int n4;
            long l2;
            long l3;
            long l4;
            long l7;
            object5 = new HashMap();
            String string2 = ((AFi1ySDK)object6).AFAdRevenueData;
            ((HashMap)object5).put("cdn_token", string2);
            Object object8 = ((AFi1ySDK)object6).getMediationNetwork;
            if (object8 != null) {
                string2 = "c_ver";
                ((HashMap)object5).put(string2, object8);
            }
            if ((object4 = (l7 = (l4 = ((AFi1ySDK)object6).getRevenue) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) > 0) {
                object8 = l4;
                string2 = "latency";
                ((HashMap)object5).put(string2, object8);
            }
            if ((object4 = (l2 = (l4 = ((AFi1ySDK)object6).getCurrencyIso4217Code) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
                object8 = l4;
                string2 = "delay";
                ((HashMap)object5).put(string2, object8);
            }
            if ((n4 = ((AFi1ySDK)object6).getMonetizationNetwork) > 0) {
                object8 = n4;
                string2 = "res_code";
                ((HashMap)object5).put(string2, object8);
            }
            if ((object8 = ((AFi1ySDK)object6).component2) != null) {
                object8 = new StringBuilder();
                string2 = ((AFi1ySDK)object6).component2.getClass().getSimpleName();
                ((StringBuilder)object8).append(string2);
                ((StringBuilder)object8).append(": ");
                string2 = ((AFi1ySDK)object6).component2.getMessage();
                ((StringBuilder)object8).append(string2);
                object8 = object8.toString();
                string2 = "error";
                ((HashMap)object5).put(string2, object8);
            }
            if ((object8 = ((AFi1ySDK)object6).component1) != null) {
                string2 = "sig";
                object8 = ((AFi1wSDK)((Object)object8)).toString();
                ((HashMap)object5).put(string2, object8);
            }
            if ((object6 = ((AFi1ySDK)object6).component4) != null) {
                object8 = "cdn_cache_status";
                ((HashMap)object5).put(object8, object6);
            }
            object6 = "rc";
            object7.put(object6, object5);
        }
        object6 = this.equals;
        object5 = aFa1oSDK.getMonetizationNetwork();
        object6.AFAdRevenueData((Map)object5);
        n3 = 0;
        object6 = null;
        object5 = "first_launch";
        boolean bl3 = 2 != 0;
        boolean bl5 = true;
        if (bl4 != bl5) {
            if (bl4 == bl3) {
                object3 = this.AFInAppEventType;
                object3 = ((AFh1oSDK)object3).getCurrencyIso4217Code;
                object2 = new HashMap(object3);
                bl2 = ((HashMap)object2).isEmpty();
                if (!bl2) {
                    object7.put(object5, object2);
                }
                object3 = this.AFInAppEventType.AFAdRevenueData;
                object3.AFAdRevenueData((String)object5);
            }
        } else {
            object3 = this.AFInAppEventParameterName;
            object2 = "waitForCustomerId";
            bl2 = ((AppsFlyerProperties)object3).getBoolean((String)object2, false);
            if (bl2) {
                object3 = aFa1oSDK.getMonetizationNetwork();
                object2 = "wait_cid";
                object = Boolean.toString(bl5);
                object3.put(object2, object);
            }
            object3 = this.AFInAppEventType;
            object3 = ((AFh1oSDK)object3).getRevenue;
            object2 = new HashMap(object3);
            object3 = this.AFInAppEventType.AFAdRevenueData;
            object = "ddl";
            object3.AFAdRevenueData((String)object);
            bl2 = ((HashMap)object2).isEmpty();
            if (!bl2) {
                object7.put(object, object2);
            }
            object3 = this.AFInAppEventType;
            object3 = ((AFh1oSDK)object3).getCurrencyIso4217Code;
            object2 = new HashMap(object3);
            bl2 = ((HashMap)object2).isEmpty();
            if (!bl2) {
                object7.put(object5, object2);
            }
        }
        boolean bl6 = object7.isEmpty();
        if (bl6) {
            object7 = aFa1oSDK.getMonetizationNetwork();
            object7.remove(aFj1sSDKArray);
        }
        if (bl4 <= bl3) {
            Object object9;
            object7 = new ArrayList();
            aFj1sSDKArray = this.copy.getCurrencyIso4217Code();
            int n7 = aFj1sSDKArray.length;
            while (n3 < n7) {
                object3 = aFj1sSDKArray[n3];
                boolean bl7 = object3 instanceof AFi1eSDK;
                object = AFf1fSDK$2.getCurrencyIso4217Code;
                Object object10 = ((AFj1sSDK)object3).component2;
                int n8 = object10.ordinal();
                object4 = object[n8];
                if (object4 != bl5) {
                    if (object4 == bl3 && bl4 == bl3 && !bl7) {
                        object2 = new HashMap();
                        object10 = ((AFj1sSDK)object3).getMonetizationNetwork;
                        ((HashMap)object2).put("source", object10);
                        object10 = "TIMEOUT";
                        ((HashMap)object2).put("response", object10);
                        object = "type";
                        object3 = ((AFj1sSDK)object3).component3;
                        ((HashMap)object2).put(object, object3);
                        ((ArrayList)object7).add(object2);
                    }
                } else {
                    if (bl7) {
                        object2 = object3;
                        object2 = ((AFi1eSDK)object3).getRevenue;
                        aFa1oSDK.getCurrencyIso4217Code("rfr", object2);
                        object2 = this.hashCode;
                        object = "newGPReferrerSent";
                        object2.getRevenue((String)object, bl5);
                    }
                    object3 = ((AFj1sSDK)object3).getMediationNetwork;
                    ((ArrayList)object7).add(object3);
                }
                ++n3;
            }
            boolean bl8 = ((ArrayList)object7).isEmpty();
            if (!bl8) {
                object9 = "referrers";
                aFa1oSDK.getCurrencyIso4217Code((String)object9, object7);
            }
            if ((object9 = this.copydefault) != null) {
                object7 = "fb_ddl";
                aFa1oSDK.getCurrencyIso4217Code((String)object7, object9);
            }
        }
        this.equals.getCurrencyIso4217Code(aFa1oSDK);
    }

    public void getMonetizationNetwork(int n3) {
        this.AFInAppEventType.getRevenue(n3);
    }

    public final void getRevenue() {
        super.getRevenue();
        Object object = this.AFInAppEventType;
        Object object2 = this.component3;
        int n3 = ((AFa1oSDK)object2).component1;
        long l2 = System.currentTimeMillis();
        int n4 = 1;
        if (n3 == n4) {
            long l3 = ((AFh1oSDK)object).component3;
            long l4 = 0L;
            long l7 = l3 - l4;
            n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n3 != 0) {
                object2 = ((AFh1oSDK)object).getCurrencyIso4217Code;
                Long l8 = l2 - l3;
                object2.put("net", l8);
                object2 = ((AFh1oSDK)object).getCurrencyIso4217Code;
                l8 = new JSONObject((Map)object2);
                object = ((AFh1oSDK)object).AFAdRevenueData;
                object2 = l8.toString();
                object.AFAdRevenueData("first_launch", (String)object2);
                return;
            }
            object = "Metrics: launch start ts is missing";
            AFLogger.afInfoLog((String)object);
        }
    }
}

