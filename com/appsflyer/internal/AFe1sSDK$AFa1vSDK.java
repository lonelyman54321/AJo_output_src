/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFe1qSDK;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFe1sSDK$AFa1vSDK {
    private AFe1sSDK$AFa1vSDK() {
    }

    public /* synthetic */ AFe1sSDK$AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static String AFAdRevenueData(String string2, String string3, String string4) {
        String string5 = AFe1qSDK.AFAdRevenueData;
        String string6 = AppsFlyerLib.getInstance().getHostPrefix();
        String string7 = AFb1rSDK.getRevenue().getHostName();
        Object[] objectArray = new Object[]{string6, string7};
        return KW.a(String.format(string5, objectArray), string2, string4, "?device_id=", string3);
    }

    public static String AFAdRevenueData(String objectArray, String string2, String string3, String string4, String string5) {
        CharSequence charSequence = "";
        Intrinsics.checkNotNullParameter(objectArray, (String)charSequence);
        Intrinsics.checkNotNullParameter(string2, (String)charSequence);
        Intrinsics.checkNotNullParameter(string4, (String)charSequence);
        Intrinsics.checkNotNullParameter(string5, (String)charSequence);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)objectArray);
        ((StringBuilder)charSequence).append(string2);
        objectArray = ((StringBuilder)charSequence).toString();
        objectArray = new String[]{string5, string3, objectArray};
        return AFb1jSDK.getMonetizationNetwork(TextUtils.join((CharSequence)"\u2063", (Object[])objectArray), string4);
    }
}

