/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.TimeModule;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory$InstanceHolder;

public final class TimeModule_UptimeClockFactory
implements Factory {
    public static TimeModule_UptimeClockFactory create() {
        return TimeModule_UptimeClockFactory$InstanceHolder.access$000();
    }

    public static Clock uptimeClock() {
        return (Clock)Preconditions.checkNotNullFromProvides(TimeModule.uptimeClock());
    }

    public Clock get() {
        return TimeModule_UptimeClockFactory.uptimeClock();
    }
}

