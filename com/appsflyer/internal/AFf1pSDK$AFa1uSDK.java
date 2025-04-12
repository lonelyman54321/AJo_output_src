/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1pSDK$AFa1vSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

public final class AFf1pSDK$AFa1uSDK
implements CloudDevCallback {
    final /* synthetic */ AFf1pSDK$AFa1vSDK $fetchGaidData;
    final /* synthetic */ CountDownLatch $latch;

    public AFf1pSDK$AFa1uSDK(AFf1pSDK$AFa1vSDK aFa1vSDK, CountDownLatch countDownLatch) {
        this.$fetchGaidData = aFa1vSDK;
        this.$latch = countDownLatch;
    }

    public final void onError(String string2) {
        Intrinsics.checkNotNullParameter(string2, "reason");
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.equals;
        String string3 = kp1_0.c("Could not fetch GAID using CloudDevSdk: ", string2);
        AFh1uSDK.w$default(aFLogger, aFh1vSDK, string3, false, 4, null);
        StringBuilder stringBuilder = this.$fetchGaidData.getGaidError();
        stringBuilder.append(string2);
        stringBuilder.append(" |");
        this.$latch.countDown();
    }

    public final void onSuccess(Map object) {
        Intrinsics.checkNotNullParameter(object, "kinds");
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.equals;
        AFh1uSDK.v$default(aFLogger, aFh1vSDK, "CloudDevCallback received onSuccess", false, 4, null);
        AFf1pSDK$AFa1vSDK aFf1pSDK$AFa1vSDK = this.$fetchGaidData;
        object = (String)object.get("gaid");
        aFf1pSDK$AFa1vSDK.setAdvertisingId((String)object);
        this.$latch.countDown();
    }
}

