/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbyn;

public final class zzbs
extends zzbad
implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void zzA() {
        Parcel parcel = this.zza();
        this.zzdc(11, parcel);
    }

    public final void zzB() {
        Parcel parcel = this.zza();
        this.zzdc(6, parcel);
    }

    public final void zzC(zzbe zzbe2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbe2);
        this.zzdc(20, parcel);
    }

    public final void zzD(zzbh zzbh2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbh2);
        this.zzdc(7, parcel);
    }

    public final void zzE(zzby zzby2) {
        throw null;
    }

    public final void zzF(zzq zzq2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzq2);
        this.zzdc(13, parcel);
    }

    public final void zzG(zzcb zzcb2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzcb2);
        this.zzdc(8, parcel);
    }

    public final void zzH(zzbcj zzbcj2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbcj2);
        this.zzdc(40, parcel);
    }

    public final void zzI(zzw zzw2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzw2);
        this.zzdc(39, parcel);
    }

    public final void zzJ(zzci zzci2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzci2);
        this.zzdc(45, parcel);
    }

    public final void zzK(zzdu zzdu2) {
        throw null;
    }

    public final void zzL(boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzdc(34, parcel);
    }

    public final void zzM(zzbvp zzbvp2) {
        throw null;
    }

    public final void zzN(boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzdc(22, parcel);
    }

    public final void zzO(zzbfk zzbfk2) {
        throw null;
    }

    public final void zzP(zzdg zzdg2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzdg2);
        this.zzdc(42, parcel);
    }

    public final void zzQ(zzbvs zzbvs2, String string2) {
        throw null;
    }

    public final void zzR(String string2) {
        throw null;
    }

    public final void zzS(zzbyn zzbyn2) {
        throw null;
    }

    public final void zzT(String string2) {
        throw null;
    }

    public final void zzU(zzfk zzfk2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzfk2);
        this.zzdc(29, parcel);
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(44, parcel);
    }

    public final void zzX() {
        throw null;
    }

    public final boolean zzY() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(46, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzZ() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(23, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzaa() {
        throw null;
    }

    public final boolean zzab(zzl zzl2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzl2);
        zzl2 = this.zzdb(4, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)zzl2);
        zzl2.recycle();
        return bl2;
    }

    public final void zzac(zzcf zzcf2) {
        throw null;
    }

    public final Bundle zzd() {
        throw null;
    }

    public final zzq zzg() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(12, (Parcel)object);
        object = zzq.CREATOR;
        object = (zzq)zzbaf.zza(parcel, (Parcelable.Creator)object);
        parcel.recycle();
        return object;
    }

    public final zzbh zzi() {
        int n3 = 33;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            boolean bl2 = iInterface instanceof zzbh;
            if (bl2) {
                object = iInterface;
                object = (zzbh)iInterface;
            } else {
                iInterface = new zzbf((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final zzcb zzj() {
        int n3 = 32;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            boolean bl2 = iInterface instanceof zzcb;
            if (bl2) {
                object = iInterface;
                object = (zzcb)iInterface;
            } else {
                iInterface = new zzbz((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final zzdn zzk() {
        int n3 = 41;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            boolean bl2 = iInterface instanceof zzdn;
            if (bl2) {
                object = iInterface;
                object = (zzdn)iInterface;
            } else {
                iInterface = new zzdl((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final zzdq zzl() {
        int n3 = 26;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            boolean bl2 = iInterface instanceof zzdq;
            if (bl2) {
                object = iInterface;
                object = (zzdq)iInterface;
            } else {
                iInterface = new zzdo((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final IObjectWrapper zzn() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(1, parcel));
    }

    public final String zzr() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(31, (Parcel)object);
        object = parcel.readString();
        parcel.recycle();
        return object;
    }

    public final String zzs() {
        throw null;
    }

    public final String zzt() {
        throw null;
    }

    public final void zzx() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }

    public final void zzy(zzl zzl2, zzbk zzbk2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, zzbk2);
        this.zzdc(43, parcel);
    }

    public final void zzz() {
        Parcel parcel = this.zza();
        this.zzdc(5, parcel);
    }
}

