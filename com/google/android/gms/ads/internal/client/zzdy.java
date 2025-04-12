/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzdy
implements Runnable {
    public final /* synthetic */ zzea zza;
    public final /* synthetic */ IObjectWrapper zzb;

    public /* synthetic */ zzdy(zzea zzea2, IObjectWrapper iObjectWrapper) {
        this.zza = zzea2;
        this.zzb = iObjectWrapper;
    }

    public final void run() {
        zzea zzea2 = this.zza;
        IObjectWrapper iObjectWrapper = this.zzb;
        zzea2.zzl(iObjectWrapper);
    }
}

