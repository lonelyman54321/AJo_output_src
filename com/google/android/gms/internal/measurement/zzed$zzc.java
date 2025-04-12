/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdm;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfv;

final class zzed$zzc
implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzed zza;

    public zzed$zzc(zzed zzed2) {
        this.zza = zzed2;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzed zzed2 = this.zza;
        zzfq zzfq2 = new zzfq(this, bundle, activity);
        zzed.zza(zzed2, zzfq2);
    }

    public final void onActivityDestroyed(Activity activity) {
        zzed zzed2 = this.zza;
        zzfv zzfv2 = new zzfv(this, activity);
        zzed.zza(zzed2, zzfv2);
    }

    public final void onActivityPaused(Activity activity) {
        zzed zzed2 = this.zza;
        zzfr zzfr2 = new zzfr(this, activity);
        zzed.zza(zzed2, zzfr2);
    }

    public final void onActivityResumed(Activity activity) {
        zzed zzed2 = this.zza;
        zzfs zzfs2 = new zzfs(this, activity);
        zzed.zza(zzed2, zzfs2);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzdm zzdm2 = new zzdm();
        zzed zzed2 = this.zza;
        zzft zzft2 = new zzft(this, activity, zzdm2);
        zzed.zza(zzed2, zzft2);
        long l2 = 50;
        activity = zzdm2.zza(l2);
        if (activity != null) {
            bundle.putAll((Bundle)activity);
        }
    }

    public final void onActivityStarted(Activity activity) {
        zzed zzed2 = this.zza;
        zzfp zzfp2 = new zzfp(this, activity);
        zzed.zza(zzed2, zzfp2);
    }

    public final void onActivityStopped(Activity activity) {
        zzed zzed2 = this.zza;
        zzfu zzfu2 = new zzfu(this, activity);
        zzed.zza(zzed2, zzfu2);
    }
}

