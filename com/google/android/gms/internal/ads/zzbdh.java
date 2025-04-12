/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzccn;

final class zzbdh
implements BaseGmsClient$BaseOnConnectionFailedListener {
    final /* synthetic */ zzccn zza;
    final /* synthetic */ zzbdi zzb;

    public zzbdh(zzbdi zzbdi2, zzccn zzccn2) {
        this.zza = zzccn2;
        this.zzb = zzbdi2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConnectionFailed(ConnectionResult object) {
        object = zzbdi.zzb(this.zzb);
        synchronized (object) {
            zzccn zzccn2 = this.zza;
            String string2 = "Connection failed.";
            RuntimeException runtimeException = new RuntimeException(string2);
            zzccn2.zzd(runtimeException);
            return;
        }
    }
}

