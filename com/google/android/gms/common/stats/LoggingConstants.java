/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 */
package com.google.android.gms.common.stats;

import android.content.ComponentName;

public final class LoggingConstants {
    public static final String EXTRA_WAKE_LOCK_KEY = "WAKE_LOCK_KEY";
    public static final ComponentName zza;

    static {
        ComponentName componentName;
        zza = componentName = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    }

    private LoggingConstants() {
    }
}

