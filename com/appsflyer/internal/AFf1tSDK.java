/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler$PurchaseValidationCallback;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFf1vSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public abstract class AFf1tSDK
extends AFf1vSDK {
    private final PurchaseHandler$PurchaseValidationCallback component3;

    public AFf1tSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArray, AFd1kSDK aFd1kSDK, Map map2, PurchaseHandler$PurchaseValidationCallback purchaseHandler$PurchaseValidationCallback) {
        String string2 = "";
        Intrinsics.checkNotNullParameter((Object)aFf1zSDK, string2);
        Intrinsics.checkNotNullParameter(aFf1zSDKArray, string2);
        Intrinsics.checkNotNullParameter(aFd1kSDK, string2);
        Intrinsics.checkNotNullParameter(map2, string2);
        super(aFf1zSDK, aFf1zSDKArray, aFd1kSDK, null, map2);
        this.component3 = purchaseHandler$PurchaseValidationCallback;
    }

    public final String AFAdRevenueData(Map map2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(map2, "");
        String string2 = "billing_library_version";
        boolean bl3 = map2.containsKey(string2);
        if (bl3 && (bl2 = (map2 = map2.remove(string2)) instanceof String)) {
            return (String)((Object)map2);
        }
        return null;
    }

    public final boolean component4() {
        return true;
    }

    public final String getMediationNetwork(Map map2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(map2, "");
        String string2 = "connector_version";
        boolean bl3 = map2.containsKey(string2);
        if (bl3 && (bl2 = (map2 = map2.remove(string2)) instanceof String)) {
            return (String)((Object)map2);
        }
        return null;
    }

    public boolean getMediationNetwork() {
        AFe1kSDK aFe1kSDK = this.component4;
        if (aFe1kSDK != null) {
            Intrinsics.checkNotNull(aFe1kSDK);
            int n3 = aFe1kSDK.getStatusCode();
            int n4 = 503;
            if (n3 == n4) {
                return true;
            }
        }
        return super.getMediationNetwork();
    }

    public final void getRevenue() {
        PurchaseHandler$PurchaseValidationCallback purchaseHandler$PurchaseValidationCallback;
        super.getRevenue();
        Object object = this.component1();
        if (object != null && (purchaseHandler$PurchaseValidationCallback = this.component3) != null) {
            purchaseHandler$PurchaseValidationCallback.onFailure((Throwable)object);
        }
        if ((object = this.component4) != null && (purchaseHandler$PurchaseValidationCallback = this.component3) != null) {
            purchaseHandler$PurchaseValidationCallback.onResponse((ResponseNetwork)object);
        }
    }
}

