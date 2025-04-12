/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 */
package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzegk;
import java.util.Timer;
import java.util.TimerTask;

final class zzegj
extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzm zzc;

    public zzegj(zzegk zzegk2, AlertDialog alertDialog, Timer timer, zzm zzm2) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = zzm2;
    }

    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        zzm zzm2 = this.zzc;
        if (zzm2 != null) {
            zzm2.zzb();
        }
    }
}

