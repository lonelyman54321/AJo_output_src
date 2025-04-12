/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;

public final class zzbkp
implements zzgfa {
    public final /* synthetic */ zzcqd zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbkp(zzcqd zzcqd2, String string2) {
        this.zza = zzcqd2;
        this.zzb = string2;
    }

    public final ListenableFuture zza(Object object) {
        boolean bl2;
        object = (String)object;
        Object object2 = zzblo.zza;
        object2 = zzbep.zzka;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        if (bl3 && (object2 = this.zza) != null && (bl2 = zzcqd.zzj((String)(object3 = this.zzb)))) {
            object3 = zzay.zze();
            object = ((zzcqd)object2).zzb((String)object, (Random)object3);
        } else {
            object = zzgft.zzh(object);
        }
        return object;
    }
}

