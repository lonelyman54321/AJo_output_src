/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

final class AutoValue_SchedulerConfig
extends SchedulerConfig {
    private final Clock clock;
    private final Map values;

    public AutoValue_SchedulerConfig(Clock object, Map map2) {
        if (object != null) {
            this.clock = object;
            if (map2 != null) {
                this.values = map2;
                return;
            }
            object = new NullPointerException("Null values");
            throw object;
        }
        object = new NullPointerException("Null clock");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof SchedulerConfig;
        if (bl3) {
            boolean bl4;
            Object object2 = this.clock;
            Clock clock = ((SchedulerConfig)(object = (SchedulerConfig)object)).getClock();
            bl3 = object2.equals(clock);
            if (!bl3 || !(bl4 = (object2 = this.values).equals(object = ((SchedulerConfig)object).getValues()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public Clock getClock() {
        return this.clock;
    }

    public Map getValues() {
        return this.values;
    }

    public int hashCode() {
        int n3 = this.clock.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        n4 = this.values.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SchedulerConfig{clock=");
        Object object = this.clock;
        stringBuilder.append(object);
        stringBuilder.append(", values=");
        object = this.values;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

