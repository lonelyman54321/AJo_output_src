/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
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
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbtb;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbtt;

public final class zzbtc
extends zzbad
implements zzbte {
    public zzbtc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final zzdq zze() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(5, (Parcel)object);
        object = zzdp.zzb(parcel.readStrongBinder());
        parcel.recycle();
        return object;
    }

    public final zzbtt zzf() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(2, (Parcel)object);
        object = zzbtt.CREATOR;
        object = (zzbtt)zzbaf.zza(parcel, (Parcelable.Creator)object);
        parcel.recycle();
        return object;
    }

    public final zzbtt zzg() {
        Object object = this.zza();
        Parcel parcel = this.zzdb(3, (Parcel)object);
        object = zzbtt.CREATOR;
        object = (zzbtt)zzbaf.zza(parcel, (Parcelable.Creator)object);
        parcel.recycle();
        return object;
    }

    public final void zzh(IObjectWrapper iObjectWrapper, String string2, Bundle bundle, Bundle bundle2, zzq zzq2, zzbth zzbth2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        parcel.writeString(string2);
        zzbaf.zzd(parcel, (Parcelable)bundle);
        zzbaf.zzd(parcel, (Parcelable)bundle2);
        zzbaf.zzd(parcel, zzq2);
        zzbaf.zzf(parcel, zzbth2);
        this.zzdc(1, parcel);
    }

    public final void zzi(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbsp zzbsp2, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbsp2);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(23, parcel);
    }

    public final void zzj(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbss zzbss2, zzbrl zzbrl2, zzq zzq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbss2);
        zzbaf.zzf(parcel, zzbrl2);
        zzbaf.zzd(parcel, zzq2);
        this.zzdc(13, parcel);
    }

    public final void zzk(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbss zzbss2, zzbrl zzbrl2, zzq zzq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbss2);
        zzbaf.zzf(parcel, zzbrl2);
        zzbaf.zzd(parcel, zzq2);
        this.zzdc(21, parcel);
    }

    public final void zzl(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbsv zzbsv2, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbsv2);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(14, parcel);
    }

    public final void zzm(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbsy zzbsy2, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbsy2);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(18, parcel);
    }

    public final void zzn(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbsy zzbsy2, zzbrl zzbrl2, zzbhk zzbhk2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbsy2);
        zzbaf.zzf(parcel, zzbrl2);
        zzbaf.zzd(parcel, zzbhk2);
        this.zzdc(22, parcel);
    }

    public final void zzo(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbtb zzbtb2, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbtb2);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(20, parcel);
    }

    public final void zzp(String string2, String string3, zzl zzl2, IObjectWrapper iObjectWrapper, zzbtb zzbtb2, zzbrl zzbrl2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        zzbaf.zzd(parcel, zzl2);
        zzbaf.zzf(parcel, iObjectWrapper);
        zzbaf.zzf(parcel, zzbtb2);
        zzbaf.zzf(parcel, zzbrl2);
        this.zzdc(16, parcel);
    }

    public final void zzq(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(19, parcel);
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        iObjectWrapper = this.zzdb(24, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)iObjectWrapper);
        iObjectWrapper.recycle();
        return bl2;
    }

    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        iObjectWrapper = this.zzdb(15, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)iObjectWrapper);
        iObjectWrapper.recycle();
        return bl2;
    }

    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, iObjectWrapper);
        iObjectWrapper = this.zzdb(17, parcel);
        boolean bl2 = zzbaf.zzg((Parcel)iObjectWrapper);
        iObjectWrapper.recycle();
        return bl2;
    }
}

