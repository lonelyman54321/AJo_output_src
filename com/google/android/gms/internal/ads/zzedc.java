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
import com.google.android.gms.internal.ads.zzeyv;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzedc
implements zzgfa {
    public final /* synthetic */ zzeyv zza;
    public final /* synthetic */ zzbxu zzb;

    public /* synthetic */ zzedc(zzeyv zzeyv2, zzbxu zzbxu2) {
        this.zza = zzeyv2;
        this.zzb = zzbxu2;
    }

    public final ListenableFuture zza(Object object) {
        Object object2 = this.zza;
        object = (Bundle)object;
        object2 = ((zzeyv)object2).zzb();
        object = zzay.zzb().zzi((Bundle)object);
        Bundle bundle = this.zzb.zzm;
        return ((zzexz)object2).zza(object, bundle);
    }
}

