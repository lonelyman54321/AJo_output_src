/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.review.internal.zze;
import com.google.android.play.core.review.internal.zzj;
import com.google.android.play.core.review.internal.zzr;
import com.google.android.play.core.review.internal.zzt;
import java.util.Iterator;

final class zzp
extends zzj {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzr zzb;

    public zzp(zzr zzr2, IBinder iBinder) {
        this.zza = iBinder;
        this.zzb = zzr2;
    }

    public final void zza() {
        Iterator iterator = zze.zzb(this.zza);
        zzt.zzm(this.zzb.zza, (IInterface)iterator);
        zzt.zzq(this.zzb.zza);
        iterator = this.zzb.zza;
        boolean bl2 = false;
        Runnable runnable2 = null;
        zzt.zzl((zzt)((Object)iterator), false);
        iterator = zzt.zzh(this.zzb.zza).iterator();
        while (bl2 = iterator.hasNext()) {
            runnable2 = (Runnable)iterator.next();
            runnable2.run();
        }
        zzt.zzh(this.zzb.zza).clear();
    }
}

