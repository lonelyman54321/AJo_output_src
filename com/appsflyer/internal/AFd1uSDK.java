/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFd1wSDK$AFa1tSDK;
import com.appsflyer.internal.AFd1wSDK$AFa1ySDK;
import com.appsflyer.internal.AFh1mSDK;
import com.appsflyer.internal.AFi1mSDK;
import com.appsflyer.internal.k;
import com.appsflyer.internal.l;
import com.appsflyer.internal.m;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

final class AFd1uSDK
implements Application.ActivityLifecycleCallbacks {
    private final AFi1mSDK AFAdRevenueData;
    private boolean component2;
    private boolean component3;
    private final Executor getCurrencyIso4217Code;
    private final ScheduledExecutorService getMediationNetwork;
    private final AFc1kSDK getMonetizationNetwork;
    final AFd1wSDK$AFa1tSDK getRevenue;

    public AFd1uSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFc1kSDK aFc1kSDK, AFi1mSDK aFi1mSDK, AFd1wSDK$AFa1tSDK aFd1wSDK$AFa1tSDK) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(executor, string2);
        Intrinsics.checkNotNullParameter(scheduledExecutorService, string2);
        Intrinsics.checkNotNullParameter(aFc1kSDK, string2);
        Intrinsics.checkNotNullParameter(aFi1mSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1wSDK$AFa1tSDK, string2);
        this.getCurrencyIso4217Code = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.getMonetizationNetwork = aFc1kSDK;
        this.AFAdRevenueData = aFi1mSDK;
        this.getRevenue = aFd1wSDK$AFa1tSDK;
    }

    private static final void AFAdRevenueData(AFd1uSDK object) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = ((AFd1uSDK)object).component2;
        if (bl2 && (bl2 = ((AFd1uSDK)object).component3)) {
            bl2 = false;
            string2 = null;
            ((AFd1uSDK)object).component2 = false;
            object = ((AFd1uSDK)object).getRevenue;
            try {
                object.getRevenue();
                return;
            }
            catch (Exception exception) {
                string2 = "Listener threw exception! ";
                AFLogger.afErrorLog(string2, exception);
            }
        }
    }

    public static /* synthetic */ void a(AFd1uSDK aFd1uSDK, AFh1mSDK aFh1mSDK) {
        AFd1uSDK.getRevenue(aFd1uSDK, aFh1mSDK);
    }

    public static /* synthetic */ void b(AFd1uSDK aFd1uSDK) {
        AFd1uSDK.AFAdRevenueData(aFd1uSDK);
    }

    public static /* synthetic */ void c(AFd1uSDK aFd1uSDK) {
        AFd1uSDK.getMonetizationNetwork(aFd1uSDK);
    }

    private static final void getMonetizationNetwork(AFd1uSDK object) {
        boolean bl2;
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        ((AFd1uSDK)object).component3 = bl2 = true;
        try {
            object2 = ((AFd1uSDK)object).getMediationNetwork;
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", throwable);
            return;
        }
        l l2 = new l((AFd1uSDK)object);
        object = AFd1wSDK.AFa1ySDK;
        long l3 = AFd1wSDK$AFa1ySDK.getCurrencyIso4217Code();
        object = TimeUnit.MILLISECONDS;
        object2.schedule(l2, l3, (TimeUnit)((Object)object));
    }

    private static final void getRevenue(AFd1uSDK aFd1uSDK, AFh1mSDK aFh1mSDK) {
        Object object = "";
        Intrinsics.checkNotNullParameter(aFd1uSDK, (String)object);
        Intrinsics.checkNotNullParameter(aFh1mSDK, (String)object);
        boolean bl2 = aFd1uSDK.component2;
        boolean bl3 = true;
        if (!bl2) {
            object = aFd1uSDK.getRevenue;
            try {
                object.getMonetizationNetwork(aFh1mSDK);
            }
            catch (Exception exception) {
                object = "Listener thrown an exception: ";
                AFLogger.afErrorLog((String)object, exception, bl3);
            }
        }
        aFd1uSDK.component3 = false;
        aFd1uSDK.component2 = bl3;
    }

    public final void onActivityCreated(Activity activity, Bundle object) {
        String string2;
        String string3;
        boolean bl2;
        Intrinsics.checkNotNullParameter(activity, "");
        object = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (intent != null && (bl2 = (string3 = "android.intent.action.VIEW").equals(string2 = intent.getAction()))) {
            string3 = intent.getData();
        } else {
            bl2 = false;
            string3 = null;
        }
        if (string3 != null && intent != (string3 = object.getRevenue)) {
            object.getRevenue = intent;
        }
        this.AFAdRevenueData.AFAdRevenueData(activity);
    }

    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public final void onActivityPaused(Activity object) {
        Intrinsics.checkNotNullParameter(object, "");
        object = this.getCurrencyIso4217Code;
        k k2 = new k(this);
        object.execute(k2);
    }

    public final void onActivityResumed(Activity object) {
        Intrinsics.checkNotNullParameter(object, "");
        Object object2 = this.AFAdRevenueData;
        AFh1mSDK aFh1mSDK = new AFh1mSDK((Activity)object, (AFi1mSDK)object2);
        object = this.getCurrencyIso4217Code;
        object2 = new m(this, aFh1mSDK);
        object.execute((Runnable)object2);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(activity, string2);
        Intrinsics.checkNotNullParameter(bundle, string2);
    }

    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}

