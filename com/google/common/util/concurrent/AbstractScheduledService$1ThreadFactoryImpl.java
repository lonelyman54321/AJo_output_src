/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractScheduledService;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ThreadFactory;

class AbstractScheduledService$1ThreadFactoryImpl
implements ThreadFactory {
    final /* synthetic */ AbstractScheduledService this$0;

    public AbstractScheduledService$1ThreadFactoryImpl(AbstractScheduledService abstractScheduledService) {
        this.this$0 = abstractScheduledService;
    }

    public Thread newThread(Runnable runnable2) {
        return MoreExecutors.newThread(this.this$0.serviceName(), runnable2);
    }
}

