/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.DeadObjectException
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzccn;

final class zzbnk
implements BaseGmsClient$BaseConnectionCallbacks {
    final /* synthetic */ zzccn zza;
    final /* synthetic */ zzbnm zzb;

    public zzbnk(zzbnm zzbnm2, zzccn zzccn2) {
        this.zza = zzccn2;
        this.zzb = zzbnm2;
    }

    public final void onConnected(Bundle object) {
        try {
            object = this.zza;
        }
        catch (DeadObjectException deadObjectException) {
            this.zza.zzd(deadObjectException);
            return;
        }
        Object object2 = this.zzb;
        object2 = zzbnm.zzb((zzbnm)object2);
        object2 = ((zzbmz)object2).zzp();
        ((zzccn)object).zzc(object2);
    }

    public final void onConnectionSuspended(int n3) {
        String string2 = hj0_0.a(n3, "onConnectionSuspended: ");
        RuntimeException runtimeException = new RuntimeException(string2);
        this.zza.zzd(runtimeException);
    }
}

