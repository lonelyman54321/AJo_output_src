/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzfpf;

public class zzfpg
implements Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private zzfpf zzc;

    private final void zza(boolean bl2) {
        boolean bl3 = this.zza;
        if (bl3 != bl2) {
            this.zza = bl2;
            bl3 = this.zzb;
            if (bl3) {
                this.zzb(bl2);
                zzfpf zzfpf2 = this.zzc;
                if (zzfpf2 != null) {
                    zzfpf2.zzc(bl2);
                }
            }
        }
    }

    private final boolean zzh() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)runningAppProcessInfo);
        int n3 = runningAppProcessInfo.importance;
        int n4 = 100;
        return n3 == n4 || (n3 = (int)(this.zzc() ? 1 : 0)) != 0;
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
        this.zza(true);
    }

    public final void onActivityStopped(Activity activity) {
        boolean bl2 = this.zzh();
        this.zza(bl2);
    }

    public void zzb(boolean bl2) {
    }

    public boolean zzc() {
        return false;
    }

    public final void zzd(Context context) {
        boolean bl2 = context instanceof Application;
        if (bl2) {
            context = (Application)context;
            context.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
        }
    }

    public final void zze(zzfpf zzfpf2) {
        this.zzc = zzfpf2;
    }

    public final void zzf() {
        boolean bl2;
        this.zzb = true;
        this.zza = bl2 = this.zzh();
        this.zzb(bl2);
    }

    public final void zzg() {
        this.zzb = false;
        this.zzc = null;
    }
}

