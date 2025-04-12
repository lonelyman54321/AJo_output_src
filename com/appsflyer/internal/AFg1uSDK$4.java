/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.appsflyer.lvl.AppsFlyerLVL$resultListener
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFg1uSDK;
import com.appsflyer.internal.AFg1uSDK$AFa1vSDK;
import com.appsflyer.lvl.AppsFlyerLVL;

final class AFg1uSDK$4
implements AppsFlyerLVL.resultListener {
    private /* synthetic */ AFg1uSDK getCurrencyIso4217Code;
    private /* synthetic */ AFg1uSDK$AFa1vSDK getMediationNetwork;

    public AFg1uSDK$4(AFg1uSDK aFg1uSDK, AFg1uSDK$AFa1vSDK aFa1vSDK) {
        this.getCurrencyIso4217Code = aFg1uSDK;
        this.getMediationNetwork = aFa1vSDK;
    }

    public final void onLvlFailure(Exception exception) {
        this.getMediationNetwork.getCurrencyIso4217Code("onLvlFailure with exception", exception);
    }

    public final void onLvlResult(String string2, String object) {
        if (string2 != null && object != null) {
            this.getMediationNetwork.AFAdRevenueData(string2, (String)object);
            return;
        }
        string2 = "onLvlResult with error";
        if (object == null) {
            object = this.getMediationNetwork;
            Exception exception = new Exception("AFLVL Invalid signature");
            object.getCurrencyIso4217Code(string2, exception);
            return;
        }
        object = this.getMediationNetwork;
        Exception exception = new Exception("AFLVL Invalid signedData");
        object.getCurrencyIso4217Code(string2, exception);
    }
}

