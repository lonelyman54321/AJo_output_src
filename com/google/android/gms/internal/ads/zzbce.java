/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbcg;
import com.google.android.gms.internal.ads.zzbcn;

public final class zzbce
extends zzbad
implements zzbcg {
    public zzbce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final zzbu zze() {
        throw null;
    }

    public final zzdn zzf() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(5, (Parcel)object);
        object = zzdm.zzb(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final void zzg(boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzdc(6, parcel);
    }

    public final void zzh(zzdg zzdg2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzdg2);
        this.zzdc(7, parcel);
    }

    public final void zzi(IObjectWrapper iObjectWrapper, zzbcn zzbcn2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbcn2);
        this.zzdc(4, parcel);
    }
}

