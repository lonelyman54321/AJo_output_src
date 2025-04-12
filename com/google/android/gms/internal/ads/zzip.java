/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.internal.ads.zziq;
import com.google.android.gms.internal.ads.zzir;

final class zzip
extends BroadcastReceiver
implements Runnable {
    final /* synthetic */ zzir zza;
    private final zziq zzb;
    private final Handler zzc;

    public zzip(zzir zzir2, Handler handler, zziq zziq2) {
        this.zza = zzir2;
        this.zzc = handler;
        this.zzb = zziq2;
    }

    public final void onReceive(Context object, Intent object2) {
        object = "android.media.AUDIO_BECOMING_NOISY";
        boolean bl2 = ((String)object).equals(object2 = object2.getAction());
        if (bl2) {
            object = this.zzc;
            object.post((Runnable)this);
        }
    }

    public final void run() {
    }
}

