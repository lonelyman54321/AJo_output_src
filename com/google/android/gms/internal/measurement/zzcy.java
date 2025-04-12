/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public final class zzcy {
    public static final int zza;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        n3 = n3 >= n4 ? 0x2000000 : 0;
        zza = n3;
    }

    public static PendingIntent zza(Context context, int n3, Intent intent, int n4) {
        return PendingIntent.getBroadcast((Context)context, (int)0, (Intent)intent, (int)n4);
    }
}

