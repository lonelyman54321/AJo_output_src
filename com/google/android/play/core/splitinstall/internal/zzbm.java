/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.internal.zzbo;
import com.google.android.play.core.splitinstall.internal.zzbq;
import com.google.android.play.core.splitinstall.internal.zzk;
import com.google.android.play.core.splitinstall.internal.zzm;
import java.util.List;

public final class zzbm
extends zzk
implements zzbo {
    public zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    public final void zzc(String string2, int n3, Bundle bundle, zzbq zzbq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeInt(n3);
        zzm.zzc(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)zzbq2);
        this.zzb(4, parcel);
    }

    public final void zzd(String string2, List list, Bundle bundle, zzbq zzbq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeTypedList(list);
        zzm.zzc(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)zzbq2);
        this.zzb(8, parcel);
    }

    public final void zze(String string2, List list, Bundle bundle, zzbq zzbq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeTypedList(list);
        zzm.zzc(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)zzbq2);
        this.zzb(13, parcel);
    }

    public final void zzf(String string2, List list, Bundle bundle, zzbq zzbq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeTypedList(list);
        zzm.zzc(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)zzbq2);
        this.zzb(14, parcel);
    }

    public final void zzg(String string2, List list, Bundle bundle, zzbq zzbq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeTypedList(list);
        zzm.zzc(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)zzbq2);
        this.zzb(7, parcel);
    }

    public final void zzh(String string2, int n3, zzbq zzbq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeInt(n3);
        parcel.writeStrongBinder((IBinder)zzbq2);
        this.zzb(5, parcel);
    }

    public final void zzi(String string2, zzbq zzbq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeStrongBinder((IBinder)zzbq2);
        this.zzb(6, parcel);
    }

    public final void zzj(String string2, List list, Bundle bundle, zzbq zzbq2) {
        Parcel parcel = this.zza();
        parcel.writeString(string2);
        parcel.writeTypedList(list);
        zzm.zzc(parcel, (Parcelable)bundle);
        parcel.writeStrongBinder((IBinder)zzbq2);
        this.zzb(2, parcel);
    }
}

