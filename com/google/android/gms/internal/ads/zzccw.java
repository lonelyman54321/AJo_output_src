/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.ads.zzccy;
import java.lang.ref.WeakReference;

final class zzccw
extends zzccy
implements ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference zza;

    public zzccw(View object, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2) {
        super((View)object);
        super(onGlobalLayoutListener2);
        this.zza = object;
    }

    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = (ViewTreeObserver.OnGlobalLayoutListener)this.zza.get();
        if (onGlobalLayoutListener2 != null) {
            onGlobalLayoutListener2.onGlobalLayout();
            return;
        }
        this.zze();
    }

    public final void zza(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }

    public final void zzb(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }
}

