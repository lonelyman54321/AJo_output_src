/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFd1wSDK$AFa1tSDK;
import com.appsflyer.internal.AFf1aSDK;
import com.appsflyer.internal.AFg1xSDK;
import com.appsflyer.internal.AFh1iSDK;
import com.appsflyer.internal.AFh1mSDK;
import com.appsflyer.internal.AFh1oSDK;
import java.util.concurrent.TimeUnit;

final class AFb1rSDK$4
implements AFd1wSDK$AFa1tSDK {
    private /* synthetic */ AFb1rSDK AFAdRevenueData;
    private /* synthetic */ AFh1oSDK getMonetizationNetwork;
    private /* synthetic */ AppsFlyerRequestListener getRevenue;

    public AFb1rSDK$4(AFb1rSDK aFb1rSDK, AFh1oSDK aFh1oSDK, AppsFlyerRequestListener appsFlyerRequestListener) {
        this.AFAdRevenueData = aFb1rSDK;
        this.getMonetizationNetwork = aFh1oSDK;
        this.getRevenue = appsFlyerRequestListener;
    }

    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        this.getMonetizationNetwork.getMonetizationNetwork();
        Object object = this.AFAdRevenueData.getMonetizationNetwork();
        Object object2 = object.component2();
        Object object3 = this.AFAdRevenueData.getMediationNetwork();
        ((AFf1aSDK)object2).AFAdRevenueData((AFg1xSDK)object3);
        this.AFAdRevenueData.component4();
        object2 = object.getMediationNetwork().getRevenue;
        AFc1oSDK aFc1oSDK = null;
        int n3 = object2.getMediationNetwork("appsFlyerCount", 0);
        object3 = "onBecameForeground";
        AFLogger.afInfoLog((String)object3);
        int n4 = 2;
        if (n3 < n4) {
            object2 = this.AFAdRevenueData.getMonetizationNetwork().component4();
            object2.getMediationNetwork();
        }
        object2 = new AFh1iSDK();
        if (aFh1mSDK != null) {
            object3 = this.AFAdRevenueData.getMonetizationNetwork().d();
            aFc1oSDK = AFc1oSDK.getMediationNetwork((AFa1oSDK)object2);
            Intent intent = aFh1mSDK.getCurrencyIso4217Code;
            object = object.values().AFAdRevenueData;
            ((AFc1kSDK)object3).n_(aFc1oSDK, intent, (Context)object);
        }
        object = this.AFAdRevenueData;
        ((AFa1oSDK)object2).getMediationNetwork = object3 = this.getRevenue;
        ((AFb1rSDK)object).getRevenue((AFa1oSDK)object2, aFh1mSDK);
    }

    public final void getRevenue() {
        Object object = this.AFAdRevenueData.getMonetizationNetwork().values().AFAdRevenueData;
        AFLogger.afInfoLog("onBecameBackground");
        Object object2 = this.getMonetizationNetwork;
        long l2 = System.currentTimeMillis();
        long l3 = ((AFh1oSDK)object2).areAllFieldsValid;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 != false) {
            long l8;
            long l12;
            long l14 = (l2 -= l3) - l4;
            Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object3 > 0 && (l12 = (l8 = l2 - (l3 = 1000L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) < 0) {
                l2 = l3;
            }
            ((AFh1oSDK)object2).equals = l2 = TimeUnit.MILLISECONDS.toSeconds(l2);
            object2 = ((AFh1oSDK)object2).AFAdRevenueData;
            String string2 = "prev_session_dur";
            object2.getMonetizationNetwork(string2, l2);
        } else {
            object2 = "Metrics: fg ts is missing";
            AFLogger.afInfoLog((String)object2);
        }
        AFLogger.afInfoLog("callStatsBackground background call");
        this.AFAdRevenueData.getMonetizationNetwork().afErrorLog().getMonetizationNetwork();
        object2 = this.AFAdRevenueData.getMonetizationNetwork().copydefault();
        boolean bl2 = object2.areAllFieldsValid();
        if (bl2) {
            Object object4;
            object2.AFAdRevenueData();
            if (object != null && !(bl2 = ((AppsFlyerLib)(object4 = AppsFlyerLib.getInstance())).isStopped())) {
                object4 = object.getPackageName();
                object = object.getPackageManager();
                object2.k_((String)object4, (PackageManager)object);
            }
            object2.getMonetizationNetwork();
        } else {
            object = "RD status is OFF";
            AFLogger.afDebugLog((String)object);
        }
        this.AFAdRevenueData.getMonetizationNetwork().component4().getRevenue();
        this.AFAdRevenueData.getMonetizationNetwork().afInfoLog().getCurrencyIso4217Code();
    }
}

