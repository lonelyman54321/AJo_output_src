/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbpu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzbqp
implements zzgfa {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzblp zzb;

    public /* synthetic */ zzbqp(String string2, zzblp zzblp2) {
        this.zza = string2;
        this.zzb = zzblp2;
    }

    public final ListenableFuture zza(Object object) {
        object = (zzbpu)object;
        String string2 = this.zza;
        zzblp zzblp2 = this.zzb;
        object.zzq(string2, zzblp2);
        return zzgft.zzh(object);
    }
}

