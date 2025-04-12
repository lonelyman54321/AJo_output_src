/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo$Builder
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Builder;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class SchedulerConfig {
    private static final long BACKOFF_LOG_BASE = 10000L;
    private static final long ONE_SECOND = 1000L;
    private static final long THIRTY_SECONDS = 30000L;
    private static final long TWENTY_FOUR_HOURS = 86400000L;

    private long adjustedExponentialBackoff(int n3, long l2) {
        n3 += -1;
        long l3 = 1L;
        double d2 = Double.MIN_VALUE;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object > 0) {
            l3 = l2;
        } else {
            l3 = 2;
            d2 = 9.9E-324;
        }
        double d5 = Math.log(10000.0);
        long l4 = n3;
        d2 = Math.log(l3 * l4);
        d5 /= d2;
        d2 = Math.max(1.0, d5);
        double d7 = n3;
        d5 = Math.pow(3.0, d7);
        double d9 = l2;
        return (long)(d5 * d9 * d2);
    }

    public static SchedulerConfig$Builder builder() {
        SchedulerConfig$Builder schedulerConfig$Builder = new SchedulerConfig$Builder();
        return schedulerConfig$Builder;
    }

    public static SchedulerConfig create(Clock clock, Map map2) {
        AutoValue_SchedulerConfig autoValue_SchedulerConfig = new AutoValue_SchedulerConfig(clock, map2);
        return autoValue_SchedulerConfig;
    }

    public static SchedulerConfig getDefault(Clock clock) {
        SchedulerConfig$Builder schedulerConfig$Builder = SchedulerConfig.builder();
        Priority priority = Priority.DEFAULT;
        Object object = SchedulerConfig$ConfigValue.builder().setDelta(30000L);
        long l2 = 86400000L;
        object = ((SchedulerConfig$ConfigValue$Builder)object).setMaxAllowedDelay(l2).build();
        schedulerConfig$Builder = schedulerConfig$Builder.addConfig(priority, (SchedulerConfig$ConfigValue)object);
        priority = Priority.HIGHEST;
        object = SchedulerConfig$ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(l2).build();
        schedulerConfig$Builder = schedulerConfig$Builder.addConfig(priority, (SchedulerConfig$ConfigValue)object);
        priority = Priority.VERY_LOW;
        object = SchedulerConfig$ConfigValue.builder().setDelta(l2).setMaxAllowedDelay(l2);
        SchedulerConfig$Flag schedulerConfig$Flag = SchedulerConfig$Flag.DEVICE_IDLE;
        Object object2 = new SchedulerConfig$Flag[]{schedulerConfig$Flag};
        object2 = SchedulerConfig.immutableSetOf((Object[])object2);
        object = ((SchedulerConfig$ConfigValue$Builder)object).setFlags((Set)object2).build();
        return schedulerConfig$Builder.addConfig(priority, (SchedulerConfig$ConfigValue)object).setClock(clock).build();
    }

    private static Set immutableSetOf(Object ... object) {
        object = Arrays.asList(object);
        HashSet hashSet = new HashSet(object);
        return Collections.unmodifiableSet(hashSet);
    }

    private void populateFlags(JobInfo.Builder builder, Set set) {
        boolean bl2;
        SchedulerConfig$Flag schedulerConfig$Flag = SchedulerConfig$Flag.NETWORK_UNMETERED;
        int n3 = set.contains((Object)schedulerConfig$Flag);
        boolean bl3 = true;
        if (n3 != 0) {
            n3 = 2;
            builder.setRequiredNetworkType(n3);
        } else {
            builder.setRequiredNetworkType((int)(bl3 ? 1 : 0));
        }
        schedulerConfig$Flag = SchedulerConfig$Flag.DEVICE_CHARGING;
        n3 = (int)(set.contains((Object)schedulerConfig$Flag) ? 1 : 0);
        if (n3 != 0) {
            builder.setRequiresCharging(bl3);
        }
        if (bl2 = set.contains((Object)(schedulerConfig$Flag = SchedulerConfig$Flag.DEVICE_IDLE))) {
            builder.setRequiresDeviceIdle(bl3);
        }
    }

    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority object, long l2, int n3) {
        l2 = this.getScheduleDelay((Priority)((Object)object), l2, n3);
        builder.setMinimumLatency(l2);
        object = ((SchedulerConfig$ConfigValue)this.getValues().get(object)).getFlags();
        this.populateFlags(builder, (Set)object);
        return builder;
    }

    public abstract Clock getClock();

    public Set getFlags(Priority priority) {
        return ((SchedulerConfig$ConfigValue)this.getValues().get((Object)priority)).getFlags();
    }

    public long getScheduleDelay(Priority object, long l2, int n3) {
        long l3 = this.getClock().getTime();
        l2 -= l3;
        object = (SchedulerConfig$ConfigValue)this.getValues().get(object);
        l3 = ((SchedulerConfig$ConfigValue)object).getDelta();
        l2 = Math.max(this.adjustedExponentialBackoff(n3, l3), l2);
        l3 = ((SchedulerConfig$ConfigValue)object).getMaxAllowedDelay();
        return Math.min(l2, l3);
    }

    public abstract Map getValues();
}

