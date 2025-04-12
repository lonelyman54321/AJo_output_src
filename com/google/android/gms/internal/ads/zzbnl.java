/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzccn;

final class zzbnl
implements BaseGmsClient$BaseOnConnectionFailedListener {
    final /* synthetic */ zzccn zza;

    public zzbnl(zzbnm zzbnm2, zzccn zzccn2) {
        this.zza = zzccn2;
    }

    public final void onConnectionFailed(ConnectionResult object) {
        object = new RuntimeException("Connection failed.");
        this.zza.zzd((Throwable)object);
    }
}

