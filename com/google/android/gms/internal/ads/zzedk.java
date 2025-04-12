/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzexz;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzedk
implements zzgfa {
    public final /* synthetic */ zzexz zza;
    public final /* synthetic */ zzbxu zzb;

    public /* synthetic */ zzedk(zzexz zzexz2, zzbxu zzbxu2) {
        this.zza = zzexz2;
        this.zzb = zzbxu2;
    }

    public final ListenableFuture zza(Object object) {
        object = (Bundle)object;
        object = zzay.zzb().zzi((Bundle)object);
        zzexz zzexz2 = this.zza;
        Bundle bundle = this.zzb.zzm;
        return zzexz2.zza(object, bundle);
    }
}

