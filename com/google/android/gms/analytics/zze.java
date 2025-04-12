/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.analytics.GoogleAnalytics;

final class zze
implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ GoogleAnalytics zza;

    public zze(GoogleAnalytics googleAnalytics) {
        this.zza = googleAnalytics;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        this.zza.zzh(activity);
    }

    public final void onActivityStopped(Activity activity) {
        this.zza.zzi(activity);
    }
}

