/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzad
implements Callable {
    public final /* synthetic */ zzaj zza;
    public final /* synthetic */ List zzb;
    public final /* synthetic */ IObjectWrapper zzc;

    public /* synthetic */ zzad(zzaj zzaj2, List list, IObjectWrapper iObjectWrapper) {
        this.zza = zzaj2;
        this.zzb = list;
        this.zzc = iObjectWrapper;
    }

    public final Object call() {
        zzaj zzaj2 = this.zza;
        List list = this.zzb;
        IObjectWrapper iObjectWrapper = this.zzc;
        return zzaj2.zzC(list, iObjectWrapper);
    }
}

