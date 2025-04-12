/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbru;
import java.util.List;

public final class zzbrs
extends zzbad
implements zzbru {
    public zzbrs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public final boolean zzA() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(18, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzB() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(17, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final double zze() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(8, parcel);
        double d2 = parcel2.readDouble();
        parcel2.recycle();
        return d2;
    }

    public final float zzf() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(23, parcel);
        float f5 = parcel2.readFloat();
        parcel2.recycle();
        return f5;
    }

    public final float zzg() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(25, parcel);
        float f5 = parcel2.readFloat();
        parcel2.recycle();
        return f5;
    }

    public final float zzh() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(24, parcel);
        float f5 = parcel2.readFloat();
        parcel2.recycle();
        return f5;
    }

    public final Bundle zzi() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(16, parcel);
        parcel = Bundle.CREATOR;
        parcel = (Bundle)zzbaf.zza(parcel2, (Parcelable.Creator)parcel);
        parcel2.recycle();
        return parcel;
    }

    public final zzdq zzj() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(11, (Parcel)object);
        object = zzdp.zzb(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final zzbho zzk() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(12, (Parcel)object);
        object = zzbhn.zzj(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final zzbhv zzl() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(5, (Parcel)object);
        object = zzbhu.zzg(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final IObjectWrapper zzm() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(13, parcel));
    }

    public final IObjectWrapper zzn() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(14, parcel));
    }

    public final IObjectWrapper zzo() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(15, parcel));
    }

    public final String zzp() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(7, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzq() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(4, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzr() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(6, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzs() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(2, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzt() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(10, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzu() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(9, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final List zzv() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(3, (Parcel)object);
        object = zzbaf.zzb(parcel);
        parcel.recycle();
        return object;
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(20, parcel);
    }

    public final void zzx() {
        Parcel parcel = this.zza();
        this.zzdc(19, parcel);
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, iObjectWrapper2);
        zzbaf.zzf(parcel, iObjectWrapper3);
        this.zzdc(21, parcel);
    }

    public final void zzz(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(22, parcel);
    }
}

