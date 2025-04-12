/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFf1zSDK;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class AFf1kSDK
extends AFe1eSDK {
    private static final int component1 = (int)TimeUnit.SECONDS.toMillis(2);
    private final AFc1kSDK areAllFieldsValid;
    private final Uri component2;
    private final AFc1oSDK component3;
    private Map component4;
    private final List equals;

    public AFf1kSDK(AFc1kSDK aFc1kSDK, AFc1oSDK aFc1oSDK, Uri uri, List list) {
        AFf1zSDK aFf1zSDK = AFf1zSDK.component2;
        AFf1zSDK aFf1zSDK2 = AFf1zSDK.getRevenue;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{aFf1zSDK2};
        super(aFf1zSDK, aFf1zSDKArray, "ResolveEsp");
        this.areAllFieldsValid = aFc1kSDK;
        this.component3 = aFc1oSDK;
        this.component2 = uri;
        this.equals = list;
    }

    private boolean getMediationNetwork(String string2) {
        Object object = "af_tranid=";
        boolean bl2 = string2.contains((CharSequence)object);
        if (bl2) {
            return false;
        }
        object = Gn.a("Validate if link ", string2, " belongs to ESP domains: ");
        Object object2 = this.equals;
        ((StringBuilder)object).append(object2);
        object = object.toString();
        AFLogger.afRDLog((String)object);
        try {
            object = this.equals;
        }
        catch (MalformedURLException malformedURLException) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", malformedURLException);
            return false;
        }
        object2 = new URL(string2);
        string2 = ((URL)object2).getHost();
        return object.contains(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Map v_(Uri object) {
        Throwable throwable2;
        HashMap<Object, Object> hashMap;
        block3: {
            block2: {
                hashMap = new HashMap<Object, Object>();
                try {
                    String string2 = "ESP deeplink resolving is started: ";
                    Object object2 = new StringBuilder(string2);
                    string2 = object.toString();
                    ((StringBuilder)object2).append(string2);
                    object2 = object2.toString();
                    AFLogger.afDebugLog((String)object2);
                    object = object.toString();
                    object2 = new URL((String)object);
                    object = ((URL)object2).openConnection();
                    object = (HttpURLConnection)object;
                    int n3 = 0;
                    object2 = null;
                    ((HttpURLConnection)object).setInstanceFollowRedirects(false);
                    n3 = component1;
                    ((URLConnection)object).setReadTimeout(n3);
                    ((URLConnection)object).setConnectTimeout(n3);
                    object2 = "User-agent";
                    string2 = "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)";
                    ((URLConnection)object).setRequestProperty((String)object2, string2);
                    object2 = "af-esp";
                    string2 = "6.15.2";
                    ((URLConnection)object).setRequestProperty((String)object2, string2);
                    n3 = ((HttpURLConnection)object).getResponseCode();
                    string2 = "status";
                    Integer n4 = n3;
                    ((AbstractMap)hashMap).put(string2, n4);
                    int n7 = 300;
                    if (n7 > n3 || n3 > (n7 = 305)) break block2;
                    object2 = "res";
                    string2 = "Location";
                    string2 = ((URLConnection)object).getHeaderField(string2);
                    ((AbstractMap)hashMap).put(object2, string2);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            ((HttpURLConnection)object).disconnect();
            object = "ESP deeplink resolving is finished";
            AFLogger.afDebugLog((String)object);
            return hashMap;
        }
        String string3 = throwable2.getLocalizedMessage();
        ((AbstractMap)hashMap).put("error", string3);
        String string4 = throwable2.getMessage();
        AFLogger.afErrorLog(string4, throwable2);
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1cSDK AFAdRevenueData() {
        String uri;
        String string2;
        int n3;
        Object object = this.component2.toString();
        boolean bl2 = this.getMediationNetwork((String)object);
        int n4 = 0;
        Object object2 = null;
        if (!bl2) {
            object = this.areAllFieldsValid;
            AFc1oSDK aFc1oSDK = this.component3;
            Uri uri2 = this.component2;
            ((AFc1kSDK)object).r_(aFc1oSDK, uri2, null);
            return AFe1cSDK.getRevenue;
        }
        long l2 = System.currentTimeMillis();
        object = this.component2.toString();
        Object object3 = new ArrayList();
        Object object4 = null;
        HashMap<Object, Object> hashMap = null;
        for (int i3 = 0; i3 < (n3 = 5); ++i3) {
            Object object5;
            object = AFf1kSDK.v_(Uri.parse((String)object));
            object2 = (String)object.get("res");
            object4 = (Integer)object.get("status");
            string2 = "error";
            object = (String)object.get(string2);
            if (object2 != null && (n3 = (int)(this.getMediationNetwork((String)object2) ? 1 : 0)) != 0) {
                n3 = 4;
                if (i3 < n3) {
                    object3.add(object2);
                }
                object5 = object4;
                object4 = object;
                object = object2;
                object2 = object5;
                continue;
            }
            object5 = object4;
            object4 = object;
            object = object2;
            object2 = object5;
            break;
        }
        hashMap = new HashMap<Object, Object>();
        string2 = "res";
        Object object6 = object != null ? object : "";
        hashMap.put(string2, object6);
        string2 = "status";
        n4 = object2 != null ? ((Number)object2).intValue() : -1;
        object2 = n4;
        hashMap.put(string2, object2);
        if (object4 != null) {
            object2 = "error";
            hashMap.put(object2, object4);
        }
        if ((n4 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
            object2 = "redirects";
            hashMap.put(object2, object3);
        }
        long l3 = System.currentTimeMillis() - l2;
        Object aFc1oSDK = l3;
        hashMap.put("latency", aFc1oSDK);
        object2 = this.component3;
        synchronized (object2) {
            aFc1oSDK = this.component3;
            uri = "af_deeplink_r";
            ((AFc1oSDK)aFc1oSDK).getMediationNetwork(uri, hashMap);
            aFc1oSDK = this.component3;
            uri = "af_deeplink";
            object3 = this.component2;
            object3 = object3.toString();
            ((AFc1oSDK)aFc1oSDK).getMediationNetwork(uri, object3);
        }
        object2 = this.areAllFieldsValid;
        aFc1oSDK = this.component3;
        object = object != null ? Uri.parse((String)object) : this.component2;
        uri = this.component2;
        ((AFc1kSDK)object2).r_((AFc1oSDK)aFc1oSDK, (Uri)object, (Uri)uri);
        this.component4 = hashMap;
        return AFe1cSDK.getRevenue;
    }

    public final boolean getMediationNetwork() {
        return false;
    }

    public final long getMonetizationNetwork() {
        return 60000L;
    }
}

