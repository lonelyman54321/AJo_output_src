/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFj1bSDK;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1eSDK
implements AFj1bSDK {
    public final String getMonetizationNetwork(String string2) {
        String string3 = "";
        Intrinsics.checkNotNullParameter(string2, string3);
        String string4 = AppsFlyerLib.getInstance().getHostPrefix();
        String string5 = AFb1rSDK.getRevenue().getHostName();
        Object[] objectArray = new Object[]{string4, string5};
        string2 = String.format(string2, objectArray);
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        return string2;
    }
}

