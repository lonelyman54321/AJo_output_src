/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.zzb;

public final class AppUpdateManagerFactory {
    private AppUpdateManagerFactory() {
    }

    public static AppUpdateManager create(Context context) {
        return zzb.zza(context).zza();
    }
}

