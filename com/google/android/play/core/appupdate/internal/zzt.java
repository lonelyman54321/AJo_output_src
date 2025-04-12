/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.appupdate.internal.zze;
import com.google.android.play.core.appupdate.internal.zzn;
import com.google.android.play.core.appupdate.internal.zzw;
import com.google.android.play.core.appupdate.internal.zzx;

final class zzt
extends zzn {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzw zzb;

    public zzt(zzw zzw2, IBinder iBinder) {
        this.zzb = zzw2;
        this.zza = iBinder;
    }

    public final void zza() {
        Object object = this.zzb.zza;
        Object object2 = zze.zzb(this.zza);
        zzx.zzm((zzx)object, (IInterface)object2);
        zzx.zzq(this.zzb.zza);
        object = this.zzb.zza;
        boolean bl2 = false;
        object2 = null;
        zzx.zzl((zzx)object, false);
        object = zzx.zzh(this.zzb.zza).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Runnable)object.next();
            object2.run();
        }
        zzx.zzh(this.zzb.zza).clear();
    }
}

