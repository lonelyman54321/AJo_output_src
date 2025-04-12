/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SchedulerConfig$Builder {
    private Clock clock;
    private Map values;

    public SchedulerConfig$Builder() {
        HashMap hashMap;
        this.values = hashMap = new HashMap();
    }

    public SchedulerConfig$Builder addConfig(Priority priority, SchedulerConfig$ConfigValue schedulerConfig$ConfigValue) {
        this.values.put(priority, schedulerConfig$ConfigValue);
        return this;
    }

    public SchedulerConfig build() {
        Set set = this.clock;
        if (set != null) {
            Object object;
            int n3;
            set = this.values.keySet();
            int n4 = set.size();
            if (n4 >= (n3 = ((Priority[])(object = Priority.values())).length)) {
                set = this.values;
                this.values = object = new HashMap();
                return SchedulerConfig.create(this.clock, (Map)((Object)set));
            }
            set = new IllegalStateException("Not all priorities have been configured");
            throw set;
        }
        set = new NullPointerException("missing required property: clock");
        throw set;
    }

    public SchedulerConfig$Builder setClock(Clock clock) {
        this.clock = clock;
        return this;
    }
}

