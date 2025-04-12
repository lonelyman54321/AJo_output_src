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
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbjd;

public final class zzbhq
extends zzbad
implements zzbhs {
    public zzbhq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final float zze() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(2, parcel);
        float f5 = parcel2.readFloat();
        parcel2.recycle();
        return f5;
    }

    public final float zzf() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(6, parcel);
        float f5 = parcel2.readFloat();
        parcel2.recycle();
        return f5;
    }

    public final float zzg() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(5, parcel);
        float f5 = parcel2.readFloat();
        parcel2.recycle();
        return f5;
    }

    public final zzdq zzh() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(7, (Parcel)object);
        object = zzdp.zzb(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final IObjectWrapper zzi() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(4, parcel));
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(3, parcel);
    }

    public final boolean zzk() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(10, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzl() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(8, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final void zzm(zzbjd zzbjd2) {
        throw null;
    }
}

