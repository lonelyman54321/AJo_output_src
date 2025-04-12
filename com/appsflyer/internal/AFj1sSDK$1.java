/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFj1sSDK;
import java.util.Observable;
import java.util.Observer;

final class AFj1sSDK$1
implements Observer {
    private /* synthetic */ AFj1sSDK getCurrencyIso4217Code;

    public AFj1sSDK$1(AFj1sSDK aFj1sSDK) {
        this.getCurrencyIso4217Code = aFj1sSDK;
    }

    public final void update(Observable observable, Object object) {
        this.getCurrencyIso4217Code.AFAdRevenueData.run();
    }
}

