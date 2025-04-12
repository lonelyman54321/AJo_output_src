/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.appset.zzi;
import com.google.android.gms.internal.appset.zzl;

final class zzj
implements Runnable {
    final /* synthetic */ zzl zza;

    public /* synthetic */ zzj(zzl zzl2, zzi zzi2) {
        this.zza = zzl2;
    }

    public final void run() {
        Clock clock;
        long l2;
        long l3;
        zzl zzl2 = this.zza;
        long l4 = zzl2.zza();
        long l7 = l4 - (l3 = (long)-1);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false && (object = (l2 = (l3 = (clock = DefaultClock.getInstance()).currentTimeMillis()) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
            zzl2 = zzl.zzb(this.zza);
            zzl.zze((Context)zzl2);
        }
    }
}

