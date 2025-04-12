/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFi1bSDK;
import com.appsflyer.internal.AFj1pSDK$5;
import com.appsflyer.internal.AFj1sSDK$1;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import java.util.Observer;
import java.util.concurrent.ExecutorService;

public final class AFj1pSDK
extends AFi1bSDK {
    private final AFd1kSDK getCurrencyIso4217Code;

    public AFj1pSDK(Runnable runnable2, AFd1kSDK aFd1kSDK) {
        super("store", "samsung", runnable2);
        this.getCurrencyIso4217Code = aFd1kSDK;
    }

    public final void getMediationNetwork(Context object) {
        AFj1pSDK$5 aFj1pSDK$5;
        ExecutorService executorService = this.getCurrencyIso4217Code.getMonetizationNetwork();
        String[] stringArray = new String[]{"FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901"};
        String string2 = "com.sec.android.app.samsungapps.referrer";
        Object object2 = aFj1pSDK$5;
        aFj1pSDK$5 = new AFj1pSDK$5(this, (Context)object, executorService, string2, stringArray);
        object = this.getCurrencyIso4217Code.getRevenue();
        AFb1rSDK.getRevenue();
        object2 = null;
        int n3 = AFb1rSDK.getMediationNetwork((AFd1rSDK)object, false);
        if (n3 <= 0 && (n3 = (int)(aFj1pSDK$5.getCurrencyIso4217Code() ? 1 : 0)) != 0) {
            long l2;
            object = aFj1pSDK$5.getCurrencyIso4217Code;
            object2 = aFj1pSDK$5.getMediationNetwork;
            object.execute((Runnable)object2);
            this.component1 = l2 = System.currentTimeMillis();
            object = AFj1sSDK$AFa1zSDK.AFAdRevenueData;
            this.component2 = object;
            object = new AFj1sSDK$1(this);
            this.addObserver((Observer)object);
        }
    }
}

