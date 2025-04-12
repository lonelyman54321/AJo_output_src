/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue$Builder;
import java.util.Set;

final class AutoValue_SchedulerConfig_ConfigValue$Builder
extends SchedulerConfig$ConfigValue$Builder {
    private Long delta;
    private Set flags;
    private Long maxAllowedDelay;

    public SchedulerConfig$ConfigValue build() {
        boolean bl2;
        Object object = this.delta;
        object = object == null ? " delta" : "";
        Object object2 = this.maxAllowedDelay;
        if (object2 == null) {
            object2 = " maxAllowedDelay";
            object = Ft2.a((String)object, (String)object2);
        }
        if ((object2 = this.flags) == null) {
            object2 = " flags";
            object = Ft2.a((String)object, (String)object2);
        }
        if (bl2 = ((String)object).isEmpty()) {
            long l2 = this.delta;
            long l3 = this.maxAllowedDelay;
            Set set = this.flags;
            object = new AutoValue_SchedulerConfig_ConfigValue(l2, l3, set, null);
            return object;
        }
        object = "Missing required properties:".concat((String)object);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public SchedulerConfig$ConfigValue$Builder setDelta(long l2) {
        Long l3;
        this.delta = l3 = Long.valueOf(l2);
        return this;
    }

    public SchedulerConfig$ConfigValue$Builder setFlags(Set object) {
        if (object != null) {
            this.flags = object;
            return this;
        }
        object = new NullPointerException("Null flags");
        throw object;
    }

    public SchedulerConfig$ConfigValue$Builder setMaxAllowedDelay(long l2) {
        Long l3;
        this.maxAllowedDelay = l3 = Long.valueOf(l2);
        return this;
    }
}

