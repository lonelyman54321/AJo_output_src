/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.OutcomeReceiver
 */
package com.appsflyer.internal;

import android.os.OutcomeReceiver;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFf1hSDK;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class AFf1hSDK$AFa1vSDK
implements OutcomeReceiver {
    private /* synthetic */ AFf1hSDK AFAdRevenueData;
    private /* synthetic */ Ref$ObjectRef getCurrencyIso4217Code;
    private /* synthetic */ CountDownLatch getMonetizationNetwork;

    public AFf1hSDK$AFa1vSDK(Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch, AFf1hSDK aFf1hSDK) {
        this.getCurrencyIso4217Code = ref$ObjectRef;
        this.getMonetizationNetwork = countDownLatch;
        this.AFAdRevenueData = aFf1hSDK;
    }

    public final /* synthetic */ void onError(Throwable throwable) {
        throwable = (Exception)throwable;
        Intrinsics.checkNotNullParameter(throwable, "");
        AFf1hSDK.getMonetizationNetwork(throwable);
        this.getMonetizationNetwork.countDown();
    }

    public final void onResult(Object object) {
        Intrinsics.checkNotNullParameter(object, "");
        object = this.getCurrencyIso4217Code;
        AFe1cSDK aFe1cSDK = AFe1cSDK.getRevenue;
        ((Ref$ObjectRef)object).element = aFe1cSDK;
        this.getMonetizationNetwork.countDown();
    }
}

