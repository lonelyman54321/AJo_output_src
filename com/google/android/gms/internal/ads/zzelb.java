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
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcyn;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzeku;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfho;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzelb
extends zzeku {
    private final zzcjd zza;
    private final zzcyt zzb;
    private final zzdfc zzc;
    private final zzelf zzd;
    private final zzfhg zze;
    private final zzehq zzf;

    public zzelb(zzcjd zzcjd2, zzcyt zzcyt2, zzdfc zzdfc2, zzfhg zzfhg2, zzelf zzelf2, zzehq zzehq2) {
        this.zza = zzcjd2;
        this.zzb = zzcyt2;
        this.zzc = zzdfc2;
        this.zze = zzfhg2;
        this.zzd = zzelf2;
        this.zzf = zzehq2;
    }

    public final ListenableFuture zzc(zzfho object, Bundle object2, zzfgt zzfgt2, zzfhf zzfhf2) {
        zzcyt zzcyt2 = this.zzb;
        zzcyt2.zzi((zzfho)object);
        zzcyt2.zzf((Bundle)object2);
        object2 = this.zzd;
        object = new zzcyn(zzfhf2, zzfgt2, (zzelf)object2);
        zzcyt2.zzg((zzcyn)object);
        object = zzbep.zzdz;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (object = this.zze) != null) {
            object2 = this.zzb;
            ((zzcyt)object2).zzh((zzfhg)object);
        }
        object = zzbep.zzdA;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzb;
            object2 = this.zzf;
            ((zzcyt)object).zzd((zzehq)object2);
        }
        object = this.zza;
        object2 = this.zzb;
        object = ((zzcjd)object).zzi();
        object2 = ((zzcyt)object2).zzj();
        object.zzd((zzcyv)object2);
        object2 = this.zzc;
        object.zzc((zzdfc)object2);
        object = object.zze().zzb();
        object2 = ((zzcvx)object).zzj();
        return ((zzcvx)object).zzi((ListenableFuture)object2);
    }
}

