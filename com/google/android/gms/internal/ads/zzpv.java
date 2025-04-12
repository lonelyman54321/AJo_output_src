/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzpp;
import com.google.android.gms.internal.ads.zzpu;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.ads.zzpx;

final class zzpv
extends BroadcastReceiver {
    final /* synthetic */ zzpw zza;

    public /* synthetic */ zzpv(zzpw zzpw2, zzpu zzpu2) {
        this.zza = zzpw2;
    }

    public final void onReceive(Context object, Intent intent) {
        boolean bl2 = this.isInitialStickyBroadcast();
        if (!bl2) {
            zzpw zzpw2 = this.zza;
            zzk zzk2 = zzpw.zzb(zzpw2);
            zzpx zzpx2 = zzpw.zzd(zzpw2);
            object = zzpp.zzd(object, intent, zzk2, zzpx2);
            zzpw.zzf(zzpw2, (zzpp)object);
        }
    }
}

