/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$2;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1dSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFf1cSDK;
import com.appsflyer.internal.AFf1eSDK;
import com.appsflyer.internal.AFf1fSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFg1bSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFg1jSDK;
import com.appsflyer.internal.AFg1mSDK;
import com.appsflyer.internal.AFh1oSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.util.concurrent.Executor;

final class AFb1rSDK$AFa1vSDK
implements AFe1dSDK {
    private /* synthetic */ AFb1rSDK getMonetizationNetwork;

    public AFb1rSDK$AFa1vSDK(AFb1rSDK aFb1rSDK) {
        this.getMonetizationNetwork = aFb1rSDK;
    }

    private boolean AFAdRevenueData() {
        AppsFlyerConversionListener appsFlyerConversionListener = this.getMonetizationNetwork.getMonetizationNetwork;
        return appsFlyerConversionListener != null;
    }

    public final void getCurrencyIso4217Code(AFe1eSDK object) {
        boolean bl2 = object instanceof AFf1fSDK;
        if (bl2) {
            object = (AFf1eSDK)object;
            AFh1oSDK aFh1oSDK = this.getMonetizationNetwork.getMonetizationNetwork().component3();
            object = ((AFf1eSDK)object).component3;
            int n3 = ((AFa1oSDK)object).component1;
            aFh1oSDK.getRevenue(n3);
        }
    }

    public final void getMediationNetwork(AFe1eSDK aFe1eSDK) {
    }

    public final void getMonetizationNetwork(AFe1eSDK object, AFe1cSDK object2) {
        boolean bl2 = object instanceof AFf1eSDK;
        if (bl2) {
            Object object3;
            Object object4;
            Object object5;
            boolean bl3;
            Object object6 = object;
            object6 = (AFf1eSDK)object;
            boolean bl4 = object instanceof AFf1fSDK;
            if (bl4 && (bl3 = this.AFAdRevenueData())) {
                int n3;
                int n4;
                object5 = object;
                object5 = (AFf1fSDK)object;
                object4 = ((AFe1eSDK)object5).getMediationNetwork;
                object3 = AFe1cSDK.getRevenue;
                if (object4 == object3 || (n4 = ((AFe1eSDK)object5).AFAdRevenueData) == (n3 = 1)) {
                    object3 = this.getMonetizationNetwork.getMonetizationNetwork().getRevenue();
                    object4 = new AFg1cSDK((AFf1fSDK)object5, (AFd1rSDK)object3);
                    object5 = this.getMonetizationNetwork.getMonetizationNetwork().copy();
                    object3 = ((AFe1aSDK)object5).AFAdRevenueData;
                    AFe1aSDK$2 aFe1aSDK$2 = new AFe1aSDK$2((AFe1aSDK)object5, (AFe1eSDK)object4);
                    object3.execute(aFe1aSDK$2);
                }
            }
            if (object2 == (object5 = AFe1cSDK.getRevenue)) {
                object2 = this.getMonetizationNetwork;
                object5 = ((AFb1rSDK)object2).component4;
                object2 = ((AFb1rSDK)object2).getMonetizationNetwork((Context)object5);
                object5 = "sentSuccessfully";
                object4 = "true";
                object2.AFAdRevenueData((String)object5, (String)object4);
                boolean bl5 = object instanceof AFf1cSDK;
                if (!bl5) {
                    boolean bl6;
                    object2 = this.getMonetizationNetwork.component4;
                    object = new AFg1jSDK((Context)object2);
                    if ((object = ((AFg1jSDK)object).getMediationNetwork()) != null && (bl6 = ((AFg1mSDK)object).getCurrencyIso4217Code())) {
                        object = ((AFg1mSDK)object).getRevenue;
                        object2 = AFLogger.INSTANCE;
                        object5 = AFh1vSDK.i;
                        object4 = String.valueOf(object);
                        object3 = "Resending Uninstall token to AF servers: ";
                        object4 = ((String)object3).concat((String)object4);
                        ((AFh1uSDK)object2).d((AFh1vSDK)((Object)object5), (String)object4);
                        AFg1jSDK.getMediationNetwork((String)object);
                    }
                }
                if ((object = ((AFf1oSDK)object6).component4) != null && (object = AFc1uSDK.AFAdRevenueData((String)((AFe1kSDK)object).getBody())) != null) {
                    object2 = this.getMonetizationNetwork;
                    object6 = "send_background";
                    bl3 = false;
                    object5 = null;
                    ((AFb1rSDK)object2).component2 = bl5 = object.optBoolean((String)object6, false);
                }
                if (bl4) {
                    long l2;
                    object = this.getMonetizationNetwork;
                    ((AFb1rSDK)object).areAllFieldsValid = l2 = System.currentTimeMillis();
                }
            }
            return;
        }
        boolean bl7 = object instanceof AFg1cSDK;
        if (bl7 && object2 != (object = AFe1cSDK.getRevenue)) {
            object2 = this.getMonetizationNetwork.getMonetizationNetwork();
            object = new AFg1bSDK((AFd1kSDK)object2);
            object2 = this.getMonetizationNetwork.getMonetizationNetwork().copy();
            Executor executor = ((AFe1aSDK)object2).AFAdRevenueData;
            AFe1aSDK$2 aFe1aSDK$2 = new AFe1aSDK$2((AFe1aSDK)object2, (AFe1eSDK)object);
            executor.execute(aFe1aSDK$2);
        }
    }
}

