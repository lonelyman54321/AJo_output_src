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
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzbba;

final class zzbat
implements zzbaz {
    final /* synthetic */ Activity zza;

    public zzbat(zzbba zzbba2, Activity activity) {
        this.zza = activity;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Activity activity = this.zza;
        activityLifecycleCallbacks.onActivityStarted(activity);
    }
}

