/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$2;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFe1iSDK;
import com.appsflyer.internal.AFf1eSDK;
import com.appsflyer.internal.AFf1fSDK;
import com.appsflyer.internal.AFf1gSDK;
import com.appsflyer.internal.AFf1hSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFh1nSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1tSDK
implements Runnable {
    private final AFd1kSDK getCurrencyIso4217Code;
    private final AFa1oSDK getMonetizationNetwork;
    private final Map getRevenue;

    public AFc1tSDK(AFd1kSDK aFd1kSDK, AFa1oSDK aFa1oSDK, Map map2) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(aFd1kSDK, string2);
        Intrinsics.checkNotNullParameter(aFa1oSDK, string2);
        this.getCurrencyIso4217Code = aFd1kSDK;
        this.getMonetizationNetwork = aFa1oSDK;
        this.getRevenue = map2;
    }

    public final void run() {
        Object object;
        Object object2;
        Object object3 = this.getMonetizationNetwork;
        boolean bl2 = ((AFa1oSDK)object3).getRevenue();
        if (bl2) {
            object2 = this.getMonetizationNetwork;
            object = this.getCurrencyIso4217Code;
            object3 = new AFf1fSDK((AFa1oSDK)object2, (AFd1kSDK)object);
            ((AFf1fSDK)object3).copydefault = object2 = this.getRevenue;
        } else {
            object3 = this.getMonetizationNetwork;
            bl2 = object3 instanceof AFh1nSDK;
            if (bl2) {
                object2 = (AFh1nSDK)this.getMonetizationNetwork;
                object = this.getCurrencyIso4217Code;
                object3 = new AFf1gSDK((AFh1nSDK)object2, (AFd1kSDK)object);
            } else {
                object2 = this.getMonetizationNetwork;
                object = this.getCurrencyIso4217Code;
                object3 = new AFf1eSDK((AFa1oSDK)object2, (AFd1kSDK)object);
            }
        }
        object2 = this.getCurrencyIso4217Code.copy();
        object = ((AFe1aSDK)object2).AFAdRevenueData;
        AFe1aSDK$2 aFe1aSDK$2 = new AFe1aSDK$2((AFe1aSDK)object2, (AFe1eSDK)object3);
        object.execute(aFe1aSDK$2);
        object3 = ((AFe1eSDK)object3).getMonetizationNetwork;
        object2 = AFf1zSDK.getMonetizationNetwork;
        if (object3 == object2) {
            object3 = this.getCurrencyIso4217Code;
            object3.AFInAppEventType();
            bl2 = AFe1iSDK.getCurrencyIso4217Code();
            if (bl2 && (bl2 = AFb1qSDK.AFAdRevenueData((Context)(object3 = this.getCurrencyIso4217Code.values().AFAdRevenueData)))) {
                object3 = this.getCurrencyIso4217Code.copy();
                object = this.getCurrencyIso4217Code;
                object2 = new AFf1hSDK((AFd1kSDK)object, "install");
                object = ((AFe1aSDK)object3).AFAdRevenueData;
                aFe1aSDK$2 = new AFe1aSDK$2((AFe1aSDK)object3, (AFe1eSDK)object2);
                object.execute(aFe1aSDK$2);
            }
        }
    }
}

