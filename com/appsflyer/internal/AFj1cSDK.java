/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1cSDK {
    public static final AFj1cSDK INSTANCE;

    static {
        AFj1cSDK aFj1cSDK;
        INSTANCE = aFj1cSDK = new AFj1cSDK();
    }

    private AFj1cSDK() {
    }

    public static final void getMonetizationNetwork(ScheduledExecutorService scheduledExecutorService, Runnable runnable2, long l2, TimeUnit timeUnit) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(scheduledExecutorService, string2);
        Intrinsics.checkNotNullParameter(runnable2, string2);
        Intrinsics.checkNotNullParameter((Object)timeUnit, string2);
        try {
            scheduledExecutorService.schedule(runnable2, l2, timeUnit);
            return;
        }
        catch (Throwable throwable) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", throwable);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", rejectedExecutionException);
            return;
        }
    }
}

