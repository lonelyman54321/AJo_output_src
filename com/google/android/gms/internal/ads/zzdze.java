/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzebi;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;

public final class zzdze
implements zzgfa {
    public final /* synthetic */ zzbxu zza;

    public /* synthetic */ zzdze(zzbxu zzbxu2) {
        this.zza = zzbxu2;
    }

    public final ListenableFuture zza(Object object) {
        object = (InputStream)object;
        zzbxu zzbxu2 = this.zza;
        zzebi zzebi2 = new zzebi((InputStream)object, zzbxu2);
        return zzgft.zzh(zzebi2);
    }
}

