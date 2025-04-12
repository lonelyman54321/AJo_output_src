/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1oSDK;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final class j
implements RejectedExecutionHandler {
    public final void rejectedExecution(Runnable runnable2, ThreadPoolExecutor threadPoolExecutor) {
        AFd1oSDK.b(runnable2, threadPoolExecutor);
    }
}

