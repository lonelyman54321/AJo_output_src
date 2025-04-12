/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFc1hSDK;
import com.appsflyer.internal.AFc1oSDK$AFa1uSDK;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1oSDK {
    public static final AFc1oSDK$AFa1uSDK AFa1uSDK;
    final Map getCurrencyIso4217Code;
    final AFc1hSDK getMonetizationNetwork;

    static {
        AFc1oSDK$AFa1uSDK aFc1oSDK$AFa1uSDK;
        AFa1uSDK = aFc1oSDK$AFa1uSDK = new AFc1oSDK$AFa1uSDK(null);
    }

    private AFc1oSDK(Map map2, AFc1hSDK aFc1hSDK) {
        this.getCurrencyIso4217Code = map2;
        this.getMonetizationNetwork = aFc1hSDK;
    }

    public /* synthetic */ AFc1oSDK(Map map2, AFc1hSDK aFc1hSDK, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            aFc1hSDK = null;
        }
        this(map2, aFc1hSDK);
    }

    public /* synthetic */ AFc1oSDK(Map map2, AFc1hSDK aFc1hSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map2, aFc1hSDK);
    }

    public static final AFc1oSDK AFAdRevenueData(AFc1hSDK aFc1hSDK) {
        return AFc1oSDK$AFa1uSDK.getCurrencyIso4217Code(aFc1hSDK);
    }

    public static final AFc1oSDK getMediationNetwork(AFa1oSDK aFa1oSDK) {
        return AFc1oSDK$AFa1uSDK.AFAdRevenueData(aFa1oSDK);
    }

    public final void getMediationNetwork(String object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "");
        Map map2 = this.getCurrencyIso4217Code;
        map2.put(object, object2);
        object = this.getMonetizationNetwork;
        if (object != null) {
            object2 = this.getCurrencyIso4217Code;
            object.AFAdRevenueData((Map)object2);
        }
    }

    public final boolean getMonetizationNetwork(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        return this.getCurrencyIso4217Code.containsKey(string2);
    }
}

