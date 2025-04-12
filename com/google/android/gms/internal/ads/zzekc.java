/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzekf;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzekc
implements zzgfa {
    public final /* synthetic */ zzekf zza;
    public final /* synthetic */ zzfgt zzb;

    public /* synthetic */ zzekc(zzekf zzekf2, zzfgt zzfgt2) {
        this.zza = zzekf2;
        this.zzb = zzfgt2;
    }

    public final ListenableFuture zza(Object object) {
        zzekf zzekf2 = this.zza;
        zzfgt zzfgt2 = this.zzb;
        object = (zzdqs)object;
        return zzekf2.zze(zzfgt2, (zzdqs)object);
    }
}

