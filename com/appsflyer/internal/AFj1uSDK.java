/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFh1lSDK;
import com.appsflyer.internal.AFi1eSDK;
import com.appsflyer.internal.AFj1cSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import com.appsflyer.internal.AFj1vSDK;
import com.appsflyer.internal.AFj1xSDK;
import com.appsflyer.internal.B;
import com.appsflyer.internal.C;
import com.appsflyer.internal.D;
import com.appsflyer.internal.E;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class AFj1uSDK {
    public final AFd1kSDK AFAdRevenueData;
    public final List getMonetizationNetwork;

    public AFj1uSDK(AFd1kSDK aFd1kSDK) {
        ArrayList arrayList;
        this.getMonetizationNetwork = arrayList = new ArrayList();
        this.AFAdRevenueData = aFd1kSDK;
    }

    public static /* synthetic */ void a() {
        AFj1uSDK.getRevenue();
    }

    public static /* synthetic */ void b(AFj1uSDK aFj1uSDK, Runnable runnable2) {
        aFj1uSDK.component4(runnable2);
    }

    public static /* synthetic */ void c(AFj1uSDK aFj1uSDK, Runnable runnable2) {
        aFj1uSDK.getMediationNetwork(runnable2);
    }

    private /* synthetic */ void component4(Runnable runnable2) {
        AFd1qSDK aFd1qSDK = this.AFAdRevenueData.getMediationNetwork();
        ExecutorService executorService = this.AFAdRevenueData.getMonetizationNetwork();
        AFj1xSDK aFj1xSDK = AFj1xSDK.getCurrencyIso4217Code;
        g92_0 g92_02 = new g92_0(1, this, runnable2);
        AFj1vSDK aFj1vSDK = new AFj1vSDK(aFd1qSDK, executorService, aFj1xSDK, runnable2, g92_02);
        this.getMonetizationNetwork(aFj1vSDK);
        runnable2 = this.AFAdRevenueData.values().AFAdRevenueData;
        aFj1vSDK.getMediationNetwork((Context)runnable2);
    }

    public static /* synthetic */ void d(AFj1uSDK aFj1uSDK, Runnable runnable2) {
        aFj1uSDK.getRevenue(runnable2);
    }

    public static /* synthetic */ void e(AFj1uSDK aFj1uSDK, AFi1eSDK aFi1eSDK, Runnable runnable2) {
        aFj1uSDK.getMediationNetwork(aFi1eSDK, runnable2);
    }

    public static /* synthetic */ void f(AFj1uSDK aFj1uSDK, Runnable runnable2) {
        aFj1uSDK.getMonetizationNetwork(runnable2);
    }

    private /* synthetic */ void getMediationNetwork(AFi1eSDK object, Runnable runnable2) {
        AFd1rSDK aFd1rSDK = this.AFAdRevenueData.getRevenue();
        AFd1rSDK aFd1rSDK2 = this.AFAdRevenueData.getMediationNetwork().getRevenue;
        boolean bl2 = false;
        int n3 = aFd1rSDK2.getMediationNetwork("appsFlyerCount", 0);
        boolean bl3 = aFd1rSDK.getMediationNetwork("newGPReferrerSent");
        object = object.component2;
        AFj1sSDK$AFa1zSDK aFj1sSDK$AFa1zSDK = AFj1sSDK$AFa1zSDK.getMediationNetwork;
        int n4 = 1;
        if (object == aFj1sSDK$AFa1zSDK) {
            bl2 = true;
        }
        if (n3 == n4 && (bl2 || bl3)) {
            runnable2.run();
        }
    }

    private /* synthetic */ void getMediationNetwork(Runnable runnable2) {
        AFd1qSDK aFd1qSDK = this.AFAdRevenueData.getMediationNetwork();
        ExecutorService executorService = this.AFAdRevenueData.getMonetizationNetwork();
        AFj1xSDK aFj1xSDK = AFj1xSDK.getMediationNetwork;
        B b2 = new Object();
        AFj1vSDK aFj1vSDK = new AFj1vSDK(aFd1qSDK, executorService, aFj1xSDK, runnable2, b2);
        this.getMonetizationNetwork(aFj1vSDK);
        runnable2 = this.AFAdRevenueData.values().AFAdRevenueData;
        aFj1vSDK.getMediationNetwork((Context)runnable2);
    }

    private /* synthetic */ void getMonetizationNetwork(Runnable object) {
        ScheduledExecutorService scheduledExecutorService = this.AFAdRevenueData.AFAdRevenueData();
        C c2 = new C(this, (Runnable)object);
        object = TimeUnit.MILLISECONDS;
        AFj1cSDK.getMonetizationNetwork(scheduledExecutorService, c2, 0L, (TimeUnit)((Object)object));
    }

    private static /* synthetic */ void getRevenue() {
    }

    private /* synthetic */ void getRevenue(Runnable runnable2) {
        Throwable throwable2;
        block6: {
            block5: {
                AFh1lSDK aFh1lSDK;
                try {
                    aFh1lSDK = new AFh1lSDK();
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                boolean bl2 = this.getMediationNetwork(aFh1lSDK);
                if (!bl2) break block5;
                runnable2.run();
            }
            return;
        }
        AFLogger.afErrorLog(throwable2.getMessage(), throwable2);
    }

    public final AFi1eSDK AFAdRevenueData(Runnable object) {
        E e2 = new E(this, (Runnable)object);
        object = this.AFAdRevenueData.getMonetizationNetwork();
        AFd1qSDK aFd1qSDK = this.AFAdRevenueData.getMediationNetwork();
        AFi1eSDK aFi1eSDK = new AFi1eSDK(e2, (ExecutorService)object, aFd1qSDK);
        return aFi1eSDK;
    }

    public final boolean AFAdRevenueData() {
        return this.AFAdRevenueData.getMediationNetwork().AFAdRevenueData("AF_PREINSTALL_DISABLED", false);
    }

    public final void getCurrencyIso4217Code(Runnable runnable2) {
        AFd1qSDK aFd1qSDK = this.AFAdRevenueData.getMediationNetwork();
        ExecutorService executorService = this.AFAdRevenueData.getMonetizationNetwork();
        AFj1xSDK aFj1xSDK = AFj1xSDK.getRevenue;
        w82_0 w82_02 = new w82_0(1, this, runnable2);
        AFj1vSDK aFj1vSDK = new AFj1vSDK(aFd1qSDK, executorService, aFj1xSDK, runnable2, w82_02);
        this.getMonetizationNetwork(aFj1vSDK);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFj1sSDK[] getCurrencyIso4217Code() {
        synchronized (this) {
            AFj1sSDK[] aFj1sSDKArray = this.getMonetizationNetwork;
            AFj1sSDK[] aFj1sSDKArray2 = null;
            aFj1sSDKArray2 = new AFj1sSDK[]{};
            return aFj1sSDKArray.toArray(aFj1sSDKArray2);
        }
    }

    public final boolean getMediationNetwork(AFa1oSDK aFa1oSDK) {
        boolean bl2;
        int n3;
        AFd1rSDK aFd1rSDK = this.AFAdRevenueData.getMediationNetwork().getRevenue;
        String string2 = "appsFlyerCount";
        int n4 = aFd1rSDK.getMediationNetwork(string2, 0);
        if (n4 == (n3 = 1) && !(bl2 = aFa1oSDK instanceof AFh1lSDK)) {
            bl2 = true;
        } else {
            bl2 = false;
            aFa1oSDK = null;
        }
        AFd1rSDK aFd1rSDK2 = this.AFAdRevenueData.getRevenue();
        String string3 = "newGPReferrerSent";
        boolean bl3 = aFd1rSDK2.getMediationNetwork(string3);
        if (!bl3 && n4 == n3 || bl2) {
            return n3 != 0;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getMonetizationNetwork(AFj1sSDK aFj1sSDK) {
        synchronized (this) {
            List list = this.getMonetizationNetwork;
            list.add(aFj1sSDK);
            return;
        }
    }

    public final Runnable getRevenue(AFi1eSDK aFi1eSDK, Runnable runnable2) {
        D d2 = new D(this, aFi1eSDK, runnable2);
        return d2;
    }
}

