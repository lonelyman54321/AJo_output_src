/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractScheduledService$1;
import com.google.common.util.concurrent.AbstractScheduledService$Cancellable;
import com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1;
import com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2;
import com.google.common.util.concurrent.AbstractService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class AbstractScheduledService$Scheduler {
    private AbstractScheduledService$Scheduler() {
    }

    public /* synthetic */ AbstractScheduledService$Scheduler(AbstractScheduledService.1 var1_1) {
        this();
    }

    public static AbstractScheduledService$Scheduler newFixedDelaySchedule(long l2, long l3, TimeUnit timeUnit) {
        AbstractScheduledService$Scheduler$1 abstractScheduledService$Scheduler$1;
        boolean bl2;
        Preconditions.checkNotNull((Object)timeUnit);
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            abstractScheduledService$Scheduler$1 = null;
        }
        Preconditions.checkArgument(bl2, "delay must be > 0, found %s", l3);
        abstractScheduledService$Scheduler$1 = new AbstractScheduledService$Scheduler$1(l2, l3, timeUnit);
        return abstractScheduledService$Scheduler$1;
    }

    public static AbstractScheduledService$Scheduler newFixedRateSchedule(long l2, long l3, TimeUnit timeUnit) {
        AbstractScheduledService$Scheduler$2 abstractScheduledService$Scheduler$2;
        boolean bl2;
        Preconditions.checkNotNull((Object)timeUnit);
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            abstractScheduledService$Scheduler$2 = null;
        }
        Preconditions.checkArgument(bl2, "period must be > 0, found %s", l3);
        abstractScheduledService$Scheduler$2 = new AbstractScheduledService$Scheduler$2(l2, l3, timeUnit);
        return abstractScheduledService$Scheduler$2;
    }

    public abstract AbstractScheduledService$Cancellable schedule(AbstractService var1, ScheduledExecutorService var2, Runnable var3);
}

