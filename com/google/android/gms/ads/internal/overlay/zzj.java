/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.Window
 */
package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;
import android.view.Window;
import com.google.android.gms.ads.internal.overlay.zzl;

public final class zzj
implements Runnable {
    public final /* synthetic */ zzl zza;
    public final /* synthetic */ Drawable zzb;

    public /* synthetic */ zzj(zzl zzl2, Drawable drawable2) {
        this.zza = zzl2;
        this.zzb = drawable2;
    }

    public final void run() {
        Window window = this.zza.zza.zzb.getWindow();
        Drawable drawable2 = this.zzb;
        window.setBackgroundDrawable(drawable2);
    }
}

