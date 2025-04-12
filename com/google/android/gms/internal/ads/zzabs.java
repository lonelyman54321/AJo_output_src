/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.display.DisplayManager
 *  android.hardware.display.DisplayManager$DisplayListener
 *  android.os.Handler
 *  android.view.Display
 */
package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import com.google.android.gms.internal.ads.zzabu;
import com.google.android.gms.internal.ads.zzgd;

final class zzabs
implements DisplayManager.DisplayListener {
    final /* synthetic */ zzabu zza;
    private final DisplayManager zzb;

    public zzabs(zzabu zzabu2, DisplayManager displayManager) {
        this.zza = zzabu2;
        this.zzb = displayManager;
    }

    private final Display zzc() {
        return this.zzb.getDisplay(0);
    }

    public final void onDisplayAdded(int n3) {
    }

    public final void onDisplayChanged(int n3) {
        if (n3 == 0) {
            zzabu zzabu2 = this.zza;
            Display display = this.zzc();
            zzabu.zzb(zzabu2, display);
        }
    }

    public final void onDisplayRemoved(int n3) {
    }

    public final void zza() {
        Object object = this.zzb;
        Handler handler = zzgd.zzx(null);
        object.registerDisplayListener((DisplayManager.DisplayListener)this, handler);
        object = this.zza;
        handler = this.zzc();
        zzabu.zzb((zzabu)object, (Display)handler);
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener((DisplayManager.DisplayListener)this);
    }
}

