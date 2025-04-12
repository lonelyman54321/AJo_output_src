/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1aSDK;
import com.appsflyer.internal.AFd1bSDK;
import com.appsflyer.internal.AFd1gSDK;
import com.appsflyer.internal.AFd1hSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1cSDK
implements AFd1bSDK {
    private final AFd1hSDK getMediationNetwork;

    public AFd1cSDK(AFd1hSDK aFd1hSDK) {
        Intrinsics.checkNotNullParameter(aFd1hSDK, "");
        this.getMediationNetwork = aFd1hSDK;
    }

    public final void getMediationNetwork(byte[] object, Map map2, int n3) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = 2000;
        object2 = new AFd1aSDK((byte[])object, map2, n4);
        boolean bl2 = ((AFd1gSDK)object2).AFAdRevenueData();
        if (bl2) {
            object = this.getMediationNetwork;
            object.AFAdRevenueData();
        }
    }
}

