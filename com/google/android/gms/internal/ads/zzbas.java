/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzbba;

final class zzbas
implements zzbaz {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    public zzbas(zzbba zzbba2, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        Activity activity = this.zza;
        Bundle bundle = this.zzb;
        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
    }
}

