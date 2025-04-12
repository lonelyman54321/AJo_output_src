/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFh1rSDK;
import com.appsflyer.internal.AFh1tSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFh1xSDK;
import com.appsflyer.internal.AFh1ySDK;
import kotlin.jvm.internal.Intrinsics;

public final class AFh1wSDK
implements AFh1xSDK {
    private AFh1tSDK AFAdRevenueData;
    private AFh1ySDK getMediationNetwork;
    private AFh1rSDK getMonetizationNetwork;
    private final AFd1kSDK getRevenue;

    public AFh1wSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getRevenue = aFd1kSDK;
    }

    public final void AFAdRevenueData() {
        AFh1ySDK aFh1ySDK = this.getMediationNetwork;
        if (aFh1ySDK != null) {
            AFh1uSDK[] aFh1uSDKArray = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.valueOf;
            int n3 = 4;
            String string2 = "Releasing Proxy Manager Client";
            AFh1uSDK[] aFh1uSDKArray2 = aFh1uSDKArray;
            AFh1uSDK.v$default((AFh1uSDK)aFh1uSDKArray, aFh1vSDK, string2, false, n3, null);
            int n4 = 1;
            aFh1uSDKArray2 = new AFh1uSDK[n4];
            aFh1vSDK = null;
            aFh1uSDKArray2[0] = aFh1ySDK;
            aFh1uSDKArray.unregisterClient(aFh1uSDKArray2);
            aFh1ySDK = null;
            this.getMediationNetwork = null;
        }
    }

    public final void component1() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1ySDK aFh1ySDK = this.getMediationNetwork;
        if (aFh1ySDK == null) {
            this.getMediationNetwork = aFh1ySDK = new AFh1ySDK();
        }
        aFh1ySDK = this.getMediationNetwork;
        Intrinsics.checkNotNull(aFh1ySDK);
        AFh1uSDK[] aFh1uSDKArray = new AFh1uSDK[]{aFh1ySDK};
        aFLogger.registerClient(aFh1uSDKArray);
    }

    public final void getCurrencyIso4217Code() {
        AFh1rSDK aFh1rSDK = this.getMonetizationNetwork;
        if (aFh1rSDK != null) {
            AFh1uSDK[] aFh1uSDKArray = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.valueOf;
            int n3 = 4;
            String string2 = "Releasing Proxy Manager Client";
            AFh1uSDK[] aFh1uSDKArray2 = aFh1uSDKArray;
            AFh1uSDK.v$default((AFh1uSDK)aFh1uSDKArray, aFh1vSDK, string2, false, n3, null);
            int n4 = 1;
            aFh1uSDKArray2 = new AFh1uSDK[n4];
            aFh1vSDK = null;
            aFh1uSDKArray2[0] = aFh1rSDK;
            aFh1uSDKArray.unregisterClient(aFh1uSDKArray2);
            aFh1rSDK = null;
            this.getMonetizationNetwork = null;
        }
    }

    public final void getMediationNetwork() {
        AFh1uSDK[] aFh1uSDKArray;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1rSDK aFh1rSDK = this.getMonetizationNetwork;
        if (aFh1rSDK == null) {
            aFh1uSDKArray = this.getRevenue;
            this.getMonetizationNetwork = aFh1rSDK = new AFh1rSDK((AFd1kSDK)aFh1uSDKArray);
        }
        aFh1rSDK = this.getMonetizationNetwork;
        Intrinsics.checkNotNull(aFh1rSDK);
        aFh1uSDKArray = new AFh1uSDK[]{aFh1rSDK};
        aFLogger.registerClient(aFh1uSDKArray);
    }

    public final void getMonetizationNetwork() {
        AFh1uSDK[] aFh1uSDKArray;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1tSDK aFh1tSDK = this.AFAdRevenueData;
        if (aFh1tSDK == null) {
            aFh1uSDKArray = this.getRevenue;
            this.AFAdRevenueData = aFh1tSDK = new AFh1tSDK((AFd1kSDK)aFh1uSDKArray);
        }
        aFh1tSDK = this.AFAdRevenueData;
        Intrinsics.checkNotNull(aFh1tSDK);
        aFh1uSDKArray = new AFh1uSDK[]{aFh1tSDK};
        aFLogger.registerClient(aFh1uSDKArray);
    }

    public final void getRevenue() {
        AFh1tSDK aFh1tSDK = this.AFAdRevenueData;
        if (aFh1tSDK != null) {
            AFh1uSDK[] aFh1uSDKArray = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.values;
            int n3 = 4;
            String string2 = "Releasing Exception Manager Client";
            AFh1uSDK[] aFh1uSDKArray2 = aFh1uSDKArray;
            AFh1uSDK.v$default((AFh1uSDK)aFh1uSDKArray, aFh1vSDK, string2, false, n3, null);
            int n4 = 1;
            aFh1uSDKArray2 = new AFh1uSDK[n4];
            aFh1vSDK = null;
            aFh1uSDKArray2[0] = aFh1tSDK;
            aFh1uSDKArray.unregisterClient(aFh1uSDKArray2);
            aFh1tSDK = null;
            this.AFAdRevenueData = null;
        }
    }
}

