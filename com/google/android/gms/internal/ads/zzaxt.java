/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzaxq;
import com.google.android.gms.internal.ads.zzaxr;
import com.google.android.gms.internal.ads.zzaxs;
import java.lang.ref.WeakReference;

final class zzaxt
implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzaxt(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        WeakReference<Application.ActivityLifecycleCallbacks> weakReference;
        this.zzb = weakReference = new WeakReference<Application.ActivityLifecycleCallbacks>(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzaxl zzaxl2 = new zzaxl(this, activity, bundle);
        this.zza(zzaxl2);
    }

    public final void onActivityDestroyed(Activity activity) {
        zzaxr zzaxr2 = new zzaxr(this, activity);
        this.zza(zzaxr2);
    }

    public final void onActivityPaused(Activity activity) {
        zzaxo zzaxo2 = new zzaxo(this, activity);
        this.zza(zzaxo2);
    }

    public final void onActivityResumed(Activity activity) {
        zzaxn zzaxn2 = new zzaxn(this, activity);
        this.zza(zzaxn2);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzaxq zzaxq2 = new zzaxq(this, activity, bundle);
        this.zza(zzaxq2);
    }

    public final void onActivityStarted(Activity activity) {
        zzaxm zzaxm2 = new zzaxm(this, activity);
        this.zza(zzaxm2);
    }

    public final void onActivityStopped(Activity activity) {
        zzaxp zzaxp2 = new zzaxp(this, activity);
        this.zza(zzaxp2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzaxs zzaxs2) {
        try {
            WeakReference weakReference = this.zzb;
            Object t3 = weakReference.get();
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks)t3;
            if (activityLifecycleCallbacks != null) {
                zzaxs2.zza(activityLifecycleCallbacks);
                return;
            }
            boolean bl2 = this.zzc;
            if (bl2) return;
            zzaxs2 = this.zza;
            zzaxs2.unregisterActivityLifecycleCallbacks(this);
            this.zzc = bl2 = true;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

