/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcsc;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcyn;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzeku;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeks
extends zzeku {
    private final zzcjd zza;
    private final zzdjy zzb;
    private final zzcyt zzc;
    private final zzdfc zzd;
    private final zzelf zze;
    private final zzehq zzf;

    public zzeks(zzcjd zzcjd2, zzdjy zzdjy2, zzcyt zzcyt2, zzdfc zzdfc2, zzelf zzelf2, zzehq zzehq2) {
        this.zza = zzcjd2;
        this.zzb = zzdjy2;
        this.zzc = zzcyt2;
        this.zzd = zzdfc2;
        this.zze = zzelf2;
        this.zzf = zzehq2;
    }

    public final ListenableFuture zzc(zzfho object, Bundle object2, zzfgt zzfgt2, zzfhf zzfhf2) {
        zzcyt zzcyt2 = this.zzc;
        zzcyt2.zzi((zzfho)object);
        zzcyt2.zzf((Bundle)object2);
        object2 = this.zze;
        object = new zzcyn(zzfhf2, zzfgt2, (zzelf)object2);
        zzcyt2.zzg((zzcyn)object);
        object = zzbep.zzdA;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzc;
            object2 = this.zzf;
            ((zzcyt)object).zzd((zzehq)object2);
        }
        object = this.zza;
        object2 = this.zzc;
        object = ((zzcjd)object).zzh();
        object2 = ((zzcyt)object2).zzj();
        object.zzf((zzcyv)object2);
        object2 = this.zzd;
        object.zze((zzdfc)object2);
        object2 = this.zzb;
        object.zzd((zzdjy)object2);
        object2 = new zzcsc(null);
        object.zzc((zzcsc)object2);
        object = object.zzg().zza();
        object2 = ((zzcvx)object).zzj();
        return ((zzcvx)object).zzi((ListenableFuture)object2);
    }
}

