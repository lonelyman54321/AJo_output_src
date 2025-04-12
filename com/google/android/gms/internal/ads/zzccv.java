/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.ads.zzccw;
import com.google.android.gms.internal.ads.zzccx;

public final class zzccv {
    public static final void zza(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2) {
        zzccw zzccw2 = new zzccw(view, onGlobalLayoutListener2);
        zzccw2.zzd();
    }

    public static final void zzb(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        zzccx zzccx2 = new zzccx(view, onScrollChangedListener);
        zzccx2.zzd();
    }
}

