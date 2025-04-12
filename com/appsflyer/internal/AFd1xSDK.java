/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFd1uSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFd1wSDK$AFa1tSDK;
import com.appsflyer.internal.AFi1mSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1xSDK
implements AFd1wSDK {
    private AFd1uSDK AFAdRevenueData;
    private final AFc1kSDK getCurrencyIso4217Code;
    private final ScheduledExecutorService getMediationNetwork;
    private final AFi1mSDK getMonetizationNetwork;
    private final Executor getRevenue;

    public AFd1xSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1kSDK aFc1kSDK, AFi1mSDK aFi1mSDK) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(executor, string2);
        Intrinsics.checkNotNullParameter(scheduledExecutorService, string2);
        Intrinsics.checkNotNullParameter(aFc1kSDK, string2);
        Intrinsics.checkNotNullParameter(aFi1mSDK, string2);
        this.getRevenue = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.getMonetizationNetwork = aFi1mSDK;
    }

    public final void AFAdRevenueData() {
        Object object = this.AFAdRevenueData;
        if (object != null && (object = ((AFd1uSDK)object).getRevenue) != null) {
            object.getRevenue();
        }
    }

    public final boolean getMediationNetwork() {
        AFd1uSDK aFd1uSDK = this.AFAdRevenueData;
        return aFd1uSDK != null;
    }

    public final void getRevenue(Context context, AFd1wSDK$AFa1tSDK object) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(context, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(context, (String)object2);
        Object object3 = this.AFAdRevenueData;
        if (object3 != null) {
            object3 = context.getApplicationContext();
            Intrinsics.checkNotNull(object3, (String)object2);
            object3 = (Application)object3;
            object2 = this.AFAdRevenueData;
            object3.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object2);
        }
        this.AFAdRevenueData = null;
        Executor executor = this.getRevenue;
        ScheduledExecutorService scheduledExecutorService = this.getMediationNetwork;
        AFc1kSDK aFc1kSDK = this.getCurrencyIso4217Code;
        AFi1mSDK aFi1mSDK = this.getMonetizationNetwork;
        object3 = object2;
        this.AFAdRevenueData = object2 = new AFd1uSDK(executor, scheduledExecutorService, aFc1kSDK, aFi1mSDK, (AFd1wSDK$AFa1tSDK)object);
        boolean bl2 = context instanceof Activity;
        if (bl2) {
            object = context;
            object = (Activity)context;
            ((AFd1uSDK)object2).onActivityResumed((Activity)object);
        }
        if ((context = AFb1qSDK.f_(context)) != null) {
            object = this.AFAdRevenueData;
            context.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
        }
    }
}

