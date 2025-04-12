/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.internal.ads.zzaxs;
import com.google.android.gms.internal.ads.zzaxt;

final class zzaxn
implements zzaxs {
    final /* synthetic */ Activity zza;

    public zzaxn(zzaxt zzaxt2, Activity activity) {
        this.zza = activity;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Activity activity = this.zza;
        activityLifecycleCallbacks.onActivityResumed(activity);
    }
}

