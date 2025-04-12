/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1kSDK;
import com.appsflyer.internal.AFg1tSDK;
import com.appsflyer.internal.AFg1wSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONObject;

public abstract class AFf1vSDK
extends AFf1oSDK {
    private final AFf1zSDK component3;
    private final Map copy;
    private final AFg1kSDK copydefault;
    private final AFd1rSDK equals;
    private final AFd1qSDK hashCode;
    private final AFg1tSDK toString;

    public AFf1vSDK(AFf1zSDK object, AFf1zSDK[] aFf1zSDKArray, AFd1kSDK aFd1kSDK, String string2, Map map2) {
        string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(aFf1zSDKArray, string2);
        Intrinsics.checkNotNullParameter(aFd1kSDK, string2);
        Intrinsics.checkNotNullParameter(map2, string2);
        super((AFf1zSDK)((Object)object), aFf1zSDKArray, aFd1kSDK, null);
        this.component3 = object;
        this.copy = map2;
        object = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.hashCode = object;
        object = aFd1kSDK.getRevenue();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.equals = object;
        object = aFd1kSDK.component1();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.copydefault = object;
        object = aFd1kSDK.v();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.toString = object;
    }

    public abstract AFe1tSDK AFAdRevenueData(Map var1, String var2, String var3);

    public String AFAdRevenueData(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "");
        return null;
    }

    public void AFAdRevenueData(Map map2, String string2) {
        Intrinsics.checkNotNullParameter(map2, "");
        Object object = this.hashCode.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        String string3 = "app_id";
        map2.put(string3, object);
        object = AFd1qSDK.AFAdRevenueData();
        if (object != null) {
            string3 = "cuid";
            map2.put(string3, object);
        }
        object = this.hashCode.getMonetizationNetwork.AFAdRevenueData;
        string3 = object.getPackageName();
        object = AFb1qSDK.getMediationNetwork((Context)object, string3);
        string3 = "app_version_name";
        map2.put(string3, object);
        boolean bl2 = this.component4();
        if (bl2) {
            long l2 = this.copydefault.getCurrencyIso4217Code();
            object = l2;
            string3 = "event_timestamp";
            map2.put(string3, object);
        }
        if (string2 != null) {
            object = "billing_lib_version";
            map2.put(object, string2);
        }
    }

    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public boolean component4() {
        return false;
    }

    public final boolean copydefault() {
        return true;
    }

    public final AFe1tSDK getMediationNetwork(String object) {
        Object object2;
        boolean bl2;
        int n3;
        String string2;
        boolean bl3;
        String string3 = "";
        Intrinsics.checkNotNullParameter(object, string3);
        Object object3 = fh1_2.q(this.copy);
        Object object4 = this.AFAdRevenueData((Map)object3);
        Object object5 = this.getMediationNetwork((Map)object3);
        object3 = fh1_2.q((Map)object3);
        this.AFAdRevenueData((Map)object3, (String)object4);
        Object object6 = new Object();
        Object object7 = this.hashCode.getMonetizationNetwork();
        if (object7 != null && !(bl3 = b.k((CharSequence)object7))) {
            string2 = "advertising_id";
            object6.put(string2, object7);
        }
        object7 = AFb1vSDK.getCurrencyIso4217Code(this.hashCode.getMonetizationNetwork.AFAdRevenueData);
        bl3 = false;
        string2 = null;
        if (object7 != null) {
            object7 = ((AFb1tSDK)object7).getRevenue;
        } else {
            n3 = 0;
            object7 = null;
        }
        if (object7 != null && !(bl2 = b.k((CharSequence)object7))) {
            object2 = "oaid";
            object6.put(object2, object7);
        }
        if ((object7 = AFb1vSDK.b_(this.hashCode.getMonetizationNetwork.AFAdRevenueData.getContentResolver())) != null) {
            object7 = ((AFb1tSDK)object7).getRevenue;
        } else {
            n3 = 0;
            object7 = null;
        }
        if (object7 != null && !(bl2 = b.k((CharSequence)object7))) {
            object2 = "amazon_aid";
            object6.put(object2, object7);
        }
        if ((n3 = ((AppsFlyerProperties)(object7 = AppsFlyerProperties.getInstance())).getBoolean((String)(object2 = "deviceTrackingDisabled"), false)) == 0) {
            object7 = this.component1;
            object2 = this.equals;
            if ((object7 = ((AFg1wSDK)object7).getRevenue((AFd1rSDK)object2)) != null && !(bl2 = b.k((CharSequence)object7))) {
                object2 = "imei";
                object6.put(object2, object7);
            }
        } else {
            object7 = "true";
            object3.put(object2, object7);
        }
        object7 = this.hashCode;
        object2 = ((AFd1qSDK)object7).getMonetizationNetwork;
        object7 = ((AFd1qSDK)object7).getRevenue;
        if ((object7 = AFb1iSDK.getCurrencyIso4217Code((AFd1nSDK)object2, (AFd1rSDK)object7)) == null) {
            object7 = string3;
        }
        object6.put("appsflyer_id", object7);
        n3 = Build.VERSION.SDK_INT;
        object7 = String.valueOf(n3);
        object6.put("os_version", object7);
        object7 = "sdk_version";
        object2 = "6.15.2";
        object6.put(object7, object2);
        if (object5 != null && (n3 = (int)(b.k((CharSequence)object5) ? 1 : 0)) == 0) {
            object7 = "sdk_connector_version";
            object6.put(object7, object5);
        }
        object3.put("device_data", object6);
        object5 = this.toString;
        object6 = this.component3;
        object5.AFAdRevenueData((Map)object3, (AFf1zSDK)((Object)object6));
        object = this.AFAdRevenueData((Map)object3, (String)object, (String)object4);
        if (object != null && (object4 = ((AFe1tSDK)object).getRevenue) != null) {
            string2 = ((AFe1mSDK)object4).getMediationNetwork;
        }
        if (string2 != null) {
            object4 = new JSONObject((Map)object3);
            object3 = this.toString();
            object5 = new StringBuilder();
            ((StringBuilder)object5).append((String)object3);
            ((StringBuilder)object5).append(": preparing data: ");
            AFb1bSDK.getCurrencyIso4217Code(((StringBuilder)object5).toString(), (JSONObject)object4);
            object3 = this.areAllFieldsValid;
            object4 = object4.toString();
            Intrinsics.checkNotNullExpressionValue(object4, string3);
            object3.getMediationNetwork(string2, (String)object4);
        }
        return object;
    }

    public String getMediationNetwork(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "");
        return null;
    }
}

