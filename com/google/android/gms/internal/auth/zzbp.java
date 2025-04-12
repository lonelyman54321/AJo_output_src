/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.internal.auth.zzbd;
import com.google.android.gms.internal.auth.zzbq;
import com.google.android.gms.internal.auth.zzbu;

final class zzbp
extends zzbd {
    final /* synthetic */ zzbq zza;

    public zzbp(zzbq zzbq2) {
        this.zza = zzbq2;
    }

    public final void zzb(ProxyResponse proxyResponse) {
        zzbq zzbq2 = this.zza;
        zzbu zzbu2 = new zzbu(proxyResponse);
        zzbq2.setResult(zzbu2);
    }
}

