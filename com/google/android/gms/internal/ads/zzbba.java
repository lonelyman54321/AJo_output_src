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
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbas;
import com.google.android.gms.internal.ads.zzbat;
import com.google.android.gms.internal.ads.zzbau;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbaw;
import com.google.android.gms.internal.ads.zzbax;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbaz;
import java.lang.ref.WeakReference;

final class zzbba
implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzbba(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        WeakReference<Application.ActivityLifecycleCallbacks> weakReference;
        this.zzb = weakReference = new WeakReference<Application.ActivityLifecycleCallbacks>(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzbas zzbas2 = new zzbas(this, activity, bundle);
        this.zza(zzbas2);
    }

    public final void onActivityDestroyed(Activity activity) {
        zzbay zzbay2 = new zzbay(this, activity);
        this.zza(zzbay2);
    }

    public final void onActivityPaused(Activity activity) {
        zzbav zzbav2 = new zzbav(this, activity);
        this.zza(zzbav2);
    }

    public final void onActivityResumed(Activity activity) {
        zzbau zzbau2 = new zzbau(this, activity);
        this.zza(zzbau2);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbax zzbax2 = new zzbax(this, activity, bundle);
        this.zza(zzbax2);
    }

    public final void onActivityStarted(Activity activity) {
        zzbat zzbat2 = new zzbat(this, activity);
        this.zza(zzbat2);
    }

    public final void onActivityStopped(Activity activity) {
        zzbaw zzbaw2 = new zzbaw(this, activity);
        this.zza(zzbaw2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzbaz zzbaz2) {
        Exception exception2;
        block4: {
            try {
                WeakReference weakReference = this.zzb;
                weakReference = weakReference.get();
                weakReference = (Application.ActivityLifecycleCallbacks)weakReference;
                if (weakReference != null) {
                    zzbaz2.zza((Application.ActivityLifecycleCallbacks)weakReference);
                    return;
                }
            }
            catch (Exception exception2) {
                break block4;
            }
            boolean bl2 = this.zzc;
            if (!bl2) {
                zzbaz2 = this.zza;
                zzbaz2.unregisterActivityLifecycleCallbacks(this);
                this.zzc = bl2 = true;
            }
            return;
        }
        zzm.zzh("Error while dispatching lifecycle callback.", exception2);
    }
}

