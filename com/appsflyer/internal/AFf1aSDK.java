/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$2;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1dSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFf1bSDK;
import com.appsflyer.internal.AFg1sSDK;
import com.appsflyer.internal.AFg1vSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFg1xSDK;
import com.appsflyer.internal.AFg1ySDK;
import com.appsflyer.internal.AFg1zSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1ySDK;

public final class AFf1aSDK
implements AFe1dSDK {
    private final AFd1qSDK AFAdRevenueData;
    private final AFg1sSDK areAllFieldsValid;
    private AFi1ySDK component1;
    private final AFe1qSDK component2;
    private AFf1bSDK component3;
    private final AFe1aSDK component4;
    public final AFg1vSDK getCurrencyIso4217Code;
    private final AFg1ySDK getMediationNetwork;
    private final Object getMonetizationNetwork;
    private final AFg1wSDK getRevenue;

    public AFf1aSDK(AFg1ySDK aFg1ySDK, AFd1qSDK aFd1qSDK, AFg1wSDK aFg1wSDK, AFg1vSDK aFg1vSDK, AFe1qSDK aFe1qSDK, AFg1sSDK aFg1sSDK, AFe1aSDK aFe1aSDK) {
        Object object;
        this.getMonetizationNetwork = object = new Object();
        this.getMediationNetwork = aFg1ySDK;
        this.AFAdRevenueData = aFd1qSDK;
        this.getRevenue = aFg1wSDK;
        this.getCurrencyIso4217Code = aFg1vSDK;
        this.component2 = aFe1qSDK;
        this.areAllFieldsValid = aFg1sSDK;
        this.component4 = aFe1aSDK;
        aFe1aSDK.getRevenue.add(this);
    }

    private void getMonetizationNetwork(AFf1bSDK aFf1bSDK, AFg1xSDK aFg1xSDK) {
        Object object = this.getMonetizationNetwork;
        synchronized (object) {
            this.component3 = aFf1bSDK;
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl5 : MonitorExitStatement: MONITOREXIT : var3_4
            if (aFg1xSDK != null) {
                aFg1xSDK.onRemoteConfigUpdateFinished(aFf1bSDK);
            }
            return;
        }
    }

    public final AFi1ySDK AFAdRevenueData() {
        Object object = this.getMonetizationNetwork;
        synchronized (object) {
            AFi1ySDK aFi1ySDK = this.component1;
            this.component1 = null;
            return aFi1ySDK;
        }
    }

    public final void AFAdRevenueData(AFg1xSDK object) {
        AFg1zSDK aFg1zSDK;
        Object object2 = this.getMediationNetwork;
        AFd1qSDK aFd1qSDK = this.AFAdRevenueData;
        AFg1wSDK aFg1wSDK = this.getRevenue;
        AFg1vSDK aFg1vSDK = this.getCurrencyIso4217Code;
        AFe1qSDK aFe1qSDK = this.component2;
        AFg1sSDK aFg1sSDK = this.areAllFieldsValid;
        Object object3 = aFg1zSDK;
        aFg1zSDK = new AFg1zSDK((AFg1ySDK)object2, aFd1qSDK, aFg1wSDK, aFg1vSDK, aFe1qSDK, aFg1sSDK, "v1", (AFg1xSDK)object);
        object = this.component4;
        object3 = ((AFe1aSDK)object).AFAdRevenueData;
        object2 = new AFe1aSDK$2((AFe1aSDK)object, aFg1zSDK);
        object3.execute((Runnable)object2);
    }

    public final void getCurrencyIso4217Code(AFe1eSDK aFe1eSDK) {
    }

    public final void getMediationNetwork(AFe1eSDK object) {
        boolean bl2 = object instanceof AFg1zSDK;
        if (bl2) {
            object = (AFg1zSDK)object;
            Object object2 = this.getMonetizationNetwork;
            synchronized (object2) {
                this.component1 = null;
                // MONITOREXIT @DISABLED, blocks:[0, 1, 3] lbl8 : MonitorExitStatement: MONITOREXIT : var3_4 /* !! */ 
                object2 = AFf1bSDK.getMediationNetwork;
                object = ((AFg1zSDK)object).component2;
                this.getMonetizationNetwork((AFf1bSDK)((Object)object2), (AFg1xSDK)object);
            }
        }
    }

    public final void getMonetizationNetwork(AFe1eSDK object, AFe1cSDK object2) {
        boolean bl2 = object instanceof AFg1zSDK;
        if (bl2) {
            Object object3;
            Object object4;
            object = (AFg1zSDK)object;
            object2 = ((AFg1zSDK)object).component3;
            if (object2 == null) {
                object2 = AFLogger.INSTANCE;
                object4 = AFh1vSDK.component1;
                object3 = "update RC returned null result, something went wrong!";
                ((AFh1uSDK)object2).w((AFh1vSDK)((Object)object4), (String)object3);
                object2 = AFf1bSDK.getMediationNetwork;
            }
            if (object2 != (object4 = AFf1bSDK.getRevenue)) {
                object4 = ((AFg1zSDK)object).component1;
                object3 = this.getMonetizationNetwork;
                synchronized (object3) {
                    this.component1 = object4;
                }
            }
            object = ((AFg1zSDK)object).component2;
            this.getMonetizationNetwork((AFf1bSDK)((Object)object2), (AFg1xSDK)object);
        }
    }
}

