/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue$1;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue;
import java.util.Set;

final class AutoValue_SchedulerConfig_ConfigValue
extends SchedulerConfig$ConfigValue {
    private final long delta;
    private final Set flags;
    private final long maxAllowedDelay;

    private AutoValue_SchedulerConfig_ConfigValue(long l2, long l3, Set set) {
        this.delta = l2;
        this.maxAllowedDelay = l3;
        this.flags = set;
    }

    public /* synthetic */ AutoValue_SchedulerConfig_ConfigValue(long l2, long l3, Set set, AutoValue_SchedulerConfig_ConfigValue$1 autoValue_SchedulerConfig_ConfigValue$1) {
        this(l2, l3, set);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        Object object2 = object instanceof SchedulerConfig$ConfigValue;
        if (object2) {
            Set set;
            boolean bl3;
            long l2;
            long l3 = this.delta;
            long l4 = ((SchedulerConfig$ConfigValue)(object = (SchedulerConfig$ConfigValue)object)).getDelta();
            long l7 = l3 - l4;
            object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 || (object2 = (l2 = (l3 = this.maxAllowedDelay) - (l4 = ((SchedulerConfig$ConfigValue)object).getMaxAllowedDelay())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) || !(bl3 = (set = this.flags).equals(object = ((SchedulerConfig$ConfigValue)object).getFlags()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public long getDelta() {
        return this.delta;
    }

    public Set getFlags() {
        return this.flags;
    }

    public long getMaxAllowedDelay() {
        return this.maxAllowedDelay;
    }

    public int hashCode() {
        long l2 = this.delta;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3);
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        l3 = this.maxAllowedDelay;
        int n8 = (int)(l3 >>> n3 ^ l3);
        n4 = (n4 ^ n8) * n7;
        return this.flags.hashCode() ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConfigValue{delta=");
        long l2 = this.delta;
        stringBuilder.append(l2);
        stringBuilder.append(", maxAllowedDelay=");
        l2 = this.maxAllowedDelay;
        stringBuilder.append(l2);
        stringBuilder.append(", flags=");
        Set set = this.flags;
        stringBuilder.append(set);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

