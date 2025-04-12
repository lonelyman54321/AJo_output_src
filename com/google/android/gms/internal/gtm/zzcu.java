/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.internal.gtm;

import android.os.Looper;
import com.google.android.gms.internal.gtm.zzcv;

final class zzcu
implements Runnable {
    final /* synthetic */ zzcv zza;

    public zzcu(zzcv zzcv2) {
        this.zza = zzcv2;
    }

    public final void run() {
        Looper looper;
        Object object = Looper.myLooper();
        if (object == (looper = Looper.getMainLooper())) {
            zzcv.zzc(this.zza).zzd().zzi(this);
            return;
        }
        object = this.zza;
        boolean bl2 = ((zzcv)object).zzh();
        long l2 = 0L;
        zzcv.zzd((zzcv)object, l2);
        if (bl2) {
            object = this.zza;
            ((zzcv)object).zza();
        }
    }
}

