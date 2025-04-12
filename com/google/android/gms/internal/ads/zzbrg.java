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
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbys;
import java.util.List;

public final class zzbrg
extends zzbad
implements zzbri {
    public zzbrg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zzA(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zzl2);
        parcel.writeString(string2);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(28, parcel);
    }

    public final void zzB(zzl zzl2, String string2, String string3) {
        throw null;
    }

    public final void zzC(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zzl2);
        parcel.writeString(string2);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(32, parcel);
    }

    public final void zzD(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(21, parcel);
    }

    public final void zzE() {
        Parcel parcel = this.zza();
        this.zzdc(8, parcel);
    }

    public final void zzF() {
        Parcel parcel = this.zza();
        this.zzdc(9, parcel);
    }

    public final void zzG(boolean bl2) {
        Parcel parcel = this.zza();
        parcel.writeInt((int)(bl2 ? 1 : 0));
        this.zzdc(25, parcel);
    }

    public final void zzH(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(39, parcel);
    }

    public final void zzI() {
        Parcel parcel = this.zza();
        this.zzdc(4, parcel);
    }

    public final void zzJ(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(37, parcel);
    }

    public final void zzK(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        this.zzdc(30, parcel);
    }

    public final void zzL() {
        Parcel parcel = this.zza();
        this.zzdc(12, parcel);
    }

    public final boolean zzM() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(22, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final boolean zzN() {
        Parcel parcel = this.zza();
        Parcel parcel2 = this.zzdb(13, parcel);
        boolean bl2 = zzbaf.zzg(parcel2);
        parcel2.recycle();
        return bl2;
    }

    public final zzbrq zzO() {
        int n3 = 15;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            boolean bl2 = iInterface instanceof zzbrq;
            if (bl2) {
                object = iInterface;
                object = (zzbrq)iInterface;
            } else {
                iInterface = new zzbrq((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final zzbrr zzP() {
        int n3 = 16;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            boolean bl2 = iInterface instanceof zzbrr;
            if (bl2) {
                object = iInterface;
                object = (zzbrr)iInterface;
            } else {
                iInterface = new zzbrr((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final Bundle zze() {
        throw null;
    }

    public final Bundle zzf() {
        throw null;
    }

    public final Bundle zzg() {
        throw null;
    }

    public final zzdq zzh() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(26, (Parcel)object);
        object = zzdp.zzb(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final zzbip zzi() {
        throw null;
    }

    public final zzbro zzj() {
        int n3 = 36;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            boolean bl2 = iInterface instanceof zzbro;
            if (bl2) {
                object = iInterface;
                object = (zzbro)iInterface;
            } else {
                iInterface = new zzbrm((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final zzbru zzk() {
        int n3 = 27;
        Object object = this.zza();
        Parcel parcel = this.zzdb(n3, (Parcel)object);
        if ((object = parcel.readStrongBinder()) == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            boolean bl2 = iInterface instanceof zzbru;
            if (bl2) {
                object = iInterface;
                object = (zzbru)iInterface;
            } else {
                iInterface = new zzbrs((IBinder)object);
                object = iInterface;
            }
        }
        parcel.recycle();
        return object;
    }

    public final zzbtt zzl() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(33, (Parcel)object);
        object = zzbtt.CREATOR;
        object = (zzbtt)zzbaf.zza(parcel, (Parcelable.Creator)object);
        parcel.recycle();
        return object;
    }

    public final zzbtt zzm() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(34, (Parcel)object);
        object = zzbtt.CREATOR;
        object = (zzbtt)zzbaf.zza(parcel, (Parcelable.Creator)object);
        parcel.recycle();
        return object;
    }

    public final IObjectWrapper zzn() {
        Parcel parcel = this.zza();
        return ak3_1.a(this.zzdb(2, parcel));
    }

    public final void zzo() {
        Parcel parcel = this.zza();
        this.zzdc(5, parcel);
    }

    public final void zzp(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, zzbys zzbys2, String string3) {
        string2 = this.zza();
        zzbaf.zzf((Parcel)string2, iObjectWrapper);
        zzbaf.zzd((Parcel)string2, zzl2);
        string2.writeString(null);
        zzbaf.zzf((Parcel)string2, zzbys2);
        string2.writeString(string3);
        this.zzdc(10, (Parcel)string2);
    }

    public final void zzq(IObjectWrapper iObjectWrapper, zzbnr zzbnr2, List list) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbnr2);
        parcel.writeTypedList(list);
        this.zzdc(31, parcel);
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzbys zzbys2, List list) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbys2);
        parcel.writeStringList(list);
        this.zzdc(23, parcel);
    }

    public final void zzs(zzl zzl2, String string2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zzl2);
        parcel.writeString(string2);
        this.zzdc(11, parcel);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zzl2);
        parcel.writeString(string2);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(38, parcel);
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzq zzq2, zzl zzl2, String string2, zzbrl zzbrl2) {
        throw null;
    }

    public final void zzv(IObjectWrapper iObjectWrapper, zzq zzq2, zzl zzl2, String string2, String string3, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zzq2);
        zzbaf.zzd(parcel, zzl2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(6, parcel);
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzq zzq2, zzl zzl2, String string2, String string3, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zzq2);
        zzbaf.zzd(parcel, zzl2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(35, parcel);
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, zzbrl zzbrl2) {
        throw null;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, String string3, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zzl2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(7, parcel);
    }

    public final void zzz(IObjectWrapper iObjectWrapper, zzl zzl2, String string2, String string3, zzbrl zzbrl2, zzbhk zzbhk2, List list) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzd(parcel, zzl2);
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzf(parcel, zzbrl2);
        zzbaf.zzd(parcel, zzbhk2);
        parcel.writeStringList(list);
        this.zzdc(14, parcel);
    }
}

