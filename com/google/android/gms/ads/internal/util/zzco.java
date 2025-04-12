/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzccv;

public final class zzco {
    private final View zza;
    private Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final ViewTreeObserver.OnGlobalLayoutListener zzf;

    public zzco(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzb = activity;
        this.zza = view;
        this.zzf = onGlobalLayoutListener2;
    }

    private static ViewTreeObserver zzf(Activity activity) {
        if ((activity = activity.getWindow()) != null && (activity = activity.getDecorView()) != null) {
            return activity.getViewTreeObserver();
        }
        return null;
    }

    private final void zzg() {
        boolean bl2 = this.zzc;
        if (!bl2) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2;
            Activity activity = this.zzb;
            if (activity != null) {
                onGlobalLayoutListener2 = this.zzf;
                if ((activity = zzco.zzf(activity)) != null) {
                    activity.addOnGlobalLayoutListener(onGlobalLayoutListener2);
                }
            }
            activity = this.zza;
            onGlobalLayoutListener2 = this.zzf;
            zzu.zzx();
            zzccv.zza((View)activity, onGlobalLayoutListener2);
            this.zzc = bl2 = true;
        }
    }

    private final void zzh() {
        boolean bl2;
        Activity activity = this.zzb;
        if (activity != null && (bl2 = this.zzc)) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.zzf;
            if ((activity = zzco.zzf(activity)) != null) {
                activity.removeOnGlobalLayoutListener(onGlobalLayoutListener2);
            }
            activity = null;
            this.zzc = false;
        }
    }

    public final void zza() {
        this.zze = false;
        this.zzh();
    }

    public final void zzb() {
        this.zze = true;
        boolean bl2 = this.zzd;
        if (bl2) {
            this.zzg();
        }
    }

    public final void zzc() {
        this.zzd = true;
        boolean bl2 = this.zze;
        if (bl2) {
            this.zzg();
        }
    }

    public final void zzd() {
        this.zzd = false;
        this.zzh();
    }

    public final void zze(Activity activity) {
        this.zzb = activity;
    }
}

