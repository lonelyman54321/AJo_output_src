/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbip;
import java.util.List;

public final class zzbin
extends zzbad
implements zzbip {
    public zzbin(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final zzdq zze() {
        throw null;
    }

    public final zzbhs zzf() {
        int n3 = 16;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            boolean bl2 = iInterface instanceof zzbhs;
            if (bl2) {
                object = iInterface;
                object = (zzbhs)iInterface;
            } else {
                iInterface = new zzbhq((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final zzbhv zzg(String string2) {
        Object object = this.zza();
        object.writeString(string2);
        int n3 = 2;
        string2 = this.zzdb(n3, (Parcel)object);
        object = string2.readStrongBinder();
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            boolean bl2 = iInterface instanceof zzbhv;
            if (bl2) {
                object = iInterface;
                object = (zzbhv)iInterface;
            } else {
                iInterface = new zzbht((IBinder)object);
                object = iInterface;
            }
        }
        string2.recycle();
        return object;
    }

    public final IObjectWrapper zzh() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(9, parcel));
    }

    public final String zzi() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(4, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzj(String string2) {
        Object object = this.zza();
        object.writeString(string2);
        string2 = this.zzdb(1, (Parcel)object);
        object = string2.readString();
        string2.recycle();
        return object;
    }

    public final List zzk() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(3, (Parcel)object);
        object = parcel.createStringArrayList();
        parcel.recycle();
        return object;
    }

    public final void zzl() {
        Parcel parcel = this.zza();
        this.zzdc(8, parcel);
    }

    public final void zzm() {
        Parcel parcel = this.zza();
        this.zzdc(15, parcel);
    }

    public final void zzn(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(5, parcel);
    }

    public final void zzo() {
        Parcel parcel = this.zza();
        this.zzdc(6, parcel);
    }

    public final void zzp(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(14, parcel);
    }

    public final boolean zzq() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(12, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        iObjectWrapper = this.zzdb(17, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)iObjectWrapper);
        iObjectWrapper.recycle();
        return bl2;
    }

    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        iObjectWrapper = this.zzdb(10, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)iObjectWrapper);
        iObjectWrapper.recycle();
        return bl2;
    }

    public final boolean zzt() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(13, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }
}

