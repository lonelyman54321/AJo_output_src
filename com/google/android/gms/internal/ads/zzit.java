/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzis;
import com.google.android.gms.internal.ads.zziv;

final class zzit
implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zziv zza;
    private final Handler zzb;

    public zzit(zziv zziv2, Handler handler) {
        this.zza = zziv2;
        this.zzb = handler;
    }

    public final void onAudioFocusChange(int n3) {
        zzis zzis2 = new zzis(this, n3);
        this.zzb.post((Runnable)zzis2);
    }
}

