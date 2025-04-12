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
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbyx;

public final class zzbrj
extends zzbad
implements zzbrl {
    public zzbrj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void zze() {
        Parcel parcel = this.zza();
        this.zzdc(1, parcel);
    }

    public final void zzf() {
        Parcel parcel = this.zza();
        this.zzdc(2, parcel);
    }

    public final void zzg(int n3) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        this.zzdc(3, parcel);
    }

    public final void zzh(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(23, parcel);
    }

    public final void zzi(int n3, String string2) {
        Parcel parcel = this.zza();
        parcel.writeInt(n3);
        parcel.writeString(string2);
        this.zzdc(22, parcel);
    }

    public final void zzj(int n3) {
        throw null;
    }

    public final void zzk(zze zze2) {
        Parcel parcel = this.zza();
        zzbaf.zzd(parcel, zze2);
        this.zzdc(24, parcel);
    }

    public final void zzl(String string2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        this.zzdc(21, parcel);
    }

    public final void zzm() {
        Parcel parcel = this.zza();
        this.zzdc(8, parcel);
    }

    public final void zzn() {
        Parcel parcel = this.zza();
        this.zzdc(4, parcel);
    }

    public final void zzo() {
        Parcel parcel = this.zza();
        this.zzdc(6, parcel);
    }

    public final void zzp() {
        Parcel parcel = this.zza();
        this.zzdc(5, parcel);
    }

    public final void zzq(String string2, String string3) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeString(string3);
        this.zzdc(9, parcel);
    }

    public final void zzr(zzbip zzbip2, String string2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbip2);
        parcel.writeString(string2);
        this.zzdc(10, parcel);
    }

    public final void zzs(zzbyt zzbyt2) {
        throw null;
    }

    public final void zzt(zzbyx zzbyx2) {
        Parcel parcel = this.zza();
        zzbaf.zzf(parcel, zzbyx2);
        this.zzdc(16, parcel);
    }

    public final void zzu() {
        Parcel parcel = this.zza();
        this.zzdc(18, parcel);
    }

    public final void zzv() {
        Parcel parcel = this.zza();
        this.zzdc(11, parcel);
    }

    public final void zzw() {
        Parcel parcel = this.zza();
        this.zzdc(15, parcel);
    }

    public final void zzx() {
        Parcel parcel = this.zza();
        this.zzdc(20, parcel);
    }

    public final void zzy() {
        Parcel parcel = this.zza();
        this.zzdc(13, parcel);
    }
}

