/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.auth.zzbh;
import com.google.android.gms.internal.auth.zzbm;
import com.google.android.gms.internal.auth.zzbo;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzbl
implements RemoteCall {
    public final /* synthetic */ zzbo zza;
    public final /* synthetic */ ProxyRequest zzb;

    public /* synthetic */ zzbl(zzbo zzbo2, ProxyRequest proxyRequest) {
        this.zza = zzbo2;
        this.zzb = proxyRequest;
    }

    public final void accept(Object object, Object object2) {
        zzbo zzbo2 = this.zza;
        ProxyRequest proxyRequest = this.zzb;
        object = (zzbe)object;
        object2 = (TaskCompletionSource)object2;
        zzbm zzbm2 = new zzbm(zzbo2, (TaskCompletionSource)object2);
        ((zzbh)((BaseGmsClient)object).getService()).zze(zzbm2, proxyRequest);
    }
}

