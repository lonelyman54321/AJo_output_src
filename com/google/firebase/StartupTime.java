/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.google.firebase;

import android.os.SystemClock;
import com.google.firebase.AutoValue_StartupTime;

public abstract class StartupTime {
    public static StartupTime create(long l2, long l3, long l4) {
        AutoValue_StartupTime autoValue_StartupTime = new AutoValue_StartupTime(l2, l3, l4);
        return autoValue_StartupTime;
    }

    public static StartupTime now() {
        long l2 = System.currentTimeMillis();
        long l3 = SystemClock.elapsedRealtime();
        long l4 = SystemClock.uptimeMillis();
        return StartupTime.create(l2, l3, l4);
    }

    public abstract long getElapsedRealtime();

    public abstract long getEpochMillis();

    public abstract long getUptimeMillis();
}

