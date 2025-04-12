/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1ySDK;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final class n
implements RejectedExecutionHandler {
    public final /* synthetic */ Queue a;

    public /* synthetic */ n(Queue queue) {
        this.a = queue;
    }

    public final void rejectedExecution(Runnable runnable2, ThreadPoolExecutor threadPoolExecutor) {
        AFd1ySDK.a(this.a, runnable2, threadPoolExecutor);
    }
}

