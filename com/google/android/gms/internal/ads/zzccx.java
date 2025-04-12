/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.ads.zzccy;
import java.lang.ref.WeakReference;

final class zzccx
extends zzccy
implements ViewTreeObserver.OnScrollChangedListener {
    private final WeakReference zza;

    public zzccx(View object, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super((View)object);
        super(onScrollChangedListener);
        this.zza = object;
    }

    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener)this.zza.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
            return;
        }
        this.zze();
    }

    public final void zza(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)this);
    }

    public final void zzb(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)this);
    }
}

