/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzfvn;
import com.google.android.gms.internal.ads.zzfww;
import com.google.android.gms.internal.ads.zzfxf;
import com.google.android.gms.internal.ads.zzfxg;

final class zzfxc
extends zzfww {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfxf zzb;

    public zzfxc(zzfxf zzfxf2, IBinder iBinder) {
        this.zza = iBinder;
        this.zzb = zzfxf2;
    }

    public final void zza() {
        Object object = this.zzb.zza;
        Object object2 = zzfvn.zzb(this.zza);
        zzfxg.zzm((zzfxg)object, (IInterface)object2);
        zzfxg.zzq(this.zzb.zza);
        object = this.zzb.zza;
        boolean bl2 = false;
        object2 = null;
        zzfxg.zzl((zzfxg)object, false);
        object = zzfxg.zzh(this.zzb.zza).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Runnable)object.next();
            object2.run();
        }
        zzfxg.zzh(this.zzb.zza).clear();
    }
}

