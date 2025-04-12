/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;

public final class zzecp
implements zzgfa {
    public final /* synthetic */ zzecr zza;
    public final /* synthetic */ zzbxu zzb;

    public /* synthetic */ zzecp(zzecr zzecr2, zzbxu zzbxu2) {
        this.zza = zzecr2;
        this.zzb = zzbxu2;
    }

    public final ListenableFuture zza(Object object) {
        zzecr zzecr2 = this.zza;
        zzbxu zzbxu2 = this.zzb;
        object = (InputStream)object;
        return zzecr2.zzd(zzbxu2, (InputStream)object);
    }
}

