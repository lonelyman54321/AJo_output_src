/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class zzccy {
    private final WeakReference zza;

    public zzccy(View view) {
        WeakReference<View> weakReference;
        this.zza = weakReference = new WeakReference<View>(view);
    }

    public abstract void zza(ViewTreeObserver var1);

    public abstract void zzb(ViewTreeObserver var1);

    public final ViewTreeObserver zzc() {
        boolean bl2;
        View view = (View)this.zza.get();
        if (view == null) {
            return null;
        }
        if ((view = view.getViewTreeObserver()) != null && (bl2 = view.isAlive())) {
            return view;
        }
        return null;
    }

    public final void zzd() {
        ViewTreeObserver viewTreeObserver = this.zzc();
        if (viewTreeObserver != null) {
            this.zza(viewTreeObserver);
        }
    }

    public final void zze() {
        ViewTreeObserver viewTreeObserver = this.zzc();
        if (viewTreeObserver != null) {
            this.zzb(viewTreeObserver);
        }
    }
}

