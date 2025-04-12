/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeim;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeil
implements zzgfa {
    public final /* synthetic */ zzeim zza;
    public final /* synthetic */ zzfhf zzb;
    public final /* synthetic */ zzfgt zzc;

    public /* synthetic */ zzeil(zzeim zzeim2, zzfhf zzfhf2, zzfgt zzfgt2) {
        this.zza = zzeim2;
        this.zzb = zzfhf2;
        this.zzc = zzfgt2;
    }

    public final ListenableFuture zza(Object object) {
        zzeim zzeim2 = this.zza;
        zzfhf zzfhf2 = this.zzb;
        zzfgt zzfgt2 = this.zzc;
        return zzeim2.zzc(zzfhf2, zzfgt2, object);
    }
}

