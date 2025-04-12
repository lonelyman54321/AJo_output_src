/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzboi;

public final class zzbo
extends zzbad
implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final zzbn zze() {
        int n3 = 1;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            boolean bl2 = iInterface instanceof zzbn;
            if (bl2) {
                object = iInterface;
                object = (zzbn)iInterface;
            } else {
                iInterface = new zzbl((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final void zzf(zzbit zzbit2) {
        throw null;
    }

    public final void zzg(zzbiw zzbiw2) {
        throw null;
    }

    public final void zzh(String string2, zzbjc zzbjc2, zzbiz zzbiz2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        zzbaf.zzf(parcel, zzbjc2);
        zzbaf.zzf(parcel, zzbiz2);
        this.zzdc(5, parcel);
    }

    public final void zzi(zzboi zzboi2) {
        throw null;
    }

    public final void zzj(zzbjg zzbjg2, zzq zzq2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbjg2);
        zzbaf.zzd(parcel, zzq2);
        this.zzdc(8, parcel);
    }

    public final void zzk(zzbjj zzbjj2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbjj2);
        this.zzdc(10, parcel);
    }

    public final void zzl(zzbh zzbh2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbh2);
        this.zzdc(2, parcel);
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, adManagerAdViewOptions);
        this.zzdc(15, parcel);
    }

    public final void zzn(zzbnz zzbnz2) {
        throw null;
    }

    public final void zzo(zzbhk zzbhk2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzbhk2);
        this.zzdc(6, parcel);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        throw null;
    }

    public final void zzq(zzcf zzcf2) {
        throw null;
    }
}

