/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 */
package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.play.core.splitinstall.internal.zzae;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzbn;
import com.google.android.play.core.splitinstall.internal.zzv;

final class zzab
extends zzv {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzae zzb;

    public zzab(zzae zzae2, IBinder iBinder) {
        this.zzb = zzae2;
        this.zza = iBinder;
    }

    public final void zzc() {
        Object object = this.zzb.zza;
        Object object2 = zzbn.zzb(this.zza);
        zzaf.zzm((zzaf)object, (IInterface)object2);
        zzaf.zzq(this.zzb.zza);
        object = this.zzb.zza;
        boolean bl2 = false;
        object2 = null;
        zzaf.zzl((zzaf)object, false);
        object = zzaf.zzh(this.zzb.zza).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Runnable)object.next();
            object2.run();
        }
        zzaf.zzh(this.zzb.zza).clear();
    }
}

