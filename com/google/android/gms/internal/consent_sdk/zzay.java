/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.consent_sdk.zzbb;
import com.google.android.gms.internal.consent_sdk.zzg;

final class zzay
implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzbb zza;
    private final Activity zzb;

    public zzay(zzbb zzbb2, Activity activity) {
        this.zza = zzbb2;
        this.zzb = activity;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity object) {
        Object object2 = this.zzb;
        if (object != object2) {
            return;
        }
        object = this.zza;
        object2 = new zzg(3, "Activity is destroyed.");
        ((zzbb)object).zzd((zzg)object2);
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}

