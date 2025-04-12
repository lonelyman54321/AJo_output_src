/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

final class SchedulerPoolFactory$ScheduledTask
implements Runnable {
    public final void run() {
        boolean bl2;
        Object object = SchedulerPoolFactory.d.keySet();
        Object object2 = new ArrayList(object);
        object2 = ((ArrayList)object2).iterator();
        while (bl2 = object2.hasNext()) {
            object = (ScheduledThreadPoolExecutor)object2.next();
            boolean bl3 = object.isShutdown();
            if (bl3) {
                ConcurrentHashMap concurrentHashMap = SchedulerPoolFactory.d;
                concurrentHashMap.remove(object);
                continue;
            }
            ((ThreadPoolExecutor)object).purge();
        }
    }
}

