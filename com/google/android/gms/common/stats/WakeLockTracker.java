/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import java.util.List;

public class WakeLockTracker {
    private static final WakeLockTracker zza;

    static {
        WakeLockTracker wakeLockTracker;
        zza = wakeLockTracker = new WakeLockTracker();
    }

    public static WakeLockTracker getInstance() {
        return zza;
    }

    public void registerAcquireEvent(Context context, Intent intent, String string2, String string3, String string4, int n3, String string5) {
    }

    public void registerDeadlineEvent(Context context, String string2, String string3, String string4, int n3, List list, boolean bl2, long l2) {
    }

    public void registerEvent(Context context, String string2, int n3, String string3, String string4, String string5, int n4, List list) {
    }

    public void registerEvent(Context context, String string2, int n3, String string3, String string4, String string5, int n4, List list, long l2) {
    }

    public void registerReleaseEvent(Context context, Intent intent) {
    }
}

