/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.miui.referrer.api.GetAppsReferrerClient
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1cSDK;
import com.appsflyer.internal.AFj1lSDK$1;
import com.appsflyer.internal.AFj1sSDK$1;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import java.util.Observer;

public final class AFj1lSDK
extends AFi1cSDK {
    public AFj1lSDK(AFd1qSDK aFd1qSDK, Runnable runnable2) {
        super("store", "xiaomi", aFd1qSDK, runnable2);
    }

    private boolean getMediationNetwork() {
        boolean bl2 = this.getMonetizationNetwork();
        AFh1vSDK aFh1vSDK = null;
        if (!bl2) {
            return false;
        }
        Object object = "com.miui.referrer.api.GetAppsReferrerClient";
        try {
            Class.forName((String)object);
            object = AFLogger.INSTANCE;
            aFh1vSDK = AFh1vSDK.hashCode;
            ((AFh1uSDK)object).d(aFh1vSDK, "Xiaomi Install Referrer is allowed");
            return true;
        }
        catch (Throwable throwable) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK2 = AFh1vSDK.hashCode;
            aFLogger.e(aFh1vSDK2, "An error occurred while trying to access GetAppsReferrerClient", throwable);
            return false;
        }
        catch (ClassNotFoundException classNotFoundException) {
            object = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK3 = AFh1vSDK.hashCode;
            ((AFh1uSDK)object).v(aFh1vSDK3, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        }
    }

    public final void getMediationNetwork(Context context) {
        Object object;
        long l2;
        boolean bl2 = this.getMediationNetwork();
        if (!bl2) {
            return;
        }
        this.component1 = l2 = System.currentTimeMillis();
        this.component2 = object = AFj1sSDK$AFa1zSDK.AFAdRevenueData;
        object = new AFj1sSDK$1(this);
        this.addObserver((Observer)object);
        object = GetAppsReferrerClient.Companion.newBuilder(context).build();
        AFj1lSDK$1 aFj1lSDK$1 = new AFj1lSDK$1(this, context, (GetAppsReferrerClient)object);
        object.startConnection(aFj1lSDK$1);
    }
}

