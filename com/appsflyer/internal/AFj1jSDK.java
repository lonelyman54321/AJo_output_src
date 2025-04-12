/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFh1aSDK;
import com.appsflyer.internal.AFh1bSDK;
import com.appsflyer.internal.AFh1gSDK;
import com.appsflyer.internal.AFj1bSDK;
import com.appsflyer.internal.AFj1jSDK$AFa1ySDK;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class AFj1jSDK {
    public static final AFj1jSDK$AFa1ySDK AFa1ySDK;
    public static final String areAllFieldsValid;
    public static final String component1;
    public static final String component2;
    public static String component3;
    private static final String component4;
    public static final String getCurrencyIso4217Code;
    public static final String getMediationNetwork;
    public static final String getMonetizationNetwork;
    public final AFj1bSDK AFAdRevenueData;
    public final AFd1qSDK getRevenue;

    static {
        String string2;
        Object object = new AFj1jSDK$AFa1ySDK(null);
        AFa1ySDK = object;
        object = AFb1rSDK.AFAdRevenueData;
        component4 = string2 = Ft2.a((String)object, "/androidevent?app_id=");
        getMonetizationNetwork = kp1_0.c("https://%sattr.%s/api/v", string2);
        getCurrencyIso4217Code = "https://%sadrevenue.%s/api/v2/generic/v6.15.2/android?app_id=";
        getMediationNetwork = kp1_0.c("https://%sconversions.%s/api/v", string2);
        areAllFieldsValid = kp1_0.c("https://%slaunches.%s/api/v", string2);
        component1 = kp1_0.c("https://%sinapps.%s/api/v", string2);
        component2 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        component3 = cP.a("https://%svalidate.%s/api/v", (String)object, "/androidevent?buildnumber=6.15.2&app_id=");
    }

    public AFj1jSDK(AFd1qSDK aFd1qSDK) {
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        this(aFd1qSDK, null, 2, null);
    }

    private AFj1jSDK(AFd1qSDK aFd1qSDK, AFj1bSDK aFj1bSDK) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(aFd1qSDK, string2);
        Intrinsics.checkNotNullParameter(aFj1bSDK, string2);
        this.getRevenue = aFd1qSDK;
        this.AFAdRevenueData = aFj1bSDK;
    }

    public /* synthetic */ AFj1jSDK(AFd1qSDK aFd1qSDK, AFj1bSDK aFj1bSDK, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
        }
        this(aFd1qSDK, aFj1bSDK);
    }

    public static String getCurrencyIso4217Code() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    public static String getMonetizationNetwork(String string2, boolean bl2) {
        String string3 = !bl2 ? "&buildnumber=6.15.2" : "";
        return Ft2.a(string2, string3);
    }

    public final String getMediationNetwork(AFh1gSDK object) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof AFh1bSDK;
        if (bl2) {
            return this.AFAdRevenueData.getMonetizationNetwork("https://%ssdk-services.%s/validate-android-signature");
        }
        boolean bl3 = object instanceof AFh1aSDK;
        if (bl3) {
            object = this.AFAdRevenueData;
            string2 = component3;
            object = object.getMonetizationNetwork(string2);
            string2 = this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
            return Ft2.a((String)object, string2);
        }
        object = new UnsupportedOperationException();
        throw object;
    }

    public final String getMediationNetwork(String string2) {
        String string3 = this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        return Ft2.a(string2, string3);
    }

    public final String getRevenue(String string2) {
        String string3 = this.getRevenue.component4();
        if (string3 != null) {
            String string4 = "&channel=";
            string3 = string4.concat(string3);
        } else {
            string3 = null;
        }
        if (string3 == null) {
            string3 = "";
        }
        return Ft2.a(string2, string3);
    }

    public final String getRevenue(String string2, String string3) {
        String string4;
        boolean bl2;
        String string5 = this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        String string6 = "";
        Intrinsics.checkNotNullExpressionValue(string5, string6);
        Object object = this.getRevenue.component4();
        if (object != null && !(bl2 = b.k((CharSequence)object))) {
            object = ((Object)StringsKt.m0((CharSequence)object)).toString();
            string4 = "-";
            object = kp1_0.c(string4, (String)object);
        }
        if (object == null) {
            object = string6;
        }
        object = ((Object)StringsKt.m0((CharSequence)object)).toString();
        string4 = Uri.parse((String)this.AFAdRevenueData.getMonetizationNetwork("https://%sdlsdk.%s/v1.0/android/")).buildUpon();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string5);
        stringBuilder.append((String)object);
        string5 = stringBuilder.toString();
        string5 = string4.appendPath(string5);
        Intrinsics.checkNotNullExpressionValue(string5, string6);
        if (string2 != null && string3 != null) {
            string2 = AFb1jSDK.getMonetizationNetwork(string3.concat(string2), string2);
            string3 = "af_sig";
            string5.appendQueryParameter(string3, string2);
        } else {
            string2 = string2 == null ? "devKey" : "timestamp";
            string3 = string2.concat(" is null at attempt to generate ddl event url");
            string4 = " is null";
            string2 = string2.concat(string4);
            object = new IllegalStateException(string2);
            AFLogger.afErrorLog(string3, (Throwable)object);
        }
        string3 = AFb1rSDK.AFAdRevenueData;
        string2 = string5.appendQueryParameter("sdk_version", string3).build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, string6);
        return string2;
    }
}

